// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Rancher v2 Project resource. This can be used to create projects for Rancher v2 environments and retrieve their information.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-rancher2/sdk/v2/go/rancher2"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := rancher2.NewProject(ctx, "foo", &rancher2.ProjectArgs{
// 			ClusterId: pulumi.String("<CLUSTER_ID>"),
// 			ContainerResourceLimit: &rancher2.ProjectContainerResourceLimitArgs{
// 				LimitsCpu:      pulumi.String("20m"),
// 				LimitsMemory:   pulumi.String("20Mi"),
// 				RequestsCpu:    pulumi.String("1m"),
// 				RequestsMemory: pulumi.String("1Mi"),
// 			},
// 			ResourceQuota: &rancher2.ProjectResourceQuotaArgs{
// 				NamespaceDefaultLimit: &rancher2.ProjectResourceQuotaNamespaceDefaultLimitArgs{
// 					LimitsCpu:       pulumi.String("2000m"),
// 					LimitsMemory:    pulumi.String("500Mi"),
// 					RequestsStorage: pulumi.String("1Gi"),
// 				},
// 				ProjectLimit: &rancher2.ProjectResourceQuotaProjectLimitArgs{
// 					LimitsCpu:       pulumi.String("2000m"),
// 					LimitsMemory:    pulumi.String("2000Mi"),
// 					RequestsStorage: pulumi.String("2Gi"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-rancher2/sdk/v2/go/rancher2"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := rancher2.NewProject(ctx, "foo", &rancher2.ProjectArgs{
// 			ClusterId: pulumi.String("<CLUSTER_ID>"),
// 			ContainerResourceLimit: &rancher2.ProjectContainerResourceLimitArgs{
// 				LimitsCpu:      pulumi.String("20m"),
// 				LimitsMemory:   pulumi.String("20Mi"),
// 				RequestsCpu:    pulumi.String("1m"),
// 				RequestsMemory: pulumi.String("1Mi"),
// 			},
// 			EnableProjectMonitoring: pulumi.Bool(true),
// 			ProjectMonitoringInput: &rancher2.ProjectProjectMonitoringInputArgs{
// 				Answers: pulumi.Map{
// 					"exporter-kubelets.https":                   pulumi.Bool(true),
// 					"exporter-node.enabled":                     pulumi.Bool(true),
// 					"exporter-node.ports.metrics.port":          pulumi.Float64(9796),
// 					"exporter-node.resources.limits.cpu":        pulumi.String("200m"),
// 					"exporter-node.resources.limits.memory":     pulumi.String("200Mi"),
// 					"grafana.persistence.enabled":               pulumi.Bool(false),
// 					"grafana.persistence.size":                  pulumi.String("10Gi"),
// 					"grafana.persistence.storageClass":          pulumi.String("default"),
// 					"operator.resources.limits.memory":          pulumi.String("500Mi"),
// 					"prometheus.persistence.enabled":            pulumi.String("false"),
// 					"prometheus.persistence.size":               pulumi.String("50Gi"),
// 					"prometheus.persistence.storageClass":       pulumi.String("default"),
// 					"prometheus.persistent.useReleaseName":      pulumi.String("true"),
// 					"prometheus.resources.core.limits.cpu":      pulumi.String("1000m"),
// 					"prometheus.resources.core.limits.memory":   pulumi.String("1500Mi"),
// 					"prometheus.resources.core.requests.cpu":    pulumi.String("750m"),
// 					"prometheus.resources.core.requests.memory": pulumi.String("750Mi"),
// 					"prometheus.retention":                      pulumi.String("12h"),
// 				},
// 			},
// 			ResourceQuota: &rancher2.ProjectResourceQuotaArgs{
// 				NamespaceDefaultLimit: &rancher2.ProjectResourceQuotaNamespaceDefaultLimitArgs{
// 					LimitsCpu:       pulumi.String("2000m"),
// 					LimitsMemory:    pulumi.String("500Mi"),
// 					RequestsStorage: pulumi.String("1Gi"),
// 				},
// 				ProjectLimit: &rancher2.ProjectResourceQuotaProjectLimitArgs{
// 					LimitsCpu:       pulumi.String("2000m"),
// 					LimitsMemory:    pulumi.String("2000Mi"),
// 					RequestsStorage: pulumi.String("2Gi"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Projects can be imported using the Rancher Project ID
//
// ```sh
//  $ pulumi import rancher2:index/project:Project foo &lt;project_id&gt;
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
	if args == nil || args.ClusterId == nil {
		return nil, errors.New("missing required argument 'ClusterId'")
	}
	if args == nil {
		args = &ProjectArgs{}
	}
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

func (Project) ElementType() reflect.Type {
	return reflect.TypeOf((*Project)(nil)).Elem()
}

func (i Project) ToProjectOutput() ProjectOutput {
	return i.ToProjectOutputWithContext(context.Background())
}

func (i Project) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectOutput)
}

type ProjectOutput struct {
	*pulumi.OutputState
}

func (ProjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProjectOutput)(nil)).Elem()
}

func (o ProjectOutput) ToProjectOutput() ProjectOutput {
	return o
}

func (o ProjectOutput) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ProjectOutput{})
}
