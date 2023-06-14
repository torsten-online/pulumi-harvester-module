// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 PodSecurityPolicyTemplate.
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
//			_, err := rancher2.LookupPodSecurityPolicyTemplate(ctx, &rancher2.LookupPodSecurityPolicyTemplateArgs{
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
func LookupPodSecurityPolicyTemplate(ctx *pulumi.Context, args *LookupPodSecurityPolicyTemplateArgs, opts ...pulumi.InvokeOption) (*LookupPodSecurityPolicyTemplateResult, error) {
	var rv LookupPodSecurityPolicyTemplateResult
	err := ctx.Invoke("rancher2:index/getPodSecurityPolicyTemplate:getPodSecurityPolicyTemplate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPodSecurityPolicyTemplate.
type LookupPodSecurityPolicyTemplateArgs struct {
	// = (Optional)
	AllowPrivilegeEscalation *bool `pulumi:"allowPrivilegeEscalation"`
	// (list)
	AllowedCapabilities []string `pulumi:"allowedCapabilities"`
	// (list)
	AllowedCsiDrivers []GetPodSecurityPolicyTemplateAllowedCsiDriver `pulumi:"allowedCsiDrivers"`
	// (list)
	AllowedFlexVolumes []GetPodSecurityPolicyTemplateAllowedFlexVolume `pulumi:"allowedFlexVolumes"`
	// (list)
	AllowedHostPaths []GetPodSecurityPolicyTemplateAllowedHostPath `pulumi:"allowedHostPaths"`
	// (list)
	AllowedProcMountTypes []string `pulumi:"allowedProcMountTypes"`
	// (list)
	AllowedUnsafeSysctls []string `pulumi:"allowedUnsafeSysctls"`
	// Annotations for PodSecurityPolicyTemplate object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (list)
	DefaultAddCapabilities []string `pulumi:"defaultAddCapabilities"`
	// (list)
	DefaultAllowPrivilegeEscalation *bool `pulumi:"defaultAllowPrivilegeEscalation"`
	// The PodSecurityPolicyTemplate description (string)
	Description *string `pulumi:"description"`
	// (list)
	ForbiddenSysctls []string `pulumi:"forbiddenSysctls"`
	// (list maxitems:1)
	FsGroup *GetPodSecurityPolicyTemplateFsGroup `pulumi:"fsGroup"`
	// (bool)
	HostIpc     *bool `pulumi:"hostIpc"`
	HostNetwork *bool `pulumi:"hostNetwork"`
	// (bool)
	HostPid *bool `pulumi:"hostPid"`
	// (list)
	HostPorts []GetPodSecurityPolicyTemplateHostPort `pulumi:"hostPorts"`
	// Labels for PodSecurityPolicyTemplate object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the PodSecurityPolicyTemplate (string)
	Name string `pulumi:"name"`
	// (bool)
	Privileged *bool `pulumi:"privileged"`
	// (bool)
	ReadOnlyRootFilesystem *bool `pulumi:"readOnlyRootFilesystem"`
	// (list)
	RequiredDropCapabilities []string `pulumi:"requiredDropCapabilities"`
	// (list maxitems:1)
	RunAsGroup *GetPodSecurityPolicyTemplateRunAsGroup `pulumi:"runAsGroup"`
	// (list maxitems:1)
	RunAsUser *GetPodSecurityPolicyTemplateRunAsUser `pulumi:"runAsUser"`
	// (list maxitems:1)
	RuntimeClass *GetPodSecurityPolicyTemplateRuntimeClass `pulumi:"runtimeClass"`
	// (list maxitems:1)
	SeLinux *GetPodSecurityPolicyTemplateSeLinux `pulumi:"seLinux"`
	// (list maxitems:1)
	SupplementalGroup *GetPodSecurityPolicyTemplateSupplementalGroup `pulumi:"supplementalGroup"`
	// (list)
	Volumes []string `pulumi:"volumes"`
}

// A collection of values returned by getPodSecurityPolicyTemplate.
type LookupPodSecurityPolicyTemplateResult struct {
	AllowPrivilegeEscalation        bool                                            `pulumi:"allowPrivilegeEscalation"`
	AllowedCapabilities             []string                                        `pulumi:"allowedCapabilities"`
	AllowedCsiDrivers               []GetPodSecurityPolicyTemplateAllowedCsiDriver  `pulumi:"allowedCsiDrivers"`
	AllowedFlexVolumes              []GetPodSecurityPolicyTemplateAllowedFlexVolume `pulumi:"allowedFlexVolumes"`
	AllowedHostPaths                []GetPodSecurityPolicyTemplateAllowedHostPath   `pulumi:"allowedHostPaths"`
	AllowedProcMountTypes           []string                                        `pulumi:"allowedProcMountTypes"`
	AllowedUnsafeSysctls            []string                                        `pulumi:"allowedUnsafeSysctls"`
	Annotations                     map[string]interface{}                          `pulumi:"annotations"`
	DefaultAddCapabilities          []string                                        `pulumi:"defaultAddCapabilities"`
	DefaultAllowPrivilegeEscalation *bool                                           `pulumi:"defaultAllowPrivilegeEscalation"`
	Description                     string                                          `pulumi:"description"`
	ForbiddenSysctls                []string                                        `pulumi:"forbiddenSysctls"`
	FsGroup                         GetPodSecurityPolicyTemplateFsGroup             `pulumi:"fsGroup"`
	HostIpc                         bool                                            `pulumi:"hostIpc"`
	HostNetwork                     bool                                            `pulumi:"hostNetwork"`
	HostPid                         bool                                            `pulumi:"hostPid"`
	HostPorts                       []GetPodSecurityPolicyTemplateHostPort          `pulumi:"hostPorts"`
	// The provider-assigned unique ID for this managed resource.
	Id                       string                                        `pulumi:"id"`
	Labels                   map[string]interface{}                        `pulumi:"labels"`
	Name                     string                                        `pulumi:"name"`
	Privileged               bool                                          `pulumi:"privileged"`
	ReadOnlyRootFilesystem   bool                                          `pulumi:"readOnlyRootFilesystem"`
	RequiredDropCapabilities []string                                      `pulumi:"requiredDropCapabilities"`
	RunAsGroup               *GetPodSecurityPolicyTemplateRunAsGroup       `pulumi:"runAsGroup"`
	RunAsUser                GetPodSecurityPolicyTemplateRunAsUser         `pulumi:"runAsUser"`
	RuntimeClass             *GetPodSecurityPolicyTemplateRuntimeClass     `pulumi:"runtimeClass"`
	SeLinux                  GetPodSecurityPolicyTemplateSeLinux           `pulumi:"seLinux"`
	SupplementalGroup        GetPodSecurityPolicyTemplateSupplementalGroup `pulumi:"supplementalGroup"`
	Volumes                  []string                                      `pulumi:"volumes"`
}

func LookupPodSecurityPolicyTemplateOutput(ctx *pulumi.Context, args LookupPodSecurityPolicyTemplateOutputArgs, opts ...pulumi.InvokeOption) LookupPodSecurityPolicyTemplateResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPodSecurityPolicyTemplateResult, error) {
			args := v.(LookupPodSecurityPolicyTemplateArgs)
			r, err := LookupPodSecurityPolicyTemplate(ctx, &args, opts...)
			var s LookupPodSecurityPolicyTemplateResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupPodSecurityPolicyTemplateResultOutput)
}

