// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.outputs.ClusterAksConfigV2NodePool;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterAksConfigV2 {
    /**
     * @return The AKS auth base url (string)
     * 
     */
    private @Nullable String authBaseUrl;
    /**
     * @return The AKS authorized ip ranges (list)
     * 
     */
    private @Nullable List<String> authorizedIpRanges;
    /**
     * @return The AKS base url (string)
     * 
     */
    private @Nullable String baseUrl;
    /**
     * @return The EKS cloud_credential id (string)
     * 
     */
    private String cloudCredentialId;
    /**
     * @return The AKS dns prefix. Required if `imported=false` (string)
     * 
     */
    private @Nullable String dnsPrefix;
    /**
     * @return Enable AKS http application routing? (bool)
     * 
     */
    private @Nullable Boolean httpApplicationRouting;
    /**
     * @return Is GKE cluster imported? Default: `false` (bool)
     * 
     */
    private @Nullable Boolean imported;
    /**
     * @return The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
     * 
     */
    private @Nullable String kubernetesVersion;
    /**
     * @return The AKS linux admin username (string)
     * 
     */
    private @Nullable String linuxAdminUsername;
    /**
     * @return The AKS linux ssh public key (string)
     * 
     */
    private @Nullable String linuxSshPublicKey;
    /**
     * @return The AKS load balancer sku (string)
     * 
     */
    private @Nullable String loadBalancerSku;
    /**
     * @return The AKS log analytics workspace group (string)
     * 
     */
    private @Nullable String logAnalyticsWorkspaceGroup;
    /**
     * @return The AKS log analytics workspace name (string)
     * 
     */
    private @Nullable String logAnalyticsWorkspaceName;
    /**
     * @return Is AKS cluster monitoring enabled? (bool)
     * 
     */
    private @Nullable Boolean monitoring;
    /**
     * @return The name of the Cluster (string)
     * 
     */
    private @Nullable String name;
    /**
     * @return The AKS network dns service ip (string)
     * 
     */
    private @Nullable String networkDnsServiceIp;
    /**
     * @return The AKS network docker bridge cidr (string)
     * 
     */
    private @Nullable String networkDockerBridgeCidr;
    /**
     * @return The AKS network plugin. Required if `imported=false` (string)
     * 
     */
    private @Nullable String networkPlugin;
    /**
     * @return The AKS network pod cidr (string)
     * 
     */
    private @Nullable String networkPodCidr;
    /**
     * @return The AKS network policy (string)
     * 
     */
    private @Nullable String networkPolicy;
    /**
     * @return The AKS network service cidr (string)
     * 
     */
    private @Nullable String networkServiceCidr;
    /**
     * @return The GKE cluster node pools. Required for create new cluster (List)
     * 
     */
    private @Nullable List<ClusterAksConfigV2NodePool> nodePools;
    /**
     * @return Is AKS cluster private? (bool)
     * 
     */
    private @Nullable Boolean privateCluster;
    /**
     * @return The AKS resource group (string)
     * 
     */
    private String resourceGroup;
    /**
     * @return The AKS resource location (string)
     * 
     */
    private String resourceLocation;
    /**
     * @return The AKS subnet (string)
     * 
     */
    private @Nullable String subnet;
    /**
     * @return The GKE node config tags (List)
     * 
     */
    private @Nullable Map<String,Object> tags;
    /**
     * @return The name of the virtual network to use. If it&#39;s not specified Rancher will create a new VPC (string)
     * 
     */
    private @Nullable String virtualNetwork;
    /**
     * @return The AKS virtual network resource group (string)
     * 
     */
    private @Nullable String virtualNetworkResourceGroup;

    private ClusterAksConfigV2() {}
    /**
     * @return The AKS auth base url (string)
     * 
     */
    public Optional<String> authBaseUrl() {
        return Optional.ofNullable(this.authBaseUrl);
    }
    /**
     * @return The AKS authorized ip ranges (list)
     * 
     */
    public List<String> authorizedIpRanges() {
        return this.authorizedIpRanges == null ? List.of() : this.authorizedIpRanges;
    }
    /**
     * @return The AKS base url (string)
     * 
     */
    public Optional<String> baseUrl() {
        return Optional.ofNullable(this.baseUrl);
    }
    /**
     * @return The EKS cloud_credential id (string)
     * 
     */
    public String cloudCredentialId() {
        return this.cloudCredentialId;
    }
    /**
     * @return The AKS dns prefix. Required if `imported=false` (string)
     * 
     */
    public Optional<String> dnsPrefix() {
        return Optional.ofNullable(this.dnsPrefix);
    }
    /**
     * @return Enable AKS http application routing? (bool)
     * 
     */
    public Optional<Boolean> httpApplicationRouting() {
        return Optional.ofNullable(this.httpApplicationRouting);
    }
    /**
     * @return Is GKE cluster imported? Default: `false` (bool)
     * 
     */
    public Optional<Boolean> imported() {
        return Optional.ofNullable(this.imported);
    }
    /**
     * @return The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
     * 
     */
    public Optional<String> kubernetesVersion() {
        return Optional.ofNullable(this.kubernetesVersion);
    }
    /**
     * @return The AKS linux admin username (string)
     * 
     */
    public Optional<String> linuxAdminUsername() {
        return Optional.ofNullable(this.linuxAdminUsername);
    }
    /**
     * @return The AKS linux ssh public key (string)
     * 
     */
    public Optional<String> linuxSshPublicKey() {
        return Optional.ofNullable(this.linuxSshPublicKey);
    }
    /**
     * @return The AKS load balancer sku (string)
     * 
     */
    public Optional<String> loadBalancerSku() {
        return Optional.ofNullable(this.loadBalancerSku);
    }
    /**
     * @return The AKS log analytics workspace group (string)
     * 
     */
    public Optional<String> logAnalyticsWorkspaceGroup() {
        return Optional.ofNullable(this.logAnalyticsWorkspaceGroup);
    }
    /**
     * @return The AKS log analytics workspace name (string)
     * 
     */
    public Optional<String> logAnalyticsWorkspaceName() {
        return Optional.ofNullable(this.logAnalyticsWorkspaceName);
    }
    /**
     * @return Is AKS cluster monitoring enabled? (bool)
     * 
     */
    public Optional<Boolean> monitoring() {
        return Optional.ofNullable(this.monitoring);
    }
    /**
     * @return The name of the Cluster (string)
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The AKS network dns service ip (string)
     * 
     */
    public Optional<String> networkDnsServiceIp() {
        return Optional.ofNullable(this.networkDnsServiceIp);
    }
    /**
     * @return The AKS network docker bridge cidr (string)
     * 
     */
    public Optional<String> networkDockerBridgeCidr() {
        return Optional.ofNullable(this.networkDockerBridgeCidr);
    }
    /**
     * @return The AKS network plugin. Required if `imported=false` (string)
     * 
     */
    public Optional<String> networkPlugin() {
        return Optional.ofNullable(this.networkPlugin);
    }
    /**
     * @return The AKS network pod cidr (string)
     * 
     */
    public Optional<String> networkPodCidr() {
        return Optional.ofNullable(this.networkPodCidr);
    }
    /**
     * @return The AKS network policy (string)
     * 
     */
    public Optional<String> networkPolicy() {
        return Optional.ofNullable(this.networkPolicy);
    }
    /**
     * @return The AKS network service cidr (string)
     * 
     */
    public Optional<String> networkServiceCidr() {
        return Optional.ofNullable(this.networkServiceCidr);
    }
    /**
     * @return The GKE cluster node pools. Required for create new cluster (List)
     * 
     */
    public List<ClusterAksConfigV2NodePool> nodePools() {
        return this.nodePools == null ? List.of() : this.nodePools;
    }
    /**
     * @return Is AKS cluster private? (bool)
     * 
     */
    public Optional<Boolean> privateCluster() {
        return Optional.ofNullable(this.privateCluster);
    }
    /**
     * @return The AKS resource group (string)
     * 
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }
    /**
     * @return The AKS resource location (string)
     * 
     */
    public String resourceLocation() {
        return this.resourceLocation;
    }
    /**
     * @return The AKS subnet (string)
     * 
     */
    public Optional<String> subnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * @return The GKE node config tags (List)
     * 
     */
    public Map<String,Object> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The name of the virtual network to use. If it&#39;s not specified Rancher will create a new VPC (string)
     * 
     */
    public Optional<String> virtualNetwork() {
        return Optional.ofNullable(this.virtualNetwork);
    }
    /**
     * @return The AKS virtual network resource group (string)
     * 
     */
    public Optional<String> virtualNetworkResourceGroup() {
        return Optional.ofNullable(this.virtualNetworkResourceGroup);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAksConfigV2 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String authBaseUrl;
        private @Nullable List<String> authorizedIpRanges;
        private @Nullable String baseUrl;
        private String cloudCredentialId;
        private @Nullable String dnsPrefix;
        private @Nullable Boolean httpApplicationRouting;
        private @Nullable Boolean imported;
        private @Nullable String kubernetesVersion;
        private @Nullable String linuxAdminUsername;
        private @Nullable String linuxSshPublicKey;
        private @Nullable String loadBalancerSku;
        private @Nullable String logAnalyticsWorkspaceGroup;
        private @Nullable String logAnalyticsWorkspaceName;
        private @Nullable Boolean monitoring;
        private @Nullable String name;
        private @Nullable String networkDnsServiceIp;
        private @Nullable String networkDockerBridgeCidr;
        private @Nullable String networkPlugin;
        private @Nullable String networkPodCidr;
        private @Nullable String networkPolicy;
        private @Nullable String networkServiceCidr;
        private @Nullable List<ClusterAksConfigV2NodePool> nodePools;
        private @Nullable Boolean privateCluster;
        private String resourceGroup;
        private String resourceLocation;
        private @Nullable String subnet;
        private @Nullable Map<String,Object> tags;
        private @Nullable String virtualNetwork;
        private @Nullable String virtualNetworkResourceGroup;
        public Builder() {}
        public Builder(ClusterAksConfigV2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authBaseUrl = defaults.authBaseUrl;
    	      this.authorizedIpRanges = defaults.authorizedIpRanges;
    	      this.baseUrl = defaults.baseUrl;
    	      this.cloudCredentialId = defaults.cloudCredentialId;
    	      this.dnsPrefix = defaults.dnsPrefix;
    	      this.httpApplicationRouting = defaults.httpApplicationRouting;
    	      this.imported = defaults.imported;
    	      this.kubernetesVersion = defaults.kubernetesVersion;
    	      this.linuxAdminUsername = defaults.linuxAdminUsername;
    	      this.linuxSshPublicKey = defaults.linuxSshPublicKey;
    	      this.loadBalancerSku = defaults.loadBalancerSku;
    	      this.logAnalyticsWorkspaceGroup = defaults.logAnalyticsWorkspaceGroup;
    	      this.logAnalyticsWorkspaceName = defaults.logAnalyticsWorkspaceName;
    	      this.monitoring = defaults.monitoring;
    	      this.name = defaults.name;
    	      this.networkDnsServiceIp = defaults.networkDnsServiceIp;
    	      this.networkDockerBridgeCidr = defaults.networkDockerBridgeCidr;
    	      this.networkPlugin = defaults.networkPlugin;
    	      this.networkPodCidr = defaults.networkPodCidr;
    	      this.networkPolicy = defaults.networkPolicy;
    	      this.networkServiceCidr = defaults.networkServiceCidr;
    	      this.nodePools = defaults.nodePools;
    	      this.privateCluster = defaults.privateCluster;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceLocation = defaults.resourceLocation;
    	      this.subnet = defaults.subnet;
    	      this.tags = defaults.tags;
    	      this.virtualNetwork = defaults.virtualNetwork;
    	      this.virtualNetworkResourceGroup = defaults.virtualNetworkResourceGroup;
        }

        @CustomType.Setter
        public Builder authBaseUrl(@Nullable String authBaseUrl) {

            this.authBaseUrl = authBaseUrl;
            return this;
        }
        @CustomType.Setter
        public Builder authorizedIpRanges(@Nullable List<String> authorizedIpRanges) {

            this.authorizedIpRanges = authorizedIpRanges;
            return this;
        }
        public Builder authorizedIpRanges(String... authorizedIpRanges) {
            return authorizedIpRanges(List.of(authorizedIpRanges));
        }
        @CustomType.Setter
        public Builder baseUrl(@Nullable String baseUrl) {

            this.baseUrl = baseUrl;
            return this;
        }
        @CustomType.Setter
        public Builder cloudCredentialId(String cloudCredentialId) {
            if (cloudCredentialId == null) {
              throw new MissingRequiredPropertyException("ClusterAksConfigV2", "cloudCredentialId");
            }
            this.cloudCredentialId = cloudCredentialId;
            return this;
        }
        @CustomType.Setter
        public Builder dnsPrefix(@Nullable String dnsPrefix) {

            this.dnsPrefix = dnsPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder httpApplicationRouting(@Nullable Boolean httpApplicationRouting) {

            this.httpApplicationRouting = httpApplicationRouting;
            return this;
        }
        @CustomType.Setter
        public Builder imported(@Nullable Boolean imported) {

            this.imported = imported;
            return this;
        }
        @CustomType.Setter
        public Builder kubernetesVersion(@Nullable String kubernetesVersion) {

            this.kubernetesVersion = kubernetesVersion;
            return this;
        }
        @CustomType.Setter
        public Builder linuxAdminUsername(@Nullable String linuxAdminUsername) {

            this.linuxAdminUsername = linuxAdminUsername;
            return this;
        }
        @CustomType.Setter
        public Builder linuxSshPublicKey(@Nullable String linuxSshPublicKey) {

            this.linuxSshPublicKey = linuxSshPublicKey;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerSku(@Nullable String loadBalancerSku) {

            this.loadBalancerSku = loadBalancerSku;
            return this;
        }
        @CustomType.Setter
        public Builder logAnalyticsWorkspaceGroup(@Nullable String logAnalyticsWorkspaceGroup) {

            this.logAnalyticsWorkspaceGroup = logAnalyticsWorkspaceGroup;
            return this;
        }
        @CustomType.Setter
        public Builder logAnalyticsWorkspaceName(@Nullable String logAnalyticsWorkspaceName) {

            this.logAnalyticsWorkspaceName = logAnalyticsWorkspaceName;
            return this;
        }
        @CustomType.Setter
        public Builder monitoring(@Nullable Boolean monitoring) {

            this.monitoring = monitoring;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder networkDnsServiceIp(@Nullable String networkDnsServiceIp) {

            this.networkDnsServiceIp = networkDnsServiceIp;
            return this;
        }
        @CustomType.Setter
        public Builder networkDockerBridgeCidr(@Nullable String networkDockerBridgeCidr) {

            this.networkDockerBridgeCidr = networkDockerBridgeCidr;
            return this;
        }
        @CustomType.Setter
        public Builder networkPlugin(@Nullable String networkPlugin) {

            this.networkPlugin = networkPlugin;
            return this;
        }
        @CustomType.Setter
        public Builder networkPodCidr(@Nullable String networkPodCidr) {

            this.networkPodCidr = networkPodCidr;
            return this;
        }
        @CustomType.Setter
        public Builder networkPolicy(@Nullable String networkPolicy) {

            this.networkPolicy = networkPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder networkServiceCidr(@Nullable String networkServiceCidr) {

            this.networkServiceCidr = networkServiceCidr;
            return this;
        }
        @CustomType.Setter
        public Builder nodePools(@Nullable List<ClusterAksConfigV2NodePool> nodePools) {

            this.nodePools = nodePools;
            return this;
        }
        public Builder nodePools(ClusterAksConfigV2NodePool... nodePools) {
            return nodePools(List.of(nodePools));
        }
        @CustomType.Setter
        public Builder privateCluster(@Nullable Boolean privateCluster) {

            this.privateCluster = privateCluster;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroup(String resourceGroup) {
            if (resourceGroup == null) {
              throw new MissingRequiredPropertyException("ClusterAksConfigV2", "resourceGroup");
            }
            this.resourceGroup = resourceGroup;
            return this;
        }
        @CustomType.Setter
        public Builder resourceLocation(String resourceLocation) {
            if (resourceLocation == null) {
              throw new MissingRequiredPropertyException("ClusterAksConfigV2", "resourceLocation");
            }
            this.resourceLocation = resourceLocation;
            return this;
        }
        @CustomType.Setter
        public Builder subnet(@Nullable String subnet) {

            this.subnet = subnet;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,Object> tags) {

            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder virtualNetwork(@Nullable String virtualNetwork) {

            this.virtualNetwork = virtualNetwork;
            return this;
        }
        @CustomType.Setter
        public Builder virtualNetworkResourceGroup(@Nullable String virtualNetworkResourceGroup) {

            this.virtualNetworkResourceGroup = virtualNetworkResourceGroup;
            return this;
        }
        public ClusterAksConfigV2 build() {
            final var _resultValue = new ClusterAksConfigV2();
            _resultValue.authBaseUrl = authBaseUrl;
            _resultValue.authorizedIpRanges = authorizedIpRanges;
            _resultValue.baseUrl = baseUrl;
            _resultValue.cloudCredentialId = cloudCredentialId;
            _resultValue.dnsPrefix = dnsPrefix;
            _resultValue.httpApplicationRouting = httpApplicationRouting;
            _resultValue.imported = imported;
            _resultValue.kubernetesVersion = kubernetesVersion;
            _resultValue.linuxAdminUsername = linuxAdminUsername;
            _resultValue.linuxSshPublicKey = linuxSshPublicKey;
            _resultValue.loadBalancerSku = loadBalancerSku;
            _resultValue.logAnalyticsWorkspaceGroup = logAnalyticsWorkspaceGroup;
            _resultValue.logAnalyticsWorkspaceName = logAnalyticsWorkspaceName;
            _resultValue.monitoring = monitoring;
            _resultValue.name = name;
            _resultValue.networkDnsServiceIp = networkDnsServiceIp;
            _resultValue.networkDockerBridgeCidr = networkDockerBridgeCidr;
            _resultValue.networkPlugin = networkPlugin;
            _resultValue.networkPodCidr = networkPodCidr;
            _resultValue.networkPolicy = networkPolicy;
            _resultValue.networkServiceCidr = networkServiceCidr;
            _resultValue.nodePools = nodePools;
            _resultValue.privateCluster = privateCluster;
            _resultValue.resourceGroup = resourceGroup;
            _resultValue.resourceLocation = resourceLocation;
            _resultValue.subnet = subnet;
            _resultValue.tags = tags;
            _resultValue.virtualNetwork = virtualNetwork;
            _resultValue.virtualNetworkResourceGroup = virtualNetworkResourceGroup;
            return _resultValue;
        }
    }
}
