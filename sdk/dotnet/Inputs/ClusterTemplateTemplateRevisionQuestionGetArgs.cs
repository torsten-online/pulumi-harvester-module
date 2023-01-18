// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionQuestionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Default cluster template revision. Default `false` (bool)
        /// </summary>
        [Input("default", required: true)]
        public Input<string> Default { get; set; } = null!;

        /// <summary>
        /// Required variable. Default `false` (bool)
        /// </summary>
        [Input("required")]
        public Input<bool>? Required { get; set; }

        /// <summary>
        /// Variable type. `boolean`, `int` and `string` are allowed. Default `string` (string)
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Variable name (string)
        /// </summary>
        [Input("variable", required: true)]
        public Input<string> Variable { get; set; } = null!;

        public ClusterTemplateTemplateRevisionQuestionGetArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionQuestionGetArgs Empty => new ClusterTemplateTemplateRevisionQuestionGetArgs();
    }
}
