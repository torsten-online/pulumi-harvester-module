// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type Bootstrap struct {
	pulumi.CustomResourceState

	// Current password for Admin user. Just needed for recover if admin password has been changed from other resources and token is expired (string)
	CurrentPassword pulumi.StringOutput `pulumi:"currentPassword"`
	// Password for Admin user or random generated if empty (string)
	Password pulumi.StringOutput `pulumi:"password"`
	// Send telemetry anonymous data. Default: `false` (bool)
	Telemetry pulumi.BoolPtrOutput `pulumi:"telemetry"`
	// (Computed) Generated API temporary token as helper. Should be empty (string)
	TempToken pulumi.StringOutput `pulumi:"tempToken"`
	// (Computed) Generated API temporary token id as helper. Should be empty (string)
	TempTokenId pulumi.StringOutput `pulumi:"tempTokenId"`
	// (Computed) Generated API token for Admin User (string)
	Token pulumi.StringOutput `pulumi:"token"`
	// (Computed) Generated API token id for Admin User (string)
	TokenId pulumi.StringOutput `pulumi:"tokenId"`
	// TTL in seconds for generated admin token. Default: `0`  (int)
	TokenTtl pulumi.IntPtrOutput `pulumi:"tokenTtl"`
	// Regenerate admin token. Default: `false` (bool)
	TokenUpdate pulumi.BoolPtrOutput `pulumi:"tokenUpdate"`
	// Default UI landing for k8s clusters. Available options: `ember` (cluster manager ui)  and `vue` (cluster explorer ui). Default: `ember` (string)
	UiDefaultLanding pulumi.StringPtrOutput `pulumi:"uiDefaultLanding"`
	// (Computed) URL set as server-url (string)
	Url pulumi.StringOutput `pulumi:"url"`
	// (Computed) Admin username (string)
	User pulumi.StringOutput `pulumi:"user"`
}

