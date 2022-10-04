// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Cluster Alert Group resource. This can be used to create Cluster Alert Group for Rancher v2 environments and retrieve their information.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v3/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rancher2.NewClusterAlertGroup(ctx, "foo", &rancher2.ClusterAlertGroupArgs{
//				ClusterId:             pulumi.String("<cluster_id>"),
//				Description:           pulumi.String("Terraform cluster alert group"),
//				GroupIntervalSeconds:  pulumi.Int(300),
//				RepeatIntervalSeconds: pulumi.Int(3600),
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
// # Cluster Alert Group can be imported using the Rancher cluster alert group ID
//
// ```sh
//
//	$ pulumi import rancher2:index/clusterAlterRule:ClusterAlterRule foo &lt;CLUSTER_ALERT_GROUP_ID&gt;
//
// ```
//
// Deprecated: rancher2.ClusterAlterRule has been deprecated in favor of rancher2.ClusterAlertRule
type ClusterAlterRule struct {
	pulumi.CustomResourceState

	// The cluster alert group annotations (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The cluster id where create cluster alert group (string)
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// Alert event rule
	EventRule ClusterAlterRuleEventRulePtrOutput `pulumi:"eventRule"`
	// Alert rule group ID
	GroupId pulumi.StringOutput `pulumi:"groupId"`
	// The cluster alert group interval seconds. Default: `180` (int)
	GroupIntervalSeconds pulumi.IntPtrOutput `pulumi:"groupIntervalSeconds"`
	// The cluster alert group wait seconds. Default: `180` (int)
	GroupWaitSeconds pulumi.IntPtrOutput `pulumi:"groupWaitSeconds"`
	// Alert rule inherited
	Inherited pulumi.BoolPtrOutput `pulumi:"inherited"`
	// The cluster alert group labels (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Alert metric rule
	MetricRule ClusterAlterRuleMetricRulePtrOutput `pulumi:"metricRule"`
	// The cluster alert group name (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Alert node rule
	NodeRule ClusterAlterRuleNodeRulePtrOutput `pulumi:"nodeRule"`
	// The cluster alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrOutput `pulumi:"repeatIntervalSeconds"`
	// Alert rule severity
	Severity pulumi.StringPtrOutput `pulumi:"severity"`
	// Alert system service rule
	SystemServiceRule ClusterAlterRuleSystemServiceRulePtrOutput `pulumi:"systemServiceRule"`
}

