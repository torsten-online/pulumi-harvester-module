// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package rancher2

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Rancher v2 Cluster Alert Rule resource. This can be used to create Cluster Alert Rule for Rancher v2 environments and retrieve their information.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/clusterAlertRule.html.markdown.
type ClusterAlterRule struct {
	pulumi.CustomResourceState

	// The cluster alert rule annotations (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The cluster id where create cluster alert rule (string)
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	EventRule ClusterAlterRuleEventRulePtrOutput `pulumi:"eventRule"`
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
	MetricRule ClusterAlterRuleMetricRulePtrOutput `pulumi:"metricRule"`
	// The cluster alert rule name (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
	NodeRule ClusterAlterRuleNodeRulePtrOutput `pulumi:"nodeRule"`
	// The cluster alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrOutput `pulumi:"repeatIntervalSeconds"`
	// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity pulumi.StringPtrOutput `pulumi:"severity"`
	// The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"`` (list Maxitems:1)
	SystemServiceRule ClusterAlterRuleSystemServiceRulePtrOutput `pulumi:"systemServiceRule"`
}

// NewClusterAlterRule registers a new resource with the given unique name, arguments, and options.
func NewClusterAlterRule(ctx *pulumi.Context,
	name string, args *ClusterAlterRuleArgs, opts ...pulumi.ResourceOption) (*ClusterAlterRule, error) {
	if args == nil || args.ClusterId == nil {
		return nil, errors.New("missing required argument 'ClusterId'")
	}
	if args == nil || args.GroupId == nil {
		return nil, errors.New("missing required argument 'GroupId'")
	}
	if args == nil {
		args = &ClusterAlterRuleArgs{}
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
	// The cluster alert rule annotations (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id where create cluster alert rule (string)
	ClusterId *string `pulumi:"clusterId"`
	// The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	EventRule *ClusterAlterRuleEventRule `pulumi:"eventRule"`
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
	MetricRule *ClusterAlterRuleMetricRule `pulumi:"metricRule"`
	// The cluster alert rule name (string)
	Name *string `pulumi:"name"`
	// The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
	NodeRule *ClusterAlterRuleNodeRule `pulumi:"nodeRule"`
	// The cluster alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds *int `pulumi:"repeatIntervalSeconds"`
	// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity *string `pulumi:"severity"`
	// The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"`` (list Maxitems:1)
	SystemServiceRule *ClusterAlterRuleSystemServiceRule `pulumi:"systemServiceRule"`
}

type ClusterAlterRuleState struct {
	// The cluster alert rule annotations (map)
	Annotations pulumi.MapInput
	// The cluster id where create cluster alert rule (string)
	ClusterId pulumi.StringPtrInput
	// The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	EventRule ClusterAlterRuleEventRulePtrInput
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
	MetricRule ClusterAlterRuleMetricRulePtrInput
	// The cluster alert rule name (string)
	Name pulumi.StringPtrInput
	// The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
	NodeRule ClusterAlterRuleNodeRulePtrInput
	// The cluster alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrInput
	// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity pulumi.StringPtrInput
	// The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"`` (list Maxitems:1)
	SystemServiceRule ClusterAlterRuleSystemServiceRulePtrInput
}

func (ClusterAlterRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterAlterRuleState)(nil)).Elem()
}

type clusterAlterRuleArgs struct {
	// The cluster alert rule annotations (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id where create cluster alert rule (string)
	ClusterId string `pulumi:"clusterId"`
	// The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	EventRule *ClusterAlterRuleEventRule `pulumi:"eventRule"`
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
	MetricRule *ClusterAlterRuleMetricRule `pulumi:"metricRule"`
	// The cluster alert rule name (string)
	Name *string `pulumi:"name"`
	// The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
	NodeRule *ClusterAlterRuleNodeRule `pulumi:"nodeRule"`
	// The cluster alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds *int `pulumi:"repeatIntervalSeconds"`
	// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity *string `pulumi:"severity"`
	// The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"`` (list Maxitems:1)
	SystemServiceRule *ClusterAlterRuleSystemServiceRule `pulumi:"systemServiceRule"`
}

// The set of arguments for constructing a ClusterAlterRule resource.
type ClusterAlterRuleArgs struct {
	// The cluster alert rule annotations (map)
	Annotations pulumi.MapInput
	// The cluster id where create cluster alert rule (string)
	ClusterId pulumi.StringInput
	// The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	EventRule ClusterAlterRuleEventRulePtrInput
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
	MetricRule ClusterAlterRuleMetricRulePtrInput
	// The cluster alert rule name (string)
	Name pulumi.StringPtrInput
	// The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
	NodeRule ClusterAlterRuleNodeRulePtrInput
	// The cluster alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrInput
	// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity pulumi.StringPtrInput
	// The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"`` (list Maxitems:1)
	SystemServiceRule ClusterAlterRuleSystemServiceRulePtrInput
}

func (ClusterAlterRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterAlterRuleArgs)(nil)).Elem()
}

