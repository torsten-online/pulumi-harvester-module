// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetProjectResourceQuotaNamespaceDefaultLimit {
    private @Nullable String configMaps;
    private @Nullable String limitsCpu;
    private @Nullable String limitsMemory;
    private @Nullable String persistentVolumeClaims;
    private @Nullable String pods;
    private @Nullable String replicationControllers;
    private @Nullable String requestsCpu;
    private @Nullable String requestsMemory;
    private @Nullable String requestsStorage;
    private @Nullable String secrets;
    private @Nullable String services;
    private @Nullable String servicesLoadBalancers;
    private @Nullable String servicesNodePorts;

    private GetProjectResourceQuotaNamespaceDefaultLimit() {}
    public Optional<String> configMaps() {
        return Optional.ofNullable(this.configMaps);
    }
    public Optional<String> limitsCpu() {
        return Optional.ofNullable(this.limitsCpu);
    }
    public Optional<String> limitsMemory() {
        return Optional.ofNullable(this.limitsMemory);
    }
    public Optional<String> persistentVolumeClaims() {
        return Optional.ofNullable(this.persistentVolumeClaims);
    }
    public Optional<String> pods() {
        return Optional.ofNullable(this.pods);
    }
    public Optional<String> replicationControllers() {
        return Optional.ofNullable(this.replicationControllers);
    }
    public Optional<String> requestsCpu() {
        return Optional.ofNullable(this.requestsCpu);
    }
    public Optional<String> requestsMemory() {
        return Optional.ofNullable(this.requestsMemory);
    }
    public Optional<String> requestsStorage() {
        return Optional.ofNullable(this.requestsStorage);
    }
    public Optional<String> secrets() {
        return Optional.ofNullable(this.secrets);
    }
    public Optional<String> services() {
        return Optional.ofNullable(this.services);
    }
    public Optional<String> servicesLoadBalancers() {
        return Optional.ofNullable(this.servicesLoadBalancers);
    }
    public Optional<String> servicesNodePorts() {
        return Optional.ofNullable(this.servicesNodePorts);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectResourceQuotaNamespaceDefaultLimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String configMaps;
        private @Nullable String limitsCpu;
        private @Nullable String limitsMemory;
        private @Nullable String persistentVolumeClaims;
        private @Nullable String pods;
        private @Nullable String replicationControllers;
        private @Nullable String requestsCpu;
        private @Nullable String requestsMemory;
        private @Nullable String requestsStorage;
        private @Nullable String secrets;
        private @Nullable String services;
        private @Nullable String servicesLoadBalancers;
        private @Nullable String servicesNodePorts;
        public Builder() {}
        public Builder(GetProjectResourceQuotaNamespaceDefaultLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMaps = defaults.configMaps;
    	      this.limitsCpu = defaults.limitsCpu;
    	      this.limitsMemory = defaults.limitsMemory;
    	      this.persistentVolumeClaims = defaults.persistentVolumeClaims;
    	      this.pods = defaults.pods;
    	      this.replicationControllers = defaults.replicationControllers;
    	      this.requestsCpu = defaults.requestsCpu;
    	      this.requestsMemory = defaults.requestsMemory;
    	      this.requestsStorage = defaults.requestsStorage;
    	      this.secrets = defaults.secrets;
    	      this.services = defaults.services;
    	      this.servicesLoadBalancers = defaults.servicesLoadBalancers;
    	      this.servicesNodePorts = defaults.servicesNodePorts;
        }

        @CustomType.Setter
        public Builder configMaps(@Nullable String configMaps) {
            this.configMaps = configMaps;
            return this;
        }
        @CustomType.Setter
        public Builder limitsCpu(@Nullable String limitsCpu) {
            this.limitsCpu = limitsCpu;
            return this;
        }
        @CustomType.Setter
        public Builder limitsMemory(@Nullable String limitsMemory) {
            this.limitsMemory = limitsMemory;
            return this;
        }
        @CustomType.Setter
        public Builder persistentVolumeClaims(@Nullable String persistentVolumeClaims) {
            this.persistentVolumeClaims = persistentVolumeClaims;
            return this;
        }
        @CustomType.Setter
        public Builder pods(@Nullable String pods) {
            this.pods = pods;
            return this;
        }
        @CustomType.Setter
        public Builder replicationControllers(@Nullable String replicationControllers) {
            this.replicationControllers = replicationControllers;
            return this;
        }
        @CustomType.Setter
        public Builder requestsCpu(@Nullable String requestsCpu) {
            this.requestsCpu = requestsCpu;
            return this;
        }
        @CustomType.Setter
        public Builder requestsMemory(@Nullable String requestsMemory) {
            this.requestsMemory = requestsMemory;
            return this;
        }
        @CustomType.Setter
        public Builder requestsStorage(@Nullable String requestsStorage) {
            this.requestsStorage = requestsStorage;
            return this;
        }
        @CustomType.Setter
        public Builder secrets(@Nullable String secrets) {
            this.secrets = secrets;
            return this;
        }
        @CustomType.Setter
        public Builder services(@Nullable String services) {
            this.services = services;
            return this;
        }
        @CustomType.Setter
        public Builder servicesLoadBalancers(@Nullable String servicesLoadBalancers) {
            this.servicesLoadBalancers = servicesLoadBalancers;
            return this;
        }
        @CustomType.Setter
        public Builder servicesNodePorts(@Nullable String servicesNodePorts) {
            this.servicesNodePorts = servicesNodePorts;
            return this;
        }
        public GetProjectResourceQuotaNamespaceDefaultLimit build() {
            final var o = new GetProjectResourceQuotaNamespaceDefaultLimit();
            o.configMaps = configMaps;
            o.limitsCpu = limitsCpu;
            o.limitsMemory = limitsMemory;
            o.persistentVolumeClaims = persistentVolumeClaims;
            o.pods = pods;
            o.replicationControllers = replicationControllers;
            o.requestsCpu = requestsCpu;
            o.requestsMemory = requestsMemory;
            o.requestsStorage = requestsStorage;
            o.secrets = secrets;
            o.services = services;
            o.servicesLoadBalancers = servicesLoadBalancers;
            o.servicesNodePorts = servicesNodePorts;
            return o;
        }
    }
}