// NewClusterAlterRule registers a new resource with the given unique name, arguments, and options.
func NewClusterAlterRule(ctx *pulumi.Context,
	name string, args *ClusterAlterRuleArgs, opts ...pulumi.ResourceOption) (*ClusterAlterRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	if args.GroupId == nil {
		return nil, errors.New("invalid value for required argument 'GroupId'")
	}
	var resource ClusterAlterRule
	err := ctx.RegisterResource("rancher2:index/clusterAlterRule:ClusterAlterRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterAlterRule gets an existing ClusterAlterRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterAlterRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterAlterRuleState, opts ...pulumi.ResourceOption) (*ClusterAlterRule, error) {
	var resource ClusterAlterRule
	err := ctx.ReadResource("rancher2:index/clusterAlterRule:ClusterAlterRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterAlterRule resources.
type clusterAlterRuleState struct {
	// The cluster alert group annotations (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id where create cluster alert group (string)
	ClusterId *string `pulumi:"clusterId"`
	// Alert event rule
	EventRule *ClusterAlterRuleEventRule `pulumi:"eventRule"`
	// Alert rule group ID
	GroupId *string `pulumi:"groupId"`
	// The cluster alert group interval seconds. Default: `180` (int)
	GroupIntervalSeconds *int `pulumi:"groupIntervalSeconds"`
	// The cluster alert group wait seconds. Default: `180` (int)
	GroupWaitSeconds *int `pulumi:"groupWaitSeconds"`
	// Alert rule inherited
	Inherited *bool `pulumi:"inherited"`
	// The cluster alert group labels (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Alert metric rule
	MetricRule *ClusterAlterRuleMetricRule `pulumi:"metricRule"`
	// The cluster alert group name (string)
	Name *string `pulumi:"name"`
	// Alert node rule
	NodeRule *ClusterAlterRuleNodeRule `pulumi:"nodeRule"`
	// The cluster alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds *int `pulumi:"repeatIntervalSeconds"`
	// Alert rule severity
	Severity *string `pulumi:"severity"`
	// Alert system service rule
	SystemServiceRule *ClusterAlterRuleSystemServiceRule `pulumi:"systemServiceRule"`
}

type ClusterAlterRuleState struct {
	// The cluster alert group annotations (map)
	Annotations pulumi.MapInput
	// The cluster id where create cluster alert group (string)
	ClusterId pulumi.StringPtrInput
	// Alert event rule
	EventRule ClusterAlterRuleEventRulePtrInput
	// Alert rule group ID
	GroupId pulumi.StringPtrInput
	// The cluster alert group interval seconds. Default: `180` (int)
	GroupIntervalSeconds pulumi.IntPtrInput
	// The cluster alert group wait seconds. Default: `180` (int)
	GroupWaitSeconds pulumi.IntPtrInput
	// Alert rule inherited
	Inherited pulumi.BoolPtrInput
	// The cluster alert group labels (map)
	Labels pulumi.MapInput
	// Alert metric rule
	MetricRule ClusterAlterRuleMetricRulePtrInput
	// The cluster alert group name (string)
	Name pulumi.StringPtrInput
	// Alert node rule
	NodeRule ClusterAlterRuleNodeRulePtrInput
	// The cluster alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrInput
	// Alert rule severity
	Severity pulumi.StringPtrInput
	// Alert system service rule
	SystemServiceRule ClusterAlterRuleSystemServiceRulePtrInput
}

func (ClusterAlterRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterAlterRuleState)(nil)).Elem()
}

type clusterAlterRuleArgs struct {
	// The cluster alert group annotations (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id where create cluster alert group (string)
	ClusterId string `pulumi:"clusterId"`
	// Alert event rule
	EventRule *ClusterAlterRuleEventRule `pulumi:"eventRule"`
	// Alert rule group ID
	GroupId string `pulumi:"groupId"`
	// The cluster alert group interval seconds. Default: `180` (int)
	GroupIntervalSeconds *int `pulumi:"groupIntervalSeconds"`
	// The cluster alert group wait seconds. Default: `180` (int)
	GroupWaitSeconds *int `pulumi:"groupWaitSeconds"`
	// Alert rule inherited
	Inherited *bool `pulumi:"inherited"`
	// The cluster alert group labels (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Alert metric rule
	MetricRule *ClusterAlterRuleMetricRule `pulumi:"metricRule"`
	// The cluster alert group name (string)
	Name *string `pulumi:"name"`
	// Alert node rule
	NodeRule *ClusterAlterRuleNodeRule `pulumi:"nodeRule"`
	// The cluster alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds *int `pulumi:"repeatIntervalSeconds"`
	// Alert rule severity
	Severity *string `pulumi:"severity"`
	// Alert system service rule
	SystemServiceRule *ClusterAlterRuleSystemServiceRule `pulumi:"systemServiceRule"`
}

// The set of arguments for constructing a ClusterAlterRule resource.
type ClusterAlterRuleArgs struct {
	// The cluster alert group annotations (map)
	Annotations pulumi.MapInput
	// The cluster id where create cluster alert group (string)
	ClusterId pulumi.StringInput
	// Alert event rule
	EventRule ClusterAlterRuleEventRulePtrInput
	// Alert rule group ID
	GroupId pulumi.StringInput
	// The cluster alert group interval seconds. Default: `180` (int)
	GroupIntervalSeconds pulumi.IntPtrInput
	// The cluster alert group wait seconds. Default: `180` (int)
	GroupWaitSeconds pulumi.IntPtrInput
	// Alert rule inherited
	Inherited pulumi.BoolPtrInput
	// The cluster alert group labels (map)
	Labels pulumi.MapInput
	// Alert metric rule
	MetricRule ClusterAlterRuleMetricRulePtrInput
	// The cluster alert group name (string)
	Name pulumi.StringPtrInput
	// Alert node rule
	NodeRule ClusterAlterRuleNodeRulePtrInput
	// The cluster alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrInput
	// Alert rule severity
	Severity pulumi.StringPtrInput
	// Alert system service rule
	SystemServiceRule ClusterAlterRuleSystemServiceRulePtrInput
}

func (ClusterAlterRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterAlterRuleArgs)(nil)).Elem()
}

type ClusterAlterRuleInput interface {
	pulumi.Input

	ToClusterAlterRuleOutput() ClusterAlterRuleOutput
	ToClusterAlterRuleOutputWithContext(ctx context.Context) ClusterAlterRuleOutput
}

func (*ClusterAlterRule) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterAlterRule)(nil)).Elem()
}

func (i *ClusterAlterRule) ToClusterAlterRuleOutput() ClusterAlterRuleOutput {
	return i.ToClusterAlterRuleOutputWithContext(context.Background())
}

func (i *ClusterAlterRule) ToClusterAlterRuleOutputWithContext(ctx context.Context) ClusterAlterRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterAlterRuleOutput)
}

