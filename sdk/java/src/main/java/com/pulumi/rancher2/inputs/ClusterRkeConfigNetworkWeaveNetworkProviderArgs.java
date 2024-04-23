// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ClusterRkeConfigNetworkWeaveNetworkProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigNetworkWeaveNetworkProviderArgs Empty = new ClusterRkeConfigNetworkWeaveNetworkProviderArgs();

    @Import(name="password", required=true)
    private Output<String> password;

    public Output<String> password() {
        return this.password;
    }

    private ClusterRkeConfigNetworkWeaveNetworkProviderArgs() {}

    private ClusterRkeConfigNetworkWeaveNetworkProviderArgs(ClusterRkeConfigNetworkWeaveNetworkProviderArgs $) {
        this.password = $.password;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigNetworkWeaveNetworkProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigNetworkWeaveNetworkProviderArgs $;

        public Builder() {
            $ = new ClusterRkeConfigNetworkWeaveNetworkProviderArgs();
        }

        public Builder(ClusterRkeConfigNetworkWeaveNetworkProviderArgs defaults) {
            $ = new ClusterRkeConfigNetworkWeaveNetworkProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public ClusterRkeConfigNetworkWeaveNetworkProviderArgs build() {
            if ($.password == null) {
                throw new MissingRequiredPropertyException("ClusterRkeConfigNetworkWeaveNetworkProviderArgs", "password");
            }
            return $;
        }
    }

}
