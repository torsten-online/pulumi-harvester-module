// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// ## Import
//
// Apps can be imported using the app ID in the format `<project_id>:<app_name>`
//
// ```sh
//  $ pulumi import rancher2:index/app:App foo &lt;PROJECT_ID_ID&gt;:&lt;APP_NAME&gt;
// ```
type App struct {
	pulumi.CustomResourceState

	// Annotations for App object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// Answers for the app template. If modified, app will be upgraded (map)
	Answers pulumi.MapOutput `pulumi:"answers"`
	// Catalog name of the app. If modified, app will be upgraded. For use scoped catalogs:
	// * add cluster ID before name, `local:<name>` or `c-XXXXX:<name>`
	// * add project ID before name, `p-XXXXX:<name>`
	CatalogName pulumi.StringOutput `pulumi:"catalogName"`
	// Description for the app (string)
	Description pulumi.StringOutput `pulumi:"description"`
	// (Computed) The url of the app template on a catalog (string)
	ExternalId pulumi.StringOutput `pulumi:"externalId"`
	// Force app upgrade (string)
	ForceUpgrade pulumi.BoolPtrOutput `pulumi:"forceUpgrade"`
	// Labels for App object (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the app (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The project id where the app will be installed (string)
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Current revision id for the app. If modified, If this argument is provided or modified, app will be rollbacked to `revisionId` (string)
	RevisionId pulumi.StringOutput `pulumi:"revisionId"`
	// The namespace id where the app will be installed (string)
	TargetNamespace pulumi.StringOutput `pulumi:"targetNamespace"`
	// Template name of the app. If modified, app will be upgraded (string)
	TemplateName pulumi.StringOutput `pulumi:"templateName"`
	// Template version of the app. If modified, app will be upgraded. Default: `latest` (string)
	TemplateVersion pulumi.StringOutput `pulumi:"templateVersion"`
	// values.yaml base64 encoded file content for the app template. If modified, app will be upgraded (string)
	ValuesYaml pulumi.StringPtrOutput `pulumi:"valuesYaml"`
	// Wait until app is deployed and active. Default: `true` (bool)
	Wait pulumi.BoolPtrOutput `pulumi:"wait"`
}

