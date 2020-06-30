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
    public sealed class GetClusterRkeConfigMonitoringResult
    {
        public readonly ImmutableDictionary<string, object>? NodeSelector;
        public readonly ImmutableDictionary<string, object> Options;
        public readonly string Provider;
        public readonly int Replicas;
        public readonly Outputs.GetClusterRkeConfigMonitoringUpdateStrategyResult? UpdateStrategy;

        [OutputConstructor]
        private GetClusterRkeConfigMonitoringResult(
            ImmutableDictionary<string, object>? nodeSelector,

            ImmutableDictionary<string, object> options,

            string provider,

            int replicas,

            Outputs.GetClusterRkeConfigMonitoringUpdateStrategyResult? updateStrategy)
        {
            NodeSelector = nodeSelector;
            Options = options;
            Provider = provider;
            Replicas = replicas;
            UpdateStrategy = updateStrategy;
        }
    }
}
