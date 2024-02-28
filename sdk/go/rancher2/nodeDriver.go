// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Node Driver resource. This can be used to create Node Driver for Rancher v2 RKE clusters and retrieve their information.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// Create a new rancher2 Node Driver
//			_, err := rancher2.NewNodeDriver(ctx, "foo", &rancher2.NodeDriverArgs{
//				Active:      pulumi.Bool(true),
//				Builtin:     pulumi.Bool(false),
//				Checksum:    pulumi.String("0x0"),
//				Description: pulumi.String("Foo description"),
//				ExternalId:  pulumi.String("foo_external"),
//				UiUrl:       pulumi.String("local://ui"),
//				Url:         pulumi.String("local://"),
//				WhitelistDomains: pulumi.StringArray{
//					pulumi.String("*.foo.com"),
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
// # Node Driver can be imported using the Rancher Node Driver ID
//
// ```sh
//
//	$ pulumi import rancher2:index/nodeDriver:NodeDriver foo &lt;node_driver_id&gt;
//
// ```
type NodeDriver struct {
	pulumi.CustomResourceState

	// Specify if the node driver state (bool)
	Active pulumi.BoolOutput `pulumi:"active"`
	// Annotations of the resource (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// Specify wheter the node driver is an internal node driver or not (bool)
	Builtin pulumi.BoolOutput `pulumi:"builtin"`
	// Verify that the downloaded driver matches the expected checksum (string)
	Checksum pulumi.StringPtrOutput `pulumi:"checksum"`
	// Description of the node driver (string)
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// External ID (string)
	ExternalId pulumi.StringPtrOutput `pulumi:"externalId"`
	// Labels of the resource (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Name of the node driver (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The URL to load for customized Add Nodes screen for this driver (string)
	UiUrl pulumi.StringPtrOutput `pulumi:"uiUrl"`
	// The URL to download the machine driver binary for 64-bit Linux (string)
	Url pulumi.StringOutput `pulumi:"url"`
	// Domains to whitelist for the ui (list)
	WhitelistDomains pulumi.StringArrayOutput `pulumi:"whitelistDomains"`
}

