// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Rancher v2 Notifier resource. This can be used to create notifiers for Rancher v2 environments and retrieve their information.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-rancher2/sdk/v2/go/rancher2"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := rancher2.NewNotifier(ctx, "foo", &rancher2.NotifierArgs{
// 			ClusterId:   pulumi.String("<cluster_id>"),
// 			Description: pulumi.String("Terraform notifier acceptance test"),
// 			PagerdutyConfig: &rancher2.NotifierPagerdutyConfigArgs{
// 				ProxyUrl:   pulumi.String("http://proxy.test.io"),
// 				ServiceKey: pulumi.String("XXXXXXXX"),
// 			},
// 			SendResolved: pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Notifiers can be imported using the Rancher nNtifier ID
//
// ```sh
//  $ pulumi import rancher2:index/notifier:Notifier foo &lt;notifier_id&gt;
// ```
type Notifier struct {
	pulumi.CustomResourceState

	// Annotations for notifier object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The cluster id where create notifier (string)
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The notifier description (string)
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Dingtalk config for notifier (list maxitems:1)
	DingtalkConfig NotifierDingtalkConfigPtrOutput `pulumi:"dingtalkConfig"`
	// Labels for notifier object (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// MSTeams config for notifier (list maxitems:1)
	MsteamsConfig NotifierMsteamsConfigPtrOutput `pulumi:"msteamsConfig"`
	// The name of the notifier (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Pagerduty config for notifier (list maxitems:1)
	PagerdutyConfig NotifierPagerdutyConfigPtrOutput `pulumi:"pagerdutyConfig"`
	// = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
	SendResolved pulumi.BoolPtrOutput `pulumi:"sendResolved"`
	// Slack config for notifier (list maxitems:1)
	SlackConfig NotifierSlackConfigPtrOutput `pulumi:"slackConfig"`
	// SMTP config for notifier (list maxitems:1)
	SmtpConfig NotifierSmtpConfigPtrOutput `pulumi:"smtpConfig"`
	// Webhook config for notifier (list maxitems:1)
	WebhookConfig NotifierWebhookConfigPtrOutput `pulumi:"webhookConfig"`
	// Wechat config for notifier (list maxitems:1)
	WechatConfig NotifierWechatConfigPtrOutput `pulumi:"wechatConfig"`
}

