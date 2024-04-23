// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
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
    private @Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderDisk disk;
    private @Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderGlobal global;
    private @Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderNetwork network;
    private List<ClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenter> virtualCenters;
    private ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspace workspace;

    private ClusterRkeConfigCloudProviderVsphereCloudProvider() {}
    public Optional<ClusterRkeConfigCloudProviderVsphereCloudProviderDisk> disk() {
        return Optional.ofNullable(this.disk);
    }
    public Optional<ClusterRkeConfigCloudProviderVsphereCloudProviderGlobal> global() {
        return Optional.ofNullable(this.global);
    }
    public Optional<ClusterRkeConfigCloudProviderVsphereCloudProviderNetwork> network() {
        return Optional.ofNullable(this.network);
    }
    public List<ClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenter> virtualCenters() {
        return this.virtualCenters;
    }
    public ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspace workspace() {
        return this.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigCloudProviderVsphereCloudProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderDisk disk;
        private @Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderGlobal global;
        private @Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderNetwork network;
        private List<ClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenter> virtualCenters;
        private ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspace workspace;
        public Builder() {}
        public Builder(ClusterRkeConfigCloudProviderVsphereCloudProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disk = defaults.disk;
    	      this.global = defaults.global;
    	      this.network = defaults.network;
    	      this.virtualCenters = defaults.virtualCenters;
    	      this.workspace = defaults.workspace;
        }

        @CustomType.Setter
        public Builder disk(@Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderDisk disk) {

            this.disk = disk;
            return this;
        }
        @CustomType.Setter
        public Builder global(@Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderGlobal global) {

            this.global = global;
            return this;
        }
        @CustomType.Setter
        public Builder network(@Nullable ClusterRkeConfigCloudProviderVsphereCloudProviderNetwork network) {

            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder virtualCenters(List<ClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenter> virtualCenters) {
            if (virtualCenters == null) {
              throw new MissingRequiredPropertyException("ClusterRkeConfigCloudProviderVsphereCloudProvider", "virtualCenters");
            }
            this.virtualCenters = virtualCenters;
            return this;
        }
        public Builder virtualCenters(ClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenter... virtualCenters) {
            return virtualCenters(List.of(virtualCenters));
        }
        @CustomType.Setter
        public Builder workspace(ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspace workspace) {
            if (workspace == null) {
              throw new MissingRequiredPropertyException("ClusterRkeConfigCloudProviderVsphereCloudProvider", "workspace");
            }
            this.workspace = workspace;
            return this;
        }
        public ClusterRkeConfigCloudProviderVsphereCloudProvider build() {
            final var _resultValue = new ClusterRkeConfigCloudProviderVsphereCloudProvider();
            _resultValue.disk = disk;
            _resultValue.global = global;
            _resultValue.network = network;
            _resultValue.virtualCenters = virtualCenters;
            _resultValue.workspace = workspace;
            return _resultValue;
        }
    }
}
