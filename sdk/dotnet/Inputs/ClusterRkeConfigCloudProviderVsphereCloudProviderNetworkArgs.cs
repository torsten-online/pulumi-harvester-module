// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigCloudProviderVsphereCloudProviderNetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (string)
        /// </summary>
        [Input("publicNetwork")]
        public Input<string>? PublicNetwork { get; set; }

        public ClusterRkeConfigCloudProviderVsphereCloudProviderNetworkArgs()
        {
        }
        public static new ClusterRkeConfigCloudProviderVsphereCloudProviderNetworkArgs Empty => new ClusterRkeConfigCloudProviderVsphereCloudProviderNetworkArgs();
    }
}
