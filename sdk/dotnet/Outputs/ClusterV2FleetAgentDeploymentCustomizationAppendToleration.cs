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
    public sealed class ClusterV2FleetAgentDeploymentCustomizationAppendToleration
    {
        public readonly string? Effect;
        public readonly string Key;
        public readonly string? Operator;
        public readonly int? Seconds;
        public readonly string? Value;

        [OutputConstructor]
        private ClusterV2FleetAgentDeploymentCustomizationAppendToleration(
            string? effect,

            string key,

            string? @operator,

            int? seconds,

            string? value)
        {
            Effect = effect;
            Key = key;
            Operator = @operator;
            Seconds = seconds;
            Value = value;
        }
    }
}