// NewBootstrap registers a new resource with the given unique name, arguments, and options.
func NewBootstrap(ctx *pulumi.Context,
	name string, args *BootstrapArgs, opts ...pulumi.ResourceOption) (*Bootstrap, error) {
	if args == nil {
		args = &BootstrapArgs{}
	}

	var resource Bootstrap
	err := ctx.RegisterResource("rancher2:index/bootstrap:Bootstrap", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBootstrap gets an existing Bootstrap resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBootstrap(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BootstrapState, opts ...pulumi.ResourceOption) (*Bootstrap, error) {
	var resource Bootstrap
	err := ctx.ReadResource("rancher2:index/bootstrap:Bootstrap", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Bootstrap resources.
type bootstrapState struct {
	// Current password for Admin user. Just needed for recover if admin password has been changed from other resources and token is expired (string)
	CurrentPassword *string `pulumi:"currentPassword"`
	// Password for Admin user or random generated if empty (string)
	Password *string `pulumi:"password"`
	// Send telemetry anonymous data. Default: `false` (bool)
	Telemetry *bool `pulumi:"telemetry"`
	// (Computed) Generated API temporary token as helper. Should be empty (string)
	TempToken *string `pulumi:"tempToken"`
	// (Computed) Generated API temporary token id as helper. Should be empty (string)
	TempTokenId *string `pulumi:"tempTokenId"`
	// (Computed) Generated API token for Admin User (string)
	Token *string `pulumi:"token"`
	// (Computed) Generated API token id for Admin User (string)
	TokenId *string `pulumi:"tokenId"`
	// TTL in seconds for generated admin token. Default: `0`  (int)
	TokenTtl *int `pulumi:"tokenTtl"`
	// Regenerate admin token. Default: `false` (bool)
	TokenUpdate *bool `pulumi:"tokenUpdate"`
	// Default UI landing for k8s clusters. Available options: `ember` (cluster manager ui)  and `vue` (cluster explorer ui). Default: `ember` (string)
	UiDefaultLanding *string `pulumi:"uiDefaultLanding"`
	// (Computed) URL set as server-url (string)
	Url *string `pulumi:"url"`
	// (Computed) Admin username (string)
	User *string `pulumi:"user"`
}

type BootstrapState struct {
	// Current password for Admin user. Just needed for recover if admin password has been changed from other resources and token is expired (string)
	CurrentPassword pulumi.StringPtrInput
	// Password for Admin user or random generated if empty (string)
	Password pulumi.StringPtrInput
	// Send telemetry anonymous data. Default: `false` (bool)
	Telemetry pulumi.BoolPtrInput
	// (Computed) Generated API temporary token as helper. Should be empty (string)
	TempToken pulumi.StringPtrInput
	// (Computed) Generated API temporary token id as helper. Should be empty (string)
	TempTokenId pulumi.StringPtrInput
	// (Computed) Generated API token for Admin User (string)
	Token pulumi.StringPtrInput
	// (Computed) Generated API token id for Admin User (string)
	TokenId pulumi.StringPtrInput
	// TTL in seconds for generated admin token. Default: `0`  (int)
	TokenTtl pulumi.IntPtrInput
	// Regenerate admin token. Default: `false` (bool)
	TokenUpdate pulumi.BoolPtrInput
	// Default UI landing for k8s clusters. Available options: `ember` (cluster manager ui)  and `vue` (cluster explorer ui). Default: `ember` (string)
	UiDefaultLanding pulumi.StringPtrInput
	// (Computed) URL set as server-url (string)
	Url pulumi.StringPtrInput
	// (Computed) Admin username (string)
	User pulumi.StringPtrInput
}

func (BootstrapState) ElementType() reflect.Type {
	return reflect.TypeOf((*bootstrapState)(nil)).Elem()
}

type bootstrapArgs struct {
	// Current password for Admin user. Just needed for recover if admin password has been changed from other resources and token is expired (string)
	CurrentPassword *string `pulumi:"currentPassword"`
	// Password for Admin user or random generated if empty (string)
	Password *string `pulumi:"password"`
	// Send telemetry anonymous data. Default: `false` (bool)
	Telemetry *bool `pulumi:"telemetry"`
	// TTL in seconds for generated admin token. Default: `0`  (int)
	TokenTtl *int `pulumi:"tokenTtl"`
	// Regenerate admin token. Default: `false` (bool)
	TokenUpdate *bool `pulumi:"tokenUpdate"`
	// Default UI landing for k8s clusters. Available options: `ember` (cluster manager ui)  and `vue` (cluster explorer ui). Default: `ember` (string)
	UiDefaultLanding *string `pulumi:"uiDefaultLanding"`
}

// The set of arguments for constructing a Bootstrap resource.
type BootstrapArgs struct {
	// Current password for Admin user. Just needed for recover if admin password has been changed from other resources and token is expired (string)
	CurrentPassword pulumi.StringPtrInput
	// Password for Admin user or random generated if empty (string)
	Password pulumi.StringPtrInput
	// Send telemetry anonymous data. Default: `false` (bool)
	Telemetry pulumi.BoolPtrInput
	// TTL in seconds for generated admin token. Default: `0`  (int)
	TokenTtl pulumi.IntPtrInput
	// Regenerate admin token. Default: `false` (bool)
	TokenUpdate pulumi.BoolPtrInput
	// Default UI landing for k8s clusters. Available options: `ember` (cluster manager ui)  and `vue` (cluster explorer ui). Default: `ember` (string)
	UiDefaultLanding pulumi.StringPtrInput
}

func (BootstrapArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bootstrapArgs)(nil)).Elem()
}

type BootstrapInput interface {
	pulumi.Input

	ToBootstrapOutput() BootstrapOutput
	ToBootstrapOutputWithContext(ctx context.Context) BootstrapOutput
}

func (*Bootstrap) ElementType() reflect.Type {
	return reflect.TypeOf((*Bootstrap)(nil))
}

func (i *Bootstrap) ToBootstrapOutput() BootstrapOutput {
	return i.ToBootstrapOutputWithContext(context.Background())
}

func (i *Bootstrap) ToBootstrapOutputWithContext(ctx context.Context) BootstrapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BootstrapOutput)
}

func (i *Bootstrap) ToBootstrapPtrOutput() BootstrapPtrOutput {
	return i.ToBootstrapPtrOutputWithContext(context.Background())
}

func (i *Bootstrap) ToBootstrapPtrOutputWithContext(ctx context.Context) BootstrapPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BootstrapPtrOutput)
}

type BootstrapPtrInput interface {
	pulumi.Input

	ToBootstrapPtrOutput() BootstrapPtrOutput
	ToBootstrapPtrOutputWithContext(ctx context.Context) BootstrapPtrOutput
}

type bootstrapPtrType BootstrapArgs

func (*bootstrapPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Bootstrap)(nil))
}

func (i *bootstrapPtrType) ToBootstrapPtrOutput() BootstrapPtrOutput {
	return i.ToBootstrapPtrOutputWithContext(context.Background())
}

func (i *bootstrapPtrType) ToBootstrapPtrOutputWithContext(ctx context.Context) BootstrapPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BootstrapPtrOutput)
}

