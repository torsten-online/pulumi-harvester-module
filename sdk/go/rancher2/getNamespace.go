// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 namespace.
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
//			_, err := rancher2.LookupNamespace(ctx, &rancher2.LookupNamespaceArgs{
//				Name:      "foo",
//				ProjectId: rancher2_cluster.FooCustom.Default_project_id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupNamespace(ctx *pulumi.Context, args *LookupNamespaceArgs, opts ...pulumi.InvokeOption) (*LookupNamespaceResult, error) {
	var rv LookupNamespaceResult
	err := ctx.Invoke("rancher2:index/getNamespace:getNamespace", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNamespace.
type LookupNamespaceArgs struct {
	// The name of the namespace (string)
	Name string `pulumi:"name"`
	// The project id where namespace is assigned (string)
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getNamespace.
type LookupNamespaceResult struct {
	// (Computed) Annotations for Node Pool object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) Default containers resource limits on namespace (List maxitem:1)
	ContainerResourceLimit GetNamespaceContainerResourceLimit `pulumi:"containerResourceLimit"`
	// (Computed) A namespace description (string)
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for Node Pool object (map)
	Labels    map[string]interface{} `pulumi:"labels"`
	Name      string                 `pulumi:"name"`
	ProjectId string                 `pulumi:"projectId"`
	// (Computed) Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
	ResourceQuota GetNamespaceResourceQuota `pulumi:"resourceQuota"`
}

func LookupNamespaceOutput(ctx *pulumi.Context, args LookupNamespaceOutputArgs, opts ...pulumi.InvokeOption) LookupNamespaceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupNamespaceResult, error) {
			args := v.(LookupNamespaceArgs)
			r, err := LookupNamespace(ctx, &args, opts...)
			var s LookupNamespaceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupNamespaceResultOutput)
}

// A collection of arguments for invoking getNamespace.
type LookupNamespaceOutputArgs struct {
	// The name of the namespace (string)
	Name pulumi.StringInput `pulumi:"name"`
	// The project id where namespace is assigned (string)
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupNamespaceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNamespaceArgs)(nil)).Elem()
}

// A collection of values returned by getNamespace.
type LookupNamespaceResultOutput struct{ *pulumi.OutputState }

func (LookupNamespaceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNamespaceResult)(nil)).Elem()
}

func (o LookupNamespaceResultOutput) ToLookupNamespaceResultOutput() LookupNamespaceResultOutput {
	return o
}

func (o LookupNamespaceResultOutput) ToLookupNamespaceResultOutputWithContext(ctx context.Context) LookupNamespaceResultOutput {
	return o
}

// (Computed) Annotations for Node Pool object (map)
func (o LookupNamespaceResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupNamespaceResult) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

// (Computed) Default containers resource limits on namespace (List maxitem:1)
func (o LookupNamespaceResultOutput) ContainerResourceLimit() GetNamespaceContainerResourceLimitOutput {
	return o.ApplyT(func(v LookupNamespaceResult) GetNamespaceContainerResourceLimit { return v.ContainerResourceLimit }).(GetNamespaceContainerResourceLimitOutput)
}

// (Computed) A namespace description (string)
func (o LookupNamespaceResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNamespaceResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNamespaceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNamespaceResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) Labels for Node Pool object (map)
func (o LookupNamespaceResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupNamespaceResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

func (o LookupNamespaceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNamespaceResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupNamespaceResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNamespaceResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// (Computed) Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
func (o LookupNamespaceResultOutput) ResourceQuota() GetNamespaceResourceQuotaOutput {
	return o.ApplyT(func(v LookupNamespaceResult) GetNamespaceResourceQuota { return v.ResourceQuota }).(GetNamespaceResourceQuotaOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNamespaceResultOutput{})
}
