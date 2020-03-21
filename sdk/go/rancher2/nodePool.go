// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package rancher2

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Rancher v2 Node Pool resource. This can be used to create Node Pool, using Node template for Rancher v2 RKE clusters and retrieve their information.
// 
// > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/node_pool.html.markdown.
type NodePool struct {
	pulumi.CustomResourceState

	// Annotations for Node Pool object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The RKE cluster id to use Node Pool (string)
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// RKE control plane role for created nodes (bool)
	ControlPlane pulumi.BoolPtrOutput `pulumi:"controlPlane"`
	// Delete not ready node after secs. For Rancher v2.3.3 or above. Default `0` (int)
	DeleteNotReadyAfterSecs pulumi.IntPtrOutput `pulumi:"deleteNotReadyAfterSecs"`
	// RKE etcd role for created nodes (bool)
	Etcd pulumi.BoolPtrOutput `pulumi:"etcd"`
	// The prefix for created nodes of the Node Pool (string)
	HostnamePrefix pulumi.StringOutput `pulumi:"hostnamePrefix"`
	// Labels for Node Pool object (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the Node Pool (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Node taints. For Rancher v2.3.3 or above (List)
	NodeTaints NodePoolNodeTaintArrayOutput `pulumi:"nodeTaints"`
	// The Node Template ID to use for node creation (string)
	NodeTemplateId pulumi.StringOutput `pulumi:"nodeTemplateId"`
	// The number of nodes to create on Node Pool. Default `1`. Only values >= 1 allowed (int)
	Quantity pulumi.IntPtrOutput `pulumi:"quantity"`
	// RKE role role for created nodes (bool)
	Worker pulumi.BoolPtrOutput `pulumi:"worker"`
}

