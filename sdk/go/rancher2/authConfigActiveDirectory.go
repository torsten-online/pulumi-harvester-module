// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-rancher2/sdk/v5/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Auth Config ActiveDirectory resource. This can be used to configure and enable Auth Config ActiveDirectory for Rancher v2 RKE clusters and retrieve their information.
//
// In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
type AuthConfigActiveDirectory struct {
	pulumi.CustomResourceState

	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrOutput `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `activedirectory_user://<DN>`  `activedirectory_group://<DN>`. The local admin (`local://<admin id>`) and the `testUsername` must be added too. (list)
	AllowedPrincipalIds pulumi.StringArrayOutput `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// CA certificate for TLS if selfsigned (string)
	Certificate pulumi.StringPtrOutput `pulumi:"certificate"`
	// ActiveDirectory connection timeout. Default `5000` (int)
	ConnectionTimeout pulumi.IntPtrOutput `pulumi:"connectionTimeout"`
	// ActiveDirectory defult login domain (string)
	DefaultLoginDomain pulumi.StringPtrOutput `pulumi:"defaultLoginDomain"`
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Group DN attribute. Default `distinguishedName` (string)
	GroupDnAttribute pulumi.StringOutput `pulumi:"groupDnAttribute"`
	// Group member mapping attribute. Default `member` (string)
	GroupMemberMappingAttribute pulumi.StringOutput `pulumi:"groupMemberMappingAttribute"`
	// Group member user attribute. Default `distinguishedName` (string)
	GroupMemberUserAttribute pulumi.StringOutput `pulumi:"groupMemberUserAttribute"`
	// Group name attribute. Default `name` (string)
	GroupNameAttribute pulumi.StringOutput `pulumi:"groupNameAttribute"`
	// Group object class. Default `group` (string)
	GroupObjectClass pulumi.StringOutput `pulumi:"groupObjectClass"`
	// Group search attribute. Default `sAMAccountName` (string)
	GroupSearchAttribute pulumi.StringOutput `pulumi:"groupSearchAttribute"`
	// Group search base (string)
	GroupSearchBase pulumi.StringOutput `pulumi:"groupSearchBase"`
	// Group search filter (string)
	GroupSearchFilter pulumi.StringOutput `pulumi:"groupSearchFilter"`
	// Labels of the resource (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Nested group membership enable. Default `false` (bool)
	NestedGroupMembershipEnabled pulumi.BoolOutput `pulumi:"nestedGroupMembershipEnabled"`
	// ActiveDirectory port. Default `389` (int)
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// ActiveDirectory servers list (list)
	Servers pulumi.StringArrayOutput `pulumi:"servers"`
	// Service account password for access ActiveDirectory service (string)
	ServiceAccountPassword pulumi.StringOutput `pulumi:"serviceAccountPassword"`
	// Service account DN for access ActiveDirectory service (string)
	ServiceAccountUsername pulumi.StringOutput `pulumi:"serviceAccountUsername"`
	// Enable start TLS connection (bool)
	StartTls pulumi.BoolOutput `pulumi:"startTls"`
	// Password for test access to ActiveDirectory service (string)
	TestPassword pulumi.StringOutput `pulumi:"testPassword"`
	// Username for test access to ActiveDirectory service (string)
	TestUsername pulumi.StringOutput `pulumi:"testUsername"`
	// Enable TLS connection (bool)
	Tls pulumi.BoolOutput `pulumi:"tls"`
	// (Computed) The type of the resource (string)
	Type pulumi.StringOutput `pulumi:"type"`
	// User disabled bit mask. Default `2` (int)
	UserDisabledBitMask pulumi.IntPtrOutput `pulumi:"userDisabledBitMask"`
	// User enable attribute (string)
	UserEnabledAttribute pulumi.StringOutput `pulumi:"userEnabledAttribute"`
	// User login attribute. Default `sAMAccountName` (string)
	UserLoginAttribute pulumi.StringOutput `pulumi:"userLoginAttribute"`
	// User name attribute. Default `name` (string)
	UserNameAttribute pulumi.StringOutput `pulumi:"userNameAttribute"`
	// User object class. Default `person` (string)
	UserObjectClass pulumi.StringOutput `pulumi:"userObjectClass"`
	// User search attribute. Default `sAMAccountName|sn|givenName` (string)
	UserSearchAttribute pulumi.StringOutput `pulumi:"userSearchAttribute"`
	// User search base DN (string)
	UserSearchBase pulumi.StringOutput `pulumi:"userSearchBase"`
	// User search filter (string)
	UserSearchFilter pulumi.StringOutput `pulumi:"userSearchFilter"`
}

// NewAuthConfigActiveDirectory registers a new resource with the given unique name, arguments, and options.
func NewAuthConfigActiveDirectory(ctx *pulumi.Context,
	name string, args *AuthConfigActiveDirectoryArgs, opts ...pulumi.ResourceOption) (*AuthConfigActiveDirectory, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Servers == nil {
		return nil, errors.New("invalid value for required argument 'Servers'")
	}
	if args.ServiceAccountPassword == nil {
		return nil, errors.New("invalid value for required argument 'ServiceAccountPassword'")
	}
	if args.ServiceAccountUsername == nil {
		return nil, errors.New("invalid value for required argument 'ServiceAccountUsername'")
	}
	if args.TestPassword == nil {
		return nil, errors.New("invalid value for required argument 'TestPassword'")
	}
	if args.TestUsername == nil {
		return nil, errors.New("invalid value for required argument 'TestUsername'")
	}
	if args.UserSearchBase == nil {
		return nil, errors.New("invalid value for required argument 'UserSearchBase'")
	}
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("rancher2:index/activeDirectory:ActiveDirectory"),
		},
	})
	opts = append(opts, aliases)
	if args.Certificate != nil {
		args.Certificate = pulumi.ToSecret(args.Certificate).(pulumi.StringPtrInput)
	}
	if args.ServiceAccountPassword != nil {
		args.ServiceAccountPassword = pulumi.ToSecret(args.ServiceAccountPassword).(pulumi.StringInput)
	}
	if args.ServiceAccountUsername != nil {
		args.ServiceAccountUsername = pulumi.ToSecret(args.ServiceAccountUsername).(pulumi.StringInput)
	}
	if args.TestPassword != nil {
		args.TestPassword = pulumi.ToSecret(args.TestPassword).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"certificate",
		"serviceAccountPassword",
		"serviceAccountUsername",
		"testPassword",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AuthConfigActiveDirectory
	err := ctx.RegisterResource("rancher2:index/authConfigActiveDirectory:AuthConfigActiveDirectory", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthConfigActiveDirectory gets an existing AuthConfigActiveDirectory resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthConfigActiveDirectory(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthConfigActiveDirectoryState, opts ...pulumi.ResourceOption) (*AuthConfigActiveDirectory, error) {
	var resource AuthConfigActiveDirectory
	err := ctx.ReadResource("rancher2:index/authConfigActiveDirectory:AuthConfigActiveDirectory", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthConfigActiveDirectory resources.
type authConfigActiveDirectoryState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `activedirectory_user://<DN>`  `activedirectory_group://<DN>`. The local admin (`local://<admin id>`) and the `testUsername` must be added too. (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// CA certificate for TLS if selfsigned (string)
	Certificate *string `pulumi:"certificate"`
	// ActiveDirectory connection timeout. Default `5000` (int)
	ConnectionTimeout *int `pulumi:"connectionTimeout"`
	// ActiveDirectory defult login domain (string)
	DefaultLoginDomain *string `pulumi:"defaultLoginDomain"`
	// Enable auth config provider. Default `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// Group DN attribute. Default `distinguishedName` (string)
	GroupDnAttribute *string `pulumi:"groupDnAttribute"`
	// Group member mapping attribute. Default `member` (string)
	GroupMemberMappingAttribute *string `pulumi:"groupMemberMappingAttribute"`
	// Group member user attribute. Default `distinguishedName` (string)
	GroupMemberUserAttribute *string `pulumi:"groupMemberUserAttribute"`
	// Group name attribute. Default `name` (string)
	GroupNameAttribute *string `pulumi:"groupNameAttribute"`
	// Group object class. Default `group` (string)
	GroupObjectClass *string `pulumi:"groupObjectClass"`
	// Group search attribute. Default `sAMAccountName` (string)
	GroupSearchAttribute *string `pulumi:"groupSearchAttribute"`
	// Group search base (string)
	GroupSearchBase *string `pulumi:"groupSearchBase"`
	// Group search filter (string)
	GroupSearchFilter *string `pulumi:"groupSearchFilter"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name *string `pulumi:"name"`
	// Nested group membership enable. Default `false` (bool)
	NestedGroupMembershipEnabled *bool `pulumi:"nestedGroupMembershipEnabled"`
	// ActiveDirectory port. Default `389` (int)
	Port *int `pulumi:"port"`
	// ActiveDirectory servers list (list)
	Servers []string `pulumi:"servers"`
	// Service account password for access ActiveDirectory service (string)
	ServiceAccountPassword *string `pulumi:"serviceAccountPassword"`
	// Service account DN for access ActiveDirectory service (string)
	ServiceAccountUsername *string `pulumi:"serviceAccountUsername"`
	// Enable start TLS connection (bool)
	StartTls *bool `pulumi:"startTls"`
	// Password for test access to ActiveDirectory service (string)
	TestPassword *string `pulumi:"testPassword"`
	// Username for test access to ActiveDirectory service (string)
	TestUsername *string `pulumi:"testUsername"`
	// Enable TLS connection (bool)
	Tls *bool `pulumi:"tls"`
	// (Computed) The type of the resource (string)
	Type *string `pulumi:"type"`
	// User disabled bit mask. Default `2` (int)
	UserDisabledBitMask *int `pulumi:"userDisabledBitMask"`
	// User enable attribute (string)
	UserEnabledAttribute *string `pulumi:"userEnabledAttribute"`
	// User login attribute. Default `sAMAccountName` (string)
	UserLoginAttribute *string `pulumi:"userLoginAttribute"`
	// User name attribute. Default `name` (string)
	UserNameAttribute *string `pulumi:"userNameAttribute"`
	// User object class. Default `person` (string)
	UserObjectClass *string `pulumi:"userObjectClass"`
	// User search attribute. Default `sAMAccountName|sn|givenName` (string)
	UserSearchAttribute *string `pulumi:"userSearchAttribute"`
	// User search base DN (string)
	UserSearchBase *string `pulumi:"userSearchBase"`
	// User search filter (string)
	UserSearchFilter *string `pulumi:"userSearchFilter"`
}

type AuthConfigActiveDirectoryState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `activedirectory_user://<DN>`  `activedirectory_group://<DN>`. The local admin (`local://<admin id>`) and the `testUsername` must be added too. (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// CA certificate for TLS if selfsigned (string)
	Certificate pulumi.StringPtrInput
	// ActiveDirectory connection timeout. Default `5000` (int)
	ConnectionTimeout pulumi.IntPtrInput
	// ActiveDirectory defult login domain (string)
	DefaultLoginDomain pulumi.StringPtrInput
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrInput
	// Group DN attribute. Default `distinguishedName` (string)
	GroupDnAttribute pulumi.StringPtrInput
	// Group member mapping attribute. Default `member` (string)
	GroupMemberMappingAttribute pulumi.StringPtrInput
	// Group member user attribute. Default `distinguishedName` (string)
	GroupMemberUserAttribute pulumi.StringPtrInput
	// Group name attribute. Default `name` (string)
	GroupNameAttribute pulumi.StringPtrInput
	// Group object class. Default `group` (string)
	GroupObjectClass pulumi.StringPtrInput
	// Group search attribute. Default `sAMAccountName` (string)
	GroupSearchAttribute pulumi.StringPtrInput
	// Group search base (string)
	GroupSearchBase pulumi.StringPtrInput
	// Group search filter (string)
	GroupSearchFilter pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// (Computed) The name of the resource (string)
	Name pulumi.StringPtrInput
	// Nested group membership enable. Default `false` (bool)
	NestedGroupMembershipEnabled pulumi.BoolPtrInput
	// ActiveDirectory port. Default `389` (int)
	Port pulumi.IntPtrInput
	// ActiveDirectory servers list (list)
	Servers pulumi.StringArrayInput
	// Service account password for access ActiveDirectory service (string)
	ServiceAccountPassword pulumi.StringPtrInput
	// Service account DN for access ActiveDirectory service (string)
	ServiceAccountUsername pulumi.StringPtrInput
	// Enable start TLS connection (bool)
	StartTls pulumi.BoolPtrInput
	// Password for test access to ActiveDirectory service (string)
	TestPassword pulumi.StringPtrInput
	// Username for test access to ActiveDirectory service (string)
	TestUsername pulumi.StringPtrInput
	// Enable TLS connection (bool)
	Tls pulumi.BoolPtrInput
	// (Computed) The type of the resource (string)
	Type pulumi.StringPtrInput
	// User disabled bit mask. Default `2` (int)
	UserDisabledBitMask pulumi.IntPtrInput
	// User enable attribute (string)
	UserEnabledAttribute pulumi.StringPtrInput
	// User login attribute. Default `sAMAccountName` (string)
	UserLoginAttribute pulumi.StringPtrInput
	// User name attribute. Default `name` (string)
	UserNameAttribute pulumi.StringPtrInput
	// User object class. Default `person` (string)
	UserObjectClass pulumi.StringPtrInput
	// User search attribute. Default `sAMAccountName|sn|givenName` (string)
	UserSearchAttribute pulumi.StringPtrInput
	// User search base DN (string)
	UserSearchBase pulumi.StringPtrInput
	// User search filter (string)
	UserSearchFilter pulumi.StringPtrInput
}

