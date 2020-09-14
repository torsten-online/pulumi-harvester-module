// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class NotifierWechatConfigGetArgs : Pulumi.ResourceArgs
    {
        [Input("agent", required: true)]
        public Input<string> Agent { get; set; } = null!;

        [Input("corp", required: true)]
        public Input<string> Corp { get; set; } = null!;

        [Input("defaultRecipient", required: true)]
        public Input<string> DefaultRecipient { get; set; } = null!;

        [Input("proxyUrl")]
        public Input<string>? ProxyUrl { get; set; }

        [Input("recipientType")]
        public Input<string>? RecipientType { get; set; }

        [Input("secret", required: true)]
        public Input<string> Secret { get; set; } = null!;

        public NotifierWechatConfigGetArgs()
        {
        }
    }
}
