// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Machine config v2 resource. This can be used to create Machine Config v2 for Rancher v2 and retrieve their information. This resource is available from Rancher v2.6.0 and above.
//
// `amazonec2`, `azure`, `digitalocean`, `linode`, `openstack`, and `vsphere` cloud providers are supported for machine config V2
//
// **Note** This resource is used by
//
// ## Example Usage
// ### Using the Harvester Node Driver
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v4/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			foo_harvesterClusterV2, err := rancher2.LookupClusterV2(ctx, &rancher2.LookupClusterV2Args{
//				Name: "foo-harvester",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = rancher2.NewCloudCredential(ctx, "foo-harvesterCloudCredential", &rancher2.CloudCredentialArgs{
//				HarvesterCredentialConfig: &rancher2.CloudCredentialHarvesterCredentialConfigArgs{
//					ClusterId:         *pulumi.String(foo_harvesterClusterV2.ClusterV1Id),
//					ClusterType:       pulumi.String("imported"),
//					KubeconfigContent: *pulumi.String(foo_harvesterClusterV2.KubeConfig),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = rancher2.NewMachineConfigV2(ctx, "foo-harvester-v2", &rancher2.MachineConfigV2Args{
//				GenerateName: pulumi.String("foo-harvester-v2"),
//				HarvesterConfig: &rancher2.MachineConfigV2HarvesterConfigArgs{
//					VmNamespace: pulumi.String("default"),
//					CpuCount:    pulumi.String("2"),
//					MemorySize:  pulumi.String("4"),
//					DiskSize:    pulumi.String("40"),
//					NetworkName: pulumi.String("harvester-public/vlan1"),
//					ImageName:   pulumi.String("harvester-public/image-57hzg"),
//					SshUser:     pulumi.String("ubuntu"),
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
type MachineConfigV2 struct {
	pulumi.CustomResourceState

	// AWS config for the Machine Config V2. Conflicts with `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	Amazonec2Config MachineConfigV2Amazonec2ConfigPtrOutput `pulumi:"amazonec2Config"`
	// Annotations for Machine Config V2 object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// Azure config for the Machine Config V2. Conflicts with `amazonec2Config`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	AzureConfig MachineConfigV2AzureConfigPtrOutput `pulumi:"azureConfig"`
	// Digitalocean config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	DigitaloceanConfig MachineConfigV2DigitaloceanConfigPtrOutput `pulumi:"digitaloceanConfig"`
	// Cluster V2 fleet namespace
	FleetNamespace pulumi.StringPtrOutput `pulumi:"fleetNamespace"`
	// Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\"prod-pool1\" will generate \"nc-prod-pool1-?????\" name computed at `name` attribute (string)
	GenerateName pulumi.StringOutput `pulumi:"generateName"`
	// Harvester config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	HarvesterConfig MachineConfigV2HarvesterConfigPtrOutput `pulumi:"harvesterConfig"`
	// (Computed) The machine config kind (string)
	Kind pulumi.StringOutput `pulumi:"kind"`
	// Labels for Machine Config V2 object (map)
	//
	// **Note** `labels` and `nodeTaints` will be applied to nodes deployed using the Machine Config V2
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Linode config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	LinodeConfig MachineConfigV2LinodeConfigPtrOutput `pulumi:"linodeConfig"`
	// (Computed) The machine config name (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Openstack config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig` and `vsphereConfig` (list maxitems:1)
	OpenstackConfig MachineConfigV2OpenstackConfigPtrOutput `pulumi:"openstackConfig"`
	// (Computed) The machine config k8s resource version (string)
	ResourceVersion pulumi.StringOutput `pulumi:"resourceVersion"`
	// vSphere config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig` and `openstackConfig` (list maxitems:1)
	VsphereConfig MachineConfigV2VsphereConfigPtrOutput `pulumi:"vsphereConfig"`
}

// NewMachineConfigV2 registers a new resource with the given unique name, arguments, and options.
func NewMachineConfigV2(ctx *pulumi.Context,
	name string, args *MachineConfigV2Args, opts ...pulumi.ResourceOption) (*MachineConfigV2, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GenerateName == nil {
		return nil, errors.New("invalid value for required argument 'GenerateName'")
	}
	var resource MachineConfigV2
	err := ctx.RegisterResource("rancher2:index/machineConfigV2:MachineConfigV2", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMachineConfigV2 gets an existing MachineConfigV2 resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMachineConfigV2(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MachineConfigV2State, opts ...pulumi.ResourceOption) (*MachineConfigV2, error) {
	var resource MachineConfigV2
	err := ctx.ReadResource("rancher2:index/machineConfigV2:MachineConfigV2", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MachineConfigV2 resources.
type machineConfigV2State struct {
	// AWS config for the Machine Config V2. Conflicts with `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	Amazonec2Config *MachineConfigV2Amazonec2Config `pulumi:"amazonec2Config"`
	// Annotations for Machine Config V2 object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Azure config for the Machine Config V2. Conflicts with `amazonec2Config`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	AzureConfig *MachineConfigV2AzureConfig `pulumi:"azureConfig"`
	// Digitalocean config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	DigitaloceanConfig *MachineConfigV2DigitaloceanConfig `pulumi:"digitaloceanConfig"`
	// Cluster V2 fleet namespace
	FleetNamespace *string `pulumi:"fleetNamespace"`
	// Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\"prod-pool1\" will generate \"nc-prod-pool1-?????\" name computed at `name` attribute (string)
	GenerateName *string `pulumi:"generateName"`
	// Harvester config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	HarvesterConfig *MachineConfigV2HarvesterConfig `pulumi:"harvesterConfig"`
	// (Computed) The machine config kind (string)
	Kind *string `pulumi:"kind"`
	// Labels for Machine Config V2 object (map)
	//
	// **Note** `labels` and `nodeTaints` will be applied to nodes deployed using the Machine Config V2
	Labels map[string]interface{} `pulumi:"labels"`
	// Linode config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	LinodeConfig *MachineConfigV2LinodeConfig `pulumi:"linodeConfig"`
	// (Computed) The machine config name (string)
	Name *string `pulumi:"name"`
	// Openstack config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig` and `vsphereConfig` (list maxitems:1)
	OpenstackConfig *MachineConfigV2OpenstackConfig `pulumi:"openstackConfig"`
	// (Computed) The machine config k8s resource version (string)
	ResourceVersion *string `pulumi:"resourceVersion"`
	// vSphere config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig` and `openstackConfig` (list maxitems:1)
	VsphereConfig *MachineConfigV2VsphereConfig `pulumi:"vsphereConfig"`
}

type MachineConfigV2State struct {
	// AWS config for the Machine Config V2. Conflicts with `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	Amazonec2Config MachineConfigV2Amazonec2ConfigPtrInput
	// Annotations for Machine Config V2 object (map)
	Annotations pulumi.MapInput
	// Azure config for the Machine Config V2. Conflicts with `amazonec2Config`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	AzureConfig MachineConfigV2AzureConfigPtrInput
	// Digitalocean config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	DigitaloceanConfig MachineConfigV2DigitaloceanConfigPtrInput
	// Cluster V2 fleet namespace
	FleetNamespace pulumi.StringPtrInput
	// Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\"prod-pool1\" will generate \"nc-prod-pool1-?????\" name computed at `name` attribute (string)
	GenerateName pulumi.StringPtrInput
	// Harvester config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	HarvesterConfig MachineConfigV2HarvesterConfigPtrInput
	// (Computed) The machine config kind (string)
	Kind pulumi.StringPtrInput
	// Labels for Machine Config V2 object (map)
	//
	// **Note** `labels` and `nodeTaints` will be applied to nodes deployed using the Machine Config V2
	Labels pulumi.MapInput
	// Linode config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	LinodeConfig MachineConfigV2LinodeConfigPtrInput
	// (Computed) The machine config name (string)
	Name pulumi.StringPtrInput
	// Openstack config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig` and `vsphereConfig` (list maxitems:1)
	OpenstackConfig MachineConfigV2OpenstackConfigPtrInput
	// (Computed) The machine config k8s resource version (string)
	ResourceVersion pulumi.StringPtrInput
	// vSphere config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig` and `openstackConfig` (list maxitems:1)
	VsphereConfig MachineConfigV2VsphereConfigPtrInput
}

func (MachineConfigV2State) ElementType() reflect.Type {
	return reflect.TypeOf((*machineConfigV2State)(nil)).Elem()
}

type machineConfigV2Args struct {
	// AWS config for the Machine Config V2. Conflicts with `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	Amazonec2Config *MachineConfigV2Amazonec2Config `pulumi:"amazonec2Config"`
	// Annotations for Machine Config V2 object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Azure config for the Machine Config V2. Conflicts with `amazonec2Config`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	AzureConfig *MachineConfigV2AzureConfig `pulumi:"azureConfig"`
	// Digitalocean config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	DigitaloceanConfig *MachineConfigV2DigitaloceanConfig `pulumi:"digitaloceanConfig"`
	// Cluster V2 fleet namespace
	FleetNamespace *string `pulumi:"fleetNamespace"`
	// Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\"prod-pool1\" will generate \"nc-prod-pool1-?????\" name computed at `name` attribute (string)
	GenerateName string `pulumi:"generateName"`
	// Harvester config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	HarvesterConfig *MachineConfigV2HarvesterConfig `pulumi:"harvesterConfig"`
	// Labels for Machine Config V2 object (map)
	//
	// **Note** `labels` and `nodeTaints` will be applied to nodes deployed using the Machine Config V2
	Labels map[string]interface{} `pulumi:"labels"`
	// Linode config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	LinodeConfig *MachineConfigV2LinodeConfig `pulumi:"linodeConfig"`
	// Openstack config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig` and `vsphereConfig` (list maxitems:1)
	OpenstackConfig *MachineConfigV2OpenstackConfig `pulumi:"openstackConfig"`
	// vSphere config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig` and `openstackConfig` (list maxitems:1)
	VsphereConfig *MachineConfigV2VsphereConfig `pulumi:"vsphereConfig"`
}

// The set of arguments for constructing a MachineConfigV2 resource.
type MachineConfigV2Args struct {
	// AWS config for the Machine Config V2. Conflicts with `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	Amazonec2Config MachineConfigV2Amazonec2ConfigPtrInput
	// Annotations for Machine Config V2 object (map)
	Annotations pulumi.MapInput
	// Azure config for the Machine Config V2. Conflicts with `amazonec2Config`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	AzureConfig MachineConfigV2AzureConfigPtrInput
	// Digitalocean config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	DigitaloceanConfig MachineConfigV2DigitaloceanConfigPtrInput
	// Cluster V2 fleet namespace
	FleetNamespace pulumi.StringPtrInput
	// Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\"prod-pool1\" will generate \"nc-prod-pool1-?????\" name computed at `name` attribute (string)
	GenerateName pulumi.StringInput
	// Harvester config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	HarvesterConfig MachineConfigV2HarvesterConfigPtrInput
	// Labels for Machine Config V2 object (map)
	//
	// **Note** `labels` and `nodeTaints` will be applied to nodes deployed using the Machine Config V2
	Labels pulumi.MapInput
	// Linode config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
	LinodeConfig MachineConfigV2LinodeConfigPtrInput
	// Openstack config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig` and `vsphereConfig` (list maxitems:1)
	OpenstackConfig MachineConfigV2OpenstackConfigPtrInput
	// vSphere config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig` and `openstackConfig` (list maxitems:1)
	VsphereConfig MachineConfigV2VsphereConfigPtrInput
}

func (MachineConfigV2Args) ElementType() reflect.Type {
	return reflect.TypeOf((*machineConfigV2Args)(nil)).Elem()
}

type MachineConfigV2Input interface {
	pulumi.Input

	ToMachineConfigV2Output() MachineConfigV2Output
	ToMachineConfigV2OutputWithContext(ctx context.Context) MachineConfigV2Output
}

func (*MachineConfigV2) ElementType() reflect.Type {
	return reflect.TypeOf((**MachineConfigV2)(nil)).Elem()
}

func (i *MachineConfigV2) ToMachineConfigV2Output() MachineConfigV2Output {
	return i.ToMachineConfigV2OutputWithContext(context.Background())
}

func (i *MachineConfigV2) ToMachineConfigV2OutputWithContext(ctx context.Context) MachineConfigV2Output {
	return pulumi.ToOutputWithContext(ctx, i).(MachineConfigV2Output)
}

// MachineConfigV2ArrayInput is an input type that accepts MachineConfigV2Array and MachineConfigV2ArrayOutput values.
// You can construct a concrete instance of `MachineConfigV2ArrayInput` via:
//
//	MachineConfigV2Array{ MachineConfigV2Args{...} }
type MachineConfigV2ArrayInput interface {
	pulumi.Input

	ToMachineConfigV2ArrayOutput() MachineConfigV2ArrayOutput
	ToMachineConfigV2ArrayOutputWithContext(context.Context) MachineConfigV2ArrayOutput
}

type MachineConfigV2Array []MachineConfigV2Input

func (MachineConfigV2Array) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MachineConfigV2)(nil)).Elem()
}

func (i MachineConfigV2Array) ToMachineConfigV2ArrayOutput() MachineConfigV2ArrayOutput {
	return i.ToMachineConfigV2ArrayOutputWithContext(context.Background())
}

func (i MachineConfigV2Array) ToMachineConfigV2ArrayOutputWithContext(ctx context.Context) MachineConfigV2ArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MachineConfigV2ArrayOutput)
}

// MachineConfigV2MapInput is an input type that accepts MachineConfigV2Map and MachineConfigV2MapOutput values.
// You can construct a concrete instance of `MachineConfigV2MapInput` via:
//
//	MachineConfigV2Map{ "key": MachineConfigV2Args{...} }
type MachineConfigV2MapInput interface {
	pulumi.Input

	ToMachineConfigV2MapOutput() MachineConfigV2MapOutput
	ToMachineConfigV2MapOutputWithContext(context.Context) MachineConfigV2MapOutput
}

type MachineConfigV2Map map[string]MachineConfigV2Input

func (MachineConfigV2Map) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MachineConfigV2)(nil)).Elem()
}

