// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs Empty = new ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs();

    /**
     * The GKE master authorized network config cidr block (string)
     * 
     */
    @Import(name="cidrBlock", required=true)
    private Output<String> cidrBlock;

    /**
     * @return The GKE master authorized network config cidr block (string)
     * 
     */
    public Output<String> cidrBlock() {
        return this.cidrBlock;
    }

    /**
     * The GKE master authorized network config cidr block dispaly name (string)
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The GKE master authorized network config cidr block dispaly name (string)
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    private ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs() {}

    private ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs(ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs $) {
        this.cidrBlock = $.cidrBlock;
        this.displayName = $.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs $;

        public Builder() {
            $ = new ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs();
        }

        public Builder(ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs defaults) {
            $ = new ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidrBlock The GKE master authorized network config cidr block (string)
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(Output<String> cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * @param cidrBlock The GKE master authorized network config cidr block (string)
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(String cidrBlock) {
            return cidrBlock(Output.of(cidrBlock));
        }

        /**
         * @param displayName The GKE master authorized network config cidr block dispaly name (string)
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The GKE master authorized network config cidr block dispaly name (string)
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs build() {
            $.cidrBlock = Objects.requireNonNull($.cidrBlock, "expected parameter 'cidrBlock' to be non-null");
            return $;
        }
    }

}
