// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-rancher2/sdk/v5/go/rancher2/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Rancher v2 multiClusterApp resource. This can be used to deploy multiClusterApp on Rancher v2.
//
// This resource can also modify Rancher v2 multi cluster apps in 3 ways:
// - `Add/Remove targets`: If `targets` arguments is modified, the multi cluster app targets will be updated.
// - `Rollback`: If `revisionId` argument is provided or modified the app will be rolled back accordingly. A new `revisionId` will be generated in Rancher. It will also generate a non-empty pulumi preview that will require manual .tf file intervention. Use carefully.
// - `Update`: If any other argument is modified the app will be upgraded.
//
// Note: In case of multiple resource modification in a row, `rollback` has preference.
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
//			_, err := rancher2.NewMultiClusterApp(ctx, "foo", &rancher2.MultiClusterAppArgs{
//				Answers: rancher2.MultiClusterAppAnswerArray{
//					&rancher2.MultiClusterAppAnswerArgs{
//						Values: pulumi.Map{
//							"ingressHost": pulumi.Any("test.xip.io"),
//						},
//					},
//				},
//				CatalogName: pulumi.String("<catalog_name>"),
//				Roles: pulumi.StringArray{
//					pulumi.String("project-member"),
//				},
//				Targets: rancher2.MultiClusterAppTargetArray{
//					&rancher2.MultiClusterAppTargetArgs{
//						ProjectId: pulumi.String("<project_id>"),
//					},
//				},
//				TemplateName:    pulumi.String("<template_name>"),
//				TemplateVersion: pulumi.String("<template_version>"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
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
//			_, err := rancher2.NewMultiClusterApp(ctx, "foo", &rancher2.MultiClusterAppArgs{
//				Answers: rancher2.MultiClusterAppAnswerArray{
//					&rancher2.MultiClusterAppAnswerArgs{
//						Values: pulumi.Map{
//							"ingressHost": pulumi.Any("test.xip.io"),
//						},
//					},
//					&rancher2.MultiClusterAppAnswerArgs{
//						ProjectId: pulumi.String("<project_id2>"),
//						Values: pulumi.Map{
//							"ingressHost": pulumi.Any("test2.xip.io"),
//						},
//					},
//				},
//				CatalogName: pulumi.String("<catalog_name>"),
//				Roles: pulumi.StringArray{
//					pulumi.String("project-member"),
//				},
//				Targets: rancher2.MultiClusterAppTargetArray{
//					&rancher2.MultiClusterAppTargetArgs{
//						ProjectId: pulumi.String("<project_id1>"),
//					},
//					&rancher2.MultiClusterAppTargetArgs{
//						ProjectId: pulumi.String("<project_id2>"),
//					},
//				},
//				TemplateName:    pulumi.String("<template_name>"),
//				TemplateVersion: pulumi.String("<template_version>"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Multi cluster app can be imported using the multi cluster app ID in the format `<multi_cluster_app_name>`
//
// ```sh
//
//	$ pulumi import rancher2:index/multiClusterApp:MultiClusterApp foo &lt;MULTI_CLUSTER_APP_ID&gt;
//
// ```
type MultiClusterApp struct {
	pulumi.CustomResourceState

	// Annotations for multi cluster app object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The multi cluster app answers (list)
	Answers MultiClusterAppAnswerArrayOutput `pulumi:"answers"`
	// The multi cluster app catalog name (string)
	CatalogName pulumi.StringOutput `pulumi:"catalogName"`
	// Labels for multi cluster app object (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The multi cluster app answers (list)
	Members MultiClusterAppMemberArrayOutput `pulumi:"members"`
	// The multi cluster app name (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The multi cluster app revision history limit. Default `10` (int)
	RevisionHistoryLimit pulumi.IntPtrOutput `pulumi:"revisionHistoryLimit"`
	// Current revision id for the multi cluster app (string)
	RevisionId pulumi.StringOutput `pulumi:"revisionId"`
	// The multi cluster app roles (list)
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// The multi cluster app target projects (list)
	Targets MultiClusterAppTargetArrayOutput `pulumi:"targets"`
	// The multi cluster app template name (string)
	TemplateName pulumi.StringOutput `pulumi:"templateName"`
	// The multi cluster app template version. Default: `latest` (string)
	TemplateVersion pulumi.StringOutput `pulumi:"templateVersion"`
	// (Computed) The multi cluster app template version ID (string)
	TemplateVersionId pulumi.StringOutput `pulumi:"templateVersionId"`
	// The multi cluster app upgrade strategy (list MaxItems:1)
	UpgradeStrategy MultiClusterAppUpgradeStrategyOutput `pulumi:"upgradeStrategy"`
	// Wait until the multi cluster app is active. Default `true` (bool)
	Wait pulumi.BoolPtrOutput `pulumi:"wait"`
}

