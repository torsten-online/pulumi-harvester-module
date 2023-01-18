// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigEtcd;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigEtcdSnapshotCreate;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigEtcdSnapshotRestore;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigLocalAuthEndpoint;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigMachinePool;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigMachineSelectorConfig;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigRegistries;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigRotateCertificates;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigUpgradeStrategy;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterV2RkeConfig {
    /**
     * @return Cluster V2 additional manifest (string)
     * 
     */
    private @Nullable String additionalManifest;
    /**
     * @return Cluster V2 chart values. Must be in YAML format (string)
     * 
     */
    private @Nullable String chartValues;
    /**
     * @return Cluster V2 etcd (list maxitems:1)
     * 
     */
    private @Nullable ClusterV2RkeConfigEtcd etcd;
    /**
     * @return Cluster V2 etcd snapshot create (list maxitems:1)
     * 
     */
    private @Nullable ClusterV2RkeConfigEtcdSnapshotCreate etcdSnapshotCreate;
    /**
     * @return Cluster V2 etcd snapshot restore (list maxitems:1)
     * 
     */
    private @Nullable ClusterV2RkeConfigEtcdSnapshotRestore etcdSnapshotRestore;
    /**
     * @return Cluster V2 local auth endpoint (list maxitems:1)
     * 
     * @deprecated
     * Use rancher2_cluster_v2.local_auth_endpoint instead
     * 
     */
    @Deprecated /* Use rancher2_cluster_v2.local_auth_endpoint instead */
    private @Nullable ClusterV2RkeConfigLocalAuthEndpoint localAuthEndpoint;
    /**
     * @return Cluster V2 machine global config. Must be in YAML format (string)
     * 
     */
    private @Nullable String machineGlobalConfig;
    /**
     * @return Cluster V2 machine pools (list)
     * 
     */
    private @Nullable List<ClusterV2RkeConfigMachinePool> machinePools;
    /**
     * @return Cluster V2 machine selector config (list)
     * 
     */
    private @Nullable List<ClusterV2RkeConfigMachineSelectorConfig> machineSelectorConfigs;
    /**
     * @return Cluster V2 docker registries (list maxitems:1)
     * 
     */
    private @Nullable ClusterV2RkeConfigRegistries registries;
    /**
     * @return Cluster V2 certificate rotation (list maxitems:1)
     * 
     */
    private @Nullable ClusterV2RkeConfigRotateCertificates rotateCertificates;
    /**
     * @return Cluster V2 upgrade strategy (list maxitems:1)
     * 
     */
    private @Nullable ClusterV2RkeConfigUpgradeStrategy upgradeStrategy;

    private ClusterV2RkeConfig() {}
    /**
     * @return Cluster V2 additional manifest (string)
     * 
     */
    public Optional<String> additionalManifest() {
        return Optional.ofNullable(this.additionalManifest);
    }
    /**
     * @return Cluster V2 chart values. Must be in YAML format (string)
     * 
     */
    public Optional<String> chartValues() {
        return Optional.ofNullable(this.chartValues);
    }
    /**
     * @return Cluster V2 etcd (list maxitems:1)
     * 
     */
    public Optional<ClusterV2RkeConfigEtcd> etcd() {
        return Optional.ofNullable(this.etcd);
    }
    /**
     * @return Cluster V2 etcd snapshot create (list maxitems:1)
     * 
     */
    public Optional<ClusterV2RkeConfigEtcdSnapshotCreate> etcdSnapshotCreate() {
        return Optional.ofNullable(this.etcdSnapshotCreate);
    }
    /**
     * @return Cluster V2 etcd snapshot restore (list maxitems:1)
     * 
     */
    public Optional<ClusterV2RkeConfigEtcdSnapshotRestore> etcdSnapshotRestore() {
        return Optional.ofNullable(this.etcdSnapshotRestore);
    }
    /**
     * @return Cluster V2 local auth endpoint (list maxitems:1)
     * 
     * @deprecated
     * Use rancher2_cluster_v2.local_auth_endpoint instead
     * 
     */
    @Deprecated /* Use rancher2_cluster_v2.local_auth_endpoint instead */
    public Optional<ClusterV2RkeConfigLocalAuthEndpoint> localAuthEndpoint() {
        return Optional.ofNullable(this.localAuthEndpoint);
    }
    /**
     * @return Cluster V2 machine global config. Must be in YAML format (string)
     * 
     */
    public Optional<String> machineGlobalConfig() {
        return Optional.ofNullable(this.machineGlobalConfig);
    }
    /**
     * @return Cluster V2 machine pools (list)
     * 
     */
    public List<ClusterV2RkeConfigMachinePool> machinePools() {
        return this.machinePools == null ? List.of() : this.machinePools;
    }
    /**
     * @return Cluster V2 machine selector config (list)
     * 
     */
    public List<ClusterV2RkeConfigMachineSelectorConfig> machineSelectorConfigs() {
        return this.machineSelectorConfigs == null ? List.of() : this.machineSelectorConfigs;
    }
    /**
     * @return Cluster V2 docker registries (list maxitems:1)
     * 
     */
    public Optional<ClusterV2RkeConfigRegistries> registries() {
        return Optional.ofNullable(this.registries);
    }
    /**
     * @return Cluster V2 certificate rotation (list maxitems:1)
     * 
     */
    public Optional<ClusterV2RkeConfigRotateCertificates> rotateCertificates() {
        return Optional.ofNullable(this.rotateCertificates);
    }
    /**
     * @return Cluster V2 upgrade strategy (list maxitems:1)
     * 
     */
    public Optional<ClusterV2RkeConfigUpgradeStrategy> upgradeStrategy() {
        return Optional.ofNullable(this.upgradeStrategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterV2RkeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String additionalManifest;
        private @Nullable String chartValues;
        private @Nullable ClusterV2RkeConfigEtcd etcd;
        private @Nullable ClusterV2RkeConfigEtcdSnapshotCreate etcdSnapshotCreate;
        private @Nullable ClusterV2RkeConfigEtcdSnapshotRestore etcdSnapshotRestore;
        private @Nullable ClusterV2RkeConfigLocalAuthEndpoint localAuthEndpoint;
        private @Nullable String machineGlobalConfig;
        private @Nullable List<ClusterV2RkeConfigMachinePool> machinePools;
        private @Nullable List<ClusterV2RkeConfigMachineSelectorConfig> machineSelectorConfigs;
        private @Nullable ClusterV2RkeConfigRegistries registries;
        private @Nullable ClusterV2RkeConfigRotateCertificates rotateCertificates;
        private @Nullable ClusterV2RkeConfigUpgradeStrategy upgradeStrategy;
        public Builder() {}
        public Builder(ClusterV2RkeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalManifest = defaults.additionalManifest;
    	      this.chartValues = defaults.chartValues;
    	      this.etcd = defaults.etcd;
    	      this.etcdSnapshotCreate = defaults.etcdSnapshotCreate;
    	      this.etcdSnapshotRestore = defaults.etcdSnapshotRestore;
    	      this.localAuthEndpoint = defaults.localAuthEndpoint;
    	      this.machineGlobalConfig = defaults.machineGlobalConfig;
    	      this.machinePools = defaults.machinePools;
    	      this.machineSelectorConfigs = defaults.machineSelectorConfigs;
    	      this.registries = defaults.registries;
    	      this.rotateCertificates = defaults.rotateCertificates;
    	      this.upgradeStrategy = defaults.upgradeStrategy;
        }

        @CustomType.Setter
        public Builder additionalManifest(@Nullable String additionalManifest) {
            this.additionalManifest = additionalManifest;
            return this;
        }
        @CustomType.Setter
        public Builder chartValues(@Nullable String chartValues) {
            this.chartValues = chartValues;
            return this;
        }
        @CustomType.Setter
        public Builder etcd(@Nullable ClusterV2RkeConfigEtcd etcd) {
            this.etcd = etcd;
            return this;
        }
        @CustomType.Setter
        public Builder etcdSnapshotCreate(@Nullable ClusterV2RkeConfigEtcdSnapshotCreate etcdSnapshotCreate) {
            this.etcdSnapshotCreate = etcdSnapshotCreate;
            return this;
        }
        @CustomType.Setter
        public Builder etcdSnapshotRestore(@Nullable ClusterV2RkeConfigEtcdSnapshotRestore etcdSnapshotRestore) {
            this.etcdSnapshotRestore = etcdSnapshotRestore;
            return this;
        }
        @CustomType.Setter
        public Builder localAuthEndpoint(@Nullable ClusterV2RkeConfigLocalAuthEndpoint localAuthEndpoint) {
            this.localAuthEndpoint = localAuthEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder machineGlobalConfig(@Nullable String machineGlobalConfig) {
            this.machineGlobalConfig = machineGlobalConfig;
            return this;
        }
        @CustomType.Setter
        public Builder machinePools(@Nullable List<ClusterV2RkeConfigMachinePool> machinePools) {
            this.machinePools = machinePools;
            return this;
        }
        public Builder machinePools(ClusterV2RkeConfigMachinePool... machinePools) {
            return machinePools(List.of(machinePools));
        }
        @CustomType.Setter
        public Builder machineSelectorConfigs(@Nullable List<ClusterV2RkeConfigMachineSelectorConfig> machineSelectorConfigs) {
            this.machineSelectorConfigs = machineSelectorConfigs;
            return this;
        }
        public Builder machineSelectorConfigs(ClusterV2RkeConfigMachineSelectorConfig... machineSelectorConfigs) {
            return machineSelectorConfigs(List.of(machineSelectorConfigs));
        }
        @CustomType.Setter
        public Builder registries(@Nullable ClusterV2RkeConfigRegistries registries) {
            this.registries = registries;
            return this;
        }
        @CustomType.Setter
        public Builder rotateCertificates(@Nullable ClusterV2RkeConfigRotateCertificates rotateCertificates) {
            this.rotateCertificates = rotateCertificates;
            return this;
        }
        @CustomType.Setter
        public Builder upgradeStrategy(@Nullable ClusterV2RkeConfigUpgradeStrategy upgradeStrategy) {
            this.upgradeStrategy = upgradeStrategy;
            return this;
        }
        public ClusterV2RkeConfig build() {
            final var o = new ClusterV2RkeConfig();
            o.additionalManifest = additionalManifest;
            o.chartValues = chartValues;
            o.etcd = etcd;
            o.etcdSnapshotCreate = etcdSnapshotCreate;
            o.etcdSnapshotRestore = etcdSnapshotRestore;
            o.localAuthEndpoint = localAuthEndpoint;
            o.machineGlobalConfig = machineGlobalConfig;
            o.machinePools = machinePools;
            o.machineSelectorConfigs = machineSelectorConfigs;
            o.registries = registries;
            o.rotateCertificates = rotateCertificates;
            o.upgradeStrategy = upgradeStrategy;
            return o;
        }
    }
}
