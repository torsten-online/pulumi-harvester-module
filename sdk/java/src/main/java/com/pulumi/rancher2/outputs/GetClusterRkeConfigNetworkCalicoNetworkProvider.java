// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterRkeConfigNetworkCalicoNetworkProvider {
    private String cloudProvider;

    private GetClusterRkeConfigNetworkCalicoNetworkProvider() {}
    public String cloudProvider() {
        return this.cloudProvider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigNetworkCalicoNetworkProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cloudProvider;
        public Builder() {}
        public Builder(GetClusterRkeConfigNetworkCalicoNetworkProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudProvider = defaults.cloudProvider;
        }

        @CustomType.Setter
        public Builder cloudProvider(String cloudProvider) {
            if (cloudProvider == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigNetworkCalicoNetworkProvider", "cloudProvider");
            }
            this.cloudProvider = cloudProvider;
            return this;
        }
        public GetClusterRkeConfigNetworkCalicoNetworkProvider build() {
            final var _resultValue = new GetClusterRkeConfigNetworkCalicoNetworkProvider();
            _resultValue.cloudProvider = cloudProvider;
            return _resultValue;
        }
    }
}