func (AuthConfigActiveDirectoryState) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigActiveDirectoryState)(nil)).Elem()
}

type authConfigActiveDirectoryArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `activedirectory_user://<DN>`  `activedirectory_group://<DN>`. The local admin (`local://<admin id>`) and the `testUsername` must be added too. (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// CA certificate for TLS if selfsigned (string)
	Certificate *string `pulumi:"certificate"`
	// ActiveDirectory connection timeout. Default `5000` (int)
	ConnectionTimeout *int `pulumi:"connectionTimeout"`
	// ActiveDirectory defult login domain (string)
	DefaultLoginDomain *string `pulumi:"defaultLoginDomain"`
	// Enable auth config provider. Default `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// Group DN attribute. Default `distinguishedName` (string)
	GroupDnAttribute *string `pulumi:"groupDnAttribute"`
	// Group member mapping attribute. Default `member` (string)
	GroupMemberMappingAttribute *string `pulumi:"groupMemberMappingAttribute"`
	// Group member user attribute. Default `distinguishedName` (string)
	GroupMemberUserAttribute *string `pulumi:"groupMemberUserAttribute"`
	// Group name attribute. Default `name` (string)
	GroupNameAttribute *string `pulumi:"groupNameAttribute"`
	// Group object class. Default `group` (string)
	GroupObjectClass *string `pulumi:"groupObjectClass"`
	// Group search attribute. Default `sAMAccountName` (string)
	GroupSearchAttribute *string `pulumi:"groupSearchAttribute"`
	// Group search base (string)
	GroupSearchBase *string `pulumi:"groupSearchBase"`
	// Group search filter (string)
	GroupSearchFilter *string `pulumi:"groupSearchFilter"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Nested group membership enable. Default `false` (bool)
	NestedGroupMembershipEnabled *bool `pulumi:"nestedGroupMembershipEnabled"`
	// ActiveDirectory port. Default `389` (int)
	Port *int `pulumi:"port"`
	// ActiveDirectory servers list (list)
	Servers []string `pulumi:"servers"`
	// Service account password for access ActiveDirectory service (string)
	ServiceAccountPassword string `pulumi:"serviceAccountPassword"`
	// Service account DN for access ActiveDirectory service (string)
	ServiceAccountUsername string `pulumi:"serviceAccountUsername"`
	// Enable start TLS connection (bool)
	StartTls *bool `pulumi:"startTls"`
	// Password for test access to ActiveDirectory service (string)
	TestPassword string `pulumi:"testPassword"`
	// Username for test access to ActiveDirectory service (string)
	TestUsername string `pulumi:"testUsername"`
	// Enable TLS connection (bool)
	Tls *bool `pulumi:"tls"`
	// User disabled bit mask. Default `2` (int)
	UserDisabledBitMask *int `pulumi:"userDisabledBitMask"`
	// User enable attribute (string)
	UserEnabledAttribute *string `pulumi:"userEnabledAttribute"`
	// User login attribute. Default `sAMAccountName` (string)
	UserLoginAttribute *string `pulumi:"userLoginAttribute"`
	// User name attribute. Default `name` (string)
	UserNameAttribute *string `pulumi:"userNameAttribute"`
	// User object class. Default `person` (string)
	UserObjectClass *string `pulumi:"userObjectClass"`
	// User search attribute. Default `sAMAccountName|sn|givenName` (string)
	UserSearchAttribute *string `pulumi:"userSearchAttribute"`
	// User search base DN (string)
	UserSearchBase string `pulumi:"userSearchBase"`
	// User search filter (string)
	UserSearchFilter *string `pulumi:"userSearchFilter"`
}

// The set of arguments for constructing a AuthConfigActiveDirectory resource.
type AuthConfigActiveDirectoryArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `activedirectory_user://<DN>`  `activedirectory_group://<DN>`. The local admin (`local://<admin id>`) and the `testUsername` must be added too. (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// CA certificate for TLS if selfsigned (string)
	Certificate pulumi.StringPtrInput
	// ActiveDirectory connection timeout. Default `5000` (int)
	ConnectionTimeout pulumi.IntPtrInput
	// ActiveDirectory defult login domain (string)
	DefaultLoginDomain pulumi.StringPtrInput
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrInput
	// Group DN attribute. Default `distinguishedName` (string)
	GroupDnAttribute pulumi.StringPtrInput
	// Group member mapping attribute. Default `member` (string)
	GroupMemberMappingAttribute pulumi.StringPtrInput
	// Group member user attribute. Default `distinguishedName` (string)
	GroupMemberUserAttribute pulumi.StringPtrInput
	// Group name attribute. Default `name` (string)
	GroupNameAttribute pulumi.StringPtrInput
	// Group object class. Default `group` (string)
	GroupObjectClass pulumi.StringPtrInput
	// Group search attribute. Default `sAMAccountName` (string)
	GroupSearchAttribute pulumi.StringPtrInput
	// Group search base (string)
	GroupSearchBase pulumi.StringPtrInput
	// Group search filter (string)
	GroupSearchFilter pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// Nested group membership enable. Default `false` (bool)
	NestedGroupMembershipEnabled pulumi.BoolPtrInput
	// ActiveDirectory port. Default `389` (int)
	Port pulumi.IntPtrInput
	// ActiveDirectory servers list (list)
	Servers pulumi.StringArrayInput
	// Service account password for access ActiveDirectory service (string)
	ServiceAccountPassword pulumi.StringInput
	// Service account DN for access ActiveDirectory service (string)
	ServiceAccountUsername pulumi.StringInput
	// Enable start TLS connection (bool)
	StartTls pulumi.BoolPtrInput
	// Password for test access to ActiveDirectory service (string)
	TestPassword pulumi.StringInput
	// Username for test access to ActiveDirectory service (string)
	TestUsername pulumi.StringInput
	// Enable TLS connection (bool)
	Tls pulumi.BoolPtrInput
	// User disabled bit mask. Default `2` (int)
	UserDisabledBitMask pulumi.IntPtrInput
	// User enable attribute (string)
	UserEnabledAttribute pulumi.StringPtrInput
	// User login attribute. Default `sAMAccountName` (string)
	UserLoginAttribute pulumi.StringPtrInput
	// User name attribute. Default `name` (string)
	UserNameAttribute pulumi.StringPtrInput
	// User object class. Default `person` (string)
	UserObjectClass pulumi.StringPtrInput
	// User search attribute. Default `sAMAccountName|sn|givenName` (string)
	UserSearchAttribute pulumi.StringPtrInput
	// User search base DN (string)
	UserSearchBase pulumi.StringInput
	// User search filter (string)
	UserSearchFilter pulumi.StringPtrInput
}

func (AuthConfigActiveDirectoryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigActiveDirectoryArgs)(nil)).Elem()
}

type AuthConfigActiveDirectoryInput interface {
	pulumi.Input

	ToAuthConfigActiveDirectoryOutput() AuthConfigActiveDirectoryOutput
	ToAuthConfigActiveDirectoryOutputWithContext(ctx context.Context) AuthConfigActiveDirectoryOutput
}

func (*AuthConfigActiveDirectory) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthConfigActiveDirectory)(nil)).Elem()
}

func (i *AuthConfigActiveDirectory) ToAuthConfigActiveDirectoryOutput() AuthConfigActiveDirectoryOutput {
	return i.ToAuthConfigActiveDirectoryOutputWithContext(context.Background())
}

func (i *AuthConfigActiveDirectory) ToAuthConfigActiveDirectoryOutputWithContext(ctx context.Context) AuthConfigActiveDirectoryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigActiveDirectoryOutput)
}

// AuthConfigActiveDirectoryArrayInput is an input type that accepts AuthConfigActiveDirectoryArray and AuthConfigActiveDirectoryArrayOutput values.
// You can construct a concrete instance of `AuthConfigActiveDirectoryArrayInput` via:
//
//	AuthConfigActiveDirectoryArray{ AuthConfigActiveDirectoryArgs{...} }
type AuthConfigActiveDirectoryArrayInput interface {
	pulumi.Input

	ToAuthConfigActiveDirectoryArrayOutput() AuthConfigActiveDirectoryArrayOutput
	ToAuthConfigActiveDirectoryArrayOutputWithContext(context.Context) AuthConfigActiveDirectoryArrayOutput
}

