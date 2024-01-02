// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterRkeConfigNetworkWeaveNetworkProvider {
    private String password;

    private GetClusterRkeConfigNetworkWeaveNetworkProvider() {}
    public String password() {
        return this.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigNetworkWeaveNetworkProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String password;
        public Builder() {}
        public Builder(GetClusterRkeConfigNetworkWeaveNetworkProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
        }

        @CustomType.Setter
        public Builder password(String password) {
            if (password == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigNetworkWeaveNetworkProvider", "password");
            }
            this.password = password;
            return this;
        }
        public GetClusterRkeConfigNetworkWeaveNetworkProvider build() {
            final var _resultValue = new GetClusterRkeConfigNetworkWeaveNetworkProvider();
            _resultValue.password = password;
            return _resultValue;
        }
    }
}
