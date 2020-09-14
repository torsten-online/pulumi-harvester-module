// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type Secret struct {
	pulumi.CustomResourceState

	// Annotations of the resource
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// Secret data base64 encoded
	Data pulumi.MapOutput `pulumi:"data"`
	// Secret description
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Labels of the resource
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Secret name
	Name pulumi.StringOutput `pulumi:"name"`
	// Namespace ID to add secret
	NamespaceId pulumi.StringPtrOutput `pulumi:"namespaceId"`
	// Project ID to add secret
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
}

// NewSecret registers a new resource with the given unique name, arguments, and options.
func NewSecret(ctx *pulumi.Context,
	name string, args *SecretArgs, opts ...pulumi.ResourceOption) (*Secret, error) {
	if args == nil || args.Data == nil {
		return nil, errors.New("missing required argument 'Data'")
	}
	if args == nil || args.ProjectId == nil {
		return nil, errors.New("missing required argument 'ProjectId'")
	}
	if args == nil {
		args = &SecretArgs{}
	}
	var resource Secret
	err := ctx.RegisterResource("rancher2:index/secret:Secret", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecret gets an existing Secret resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecret(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecretState, opts ...pulumi.ResourceOption) (*Secret, error) {
	var resource Secret
	err := ctx.ReadResource("rancher2:index/secret:Secret", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Secret resources.
type secretState struct {
	// Annotations of the resource
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Secret data base64 encoded
	Data map[string]interface{} `pulumi:"data"`
	// Secret description
	Description *string `pulumi:"description"`
	// Labels of the resource
	Labels map[string]interface{} `pulumi:"labels"`
	// Secret name
	Name *string `pulumi:"name"`
	// Namespace ID to add secret
	NamespaceId *string `pulumi:"namespaceId"`
	// Project ID to add secret
	ProjectId *string `pulumi:"projectId"`
}

type SecretState struct {
	// Annotations of the resource
	Annotations pulumi.MapInput
	// Secret data base64 encoded
	Data pulumi.MapInput
	// Secret description
	Description pulumi.StringPtrInput
	// Labels of the resource
	Labels pulumi.MapInput
	// Secret name
	Name pulumi.StringPtrInput
	// Namespace ID to add secret
	NamespaceId pulumi.StringPtrInput
	// Project ID to add secret
	ProjectId pulumi.StringPtrInput
}

func (SecretState) ElementType() reflect.Type {
	return reflect.TypeOf((*secretState)(nil)).Elem()
}

type secretArgs struct {
	// Annotations of the resource
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Secret data base64 encoded
	Data map[string]interface{} `pulumi:"data"`
	// Secret description
	Description *string `pulumi:"description"`
	// Labels of the resource
	Labels map[string]interface{} `pulumi:"labels"`
	// Secret name
	Name *string `pulumi:"name"`
	// Namespace ID to add secret
	NamespaceId *string `pulumi:"namespaceId"`
	// Project ID to add secret
	ProjectId string `pulumi:"projectId"`
}

// The set of arguments for constructing a Secret resource.
type SecretArgs struct {
	// Annotations of the resource
	Annotations pulumi.MapInput
	// Secret data base64 encoded
	Data pulumi.MapInput
	// Secret description
	Description pulumi.StringPtrInput
	// Labels of the resource
	Labels pulumi.MapInput
	// Secret name
	Name pulumi.StringPtrInput
	// Namespace ID to add secret
	NamespaceId pulumi.StringPtrInput
	// Project ID to add secret
	ProjectId pulumi.StringInput
}

func (SecretArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*secretArgs)(nil)).Elem()
}