type AuthConfigActiveDirectoryArray []AuthConfigActiveDirectoryInput

func (AuthConfigActiveDirectoryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthConfigActiveDirectory)(nil)).Elem()
}

func (i AuthConfigActiveDirectoryArray) ToAuthConfigActiveDirectoryArrayOutput() AuthConfigActiveDirectoryArrayOutput {
	return i.ToAuthConfigActiveDirectoryArrayOutputWithContext(context.Background())
}

func (i AuthConfigActiveDirectoryArray) ToAuthConfigActiveDirectoryArrayOutputWithContext(ctx context.Context) AuthConfigActiveDirectoryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigActiveDirectoryArrayOutput)
}

// AuthConfigActiveDirectoryMapInput is an input type that accepts AuthConfigActiveDirectoryMap and AuthConfigActiveDirectoryMapOutput values.
// You can construct a concrete instance of `AuthConfigActiveDirectoryMapInput` via:
//
//	AuthConfigActiveDirectoryMap{ "key": AuthConfigActiveDirectoryArgs{...} }
type AuthConfigActiveDirectoryMapInput interface {
	pulumi.Input

	ToAuthConfigActiveDirectoryMapOutput() AuthConfigActiveDirectoryMapOutput
	ToAuthConfigActiveDirectoryMapOutputWithContext(context.Context) AuthConfigActiveDirectoryMapOutput
}

