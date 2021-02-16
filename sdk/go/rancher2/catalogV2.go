// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Rancher Catalog v2 resource. This can be used to create cluster helm catalogs for Rancher v2 environments and retrieve their information. Catalog v2 resource is available at Rancher v2.5.x and above.
//
// ## Import
//
// V2 catalogs can be imported using the Rancher cluster ID and Catalog V2 name.
//
// ```sh
//  $ pulumi import rancher2:index/catalogV2:CatalogV2 foo &lt;CLUSTER_ID&gt;.&lt;CATALOG_V2_NAME&gt;
// ```
type CatalogV2 struct {
	pulumi.CustomResourceState

	// Annotations for the catalog v2 (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// PEM encoded CA bundle which will be used to validate the repo's certificate (string)
	CaBundle pulumi.StringPtrOutput `pulumi:"caBundle"`
	// The cluster id of the catalog V2 (string)
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Git Repository branch containing Helm chart definitions. Default `master` (string)
	GitBranch pulumi.StringPtrOutput `pulumi:"gitBranch"`
	// The url of the catalog v2 repo (string)
	GitRepo pulumi.StringPtrOutput `pulumi:"gitRepo"`
	// Use insecure HTTPS to download the repo's index. Default: `false` (bool)
	Insecure pulumi.BoolPtrOutput `pulumi:"insecure"`
	// Labels for the catalog v2 (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the catalog v2 (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// (Computed) The k8s resource version (string)
	ResourceVersion pulumi.StringOutput `pulumi:"resourceVersion"`
	// K8s secret name to be used to connect to the repo (string)
	SecretName pulumi.StringPtrOutput `pulumi:"secretName"`
	// K8s secret namespace (string)
	SecretNamespace pulumi.StringPtrOutput `pulumi:"secretNamespace"`
	// K8s service account used to deploy charts instead of the end users credentials (string)
	ServiceAccount pulumi.StringPtrOutput `pulumi:"serviceAccount"`
	// The username to access the catalog if needed (string)
	ServiceAccountNamespace pulumi.StringPtrOutput `pulumi:"serviceAccountNamespace"`
	// URL to an index generated by Helm (string)
	Url pulumi.StringPtrOutput `pulumi:"url"`
}