// NewNodePool registers a new resource with the given unique name, arguments, and options.
func NewNodePool(ctx *pulumi.Context,
	name string, args *NodePoolArgs, opts ...pulumi.ResourceOption) (*NodePool, error) {
	if args == nil || args.ClusterId == nil {
		return nil, errors.New("missing required argument 'ClusterId'")
	}
	if args == nil || args.HostnamePrefix == nil {
		return nil, errors.New("missing required argument 'HostnamePrefix'")
	}
	if args == nil || args.NodeTemplateId == nil {
		return nil, errors.New("missing required argument 'NodeTemplateId'")
	}
	if args == nil {
		args = &NodePoolArgs{}
	}
	var resource NodePool
	err := ctx.RegisterResource("rancher2:index/nodePool:NodePool", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNodePool gets an existing NodePool resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNodePool(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NodePoolState, opts ...pulumi.ResourceOption) (*NodePool, error) {
	var resource NodePool
	err := ctx.ReadResource("rancher2:index/nodePool:NodePool", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NodePool resources.
type nodePoolState struct {
	// Annotations for Node Pool object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The RKE cluster id to use Node Pool (string)
	ClusterId *string `pulumi:"clusterId"`
	// RKE control plane role for created nodes (bool)
	ControlPlane *bool `pulumi:"controlPlane"`
	// Delete not ready node after secs. For Rancher v2.3.3 or above. Default `0` (int)
	DeleteNotReadyAfterSecs *int `pulumi:"deleteNotReadyAfterSecs"`
	// RKE etcd role for created nodes (bool)
	Etcd *bool `pulumi:"etcd"`
	// The prefix for created nodes of the Node Pool (string)
	HostnamePrefix *string `pulumi:"hostnamePrefix"`
	// Labels for Node Pool object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the Node Pool (string)
	Name *string `pulumi:"name"`
	// Node taints. For Rancher v2.3.3 or above (List)
	NodeTaints []NodePoolNodeTaint `pulumi:"nodeTaints"`
	// The Node Template ID to use for node creation (string)
	NodeTemplateId *string `pulumi:"nodeTemplateId"`
	// The number of nodes to create on Node Pool. Default `1`. Only values >= 1 allowed (int)
	Quantity *int `pulumi:"quantity"`
	// RKE role role for created nodes (bool)
	Worker *bool `pulumi:"worker"`
}

type NodePoolState struct {
	// Annotations for Node Pool object (map)
	Annotations pulumi.MapInput
	// The RKE cluster id to use Node Pool (string)
	ClusterId pulumi.StringPtrInput
	// RKE control plane role for created nodes (bool)
	ControlPlane pulumi.BoolPtrInput
	// Delete not ready node after secs. For Rancher v2.3.3 or above. Default `0` (int)
	DeleteNotReadyAfterSecs pulumi.IntPtrInput
	// RKE etcd role for created nodes (bool)
	Etcd pulumi.BoolPtrInput
	// The prefix for created nodes of the Node Pool (string)
	HostnamePrefix pulumi.StringPtrInput
	// Labels for Node Pool object (map)
	Labels pulumi.MapInput
	// The name of the Node Pool (string)
	Name pulumi.StringPtrInput
	// Node taints. For Rancher v2.3.3 or above (List)
	NodeTaints NodePoolNodeTaintArrayInput
	// The Node Template ID to use for node creation (string)
	NodeTemplateId pulumi.StringPtrInput
	// The number of nodes to create on Node Pool. Default `1`. Only values >= 1 allowed (int)
	Quantity pulumi.IntPtrInput
	// RKE role role for created nodes (bool)
	Worker pulumi.BoolPtrInput
}

func (NodePoolState) ElementType() reflect.Type {
	return reflect.TypeOf((*nodePoolState)(nil)).Elem()
}

type nodePoolArgs struct {
	// Annotations for Node Pool object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The RKE cluster id to use Node Pool (string)
	ClusterId string `pulumi:"clusterId"`
	// RKE control plane role for created nodes (bool)
	ControlPlane *bool `pulumi:"controlPlane"`
	// Delete not ready node after secs. For Rancher v2.3.3 or above. Default `0` (int)
	DeleteNotReadyAfterSecs *int `pulumi:"deleteNotReadyAfterSecs"`
	// RKE etcd role for created nodes (bool)
	Etcd *bool `pulumi:"etcd"`
	// The prefix for created nodes of the Node Pool (string)
	HostnamePrefix string `pulumi:"hostnamePrefix"`
	// Labels for Node Pool object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the Node Pool (string)
	Name *string `pulumi:"name"`
	// Node taints. For Rancher v2.3.3 or above (List)
	NodeTaints []NodePoolNodeTaint `pulumi:"nodeTaints"`
	// The Node Template ID to use for node creation (string)
	NodeTemplateId string `pulumi:"nodeTemplateId"`
	// The number of nodes to create on Node Pool. Default `1`. Only values >= 1 allowed (int)
	Quantity *int `pulumi:"quantity"`
	// RKE role role for created nodes (bool)
	Worker *bool `pulumi:"worker"`
}

// The set of arguments for constructing a NodePool resource.
type NodePoolArgs struct {
	// Annotations for Node Pool object (map)
	Annotations pulumi.MapInput
	// The RKE cluster id to use Node Pool (string)
	ClusterId pulumi.StringInput
	// RKE control plane role for created nodes (bool)
	ControlPlane pulumi.BoolPtrInput
	// Delete not ready node after secs. For Rancher v2.3.3 or above. Default `0` (int)
	DeleteNotReadyAfterSecs pulumi.IntPtrInput
	// RKE etcd role for created nodes (bool)
	Etcd pulumi.BoolPtrInput
	// The prefix for created nodes of the Node Pool (string)
	HostnamePrefix pulumi.StringInput
	// Labels for Node Pool object (map)
	Labels pulumi.MapInput
	// The name of the Node Pool (string)
	Name pulumi.StringPtrInput
	// Node taints. For Rancher v2.3.3 or above (List)
	NodeTaints NodePoolNodeTaintArrayInput
	// The Node Template ID to use for node creation (string)
	NodeTemplateId pulumi.StringInput
	// The number of nodes to create on Node Pool. Default `1`. Only values >= 1 allowed (int)
	Quantity pulumi.IntPtrInput
	// RKE role role for created nodes (bool)
	Worker pulumi.BoolPtrInput
}

func (NodePoolArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nodePoolArgs)(nil)).Elem()
}

