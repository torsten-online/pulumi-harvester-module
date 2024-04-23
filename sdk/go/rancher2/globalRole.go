// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Global Role resource. This can be used to create Global Role for Rancher v2 and retrieve their information.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// Create a new rancher2 Global Role
//			_, err := rancher2.NewGlobalRole(ctx, "foo", &rancher2.GlobalRoleArgs{
//				Name:           pulumi.String("foo"),
//				NewUserDefault: pulumi.Bool(true),
//				Description:    pulumi.String("Terraform global role acceptance test"),
//				Rules: rancher2.GlobalRoleRuleArray{
//					&rancher2.GlobalRoleRuleArgs{
//						ApiGroups: pulumi.StringArray{
//							pulumi.String("*"),
//						},
//						Resources: pulumi.StringArray{
//							pulumi.String("secrets"),
//						},
//						Verbs: pulumi.StringArray{
//							pulumi.String("create"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// # Global Role can be imported using the Rancher Global Role ID
//
// ```sh
// $ pulumi import rancher2:index/globalRole:GlobalRole foo &lt;global_role_id&gt;
// ```
type GlobalRole struct {
	pulumi.CustomResourceState

	// Annotations for global role object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// (Computed) Builtin global role (bool)
	Builtin pulumi.BoolOutput `pulumi:"builtin"`
	// Global role description (string)
	Description pulumi.StringOutput `pulumi:"description"`
	// Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster
	InheritedClusterRoles pulumi.StringArrayOutput `pulumi:"inheritedClusterRoles"`
	// Labels for global role object (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Global role name (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Whether or not this role should be added to new users. Default `false` (bool)
	NewUserDefault pulumi.BoolPtrOutput `pulumi:"newUserDefault"`
	// Global role policy rules (list)
	Rules GlobalRoleRuleArrayOutput `pulumi:"rules"`
}

// NewGlobalRole registers a new resource with the given unique name, arguments, and options.
func NewGlobalRole(ctx *pulumi.Context,
	name string, args *GlobalRoleArgs, opts ...pulumi.ResourceOption) (*GlobalRole, error) {
	if args == nil {
		args = &GlobalRoleArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GlobalRole
	err := ctx.RegisterResource("rancher2:index/globalRole:GlobalRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGlobalRole gets an existing GlobalRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGlobalRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GlobalRoleState, opts ...pulumi.ResourceOption) (*GlobalRole, error) {
	var resource GlobalRole
	err := ctx.ReadResource("rancher2:index/globalRole:GlobalRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GlobalRole resources.
type globalRoleState struct {
	// Annotations for global role object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) Builtin global role (bool)
	Builtin *bool `pulumi:"builtin"`
	// Global role description (string)
	Description *string `pulumi:"description"`
	// Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster
	InheritedClusterRoles []string `pulumi:"inheritedClusterRoles"`
	// Labels for global role object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Global role name (string)
	Name *string `pulumi:"name"`
	// Whether or not this role should be added to new users. Default `false` (bool)
	NewUserDefault *bool `pulumi:"newUserDefault"`
	// Global role policy rules (list)
	Rules []GlobalRoleRule `pulumi:"rules"`
}

type GlobalRoleState struct {
	// Annotations for global role object (map)
	Annotations pulumi.MapInput
	// (Computed) Builtin global role (bool)
	Builtin pulumi.BoolPtrInput
	// Global role description (string)
	Description pulumi.StringPtrInput
	// Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster
	InheritedClusterRoles pulumi.StringArrayInput
	// Labels for global role object (map)
	Labels pulumi.MapInput
	// Global role name (string)
	Name pulumi.StringPtrInput
	// Whether or not this role should be added to new users. Default `false` (bool)
	NewUserDefault pulumi.BoolPtrInput
	// Global role policy rules (list)
	Rules GlobalRoleRuleArrayInput
}

func (GlobalRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*globalRoleState)(nil)).Elem()
}

type globalRoleArgs struct {
	// Annotations for global role object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Global role description (string)
	Description *string `pulumi:"description"`
	// Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster
	InheritedClusterRoles []string `pulumi:"inheritedClusterRoles"`
	// Labels for global role object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Global role name (string)
	Name *string `pulumi:"name"`
	// Whether or not this role should be added to new users. Default `false` (bool)
	NewUserDefault *bool `pulumi:"newUserDefault"`
	// Global role policy rules (list)
	Rules []GlobalRoleRule `pulumi:"rules"`
}

// The set of arguments for constructing a GlobalRole resource.
type GlobalRoleArgs struct {
	// Annotations for global role object (map)
	Annotations pulumi.MapInput
	// Global role description (string)
	Description pulumi.StringPtrInput
	// Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster
	InheritedClusterRoles pulumi.StringArrayInput
	// Labels for global role object (map)
	Labels pulumi.MapInput
	// Global role name (string)
	Name pulumi.StringPtrInput
	// Whether or not this role should be added to new users. Default `false` (bool)
	NewUserDefault pulumi.BoolPtrInput
	// Global role policy rules (list)
	Rules GlobalRoleRuleArrayInput
}

func (GlobalRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*globalRoleArgs)(nil)).Elem()
}

type GlobalRoleInput interface {
	pulumi.Input

	ToGlobalRoleOutput() GlobalRoleOutput
	ToGlobalRoleOutputWithContext(ctx context.Context) GlobalRoleOutput
}

func (*GlobalRole) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalRole)(nil)).Elem()
}

func (i *GlobalRole) ToGlobalRoleOutput() GlobalRoleOutput {
	return i.ToGlobalRoleOutputWithContext(context.Background())
}

