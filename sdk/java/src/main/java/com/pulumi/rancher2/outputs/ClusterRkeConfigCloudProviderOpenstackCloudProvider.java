// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.outputs.ClusterRkeConfigCloudProviderOpenstackCloudProviderBlockStorage;
import com.pulumi.rancher2.outputs.ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobal;
import com.pulumi.rancher2.outputs.ClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer;
import com.pulumi.rancher2.outputs.ClusterRkeConfigCloudProviderOpenstackCloudProviderMetadata;
import com.pulumi.rancher2.outputs.ClusterRkeConfigCloudProviderOpenstackCloudProviderRoute;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigCloudProviderOpenstackCloudProvider {
    private @Nullable ClusterRkeConfigCloudProviderOpenstackCloudProviderBlockStorage blockStorage;
    private ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobal global;
    private @Nullable ClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer loadBalancer;
    private @Nullable ClusterRkeConfigCloudProviderOpenstackCloudProviderMetadata metadata;
    private @Nullable ClusterRkeConfigCloudProviderOpenstackCloudProviderRoute route;

    private ClusterRkeConfigCloudProviderOpenstackCloudProvider() {}
    public Optional<ClusterRkeConfigCloudProviderOpenstackCloudProviderBlockStorage> blockStorage() {
        return Optional.ofNullable(this.blockStorage);
    }
    public ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobal global() {
        return this.global;
    }
    public Optional<ClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer> loadBalancer() {
        return Optional.ofNullable(this.loadBalancer);
    }
    public Optional<ClusterRkeConfigCloudProviderOpenstackCloudProviderMetadata> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    public Optional<ClusterRkeConfigCloudProviderOpenstackCloudProviderRoute> route() {
        return Optional.ofNullable(this.route);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigCloudProviderOpenstackCloudProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterRkeConfigCloudProviderOpenstackCloudProviderBlockStorage blockStorage;
        private ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobal global;
        private @Nullable ClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer loadBalancer;
        private @Nullable ClusterRkeConfigCloudProviderOpenstackCloudProviderMetadata metadata;
        private @Nullable ClusterRkeConfigCloudProviderOpenstackCloudProviderRoute route;
        public Builder() {}
        public Builder(ClusterRkeConfigCloudProviderOpenstackCloudProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockStorage = defaults.blockStorage;
    	      this.global = defaults.global;
    	      this.loadBalancer = defaults.loadBalancer;
    	      this.metadata = defaults.metadata;
    	      this.route = defaults.route;
        }

        @CustomType.Setter
        public Builder blockStorage(@Nullable ClusterRkeConfigCloudProviderOpenstackCloudProviderBlockStorage blockStorage) {

            this.blockStorage = blockStorage;
            return this;
        }
        @CustomType.Setter
        public Builder global(ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobal global) {
            if (global == null) {
              throw new MissingRequiredPropertyException("ClusterRkeConfigCloudProviderOpenstackCloudProvider", "global");
            }
            this.global = global;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancer(@Nullable ClusterRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer loadBalancer) {

            this.loadBalancer = loadBalancer;
            return this;
        }
        @CustomType.Setter
        public Builder metadata(@Nullable ClusterRkeConfigCloudProviderOpenstackCloudProviderMetadata metadata) {

            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder route(@Nullable ClusterRkeConfigCloudProviderOpenstackCloudProviderRoute route) {

            this.route = route;
            return this;
        }
        public ClusterRkeConfigCloudProviderOpenstackCloudProvider build() {
            final var _resultValue = new ClusterRkeConfigCloudProviderOpenstackCloudProvider();
            _resultValue.blockStorage = blockStorage;
            _resultValue.global = global;
            _resultValue.loadBalancer = loadBalancer;
            _resultValue.metadata = metadata;
            _resultValue.route = route;
            return _resultValue;
        }
    }
}
