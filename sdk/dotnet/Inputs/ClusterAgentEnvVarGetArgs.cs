// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterAgentEnvVarGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Cluster (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public ClusterAgentEnvVarGetArgs()
        {
        }
        public static new ClusterAgentEnvVarGetArgs Empty => new ClusterAgentEnvVarGetArgs();
    }
}
