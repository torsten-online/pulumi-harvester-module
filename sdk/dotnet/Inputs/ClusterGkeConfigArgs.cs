// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterGkeConfigArgs : Pulumi.ResourceArgs
    {
        [Input("clusterIpv4Cidr", required: true)]
        public Input<string> ClusterIpv4Cidr { get; set; } = null!;

        [Input("credential", required: true)]
        public Input<string> Credential { get; set; } = null!;

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("diskSizeGb")]
        public Input<int>? DiskSizeGb { get; set; }

        [Input("diskType", required: true)]
        public Input<string> DiskType { get; set; } = null!;

        [Input("enableAlphaFeature")]
        public Input<bool>? EnableAlphaFeature { get; set; }

        [Input("enableAutoRepair")]
        public Input<bool>? EnableAutoRepair { get; set; }

        [Input("enableAutoUpgrade")]
        public Input<bool>? EnableAutoUpgrade { get; set; }

        [Input("enableHorizontalPodAutoscaling")]
        public Input<bool>? EnableHorizontalPodAutoscaling { get; set; }

        [Input("enableHttpLoadBalancing")]
        public Input<bool>? EnableHttpLoadBalancing { get; set; }

        [Input("enableKubernetesDashboard")]
        public Input<bool>? EnableKubernetesDashboard { get; set; }

        [Input("enableLegacyAbac")]
        public Input<bool>? EnableLegacyAbac { get; set; }

        [Input("enableMasterAuthorizedNetwork")]
        public Input<bool>? EnableMasterAuthorizedNetwork { get; set; }

        [Input("enableNetworkPolicyConfig")]
        public Input<bool>? EnableNetworkPolicyConfig { get; set; }

        [Input("enableNodepoolAutoscaling")]
        public Input<bool>? EnableNodepoolAutoscaling { get; set; }

        [Input("enablePrivateEndpoint")]
        public Input<bool>? EnablePrivateEndpoint { get; set; }

        [Input("enablePrivateNodes")]
        public Input<bool>? EnablePrivateNodes { get; set; }

        [Input("enableStackdriverLogging")]
        public Input<bool>? EnableStackdriverLogging { get; set; }

        [Input("enableStackdriverMonitoring")]
        public Input<bool>? EnableStackdriverMonitoring { get; set; }

        [Input("imageType", required: true)]
        public Input<string> ImageType { get; set; } = null!;

        [Input("ipPolicyClusterIpv4CidrBlock", required: true)]
        public Input<string> IpPolicyClusterIpv4CidrBlock { get; set; } = null!;

        [Input("ipPolicyClusterSecondaryRangeName", required: true)]
        public Input<string> IpPolicyClusterSecondaryRangeName { get; set; } = null!;

        [Input("ipPolicyCreateSubnetwork")]
        public Input<bool>? IpPolicyCreateSubnetwork { get; set; }

        [Input("ipPolicyNodeIpv4CidrBlock", required: true)]
        public Input<string> IpPolicyNodeIpv4CidrBlock { get; set; } = null!;

        [Input("ipPolicyServicesIpv4CidrBlock", required: true)]
        public Input<string> IpPolicyServicesIpv4CidrBlock { get; set; } = null!;

        [Input("ipPolicyServicesSecondaryRangeName", required: true)]
        public Input<string> IpPolicyServicesSecondaryRangeName { get; set; } = null!;

        [Input("ipPolicySubnetworkName", required: true)]
        public Input<string> IpPolicySubnetworkName { get; set; } = null!;

        [Input("issueClientCertificate")]
        public Input<bool>? IssueClientCertificate { get; set; }

        [Input("kubernetesDashboard")]
        public Input<bool>? KubernetesDashboard { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        [Input("localSsdCount")]
        public Input<int>? LocalSsdCount { get; set; }

        [Input("locations", required: true)]
        private InputList<string>? _locations;
        public InputList<string> Locations
        {
            get => _locations ?? (_locations = new InputList<string>());
            set => _locations = value;
        }

        [Input("machineType", required: true)]
        public Input<string> MachineType { get; set; } = null!;

        [Input("maintenanceWindow", required: true)]
        public Input<string> MaintenanceWindow { get; set; } = null!;

        [Input("masterAuthorizedNetworkCidrBlocks")]
        private InputList<string>? _masterAuthorizedNetworkCidrBlocks;
        public InputList<string> MasterAuthorizedNetworkCidrBlocks
        {
            get => _masterAuthorizedNetworkCidrBlocks ?? (_masterAuthorizedNetworkCidrBlocks = new InputList<string>());
            set => _masterAuthorizedNetworkCidrBlocks = value;
        }

        [Input("masterIpv4CidrBlock", required: true)]
        public Input<string> MasterIpv4CidrBlock { get; set; } = null!;

        [Input("masterVersion", required: true)]
        public Input<string> MasterVersion { get; set; } = null!;

        [Input("maxNodeCount")]
        public Input<int>? MaxNodeCount { get; set; }

        [Input("minNodeCount")]
        public Input<int>? MinNodeCount { get; set; }

        [Input("network", required: true)]
        public Input<string> Network { get; set; } = null!;

        [Input("nodeCount")]
        public Input<int>? NodeCount { get; set; }

        [Input("nodePool", required: true)]
        public Input<string> NodePool { get; set; } = null!;

        [Input("nodeVersion", required: true)]
        public Input<string> NodeVersion { get; set; } = null!;

        [Input("oauthScopes", required: true)]
        private InputList<string>? _oauthScopes;
        public InputList<string> OauthScopes
        {
            get => _oauthScopes ?? (_oauthScopes = new InputList<string>());
            set => _oauthScopes = value;
        }

        [Input("preemptible")]
        public Input<bool>? Preemptible { get; set; }

        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("resourceLabels")]
        private InputMap<object>? _resourceLabels;
        public InputMap<object> ResourceLabels
        {
            get => _resourceLabels ?? (_resourceLabels = new InputMap<object>());
            set => _resourceLabels = value;
        }

        [Input("serviceAccount", required: true)]
        public Input<string> ServiceAccount { get; set; } = null!;

        [Input("subNetwork", required: true)]
        public Input<string> SubNetwork { get; set; } = null!;

        [Input("taints")]
        private InputList<string>? _taints;
        public InputList<string> Taints
        {
            get => _taints ?? (_taints = new InputList<string>());
            set => _taints = value;
        }

        [Input("useIpAliases")]
        public Input<bool>? UseIpAliases { get; set; }

        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public ClusterGkeConfigArgs()
        {
        }
    }
}
