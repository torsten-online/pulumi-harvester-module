// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-rancher2/sdk/v5/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Rancher v2 Project resource. This can be used to create projects for Rancher v2 environments and retrieve their information.
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
//			_, err := rancher2.NewProject(ctx, "foo", &rancher2.ProjectArgs{
//				ClusterId: pulumi.String("<CLUSTER_ID>"),
//				ContainerResourceLimit: &rancher2.ProjectContainerResourceLimitArgs{
//					LimitsCpu:      pulumi.String("20m"),
//					LimitsMemory:   pulumi.String("20Mi"),
//					RequestsCpu:    pulumi.String("1m"),
//					RequestsMemory: pulumi.String("1Mi"),
//				},
//				ResourceQuota: &rancher2.ProjectResourceQuotaArgs{
//					NamespaceDefaultLimit: &rancher2.ProjectResourceQuotaNamespaceDefaultLimitArgs{
//						LimitsCpu:       pulumi.String("2000m"),
//						LimitsMemory:    pulumi.String("500Mi"),
//						RequestsStorage: pulumi.String("1Gi"),
//					},
//					ProjectLimit: &rancher2.ProjectResourceQuotaProjectLimitArgs{
//						LimitsCpu:       pulumi.String("2000m"),
//						LimitsMemory:    pulumi.String("2000Mi"),
//						RequestsStorage: pulumi.String("2Gi"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
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
//			_, err := rancher2.NewProject(ctx, "foo", &rancher2.ProjectArgs{
//				ClusterId: pulumi.String("<CLUSTER_ID>"),
//				ContainerResourceLimit: &rancher2.ProjectContainerResourceLimitArgs{
//					LimitsCpu:      pulumi.String("20m"),
//					LimitsMemory:   pulumi.String("20Mi"),
//					RequestsCpu:    pulumi.String("1m"),
//					RequestsMemory: pulumi.String("1Mi"),
//				},
//				EnableProjectMonitoring: pulumi.Bool(true),
//				ProjectMonitoringInput: &rancher2.ProjectProjectMonitoringInputArgs{
//					Answers: pulumi.Map{
//						"exporter-kubelets.https":                   pulumi.Any(true),
//						"exporter-node.enabled":                     pulumi.Any(true),
//						"exporter-node.ports.metrics.port":          pulumi.Any(9796),
//						"exporter-node.resources.limits.cpu":        pulumi.Any("200m"),
//						"exporter-node.resources.limits.memory":     pulumi.Any("200Mi"),
//						"grafana.persistence.enabled":               pulumi.Any(false),
//						"grafana.persistence.size":                  pulumi.Any("10Gi"),
//						"grafana.persistence.storageClass":          pulumi.Any("default"),
//						"operator.resources.limits.memory":          pulumi.Any("500Mi"),
//						"prometheus.persistence.enabled":            pulumi.Any("false"),
//						"prometheus.persistence.size":               pulumi.Any("50Gi"),
//						"prometheus.persistence.storageClass":       pulumi.Any("default"),
//						"prometheus.persistent.useReleaseName":      pulumi.Any("true"),
//						"prometheus.resources.core.limits.cpu":      pulumi.Any("1000m"),
//						"prometheus.resources.core.limits.memory":   pulumi.Any("1500Mi"),
//						"prometheus.resources.core.requests.cpu":    pulumi.Any("750m"),
//						"prometheus.resources.core.requests.memory": pulumi.Any("750Mi"),
//						"prometheus.retention":                      pulumi.Any("12h"),
//					},
//				},
//				ResourceQuota: &rancher2.ProjectResourceQuotaArgs{
//					NamespaceDefaultLimit: &rancher2.ProjectResourceQuotaNamespaceDefaultLimitArgs{
//						LimitsCpu:       pulumi.String("2000m"),
//						LimitsMemory:    pulumi.String("500Mi"),
//						RequestsStorage: pulumi.String("1Gi"),
//					},
//					ProjectLimit: &rancher2.ProjectResourceQuotaProjectLimitArgs{
//						LimitsCpu:       pulumi.String("2000m"),
//						LimitsMemory:    pulumi.String("2000Mi"),
//						RequestsStorage: pulumi.String("2Gi"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// # Projects can be imported using the Rancher Project ID
//
// ```sh
//
//	$ pulumi import rancher2:index/project:Project foo &lt;project_id&gt;
//
// ```
type Project struct {
	pulumi.CustomResourceState

	// Annotations for Node Pool object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The cluster id where create project (string)
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// Default containers resource limits on project (List maxitem:1)
	ContainerResourceLimit ProjectContainerResourceLimitPtrOutput `pulumi:"containerResourceLimit"`
	// A project description (string)
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Enable built-in project monitoring. Default `false` (bool)
	EnableProjectMonitoring pulumi.BoolPtrOutput `pulumi:"enableProjectMonitoring"`
	// Labels for Node Pool object (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the project (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Default Pod Security Policy ID for the project (string)
	PodSecurityPolicyTemplateId pulumi.StringPtrOutput `pulumi:"podSecurityPolicyTemplateId"`
	// Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
	ProjectMonitoringInput ProjectProjectMonitoringInputPtrOutput `pulumi:"projectMonitoringInput"`
	// Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
	ResourceQuota ProjectResourceQuotaPtrOutput `pulumi:"resourceQuota"`
	// Wait for cluster becomes active. Default `false` (bool)
	WaitForCluster pulumi.BoolPtrOutput `pulumi:"waitForCluster"`
}

