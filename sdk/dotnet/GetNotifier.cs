// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetNotifier
    {
        public static Task<GetNotifierResult> InvokeAsync(GetNotifierArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetNotifierResult>("rancher2:index/getNotifier:getNotifier", args ?? new GetNotifierArgs(), options.WithVersion());
    }


    public sealed class GetNotifierArgs : Pulumi.InvokeArgs
    {
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetNotifierArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetNotifierResult
    {
        public readonly ImmutableDictionary<string, object> Annotations;
        public readonly string ClusterId;
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableDictionary<string, object> Labels;
        public readonly string Name;
        public readonly Outputs.GetNotifierPagerdutyConfigResult PagerdutyConfig;
        public readonly Outputs.GetNotifierSlackConfigResult SlackConfig;
        public readonly Outputs.GetNotifierSmtpConfigResult SmtpConfig;
        public readonly Outputs.GetNotifierWebhookConfigResult WebhookConfig;
        public readonly Outputs.GetNotifierWechatConfigResult WechatConfig;

        [OutputConstructor]
        private GetNotifierResult(
            ImmutableDictionary<string, object> annotations,

            string clusterId,

            string description,

            string id,

            ImmutableDictionary<string, object> labels,

            string name,

            Outputs.GetNotifierPagerdutyConfigResult pagerdutyConfig,

            Outputs.GetNotifierSlackConfigResult slackConfig,

            Outputs.GetNotifierSmtpConfigResult smtpConfig,

            Outputs.GetNotifierWebhookConfigResult webhookConfig,

            Outputs.GetNotifierWechatConfigResult wechatConfig)
        {
            Annotations = annotations;
            ClusterId = clusterId;
            Description = description;
            Id = id;
            Labels = labels;
            Name = name;
            PagerdutyConfig = pagerdutyConfig;
            SlackConfig = slackConfig;
            SmtpConfig = smtpConfig;
            WebhookConfig = webhookConfig;
            WechatConfig = wechatConfig;
        }
    }
}
