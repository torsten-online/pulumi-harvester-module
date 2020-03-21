// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package rancher2

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Rancher v2 Cluster Alert Group resource. This can be used to create Cluster Alert Group for Rancher v2 environments and retrieve their information.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/clusterAlertGroup.html.markdown.
type ClusterAlterGroup struct {
	pulumi.CustomResourceState

	// The cluster alert group annotations (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The cluster id where create cluster alert group (string)
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The cluster alert group description (string)
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The cluster alert group interval seconds. Default: `180` (int)
	GroupIntervalSeconds pulumi.IntPtrOutput `pulumi:"groupIntervalSeconds"`
	// The cluster alert group wait seconds. Default: `180` (int)
	GroupWaitSeconds pulumi.IntPtrOutput `pulumi:"groupWaitSeconds"`
	// The cluster alert group labels (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The cluster alert group name (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The cluster alert group recipients (list)
	Recipients ClusterAlterGroupRecipientArrayOutput `pulumi:"recipients"`
	// The cluster alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrOutput `pulumi:"repeatIntervalSeconds"`
}

// NewClusterAlterGroup registers a new resource with the given unique name, arguments, and options.
func NewClusterAlterGroup(ctx *pulumi.Context,
	name string, args *ClusterAlterGroupArgs, opts ...pulumi.ResourceOption) (*ClusterAlterGroup, error) {
	if args == nil || args.ClusterId == nil {
		return nil, errors.New("missing required argument 'ClusterId'")
	}
	if args == nil {
		args = &ClusterAlterGroupArgs{}
	}
	var resource ClusterAlterGroup
	err := ctx.RegisterResource("rancher2:index/clusterAlterGroup:ClusterAlterGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterAlterGroup gets an existing ClusterAlterGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterAlterGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterAlterGroupState, opts ...pulumi.ResourceOption) (*ClusterAlterGroup, error) {
	var resource ClusterAlterGroup
	err := ctx.ReadResource("rancher2:index/clusterAlterGroup:ClusterAlterGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterAlterGroup resources.
type clusterAlterGroupState struct {
	// The cluster alert group annotations (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id where create cluster alert group (string)
	ClusterId *string `pulumi:"clusterId"`
	// The cluster alert group description (string)
	Description *string `pulumi:"description"`
	// The cluster alert group interval seconds. Default: `180` (int)
	GroupIntervalSeconds *int `pulumi:"groupIntervalSeconds"`
	// The cluster alert group wait seconds. Default: `180` (int)
	GroupWaitSeconds *int `pulumi:"groupWaitSeconds"`
	// The cluster alert group labels (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The cluster alert group name (string)
	Name *string `pulumi:"name"`
	// The cluster alert group recipients (list)
	Recipients []ClusterAlterGroupRecipient `pulumi:"recipients"`
	// The cluster alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds *int `pulumi:"repeatIntervalSeconds"`
}

type ClusterAlterGroupState struct {
	// The cluster alert group annotations (map)
	Annotations pulumi.MapInput
	// The cluster id where create cluster alert group (string)
	ClusterId pulumi.StringPtrInput
	// The cluster alert group description (string)
	Description pulumi.StringPtrInput
	// The cluster alert group interval seconds. Default: `180` (int)
	GroupIntervalSeconds pulumi.IntPtrInput
	// The cluster alert group wait seconds. Default: `180` (int)
	GroupWaitSeconds pulumi.IntPtrInput
	// The cluster alert group labels (map)
	Labels pulumi.MapInput
	// The cluster alert group name (string)
	Name pulumi.StringPtrInput
	// The cluster alert group recipients (list)
	Recipients ClusterAlterGroupRecipientArrayInput
	// The cluster alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrInput
}

func (ClusterAlterGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterAlterGroupState)(nil)).Elem()
}

type clusterAlterGroupArgs struct {
	// The cluster alert group annotations (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id where create cluster alert group (string)
	ClusterId string `pulumi:"clusterId"`
	// The cluster alert group description (string)
	Description *string `pulumi:"description"`
	// The cluster alert group interval seconds. Default: `180` (int)
	GroupIntervalSeconds *int `pulumi:"groupIntervalSeconds"`
	// The cluster alert group wait seconds. Default: `180` (int)
	GroupWaitSeconds *int `pulumi:"groupWaitSeconds"`
	// The cluster alert group labels (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The cluster alert group name (string)
	Name *string `pulumi:"name"`
	// The cluster alert group recipients (list)
	Recipients []ClusterAlterGroupRecipient `pulumi:"recipients"`
	// The cluster alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds *int `pulumi:"repeatIntervalSeconds"`
}

// The set of arguments for constructing a ClusterAlterGroup resource.
type ClusterAlterGroupArgs struct {
	// The cluster alert group annotations (map)
	Annotations pulumi.MapInput
	// The cluster id where create cluster alert group (string)
	ClusterId pulumi.StringInput
	// The cluster alert group description (string)
	Description pulumi.StringPtrInput
	// The cluster alert group interval seconds. Default: `180` (int)
	GroupIntervalSeconds pulumi.IntPtrInput
	// The cluster alert group wait seconds. Default: `180` (int)
	GroupWaitSeconds pulumi.IntPtrInput
	// The cluster alert group labels (map)
	Labels pulumi.MapInput
	// The cluster alert group name (string)
	Name pulumi.StringPtrInput
	// The cluster alert group recipients (list)
	Recipients ClusterAlterGroupRecipientArrayInput
	// The cluster alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrInput
}

func (ClusterAlterGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterAlterGroupArgs)(nil)).Elem()
}