// NewProject registers a new resource with the given unique name, arguments, and options.
func NewProject(ctx *pulumi.Context,
	name string, args *ProjectArgs, opts ...pulumi.ResourceOption) (*Project, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Project
	err := ctx.RegisterResource("rancher2:index/project:Project", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProject gets an existing Project resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectState, opts ...pulumi.ResourceOption) (*Project, error) {
	var resource Project
	err := ctx.ReadResource("rancher2:index/project:Project", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Project resources.
type projectState struct {
	// Annotations for Node Pool object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id where create project (string)
	ClusterId *string `pulumi:"clusterId"`
	// Default containers resource limits on project (List maxitem:1)
	ContainerResourceLimit *ProjectContainerResourceLimit `pulumi:"containerResourceLimit"`
	// A project description (string)
	Description *string `pulumi:"description"`
	// Enable built-in project monitoring. Default `false` (bool)
	EnableProjectMonitoring *bool `pulumi:"enableProjectMonitoring"`
	// Labels for Node Pool object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the project (string)
	Name *string `pulumi:"name"`
	// Default Pod Security Policy ID for the project (string)
	PodSecurityPolicyTemplateId *string `pulumi:"podSecurityPolicyTemplateId"`
	// Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
	ProjectMonitoringInput *ProjectProjectMonitoringInput `pulumi:"projectMonitoringInput"`
	// Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
	ResourceQuota *ProjectResourceQuota `pulumi:"resourceQuota"`
	// Wait for cluster becomes active. Default `false` (bool)
	WaitForCluster *bool `pulumi:"waitForCluster"`
}

type ProjectState struct {
	// Annotations for Node Pool object (map)
	Annotations pulumi.MapInput
	// The cluster id where create project (string)
	ClusterId pulumi.StringPtrInput
	// Default containers resource limits on project (List maxitem:1)
	ContainerResourceLimit ProjectContainerResourceLimitPtrInput
	// A project description (string)
	Description pulumi.StringPtrInput
	// Enable built-in project monitoring. Default `false` (bool)
	EnableProjectMonitoring pulumi.BoolPtrInput
	// Labels for Node Pool object (map)
	Labels pulumi.MapInput
	// The name of the project (string)
	Name pulumi.StringPtrInput
	// Default Pod Security Policy ID for the project (string)
	PodSecurityPolicyTemplateId pulumi.StringPtrInput
	// Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
	ProjectMonitoringInput ProjectProjectMonitoringInputPtrInput
	// Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
	ResourceQuota ProjectResourceQuotaPtrInput
	// Wait for cluster becomes active. Default `false` (bool)
	WaitForCluster pulumi.BoolPtrInput
}

func (ProjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectState)(nil)).Elem()
}

type projectArgs struct {
	// Annotations for Node Pool object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id where create project (string)
	ClusterId string `pulumi:"clusterId"`
	// Default containers resource limits on project (List maxitem:1)
	ContainerResourceLimit *ProjectContainerResourceLimit `pulumi:"containerResourceLimit"`
	// A project description (string)
	Description *string `pulumi:"description"`
	// Enable built-in project monitoring. Default `false` (bool)
	EnableProjectMonitoring *bool `pulumi:"enableProjectMonitoring"`
	// Labels for Node Pool object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the project (string)
	Name *string `pulumi:"name"`
	// Default Pod Security Policy ID for the project (string)
	PodSecurityPolicyTemplateId *string `pulumi:"podSecurityPolicyTemplateId"`
	// Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
	ProjectMonitoringInput *ProjectProjectMonitoringInput `pulumi:"projectMonitoringInput"`
	// Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
	ResourceQuota *ProjectResourceQuota `pulumi:"resourceQuota"`
	// Wait for cluster becomes active. Default `false` (bool)
	WaitForCluster *bool `pulumi:"waitForCluster"`
}

// The set of arguments for constructing a Project resource.
type ProjectArgs struct {
	// Annotations for Node Pool object (map)
	Annotations pulumi.MapInput
	// The cluster id where create project (string)
	ClusterId pulumi.StringInput
	// Default containers resource limits on project (List maxitem:1)
	ContainerResourceLimit ProjectContainerResourceLimitPtrInput
	// A project description (string)
	Description pulumi.StringPtrInput
	// Enable built-in project monitoring. Default `false` (bool)
	EnableProjectMonitoring pulumi.BoolPtrInput
	// Labels for Node Pool object (map)
	Labels pulumi.MapInput
	// The name of the project (string)
	Name pulumi.StringPtrInput
	// Default Pod Security Policy ID for the project (string)
	PodSecurityPolicyTemplateId pulumi.StringPtrInput
	// Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
	ProjectMonitoringInput ProjectProjectMonitoringInputPtrInput
	// Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
	ResourceQuota ProjectResourceQuotaPtrInput
	// Wait for cluster becomes active. Default `false` (bool)
	WaitForCluster pulumi.BoolPtrInput
}

func (ProjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectArgs)(nil)).Elem()
}

