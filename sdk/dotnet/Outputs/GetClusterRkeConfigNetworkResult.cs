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
    public sealed class GetClusterRkeConfigNetworkResult
    {
        public readonly Outputs.GetClusterRkeConfigNetworkAciNetworkProviderResult? AciNetworkProvider;
        public readonly Outputs.GetClusterRkeConfigNetworkCalicoNetworkProviderResult? CalicoNetworkProvider;
        public readonly Outputs.GetClusterRkeConfigNetworkCanalNetworkProviderResult? CanalNetworkProvider;
        public readonly Outputs.GetClusterRkeConfigNetworkFlannelNetworkProviderResult? FlannelNetworkProvider;
        public readonly int? Mtu;
        public readonly ImmutableDictionary<string, object> Options;
        public readonly string Plugin;
        public readonly ImmutableArray<Outputs.GetClusterRkeConfigNetworkTolerationResult> Tolerations;
        public readonly Outputs.GetClusterRkeConfigNetworkWeaveNetworkProviderResult? WeaveNetworkProvider;

        [OutputConstructor]
        private GetClusterRkeConfigNetworkResult(
            Outputs.GetClusterRkeConfigNetworkAciNetworkProviderResult? aciNetworkProvider,

            Outputs.GetClusterRkeConfigNetworkCalicoNetworkProviderResult? calicoNetworkProvider,

            Outputs.GetClusterRkeConfigNetworkCanalNetworkProviderResult? canalNetworkProvider,

            Outputs.GetClusterRkeConfigNetworkFlannelNetworkProviderResult? flannelNetworkProvider,

            int? mtu,

            ImmutableDictionary<string, object> options,

            string plugin,

            ImmutableArray<Outputs.GetClusterRkeConfigNetworkTolerationResult> tolerations,

            Outputs.GetClusterRkeConfigNetworkWeaveNetworkProviderResult? weaveNetworkProvider)
        {
            AciNetworkProvider = aciNetworkProvider;
            CalicoNetworkProvider = calicoNetworkProvider;
            CanalNetworkProvider = canalNetworkProvider;
            FlannelNetworkProvider = flannelNetworkProvider;
            Mtu = mtu;
            Options = options;
            Plugin = plugin;
            Tolerations = tolerations;
            WeaveNetworkProvider = weaveNetworkProvider;
        }
    }
}
