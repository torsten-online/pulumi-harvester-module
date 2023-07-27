// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Auth Config Ping resource. This can be used to configure and enable Auth Config Ping for Rancher v2 RKE clusters and retrieve their information.
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
//	"github.com/pulumi/pulumi-rancher2/sdk/v5/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rancher2.NewAuthConfigPing(ctx, "ping", &rancher2.AuthConfigPingArgs{
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
type AuthConfigPing struct {
	pulumi.CustomResourceState

	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrOutput `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `ping_user://<USER_ID>`  `ping_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayOutput `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// Ping display name field (string)
	DisplayNameField pulumi.StringOutput `pulumi:"displayNameField"`
	// Enable auth config provider. Default `true` (bool)
	Enabled       pulumi.BoolPtrOutput   `pulumi:"enabled"`
	EntityIdField pulumi.StringPtrOutput `pulumi:"entityIdField"`
	// Ping group field (string)
	GroupsField pulumi.StringOutput `pulumi:"groupsField"`
	// Ping IDP metadata content (string)
	IdpMetadataContent pulumi.StringOutput `pulumi:"idpMetadataContent"`
	// Labels of the resource (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost pulumi.StringOutput `pulumi:"rancherApiHost"`
	// Ping SP cert (string)
	SpCert pulumi.StringOutput `pulumi:"spCert"`
	// Ping SP key (string)
	SpKey pulumi.StringOutput `pulumi:"spKey"`
	// (Computed) The type of the resource (string)
	Type pulumi.StringOutput `pulumi:"type"`
	// Ping UID field (string)
	UidField pulumi.StringOutput `pulumi:"uidField"`
	// Ping user name field (string)
	UserNameField pulumi.StringOutput `pulumi:"userNameField"`
}

// NewAuthConfigPing registers a new resource with the given unique name, arguments, and options.
func NewAuthConfigPing(ctx *pulumi.Context,
	name string, args *AuthConfigPingArgs, opts ...pulumi.ResourceOption) (*AuthConfigPing, error) {
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
	var resource AuthConfigPing
	err := ctx.RegisterResource("rancher2:index/authConfigPing:AuthConfigPing", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthConfigPing gets an existing AuthConfigPing resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthConfigPing(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthConfigPingState, opts ...pulumi.ResourceOption) (*AuthConfigPing, error) {
	var resource AuthConfigPing
	err := ctx.ReadResource("rancher2:index/authConfigPing:AuthConfigPing", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthConfigPing resources.
type authConfigPingState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `ping_user://<USER_ID>`  `ping_group://<GROUP_ID>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Ping display name field (string)
	DisplayNameField *string `pulumi:"displayNameField"`
	// Enable auth config provider. Default `true` (bool)
	Enabled       *bool   `pulumi:"enabled"`
	EntityIdField *string `pulumi:"entityIdField"`
	// Ping group field (string)
	GroupsField *string `pulumi:"groupsField"`
	// Ping IDP metadata content (string)
	IdpMetadataContent *string `pulumi:"idpMetadataContent"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name *string `pulumi:"name"`
	// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost *string `pulumi:"rancherApiHost"`
	// Ping SP cert (string)
	SpCert *string `pulumi:"spCert"`
	// Ping SP key (string)
	SpKey *string `pulumi:"spKey"`
	// (Computed) The type of the resource (string)
	Type *string `pulumi:"type"`
	// Ping UID field (string)
	UidField *string `pulumi:"uidField"`
	// Ping user name field (string)
	UserNameField *string `pulumi:"userNameField"`
}

type AuthConfigPingState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `ping_user://<USER_ID>`  `ping_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// Ping display name field (string)
	DisplayNameField pulumi.StringPtrInput
	// Enable auth config provider. Default `true` (bool)
	Enabled       pulumi.BoolPtrInput
	EntityIdField pulumi.StringPtrInput
	// Ping group field (string)
	GroupsField pulumi.StringPtrInput
	// Ping IDP metadata content (string)
	IdpMetadataContent pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// (Computed) The name of the resource (string)
	Name pulumi.StringPtrInput
	// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost pulumi.StringPtrInput
	// Ping SP cert (string)
	SpCert pulumi.StringPtrInput
	// Ping SP key (string)
	SpKey pulumi.StringPtrInput
	// (Computed) The type of the resource (string)
	Type pulumi.StringPtrInput
	// Ping UID field (string)
	UidField pulumi.StringPtrInput
	// Ping user name field (string)
	UserNameField pulumi.StringPtrInput
}

func (AuthConfigPingState) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigPingState)(nil)).Elem()
}

type authConfigPingArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `ping_user://<USER_ID>`  `ping_group://<GROUP_ID>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Ping display name field (string)
	DisplayNameField string `pulumi:"displayNameField"`
	// Enable auth config provider. Default `true` (bool)
	Enabled       *bool   `pulumi:"enabled"`
	EntityIdField *string `pulumi:"entityIdField"`
	// Ping group field (string)
	GroupsField string `pulumi:"groupsField"`
	// Ping IDP metadata content (string)
	IdpMetadataContent string `pulumi:"idpMetadataContent"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost string `pulumi:"rancherApiHost"`
	// Ping SP cert (string)
	SpCert string `pulumi:"spCert"`
	// Ping SP key (string)
	SpKey string `pulumi:"spKey"`
	// Ping UID field (string)
	UidField string `pulumi:"uidField"`
	// Ping user name field (string)
	UserNameField string `pulumi:"userNameField"`
}

// The set of arguments for constructing a AuthConfigPing resource.
type AuthConfigPingArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `ping_user://<USER_ID>`  `ping_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// Ping display name field (string)
	DisplayNameField pulumi.StringInput
	// Enable auth config provider. Default `true` (bool)
	Enabled       pulumi.BoolPtrInput
	EntityIdField pulumi.StringPtrInput
	// Ping group field (string)
	GroupsField pulumi.StringInput
	// Ping IDP metadata content (string)
	IdpMetadataContent pulumi.StringInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost pulumi.StringInput
	// Ping SP cert (string)
	SpCert pulumi.StringInput
	// Ping SP key (string)
	SpKey pulumi.StringInput
	// Ping UID field (string)
	UidField pulumi.StringInput
	// Ping user name field (string)
	UserNameField pulumi.StringInput
}

func (AuthConfigPingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigPingArgs)(nil)).Elem()
}