func (i MachineConfigV2Map) ToMachineConfigV2MapOutput() MachineConfigV2MapOutput {
	return i.ToMachineConfigV2MapOutputWithContext(context.Background())
}

func (i MachineConfigV2Map) ToMachineConfigV2MapOutputWithContext(ctx context.Context) MachineConfigV2MapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MachineConfigV2MapOutput)
}

type MachineConfigV2Output struct{ *pulumi.OutputState }

func (MachineConfigV2Output) ElementType() reflect.Type {
	return reflect.TypeOf((**MachineConfigV2)(nil)).Elem()
}

func (o MachineConfigV2Output) ToMachineConfigV2Output() MachineConfigV2Output {
	return o
}

func (o MachineConfigV2Output) ToMachineConfigV2OutputWithContext(ctx context.Context) MachineConfigV2Output {
	return o
}

// AWS config for the Machine Config V2. Conflicts with `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
func (o MachineConfigV2Output) Amazonec2Config() MachineConfigV2Amazonec2ConfigPtrOutput {
	return o.ApplyT(func(v *MachineConfigV2) MachineConfigV2Amazonec2ConfigPtrOutput { return v.Amazonec2Config }).(MachineConfigV2Amazonec2ConfigPtrOutput)
}

// Annotations for Machine Config V2 object (map)
func (o MachineConfigV2Output) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *MachineConfigV2) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// Azure config for the Machine Config V2. Conflicts with `amazonec2Config`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
func (o MachineConfigV2Output) AzureConfig() MachineConfigV2AzureConfigPtrOutput {
	return o.ApplyT(func(v *MachineConfigV2) MachineConfigV2AzureConfigPtrOutput { return v.AzureConfig }).(MachineConfigV2AzureConfigPtrOutput)
}