// NewMultiClusterApp registers a new resource with the given unique name, arguments, and options.
func NewMultiClusterApp(ctx *pulumi.Context,
	name string, args *MultiClusterAppArgs, opts ...pulumi.ResourceOption) (*MultiClusterApp, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CatalogName == nil {
		return nil, errors.New("invalid value for required argument 'CatalogName'")
	}
	if args.Roles == nil {
		return nil, errors.New("invalid value for required argument 'Roles'")
	}
	if args.Targets == nil {
		return nil, errors.New("invalid value for required argument 'Targets'")
	}
	if args.TemplateName == nil {
		return nil, errors.New("invalid value for required argument 'TemplateName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MultiClusterApp
	err := ctx.RegisterResource("rancher2:index/multiClusterApp:MultiClusterApp", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMultiClusterApp gets an existing MultiClusterApp resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMultiClusterApp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MultiClusterAppState, opts ...pulumi.ResourceOption) (*MultiClusterApp, error) {
	var resource MultiClusterApp
	err := ctx.ReadResource("rancher2:index/multiClusterApp:MultiClusterApp", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MultiClusterApp resources.
type multiClusterAppState struct {
	// Annotations for multi cluster app object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The multi cluster app answers (list)
	Answers []MultiClusterAppAnswer `pulumi:"answers"`
	// The multi cluster app catalog name (string)
	CatalogName *string `pulumi:"catalogName"`
	// Labels for multi cluster app object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The multi cluster app answers (list)
	Members []MultiClusterAppMember `pulumi:"members"`
	// The multi cluster app name (string)
	Name *string `pulumi:"name"`
	// The multi cluster app revision history limit. Default `10` (int)
	RevisionHistoryLimit *int `pulumi:"revisionHistoryLimit"`
	// Current revision id for the multi cluster app (string)
	RevisionId *string `pulumi:"revisionId"`
	// The multi cluster app roles (list)
	Roles []string `pulumi:"roles"`
	// The multi cluster app target projects (list)
	Targets []MultiClusterAppTarget `pulumi:"targets"`
	// The multi cluster app template name (string)
	TemplateName *string `pulumi:"templateName"`
	// The multi cluster app template version. Default: `latest` (string)
	TemplateVersion *string `pulumi:"templateVersion"`
	// (Computed) The multi cluster app template version ID (string)
	TemplateVersionId *string `pulumi:"templateVersionId"`
	// The multi cluster app upgrade strategy (list MaxItems:1)
	UpgradeStrategy *MultiClusterAppUpgradeStrategy `pulumi:"upgradeStrategy"`
	// Wait until the multi cluster app is active. Default `true` (bool)
	Wait *bool `pulumi:"wait"`
}

type MultiClusterAppState struct {
	// Annotations for multi cluster app object (map)
	Annotations pulumi.MapInput
	// The multi cluster app answers (list)
	Answers MultiClusterAppAnswerArrayInput
	// The multi cluster app catalog name (string)
	CatalogName pulumi.StringPtrInput
	// Labels for multi cluster app object (map)
	Labels pulumi.MapInput
	// The multi cluster app answers (list)
	Members MultiClusterAppMemberArrayInput
	// The multi cluster app name (string)
	Name pulumi.StringPtrInput
	// The multi cluster app revision history limit. Default `10` (int)
	RevisionHistoryLimit pulumi.IntPtrInput
	// Current revision id for the multi cluster app (string)
	RevisionId pulumi.StringPtrInput
	// The multi cluster app roles (list)
	Roles pulumi.StringArrayInput
	// The multi cluster app target projects (list)
	Targets MultiClusterAppTargetArrayInput
	// The multi cluster app template name (string)
	TemplateName pulumi.StringPtrInput
	// The multi cluster app template version. Default: `latest` (string)
	TemplateVersion pulumi.StringPtrInput
	// (Computed) The multi cluster app template version ID (string)
	TemplateVersionId pulumi.StringPtrInput
	// The multi cluster app upgrade strategy (list MaxItems:1)
	UpgradeStrategy MultiClusterAppUpgradeStrategyPtrInput
	// Wait until the multi cluster app is active. Default `true` (bool)
	Wait pulumi.BoolPtrInput
}

func (MultiClusterAppState) ElementType() reflect.Type {
	return reflect.TypeOf((*multiClusterAppState)(nil)).Elem()
}

type multiClusterAppArgs struct {
	// Annotations for multi cluster app object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The multi cluster app answers (list)
	Answers []MultiClusterAppAnswer `pulumi:"answers"`
	// The multi cluster app catalog name (string)
	CatalogName string `pulumi:"catalogName"`
	// Labels for multi cluster app object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The multi cluster app answers (list)
	Members []MultiClusterAppMember `pulumi:"members"`
	// The multi cluster app name (string)
	Name *string `pulumi:"name"`
	// The multi cluster app revision history limit. Default `10` (int)
	RevisionHistoryLimit *int `pulumi:"revisionHistoryLimit"`
	// Current revision id for the multi cluster app (string)
	RevisionId *string `pulumi:"revisionId"`
	// The multi cluster app roles (list)
	Roles []string `pulumi:"roles"`
	// The multi cluster app target projects (list)
	Targets []MultiClusterAppTarget `pulumi:"targets"`
	// The multi cluster app template name (string)
	TemplateName string `pulumi:"templateName"`
	// The multi cluster app template version. Default: `latest` (string)
	TemplateVersion *string `pulumi:"templateVersion"`
	// The multi cluster app upgrade strategy (list MaxItems:1)
	UpgradeStrategy *MultiClusterAppUpgradeStrategy `pulumi:"upgradeStrategy"`
	// Wait until the multi cluster app is active. Default `true` (bool)
	Wait *bool `pulumi:"wait"`
}

// The set of arguments for constructing a MultiClusterApp resource.
type MultiClusterAppArgs struct {
	// Annotations for multi cluster app object (map)
	Annotations pulumi.MapInput
	// The multi cluster app answers (list)
	Answers MultiClusterAppAnswerArrayInput
	// The multi cluster app catalog name (string)
	CatalogName pulumi.StringInput
	// Labels for multi cluster app object (map)
	Labels pulumi.MapInput
	// The multi cluster app answers (list)
	Members MultiClusterAppMemberArrayInput
	// The multi cluster app name (string)
	Name pulumi.StringPtrInput
	// The multi cluster app revision history limit. Default `10` (int)
	RevisionHistoryLimit pulumi.IntPtrInput
	// Current revision id for the multi cluster app (string)
	RevisionId pulumi.StringPtrInput
	// The multi cluster app roles (list)
	Roles pulumi.StringArrayInput
	// The multi cluster app target projects (list)
	Targets MultiClusterAppTargetArrayInput
	// The multi cluster app template name (string)
	TemplateName pulumi.StringInput
	// The multi cluster app template version. Default: `latest` (string)
	TemplateVersion pulumi.StringPtrInput
	// The multi cluster app upgrade strategy (list MaxItems:1)
	UpgradeStrategy MultiClusterAppUpgradeStrategyPtrInput
	// Wait until the multi cluster app is active. Default `true` (bool)
	Wait pulumi.BoolPtrInput
}

func (MultiClusterAppArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*multiClusterAppArgs)(nil)).Elem()
}

type MultiClusterAppInput interface {
	pulumi.Input

	ToMultiClusterAppOutput() MultiClusterAppOutput
	ToMultiClusterAppOutputWithContext(ctx context.Context) MultiClusterAppOutput
}

func (*MultiClusterApp) ElementType() reflect.Type {
	return reflect.TypeOf((**MultiClusterApp)(nil)).Elem()
}

func (i *MultiClusterApp) ToMultiClusterAppOutput() MultiClusterAppOutput {
	return i.ToMultiClusterAppOutputWithContext(context.Background())
}

func (i *MultiClusterApp) ToMultiClusterAppOutputWithContext(ctx context.Context) MultiClusterAppOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MultiClusterAppOutput)
}

func (i *MultiClusterApp) ToOutput(ctx context.Context) pulumix.Output[*MultiClusterApp] {
	return pulumix.Output[*MultiClusterApp]{
		OutputState: i.ToMultiClusterAppOutputWithContext(ctx).OutputState,
	}
}

// MultiClusterAppArrayInput is an input type that accepts MultiClusterAppArray and MultiClusterAppArrayOutput values.
// You can construct a concrete instance of `MultiClusterAppArrayInput` via:
//
//	MultiClusterAppArray{ MultiClusterAppArgs{...} }
type MultiClusterAppArrayInput interface {
	pulumi.Input

	ToMultiClusterAppArrayOutput() MultiClusterAppArrayOutput
	ToMultiClusterAppArrayOutputWithContext(context.Context) MultiClusterAppArrayOutput
}

type MultiClusterAppArray []MultiClusterAppInput

func (MultiClusterAppArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MultiClusterApp)(nil)).Elem()
}

