// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterGkeConfigGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP address range of the container pods (string)
        /// </summary>
        [Input("clusterIpv4Cidr", required: true)]
        public Input<string> ClusterIpv4Cidr { get; set; } = null!;

        /// <summary>
        /// The contents of the GC credential file (string)
        /// </summary>
        [Input("credential", required: true)]
        public Input<string> Credential { get; set; } = null!;

        /// <summary>
        /// An optional description of this cluster (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Size of the disk attached to each node. Default `100` (int)
        /// </summary>
        [Input("diskSizeGb")]
        public Input<int>? DiskSizeGb { get; set; }

        /// <summary>
        /// Type of the disk attached to each node (string)
        /// </summary>
        [Input("diskType", required: true)]
        public Input<string> DiskType { get; set; } = null!;

        /// <summary>
        /// To enable Kubernetes alpha feature. Default `true` (bool)
        /// </summary>
        [Input("enableAlphaFeature")]
        public Input<bool>? EnableAlphaFeature { get; set; }

        /// <summary>
        /// Specifies whether the node auto-repair is enabled for the node pool. Default `false` (bool)
        /// </summary>
        [Input("enableAutoRepair")]
        public Input<bool>? EnableAutoRepair { get; set; }

        /// <summary>
        /// Specifies whether node auto-upgrade is enabled for the node pool. Default `false` (bool)
        /// </summary>
        [Input("enableAutoUpgrade")]
        public Input<bool>? EnableAutoUpgrade { get; set; }

        /// <summary>
        /// Enable horizontal pod autoscaling for the cluster. Default `true` (bool)
        /// </summary>
        [Input("enableHorizontalPodAutoscaling")]
        public Input<bool>? EnableHorizontalPodAutoscaling { get; set; }

        /// <summary>
        /// Enable HTTP load balancing on GKE cluster. Default `true` (bool)
        /// </summary>
        [Input("enableHttpLoadBalancing")]
        public Input<bool>? EnableHttpLoadBalancing { get; set; }

        /// <summary>
        /// Whether to enable the Kubernetes dashboard. Default `false` (bool)
        /// </summary>
        [Input("enableKubernetesDashboard")]
        public Input<bool>? EnableKubernetesDashboard { get; set; }

        /// <summary>
        /// Whether to enable legacy abac on the cluster. Default `false` (bool)
        /// </summary>
        [Input("enableLegacyAbac")]
        public Input<bool>? EnableLegacyAbac { get; set; }

        [Input("enableMasterAuthorizedNetwork")]
        public Input<bool>? EnableMasterAuthorizedNetwork { get; set; }

        /// <summary>
        /// Enable stackdriver logging. Default `true` (bool)
        /// </summary>
        [Input("enableNetworkPolicyConfig")]
        public Input<bool>? EnableNetworkPolicyConfig { get; set; }

        /// <summary>
        /// Enable nodepool autoscaling. Default `false` (bool)
        /// </summary>
        [Input("enableNodepoolAutoscaling")]
        public Input<bool>? EnableNodepoolAutoscaling { get; set; }

        /// <summary>
        /// Whether the master's internal IP address is used as the cluster endpoint. Default `false` (bool)
        /// </summary>
        [Input("enablePrivateEndpoint")]
        public Input<bool>? EnablePrivateEndpoint { get; set; }

        /// <summary>
        /// Whether nodes have internal IP address only. Default `false` (bool)
        /// </summary>
        [Input("enablePrivateNodes")]
        public Input<bool>? EnablePrivateNodes { get; set; }

        /// <summary>
        /// Enable stackdriver monitoring. Default `true` (bool)
        /// </summary>
        [Input("enableStackdriverLogging")]
        public Input<bool>? EnableStackdriverLogging { get; set; }

        /// <summary>
        /// Enable stackdriver monitoring on GKE cluster (bool)
        /// </summary>
        [Input("enableStackdriverMonitoring")]
        public Input<bool>? EnableStackdriverMonitoring { get; set; }

        /// <summary>
        /// The image to use for the worker nodes (string)
        /// </summary>
        [Input("imageType", required: true)]
        public Input<string> ImageType { get; set; } = null!;

        /// <summary>
        /// The IP address range for the cluster pod IPs (string)
        /// </summary>
        [Input("ipPolicyClusterIpv4CidrBlock", required: true)]
        public Input<string> IpPolicyClusterIpv4CidrBlock { get; set; } = null!;

        /// <summary>
        /// The name of the secondary range to be used for the cluster CIDR block (string)
        /// </summary>
        [Input("ipPolicyClusterSecondaryRangeName", required: true)]
        public Input<string> IpPolicyClusterSecondaryRangeName { get; set; } = null!;

        /// <summary>
        /// Whether a new subnetwork will be created automatically for the cluster. Default `false` (bool)
        /// </summary>
        [Input("ipPolicyCreateSubnetwork")]
        public Input<bool>? IpPolicyCreateSubnetwork { get; set; }

        /// <summary>
        /// The IP address range of the instance IPs in this cluster (string)
        /// </summary>
        [Input("ipPolicyNodeIpv4CidrBlock", required: true)]
        public Input<string> IpPolicyNodeIpv4CidrBlock { get; set; } = null!;

        /// <summary>
        /// The IP address range of the services IPs in this cluster (string)
        /// </summary>
        [Input("ipPolicyServicesIpv4CidrBlock", required: true)]
        public Input<string> IpPolicyServicesIpv4CidrBlock { get; set; } = null!;

        /// <summary>
        /// The name of the secondary range to be used for the services CIDR block (string)
        /// </summary>
        [Input("ipPolicyServicesSecondaryRangeName", required: true)]
        public Input<string> IpPolicyServicesSecondaryRangeName { get; set; } = null!;

        /// <summary>
        /// A custom subnetwork name to be used if createSubnetwork is true (string)
        /// </summary>
        [Input("ipPolicySubnetworkName", required: true)]
        public Input<string> IpPolicySubnetworkName { get; set; } = null!;

        /// <summary>
        /// Issue a client certificate. Default `false` (bool)
        /// </summary>
        [Input("issueClientCertificate")]
        public Input<bool>? IssueClientCertificate { get; set; }

        /// <summary>
        /// Enable the Kubernetes dashboard. Default `false` (bool)
        /// </summary>
        [Input("kubernetesDashboard")]
        public Input<bool>? KubernetesDashboard { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for cluster registration token object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The number of local SSD disks to be attached to the node. Default `0` (int)
        /// </summary>
        [Input("localSsdCount")]
        public Input<int>? LocalSsdCount { get; set; }

        [Input("locations", required: true)]
        private InputList<string>? _locations;

        /// <summary>
        /// Locations for GKE cluster (list)
        /// </summary>
        public InputList<string> Locations
        {
            get => _locations ?? (_locations = new InputList<string>());
            set => _locations = value;
        }

        /// <summary>
        /// Machine type for GKE cluster (string)
        /// </summary>
        [Input("machineType", required: true)]
        public Input<string> MachineType { get; set; } = null!;

        /// <summary>
        /// Maintenance window for GKE cluster (string)
        /// </summary>
        [Input("maintenanceWindow", required: true)]
        public Input<string> MaintenanceWindow { get; set; } = null!;

        [Input("masterAuthorizedNetworkCidrBlocks")]
        private InputList<string>? _masterAuthorizedNetworkCidrBlocks;

        /// <summary>
        /// Define up to 10 external networks that could access Kubernetes master through HTTPS (list)
        /// </summary>
        public InputList<string> MasterAuthorizedNetworkCidrBlocks
        {
            get => _masterAuthorizedNetworkCidrBlocks ?? (_masterAuthorizedNetworkCidrBlocks = new InputList<string>());
            set => _masterAuthorizedNetworkCidrBlocks = value;
        }

        /// <summary>
        /// The IP range in CIDR notation to use for the hosted master network (string)
        /// </summary>
        [Input("masterIpv4CidrBlock", required: true)]
        public Input<string> MasterIpv4CidrBlock { get; set; } = null!;

        /// <summary>
        /// Master version for GKE cluster (string)
        /// </summary>
        [Input("masterVersion", required: true)]
        public Input<string> MasterVersion { get; set; } = null!;

        /// <summary>
        /// Maximum number of nodes in the NodePool. Must be &gt;= minNodeCount. There has to enough quota to scale up the cluster. Default `0` (int)
        /// </summary>
        [Input("maxNodeCount")]
        public Input<int>? MaxNodeCount { get; set; }

        /// <summary>
        /// Minimmum number of nodes in the NodePool. Must be &gt;= 1 and &lt;= maxNodeCount. Default `0` (int)
        /// </summary>
        [Input("minNodeCount")]
        public Input<int>? MinNodeCount { get; set; }

        /// <summary>
        /// Network for GKE cluster (string)
        /// </summary>
        [Input("network", required: true)]
        public Input<string> Network { get; set; } = null!;

        /// <summary>
        /// Node count for GKE cluster. Default `3` (int)
        /// </summary>
        [Input("nodeCount")]
        public Input<int>? NodeCount { get; set; }

        /// <summary>
        /// The ID of the cluster node pool (string)
        /// </summary>
        [Input("nodePool", required: true)]
        public Input<string> NodePool { get; set; } = null!;

        /// <summary>
        /// Node version for GKE cluster (string)
        /// </summary>
        [Input("nodeVersion", required: true)]
        public Input<string> NodeVersion { get; set; } = null!;

        [Input("oauthScopes", required: true)]
        private InputList<string>? _oauthScopes;

        /// <summary>
        /// The set of Google API scopes to be made available on all of the node VMs under the default service account (list)
        /// </summary>
        public InputList<string> OauthScopes
        {
            get => _oauthScopes ?? (_oauthScopes = new InputList<string>());
            set => _oauthScopes = value;
        }

        /// <summary>
        /// Whether the nodes are created as preemptible VM instances. Default `false` (bool)
        /// </summary>
        [Input("preemptible")]
        public Input<bool>? Preemptible { get; set; }

        /// <summary>
        /// Project ID to apply answer (string)
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        [Input("resourceLabels")]
        private InputMap<object>? _resourceLabels;

        /// <summary>
        /// The map of Kubernetes labels to be applied to each cluster (map)
        /// </summary>
        public InputMap<object> ResourceLabels
        {
            get => _resourceLabels ?? (_resourceLabels = new InputMap<object>());
            set => _resourceLabels = value;
        }

        /// <summary>
        /// The Google Cloud Platform Service Account to be used by the node VMs (string)
        /// </summary>
        [Input("serviceAccount", required: true)]
        public Input<string> ServiceAccount { get; set; } = null!;

        /// <summary>
        /// Subnetwork for GKE cluster (string)
        /// </summary>
        [Input("subNetwork", required: true)]
        public Input<string> SubNetwork { get; set; } = null!;

        [Input("taints")]
        private InputList<string>? _taints;

        /// <summary>
        /// List of Kubernetes taints to be applied to each node (list)
        /// </summary>
        public InputList<string> Taints
        {
            get => _taints ?? (_taints = new InputList<string>());
            set => _taints = value;
        }

        /// <summary>
        /// Whether alias IPs will be used for pod IPs in the cluster. Default `false` (bool)
        /// </summary>
        [Input("useIpAliases")]
        public Input<bool>? UseIpAliases { get; set; }

        /// <summary>
        /// Zone GKE cluster (string)
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public ClusterGkeConfigGetArgs()
        {
        }
    }
}