type AuthConfigPingInput interface {
	pulumi.Input

	ToAuthConfigPingOutput() AuthConfigPingOutput
	ToAuthConfigPingOutputWithContext(ctx context.Context) AuthConfigPingOutput
}

func (*AuthConfigPing) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthConfigPing)(nil)).Elem()
}

func (i *AuthConfigPing) ToAuthConfigPingOutput() AuthConfigPingOutput {
	return i.ToAuthConfigPingOutputWithContext(context.Background())
}

func (i *AuthConfigPing) ToAuthConfigPingOutputWithContext(ctx context.Context) AuthConfigPingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigPingOutput)
}

// AuthConfigPingArrayInput is an input type that accepts AuthConfigPingArray and AuthConfigPingArrayOutput values.
// You can construct a concrete instance of `AuthConfigPingArrayInput` via:
//
//	AuthConfigPingArray{ AuthConfigPingArgs{...} }
type AuthConfigPingArrayInput interface {
	pulumi.Input

	ToAuthConfigPingArrayOutput() AuthConfigPingArrayOutput
	ToAuthConfigPingArrayOutputWithContext(context.Context) AuthConfigPingArrayOutput
}

type AuthConfigPingArray []AuthConfigPingInput

func (AuthConfigPingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthConfigPing)(nil)).Elem()
}

func (i AuthConfigPingArray) ToAuthConfigPingArrayOutput() AuthConfigPingArrayOutput {
	return i.ToAuthConfigPingArrayOutputWithContext(context.Background())
}

func (i AuthConfigPingArray) ToAuthConfigPingArrayOutputWithContext(ctx context.Context) AuthConfigPingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigPingArrayOutput)
}

// AuthConfigPingMapInput is an input type that accepts AuthConfigPingMap and AuthConfigPingMapOutput values.
// You can construct a concrete instance of `AuthConfigPingMapInput` via:
//
//	AuthConfigPingMap{ "key": AuthConfigPingArgs{...} }
type AuthConfigPingMapInput interface {
	pulumi.Input

	ToAuthConfigPingMapOutput() AuthConfigPingMapOutput
	ToAuthConfigPingMapOutputWithContext(context.Context) AuthConfigPingMapOutput
}

type AuthConfigPingMap map[string]AuthConfigPingInput

func (AuthConfigPingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthConfigPing)(nil)).Elem()
}

func (i AuthConfigPingMap) ToAuthConfigPingMapOutput() AuthConfigPingMapOutput {
	return i.ToAuthConfigPingMapOutputWithContext(context.Background())
}

func (i AuthConfigPingMap) ToAuthConfigPingMapOutputWithContext(ctx context.Context) AuthConfigPingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigPingMapOutput)
}

type AuthConfigPingOutput struct{ *pulumi.OutputState }

func (AuthConfigPingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthConfigPing)(nil)).Elem()
}

func (o AuthConfigPingOutput) ToAuthConfigPingOutput() AuthConfigPingOutput {
	return o
}

