// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 notifier.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-rancher2/sdk/v3/go/rancher2"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := rancher2.LookupNotifier(ctx, &rancher2.LookupNotifierArgs{
// 			ClusterId: "<cluster_id>",
// 			Name:      "foo",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupNotifier(ctx *pulumi.Context, args *LookupNotifierArgs, opts ...pulumi.InvokeOption) (*LookupNotifierResult, error) {
	var rv LookupNotifierResult
	err := ctx.Invoke("rancher2:index/getNotifier:getNotifier", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNotifier.
type LookupNotifierArgs struct {
	// The cluster id where create notifier (string)
	ClusterId string `pulumi:"clusterId"`
	// (Computed) Dingtalk config for notifier (list maxitems:1)
	DingtalkConfig *GetNotifierDingtalkConfig `pulumi:"dingtalkConfig"`
	// (Computed) MSTeams config for notifier (list maxitems:1)
	MsteamsConfig *GetNotifierMsteamsConfig `pulumi:"msteamsConfig"`
	// The name of the notifier (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getNotifier.
type LookupNotifierResult struct {
	// (Computed) Annotations for notifier object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	ClusterId   string                 `pulumi:"clusterId"`
	// (Computed) The notifier description (string)
	Description string `pulumi:"description"`
	// (Computed) Dingtalk config for notifier (list maxitems:1)
	DingtalkConfig *GetNotifierDingtalkConfig `pulumi:"dingtalkConfig"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for notifier object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) MSTeams config for notifier (list maxitems:1)
	MsteamsConfig *GetNotifierMsteamsConfig `pulumi:"msteamsConfig"`
	Name          string                    `pulumi:"name"`
	// (Computed) Pagerduty config for notifier (list maxitems:1)
	PagerdutyConfig GetNotifierPagerdutyConfig `pulumi:"pagerdutyConfig"`
	// (Computed) Slack config for notifier (list maxitems:1)
	SlackConfig GetNotifierSlackConfig `pulumi:"slackConfig"`
	// (Computed) SMTP config for notifier (list maxitems:1)
	SmtpConfig GetNotifierSmtpConfig `pulumi:"smtpConfig"`
	// (Computed) Webhook config for notifier (list maxitems:1)
	WebhookConfig GetNotifierWebhookConfig `pulumi:"webhookConfig"`
	// (Computed) Wechat config for notifier (list maxitems:1)
	WechatConfig GetNotifierWechatConfig `pulumi:"wechatConfig"`
}
