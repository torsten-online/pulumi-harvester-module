// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Rancher App v2 resource. This can be used to manage helm charts for Rancher v2 environments and retrieve their information. App v2 resource is available at Rancher v2.5.x and above.
//
// ## Import
//
// V2 apps can be imported using the Rancher cluster ID and App V2 name.
//
// ```sh
//  $ pulumi import rancher2:index/appV2:AppV2 foo &lt;CLUSTER_ID&gt;.&lt;APP_V2_NAME&gt;
// ```
type AppV2 struct {
	pulumi.CustomResourceState

	// Annotations for the app v2 (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The app v2 chart name (string)
	ChartName pulumi.StringOutput `pulumi:"chartName"`
	// The app v2 chart version (string)
	ChartVersion pulumi.StringPtrOutput `pulumi:"chartVersion"`
	// Cleanup app v2 on failed chart upgrade. Default: `false` (bool)
	CleanupOnFail pulumi.BoolPtrOutput `pulumi:"cleanupOnFail"`
	// The cluster id of the app (string)
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// (Computed) The cluster name of the app (string)
	ClusterName pulumi.StringOutput `pulumi:"clusterName"`
	// Disable app v2 chart hooks. Default: `false` (bool)
	DisableHooks pulumi.BoolPtrOutput `pulumi:"disableHooks"`
	// Disable app V2 Open API Validation. Default: `false` (bool)
	DisableOpenApiValidation pulumi.BoolPtrOutput `pulumi:"disableOpenApiValidation"`
	// Force app V2 chart upgrade. Default: `false` (bool)
	ForceUpgrade pulumi.BoolPtrOutput `pulumi:"forceUpgrade"`
	// Labels for the app v2 (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the app v2 (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The namespace of the app v2 (string)
	Namespace pulumi.StringOutput `pulumi:"namespace"`
	// Deploy the app v2 within project ID (string)
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Repo name (string)
	RepoName pulumi.StringOutput `pulumi:"repoName"`
	// The app v2 values yaml. Yaml format is required (string)
	Values pulumi.StringPtrOutput `pulumi:"values"`
	// Wait until app is deployed. Default: `false` (bool)
	Wait pulumi.BoolPtrOutput `pulumi:"wait"`
}

