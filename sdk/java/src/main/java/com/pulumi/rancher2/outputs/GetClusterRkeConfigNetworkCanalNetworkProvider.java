// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterRkeConfigNetworkCanalNetworkProvider {
    private String iface;

    private GetClusterRkeConfigNetworkCanalNetworkProvider() {}
    public String iface() {
        return this.iface;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigNetworkCanalNetworkProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String iface;
        public Builder() {}
        public Builder(GetClusterRkeConfigNetworkCanalNetworkProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iface = defaults.iface;
        }

        @CustomType.Setter
        public Builder iface(String iface) {
            this.iface = Objects.requireNonNull(iface);
            return this;
        }
        public GetClusterRkeConfigNetworkCanalNetworkProvider build() {
            final var o = new GetClusterRkeConfigNetworkCanalNetworkProvider();
            o.iface = iface;
            return o;
        }
    }
}
