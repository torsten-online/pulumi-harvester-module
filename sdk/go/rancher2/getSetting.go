// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 setting.
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
//			_, err := rancher2.LookupSetting(ctx, &GetSettingArgs{
//				Name: "server-image",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSetting(ctx *pulumi.Context, args *LookupSettingArgs, opts ...pulumi.InvokeOption) (*LookupSettingResult, error) {
	var rv LookupSettingResult
	err := ctx.Invoke("rancher2:index/getSetting:getSetting", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSetting.
type LookupSettingArgs struct {
	// The setting name.
	Name string `pulumi:"name"`
}

// A collection of values returned by getSetting.
type LookupSettingResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// the settting's value.
	Value string `pulumi:"value"`
}

func LookupSettingOutput(ctx *pulumi.Context, args LookupSettingOutputArgs, opts ...pulumi.InvokeOption) LookupSettingResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSettingResult, error) {
			args := v.(LookupSettingArgs)
			r, err := LookupSetting(ctx, &args, opts...)
			var s LookupSettingResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSettingResultOutput)
}

// A collection of arguments for invoking getSetting.
type LookupSettingOutputArgs struct {
	// The setting name.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupSettingOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSettingArgs)(nil)).Elem()
}

// A collection of values returned by getSetting.
type LookupSettingResultOutput struct{ *pulumi.OutputState }

func (LookupSettingResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSettingResult)(nil)).Elem()
}

func (o LookupSettingResultOutput) ToLookupSettingResultOutput() LookupSettingResultOutput {
	return o
}

func (o LookupSettingResultOutput) ToLookupSettingResultOutputWithContext(ctx context.Context) LookupSettingResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSettingResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSettingResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSettingResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSettingResult) string { return v.Name }).(pulumi.StringOutput)
}

// the settting's value.
func (o LookupSettingResultOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSettingResult) string { return v.Value }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSettingResultOutput{})
}
