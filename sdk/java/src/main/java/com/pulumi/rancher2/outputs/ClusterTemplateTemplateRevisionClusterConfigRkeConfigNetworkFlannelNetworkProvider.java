// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkFlannelNetworkProvider {
    private @Nullable String iface;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkFlannelNetworkProvider() {}
    public Optional<String> iface() {
        return Optional.ofNullable(this.iface);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkFlannelNetworkProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String iface;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkFlannelNetworkProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iface = defaults.iface;
        }

        @CustomType.Setter
        public Builder iface(@Nullable String iface) {

            this.iface = iface;
            return this;
        }
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkFlannelNetworkProvider build() {
            final var _resultValue = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkFlannelNetworkProvider();
            _resultValue.iface = iface;
            return _resultValue;
        }
    }
}
