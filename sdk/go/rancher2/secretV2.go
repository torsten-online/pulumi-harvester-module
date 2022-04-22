// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher Secret v2 resource. This can be used to create k8s secrets for Rancher v2 environments and retrieve their information. Secret v2 resource is available at Rancher v2.5.x and above.
//
// ## Import
//
// V2 secrets can be imported using the Rancher cluster ID, Secret V2 namespace and name.
//
// ```sh
//  $ pulumi import rancher2:index/secretV2:SecretV2 foo &lt;CLUSTER_ID&gt;.&lt;SECRET_V2_NAMESPACE&gt;/&lt;SECRET_V2_NAME&gt;
// ```
type SecretV2 struct {
	pulumi.CustomResourceState

	// Annotations for the secret v2 (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The cluster id of the secret V2 (string)
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The data of the secret v2 (map)
	Data pulumi.MapOutput `pulumi:"data"`
	// If set to true, any secret update will remove and recreate the secret. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
	Immutable pulumi.BoolPtrOutput `pulumi:"immutable"`
	// Labels for the secret v2 (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the secret v2 (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The namespaces of the secret v2. Default: `default` (string)
	Namespace pulumi.StringPtrOutput `pulumi:"namespace"`
	// (Computed) The k8s resource version (string)
	ResourceVersion pulumi.StringOutput `pulumi:"resourceVersion"`
	// The type of the k8s secret, used to facilitate programmatic handling of secret data, [More info](https://github.com/kubernetes/api/blob/release-1.20/core/v1/types.go#L5772) about k8s secret types and expected format.  Default: `Opaque` (string)
	Type pulumi.StringPtrOutput `pulumi:"type"`
}

// NewSecretV2 registers a new resource with the given unique name, arguments, and options.
func NewSecretV2(ctx *pulumi.Context,
	name string, args *SecretV2Args, opts ...pulumi.ResourceOption) (*SecretV2, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	if args.Data == nil {
		return nil, errors.New("invalid value for required argument 'Data'")
	}
	var resource SecretV2
	err := ctx.RegisterResource("rancher2:index/secretV2:SecretV2", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecretV2 gets an existing SecretV2 resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecretV2(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecretV2State, opts ...pulumi.ResourceOption) (*SecretV2, error) {
	var resource SecretV2
	err := ctx.ReadResource("rancher2:index/secretV2:SecretV2", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecretV2 resources.
type secretV2State struct {
	// Annotations for the secret v2 (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id of the secret V2 (string)
	ClusterId *string `pulumi:"clusterId"`
	// The data of the secret v2 (map)
	Data map[string]interface{} `pulumi:"data"`
	// If set to true, any secret update will remove and recreate the secret. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
	Immutable *bool `pulumi:"immutable"`
	// Labels for the secret v2 (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the secret v2 (string)
	Name *string `pulumi:"name"`
	// The namespaces of the secret v2. Default: `default` (string)
	Namespace *string `pulumi:"namespace"`
	// (Computed) The k8s resource version (string)
	ResourceVersion *string `pulumi:"resourceVersion"`
	// The type of the k8s secret, used to facilitate programmatic handling of secret data, [More info](https://github.com/kubernetes/api/blob/release-1.20/core/v1/types.go#L5772) about k8s secret types and expected format.  Default: `Opaque` (string)
	Type *string `pulumi:"type"`
}

type SecretV2State struct {
	// Annotations for the secret v2 (map)
	Annotations pulumi.MapInput
	// The cluster id of the secret V2 (string)
	ClusterId pulumi.StringPtrInput
	// The data of the secret v2 (map)
	Data pulumi.MapInput
	// If set to true, any secret update will remove and recreate the secret. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
	Immutable pulumi.BoolPtrInput
	// Labels for the secret v2 (map)
	Labels pulumi.MapInput
	// The name of the secret v2 (string)
	Name pulumi.StringPtrInput
	// The namespaces of the secret v2. Default: `default` (string)
	Namespace pulumi.StringPtrInput
	// (Computed) The k8s resource version (string)
	ResourceVersion pulumi.StringPtrInput
	// The type of the k8s secret, used to facilitate programmatic handling of secret data, [More info](https://github.com/kubernetes/api/blob/release-1.20/core/v1/types.go#L5772) about k8s secret types and expected format.  Default: `Opaque` (string)
	Type pulumi.StringPtrInput
}

func (SecretV2State) ElementType() reflect.Type {
	return reflect.TypeOf((*secretV2State)(nil)).Elem()
}

type secretV2Args struct {
	// Annotations for the secret v2 (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id of the secret V2 (string)
	ClusterId string `pulumi:"clusterId"`
	// The data of the secret v2 (map)
	Data map[string]interface{} `pulumi:"data"`
	// If set to true, any secret update will remove and recreate the secret. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
	Immutable *bool `pulumi:"immutable"`
	// Labels for the secret v2 (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the secret v2 (string)
	Name *string `pulumi:"name"`
	// The namespaces of the secret v2. Default: `default` (string)
	Namespace *string `pulumi:"namespace"`
	// The type of the k8s secret, used to facilitate programmatic handling of secret data, [More info](https://github.com/kubernetes/api/blob/release-1.20/core/v1/types.go#L5772) about k8s secret types and expected format.  Default: `Opaque` (string)
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a SecretV2 resource.
type SecretV2Args struct {
	// Annotations for the secret v2 (map)
	Annotations pulumi.MapInput
	// The cluster id of the secret V2 (string)
	ClusterId pulumi.StringInput
	// The data of the secret v2 (map)
	Data pulumi.MapInput
	// If set to true, any secret update will remove and recreate the secret. This is a beta field enabled by k8s `ImmutableEphemeralVolumes` feature gate. Default: `false` (bool)
	Immutable pulumi.BoolPtrInput
	// Labels for the secret v2 (map)
	Labels pulumi.MapInput
	// The name of the secret v2 (string)
	Name pulumi.StringPtrInput
	// The namespaces of the secret v2. Default: `default` (string)
	Namespace pulumi.StringPtrInput
	// The type of the k8s secret, used to facilitate programmatic handling of secret data, [More info](https://github.com/kubernetes/api/blob/release-1.20/core/v1/types.go#L5772) about k8s secret types and expected format.  Default: `Opaque` (string)
	Type pulumi.StringPtrInput
}

func (SecretV2Args) ElementType() reflect.Type {
	return reflect.TypeOf((*secretV2Args)(nil)).Elem()
}

type SecretV2Input interface {
	pulumi.Input

	ToSecretV2Output() SecretV2Output
	ToSecretV2OutputWithContext(ctx context.Context) SecretV2Output
}

func (*SecretV2) ElementType() reflect.Type {
	return reflect.TypeOf((**SecretV2)(nil)).Elem()
}

func (i *SecretV2) ToSecretV2Output() SecretV2Output {
	return i.ToSecretV2OutputWithContext(context.Background())
}

func (i *SecretV2) ToSecretV2OutputWithContext(ctx context.Context) SecretV2Output {
	return pulumi.ToOutputWithContext(ctx, i).(SecretV2Output)
}

// SecretV2ArrayInput is an input type that accepts SecretV2Array and SecretV2ArrayOutput values.
// You can construct a concrete instance of `SecretV2ArrayInput` via:
//
//          SecretV2Array{ SecretV2Args{...} }
type SecretV2ArrayInput interface {
	pulumi.Input

	ToSecretV2ArrayOutput() SecretV2ArrayOutput
	ToSecretV2ArrayOutputWithContext(context.Context) SecretV2ArrayOutput
}

type SecretV2Array []SecretV2Input

func (SecretV2Array) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecretV2)(nil)).Elem()
}

func (i SecretV2Array) ToSecretV2ArrayOutput() SecretV2ArrayOutput {
	return i.ToSecretV2ArrayOutputWithContext(context.Background())
}

func (i SecretV2Array) ToSecretV2ArrayOutputWithContext(ctx context.Context) SecretV2ArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretV2ArrayOutput)
}

