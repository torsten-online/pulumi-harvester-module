// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigMonitoringUpdateStrategyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Monitoring deployment rolling update (list Maxitems: 1)
        /// </summary>
        [Input("rollingUpdate")]
        public Input<Inputs.ClusterRkeConfigMonitoringUpdateStrategyRollingUpdateArgs>? RollingUpdate { get; set; }

        /// <summary>
        /// Monitoring deployment update strategy (string)
        /// </summary>
        [Input("strategy")]
        public Input<string>? Strategy { get; set; }

        public ClusterRkeConfigMonitoringUpdateStrategyArgs()
        {
        }
        public static new ClusterRkeConfigMonitoringUpdateStrategyArgs Empty => new ClusterRkeConfigMonitoringUpdateStrategyArgs();
    }
}
