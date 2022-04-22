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
// 	"github.com/pulumi/pulumi-rancher2/sdk/v3/go/rancher2"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := rancher2.NewClusterAlertGroup(ctx, "foo", &rancher2.ClusterAlertGroupArgs{
// 			ClusterId:             pulumi.String("<cluster_id>"),
// 			Description:           pulumi.String("Terraform cluster alert group"),
// 			GroupIntervalSeconds:  pulumi.Int(300),
// 			RepeatIntervalSeconds: pulumi.Int(3600),
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
// Cluster Alert Group can be imported using the Rancher cluster alert group ID
//
// ```sh
//  $ pulumi import rancher2:index/clusterAlertGroup:ClusterAlertGroup foo &lt;CLUSTER_ALERT_GROUP_ID&gt;
// ```
type ClusterAlertGroup struct {
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
	Recipients ClusterAlertGroupRecipientArrayOutput `pulumi:"recipients"`
	// The cluster alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrOutput `pulumi:"repeatIntervalSeconds"`
}

// NewClusterAlertGroup registers a new resource with the given unique name, arguments, and options.
func NewClusterAlertGroup(ctx *pulumi.Context,
	name string, args *ClusterAlertGroupArgs, opts ...pulumi.ResourceOption) (*ClusterAlertGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("rancher2:index/clusterAlterGroup:ClusterAlterGroup"),
		},
	})
	opts = append(opts, aliases)
	var resource ClusterAlertGroup
	err := ctx.RegisterResource("rancher2:index/clusterAlertGroup:ClusterAlertGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterAlertGroup gets an existing ClusterAlertGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterAlertGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterAlertGroupState, opts ...pulumi.ResourceOption) (*ClusterAlertGroup, error) {
	var resource ClusterAlertGroup
	err := ctx.ReadResource("rancher2:index/clusterAlertGroup:ClusterAlertGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterAlertGroup resources.
type clusterAlertGroupState struct {
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
	Recipients []ClusterAlertGroupRecipient `pulumi:"recipients"`
	// The cluster alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds *int `pulumi:"repeatIntervalSeconds"`
}

type ClusterAlertGroupState struct {
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
	Recipients ClusterAlertGroupRecipientArrayInput
	// The cluster alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrInput
}

func (ClusterAlertGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterAlertGroupState)(nil)).Elem()
}

type clusterAlertGroupArgs struct {
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
	Recipients []ClusterAlertGroupRecipient `pulumi:"recipients"`
	// The cluster alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds *int `pulumi:"repeatIntervalSeconds"`
}

// The set of arguments for constructing a ClusterAlertGroup resource.
type ClusterAlertGroupArgs struct {
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
	Recipients ClusterAlertGroupRecipientArrayInput
	// The cluster alert group wait seconds. Default: `3600` (int)
	RepeatIntervalSeconds pulumi.IntPtrInput
}

func (ClusterAlertGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterAlertGroupArgs)(nil)).Elem()
}

type ClusterAlertGroupInput interface {
	pulumi.Input

	ToClusterAlertGroupOutput() ClusterAlertGroupOutput
	ToClusterAlertGroupOutputWithContext(ctx context.Context) ClusterAlertGroupOutput
}

func (*ClusterAlertGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterAlertGroup)(nil)).Elem()
}

func (i *ClusterAlertGroup) ToClusterAlertGroupOutput() ClusterAlertGroupOutput {
	return i.ToClusterAlertGroupOutputWithContext(context.Background())
}

func (i *ClusterAlertGroup) ToClusterAlertGroupOutputWithContext(ctx context.Context) ClusterAlertGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterAlertGroupOutput)
}

// ClusterAlertGroupArrayInput is an input type that accepts ClusterAlertGroupArray and ClusterAlertGroupArrayOutput values.
// You can construct a concrete instance of `ClusterAlertGroupArrayInput` via:
//
//          ClusterAlertGroupArray{ ClusterAlertGroupArgs{...} }
type ClusterAlertGroupArrayInput interface {
	pulumi.Input

	ToClusterAlertGroupArrayOutput() ClusterAlertGroupArrayOutput
	ToClusterAlertGroupArrayOutputWithContext(context.Context) ClusterAlertGroupArrayOutput
}

