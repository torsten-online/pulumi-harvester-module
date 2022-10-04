// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCalicoNetworkProvider {
    private @Nullable String cloudProvider;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCalicoNetworkProvider() {}
    public Optional<String> cloudProvider() {
        return Optional.ofNullable(this.cloudProvider);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCalicoNetworkProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cloudProvider;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCalicoNetworkProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudProvider = defaults.cloudProvider;
        }

        @CustomType.Setter
        public Builder cloudProvider(@Nullable String cloudProvider) {
            this.cloudProvider = cloudProvider;
            return this;
        }
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCalicoNetworkProvider build() {
            final var o = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkCalicoNetworkProvider();
            o.cloudProvider = cloudProvider;
            return o;
        }
    }
}
