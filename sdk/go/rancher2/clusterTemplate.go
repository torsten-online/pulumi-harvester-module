// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Cluster Template resource. This can be used to create Cluster Templates for Rancher v2 RKE clusters and retrieve their information.
//
// Cluster Templates are available from Rancher v2.3.x and above.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-rancher2/sdk/v3/go/rancher2"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := rancher2.NewClusterTemplate(ctx, "foo", &rancher2.ClusterTemplateArgs{
// 			Description: pulumi.String("Terraform cluster template foo"),
// 			Members: rancher2.ClusterTemplateMemberArray{
// 				&rancher2.ClusterTemplateMemberArgs{
// 					AccessType:      pulumi.String("owner"),
// 					UserPrincipalId: pulumi.String("local://user-XXXXX"),
// 				},
// 			},
// 			TemplateRevisions: rancher2.ClusterTemplateTemplateRevisionArray{
// 				&rancher2.ClusterTemplateTemplateRevisionArgs{
// 					ClusterConfig: &rancher2.ClusterTemplateTemplateRevisionClusterConfigArgs{
// 						RkeConfig: &rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigArgs{
// 							Network: &rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkArgs{
// 								Plugin: pulumi.String("canal"),
// 							},
// 							Services: &rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs{
// 								Etcd: &rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdArgs{
// 									Creation:  pulumi.String("6h"),
// 									Retention: pulumi.String("24h"),
// 								},
// 							},
// 						},
// 					},
// 					Default: pulumi.Bool(true),
// 					Name:    pulumi.String("V1"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// Creating Rancher v2 RKE cluster template with upgrade strategy. For Rancher v2.4.x or above.
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-rancher2/sdk/v3/go/rancher2"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := rancher2.NewClusterTemplate(ctx, "foo", &rancher2.ClusterTemplateArgs{
// 			Description: pulumi.String("Terraform cluster template foo"),
// 			Members: rancher2.ClusterTemplateMemberArray{
// 				&rancher2.ClusterTemplateMemberArgs{
// 					AccessType:      pulumi.String("owner"),
// 					UserPrincipalId: pulumi.String("local://user-XXXXX"),
// 				},
// 			},
// 			TemplateRevisions: rancher2.ClusterTemplateTemplateRevisionArray{
// 				&rancher2.ClusterTemplateTemplateRevisionArgs{
// 					ClusterConfig: &rancher2.ClusterTemplateTemplateRevisionClusterConfigArgs{
// 						RkeConfig: &rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigArgs{
// 							Network: &rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkArgs{
// 								Plugin: pulumi.String("canal"),
// 							},
// 							Services: &rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs{
// 								Etcd: &rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdArgs{
// 									Creation:  pulumi.String("6h"),
// 									Retention: pulumi.String("24h"),
// 								},
// 							},
// 							UpgradeStrategy: &rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategyArgs{
// 								Drain:                pulumi.Bool(true),
// 								MaxUnavailableWorker: pulumi.String(fmt.Sprintf("%v%v", "20", "%")),
// 							},
// 						},
// 					},
// 					Default: pulumi.Bool(true),
// 					Name:    pulumi.String("V1"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// Creating Rancher v2 RKE cluster template with scheduled cluster scan. For Rancher v2.4.x or above.
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-rancher2/sdk/v3/go/rancher2"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := rancher2.NewClusterTemplate(ctx, "foo", &rancher2.ClusterTemplateArgs{
// 			Description: pulumi.String("Terraform cluster template foo"),
// 			Members: rancher2.ClusterTemplateMemberArray{
// 				&rancher2.ClusterTemplateMemberArgs{
// 					AccessType:      pulumi.String("owner"),
// 					UserPrincipalId: pulumi.String("local://user-XXXXX"),
// 				},
// 			},
// 			TemplateRevisions: rancher2.ClusterTemplateTemplateRevisionArray{
// 				&rancher2.ClusterTemplateTemplateRevisionArgs{
// 					ClusterConfig: &rancher2.ClusterTemplateTemplateRevisionClusterConfigArgs{
// 						RkeConfig: &rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigArgs{
// 							Network: &rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkArgs{
// 								Plugin: pulumi.String("canal"),
// 							},
// 							Services: &rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs{
// 								Etcd: &rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdArgs{
// 									Creation:  pulumi.String("6h"),
// 									Retention: pulumi.String("24h"),
// 								},
// 							},
// 						},
// 						ScheduledClusterScan: &rancher2.ClusterTemplateTemplateRevisionClusterConfigScheduledClusterScanArgs{
// 							Enabled: pulumi.Bool(true),
// 							ScanConfig: &rancher2.ClusterTemplateTemplateRevisionClusterConfigScheduledClusterScanScanConfigArgs{
// 								CisScanConfig: &rancher2.ClusterTemplateTemplateRevisionClusterConfigScheduledClusterScanScanConfigCisScanConfigArgs{
// 									DebugMaster: pulumi.Bool(true),
// 									DebugWorker: pulumi.Bool(true),
// 								},
// 							},
// 							ScheduleConfig: &rancher2.ClusterTemplateTemplateRevisionClusterConfigScheduledClusterScanScheduleConfigArgs{
// 								CronSchedule: pulumi.String("30 * * * *"),
// 								Retention:    pulumi.Int(5),
// 							},
// 						},
// 					},
// 					Default: pulumi.Bool(true),
// 					Name:    pulumi.String("V1"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Cluster Template can be imported using the rancher Cluster Template ID
//
// ```sh
//  $ pulumi import rancher2:index/clusterTemplate:ClusterTemplate foo &lt;CLUSTER_TEMPLATE_ID&gt;
// ```
type ClusterTemplate struct {
	pulumi.CustomResourceState

	// Annotations for the cluster template revision (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// (Computed) Default cluster template revision ID (string)
	DefaultRevisionId pulumi.StringOutput `pulumi:"defaultRevisionId"`
	// Cluster template description
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Labels for the cluster template revision (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Cluster template members (list)
	Members ClusterTemplateMemberArrayOutput `pulumi:"members"`
	// The cluster template revision name (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// Cluster template revisions (list)
	TemplateRevisions ClusterTemplateTemplateRevisionArrayOutput `pulumi:"templateRevisions"`
}

// NewClusterTemplate registers a new resource with the given unique name, arguments, and options.
func NewClusterTemplate(ctx *pulumi.Context,
	name string, args *ClusterTemplateArgs, opts ...pulumi.ResourceOption) (*ClusterTemplate, error) {
	if args == nil {
		args = &ClusterTemplateArgs{}
	}

	var resource ClusterTemplate
	err := ctx.RegisterResource("rancher2:index/clusterTemplate:ClusterTemplate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterTemplate gets an existing ClusterTemplate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterTemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterTemplateState, opts ...pulumi.ResourceOption) (*ClusterTemplate, error) {
	var resource ClusterTemplate
	err := ctx.ReadResource("rancher2:index/clusterTemplate:ClusterTemplate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterTemplate resources.
type clusterTemplateState struct {
	// Annotations for the cluster template revision (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// (Computed) Default cluster template revision ID (string)
	DefaultRevisionId *string `pulumi:"defaultRevisionId"`
	// Cluster template description
	Description *string `pulumi:"description"`
	// Labels for the cluster template revision (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Cluster template members (list)
	Members []ClusterTemplateMember `pulumi:"members"`
	// The cluster template revision name (string)
	Name *string `pulumi:"name"`
	// Cluster template revisions (list)
	TemplateRevisions []ClusterTemplateTemplateRevision `pulumi:"templateRevisions"`
}

type ClusterTemplateState struct {
	// Annotations for the cluster template revision (map)
	Annotations pulumi.MapInput
	// (Computed) Default cluster template revision ID (string)
	DefaultRevisionId pulumi.StringPtrInput
	// Cluster template description
	Description pulumi.StringPtrInput
	// Labels for the cluster template revision (map)
	Labels pulumi.MapInput
	// Cluster template members (list)
	Members ClusterTemplateMemberArrayInput
	// The cluster template revision name (string)
	Name pulumi.StringPtrInput
	// Cluster template revisions (list)
	TemplateRevisions ClusterTemplateTemplateRevisionArrayInput
}

func (ClusterTemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterTemplateState)(nil)).Elem()
}

type clusterTemplateArgs struct {
	// Annotations for the cluster template revision (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// Cluster template description
	Description *string `pulumi:"description"`
	// Labels for the cluster template revision (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// Cluster template members (list)
	Members []ClusterTemplateMember `pulumi:"members"`
	// The cluster template revision name (string)
	Name *string `pulumi:"name"`
	// Cluster template revisions (list)
	TemplateRevisions []ClusterTemplateTemplateRevision `pulumi:"templateRevisions"`
}

// The set of arguments for constructing a ClusterTemplate resource.
type ClusterTemplateArgs struct {
	// Annotations for the cluster template revision (map)
	Annotations pulumi.MapInput
	// Cluster template description
	Description pulumi.StringPtrInput
	// Labels for the cluster template revision (map)
	Labels pulumi.MapInput
	// Cluster template members (list)
	Members ClusterTemplateMemberArrayInput
	// The cluster template revision name (string)
	Name pulumi.StringPtrInput
	// Cluster template revisions (list)
	TemplateRevisions ClusterTemplateTemplateRevisionArrayInput
}

func (ClusterTemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterTemplateArgs)(nil)).Elem()
}