func (i MultiClusterAppArray) ToMultiClusterAppArrayOutput() MultiClusterAppArrayOutput {
	return i.ToMultiClusterAppArrayOutputWithContext(context.Background())
}

func (i MultiClusterAppArray) ToMultiClusterAppArrayOutputWithContext(ctx context.Context) MultiClusterAppArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MultiClusterAppArrayOutput)
}

func (i MultiClusterAppArray) ToOutput(ctx context.Context) pulumix.Output[[]*MultiClusterApp] {
	return pulumix.Output[[]*MultiClusterApp]{
		OutputState: i.ToMultiClusterAppArrayOutputWithContext(ctx).OutputState,
	}
}

// MultiClusterAppMapInput is an input type that accepts MultiClusterAppMap and MultiClusterAppMapOutput values.
// You can construct a concrete instance of `MultiClusterAppMapInput` via:
//
//	MultiClusterAppMap{ "key": MultiClusterAppArgs{...} }
type MultiClusterAppMapInput interface {
	pulumi.Input

	ToMultiClusterAppMapOutput() MultiClusterAppMapOutput
	ToMultiClusterAppMapOutputWithContext(context.Context) MultiClusterAppMapOutput
}

type MultiClusterAppMap map[string]MultiClusterAppInput

func (MultiClusterAppMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MultiClusterApp)(nil)).Elem()
}

