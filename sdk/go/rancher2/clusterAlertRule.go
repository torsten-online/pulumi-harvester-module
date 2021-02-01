// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Rancher v2 Cluster Alert Rule resource. This can be used to create Cluster Alert Rule for Rancher v2 environments and retrieve their information.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-rancher2/sdk/v2/go/rancher2/"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		fooClusterAlertGroup, err := rancher2.NewClusterAlertGroup(ctx, "fooClusterAlertGroup", &rancher2.ClusterAlertGroupArgs{
// 			ClusterId:             pulumi.String("<cluster_id>"),
// 			Description:           pulumi.String("Terraform cluster alert group"),
// 			GroupIntervalSeconds:  pulumi.Int(300),
// 			RepeatIntervalSeconds: pulumi.Int(3600),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = rancher2.NewClusterAlertRule(ctx, "fooClusterAlertRule", &rancher2.ClusterAlertRuleArgs{
// 			ClusterId:             fooClusterAlertGroup.ClusterId,
// 			GroupId:               fooClusterAlertGroup.ID(),
// 			GroupIntervalSeconds:  pulumi.Int(600),
// 			RepeatIntervalSeconds: pulumi.Int(6000),
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
// Cluster Alert Rule can be imported using the Rancher cluster alert rule ID
//
// ```sh
//  $ pulumi import rancher2:index/clusterAlertRule:ClusterAlertRule foo &lt;CLUSTER_ALERT_RULE_ID&gt;
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
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("rancher2:index/clusterAlterRule:ClusterAlterRule"),
		},
	})
	opts = append(opts, aliases)
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
	return reflect.TypeOf((*ClusterAlertRule)(nil))
}

func (i *ClusterAlertRule) ToClusterAlertRuleOutput() ClusterAlertRuleOutput {
	return i.ToClusterAlertRuleOutputWithContext(context.Background())
}

func (i *ClusterAlertRule) ToClusterAlertRuleOutputWithContext(ctx context.Context) ClusterAlertRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterAlertRuleOutput)
}

type ClusterAlertRuleOutput struct {
	*pulumi.OutputState
}

func (ClusterAlertRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ClusterAlertRule)(nil))
}

func (o ClusterAlertRuleOutput) ToClusterAlertRuleOutput() ClusterAlertRuleOutput {
	return o
}

func (o ClusterAlertRuleOutput) ToClusterAlertRuleOutputWithContext(ctx context.Context) ClusterAlertRuleOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ClusterAlertRuleOutput{})
}
