// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigNetworkCalicoNetworkProvider {
    /**
     * @return RKE options for Calico network provider (string)
     * 
     */
    private @Nullable String cloudProvider;

    private ClusterRkeConfigNetworkCalicoNetworkProvider() {}
    /**
     * @return RKE options for Calico network provider (string)
     * 
     */
    public Optional<String> cloudProvider() {
        return Optional.ofNullable(this.cloudProvider);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigNetworkCalicoNetworkProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cloudProvider;
        public Builder() {}
        public Builder(ClusterRkeConfigNetworkCalicoNetworkProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudProvider = defaults.cloudProvider;
        }

        @CustomType.Setter
        public Builder cloudProvider(@Nullable String cloudProvider) {
            this.cloudProvider = cloudProvider;
            return this;
        }
        public ClusterRkeConfigNetworkCalicoNetworkProvider build() {
            final var _resultValue = new ClusterRkeConfigNetworkCalicoNetworkProvider();
            _resultValue.cloudProvider = cloudProvider;
            return _resultValue;
        }
    }
}