// NewNodeDriver registers a new resource with the given unique name, arguments, and options.
func NewNodeDriver(ctx *pulumi.Context,
	name string, args *NodeDriverArgs, opts ...pulumi.ResourceOption) (*NodeDriver, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Active == nil {
		return nil, errors.New("invalid value for required argument 'Active'")
	}
	if args.Builtin == nil {
		return nil, errors.New("invalid value for required argument 'Builtin'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NodeDriver
	err := ctx.RegisterResource("rancher2:index/nodeDriver:NodeDriver", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNodeDriver gets an existing NodeDriver resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNodeDriver(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NodeDriverState, opts ...pulumi.ResourceOption) (*NodeDriver, error) {
	var resource NodeDriver
	err := ctx.ReadResource("rancher2:index/nodeDriver:NodeDriver", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NodeDriver resources.
type nodeDriverState struct {
	// Specify if the node driver state (bool)
	Active *bool `pulumi:"active"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Specify wheter the node driver is an internal node driver or not (bool)
	Builtin *bool `pulumi:"builtin"`
	// Verify that the downloaded driver matches the expected checksum (string)
	Checksum *string `pulumi:"checksum"`
	// Description of the node driver (string)
	Description *string `pulumi:"description"`
	// External ID (string)
	ExternalId *string `pulumi:"externalId"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Name of the node driver (string)
	Name *string `pulumi:"name"`
	// The URL to load for customized Add Nodes screen for this driver (string)
	UiUrl *string `pulumi:"uiUrl"`
	// The URL to download the machine driver binary for 64-bit Linux (string)
	Url *string `pulumi:"url"`
	// Domains to whitelist for the ui (list)
	WhitelistDomains []string `pulumi:"whitelistDomains"`
}

type NodeDriverState struct {
	// Specify if the node driver state (bool)
	Active pulumi.BoolPtrInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// Specify wheter the node driver is an internal node driver or not (bool)
	Builtin pulumi.BoolPtrInput
	// Verify that the downloaded driver matches the expected checksum (string)
	Checksum pulumi.StringPtrInput
	// Description of the node driver (string)
	Description pulumi.StringPtrInput
	// External ID (string)
	ExternalId pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// Name of the node driver (string)
	Name pulumi.StringPtrInput
	// The URL to load for customized Add Nodes screen for this driver (string)
	UiUrl pulumi.StringPtrInput
	// The URL to download the machine driver binary for 64-bit Linux (string)
	Url pulumi.StringPtrInput
	// Domains to whitelist for the ui (list)
	WhitelistDomains pulumi.StringArrayInput
}

func (NodeDriverState) ElementType() reflect.Type {
	return reflect.TypeOf((*nodeDriverState)(nil)).Elem()
}

type nodeDriverArgs struct {
	// Specify if the node driver state (bool)
	Active bool `pulumi:"active"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Specify wheter the node driver is an internal node driver or not (bool)
	Builtin bool `pulumi:"builtin"`
	// Verify that the downloaded driver matches the expected checksum (string)
	Checksum *string `pulumi:"checksum"`
	// Description of the node driver (string)
	Description *string `pulumi:"description"`
	// External ID (string)
	ExternalId *string `pulumi:"externalId"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Name of the node driver (string)
	Name *string `pulumi:"name"`
	// The URL to load for customized Add Nodes screen for this driver (string)
	UiUrl *string `pulumi:"uiUrl"`
	// The URL to download the machine driver binary for 64-bit Linux (string)
	Url string `pulumi:"url"`
	// Domains to whitelist for the ui (list)
	WhitelistDomains []string `pulumi:"whitelistDomains"`
}

// The set of arguments for constructing a NodeDriver resource.
type NodeDriverArgs struct {
	// Specify if the node driver state (bool)
	Active pulumi.BoolInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// Specify wheter the node driver is an internal node driver or not (bool)
	Builtin pulumi.BoolInput
	// Verify that the downloaded driver matches the expected checksum (string)
	Checksum pulumi.StringPtrInput
	// Description of the node driver (string)
	Description pulumi.StringPtrInput
	// External ID (string)
	ExternalId pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// Name of the node driver (string)
	Name pulumi.StringPtrInput
	// The URL to load for customized Add Nodes screen for this driver (string)
	UiUrl pulumi.StringPtrInput
	// The URL to download the machine driver binary for 64-bit Linux (string)
	Url pulumi.StringInput
	// Domains to whitelist for the ui (list)
	WhitelistDomains pulumi.StringArrayInput
}

func (NodeDriverArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nodeDriverArgs)(nil)).Elem()
}

type NodeDriverInput interface {
	pulumi.Input

	ToNodeDriverOutput() NodeDriverOutput
	ToNodeDriverOutputWithContext(ctx context.Context) NodeDriverOutput
}

func (*NodeDriver) ElementType() reflect.Type {
	return reflect.TypeOf((**NodeDriver)(nil)).Elem()
}

func (i *NodeDriver) ToNodeDriverOutput() NodeDriverOutput {
	return i.ToNodeDriverOutputWithContext(context.Background())
}

func (i *NodeDriver) ToNodeDriverOutputWithContext(ctx context.Context) NodeDriverOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeDriverOutput)
}

// NodeDriverArrayInput is an input type that accepts NodeDriverArray and NodeDriverArrayOutput values.
// You can construct a concrete instance of `NodeDriverArrayInput` via:
//
//	NodeDriverArray{ NodeDriverArgs{...} }
type NodeDriverArrayInput interface {
	pulumi.Input

	ToNodeDriverArrayOutput() NodeDriverArrayOutput
	ToNodeDriverArrayOutputWithContext(context.Context) NodeDriverArrayOutput
}

type NodeDriverArray []NodeDriverInput

func (NodeDriverArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NodeDriver)(nil)).Elem()
}

func (i NodeDriverArray) ToNodeDriverArrayOutput() NodeDriverArrayOutput {
	return i.ToNodeDriverArrayOutputWithContext(context.Background())
}

func (i NodeDriverArray) ToNodeDriverArrayOutputWithContext(ctx context.Context) NodeDriverArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeDriverArrayOutput)
}

// NodeDriverMapInput is an input type that accepts NodeDriverMap and NodeDriverMapOutput values.
// You can construct a concrete instance of `NodeDriverMapInput` via:
//
//	NodeDriverMap{ "key": NodeDriverArgs{...} }
type NodeDriverMapInput interface {
	pulumi.Input

	ToNodeDriverMapOutput() NodeDriverMapOutput
	ToNodeDriverMapOutputWithContext(context.Context) NodeDriverMapOutput
}

type NodeDriverMap map[string]NodeDriverInput

