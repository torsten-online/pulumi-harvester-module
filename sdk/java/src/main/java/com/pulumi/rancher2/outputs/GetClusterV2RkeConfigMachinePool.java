// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigMachinePoolMachineConfig;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigMachinePoolRollingUpdate;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigMachinePoolTaint;
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
public final class GetClusterV2RkeConfigMachinePool {
    private Map<String,Object> annotations;
    /**
     * @return (Computed) Cluster V2 cloud credential secret name (string)
     * 
     */
    private @Nullable String cloudCredentialSecretName;
    private @Nullable Boolean controlPlaneRole;
    private @Nullable Boolean drainBeforeDelete;
    private @Nullable Boolean etcdRole;
    private @Nullable Integer hostnameLengthLimit;
    private Map<String,Object> labels;
    private GetClusterV2RkeConfigMachinePoolMachineConfig machineConfig;
    private Map<String,Object> machineLabels;
    private @Nullable String maxUnhealthy;
    /**
     * @return The name of the Cluster v2 (string)
     * 
     */
    private String name;
    private @Nullable Integer nodeDrainTimeout;
    private @Nullable Integer nodeStartupTimeoutSeconds;
    private @Nullable Boolean paused;
    private @Nullable Integer quantity;
    private @Nullable GetClusterV2RkeConfigMachinePoolRollingUpdate rollingUpdate;
    private @Nullable List<GetClusterV2RkeConfigMachinePoolTaint> taints;
    private @Nullable Integer unhealthyNodeTimeoutSeconds;
    private @Nullable String unhealthyRange;
    private @Nullable Boolean workerRole;