func (o AuthConfigPingOutput) ToAuthConfigPingOutputWithContext(ctx context.Context) AuthConfigPingOutput {
	return o
}

// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
func (o AuthConfigPingOutput) AccessMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfigPing) pulumi.StringPtrOutput { return v.AccessMode }).(pulumi.StringPtrOutput)
}

// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `ping_user://<USER_ID>`  `ping_group://<GROUP_ID>` (list)
func (o AuthConfigPingOutput) AllowedPrincipalIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AuthConfigPing) pulumi.StringArrayOutput { return v.AllowedPrincipalIds }).(pulumi.StringArrayOutput)
}

// Annotations of the resource (map)
func (o AuthConfigPingOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *AuthConfigPing) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// Ping display name field (string)
func (o AuthConfigPingOutput) DisplayNameField() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigPing) pulumi.StringOutput { return v.DisplayNameField }).(pulumi.StringOutput)
}

// Enable auth config provider. Default `true` (bool)
func (o AuthConfigPingOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AuthConfigPing) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

func (o AuthConfigPingOutput) EntityIdField() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfigPing) pulumi.StringPtrOutput { return v.EntityIdField }).(pulumi.StringPtrOutput)
}

// Ping group field (string)
func (o AuthConfigPingOutput) GroupsField() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigPing) pulumi.StringOutput { return v.GroupsField }).(pulumi.StringOutput)
}

// Ping IDP metadata content (string)
func (o AuthConfigPingOutput) IdpMetadataContent() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigPing) pulumi.StringOutput { return v.IdpMetadataContent }).(pulumi.StringOutput)
}

// Labels of the resource (map)
func (o AuthConfigPingOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *AuthConfigPing) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// (Computed) The name of the resource (string)
func (o AuthConfigPingOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigPing) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
func (o AuthConfigPingOutput) RancherApiHost() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigPing) pulumi.StringOutput { return v.RancherApiHost }).(pulumi.StringOutput)
}

// Ping SP cert (string)
func (o AuthConfigPingOutput) SpCert() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigPing) pulumi.StringOutput { return v.SpCert }).(pulumi.StringOutput)
}

// Ping SP key (string)
func (o AuthConfigPingOutput) SpKey() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigPing) pulumi.StringOutput { return v.SpKey }).(pulumi.StringOutput)
}

// (Computed) The type of the resource (string)
func (o AuthConfigPingOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigPing) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// Ping UID field (string)
func (o AuthConfigPingOutput) UidField() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigPing) pulumi.StringOutput { return v.UidField }).(pulumi.StringOutput)
}

// Ping user name field (string)
func (o AuthConfigPingOutput) UserNameField() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigPing) pulumi.StringOutput { return v.UserNameField }).(pulumi.StringOutput)
}

type AuthConfigPingArrayOutput struct{ *pulumi.OutputState }

func (AuthConfigPingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthConfigPing)(nil)).Elem()
}

func (o AuthConfigPingArrayOutput) ToAuthConfigPingArrayOutput() AuthConfigPingArrayOutput {
	return o
}

func (o AuthConfigPingArrayOutput) ToAuthConfigPingArrayOutputWithContext(ctx context.Context) AuthConfigPingArrayOutput {
	return o
}

func (o AuthConfigPingArrayOutput) Index(i pulumi.IntInput) AuthConfigPingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuthConfigPing {
		return vs[0].([]*AuthConfigPing)[vs[1].(int)]
	}).(AuthConfigPingOutput)
}

type AuthConfigPingMapOutput struct{ *pulumi.OutputState }

func (AuthConfigPingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthConfigPing)(nil)).Elem()
}

func (o AuthConfigPingMapOutput) ToAuthConfigPingMapOutput() AuthConfigPingMapOutput {
	return o
}

func (o AuthConfigPingMapOutput) ToAuthConfigPingMapOutputWithContext(ctx context.Context) AuthConfigPingMapOutput {
	return o
}

func (o AuthConfigPingMapOutput) MapIndex(k pulumi.StringInput) AuthConfigPingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuthConfigPing {
		return vs[0].(map[string]*AuthConfigPing)[vs[1].(string)]
	}).(AuthConfigPingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigPingInput)(nil)).Elem(), &AuthConfigPing{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigPingArrayInput)(nil)).Elem(), AuthConfigPingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigPingMapInput)(nil)).Elem(), AuthConfigPingMap{})
	pulumi.RegisterOutputType(AuthConfigPingOutput{})
	pulumi.RegisterOutputType(AuthConfigPingArrayOutput{})
	pulumi.RegisterOutputType(AuthConfigPingMapOutput{})
}
