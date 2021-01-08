// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsLinearAutoscalerParamsArgs : Pulumi.ResourceArgs
    {
        [Input("coresPerReplica")]
        public Input<double>? CoresPerReplica { get; set; }

        [Input("max")]
        public Input<int>? Max { get; set; }

        [Input("min")]
        public Input<int>? Min { get; set; }

        [Input("nodesPerReplica")]
        public Input<double>? NodesPerReplica { get; set; }

        [Input("preventSinglePointFailure")]
        public Input<bool>? PreventSinglePointFailure { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsLinearAutoscalerParamsArgs()
        {
        }
    }
}
