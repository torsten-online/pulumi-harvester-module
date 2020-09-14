// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ProjectAlertRuleWorkloadRuleGetArgs : Pulumi.ResourceArgs
    {
        [Input("availablePercentage")]
        public Input<int>? AvailablePercentage { get; set; }

        [Input("selector")]
        private InputMap<object>? _selector;
        public InputMap<object> Selector
        {
            get => _selector ?? (_selector = new InputMap<object>());
            set => _selector = value;
        }

        [Input("workloadId")]
        public Input<string>? WorkloadId { get; set; }

        public ProjectAlertRuleWorkloadRuleGetArgs()
        {
        }
    }
}
