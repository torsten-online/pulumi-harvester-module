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
    public sealed class ClusterRkeConfigDns
    {
        /// <summary>
        /// Linear Autoscaler Params
        /// </summary>
        public readonly Outputs.ClusterRkeConfigDnsLinearAutoscalerParams? LinearAutoscalerParams;
        public readonly ImmutableDictionary<string, object>? NodeSelector;
        /// <summary>
        /// Nodelocal dns
        /// </summary>
        public readonly Outputs.ClusterRkeConfigDnsNodelocal? Nodelocal;
        public readonly ImmutableDictionary<string, object>? Options;
        public readonly string? Provider;
        public readonly ImmutableArray<string> ReverseCidrs;
        /// <summary>
        /// DNS service tolerations
        /// </summary>
        public readonly ImmutableArray<Outputs.ClusterRkeConfigDnsToleration> Tolerations;
        /// <summary>
        /// Update deployment strategy
        /// </summary>
        public readonly Outputs.ClusterRkeConfigDnsUpdateStrategy? UpdateStrategy;
        public readonly ImmutableArray<string> UpstreamNameservers;

        [OutputConstructor]
        private ClusterRkeConfigDns(
            Outputs.ClusterRkeConfigDnsLinearAutoscalerParams? linearAutoscalerParams,

            ImmutableDictionary<string, object>? nodeSelector,

            Outputs.ClusterRkeConfigDnsNodelocal? nodelocal,

            ImmutableDictionary<string, object>? options,

            string? provider,

            ImmutableArray<string> reverseCidrs,

            ImmutableArray<Outputs.ClusterRkeConfigDnsToleration> tolerations,

            Outputs.ClusterRkeConfigDnsUpdateStrategy? updateStrategy,

            ImmutableArray<string> upstreamNameservers)
        {
            LinearAutoscalerParams = linearAutoscalerParams;
            NodeSelector = nodeSelector;
            Nodelocal = nodelocal;
            Options = options;
            Provider = provider;
            ReverseCidrs = reverseCidrs;
            Tolerations = tolerations;
            UpdateStrategy = updateStrategy;
            UpstreamNameservers = upstreamNameservers;
        }
    }
}
