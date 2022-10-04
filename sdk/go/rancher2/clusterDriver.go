// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Cluster Driver resource. This can be used to create Cluster Driver for Rancher v2.2.x Kontainer Engine clusters and retrieve their information.
//
// ## Import
//
// # Cluster Driver can be imported using the Rancher Cluster Driver ID
//
// ```sh
//
//	$ pulumi import rancher2:index/clusterDriver:ClusterDriver foo &lt;CLUSTER_DRIVER_ID&gt;
//
// ```
type ClusterDriver struct {
	pulumi.CustomResourceState

	// Specify the cluster driver state (bool)
	Active pulumi.BoolOutput `pulumi:"active"`
	// Actual url of the cluster driver (string)
	ActualUrl pulumi.StringPtrOutput `pulumi:"actualUrl"`
	// Annotations of the resource (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// Specify whether the cluster driver is an internal cluster driver or not (bool)
	Builtin pulumi.BoolOutput `pulumi:"builtin"`
	// Verify that the downloaded driver matches the expected checksum (string)
	Checksum pulumi.StringPtrOutput `pulumi:"checksum"`
	// Labels of the resource (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Name of the cluster driver (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The URL to load for customized Add Clusters screen for this driver (string)
	UiUrl pulumi.StringPtrOutput `pulumi:"uiUrl"`
	// The URL to download the machine driver binary for 64-bit Linux (string)
	Url pulumi.StringOutput `pulumi:"url"`
	// Domains to whitelist for the ui (list)
	WhitelistDomains pulumi.StringArrayOutput `pulumi:"whitelistDomains"`
}

// NewClusterDriver registers a new resource with the given unique name, arguments, and options.
func NewClusterDriver(ctx *pulumi.Context,
	name string, args *ClusterDriverArgs, opts ...pulumi.ResourceOption) (*ClusterDriver, error) {
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
	var resource ClusterDriver
	err := ctx.RegisterResource("rancher2:index/clusterDriver:ClusterDriver", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterDriver gets an existing ClusterDriver resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterDriver(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterDriverState, opts ...pulumi.ResourceOption) (*ClusterDriver, error) {
	var resource ClusterDriver
	err := ctx.ReadResource("rancher2:index/clusterDriver:ClusterDriver", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterDriver resources.
type clusterDriverState struct {
	// Specify the cluster driver state (bool)
	Active *bool `pulumi:"active"`
	// Actual url of the cluster driver (string)
	ActualUrl *string `pulumi:"actualUrl"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Specify whether the cluster driver is an internal cluster driver or not (bool)
	Builtin *bool `pulumi:"builtin"`
	// Verify that the downloaded driver matches the expected checksum (string)
	Checksum *string `pulumi:"checksum"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Name of the cluster driver (string)
	Name *string `pulumi:"name"`
	// The URL to load for customized Add Clusters screen for this driver (string)
	UiUrl *string `pulumi:"uiUrl"`
	// The URL to download the machine driver binary for 64-bit Linux (string)
	Url *string `pulumi:"url"`
	// Domains to whitelist for the ui (list)
	WhitelistDomains []string `pulumi:"whitelistDomains"`
}

type ClusterDriverState struct {
	// Specify the cluster driver state (bool)
	Active pulumi.BoolPtrInput
	// Actual url of the cluster driver (string)
	ActualUrl pulumi.StringPtrInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// Specify whether the cluster driver is an internal cluster driver or not (bool)
	Builtin pulumi.BoolPtrInput
	// Verify that the downloaded driver matches the expected checksum (string)
	Checksum pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// Name of the cluster driver (string)
	Name pulumi.StringPtrInput
	// The URL to load for customized Add Clusters screen for this driver (string)
	UiUrl pulumi.StringPtrInput
	// The URL to download the machine driver binary for 64-bit Linux (string)
	Url pulumi.StringPtrInput
	// Domains to whitelist for the ui (list)
	WhitelistDomains pulumi.StringArrayInput
}

func (ClusterDriverState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterDriverState)(nil)).Elem()
}

type clusterDriverArgs struct {
	// Specify the cluster driver state (bool)
	Active bool `pulumi:"active"`
	// Actual url of the cluster driver (string)
	ActualUrl *string `pulumi:"actualUrl"`
	// Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Specify whether the cluster driver is an internal cluster driver or not (bool)
	Builtin bool `pulumi:"builtin"`
	// Verify that the downloaded driver matches the expected checksum (string)
	Checksum *string `pulumi:"checksum"`
	// Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Name of the cluster driver (string)
	Name *string `pulumi:"name"`
	// The URL to load for customized Add Clusters screen for this driver (string)
	UiUrl *string `pulumi:"uiUrl"`
	// The URL to download the machine driver binary for 64-bit Linux (string)
	Url string `pulumi:"url"`
	// Domains to whitelist for the ui (list)
	WhitelistDomains []string `pulumi:"whitelistDomains"`
}

// The set of arguments for constructing a ClusterDriver resource.
type ClusterDriverArgs struct {
	// Specify the cluster driver state (bool)
	Active pulumi.BoolInput
	// Actual url of the cluster driver (string)
	ActualUrl pulumi.StringPtrInput
	// Annotations of the resource (map)
	Annotations pulumi.MapInput
	// Specify whether the cluster driver is an internal cluster driver or not (bool)
	Builtin pulumi.BoolInput
	// Verify that the downloaded driver matches the expected checksum (string)
	Checksum pulumi.StringPtrInput
	// Labels of the resource (map)
	Labels pulumi.MapInput
	// Name of the cluster driver (string)
	Name pulumi.StringPtrInput
	// The URL to load for customized Add Clusters screen for this driver (string)
	UiUrl pulumi.StringPtrInput
	// The URL to download the machine driver binary for 64-bit Linux (string)
	Url pulumi.StringInput
	// Domains to whitelist for the ui (list)
	WhitelistDomains pulumi.StringArrayInput
}

func (ClusterDriverArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterDriverArgs)(nil)).Elem()
}

