// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterGkeConfigV2NodePoolAutoscalingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable etcd backup (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Maximum number of nodes in the NodePool. Must be &gt;= minNodeCount. There has to enough quota to scale up the cluster. Default `0` (int)
        /// </summary>
        [Input("maxNodeCount")]
        public Input<int>? MaxNodeCount { get; set; }

        /// <summary>
        /// Minimmum number of nodes in the NodePool. Must be &gt;= 1 and &lt;= maxNodeCount. Default `0` (int)
        /// </summary>
        [Input("minNodeCount")]
        public Input<int>? MinNodeCount { get; set; }

        public ClusterGkeConfigV2NodePoolAutoscalingArgs()
        {
        }
        public static new ClusterGkeConfigV2NodePoolAutoscalingArgs Empty => new ClusterGkeConfigV2NodePoolAutoscalingArgs();
    }
}