// Digitalocean config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
func (o MachineConfigV2Output) DigitaloceanConfig() MachineConfigV2DigitaloceanConfigPtrOutput {
	return o.ApplyT(func(v *MachineConfigV2) MachineConfigV2DigitaloceanConfigPtrOutput { return v.DigitaloceanConfig }).(MachineConfigV2DigitaloceanConfigPtrOutput)
}

// Cluster V2 fleet namespace
func (o MachineConfigV2Output) FleetNamespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MachineConfigV2) pulumi.StringPtrOutput { return v.FleetNamespace }).(pulumi.StringPtrOutput)
}

// Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\"prod-pool1\" will generate \"nc-prod-pool1-?????\" name computed at `name` attribute (string)
func (o MachineConfigV2Output) GenerateName() pulumi.StringOutput {
	return o.ApplyT(func(v *MachineConfigV2) pulumi.StringOutput { return v.GenerateName }).(pulumi.StringOutput)
}

// Harvester config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
func (o MachineConfigV2Output) HarvesterConfig() MachineConfigV2HarvesterConfigPtrOutput {
	return o.ApplyT(func(v *MachineConfigV2) MachineConfigV2HarvesterConfigPtrOutput { return v.HarvesterConfig }).(MachineConfigV2HarvesterConfigPtrOutput)
}

