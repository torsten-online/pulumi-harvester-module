// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class GlobalDnsProviderAlidnsConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessKey", required: true)]
        public Input<string> AccessKey { get; set; } = null!;

        [Input("secretKey", required: true)]
        public Input<string> SecretKey { get; set; } = null!;

        public GlobalDnsProviderAlidnsConfigGetArgs()
        {
        }
        public static new GlobalDnsProviderAlidnsConfigGetArgs Empty => new GlobalDnsProviderAlidnsConfigGetArgs();
    }
}
