// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterClusterTemplateAnswersArgs : Pulumi.ResourceArgs
    {
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("values")]
        private InputMap<object>? _values;
        public InputMap<object> Values
        {
            get => _values ?? (_values = new InputMap<object>());
            set => _values = value;
        }

        public ClusterClusterTemplateAnswersArgs()
        {
        }
    }
}
