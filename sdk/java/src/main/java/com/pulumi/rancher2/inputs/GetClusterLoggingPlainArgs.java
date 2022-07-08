// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetClusterLoggingPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterLoggingPlainArgs Empty = new GetClusterLoggingPlainArgs();

    /**
     * The cluster id to configure logging (string)
     * 
     */
    @Import(name="clusterId", required=true)
    private String clusterId;

    /**
     * @return The cluster id to configure logging (string)
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }

    private GetClusterLoggingPlainArgs() {}

    private GetClusterLoggingPlainArgs(GetClusterLoggingPlainArgs $) {
        this.clusterId = $.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterLoggingPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterLoggingPlainArgs $;

        public Builder() {
            $ = new GetClusterLoggingPlainArgs();
        }

        public Builder(GetClusterLoggingPlainArgs defaults) {
            $ = new GetClusterLoggingPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The cluster id to configure logging (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        public GetClusterLoggingPlainArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            return $;
        }
    }

}
