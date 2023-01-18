// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Auth Config OKTA resource. This can be used to configure and enable Auth Config OKTA for Rancher v2 RKE clusters and retrieve their information.
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
//			_, err := rancher2.NewAuthConfigOkta(ctx, "okta", &rancher2.AuthConfigOktaArgs{
//				DisplayNameField:   pulumi.String("<DISPLAY_NAME_FIELD>"),
//				GroupsField:        pulumi.String("<GROUPS_FIELD>"),
//				IdpMetadataContent: pulumi.String("<IDP_METADATA_CONTENT>"),
//				RancherApiHost:     pulumi.String("https://<RANCHER_API_HOST>"),
//				SpCert:             pulumi.String("<SP_CERT>"),
//				SpKey:              pulumi.String("<SP_KEY>"),
//				UidField:           pulumi.String("<UID_FIELD>"),
//				UserNameField:      pulumi.String("<USER_NAME_FIELD>"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type AuthConfigOkta struct {
	pulumi.CustomResourceState

	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrOutput `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `okta_user://<USER_ID>`  `okta_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayOutput `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// OKTA display name field (string)
	DisplayNameField pulumi.StringOutput `pulumi:"displayNameField"`
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// OKTA group field (string)
	GroupsField pulumi.StringOutput `pulumi:"groupsField"`
	// OKTA IDP metadata content (string)
	IdpMetadataContent pulumi.StringOutput `pulumi:"idpMetadataContent"`
	// Labels of the resource (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost pulumi.StringOutput `pulumi:"rancherApiHost"`
	// OKTA SP cert (string)
	SpCert pulumi.StringOutput `pulumi:"spCert"`
	// OKTA SP key (string)
	SpKey pulumi.StringOutput `pulumi:"spKey"`
	// (Computed) The type of the resource (string)
	Type pulumi.StringOutput `pulumi:"type"`
	// OKTA UID field (string)
	UidField pulumi.StringOutput `pulumi:"uidField"`
	// OKTA user name field (string)
	UserNameField pulumi.StringOutput `pulumi:"userNameField"`
}

