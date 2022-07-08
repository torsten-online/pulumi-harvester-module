// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterRkeConfigCloudProviderVsphereCloudProviderDisk;
import com.pulumi.rancher2.outputs.ClusterRkeConfigCloudProviderVsphereCloudProviderGlobal;
import com.pulumi.rancher2.outputs.ClusterRkeConfigCloudProviderVsphereCloudProviderNetwork;
import com.pulumi.rancher2.outputs.ClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenter;
import com.pulumi.rancher2.outputs.ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspace;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigCloudProviderVsphereCloudProvider {
    /**
     * @return (list maxitems:1)
     * 
     */
    private final @Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderDisk disk;
    /**
     * @return (list maxitems:1)
     * 
     */
    private final @Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderGlobal global;
    /**
     * @return The GKE cluster network. Required for create new cluster (string)
     * 
     */
    private final @Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderNetwork network;
    /**
     * @return (List)
     * 
     */
    private final List<ClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenter> virtualCenters;
    /**
     * @return (list maxitems:1)
     * 
     */
    private final ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspace workspace;

    @CustomType.Constructor
    private ClusterRkeConfigCloudProviderVsphereCloudProvider(
        @CustomType.Parameter("disk") @Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderDisk disk,
        @CustomType.Parameter("global") @Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderGlobal global,
        @CustomType.Parameter("network") @Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderNetwork network,
        @CustomType.Parameter("virtualCenters") List<ClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenter> virtualCenters,
        @CustomType.Parameter("workspace") ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspace workspace) {
        this.disk = disk;
        this.global = global;
        this.network = network;
        this.virtualCenters = virtualCenters;
        this.workspace = workspace;
    }

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<ClusterRkeConfigCloudProviderVsphereCloudProviderDisk> disk() {
        return Optional.ofNullable(this.disk);
    }
    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<ClusterRkeConfigCloudProviderVsphereCloudProviderGlobal> global() {
        return Optional.ofNullable(this.global);
    }
    /**
     * @return The GKE cluster network. Required for create new cluster (string)
     * 
     */
    public Optional<ClusterRkeConfigCloudProviderVsphereCloudProviderNetwork> network() {
        return Optional.ofNullable(this.network);
    }
    /**
     * @return (List)
     * 
     */
    public List<ClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenter> virtualCenters() {
        return this.virtualCenters;
    }
    /**
     * @return (list maxitems:1)
     * 
     */
    public ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspace workspace() {
        return this.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigCloudProviderVsphereCloudProvider defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderDisk disk;
        private @Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderGlobal global;
        private @Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderNetwork network;
        private List<ClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenter> virtualCenters;
        private ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspace workspace;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterRkeConfigCloudProviderVsphereCloudProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disk = defaults.disk;
    	      this.global = defaults.global;
    	      this.network = defaults.network;
    	      this.virtualCenters = defaults.virtualCenters;
    	      this.workspace = defaults.workspace;
        }

        public Builder disk(@Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderDisk disk) {
            this.disk = disk;
            return this;
        }
        public Builder global(@Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderGlobal global) {
            this.global = global;
            return this;
        }
        public Builder network(@Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderNetwork network) {
            this.network = network;
            return this;
        }
        public Builder virtualCenters(List<ClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenter> virtualCenters) {
            this.virtualCenters = Objects.requireNonNull(virtualCenters);
            return this;
        }
        public Builder virtualCenters(ClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenter... virtualCenters) {
            return virtualCenters(List.of(virtualCenters));
        }
        public Builder workspace(ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspace workspace) {
            this.workspace = Objects.requireNonNull(workspace);
            return this;
        }        public ClusterRkeConfigCloudProviderVsphereCloudProvider build() {
            return new ClusterRkeConfigCloudProviderVsphereCloudProvider(disk, global, network, virtualCenters, workspace);
        }
    }
}
