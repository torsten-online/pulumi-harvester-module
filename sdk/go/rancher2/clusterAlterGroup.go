// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Deprecated: rancher2.ClusterAlterGroup has been deprecated in favor of rancher2.ClusterAlertGroup
type ClusterAlterGroup struct {
	pulumi.CustomResourceState

	// Annotations of the resource
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// Alert group Cluster ID
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// Alert group description
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Alert group interval seconds
	GroupIntervalSeconds pulumi.IntPtrOutput `pulumi:"groupIntervalSeconds"`
	// Alert group wait seconds
	GroupWaitSeconds pulumi.IntPtrOutput `pulumi:"groupWaitSeconds"`
	// Labels of the resource
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Alert group name
	Name pulumi.StringOutput `pulumi:"name"`
	// Alert group recipients
	Recipients ClusterAlterGroupRecipientArrayOutput `pulumi:"recipients"`
	// Alert group repeat interval seconds
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
	// Annotations of the resource
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Alert group Cluster ID
	ClusterId *string `pulumi:"clusterId"`
	// Alert group description
	Description *string `pulumi:"description"`
	// Alert group interval seconds
	GroupIntervalSeconds *int `pulumi:"groupIntervalSeconds"`
	// Alert group wait seconds
	GroupWaitSeconds *int `pulumi:"groupWaitSeconds"`
	// Labels of the resource
	Labels map[string]interface{} `pulumi:"labels"`
	// Alert group name
	Name *string `pulumi:"name"`
	// Alert group recipients
	Recipients []ClusterAlterGroupRecipient `pulumi:"recipients"`
	// Alert group repeat interval seconds
	RepeatIntervalSeconds *int `pulumi:"repeatIntervalSeconds"`
}

type ClusterAlterGroupState struct {
	// Annotations of the resource
	Annotations pulumi.MapInput
	// Alert group Cluster ID
	ClusterId pulumi.StringPtrInput
	// Alert group description
	Description pulumi.StringPtrInput
	// Alert group interval seconds
	GroupIntervalSeconds pulumi.IntPtrInput
	// Alert group wait seconds
	GroupWaitSeconds pulumi.IntPtrInput
	// Labels of the resource
	Labels pulumi.MapInput
	// Alert group name
	Name pulumi.StringPtrInput
	// Alert group recipients
	Recipients ClusterAlterGroupRecipientArrayInput
	// Alert group repeat interval seconds
	RepeatIntervalSeconds pulumi.IntPtrInput
}

func (ClusterAlterGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterAlterGroupState)(nil)).Elem()
}

type clusterAlterGroupArgs struct {
	// Annotations of the resource
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Alert group Cluster ID
	ClusterId string `pulumi:"clusterId"`
	// Alert group description
	Description *string `pulumi:"description"`
	// Alert group interval seconds
	GroupIntervalSeconds *int `pulumi:"groupIntervalSeconds"`
	// Alert group wait seconds
	GroupWaitSeconds *int `pulumi:"groupWaitSeconds"`
	// Labels of the resource
	Labels map[string]interface{} `pulumi:"labels"`
	// Alert group name
	Name *string `pulumi:"name"`
	// Alert group recipients
	Recipients []ClusterAlterGroupRecipient `pulumi:"recipients"`
	// Alert group repeat interval seconds
	RepeatIntervalSeconds *int `pulumi:"repeatIntervalSeconds"`
}

// The set of arguments for constructing a ClusterAlterGroup resource.
type ClusterAlterGroupArgs struct {
	// Annotations of the resource
	Annotations pulumi.MapInput
	// Alert group Cluster ID
	ClusterId pulumi.StringInput
	// Alert group description
	Description pulumi.StringPtrInput
	// Alert group interval seconds
	GroupIntervalSeconds pulumi.IntPtrInput
	// Alert group wait seconds
	GroupWaitSeconds pulumi.IntPtrInput
	// Labels of the resource
	Labels pulumi.MapInput
	// Alert group name
	Name pulumi.StringPtrInput
	// Alert group recipients
	Recipients ClusterAlterGroupRecipientArrayInput
	// Alert group repeat interval seconds
	RepeatIntervalSeconds pulumi.IntPtrInput
}

func (ClusterAlterGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterAlterGroupArgs)(nil)).Elem()
}

type ClusterAlterGroupInput interface {
	pulumi.Input

	ToClusterAlterGroupOutput() ClusterAlterGroupOutput
	ToClusterAlterGroupOutputWithContext(ctx context.Context) ClusterAlterGroupOutput
}

func (ClusterAlterGroup) ElementType() reflect.Type {
	return reflect.TypeOf((*ClusterAlterGroup)(nil)).Elem()
}

func (i ClusterAlterGroup) ToClusterAlterGroupOutput() ClusterAlterGroupOutput {
	return i.ToClusterAlterGroupOutputWithContext(context.Background())
}

func (i ClusterAlterGroup) ToClusterAlterGroupOutputWithContext(ctx context.Context) ClusterAlterGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterAlterGroupOutput)
}

type ClusterAlterGroupOutput struct {
	*pulumi.OutputState
}

func (ClusterAlterGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ClusterAlterGroupOutput)(nil)).Elem()
}

func (o ClusterAlterGroupOutput) ToClusterAlterGroupOutput() ClusterAlterGroupOutput {
	return o
}

func (o ClusterAlterGroupOutput) ToClusterAlterGroupOutputWithContext(ctx context.Context) ClusterAlterGroupOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ClusterAlterGroupOutput{})
}
