// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterAksConfigV2Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Different authentication API url to use. Default `https://login.microsoftonline.com/` (string)
        /// </summary>
        [Input("authBaseUrl")]
        public Input<string>? AuthBaseUrl { get; set; }

        [Input("authorizedIpRanges")]
        private InputList<string>? _authorizedIpRanges;

        /// <summary>
        /// The AKS authorized ip ranges (list)
        /// </summary>
        public InputList<string> AuthorizedIpRanges
        {
            get => _authorizedIpRanges ?? (_authorizedIpRanges = new InputList<string>());
            set => _authorizedIpRanges = value;
        }

        /// <summary>
        /// Different resource management API url to use. Default `https://management.azure.com/` (string)
        /// </summary>
        [Input("baseUrl")]
        public Input<string>? BaseUrl { get; set; }

        /// <summary>
        /// The AKS Cloud Credential ID to use (string)
        /// </summary>
        [Input("cloudCredentialId", required: true)]
        public Input<string> CloudCredentialId { get; set; } = null!;

        /// <summary>
        /// The AKS dns prefix. Required if `imported=false` (string)
        /// </summary>
        [Input("dnsPrefix")]
        public Input<string>? DnsPrefix { get; set; }

        /// <summary>
        /// Enable AKS http application routing? (bool)
        /// </summary>
        [Input("httpApplicationRouting")]
        public Input<bool>? HttpApplicationRouting { get; set; }

        /// <summary>
        /// Is AKS cluster imported? Defaul: `false` (bool)
        /// 
        /// The following arguments are supported just for creating new AKS clusters (`imported=false`):
        /// </summary>
        [Input("imported")]
        public Input<bool>? Imported { get; set; }

        /// <summary>
        /// K8s version to deploy. Default: `Rancher default` (string) (Note - if rke_config is set at cluster_template, kubernetes_version must be set to the active cluster version so Rancher can clone the RKE template)
        /// </summary>
        [Input("kubernetesVersion")]
        public Input<string>? KubernetesVersion { get; set; }

        /// <summary>
        /// The AKS linux admin username (string)
        /// </summary>
        [Input("linuxAdminUsername")]
        public Input<string>? LinuxAdminUsername { get; set; }

        /// <summary>
        /// The AKS linux ssh public key (string)
        /// </summary>
        [Input("linuxSshPublicKey")]
        public Input<string>? LinuxSshPublicKey { get; set; }

        /// <summary>
        /// Allowed values: `basic` (default) `standard` (string)
        /// </summary>
        [Input("loadBalancerSku")]
        public Input<string>? LoadBalancerSku { get; set; }

        /// <summary>
        /// The AKS log analytics workspace group (string)
        /// </summary>
        [Input("logAnalyticsWorkspaceGroup")]
        public Input<string>? LogAnalyticsWorkspaceGroup { get; set; }

        /// <summary>
        /// The AKS log analytics workspace name (string)
        /// </summary>
        [Input("logAnalyticsWorkspaceName")]
        public Input<string>? LogAnalyticsWorkspaceName { get; set; }

        /// <summary>
        /// Kubernetes cluster monitoring (list maxitems:1)
        /// </summary>
        [Input("monitoring")]
        public Input<bool>? Monitoring { get; set; }

        /// <summary>
        /// The name of the Cluster (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The AKS network dns service ip (string)
        /// </summary>
        [Input("networkDnsServiceIp")]
        public Input<string>? NetworkDnsServiceIp { get; set; }

        /// <summary>
        /// The AKS network docker bridge cidr (string)
        /// </summary>
        [Input("networkDockerBridgeCidr")]
        public Input<string>? NetworkDockerBridgeCidr { get; set; }

        /// <summary>
        /// Network plugin used for building Kubernetes network. Chooses from `azure` or `kubenet`. Default `azure` (string)
        /// </summary>
        [Input("networkPlugin")]
        public Input<string>? NetworkPlugin { get; set; }

        /// <summary>
        /// The AKS network pod cidr (string)
        /// </summary>
        [Input("networkPodCidr")]
        public Input<string>? NetworkPodCidr { get; set; }

        /// <summary>
        /// Network policy used for building Kubernetes network. Chooses from `calico` (string)
        /// </summary>
        [Input("networkPolicy")]
        public Input<string>? NetworkPolicy { get; set; }

        /// <summary>
        /// The AKS network service cidr (string)
        /// </summary>
        [Input("networkServiceCidr")]
        public Input<string>? NetworkServiceCidr { get; set; }

        [Input("nodePools")]
        private InputList<Inputs.ClusterAksConfigV2NodePoolArgs>? _nodePools;

        /// <summary>
        /// The AKS nnode pools. Required if `imported=false` (list)
        /// </summary>
        public InputList<Inputs.ClusterAksConfigV2NodePoolArgs> NodePools
        {
            get => _nodePools ?? (_nodePools = new InputList<Inputs.ClusterAksConfigV2NodePoolArgs>());
            set => _nodePools = value;
        }

        /// <summary>
        /// Is AKS cluster private? (bool)
        /// </summary>
        [Input("privateCluster")]
        public Input<bool>? PrivateCluster { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("resourceGroup", required: true)]
        public Input<string> ResourceGroup { get; set; } = null!;

        /// <summary>
        /// The AKS resource location (string)
        /// </summary>
        [Input("resourceLocation", required: true)]
        public Input<string> ResourceLocation { get; set; } = null!;

        /// <summary>
        /// The name of an existing Azure Virtual Subnet. Composite of agent virtual network subnet ID (string)
        /// </summary>
        [Input("subnet")]
        public Input<string>? Subnet { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// Tags for Kubernetes cluster. For example, `["foo=bar","bar=foo"]` (list)
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The name of an existing Azure Virtual Network. Composite of agent virtual network subnet ID (string)
        /// </summary>
        [Input("virtualNetwork")]
        public Input<string>? VirtualNetwork { get; set; }

        /// <summary>
        /// The resource group of an existing Azure Virtual Network. Composite of agent virtual network subnet ID (string)
        /// </summary>
        [Input("virtualNetworkResourceGroup")]
        public Input<string>? VirtualNetworkResourceGroup { get; set; }

        public ClusterAksConfigV2Args()
        {
        }
        public static new ClusterAksConfigV2Args Empty => new ClusterAksConfigV2Args();
    }
}
