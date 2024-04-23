// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Cluster Alert Rule resource. This can be used to create Cluster Alert Rule for Rancher v2 environments and retrieve their information.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// Create a new Rancher2 Cluster Alert Group
//			foo, err := rancher2.NewClusterAlertGroup(ctx, "foo", &rancher2.ClusterAlertGroupArgs{
//				ClusterId:             pulumi.String("<cluster_id>"),
//				Name:                  pulumi.String("foo"),
//				Description:           pulumi.String("Terraform cluster alert group"),
//				GroupIntervalSeconds:  pulumi.Int(300),
//				RepeatIntervalSeconds: pulumi.Int(3600),
//			})
//			if err != nil {
//				return err
//			}
//			// Create a new Rancher2 Cluster Alert Rule
//			_, err = rancher2.NewClusterAlertRule(ctx, "foo", &rancher2.ClusterAlertRuleArgs{
//				ClusterId:             foo.ClusterId,
//				GroupId:               foo.ID(),
//				Name:                  pulumi.String("foo"),
//				GroupIntervalSeconds:  pulumi.Int(600),
//				RepeatIntervalSeconds: pulumi.Int(6000),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// # Cluster Alert Rule can be imported using the Rancher cluster alert rule ID
//
// ```sh
// $ pulumi import rancher2:index/clusterAlertRule:ClusterAlertRule foo &lt;CLUSTER_ALERT_RULE_ID&gt;
// ```
type ClusterAlertRule struct {
	pulumi.CustomResourceState

	// The cluster alert rule annotations (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The cluster id where create cluster alert rule (string)
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	EventRule ClusterAlertRuleEventRulePtrOutput `pulumi:"eventRule"`
	// The cluster alert rule alert group ID (string)
	GroupId pulumi.StringOutput `pulumi:"groupId"`
	// The cluster alert rule group interval seconds. Default: `180` (int)
	GroupIntervalSeconds pulumi.IntPtrOutput `pulumi:"groupIntervalSeconds"`
	// The cluster alert rule group wait seconds. Default: `180` (int)
	GroupWaitSeconds pulumi.IntPtrOutput `pulumi:"groupWaitSeconds"`
	// The cluster alert rule inherited. Default: `true` (bool)
	Inherited pulumi.BoolPtrOutput `pulumi:"inherited"`
	// The cluster alert rule labels (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	MetricRule ClusterAlertRuleMetricRulePtrOutput `pulumi:"metricRule"`
	// The cluster alert rule name (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
	NodeRule ClusterAlertRuleNodeRulePtrOutput `pulumi:"nodeRule"`
	// The cluster alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrOutput `pulumi:"repeatIntervalSeconds"`
	// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity pulumi.StringPtrOutput `pulumi:"severity"`
	// The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"` (list Maxitems:1)
	SystemServiceRule ClusterAlertRuleSystemServiceRulePtrOutput `pulumi:"systemServiceRule"`
}

