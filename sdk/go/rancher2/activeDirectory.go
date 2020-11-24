// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Rancher v2 Auth Config ActiveDirectory resource. This can be used to configure and enable Auth Config ActiveDirectory for Rancher v2 RKE clusters and retrieve their information.
//
// In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
type ActiveDirectory struct {
	pulumi.CustomResourceState

	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrOutput `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `activedirectory_user://<DN>`  `activedirectory_group://<DN>` (list)
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

// NewActiveDirectory registers a new resource with the given unique name, arguments, and options.
func NewActiveDirectory(ctx *pulumi.Context,
	name string, args *ActiveDirectoryArgs, opts ...pulumi.ResourceOption) (*ActiveDirectory, error) {
	if args == nil || args.Servers == nil {
		return nil, errors.New("missing required argument 'Servers'")
	}
	if args == nil || args.ServiceAccountPassword == nil {
		return nil, errors.New("missing required argument 'ServiceAccountPassword'")
	}
	if args == nil || args.ServiceAccountUsername == nil {
		return nil, errors.New("missing required argument 'ServiceAccountUsername'")
	}
	if args == nil || args.TestPassword == nil {
		return nil, errors.New("missing required argument 'TestPassword'")
	}
	if args == nil || args.TestUsername == nil {
		return nil, errors.New("missing required argument 'TestUsername'")
	}
	if args == nil || args.UserSearchBase == nil {
		return nil, errors.New("missing required argument 'UserSearchBase'")
	}
	if args == nil {
		args = &ActiveDirectoryArgs{}
	}
	var resource ActiveDirectory
	err := ctx.RegisterResource("rancher2:index/activeDirectory:ActiveDirectory", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetActiveDirectory gets an existing ActiveDirectory resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetActiveDirectory(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ActiveDirectoryState, opts ...pulumi.ResourceOption) (*ActiveDirectory, error) {
	var resource ActiveDirectory
	err := ctx.ReadResource("rancher2:index/activeDirectory:ActiveDirectory", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ActiveDirectory resources.
type activeDirectoryState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `activedirectory_user://<DN>`  `activedirectory_group://<DN>` (list)
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

type ActiveDirectoryState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `activedirectory_user://<DN>`  `activedirectory_group://<DN>` (list)
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

func (ActiveDirectoryState) ElementType() reflect.Type {
	return reflect.TypeOf((*activeDirectoryState)(nil)).Elem()
}

type activeDirectoryArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `activedirectory_user://<DN>`  `activedirectory_group://<DN>` (list)
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

// The set of arguments for constructing a ActiveDirectory resource.
type ActiveDirectoryArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `activedirectory_user://<DN>`  `activedirectory_group://<DN>` (list)
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

func (ActiveDirectoryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*activeDirectoryArgs)(nil)).Elem()
}

type ActiveDirectoryInput interface {
	pulumi.Input

	ToActiveDirectoryOutput() ActiveDirectoryOutput
	ToActiveDirectoryOutputWithContext(ctx context.Context) ActiveDirectoryOutput
}

func (ActiveDirectory) ElementType() reflect.Type {
	return reflect.TypeOf((*ActiveDirectory)(nil)).Elem()
}

func (i ActiveDirectory) ToActiveDirectoryOutput() ActiveDirectoryOutput {
	return i.ToActiveDirectoryOutputWithContext(context.Background())
}

func (i ActiveDirectory) ToActiveDirectoryOutputWithContext(ctx context.Context) ActiveDirectoryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActiveDirectoryOutput)
}

type ActiveDirectoryOutput struct {
	*pulumi.OutputState
}

func (ActiveDirectoryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ActiveDirectoryOutput)(nil)).Elem()
}

func (o ActiveDirectoryOutput) ToActiveDirectoryOutput() ActiveDirectoryOutput {
	return o
}

func (o ActiveDirectoryOutput) ToActiveDirectoryOutputWithContext(ctx context.Context) ActiveDirectoryOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ActiveDirectoryOutput{})
}