type AuthConfigActiveDirectoryMap map[string]AuthConfigActiveDirectoryInput

func (AuthConfigActiveDirectoryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthConfigActiveDirectory)(nil)).Elem()
}

func (i AuthConfigActiveDirectoryMap) ToAuthConfigActiveDirectoryMapOutput() AuthConfigActiveDirectoryMapOutput {
	return i.ToAuthConfigActiveDirectoryMapOutputWithContext(context.Background())
}

func (i AuthConfigActiveDirectoryMap) ToAuthConfigActiveDirectoryMapOutputWithContext(ctx context.Context) AuthConfigActiveDirectoryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthConfigActiveDirectoryMapOutput)
}

type AuthConfigActiveDirectoryOutput struct{ *pulumi.OutputState }

func (AuthConfigActiveDirectoryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthConfigActiveDirectory)(nil)).Elem()
}

func (o AuthConfigActiveDirectoryOutput) ToAuthConfigActiveDirectoryOutput() AuthConfigActiveDirectoryOutput {
	return o
}

func (o AuthConfigActiveDirectoryOutput) ToAuthConfigActiveDirectoryOutputWithContext(ctx context.Context) AuthConfigActiveDirectoryOutput {
	return o
}

// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
func (o AuthConfigActiveDirectoryOutput) AccessMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringPtrOutput { return v.AccessMode }).(pulumi.StringPtrOutput)
}

// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `activedirectory_user://<DN>`  `activedirectory_group://<DN>`. The local admin (`local://<admin id>`) and the `testUsername` must be added too. (list)
func (o AuthConfigActiveDirectoryOutput) AllowedPrincipalIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringArrayOutput { return v.AllowedPrincipalIds }).(pulumi.StringArrayOutput)
}

// Annotations of the resource (map)
func (o AuthConfigActiveDirectoryOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// CA certificate for TLS if selfsigned (string)
func (o AuthConfigActiveDirectoryOutput) Certificate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringPtrOutput { return v.Certificate }).(pulumi.StringPtrOutput)
}

// ActiveDirectory connection timeout. Default `5000` (int)
func (o AuthConfigActiveDirectoryOutput) ConnectionTimeout() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.IntPtrOutput { return v.ConnectionTimeout }).(pulumi.IntPtrOutput)
}

// ActiveDirectory defult login domain (string)
func (o AuthConfigActiveDirectoryOutput) DefaultLoginDomain() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringPtrOutput { return v.DefaultLoginDomain }).(pulumi.StringPtrOutput)
}

// Enable auth config provider. Default `true` (bool)
func (o AuthConfigActiveDirectoryOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Group DN attribute. Default `distinguishedName` (string)
func (o AuthConfigActiveDirectoryOutput) GroupDnAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.GroupDnAttribute }).(pulumi.StringOutput)
}