type ProjectInput interface {
	pulumi.Input

	ToProjectOutput() ProjectOutput
	ToProjectOutputWithContext(ctx context.Context) ProjectOutput
}

func (*Project) ElementType() reflect.Type {
	return reflect.TypeOf((**Project)(nil)).Elem()
}

func (i *Project) ToProjectOutput() ProjectOutput {
	return i.ToProjectOutputWithContext(context.Background())
}

func (i *Project) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectOutput)
}

func (i *Project) ToOutput(ctx context.Context) pulumix.Output[*Project] {
	return pulumix.Output[*Project]{
		OutputState: i.ToProjectOutputWithContext(ctx).OutputState,
	}
}

// ProjectArrayInput is an input type that accepts ProjectArray and ProjectArrayOutput values.
// You can construct a concrete instance of `ProjectArrayInput` via:
//
//	ProjectArray{ ProjectArgs{...} }
type ProjectArrayInput interface {
	pulumi.Input

	ToProjectArrayOutput() ProjectArrayOutput
	ToProjectArrayOutputWithContext(context.Context) ProjectArrayOutput
}

type ProjectArray []ProjectInput

func (ProjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Project)(nil)).Elem()
}

func (i ProjectArray) ToProjectArrayOutput() ProjectArrayOutput {
	return i.ToProjectArrayOutputWithContext(context.Background())
}

func (i ProjectArray) ToProjectArrayOutputWithContext(ctx context.Context) ProjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectArrayOutput)
}

func (i ProjectArray) ToOutput(ctx context.Context) pulumix.Output[[]*Project] {
	return pulumix.Output[[]*Project]{
		OutputState: i.ToProjectArrayOutputWithContext(ctx).OutputState,
	}
}

// ProjectMapInput is an input type that accepts ProjectMap and ProjectMapOutput values.
// You can construct a concrete instance of `ProjectMapInput` via:
//
//	ProjectMap{ "key": ProjectArgs{...} }
type ProjectMapInput interface {
	pulumi.Input

	ToProjectMapOutput() ProjectMapOutput
	ToProjectMapOutputWithContext(context.Context) ProjectMapOutput
}

type ProjectMap map[string]ProjectInput

func (ProjectMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Project)(nil)).Elem()
}

func (i ProjectMap) ToProjectMapOutput() ProjectMapOutput {
	return i.ToProjectMapOutputWithContext(context.Background())
}

func (i ProjectMap) ToProjectMapOutputWithContext(ctx context.Context) ProjectMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectMapOutput)
}