// BootstrapArrayInput is an input type that accepts BootstrapArray and BootstrapArrayOutput values.
// You can construct a concrete instance of `BootstrapArrayInput` via:
//
//          BootstrapArray{ BootstrapArgs{...} }
type BootstrapArrayInput interface {
	pulumi.Input

	ToBootstrapArrayOutput() BootstrapArrayOutput
	ToBootstrapArrayOutputWithContext(context.Context) BootstrapArrayOutput
}

type BootstrapArray []BootstrapInput

func (BootstrapArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Bootstrap)(nil))
}

func (i BootstrapArray) ToBootstrapArrayOutput() BootstrapArrayOutput {
	return i.ToBootstrapArrayOutputWithContext(context.Background())
}

func (i BootstrapArray) ToBootstrapArrayOutputWithContext(ctx context.Context) BootstrapArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BootstrapArrayOutput)
}

// BootstrapMapInput is an input type that accepts BootstrapMap and BootstrapMapOutput values.
// You can construct a concrete instance of `BootstrapMapInput` via:
//
//          BootstrapMap{ "key": BootstrapArgs{...} }
type BootstrapMapInput interface {
	pulumi.Input

	ToBootstrapMapOutput() BootstrapMapOutput
	ToBootstrapMapOutputWithContext(context.Context) BootstrapMapOutput
}

type BootstrapMap map[string]BootstrapInput

func (BootstrapMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Bootstrap)(nil))
}

func (i BootstrapMap) ToBootstrapMapOutput() BootstrapMapOutput {
	return i.ToBootstrapMapOutputWithContext(context.Background())
}

func (i BootstrapMap) ToBootstrapMapOutputWithContext(ctx context.Context) BootstrapMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BootstrapMapOutput)
}

type BootstrapOutput struct {
	*pulumi.OutputState
}

func (BootstrapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Bootstrap)(nil))
}

func (o BootstrapOutput) ToBootstrapOutput() BootstrapOutput {
	return o
}

func (o BootstrapOutput) ToBootstrapOutputWithContext(ctx context.Context) BootstrapOutput {
	return o
}

func (o BootstrapOutput) ToBootstrapPtrOutput() BootstrapPtrOutput {
	return o.ToBootstrapPtrOutputWithContext(context.Background())
}

func (o BootstrapOutput) ToBootstrapPtrOutputWithContext(ctx context.Context) BootstrapPtrOutput {
	return o.ApplyT(func(v Bootstrap) *Bootstrap {
		return &v
	}).(BootstrapPtrOutput)
}

type BootstrapPtrOutput struct {
	*pulumi.OutputState
}

func (BootstrapPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Bootstrap)(nil))
}

func (o BootstrapPtrOutput) ToBootstrapPtrOutput() BootstrapPtrOutput {
	return o
}

func (o BootstrapPtrOutput) ToBootstrapPtrOutputWithContext(ctx context.Context) BootstrapPtrOutput {
	return o
}

type BootstrapArrayOutput struct{ *pulumi.OutputState }

func (BootstrapArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Bootstrap)(nil))
}

func (o BootstrapArrayOutput) ToBootstrapArrayOutput() BootstrapArrayOutput {
	return o
}

func (o BootstrapArrayOutput) ToBootstrapArrayOutputWithContext(ctx context.Context) BootstrapArrayOutput {
	return o
}

func (o BootstrapArrayOutput) Index(i pulumi.IntInput) BootstrapOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Bootstrap {
		return vs[0].([]Bootstrap)[vs[1].(int)]
	}).(BootstrapOutput)
}

type BootstrapMapOutput struct{ *pulumi.OutputState }

func (BootstrapMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Bootstrap)(nil))
}

func (o BootstrapMapOutput) ToBootstrapMapOutput() BootstrapMapOutput {
	return o
}

func (o BootstrapMapOutput) ToBootstrapMapOutputWithContext(ctx context.Context) BootstrapMapOutput {
	return o
}

func (o BootstrapMapOutput) MapIndex(k pulumi.StringInput) BootstrapOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Bootstrap {
		return vs[0].(map[string]Bootstrap)[vs[1].(string)]
	}).(BootstrapOutput)
}

func init() {
	pulumi.RegisterOutputType(BootstrapOutput{})
	pulumi.RegisterOutputType(BootstrapPtrOutput{})
	pulumi.RegisterOutputType(BootstrapArrayOutput{})
	pulumi.RegisterOutputType(BootstrapMapOutput{})
}
