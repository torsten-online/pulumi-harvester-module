// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

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
	ClusterId string  `pulumi:"clusterId"`
	Name      *string `pulumi:"name"`
}

// A collection of values returned by getClusterScan.
type GetClusterScanResult struct {
	Annotations map[string]interface{} `pulumi:"annotations"`
	ClusterId   string                 `pulumi:"clusterId"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                   `pulumi:"id"`
	Labels     map[string]interface{}   `pulumi:"labels"`
	Name       string                   `pulumi:"name"`
	RunType    string                   `pulumi:"runType"`
	ScanConfig GetClusterScanScanConfig `pulumi:"scanConfig"`
	ScanType   string                   `pulumi:"scanType"`
	Status     string                   `pulumi:"status"`
}
