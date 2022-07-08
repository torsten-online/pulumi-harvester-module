// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterGkeConfigV2PrivateClusterConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterGkeConfigV2PrivateClusterConfigArgs Empty = new ClusterGkeConfigV2PrivateClusterConfigArgs();

    /**
     * Enable GKE cluster private endpoint. Default: `false` (bool)
     * 
     */
    @Import(name="enablePrivateEndpoint")
    private @Nullable Output<Boolean> enablePrivateEndpoint;

    /**
     * @return Enable GKE cluster private endpoint. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> enablePrivateEndpoint() {
        return Optional.ofNullable(this.enablePrivateEndpoint);
    }

    /**
     * Specifies whether worker nodes will be deployed into a new, private, subnet. Default `false` (bool)
     * 
     */
    @Import(name="enablePrivateNodes")
    private @Nullable Output<Boolean> enablePrivateNodes;

    /**
     * @return Specifies whether worker nodes will be deployed into a new, private, subnet. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> enablePrivateNodes() {
        return Optional.ofNullable(this.enablePrivateNodes);
    }

    /**
     * The GKE cluster private master ip v4 cidr block (string)
     * 
     */
    @Import(name="masterIpv4CidrBlock", required=true)
    private Output<String> masterIpv4CidrBlock;

    /**
     * @return The GKE cluster private master ip v4 cidr block (string)
     * 
     */
    public Output<String> masterIpv4CidrBlock() {
        return this.masterIpv4CidrBlock;
    }

    private ClusterGkeConfigV2PrivateClusterConfigArgs() {}

    private ClusterGkeConfigV2PrivateClusterConfigArgs(ClusterGkeConfigV2PrivateClusterConfigArgs $) {
        this.enablePrivateEndpoint = $.enablePrivateEndpoint;
        this.enablePrivateNodes = $.enablePrivateNodes;
        this.masterIpv4CidrBlock = $.masterIpv4CidrBlock;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterGkeConfigV2PrivateClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterGkeConfigV2PrivateClusterConfigArgs $;

        public Builder() {
            $ = new ClusterGkeConfigV2PrivateClusterConfigArgs();
        }

        public Builder(ClusterGkeConfigV2PrivateClusterConfigArgs defaults) {
            $ = new ClusterGkeConfigV2PrivateClusterConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enablePrivateEndpoint Enable GKE cluster private endpoint. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enablePrivateEndpoint(@Nullable Output<Boolean> enablePrivateEndpoint) {
            $.enablePrivateEndpoint = enablePrivateEndpoint;
            return this;
        }

        /**
         * @param enablePrivateEndpoint Enable GKE cluster private endpoint. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enablePrivateEndpoint(Boolean enablePrivateEndpoint) {
            return enablePrivateEndpoint(Output.of(enablePrivateEndpoint));
        }

        /**
         * @param enablePrivateNodes Specifies whether worker nodes will be deployed into a new, private, subnet. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enablePrivateNodes(@Nullable Output<Boolean> enablePrivateNodes) {
            $.enablePrivateNodes = enablePrivateNodes;
            return this;
        }

        /**
         * @param enablePrivateNodes Specifies whether worker nodes will be deployed into a new, private, subnet. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enablePrivateNodes(Boolean enablePrivateNodes) {
            return enablePrivateNodes(Output.of(enablePrivateNodes));
        }

        /**
         * @param masterIpv4CidrBlock The GKE cluster private master ip v4 cidr block (string)
         * 
         * @return builder
         * 
         */
        public Builder masterIpv4CidrBlock(Output<String> masterIpv4CidrBlock) {
            $.masterIpv4CidrBlock = masterIpv4CidrBlock;
            return this;
        }

        /**
         * @param masterIpv4CidrBlock The GKE cluster private master ip v4 cidr block (string)
         * 
         * @return builder
         * 
         */
        public Builder masterIpv4CidrBlock(String masterIpv4CidrBlock) {
            return masterIpv4CidrBlock(Output.of(masterIpv4CidrBlock));
        }

        public ClusterGkeConfigV2PrivateClusterConfigArgs build() {
            $.masterIpv4CidrBlock = Objects.requireNonNull($.masterIpv4CidrBlock, "expected parameter 'masterIpv4CidrBlock' to be non-null");
            return $;
        }
    }

}
