// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher V2 Global DNS resource. This can be used to create Global DNS records for Rancher V2.
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
//			fooGlobalDnsProvider, err := rancher2.NewGlobalDnsProvider(ctx, "fooGlobalDnsProvider", &rancher2.GlobalDnsProviderArgs{
//				RootDomain: pulumi.String("example.com"),
//				Route53Config: &rancher2.GlobalDnsProviderRoute53ConfigArgs{
//					AccessKey: pulumi.String("YYYYYYYYYYYYYYYYYYYY"),
//					SecretKey: pulumi.String("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"),
//					ZoneType:  pulumi.String("private"),
//					Region:    pulumi.String("us-east-1"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = rancher2.NewGlobalDns(ctx, "fooGlobalDns", &rancher2.GlobalDnsArgs{
//				Fqdn:       pulumi.String("foo.example.com"),
//				ProviderId: fooGlobalDnsProvider.ID(),
//				ProjectIds: pulumi.StringArray{
//					pulumi.String("project1"),
//					pulumi.String("project2"),
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
//			fooGlobalDnsProvider, err := rancher2.NewGlobalDnsProvider(ctx, "fooGlobalDnsProvider", &rancher2.GlobalDnsProviderArgs{
//				RootDomain: pulumi.String("example.com"),
//				Route53Config: &rancher2.GlobalDnsProviderRoute53ConfigArgs{
//					AccessKey: pulumi.String("YYYYYYYYYYYYYYYYYYYY"),
//					SecretKey: pulumi.String("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"),
//					ZoneType:  pulumi.String("private"),
//					Region:    pulumi.String("us-east-1"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = rancher2.NewGlobalDns(ctx, "fooGlobalDns", &rancher2.GlobalDnsArgs{
//				Fqdn:              pulumi.String("foo.example.com"),
//				ProviderId:        fooGlobalDnsProvider.ID(),
//				MultiClusterAppId: pulumi.String("<MCA_ID>"),
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
// # Global DNS Entry can be imported using the Rancher Global DNS ID
//
// ```sh
//
//	$ pulumi import rancher2:index/globalDns:GlobalDns foo <global_dns_id>
//
// ```
type GlobalDns struct {
	pulumi.CustomResourceState

	// Annotations for Global DNS (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The Global DNS record (string)
	Fqdn pulumi.StringOutput `pulumi:"fqdn"`
	// Labels for Global DNS (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The MultiCluster App ID to assign to the Global DNS. Conflicts with `projectIds` (string)
	MultiClusterAppId pulumi.StringPtrOutput `pulumi:"multiClusterAppId"`
	// The name of the Global DNS (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// A list of projectIds to assign to the Global DNS. Conflicts with `multiClusterAppId` (list(string))
	ProjectIds pulumi.StringArrayOutput `pulumi:"projectIds"`
	// The Global DNS provider ID to use (string)
	ProviderId pulumi.StringOutput `pulumi:"providerId"`
	// TTL in seconds for DNS record. Default: `300` (int)
	Ttl pulumi.IntPtrOutput `pulumi:"ttl"`
}

