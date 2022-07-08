// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthentication;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorization;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHost;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigDns;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngress;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoring;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetwork;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNode;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistry;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServices;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterTemplateTemplateRevisionClusterConfigRkeConfig {
    private final Integer addonJobTimeout;
    private final @Nullable String addons;
    private final @Nullable List<String> addonsIncludes;
    private final GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthentication authentication;
    private final GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorization authorization;
    private final GetClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHost bastionHost;
    private final GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider cloudProvider;
    private final GetClusterTemplateTemplateRevisionClusterConfigRkeConfigDns dns;
    private final @Nullable Boolean enableCriDockerd;
    private final @Nullable Boolean ignoreDockerVersion;
    private final GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngress ingress;
    private final String kubernetesVersion;
    private final GetClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoring monitoring;
    private final GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetwork network;
    private final @Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNode> nodes;
    private final String prefixPath;
    private final @Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistry> privateRegistries;
    private final GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServices services;
    private final @Nullable Boolean sshAgentAuth;
    private final String sshCertPath;
    private final String sshKeyPath;
    private final GetClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategy upgradeStrategy;
    private final String winPrefixPath;

    @CustomType.Constructor
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfig(
        @CustomType.Parameter("addonJobTimeout") Integer addonJobTimeout,
        @CustomType.Parameter("addons") @Nullable String addons,
        @CustomType.Parameter("addonsIncludes") @Nullable List<String> addonsIncludes,
        @CustomType.Parameter("authentication") GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthentication authentication,
        @CustomType.Parameter("authorization") GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorization authorization,
        @CustomType.Parameter("bastionHost") GetClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHost bastionHost,
        @CustomType.Parameter("cloudProvider") GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider cloudProvider,
        @CustomType.Parameter("dns") GetClusterTemplateTemplateRevisionClusterConfigRkeConfigDns dns,
        @CustomType.Parameter("enableCriDockerd") @Nullable Boolean enableCriDockerd,
        @CustomType.Parameter("ignoreDockerVersion") @Nullable Boolean ignoreDockerVersion,
        @CustomType.Parameter("ingress") GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngress ingress,
        @CustomType.Parameter("kubernetesVersion") String kubernetesVersion,
        @CustomType.Parameter("monitoring") GetClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoring monitoring,
        @CustomType.Parameter("network") GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetwork network,
        @CustomType.Parameter("nodes") @Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNode> nodes,
        @CustomType.Parameter("prefixPath") String prefixPath,
        @CustomType.Parameter("privateRegistries") @Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistry> privateRegistries,
        @CustomType.Parameter("services") GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServices services,
        @CustomType.Parameter("sshAgentAuth") @Nullable Boolean sshAgentAuth,
        @CustomType.Parameter("sshCertPath") String sshCertPath,
        @CustomType.Parameter("sshKeyPath") String sshKeyPath,
        @CustomType.Parameter("upgradeStrategy") GetClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategy upgradeStrategy,
        @CustomType.Parameter("winPrefixPath") String winPrefixPath) {
        this.addonJobTimeout = addonJobTimeout;
        this.addons = addons;
        this.addonsIncludes = addonsIncludes;
        this.authentication = authentication;
        this.authorization = authorization;
        this.bastionHost = bastionHost;
        this.cloudProvider = cloudProvider;
        this.dns = dns;
        this.enableCriDockerd = enableCriDockerd;
        this.ignoreDockerVersion = ignoreDockerVersion;
        this.ingress = ingress;
        this.kubernetesVersion = kubernetesVersion;
        this.monitoring = monitoring;
        this.network = network;
        this.nodes = nodes;
        this.prefixPath = prefixPath;
        this.privateRegistries = privateRegistries;
        this.services = services;
        this.sshAgentAuth = sshAgentAuth;
        this.sshCertPath = sshCertPath;
        this.sshKeyPath = sshKeyPath;
        this.upgradeStrategy = upgradeStrategy;
        this.winPrefixPath = winPrefixPath;
    }

    public Integer addonJobTimeout() {
        return this.addonJobTimeout;
    }
    public Optional<String> addons() {
        return Optional.ofNullable(this.addons);
    }
    public List<String> addonsIncludes() {
        return this.addonsIncludes == null ? List.of() : this.addonsIncludes;
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthentication authentication() {
        return this.authentication;
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorization authorization() {
        return this.authorization;
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHost bastionHost() {
        return this.bastionHost;
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider cloudProvider() {
        return this.cloudProvider;
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigDns dns() {
        return this.dns;
    }
    public Optional<Boolean> enableCriDockerd() {
        return Optional.ofNullable(this.enableCriDockerd);
    }
    public Optional<Boolean> ignoreDockerVersion() {
        return Optional.ofNullable(this.ignoreDockerVersion);
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngress ingress() {
        return this.ingress;
    }
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoring monitoring() {
        return this.monitoring;
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetwork network() {
        return this.network;
    }
    public List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNode> nodes() {
        return this.nodes == null ? List.of() : this.nodes;
    }
    public String prefixPath() {
        return this.prefixPath;
    }
    public List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistry> privateRegistries() {
        return this.privateRegistries == null ? List.of() : this.privateRegistries;
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServices services() {
        return this.services;
    }
    public Optional<Boolean> sshAgentAuth() {
        return Optional.ofNullable(this.sshAgentAuth);
    }
    public String sshCertPath() {
        return this.sshCertPath;
    }
    public String sshKeyPath() {
        return this.sshKeyPath;
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategy upgradeStrategy() {
        return this.upgradeStrategy;
    }
    public String winPrefixPath() {
        return this.winPrefixPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer addonJobTimeout;
        private @Nullable String addons;
        private @Nullable List<String> addonsIncludes;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthentication authentication;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorization authorization;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHost bastionHost;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider cloudProvider;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigDns dns;
        private @Nullable Boolean enableCriDockerd;
        private @Nullable Boolean ignoreDockerVersion;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngress ingress;
        private String kubernetesVersion;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoring monitoring;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetwork network;
        private @Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNode> nodes;
        private String prefixPath;
        private @Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistry> privateRegistries;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServices services;
        private @Nullable Boolean sshAgentAuth;
        private String sshCertPath;
        private String sshKeyPath;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategy upgradeStrategy;
        private String winPrefixPath;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfig defaults) {
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

        public Builder addonJobTimeout(Integer addonJobTimeout) {
            this.addonJobTimeout = Objects.requireNonNull(addonJobTimeout);
            return this;
        }
        public Builder addons(@Nullable String addons) {
            this.addons = addons;
            return this;
        }
        public Builder addonsIncludes(@Nullable List<String> addonsIncludes) {
            this.addonsIncludes = addonsIncludes;
            return this;
        }
        public Builder addonsIncludes(String... addonsIncludes) {
            return addonsIncludes(List.of(addonsIncludes));
        }
        public Builder authentication(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthentication authentication) {
            this.authentication = Objects.requireNonNull(authentication);
            return this;
        }
        public Builder authorization(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthorization authorization) {
            this.authorization = Objects.requireNonNull(authorization);
            return this;
        }
        public Builder bastionHost(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigBastionHost bastionHost) {
            this.bastionHost = Objects.requireNonNull(bastionHost);
            return this;
        }
        public Builder cloudProvider(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider cloudProvider) {
            this.cloudProvider = Objects.requireNonNull(cloudProvider);
            return this;
        }
        public Builder dns(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigDns dns) {
            this.dns = Objects.requireNonNull(dns);
            return this;
        }
        public Builder enableCriDockerd(@Nullable Boolean enableCriDockerd) {
            this.enableCriDockerd = enableCriDockerd;
            return this;
        }
        public Builder ignoreDockerVersion(@Nullable Boolean ignoreDockerVersion) {
            this.ignoreDockerVersion = ignoreDockerVersion;
            return this;
        }
        public Builder ingress(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngress ingress) {
            this.ingress = Objects.requireNonNull(ingress);
            return this;
        }
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = Objects.requireNonNull(kubernetesVersion);
            return this;
        }
        public Builder monitoring(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoring monitoring) {
            this.monitoring = Objects.requireNonNull(monitoring);
            return this;
        }
        public Builder network(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNetwork network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder nodes(@Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNode> nodes) {
            this.nodes = nodes;
            return this;
        }
        public Builder nodes(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigNode... nodes) {
            return nodes(List.of(nodes));
        }
        public Builder prefixPath(String prefixPath) {
            this.prefixPath = Objects.requireNonNull(prefixPath);
            return this;
        }
        public Builder privateRegistries(@Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistry> privateRegistries) {
            this.privateRegistries = privateRegistries;
            return this;
        }
        public Builder privateRegistries(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistry... privateRegistries) {
            return privateRegistries(List.of(privateRegistries));
        }
        public Builder services(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServices services) {
            this.services = Objects.requireNonNull(services);
            return this;
        }
        public Builder sshAgentAuth(@Nullable Boolean sshAgentAuth) {
            this.sshAgentAuth = sshAgentAuth;
            return this;
        }
        public Builder sshCertPath(String sshCertPath) {
            this.sshCertPath = Objects.requireNonNull(sshCertPath);
            return this;
        }
        public Builder sshKeyPath(String sshKeyPath) {
            this.sshKeyPath = Objects.requireNonNull(sshKeyPath);
            return this;
        }
        public Builder upgradeStrategy(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategy upgradeStrategy) {
            this.upgradeStrategy = Objects.requireNonNull(upgradeStrategy);
            return this;
        }
        public Builder winPrefixPath(String winPrefixPath) {
            this.winPrefixPath = Objects.requireNonNull(winPrefixPath);
            return this;
        }        public GetClusterTemplateTemplateRevisionClusterConfigRkeConfig build() {
            return new GetClusterTemplateTemplateRevisionClusterConfigRkeConfig(addonJobTimeout, addons, addonsIncludes, authentication, authorization, bastionHost, cloudProvider, dns, enableCriDockerd, ignoreDockerVersion, ingress, kubernetesVersion, monitoring, network, nodes, prefixPath, privateRegistries, services, sshAgentAuth, sshCertPath, sshKeyPath, upgradeStrategy, winPrefixPath);
        }
    }
}
