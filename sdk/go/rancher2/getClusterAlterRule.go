// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

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
	ClusterId string                 `pulumi:"clusterId"`
	Labels    map[string]interface{} `pulumi:"labels"`
	Name      string                 `pulumi:"name"`
}

// A collection of values returned by getClusterAlterRule.
type LookupClusterAlterRuleResult struct {
	Annotations          map[string]interface{}       `pulumi:"annotations"`
	ClusterId            string                       `pulumi:"clusterId"`
	EventRule            GetClusterAlterRuleEventRule `pulumi:"eventRule"`
	GroupId              string                       `pulumi:"groupId"`
	GroupIntervalSeconds int                          `pulumi:"groupIntervalSeconds"`
	GroupWaitSeconds     int                          `pulumi:"groupWaitSeconds"`
	// The provider-assigned unique ID for this managed resource.
	Id                    string                               `pulumi:"id"`
	Inherited             bool                                 `pulumi:"inherited"`
	Labels                map[string]interface{}               `pulumi:"labels"`
	MetricRule            GetClusterAlterRuleMetricRule        `pulumi:"metricRule"`
	Name                  string                               `pulumi:"name"`
	NodeRule              GetClusterAlterRuleNodeRule          `pulumi:"nodeRule"`
	RepeatIntervalSeconds int                                  `pulumi:"repeatIntervalSeconds"`
	Severity              string                               `pulumi:"severity"`
	SystemServiceRule     GetClusterAlterRuleSystemServiceRule `pulumi:"systemServiceRule"`
}