// SecretV2MapInput is an input type that accepts SecretV2Map and SecretV2MapOutput values.
// You can construct a concrete instance of `SecretV2MapInput` via:
//
//          SecretV2Map{ "key": SecretV2Args{...} }
type SecretV2MapInput interface {
	pulumi.Input

	ToSecretV2MapOutput() SecretV2MapOutput
	ToSecretV2MapOutputWithContext(context.Context) SecretV2MapOutput
}

type SecretV2Map map[string]SecretV2Input

func (SecretV2Map) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecretV2)(nil)).Elem()
}

func (i SecretV2Map) ToSecretV2MapOutput() SecretV2MapOutput {
	return i.ToSecretV2MapOutputWithContext(context.Background())
}

func (i SecretV2Map) ToSecretV2MapOutputWithContext(ctx context.Context) SecretV2MapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretV2MapOutput)
}

type SecretV2Output struct{ *pulumi.OutputState }

func (SecretV2Output) ElementType() reflect.Type {
	return reflect.TypeOf((**SecretV2)(nil)).Elem()
}

func (o SecretV2Output) ToSecretV2Output() SecretV2Output {
	return o
}

func (o SecretV2Output) ToSecretV2OutputWithContext(ctx context.Context) SecretV2Output {
	return o
}

type SecretV2ArrayOutput struct{ *pulumi.OutputState }

func (SecretV2ArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecretV2)(nil)).Elem()
}

func (o SecretV2ArrayOutput) ToSecretV2ArrayOutput() SecretV2ArrayOutput {
	return o
}

func (o SecretV2ArrayOutput) ToSecretV2ArrayOutputWithContext(ctx context.Context) SecretV2ArrayOutput {
	return o
}

func (o SecretV2ArrayOutput) Index(i pulumi.IntInput) SecretV2Output {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SecretV2 {
		return vs[0].([]*SecretV2)[vs[1].(int)]
	}).(SecretV2Output)
}

type SecretV2MapOutput struct{ *pulumi.OutputState }

func (SecretV2MapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecretV2)(nil)).Elem()
}

func (o SecretV2MapOutput) ToSecretV2MapOutput() SecretV2MapOutput {
	return o
}

func (o SecretV2MapOutput) ToSecretV2MapOutputWithContext(ctx context.Context) SecretV2MapOutput {
	return o
}

func (o SecretV2MapOutput) MapIndex(k pulumi.StringInput) SecretV2Output {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SecretV2 {
		return vs[0].(map[string]*SecretV2)[vs[1].(string)]
	}).(SecretV2Output)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecretV2Input)(nil)).Elem(), &SecretV2{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretV2ArrayInput)(nil)).Elem(), SecretV2Array{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretV2MapInput)(nil)).Elem(), SecretV2Map{})
	pulumi.RegisterOutputType(SecretV2Output{})
	pulumi.RegisterOutputType(SecretV2ArrayOutput{})
	pulumi.RegisterOutputType(SecretV2MapOutput{})
}