// (Computed) The machine config kind (string)
func (o MachineConfigV2Output) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v *MachineConfigV2) pulumi.StringOutput { return v.Kind }).(pulumi.StringOutput)
}

// Labels for Machine Config V2 object (map)
//
// **Note** `labels` and `nodeTaints` will be applied to nodes deployed using the Machine Config V2
func (o MachineConfigV2Output) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *MachineConfigV2) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// Linode config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
func (o MachineConfigV2Output) LinodeConfig() MachineConfigV2LinodeConfigPtrOutput {
	return o.ApplyT(func(v *MachineConfigV2) MachineConfigV2LinodeConfigPtrOutput { return v.LinodeConfig }).(MachineConfigV2LinodeConfigPtrOutput)
}

// (Computed) The machine config name (string)
func (o MachineConfigV2Output) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MachineConfigV2) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Openstack config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig` and `vsphereConfig` (list maxitems:1)
func (o MachineConfigV2Output) OpenstackConfig() MachineConfigV2OpenstackConfigPtrOutput {
	return o.ApplyT(func(v *MachineConfigV2) MachineConfigV2OpenstackConfigPtrOutput { return v.OpenstackConfig }).(MachineConfigV2OpenstackConfigPtrOutput)
}

// (Computed) The machine config k8s resource version (string)
func (o MachineConfigV2Output) ResourceVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *MachineConfigV2) pulumi.StringOutput { return v.ResourceVersion }).(pulumi.StringOutput)
}

// vSphere config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig` and `openstackConfig` (list maxitems:1)
func (o MachineConfigV2Output) VsphereConfig() MachineConfigV2VsphereConfigPtrOutput {
	return o.ApplyT(func(v *MachineConfigV2) MachineConfigV2VsphereConfigPtrOutput { return v.VsphereConfig }).(MachineConfigV2VsphereConfigPtrOutput)
}

