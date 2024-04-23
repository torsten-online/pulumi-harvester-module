// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigEtcd;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigEtcdSnapshotCreate;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigEtcdSnapshotRestore;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigLocalAuthEndpoint;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigMachinePool;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigMachinePoolDefault;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigMachineSelectorConfig;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigMachineSelectorFile;
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
     * @return Cluster V2 additional manifest
     * 
     */
    private @Nullable String additionalManifest;
    /**
     * @return Cluster V2 chart values. It should be in YAML format
     * 
     */
    private @Nullable String chartValues;
    /**
     * @return Cluster V2 etcd
     * 
     */
    private @Nullable ClusterV2RkeConfigEtcd etcd;
    /**
     * @return Cluster V2 etcd snapshot create
     * 
     */
    private @Nullable ClusterV2RkeConfigEtcdSnapshotCreate etcdSnapshotCreate;
    /**
     * @return Cluster V2 etcd snapshot restore
     * 
     */
    private @Nullable ClusterV2RkeConfigEtcdSnapshotRestore etcdSnapshotRestore;
    /**
     * @return Local auth endpoint configures the Authorized Cluster Endpoint (ACE) which can be used to directly access the Kubernetes API server, without requiring communication through Rancher. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/kubernetes-clusters-in-rancher-setup/register-existing-clusters#authorized-cluster-endpoint-support-for-rke2-and-k3s-clusters).
     * 
     * @deprecated
     * Use rancher2_cluster_v2.local_auth_endpoint instead
     * 
     */
    @Deprecated /* Use rancher2_cluster_v2.local_auth_endpoint instead */
    private @Nullable ClusterV2RkeConfigLocalAuthEndpoint localAuthEndpoint;
    /**
     * @return Cluster V2 machine global config
     * 
     */
    private @Nullable String machineGlobalConfig;
    /**
     * @return Default values for machine pool configurations if unset
     * 
     */
    private @Nullable List<ClusterV2RkeConfigMachinePoolDefault> machinePoolDefaults;
    /**
     * @return Cluster V2 machine pools
     * 
     */
    private @Nullable List<ClusterV2RkeConfigMachinePool> machinePools;
    /**
     * @return Cluster V2 machine selector config
     * 
     */
    private @Nullable List<ClusterV2RkeConfigMachineSelectorConfig> machineSelectorConfigs;
    /**
     * @return Cluster V2 machine selector files
     * 
     */
    private @Nullable List<ClusterV2RkeConfigMachineSelectorFile> machineSelectorFiles;
    /**
     * @return Cluster V2 registries
     * 
     */
    private @Nullable ClusterV2RkeConfigRegistries registries;
    /**
     * @return Cluster V2 certificate rotation
     * 
     */
    private @Nullable ClusterV2RkeConfigRotateCertificates rotateCertificates;
    /**
     * @return Cluster V2 upgrade strategy
     * 
     */
    private @Nullable ClusterV2RkeConfigUpgradeStrategy upgradeStrategy;

    private ClusterV2RkeConfig() {}
    /**
     * @return Cluster V2 additional manifest
     * 
     */
    public Optional<String> additionalManifest() {
        return Optional.ofNullable(this.additionalManifest);
    }
    /**
     * @return Cluster V2 chart values. It should be in YAML format
     * 
     */
    public Optional<String> chartValues() {
        return Optional.ofNullable(this.chartValues);
    }
    /**
     * @return Cluster V2 etcd
     * 
     */
    public Optional<ClusterV2RkeConfigEtcd> etcd() {
        return Optional.ofNullable(this.etcd);
    }
    /**
     * @return Cluster V2 etcd snapshot create
     * 
     */
    public Optional<ClusterV2RkeConfigEtcdSnapshotCreate> etcdSnapshotCreate() {
        return Optional.ofNullable(this.etcdSnapshotCreate);
    }
    /**
     * @return Cluster V2 etcd snapshot restore
     * 
     */
    public Optional<ClusterV2RkeConfigEtcdSnapshotRestore> etcdSnapshotRestore() {
        return Optional.ofNullable(this.etcdSnapshotRestore);
    }
    /**
     * @return Local auth endpoint configures the Authorized Cluster Endpoint (ACE) which can be used to directly access the Kubernetes API server, without requiring communication through Rancher. For more information, please refer to [Rancher Documentation](https://ranchermanager.docs.rancher.com/how-to-guides/new-user-guides/kubernetes-clusters-in-rancher-setup/register-existing-clusters#authorized-cluster-endpoint-support-for-rke2-and-k3s-clusters).
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
     * @return Cluster V2 machine global config
     * 
     */
    public Optional<String> machineGlobalConfig() {
        return Optional.ofNullable(this.machineGlobalConfig);
    }
    /**
     * @return Default values for machine pool configurations if unset
     * 
     */
    public List<ClusterV2RkeConfigMachinePoolDefault> machinePoolDefaults() {
        return this.machinePoolDefaults == null ? List.of() : this.machinePoolDefaults;
    }
    /**
     * @return Cluster V2 machine pools
     * 
     */
    public List<ClusterV2RkeConfigMachinePool> machinePools() {
        return this.machinePools == null ? List.of() : this.machinePools;
    }
    /**
     * @return Cluster V2 machine selector config
     * 
     */
    public List<ClusterV2RkeConfigMachineSelectorConfig> machineSelectorConfigs() {
        return this.machineSelectorConfigs == null ? List.of() : this.machineSelectorConfigs;
    }
    /**
     * @return Cluster V2 machine selector files
     * 
     */
    public List<ClusterV2RkeConfigMachineSelectorFile> machineSelectorFiles() {
        return this.machineSelectorFiles == null ? List.of() : this.machineSelectorFiles;
    }
    /**
     * @return Cluster V2 registries
     * 
     */
    public Optional<ClusterV2RkeConfigRegistries> registries() {
        return Optional.ofNullable(this.registries);
    }
    /**
     * @return Cluster V2 certificate rotation
     * 
     */
    public Optional<ClusterV2RkeConfigRotateCertificates> rotateCertificates() {
        return Optional.ofNullable(this.rotateCertificates);
    }
    /**
     * @return Cluster V2 upgrade strategy
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
        private @Nullable List<ClusterV2RkeConfigMachinePoolDefault> machinePoolDefaults;
        private @Nullable List<ClusterV2RkeConfigMachinePool> machinePools;
        private @Nullable List<ClusterV2RkeConfigMachineSelectorConfig> machineSelectorConfigs;
        private @Nullable List<ClusterV2RkeConfigMachineSelectorFile> machineSelectorFiles;
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
    	      this.machinePoolDefaults = defaults.machinePoolDefaults;
    	      this.machinePools = defaults.machinePools;
    	      this.machineSelectorConfigs = defaults.machineSelectorConfigs;
    	      this.machineSelectorFiles = defaults.machineSelectorFiles;
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
        public Builder machinePoolDefaults(@Nullable List<ClusterV2RkeConfigMachinePoolDefault> machinePoolDefaults) {

            this.machinePoolDefaults = machinePoolDefaults;
            return this;
        }
        public Builder machinePoolDefaults(ClusterV2RkeConfigMachinePoolDefault... machinePoolDefaults) {
            return machinePoolDefaults(List.of(machinePoolDefaults));
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
        public Builder machineSelectorFiles(@Nullable List<ClusterV2RkeConfigMachineSelectorFile> machineSelectorFiles) {

            this.machineSelectorFiles = machineSelectorFiles;
            return this;
        }
        public Builder machineSelectorFiles(ClusterV2RkeConfigMachineSelectorFile... machineSelectorFiles) {
            return machineSelectorFiles(List.of(machineSelectorFiles));
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
            final var _resultValue = new ClusterV2RkeConfig();
            _resultValue.additionalManifest = additionalManifest;
            _resultValue.chartValues = chartValues;
            _resultValue.etcd = etcd;
            _resultValue.etcdSnapshotCreate = etcdSnapshotCreate;
            _resultValue.etcdSnapshotRestore = etcdSnapshotRestore;
            _resultValue.localAuthEndpoint = localAuthEndpoint;
            _resultValue.machineGlobalConfig = machineGlobalConfig;
            _resultValue.machinePoolDefaults = machinePoolDefaults;
            _resultValue.machinePools = machinePools;
            _resultValue.machineSelectorConfigs = machineSelectorConfigs;
            _resultValue.machineSelectorFiles = machineSelectorFiles;
            _resultValue.registries = registries;
            _resultValue.rotateCertificates = rotateCertificates;
            _resultValue.upgradeStrategy = upgradeStrategy;
            return _resultValue;
        }
    }
}