// Group member mapping attribute. Default `member` (string)
func (o AuthConfigActiveDirectoryOutput) GroupMemberMappingAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.GroupMemberMappingAttribute }).(pulumi.StringOutput)
}

// Group member user attribute. Default `distinguishedName` (string)
func (o AuthConfigActiveDirectoryOutput) GroupMemberUserAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.GroupMemberUserAttribute }).(pulumi.StringOutput)
}

// Group name attribute. Default `name` (string)
func (o AuthConfigActiveDirectoryOutput) GroupNameAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.GroupNameAttribute }).(pulumi.StringOutput)
}

// Group object class. Default `group` (string)
func (o AuthConfigActiveDirectoryOutput) GroupObjectClass() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.GroupObjectClass }).(pulumi.StringOutput)
}

// Group search attribute. Default `sAMAccountName` (string)
func (o AuthConfigActiveDirectoryOutput) GroupSearchAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.GroupSearchAttribute }).(pulumi.StringOutput)
}

// Group search base (string)
func (o AuthConfigActiveDirectoryOutput) GroupSearchBase() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.GroupSearchBase }).(pulumi.StringOutput)
}

// Group search filter (string)
func (o AuthConfigActiveDirectoryOutput) GroupSearchFilter() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.GroupSearchFilter }).(pulumi.StringOutput)
}

// Labels of the resource (map)
func (o AuthConfigActiveDirectoryOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// (Computed) The name of the resource (string)
func (o AuthConfigActiveDirectoryOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Nested group membership enable. Default `false` (bool)
func (o AuthConfigActiveDirectoryOutput) NestedGroupMembershipEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.BoolOutput { return v.NestedGroupMembershipEnabled }).(pulumi.BoolOutput)
}

// ActiveDirectory port. Default `389` (int)
func (o AuthConfigActiveDirectoryOutput) Port() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.IntPtrOutput { return v.Port }).(pulumi.IntPtrOutput)
}

// ActiveDirectory servers list (list)
func (o AuthConfigActiveDirectoryOutput) Servers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringArrayOutput { return v.Servers }).(pulumi.StringArrayOutput)
}

// Service account password for access ActiveDirectory service (string)
func (o AuthConfigActiveDirectoryOutput) ServiceAccountPassword() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.ServiceAccountPassword }).(pulumi.StringOutput)
}

// Service account DN for access ActiveDirectory service (string)
func (o AuthConfigActiveDirectoryOutput) ServiceAccountUsername() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.ServiceAccountUsername }).(pulumi.StringOutput)
}

// Enable start TLS connection (bool)
func (o AuthConfigActiveDirectoryOutput) StartTls() pulumi.BoolOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.BoolOutput { return v.StartTls }).(pulumi.BoolOutput)
}

// Password for test access to ActiveDirectory service (string)
func (o AuthConfigActiveDirectoryOutput) TestPassword() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.TestPassword }).(pulumi.StringOutput)
}

// Username for test access to ActiveDirectory service (string)
func (o AuthConfigActiveDirectoryOutput) TestUsername() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.TestUsername }).(pulumi.StringOutput)
}

