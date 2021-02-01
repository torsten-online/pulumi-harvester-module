// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Rancher V2 Global DNS Provider resource. This can be used to create Global DNS Providers for Rancher V2. Supported Global DNS Providers: `alidns, cloudflare, route53`
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-rancher2/sdk/v2/go/rancher2"
// 	"github.com/pulumi/pulumi-rancher2/sdk/v2/go/rancher2/"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := rancher2.NewGlobalDnsProvider(ctx, "foo", &rancher2.GlobalDnsProviderArgs{
// 			AlidnsConfig: &rancher2.GlobalDnsProviderAlidnsConfigArgs{
// 				AccessKey: pulumi.String("YYYYYYYYYYYYYYYYYYYY"),
// 				SecretKey: pulumi.String("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"),
// 			},
// 			RootDomain: pulumi.String("example.com"),
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
// 	"github.com/pulumi/pulumi-rancher2/sdk/v2/go/rancher2/"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := rancher2.NewGlobalDnsProvider(ctx, "foo", &rancher2.GlobalDnsProviderArgs{
// 			CloudflareConfig: &rancher2.GlobalDnsProviderCloudflareConfigArgs{
// 				ApiEmail:     pulumi.String("test@test.local"),
// 				ApiKey:       pulumi.String("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"),
// 				ProxySetting: pulumi.Bool(true),
// 			},
// 			RootDomain: pulumi.String("example.com"),
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
// 	"github.com/pulumi/pulumi-rancher2/sdk/v2/go/rancher2/"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := rancher2.NewGlobalDnsProvider(ctx, "foo", &rancher2.GlobalDnsProviderArgs{
// 			RootDomain: pulumi.String("example.com"),
// 			Route53Config: &rancher2.GlobalDnsProviderRoute53ConfigArgs{
// 				AccessKey: pulumi.String("YYYYYYYYYYYYYYYYYYYY"),
// 				Region:    pulumi.String("us-east-1"),
// 				SecretKey: pulumi.String("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"),
// 				ZoneType:  pulumi.String("private"),
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
// Global DNS Providers can be imported using the Rancher Global DNS Provider ID
//
// ```sh
//  $ pulumi import rancher2:index/globalDnsProvider:GlobalDnsProvider foo <global_dns_provider_id>
// ```
type GlobalDnsProvider struct {
	pulumi.CustomResourceState

	AlidnsConfig GlobalDnsProviderAlidnsConfigPtrOutput `pulumi:"alidnsConfig"`
	// Annotations for Global DNS Provider (map)
	Annotations      pulumi.MapOutput                           `pulumi:"annotations"`
	CloudflareConfig GlobalDnsProviderCloudflareConfigPtrOutput `pulumi:"cloudflareConfig"`
	// (Computed) The Global DNS Provider `alidns, cloudflare, route53` (string)
	DnsProvider pulumi.StringOutput `pulumi:"dnsProvider"`
	// Labels for Global DNS Provider (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the Global DNS Provider (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The user ID to assign Global DNS Provider (string)
	RootDomain    pulumi.StringOutput                     `pulumi:"rootDomain"`
	Route53Config GlobalDnsProviderRoute53ConfigPtrOutput `pulumi:"route53Config"`
}

