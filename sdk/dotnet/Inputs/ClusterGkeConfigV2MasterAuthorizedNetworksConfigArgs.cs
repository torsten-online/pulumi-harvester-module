// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("cidrBlocks", required: true)]
        private InputList<Inputs.ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs>? _cidrBlocks;

        /// <summary>
        /// The GKE master authorized network config cidr blocks
        /// </summary>
        public InputList<Inputs.ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs> CidrBlocks
        {
            get => _cidrBlocks ?? (_cidrBlocks = new InputList<Inputs.ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlockArgs>());
            set => _cidrBlocks = value;
        }

        /// <summary>
        /// Enable GKE master authorized network config
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs()
        {
        }
        public static new ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs Empty => new ClusterGkeConfigV2MasterAuthorizedNetworksConfigArgs();
    }
}
