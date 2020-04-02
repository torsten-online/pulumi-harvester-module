// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package rancher2

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 cluster template.
//
// Cluster Templates are available from Rancher v2.3.x and above.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/clusterTemplate.html.markdown.
func LookupClusterTemplate(ctx *pulumi.Context, args *LookupClusterTemplateArgs, opts ...pulumi.InvokeOption) (*LookupClusterTemplateResult, error) {
	var rv LookupClusterTemplateResult
	err := ctx.Invoke("rancher2:index/getClusterTemplate:getClusterTemplate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClusterTemplate.
type LookupClusterTemplateArgs struct {
	// (Computed) Annotations for the cluster template (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	Description *string                `pulumi:"description"`
	// (Computed) Labels for the cluster template (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The cluster template name (string)
	Name string `pulumi:"name"`
}

// A collection of values returned by getClusterTemplate.
type LookupClusterTemplateResult struct {
	// (Computed) Annotations for the cluster template (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) Default cluster template revision ID (string)
	DefaultRevisionId string `pulumi:"defaultRevisionId"`
	Description       string `pulumi:"description"`
	// id is the provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for the cluster template (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) Cluster template members (list)
	Members []GetClusterTemplateMember `pulumi:"members"`
	Name    string                     `pulumi:"name"`
	// (Computed) Cluster template revisions (list)
	TemplateRevisions []GetClusterTemplateTemplateRevision `pulumi:"templateRevisions"`
}