// NewGlobalDnsProvider registers a new resource with the given unique name, arguments, and options.
func NewGlobalDnsProvider(ctx *pulumi.Context,
	name string, args *GlobalDnsProviderArgs, opts ...pulumi.ResourceOption) (*GlobalDnsProvider, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RootDomain == nil {
		return nil, errors.New("invalid value for required argument 'RootDomain'")
	}
	var resource GlobalDnsProvider
	err := ctx.RegisterResource("rancher2:index/globalDnsProvider:GlobalDnsProvider", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGlobalDnsProvider gets an existing GlobalDnsProvider resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGlobalDnsProvider(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GlobalDnsProviderState, opts ...pulumi.ResourceOption) (*GlobalDnsProvider, error) {
	var resource GlobalDnsProvider
	err := ctx.ReadResource("rancher2:index/globalDnsProvider:GlobalDnsProvider", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GlobalDnsProvider resources.
type globalDnsProviderState struct {
	AlidnsConfig *GlobalDnsProviderAlidnsConfig `pulumi:"alidnsConfig"`
	// Annotations for Global DNS Provider (map)
	Annotations      map[string]interface{}             `pulumi:"annotations"`
	CloudflareConfig *GlobalDnsProviderCloudflareConfig `pulumi:"cloudflareConfig"`
	// (Computed) The Global DNS Provider `alidns, cloudflare, route53` (string)
	DnsProvider *string `pulumi:"dnsProvider"`
	// Labels for Global DNS Provider (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the Global DNS Provider (string)
	Name *string `pulumi:"name"`
	// The user ID to assign Global DNS Provider (string)
	RootDomain    *string                         `pulumi:"rootDomain"`
	Route53Config *GlobalDnsProviderRoute53Config `pulumi:"route53Config"`
}

type GlobalDnsProviderState struct {
	AlidnsConfig GlobalDnsProviderAlidnsConfigPtrInput
	// Annotations for Global DNS Provider (map)
	Annotations      pulumi.MapInput
	CloudflareConfig GlobalDnsProviderCloudflareConfigPtrInput
	// (Computed) The Global DNS Provider `alidns, cloudflare, route53` (string)
	DnsProvider pulumi.StringPtrInput
	// Labels for Global DNS Provider (map)
	Labels pulumi.MapInput
	// The name of the Global DNS Provider (string)
	Name pulumi.StringPtrInput
	// The user ID to assign Global DNS Provider (string)
	RootDomain    pulumi.StringPtrInput
	Route53Config GlobalDnsProviderRoute53ConfigPtrInput
}

func (GlobalDnsProviderState) ElementType() reflect.Type {
	return reflect.TypeOf((*globalDnsProviderState)(nil)).Elem()
}

type globalDnsProviderArgs struct {
	AlidnsConfig *GlobalDnsProviderAlidnsConfig `pulumi:"alidnsConfig"`
	// Annotations for Global DNS Provider (map)
	Annotations      map[string]interface{}             `pulumi:"annotations"`
	CloudflareConfig *GlobalDnsProviderCloudflareConfig `pulumi:"cloudflareConfig"`
	// Labels for Global DNS Provider (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the Global DNS Provider (string)
	Name *string `pulumi:"name"`
	// The user ID to assign Global DNS Provider (string)
	RootDomain    string                          `pulumi:"rootDomain"`
	Route53Config *GlobalDnsProviderRoute53Config `pulumi:"route53Config"`
}

// The set of arguments for constructing a GlobalDnsProvider resource.
type GlobalDnsProviderArgs struct {
	AlidnsConfig GlobalDnsProviderAlidnsConfigPtrInput
	// Annotations for Global DNS Provider (map)
	Annotations      pulumi.MapInput
	CloudflareConfig GlobalDnsProviderCloudflareConfigPtrInput
	// Labels for Global DNS Provider (map)
	Labels pulumi.MapInput
	// The name of the Global DNS Provider (string)
	Name pulumi.StringPtrInput
	// The user ID to assign Global DNS Provider (string)
	RootDomain    pulumi.StringInput
	Route53Config GlobalDnsProviderRoute53ConfigPtrInput
}

func (GlobalDnsProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*globalDnsProviderArgs)(nil)).Elem()
}

type GlobalDnsProviderInput interface {
	pulumi.Input

	ToGlobalDnsProviderOutput() GlobalDnsProviderOutput
	ToGlobalDnsProviderOutputWithContext(ctx context.Context) GlobalDnsProviderOutput
}

func (*GlobalDnsProvider) ElementType() reflect.Type {
	return reflect.TypeOf((*GlobalDnsProvider)(nil))
}

func (i *GlobalDnsProvider) ToGlobalDnsProviderOutput() GlobalDnsProviderOutput {
	return i.ToGlobalDnsProviderOutputWithContext(context.Background())
}

func (i *GlobalDnsProvider) ToGlobalDnsProviderOutputWithContext(ctx context.Context) GlobalDnsProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalDnsProviderOutput)
}

type GlobalDnsProviderOutput struct {
	*pulumi.OutputState
}

func (GlobalDnsProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GlobalDnsProvider)(nil))
}

func (o GlobalDnsProviderOutput) ToGlobalDnsProviderOutput() GlobalDnsProviderOutput {
	return o
}

func (o GlobalDnsProviderOutput) ToGlobalDnsProviderOutputWithContext(ctx context.Context) GlobalDnsProviderOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(GlobalDnsProviderOutput{})
}
