// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
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

@CustomType
public final class ClusterAksConfigV2NodePool {
    /**
     * @return The AKS node pool availability zones (list)
     * 
     */
    private @Nullable List<String> availabilityZones;
    /**
     * @return The AKS node pool count. Default: `1` (int)
     * 
     */
    private @Nullable Integer count;
    /**
     * @return Is AKS node pool auto scaling enabled? Default: `false` (bool)
     * 
     */
    private @Nullable Boolean enableAutoScaling;
    /**
     * @return Labels for the Cluster (map)
     * 
     */
    private @Nullable Map<String,Object> labels;
    /**
     * @return The AKS node pool max count. Required if `enable_auto_scaling=true` (int)
     * 
     */
    private @Nullable Integer maxCount;
    /**
     * @return The AKS node pool max pods. Default: `110` (int)
     * 
     */
    private @Nullable Integer maxPods;
    /**
     * @return The AKS node pool max surge (string), example value: `25%`
     * 
     */
    private @Nullable String maxSurge;
    /**
     * @return The AKS node pool min count. Required if `enable_auto_scaling=true` (int)
     * 
     */
    private @Nullable Integer minCount;
    /**
     * @return The AKS node group mode. Default: `System` (string)
     * 
     */
    private @Nullable String mode;
    /**
     * @return The name of the Cluster (string)
     * 
     */
    private String name;
    /**
     * @return The AKS node pool orchestrator version (string)
     * 
     */
    private @Nullable String orchestratorVersion;
    /**
     * @return The AKS node pool os disk size gb. Default: `128` (int)
     * 
     */
    private @Nullable Integer osDiskSizeGb;
    /**
     * @return The AKS node pool os disk type. Default: `Managed` (string)
     * 
     */
    private @Nullable String osDiskType;
    /**
     * @return The AKS node pool os type. Default: `Linux` (string)
     * 
     */
    private @Nullable String osType;
    /**
     * @return The GKE node config taints (List)
     * 
     */
    private @Nullable List<String> taints;
    /**
     * @return The AKS node pool orchestrator version (string)
     * 
     */
    private @Nullable String vmSize;

