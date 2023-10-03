// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class NotifierWechatConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Wechat agent ID (string)
        /// </summary>
        [Input("agent", required: true)]
        public Input<string> Agent { get; set; } = null!;

        /// <summary>
        /// Wechat corporation ID (string)
        /// </summary>
        [Input("corp", required: true)]
        public Input<string> Corp { get; set; } = null!;

        /// <summary>
        /// Wechat default recipient (string)
        /// </summary>
        [Input("defaultRecipient", required: true)]
        public Input<string> DefaultRecipient { get; set; } = null!;

        /// <summary>
        /// Wechat proxy url (string)
        /// </summary>
        [Input("proxyUrl")]
        public Input<string>? ProxyUrl { get; set; }

        /// <summary>
        /// Wechat recipient type. Allowed values: `party` | `tag` | `user` (string)
        /// </summary>
        [Input("recipientType")]
        public Input<string>? RecipientType { get; set; }

        [Input("secret", required: true)]
        private Input<string>? _secret;

        /// <summary>
        /// Wechat agent ID (string)
        /// </summary>
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public NotifierWechatConfigArgs()
        {
        }
        public static new NotifierWechatConfigArgs Empty => new NotifierWechatConfigArgs();
    }
}