    private GetClusterV2RkeConfigMachinePool() {}
    public Map<String,Object> annotations() {
        return this.annotations;
    }
    /**
     * @return (Computed) Cluster V2 cloud credential secret name (string)
     * 
     */
    public Optional<String> cloudCredentialSecretName() {
        return Optional.ofNullable(this.cloudCredentialSecretName);
    }
    public Optional<Boolean> controlPlaneRole() {
        return Optional.ofNullable(this.controlPlaneRole);
    }
    public Optional<Boolean> drainBeforeDelete() {
        return Optional.ofNullable(this.drainBeforeDelete);
    }
    public Optional<Boolean> etcdRole() {
        return Optional.ofNullable(this.etcdRole);
    }
    public Optional<Integer> hostnameLengthLimit() {
        return Optional.ofNullable(this.hostnameLengthLimit);
    }
    public Map<String,Object> labels() {
        return this.labels;
    }
    public GetClusterV2RkeConfigMachinePoolMachineConfig machineConfig() {
        return this.machineConfig;
    }
    public Map<String,Object> machineLabels() {
        return this.machineLabels;
    }
    public Optional<String> maxUnhealthy() {
        return Optional.ofNullable(this.maxUnhealthy);
    }
    /**
     * @return The name of the Cluster v2 (string)
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<Integer> nodeDrainTimeout() {
        return Optional.ofNullable(this.nodeDrainTimeout);
    }
    public Optional<Integer> nodeStartupTimeoutSeconds() {
        return Optional.ofNullable(this.nodeStartupTimeoutSeconds);
    }
    public Optional<Boolean> paused() {
        return Optional.ofNullable(this.paused);
    }
    public Optional<Integer> quantity() {
        return Optional.ofNullable(this.quantity);
    }
    public Optional<GetClusterV2RkeConfigMachinePoolRollingUpdate> rollingUpdate() {
        return Optional.ofNullable(this.rollingUpdate);
    }
    public List<GetClusterV2RkeConfigMachinePoolTaint> taints() {
        return this.taints == null ? List.of() : this.taints;
    }
    public Optional<Integer> unhealthyNodeTimeoutSeconds() {
        return Optional.ofNullable(this.unhealthyNodeTimeoutSeconds);
    }
    public Optional<String> unhealthyRange() {
        return Optional.ofNullable(this.unhealthyRange);
    }
    public Optional<Boolean> workerRole() {
        return Optional.ofNullable(this.workerRole);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterV2RkeConfigMachinePool defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,Object> annotations;
        private @Nullable String cloudCredentialSecretName;
        private @Nullable Boolean controlPlaneRole;
        private @Nullable Boolean drainBeforeDelete;
        private @Nullable Boolean etcdRole;
        private @Nullable Integer hostnameLengthLimit;
        private Map<String,Object> labels;
        private GetClusterV2RkeConfigMachinePoolMachineConfig machineConfig;
        private Map<String,Object> machineLabels;
        private @Nullable String maxUnhealthy;
        private String name;
        private @Nullable Integer nodeDrainTimeout;
        private @Nullable Integer nodeStartupTimeoutSeconds;
        private @Nullable Boolean paused;
        private @Nullable Integer quantity;
        private @Nullable GetClusterV2RkeConfigMachinePoolRollingUpdate rollingUpdate;
        private @Nullable List<GetClusterV2RkeConfigMachinePoolTaint> taints;
        private @Nullable Integer unhealthyNodeTimeoutSeconds;
        private @Nullable String unhealthyRange;
        private @Nullable Boolean workerRole;
        public Builder() {}
        public Builder(GetClusterV2RkeConfigMachinePool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.cloudCredentialSecretName = defaults.cloudCredentialSecretName;
    	      this.controlPlaneRole = defaults.controlPlaneRole;
    	      this.drainBeforeDelete = defaults.drainBeforeDelete;
    	      this.etcdRole = defaults.etcdRole;
    	      this.hostnameLengthLimit = defaults.hostnameLengthLimit;
    	      this.labels = defaults.labels;
    	      this.machineConfig = defaults.machineConfig;
    	      this.machineLabels = defaults.machineLabels;
    	      this.maxUnhealthy = defaults.maxUnhealthy;
    	      this.name = defaults.name;
    	      this.nodeDrainTimeout = defaults.nodeDrainTimeout;
    	      this.nodeStartupTimeoutSeconds = defaults.nodeStartupTimeoutSeconds;
    	      this.paused = defaults.paused;
    	      this.quantity = defaults.quantity;
    	      this.rollingUpdate = defaults.rollingUpdate;
    	      this.taints = defaults.taints;
    	      this.unhealthyNodeTimeoutSeconds = defaults.unhealthyNodeTimeoutSeconds;
    	      this.unhealthyRange = defaults.unhealthyRange;
    	      this.workerRole = defaults.workerRole;
        }

        @CustomType.Setter
        public Builder annotations(Map<String,Object> annotations) {
            if (annotations == null) {
              throw new MissingRequiredPropertyException("GetClusterV2RkeConfigMachinePool", "annotations");
            }
            this.annotations = annotations;
            return this;
        }
        @CustomType.Setter
        public Builder cloudCredentialSecretName(@Nullable String cloudCredentialSecretName) {

            this.cloudCredentialSecretName = cloudCredentialSecretName;
            return this;
        }
        @CustomType.Setter
        public Builder controlPlaneRole(@Nullable Boolean controlPlaneRole) {

            this.controlPlaneRole = controlPlaneRole;
            return this;
        }
        @CustomType.Setter
        public Builder drainBeforeDelete(@Nullable Boolean drainBeforeDelete) {

            this.drainBeforeDelete = drainBeforeDelete;
            return this;
        }
        @CustomType.Setter
        public Builder etcdRole(@Nullable Boolean etcdRole) {

            this.etcdRole = etcdRole;
            return this;
        }
        @CustomType.Setter
        public Builder hostnameLengthLimit(@Nullable Integer hostnameLengthLimit) {

            this.hostnameLengthLimit = hostnameLengthLimit;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,Object> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetClusterV2RkeConfigMachinePool", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder machineConfig(GetClusterV2RkeConfigMachinePoolMachineConfig machineConfig) {
            if (machineConfig == null) {
              throw new MissingRequiredPropertyException("GetClusterV2RkeConfigMachinePool", "machineConfig");
            }
            this.machineConfig = machineConfig;
            return this;
        }
        @CustomType.Setter
        public Builder machineLabels(Map<String,Object> machineLabels) {
            if (machineLabels == null) {
              throw new MissingRequiredPropertyException("GetClusterV2RkeConfigMachinePool", "machineLabels");
            }
            this.machineLabels = machineLabels;
            return this;
        }
        @CustomType.Setter
        public Builder maxUnhealthy(@Nullable String maxUnhealthy) {

            this.maxUnhealthy = maxUnhealthy;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetClusterV2RkeConfigMachinePool", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nodeDrainTimeout(@Nullable Integer nodeDrainTimeout) {

            this.nodeDrainTimeout = nodeDrainTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder nodeStartupTimeoutSeconds(@Nullable Integer nodeStartupTimeoutSeconds) {

            this.nodeStartupTimeoutSeconds = nodeStartupTimeoutSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder paused(@Nullable Boolean paused) {

            this.paused = paused;
            return this;
        }
        @CustomType.Setter
        public Builder quantity(@Nullable Integer quantity) {

            this.quantity = quantity;
            return this;
        }
        @CustomType.Setter
        public Builder rollingUpdate(@Nullable GetClusterV2RkeConfigMachinePoolRollingUpdate rollingUpdate) {

            this.rollingUpdate = rollingUpdate;
            return this;
        }
        @CustomType.Setter
        public Builder taints(@Nullable List<GetClusterV2RkeConfigMachinePoolTaint> taints) {

            this.taints = taints;
            return this;
        }
        public Builder taints(GetClusterV2RkeConfigMachinePoolTaint... taints) {
            return taints(List.of(taints));
        }
        @CustomType.Setter
        public Builder unhealthyNodeTimeoutSeconds(@Nullable Integer unhealthyNodeTimeoutSeconds) {

            this.unhealthyNodeTimeoutSeconds = unhealthyNodeTimeoutSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder unhealthyRange(@Nullable String unhealthyRange) {

            this.unhealthyRange = unhealthyRange;
            return this;
        }
        @CustomType.Setter
        public Builder workerRole(@Nullable Boolean workerRole) {

            this.workerRole = workerRole;
            return this;
        }
        public GetClusterV2RkeConfigMachinePool build() {
            final var _resultValue = new GetClusterV2RkeConfigMachinePool();
            _resultValue.annotations = annotations;
            _resultValue.cloudCredentialSecretName = cloudCredentialSecretName;
            _resultValue.controlPlaneRole = controlPlaneRole;
            _resultValue.drainBeforeDelete = drainBeforeDelete;
            _resultValue.etcdRole = etcdRole;
            _resultValue.hostnameLengthLimit = hostnameLengthLimit;
            _resultValue.labels = labels;
            _resultValue.machineConfig = machineConfig;
            _resultValue.machineLabels = machineLabels;
            _resultValue.maxUnhealthy = maxUnhealthy;
            _resultValue.name = name;
            _resultValue.nodeDrainTimeout = nodeDrainTimeout;
            _resultValue.nodeStartupTimeoutSeconds = nodeStartupTimeoutSeconds;
            _resultValue.paused = paused;
            _resultValue.quantity = quantity;
            _resultValue.rollingUpdate = rollingUpdate;
            _resultValue.taints = taints;
            _resultValue.unhealthyNodeTimeoutSeconds = unhealthyNodeTimeoutSeconds;
            _resultValue.unhealthyRange = unhealthyRange;
            _resultValue.workerRole = workerRole;
            return _resultValue;
        }
    }
}
