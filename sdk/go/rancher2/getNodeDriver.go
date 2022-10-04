// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 Node Driver resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v3/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rancher2.LookupNodeDriver(ctx, &GetNodeDriverArgs{
//				Name: "foo",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupNodeDriver(ctx *pulumi.Context, args *LookupNodeDriverArgs, opts ...pulumi.InvokeOption) (*LookupNodeDriverResult, error) {
	var rv LookupNodeDriverResult
	err := ctx.Invoke("rancher2:index/getNodeDriver:getNodeDriver", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNodeDriver.
type LookupNodeDriverArgs struct {
	// Name of the node driver (string)
	Name string `pulumi:"name"`
	// The URL to download the machine driver binary for 64-bit Linux (string)
	Url *string `pulumi:"url"`
}

// A collection of values returned by getNodeDriver.
type LookupNodeDriverResult struct {
	// (Computed) Specify if the node driver state (bool)
	Active bool `pulumi:"active"`
	// (Computed) Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) Specify wheter the node driver is an internal cluster driver or not (bool)
	Builtin bool `pulumi:"builtin"`
	// (Computed) Verify that the downloaded driver matches the expected checksum (string)
	Checksum string `pulumi:"checksum"`
	// (Computed) Description of the node driver (string)
	Description string `pulumi:"description"`
	// (Computed) External ID (string)
	ExternalId string `pulumi:"externalId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	Name   string                 `pulumi:"name"`
	// (Computed) The URL to load for customized Add Node screen for this driver (string)
	UiUrl string `pulumi:"uiUrl"`
	Url   string `pulumi:"url"`
	// (Computed) Domains to whitelist for the ui (list)
	WhitelistDomains []string `pulumi:"whitelistDomains"`
}

func LookupNodeDriverOutput(ctx *pulumi.Context, args LookupNodeDriverOutputArgs, opts ...pulumi.InvokeOption) LookupNodeDriverResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupNodeDriverResult, error) {
			args := v.(LookupNodeDriverArgs)
			r, err := LookupNodeDriver(ctx, &args, opts...)
			var s LookupNodeDriverResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupNodeDriverResultOutput)
}

// A collection of arguments for invoking getNodeDriver.
type LookupNodeDriverOutputArgs struct {
	// Name of the node driver (string)
	Name pulumi.StringInput `pulumi:"name"`
	// The URL to download the machine driver binary for 64-bit Linux (string)
	Url pulumi.StringPtrInput `pulumi:"url"`
}

func (LookupNodeDriverOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNodeDriverArgs)(nil)).Elem()
}

// A collection of values returned by getNodeDriver.
type LookupNodeDriverResultOutput struct{ *pulumi.OutputState }

func (LookupNodeDriverResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNodeDriverResult)(nil)).Elem()
}

func (o LookupNodeDriverResultOutput) ToLookupNodeDriverResultOutput() LookupNodeDriverResultOutput {
	return o
}

func (o LookupNodeDriverResultOutput) ToLookupNodeDriverResultOutputWithContext(ctx context.Context) LookupNodeDriverResultOutput {
	return o
}

// (Computed) Specify if the node driver state (bool)
func (o LookupNodeDriverResultOutput) Active() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupNodeDriverResult) bool { return v.Active }).(pulumi.BoolOutput)
}

// (Computed) Annotations of the resource (map)
func (o LookupNodeDriverResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupNodeDriverResult) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

// (Computed) Specify wheter the node driver is an internal cluster driver or not (bool)
func (o LookupNodeDriverResultOutput) Builtin() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupNodeDriverResult) bool { return v.Builtin }).(pulumi.BoolOutput)
}

// (Computed) Verify that the downloaded driver matches the expected checksum (string)
func (o LookupNodeDriverResultOutput) Checksum() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeDriverResult) string { return v.Checksum }).(pulumi.StringOutput)
}

// (Computed) Description of the node driver (string)
func (o LookupNodeDriverResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeDriverResult) string { return v.Description }).(pulumi.StringOutput)
}

// (Computed) External ID (string)
func (o LookupNodeDriverResultOutput) ExternalId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeDriverResult) string { return v.ExternalId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNodeDriverResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeDriverResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels of the resource (map)
func (o LookupNodeDriverResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupNodeDriverResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

func (o LookupNodeDriverResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeDriverResult) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) The URL to load for customized Add Node screen for this driver (string)
func (o LookupNodeDriverResultOutput) UiUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeDriverResult) string { return v.UiUrl }).(pulumi.StringOutput)
}

func (o LookupNodeDriverResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeDriverResult) string { return v.Url }).(pulumi.StringOutput)
}

// (Computed) Domains to whitelist for the ui (list)
func (o LookupNodeDriverResultOutput) WhitelistDomains() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupNodeDriverResult) []string { return v.WhitelistDomains }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNodeDriverResultOutput{})
}
