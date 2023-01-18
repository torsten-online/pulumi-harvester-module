// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateMemberArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Member access type. Valid values: `["read-only" | "owner"]` (string)
        /// </summary>
        [Input("accessType")]
        public Input<string>? AccessType { get; set; }

        /// <summary>
        /// Member group principal id (string)
        /// </summary>
        [Input("groupPrincipalId")]
        public Input<string>? GroupPrincipalId { get; set; }

        /// <summary>
        /// Member user principal id (string)
        /// </summary>
        [Input("userPrincipalId")]
        public Input<string>? UserPrincipalId { get; set; }

        public ClusterTemplateMemberArgs()
        {
        }
        public static new ClusterTemplateMemberArgs Empty => new ClusterTemplateMemberArgs();
    }
}
