// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterRkeConfigAuthentication;
import com.pulumi.rancher2.outputs.ClusterRkeConfigAuthorization;
import com.pulumi.rancher2.outputs.ClusterRkeConfigBastionHost;
import com.pulumi.rancher2.outputs.ClusterRkeConfigCloudProvider;
import com.pulumi.rancher2.outputs.ClusterRkeConfigDns;
import com.pulumi.rancher2.outputs.ClusterRkeConfigIngress;
import com.pulumi.rancher2.outputs.ClusterRkeConfigMonitoring;
import com.pulumi.rancher2.outputs.ClusterRkeConfigNetwork;
import com.pulumi.rancher2.outputs.ClusterRkeConfigNode;
import com.pulumi.rancher2.outputs.ClusterRkeConfigPrivateRegistry;
import com.pulumi.rancher2.outputs.ClusterRkeConfigServices;
import com.pulumi.rancher2.outputs.ClusterRkeConfigUpgradeStrategy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfig {
    /**
     * @return Duration in seconds of addon job (int)
     * 
     */
    private @Nullable Integer addonJobTimeout;
    /**
     * @return Addons descripton to deploy on RKE cluster.
     * 
     */
    private @Nullable String addons;
    /**
     * @return Addons yaml manifests to deploy on RKE cluster (list)
     * 
     */
    private @Nullable List<String> addonsIncludes;
    /**
     * @return Kubernetes cluster authentication (list maxitems:1)
     * 
     */
    private @Nullable ClusterRkeConfigAuthentication authentication;
    /**
     * @return Kubernetes cluster authorization (list maxitems:1)
     * 
     */
    private @Nullable ClusterRkeConfigAuthorization authorization;
    /**
     * @return RKE bastion host (list maxitems:1)
     * 
     */
    private @Nullable ClusterRkeConfigBastionHost bastionHost;
    /**
     * @return RKE options for Calico network provider (string)
     * 
     */
    private @Nullable ClusterRkeConfigCloudProvider cloudProvider;
    /**
     * @return RKE dns add-on. For Rancher v2.2.x (list maxitems:1)
     * 
     */
    private @Nullable ClusterRkeConfigDns dns;
    /**
     * @return Enable/disable using cri-dockerd. Deafult: `false` [enable_cri_dockerd](https://rancher.com/docs/rke/latest/en/config-options/#cri-dockerd) (bool)
     * 
     */
    private @Nullable Boolean enableCriDockerd;
    /**
     * @return Ignore docker version. Default `true` (bool)
     * 
     */
    private @Nullable Boolean ignoreDockerVersion;
    /**
     * @return Kubernetes ingress configuration (list maxitems:1)
     * 
     */
    private @Nullable ClusterRkeConfigIngress ingress;
    /**
     * @return The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
     * 
     */
    private @Nullable String kubernetesVersion;
    /**
     * @return Is AKS cluster monitoring enabled? (bool)
     * 
     */
    private @Nullable ClusterRkeConfigMonitoring monitoring;
    /**
     * @return The GKE cluster network. Required for create new cluster (string)
     * 
     */
    private @Nullable ClusterRkeConfigNetwork network;
    /**
     * @return RKE cluster nodes (list)
     * 
     */
    private @Nullable List<ClusterRkeConfigNode> nodes;
    /**
     * @return Prefix to customize Kubernetes path (string)
     * 
     */
    private @Nullable String prefixPath;
    /**
     * @return private registries for docker images (list)
     * 
     */
    private @Nullable List<ClusterRkeConfigPrivateRegistry> privateRegistries;
    /**
     * @return Kubernetes cluster services (list maxitems:1)
     * 
     */
    private @Nullable ClusterRkeConfigServices services;
    /**
     * @return Use ssh agent auth. Default `false` (bool)
     * 
     */
    private @Nullable Boolean sshAgentAuth;
    /**
     * @return Cluster level SSH certificate path (string)
     * 
     */
    private @Nullable String sshCertPath;
    /**
     * @return Node SSH private key path (string)
     * 
     */
    private @Nullable String sshKeyPath;
    /**
     * @return K3S upgrade strategy (List maxitems: 1)
     * 
     */
    private @Nullable ClusterRkeConfigUpgradeStrategy upgradeStrategy;
    /**
     * @return Prefix to customize Kubernetes path for windows (string)
     * 
     */
    private @Nullable String winPrefixPath;

    private ClusterRkeConfig() {}
    /**
     * @return Duration in seconds of addon job (int)
     * 
     */
    public Optional<Integer> addonJobTimeout() {
        return Optional.ofNullable(this.addonJobTimeout);
    }
    /**
     * @return Addons descripton to deploy on RKE cluster.
     * 
     */
    public Optional<String> addons() {
        return Optional.ofNullable(this.addons);
    }
    /**
     * @return Addons yaml manifests to deploy on RKE cluster (list)
     * 
     */
    public List<String> addonsIncludes() {
        return this.addonsIncludes == null ? List.of() : this.addonsIncludes;
    }
    /**
     * @return Kubernetes cluster authentication (list maxitems:1)
     * 
     */
    public Optional<ClusterRkeConfigAuthentication> authentication() {
        return Optional.ofNullable(this.authentication);
    }
    /**
     * @return Kubernetes cluster authorization (list maxitems:1)
     * 
     */
    public Optional<ClusterRkeConfigAuthorization> authorization() {
        return Optional.ofNullable(this.authorization);
    }
    /**
     * @return RKE bastion host (list maxitems:1)
     * 
     */
    public Optional<ClusterRkeConfigBastionHost> bastionHost() {
        return Optional.ofNullable(this.bastionHost);
    }
    /**
     * @return RKE options for Calico network provider (string)
     * 
     */
    public Optional<ClusterRkeConfigCloudProvider> cloudProvider() {
        return Optional.ofNullable(this.cloudProvider);
    }
    /**
     * @return RKE dns add-on. For Rancher v2.2.x (list maxitems:1)
     * 
     */
    public Optional<ClusterRkeConfigDns> dns() {
        return Optional.ofNullable(this.dns);
    }
    /**
     * @return Enable/disable using cri-dockerd. Deafult: `false` [enable_cri_dockerd](https://rancher.com/docs/rke/latest/en/config-options/#cri-dockerd) (bool)
     * 
     */
    public Optional<Boolean> enableCriDockerd() {
        return Optional.ofNullable(this.enableCriDockerd);
    }
    /**
     * @return Ignore docker version. Default `true` (bool)
     * 
     */
    public Optional<Boolean> ignoreDockerVersion() {
        return Optional.ofNullable(this.ignoreDockerVersion);
    }
    /**
     * @return Kubernetes ingress configuration (list maxitems:1)
     * 
     */
    public Optional<ClusterRkeConfigIngress> ingress() {
        return Optional.ofNullable(this.ingress);
    }
    /**
     * @return The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
     * 
     */
    public Optional<String> kubernetesVersion() {
        return Optional.ofNullable(this.kubernetesVersion);
    }
    /**
     * @return Is AKS cluster monitoring enabled? (bool)
     * 
     */
    public Optional<ClusterRkeConfigMonitoring> monitoring() {
        return Optional.ofNullable(this.monitoring);
    }
    /**
     * @return The GKE cluster network. Required for create new cluster (string)
     * 
     */
    public Optional<ClusterRkeConfigNetwork> network() {
        return Optional.ofNullable(this.network);
    }
    /**
     * @return RKE cluster nodes (list)
     * 
     */
    public List<ClusterRkeConfigNode> nodes() {
        return this.nodes == null ? List.of() : this.nodes;
    }
    /**
     * @return Prefix to customize Kubernetes path (string)
     * 
     */
    public Optional<String> prefixPath() {
        return Optional.ofNullable(this.prefixPath);
    }
    /**
     * @return private registries for docker images (list)
     * 
     */
    public List<ClusterRkeConfigPrivateRegistry> privateRegistries() {
        return this.privateRegistries == null ? List.of() : this.privateRegistries;
    }
    /**
     * @return Kubernetes cluster services (list maxitems:1)
     * 
     */
    public Optional<ClusterRkeConfigServices> services() {
        return Optional.ofNullable(this.services);
    }
    /**
     * @return Use ssh agent auth. Default `false` (bool)
     * 
     */
    public Optional<Boolean> sshAgentAuth() {
        return Optional.ofNullable(this.sshAgentAuth);
    }
    /**
     * @return Cluster level SSH certificate path (string)
     * 
     */
    public Optional<String> sshCertPath() {
        return Optional.ofNullable(this.sshCertPath);
    }
    /**
     * @return Node SSH private key path (string)
     * 
     */
    public Optional<String> sshKeyPath() {
        return Optional.ofNullable(this.sshKeyPath);
    }
    /**
     * @return K3S upgrade strategy (List maxitems: 1)
     * 
     */
    public Optional<ClusterRkeConfigUpgradeStrategy> upgradeStrategy() {
        return Optional.ofNullable(this.upgradeStrategy);
    }
    /**
     * @return Prefix to customize Kubernetes path for windows (string)
     * 
     */
    public Optional<String> winPrefixPath() {
        return Optional.ofNullable(this.winPrefixPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer addonJobTimeout;
        private @Nullable String addons;
        private @Nullable List<String> addonsIncludes;
        private @Nullable ClusterRkeConfigAuthentication authentication;
        private @Nullable ClusterRkeConfigAuthorization authorization;
        private @Nullable ClusterRkeConfigBastionHost bastionHost;
        private @Nullable ClusterRkeConfigCloudProvider cloudProvider;
        private @Nullable ClusterRkeConfigDns dns;
        private @Nullable Boolean enableCriDockerd;
        private @Nullable Boolean ignoreDockerVersion;
        private @Nullable ClusterRkeConfigIngress ingress;
        private @Nullable String kubernetesVersion;
        private @Nullable ClusterRkeConfigMonitoring monitoring;
        private @Nullable ClusterRkeConfigNetwork network;
        private @Nullable List<ClusterRkeConfigNode> nodes;
        private @Nullable String prefixPath;
        private @Nullable List<ClusterRkeConfigPrivateRegistry> privateRegistries;
        private @Nullable ClusterRkeConfigServices services;
        private @Nullable Boolean sshAgentAuth;
        private @Nullable String sshCertPath;
        private @Nullable String sshKeyPath;
        private @Nullable ClusterRkeConfigUpgradeStrategy upgradeStrategy;
        private @Nullable String winPrefixPath;
        public Builder() {}
        public Builder(ClusterRkeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonJobTimeout = defaults.addonJobTimeout;
    	      this.addons = defaults.addons;
    	      this.addonsIncludes = defaults.addonsIncludes;
    	      this.authentication = defaults.authentication;
    	      this.authorization = defaults.authorization;
    	      this.bastionHost = defaults.bastionHost;
    	      this.cloudProvider = defaults.cloudProvider;
    	      this.dns = defaults.dns;
    	      this.enableCriDockerd = defaults.enableCriDockerd;
    	      this.ignoreDockerVersion = defaults.ignoreDockerVersion;
    	      this.ingress = defaults.ingress;
    	      this.kubernetesVersion = defaults.kubernetesVersion;
    	      this.monitoring = defaults.monitoring;
    	      this.network = defaults.network;
    	      this.nodes = defaults.nodes;
    	      this.prefixPath = defaults.prefixPath;
    	      this.privateRegistries = defaults.privateRegistries;
    	      this.services = defaults.services;
    	      this.sshAgentAuth = defaults.sshAgentAuth;
    	      this.sshCertPath = defaults.sshCertPath;
    	      this.sshKeyPath = defaults.sshKeyPath;
    	      this.upgradeStrategy = defaults.upgradeStrategy;
    	      this.winPrefixPath = defaults.winPrefixPath;
        }

        @CustomType.Setter
        public Builder addonJobTimeout(@Nullable Integer addonJobTimeout) {
            this.addonJobTimeout = addonJobTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder addons(@Nullable String addons) {
            this.addons = addons;
            return this;
        }
        @CustomType.Setter
        public Builder addonsIncludes(@Nullable List<String> addonsIncludes) {
            this.addonsIncludes = addonsIncludes;
            return this;
        }
        public Builder addonsIncludes(String... addonsIncludes) {
            return addonsIncludes(List.of(addonsIncludes));
        }
        @CustomType.Setter
        public Builder authentication(@Nullable ClusterRkeConfigAuthentication authentication) {
            this.authentication = authentication;
            return this;
        }
        @CustomType.Setter
        public Builder authorization(@Nullable ClusterRkeConfigAuthorization authorization) {
            this.authorization = authorization;
            return this;
        }
        @CustomType.Setter
        public Builder bastionHost(@Nullable ClusterRkeConfigBastionHost bastionHost) {
            this.bastionHost = bastionHost;
            return this;
        }
        @CustomType.Setter
        public Builder cloudProvider(@Nullable ClusterRkeConfigCloudProvider cloudProvider) {
            this.cloudProvider = cloudProvider;
            return this;
        }
        @CustomType.Setter
        public Builder dns(@Nullable ClusterRkeConfigDns dns) {
            this.dns = dns;
            return this;
        }
        @CustomType.Setter
        public Builder enableCriDockerd(@Nullable Boolean enableCriDockerd) {
            this.enableCriDockerd = enableCriDockerd;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreDockerVersion(@Nullable Boolean ignoreDockerVersion) {
            this.ignoreDockerVersion = ignoreDockerVersion;
            return this;
        }
        @CustomType.Setter
        public Builder ingress(@Nullable ClusterRkeConfigIngress ingress) {
            this.ingress = ingress;
            return this;
        }
        @CustomType.Setter
        public Builder kubernetesVersion(@Nullable String kubernetesVersion) {
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }
        @CustomType.Setter
        public Builder monitoring(@Nullable ClusterRkeConfigMonitoring monitoring) {
            this.monitoring = monitoring;
            return this;
        }
        @CustomType.Setter
        public Builder network(@Nullable ClusterRkeConfigNetwork network) {
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder nodes(@Nullable List<ClusterRkeConfigNode> nodes) {
            this.nodes = nodes;
            return this;
        }
        public Builder nodes(ClusterRkeConfigNode... nodes) {
            return nodes(List.of(nodes));
        }
        @CustomType.Setter
        public Builder prefixPath(@Nullable String prefixPath) {
            this.prefixPath = prefixPath;
            return this;
        }
        @CustomType.Setter
        public Builder privateRegistries(@Nullable List<ClusterRkeConfigPrivateRegistry> privateRegistries) {
            this.privateRegistries = privateRegistries;
            return this;
        }
        public Builder privateRegistries(ClusterRkeConfigPrivateRegistry... privateRegistries) {
            return privateRegistries(List.of(privateRegistries));
        }
        @CustomType.Setter
        public Builder services(@Nullable ClusterRkeConfigServices services) {
            this.services = services;
            return this;
        }
        @CustomType.Setter
        public Builder sshAgentAuth(@Nullable Boolean sshAgentAuth) {
            this.sshAgentAuth = sshAgentAuth;
            return this;
        }
        @CustomType.Setter
        public Builder sshCertPath(@Nullable String sshCertPath) {
            this.sshCertPath = sshCertPath;
            return this;
        }
        @CustomType.Setter
        public Builder sshKeyPath(@Nullable String sshKeyPath) {
            this.sshKeyPath = sshKeyPath;
            return this;
        }
        @CustomType.Setter
        public Builder upgradeStrategy(@Nullable ClusterRkeConfigUpgradeStrategy upgradeStrategy) {
            this.upgradeStrategy = upgradeStrategy;
            return this;
        }
        @CustomType.Setter
        public Builder winPrefixPath(@Nullable String winPrefixPath) {
            this.winPrefixPath = winPrefixPath;
            return this;
        }
        public ClusterRkeConfig build() {
            final var _resultValue = new ClusterRkeConfig();
            _resultValue.addonJobTimeout = addonJobTimeout;
            _resultValue.addons = addons;
            _resultValue.addonsIncludes = addonsIncludes;
            _resultValue.authentication = authentication;
            _resultValue.authorization = authorization;
            _resultValue.bastionHost = bastionHost;
            _resultValue.cloudProvider = cloudProvider;
            _resultValue.dns = dns;
            _resultValue.enableCriDockerd = enableCriDockerd;
            _resultValue.ignoreDockerVersion = ignoreDockerVersion;
            _resultValue.ingress = ingress;
            _resultValue.kubernetesVersion = kubernetesVersion;
            _resultValue.monitoring = monitoring;
            _resultValue.network = network;
            _resultValue.nodes = nodes;
            _resultValue.prefixPath = prefixPath;
            _resultValue.privateRegistries = privateRegistries;
            _resultValue.services = services;
            _resultValue.sshAgentAuth = sshAgentAuth;
            _resultValue.sshCertPath = sshCertPath;
            _resultValue.sshKeyPath = sshKeyPath;
            _resultValue.upgradeStrategy = upgradeStrategy;
            _resultValue.winPrefixPath = winPrefixPath;
            return _resultValue;
        }
    }
}