// NewNotifier registers a new resource with the given unique name, arguments, and options.
func NewNotifier(ctx *pulumi.Context,
	name string, args *NotifierArgs, opts ...pulumi.ResourceOption) (*Notifier, error) {
	if args == nil || args.ClusterId == nil {
		return nil, errors.New("missing required argument 'ClusterId'")
	}
	if args == nil {
		args = &NotifierArgs{}
	}
	var resource Notifier
	err := ctx.RegisterResource("rancher2:index/notifier:Notifier", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNotifier gets an existing Notifier resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNotifier(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NotifierState, opts ...pulumi.ResourceOption) (*Notifier, error) {
	var resource Notifier
	err := ctx.ReadResource("rancher2:index/notifier:Notifier", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Notifier resources.
type notifierState struct {
	// Annotations for notifier object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id where create notifier (string)
	ClusterId *string `pulumi:"clusterId"`
	// The notifier description (string)
	Description *string `pulumi:"description"`
	// Dingtalk config for notifier (list maxitems:1)
	DingtalkConfig *NotifierDingtalkConfig `pulumi:"dingtalkConfig"`
	// Labels for notifier object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// MSTeams config for notifier (list maxitems:1)
	MsteamsConfig *NotifierMsteamsConfig `pulumi:"msteamsConfig"`
	// The name of the notifier (string)
	Name *string `pulumi:"name"`
	// Pagerduty config for notifier (list maxitems:1)
	PagerdutyConfig *NotifierPagerdutyConfig `pulumi:"pagerdutyConfig"`
	// = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
	SendResolved *bool `pulumi:"sendResolved"`
	// Slack config for notifier (list maxitems:1)
	SlackConfig *NotifierSlackConfig `pulumi:"slackConfig"`
	// SMTP config for notifier (list maxitems:1)
	SmtpConfig *NotifierSmtpConfig `pulumi:"smtpConfig"`
	// Webhook config for notifier (list maxitems:1)
	WebhookConfig *NotifierWebhookConfig `pulumi:"webhookConfig"`
	// Wechat config for notifier (list maxitems:1)
	WechatConfig *NotifierWechatConfig `pulumi:"wechatConfig"`
}

type NotifierState struct {
	// Annotations for notifier object (map)
	Annotations pulumi.MapInput
	// The cluster id where create notifier (string)
	ClusterId pulumi.StringPtrInput
	// The notifier description (string)
	Description pulumi.StringPtrInput
	// Dingtalk config for notifier (list maxitems:1)
	DingtalkConfig NotifierDingtalkConfigPtrInput
	// Labels for notifier object (map)
	Labels pulumi.MapInput
	// MSTeams config for notifier (list maxitems:1)
	MsteamsConfig NotifierMsteamsConfigPtrInput
	// The name of the notifier (string)
	Name pulumi.StringPtrInput
	// Pagerduty config for notifier (list maxitems:1)
	PagerdutyConfig NotifierPagerdutyConfigPtrInput
	// = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
	SendResolved pulumi.BoolPtrInput
	// Slack config for notifier (list maxitems:1)
	SlackConfig NotifierSlackConfigPtrInput
	// SMTP config for notifier (list maxitems:1)
	SmtpConfig NotifierSmtpConfigPtrInput
	// Webhook config for notifier (list maxitems:1)
	WebhookConfig NotifierWebhookConfigPtrInput
	// Wechat config for notifier (list maxitems:1)
	WechatConfig NotifierWechatConfigPtrInput
}

func (NotifierState) ElementType() reflect.Type {
	return reflect.TypeOf((*notifierState)(nil)).Elem()
}

type notifierArgs struct {
	// Annotations for notifier object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id where create notifier (string)
	ClusterId string `pulumi:"clusterId"`
	// The notifier description (string)
	Description *string `pulumi:"description"`
	// Dingtalk config for notifier (list maxitems:1)
	DingtalkConfig *NotifierDingtalkConfig `pulumi:"dingtalkConfig"`
	// Labels for notifier object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// MSTeams config for notifier (list maxitems:1)
	MsteamsConfig *NotifierMsteamsConfig `pulumi:"msteamsConfig"`
	// The name of the notifier (string)
	Name *string `pulumi:"name"`
	// Pagerduty config for notifier (list maxitems:1)
	PagerdutyConfig *NotifierPagerdutyConfig `pulumi:"pagerdutyConfig"`
	// = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
	SendResolved *bool `pulumi:"sendResolved"`
	// Slack config for notifier (list maxitems:1)
	SlackConfig *NotifierSlackConfig `pulumi:"slackConfig"`
	// SMTP config for notifier (list maxitems:1)
	SmtpConfig *NotifierSmtpConfig `pulumi:"smtpConfig"`
	// Webhook config for notifier (list maxitems:1)
	WebhookConfig *NotifierWebhookConfig `pulumi:"webhookConfig"`
	// Wechat config for notifier (list maxitems:1)
	WechatConfig *NotifierWechatConfig `pulumi:"wechatConfig"`
}

// The set of arguments for constructing a Notifier resource.
type NotifierArgs struct {
	// Annotations for notifier object (map)
	Annotations pulumi.MapInput
	// The cluster id where create notifier (string)
	ClusterId pulumi.StringInput
	// The notifier description (string)
	Description pulumi.StringPtrInput
	// Dingtalk config for notifier (list maxitems:1)
	DingtalkConfig NotifierDingtalkConfigPtrInput
	// Labels for notifier object (map)
	Labels pulumi.MapInput
	// MSTeams config for notifier (list maxitems:1)
	MsteamsConfig NotifierMsteamsConfigPtrInput
	// The name of the notifier (string)
	Name pulumi.StringPtrInput
	// Pagerduty config for notifier (list maxitems:1)
	PagerdutyConfig NotifierPagerdutyConfigPtrInput
	// = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
	SendResolved pulumi.BoolPtrInput
	// Slack config for notifier (list maxitems:1)
	SlackConfig NotifierSlackConfigPtrInput
	// SMTP config for notifier (list maxitems:1)
	SmtpConfig NotifierSmtpConfigPtrInput
	// Webhook config for notifier (list maxitems:1)
	WebhookConfig NotifierWebhookConfigPtrInput
	// Wechat config for notifier (list maxitems:1)
	WechatConfig NotifierWechatConfigPtrInput
}

func (NotifierArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*notifierArgs)(nil)).Elem()
}

type NotifierInput interface {
	pulumi.Input

	ToNotifierOutput() NotifierOutput
	ToNotifierOutputWithContext(ctx context.Context) NotifierOutput
}

func (Notifier) ElementType() reflect.Type {
	return reflect.TypeOf((*Notifier)(nil)).Elem()
}

func (i Notifier) ToNotifierOutput() NotifierOutput {
	return i.ToNotifierOutputWithContext(context.Background())
}

func (i Notifier) ToNotifierOutputWithContext(ctx context.Context) NotifierOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotifierOutput)
}

type NotifierOutput struct {
	*pulumi.OutputState
}

func (NotifierOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*NotifierOutput)(nil)).Elem()
}

func (o NotifierOutput) ToNotifierOutput() NotifierOutput {
	return o
}

func (o NotifierOutput) ToNotifierOutputWithContext(ctx context.Context) NotifierOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(NotifierOutput{})
}
