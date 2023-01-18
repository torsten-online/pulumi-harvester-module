// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Auth Config Github resource. This can be used to configure and enable Auth Config Github for Rancher v2 RKE clusters and retrieve their information.
//
// In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v3/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rancher2.NewAuthConfigGithub(ctx, "github", &rancher2.AuthConfigGithubArgs{
//				ClientId:     pulumi.String("<GITHUB_CLIENT_ID>"),
//				ClientSecret: pulumi.String("<GITHUB_CLIENT_SECRET>"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type AuthConfigGithub struct {
	pulumi.CustomResourceState

	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrOutput `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `github_user://<USER_ID>`  `github_team://<GROUP_ID>` `github_org://<ORG_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayOutput `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// Github auth Client ID (string)
	ClientId pulumi.StringOutput `pulumi:"clientId"`
	// Github auth Client secret (string)
	ClientSecret pulumi.StringOutput `pulumi:"clientSecret"`
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Github hostname to connect. Default `github.com` (string)
	Hostname pulumi.StringPtrOutput `pulumi:"hostname"`
	// Labels of the resource (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Enable TLS connection. Default `true` (bool)
	Tls pulumi.BoolPtrOutput `pulumi:"tls"`
	// (Computed) The type of the resource (string)
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewAuthConfigGithub registers a new resource with the given unique name, arguments, and options.
func NewAuthConfigGithub(ctx *pulumi.Context,
	name string, args *AuthConfigGithubArgs, opts ...pulumi.ResourceOption) (*AuthConfigGithub, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClientId == nil {
		return nil, errors.New("invalid value for required argument 'ClientId'")
	}
	if args.ClientSecret == nil {
		return nil, errors.New("invalid value for required argument 'ClientSecret'")
	}
	if args.ClientId != nil {
		args.ClientId = pulumi.ToSecret(args.ClientId).(pulumi.StringInput)
	}
	if args.ClientSecret != nil {
		args.ClientSecret = pulumi.ToSecret(args.ClientSecret).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"clientId",
		"clientSecret",
	})
	opts = append(opts, secrets)
	var resource AuthConfigGithub
	err := ctx.RegisterResource("rancher2:index/authConfigGithub:AuthConfigGithub", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthConfigGithub gets an existing AuthConfigGithub resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthConfigGithub(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthConfigGithubState, opts ...pulumi.ResourceOption) (*AuthConfigGithub, error) {
	var resource AuthConfigGithub
	err := ctx.ReadResource("rancher2:index/authConfigGithub:AuthConfigGithub", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthConfigGithub resources.
type authConfigGithubState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `github_user://<USER_ID>`  `github_team://<GROUP_ID>` `github_org://<ORG_ID>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Github auth Client ID (string)
	ClientId *string `pulumi:"clientId"`
	// Github auth Client secret (string)
	ClientSecret *string `pulumi:"clientSecret"`
	// Enable auth config provider. Default `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// Github hostname to connect. Default `github.com` (string)
	Hostname *string `pulumi:"hostname"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name *string `pulumi:"name"`
	// Enable TLS connection. Default `true` (bool)
	Tls *bool `pulumi:"tls"`
	// (Computed) The type of the resource (string)
	Type *string `pulumi:"type"`
}

type AuthConfigGithubState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `github_user://<USER_ID>`  `github_team://<GROUP_ID>` `github_org://<ORG_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// Github auth Client ID (string)
	ClientId pulumi.StringPtrInput
	// Github auth Client secret (string)
	ClientSecret pulumi.StringPtrInput
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrInput
	// Github hostname to connect. Default `github.com` (string)
	Hostname pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// (Computed) The name of the resource (string)
	Name pulumi.StringPtrInput
	// Enable TLS connection. Default `true` (bool)
	Tls pulumi.BoolPtrInput
	// (Computed) The type of the resource (string)
	Type pulumi.StringPtrInput
}

func (AuthConfigGithubState) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigGithubState)(nil)).Elem()
}

type authConfigGithubArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `github_user://<USER_ID>`  `github_team://<GROUP_ID>` `github_org://<ORG_ID>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Github auth Client ID (string)
	ClientId string `pulumi:"clientId"`
	// Github auth Client secret (string)
	ClientSecret string `pulumi:"clientSecret"`
	// Enable auth config provider. Default `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// Github hostname to connect. Default `github.com` (string)
	Hostname *string `pulumi:"hostname"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Enable TLS connection. Default `true` (bool)
	Tls *bool `pulumi:"tls"`
}

// The set of arguments for constructing a AuthConfigGithub resource.
type AuthConfigGithubArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `github_user://<USER_ID>`  `github_team://<GROUP_ID>` `github_org://<ORG_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// Github auth Client ID (string)
	ClientId pulumi.StringInput
	// Github auth Client secret (string)
	ClientSecret pulumi.StringInput
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrInput
	// Github hostname to connect. Default `github.com` (string)
	Hostname pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// Enable TLS connection. Default `true` (bool)
	Tls pulumi.BoolPtrInput
}

func (AuthConfigGithubArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigGithubArgs)(nil)).Elem()
}

type AuthConfigGithubInput interface {
	pulumi.Input

	ToAuthConfigGithubOutput() AuthConfigGithubOutput
	ToAuthConfigGithubOutputWithContext(ctx context.Context) AuthConfigGithubOutput
}

func (*AuthConfigGithub) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthConfigGithub)(nil)).Elem()
}

func (i *AuthConfigGithub) ToAuthConfigGithubOutput() AuthConfigGithubOutput {
	return i.ToAuthConfigGithubOutputWithContext(context.Background())
}

func (i *AuthConfigGithub) ToAuthConfigGithubOutputWithContext(ctx context.Context) AuthConfigGithubOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigGithubOutput)
}

// AuthConfigGithubArrayInput is an input type that accepts AuthConfigGithubArray and AuthConfigGithubArrayOutput values.
// You can construct a concrete instance of `AuthConfigGithubArrayInput` via:
//
//	AuthConfigGithubArray{ AuthConfigGithubArgs{...} }
type AuthConfigGithubArrayInput interface {
	pulumi.Input

	ToAuthConfigGithubArrayOutput() AuthConfigGithubArrayOutput
	ToAuthConfigGithubArrayOutputWithContext(context.Context) AuthConfigGithubArrayOutput
}

type AuthConfigGithubArray []AuthConfigGithubInput

func (AuthConfigGithubArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthConfigGithub)(nil)).Elem()
}

func (i AuthConfigGithubArray) ToAuthConfigGithubArrayOutput() AuthConfigGithubArrayOutput {
	return i.ToAuthConfigGithubArrayOutputWithContext(context.Background())
}

func (i AuthConfigGithubArray) ToAuthConfigGithubArrayOutputWithContext(ctx context.Context) AuthConfigGithubArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigGithubArrayOutput)
}

// AuthConfigGithubMapInput is an input type that accepts AuthConfigGithubMap and AuthConfigGithubMapOutput values.
// You can construct a concrete instance of `AuthConfigGithubMapInput` via:
//
//	AuthConfigGithubMap{ "key": AuthConfigGithubArgs{...} }
type AuthConfigGithubMapInput interface {
	pulumi.Input

	ToAuthConfigGithubMapOutput() AuthConfigGithubMapOutput
	ToAuthConfigGithubMapOutputWithContext(context.Context) AuthConfigGithubMapOutput
}

type AuthConfigGithubMap map[string]AuthConfigGithubInput

func (AuthConfigGithubMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthConfigGithub)(nil)).Elem()
}

func (i AuthConfigGithubMap) ToAuthConfigGithubMapOutput() AuthConfigGithubMapOutput {
	return i.ToAuthConfigGithubMapOutputWithContext(context.Background())
}

func (i AuthConfigGithubMap) ToAuthConfigGithubMapOutputWithContext(ctx context.Context) AuthConfigGithubMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigGithubMapOutput)
}

type AuthConfigGithubOutput struct{ *pulumi.OutputState }

func (AuthConfigGithubOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthConfigGithub)(nil)).Elem()
}

