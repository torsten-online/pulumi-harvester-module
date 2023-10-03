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
    public sealed class ClusterV2RkeConfigUpgradeStrategyControlPlaneDrainOptions
    {
        /// <summary>
        /// Drain options delete empty dir data. Default `false` (bool)
        /// </summary>
        public readonly bool? DeleteEmptyDirData;
        /// <summary>
        /// Drain options disable eviction. Default `false` (bool)
        /// </summary>
        public readonly bool? DisableEviction;
        /// <summary>
        /// Drain options enabled? Default `true` (bool)
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Drain options force. Default `false` (bool)
        /// </summary>
        public readonly bool? Force;
        /// <summary>
        /// Drain options grace period (int)
        /// </summary>
        public readonly int? GracePeriod;
        /// <summary>
        /// Drain options ignore daemon sets. Default `true` (bool)
        /// </summary>
        public readonly bool? IgnoreDaemonSets;
        /// <summary>
        /// Drain options ignore errors. Default `false` (bool)
        /// </summary>
        public readonly bool? IgnoreErrors;
        /// <summary>
        /// Drain options skip wait for delete timeout seconds (int)
        /// </summary>
        public readonly int? SkipWaitForDeleteTimeoutSeconds;
        /// <summary>
        /// Drain options timeout (int)
        /// </summary>
        public readonly int? Timeout;

        [OutputConstructor]
        private ClusterV2RkeConfigUpgradeStrategyControlPlaneDrainOptions(
            bool? deleteEmptyDirData,

            bool? disableEviction,

            bool? enabled,

            bool? force,

            int? gracePeriod,

            bool? ignoreDaemonSets,

            bool? ignoreErrors,

            int? skipWaitForDeleteTimeoutSeconds,

            int? timeout)
        {
            DeleteEmptyDirData = deleteEmptyDirData;
            DisableEviction = disableEviction;
            Enabled = enabled;
            Force = force;
            GracePeriod = gracePeriod;
            IgnoreDaemonSets = ignoreDaemonSets;
            IgnoreErrors = ignoreErrors;
            SkipWaitForDeleteTimeoutSeconds = skipWaitForDeleteTimeoutSeconds;
            Timeout = timeout;
        }
    }
}
