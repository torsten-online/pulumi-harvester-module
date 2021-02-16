// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// The provider type for the rancher2 package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiUrl == nil {
		return nil, errors.New("invalid value for required argument 'ApiUrl'")
	}
	if args.Bootstrap == nil {
		args.Bootstrap = pulumi.BoolPtr(getEnvOrDefault(false, parseEnvBool, "RANCHER_BOOTSTRAP").(bool))
	}
	if args.Insecure == nil {
		args.Insecure = pulumi.BoolPtr(getEnvOrDefault(false, parseEnvBool, "RANCHER_INSECURE").(bool))
	}
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:rancher2", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// API Key used to authenticate with the rancher server
	AccessKey *string `pulumi:"accessKey"`
	// The URL to the rancher API
	ApiUrl string `pulumi:"apiUrl"`
	// Bootstrap rancher server
	Bootstrap *bool `pulumi:"bootstrap"`
	// CA certificates used to sign rancher server tls certificates. Mandatory if self signed tls and insecure option false
	CaCerts *string `pulumi:"caCerts"`
	// Allow insecure connections to Rancher. Mandatory if self signed tls and not ca_certs provided
	Insecure *bool `pulumi:"insecure"`
	// Rancher connection retries
	Retries *int `pulumi:"retries"`
	// API secret used to authenticate with the rancher server
	SecretKey *string `pulumi:"secretKey"`
	// API token used to authenticate with the rancher server
	TokenKey *string `pulumi:"tokenKey"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// API Key used to authenticate with the rancher server
	AccessKey pulumi.StringPtrInput
	// The URL to the rancher API
	ApiUrl pulumi.StringInput
	// Bootstrap rancher server
	Bootstrap pulumi.BoolPtrInput
	// CA certificates used to sign rancher server tls certificates. Mandatory if self signed tls and insecure option false
	CaCerts pulumi.StringPtrInput
	// Allow insecure connections to Rancher. Mandatory if self signed tls and not ca_certs provided
	Insecure pulumi.BoolPtrInput
	// Rancher connection retries
	Retries pulumi.IntPtrInput
	// API secret used to authenticate with the rancher server
	SecretKey pulumi.StringPtrInput
	// API token used to authenticate with the rancher server
	TokenKey pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((*Provider)(nil))
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

func (i *Provider) ToProviderPtrOutput() ProviderPtrOutput {
	return i.ToProviderPtrOutputWithContext(context.Background())
}

func (i *Provider) ToProviderPtrOutputWithContext(ctx context.Context) ProviderPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderPtrOutput)
}

type ProviderPtrInput interface {
	pulumi.Input

	ToProviderPtrOutput() ProviderPtrOutput
	ToProviderPtrOutputWithContext(ctx context.Context) ProviderPtrOutput
}

type providerPtrType ProviderArgs

func (*providerPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil))
}

func (i *providerPtrType) ToProviderPtrOutput() ProviderPtrOutput {
	return i.ToProviderPtrOutputWithContext(context.Background())
}

func (i *providerPtrType) ToProviderPtrOutputWithContext(ctx context.Context) ProviderPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderPtrOutput)
}

type ProviderOutput struct {
	*pulumi.OutputState
}

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Provider)(nil))
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderPtrOutput() ProviderPtrOutput {
	return o.ToProviderPtrOutputWithContext(context.Background())
}

func (o ProviderOutput) ToProviderPtrOutputWithContext(ctx context.Context) ProviderPtrOutput {
	return o.ApplyT(func(v Provider) *Provider {
		return &v
	}).(ProviderPtrOutput)
}

type ProviderPtrOutput struct {
	*pulumi.OutputState
}

func (ProviderPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil))
}

func (o ProviderPtrOutput) ToProviderPtrOutput() ProviderPtrOutput {
	return o
}

func (o ProviderPtrOutput) ToProviderPtrOutputWithContext(ctx context.Context) ProviderPtrOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ProviderOutput{})
	pulumi.RegisterOutputType(ProviderPtrOutput{})
}
