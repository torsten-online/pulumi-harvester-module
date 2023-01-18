// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class NotifierSlackConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Slack default recipient (string)
        /// </summary>
        [Input("defaultRecipient", required: true)]
        public Input<string> DefaultRecipient { get; set; } = null!;

        /// <summary>
        /// Dingtalk proxy url (string)
        /// </summary>
        [Input("proxyUrl")]
        public Input<string>? ProxyUrl { get; set; }

        /// <summary>
        /// Dingtalk url (string)
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public NotifierSlackConfigArgs()
        {
        }
        public static new NotifierSlackConfigArgs Empty => new NotifierSlackConfigArgs();
    }
}
