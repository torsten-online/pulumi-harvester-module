// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverrideArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// GKE cluster region. Conflicts with `zone` (string)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        /// <summary>
        /// (string)
        /// </summary>
        [Input("signingMethod")]
        public Input<string>? SigningMethod { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("signingName")]
        public Input<string>? SigningName { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("signingRegion")]
        public Input<string>? SigningRegion { get; set; }

        /// <summary>
        /// Registry URL (string)
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverrideArgs()
        {
        }
    }
}