// NewGlobalDns registers a new resource with the given unique name, arguments, and options.
func NewGlobalDns(ctx *pulumi.Context,
	name string, args *GlobalDnsArgs, opts ...pulumi.ResourceOption) (*GlobalDns, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Fqdn == nil {
		return nil, errors.New("invalid value for required argument 'Fqdn'")
	}
	if args.ProviderId == nil {
		return nil, errors.New("invalid value for required argument 'ProviderId'")
	}
	var resource GlobalDns
	err := ctx.RegisterResource("rancher2:index/globalDns:GlobalDns", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGlobalDns gets an existing GlobalDns resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGlobalDns(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GlobalDnsState, opts ...pulumi.ResourceOption) (*GlobalDns, error) {
	var resource GlobalDns
	err := ctx.ReadResource("rancher2:index/globalDns:GlobalDns", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GlobalDns resources.
type globalDnsState struct {
	// Annotations for Global DNS (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The Global DNS record (string)
	Fqdn *string `pulumi:"fqdn"`
	// Labels for Global DNS (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The MultiCluster App ID to assign to the Global DNS. Conflicts with `projectIds` (string)
	MultiClusterAppId *string `pulumi:"multiClusterAppId"`
	// The name of the Global DNS (string)
	Name *string `pulumi:"name"`
	// A list of projectIds to assign to the Global DNS. Conflicts with `multiClusterAppId` (list(string))
	ProjectIds []string `pulumi:"projectIds"`
	// The Global DNS provider ID to use (string)
	ProviderId *string `pulumi:"providerId"`
	// TTL in seconds for DNS record. Default: `300` (int)
	Ttl *int `pulumi:"ttl"`
}

type GlobalDnsState struct {
	// Annotations for Global DNS (map)
	Annotations pulumi.MapInput
	// The Global DNS record (string)
	Fqdn pulumi.StringPtrInput
	// Labels for Global DNS (map)
	Labels pulumi.MapInput
	// The MultiCluster App ID to assign to the Global DNS. Conflicts with `projectIds` (string)
	MultiClusterAppId pulumi.StringPtrInput
	// The name of the Global DNS (string)
	Name pulumi.StringPtrInput
	// A list of projectIds to assign to the Global DNS. Conflicts with `multiClusterAppId` (list(string))
	ProjectIds pulumi.StringArrayInput
	// The Global DNS provider ID to use (string)
	ProviderId pulumi.StringPtrInput
	// TTL in seconds for DNS record. Default: `300` (int)
	Ttl pulumi.IntPtrInput
}

func (GlobalDnsState) ElementType() reflect.Type {
	return reflect.TypeOf((*globalDnsState)(nil)).Elem()
}

type globalDnsArgs struct {
	// Annotations for Global DNS (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The Global DNS record (string)
	Fqdn string `pulumi:"fqdn"`
	// Labels for Global DNS (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The MultiCluster App ID to assign to the Global DNS. Conflicts with `projectIds` (string)
	MultiClusterAppId *string `pulumi:"multiClusterAppId"`
	// The name of the Global DNS (string)
	Name *string `pulumi:"name"`
	// A list of projectIds to assign to the Global DNS. Conflicts with `multiClusterAppId` (list(string))
	ProjectIds []string `pulumi:"projectIds"`
	// The Global DNS provider ID to use (string)
	ProviderId string `pulumi:"providerId"`
	// TTL in seconds for DNS record. Default: `300` (int)
	Ttl *int `pulumi:"ttl"`
}

// The set of arguments for constructing a GlobalDns resource.
type GlobalDnsArgs struct {
	// Annotations for Global DNS (map)
	Annotations pulumi.MapInput
	// The Global DNS record (string)
	Fqdn pulumi.StringInput
	// Labels for Global DNS (map)
	Labels pulumi.MapInput
	// The MultiCluster App ID to assign to the Global DNS. Conflicts with `projectIds` (string)
	MultiClusterAppId pulumi.StringPtrInput
	// The name of the Global DNS (string)
	Name pulumi.StringPtrInput
	// A list of projectIds to assign to the Global DNS. Conflicts with `multiClusterAppId` (list(string))
	ProjectIds pulumi.StringArrayInput
	// The Global DNS provider ID to use (string)
	ProviderId pulumi.StringInput
	// TTL in seconds for DNS record. Default: `300` (int)
	Ttl pulumi.IntPtrInput
}

func (GlobalDnsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*globalDnsArgs)(nil)).Elem()
}

type GlobalDnsInput interface {
	pulumi.Input

	ToGlobalDnsOutput() GlobalDnsOutput
	ToGlobalDnsOutputWithContext(ctx context.Context) GlobalDnsOutput
}

func (*GlobalDns) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalDns)(nil)).Elem()
}

func (i *GlobalDns) ToGlobalDnsOutput() GlobalDnsOutput {
	return i.ToGlobalDnsOutputWithContext(context.Background())
}

func (i *GlobalDns) ToGlobalDnsOutputWithContext(ctx context.Context) GlobalDnsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalDnsOutput)
}

// GlobalDnsArrayInput is an input type that accepts GlobalDnsArray and GlobalDnsArrayOutput values.
// You can construct a concrete instance of `GlobalDnsArrayInput` via:
//
//	GlobalDnsArray{ GlobalDnsArgs{...} }
type GlobalDnsArrayInput interface {
	pulumi.Input

	ToGlobalDnsArrayOutput() GlobalDnsArrayOutput
	ToGlobalDnsArrayOutputWithContext(context.Context) GlobalDnsArrayOutput
}

type GlobalDnsArray []GlobalDnsInput

func (GlobalDnsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalDns)(nil)).Elem()
}

func (i GlobalDnsArray) ToGlobalDnsArrayOutput() GlobalDnsArrayOutput {
	return i.ToGlobalDnsArrayOutputWithContext(context.Background())
}

func (i GlobalDnsArray) ToGlobalDnsArrayOutputWithContext(ctx context.Context) GlobalDnsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalDnsArrayOutput)
}

