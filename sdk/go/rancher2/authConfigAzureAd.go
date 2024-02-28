// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
//			// Create a new rancher2 Auth Config AzureAD
//			_, err := rancher2.NewAuthConfigAzureAd(ctx, "azuread", &rancher2.AuthConfigAzureAdArgs{
//				ApplicationId:     pulumi.String("<AZUREAD_APP_ID>"),
//				ApplicationSecret: pulumi.String("<AZUREAD_APP_SECRET>"),
//				AuthEndpoint:      pulumi.String("<AZUREAD_AUTH_ENDPOINT>"),
//				GraphEndpoint:     pulumi.String("<AZUREAD_GRAPH_ENDPOINT>"),
//				RancherUrl:        pulumi.String("<RANCHER_URL>"),
//				TenantId:          pulumi.String("<AZUREAD_TENANT_ID>"),
//				TokenEndpoint:     pulumi.String("<AZUREAD_TOKEN_ENDPOINT>"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type AuthConfigAzureAd struct {
	pulumi.CustomResourceState

	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrOutput `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayOutput `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// AzureAD auth application ID (string)
	ApplicationId pulumi.StringOutput `pulumi:"applicationId"`
	// AzureAD auth application secret (string)
	ApplicationSecret pulumi.StringOutput `pulumi:"applicationSecret"`
	// AzureAD auth endpoint (string)
	AuthEndpoint pulumi.StringOutput `pulumi:"authEndpoint"`
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
	Endpoint pulumi.StringPtrOutput `pulumi:"endpoint"`
	// AzureAD graph endpoint (string)
	GraphEndpoint pulumi.StringOutput `pulumi:"graphEndpoint"`
	// Labels of the resource (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Rancher URL (string). "<rancher_url>/verify-auth-azure"
	RancherUrl pulumi.StringOutput `pulumi:"rancherUrl"`
	// AzureAD tenant ID (string)
	TenantId pulumi.StringOutput `pulumi:"tenantId"`
	// AzureAD token endpoint (string)
	TokenEndpoint pulumi.StringOutput `pulumi:"tokenEndpoint"`
	// (Computed) The type of the resource (string)
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewAuthConfigAzureAd registers a new resource with the given unique name, arguments, and options.
func NewAuthConfigAzureAd(ctx *pulumi.Context,
	name string, args *AuthConfigAzureAdArgs, opts ...pulumi.ResourceOption) (*AuthConfigAzureAd, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApplicationId == nil {
		return nil, errors.New("invalid value for required argument 'ApplicationId'")
	}
	if args.ApplicationSecret == nil {
		return nil, errors.New("invalid value for required argument 'ApplicationSecret'")
	}
	if args.AuthEndpoint == nil {
		return nil, errors.New("invalid value for required argument 'AuthEndpoint'")
	}
	if args.GraphEndpoint == nil {
		return nil, errors.New("invalid value for required argument 'GraphEndpoint'")
	}
	if args.RancherUrl == nil {
		return nil, errors.New("invalid value for required argument 'RancherUrl'")
	}
	if args.TenantId == nil {
		return nil, errors.New("invalid value for required argument 'TenantId'")
	}
	if args.TokenEndpoint == nil {
		return nil, errors.New("invalid value for required argument 'TokenEndpoint'")
	}
	if args.ApplicationId != nil {
		args.ApplicationId = pulumi.ToSecret(args.ApplicationId).(pulumi.StringInput)
	}
	if args.ApplicationSecret != nil {
		args.ApplicationSecret = pulumi.ToSecret(args.ApplicationSecret).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"applicationId",
		"applicationSecret",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AuthConfigAzureAd
	err := ctx.RegisterResource("rancher2:index/authConfigAzureAd:AuthConfigAzureAd", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthConfigAzureAd gets an existing AuthConfigAzureAd resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthConfigAzureAd(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthConfigAzureAdState, opts ...pulumi.ResourceOption) (*AuthConfigAzureAd, error) {
	var resource AuthConfigAzureAd
	err := ctx.ReadResource("rancher2:index/authConfigAzureAd:AuthConfigAzureAd", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthConfigAzureAd resources.
type authConfigAzureAdState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// AzureAD auth application ID (string)
	ApplicationId *string `pulumi:"applicationId"`
	// AzureAD auth application secret (string)
	ApplicationSecret *string `pulumi:"applicationSecret"`
	// AzureAD auth endpoint (string)
	AuthEndpoint *string `pulumi:"authEndpoint"`
	// Enable auth config provider. Default `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
	Endpoint *string `pulumi:"endpoint"`
	// AzureAD graph endpoint (string)
	GraphEndpoint *string `pulumi:"graphEndpoint"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name *string `pulumi:"name"`
	// Rancher URL (string). "<rancher_url>/verify-auth-azure"
	RancherUrl *string `pulumi:"rancherUrl"`
	// AzureAD tenant ID (string)
	TenantId *string `pulumi:"tenantId"`
	// AzureAD token endpoint (string)
	TokenEndpoint *string `pulumi:"tokenEndpoint"`
	// (Computed) The type of the resource (string)
	Type *string `pulumi:"type"`
}

type AuthConfigAzureAdState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// AzureAD auth application ID (string)
	ApplicationId pulumi.StringPtrInput
	// AzureAD auth application secret (string)
	ApplicationSecret pulumi.StringPtrInput
	// AzureAD auth endpoint (string)
	AuthEndpoint pulumi.StringPtrInput
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrInput
	// AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
	Endpoint pulumi.StringPtrInput
	// AzureAD graph endpoint (string)
	GraphEndpoint pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// (Computed) The name of the resource (string)
	Name pulumi.StringPtrInput
	// Rancher URL (string). "<rancher_url>/verify-auth-azure"
	RancherUrl pulumi.StringPtrInput
	// AzureAD tenant ID (string)
	TenantId pulumi.StringPtrInput
	// AzureAD token endpoint (string)
	TokenEndpoint pulumi.StringPtrInput
	// (Computed) The type of the resource (string)
	Type pulumi.StringPtrInput
}

func (AuthConfigAzureAdState) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigAzureAdState)(nil)).Elem()
}

type authConfigAzureAdArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// AzureAD auth application ID (string)
	ApplicationId string `pulumi:"applicationId"`
	// AzureAD auth application secret (string)
	ApplicationSecret string `pulumi:"applicationSecret"`
	// AzureAD auth endpoint (string)
	AuthEndpoint string `pulumi:"authEndpoint"`
	// Enable auth config provider. Default `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
	Endpoint *string `pulumi:"endpoint"`
	// AzureAD graph endpoint (string)
	GraphEndpoint string `pulumi:"graphEndpoint"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Rancher URL (string). "<rancher_url>/verify-auth-azure"
	RancherUrl string `pulumi:"rancherUrl"`
	// AzureAD tenant ID (string)
	TenantId string `pulumi:"tenantId"`
	// AzureAD token endpoint (string)
	TokenEndpoint string `pulumi:"tokenEndpoint"`
}

// The set of arguments for constructing a AuthConfigAzureAd resource.
type AuthConfigAzureAdArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// AzureAD auth application ID (string)
	ApplicationId pulumi.StringInput
	// AzureAD auth application secret (string)
	ApplicationSecret pulumi.StringInput
	// AzureAD auth endpoint (string)
	AuthEndpoint pulumi.StringInput
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrInput
	// AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
	Endpoint pulumi.StringPtrInput
	// AzureAD graph endpoint (string)
	GraphEndpoint pulumi.StringInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// Rancher URL (string). "<rancher_url>/verify-auth-azure"
	RancherUrl pulumi.StringInput
	// AzureAD tenant ID (string)
	TenantId pulumi.StringInput
	// AzureAD token endpoint (string)
	TokenEndpoint pulumi.StringInput
}

func (AuthConfigAzureAdArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigAzureAdArgs)(nil)).Elem()
}

type AuthConfigAzureAdInput interface {
	pulumi.Input

	ToAuthConfigAzureAdOutput() AuthConfigAzureAdOutput
	ToAuthConfigAzureAdOutputWithContext(ctx context.Context) AuthConfigAzureAdOutput
}

func (*AuthConfigAzureAd) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthConfigAzureAd)(nil)).Elem()
}

func (i *AuthConfigAzureAd) ToAuthConfigAzureAdOutput() AuthConfigAzureAdOutput {
	return i.ToAuthConfigAzureAdOutputWithContext(context.Background())
}

func (i *AuthConfigAzureAd) ToAuthConfigAzureAdOutputWithContext(ctx context.Context) AuthConfigAzureAdOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigAzureAdOutput)
}

// AuthConfigAzureAdArrayInput is an input type that accepts AuthConfigAzureAdArray and AuthConfigAzureAdArrayOutput values.
// You can construct a concrete instance of `AuthConfigAzureAdArrayInput` via:
//
//	AuthConfigAzureAdArray{ AuthConfigAzureAdArgs{...} }
type AuthConfigAzureAdArrayInput interface {
	pulumi.Input

	ToAuthConfigAzureAdArrayOutput() AuthConfigAzureAdArrayOutput
	ToAuthConfigAzureAdArrayOutputWithContext(context.Context) AuthConfigAzureAdArrayOutput
}

type AuthConfigAzureAdArray []AuthConfigAzureAdInput

func (AuthConfigAzureAdArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthConfigAzureAd)(nil)).Elem()
}

func (i AuthConfigAzureAdArray) ToAuthConfigAzureAdArrayOutput() AuthConfigAzureAdArrayOutput {
	return i.ToAuthConfigAzureAdArrayOutputWithContext(context.Background())
}

func (i AuthConfigAzureAdArray) ToAuthConfigAzureAdArrayOutputWithContext(ctx context.Context) AuthConfigAzureAdArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigAzureAdArrayOutput)
}

// AuthConfigAzureAdMapInput is an input type that accepts AuthConfigAzureAdMap and AuthConfigAzureAdMapOutput values.
// You can construct a concrete instance of `AuthConfigAzureAdMapInput` via:
//
//	AuthConfigAzureAdMap{ "key": AuthConfigAzureAdArgs{...} }
type AuthConfigAzureAdMapInput interface {
	pulumi.Input

	ToAuthConfigAzureAdMapOutput() AuthConfigAzureAdMapOutput
	ToAuthConfigAzureAdMapOutputWithContext(context.Context) AuthConfigAzureAdMapOutput
}

type AuthConfigAzureAdMap map[string]AuthConfigAzureAdInput

func (AuthConfigAzureAdMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthConfigAzureAd)(nil)).Elem()
}

func (i AuthConfigAzureAdMap) ToAuthConfigAzureAdMapOutput() AuthConfigAzureAdMapOutput {
	return i.ToAuthConfigAzureAdMapOutputWithContext(context.Background())
}

func (i AuthConfigAzureAdMap) ToAuthConfigAzureAdMapOutputWithContext(ctx context.Context) AuthConfigAzureAdMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigAzureAdMapOutput)
}

type AuthConfigAzureAdOutput struct{ *pulumi.OutputState }

func (AuthConfigAzureAdOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthConfigAzureAd)(nil)).Elem()
}

func (o AuthConfigAzureAdOutput) ToAuthConfigAzureAdOutput() AuthConfigAzureAdOutput {
	return o
}

func (o AuthConfigAzureAdOutput) ToAuthConfigAzureAdOutputWithContext(ctx context.Context) AuthConfigAzureAdOutput {
	return o
}

// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
func (o AuthConfigAzureAdOutput) AccessMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfigAzureAd) pulumi.StringPtrOutput { return v.AccessMode }).(pulumi.StringPtrOutput)
}

// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
func (o AuthConfigAzureAdOutput) AllowedPrincipalIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AuthConfigAzureAd) pulumi.StringArrayOutput { return v.AllowedPrincipalIds }).(pulumi.StringArrayOutput)
}

// Annotations of the resource (map)
func (o AuthConfigAzureAdOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *AuthConfigAzureAd) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// AzureAD auth application ID (string)
func (o AuthConfigAzureAdOutput) ApplicationId() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigAzureAd) pulumi.StringOutput { return v.ApplicationId }).(pulumi.StringOutput)
}

// AzureAD auth application secret (string)
func (o AuthConfigAzureAdOutput) ApplicationSecret() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigAzureAd) pulumi.StringOutput { return v.ApplicationSecret }).(pulumi.StringOutput)
}

// AzureAD auth endpoint (string)
func (o AuthConfigAzureAdOutput) AuthEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigAzureAd) pulumi.StringOutput { return v.AuthEndpoint }).(pulumi.StringOutput)
}

// Enable auth config provider. Default `true` (bool)
func (o AuthConfigAzureAdOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AuthConfigAzureAd) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
func (o AuthConfigAzureAdOutput) Endpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfigAzureAd) pulumi.StringPtrOutput { return v.Endpoint }).(pulumi.StringPtrOutput)
}

// AzureAD graph endpoint (string)
func (o AuthConfigAzureAdOutput) GraphEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigAzureAd) pulumi.StringOutput { return v.GraphEndpoint }).(pulumi.StringOutput)
}

// Labels of the resource (map)
func (o AuthConfigAzureAdOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *AuthConfigAzureAd) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// (Computed) The name of the resource (string)
func (o AuthConfigAzureAdOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigAzureAd) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Rancher URL (string). "<rancher_url>/verify-auth-azure"
func (o AuthConfigAzureAdOutput) RancherUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigAzureAd) pulumi.StringOutput { return v.RancherUrl }).(pulumi.StringOutput)
}

// AzureAD tenant ID (string)
func (o AuthConfigAzureAdOutput) TenantId() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigAzureAd) pulumi.StringOutput { return v.TenantId }).(pulumi.StringOutput)
}

// AzureAD token endpoint (string)
func (o AuthConfigAzureAdOutput) TokenEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigAzureAd) pulumi.StringOutput { return v.TokenEndpoint }).(pulumi.StringOutput)
}

// (Computed) The type of the resource (string)
func (o AuthConfigAzureAdOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigAzureAd) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type AuthConfigAzureAdArrayOutput struct{ *pulumi.OutputState }

func (AuthConfigAzureAdArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthConfigAzureAd)(nil)).Elem()
}

func (o AuthConfigAzureAdArrayOutput) ToAuthConfigAzureAdArrayOutput() AuthConfigAzureAdArrayOutput {
	return o
}

func (o AuthConfigAzureAdArrayOutput) ToAuthConfigAzureAdArrayOutputWithContext(ctx context.Context) AuthConfigAzureAdArrayOutput {
	return o
}

func (o AuthConfigAzureAdArrayOutput) Index(i pulumi.IntInput) AuthConfigAzureAdOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuthConfigAzureAd {
		return vs[0].([]*AuthConfigAzureAd)[vs[1].(int)]
	}).(AuthConfigAzureAdOutput)
}

type AuthConfigAzureAdMapOutput struct{ *pulumi.OutputState }

func (AuthConfigAzureAdMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthConfigAzureAd)(nil)).Elem()
}

func (o AuthConfigAzureAdMapOutput) ToAuthConfigAzureAdMapOutput() AuthConfigAzureAdMapOutput {
	return o
}

func (o AuthConfigAzureAdMapOutput) ToAuthConfigAzureAdMapOutputWithContext(ctx context.Context) AuthConfigAzureAdMapOutput {
	return o
}

func (o AuthConfigAzureAdMapOutput) MapIndex(k pulumi.StringInput) AuthConfigAzureAdOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuthConfigAzureAd {
		return vs[0].(map[string]*AuthConfigAzureAd)[vs[1].(string)]
	}).(AuthConfigAzureAdOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigAzureAdInput)(nil)).Elem(), &AuthConfigAzureAd{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigAzureAdArrayInput)(nil)).Elem(), AuthConfigAzureAdArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigAzureAdMapInput)(nil)).Elem(), AuthConfigAzureAdMap{})
	pulumi.RegisterOutputType(AuthConfigAzureAdOutput{})
	pulumi.RegisterOutputType(AuthConfigAzureAdArrayOutput{})
	pulumi.RegisterOutputType(AuthConfigAzureAdMapOutput{})
}