// NewAuthConfigOkta registers a new resource with the given unique name, arguments, and options.
func NewAuthConfigOkta(ctx *pulumi.Context,
	name string, args *AuthConfigOktaArgs, opts ...pulumi.ResourceOption) (*AuthConfigOkta, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DisplayNameField == nil {
		return nil, errors.New("invalid value for required argument 'DisplayNameField'")
	}
	if args.GroupsField == nil {
		return nil, errors.New("invalid value for required argument 'GroupsField'")
	}
	if args.IdpMetadataContent == nil {
		return nil, errors.New("invalid value for required argument 'IdpMetadataContent'")
	}
	if args.RancherApiHost == nil {
		return nil, errors.New("invalid value for required argument 'RancherApiHost'")
	}
	if args.SpCert == nil {
		return nil, errors.New("invalid value for required argument 'SpCert'")
	}
	if args.SpKey == nil {
		return nil, errors.New("invalid value for required argument 'SpKey'")
	}
	if args.UidField == nil {
		return nil, errors.New("invalid value for required argument 'UidField'")
	}
	if args.UserNameField == nil {
		return nil, errors.New("invalid value for required argument 'UserNameField'")
	}
	if args.IdpMetadataContent != nil {
		args.IdpMetadataContent = pulumi.ToSecret(args.IdpMetadataContent).(pulumi.StringInput)
	}
	if args.SpCert != nil {
		args.SpCert = pulumi.ToSecret(args.SpCert).(pulumi.StringInput)
	}
	if args.SpKey != nil {
		args.SpKey = pulumi.ToSecret(args.SpKey).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"idpMetadataContent",
		"spCert",
		"spKey",
	})
	opts = append(opts, secrets)
	var resource AuthConfigOkta
	err := ctx.RegisterResource("rancher2:index/authConfigOkta:AuthConfigOkta", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthConfigOkta gets an existing AuthConfigOkta resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthConfigOkta(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthConfigOktaState, opts ...pulumi.ResourceOption) (*AuthConfigOkta, error) {
	var resource AuthConfigOkta
	err := ctx.ReadResource("rancher2:index/authConfigOkta:AuthConfigOkta", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthConfigOkta resources.
type authConfigOktaState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `okta_user://<USER_ID>`  `okta_group://<GROUP_ID>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// OKTA display name field (string)
	DisplayNameField *string `pulumi:"displayNameField"`
	// Enable auth config provider. Default `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// OKTA group field (string)
	GroupsField *string `pulumi:"groupsField"`
	// OKTA IDP metadata content (string)
	IdpMetadataContent *string `pulumi:"idpMetadataContent"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name *string `pulumi:"name"`
	// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost *string `pulumi:"rancherApiHost"`
	// OKTA SP cert (string)
	SpCert *string `pulumi:"spCert"`
	// OKTA SP key (string)
	SpKey *string `pulumi:"spKey"`
	// (Computed) The type of the resource (string)
	Type *string `pulumi:"type"`
	// OKTA UID field (string)
	UidField *string `pulumi:"uidField"`
	// OKTA user name field (string)
	UserNameField *string `pulumi:"userNameField"`
}

type AuthConfigOktaState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `okta_user://<USER_ID>`  `okta_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// OKTA display name field (string)
	DisplayNameField pulumi.StringPtrInput
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrInput
	// OKTA group field (string)
	GroupsField pulumi.StringPtrInput
	// OKTA IDP metadata content (string)
	IdpMetadataContent pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// (Computed) The name of the resource (string)
	Name pulumi.StringPtrInput
	// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost pulumi.StringPtrInput
	// OKTA SP cert (string)
	SpCert pulumi.StringPtrInput
	// OKTA SP key (string)
	SpKey pulumi.StringPtrInput
	// (Computed) The type of the resource (string)
	Type pulumi.StringPtrInput
	// OKTA UID field (string)
	UidField pulumi.StringPtrInput
	// OKTA user name field (string)
	UserNameField pulumi.StringPtrInput
}

func (AuthConfigOktaState) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigOktaState)(nil)).Elem()
}

type authConfigOktaArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `okta_user://<USER_ID>`  `okta_group://<GROUP_ID>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// OKTA display name field (string)
	DisplayNameField string `pulumi:"displayNameField"`
	// Enable auth config provider. Default `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// OKTA group field (string)
	GroupsField string `pulumi:"groupsField"`
	// OKTA IDP metadata content (string)
	IdpMetadataContent string `pulumi:"idpMetadataContent"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost string `pulumi:"rancherApiHost"`
	// OKTA SP cert (string)
	SpCert string `pulumi:"spCert"`
	// OKTA SP key (string)
	SpKey string `pulumi:"spKey"`
	// OKTA UID field (string)
	UidField string `pulumi:"uidField"`
	// OKTA user name field (string)
	UserNameField string `pulumi:"userNameField"`
}

// The set of arguments for constructing a AuthConfigOkta resource.
type AuthConfigOktaArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `okta_user://<USER_ID>`  `okta_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// OKTA display name field (string)
	DisplayNameField pulumi.StringInput
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrInput
	// OKTA group field (string)
	GroupsField pulumi.StringInput
	// OKTA IDP metadata content (string)
	IdpMetadataContent pulumi.StringInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost pulumi.StringInput
	// OKTA SP cert (string)
	SpCert pulumi.StringInput
	// OKTA SP key (string)
	SpKey pulumi.StringInput
	// OKTA UID field (string)
	UidField pulumi.StringInput
	// OKTA user name field (string)
	UserNameField pulumi.StringInput
}

func (AuthConfigOktaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigOktaArgs)(nil)).Elem()
}

