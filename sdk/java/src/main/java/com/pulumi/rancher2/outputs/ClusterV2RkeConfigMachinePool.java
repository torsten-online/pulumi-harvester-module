// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigMachinePoolMachineConfig;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigMachinePoolRollingUpdate;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigMachinePoolTaint;
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
public final class ClusterV2RkeConfigMachinePool {
    /**
     * @return Annotations for cluster registration token object (map)
     * 
     */
    private @Nullable Map<String,Object> annotations;
    /**
     * @return Cluster V2 cloud credential secret name (string)
     * 
     */
    private String cloudCredentialSecretName;
    /**
     * @return Machine pool control plane role? (bool)
     * 
     */
    private @Nullable Boolean controlPlaneRole;
    /**
     * @return Machine Pool Drain Before Delete? (bool)
     * 
     */
    private @Nullable Boolean drainBeforeDelete;
    /**
     * @return Machine pool etcd role? (bool)
     * 
     */
    private @Nullable Boolean etcdRole;
    /**
     * @return Labels for cluster registration token object (map)
     * 
     */
    private @Nullable Map<String,Object> labels;
    /**
     * @return Machine pool node config (list)
     * 
     */
    private ClusterV2RkeConfigMachinePoolMachineConfig machineConfig;
    /**
     * @return Max unhealthy nodes for automated replacement to be allowed (string)
     * 
     */
    private @Nullable String maxUnhealthy;
    /**
     * @return Name of cluster registration token (string)
     * 
     */
    private String name;
    /**
     * @return Seconds a machine has to drain before deletion (int)
     * 
     */
    private @Nullable Integer nodeDrainTimeout;
    /**
     * @return Seconds a new node has to become active before it is replaced (int)
     * 
     */
    private @Nullable Integer nodeStartupTimeoutSeconds;
    /**
     * @return Machine pool paused? (bool)
     * 
     */
    private @Nullable Boolean paused;
    /**
     * @return Machine pool quantity (int)
     * 
     */
    private @Nullable Integer quantity;
    /**
     * @return Machine pool rolling update (List maxitems:1)
     * 
     */
    private @Nullable ClusterV2RkeConfigMachinePoolRollingUpdate rollingUpdate;
    /**
     * @return Machine pool taints (list)
     * 
     */
    private @Nullable List<ClusterV2RkeConfigMachinePoolTaint> taints;
    /**
     * @return Seconds an unhealthy node has to become active before it is replaced (int)
     * 
     */
    private @Nullable Integer unhealthyNodeTimeoutSeconds;
    /**
     * @return Range of unhealthy nodes for automated replacement to be allowed (string)
     * 
     */
    private @Nullable String unhealthyRange;
    /**
     * @return Machine pool worker role? (bool)
     * 
     */
    private @Nullable Boolean workerRole;

