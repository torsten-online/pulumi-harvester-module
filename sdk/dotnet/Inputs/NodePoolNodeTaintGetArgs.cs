// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class NodePoolNodeTaintGetArgs : Pulumi.ResourceArgs
    {
        [Input("effect")]
        public Input<string>? Effect { get; set; }

        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("timeAdded")]
        public Input<string>? TimeAdded { get; set; }

        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public NodePoolNodeTaintGetArgs()
        {
        }
    }
}
