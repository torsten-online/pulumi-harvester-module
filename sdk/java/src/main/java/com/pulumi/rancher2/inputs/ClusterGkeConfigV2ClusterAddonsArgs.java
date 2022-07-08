// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterGkeConfigV2ClusterAddonsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterGkeConfigV2ClusterAddonsArgs Empty = new ClusterGkeConfigV2ClusterAddonsArgs();

    /**
     * Enable GKE horizontal pod autoscaling. Default: `false` (bool)
     * 
     */
    @Import(name="horizontalPodAutoscaling")
    private @Nullable Output<Boolean> horizontalPodAutoscaling;

    /**
     * @return Enable GKE horizontal pod autoscaling. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> horizontalPodAutoscaling() {
        return Optional.ofNullable(this.horizontalPodAutoscaling);
    }

    /**
     * Enable GKE HTTP load balancing. Default: `false` (bool)
     * 
     */
    @Import(name="httpLoadBalancing")
    private @Nullable Output<Boolean> httpLoadBalancing;

    /**
     * @return Enable GKE HTTP load balancing. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> httpLoadBalancing() {
        return Optional.ofNullable(this.httpLoadBalancing);
    }

    /**
     * Enable GKE network policy config. Default: `false` (bool)
     * 
     */
    @Import(name="networkPolicyConfig")
    private @Nullable Output<Boolean> networkPolicyConfig;

    /**
     * @return Enable GKE network policy config. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> networkPolicyConfig() {
        return Optional.ofNullable(this.networkPolicyConfig);
    }

    private ClusterGkeConfigV2ClusterAddonsArgs() {}

    private ClusterGkeConfigV2ClusterAddonsArgs(ClusterGkeConfigV2ClusterAddonsArgs $) {
        this.horizontalPodAutoscaling = $.horizontalPodAutoscaling;
        this.httpLoadBalancing = $.httpLoadBalancing;
        this.networkPolicyConfig = $.networkPolicyConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterGkeConfigV2ClusterAddonsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterGkeConfigV2ClusterAddonsArgs $;

        public Builder() {
            $ = new ClusterGkeConfigV2ClusterAddonsArgs();
        }

        public Builder(ClusterGkeConfigV2ClusterAddonsArgs defaults) {
            $ = new ClusterGkeConfigV2ClusterAddonsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param horizontalPodAutoscaling Enable GKE horizontal pod autoscaling. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder horizontalPodAutoscaling(@Nullable Output<Boolean> horizontalPodAutoscaling) {
            $.horizontalPodAutoscaling = horizontalPodAutoscaling;
            return this;
        }

        /**
         * @param horizontalPodAutoscaling Enable GKE horizontal pod autoscaling. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder horizontalPodAutoscaling(Boolean horizontalPodAutoscaling) {
            return horizontalPodAutoscaling(Output.of(horizontalPodAutoscaling));
        }

        /**
         * @param httpLoadBalancing Enable GKE HTTP load balancing. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder httpLoadBalancing(@Nullable Output<Boolean> httpLoadBalancing) {
            $.httpLoadBalancing = httpLoadBalancing;
            return this;
        }

        /**
         * @param httpLoadBalancing Enable GKE HTTP load balancing. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder httpLoadBalancing(Boolean httpLoadBalancing) {
            return httpLoadBalancing(Output.of(httpLoadBalancing));
        }

        /**
         * @param networkPolicyConfig Enable GKE network policy config. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder networkPolicyConfig(@Nullable Output<Boolean> networkPolicyConfig) {
            $.networkPolicyConfig = networkPolicyConfig;
            return this;
        }

        /**
         * @param networkPolicyConfig Enable GKE network policy config. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder networkPolicyConfig(Boolean networkPolicyConfig) {
            return networkPolicyConfig(Output.of(networkPolicyConfig));
        }

        public ClusterGkeConfigV2ClusterAddonsArgs build() {
            return $;
        }
    }

}
