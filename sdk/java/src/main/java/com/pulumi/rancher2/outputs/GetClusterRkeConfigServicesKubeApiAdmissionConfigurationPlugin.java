// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterRkeConfigServicesKubeApiAdmissionConfigurationPlugin {
    private String configuration;
    /**
     * @return The name of the Cluster (string)
     * 
     */
    private String name;
    private @Nullable String path;

    private GetClusterRkeConfigServicesKubeApiAdmissionConfigurationPlugin() {}
    public String configuration() {
        return this.configuration;
    }
    /**
     * @return The name of the Cluster (string)
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigServicesKubeApiAdmissionConfigurationPlugin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String configuration;
        private String name;
        private @Nullable String path;
        public Builder() {}
        public Builder(GetClusterRkeConfigServicesKubeApiAdmissionConfigurationPlugin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder configuration(String configuration) {
            this.configuration = Objects.requireNonNull(configuration);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public GetClusterRkeConfigServicesKubeApiAdmissionConfigurationPlugin build() {
            final var _resultValue = new GetClusterRkeConfigServicesKubeApiAdmissionConfigurationPlugin();
            _resultValue.configuration = configuration;
            _resultValue.name = name;
            _resultValue.path = path;
            return _resultValue;
        }
    }
}
