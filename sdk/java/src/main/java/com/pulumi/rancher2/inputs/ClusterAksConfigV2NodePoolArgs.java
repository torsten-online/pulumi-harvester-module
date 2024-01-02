// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterAksConfigV2NodePoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterAksConfigV2NodePoolArgs Empty = new ClusterAksConfigV2NodePoolArgs();

    /**
     * The AKS node pool availability zones (list)
     * 
     */
    @Import(name="availabilityZones")
    private @Nullable Output<List<String>> availabilityZones;

    /**
     * @return The AKS node pool availability zones (list)
     * 
     */
    public Optional<Output<List<String>>> availabilityZones() {
        return Optional.ofNullable(this.availabilityZones);
    }

    /**
     * The AKS node pool count. Default: `1` (int)
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    /**
     * @return The AKS node pool count. Default: `1` (int)
     * 
     */
    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * Is AKS node pool auto scaling enabled? Default: `false` (bool)
     * 
     */
    @Import(name="enableAutoScaling")
    private @Nullable Output<Boolean> enableAutoScaling;

    /**
     * @return Is AKS node pool auto scaling enabled? Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> enableAutoScaling() {
        return Optional.ofNullable(this.enableAutoScaling);
    }

    /**
     * Labels for the Cluster (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels for the Cluster (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The AKS node pool max count. Required if `enable_auto_scaling=true` (int)
     * 
     */
    @Import(name="maxCount")
    private @Nullable Output<Integer> maxCount;

    /**
     * @return The AKS node pool max count. Required if `enable_auto_scaling=true` (int)
     * 
     */
    public Optional<Output<Integer>> maxCount() {
        return Optional.ofNullable(this.maxCount);
    }

    /**
     * The AKS node pool max pods. Default: `110` (int)
     * 
     */
    @Import(name="maxPods")
    private @Nullable Output<Integer> maxPods;

    /**
     * @return The AKS node pool max pods. Default: `110` (int)
     * 
     */
    public Optional<Output<Integer>> maxPods() {
        return Optional.ofNullable(this.maxPods);
    }

    /**
     * The AKS node pool max surge (string), example value: `25%`
     * 
     */
    @Import(name="maxSurge")
    private @Nullable Output<String> maxSurge;

    /**
     * @return The AKS node pool max surge (string), example value: `25%`
     * 
     */
    public Optional<Output<String>> maxSurge() {
        return Optional.ofNullable(this.maxSurge);
    }

    /**
     * The AKS node pool min count. Required if `enable_auto_scaling=true` (int)
     * 
     */
    @Import(name="minCount")
    private @Nullable Output<Integer> minCount;

    /**
     * @return The AKS node pool min count. Required if `enable_auto_scaling=true` (int)
     * 
     */
    public Optional<Output<Integer>> minCount() {
        return Optional.ofNullable(this.minCount);
    }

    /**
     * The AKS node group mode. Default: `System` (string)
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return The AKS node group mode. Default: `System` (string)
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The name of the Cluster (string)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Cluster (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The AKS node pool orchestrator version (string)
     * 
     */
    @Import(name="orchestratorVersion")
    private @Nullable Output<String> orchestratorVersion;

    /**
     * @return The AKS node pool orchestrator version (string)
     * 
     */
    public Optional<Output<String>> orchestratorVersion() {
        return Optional.ofNullable(this.orchestratorVersion);
    }

    /**
     * The AKS node pool os disk size gb. Default: `128` (int)
     * 
     */
    @Import(name="osDiskSizeGb")
    private @Nullable Output<Integer> osDiskSizeGb;

    /**
     * @return The AKS node pool os disk size gb. Default: `128` (int)
     * 
     */
    public Optional<Output<Integer>> osDiskSizeGb() {
        return Optional.ofNullable(this.osDiskSizeGb);
    }

    /**
     * The AKS node pool os disk type. Default: `Managed` (string)
     * 
     */
    @Import(name="osDiskType")
    private @Nullable Output<String> osDiskType;

    /**
     * @return The AKS node pool os disk type. Default: `Managed` (string)
     * 
     */
    public Optional<Output<String>> osDiskType() {
        return Optional.ofNullable(this.osDiskType);
    }

    /**
     * The AKS node pool os type. Default: `Linux` (string)
     * 
     */
    @Import(name="osType")
    private @Nullable Output<String> osType;

    /**
     * @return The AKS node pool os type. Default: `Linux` (string)
     * 
     */
    public Optional<Output<String>> osType() {
        return Optional.ofNullable(this.osType);
    }

    /**
     * The GKE node config taints (List)
     * 
     */
    @Import(name="taints")
    private @Nullable Output<List<String>> taints;

    /**
     * @return The GKE node config taints (List)
     * 
     */
    public Optional<Output<List<String>>> taints() {
        return Optional.ofNullable(this.taints);
    }

    /**
     * The AKS node pool orchestrator version (string)
     * 
     */
    @Import(name="vmSize")
    private @Nullable Output<String> vmSize;

    /**
     * @return The AKS node pool orchestrator version (string)
     * 
     */
    public Optional<Output<String>> vmSize() {
        return Optional.ofNullable(this.vmSize);
    }

    private ClusterAksConfigV2NodePoolArgs() {}

    private ClusterAksConfigV2NodePoolArgs(ClusterAksConfigV2NodePoolArgs $) {
        this.availabilityZones = $.availabilityZones;
        this.count = $.count;
        this.enableAutoScaling = $.enableAutoScaling;
        this.labels = $.labels;
        this.maxCount = $.maxCount;
        this.maxPods = $.maxPods;
        this.maxSurge = $.maxSurge;
        this.minCount = $.minCount;
        this.mode = $.mode;
        this.name = $.name;
        this.orchestratorVersion = $.orchestratorVersion;
        this.osDiskSizeGb = $.osDiskSizeGb;
        this.osDiskType = $.osDiskType;
        this.osType = $.osType;
        this.taints = $.taints;
        this.vmSize = $.vmSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterAksConfigV2NodePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterAksConfigV2NodePoolArgs $;

        public Builder() {
            $ = new ClusterAksConfigV2NodePoolArgs();
        }

        public Builder(ClusterAksConfigV2NodePoolArgs defaults) {
            $ = new ClusterAksConfigV2NodePoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityZones The AKS node pool availability zones (list)
         * 
         * @return builder
         * 
         */
        public Builder availabilityZones(@Nullable Output<List<String>> availabilityZones) {
            $.availabilityZones = availabilityZones;
            return this;
        }

        /**
         * @param availabilityZones The AKS node pool availability zones (list)
         * 
         * @return builder
         * 
         */
        public Builder availabilityZones(List<String> availabilityZones) {
            return availabilityZones(Output.of(availabilityZones));
        }

        /**
         * @param availabilityZones The AKS node pool availability zones (list)
         * 
         * @return builder
         * 
         */
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }

        /**
         * @param count The AKS node pool count. Default: `1` (int)
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count The AKS node pool count. Default: `1` (int)
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param enableAutoScaling Is AKS node pool auto scaling enabled? Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enableAutoScaling(@Nullable Output<Boolean> enableAutoScaling) {
            $.enableAutoScaling = enableAutoScaling;
            return this;
        }

        /**
         * @param enableAutoScaling Is AKS node pool auto scaling enabled? Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enableAutoScaling(Boolean enableAutoScaling) {
            return enableAutoScaling(Output.of(enableAutoScaling));
        }

        /**
         * @param labels Labels for the Cluster (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for the Cluster (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param maxCount The AKS node pool max count. Required if `enable_auto_scaling=true` (int)
         * 
         * @return builder
         * 
         */
        public Builder maxCount(@Nullable Output<Integer> maxCount) {
            $.maxCount = maxCount;
            return this;
        }

        /**
         * @param maxCount The AKS node pool max count. Required if `enable_auto_scaling=true` (int)
         * 
         * @return builder
         * 
         */
        public Builder maxCount(Integer maxCount) {
            return maxCount(Output.of(maxCount));
        }

        /**
         * @param maxPods The AKS node pool max pods. Default: `110` (int)
         * 
         * @return builder
         * 
         */
        public Builder maxPods(@Nullable Output<Integer> maxPods) {
            $.maxPods = maxPods;
            return this;
        }

        /**
         * @param maxPods The AKS node pool max pods. Default: `110` (int)
         * 
         * @return builder
         * 
         */
        public Builder maxPods(Integer maxPods) {
            return maxPods(Output.of(maxPods));
        }

        /**
         * @param maxSurge The AKS node pool max surge (string), example value: `25%`
         * 
         * @return builder
         * 
         */
        public Builder maxSurge(@Nullable Output<String> maxSurge) {
            $.maxSurge = maxSurge;
            return this;
        }

        /**
         * @param maxSurge The AKS node pool max surge (string), example value: `25%`
         * 
         * @return builder
         * 
         */
        public Builder maxSurge(String maxSurge) {
            return maxSurge(Output.of(maxSurge));
        }

        /**
         * @param minCount The AKS node pool min count. Required if `enable_auto_scaling=true` (int)
         * 
         * @return builder
         * 
         */
        public Builder minCount(@Nullable Output<Integer> minCount) {
            $.minCount = minCount;
            return this;
        }

        /**
         * @param minCount The AKS node pool min count. Required if `enable_auto_scaling=true` (int)
         * 
         * @return builder
         * 
         */
        public Builder minCount(Integer minCount) {
            return minCount(Output.of(minCount));
        }

        /**
         * @param mode The AKS node group mode. Default: `System` (string)
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The AKS node group mode. Default: `System` (string)
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param name The name of the Cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orchestratorVersion The AKS node pool orchestrator version (string)
         * 
         * @return builder
         * 
         */
        public Builder orchestratorVersion(@Nullable Output<String> orchestratorVersion) {
            $.orchestratorVersion = orchestratorVersion;
            return this;
        }

        /**
         * @param orchestratorVersion The AKS node pool orchestrator version (string)
         * 
         * @return builder
         * 
         */
        public Builder orchestratorVersion(String orchestratorVersion) {
            return orchestratorVersion(Output.of(orchestratorVersion));
        }

        /**
         * @param osDiskSizeGb The AKS node pool os disk size gb. Default: `128` (int)
         * 
         * @return builder
         * 
         */
        public Builder osDiskSizeGb(@Nullable Output<Integer> osDiskSizeGb) {
            $.osDiskSizeGb = osDiskSizeGb;
            return this;
        }

        /**
         * @param osDiskSizeGb The AKS node pool os disk size gb. Default: `128` (int)
         * 
         * @return builder
         * 
         */
        public Builder osDiskSizeGb(Integer osDiskSizeGb) {
            return osDiskSizeGb(Output.of(osDiskSizeGb));
        }

        /**
         * @param osDiskType The AKS node pool os disk type. Default: `Managed` (string)
         * 
         * @return builder
         * 
         */
        public Builder osDiskType(@Nullable Output<String> osDiskType) {
            $.osDiskType = osDiskType;
            return this;
        }

        /**
         * @param osDiskType The AKS node pool os disk type. Default: `Managed` (string)
         * 
         * @return builder
         * 
         */
        public Builder osDiskType(String osDiskType) {
            return osDiskType(Output.of(osDiskType));
        }

        /**
         * @param osType The AKS node pool os type. Default: `Linux` (string)
         * 
         * @return builder
         * 
         */
        public Builder osType(@Nullable Output<String> osType) {
            $.osType = osType;
            return this;
        }

        /**
         * @param osType The AKS node pool os type. Default: `Linux` (string)
         * 
         * @return builder
         * 
         */
        public Builder osType(String osType) {
            return osType(Output.of(osType));
        }

        /**
         * @param taints The GKE node config taints (List)
         * 
         * @return builder
         * 
         */
        public Builder taints(@Nullable Output<List<String>> taints) {
            $.taints = taints;
            return this;
        }

        /**
         * @param taints The GKE node config taints (List)
         * 
         * @return builder
         * 
         */
        public Builder taints(List<String> taints) {
            return taints(Output.of(taints));
        }

        /**
         * @param taints The GKE node config taints (List)
         * 
         * @return builder
         * 
         */
        public Builder taints(String... taints) {
            return taints(List.of(taints));
        }

        /**
         * @param vmSize The AKS node pool orchestrator version (string)
         * 
         * @return builder
         * 
         */
        public Builder vmSize(@Nullable Output<String> vmSize) {
            $.vmSize = vmSize;
            return this;
        }

        /**
         * @param vmSize The AKS node pool orchestrator version (string)
         * 
         * @return builder
         * 
         */
        public Builder vmSize(String vmSize) {
            return vmSize(Output.of(vmSize));
        }

        public ClusterAksConfigV2NodePoolArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ClusterAksConfigV2NodePoolArgs", "name");
            }
            return $;
        }
    }

}
