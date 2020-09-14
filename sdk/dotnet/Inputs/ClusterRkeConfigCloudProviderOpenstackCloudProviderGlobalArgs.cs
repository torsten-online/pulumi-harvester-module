// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs : Pulumi.ResourceArgs
    {
        [Input("authUrl", required: true)]
        public Input<string> AuthUrl { get; set; } = null!;

        [Input("caFile")]
        public Input<string>? CaFile { get; set; }

        [Input("domainId")]
        public Input<string>? DomainId { get; set; }

        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        [Input("password", required: true)]
        public Input<string> Password { get; set; } = null!;

        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        [Input("tenantName")]
        public Input<string>? TenantName { get; set; }

        [Input("trustId")]
        public Input<string>? TrustId { get; set; }

        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public ClusterRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs()
        {
        }
    }
}
