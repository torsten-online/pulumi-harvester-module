// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigNetworkCalicoNetworkProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// RKE options for Calico network provider (string)
        /// </summary>
        [Input("cloudProvider")]
        public Input<string>? CloudProvider { get; set; }

        public ClusterRkeConfigNetworkCalicoNetworkProviderArgs()
        {
        }
        public static new ClusterRkeConfigNetworkCalicoNetworkProviderArgs Empty => new ClusterRkeConfigNetworkCalicoNetworkProviderArgs();
    }
}
