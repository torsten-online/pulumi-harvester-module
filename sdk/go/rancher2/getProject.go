// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupProject(ctx *pulumi.Context, args *LookupProjectArgs, opts ...pulumi.InvokeOption) (*LookupProjectResult, error) {
	var rv LookupProjectResult
	err := ctx.Invoke("rancher2:index/getProject:getProject", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProject.
type LookupProjectArgs struct {
	// ID of the Rancher 2 cluster (string)
	ClusterId string `pulumi:"clusterId"`
	// The project name (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getProject.
type LookupProjectResult struct {
	// (Computed) Annotations of the rancher2 project (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	ClusterId   string                 `pulumi:"clusterId"`
	// (Computed) Default containers resource limits on project (List maxitem:1)
	ContainerResourceLimit GetProjectContainerResourceLimit `pulumi:"containerResourceLimit"`
	// (Computed) The project's description (string)
	Description string `pulumi:"description"`
	// (Computed) Enable built-in project monitoring. Default `false` (bool)
	EnableProjectMonitoring bool `pulumi:"enableProjectMonitoring"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels of the rancher2 project (map)
	Labels map[string]interface{} `pulumi:"labels"`
	Name   string                 `pulumi:"name"`
	// (Computed) Default Pod Security Policy ID for the project (string)
	PodSecurityPolicyTemplateId string `pulumi:"podSecurityPolicyTemplateId"`
	// (Computed) Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
	ResourceQuota GetProjectResourceQuota `pulumi:"resourceQuota"`
	// (Computed) UUID of the project as stored by Rancher 2 (string)
	Uuid string `pulumi:"uuid"`
}