// Enable TLS connection (bool)
func (o AuthConfigActiveDirectoryOutput) Tls() pulumi.BoolOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.BoolOutput { return v.Tls }).(pulumi.BoolOutput)
}

// (Computed) The type of the resource (string)
func (o AuthConfigActiveDirectoryOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// User disabled bit mask. Default `2` (int)
func (o AuthConfigActiveDirectoryOutput) UserDisabledBitMask() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.IntPtrOutput { return v.UserDisabledBitMask }).(pulumi.IntPtrOutput)
}

// User enable attribute (string)
func (o AuthConfigActiveDirectoryOutput) UserEnabledAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.UserEnabledAttribute }).(pulumi.StringOutput)
}

// User login attribute. Default `sAMAccountName` (string)
func (o AuthConfigActiveDirectoryOutput) UserLoginAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.UserLoginAttribute }).(pulumi.StringOutput)
}

// User name attribute. Default `name` (string)
func (o AuthConfigActiveDirectoryOutput) UserNameAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.UserNameAttribute }).(pulumi.StringOutput)
}

// User object class. Default `person` (string)
func (o AuthConfigActiveDirectoryOutput) UserObjectClass() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.UserObjectClass }).(pulumi.StringOutput)
}

// User search attribute. Default `sAMAccountName|sn|givenName` (string)
func (o AuthConfigActiveDirectoryOutput) UserSearchAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.UserSearchAttribute }).(pulumi.StringOutput)
}

// User search base DN (string)
func (o AuthConfigActiveDirectoryOutput) UserSearchBase() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.UserSearchBase }).(pulumi.StringOutput)
}

// User search filter (string)
func (o AuthConfigActiveDirectoryOutput) UserSearchFilter() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthConfigActiveDirectory) pulumi.StringOutput { return v.UserSearchFilter }).(pulumi.StringOutput)
}

type AuthConfigActiveDirectoryArrayOutput struct{ *pulumi.OutputState }

func (AuthConfigActiveDirectoryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthConfigActiveDirectory)(nil)).Elem()
}

func (o AuthConfigActiveDirectoryArrayOutput) ToAuthConfigActiveDirectoryArrayOutput() AuthConfigActiveDirectoryArrayOutput {
	return o
}

func (o AuthConfigActiveDirectoryArrayOutput) ToAuthConfigActiveDirectoryArrayOutputWithContext(ctx context.Context) AuthConfigActiveDirectoryArrayOutput {
	return o
}

func (o AuthConfigActiveDirectoryArrayOutput) Index(i pulumi.IntInput) AuthConfigActiveDirectoryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuthConfigActiveDirectory {
		return vs[0].([]*AuthConfigActiveDirectory)[vs[1].(int)]
	}).(AuthConfigActiveDirectoryOutput)
}

type AuthConfigActiveDirectoryMapOutput struct{ *pulumi.OutputState }

func (AuthConfigActiveDirectoryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthConfigActiveDirectory)(nil)).Elem()
}

func (o AuthConfigActiveDirectoryMapOutput) ToAuthConfigActiveDirectoryMapOutput() AuthConfigActiveDirectoryMapOutput {
	return o
}

func (o AuthConfigActiveDirectoryMapOutput) ToAuthConfigActiveDirectoryMapOutputWithContext(ctx context.Context) AuthConfigActiveDirectoryMapOutput {
	return o
}

func (o AuthConfigActiveDirectoryMapOutput) MapIndex(k pulumi.StringInput) AuthConfigActiveDirectoryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuthConfigActiveDirectory {
		return vs[0].(map[string]*AuthConfigActiveDirectory)[vs[1].(string)]
	}).(AuthConfigActiveDirectoryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigActiveDirectoryInput)(nil)).Elem(), &AuthConfigActiveDirectory{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigActiveDirectoryArrayInput)(nil)).Elem(), AuthConfigActiveDirectoryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthConfigActiveDirectoryMapInput)(nil)).Elem(), AuthConfigActiveDirectoryMap{})
	pulumi.RegisterOutputType(AuthConfigActiveDirectoryOutput{})
	pulumi.RegisterOutputType(AuthConfigActiveDirectoryArrayOutput{})
	pulumi.RegisterOutputType(AuthConfigActiveDirectoryMapOutput{})
}
