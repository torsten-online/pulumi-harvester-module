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
    public sealed class GetClusterScheduledClusterScanScheduleConfigResult
    {
        public readonly string CronSchedule;
        public readonly int Retention;

        [OutputConstructor]
        private GetClusterScheduledClusterScanScheduleConfigResult(
            string cronSchedule,

            int retention)
        {
            CronSchedule = cronSchedule;
            Retention = retention;
        }
    }
}
