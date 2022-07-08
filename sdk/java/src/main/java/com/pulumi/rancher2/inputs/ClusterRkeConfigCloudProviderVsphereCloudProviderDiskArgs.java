// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigCloudProviderVsphereCloudProviderDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigCloudProviderVsphereCloudProviderDiskArgs Empty = new ClusterRkeConfigCloudProviderVsphereCloudProviderDiskArgs();

    /**
     * (string)
     * 
     */
    @Import(name="scsiControllerType")
    private @Nullable Output<String> scsiControllerType;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> scsiControllerType() {
        return Optional.ofNullable(this.scsiControllerType);
    }

    private ClusterRkeConfigCloudProviderVsphereCloudProviderDiskArgs() {}

    private ClusterRkeConfigCloudProviderVsphereCloudProviderDiskArgs(ClusterRkeConfigCloudProviderVsphereCloudProviderDiskArgs $) {
        this.scsiControllerType = $.scsiControllerType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigCloudProviderVsphereCloudProviderDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigCloudProviderVsphereCloudProviderDiskArgs $;

        public Builder() {
            $ = new ClusterRkeConfigCloudProviderVsphereCloudProviderDiskArgs();
        }

        public Builder(ClusterRkeConfigCloudProviderVsphereCloudProviderDiskArgs defaults) {
            $ = new ClusterRkeConfigCloudProviderVsphereCloudProviderDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scsiControllerType (string)
         * 
         * @return builder
         * 
         */
        public Builder scsiControllerType(@Nullable Output<String> scsiControllerType) {
            $.scsiControllerType = scsiControllerType;
            return this;
        }

        /**
         * @param scsiControllerType (string)
         * 
         * @return builder
         * 
         */
        public Builder scsiControllerType(String scsiControllerType) {
            return scsiControllerType(Output.of(scsiControllerType));
        }

        public ClusterRkeConfigCloudProviderVsphereCloudProviderDiskArgs build() {
            return $;
        }
    }

}