type ClusterTemplateInput interface {
	pulumi.Input

	ToClusterTemplateOutput() ClusterTemplateOutput
	ToClusterTemplateOutputWithContext(ctx context.Context) ClusterTemplateOutput
}

func (*ClusterTemplate) ElementType() reflect.Type {
	return reflect.TypeOf((*ClusterTemplate)(nil))
}

func (i *ClusterTemplate) ToClusterTemplateOutput() ClusterTemplateOutput {
	return i.ToClusterTemplateOutputWithContext(context.Background())
}

func (i *ClusterTemplate) ToClusterTemplateOutputWithContext(ctx context.Context) ClusterTemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterTemplateOutput)
}

func (i *ClusterTemplate) ToClusterTemplatePtrOutput() ClusterTemplatePtrOutput {
	return i.ToClusterTemplatePtrOutputWithContext(context.Background())
}

func (i *ClusterTemplate) ToClusterTemplatePtrOutputWithContext(ctx context.Context) ClusterTemplatePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterTemplatePtrOutput)
}

type ClusterTemplatePtrInput interface {
	pulumi.Input

	ToClusterTemplatePtrOutput() ClusterTemplatePtrOutput
	ToClusterTemplatePtrOutputWithContext(ctx context.Context) ClusterTemplatePtrOutput
}

