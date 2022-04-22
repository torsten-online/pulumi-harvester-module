// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 cluster alert rule.
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
// 		_, err := rancher2.LookupClusterAlterRule(ctx, &GetClusterAlterRuleArgs{
// 			ClusterId: "<cluster_id>",
// 			Name:      "<cluster_alert_rule_name>",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupClusterAlterRule(ctx *pulumi.Context, args *LookupClusterAlterRuleArgs, opts ...pulumi.InvokeOption) (*LookupClusterAlterRuleResult, error) {
	var rv LookupClusterAlterRuleResult
	err := ctx.Invoke("rancher2:index/getClusterAlterRule:getClusterAlterRule", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClusterAlterRule.
type LookupClusterAlterRuleArgs struct {
	// The cluster id where create cluster alert rule (string)
	ClusterId string `pulumi:"clusterId"`
	// (Computed) The cluster alert rule labels (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The cluster alert rule name (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getClusterAlterRule.
type LookupClusterAlterRuleResult struct {
	// (Computed) The cluster alert rule annotations (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	ClusterId   string                 `pulumi:"clusterId"`
	// (Computed) The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"` (list Maxitems:1)
	EventRule GetClusterAlterRuleEventRule `pulumi:"eventRule"`
	// (Computed) The cluster alert rule alert group ID (string)
	GroupId string `pulumi:"groupId"`
	// (Computed) The cluster alert rule group interval seconds. Default: `180` (int)
	GroupIntervalSeconds int `pulumi:"groupIntervalSeconds"`
	// (Computed) The cluster alert rule group wait seconds. Default: `180` (int)
	GroupWaitSeconds int `pulumi:"groupWaitSeconds"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) The cluster alert rule inherited. Default: `true` (bool)
	Inherited bool `pulumi:"inherited"`
	// (Computed) The cluster alert rule labels (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
	MetricRule GetClusterAlterRuleMetricRule `pulumi:"metricRule"`
	Name       string                        `pulumi:"name"`
	// (Computed) The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
	NodeRule GetClusterAlterRuleNodeRule `pulumi:"nodeRule"`
	// (Optional) The cluster alert rule wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds int `pulumi:"repeatIntervalSeconds"`
	// (Computed) The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
	Severity string `pulumi:"severity"`
	// (Computed) The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"`` (list Maxitems:1)
	SystemServiceRule GetClusterAlterRuleSystemServiceRule `pulumi:"systemServiceRule"`
}

func LookupClusterAlterRuleOutput(ctx *pulumi.Context, args LookupClusterAlterRuleOutputArgs, opts ...pulumi.InvokeOption) LookupClusterAlterRuleResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupClusterAlterRuleResult, error) {
			args := v.(LookupClusterAlterRuleArgs)
			r, err := LookupClusterAlterRule(ctx, &args, opts...)
			var s LookupClusterAlterRuleResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupClusterAlterRuleResultOutput)
}

// A collection of arguments for invoking getClusterAlterRule.
type LookupClusterAlterRuleOutputArgs struct {
	// The cluster id where create cluster alert rule (string)
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
	// (Computed) The cluster alert rule labels (map)
	Labels pulumi.MapInput `pulumi:"labels"`
	// The cluster alert rule name (string)
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupClusterAlterRuleOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterAlterRuleArgs)(nil)).Elem()
}

// A collection of values returned by getClusterAlterRule.
type LookupClusterAlterRuleResultOutput struct{ *pulumi.OutputState }

func (LookupClusterAlterRuleResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterAlterRuleResult)(nil)).Elem()
}

func (o LookupClusterAlterRuleResultOutput) ToLookupClusterAlterRuleResultOutput() LookupClusterAlterRuleResultOutput {
	return o
}

func (o LookupClusterAlterRuleResultOutput) ToLookupClusterAlterRuleResultOutputWithContext(ctx context.Context) LookupClusterAlterRuleResultOutput {
	return o
}

// (Computed) The cluster alert rule annotations (map)
func (o LookupClusterAlterRuleResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupClusterAlterRuleResult) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

func (o LookupClusterAlterRuleResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterAlterRuleResult) string { return v.ClusterId }).(pulumi.StringOutput)
}

// (Computed) The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"` (list Maxitems:1)
func (o LookupClusterAlterRuleResultOutput) EventRule() GetClusterAlterRuleEventRuleOutput {
	return o.ApplyT(func(v LookupClusterAlterRuleResult) GetClusterAlterRuleEventRule { return v.EventRule }).(GetClusterAlterRuleEventRuleOutput)
}

// (Computed) The cluster alert rule alert group ID (string)
func (o LookupClusterAlterRuleResultOutput) GroupId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterAlterRuleResult) string { return v.GroupId }).(pulumi.StringOutput)
}

// (Computed) The cluster alert rule group interval seconds. Default: `180` (int)
func (o LookupClusterAlterRuleResultOutput) GroupIntervalSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v LookupClusterAlterRuleResult) int { return v.GroupIntervalSeconds }).(pulumi.IntOutput)
}

// (Computed) The cluster alert rule group wait seconds. Default: `180` (int)
func (o LookupClusterAlterRuleResultOutput) GroupWaitSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v LookupClusterAlterRuleResult) int { return v.GroupWaitSeconds }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupClusterAlterRuleResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterAlterRuleResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) The cluster alert rule inherited. Default: `true` (bool)
func (o LookupClusterAlterRuleResultOutput) Inherited() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterAlterRuleResult) bool { return v.Inherited }).(pulumi.BoolOutput)
}

// (Computed) The cluster alert rule labels (map)
func (o LookupClusterAlterRuleResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupClusterAlterRuleResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

// (Computed) The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
func (o LookupClusterAlterRuleResultOutput) MetricRule() GetClusterAlterRuleMetricRuleOutput {
	return o.ApplyT(func(v LookupClusterAlterRuleResult) GetClusterAlterRuleMetricRule { return v.MetricRule }).(GetClusterAlterRuleMetricRuleOutput)
}

func (o LookupClusterAlterRuleResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterAlterRuleResult) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
func (o LookupClusterAlterRuleResultOutput) NodeRule() GetClusterAlterRuleNodeRuleOutput {
	return o.ApplyT(func(v LookupClusterAlterRuleResult) GetClusterAlterRuleNodeRule { return v.NodeRule }).(GetClusterAlterRuleNodeRuleOutput)
}

// (Optional) The cluster alert rule wait seconds. Default: `3600` (int)
func (o LookupClusterAlterRuleResultOutput) RepeatIntervalSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v LookupClusterAlterRuleResult) int { return v.RepeatIntervalSeconds }).(pulumi.IntOutput)
}

// (Computed) The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
func (o LookupClusterAlterRuleResultOutput) Severity() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterAlterRuleResult) string { return v.Severity }).(pulumi.StringOutput)
}

// (Computed) The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"`` (list Maxitems:1)
func (o LookupClusterAlterRuleResultOutput) SystemServiceRule() GetClusterAlterRuleSystemServiceRuleOutput {
	return o.ApplyT(func(v LookupClusterAlterRuleResult) GetClusterAlterRuleSystemServiceRule { return v.SystemServiceRule }).(GetClusterAlterRuleSystemServiceRuleOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupClusterAlterRuleResultOutput{})
}
