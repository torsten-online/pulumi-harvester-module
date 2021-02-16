// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 secret.
//
// Depending of the availability, there are 2 types of Rancher v2 secrets:
// - Project secret: Available to all namespaces in the `projectId`
// - Namespaced secret: Available to just `namespaceId` in the `projectId`
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-rancher2/sdk/v2/go/rancher2"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := rancher2.LookupSecret(ctx, &rancher2.LookupSecretArgs{
// 			Name:      "<name>",
// 			ProjectId: "<project_id>",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-rancher2/sdk/v2/go/rancher2"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "<namespace_id>"
// 		_, err := rancher2.LookupSecret(ctx, &rancher2.LookupSecretArgs{
// 			Name:        "<name>",
// 			NamespaceId: &opt0,
// 			ProjectId:   "<project_id>",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupSecret(ctx *pulumi.Context, args *LookupSecretArgs, opts ...pulumi.InvokeOption) (*LookupSecretResult, error) {
	var rv LookupSecretResult
	err := ctx.Invoke("rancher2:index/getSecret:getSecret", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSecret.
type LookupSecretArgs struct {
	// The name of the secret (string)
	Name string `pulumi:"name"`
	// The namespace id where to assign the namespaced secret (string)
	NamespaceId *string `pulumi:"namespaceId"`
	// The project id where to assign the secret (string)
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getSecret.
type LookupSecretResult struct {
	// (Computed) Annotations for secret object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) Secret key/value data. Base64 encoding required for values (map)
	Data map[string]interface{} `pulumi:"data"`
	// (Computed) A secret description (string)
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) Labels for secret object (map)
	Labels      map[string]interface{} `pulumi:"labels"`
	Name        string                 `pulumi:"name"`
	NamespaceId *string                `pulumi:"namespaceId"`
	ProjectId   string                 `pulumi:"projectId"`
}
