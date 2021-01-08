// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Rancher V2 Global DNS Provider data source. Use this data source to retrieve information about a Rancher v2 global DNS provider
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
// 		_, err := rancher2.LookupGlobalDnsProvider(ctx, &rancher2.LookupGlobalDnsProviderArgs{
// 			Name: "foo",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupGlobalDnsProvider(ctx *pulumi.Context, args *LookupGlobalDnsProviderArgs, opts ...pulumi.InvokeOption) (*LookupGlobalDnsProviderResult, error) {
	var rv LookupGlobalDnsProviderResult
	err := ctx.Invoke("rancher2:index/getGlobalDnsProvider:getGlobalDnsProvider", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGlobalDnsProvider.
type LookupGlobalDnsProviderArgs struct {
	// The name of the global DNS provider (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getGlobalDnsProvider.
type LookupGlobalDnsProviderResult struct {
	AlidnsConfig GetGlobalDnsProviderAlidnsConfig `pulumi:"alidnsConfig"`
	// (Computed) Annotations of the resource (map)
	Annotations      map[string]interface{}               `pulumi:"annotations"`
	CloudflareConfig GetGlobalDnsProviderCloudflareConfig `pulumi:"cloudflareConfig"`
	DnsProvider      string                               `pulumi:"dnsProvider"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) The name of the global DNS provider (string)
	Name          string                            `pulumi:"name"`
	RootDomain    string                            `pulumi:"rootDomain"`
	Route53Config GetGlobalDnsProviderRoute53Config `pulumi:"route53Config"`
}