type AuthConfigOktaInput interface {
	pulumi.Input

	ToAuthConfigOktaOutput() AuthConfigOktaOutput
	ToAuthConfigOktaOutputWithContext(ctx context.Context) AuthConfigOktaOutput
}

func (*AuthConfigOkta) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthConfigOkta)(nil)).Elem()
}

func (i *AuthConfigOkta) ToAuthConfigOktaOutput() AuthConfigOktaOutput {
	return i.ToAuthConfigOktaOutputWithContext(context.Background())
}

func (i *AuthConfigOkta) ToAuthConfigOktaOutputWithContext(ctx context.Context) AuthConfigOktaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigOktaOutput)
}

// AuthConfigOktaArrayInput is an input type that accepts AuthConfigOktaArray and AuthConfigOktaArrayOutput values.
// You can construct a concrete instance of `AuthConfigOktaArrayInput` via:
//
//	AuthConfigOktaArray{ AuthConfigOktaArgs{...} }
type AuthConfigOktaArrayInput interface {
	pulumi.Input

	ToAuthConfigOktaArrayOutput() AuthConfigOktaArrayOutput
	ToAuthConfigOktaArrayOutputWithContext(context.Context) AuthConfigOktaArrayOutput
}

type AuthConfigOktaArray []AuthConfigOktaInput

func (AuthConfigOktaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthConfigOkta)(nil)).Elem()
}

func (i AuthConfigOktaArray) ToAuthConfigOktaArrayOutput() AuthConfigOktaArrayOutput {
	return i.ToAuthConfigOktaArrayOutputWithContext(context.Background())
}

func (i AuthConfigOktaArray) ToAuthConfigOktaArrayOutputWithContext(ctx context.Context) AuthConfigOktaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigOktaArrayOutput)
}

// AuthConfigOktaMapInput is an input type that accepts AuthConfigOktaMap and AuthConfigOktaMapOutput values.
// You can construct a concrete instance of `AuthConfigOktaMapInput` via:
//
//	AuthConfigOktaMap{ "key": AuthConfigOktaArgs{...} }
type AuthConfigOktaMapInput interface {
	pulumi.Input

	ToAuthConfigOktaMapOutput() AuthConfigOktaMapOutput
	ToAuthConfigOktaMapOutputWithContext(context.Context) AuthConfigOktaMapOutput
}

type AuthConfigOktaMap map[string]AuthConfigOktaInput

func (AuthConfigOktaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthConfigOkta)(nil)).Elem()
}

func (i AuthConfigOktaMap) ToAuthConfigOktaMapOutput() AuthConfigOktaMapOutput {
	return i.ToAuthConfigOktaMapOutputWithContext(context.Background())
}

func (i AuthConfigOktaMap) ToAuthConfigOktaMapOutputWithContext(ctx context.Context) AuthConfigOktaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigOktaMapOutput)
}

type AuthConfigOktaOutput struct{ *pulumi.OutputState }

func (AuthConfigOktaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthConfigOkta)(nil)).Elem()
}

func (o AuthConfigOktaOutput) ToAuthConfigOktaOutput() AuthConfigOktaOutput {
	return o
}

func (o AuthConfigOktaOutput) ToAuthConfigOktaOutputWithContext(ctx context.Context) AuthConfigOktaOutput {
	return o
}

// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
func (o AuthConfigOktaOutput) AccessMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfigOkta) pulumi.StringPtrOutput { return v.AccessMode }).(pulumi.StringPtrOutput)
}

// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `okta_user://<USER_ID>`  `okta_group://<GROUP_ID>` (list)
func (o AuthConfigOktaOutput) AllowedPrincipalIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AuthConfigOkta) pulumi.StringArrayOutput { return v.AllowedPrincipalIds }).(pulumi.StringArrayOutput)
}

