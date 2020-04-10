// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Rancher v2 Auth Config KeyCloak resource. This can be used to configure and enable Auth Config KeyCloak for Rancher v2 RKE clusters and retrieve their information.
//
// In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
type AuthConfigKeycloak struct {
	pulumi.CustomResourceState

	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrOutput `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `keycloak_user://<USER_ID>`  `keycloak_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayOutput `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// KeyCloak display name field (string)
	DisplayNameField pulumi.StringOutput `pulumi:"displayNameField"`
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// KeyCloak group field (string)
	GroupsField pulumi.StringOutput `pulumi:"groupsField"`
	// KeyCloak IDP metadata content (string)
	IdpMetadataContent pulumi.StringOutput `pulumi:"idpMetadataContent"`
	// Labels of the resource (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Rancher url. Schema needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost pulumi.StringOutput `pulumi:"rancherApiHost"`
	// KeyCloak SP cert (string)
	SpCert pulumi.StringOutput `pulumi:"spCert"`
	// KeyCloak SP key (string)
	SpKey pulumi.StringOutput `pulumi:"spKey"`
	// (Computed) The type of the resource (string)
	Type pulumi.StringOutput `pulumi:"type"`
	// KeyCloak UID field (string)
	UidField pulumi.StringOutput `pulumi:"uidField"`
	// KeyCloak user name field (string)
	UserNameField pulumi.StringOutput `pulumi:"userNameField"`
}

// NewAuthConfigKeycloak registers a new resource with the given unique name, arguments, and options.
func NewAuthConfigKeycloak(ctx *pulumi.Context,
	name string, args *AuthConfigKeycloakArgs, opts ...pulumi.ResourceOption) (*AuthConfigKeycloak, error) {
	if args == nil || args.DisplayNameField == nil {
		return nil, errors.New("missing required argument 'DisplayNameField'")
	}
	if args == nil || args.GroupsField == nil {
		return nil, errors.New("missing required argument 'GroupsField'")
	}
	if args == nil || args.IdpMetadataContent == nil {
		return nil, errors.New("missing required argument 'IdpMetadataContent'")
	}
	if args == nil || args.RancherApiHost == nil {
		return nil, errors.New("missing required argument 'RancherApiHost'")
	}
	if args == nil || args.SpCert == nil {
		return nil, errors.New("missing required argument 'SpCert'")
	}
	if args == nil || args.SpKey == nil {
		return nil, errors.New("missing required argument 'SpKey'")
	}
	if args == nil || args.UidField == nil {
		return nil, errors.New("missing required argument 'UidField'")
	}
	if args == nil || args.UserNameField == nil {
		return nil, errors.New("missing required argument 'UserNameField'")
	}
	if args == nil {
		args = &AuthConfigKeycloakArgs{}
	}
	var resource AuthConfigKeycloak
	err := ctx.RegisterResource("rancher2:index/authConfigKeycloak:AuthConfigKeycloak", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthConfigKeycloak gets an existing AuthConfigKeycloak resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthConfigKeycloak(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthConfigKeycloakState, opts ...pulumi.ResourceOption) (*AuthConfigKeycloak, error) {
	var resource AuthConfigKeycloak
	err := ctx.ReadResource("rancher2:index/authConfigKeycloak:AuthConfigKeycloak", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthConfigKeycloak resources.
type authConfigKeycloakState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `keycloak_user://<USER_ID>`  `keycloak_group://<GROUP_ID>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// KeyCloak display name field (string)
	DisplayNameField *string `pulumi:"displayNameField"`
	// Enable auth config provider. Default `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// KeyCloak group field (string)
	GroupsField *string `pulumi:"groupsField"`
	// KeyCloak IDP metadata content (string)
	IdpMetadataContent *string `pulumi:"idpMetadataContent"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) The name of the resource (string)
	Name *string `pulumi:"name"`
	// Rancher url. Schema needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost *string `pulumi:"rancherApiHost"`
	// KeyCloak SP cert (string)
	SpCert *string `pulumi:"spCert"`
	// KeyCloak SP key (string)
	SpKey *string `pulumi:"spKey"`
	// (Computed) The type of the resource (string)
	Type *string `pulumi:"type"`
	// KeyCloak UID field (string)
	UidField *string `pulumi:"uidField"`
	// KeyCloak user name field (string)
	UserNameField *string `pulumi:"userNameField"`
}

type AuthConfigKeycloakState struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `keycloak_user://<USER_ID>`  `keycloak_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// KeyCloak display name field (string)
	DisplayNameField pulumi.StringPtrInput
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrInput
	// KeyCloak group field (string)
	GroupsField pulumi.StringPtrInput
	// KeyCloak IDP metadata content (string)
	IdpMetadataContent pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// (Computed) The name of the resource (string)
	Name pulumi.StringPtrInput
	// Rancher url. Schema needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost pulumi.StringPtrInput
	// KeyCloak SP cert (string)
	SpCert pulumi.StringPtrInput
	// KeyCloak SP key (string)
	SpKey pulumi.StringPtrInput
	// (Computed) The type of the resource (string)
	Type pulumi.StringPtrInput
	// KeyCloak UID field (string)
	UidField pulumi.StringPtrInput
	// KeyCloak user name field (string)
	UserNameField pulumi.StringPtrInput
}

func (AuthConfigKeycloakState) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigKeycloakState)(nil)).Elem()
}

type authConfigKeycloakArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode *string `pulumi:"accessMode"`
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `keycloak_user://<USER_ID>`  `keycloak_group://<GROUP_ID>` (list)
	AllowedPrincipalIds []string `pulumi:"allowedPrincipalIds"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// KeyCloak display name field (string)
	DisplayNameField string `pulumi:"displayNameField"`
	// Enable auth config provider. Default `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// KeyCloak group field (string)
	GroupsField string `pulumi:"groupsField"`
	// KeyCloak IDP metadata content (string)
	IdpMetadataContent string `pulumi:"idpMetadataContent"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Rancher url. Schema needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost string `pulumi:"rancherApiHost"`
	// KeyCloak SP cert (string)
	SpCert string `pulumi:"spCert"`
	// KeyCloak SP key (string)
	SpKey string `pulumi:"spKey"`
	// KeyCloak UID field (string)
	UidField string `pulumi:"uidField"`
	// KeyCloak user name field (string)
	UserNameField string `pulumi:"userNameField"`
}

// The set of arguments for constructing a AuthConfigKeycloak resource.
type AuthConfigKeycloakArgs struct {
	// Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
	AccessMode pulumi.StringPtrInput
	// Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `keycloak_user://<USER_ID>`  `keycloak_group://<GROUP_ID>` (list)
	AllowedPrincipalIds pulumi.StringArrayInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// KeyCloak display name field (string)
	DisplayNameField pulumi.StringInput
	// Enable auth config provider. Default `true` (bool)
	Enabled pulumi.BoolPtrInput
	// KeyCloak group field (string)
	GroupsField pulumi.StringInput
	// KeyCloak IDP metadata content (string)
	IdpMetadataContent pulumi.StringInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// Rancher url. Schema needs to be specified, `https://<RANCHER_API_HOST>` (string)
	RancherApiHost pulumi.StringInput
	// KeyCloak SP cert (string)
	SpCert pulumi.StringInput
	// KeyCloak SP key (string)
	SpKey pulumi.StringInput
	// KeyCloak UID field (string)
	UidField pulumi.StringInput
	// KeyCloak user name field (string)
	UserNameField pulumi.StringInput
}

func (AuthConfigKeycloakArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authConfigKeycloakArgs)(nil)).Elem()
}
