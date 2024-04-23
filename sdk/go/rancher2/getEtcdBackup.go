// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 etcd backup.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v6/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rancher2.LookupEtcdBackup(ctx, &rancher2.LookupEtcdBackupArgs{
//				ClusterId: "<CLUSTER_ID>",
//				Name:      "foo",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupEtcdBackup(ctx *pulumi.Context, args *LookupEtcdBackupArgs, opts ...pulumi.InvokeOption) (*LookupEtcdBackupResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEtcdBackupResult
	err := ctx.Invoke("rancher2:index/getEtcdBackup:getEtcdBackup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEtcdBackup.
type LookupEtcdBackupArgs struct {
	// Cluster ID to config Etcd Backup (string)
	ClusterId string `pulumi:"clusterId"`
	// The name of the Etcd Backup (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getEtcdBackup.
type LookupEtcdBackupResult struct {
	// (Computed) Annotations for Etcd Backup object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) Backup config for etcd backup (list maxitems:1)
	BackupConfig GetEtcdBackupBackupConfig `pulumi:"backupConfig"`
	ClusterId    string                    `pulumi:"clusterId"`
	// (Computed) Filename of the Etcd Backup (string)
	Filename string `pulumi:"filename"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for Etcd Backup object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) Manual execution of the Etcd Backup. Default `false` (bool)
	Manual bool   `pulumi:"manual"`
	Name   string `pulumi:"name"`
	// (Computed) Description for the Etcd Backup (string)
	NamespaceId string `pulumi:"namespaceId"`
}

func LookupEtcdBackupOutput(ctx *pulumi.Context, args LookupEtcdBackupOutputArgs, opts ...pulumi.InvokeOption) LookupEtcdBackupResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupEtcdBackupResult, error) {
			args := v.(LookupEtcdBackupArgs)
			r, err := LookupEtcdBackup(ctx, &args, opts...)
			var s LookupEtcdBackupResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupEtcdBackupResultOutput)
}

// A collection of arguments for invoking getEtcdBackup.
type LookupEtcdBackupOutputArgs struct {
	// Cluster ID to config Etcd Backup (string)
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
	// The name of the Etcd Backup (string)
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupEtcdBackupOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEtcdBackupArgs)(nil)).Elem()
}

// A collection of values returned by getEtcdBackup.
type LookupEtcdBackupResultOutput struct{ *pulumi.OutputState }

func (LookupEtcdBackupResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEtcdBackupResult)(nil)).Elem()
}

func (o LookupEtcdBackupResultOutput) ToLookupEtcdBackupResultOutput() LookupEtcdBackupResultOutput {
	return o
}

func (o LookupEtcdBackupResultOutput) ToLookupEtcdBackupResultOutputWithContext(ctx context.Context) LookupEtcdBackupResultOutput {
	return o
}

// (Computed) Annotations for Etcd Backup object (map)
func (o LookupEtcdBackupResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupEtcdBackupResult) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

// (Computed) Backup config for etcd backup (list maxitems:1)
func (o LookupEtcdBackupResultOutput) BackupConfig() GetEtcdBackupBackupConfigOutput {
	return o.ApplyT(func(v LookupEtcdBackupResult) GetEtcdBackupBackupConfig { return v.BackupConfig }).(GetEtcdBackupBackupConfigOutput)
}

func (o LookupEtcdBackupResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEtcdBackupResult) string { return v.ClusterId }).(pulumi.StringOutput)
}

// (Computed) Filename of the Etcd Backup (string)
func (o LookupEtcdBackupResultOutput) Filename() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEtcdBackupResult) string { return v.Filename }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupEtcdBackupResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEtcdBackupResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels for Etcd Backup object (map)
func (o LookupEtcdBackupResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupEtcdBackupResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

// (Computed) Manual execution of the Etcd Backup. Default `false` (bool)
func (o LookupEtcdBackupResultOutput) Manual() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupEtcdBackupResult) bool { return v.Manual }).(pulumi.BoolOutput)
}

func (o LookupEtcdBackupResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEtcdBackupResult) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) Description for the Etcd Backup (string)
func (o LookupEtcdBackupResultOutput) NamespaceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEtcdBackupResult) string { return v.NamespaceId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEtcdBackupResultOutput{})
}