func (i *GlobalRole) ToGlobalRoleOutputWithContext(ctx context.Context) GlobalRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalRoleOutput)
}

// GlobalRoleArrayInput is an input type that accepts GlobalRoleArray and GlobalRoleArrayOutput values.
// You can construct a concrete instance of `GlobalRoleArrayInput` via:
//
//	GlobalRoleArray{ GlobalRoleArgs{...} }
type GlobalRoleArrayInput interface {
	pulumi.Input

	ToGlobalRoleArrayOutput() GlobalRoleArrayOutput
	ToGlobalRoleArrayOutputWithContext(context.Context) GlobalRoleArrayOutput
}

type GlobalRoleArray []GlobalRoleInput

func (GlobalRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalRole)(nil)).Elem()
}

func (i GlobalRoleArray) ToGlobalRoleArrayOutput() GlobalRoleArrayOutput {
	return i.ToGlobalRoleArrayOutputWithContext(context.Background())
}

func (i GlobalRoleArray) ToGlobalRoleArrayOutputWithContext(ctx context.Context) GlobalRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalRoleArrayOutput)
}

// GlobalRoleMapInput is an input type that accepts GlobalRoleMap and GlobalRoleMapOutput values.
// You can construct a concrete instance of `GlobalRoleMapInput` via:
//
//	GlobalRoleMap{ "key": GlobalRoleArgs{...} }
type GlobalRoleMapInput interface {
	pulumi.Input

	ToGlobalRoleMapOutput() GlobalRoleMapOutput
	ToGlobalRoleMapOutputWithContext(context.Context) GlobalRoleMapOutput
}

type GlobalRoleMap map[string]GlobalRoleInput

func (GlobalRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalRole)(nil)).Elem()
}

func (i GlobalRoleMap) ToGlobalRoleMapOutput() GlobalRoleMapOutput {
	return i.ToGlobalRoleMapOutputWithContext(context.Background())
}

func (i GlobalRoleMap) ToGlobalRoleMapOutputWithContext(ctx context.Context) GlobalRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalRoleMapOutput)
}

type GlobalRoleOutput struct{ *pulumi.OutputState }

func (GlobalRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalRole)(nil)).Elem()
}

func (o GlobalRoleOutput) ToGlobalRoleOutput() GlobalRoleOutput {
	return o
}

func (o GlobalRoleOutput) ToGlobalRoleOutputWithContext(ctx context.Context) GlobalRoleOutput {
	return o
}

// Annotations for global role object (map)
func (o GlobalRoleOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *GlobalRole) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// (Computed) Builtin global role (bool)
func (o GlobalRoleOutput) Builtin() pulumi.BoolOutput {
	return o.ApplyT(func(v *GlobalRole) pulumi.BoolOutput { return v.Builtin }).(pulumi.BoolOutput)
}

// Global role description (string)
func (o GlobalRoleOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalRole) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Names of role templates whose permissions are granted by this global role in every cluster besides the local cluster
func (o GlobalRoleOutput) InheritedClusterRoles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GlobalRole) pulumi.StringArrayOutput { return v.InheritedClusterRoles }).(pulumi.StringArrayOutput)
}

// Labels for global role object (map)
func (o GlobalRoleOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *GlobalRole) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// Global role name (string)
func (o GlobalRoleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalRole) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Whether or not this role should be added to new users. Default `false` (bool)
func (o GlobalRoleOutput) NewUserDefault() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GlobalRole) pulumi.BoolPtrOutput { return v.NewUserDefault }).(pulumi.BoolPtrOutput)
}

// Global role policy rules (list)
func (o GlobalRoleOutput) Rules() GlobalRoleRuleArrayOutput {
	return o.ApplyT(func(v *GlobalRole) GlobalRoleRuleArrayOutput { return v.Rules }).(GlobalRoleRuleArrayOutput)
}

type GlobalRoleArrayOutput struct{ *pulumi.OutputState }

func (GlobalRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalRole)(nil)).Elem()
}

func (o GlobalRoleArrayOutput) ToGlobalRoleArrayOutput() GlobalRoleArrayOutput {
	return o
}

func (o GlobalRoleArrayOutput) ToGlobalRoleArrayOutputWithContext(ctx context.Context) GlobalRoleArrayOutput {
	return o
}

func (o GlobalRoleArrayOutput) Index(i pulumi.IntInput) GlobalRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GlobalRole {
		return vs[0].([]*GlobalRole)[vs[1].(int)]
	}).(GlobalRoleOutput)
}

type GlobalRoleMapOutput struct{ *pulumi.OutputState }

func (GlobalRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalRole)(nil)).Elem()
}

func (o GlobalRoleMapOutput) ToGlobalRoleMapOutput() GlobalRoleMapOutput {
	return o
}

func (o GlobalRoleMapOutput) ToGlobalRoleMapOutputWithContext(ctx context.Context) GlobalRoleMapOutput {
	return o
}

func (o GlobalRoleMapOutput) MapIndex(k pulumi.StringInput) GlobalRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GlobalRole {
		return vs[0].(map[string]*GlobalRole)[vs[1].(string)]
	}).(GlobalRoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalRoleInput)(nil)).Elem(), &GlobalRole{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalRoleArrayInput)(nil)).Elem(), GlobalRoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalRoleMapInput)(nil)).Elem(), GlobalRoleMap{})
	pulumi.RegisterOutputType(GlobalRoleOutput{})
	pulumi.RegisterOutputType(GlobalRoleArrayOutput{})
	pulumi.RegisterOutputType(GlobalRoleMapOutput{})
}