// GlobalDnsMapInput is an input type that accepts GlobalDnsMap and GlobalDnsMapOutput values.
// You can construct a concrete instance of `GlobalDnsMapInput` via:
//
//	GlobalDnsMap{ "key": GlobalDnsArgs{...} }
type GlobalDnsMapInput interface {
	pulumi.Input

	ToGlobalDnsMapOutput() GlobalDnsMapOutput
	ToGlobalDnsMapOutputWithContext(context.Context) GlobalDnsMapOutput
}

type GlobalDnsMap map[string]GlobalDnsInput

func (GlobalDnsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalDns)(nil)).Elem()
}

func (i GlobalDnsMap) ToGlobalDnsMapOutput() GlobalDnsMapOutput {
	return i.ToGlobalDnsMapOutputWithContext(context.Background())
}

func (i GlobalDnsMap) ToGlobalDnsMapOutputWithContext(ctx context.Context) GlobalDnsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalDnsMapOutput)
}

type GlobalDnsOutput struct{ *pulumi.OutputState }

func (GlobalDnsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalDns)(nil)).Elem()
}

func (o GlobalDnsOutput) ToGlobalDnsOutput() GlobalDnsOutput {
	return o
}

func (o GlobalDnsOutput) ToGlobalDnsOutputWithContext(ctx context.Context) GlobalDnsOutput {
	return o
}

// Annotations for Global DNS (map)
func (o GlobalDnsOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *GlobalDns) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// The Global DNS record (string)
func (o GlobalDnsOutput) Fqdn() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalDns) pulumi.StringOutput { return v.Fqdn }).(pulumi.StringOutput)
}

// Labels for Global DNS (map)
func (o GlobalDnsOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *GlobalDns) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// The MultiCluster App ID to assign to the Global DNS. Conflicts with `projectIds` (string)
func (o GlobalDnsOutput) MultiClusterAppId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GlobalDns) pulumi.StringPtrOutput { return v.MultiClusterAppId }).(pulumi.StringPtrOutput)
}

// The name of the Global DNS (string)
func (o GlobalDnsOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalDns) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A list of projectIds to assign to the Global DNS. Conflicts with `multiClusterAppId` (list(string))
func (o GlobalDnsOutput) ProjectIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GlobalDns) pulumi.StringArrayOutput { return v.ProjectIds }).(pulumi.StringArrayOutput)
}

// The Global DNS provider ID to use (string)
func (o GlobalDnsOutput) ProviderId() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalDns) pulumi.StringOutput { return v.ProviderId }).(pulumi.StringOutput)
}

// TTL in seconds for DNS record. Default: `300` (int)
func (o GlobalDnsOutput) Ttl() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *GlobalDns) pulumi.IntPtrOutput { return v.Ttl }).(pulumi.IntPtrOutput)
}

type GlobalDnsArrayOutput struct{ *pulumi.OutputState }

func (GlobalDnsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalDns)(nil)).Elem()
}

func (o GlobalDnsArrayOutput) ToGlobalDnsArrayOutput() GlobalDnsArrayOutput {
	return o
}

func (o GlobalDnsArrayOutput) ToGlobalDnsArrayOutputWithContext(ctx context.Context) GlobalDnsArrayOutput {
	return o
}

func (o GlobalDnsArrayOutput) Index(i pulumi.IntInput) GlobalDnsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GlobalDns {
		return vs[0].([]*GlobalDns)[vs[1].(int)]
	}).(GlobalDnsOutput)
}

type GlobalDnsMapOutput struct{ *pulumi.OutputState }

func (GlobalDnsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalDns)(nil)).Elem()
}

func (o GlobalDnsMapOutput) ToGlobalDnsMapOutput() GlobalDnsMapOutput {
	return o
}

func (o GlobalDnsMapOutput) ToGlobalDnsMapOutputWithContext(ctx context.Context) GlobalDnsMapOutput {
	return o
}

func (o GlobalDnsMapOutput) MapIndex(k pulumi.StringInput) GlobalDnsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GlobalDns {
		return vs[0].(map[string]*GlobalDns)[vs[1].(string)]
	}).(GlobalDnsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalDnsInput)(nil)).Elem(), &GlobalDns{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalDnsArrayInput)(nil)).Elem(), GlobalDnsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalDnsMapInput)(nil)).Elem(), GlobalDnsMap{})
	pulumi.RegisterOutputType(GlobalDnsOutput{})
	pulumi.RegisterOutputType(GlobalDnsArrayOutput{})
	pulumi.RegisterOutputType(GlobalDnsMapOutput{})
}
