// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package rancher2

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 Cluster Driver resource.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/clusterDriver.html.markdown.
func LookupClusterDriver(ctx *pulumi.Context, args *LookupClusterDriverArgs, opts ...pulumi.InvokeOption) (*LookupClusterDriverResult, error) {
	var rv LookupClusterDriverResult
	err := ctx.Invoke("rancher2:index/getClusterDriver:getClusterDriver", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClusterDriver.
type LookupClusterDriverArgs struct {
	// Name of the cluster driver (string)
	Name string `pulumi:"name"`
	// The URL to download the machine driver binary for 64-bit Linux (string)
	Url *string `pulumi:"url"`
}


// A collection of values returned by getClusterDriver.
type LookupClusterDriverResult struct {
	// (Computed) Specify if the cluster driver state (bool)
	Active bool `pulumi:"active"`
	// (Computed) Actual url of the cluster driver (string)
	ActualUrl string `pulumi:"actualUrl"`
	// (Computed) Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) Specify whether the cluster driver is an internal cluster driver or not (bool)
	Builtin bool `pulumi:"builtin"`
	// (Computed) Verify that the downloaded driver matches the expected checksum (string)
	Checksum string `pulumi:"checksum"`
	// id is the provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	Name string `pulumi:"name"`
	// (Computed) The URL to load for customized Add Clusters screen for this driver (string)
	UiUrl string `pulumi:"uiUrl"`
	Url string `pulumi:"url"`
	// (Computed) Domains to whitelist for the ui (list)
	WhitelistDomains []string `pulumi:"whitelistDomains"`
}