// NewClusterAlertRule registers a new resource with the given unique name, arguments, and options.
func NewClusterAlertRule(ctx *pulumi.Context,
	name string, args *ClusterAlertRuleArgs, opts ...pulumi.ResourceOption) (*ClusterAlertRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	if args.GroupId == nil {
		return nil, errors.New("invalid value for required argument 'GroupId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ClusterAlertRule
	err := ctx.RegisterResource("rancher2:index/clusterAlertRule:ClusterAlertRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterAlertRule gets an existing ClusterAlertRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterAlertRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterAlertRuleState, opts ...pulumi.ResourceOption) (*ClusterAlertRule, error) {
	var resource ClusterAlertRule
	err := ctx.ReadResource("rancher2:index/clusterAlertRule:ClusterAlertRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterAlertRule resources.
type clusterAlertRuleState struct {
	// The cluster alert rule annotations (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id where create cluster alert rule (string)
	ClusterId *string `pulumi:"clusterId"`
	// The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	EventRule *ClusterAlertRuleEventRule `pulumi:"eventRule"`
	// The cluster alert rule alert group ID (string)
	GroupId *string `pulumi:"groupId"`
	// The cluster alert rule group interval seconds. Default: `180` (int)
	GroupIntervalSeconds *int `pulumi:"groupIntervalSeconds"`
	// The cluster alert rule group wait seconds. Default: `180` (int)
	GroupWaitSeconds *int `pulumi:"groupWaitSeconds"`
	// The cluster alert rule inherited. Default: `true` (bool)
	Inherited *bool `pulumi:"inherited"`
	// The cluster alert rule labels (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	MetricRule *ClusterAlertRuleMetricRule `pulumi:"metricRule"`
	// The cluster alert rule name (string)
	Name *string `pulumi:"name"`
	// The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
	NodeRule *ClusterAlertRuleNodeRule `pulumi:"nodeRule"`
	// The cluster alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds *int `pulumi:"repeatIntervalSeconds"`
	// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity *string `pulumi:"severity"`
	// The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"` (list Maxitems:1)
	SystemServiceRule *ClusterAlertRuleSystemServiceRule `pulumi:"systemServiceRule"`
}

type ClusterAlertRuleState struct {
	// The cluster alert rule annotations (map)
	Annotations pulumi.MapInput
	// The cluster id where create cluster alert rule (string)
	ClusterId pulumi.StringPtrInput
	// The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	EventRule ClusterAlertRuleEventRulePtrInput
	// The cluster alert rule alert group ID (string)
	GroupId pulumi.StringPtrInput
	// The cluster alert rule group interval seconds. Default: `180` (int)
	GroupIntervalSeconds pulumi.IntPtrInput
	// The cluster alert rule group wait seconds. Default: `180` (int)
	GroupWaitSeconds pulumi.IntPtrInput
	// The cluster alert rule inherited. Default: `true` (bool)
	Inherited pulumi.BoolPtrInput
	// The cluster alert rule labels (map)
	Labels pulumi.MapInput
	// The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	MetricRule ClusterAlertRuleMetricRulePtrInput
	// The cluster alert rule name (string)
	Name pulumi.StringPtrInput
	// The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
	NodeRule ClusterAlertRuleNodeRulePtrInput
	// The cluster alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrInput
	// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity pulumi.StringPtrInput
	// The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"` (list Maxitems:1)
	SystemServiceRule ClusterAlertRuleSystemServiceRulePtrInput
}

func (ClusterAlertRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterAlertRuleState)(nil)).Elem()
}

type clusterAlertRuleArgs struct {
	// The cluster alert rule annotations (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id where create cluster alert rule (string)
	ClusterId string `pulumi:"clusterId"`
	// The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	EventRule *ClusterAlertRuleEventRule `pulumi:"eventRule"`
	// The cluster alert rule alert group ID (string)
	GroupId string `pulumi:"groupId"`
	// The cluster alert rule group interval seconds. Default: `180` (int)
	GroupIntervalSeconds *int `pulumi:"groupIntervalSeconds"`
	// The cluster alert rule group wait seconds. Default: `180` (int)
	GroupWaitSeconds *int `pulumi:"groupWaitSeconds"`
	// The cluster alert rule inherited. Default: `true` (bool)
	Inherited *bool `pulumi:"inherited"`
	// The cluster alert rule labels (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	MetricRule *ClusterAlertRuleMetricRule `pulumi:"metricRule"`
	// The cluster alert rule name (string)
	Name *string `pulumi:"name"`
	// The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
	NodeRule *ClusterAlertRuleNodeRule `pulumi:"nodeRule"`
	// The cluster alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds *int `pulumi:"repeatIntervalSeconds"`
	// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity *string `pulumi:"severity"`
	// The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"` (list Maxitems:1)
	SystemServiceRule *ClusterAlertRuleSystemServiceRule `pulumi:"systemServiceRule"`
}

// The set of arguments for constructing a ClusterAlertRule resource.
type ClusterAlertRuleArgs struct {
	// The cluster alert rule annotations (map)
	Annotations pulumi.MapInput
	// The cluster id where create cluster alert rule (string)
	ClusterId pulumi.StringInput
	// The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	EventRule ClusterAlertRuleEventRulePtrInput
	// The cluster alert rule alert group ID (string)
	GroupId pulumi.StringInput
	// The cluster alert rule group interval seconds. Default: `180` (int)
	GroupIntervalSeconds pulumi.IntPtrInput
	// The cluster alert rule group wait seconds. Default: `180` (int)
	GroupWaitSeconds pulumi.IntPtrInput
	// The cluster alert rule inherited. Default: `true` (bool)
	Inherited pulumi.BoolPtrInput
	// The cluster alert rule labels (map)
	Labels pulumi.MapInput
	// The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	MetricRule ClusterAlertRuleMetricRulePtrInput
	// The cluster alert rule name (string)
	Name pulumi.StringPtrInput
	// The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
	NodeRule ClusterAlertRuleNodeRulePtrInput
	// The cluster alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrInput
	// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity pulumi.StringPtrInput
	// The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"` (list Maxitems:1)
	SystemServiceRule ClusterAlertRuleSystemServiceRulePtrInput
}

func (ClusterAlertRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterAlertRuleArgs)(nil)).Elem()
}

type ClusterAlertRuleInput interface {
	pulumi.Input

	ToClusterAlertRuleOutput() ClusterAlertRuleOutput
	ToClusterAlertRuleOutputWithContext(ctx context.Context) ClusterAlertRuleOutput
}

func (*ClusterAlertRule) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterAlertRule)(nil)).Elem()
}

