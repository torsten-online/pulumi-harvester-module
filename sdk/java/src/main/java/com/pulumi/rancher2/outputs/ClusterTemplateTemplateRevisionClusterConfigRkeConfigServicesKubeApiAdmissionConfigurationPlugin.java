// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfigurationPlugin {
    private @Nullable String configuration;
    /**
     * @return The cluster template name (string)
     * 
     */
    private @Nullable String name;
    private @Nullable String path;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfigurationPlugin() {}
    public Optional<String> configuration() {
        return Optional.ofNullable(this.configuration);
    }
    /**
     * @return The cluster template name (string)
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfigurationPlugin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String configuration;
        private @Nullable String name;
        private @Nullable String path;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfigurationPlugin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder configuration(@Nullable String configuration) {
            this.configuration = configuration;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfigurationPlugin build() {
            final var _resultValue = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfigurationPlugin();
            _resultValue.configuration = configuration;
            _resultValue.name = name;
            _resultValue.path = path;
            return _resultValue;
        }
    }
}
