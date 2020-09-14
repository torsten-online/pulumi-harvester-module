// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigMonitoringArgs : Pulumi.ResourceArgs
    {
        [Input("nodeSelector")]
        private InputMap<object>? _nodeSelector;
        public InputMap<object> NodeSelector
        {
            get => _nodeSelector ?? (_nodeSelector = new InputMap<object>());
            set => _nodeSelector = value;
        }

        [Input("options")]
        private InputMap<object>? _options;
        public InputMap<object> Options
        {
            get => _options ?? (_options = new InputMap<object>());
            set => _options = value;
        }

        [Input("provider")]
        public Input<string>? Provider { get; set; }

        [Input("replicas")]
        public Input<int>? Replicas { get; set; }

        [Input("updateStrategy")]
        public Input<Inputs.ClusterRkeConfigMonitoringUpdateStrategyArgs>? UpdateStrategy { get; set; }

        public ClusterRkeConfigMonitoringArgs()
        {
        }
    }
}