type clusterTemplatePtrType ClusterTemplateArgs

func (*clusterTemplatePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterTemplate)(nil))
}

func (i *clusterTemplatePtrType) ToClusterTemplatePtrOutput() ClusterTemplatePtrOutput {
	return i.ToClusterTemplatePtrOutputWithContext(context.Background())
}

func (i *clusterTemplatePtrType) ToClusterTemplatePtrOutputWithContext(ctx context.Context) ClusterTemplatePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterTemplatePtrOutput)
}

// ClusterTemplateArrayInput is an input type that accepts ClusterTemplateArray and ClusterTemplateArrayOutput values.
// You can construct a concrete instance of `ClusterTemplateArrayInput` via:
//
//          ClusterTemplateArray{ ClusterTemplateArgs{...} }
type ClusterTemplateArrayInput interface {
	pulumi.Input

	ToClusterTemplateArrayOutput() ClusterTemplateArrayOutput
	ToClusterTemplateArrayOutputWithContext(context.Context) ClusterTemplateArrayOutput
}

type ClusterTemplateArray []ClusterTemplateInput

func (ClusterTemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*ClusterTemplate)(nil))
}

func (i ClusterTemplateArray) ToClusterTemplateArrayOutput() ClusterTemplateArrayOutput {
	return i.ToClusterTemplateArrayOutputWithContext(context.Background())
}

func (i ClusterTemplateArray) ToClusterTemplateArrayOutputWithContext(ctx context.Context) ClusterTemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterTemplateArrayOutput)
}