// Annotations of the resource (map)
func (o AuthConfigOktaOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *AuthConfigOkta) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// OKTA display name field (string)
func (o AuthConfigOktaOutput) DisplayNameField() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOkta) pulumi.StringOutput { return v.DisplayNameField }).(pulumi.StringOutput)
}

// Enable auth config provider. Default `true` (bool)
func (o AuthConfigOktaOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AuthConfigOkta) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// OKTA group field (string)
func (o AuthConfigOktaOutput) GroupsField() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOkta) pulumi.StringOutput { return v.GroupsField }).(pulumi.StringOutput)
}

// OKTA IDP metadata content (string)
func (o AuthConfigOktaOutput) IdpMetadataContent() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOkta) pulumi.StringOutput { return v.IdpMetadataContent }).(pulumi.StringOutput)
}

// Labels of the resource (map)
func (o AuthConfigOktaOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *AuthConfigOkta) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// (Computed) The name of the resource (string)
func (o AuthConfigOktaOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOkta) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
func (o AuthConfigOktaOutput) RancherApiHost() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOkta) pulumi.StringOutput { return v.RancherApiHost }).(pulumi.StringOutput)
}

// OKTA SP cert (string)
func (o AuthConfigOktaOutput) SpCert() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOkta) pulumi.StringOutput { return v.SpCert }).(pulumi.StringOutput)
}

// OKTA SP key (string)
func (o AuthConfigOktaOutput) SpKey() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOkta) pulumi.StringOutput { return v.SpKey }).(pulumi.StringOutput)
}

// (Computed) The type of the resource (string)
func (o AuthConfigOktaOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOkta) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// OKTA UID field (string)
func (o AuthConfigOktaOutput) UidField() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOkta) pulumi.StringOutput { return v.UidField }).(pulumi.StringOutput)
}

// OKTA user name field (string)
func (o AuthConfigOktaOutput) UserNameField() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigOkta) pulumi.StringOutput { return v.UserNameField }).(pulumi.StringOutput)
}

type AuthConfigOktaArrayOutput struct{ *pulumi.OutputState }

func (AuthConfigOktaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthConfigOkta)(nil)).Elem()
}

func (o AuthConfigOktaArrayOutput) ToAuthConfigOktaArrayOutput() AuthConfigOktaArrayOutput {
	return o
}

func (o AuthConfigOktaArrayOutput) ToAuthConfigOktaArrayOutputWithContext(ctx context.Context) AuthConfigOktaArrayOutput {
	return o
}

func (o AuthConfigOktaArrayOutput) Index(i pulumi.IntInput) AuthConfigOktaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuthConfigOkta {
		return vs[0].([]*AuthConfigOkta)[vs[1].(int)]
	}).(AuthConfigOktaOutput)
}

type AuthConfigOktaMapOutput struct{ *pulumi.OutputState }

func (AuthConfigOktaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthConfigOkta)(nil)).Elem()
}

func (o AuthConfigOktaMapOutput) ToAuthConfigOktaMapOutput() AuthConfigOktaMapOutput {
	return o
}

func (o AuthConfigOktaMapOutput) ToAuthConfigOktaMapOutputWithContext(ctx context.Context) AuthConfigOktaMapOutput {
	return o
}

func (o AuthConfigOktaMapOutput) MapIndex(k pulumi.StringInput) AuthConfigOktaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuthConfigOkta {
		return vs[0].(map[string]*AuthConfigOkta)[vs[1].(string)]
	}).(AuthConfigOktaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigOktaInput)(nil)).Elem(), &AuthConfigOkta{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigOktaArrayInput)(nil)).Elem(), AuthConfigOktaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigOktaMapInput)(nil)).Elem(), AuthConfigOktaMap{})
	pulumi.RegisterOutputType(AuthConfigOktaOutput{})
	pulumi.RegisterOutputType(AuthConfigOktaArrayOutput{})
	pulumi.RegisterOutputType(AuthConfigOktaMapOutput{})
}
