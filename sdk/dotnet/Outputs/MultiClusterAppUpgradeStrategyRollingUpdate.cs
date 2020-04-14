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
    public sealed class MultiClusterAppUpgradeStrategyRollingUpdate
    {
        /// <summary>
        /// Rolling update batch size. Default `1` (int)
        /// </summary>
        public readonly int? BatchSize;
        /// <summary>
        /// Rolling update interval. Default `1` (int)
        /// </summary>
        public readonly int? Interval;

        [OutputConstructor]
        private MultiClusterAppUpgradeStrategyRollingUpdate(
            int? batchSize,

            int? interval)
        {
            BatchSize = batchSize;
            Interval = interval;
        }
    }
}
