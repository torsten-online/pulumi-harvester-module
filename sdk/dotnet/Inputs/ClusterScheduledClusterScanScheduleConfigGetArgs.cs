// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterScheduledClusterScanScheduleConfigGetArgs : Pulumi.ResourceArgs
    {
        [Input("cronSchedule", required: true)]
        public Input<string> CronSchedule { get; set; } = null!;

        [Input("retention")]
        public Input<int>? Retention { get; set; }

        public ClusterScheduledClusterScanScheduleConfigGetArgs()
        {
        }
    }
}