// NewCatalogV2 registers a new resource with the given unique name, arguments, and options.
func NewCatalogV2(ctx *pulumi.Context,
	name string, args *CatalogV2Args, opts ...pulumi.ResourceOption) (*CatalogV2, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	var resource CatalogV2
	err := ctx.RegisterResource("rancher2:index/catalogV2:CatalogV2", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCatalogV2 gets an existing CatalogV2 resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCatalogV2(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CatalogV2State, opts ...pulumi.ResourceOption) (*CatalogV2, error) {
	var resource CatalogV2
	err := ctx.ReadResource("rancher2:index/catalogV2:CatalogV2", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CatalogV2 resources.
type catalogV2State struct {
	// Annotations for the catalog v2 (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// PEM encoded CA bundle which will be used to validate the repo's certificate (string)
	CaBundle *string `pulumi:"caBundle"`
	// The cluster id of the catalog V2 (string)
	ClusterId *string `pulumi:"clusterId"`
	// If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// Git Repository branch containing Helm chart definitions. Default `master` (string)
	GitBranch *string `pulumi:"gitBranch"`
	// The url of the catalog v2 repo (string)
	GitRepo *string `pulumi:"gitRepo"`
	// Use insecure HTTPS to download the repo's index. Default: `false` (bool)
	Insecure *bool `pulumi:"insecure"`
	// Labels for the catalog v2 (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the catalog v2 (string)
	Name *string `pulumi:"name"`
	// (Computed) The k8s resource version (string)
	ResourceVersion *string `pulumi:"resourceVersion"`
	// K8s secret name to be used to connect to the repo (string)
	SecretName *string `pulumi:"secretName"`
	// K8s secret namespace (string)
	SecretNamespace *string `pulumi:"secretNamespace"`
	// K8s service account used to deploy charts instead of the end users credentials (string)
	ServiceAccount *string `pulumi:"serviceAccount"`
	// The username to access the catalog if needed (string)
	ServiceAccountNamespace *string `pulumi:"serviceAccountNamespace"`
	// URL to an index generated by Helm (string)
	Url *string `pulumi:"url"`
}

type CatalogV2State struct {
	// Annotations for the catalog v2 (map)
	Annotations pulumi.MapInput
	// PEM encoded CA bundle which will be used to validate the repo's certificate (string)
	CaBundle pulumi.StringPtrInput
	// The cluster id of the catalog V2 (string)
	ClusterId pulumi.StringPtrInput
	// If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
	Enabled pulumi.BoolPtrInput
	// Git Repository branch containing Helm chart definitions. Default `master` (string)
	GitBranch pulumi.StringPtrInput
	// The url of the catalog v2 repo (string)
	GitRepo pulumi.StringPtrInput
	// Use insecure HTTPS to download the repo's index. Default: `false` (bool)
	Insecure pulumi.BoolPtrInput
	// Labels for the catalog v2 (map)
	Labels pulumi.MapInput
	// The name of the catalog v2 (string)
	Name pulumi.StringPtrInput
	// (Computed) The k8s resource version (string)
	ResourceVersion pulumi.StringPtrInput
	// K8s secret name to be used to connect to the repo (string)
	SecretName pulumi.StringPtrInput
	// K8s secret namespace (string)
	SecretNamespace pulumi.StringPtrInput
	// K8s service account used to deploy charts instead of the end users credentials (string)
	ServiceAccount pulumi.StringPtrInput
	// The username to access the catalog if needed (string)
	ServiceAccountNamespace pulumi.StringPtrInput
	// URL to an index generated by Helm (string)
	Url pulumi.StringPtrInput
}

func (CatalogV2State) ElementType() reflect.Type {
	return reflect.TypeOf((*catalogV2State)(nil)).Elem()
}

type catalogV2Args struct {
	// Annotations for the catalog v2 (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// PEM encoded CA bundle which will be used to validate the repo's certificate (string)
	CaBundle *string `pulumi:"caBundle"`
	// The cluster id of the catalog V2 (string)
	ClusterId string `pulumi:"clusterId"`
	// If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
	Enabled *bool `pulumi:"enabled"`
	// Git Repository branch containing Helm chart definitions. Default `master` (string)
	GitBranch *string `pulumi:"gitBranch"`
	// The url of the catalog v2 repo (string)
	GitRepo *string `pulumi:"gitRepo"`
	// Use insecure HTTPS to download the repo's index. Default: `false` (bool)
	Insecure *bool `pulumi:"insecure"`
	// Labels for the catalog v2 (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the catalog v2 (string)
	Name *string `pulumi:"name"`
	// K8s secret name to be used to connect to the repo (string)
	SecretName *string `pulumi:"secretName"`
	// K8s secret namespace (string)
	SecretNamespace *string `pulumi:"secretNamespace"`
	// K8s service account used to deploy charts instead of the end users credentials (string)
	ServiceAccount *string `pulumi:"serviceAccount"`
	// The username to access the catalog if needed (string)
	ServiceAccountNamespace *string `pulumi:"serviceAccountNamespace"`
	// URL to an index generated by Helm (string)
	Url *string `pulumi:"url"`
}

// The set of arguments for constructing a CatalogV2 resource.
type CatalogV2Args struct {
	// Annotations for the catalog v2 (map)
	Annotations pulumi.MapInput
	// PEM encoded CA bundle which will be used to validate the repo's certificate (string)
	CaBundle pulumi.StringPtrInput
	// The cluster id of the catalog V2 (string)
	ClusterId pulumi.StringInput
	// If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
	Enabled pulumi.BoolPtrInput
	// Git Repository branch containing Helm chart definitions. Default `master` (string)
	GitBranch pulumi.StringPtrInput
	// The url of the catalog v2 repo (string)
	GitRepo pulumi.StringPtrInput
	// Use insecure HTTPS to download the repo's index. Default: `false` (bool)
	Insecure pulumi.BoolPtrInput
	// Labels for the catalog v2 (map)
	Labels pulumi.MapInput
	// The name of the catalog v2 (string)
	Name pulumi.StringPtrInput
	// K8s secret name to be used to connect to the repo (string)
	SecretName pulumi.StringPtrInput
	// K8s secret namespace (string)
	SecretNamespace pulumi.StringPtrInput
	// K8s service account used to deploy charts instead of the end users credentials (string)
	ServiceAccount pulumi.StringPtrInput
	// The username to access the catalog if needed (string)
	ServiceAccountNamespace pulumi.StringPtrInput
	// URL to an index generated by Helm (string)
	Url pulumi.StringPtrInput
}

func (CatalogV2Args) ElementType() reflect.Type {
	return reflect.TypeOf((*catalogV2Args)(nil)).Elem()
}

type CatalogV2Input interface {
	pulumi.Input

	ToCatalogV2Output() CatalogV2Output
	ToCatalogV2OutputWithContext(ctx context.Context) CatalogV2Output
}

func (*CatalogV2) ElementType() reflect.Type {
	return reflect.TypeOf((*CatalogV2)(nil))
}

func (i *CatalogV2) ToCatalogV2Output() CatalogV2Output {
	return i.ToCatalogV2OutputWithContext(context.Background())
}

func (i *CatalogV2) ToCatalogV2OutputWithContext(ctx context.Context) CatalogV2Output {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogV2Output)
}

func (i *CatalogV2) ToCatalogV2PtrOutput() CatalogV2PtrOutput {
	return i.ToCatalogV2PtrOutputWithContext(context.Background())
}

func (i *CatalogV2) ToCatalogV2PtrOutputWithContext(ctx context.Context) CatalogV2PtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogV2PtrOutput)
}

type CatalogV2PtrInput interface {
	pulumi.Input

	ToCatalogV2PtrOutput() CatalogV2PtrOutput
	ToCatalogV2PtrOutputWithContext(ctx context.Context) CatalogV2PtrOutput
}

type catalogV2PtrType CatalogV2Args

func (*catalogV2PtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**CatalogV2)(nil))
}

