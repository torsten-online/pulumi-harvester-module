// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterClusterTemplateQuestionGetArgs : Pulumi.ResourceArgs
    {
        [Input("default", required: true)]
        public Input<string> Default { get; set; } = null!;

        [Input("required")]
        public Input<bool>? Required { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("variable", required: true)]
        public Input<string> Variable { get; set; } = null!;

        public ClusterClusterTemplateQuestionGetArgs()
        {
        }
    }
}
