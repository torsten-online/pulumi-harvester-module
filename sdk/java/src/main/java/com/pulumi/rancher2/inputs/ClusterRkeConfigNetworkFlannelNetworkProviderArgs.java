// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigNetworkFlannelNetworkProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigNetworkFlannelNetworkProviderArgs Empty = new ClusterRkeConfigNetworkFlannelNetworkProviderArgs();

    @Import(name="iface")
    private @Nullable Output<String> iface;

    public Optional<Output<String>> iface() {
        return Optional.ofNullable(this.iface);
    }

    private ClusterRkeConfigNetworkFlannelNetworkProviderArgs() {}

    private ClusterRkeConfigNetworkFlannelNetworkProviderArgs(ClusterRkeConfigNetworkFlannelNetworkProviderArgs $) {
        this.iface = $.iface;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigNetworkFlannelNetworkProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigNetworkFlannelNetworkProviderArgs $;

        public Builder() {
            $ = new ClusterRkeConfigNetworkFlannelNetworkProviderArgs();
        }

        public Builder(ClusterRkeConfigNetworkFlannelNetworkProviderArgs defaults) {
            $ = new ClusterRkeConfigNetworkFlannelNetworkProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder iface(@Nullable Output<String> iface) {
            $.iface = iface;
            return this;
        }

        public Builder iface(String iface) {
            return iface(Output.of(iface));
        }

        public ClusterRkeConfigNetworkFlannelNetworkProviderArgs build() {
            return $;
        }
    }

}
