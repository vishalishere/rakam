/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.rakam;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Model extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Model\",\"namespace\":\"org.rakam\",\"fields\":[{\"name\":\"project\",\"type\":\"string\"},{\"name\":\"naber\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"emre\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"emrme\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"halil\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"fazıl\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"fazılz\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
    public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
    @Deprecated public java.lang.CharSequence project;
    @Deprecated public java.lang.CharSequence naber;
    @Deprecated public java.lang.CharSequence emre;
    @Deprecated public java.lang.Integer emrme;
    @Deprecated public java.lang.CharSequence halil;
    @Deprecated public java.lang.CharSequence fazıl;
    @Deprecated public java.lang.CharSequence fazılz;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public Model() {}

    /**
     * All-args constructor.
     */
    public Model(java.lang.CharSequence project, java.lang.CharSequence naber, java.lang.CharSequence emre, java.lang.Integer emrme, java.lang.CharSequence halil, java.lang.CharSequence fazıl, java.lang.CharSequence fazılz) {
        this.project = project;
        this.naber = naber;
        this.emre = emre;
        this.emrme = emrme;
        this.halil = halil;
        this.fazıl = fazıl;
        this.fazılz = fazılz;
    }

    public org.apache.avro.Schema getSchema() { return SCHEMA$; }
    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0: return project;
            case 1: return naber;
            case 2: return emre;
            case 3: return emrme;
            case 4: return halil;
            case 5: return fazıl;
            case 6: return fazılz;
            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }
    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value="unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0: project = (java.lang.CharSequence)value$; break;
            case 1: naber = (java.lang.CharSequence)value$; break;
            case 2: emre = (java.lang.CharSequence)value$; break;
            case 3: emrme = (java.lang.Integer)value$; break;
            case 4: halil = (java.lang.CharSequence)value$; break;
            case 5: fazıl = (java.lang.CharSequence)value$; break;
            case 6: fazılz = (java.lang.CharSequence)value$; break;
            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'project' field.
     */
    public java.lang.CharSequence getProject() {
        return project;
    }

    /**
     * Sets the value of the 'project' field.
     * @param value the value to set.
     */
    public void setProject(java.lang.CharSequence value) {
        this.project = value;
    }

    /**
     * Gets the value of the 'naber' field.
     */
    public java.lang.CharSequence getNaber() {
        return naber;
    }

    /**
     * Sets the value of the 'naber' field.
     * @param value the value to set.
     */
    public void setNaber(java.lang.CharSequence value) {
        this.naber = value;
    }

    /**
     * Gets the value of the 'emre' field.
     */
    public java.lang.CharSequence getEmre() {
        return emre;
    }

    /**
     * Sets the value of the 'emre' field.
     * @param value the value to set.
     */
    public void setEmre(java.lang.CharSequence value) {
        this.emre = value;
    }

    /**
     * Gets the value of the 'emrme' field.
     */
    public java.lang.Integer getEmrme() {
        return emrme;
    }

    /**
     * Sets the value of the 'emrme' field.
     * @param value the value to set.
     */
    public void setEmrme(java.lang.Integer value) {
        this.emrme = value;
    }

    /**
     * Gets the value of the 'halil' field.
     */
    public java.lang.CharSequence getHalil() {
        return halil;
    }

    /**
     * Sets the value of the 'halil' field.
     * @param value the value to set.
     */
    public void setHalil(java.lang.CharSequence value) {
        this.halil = value;
    }

    /**
     * Gets the value of the 'fazıl' field.
     */
    public java.lang.CharSequence getFazıl() {
        return fazıl;
    }

    /**
     * Sets the value of the 'fazıl' field.
     * @param value the value to set.
     */
    public void setFazıl(java.lang.CharSequence value) {
        this.fazıl = value;
    }

    /**
     * Gets the value of the 'fazılz' field.
     */
    public java.lang.CharSequence getFazılz() {
        return fazılz;
    }

    /**
     * Sets the value of the 'fazılz' field.
     * @param value the value to set.
     */
    public void setFazılz(java.lang.CharSequence value) {
        this.fazılz = value;
    }

    /** Creates a new Model RecordBuilder */
    public static org.rakam.Model.Builder newBuilder() {
        return new org.rakam.Model.Builder();
    }

    /** Creates a new Model RecordBuilder by copying an existing Builder */
    public static org.rakam.Model.Builder newBuilder(org.rakam.Model.Builder other) {
        return new org.rakam.Model.Builder(other);
    }

    /** Creates a new Model RecordBuilder by copying an existing Model instance */
    public static org.rakam.Model.Builder newBuilder(org.rakam.Model other) {
        return new org.rakam.Model.Builder(other);
    }

    /**
     * RecordBuilder for Model instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Model>
            implements org.apache.avro.data.RecordBuilder<Model> {

        private java.lang.CharSequence project;
        private java.lang.CharSequence naber;
        private java.lang.CharSequence emre;
        private java.lang.Integer emrme;
        private java.lang.CharSequence halil;
        private java.lang.CharSequence fazıl;
        private java.lang.CharSequence fazılz;

        /** Creates a new Builder */
        private Builder() {
            super(org.rakam.Model.SCHEMA$);
        }

        /** Creates a Builder by copying an existing Builder */
        private Builder(org.rakam.Model.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.project)) {
                this.project = data().deepCopy(fields()[0].schema(), other.project);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.naber)) {
                this.naber = data().deepCopy(fields()[1].schema(), other.naber);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.emre)) {
                this.emre = data().deepCopy(fields()[2].schema(), other.emre);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.emrme)) {
                this.emrme = data().deepCopy(fields()[3].schema(), other.emrme);
                fieldSetFlags()[3] = true;
            }
            if (isValidValue(fields()[4], other.halil)) {
                this.halil = data().deepCopy(fields()[4].schema(), other.halil);
                fieldSetFlags()[4] = true;
            }
            if (isValidValue(fields()[5], other.fazıl)) {
                this.fazıl = data().deepCopy(fields()[5].schema(), other.fazıl);
                fieldSetFlags()[5] = true;
            }
            if (isValidValue(fields()[6], other.fazılz)) {
                this.fazılz = data().deepCopy(fields()[6].schema(), other.fazılz);
                fieldSetFlags()[6] = true;
            }
        }

        /** Creates a Builder by copying an existing Model instance */
        private Builder(org.rakam.Model other) {
            super(org.rakam.Model.SCHEMA$);
            if (isValidValue(fields()[0], other.project)) {
                this.project = data().deepCopy(fields()[0].schema(), other.project);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.naber)) {
                this.naber = data().deepCopy(fields()[1].schema(), other.naber);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.emre)) {
                this.emre = data().deepCopy(fields()[2].schema(), other.emre);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.emrme)) {
                this.emrme = data().deepCopy(fields()[3].schema(), other.emrme);
                fieldSetFlags()[3] = true;
            }
            if (isValidValue(fields()[4], other.halil)) {
                this.halil = data().deepCopy(fields()[4].schema(), other.halil);
                fieldSetFlags()[4] = true;
            }
            if (isValidValue(fields()[5], other.fazıl)) {
                this.fazıl = data().deepCopy(fields()[5].schema(), other.fazıl);
                fieldSetFlags()[5] = true;
            }
            if (isValidValue(fields()[6], other.fazılz)) {
                this.fazılz = data().deepCopy(fields()[6].schema(), other.fazılz);
                fieldSetFlags()[6] = true;
            }
        }

        /** Gets the value of the 'project' field */
        public java.lang.CharSequence getProject() {
            return project;
        }

        /** Sets the value of the 'project' field */
        public org.rakam.Model.Builder setProject(java.lang.CharSequence value) {
            validate(fields()[0], value);
            this.project = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /** Checks whether the 'project' field has been set */
        public boolean hasProject() {
            return fieldSetFlags()[0];
        }

        /** Clears the value of the 'project' field */
        public org.rakam.Model.Builder clearProject() {
            project = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /** Gets the value of the 'naber' field */
        public java.lang.CharSequence getNaber() {
            return naber;
        }

        /** Sets the value of the 'naber' field */
        public org.rakam.Model.Builder setNaber(java.lang.CharSequence value) {
            validate(fields()[1], value);
            this.naber = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /** Checks whether the 'naber' field has been set */
        public boolean hasNaber() {
            return fieldSetFlags()[1];
        }

        /** Clears the value of the 'naber' field */
        public org.rakam.Model.Builder clearNaber() {
            naber = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        /** Gets the value of the 'emre' field */
        public java.lang.CharSequence getEmre() {
            return emre;
        }

        /** Sets the value of the 'emre' field */
        public org.rakam.Model.Builder setEmre(java.lang.CharSequence value) {
            validate(fields()[2], value);
            this.emre = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /** Checks whether the 'emre' field has been set */
        public boolean hasEmre() {
            return fieldSetFlags()[2];
        }

        /** Clears the value of the 'emre' field */
        public org.rakam.Model.Builder clearEmre() {
            emre = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        /** Gets the value of the 'emrme' field */
        public java.lang.Integer getEmrme() {
            return emrme;
        }

        /** Sets the value of the 'emrme' field */
        public org.rakam.Model.Builder setEmrme(java.lang.Integer value) {
            validate(fields()[3], value);
            this.emrme = value;
            fieldSetFlags()[3] = true;
            return this;
        }

        /** Checks whether the 'emrme' field has been set */
        public boolean hasEmrme() {
            return fieldSetFlags()[3];
        }

        /** Clears the value of the 'emrme' field */
        public org.rakam.Model.Builder clearEmrme() {
            emrme = null;
            fieldSetFlags()[3] = false;
            return this;
        }

        /** Gets the value of the 'halil' field */
        public java.lang.CharSequence getHalil() {
            return halil;
        }

        /** Sets the value of the 'halil' field */
        public org.rakam.Model.Builder setHalil(java.lang.CharSequence value) {
            validate(fields()[4], value);
            this.halil = value;
            fieldSetFlags()[4] = true;
            return this;
        }

        /** Checks whether the 'halil' field has been set */
        public boolean hasHalil() {
            return fieldSetFlags()[4];
        }

        /** Clears the value of the 'halil' field */
        public org.rakam.Model.Builder clearHalil() {
            halil = null;
            fieldSetFlags()[4] = false;
            return this;
        }

        /** Gets the value of the 'fazıl' field */
        public java.lang.CharSequence getFazıl() {
            return fazıl;
        }

        /** Sets the value of the 'fazıl' field */
        public org.rakam.Model.Builder setFazıl(java.lang.CharSequence value) {
            validate(fields()[5], value);
            this.fazıl = value;
            fieldSetFlags()[5] = true;
            return this;
        }

        /** Checks whether the 'fazıl' field has been set */
        public boolean hasFazıl() {
            return fieldSetFlags()[5];
        }

        /** Clears the value of the 'fazıl' field */
        public org.rakam.Model.Builder clearFazıl() {
            fazıl = null;
            fieldSetFlags()[5] = false;
            return this;
        }

        /** Gets the value of the 'fazılz' field */
        public java.lang.CharSequence getFazılz() {
            return fazılz;
        }

        /** Sets the value of the 'fazılz' field */
        public org.rakam.Model.Builder setFazılz(java.lang.CharSequence value) {
            validate(fields()[6], value);
            this.fazılz = value;
            fieldSetFlags()[6] = true;
            return this;
        }

        /** Checks whether the 'fazılz' field has been set */
        public boolean hasFazılz() {
            return fieldSetFlags()[6];
        }

        /** Clears the value of the 'fazılz' field */
        public org.rakam.Model.Builder clearFazılz() {
            fazılz = null;
            fieldSetFlags()[6] = false;
            return this;
        }

        @Override
        public Model build() {
            try {
                Model record = new Model();
                record.project = fieldSetFlags()[0] ? this.project : (java.lang.CharSequence) defaultValue(fields()[0]);
                record.naber = fieldSetFlags()[1] ? this.naber : (java.lang.CharSequence) defaultValue(fields()[1]);
                record.emre = fieldSetFlags()[2] ? this.emre : (java.lang.CharSequence) defaultValue(fields()[2]);
                record.emrme = fieldSetFlags()[3] ? this.emrme : (java.lang.Integer) defaultValue(fields()[3]);
                record.halil = fieldSetFlags()[4] ? this.halil : (java.lang.CharSequence) defaultValue(fields()[4]);
                record.fazıl = fieldSetFlags()[5] ? this.fazıl : (java.lang.CharSequence) defaultValue(fields()[5]);
                record.fazılz = fieldSetFlags()[6] ? this.fazılz : (java.lang.CharSequence) defaultValue(fields()[6]);
                return record;
            } catch (Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }
}