// ClusterTemplateMapInput is an input type that accepts ClusterTemplateMap and ClusterTemplateMapOutput values.
// You can construct a concrete instance of `ClusterTemplateMapInput` via:
//
//          ClusterTemplateMap{ "key": ClusterTemplateArgs{...} }
type ClusterTemplateMapInput interface {
	pulumi.Input

	ToClusterTemplateMapOutput() ClusterTemplateMapOutput
	ToClusterTemplateMapOutputWithContext(context.Context) ClusterTemplateMapOutput
}

type ClusterTemplateMap map[string]ClusterTemplateInput

func (ClusterTemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*ClusterTemplate)(nil))
}

func (i ClusterTemplateMap) ToClusterTemplateMapOutput() ClusterTemplateMapOutput {
	return i.ToClusterTemplateMapOutputWithContext(context.Background())
}

func (i ClusterTemplateMap) ToClusterTemplateMapOutputWithContext(ctx context.Context) ClusterTemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterTemplateMapOutput)
}

type ClusterTemplateOutput struct {
	*pulumi.OutputState
}

func (ClusterTemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ClusterTemplate)(nil))
}

func (o ClusterTemplateOutput) ToClusterTemplateOutput() ClusterTemplateOutput {
	return o
}

func (o ClusterTemplateOutput) ToClusterTemplateOutputWithContext(ctx context.Context) ClusterTemplateOutput {
	return o
}

func (o ClusterTemplateOutput) ToClusterTemplatePtrOutput() ClusterTemplatePtrOutput {
	return o.ToClusterTemplatePtrOutputWithContext(context.Background())
}

func (o ClusterTemplateOutput) ToClusterTemplatePtrOutputWithContext(ctx context.Context) ClusterTemplatePtrOutput {
	return o.ApplyT(func(v ClusterTemplate) *ClusterTemplate {
		return &v
	}).(ClusterTemplatePtrOutput)
}

type ClusterTemplatePtrOutput struct {
	*pulumi.OutputState
}

func (ClusterTemplatePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterTemplate)(nil))
}

func (o ClusterTemplatePtrOutput) ToClusterTemplatePtrOutput() ClusterTemplatePtrOutput {
	return o
}

func (o ClusterTemplatePtrOutput) ToClusterTemplatePtrOutputWithContext(ctx context.Context) ClusterTemplatePtrOutput {
	return o
}

type ClusterTemplateArrayOutput struct{ *pulumi.OutputState }

func (ClusterTemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ClusterTemplate)(nil))
}

func (o ClusterTemplateArrayOutput) ToClusterTemplateArrayOutput() ClusterTemplateArrayOutput {
	return o
}

func (o ClusterTemplateArrayOutput) ToClusterTemplateArrayOutputWithContext(ctx context.Context) ClusterTemplateArrayOutput {
	return o
}

func (o ClusterTemplateArrayOutput) Index(i pulumi.IntInput) ClusterTemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ClusterTemplate {
		return vs[0].([]ClusterTemplate)[vs[1].(int)]
	}).(ClusterTemplateOutput)
}

type ClusterTemplateMapOutput struct{ *pulumi.OutputState }

func (ClusterTemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ClusterTemplate)(nil))
}

func (o ClusterTemplateMapOutput) ToClusterTemplateMapOutput() ClusterTemplateMapOutput {
	return o
}

func (o ClusterTemplateMapOutput) ToClusterTemplateMapOutputWithContext(ctx context.Context) ClusterTemplateMapOutput {
	return o
}

func (o ClusterTemplateMapOutput) MapIndex(k pulumi.StringInput) ClusterTemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ClusterTemplate {
		return vs[0].(map[string]ClusterTemplate)[vs[1].(string)]
	}).(ClusterTemplateOutput)
}

func init() {
	pulumi.RegisterOutputType(ClusterTemplateOutput{})
	pulumi.RegisterOutputType(ClusterTemplatePtrOutput{})
	pulumi.RegisterOutputType(ClusterTemplateArrayOutput{})
	pulumi.RegisterOutputType(ClusterTemplateMapOutput{})
}