func (NodeDriverMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NodeDriver)(nil)).Elem()
}

func (i NodeDriverMap) ToNodeDriverMapOutput() NodeDriverMapOutput {
	return i.ToNodeDriverMapOutputWithContext(context.Background())
}

func (i NodeDriverMap) ToNodeDriverMapOutputWithContext(ctx context.Context) NodeDriverMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeDriverMapOutput)
}

type NodeDriverOutput struct{ *pulumi.OutputState }

func (NodeDriverOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NodeDriver)(nil)).Elem()
}

func (o NodeDriverOutput) ToNodeDriverOutput() NodeDriverOutput {
	return o
}

func (o NodeDriverOutput) ToNodeDriverOutputWithContext(ctx context.Context) NodeDriverOutput {
	return o
}

// Specify if the node driver state (bool)
func (o NodeDriverOutput) Active() pulumi.BoolOutput {
	return o.ApplyT(func(v *NodeDriver) pulumi.BoolOutput { return v.Active }).(pulumi.BoolOutput)
}

// Annotations of the resource (map)
func (o NodeDriverOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *NodeDriver) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// Specify wheter the node driver is an internal node driver or not (bool)
func (o NodeDriverOutput) Builtin() pulumi.BoolOutput {
	return o.ApplyT(func(v *NodeDriver) pulumi.BoolOutput { return v.Builtin }).(pulumi.BoolOutput)
}

// Verify that the downloaded driver matches the expected checksum (string)
func (o NodeDriverOutput) Checksum() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NodeDriver) pulumi.StringPtrOutput { return v.Checksum }).(pulumi.StringPtrOutput)
}

// Description of the node driver (string)
func (o NodeDriverOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NodeDriver) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// External ID (string)
func (o NodeDriverOutput) ExternalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NodeDriver) pulumi.StringPtrOutput { return v.ExternalId }).(pulumi.StringPtrOutput)
}

// Labels of the resource (map)
func (o NodeDriverOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *NodeDriver) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// Name of the node driver (string)
func (o NodeDriverOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NodeDriver) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The URL to load for customized Add Nodes screen for this driver (string)
func (o NodeDriverOutput) UiUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NodeDriver) pulumi.StringPtrOutput { return v.UiUrl }).(pulumi.StringPtrOutput)
}

// The URL to download the machine driver binary for 64-bit Linux (string)
func (o NodeDriverOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *NodeDriver) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// Domains to whitelist for the ui (list)
func (o NodeDriverOutput) WhitelistDomains() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *NodeDriver) pulumi.StringArrayOutput { return v.WhitelistDomains }).(pulumi.StringArrayOutput)
}

type NodeDriverArrayOutput struct{ *pulumi.OutputState }

func (NodeDriverArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NodeDriver)(nil)).Elem()
}

func (o NodeDriverArrayOutput) ToNodeDriverArrayOutput() NodeDriverArrayOutput {
	return o
}

func (o NodeDriverArrayOutput) ToNodeDriverArrayOutputWithContext(ctx context.Context) NodeDriverArrayOutput {
	return o
}

func (o NodeDriverArrayOutput) Index(i pulumi.IntInput) NodeDriverOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NodeDriver {
		return vs[0].([]*NodeDriver)[vs[1].(int)]
	}).(NodeDriverOutput)
}

type NodeDriverMapOutput struct{ *pulumi.OutputState }

func (NodeDriverMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NodeDriver)(nil)).Elem()
}

func (o NodeDriverMapOutput) ToNodeDriverMapOutput() NodeDriverMapOutput {
	return o
}

func (o NodeDriverMapOutput) ToNodeDriverMapOutputWithContext(ctx context.Context) NodeDriverMapOutput {
	return o
}

func (o NodeDriverMapOutput) MapIndex(k pulumi.StringInput) NodeDriverOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NodeDriver {
		return vs[0].(map[string]*NodeDriver)[vs[1].(string)]
	}).(NodeDriverOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NodeDriverInput)(nil)).Elem(), &NodeDriver{})
	pulumi.RegisterInputType(reflect.TypeOf((*NodeDriverArrayInput)(nil)).Elem(), NodeDriverArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NodeDriverMapInput)(nil)).Elem(), NodeDriverMap{})
	pulumi.RegisterOutputType(NodeDriverOutput{})
	pulumi.RegisterOutputType(NodeDriverArrayOutput{})
	pulumi.RegisterOutputType(NodeDriverMapOutput{})
}