func (i ProjectMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Project] {
	return pulumix.Output[map[string]*Project]{
		OutputState: i.ToProjectMapOutputWithContext(ctx).OutputState,
	}
}

type ProjectOutput struct{ *pulumi.OutputState }

func (ProjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Project)(nil)).Elem()
}

func (o ProjectOutput) ToProjectOutput() ProjectOutput {
	return o
}

func (o ProjectOutput) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return o
}

func (o ProjectOutput) ToOutput(ctx context.Context) pulumix.Output[*Project] {
	return pulumix.Output[*Project]{
		OutputState: o.OutputState,
	}
}

// Annotations for Node Pool object (map)
func (o ProjectOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *Project) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// The cluster id where create project (string)
func (o ProjectOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// Default containers resource limits on project (List maxitem:1)
func (o ProjectOutput) ContainerResourceLimit() ProjectContainerResourceLimitPtrOutput {
	return o.ApplyT(func(v *Project) ProjectContainerResourceLimitPtrOutput { return v.ContainerResourceLimit }).(ProjectContainerResourceLimitPtrOutput)
}

// A project description (string)
func (o ProjectOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Project) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Enable built-in project monitoring. Default `false` (bool)
func (o ProjectOutput) EnableProjectMonitoring() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Project) pulumi.BoolPtrOutput { return v.EnableProjectMonitoring }).(pulumi.BoolPtrOutput)
}

// Labels for Node Pool object (map)
func (o ProjectOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *Project) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// The name of the project (string)
func (o ProjectOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Default Pod Security Policy ID for the project (string)
func (o ProjectOutput) PodSecurityPolicyTemplateId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Project) pulumi.StringPtrOutput { return v.PodSecurityPolicyTemplateId }).(pulumi.StringPtrOutput)
}

// Project monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured (list maxitems:1)
func (o ProjectOutput) ProjectMonitoringInput() ProjectProjectMonitoringInputPtrOutput {
	return o.ApplyT(func(v *Project) ProjectProjectMonitoringInputPtrOutput { return v.ProjectMonitoringInput }).(ProjectProjectMonitoringInputPtrOutput)
}

// Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
func (o ProjectOutput) ResourceQuota() ProjectResourceQuotaPtrOutput {
	return o.ApplyT(func(v *Project) ProjectResourceQuotaPtrOutput { return v.ResourceQuota }).(ProjectResourceQuotaPtrOutput)
}

// Wait for cluster becomes active. Default `false` (bool)
func (o ProjectOutput) WaitForCluster() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Project) pulumi.BoolPtrOutput { return v.WaitForCluster }).(pulumi.BoolPtrOutput)
}

type ProjectArrayOutput struct{ *pulumi.OutputState }

func (ProjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Project)(nil)).Elem()
}

func (o ProjectArrayOutput) ToProjectArrayOutput() ProjectArrayOutput {
	return o
}

func (o ProjectArrayOutput) ToProjectArrayOutputWithContext(ctx context.Context) ProjectArrayOutput {
	return o
}

func (o ProjectArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Project] {
	return pulumix.Output[[]*Project]{
		OutputState: o.OutputState,
	}
}

func (o ProjectArrayOutput) Index(i pulumi.IntInput) ProjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Project {
		return vs[0].([]*Project)[vs[1].(int)]
	}).(ProjectOutput)
}

type ProjectMapOutput struct{ *pulumi.OutputState }

func (ProjectMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Project)(nil)).Elem()
}

func (o ProjectMapOutput) ToProjectMapOutput() ProjectMapOutput {
	return o
}

func (o ProjectMapOutput) ToProjectMapOutputWithContext(ctx context.Context) ProjectMapOutput {
	return o
}

func (o ProjectMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Project] {
	return pulumix.Output[map[string]*Project]{
		OutputState: o.OutputState,
	}
}

func (o ProjectMapOutput) MapIndex(k pulumi.StringInput) ProjectOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Project {
		return vs[0].(map[string]*Project)[vs[1].(string)]
	}).(ProjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectInput)(nil)).Elem(), &Project{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectArrayInput)(nil)).Elem(), ProjectArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectMapInput)(nil)).Elem(), ProjectMap{})
	pulumi.RegisterOutputType(ProjectOutput{})
	pulumi.RegisterOutputType(ProjectArrayOutput{})
	pulumi.RegisterOutputType(ProjectMapOutput{})
}
