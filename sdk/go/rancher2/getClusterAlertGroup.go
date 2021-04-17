// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 cluster alert group.
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
// 		_, err := rancher2.LookupClusterAlertGroup(ctx, &rancher2.LookupClusterAlertGroupArgs{
// 			ClusterId: "<cluster_id>",
// 			Name:      "<cluster_alert_group_name>",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupClusterAlertGroup(ctx *pulumi.Context, args *LookupClusterAlertGroupArgs, opts ...pulumi.InvokeOption) (*LookupClusterAlertGroupResult, error) {
	var rv LookupClusterAlertGroupResult
	err := ctx.Invoke("rancher2:index/getClusterAlertGroup:getClusterAlertGroup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClusterAlertGroup.
type LookupClusterAlertGroupArgs struct {
	// The cluster id where create cluster alert group (string)
	ClusterId string `pulumi:"clusterId"`
	// The cluster alert group name (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getClusterAlertGroup.
type LookupClusterAlertGroupResult struct {
	// (Computed) The cluster alert group annotations (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	ClusterId   string                 `pulumi:"clusterId"`
	// (Computed) The cluster alert group description (string)
	Description string `pulumi:"description"`
	// (Computed) The cluster alert group interval seconds. Default: `180` (int)
	GroupIntervalSeconds int `pulumi:"groupIntervalSeconds"`
	// (Computed) The cluster alert group wait seconds. Default: `180` (int)
	GroupWaitSeconds int `pulumi:"groupWaitSeconds"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) The cluster alert group labels (map)
	Labels map[string]interface{} `pulumi:"labels"`
	Name   string                 `pulumi:"name"`
	// (Computed) The cluster alert group recipients (list)
	Recipients []GetClusterAlertGroupRecipient `pulumi:"recipients"`
	// (Computed) The cluster alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds int `pulumi:"repeatIntervalSeconds"`
}
