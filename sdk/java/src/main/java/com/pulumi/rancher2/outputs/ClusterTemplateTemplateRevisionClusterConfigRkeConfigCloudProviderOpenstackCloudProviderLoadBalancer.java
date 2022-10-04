// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer {
    private @Nullable Boolean createMonitor;
    private @Nullable String floatingNetworkId;
    private @Nullable String lbMethod;
    private @Nullable String lbProvider;
    private @Nullable String lbVersion;
    private @Nullable Boolean manageSecurityGroups;
    private @Nullable String monitorDelay;
    private @Nullable Integer monitorMaxRetries;
    private @Nullable String monitorTimeout;
    private @Nullable String subnetId;
    private @Nullable Boolean useOctavia;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer() {}
    public Optional<Boolean> createMonitor() {
        return Optional.ofNullable(this.createMonitor);
    }
    public Optional<String> floatingNetworkId() {
        return Optional.ofNullable(this.floatingNetworkId);
    }
    public Optional<String> lbMethod() {
        return Optional.ofNullable(this.lbMethod);
    }
    public Optional<String> lbProvider() {
        return Optional.ofNullable(this.lbProvider);
    }
    public Optional<String> lbVersion() {
        return Optional.ofNullable(this.lbVersion);
    }
    public Optional<Boolean> manageSecurityGroups() {
        return Optional.ofNullable(this.manageSecurityGroups);
    }
    public Optional<String> monitorDelay() {
        return Optional.ofNullable(this.monitorDelay);
    }
    public Optional<Integer> monitorMaxRetries() {
        return Optional.ofNullable(this.monitorMaxRetries);
    }
    public Optional<String> monitorTimeout() {
        return Optional.ofNullable(this.monitorTimeout);
    }
    public Optional<String> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    public Optional<Boolean> useOctavia() {
        return Optional.ofNullable(this.useOctavia);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean createMonitor;
        private @Nullable String floatingNetworkId;
        private @Nullable String lbMethod;
        private @Nullable String lbProvider;
        private @Nullable String lbVersion;
        private @Nullable Boolean manageSecurityGroups;
        private @Nullable String monitorDelay;
        private @Nullable Integer monitorMaxRetries;
        private @Nullable String monitorTimeout;
        private @Nullable String subnetId;
        private @Nullable Boolean useOctavia;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createMonitor = defaults.createMonitor;
    	      this.floatingNetworkId = defaults.floatingNetworkId;
    	      this.lbMethod = defaults.lbMethod;
    	      this.lbProvider = defaults.lbProvider;
    	      this.lbVersion = defaults.lbVersion;
    	      this.manageSecurityGroups = defaults.manageSecurityGroups;
    	      this.monitorDelay = defaults.monitorDelay;
    	      this.monitorMaxRetries = defaults.monitorMaxRetries;
    	      this.monitorTimeout = defaults.monitorTimeout;
    	      this.subnetId = defaults.subnetId;
    	      this.useOctavia = defaults.useOctavia;
        }

        @CustomType.Setter
        public Builder createMonitor(@Nullable Boolean createMonitor) {
            this.createMonitor = createMonitor;
            return this;
        }
        @CustomType.Setter
        public Builder floatingNetworkId(@Nullable String floatingNetworkId) {
            this.floatingNetworkId = floatingNetworkId;
            return this;
        }
        @CustomType.Setter
        public Builder lbMethod(@Nullable String lbMethod) {
            this.lbMethod = lbMethod;
            return this;
        }
        @CustomType.Setter
        public Builder lbProvider(@Nullable String lbProvider) {
            this.lbProvider = lbProvider;
            return this;
        }
        @CustomType.Setter
        public Builder lbVersion(@Nullable String lbVersion) {
            this.lbVersion = lbVersion;
            return this;
        }
        @CustomType.Setter
        public Builder manageSecurityGroups(@Nullable Boolean manageSecurityGroups) {
            this.manageSecurityGroups = manageSecurityGroups;
            return this;
        }
        @CustomType.Setter
        public Builder monitorDelay(@Nullable String monitorDelay) {
            this.monitorDelay = monitorDelay;
            return this;
        }
        @CustomType.Setter
        public Builder monitorMaxRetries(@Nullable Integer monitorMaxRetries) {
            this.monitorMaxRetries = monitorMaxRetries;
            return this;
        }
        @CustomType.Setter
        public Builder monitorTimeout(@Nullable String monitorTimeout) {
            this.monitorTimeout = monitorTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        @CustomType.Setter
        public Builder useOctavia(@Nullable Boolean useOctavia) {
            this.useOctavia = useOctavia;
            return this;
        }
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer build() {
            final var o = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderLoadBalancer();
            o.createMonitor = createMonitor;
            o.floatingNetworkId = floatingNetworkId;
            o.lbMethod = lbMethod;
            o.lbProvider = lbProvider;
            o.lbVersion = lbVersion;
            o.manageSecurityGroups = manageSecurityGroups;
            o.monitorDelay = monitorDelay;
            o.monitorMaxRetries = monitorMaxRetries;
            o.monitorTimeout = monitorTimeout;
            o.subnetId = subnetId;
            o.useOctavia = useOctavia;
            return o;
        }
    }
}