// NewApp registers a new resource with the given unique name, arguments, and options.
func NewApp(ctx *pulumi.Context,
	name string, args *AppArgs, opts ...pulumi.ResourceOption) (*App, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CatalogName == nil {
		return nil, errors.New("invalid value for required argument 'CatalogName'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.TargetNamespace == nil {
		return nil, errors.New("invalid value for required argument 'TargetNamespace'")
	}
	if args.TemplateName == nil {
		return nil, errors.New("invalid value for required argument 'TemplateName'")
	}
	var resource App
	err := ctx.RegisterResource("rancher2:index/app:App", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApp gets an existing App resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppState, opts ...pulumi.ResourceOption) (*App, error) {
	var resource App
	err := ctx.ReadResource("rancher2:index/app:App", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering App resources.
type appState struct {
	// Annotations for App object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Answers for the app template. If modified, app will be upgraded (map)
	Answers map[string]interface{} `pulumi:"answers"`
	// Catalog name of the app. If modified, app will be upgraded. For use scoped catalogs:
	// * add cluster ID before name, `local:<name>` or `c-XXXXX:<name>`
	// * add project ID before name, `p-XXXXX:<name>`
	CatalogName *string `pulumi:"catalogName"`
	// Description for the app (string)
	Description *string `pulumi:"description"`
	// (Computed) The url of the app template on a catalog (string)
	ExternalId *string `pulumi:"externalId"`
	// Force app upgrade (string)
	ForceUpgrade *bool `pulumi:"forceUpgrade"`
	// Labels for App object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the app (string)
	Name *string `pulumi:"name"`
	// The project id where the app will be installed (string)
	ProjectId *string `pulumi:"projectId"`
	// Current revision id for the app. If modified, If this argument is provided or modified, app will be rollbacked to `revisionId` (string)
	RevisionId *string `pulumi:"revisionId"`
	// The namespace id where the app will be installed (string)
	TargetNamespace *string `pulumi:"targetNamespace"`
	// Template name of the app. If modified, app will be upgraded (string)
	TemplateName *string `pulumi:"templateName"`
	// Template version of the app. If modified, app will be upgraded. Default: `latest` (string)
	TemplateVersion *string `pulumi:"templateVersion"`
	// values.yaml base64 encoded file content for the app template. If modified, app will be upgraded (string)
	ValuesYaml *string `pulumi:"valuesYaml"`
	// Wait until app is deployed and active. Default: `true` (bool)
	Wait *bool `pulumi:"wait"`
}

type AppState struct {
	// Annotations for App object (map)
	Annotations pulumi.MapInput
	// Answers for the app template. If modified, app will be upgraded (map)
	Answers pulumi.MapInput
	// Catalog name of the app. If modified, app will be upgraded. For use scoped catalogs:
	// * add cluster ID before name, `local:<name>` or `c-XXXXX:<name>`
	// * add project ID before name, `p-XXXXX:<name>`
	CatalogName pulumi.StringPtrInput
	// Description for the app (string)
	Description pulumi.StringPtrInput
	// (Computed) The url of the app template on a catalog (string)
	ExternalId pulumi.StringPtrInput
	// Force app upgrade (string)
	ForceUpgrade pulumi.BoolPtrInput
	// Labels for App object (map)
	Labels pulumi.MapInput
	// The name of the app (string)
	Name pulumi.StringPtrInput
	// The project id where the app will be installed (string)
	ProjectId pulumi.StringPtrInput
	// Current revision id for the app. If modified, If this argument is provided or modified, app will be rollbacked to `revisionId` (string)
	RevisionId pulumi.StringPtrInput
	// The namespace id where the app will be installed (string)
	TargetNamespace pulumi.StringPtrInput
	// Template name of the app. If modified, app will be upgraded (string)
	TemplateName pulumi.StringPtrInput
	// Template version of the app. If modified, app will be upgraded. Default: `latest` (string)
	TemplateVersion pulumi.StringPtrInput
	// values.yaml base64 encoded file content for the app template. If modified, app will be upgraded (string)
	ValuesYaml pulumi.StringPtrInput
	// Wait until app is deployed and active. Default: `true` (bool)
	Wait pulumi.BoolPtrInput
}

func (AppState) ElementType() reflect.Type {
	return reflect.TypeOf((*appState)(nil)).Elem()
}

type appArgs struct {
	// Annotations for App object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Answers for the app template. If modified, app will be upgraded (map)
	Answers map[string]interface{} `pulumi:"answers"`
	// Catalog name of the app. If modified, app will be upgraded. For use scoped catalogs:
	// * add cluster ID before name, `local:<name>` or `c-XXXXX:<name>`
	// * add project ID before name, `p-XXXXX:<name>`
	CatalogName string `pulumi:"catalogName"`
	// Description for the app (string)
	Description *string `pulumi:"description"`
	// Force app upgrade (string)
	ForceUpgrade *bool `pulumi:"forceUpgrade"`
	// Labels for App object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the app (string)
	Name *string `pulumi:"name"`
	// The project id where the app will be installed (string)
	ProjectId string `pulumi:"projectId"`
	// Current revision id for the app. If modified, If this argument is provided or modified, app will be rollbacked to `revisionId` (string)
	RevisionId *string `pulumi:"revisionId"`
	// The namespace id where the app will be installed (string)
	TargetNamespace string `pulumi:"targetNamespace"`
	// Template name of the app. If modified, app will be upgraded (string)
	TemplateName string `pulumi:"templateName"`
	// Template version of the app. If modified, app will be upgraded. Default: `latest` (string)
	TemplateVersion *string `pulumi:"templateVersion"`
	// values.yaml base64 encoded file content for the app template. If modified, app will be upgraded (string)
	ValuesYaml *string `pulumi:"valuesYaml"`
	// Wait until app is deployed and active. Default: `true` (bool)
	Wait *bool `pulumi:"wait"`
}

// The set of arguments for constructing a App resource.
type AppArgs struct {
	// Annotations for App object (map)
	Annotations pulumi.MapInput
	// Answers for the app template. If modified, app will be upgraded (map)
	Answers pulumi.MapInput
	// Catalog name of the app. If modified, app will be upgraded. For use scoped catalogs:
	// * add cluster ID before name, `local:<name>` or `c-XXXXX:<name>`
	// * add project ID before name, `p-XXXXX:<name>`
	CatalogName pulumi.StringInput
	// Description for the app (string)
	Description pulumi.StringPtrInput
	// Force app upgrade (string)
	ForceUpgrade pulumi.BoolPtrInput
	// Labels for App object (map)
	Labels pulumi.MapInput
	// The name of the app (string)
	Name pulumi.StringPtrInput
	// The project id where the app will be installed (string)
	ProjectId pulumi.StringInput
	// Current revision id for the app. If modified, If this argument is provided or modified, app will be rollbacked to `revisionId` (string)
	RevisionId pulumi.StringPtrInput
	// The namespace id where the app will be installed (string)
	TargetNamespace pulumi.StringInput
	// Template name of the app. If modified, app will be upgraded (string)
	TemplateName pulumi.StringInput
	// Template version of the app. If modified, app will be upgraded. Default: `latest` (string)
	TemplateVersion pulumi.StringPtrInput
	// values.yaml base64 encoded file content for the app template. If modified, app will be upgraded (string)
	ValuesYaml pulumi.StringPtrInput
	// Wait until app is deployed and active. Default: `true` (bool)
	Wait pulumi.BoolPtrInput
}

func (AppArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*appArgs)(nil)).Elem()
}

type AppInput interface {
	pulumi.Input

	ToAppOutput() AppOutput
	ToAppOutputWithContext(ctx context.Context) AppOutput
}

func (App) ElementType() reflect.Type {
	return reflect.TypeOf((*App)(nil)).Elem()
}

func (i App) ToAppOutput() AppOutput {
	return i.ToAppOutputWithContext(context.Background())
}

func (i App) ToAppOutputWithContext(ctx context.Context) AppOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppOutput)
}

type AppOutput struct {
	*pulumi.OutputState
}

func (AppOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AppOutput)(nil)).Elem()
}

func (o AppOutput) ToAppOutput() AppOutput {
	return o
}

func (o AppOutput) ToAppOutputWithContext(ctx context.Context) AppOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(AppOutput{})
}