func (i *catalogV2PtrType) ToCatalogV2PtrOutput() CatalogV2PtrOutput {
	return i.ToCatalogV2PtrOutputWithContext(context.Background())
}

func (i *catalogV2PtrType) ToCatalogV2PtrOutputWithContext(ctx context.Context) CatalogV2PtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogV2PtrOutput)
}

// CatalogV2ArrayInput is an input type that accepts CatalogV2Array and CatalogV2ArrayOutput values.
// You can construct a concrete instance of `CatalogV2ArrayInput` via:
//
//          CatalogV2Array{ CatalogV2Args{...} }
type CatalogV2ArrayInput interface {
	pulumi.Input

	ToCatalogV2ArrayOutput() CatalogV2ArrayOutput
	ToCatalogV2ArrayOutputWithContext(context.Context) CatalogV2ArrayOutput
}

type CatalogV2Array []CatalogV2Input

func (CatalogV2Array) ElementType() reflect.Type {
	return reflect.TypeOf(([]*CatalogV2)(nil))
}

func (i CatalogV2Array) ToCatalogV2ArrayOutput() CatalogV2ArrayOutput {
	return i.ToCatalogV2ArrayOutputWithContext(context.Background())
}

func (i CatalogV2Array) ToCatalogV2ArrayOutputWithContext(ctx context.Context) CatalogV2ArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogV2ArrayOutput)
}

