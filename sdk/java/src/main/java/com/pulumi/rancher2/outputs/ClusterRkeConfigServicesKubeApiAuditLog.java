// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterRkeConfigServicesKubeApiAuditLogConfiguration;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigServicesKubeApiAuditLog {
    private @Nullable ClusterRkeConfigServicesKubeApiAuditLogConfiguration configuration;
    private @Nullable Boolean enabled;

    private ClusterRkeConfigServicesKubeApiAuditLog() {}
    public Optional<ClusterRkeConfigServicesKubeApiAuditLogConfiguration> configuration() {
        return Optional.ofNullable(this.configuration);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigServicesKubeApiAuditLog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterRkeConfigServicesKubeApiAuditLogConfiguration configuration;
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(ClusterRkeConfigServicesKubeApiAuditLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder configuration(@Nullable ClusterRkeConfigServicesKubeApiAuditLogConfiguration configuration) {

            this.configuration = configuration;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        public ClusterRkeConfigServicesKubeApiAuditLog build() {
            final var _resultValue = new ClusterRkeConfigServicesKubeApiAuditLog();
            _resultValue.configuration = configuration;
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
