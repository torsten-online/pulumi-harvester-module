// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Global Role Binding resource. This can be used to create Global Role Bindings for Rancher v2 environments and retrieve their information.
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
// 		_, err := rancher2.NewGlobalRoleBinding(ctx, "foo", &rancher2.GlobalRoleBindingArgs{
// 			GlobalRoleId: pulumi.String("admin"),
// 			UserId:       pulumi.String("user-XXXXX"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = rancher2.NewGlobalRoleBinding(ctx, "foo2", &rancher2.GlobalRoleBindingArgs{
// 			GlobalRoleId:     pulumi.String("admin"),
// 			GroupPrincipalId: pulumi.String("local://g-XXXXX"),
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
// Global Role Bindings can be imported using the Rancher Global Role Binding ID
//
// ```sh
//  $ pulumi import rancher2:index/globalRoleBinding:GlobalRoleBinding foo &lt;GLOBAL_ROLE_BINDING_ID&gt;
// ```
type GlobalRoleBinding struct {
	pulumi.CustomResourceState

	// Annotations for global role binding (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The role id from create global role binding (string)
	GlobalRoleId pulumi.StringOutput `pulumi:"globalRoleId"`
	// The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
	GroupPrincipalId pulumi.StringOutput `pulumi:"groupPrincipalId"`
	// Labels for global role binding (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the global role binding (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The user ID to assign global role binding (string)
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewGlobalRoleBinding registers a new resource with the given unique name, arguments, and options.
func NewGlobalRoleBinding(ctx *pulumi.Context,
	name string, args *GlobalRoleBindingArgs, opts ...pulumi.ResourceOption) (*GlobalRoleBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GlobalRoleId == nil {
		return nil, errors.New("invalid value for required argument 'GlobalRoleId'")
	}
	var resource GlobalRoleBinding
	err := ctx.RegisterResource("rancher2:index/globalRoleBinding:GlobalRoleBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGlobalRoleBinding gets an existing GlobalRoleBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGlobalRoleBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GlobalRoleBindingState, opts ...pulumi.ResourceOption) (*GlobalRoleBinding, error) {
	var resource GlobalRoleBinding
	err := ctx.ReadResource("rancher2:index/globalRoleBinding:GlobalRoleBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GlobalRoleBinding resources.
type globalRoleBindingState struct {
	// Annotations for global role binding (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The role id from create global role binding (string)
	GlobalRoleId *string `pulumi:"globalRoleId"`
	// The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
	GroupPrincipalId *string `pulumi:"groupPrincipalId"`
	// Labels for global role binding (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the global role binding (string)
	Name *string `pulumi:"name"`
	// The user ID to assign global role binding (string)
	UserId *string `pulumi:"userId"`
}

type GlobalRoleBindingState struct {
	// Annotations for global role binding (map)
	Annotations pulumi.MapInput
	// The role id from create global role binding (string)
	GlobalRoleId pulumi.StringPtrInput
	// The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
	GroupPrincipalId pulumi.StringPtrInput
	// Labels for global role binding (map)
	Labels pulumi.MapInput
	// The name of the global role binding (string)
	Name pulumi.StringPtrInput
	// The user ID to assign global role binding (string)
	UserId pulumi.StringPtrInput
}

func (GlobalRoleBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*globalRoleBindingState)(nil)).Elem()
}

type globalRoleBindingArgs struct {
	// Annotations for global role binding (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The role id from create global role binding (string)
	GlobalRoleId string `pulumi:"globalRoleId"`
	// The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
	GroupPrincipalId *string `pulumi:"groupPrincipalId"`
	// Labels for global role binding (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the global role binding (string)
	Name *string `pulumi:"name"`
	// The user ID to assign global role binding (string)
	UserId *string `pulumi:"userId"`
}

// The set of arguments for constructing a GlobalRoleBinding resource.
type GlobalRoleBindingArgs struct {
	// Annotations for global role binding (map)
	Annotations pulumi.MapInput
	// The role id from create global role binding (string)
	GlobalRoleId pulumi.StringInput
	// The group principal ID to assign global role binding (only works with external auth providers that support groups). Rancher v2.4.0 or higher is required (string)
	GroupPrincipalId pulumi.StringPtrInput
	// Labels for global role binding (map)
	Labels pulumi.MapInput
	// The name of the global role binding (string)
	Name pulumi.StringPtrInput
	// The user ID to assign global role binding (string)
	UserId pulumi.StringPtrInput
}

func (GlobalRoleBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*globalRoleBindingArgs)(nil)).Elem()
}

type GlobalRoleBindingInput interface {
	pulumi.Input

	ToGlobalRoleBindingOutput() GlobalRoleBindingOutput
	ToGlobalRoleBindingOutputWithContext(ctx context.Context) GlobalRoleBindingOutput
}

func (*GlobalRoleBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalRoleBinding)(nil)).Elem()
}

func (i *GlobalRoleBinding) ToGlobalRoleBindingOutput() GlobalRoleBindingOutput {
	return i.ToGlobalRoleBindingOutputWithContext(context.Background())
}

