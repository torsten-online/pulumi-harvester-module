// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 Node Template resource.
func LookupNodeTemplate(ctx *pulumi.Context, args *LookupNodeTemplateArgs, opts ...pulumi.InvokeOption) (*LookupNodeTemplateResult, error) {
	var rv LookupNodeTemplateResult
	err := ctx.Invoke("rancher2:index/getNodeTemplate:getNodeTemplate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNodeTemplate.
type LookupNodeTemplateArgs struct {
	// The name of the Node Template (string)
	Name string `pulumi:"name"`
	// (Computed) Engine storage driver for the node template (bool)
	UseInternalIpAddress *bool `pulumi:"useInternalIpAddress"`
}

// A collection of values returned by getNodeTemplate.
type LookupNodeTemplateResult struct {
	// (Computed) Annotations for Node Template object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
	CloudCredentialId string `pulumi:"cloudCredentialId"`
	// (Computed) Description for the Node Template (string)
	Description string `pulumi:"description"`
	// (Computed) The driver of the node template (string)
	Driver string `pulumi:"driver"`
	// (Computed) Engine environment for the node template (string)
	EngineEnv map[string]interface{} `pulumi:"engineEnv"`
	// (Computed) Insecure registry for the node template (list)
	EngineInsecureRegistries []string `pulumi:"engineInsecureRegistries"`
	// (Computed) Docker engine install URL for the node template (string)
	EngineInstallUrl string `pulumi:"engineInstallUrl"`
	// (Computed) Engine label for the node template (string)
	EngineLabel map[string]interface{} `pulumi:"engineLabel"`
	// (Computed) Engine options for the node template (map)
	EngineOpt map[string]interface{} `pulumi:"engineOpt"`
	// (Computed) Engine registry mirror for the node template (list)
	EngineRegistryMirrors []string `pulumi:"engineRegistryMirrors"`
	// (Computed) Engine storage driver for the node template (string)
	EngineStorageDriver string `pulumi:"engineStorageDriver"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for Node Template object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	Name   string                 `pulumi:"name"`
	// (Computed) Engine storage driver for the node template (bool)
	UseInternalIpAddress *bool `pulumi:"useInternalIpAddress"`
}