func (i *ClusterAlertRule) ToClusterAlertRuleOutput() ClusterAlertRuleOutput {
	return i.ToClusterAlertRuleOutputWithContext(context.Background())
}

func (i *ClusterAlertRule) ToClusterAlertRuleOutputWithContext(ctx context.Context) ClusterAlertRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterAlertRuleOutput)
}

// ClusterAlertRuleArrayInput is an input type that accepts ClusterAlertRuleArray and ClusterAlertRuleArrayOutput values.
// You can construct a concrete instance of `ClusterAlertRuleArrayInput` via:
//
//	ClusterAlertRuleArray{ ClusterAlertRuleArgs{...} }
type ClusterAlertRuleArrayInput interface {
	pulumi.Input

	ToClusterAlertRuleArrayOutput() ClusterAlertRuleArrayOutput
	ToClusterAlertRuleArrayOutputWithContext(context.Context) ClusterAlertRuleArrayOutput
}

type ClusterAlertRuleArray []ClusterAlertRuleInput

func (ClusterAlertRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterAlertRule)(nil)).Elem()
}

func (i ClusterAlertRuleArray) ToClusterAlertRuleArrayOutput() ClusterAlertRuleArrayOutput {
	return i.ToClusterAlertRuleArrayOutputWithContext(context.Background())
}

func (i ClusterAlertRuleArray) ToClusterAlertRuleArrayOutputWithContext(ctx context.Context) ClusterAlertRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterAlertRuleArrayOutput)
}

// ClusterAlertRuleMapInput is an input type that accepts ClusterAlertRuleMap and ClusterAlertRuleMapOutput values.
// You can construct a concrete instance of `ClusterAlertRuleMapInput` via:
//
//	ClusterAlertRuleMap{ "key": ClusterAlertRuleArgs{...} }
type ClusterAlertRuleMapInput interface {
	pulumi.Input

	ToClusterAlertRuleMapOutput() ClusterAlertRuleMapOutput
	ToClusterAlertRuleMapOutputWithContext(context.Context) ClusterAlertRuleMapOutput
}

type ClusterAlertRuleMap map[string]ClusterAlertRuleInput

func (ClusterAlertRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterAlertRule)(nil)).Elem()
}

func (i ClusterAlertRuleMap) ToClusterAlertRuleMapOutput() ClusterAlertRuleMapOutput {
	return i.ToClusterAlertRuleMapOutputWithContext(context.Background())
}

func (i ClusterAlertRuleMap) ToClusterAlertRuleMapOutputWithContext(ctx context.Context) ClusterAlertRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterAlertRuleMapOutput)
}

type ClusterAlertRuleOutput struct{ *pulumi.OutputState }

func (ClusterAlertRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterAlertRule)(nil)).Elem()
}

func (o ClusterAlertRuleOutput) ToClusterAlertRuleOutput() ClusterAlertRuleOutput {
	return o
}

func (o ClusterAlertRuleOutput) ToClusterAlertRuleOutputWithContext(ctx context.Context) ClusterAlertRuleOutput {
	return o
}

// The cluster alert rule annotations (map)
func (o ClusterAlertRuleOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *ClusterAlertRule) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// The cluster id where create cluster alert rule (string)
func (o ClusterAlertRuleOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterAlertRule) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"“ (list Maxitems:1)
func (o ClusterAlertRuleOutput) EventRule() ClusterAlertRuleEventRulePtrOutput {
	return o.ApplyT(func(v *ClusterAlertRule) ClusterAlertRuleEventRulePtrOutput { return v.EventRule }).(ClusterAlertRuleEventRulePtrOutput)
}

// The cluster alert rule alert group ID (string)
func (o ClusterAlertRuleOutput) GroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterAlertRule) pulumi.StringOutput { return v.GroupId }).(pulumi.StringOutput)
}

