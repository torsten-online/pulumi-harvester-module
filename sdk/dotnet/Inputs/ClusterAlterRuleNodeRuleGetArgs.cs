// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterAlterRuleNodeRuleGetArgs : Pulumi.ResourceArgs
    {
        [Input("condition")]
        public Input<string>? Condition { get; set; }

        [Input("cpuThreshold")]
        public Input<int>? CpuThreshold { get; set; }

        [Input("memThreshold")]
        public Input<int>? MemThreshold { get; set; }

        [Input("nodeId")]
        public Input<string>? NodeId { get; set; }

        [Input("selector")]
        private InputMap<object>? _selector;
        public InputMap<object> Selector
        {
            get => _selector ?? (_selector = new InputMap<object>());
            set => _selector = value;
        }

        public ClusterAlterRuleNodeRuleGetArgs()
        {
        }
    }
}