    private ClusterAksConfigV2NodePool() {}
    /**
     * @return The AKS node pool availability zones (list)
     * 
     */
    public List<String> availabilityZones() {
        return this.availabilityZones == null ? List.of() : this.availabilityZones;
    }
    /**
     * @return The AKS node pool count. Default: `1` (int)
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    /**
     * @return Is AKS node pool auto scaling enabled? Default: `false` (bool)
     * 
     */
    public Optional<Boolean> enableAutoScaling() {
        return Optional.ofNullable(this.enableAutoScaling);
    }
    /**
     * @return Labels for the Cluster (map)
     * 
     */
    public Map<String,Object> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * @return The AKS node pool max count. Required if `enable_auto_scaling=true` (int)
     * 
     */
    public Optional<Integer> maxCount() {
        return Optional.ofNullable(this.maxCount);
    }
    /**
     * @return The AKS node pool max pods. Default: `110` (int)
     * 
     */
    public Optional<Integer> maxPods() {
        return Optional.ofNullable(this.maxPods);
    }
    /**
     * @return The AKS node pool max surge (string), example value: `25%`
     * 
     */
    public Optional<String> maxSurge() {
        return Optional.ofNullable(this.maxSurge);
    }
    /**
     * @return The AKS node pool min count. Required if `enable_auto_scaling=true` (int)
     * 
     */
    public Optional<Integer> minCount() {
        return Optional.ofNullable(this.minCount);
    }
    /**
     * @return The AKS node group mode. Default: `System` (string)
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return The name of the Cluster (string)
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The AKS node pool orchestrator version (string)
     * 
     */
    public Optional<String> orchestratorVersion() {
        return Optional.ofNullable(this.orchestratorVersion);
    }
    /**
     * @return The AKS node pool os disk size gb. Default: `128` (int)
     * 
     */
    public Optional<Integer> osDiskSizeGb() {
        return Optional.ofNullable(this.osDiskSizeGb);
    }
    /**
     * @return The AKS node pool os disk type. Default: `Managed` (string)
     * 
     */
    public Optional<String> osDiskType() {
        return Optional.ofNullable(this.osDiskType);
    }
    /**
     * @return The AKS node pool os type. Default: `Linux` (string)
     * 
     */
    public Optional<String> osType() {
        return Optional.ofNullable(this.osType);
    }
    /**
     * @return The GKE node config taints (List)
     * 
     */
    public List<String> taints() {
        return this.taints == null ? List.of() : this.taints;
    }
    /**
     * @return The AKS node pool orchestrator version (string)
     * 
     */
    public Optional<String> vmSize() {
        return Optional.ofNullable(this.vmSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAksConfigV2NodePool defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> availabilityZones;
        private @Nullable Integer count;
        private @Nullable Boolean enableAutoScaling;
        private @Nullable Map<String,Object> labels;
        private @Nullable Integer maxCount;
        private @Nullable Integer maxPods;
        private @Nullable String maxSurge;
        private @Nullable Integer minCount;
        private @Nullable String mode;
        private String name;
        private @Nullable String orchestratorVersion;
        private @Nullable Integer osDiskSizeGb;
        private @Nullable String osDiskType;
        private @Nullable String osType;
        private @Nullable List<String> taints;
        private @Nullable String vmSize;
        public Builder() {}
        public Builder(ClusterAksConfigV2NodePool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.count = defaults.count;
    	      this.enableAutoScaling = defaults.enableAutoScaling;
    	      this.labels = defaults.labels;
    	      this.maxCount = defaults.maxCount;
    	      this.maxPods = defaults.maxPods;
    	      this.maxSurge = defaults.maxSurge;
    	      this.minCount = defaults.minCount;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.orchestratorVersion = defaults.orchestratorVersion;
    	      this.osDiskSizeGb = defaults.osDiskSizeGb;
    	      this.osDiskType = defaults.osDiskType;
    	      this.osType = defaults.osType;
    	      this.taints = defaults.taints;
    	      this.vmSize = defaults.vmSize;
        }

        @CustomType.Setter
        public Builder availabilityZones(@Nullable List<String> availabilityZones) {

            this.availabilityZones = availabilityZones;
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        @CustomType.Setter
        public Builder count(@Nullable Integer count) {

            this.count = count;
            return this;
        }
        @CustomType.Setter
        public Builder enableAutoScaling(@Nullable Boolean enableAutoScaling) {

            this.enableAutoScaling = enableAutoScaling;
            return this;
        }
        @CustomType.Setter
        public Builder labels(@Nullable Map<String,Object> labels) {

            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder maxCount(@Nullable Integer maxCount) {

            this.maxCount = maxCount;
            return this;
        }
        @CustomType.Setter
        public Builder maxPods(@Nullable Integer maxPods) {

            this.maxPods = maxPods;
            return this;
        }
        @CustomType.Setter
        public Builder maxSurge(@Nullable String maxSurge) {

            this.maxSurge = maxSurge;
            return this;
        }
        @CustomType.Setter
        public Builder minCount(@Nullable Integer minCount) {

            this.minCount = minCount;
            return this;
        }
        @CustomType.Setter
        public Builder mode(@Nullable String mode) {

            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ClusterAksConfigV2NodePool", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orchestratorVersion(@Nullable String orchestratorVersion) {

            this.orchestratorVersion = orchestratorVersion;
            return this;
        }
        @CustomType.Setter
        public Builder osDiskSizeGb(@Nullable Integer osDiskSizeGb) {

            this.osDiskSizeGb = osDiskSizeGb;
            return this;
        }
        @CustomType.Setter
        public Builder osDiskType(@Nullable String osDiskType) {

            this.osDiskType = osDiskType;
            return this;
        }
        @CustomType.Setter
        public Builder osType(@Nullable String osType) {

            this.osType = osType;
            return this;
        }
        @CustomType.Setter
        public Builder taints(@Nullable List<String> taints) {

            this.taints = taints;
            return this;
        }
        public Builder taints(String... taints) {
            return taints(List.of(taints));
        }
        @CustomType.Setter
        public Builder vmSize(@Nullable String vmSize) {

            this.vmSize = vmSize;
            return this;
        }
        public ClusterAksConfigV2NodePool build() {
            final var _resultValue = new ClusterAksConfigV2NodePool();
            _resultValue.availabilityZones = availabilityZones;
            _resultValue.count = count;
            _resultValue.enableAutoScaling = enableAutoScaling;
            _resultValue.labels = labels;
            _resultValue.maxCount = maxCount;
            _resultValue.maxPods = maxPods;
            _resultValue.maxSurge = maxSurge;
            _resultValue.minCount = minCount;
            _resultValue.mode = mode;
            _resultValue.name = name;
            _resultValue.orchestratorVersion = orchestratorVersion;
            _resultValue.osDiskSizeGb = osDiskSizeGb;
            _resultValue.osDiskType = osDiskType;
            _resultValue.osType = osType;
            _resultValue.taints = taints;
            _resultValue.vmSize = vmSize;
            return _resultValue;
        }
    }
}
