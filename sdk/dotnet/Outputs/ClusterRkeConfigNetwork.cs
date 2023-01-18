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
    public sealed class ClusterRkeConfigNetwork
    {
        /// <summary>
        /// ACI provider config for RKE network (list maxitems:63)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigNetworkAciNetworkProvider? AciNetworkProvider;
        /// <summary>
        /// Calico provider config for RKE network (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigNetworkCalicoNetworkProvider? CalicoNetworkProvider;
        /// <summary>
        /// Canal provider config for RKE network (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigNetworkCanalNetworkProvider? CanalNetworkProvider;
        /// <summary>
        /// Flannel provider config for RKE network (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigNetworkFlannelNetworkProvider? FlannelNetworkProvider;
        /// <summary>
        /// Network provider MTU. Default `0` (int)
        /// </summary>
        public readonly int? Mtu;
        /// <summary>
        /// RKE options for authorization (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Options;
        /// <summary>
        /// Plugin for RKE network. `canal` (default), `flannel`, `calico`, `none` and `weave` are supported. (string)
        /// </summary>
        public readonly string? Plugin;
        /// <summary>
        /// DNS add-on tolerations (list)
        /// </summary>
        public readonly ImmutableArray<Outputs.ClusterRkeConfigNetworkToleration> Tolerations;
        /// <summary>
        /// Weave provider config for RKE network (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigNetworkWeaveNetworkProvider? WeaveNetworkProvider;

        [OutputConstructor]
        private ClusterRkeConfigNetwork(
            Outputs.ClusterRkeConfigNetworkAciNetworkProvider? aciNetworkProvider,

            Outputs.ClusterRkeConfigNetworkCalicoNetworkProvider? calicoNetworkProvider,

            Outputs.ClusterRkeConfigNetworkCanalNetworkProvider? canalNetworkProvider,

            Outputs.ClusterRkeConfigNetworkFlannelNetworkProvider? flannelNetworkProvider,

            int? mtu,

            ImmutableDictionary<string, object>? options,

            string? plugin,

            ImmutableArray<Outputs.ClusterRkeConfigNetworkToleration> tolerations,

            Outputs.ClusterRkeConfigNetworkWeaveNetworkProvider? weaveNetworkProvider)
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