// The cluster alert rule group interval seconds. Default: `180` (int)
func (o ClusterAlertRuleOutput) GroupIntervalSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ClusterAlertRule) pulumi.IntPtrOutput { return v.GroupIntervalSeconds }).(pulumi.IntPtrOutput)
}

// The cluster alert rule group wait seconds. Default: `180` (int)
func (o ClusterAlertRuleOutput) GroupWaitSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ClusterAlertRule) pulumi.IntPtrOutput { return v.GroupWaitSeconds }).(pulumi.IntPtrOutput)
}

// The cluster alert rule inherited. Default: `true` (bool)
func (o ClusterAlertRuleOutput) Inherited() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ClusterAlertRule) pulumi.BoolPtrOutput { return v.Inherited }).(pulumi.BoolPtrOutput)
}

// The cluster alert rule labels (map)
func (o ClusterAlertRuleOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *ClusterAlertRule) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"“ (list Maxitems:1)
func (o ClusterAlertRuleOutput) MetricRule() ClusterAlertRuleMetricRulePtrOutput {
	return o.ApplyT(func(v *ClusterAlertRule) ClusterAlertRuleMetricRulePtrOutput { return v.MetricRule }).(ClusterAlertRuleMetricRulePtrOutput)
}

// The cluster alert rule name (string)
func (o ClusterAlertRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterAlertRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"“ (list Maxitems:1)
func (o ClusterAlertRuleOutput) NodeRule() ClusterAlertRuleNodeRulePtrOutput {
	return o.ApplyT(func(v *ClusterAlertRule) ClusterAlertRuleNodeRulePtrOutput { return v.NodeRule }).(ClusterAlertRuleNodeRulePtrOutput)
}

// The cluster alert rule wait seconds. Default: `3600` (int)
func (o ClusterAlertRuleOutput) RepeatIntervalSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ClusterAlertRule) pulumi.IntPtrOutput { return v.RepeatIntervalSeconds }).(pulumi.IntPtrOutput)
}

// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
func (o ClusterAlertRuleOutput) Severity() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterAlertRule) pulumi.StringPtrOutput { return v.Severity }).(pulumi.StringPtrOutput)
}

// The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"` (list Maxitems:1)
func (o ClusterAlertRuleOutput) SystemServiceRule() ClusterAlertRuleSystemServiceRulePtrOutput {
	return o.ApplyT(func(v *ClusterAlertRule) ClusterAlertRuleSystemServiceRulePtrOutput { return v.SystemServiceRule }).(ClusterAlertRuleSystemServiceRulePtrOutput)
}

type ClusterAlertRuleArrayOutput struct{ *pulumi.OutputState }

func (ClusterAlertRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterAlertRule)(nil)).Elem()
}

func (o ClusterAlertRuleArrayOutput) ToClusterAlertRuleArrayOutput() ClusterAlertRuleArrayOutput {
	return o
}

func (o ClusterAlertRuleArrayOutput) ToClusterAlertRuleArrayOutputWithContext(ctx context.Context) ClusterAlertRuleArrayOutput {
	return o
}

func (o ClusterAlertRuleArrayOutput) Index(i pulumi.IntInput) ClusterAlertRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClusterAlertRule {
		return vs[0].([]*ClusterAlertRule)[vs[1].(int)]
	}).(ClusterAlertRuleOutput)
}

type ClusterAlertRuleMapOutput struct{ *pulumi.OutputState }

func (ClusterAlertRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterAlertRule)(nil)).Elem()
}

func (o ClusterAlertRuleMapOutput) ToClusterAlertRuleMapOutput() ClusterAlertRuleMapOutput {
	return o
}

func (o ClusterAlertRuleMapOutput) ToClusterAlertRuleMapOutputWithContext(ctx context.Context) ClusterAlertRuleMapOutput {
	return o
}

func (o ClusterAlertRuleMapOutput) MapIndex(k pulumi.StringInput) ClusterAlertRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClusterAlertRule {
		return vs[0].(map[string]*ClusterAlertRule)[vs[1].(string)]
	}).(ClusterAlertRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterAlertRuleInput)(nil)).Elem(), &ClusterAlertRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterAlertRuleArrayInput)(nil)).Elem(), ClusterAlertRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterAlertRuleMapInput)(nil)).Elem(), ClusterAlertRuleMap{})
	pulumi.RegisterOutputType(ClusterAlertRuleOutput{})
	pulumi.RegisterOutputType(ClusterAlertRuleArrayOutput{})
	pulumi.RegisterOutputType(ClusterAlertRuleMapOutput{})
}
