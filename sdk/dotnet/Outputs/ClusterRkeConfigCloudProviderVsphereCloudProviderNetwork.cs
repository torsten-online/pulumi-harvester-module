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
    public sealed class ClusterRkeConfigCloudProviderVsphereCloudProviderNetwork
    {
        public readonly string? PublicNetwork;

        [OutputConstructor]
        private ClusterRkeConfigCloudProviderVsphereCloudProviderNetwork(string? publicNetwork)
        {
            PublicNetwork = publicNetwork;
        }
    }
}