    private ClusterV2RkeConfigMachinePool() {}
    /**
     * @return Annotations for cluster registration token object (map)
     * 
     */
    public Map<String,Object> annotations() {
        return this.annotations == null ? Map.of() : this.annotations;
    }
    /**
     * @return Cluster V2 cloud credential secret name (string)
     * 
     */
    public String cloudCredentialSecretName() {
        return this.cloudCredentialSecretName;
    }
    /**
     * @return Machine pool control plane role? (bool)
     * 
     */
    public Optional<Boolean> controlPlaneRole() {
        return Optional.ofNullable(this.controlPlaneRole);
    }
    /**
     * @return Machine Pool Drain Before Delete? (bool)
     * 
     */
    public Optional<Boolean> drainBeforeDelete() {
        return Optional.ofNullable(this.drainBeforeDelete);
    }
    /**
     * @return Machine pool etcd role? (bool)
     * 
     */
    public Optional<Boolean> etcdRole() {
        return Optional.ofNullable(this.etcdRole);
    }
    /**
     * @return Labels for cluster registration token object (map)
     * 
     */
    public Map<String,Object> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * @return Machine pool node config (list)
     * 
     */
    public ClusterV2RkeConfigMachinePoolMachineConfig machineConfig() {
        return this.machineConfig;
    }
    /**
     * @return Max unhealthy nodes for automated replacement to be allowed (string)
     * 
     */
    public Optional<String> maxUnhealthy() {
        return Optional.ofNullable(this.maxUnhealthy);
    }
    /**
     * @return Name of cluster registration token (string)
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Seconds a machine has to drain before deletion (int)
     * 
     */
    public Optional<Integer> nodeDrainTimeout() {
        return Optional.ofNullable(this.nodeDrainTimeout);
    }
    /**
     * @return Seconds a new node has to become active before it is replaced (int)
     * 
     */
    public Optional<Integer> nodeStartupTimeoutSeconds() {
        return Optional.ofNullable(this.nodeStartupTimeoutSeconds);
    }
    /**
     * @return Machine pool paused? (bool)
     * 
     */
    public Optional<Boolean> paused() {
        return Optional.ofNullable(this.paused);
    }
    /**
     * @return Machine pool quantity (int)
     * 
     */
    public Optional<Integer> quantity() {
        return Optional.ofNullable(this.quantity);
    }
    /**
     * @return Machine pool rolling update (List maxitems:1)
     * 
     */
    public Optional<ClusterV2RkeConfigMachinePoolRollingUpdate> rollingUpdate() {
        return Optional.ofNullable(this.rollingUpdate);
    }
    /**
     * @return Machine pool taints (list)
     * 
     */
    public List<ClusterV2RkeConfigMachinePoolTaint> taints() {
        return this.taints == null ? List.of() : this.taints;
    }
    /**
     * @return Seconds an unhealthy node has to become active before it is replaced (int)
     * 
     */
    public Optional<Integer> unhealthyNodeTimeoutSeconds() {
        return Optional.ofNullable(this.unhealthyNodeTimeoutSeconds);
    }
    /**
     * @return Range of unhealthy nodes for automated replacement to be allowed (string)
     * 
     */
    public Optional<String> unhealthyRange() {
        return Optional.ofNullable(this.unhealthyRange);
    }
    /**
     * @return Machine pool worker role? (bool)
     * 
     */
    public Optional<Boolean> workerRole() {
        return Optional.ofNullable(this.workerRole);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterV2RkeConfigMachinePool defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,Object> annotations;
        private String cloudCredentialSecretName;
        private @Nullable Boolean controlPlaneRole;
        private @Nullable Boolean drainBeforeDelete;
        private @Nullable Boolean etcdRole;
        private @Nullable Map<String,Object> labels;
        private ClusterV2RkeConfigMachinePoolMachineConfig machineConfig;
        private @Nullable String maxUnhealthy;
        private String name;
        private @Nullable Integer nodeDrainTimeout;
        private @Nullable Integer nodeStartupTimeoutSeconds;
        private @Nullable Boolean paused;
        private @Nullable Integer quantity;
        private @Nullable ClusterV2RkeConfigMachinePoolRollingUpdate rollingUpdate;
        private @Nullable List<ClusterV2RkeConfigMachinePoolTaint> taints;
        private @Nullable Integer unhealthyNodeTimeoutSeconds;
        private @Nullable String unhealthyRange;
        private @Nullable Boolean workerRole;
        public Builder() {}
        public Builder(ClusterV2RkeConfigMachinePool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.cloudCredentialSecretName = defaults.cloudCredentialSecretName;
    	      this.controlPlaneRole = defaults.controlPlaneRole;
    	      this.drainBeforeDelete = defaults.drainBeforeDelete;
    	      this.etcdRole = defaults.etcdRole;
    	      this.labels = defaults.labels;
    	      this.machineConfig = defaults.machineConfig;
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
        public Builder annotations(@Nullable Map<String,Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        @CustomType.Setter
        public Builder cloudCredentialSecretName(String cloudCredentialSecretName) {
            this.cloudCredentialSecretName = Objects.requireNonNull(cloudCredentialSecretName);
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
        public Builder labels(@Nullable Map<String,Object> labels) {
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder machineConfig(ClusterV2RkeConfigMachinePoolMachineConfig machineConfig) {
            this.machineConfig = Objects.requireNonNull(machineConfig);
            return this;
        }
        @CustomType.Setter
        public Builder maxUnhealthy(@Nullable String maxUnhealthy) {
            this.maxUnhealthy = maxUnhealthy;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
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
        public Builder rollingUpdate(@Nullable ClusterV2RkeConfigMachinePoolRollingUpdate rollingUpdate) {
            this.rollingUpdate = rollingUpdate;
            return this;
        }
        @CustomType.Setter
        public Builder taints(@Nullable List<ClusterV2RkeConfigMachinePoolTaint> taints) {
            this.taints = taints;
            return this;
        }
        public Builder taints(ClusterV2RkeConfigMachinePoolTaint... taints) {
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
        public ClusterV2RkeConfigMachinePool build() {
            final var o = new ClusterV2RkeConfigMachinePool();
            o.annotations = annotations;
            o.cloudCredentialSecretName = cloudCredentialSecretName;
            o.controlPlaneRole = controlPlaneRole;
            o.drainBeforeDelete = drainBeforeDelete;
            o.etcdRole = etcdRole;
            o.labels = labels;
            o.machineConfig = machineConfig;
            o.maxUnhealthy = maxUnhealthy;
            o.name = name;
            o.nodeDrainTimeout = nodeDrainTimeout;
            o.nodeStartupTimeoutSeconds = nodeStartupTimeoutSeconds;
            o.paused = paused;
            o.quantity = quantity;
            o.rollingUpdate = rollingUpdate;
            o.taints = taints;
            o.unhealthyNodeTimeoutSeconds = unhealthyNodeTimeoutSeconds;
            o.unhealthyRange = unhealthyRange;
            o.workerRole = workerRole;
            return o;
        }
    }
}