// A collection of arguments for invoking getPodSecurityPolicyTemplate.
type LookupPodSecurityPolicyTemplateOutputArgs struct {
	// = (Optional)
	AllowPrivilegeEscalation pulumi.BoolPtrInput `pulumi:"allowPrivilegeEscalation"`
	// (list)
	AllowedCapabilities pulumi.StringArrayInput `pulumi:"allowedCapabilities"`
	// (list)
	AllowedCsiDrivers GetPodSecurityPolicyTemplateAllowedCsiDriverArrayInput `pulumi:"allowedCsiDrivers"`
	// (list)
	AllowedFlexVolumes GetPodSecurityPolicyTemplateAllowedFlexVolumeArrayInput `pulumi:"allowedFlexVolumes"`
	// (list)
	AllowedHostPaths GetPodSecurityPolicyTemplateAllowedHostPathArrayInput `pulumi:"allowedHostPaths"`
	// (list)
	AllowedProcMountTypes pulumi.StringArrayInput `pulumi:"allowedProcMountTypes"`
	// (list)
	AllowedUnsafeSysctls pulumi.StringArrayInput `pulumi:"allowedUnsafeSysctls"`
	// Annotations for PodSecurityPolicyTemplate object (map)
	Annotations pulumi.MapInput `pulumi:"annotations"`
	// (list)
	DefaultAddCapabilities pulumi.StringArrayInput `pulumi:"defaultAddCapabilities"`
	// (list)
	DefaultAllowPrivilegeEscalation pulumi.BoolPtrInput `pulumi:"defaultAllowPrivilegeEscalation"`
	// The PodSecurityPolicyTemplate description (string)
	Description pulumi.StringPtrInput `pulumi:"description"`
	// (list)
	ForbiddenSysctls pulumi.StringArrayInput `pulumi:"forbiddenSysctls"`
	// (list maxitems:1)
	FsGroup GetPodSecurityPolicyTemplateFsGroupPtrInput `pulumi:"fsGroup"`
	// (bool)
	HostIpc     pulumi.BoolPtrInput `pulumi:"hostIpc"`
	HostNetwork pulumi.BoolPtrInput `pulumi:"hostNetwork"`
	// (bool)
	HostPid pulumi.BoolPtrInput `pulumi:"hostPid"`
	// (list)
	HostPorts GetPodSecurityPolicyTemplateHostPortArrayInput `pulumi:"hostPorts"`
	// Labels for PodSecurityPolicyTemplate object (map)
	Labels pulumi.MapInput `pulumi:"labels"`
	// The name of the PodSecurityPolicyTemplate (string)
	Name pulumi.StringInput `pulumi:"name"`
	// (bool)
	Privileged pulumi.BoolPtrInput `pulumi:"privileged"`
	// (bool)
	ReadOnlyRootFilesystem pulumi.BoolPtrInput `pulumi:"readOnlyRootFilesystem"`
	// (list)
	RequiredDropCapabilities pulumi.StringArrayInput `pulumi:"requiredDropCapabilities"`
	// (list maxitems:1)
	RunAsGroup GetPodSecurityPolicyTemplateRunAsGroupPtrInput `pulumi:"runAsGroup"`
	// (list maxitems:1)
	RunAsUser GetPodSecurityPolicyTemplateRunAsUserPtrInput `pulumi:"runAsUser"`
	// (list maxitems:1)
	RuntimeClass GetPodSecurityPolicyTemplateRuntimeClassPtrInput `pulumi:"runtimeClass"`
	// (list maxitems:1)
	SeLinux GetPodSecurityPolicyTemplateSeLinuxPtrInput `pulumi:"seLinux"`
	// (list maxitems:1)
	SupplementalGroup GetPodSecurityPolicyTemplateSupplementalGroupPtrInput `pulumi:"supplementalGroup"`
	// (list)
	Volumes pulumi.StringArrayInput `pulumi:"volumes"`
}

func (LookupPodSecurityPolicyTemplateOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPodSecurityPolicyTemplateArgs)(nil)).Elem()
}

// A collection of values returned by getPodSecurityPolicyTemplate.
type LookupPodSecurityPolicyTemplateResultOutput struct{ *pulumi.OutputState }

func (LookupPodSecurityPolicyTemplateResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPodSecurityPolicyTemplateResult)(nil)).Elem()
}

func (o LookupPodSecurityPolicyTemplateResultOutput) ToLookupPodSecurityPolicyTemplateResultOutput() LookupPodSecurityPolicyTemplateResultOutput {
	return o
}

func (o LookupPodSecurityPolicyTemplateResultOutput) ToLookupPodSecurityPolicyTemplateResultOutputWithContext(ctx context.Context) LookupPodSecurityPolicyTemplateResultOutput {
	return o
}

func (o LookupPodSecurityPolicyTemplateResultOutput) AllowPrivilegeEscalation() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) bool { return v.AllowPrivilegeEscalation }).(pulumi.BoolOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) AllowedCapabilities() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) []string { return v.AllowedCapabilities }).(pulumi.StringArrayOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) AllowedCsiDrivers() GetPodSecurityPolicyTemplateAllowedCsiDriverArrayOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) []GetPodSecurityPolicyTemplateAllowedCsiDriver {
		return v.AllowedCsiDrivers
	}).(GetPodSecurityPolicyTemplateAllowedCsiDriverArrayOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) AllowedFlexVolumes() GetPodSecurityPolicyTemplateAllowedFlexVolumeArrayOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) []GetPodSecurityPolicyTemplateAllowedFlexVolume {
		return v.AllowedFlexVolumes
	}).(GetPodSecurityPolicyTemplateAllowedFlexVolumeArrayOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) AllowedHostPaths() GetPodSecurityPolicyTemplateAllowedHostPathArrayOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) []GetPodSecurityPolicyTemplateAllowedHostPath {
		return v.AllowedHostPaths
	}).(GetPodSecurityPolicyTemplateAllowedHostPathArrayOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) AllowedProcMountTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) []string { return v.AllowedProcMountTypes }).(pulumi.StringArrayOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) AllowedUnsafeSysctls() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) []string { return v.AllowedUnsafeSysctls }).(pulumi.StringArrayOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) DefaultAddCapabilities() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) []string { return v.DefaultAddCapabilities }).(pulumi.StringArrayOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) DefaultAllowPrivilegeEscalation() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) *bool { return v.DefaultAllowPrivilegeEscalation }).(pulumi.BoolPtrOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) ForbiddenSysctls() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) []string { return v.ForbiddenSysctls }).(pulumi.StringArrayOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) FsGroup() GetPodSecurityPolicyTemplateFsGroupOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) GetPodSecurityPolicyTemplateFsGroup { return v.FsGroup }).(GetPodSecurityPolicyTemplateFsGroupOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) HostIpc() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) bool { return v.HostIpc }).(pulumi.BoolOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) HostNetwork() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) bool { return v.HostNetwork }).(pulumi.BoolOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) HostPid() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) bool { return v.HostPid }).(pulumi.BoolOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) HostPorts() GetPodSecurityPolicyTemplateHostPortArrayOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) []GetPodSecurityPolicyTemplateHostPort {
		return v.HostPorts
	}).(GetPodSecurityPolicyTemplateHostPortArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupPodSecurityPolicyTemplateResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) Privileged() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) bool { return v.Privileged }).(pulumi.BoolOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) ReadOnlyRootFilesystem() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) bool { return v.ReadOnlyRootFilesystem }).(pulumi.BoolOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) RequiredDropCapabilities() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) []string { return v.RequiredDropCapabilities }).(pulumi.StringArrayOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) RunAsGroup() GetPodSecurityPolicyTemplateRunAsGroupPtrOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) *GetPodSecurityPolicyTemplateRunAsGroup {
		return v.RunAsGroup
	}).(GetPodSecurityPolicyTemplateRunAsGroupPtrOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) RunAsUser() GetPodSecurityPolicyTemplateRunAsUserOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) GetPodSecurityPolicyTemplateRunAsUser {
		return v.RunAsUser
	}).(GetPodSecurityPolicyTemplateRunAsUserOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) RuntimeClass() GetPodSecurityPolicyTemplateRuntimeClassPtrOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) *GetPodSecurityPolicyTemplateRuntimeClass {
		return v.RuntimeClass
	}).(GetPodSecurityPolicyTemplateRuntimeClassPtrOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) SeLinux() GetPodSecurityPolicyTemplateSeLinuxOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) GetPodSecurityPolicyTemplateSeLinux { return v.SeLinux }).(GetPodSecurityPolicyTemplateSeLinuxOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) SupplementalGroup() GetPodSecurityPolicyTemplateSupplementalGroupOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) GetPodSecurityPolicyTemplateSupplementalGroup {
		return v.SupplementalGroup
	}).(GetPodSecurityPolicyTemplateSupplementalGroupOutput)
}

func (o LookupPodSecurityPolicyTemplateResultOutput) Volumes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupPodSecurityPolicyTemplateResult) []string { return v.Volumes }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPodSecurityPolicyTemplateResultOutput{})
}
