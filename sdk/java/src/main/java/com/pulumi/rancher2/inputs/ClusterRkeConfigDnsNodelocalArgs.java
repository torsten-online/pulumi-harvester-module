// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigDnsNodelocalArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigDnsNodelocalArgs Empty = new ClusterRkeConfigDnsNodelocalArgs();

    /**
     * Nodelocal dns ip address (string)
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return Nodelocal dns ip address (string)
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * RKE monitoring node selector (map)
     * 
     */
    @Import(name="nodeSelector")
    private @Nullable Output<Map<String,Object>> nodeSelector;

    /**
     * @return RKE monitoring node selector (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> nodeSelector() {
        return Optional.ofNullable(this.nodeSelector);
    }

    private ClusterRkeConfigDnsNodelocalArgs() {}

    private ClusterRkeConfigDnsNodelocalArgs(ClusterRkeConfigDnsNodelocalArgs $) {
        this.ipAddress = $.ipAddress;
        this.nodeSelector = $.nodeSelector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigDnsNodelocalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigDnsNodelocalArgs $;

        public Builder() {
            $ = new ClusterRkeConfigDnsNodelocalArgs();
        }

        public Builder(ClusterRkeConfigDnsNodelocalArgs defaults) {
            $ = new ClusterRkeConfigDnsNodelocalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipAddress Nodelocal dns ip address (string)
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress Nodelocal dns ip address (string)
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param nodeSelector RKE monitoring node selector (map)
         * 
         * @return builder
         * 
         */
        public Builder nodeSelector(@Nullable Output<Map<String,Object>> nodeSelector) {
            $.nodeSelector = nodeSelector;
            return this;
        }

        /**
         * @param nodeSelector RKE monitoring node selector (map)
         * 
         * @return builder
         * 
         */
        public Builder nodeSelector(Map<String,Object> nodeSelector) {
            return nodeSelector(Output.of(nodeSelector));
        }

        public ClusterRkeConfigDnsNodelocalArgs build() {
            return $;
        }
    }

}
