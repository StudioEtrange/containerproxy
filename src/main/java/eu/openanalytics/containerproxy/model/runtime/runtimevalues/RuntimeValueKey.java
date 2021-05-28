/**
 * ContainerProxy
 *
 * Copyright (C) 2016-2021 Open Analytics
 *
 * ===========================================================================
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Apache License as published by
 * The Apache Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Apache License for more details.
 *
 * You should have received a copy of the Apache License
 * along with this program.  If not, see <http://www.apache.org/licenses/>
 */
package eu.openanalytics.containerproxy.model.runtime.runtimevalues;

import java.util.Objects;

public abstract class RuntimeValueKey {

    private final String keyAsLabel;
    private final String keyAsEnvVar;

    private final Boolean includeAsLabel;

    private final Boolean includeAsAnnotation;

    private final Boolean includeAsEnvironmentVariable;

    private final Boolean isRequired;

    public RuntimeValueKey(String keyAsLabel, String keyAsEnvVar, Boolean includeAsLabel, Boolean includeAsAnnotation, Boolean includeAsEnvironmentVariable, Boolean isRequired) {
        this.keyAsLabel = Objects.requireNonNull(keyAsLabel, "keyAsLabel may not be null");
        this.keyAsEnvVar = Objects.requireNonNull(keyAsEnvVar, "keyAsEnvVar may not be null");
        this.includeAsLabel = includeAsLabel;
        this.includeAsAnnotation = includeAsAnnotation;
        this.includeAsEnvironmentVariable = includeAsEnvironmentVariable;
        this.isRequired = isRequired;
    }

    public String getKeyAsLabel() {
        return keyAsLabel;
    }

    public String getKeyAsEnvVar() {
        return keyAsEnvVar;
    }

    public Boolean getIncludeAsLabel() {
        return includeAsLabel;
    }

    public Boolean getIncludeAsAnnotation() {
        return includeAsAnnotation;
    }

    public Boolean getIncludeAsEnvironmentVariable() {
        return includeAsEnvironmentVariable;
    }

    public Boolean isRequired() {
        return isRequired;
    }
}
