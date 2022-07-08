// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterGkeConfigV2NodePoolAutoscalingArgs;
import com.pulumi.rancher2.inputs.ClusterGkeConfigV2NodePoolConfigArgs;
import com.pulumi.rancher2.inputs.ClusterGkeConfigV2NodePoolManagementArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterGkeConfigV2NodePoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterGkeConfigV2NodePoolArgs Empty = new ClusterGkeConfigV2NodePoolArgs();

    /**
     * The GKE node pool config autoscaling (List maxitems:1)
     * 
     */
    @Import(name="autoscaling")
    private @Nullable Output<ClusterGkeConfigV2NodePoolAutoscalingArgs> autoscaling;

    /**
     * @return The GKE node pool config autoscaling (List maxitems:1)
     * 
     */
    public Optional<Output<ClusterGkeConfigV2NodePoolAutoscalingArgs>> autoscaling() {
        return Optional.ofNullable(this.autoscaling);
    }

    /**
     * The GKE node pool node config (List maxitems:1)
     * 
     */
    @Import(name="config")
    private @Nullable Output<ClusterGkeConfigV2NodePoolConfigArgs> config;

    /**
     * @return The GKE node pool node config (List maxitems:1)
     * 
     */
    public Optional<Output<ClusterGkeConfigV2NodePoolConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * The GKE node pool config initial node count (int)
     * 
     */
    @Import(name="initialNodeCount", required=true)
    private Output<Integer> initialNodeCount;

    /**
     * @return The GKE node pool config initial node count (int)
     * 
     */
    public Output<Integer> initialNodeCount() {
        return this.initialNodeCount;
    }

    /**
     * The GKE node pool config management (List maxitems:1)
     * 
     */
    @Import(name="management")
    private @Nullable Output<ClusterGkeConfigV2NodePoolManagementArgs> management;

    /**
     * @return The GKE node pool config management (List maxitems:1)
     * 
     */
    public Optional<Output<ClusterGkeConfigV2NodePoolManagementArgs>> management() {
        return Optional.ofNullable(this.management);
    }

    /**
     * The GKE node pool config max pods constraint. Required for create new cluster if `ip_allocation_policy.use_ip_aliases = true` (int)
     * 
     */
    @Import(name="maxPodsConstraint")
    private @Nullable Output<Integer> maxPodsConstraint;

    /**
     * @return The GKE node pool config max pods constraint. Required for create new cluster if `ip_allocation_policy.use_ip_aliases = true` (int)
     * 
     */
    public Optional<Output<Integer>> maxPodsConstraint() {
        return Optional.ofNullable(this.maxPodsConstraint);
    }

    /**
     * Name of cluster registration token (string)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of cluster registration token (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * rancher-monitoring chart version (string)
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return rancher-monitoring chart version (string)
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private ClusterGkeConfigV2NodePoolArgs() {}

    private ClusterGkeConfigV2NodePoolArgs(ClusterGkeConfigV2NodePoolArgs $) {
        this.autoscaling = $.autoscaling;
        this.config = $.config;
        this.initialNodeCount = $.initialNodeCount;
        this.management = $.management;
        this.maxPodsConstraint = $.maxPodsConstraint;
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterGkeConfigV2NodePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterGkeConfigV2NodePoolArgs $;

        public Builder() {
            $ = new ClusterGkeConfigV2NodePoolArgs();
        }

        public Builder(ClusterGkeConfigV2NodePoolArgs defaults) {
            $ = new ClusterGkeConfigV2NodePoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscaling The GKE node pool config autoscaling (List maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder autoscaling(@Nullable Output<ClusterGkeConfigV2NodePoolAutoscalingArgs> autoscaling) {
            $.autoscaling = autoscaling;
            return this;
        }

        /**
         * @param autoscaling The GKE node pool config autoscaling (List maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder autoscaling(ClusterGkeConfigV2NodePoolAutoscalingArgs autoscaling) {
            return autoscaling(Output.of(autoscaling));
        }

        /**
         * @param config The GKE node pool node config (List maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<ClusterGkeConfigV2NodePoolConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config The GKE node pool node config (List maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder config(ClusterGkeConfigV2NodePoolConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param initialNodeCount The GKE node pool config initial node count (int)
         * 
         * @return builder
         * 
         */
        public Builder initialNodeCount(Output<Integer> initialNodeCount) {
            $.initialNodeCount = initialNodeCount;
            return this;
        }

        /**
         * @param initialNodeCount The GKE node pool config initial node count (int)
         * 
         * @return builder
         * 
         */
        public Builder initialNodeCount(Integer initialNodeCount) {
            return initialNodeCount(Output.of(initialNodeCount));
        }

        /**
         * @param management The GKE node pool config management (List maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder management(@Nullable Output<ClusterGkeConfigV2NodePoolManagementArgs> management) {
            $.management = management;
            return this;
        }

        /**
         * @param management The GKE node pool config management (List maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder management(ClusterGkeConfigV2NodePoolManagementArgs management) {
            return management(Output.of(management));
        }

        /**
         * @param maxPodsConstraint The GKE node pool config max pods constraint. Required for create new cluster if `ip_allocation_policy.use_ip_aliases = true` (int)
         * 
         * @return builder
         * 
         */
        public Builder maxPodsConstraint(@Nullable Output<Integer> maxPodsConstraint) {
            $.maxPodsConstraint = maxPodsConstraint;
            return this;
        }

        /**
         * @param maxPodsConstraint The GKE node pool config max pods constraint. Required for create new cluster if `ip_allocation_policy.use_ip_aliases = true` (int)
         * 
         * @return builder
         * 
         */
        public Builder maxPodsConstraint(Integer maxPodsConstraint) {
            return maxPodsConstraint(Output.of(maxPodsConstraint));
        }

        /**
         * @param name Name of cluster registration token (string)
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of cluster registration token (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param version rancher-monitoring chart version (string)
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version rancher-monitoring chart version (string)
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ClusterGkeConfigV2NodePoolArgs build() {
            $.initialNodeCount = Objects.requireNonNull($.initialNodeCount, "expected parameter 'initialNodeCount' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
