// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ProjectContainerResourceLimitArgs : Pulumi.ResourceArgs
    {
        [Input("limitsCpu")]
        public Input<string>? LimitsCpu { get; set; }

        [Input("limitsMemory")]
        public Input<string>? LimitsMemory { get; set; }

        [Input("requestsCpu")]
        public Input<string>? RequestsCpu { get; set; }

        [Input("requestsMemory")]
        public Input<string>? RequestsMemory { get; set; }

        public ProjectContainerResourceLimitArgs()
        {
        }
    }
}