type MachineConfigV2ArrayOutput struct{ *pulumi.OutputState }

func (MachineConfigV2ArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MachineConfigV2)(nil)).Elem()
}

func (o MachineConfigV2ArrayOutput) ToMachineConfigV2ArrayOutput() MachineConfigV2ArrayOutput {
	return o
}

func (o MachineConfigV2ArrayOutput) ToMachineConfigV2ArrayOutputWithContext(ctx context.Context) MachineConfigV2ArrayOutput {
	return o
}

func (o MachineConfigV2ArrayOutput) Index(i pulumi.IntInput) MachineConfigV2Output {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MachineConfigV2 {
		return vs[0].([]*MachineConfigV2)[vs[1].(int)]
	}).(MachineConfigV2Output)
}

type MachineConfigV2MapOutput struct{ *pulumi.OutputState }

func (MachineConfigV2MapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MachineConfigV2)(nil)).Elem()
}

func (o MachineConfigV2MapOutput) ToMachineConfigV2MapOutput() MachineConfigV2MapOutput {
	return o
}

func (o MachineConfigV2MapOutput) ToMachineConfigV2MapOutputWithContext(ctx context.Context) MachineConfigV2MapOutput {
	return o
}

func (o MachineConfigV2MapOutput) MapIndex(k pulumi.StringInput) MachineConfigV2Output {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MachineConfigV2 {
		return vs[0].(map[string]*MachineConfigV2)[vs[1].(string)]
	}).(MachineConfigV2Output)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MachineConfigV2Input)(nil)).Elem(), &MachineConfigV2{})
	pulumi.RegisterInputType(reflect.TypeOf((*MachineConfigV2ArrayInput)(nil)).Elem(), MachineConfigV2Array{})
	pulumi.RegisterInputType(reflect.TypeOf((*MachineConfigV2MapInput)(nil)).Elem(), MachineConfigV2Map{})
	pulumi.RegisterOutputType(MachineConfigV2Output{})
	pulumi.RegisterOutputType(MachineConfigV2ArrayOutput{})
	pulumi.RegisterOutputType(MachineConfigV2MapOutput{})
}
