// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfiguration;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLog {
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfiguration configuration;
    private @Nullable Boolean enabled;

    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLog() {}
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfiguration configuration() {
        return this.configuration;
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfiguration configuration;
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder configuration(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfiguration configuration) {
            this.configuration = Objects.requireNonNull(configuration);
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLog build() {
            final var o = new GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLog();
            o.configuration = configuration;
            o.enabled = enabled;
            return o;
        }
    }
}
