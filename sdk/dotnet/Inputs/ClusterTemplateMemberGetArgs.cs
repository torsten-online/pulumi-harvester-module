// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateMemberGetArgs : Pulumi.ResourceArgs
    {
        [Input("accessType")]
        public Input<string>? AccessType { get; set; }

        [Input("groupPrincipalId")]
        public Input<string>? GroupPrincipalId { get; set; }

        [Input("userPrincipalId")]
        public Input<string>? UserPrincipalId { get; set; }

        public ClusterTemplateMemberGetArgs()
        {
        }
    }
}
