// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 Cluster CIS Scan resource.
func GetClusterScan(ctx *pulumi.Context, args *GetClusterScanArgs, opts ...pulumi.InvokeOption) (*GetClusterScanResult, error) {
	var rv GetClusterScanResult
	err := ctx.Invoke("rancher2:index/getClusterScan:getClusterScan", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClusterScan.
type GetClusterScanArgs struct {
	// Cluster ID for CIS Scan (string)
	ClusterId string `pulumi:"clusterId"`
	// Name of the cluster Scan (string)
	Name *string `pulumi:"name"`
}

// A collection of values returned by getClusterScan.
type GetClusterScanResult struct {
	// (Computed) Annotations of the resource (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	ClusterId   string                 `pulumi:"clusterId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels of the resource (map)
	Labels map[string]interface{} `pulumi:"labels"`
	Name   string                 `pulumi:"name"`
	// (Computed) Cluster Scan run type (string)
	RunType string `pulumi:"runType"`
	// (Computed) Cluster Scan config (bool)
	ScanConfig GetClusterScanScanConfig `pulumi:"scanConfig"`
	// (Computed) Cluster Scan type (string)
	ScanType string `pulumi:"scanType"`
	// (Computed) Cluster Scan status (string)
	Status string `pulumi:"status"`
}

func GetClusterScanOutput(ctx *pulumi.Context, args GetClusterScanOutputArgs, opts ...pulumi.InvokeOption) GetClusterScanResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetClusterScanResult, error) {
			args := v.(GetClusterScanArgs)
			r, err := GetClusterScan(ctx, &args, opts...)
			var s GetClusterScanResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetClusterScanResultOutput)
}

// A collection of arguments for invoking getClusterScan.
type GetClusterScanOutputArgs struct {
	// Cluster ID for CIS Scan (string)
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
	// Name of the cluster Scan (string)
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (GetClusterScanOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetClusterScanArgs)(nil)).Elem()
}

// A collection of values returned by getClusterScan.
type GetClusterScanResultOutput struct{ *pulumi.OutputState }

func (GetClusterScanResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetClusterScanResult)(nil)).Elem()
}

func (o GetClusterScanResultOutput) ToGetClusterScanResultOutput() GetClusterScanResultOutput {
	return o
}

func (o GetClusterScanResultOutput) ToGetClusterScanResultOutputWithContext(ctx context.Context) GetClusterScanResultOutput {
	return o
}

// (Computed) Annotations of the resource (map)
func (o GetClusterScanResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v GetClusterScanResult) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

func (o GetClusterScanResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v GetClusterScanResult) string { return v.ClusterId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetClusterScanResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetClusterScanResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels of the resource (map)
func (o GetClusterScanResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v GetClusterScanResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

func (o GetClusterScanResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetClusterScanResult) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) Cluster Scan run type (string)
func (o GetClusterScanResultOutput) RunType() pulumi.StringOutput {
	return o.ApplyT(func(v GetClusterScanResult) string { return v.RunType }).(pulumi.StringOutput)
}

// (Computed) Cluster Scan config (bool)
func (o GetClusterScanResultOutput) ScanConfig() GetClusterScanScanConfigOutput {
	return o.ApplyT(func(v GetClusterScanResult) GetClusterScanScanConfig { return v.ScanConfig }).(GetClusterScanScanConfigOutput)
}

// (Computed) Cluster Scan type (string)
func (o GetClusterScanResultOutput) ScanType() pulumi.StringOutput {
	return o.ApplyT(func(v GetClusterScanResult) string { return v.ScanType }).(pulumi.StringOutput)
}

// (Computed) Cluster Scan status (string)
func (o GetClusterScanResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetClusterScanResult) string { return v.Status }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetClusterScanResultOutput{})
}
