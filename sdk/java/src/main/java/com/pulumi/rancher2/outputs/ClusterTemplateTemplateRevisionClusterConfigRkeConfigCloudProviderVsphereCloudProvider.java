// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderDisk;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderGlobal;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderNetwork;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderVirtualCenter;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderWorkspace;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider {
    private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderDisk disk;
    private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderGlobal global;
    private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderNetwork network;
    private List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderVirtualCenter> virtualCenters;
    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderWorkspace workspace;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider() {}
    public Optional<ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderDisk> disk() {
        return Optional.ofNullable(this.disk);
    }
    public Optional<ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderGlobal> global() {
        return Optional.ofNullable(this.global);
    }
    public Optional<ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderNetwork> network() {
        return Optional.ofNullable(this.network);
    }
    public List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderVirtualCenter> virtualCenters() {
        return this.virtualCenters;
    }
    public ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderWorkspace workspace() {
        return this.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderDisk disk;
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderGlobal global;
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderNetwork network;
        private List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderVirtualCenter> virtualCenters;
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderWorkspace workspace;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disk = defaults.disk;
    	      this.global = defaults.global;
    	      this.network = defaults.network;
    	      this.virtualCenters = defaults.virtualCenters;
    	      this.workspace = defaults.workspace;
        }

        @CustomType.Setter
        public Builder disk(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderDisk disk) {
            this.disk = disk;
            return this;
        }
        @CustomType.Setter
        public Builder global(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderGlobal global) {
            this.global = global;
            return this;
        }
        @CustomType.Setter
        public Builder network(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderNetwork network) {
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder virtualCenters(List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderVirtualCenter> virtualCenters) {
            this.virtualCenters = Objects.requireNonNull(virtualCenters);
            return this;
        }
        public Builder virtualCenters(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderVirtualCenter... virtualCenters) {
            return virtualCenters(List.of(virtualCenters));
        }
        @CustomType.Setter
        public Builder workspace(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderWorkspace workspace) {
            this.workspace = Objects.requireNonNull(workspace);
            return this;
        }
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider build() {
            final var o = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider();
            o.disk = disk;
            o.global = global;
            o.network = network;
            o.virtualCenters = virtualCenters;
            o.workspace = workspace;
            return o;
        }
    }
}
