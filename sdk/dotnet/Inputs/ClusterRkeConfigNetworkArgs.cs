// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigNetworkArgs : Pulumi.ResourceArgs
    {
        [Input("calicoNetworkProvider")]
        public Input<Inputs.ClusterRkeConfigNetworkCalicoNetworkProviderArgs>? CalicoNetworkProvider { get; set; }

        [Input("canalNetworkProvider")]
        public Input<Inputs.ClusterRkeConfigNetworkCanalNetworkProviderArgs>? CanalNetworkProvider { get; set; }

        [Input("flannelNetworkProvider")]
        public Input<Inputs.ClusterRkeConfigNetworkFlannelNetworkProviderArgs>? FlannelNetworkProvider { get; set; }

        [Input("mtu")]
        public Input<int>? Mtu { get; set; }

        [Input("options")]
        private InputMap<object>? _options;
        public InputMap<object> Options
        {
            get => _options ?? (_options = new InputMap<object>());
            set => _options = value;
        }

        [Input("plugin")]
        public Input<string>? Plugin { get; set; }

        [Input("weaveNetworkProvider")]
        public Input<Inputs.ClusterRkeConfigNetworkWeaveNetworkProviderArgs>? WeaveNetworkProvider { get; set; }

        public ClusterRkeConfigNetworkArgs()
        {
        }
    }
}
