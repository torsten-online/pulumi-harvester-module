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
    public sealed class ClusterAlertRuleNodeRule
    {
        /// <summary>
        /// Node rule condition
        /// </summary>
        public readonly string? Condition;
        /// <summary>
        /// Node rule cpu threshold
        /// </summary>
        public readonly int? CpuThreshold;
        /// <summary>
        /// Node rule mem threshold
        /// </summary>
        public readonly int? MemThreshold;
        /// <summary>
        /// Node ID
        /// </summary>
        public readonly string? NodeId;
        /// <summary>
        /// Node rule selector
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Selector;

        [OutputConstructor]
        private ClusterAlertRuleNodeRule(
            string? condition,

            int? cpuThreshold,

            int? memThreshold,

            string? nodeId,

            ImmutableDictionary<string, object>? selector)
        {
            Condition = condition;
            CpuThreshold = cpuThreshold;
            MemThreshold = memThreshold;
            NodeId = nodeId;
            Selector = selector;
        }
    }
}
