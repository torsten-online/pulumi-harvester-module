// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type Notifier struct {
	pulumi.CustomResourceState

	// Annotations of the resource
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// Notifier cluster ID
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// Notifier description
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Labels of the resource
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Notifier name
	Name            pulumi.StringOutput              `pulumi:"name"`
	PagerdutyConfig NotifierPagerdutyConfigPtrOutput `pulumi:"pagerdutyConfig"`
	// Notifier send resolved
	SendResolved  pulumi.BoolPtrOutput           `pulumi:"sendResolved"`
	SlackConfig   NotifierSlackConfigPtrOutput   `pulumi:"slackConfig"`
	SmtpConfig    NotifierSmtpConfigPtrOutput    `pulumi:"smtpConfig"`
	WebhookConfig NotifierWebhookConfigPtrOutput `pulumi:"webhookConfig"`
	WechatConfig  NotifierWechatConfigPtrOutput  `pulumi:"wechatConfig"`
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
	// Annotations of the resource
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Notifier cluster ID
	ClusterId *string `pulumi:"clusterId"`
	// Notifier description
	Description *string `pulumi:"description"`
	// Labels of the resource
	Labels map[string]interface{} `pulumi:"labels"`
	// Notifier name
	Name            *string                  `pulumi:"name"`
	PagerdutyConfig *NotifierPagerdutyConfig `pulumi:"pagerdutyConfig"`
	// Notifier send resolved
	SendResolved  *bool                  `pulumi:"sendResolved"`
	SlackConfig   *NotifierSlackConfig   `pulumi:"slackConfig"`
	SmtpConfig    *NotifierSmtpConfig    `pulumi:"smtpConfig"`
	WebhookConfig *NotifierWebhookConfig `pulumi:"webhookConfig"`
	WechatConfig  *NotifierWechatConfig  `pulumi:"wechatConfig"`
}

type NotifierState struct {
	// Annotations of the resource
	Annotations pulumi.MapInput
	// Notifier cluster ID
	ClusterId pulumi.StringPtrInput
	// Notifier description
	Description pulumi.StringPtrInput
	// Labels of the resource
	Labels pulumi.MapInput
	// Notifier name
	Name            pulumi.StringPtrInput
	PagerdutyConfig NotifierPagerdutyConfigPtrInput
	// Notifier send resolved
	SendResolved  pulumi.BoolPtrInput
	SlackConfig   NotifierSlackConfigPtrInput
	SmtpConfig    NotifierSmtpConfigPtrInput
	WebhookConfig NotifierWebhookConfigPtrInput
	WechatConfig  NotifierWechatConfigPtrInput
}

func (NotifierState) ElementType() reflect.Type {
	return reflect.TypeOf((*notifierState)(nil)).Elem()
}

type notifierArgs struct {
	// Annotations of the resource
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Notifier cluster ID
	ClusterId string `pulumi:"clusterId"`
	// Notifier description
	Description *string `pulumi:"description"`
	// Labels of the resource
	Labels map[string]interface{} `pulumi:"labels"`
	// Notifier name
	Name            *string                  `pulumi:"name"`
	PagerdutyConfig *NotifierPagerdutyConfig `pulumi:"pagerdutyConfig"`
	// Notifier send resolved
	SendResolved  *bool                  `pulumi:"sendResolved"`
	SlackConfig   *NotifierSlackConfig   `pulumi:"slackConfig"`
	SmtpConfig    *NotifierSmtpConfig    `pulumi:"smtpConfig"`
	WebhookConfig *NotifierWebhookConfig `pulumi:"webhookConfig"`
	WechatConfig  *NotifierWechatConfig  `pulumi:"wechatConfig"`
}

// The set of arguments for constructing a Notifier resource.
type NotifierArgs struct {
	// Annotations of the resource
	Annotations pulumi.MapInput
	// Notifier cluster ID
	ClusterId pulumi.StringInput
	// Notifier description
	Description pulumi.StringPtrInput
	// Labels of the resource
	Labels pulumi.MapInput
	// Notifier name
	Name            pulumi.StringPtrInput
	PagerdutyConfig NotifierPagerdutyConfigPtrInput
	// Notifier send resolved
	SendResolved  pulumi.BoolPtrInput
	SlackConfig   NotifierSlackConfigPtrInput
	SmtpConfig    NotifierSmtpConfigPtrInput
	WebhookConfig NotifierWebhookConfigPtrInput
	WechatConfig  NotifierWechatConfigPtrInput
}

func (NotifierArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*notifierArgs)(nil)).Elem()
}