func (i MultiClusterAppMap) ToMultiClusterAppMapOutput() MultiClusterAppMapOutput {
	return i.ToMultiClusterAppMapOutputWithContext(context.Background())
}

func (i MultiClusterAppMap) ToMultiClusterAppMapOutputWithContext(ctx context.Context) MultiClusterAppMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MultiClusterAppMapOutput)
}

func (i MultiClusterAppMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*MultiClusterApp] {
	return pulumix.Output[map[string]*MultiClusterApp]{
		OutputState: i.ToMultiClusterAppMapOutputWithContext(ctx).OutputState,
	}
}

type MultiClusterAppOutput struct{ *pulumi.OutputState }

func (MultiClusterAppOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MultiClusterApp)(nil)).Elem()
}

func (o MultiClusterAppOutput) ToMultiClusterAppOutput() MultiClusterAppOutput {
	return o
}

func (o MultiClusterAppOutput) ToMultiClusterAppOutputWithContext(ctx context.Context) MultiClusterAppOutput {
	return o
}

func (o MultiClusterAppOutput) ToOutput(ctx context.Context) pulumix.Output[*MultiClusterApp] {
	return pulumix.Output[*MultiClusterApp]{
		OutputState: o.OutputState,
	}
}

// Annotations for multi cluster app object (map)
func (o MultiClusterAppOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v *MultiClusterApp) pulumi.MapOutput { return v.Annotations }).(pulumi.MapOutput)
}

// The multi cluster app answers (list)
func (o MultiClusterAppOutput) Answers() MultiClusterAppAnswerArrayOutput {
	return o.ApplyT(func(v *MultiClusterApp) MultiClusterAppAnswerArrayOutput { return v.Answers }).(MultiClusterAppAnswerArrayOutput)
}

// The multi cluster app catalog name (string)
func (o MultiClusterAppOutput) CatalogName() pulumi.StringOutput {
	return o.ApplyT(func(v *MultiClusterApp) pulumi.StringOutput { return v.CatalogName }).(pulumi.StringOutput)
}

// Labels for multi cluster app object (map)
func (o MultiClusterAppOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *MultiClusterApp) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// The multi cluster app answers (list)
func (o MultiClusterAppOutput) Members() MultiClusterAppMemberArrayOutput {
	return o.ApplyT(func(v *MultiClusterApp) MultiClusterAppMemberArrayOutput { return v.Members }).(MultiClusterAppMemberArrayOutput)
}

// The multi cluster app name (string)
func (o MultiClusterAppOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MultiClusterApp) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The multi cluster app revision history limit. Default `10` (int)
func (o MultiClusterAppOutput) RevisionHistoryLimit() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MultiClusterApp) pulumi.IntPtrOutput { return v.RevisionHistoryLimit }).(pulumi.IntPtrOutput)
}

