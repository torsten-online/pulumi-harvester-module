// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.inputs.ClusterGkeConfigV2ClusterAddonsArgs;
import com.pulumi.rancher2.inputs.ClusterGkeConfigV2IpAllocationPolicyArgs;
import com.pulumi.rancher2.inputs.ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs;
import com.pulumi.rancher2.inputs.ClusterGkeConfigV2NodePoolArgs;
import com.pulumi.rancher2.inputs.ClusterGkeConfigV2PrivateClusterConfigArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterGkeConfigV2Args extends com.pulumi.resources.ResourceArgs {

    public static final ClusterGkeConfigV2Args Empty = new ClusterGkeConfigV2Args();

    /**
     * The GKE cluster addons (List maxitems:1)
     * 
     */
    @Import(name="clusterAddons")
    private @Nullable Output<ClusterGkeConfigV2ClusterAddonsArgs> clusterAddons;

    /**
     * @return The GKE cluster addons (List maxitems:1)
     * 
     */
    public Optional<Output<ClusterGkeConfigV2ClusterAddonsArgs>> clusterAddons() {
        return Optional.ofNullable(this.clusterAddons);
    }

    /**
     * The GKE cluster ip v4 allocation cidr block (string)
     * 
     */
    @Import(name="clusterIpv4CidrBlock")
    private @Nullable Output<String> clusterIpv4CidrBlock;

    /**
     * @return The GKE cluster ip v4 allocation cidr block (string)
     * 
     */
    public Optional<Output<String>> clusterIpv4CidrBlock() {
        return Optional.ofNullable(this.clusterIpv4CidrBlock);
    }

    /**
     * The description for Cluster (string)
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for Cluster (string)
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Enable Kubernetes alpha. Default: `false` (bool)
     * 
     */
    @Import(name="enableKubernetesAlpha")
    private @Nullable Output<Boolean> enableKubernetesAlpha;

    /**
     * @return Enable Kubernetes alpha. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> enableKubernetesAlpha() {
        return Optional.ofNullable(this.enableKubernetesAlpha);
    }

    /**
     * Google credential secret (string)
     * 
     */
    @Import(name="googleCredentialSecret", required=true)
    private Output<String> googleCredentialSecret;

    /**
     * @return Google credential secret (string)
     * 
     */
    public Output<String> googleCredentialSecret() {
        return this.googleCredentialSecret;
    }

    /**
     * Is GKE cluster imported? Default: `false` (bool)
     * 
     */
    @Import(name="imported")
    private @Nullable Output<Boolean> imported;

    /**
     * @return Is GKE cluster imported? Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> imported() {
        return Optional.ofNullable(this.imported);
    }

    /**
     * The GKE ip allocation policy (List maxitems:1)
     * 
     */
    @Import(name="ipAllocationPolicy")
    private @Nullable Output<ClusterGkeConfigV2IpAllocationPolicyArgs> ipAllocationPolicy;

    /**
     * @return The GKE ip allocation policy (List maxitems:1)
     * 
     */
    public Optional<Output<ClusterGkeConfigV2IpAllocationPolicyArgs>> ipAllocationPolicy() {
        return Optional.ofNullable(this.ipAllocationPolicy);
    }

    /**
     * The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
     * 
     */
    @Import(name="kubernetesVersion")
    private @Nullable Output<String> kubernetesVersion;

    /**
     * @return The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
     * 
     */
    public Optional<Output<String>> kubernetesVersion() {
        return Optional.ofNullable(this.kubernetesVersion);
    }

    /**
     * Labels for the Cluster (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels for the Cluster (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The GKE cluster locations (List)
     * 
     */
    @Import(name="locations")
    private @Nullable Output<List<String>> locations;

    /**
     * @return The GKE cluster locations (List)
     * 
     */
    public Optional<Output<List<String>>> locations() {
        return Optional.ofNullable(this.locations);
    }

    /**
     * The GKE cluster logging service (string)
     * 
     */
    @Import(name="loggingService")
    private @Nullable Output<String> loggingService;

    /**
     * @return The GKE cluster logging service (string)
     * 
     */
    public Optional<Output<String>> loggingService() {
        return Optional.ofNullable(this.loggingService);
    }

    /**
     * The GKE cluster maintenance window (string)
     * 
     */
    @Import(name="maintenanceWindow")
    private @Nullable Output<String> maintenanceWindow;

    /**
     * @return The GKE cluster maintenance window (string)
     * 
     */
    public Optional<Output<String>> maintenanceWindow() {
        return Optional.ofNullable(this.maintenanceWindow);
    }

    /**
     * The GKE cluster master authorized networks config (List maxitems:1)
     * 
     */
    @Import(name="masterAuthorizedNetworksConfig")
    private @Nullable Output<ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs> masterAuthorizedNetworksConfig;

    /**
     * @return The GKE cluster master authorized networks config (List maxitems:1)
     * 
     */
    public Optional<Output<ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs>> masterAuthorizedNetworksConfig() {
        return Optional.ofNullable(this.masterAuthorizedNetworksConfig);
    }

    /**
     * The GKE cluster monitoring service (string)
     * 
     */
    @Import(name="monitoringService")
    private @Nullable Output<String> monitoringService;

    /**
     * @return The GKE cluster monitoring service (string)
     * 
     */
    public Optional<Output<String>> monitoringService() {
        return Optional.ofNullable(this.monitoringService);
    }

    /**
     * The name of the Cluster (string)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Cluster (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The GKE cluster network. Required for create new cluster (string)
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return The GKE cluster network. Required for create new cluster (string)
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * Is GKE cluster network policy enabled? Default: `false` (bool)
     * 
     */
    @Import(name="networkPolicyEnabled")
    private @Nullable Output<Boolean> networkPolicyEnabled;

    /**
     * @return Is GKE cluster network policy enabled? Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> networkPolicyEnabled() {
        return Optional.ofNullable(this.networkPolicyEnabled);
    }

    /**
     * The GKE cluster node pools. Required for create new cluster (List)
     * 
     */
    @Import(name="nodePools")
    private @Nullable Output<List<ClusterGkeConfigV2NodePoolArgs>> nodePools;

    /**
     * @return The GKE cluster node pools. Required for create new cluster (List)
     * 
     */
    public Optional<Output<List<ClusterGkeConfigV2NodePoolArgs>>> nodePools() {
        return Optional.ofNullable(this.nodePools);
    }

    /**
     * The GKE private cluster config (List maxitems:1)
     * 
     */
    @Import(name="privateClusterConfig")
    private @Nullable Output<ClusterGkeConfigV2PrivateClusterConfigArgs> privateClusterConfig;

    /**
     * @return The GKE private cluster config (List maxitems:1)
     * 
     */
    public Optional<Output<ClusterGkeConfigV2PrivateClusterConfigArgs>> privateClusterConfig() {
        return Optional.ofNullable(this.privateClusterConfig);
    }

    /**
     * Project ID to apply answer (string)
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Project ID to apply answer (string)
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The GKE cluster subnetwork. Required for create new cluster (string)
     * 
     */
    @Import(name="subnetwork")
    private @Nullable Output<String> subnetwork;

    /**
     * @return The GKE cluster subnetwork. Required for create new cluster (string)
     * 
     */
    public Optional<Output<String>> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    /**
     * The GKE cluster zone. Required if `region` not set (string)
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return The GKE cluster zone. Required if `region` not set (string)
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private ClusterGkeConfigV2Args() {}

    private ClusterGkeConfigV2Args(ClusterGkeConfigV2Args $) {
        this.clusterAddons = $.clusterAddons;
        this.clusterIpv4CidrBlock = $.clusterIpv4CidrBlock;
        this.description = $.description;
        this.enableKubernetesAlpha = $.enableKubernetesAlpha;
        this.googleCredentialSecret = $.googleCredentialSecret;
        this.imported = $.imported;
        this.ipAllocationPolicy = $.ipAllocationPolicy;
        this.kubernetesVersion = $.kubernetesVersion;
        this.labels = $.labels;
        this.locations = $.locations;
        this.loggingService = $.loggingService;
        this.maintenanceWindow = $.maintenanceWindow;
        this.masterAuthorizedNetworksConfig = $.masterAuthorizedNetworksConfig;
        this.monitoringService = $.monitoringService;
        this.name = $.name;
        this.network = $.network;
        this.networkPolicyEnabled = $.networkPolicyEnabled;
        this.nodePools = $.nodePools;
        this.privateClusterConfig = $.privateClusterConfig;
        this.projectId = $.projectId;
        this.region = $.region;
        this.subnetwork = $.subnetwork;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterGkeConfigV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterGkeConfigV2Args $;

        public Builder() {
            $ = new ClusterGkeConfigV2Args();
        }

        public Builder(ClusterGkeConfigV2Args defaults) {
            $ = new ClusterGkeConfigV2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterAddons The GKE cluster addons (List maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder clusterAddons(@Nullable Output<ClusterGkeConfigV2ClusterAddonsArgs> clusterAddons) {
            $.clusterAddons = clusterAddons;
            return this;
        }

        /**
         * @param clusterAddons The GKE cluster addons (List maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder clusterAddons(ClusterGkeConfigV2ClusterAddonsArgs clusterAddons) {
            return clusterAddons(Output.of(clusterAddons));
        }

        /**
         * @param clusterIpv4CidrBlock The GKE cluster ip v4 allocation cidr block (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterIpv4CidrBlock(@Nullable Output<String> clusterIpv4CidrBlock) {
            $.clusterIpv4CidrBlock = clusterIpv4CidrBlock;
            return this;
        }

        /**
         * @param clusterIpv4CidrBlock The GKE cluster ip v4 allocation cidr block (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterIpv4CidrBlock(String clusterIpv4CidrBlock) {
            return clusterIpv4CidrBlock(Output.of(clusterIpv4CidrBlock));
        }

        /**
         * @param description The description for Cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for Cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enableKubernetesAlpha Enable Kubernetes alpha. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enableKubernetesAlpha(@Nullable Output<Boolean> enableKubernetesAlpha) {
            $.enableKubernetesAlpha = enableKubernetesAlpha;
            return this;
        }

        /**
         * @param enableKubernetesAlpha Enable Kubernetes alpha. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enableKubernetesAlpha(Boolean enableKubernetesAlpha) {
            return enableKubernetesAlpha(Output.of(enableKubernetesAlpha));
        }

        /**
         * @param googleCredentialSecret Google credential secret (string)
         * 
         * @return builder
         * 
         */
        public Builder googleCredentialSecret(Output<String> googleCredentialSecret) {
            $.googleCredentialSecret = googleCredentialSecret;
            return this;
        }

        /**
         * @param googleCredentialSecret Google credential secret (string)
         * 
         * @return builder
         * 
         */
        public Builder googleCredentialSecret(String googleCredentialSecret) {
            return googleCredentialSecret(Output.of(googleCredentialSecret));
        }

        /**
         * @param imported Is GKE cluster imported? Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder imported(@Nullable Output<Boolean> imported) {
            $.imported = imported;
            return this;
        }

        /**
         * @param imported Is GKE cluster imported? Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder imported(Boolean imported) {
            return imported(Output.of(imported));
        }

        /**
         * @param ipAllocationPolicy The GKE ip allocation policy (List maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder ipAllocationPolicy(@Nullable Output<ClusterGkeConfigV2IpAllocationPolicyArgs> ipAllocationPolicy) {
            $.ipAllocationPolicy = ipAllocationPolicy;
            return this;
        }

        /**
         * @param ipAllocationPolicy The GKE ip allocation policy (List maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder ipAllocationPolicy(ClusterGkeConfigV2IpAllocationPolicyArgs ipAllocationPolicy) {
            return ipAllocationPolicy(Output.of(ipAllocationPolicy));
        }

        /**
         * @param kubernetesVersion The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
         * 
         * @return builder
         * 
         */
        public Builder kubernetesVersion(@Nullable Output<String> kubernetesVersion) {
            $.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * @param kubernetesVersion The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
         * 
         * @return builder
         * 
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            return kubernetesVersion(Output.of(kubernetesVersion));
        }

        /**
         * @param labels Labels for the Cluster (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for the Cluster (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param locations The GKE cluster locations (List)
         * 
         * @return builder
         * 
         */
        public Builder locations(@Nullable Output<List<String>> locations) {
            $.locations = locations;
            return this;
        }

        /**
         * @param locations The GKE cluster locations (List)
         * 
         * @return builder
         * 
         */
        public Builder locations(List<String> locations) {
            return locations(Output.of(locations));
        }

        /**
         * @param locations The GKE cluster locations (List)
         * 
         * @return builder
         * 
         */
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }

        /**
         * @param loggingService The GKE cluster logging service (string)
         * 
         * @return builder
         * 
         */
        public Builder loggingService(@Nullable Output<String> loggingService) {
            $.loggingService = loggingService;
            return this;
        }

        /**
         * @param loggingService The GKE cluster logging service (string)
         * 
         * @return builder
         * 
         */
        public Builder loggingService(String loggingService) {
            return loggingService(Output.of(loggingService));
        }

        /**
         * @param maintenanceWindow The GKE cluster maintenance window (string)
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindow(@Nullable Output<String> maintenanceWindow) {
            $.maintenanceWindow = maintenanceWindow;
            return this;
        }

        /**
         * @param maintenanceWindow The GKE cluster maintenance window (string)
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindow(String maintenanceWindow) {
            return maintenanceWindow(Output.of(maintenanceWindow));
        }

        /**
         * @param masterAuthorizedNetworksConfig The GKE cluster master authorized networks config (List maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder masterAuthorizedNetworksConfig(@Nullable Output<ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs> masterAuthorizedNetworksConfig) {
            $.masterAuthorizedNetworksConfig = masterAuthorizedNetworksConfig;
            return this;
        }

        /**
         * @param masterAuthorizedNetworksConfig The GKE cluster master authorized networks config (List maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder masterAuthorizedNetworksConfig(ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs masterAuthorizedNetworksConfig) {
            return masterAuthorizedNetworksConfig(Output.of(masterAuthorizedNetworksConfig));
        }

        /**
         * @param monitoringService The GKE cluster monitoring service (string)
         * 
         * @return builder
         * 
         */
        public Builder monitoringService(@Nullable Output<String> monitoringService) {
            $.monitoringService = monitoringService;
            return this;
        }

        /**
         * @param monitoringService The GKE cluster monitoring service (string)
         * 
         * @return builder
         * 
         */
        public Builder monitoringService(String monitoringService) {
            return monitoringService(Output.of(monitoringService));
        }

        /**
         * @param name The name of the Cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network The GKE cluster network. Required for create new cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The GKE cluster network. Required for create new cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param networkPolicyEnabled Is GKE cluster network policy enabled? Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder networkPolicyEnabled(@Nullable Output<Boolean> networkPolicyEnabled) {
            $.networkPolicyEnabled = networkPolicyEnabled;
            return this;
        }

        /**
         * @param networkPolicyEnabled Is GKE cluster network policy enabled? Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder networkPolicyEnabled(Boolean networkPolicyEnabled) {
            return networkPolicyEnabled(Output.of(networkPolicyEnabled));
        }

        /**
         * @param nodePools The GKE cluster node pools. Required for create new cluster (List)
         * 
         * @return builder
         * 
         */
        public Builder nodePools(@Nullable Output<List<ClusterGkeConfigV2NodePoolArgs>> nodePools) {
            $.nodePools = nodePools;
            return this;
        }

        /**
         * @param nodePools The GKE cluster node pools. Required for create new cluster (List)
         * 
         * @return builder
         * 
         */
        public Builder nodePools(List<ClusterGkeConfigV2NodePoolArgs> nodePools) {
            return nodePools(Output.of(nodePools));
        }

        /**
         * @param nodePools The GKE cluster node pools. Required for create new cluster (List)
         * 
         * @return builder
         * 
         */
        public Builder nodePools(ClusterGkeConfigV2NodePoolArgs... nodePools) {
            return nodePools(List.of(nodePools));
        }

        /**
         * @param privateClusterConfig The GKE private cluster config (List maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder privateClusterConfig(@Nullable Output<ClusterGkeConfigV2PrivateClusterConfigArgs> privateClusterConfig) {
            $.privateClusterConfig = privateClusterConfig;
            return this;
        }

        /**
         * @param privateClusterConfig The GKE private cluster config (List maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder privateClusterConfig(ClusterGkeConfigV2PrivateClusterConfigArgs privateClusterConfig) {
            return privateClusterConfig(Output.of(privateClusterConfig));
        }

        /**
         * @param projectId Project ID to apply answer (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project ID to apply answer (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param region The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param subnetwork The GKE cluster subnetwork. Required for create new cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        /**
         * @param subnetwork The GKE cluster subnetwork. Required for create new cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(String subnetwork) {
            return subnetwork(Output.of(subnetwork));
        }

        /**
         * @param zone The GKE cluster zone. Required if `region` not set (string)
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The GKE cluster zone. Required if `region` not set (string)
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public ClusterGkeConfigV2Args build() {
            if ($.googleCredentialSecret == null) {
                throw new MissingRequiredPropertyException("ClusterGkeConfigV2Args", "googleCredentialSecret");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ClusterGkeConfigV2Args", "name");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("ClusterGkeConfigV2Args", "projectId");
            }
            return $;
        }
    }

}
