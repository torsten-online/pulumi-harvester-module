// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigEtcd;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigEtcdSnapshotCreate;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigEtcdSnapshotRestore;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigLocalAuthEndpoint;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigMachinePool;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigMachineSelectorConfig;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigRegistries;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigRotateCertificates;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigUpgradeStrategy;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterV2RkeConfig {
    private @Nullable String additionalManifest;
    private @Nullable String chartValues;
    private GetClusterV2RkeConfigEtcd etcd;
    private @Nullable GetClusterV2RkeConfigEtcdSnapshotCreate etcdSnapshotCreate;
    private @Nullable GetClusterV2RkeConfigEtcdSnapshotRestore etcdSnapshotRestore;
    /**
     * @deprecated
     * Use rancher2_cluster_v2.local_auth_endpoint instead
     * 
     */
    @Deprecated /* Use rancher2_cluster_v2.local_auth_endpoint instead */
    private @Nullable GetClusterV2RkeConfigLocalAuthEndpoint localAuthEndpoint;
    private @Nullable String machineGlobalConfig;
    private List<GetClusterV2RkeConfigMachinePool> machinePools;
    private List<GetClusterV2RkeConfigMachineSelectorConfig> machineSelectorConfigs;
    private @Nullable GetClusterV2RkeConfigRegistries registries;
    private @Nullable GetClusterV2RkeConfigRotateCertificates rotateCertificates;
    private @Nullable GetClusterV2RkeConfigUpgradeStrategy upgradeStrategy;

    private GetClusterV2RkeConfig() {}
    public Optional<String> additionalManifest() {
        return Optional.ofNullable(this.additionalManifest);
    }
    public Optional<String> chartValues() {
        return Optional.ofNullable(this.chartValues);
    }
    public GetClusterV2RkeConfigEtcd etcd() {
        return this.etcd;
    }
    public Optional<GetClusterV2RkeConfigEtcdSnapshotCreate> etcdSnapshotCreate() {
        return Optional.ofNullable(this.etcdSnapshotCreate);
    }
    public Optional<GetClusterV2RkeConfigEtcdSnapshotRestore> etcdSnapshotRestore() {
        return Optional.ofNullable(this.etcdSnapshotRestore);
    }
    /**
     * @deprecated
     * Use rancher2_cluster_v2.local_auth_endpoint instead
     * 
     */
    @Deprecated /* Use rancher2_cluster_v2.local_auth_endpoint instead */
    public Optional<GetClusterV2RkeConfigLocalAuthEndpoint> localAuthEndpoint() {
        return Optional.ofNullable(this.localAuthEndpoint);
    }
    public Optional<String> machineGlobalConfig() {
        return Optional.ofNullable(this.machineGlobalConfig);
    }
    public List<GetClusterV2RkeConfigMachinePool> machinePools() {
        return this.machinePools;
    }
    public List<GetClusterV2RkeConfigMachineSelectorConfig> machineSelectorConfigs() {
        return this.machineSelectorConfigs;
    }
    public Optional<GetClusterV2RkeConfigRegistries> registries() {
        return Optional.ofNullable(this.registries);
    }
    public Optional<GetClusterV2RkeConfigRotateCertificates> rotateCertificates() {
        return Optional.ofNullable(this.rotateCertificates);
    }
    public Optional<GetClusterV2RkeConfigUpgradeStrategy> upgradeStrategy() {
        return Optional.ofNullable(this.upgradeStrategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterV2RkeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String additionalManifest;
        private @Nullable String chartValues;
        private GetClusterV2RkeConfigEtcd etcd;
        private @Nullable GetClusterV2RkeConfigEtcdSnapshotCreate etcdSnapshotCreate;
        private @Nullable GetClusterV2RkeConfigEtcdSnapshotRestore etcdSnapshotRestore;
        private @Nullable GetClusterV2RkeConfigLocalAuthEndpoint localAuthEndpoint;
        private @Nullable String machineGlobalConfig;
        private List<GetClusterV2RkeConfigMachinePool> machinePools;
        private List<GetClusterV2RkeConfigMachineSelectorConfig> machineSelectorConfigs;
        private @Nullable GetClusterV2RkeConfigRegistries registries;
        private @Nullable GetClusterV2RkeConfigRotateCertificates rotateCertificates;
        private @Nullable GetClusterV2RkeConfigUpgradeStrategy upgradeStrategy;
        public Builder() {}
        public Builder(GetClusterV2RkeConfig defaults) {
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
        public Builder etcd(GetClusterV2RkeConfigEtcd etcd) {
            this.etcd = Objects.requireNonNull(etcd);
            return this;
        }
        @CustomType.Setter
        public Builder etcdSnapshotCreate(@Nullable GetClusterV2RkeConfigEtcdSnapshotCreate etcdSnapshotCreate) {
            this.etcdSnapshotCreate = etcdSnapshotCreate;
            return this;
        }
        @CustomType.Setter
        public Builder etcdSnapshotRestore(@Nullable GetClusterV2RkeConfigEtcdSnapshotRestore etcdSnapshotRestore) {
            this.etcdSnapshotRestore = etcdSnapshotRestore;
            return this;
        }
        @CustomType.Setter
        public Builder localAuthEndpoint(@Nullable GetClusterV2RkeConfigLocalAuthEndpoint localAuthEndpoint) {
            this.localAuthEndpoint = localAuthEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder machineGlobalConfig(@Nullable String machineGlobalConfig) {
            this.machineGlobalConfig = machineGlobalConfig;
            return this;
        }
        @CustomType.Setter
        public Builder machinePools(List<GetClusterV2RkeConfigMachinePool> machinePools) {
            this.machinePools = Objects.requireNonNull(machinePools);
            return this;
        }
        public Builder machinePools(GetClusterV2RkeConfigMachinePool... machinePools) {
            return machinePools(List.of(machinePools));
        }
        @CustomType.Setter
        public Builder machineSelectorConfigs(List<GetClusterV2RkeConfigMachineSelectorConfig> machineSelectorConfigs) {
            this.machineSelectorConfigs = Objects.requireNonNull(machineSelectorConfigs);
            return this;
        }
        public Builder machineSelectorConfigs(GetClusterV2RkeConfigMachineSelectorConfig... machineSelectorConfigs) {
            return machineSelectorConfigs(List.of(machineSelectorConfigs));
        }
        @CustomType.Setter
        public Builder registries(@Nullable GetClusterV2RkeConfigRegistries registries) {
            this.registries = registries;
            return this;
        }
        @CustomType.Setter
        public Builder rotateCertificates(@Nullable GetClusterV2RkeConfigRotateCertificates rotateCertificates) {
            this.rotateCertificates = rotateCertificates;
            return this;
        }
        @CustomType.Setter
        public Builder upgradeStrategy(@Nullable GetClusterV2RkeConfigUpgradeStrategy upgradeStrategy) {
            this.upgradeStrategy = upgradeStrategy;
            return this;
        }
        public GetClusterV2RkeConfig build() {
            final var o = new GetClusterV2RkeConfig();
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
