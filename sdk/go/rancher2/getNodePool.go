// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package rancher2

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 Node Pool resource.
// 
// > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/node_pool.html.markdown.
func LookupNodePool(ctx *pulumi.Context, args *LookupNodePoolArgs, opts ...pulumi.InvokeOption) (*LookupNodePoolResult, error) {
	var rv LookupNodePoolResult
	err := ctx.Invoke("rancher2:index/getNodePool:getNodePool", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNodePool.
type LookupNodePoolArgs struct {
	// The RKE cluster id to use Node Pool (string)
	ClusterId string `pulumi:"clusterId"`
	// The name of the Node Pool (string)
	Name string `pulumi:"name"`
	// The Node Template ID to use for node creation (string)
	NodeTemplateId *string `pulumi:"nodeTemplateId"`
}


// A collection of values returned by getNodePool.
type LookupNodePoolResult struct {
	// (Computed) Annotations for Node Pool object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	ClusterId string `pulumi:"clusterId"`
	// (Computed) RKE control plane role for created nodes (bool)
	ControlPlane bool `pulumi:"controlPlane"`
	// (Computed) Delete not ready node after secs. Default `0` (int)
	DeleteNotReadyAfterSecs int `pulumi:"deleteNotReadyAfterSecs"`
	// (Computed) RKE etcd role for created nodes (bool)
	Etcd bool `pulumi:"etcd"`
	// (Computed) The prefix for created nodes of the Node Pool (string)
	HostnamePrefix string `pulumi:"hostnamePrefix"`
	// id is the provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for Node Pool object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	Name string `pulumi:"name"`
	// (Computed) Node taints (List)
	NodeTaints []GetNodePoolNodeTaint `pulumi:"nodeTaints"`
	NodeTemplateId string `pulumi:"nodeTemplateId"`
	// (Computed) The number of nodes to create on Node Pool (int)
	Quantity int `pulumi:"quantity"`
	// (Computed) RKE role role for created nodes (bool)
	Worker bool `pulumi:"worker"`
}

