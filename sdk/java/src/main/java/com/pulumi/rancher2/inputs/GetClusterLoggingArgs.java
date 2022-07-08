// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetClusterLoggingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterLoggingArgs Empty = new GetClusterLoggingArgs();

    /**
     * The cluster id to configure logging (string)
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The cluster id to configure logging (string)
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    private GetClusterLoggingArgs() {}

    private GetClusterLoggingArgs(GetClusterLoggingArgs $) {
        this.clusterId = $.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterLoggingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterLoggingArgs $;

        public Builder() {
            $ = new GetClusterLoggingArgs();
        }

        public Builder(GetClusterLoggingArgs defaults) {
            $ = new GetClusterLoggingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The cluster id to configure logging (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The cluster id to configure logging (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        public GetClusterLoggingArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            return $;
        }
    }

}
