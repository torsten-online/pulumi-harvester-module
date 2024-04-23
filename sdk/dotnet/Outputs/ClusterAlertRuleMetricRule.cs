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
    public sealed class ClusterAlertRuleMetricRule
    {
        /// <summary>
        /// Metric rule comparison
        /// </summary>
        public readonly string? Comparison;
        /// <summary>
        /// Metric rule description
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Metric rule duration
        /// </summary>
        public readonly string Duration;
        /// <summary>
        /// Metric rule expression
        /// </summary>
        public readonly string Expression;
        /// <summary>
        /// Metric rule threshold value
        /// </summary>
        public readonly double ThresholdValue;

        [OutputConstructor]
        private ClusterAlertRuleMetricRule(
            string? comparison,

            string? description,

            string duration,

            string expression,

            double thresholdValue)
        {
            Comparison = comparison;
            Description = description;
            Duration = duration;
            Expression = expression;
            ThresholdValue = thresholdValue;
        }
    }
}
