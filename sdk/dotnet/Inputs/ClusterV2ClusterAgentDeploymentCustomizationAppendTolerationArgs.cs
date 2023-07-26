// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2ClusterAgentDeploymentCustomizationAppendTolerationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The taint effect. Default: `\"NoExecute\"` (string)
        /// </summary>
        [Input("effect")]
        public Input<string>? Effect { get; set; }

        /// <summary>
        /// The taint key (string)
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// Machine selector label match expressions operator (string)
        /// </summary>
        [Input("operator")]
        public Input<string>? Operator { get; set; }

        [Input("seconds")]
        public Input<int>? Seconds { get; set; }

        /// <summary>
        /// Rancher agent env var value (string)
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ClusterV2ClusterAgentDeploymentCustomizationAppendTolerationArgs()
        {
        }
        public static new ClusterV2ClusterAgentDeploymentCustomizationAppendTolerationArgs Empty => new ClusterV2ClusterAgentDeploymentCustomizationAppendTolerationArgs();
    }
}