func (i *GlobalRoleBinding) ToGlobalRoleBindingOutputWithContext(ctx context.Context) GlobalRoleBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalRoleBindingOutput)
}

// GlobalRoleBindingArrayInput is an input type that accepts GlobalRoleBindingArray and GlobalRoleBindingArrayOutput values.
// You can construct a concrete instance of `GlobalRoleBindingArrayInput` via:
//
//          GlobalRoleBindingArray{ GlobalRoleBindingArgs{...} }
type GlobalRoleBindingArrayInput interface {
	pulumi.Input

	ToGlobalRoleBindingArrayOutput() GlobalRoleBindingArrayOutput
	ToGlobalRoleBindingArrayOutputWithContext(context.Context) GlobalRoleBindingArrayOutput
}

type GlobalRoleBindingArray []GlobalRoleBindingInput

func (GlobalRoleBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalRoleBinding)(nil)).Elem()
}

func (i GlobalRoleBindingArray) ToGlobalRoleBindingArrayOutput() GlobalRoleBindingArrayOutput {
	return i.ToGlobalRoleBindingArrayOutputWithContext(context.Background())
}

func (i GlobalRoleBindingArray) ToGlobalRoleBindingArrayOutputWithContext(ctx context.Context) GlobalRoleBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalRoleBindingArrayOutput)
}

// GlobalRoleBindingMapInput is an input type that accepts GlobalRoleBindingMap and GlobalRoleBindingMapOutput values.
// You can construct a concrete instance of `GlobalRoleBindingMapInput` via:
//
//          GlobalRoleBindingMap{ "key": GlobalRoleBindingArgs{...} }
type GlobalRoleBindingMapInput interface {
	pulumi.Input

	ToGlobalRoleBindingMapOutput() GlobalRoleBindingMapOutput
	ToGlobalRoleBindingMapOutputWithContext(context.Context) GlobalRoleBindingMapOutput
}

type GlobalRoleBindingMap map[string]GlobalRoleBindingInput

func (GlobalRoleBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalRoleBinding)(nil)).Elem()
}

func (i GlobalRoleBindingMap) ToGlobalRoleBindingMapOutput() GlobalRoleBindingMapOutput {
	return i.ToGlobalRoleBindingMapOutputWithContext(context.Background())
}

func (i GlobalRoleBindingMap) ToGlobalRoleBindingMapOutputWithContext(ctx context.Context) GlobalRoleBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalRoleBindingMapOutput)
}

type GlobalRoleBindingOutput struct{ *pulumi.OutputState }

func (GlobalRoleBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalRoleBinding)(nil)).Elem()
}

func (o GlobalRoleBindingOutput) ToGlobalRoleBindingOutput() GlobalRoleBindingOutput {
	return o
}

func (o GlobalRoleBindingOutput) ToGlobalRoleBindingOutputWithContext(ctx context.Context) GlobalRoleBindingOutput {
	return o
}

type GlobalRoleBindingArrayOutput struct{ *pulumi.OutputState }

func (GlobalRoleBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalRoleBinding)(nil)).Elem()
}

func (o GlobalRoleBindingArrayOutput) ToGlobalRoleBindingArrayOutput() GlobalRoleBindingArrayOutput {
	return o
}

func (o GlobalRoleBindingArrayOutput) ToGlobalRoleBindingArrayOutputWithContext(ctx context.Context) GlobalRoleBindingArrayOutput {
	return o
}

func (o GlobalRoleBindingArrayOutput) Index(i pulumi.IntInput) GlobalRoleBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GlobalRoleBinding {
		return vs[0].([]*GlobalRoleBinding)[vs[1].(int)]
	}).(GlobalRoleBindingOutput)
}

type GlobalRoleBindingMapOutput struct{ *pulumi.OutputState }

func (GlobalRoleBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalRoleBinding)(nil)).Elem()
}

func (o GlobalRoleBindingMapOutput) ToGlobalRoleBindingMapOutput() GlobalRoleBindingMapOutput {
	return o
}

func (o GlobalRoleBindingMapOutput) ToGlobalRoleBindingMapOutputWithContext(ctx context.Context) GlobalRoleBindingMapOutput {
	return o
}

func (o GlobalRoleBindingMapOutput) MapIndex(k pulumi.StringInput) GlobalRoleBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GlobalRoleBinding {
		return vs[0].(map[string]*GlobalRoleBinding)[vs[1].(string)]
	}).(GlobalRoleBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalRoleBindingInput)(nil)).Elem(), &GlobalRoleBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalRoleBindingArrayInput)(nil)).Elem(), GlobalRoleBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalRoleBindingMapInput)(nil)).Elem(), GlobalRoleBindingMap{})
	pulumi.RegisterOutputType(GlobalRoleBindingOutput{})
	pulumi.RegisterOutputType(GlobalRoleBindingArrayOutput{})
	pulumi.RegisterOutputType(GlobalRoleBindingMapOutput{})
}
