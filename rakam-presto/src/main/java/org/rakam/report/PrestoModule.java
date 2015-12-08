package org.rakam.report;

import com.google.auto.service.AutoService;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Binder;
import com.google.inject.Scopes;
import com.google.inject.multibindings.Multibinder;
import com.google.inject.name.Names;
import org.rakam.MetadataConfig;
import org.rakam.analysis.EventExplorer;
import org.rakam.analysis.FunnelQueryExecutor;
import org.rakam.analysis.JDBCMetastore;
import org.rakam.analysis.JDBCPoolDataSource;
import org.rakam.analysis.PrestoAbstractUserService;
import org.rakam.analysis.PrestoMaterializedViewService;
import org.rakam.analysis.RetentionQueryExecutor;
import org.rakam.collection.SchemaField;
import org.rakam.collection.event.metastore.Metastore;
import org.rakam.plugin.AbstractUserService;
import org.rakam.plugin.ConditionalModule;
import org.rakam.plugin.ContinuousQueryService;
import org.rakam.plugin.EventExplorerConfig;
import org.rakam.plugin.EventMapper;
import org.rakam.plugin.JDBCConfig;
import org.rakam.plugin.MaterializedViewService;
import org.rakam.plugin.RakamModule;
import org.rakam.plugin.SystemEvents;
import org.rakam.plugin.TimestampEventMapper;
import org.rakam.plugin.UserPluginConfig;
import org.rakam.plugin.user.AbstractPostgresqlUserStorage;
import org.rakam.plugin.user.PrestoExternalUserStorageAdapter;

import javax.inject.Inject;

import static io.airlift.configuration.ConfigurationModule.bindConfig;
import static org.rakam.report.PrestoQueryExecution.toPrestoType;

@AutoService(RakamModule.class)
@ConditionalModule(config="store.adapter", value="presto")
public class PrestoModule extends RakamModule {
    @Override
    protected void setup(Binder binder) {
        bindConfig(binder).to(MetadataConfig.class);
        bindConfig(binder).to(PrestoConfig.class);

        binder.bind(QueryExecutor.class).to(PrestoQueryExecutor.class);
        binder.bind(ContinuousQueryService.class).to(PrestoContinuousQueryService.class);
        binder.bind(MaterializedViewService.class).to(PrestoMaterializedViewService.class);

        JDBCConfig config = buildConfigObject(JDBCConfig.class, "presto.metastore.jdbc");

        JDBCPoolDataSource dataSource = JDBCPoolDataSource.getOrCreateDataSource(config);
        binder.bind(JDBCPoolDataSource.class)
                .annotatedWith(Names.named("presto.metastore.jdbc"))
                .toInstance(dataSource);

        binder.bind(Metastore.class).to(JDBCMetastore.class);
        if ("postgresql".equals(getConfig("plugin.user.storage"))) {
            binder.bind(AbstractPostgresqlUserStorage.class).to(PrestoExternalUserStorageAdapter.class)
                    .in(Scopes.SINGLETON);
            binder.bind(AbstractUserService.class).to(PrestoAbstractUserService.class)
                    .in(Scopes.SINGLETON);
        }

        if (buildConfigObject(EventExplorerConfig.class).isEventExplorerEnabled()) {
            binder.bind(EventExplorer.class).to(PrestoEventExplorer.class);
        }
        UserPluginConfig userPluginConfig = buildConfigObject(UserPluginConfig.class);

        if (userPluginConfig.isFunnelAnalysisEnabled()) {
            binder.bind(FunnelQueryExecutor.class).to(PrestoFunnelQueryExecutor.class);
        }

        if (userPluginConfig.isRetentionAnalysisEnabled()) {
            binder.bind(RetentionQueryExecutor.class).to(PrestoRetentionQueryExecutor.class);
        }

        Multibinder<EventMapper> timeMapper = Multibinder.newSetBinder(binder, EventMapper.class);
        timeMapper.addBinding().to(TimestampEventMapper.class).in(Scopes.SINGLETON);
        binder.bind(ColdStorageCollectionCreator.class).asEagerSingleton();
    }

    @Override
    public String name() {
        return "PrestoDB backend for Rakam";
    }

    @Override
    public String description() {
        return "Rakam backend for high-throughput systems.";
    }

    private static class ColdStorageCollectionCreator {
        private final PrestoQueryExecutor prestoQueryExecutor;
        private final PrestoConfig config;

        @Inject
        public ColdStorageCollectionCreator(PrestoQueryExecutor prestoQueryExecutor, PrestoConfig config) {
            this.prestoQueryExecutor = prestoQueryExecutor;
            this.config = config;
        }

        @Subscribe
        public void onCreateField(SystemEvents.CollectionFieldCreatedEvent event) {
            for(SchemaField field : event.fields) {
                prestoQueryExecutor
                        .executeRawQuery(String.format("ALTER TABLE %s.%s.%s ADD COLUMN \"%s\" %s",
                                config.getColdStorageConnector(), event.project, event.collection,
                                field.getName(), toPrestoType(field.getType()))
                        ).getResult().join();
            }

        }

        public void onCreateCollection(SystemEvents.CollectionCreatedEvent event) {
            prestoQueryExecutor
                    .executeRawQuery(String.format("CREATE TABLE %s.%s.%s AS SELECT * FROM %s.%s.%s LIMIT 0",
                            config.getColdStorageConnector(), event.project, event.collection,
                            config.getHotStorageConnector(), event.project, event.collection)
                    ).getResult().join();
        }
    }
}
