// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Outputs
{

    [OutputType]
    public sealed class ClusterGkeConfigV2
    {
        /// <summary>
        /// The GKE cluster addons (List maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterGkeConfigV2ClusterAddons? ClusterAddons;
        /// <summary>
        /// The GKE ip v4 cidr block (string)
        /// </summary>
        public readonly string? ClusterIpv4CidrBlock;
        /// <summary>
        /// The description for Cluster (string)
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Enable Kubernetes alpha. Default: `false` (bool)
        /// </summary>
        public readonly bool? EnableKubernetesAlpha;
        /// <summary>
        /// Google credential secret (string)
        /// </summary>
        public readonly string GoogleCredentialSecret;
        /// <summary>
        /// Is AKS cluster imported? Defaul: `false` (bool)
        /// 
        /// The following arguments are supported just for creating new AKS clusters (`imported=false`):
        /// </summary>
        public readonly bool? Imported;
        /// <summary>
        /// The GKE ip allocation policy (List maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterGkeConfigV2IpAllocationPolicy? IpAllocationPolicy;
        /// <summary>
        /// K8s version to deploy. Default: `Rancher default` (string) (Note - if rke_config is set at cluster_template, kubernetes_version must be set to the active cluster version so Rancher can clone the RKE template)
        /// </summary>
        public readonly string? KubernetesVersion;
        /// <summary>
        /// Labels for the Cluster (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Labels;
        /// <summary>
        /// Locations for GKE cluster (list)
        /// </summary>
        public readonly ImmutableArray<string> Locations;
        /// <summary>
        /// The GKE cluster logging service (string)
        /// </summary>
        public readonly string? LoggingService;
        /// <summary>
        /// Maintenance window for GKE cluster (string)
        /// </summary>
        public readonly string? MaintenanceWindow;
        /// <summary>
        /// The GKE cluster master authorized networks config (List maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterGkeConfigV2MasterAuthorizedNetworksConfig? MasterAuthorizedNetworksConfig;
        /// <summary>
        /// The GKE cluster monitoring service (string)
        /// </summary>
        public readonly string? MonitoringService;
        /// <summary>
        /// The name of the Cluster (string)
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Kubernetes cluster networking (list maxitems:1)
        /// </summary>
        public readonly string? Network;
        /// <summary>
        /// Is GKE cluster network policy enabled? Default: `false` (bool)
        /// </summary>
        public readonly bool? NetworkPolicyEnabled;
        /// <summary>
        /// The AKS nnode pools. Required if `imported=false` (list)
        /// </summary>
        public readonly ImmutableArray<Outputs.ClusterGkeConfigV2NodePool> NodePools;
        /// <summary>
        /// The GKE private cluster config (List maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterGkeConfigV2PrivateClusterConfig? PrivateClusterConfig;
        /// <summary>
        /// Project ID for GKE cluster (string)
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// The GKE cluster subnetwork. Required for create new cluster (string)
        /// </summary>
        public readonly string? Subnetwork;
        /// <summary>
        /// (string)
        /// </summary>
        public readonly string? Zone;

        [OutputConstructor]
        private ClusterGkeConfigV2(
            Outputs.ClusterGkeConfigV2ClusterAddons? clusterAddons,

            string? clusterIpv4CidrBlock,

            string? description,

            bool? enableKubernetesAlpha,

            string googleCredentialSecret,

            bool? imported,

            Outputs.ClusterGkeConfigV2IpAllocationPolicy? ipAllocationPolicy,

            string? kubernetesVersion,

            ImmutableDictionary<string, object>? labels,

            ImmutableArray<string> locations,

            string? loggingService,

            string? maintenanceWindow,

            Outputs.ClusterGkeConfigV2MasterAuthorizedNetworksConfig? masterAuthorizedNetworksConfig,

            string? monitoringService,

            string name,

            string? network,

            bool? networkPolicyEnabled,

            ImmutableArray<Outputs.ClusterGkeConfigV2NodePool> nodePools,

            Outputs.ClusterGkeConfigV2PrivateClusterConfig? privateClusterConfig,

            string projectId,

            string? region,

            string? subnetwork,

            string? zone)
        {
            ClusterAddons = clusterAddons;
            ClusterIpv4CidrBlock = clusterIpv4CidrBlock;
            Description = description;
            EnableKubernetesAlpha = enableKubernetesAlpha;
            GoogleCredentialSecret = googleCredentialSecret;
            Imported = imported;
            IpAllocationPolicy = ipAllocationPolicy;
            KubernetesVersion = kubernetesVersion;
            Labels = labels;
            Locations = locations;
            LoggingService = loggingService;
            MaintenanceWindow = maintenanceWindow;
            MasterAuthorizedNetworksConfig = masterAuthorizedNetworksConfig;
            MonitoringService = monitoringService;
            Name = name;
            Network = network;
            NetworkPolicyEnabled = networkPolicyEnabled;
            NodePools = nodePools;
            PrivateClusterConfig = privateClusterConfig;
            ProjectId = projectId;
            Region = region;
            Subnetwork = subnetwork;
            Zone = zone;
        }
    }
}
