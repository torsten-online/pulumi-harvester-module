// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class GetNotifierMsteamsConfigInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("proxyUrl")]
        public Input<string>? ProxyUrl { get; set; }

        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public GetNotifierMsteamsConfigInputArgs()
        {
        }
        public static new GetNotifierMsteamsConfigInputArgs Empty => new GetNotifierMsteamsConfigInputArgs();
    }
}