// Current revision id for the multi cluster app (string)
func (o MultiClusterAppOutput) RevisionId() pulumi.StringOutput {
	return o.ApplyT(func(v *MultiClusterApp) pulumi.StringOutput { return v.RevisionId }).(pulumi.StringOutput)
}

// The multi cluster app roles (list)
func (o MultiClusterAppOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MultiClusterApp) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// The multi cluster app target projects (list)
func (o MultiClusterAppOutput) Targets() MultiClusterAppTargetArrayOutput {
	return o.ApplyT(func(v *MultiClusterApp) MultiClusterAppTargetArrayOutput { return v.Targets }).(MultiClusterAppTargetArrayOutput)
}

// The multi cluster app template name (string)
func (o MultiClusterAppOutput) TemplateName() pulumi.StringOutput {
	return o.ApplyT(func(v *MultiClusterApp) pulumi.StringOutput { return v.TemplateName }).(pulumi.StringOutput)
}

// The multi cluster app template version. Default: `latest` (string)
func (o MultiClusterAppOutput) TemplateVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *MultiClusterApp) pulumi.StringOutput { return v.TemplateVersion }).(pulumi.StringOutput)
}

// (Computed) The multi cluster app template version ID (string)
func (o MultiClusterAppOutput) TemplateVersionId() pulumi.StringOutput {
	return o.ApplyT(func(v *MultiClusterApp) pulumi.StringOutput { return v.TemplateVersionId }).(pulumi.StringOutput)
}

// The multi cluster app upgrade strategy (list MaxItems:1)
func (o MultiClusterAppOutput) UpgradeStrategy() MultiClusterAppUpgradeStrategyOutput {
	return o.ApplyT(func(v *MultiClusterApp) MultiClusterAppUpgradeStrategyOutput { return v.UpgradeStrategy }).(MultiClusterAppUpgradeStrategyOutput)
}

// Wait until the multi cluster app is active. Default `true` (bool)
func (o MultiClusterAppOutput) Wait() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MultiClusterApp) pulumi.BoolPtrOutput { return v.Wait }).(pulumi.BoolPtrOutput)
}

type MultiClusterAppArrayOutput struct{ *pulumi.OutputState }

func (MultiClusterAppArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MultiClusterApp)(nil)).Elem()
}

func (o MultiClusterAppArrayOutput) ToMultiClusterAppArrayOutput() MultiClusterAppArrayOutput {
	return o
}

func (o MultiClusterAppArrayOutput) ToMultiClusterAppArrayOutputWithContext(ctx context.Context) MultiClusterAppArrayOutput {
	return o
}

func (o MultiClusterAppArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*MultiClusterApp] {
	return pulumix.Output[[]*MultiClusterApp]{
		OutputState: o.OutputState,
	}
}

func (o MultiClusterAppArrayOutput) Index(i pulumi.IntInput) MultiClusterAppOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MultiClusterApp {
		return vs[0].([]*MultiClusterApp)[vs[1].(int)]
	}).(MultiClusterAppOutput)
}

type MultiClusterAppMapOutput struct{ *pulumi.OutputState }

func (MultiClusterAppMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MultiClusterApp)(nil)).Elem()
}

func (o MultiClusterAppMapOutput) ToMultiClusterAppMapOutput() MultiClusterAppMapOutput {
	return o
}

func (o MultiClusterAppMapOutput) ToMultiClusterAppMapOutputWithContext(ctx context.Context) MultiClusterAppMapOutput {
	return o
}

func (o MultiClusterAppMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*MultiClusterApp] {
	return pulumix.Output[map[string]*MultiClusterApp]{
		OutputState: o.OutputState,
	}
}

func (o MultiClusterAppMapOutput) MapIndex(k pulumi.StringInput) MultiClusterAppOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MultiClusterApp {
		return vs[0].(map[string]*MultiClusterApp)[vs[1].(string)]
	}).(MultiClusterAppOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MultiClusterAppInput)(nil)).Elem(), &MultiClusterApp{})
	pulumi.RegisterInputType(reflect.TypeOf((*MultiClusterAppArrayInput)(nil)).Elem(), MultiClusterAppArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MultiClusterAppMapInput)(nil)).Elem(), MultiClusterAppMap{})
	pulumi.RegisterOutputType(MultiClusterAppOutput{})
	pulumi.RegisterOutputType(MultiClusterAppArrayOutput{})
	pulumi.RegisterOutputType(MultiClusterAppMapOutput{})
}