func (o AuthConfigGithubOutput) ToAuthConfigGithubOutput() AuthConfigGithubOutput {
	return o
}

func (o AuthConfigGithubOutput) ToAuthConfigGithubOutputWithContext(ctx context.Context) AuthConfigGithubOutput {
	return o
}

// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
func (o AuthConfigGithubOutput) AccessMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfigGithub) pulumi.StringPtrOutput { return v.AccessMode }).(pulumi.StringPtrOutput)
}

// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `github_user://<USER_ID>`  `github_team://<GROUP_ID>` `github_org://<ORG_ID>` (list)
func (o AuthConfigGithubOutput) AllowedPrincipalIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AuthConfigGithub) pulumi.StringArrayOutput { return v.AllowedPrincipalIds }).(pulumi.StringArrayOutput)
}

// Annotations of the resource (map)
func (o AuthConfigGithubOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *AuthConfigGithub) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// Github auth Client ID (string)
func (o AuthConfigGithubOutput) ClientId() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigGithub) pulumi.StringOutput { return v.ClientId }).(pulumi.StringOutput)
}

// Github auth Client secret (string)
func (o AuthConfigGithubOutput) ClientSecret() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigGithub) pulumi.StringOutput { return v.ClientSecret }).(pulumi.StringOutput)
}

// Enable auth config provider. Default `true` (bool)
func (o AuthConfigGithubOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AuthConfigGithub) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Github hostname to connect. Default `github.com` (string)
func (o AuthConfigGithubOutput) Hostname() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfigGithub) pulumi.StringPtrOutput { return v.Hostname }).(pulumi.StringPtrOutput)
}

// Labels of the resource (map)
func (o AuthConfigGithubOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *AuthConfigGithub) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// (Computed) The name of the resource (string)
func (o AuthConfigGithubOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigGithub) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Enable TLS connection. Default `true` (bool)
func (o AuthConfigGithubOutput) Tls() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AuthConfigGithub) pulumi.BoolPtrOutput { return v.Tls }).(pulumi.BoolPtrOutput)
}

// (Computed) The type of the resource (string)
func (o AuthConfigGithubOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigGithub) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type AuthConfigGithubArrayOutput struct{ *pulumi.OutputState }

func (AuthConfigGithubArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthConfigGithub)(nil)).Elem()
}

func (o AuthConfigGithubArrayOutput) ToAuthConfigGithubArrayOutput() AuthConfigGithubArrayOutput {
	return o
}

func (o AuthConfigGithubArrayOutput) ToAuthConfigGithubArrayOutputWithContext(ctx context.Context) AuthConfigGithubArrayOutput {
	return o
}

func (o AuthConfigGithubArrayOutput) Index(i pulumi.IntInput) AuthConfigGithubOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuthConfigGithub {
		return vs[0].([]*AuthConfigGithub)[vs[1].(int)]
	}).(AuthConfigGithubOutput)
}

type AuthConfigGithubMapOutput struct{ *pulumi.OutputState }

func (AuthConfigGithubMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthConfigGithub)(nil)).Elem()
}

func (o AuthConfigGithubMapOutput) ToAuthConfigGithubMapOutput() AuthConfigGithubMapOutput {
	return o
}

func (o AuthConfigGithubMapOutput) ToAuthConfigGithubMapOutputWithContext(ctx context.Context) AuthConfigGithubMapOutput {
	return o
}

func (o AuthConfigGithubMapOutput) MapIndex(k pulumi.StringInput) AuthConfigGithubOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuthConfigGithub {
		return vs[0].(map[string]*AuthConfigGithub)[vs[1].(string)]
	}).(AuthConfigGithubOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigGithubInput)(nil)).Elem(), &AuthConfigGithub{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigGithubArrayInput)(nil)).Elem(), AuthConfigGithubArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigGithubMapInput)(nil)).Elem(), AuthConfigGithubMap{})
	pulumi.RegisterOutputType(AuthConfigGithubOutput{})
	pulumi.RegisterOutputType(AuthConfigGithubArrayOutput{})
	pulumi.RegisterOutputType(AuthConfigGithubMapOutput{})
}