// NewAppV2 registers a new resource with the given unique name, arguments, and options.
func NewAppV2(ctx *pulumi.Context,
	name string, args *AppV2Args, opts ...pulumi.ResourceOption) (*AppV2, error) {
	if args == nil || args.ChartName == nil {
		return nil, errors.New("missing required argument 'ChartName'")
	}
	if args == nil || args.ClusterId == nil {
		return nil, errors.New("missing required argument 'ClusterId'")
	}
	if args == nil || args.Namespace == nil {
		return nil, errors.New("missing required argument 'Namespace'")
	}
	if args == nil || args.RepoName == nil {
		return nil, errors.New("missing required argument 'RepoName'")
	}
	if args == nil {
		args = &AppV2Args{}
	}
	var resource AppV2
	err := ctx.RegisterResource("rancher2:index/appV2:AppV2", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAppV2 gets an existing AppV2 resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAppV2(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppV2State, opts ...pulumi.ResourceOption) (*AppV2, error) {
	var resource AppV2
	err := ctx.ReadResource("rancher2:index/appV2:AppV2", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AppV2 resources.
type appV2State struct {
	// Annotations for the app v2 (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The app v2 chart name (string)
	ChartName *string `pulumi:"chartName"`
	// The app v2 chart version (string)
	ChartVersion *string `pulumi:"chartVersion"`
	// Cleanup app v2 on failed chart upgrade. Default: `false` (bool)
	CleanupOnFail *bool `pulumi:"cleanupOnFail"`
	// The cluster id of the app (string)
	ClusterId *string `pulumi:"clusterId"`
	// (Computed) The cluster name of the app (string)
	ClusterName *string `pulumi:"clusterName"`
	// Disable app v2 chart hooks. Default: `false` (bool)
	DisableHooks *bool `pulumi:"disableHooks"`
	// Disable app V2 Open API Validation. Default: `false` (bool)
	DisableOpenApiValidation *bool `pulumi:"disableOpenApiValidation"`
	// Force app V2 chart upgrade. Default: `false` (bool)
	ForceUpgrade *bool `pulumi:"forceUpgrade"`
	// Labels for the app v2 (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the app v2 (string)
	Name *string `pulumi:"name"`
	// The namespace of the app v2 (string)
	Namespace *string `pulumi:"namespace"`
	// Deploy the app v2 within project ID (string)
	ProjectId *string `pulumi:"projectId"`
	// Repo name (string)
	RepoName *string `pulumi:"repoName"`
	// The app v2 values yaml. Yaml format is required (string)
	Values *string `pulumi:"values"`
	// Wait until app is deployed. Default: `false` (bool)
	Wait *bool `pulumi:"wait"`
}

type AppV2State struct {
	// Annotations for the app v2 (map)
	Annotations pulumi.MapInput
	// The app v2 chart name (string)
	ChartName pulumi.StringPtrInput
	// The app v2 chart version (string)
	ChartVersion pulumi.StringPtrInput
	// Cleanup app v2 on failed chart upgrade. Default: `false` (bool)
	CleanupOnFail pulumi.BoolPtrInput
	// The cluster id of the app (string)
	ClusterId pulumi.StringPtrInput
	// (Computed) The cluster name of the app (string)
	ClusterName pulumi.StringPtrInput
	// Disable app v2 chart hooks. Default: `false` (bool)
	DisableHooks pulumi.BoolPtrInput
	// Disable app V2 Open API Validation. Default: `false` (bool)
	DisableOpenApiValidation pulumi.BoolPtrInput
	// Force app V2 chart upgrade. Default: `false` (bool)
	ForceUpgrade pulumi.BoolPtrInput
	// Labels for the app v2 (map)
	Labels pulumi.MapInput
	// The name of the app v2 (string)
	Name pulumi.StringPtrInput
	// The namespace of the app v2 (string)
	Namespace pulumi.StringPtrInput
	// Deploy the app v2 within project ID (string)
	ProjectId pulumi.StringPtrInput
	// Repo name (string)
	RepoName pulumi.StringPtrInput
	// The app v2 values yaml. Yaml format is required (string)
	Values pulumi.StringPtrInput
	// Wait until app is deployed. Default: `false` (bool)
	Wait pulumi.BoolPtrInput
}

func (AppV2State) ElementType() reflect.Type {
	return reflect.TypeOf((*appV2State)(nil)).Elem()
}

type appV2Args struct {
	// Annotations for the app v2 (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The app v2 chart name (string)
	ChartName string `pulumi:"chartName"`
	// The app v2 chart version (string)
	ChartVersion *string `pulumi:"chartVersion"`
	// Cleanup app v2 on failed chart upgrade. Default: `false` (bool)
	CleanupOnFail *bool `pulumi:"cleanupOnFail"`
	// The cluster id of the app (string)
	ClusterId string `pulumi:"clusterId"`
	// Disable app v2 chart hooks. Default: `false` (bool)
	DisableHooks *bool `pulumi:"disableHooks"`
	// Disable app V2 Open API Validation. Default: `false` (bool)
	DisableOpenApiValidation *bool `pulumi:"disableOpenApiValidation"`
	// Force app V2 chart upgrade. Default: `false` (bool)
	ForceUpgrade *bool `pulumi:"forceUpgrade"`
	// Labels for the app v2 (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the app v2 (string)
	Name *string `pulumi:"name"`
	// The namespace of the app v2 (string)
	Namespace string `pulumi:"namespace"`
	// Deploy the app v2 within project ID (string)
	ProjectId *string `pulumi:"projectId"`
	// Repo name (string)
	RepoName string `pulumi:"repoName"`
	// The app v2 values yaml. Yaml format is required (string)
	Values *string `pulumi:"values"`
	// Wait until app is deployed. Default: `false` (bool)
	Wait *bool `pulumi:"wait"`
}

// The set of arguments for constructing a AppV2 resource.
type AppV2Args struct {
	// Annotations for the app v2 (map)
	Annotations pulumi.MapInput
	// The app v2 chart name (string)
	ChartName pulumi.StringInput
	// The app v2 chart version (string)
	ChartVersion pulumi.StringPtrInput
	// Cleanup app v2 on failed chart upgrade. Default: `false` (bool)
	CleanupOnFail pulumi.BoolPtrInput
	// The cluster id of the app (string)
	ClusterId pulumi.StringInput
	// Disable app v2 chart hooks. Default: `false` (bool)
	DisableHooks pulumi.BoolPtrInput
	// Disable app V2 Open API Validation. Default: `false` (bool)
	DisableOpenApiValidation pulumi.BoolPtrInput
	// Force app V2 chart upgrade. Default: `false` (bool)
	ForceUpgrade pulumi.BoolPtrInput
	// Labels for the app v2 (map)
	Labels pulumi.MapInput
	// The name of the app v2 (string)
	Name pulumi.StringPtrInput
	// The namespace of the app v2 (string)
	Namespace pulumi.StringInput
	// Deploy the app v2 within project ID (string)
	ProjectId pulumi.StringPtrInput
	// Repo name (string)
	RepoName pulumi.StringInput
	// The app v2 values yaml. Yaml format is required (string)
	Values pulumi.StringPtrInput
	// Wait until app is deployed. Default: `false` (bool)
	Wait pulumi.BoolPtrInput
}

func (AppV2Args) ElementType() reflect.Type {
	return reflect.TypeOf((*appV2Args)(nil)).Elem()
}

type AppV2Input interface {
	pulumi.Input

	ToAppV2Output() AppV2Output
	ToAppV2OutputWithContext(ctx context.Context) AppV2Output
}

func (AppV2) ElementType() reflect.Type {
	return reflect.TypeOf((*AppV2)(nil)).Elem()
}

func (i AppV2) ToAppV2Output() AppV2Output {
	return i.ToAppV2OutputWithContext(context.Background())
}

func (i AppV2) ToAppV2OutputWithContext(ctx context.Context) AppV2Output {
	return pulumi.ToOutputWithContext(ctx, i).(AppV2Output)
}

type AppV2Output struct {
	*pulumi.OutputState
}

func (AppV2Output) ElementType() reflect.Type {
	return reflect.TypeOf((*AppV2Output)(nil)).Elem()
}

func (o AppV2Output) ToAppV2Output() AppV2Output {
	return o
}

func (o AppV2Output) ToAppV2OutputWithContext(ctx context.Context) AppV2Output {
	return o
}

func init() {
	pulumi.RegisterOutputType(AppV2Output{})
}
