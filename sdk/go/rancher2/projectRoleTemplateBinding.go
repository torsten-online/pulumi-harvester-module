// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package rancher2

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Rancher v2 Project Role Template Binding resource. This can be used to create Project Role Template Bindings for Rancher v2 environments and retrieve their information.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/projectRole.html.markdown.
type ProjectRoleTemplateBinding struct {
	pulumi.CustomResourceState

	// Annotations of the resource (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The group ID to assign project role template binding (string)
	GroupId pulumi.StringPtrOutput `pulumi:"groupId"`
	// The groupPrincipal ID to assign project role template binding (string)
	GroupPrincipalId pulumi.StringOutput `pulumi:"groupPrincipalId"`
	// Labels of the resource (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the project role template binding (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The project id where bind project role template (string)
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// The role template id from create project role template binding (string)
	RoleTemplateId pulumi.StringOutput `pulumi:"roleTemplateId"`
	// The user ID to assign project role template binding (string)
	UserId pulumi.StringPtrOutput `pulumi:"userId"`
	// The userPrincipal ID to assign project role template binding (string)
	UserPrincipalId pulumi.StringOutput `pulumi:"userPrincipalId"`
}

// NewProjectRoleTemplateBinding registers a new resource with the given unique name, arguments, and options.
func NewProjectRoleTemplateBinding(ctx *pulumi.Context,
	name string, args *ProjectRoleTemplateBindingArgs, opts ...pulumi.ResourceOption) (*ProjectRoleTemplateBinding, error) {
	if args == nil || args.ProjectId == nil {
		return nil, errors.New("missing required argument 'ProjectId'")
	}
	if args == nil || args.RoleTemplateId == nil {
		return nil, errors.New("missing required argument 'RoleTemplateId'")
	}
	if args == nil {
		args = &ProjectRoleTemplateBindingArgs{}
	}
	var resource ProjectRoleTemplateBinding
	err := ctx.RegisterResource("rancher2:index/projectRoleTemplateBinding:ProjectRoleTemplateBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectRoleTemplateBinding gets an existing ProjectRoleTemplateBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectRoleTemplateBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectRoleTemplateBindingState, opts ...pulumi.ResourceOption) (*ProjectRoleTemplateBinding, error) {
	var resource ProjectRoleTemplateBinding
	err := ctx.ReadResource("rancher2:index/projectRoleTemplateBinding:ProjectRoleTemplateBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectRoleTemplateBinding resources.
type projectRoleTemplateBindingState struct {
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The group ID to assign project role template binding (string)
	GroupId *string `pulumi:"groupId"`
	// The groupPrincipal ID to assign project role template binding (string)
	GroupPrincipalId *string `pulumi:"groupPrincipalId"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the project role template binding (string)
	Name *string `pulumi:"name"`
	// The project id where bind project role template (string)
	ProjectId *string `pulumi:"projectId"`
	// The role template id from create project role template binding (string)
	RoleTemplateId *string `pulumi:"roleTemplateId"`
	// The user ID to assign project role template binding (string)
	UserId *string `pulumi:"userId"`
	// The userPrincipal ID to assign project role template binding (string)
	UserPrincipalId *string `pulumi:"userPrincipalId"`
}

type ProjectRoleTemplateBindingState struct {
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// The group ID to assign project role template binding (string)
	GroupId pulumi.StringPtrInput
	// The groupPrincipal ID to assign project role template binding (string)
	GroupPrincipalId pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// The name of the project role template binding (string)
	Name pulumi.StringPtrInput
	// The project id where bind project role template (string)
	ProjectId pulumi.StringPtrInput
	// The role template id from create project role template binding (string)
	RoleTemplateId pulumi.StringPtrInput
	// The user ID to assign project role template binding (string)
	UserId pulumi.StringPtrInput
	// The userPrincipal ID to assign project role template binding (string)
	UserPrincipalId pulumi.StringPtrInput
}

func (ProjectRoleTemplateBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectRoleTemplateBindingState)(nil)).Elem()
}

type projectRoleTemplateBindingArgs struct {
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The group ID to assign project role template binding (string)
	GroupId *string `pulumi:"groupId"`
	// The groupPrincipal ID to assign project role template binding (string)
	GroupPrincipalId *string `pulumi:"groupPrincipalId"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the project role template binding (string)
	Name *string `pulumi:"name"`
	// The project id where bind project role template (string)
	ProjectId string `pulumi:"projectId"`
	// The role template id from create project role template binding (string)
	RoleTemplateId string `pulumi:"roleTemplateId"`
	// The user ID to assign project role template binding (string)
	UserId *string `pulumi:"userId"`
	// The userPrincipal ID to assign project role template binding (string)
	UserPrincipalId *string `pulumi:"userPrincipalId"`
}

// The set of arguments for constructing a ProjectRoleTemplateBinding resource.
type ProjectRoleTemplateBindingArgs struct {
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// The group ID to assign project role template binding (string)
	GroupId pulumi.StringPtrInput
	// The groupPrincipal ID to assign project role template binding (string)
	GroupPrincipalId pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// The name of the project role template binding (string)
	Name pulumi.StringPtrInput
	// The project id where bind project role template (string)
	ProjectId pulumi.StringInput
	// The role template id from create project role template binding (string)
	RoleTemplateId pulumi.StringInput
	// The user ID to assign project role template binding (string)
	UserId pulumi.StringPtrInput
	// The userPrincipal ID to assign project role template binding (string)
	UserPrincipalId pulumi.StringPtrInput
}

func (ProjectRoleTemplateBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectRoleTemplateBindingArgs)(nil)).Elem()
}
