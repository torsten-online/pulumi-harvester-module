// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetClusterAlertGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterAlertGroupPlainArgs Empty = new GetClusterAlertGroupPlainArgs();

    /**
     * The cluster id where create cluster alert group (string)
     * 
     */
    @Import(name="clusterId", required=true)
    private String clusterId;

    /**
     * @return The cluster id where create cluster alert group (string)
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * The cluster alert group name (string)
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The cluster alert group name (string)
     * 
     */
    public String name() {
        return this.name;
    }

    private GetClusterAlertGroupPlainArgs() {}

    private GetClusterAlertGroupPlainArgs(GetClusterAlertGroupPlainArgs $) {
        this.clusterId = $.clusterId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterAlertGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterAlertGroupPlainArgs $;

        public Builder() {
            $ = new GetClusterAlertGroupPlainArgs();
        }

        public Builder(GetClusterAlertGroupPlainArgs defaults) {
            $ = new GetClusterAlertGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The cluster id where create cluster alert group (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param name The cluster alert group name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetClusterAlertGroupPlainArgs build() {
            if ($.clusterId == null) {
                throw new MissingRequiredPropertyException("GetClusterAlertGroupPlainArgs", "clusterId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetClusterAlertGroupPlainArgs", "name");
            }
            return $;
        }
    }

}