type ClusterDriverInput interface {
	pulumi.Input

	ToClusterDriverOutput() ClusterDriverOutput
	ToClusterDriverOutputWithContext(ctx context.Context) ClusterDriverOutput
}

func (*ClusterDriver) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterDriver)(nil)).Elem()
}

func (i *ClusterDriver) ToClusterDriverOutput() ClusterDriverOutput {
	return i.ToClusterDriverOutputWithContext(context.Background())
}

func (i *ClusterDriver) ToClusterDriverOutputWithContext(ctx context.Context) ClusterDriverOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterDriverOutput)
}

// ClusterDriverArrayInput is an input type that accepts ClusterDriverArray and ClusterDriverArrayOutput values.
// You can construct a concrete instance of `ClusterDriverArrayInput` via:
//
//	ClusterDriverArray{ ClusterDriverArgs{...} }
type ClusterDriverArrayInput interface {
	pulumi.Input

	ToClusterDriverArrayOutput() ClusterDriverArrayOutput
	ToClusterDriverArrayOutputWithContext(context.Context) ClusterDriverArrayOutput
}

type ClusterDriverArray []ClusterDriverInput

func (ClusterDriverArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterDriver)(nil)).Elem()
}

func (i ClusterDriverArray) ToClusterDriverArrayOutput() ClusterDriverArrayOutput {
	return i.ToClusterDriverArrayOutputWithContext(context.Background())
}

func (i ClusterDriverArray) ToClusterDriverArrayOutputWithContext(ctx context.Context) ClusterDriverArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterDriverArrayOutput)
}

// ClusterDriverMapInput is an input type that accepts ClusterDriverMap and ClusterDriverMapOutput values.
// You can construct a concrete instance of `ClusterDriverMapInput` via:
//
//	ClusterDriverMap{ "key": ClusterDriverArgs{...} }
type ClusterDriverMapInput interface {
	pulumi.Input

	ToClusterDriverMapOutput() ClusterDriverMapOutput
	ToClusterDriverMapOutputWithContext(context.Context) ClusterDriverMapOutput
}

type ClusterDriverMap map[string]ClusterDriverInput

func (ClusterDriverMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterDriver)(nil)).Elem()
}

func (i ClusterDriverMap) ToClusterDriverMapOutput() ClusterDriverMapOutput {
	return i.ToClusterDriverMapOutputWithContext(context.Background())
}

func (i ClusterDriverMap) ToClusterDriverMapOutputWithContext(ctx context.Context) ClusterDriverMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterDriverMapOutput)
}

type ClusterDriverOutput struct{ *pulumi.OutputState }

func (ClusterDriverOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterDriver)(nil)).Elem()
}

func (o ClusterDriverOutput) ToClusterDriverOutput() ClusterDriverOutput {
	return o
}

func (o ClusterDriverOutput) ToClusterDriverOutputWithContext(ctx context.Context) ClusterDriverOutput {
	return o
}

type ClusterDriverArrayOutput struct{ *pulumi.OutputState }

func (ClusterDriverArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterDriver)(nil)).Elem()
}

func (o ClusterDriverArrayOutput) ToClusterDriverArrayOutput() ClusterDriverArrayOutput {
	return o
}

func (o ClusterDriverArrayOutput) ToClusterDriverArrayOutputWithContext(ctx context.Context) ClusterDriverArrayOutput {
	return o
}

func (o ClusterDriverArrayOutput) Index(i pulumi.IntInput) ClusterDriverOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClusterDriver {
		return vs[0].([]*ClusterDriver)[vs[1].(int)]
	}).(ClusterDriverOutput)
}

type ClusterDriverMapOutput struct{ *pulumi.OutputState }

func (ClusterDriverMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterDriver)(nil)).Elem()
}

func (o ClusterDriverMapOutput) ToClusterDriverMapOutput() ClusterDriverMapOutput {
	return o
}

func (o ClusterDriverMapOutput) ToClusterDriverMapOutputWithContext(ctx context.Context) ClusterDriverMapOutput {
	return o
}

func (o ClusterDriverMapOutput) MapIndex(k pulumi.StringInput) ClusterDriverOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClusterDriver {
		return vs[0].(map[string]*ClusterDriver)[vs[1].(string)]
	}).(ClusterDriverOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterDriverInput)(nil)).Elem(), &ClusterDriver{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterDriverArrayInput)(nil)).Elem(), ClusterDriverArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterDriverMapInput)(nil)).Elem(), ClusterDriverMap{})
	pulumi.RegisterOutputType(ClusterDriverOutput{})
	pulumi.RegisterOutputType(ClusterDriverArrayOutput{})
	pulumi.RegisterOutputType(ClusterDriverMapOutput{})
}