// CatalogV2MapInput is an input type that accepts CatalogV2Map and CatalogV2MapOutput values.
// You can construct a concrete instance of `CatalogV2MapInput` via:
//
//          CatalogV2Map{ "key": CatalogV2Args{...} }
type CatalogV2MapInput interface {
	pulumi.Input

	ToCatalogV2MapOutput() CatalogV2MapOutput
	ToCatalogV2MapOutputWithContext(context.Context) CatalogV2MapOutput
}

type CatalogV2Map map[string]CatalogV2Input

func (CatalogV2Map) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*CatalogV2)(nil))
}

func (i CatalogV2Map) ToCatalogV2MapOutput() CatalogV2MapOutput {
	return i.ToCatalogV2MapOutputWithContext(context.Background())
}

func (i CatalogV2Map) ToCatalogV2MapOutputWithContext(ctx context.Context) CatalogV2MapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogV2MapOutput)
}

type CatalogV2Output struct {
	*pulumi.OutputState
}

func (CatalogV2Output) ElementType() reflect.Type {
	return reflect.TypeOf((*CatalogV2)(nil))
}

func (o CatalogV2Output) ToCatalogV2Output() CatalogV2Output {
	return o
}

func (o CatalogV2Output) ToCatalogV2OutputWithContext(ctx context.Context) CatalogV2Output {
	return o
}

func (o CatalogV2Output) ToCatalogV2PtrOutput() CatalogV2PtrOutput {
	return o.ToCatalogV2PtrOutputWithContext(context.Background())
}

func (o CatalogV2Output) ToCatalogV2PtrOutputWithContext(ctx context.Context) CatalogV2PtrOutput {
	return o.ApplyT(func(v CatalogV2) *CatalogV2 {
		return &v
	}).(CatalogV2PtrOutput)
}

type CatalogV2PtrOutput struct {
	*pulumi.OutputState
}

func (CatalogV2PtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CatalogV2)(nil))
}

func (o CatalogV2PtrOutput) ToCatalogV2PtrOutput() CatalogV2PtrOutput {
	return o
}

func (o CatalogV2PtrOutput) ToCatalogV2PtrOutputWithContext(ctx context.Context) CatalogV2PtrOutput {
	return o
}

type CatalogV2ArrayOutput struct{ *pulumi.OutputState }

func (CatalogV2ArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]CatalogV2)(nil))
}

func (o CatalogV2ArrayOutput) ToCatalogV2ArrayOutput() CatalogV2ArrayOutput {
	return o
}

func (o CatalogV2ArrayOutput) ToCatalogV2ArrayOutputWithContext(ctx context.Context) CatalogV2ArrayOutput {
	return o
}

func (o CatalogV2ArrayOutput) Index(i pulumi.IntInput) CatalogV2Output {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) CatalogV2 {
		return vs[0].([]CatalogV2)[vs[1].(int)]
	}).(CatalogV2Output)
}

type CatalogV2MapOutput struct{ *pulumi.OutputState }

func (CatalogV2MapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]CatalogV2)(nil))
}

func (o CatalogV2MapOutput) ToCatalogV2MapOutput() CatalogV2MapOutput {
	return o
}

func (o CatalogV2MapOutput) ToCatalogV2MapOutputWithContext(ctx context.Context) CatalogV2MapOutput {
	return o
}

func (o CatalogV2MapOutput) MapIndex(k pulumi.StringInput) CatalogV2Output {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) CatalogV2 {
		return vs[0].(map[string]CatalogV2)[vs[1].(string)]
	}).(CatalogV2Output)
}

func init() {
	pulumi.RegisterOutputType(CatalogV2Output{})
	pulumi.RegisterOutputType(CatalogV2PtrOutput{})
	pulumi.RegisterOutputType(CatalogV2ArrayOutput{})
	pulumi.RegisterOutputType(CatalogV2MapOutput{})
}