type ClusterAlertGroupArray []ClusterAlertGroupInput

func (ClusterAlertGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterAlertGroup)(nil)).Elem()
}

func (i ClusterAlertGroupArray) ToClusterAlertGroupArrayOutput() ClusterAlertGroupArrayOutput {
	return i.ToClusterAlertGroupArrayOutputWithContext(context.Background())
}

func (i ClusterAlertGroupArray) ToClusterAlertGroupArrayOutputWithContext(ctx context.Context) ClusterAlertGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterAlertGroupArrayOutput)
}

// ClusterAlertGroupMapInput is an input type that accepts ClusterAlertGroupMap and ClusterAlertGroupMapOutput values.
// You can construct a concrete instance of `ClusterAlertGroupMapInput` via:
//
//          ClusterAlertGroupMap{ "key": ClusterAlertGroupArgs{...} }
type ClusterAlertGroupMapInput interface {
	pulumi.Input

	ToClusterAlertGroupMapOutput() ClusterAlertGroupMapOutput
	ToClusterAlertGroupMapOutputWithContext(context.Context) ClusterAlertGroupMapOutput
}

type ClusterAlertGroupMap map[string]ClusterAlertGroupInput

func (ClusterAlertGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterAlertGroup)(nil)).Elem()
}

func (i ClusterAlertGroupMap) ToClusterAlertGroupMapOutput() ClusterAlertGroupMapOutput {
	return i.ToClusterAlertGroupMapOutputWithContext(context.Background())
}

func (i ClusterAlertGroupMap) ToClusterAlertGroupMapOutputWithContext(ctx context.Context) ClusterAlertGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterAlertGroupMapOutput)
}

type ClusterAlertGroupOutput struct{ *pulumi.OutputState }

func (ClusterAlertGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterAlertGroup)(nil)).Elem()
}

func (o ClusterAlertGroupOutput) ToClusterAlertGroupOutput() ClusterAlertGroupOutput {
	return o
}

func (o ClusterAlertGroupOutput) ToClusterAlertGroupOutputWithContext(ctx context.Context) ClusterAlertGroupOutput {
	return o
}

type ClusterAlertGroupArrayOutput struct{ *pulumi.OutputState }

func (ClusterAlertGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterAlertGroup)(nil)).Elem()
}

func (o ClusterAlertGroupArrayOutput) ToClusterAlertGroupArrayOutput() ClusterAlertGroupArrayOutput {
	return o
}

func (o ClusterAlertGroupArrayOutput) ToClusterAlertGroupArrayOutputWithContext(ctx context.Context) ClusterAlertGroupArrayOutput {
	return o
}

func (o ClusterAlertGroupArrayOutput) Index(i pulumi.IntInput) ClusterAlertGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClusterAlertGroup {
		return vs[0].([]*ClusterAlertGroup)[vs[1].(int)]
	}).(ClusterAlertGroupOutput)
}

type ClusterAlertGroupMapOutput struct{ *pulumi.OutputState }

func (ClusterAlertGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterAlertGroup)(nil)).Elem()
}

func (o ClusterAlertGroupMapOutput) ToClusterAlertGroupMapOutput() ClusterAlertGroupMapOutput {
	return o
}

func (o ClusterAlertGroupMapOutput) ToClusterAlertGroupMapOutputWithContext(ctx context.Context) ClusterAlertGroupMapOutput {
	return o
}

func (o ClusterAlertGroupMapOutput) MapIndex(k pulumi.StringInput) ClusterAlertGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClusterAlertGroup {
		return vs[0].(map[string]*ClusterAlertGroup)[vs[1].(string)]
	}).(ClusterAlertGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterAlertGroupInput)(nil)).Elem(), &ClusterAlertGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterAlertGroupArrayInput)(nil)).Elem(), ClusterAlertGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterAlertGroupMapInput)(nil)).Elem(), ClusterAlertGroupMap{})
	pulumi.RegisterOutputType(ClusterAlertGroupOutput{})
	pulumi.RegisterOutputType(ClusterAlertGroupArrayOutput{})
	pulumi.RegisterOutputType(ClusterAlertGroupMapOutput{})
}