// ClusterAlterRuleArrayInput is an input type that accepts ClusterAlterRuleArray and ClusterAlterRuleArrayOutput values.
// You can construct a concrete instance of `ClusterAlterRuleArrayInput` via:
//
//	ClusterAlterRuleArray{ ClusterAlterRuleArgs{...} }
type ClusterAlterRuleArrayInput interface {
	pulumi.Input

	ToClusterAlterRuleArrayOutput() ClusterAlterRuleArrayOutput
	ToClusterAlterRuleArrayOutputWithContext(context.Context) ClusterAlterRuleArrayOutput
}

type ClusterAlterRuleArray []ClusterAlterRuleInput

func (ClusterAlterRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterAlterRule)(nil)).Elem()
}

func (i ClusterAlterRuleArray) ToClusterAlterRuleArrayOutput() ClusterAlterRuleArrayOutput {
	return i.ToClusterAlterRuleArrayOutputWithContext(context.Background())
}

func (i ClusterAlterRuleArray) ToClusterAlterRuleArrayOutputWithContext(ctx context.Context) ClusterAlterRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterAlterRuleArrayOutput)
}

// ClusterAlterRuleMapInput is an input type that accepts ClusterAlterRuleMap and ClusterAlterRuleMapOutput values.
// You can construct a concrete instance of `ClusterAlterRuleMapInput` via:
//
//	ClusterAlterRuleMap{ "key": ClusterAlterRuleArgs{...} }
type ClusterAlterRuleMapInput interface {
	pulumi.Input

	ToClusterAlterRuleMapOutput() ClusterAlterRuleMapOutput
	ToClusterAlterRuleMapOutputWithContext(context.Context) ClusterAlterRuleMapOutput
}

type ClusterAlterRuleMap map[string]ClusterAlterRuleInput

func (ClusterAlterRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterAlterRule)(nil)).Elem()
}

func (i ClusterAlterRuleMap) ToClusterAlterRuleMapOutput() ClusterAlterRuleMapOutput {
	return i.ToClusterAlterRuleMapOutputWithContext(context.Background())
}

func (i ClusterAlterRuleMap) ToClusterAlterRuleMapOutputWithContext(ctx context.Context) ClusterAlterRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterAlterRuleMapOutput)
}

type ClusterAlterRuleOutput struct{ *pulumi.OutputState }

func (ClusterAlterRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterAlterRule)(nil)).Elem()
}

func (o ClusterAlterRuleOutput) ToClusterAlterRuleOutput() ClusterAlterRuleOutput {
	return o
}

func (o ClusterAlterRuleOutput) ToClusterAlterRuleOutputWithContext(ctx context.Context) ClusterAlterRuleOutput {
	return o
}

type ClusterAlterRuleArrayOutput struct{ *pulumi.OutputState }

func (ClusterAlterRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterAlterRule)(nil)).Elem()
}

func (o ClusterAlterRuleArrayOutput) ToClusterAlterRuleArrayOutput() ClusterAlterRuleArrayOutput {
	return o
}

func (o ClusterAlterRuleArrayOutput) ToClusterAlterRuleArrayOutputWithContext(ctx context.Context) ClusterAlterRuleArrayOutput {
	return o
}

func (o ClusterAlterRuleArrayOutput) Index(i pulumi.IntInput) ClusterAlterRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClusterAlterRule {
		return vs[0].([]*ClusterAlterRule)[vs[1].(int)]
	}).(ClusterAlterRuleOutput)
}

type ClusterAlterRuleMapOutput struct{ *pulumi.OutputState }

func (ClusterAlterRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterAlterRule)(nil)).Elem()
}

func (o ClusterAlterRuleMapOutput) ToClusterAlterRuleMapOutput() ClusterAlterRuleMapOutput {
	return o
}

func (o ClusterAlterRuleMapOutput) ToClusterAlterRuleMapOutputWithContext(ctx context.Context) ClusterAlterRuleMapOutput {
	return o
}

func (o ClusterAlterRuleMapOutput) MapIndex(k pulumi.StringInput) ClusterAlterRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClusterAlterRule {
		return vs[0].(map[string]*ClusterAlterRule)[vs[1].(string)]
	}).(ClusterAlterRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterAlterRuleInput)(nil)).Elem(), &ClusterAlterRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterAlterRuleArrayInput)(nil)).Elem(), ClusterAlterRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterAlterRuleMapInput)(nil)).Elem(), ClusterAlterRuleMap{})
	pulumi.RegisterOutputType(ClusterAlterRuleOutput{})
	pulumi.RegisterOutputType(ClusterAlterRuleArrayOutput{})
	pulumi.RegisterOutputType(ClusterAlterRuleMapOutput{})
}
