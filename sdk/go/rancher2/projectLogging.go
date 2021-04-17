// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Project Logging resource. This can be used to create Project Logging for Rancher v2 environments and retrieve their information.
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
// 		_, err := rancher2.NewProjectLogging(ctx, "foo", &rancher2.ProjectLoggingArgs{
// 			Kind:      pulumi.String("syslog"),
// 			ProjectId: pulumi.String("<project_id>"),
// 			SyslogConfig: &rancher2.ProjectLoggingSyslogConfigArgs{
// 				Endpoint:  pulumi.String("<syslog_endpoint>"),
// 				Protocol:  pulumi.String("udp"),
// 				Severity:  pulumi.String("notice"),
// 				SslVerify: pulumi.Bool(false),
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
// Project Logging can be imported using the Rancher Project Logging ID
//
// ```sh
//  $ pulumi import rancher2:index/projectLogging:ProjectLogging foo &lt;project_logging_id&gt;
// ```
type ProjectLogging struct {
	pulumi.CustomResourceState

	// Annotations for Project Logging object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	CustomTargetConfig ProjectLoggingCustomTargetConfigPtrOutput `pulumi:"customTargetConfig"`
	// The elasticsearch config for Project Logging. For `kind = elasticsearch`. Conflicts with `customTargetConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	ElasticsearchConfig ProjectLoggingElasticsearchConfigPtrOutput `pulumi:"elasticsearchConfig"`
	// Enable json log parsing. Default: `false` (bool)
	EnableJsonParsing pulumi.BoolPtrOutput `pulumi:"enableJsonParsing"`
	// The fluentd config for Project Logging. For `kind = fluentd`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	FluentdConfig ProjectLoggingFluentdConfigPtrOutput `pulumi:"fluentdConfig"`
	// The kafka config for Project Logging. For `kind = kafka`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	KafkaConfig ProjectLoggingKafkaConfigPtrOutput `pulumi:"kafkaConfig"`
	// The kind of the Project Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
	Kind pulumi.StringOutput `pulumi:"kind"`
	// Labels for Project Logging object (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the Project Logging config (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The namespace id from Project logging (string)
	NamespaceId pulumi.StringPtrOutput `pulumi:"namespaceId"`
	// How often buffered logs would be flushed. Default: `3` seconds (int)
	OutputFlushInterval pulumi.IntPtrOutput `pulumi:"outputFlushInterval"`
	// The output tags for Project Logging (map)
	OutputTags pulumi.MapOutput `pulumi:"outputTags"`
	// The project id to configure logging (string)
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// The splunk config for Project Logging. For `kind = splunk`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `syslogConfig` (list maxitems:1)
	SplunkConfig ProjectLoggingSplunkConfigPtrOutput `pulumi:"splunkConfig"`
	// The syslog config for Project Logging. For `kind = syslog`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `splunkConfig` (list maxitems:1)
	SyslogConfig ProjectLoggingSyslogConfigPtrOutput `pulumi:"syslogConfig"`
}

// NewProjectLogging registers a new resource with the given unique name, arguments, and options.
func NewProjectLogging(ctx *pulumi.Context,
	name string, args *ProjectLoggingArgs, opts ...pulumi.ResourceOption) (*ProjectLogging, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Kind == nil {
		return nil, errors.New("invalid value for required argument 'Kind'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	var resource ProjectLogging
	err := ctx.RegisterResource("rancher2:index/projectLogging:ProjectLogging", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectLogging gets an existing ProjectLogging resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectLogging(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectLoggingState, opts ...pulumi.ResourceOption) (*ProjectLogging, error) {
	var resource ProjectLogging
	err := ctx.ReadResource("rancher2:index/projectLogging:ProjectLogging", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectLogging resources.
type projectLoggingState struct {
	// Annotations for Project Logging object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	CustomTargetConfig *ProjectLoggingCustomTargetConfig `pulumi:"customTargetConfig"`
	// The elasticsearch config for Project Logging. For `kind = elasticsearch`. Conflicts with `customTargetConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	ElasticsearchConfig *ProjectLoggingElasticsearchConfig `pulumi:"elasticsearchConfig"`
	// Enable json log parsing. Default: `false` (bool)
	EnableJsonParsing *bool `pulumi:"enableJsonParsing"`
	// The fluentd config for Project Logging. For `kind = fluentd`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	FluentdConfig *ProjectLoggingFluentdConfig `pulumi:"fluentdConfig"`
	// The kafka config for Project Logging. For `kind = kafka`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	KafkaConfig *ProjectLoggingKafkaConfig `pulumi:"kafkaConfig"`
	// The kind of the Project Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
	Kind *string `pulumi:"kind"`
	// Labels for Project Logging object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the Project Logging config (string)
	Name *string `pulumi:"name"`
	// The namespace id from Project logging (string)
	NamespaceId *string `pulumi:"namespaceId"`
	// How often buffered logs would be flushed. Default: `3` seconds (int)
	OutputFlushInterval *int `pulumi:"outputFlushInterval"`
	// The output tags for Project Logging (map)
	OutputTags map[string]interface{} `pulumi:"outputTags"`
	// The project id to configure logging (string)
	ProjectId *string `pulumi:"projectId"`
	// The splunk config for Project Logging. For `kind = splunk`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `syslogConfig` (list maxitems:1)
	SplunkConfig *ProjectLoggingSplunkConfig `pulumi:"splunkConfig"`
	// The syslog config for Project Logging. For `kind = syslog`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `splunkConfig` (list maxitems:1)
	SyslogConfig *ProjectLoggingSyslogConfig `pulumi:"syslogConfig"`
}

type ProjectLoggingState struct {
	// Annotations for Project Logging object (map)
	Annotations pulumi.MapInput
	// The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	CustomTargetConfig ProjectLoggingCustomTargetConfigPtrInput
	// The elasticsearch config for Project Logging. For `kind = elasticsearch`. Conflicts with `customTargetConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	ElasticsearchConfig ProjectLoggingElasticsearchConfigPtrInput
	// Enable json log parsing. Default: `false` (bool)
	EnableJsonParsing pulumi.BoolPtrInput
	// The fluentd config for Project Logging. For `kind = fluentd`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	FluentdConfig ProjectLoggingFluentdConfigPtrInput
	// The kafka config for Project Logging. For `kind = kafka`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	KafkaConfig ProjectLoggingKafkaConfigPtrInput
	// The kind of the Project Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
	Kind pulumi.StringPtrInput
	// Labels for Project Logging object (map)
	Labels pulumi.MapInput
	// The name of the Project Logging config (string)
	Name pulumi.StringPtrInput
	// The namespace id from Project logging (string)
	NamespaceId pulumi.StringPtrInput
	// How often buffered logs would be flushed. Default: `3` seconds (int)
	OutputFlushInterval pulumi.IntPtrInput
	// The output tags for Project Logging (map)
	OutputTags pulumi.MapInput
	// The project id to configure logging (string)
	ProjectId pulumi.StringPtrInput
	// The splunk config for Project Logging. For `kind = splunk`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `syslogConfig` (list maxitems:1)
	SplunkConfig ProjectLoggingSplunkConfigPtrInput
	// The syslog config for Project Logging. For `kind = syslog`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `splunkConfig` (list maxitems:1)
	SyslogConfig ProjectLoggingSyslogConfigPtrInput
}

func (ProjectLoggingState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectLoggingState)(nil)).Elem()
}

type projectLoggingArgs struct {
	// Annotations for Project Logging object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	CustomTargetConfig *ProjectLoggingCustomTargetConfig `pulumi:"customTargetConfig"`
	// The elasticsearch config for Project Logging. For `kind = elasticsearch`. Conflicts with `customTargetConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	ElasticsearchConfig *ProjectLoggingElasticsearchConfig `pulumi:"elasticsearchConfig"`
	// Enable json log parsing. Default: `false` (bool)
	EnableJsonParsing *bool `pulumi:"enableJsonParsing"`
	// The fluentd config for Project Logging. For `kind = fluentd`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	FluentdConfig *ProjectLoggingFluentdConfig `pulumi:"fluentdConfig"`
	// The kafka config for Project Logging. For `kind = kafka`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	KafkaConfig *ProjectLoggingKafkaConfig `pulumi:"kafkaConfig"`
	// The kind of the Project Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
	Kind string `pulumi:"kind"`
	// Labels for Project Logging object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the Project Logging config (string)
	Name *string `pulumi:"name"`
	// The namespace id from Project logging (string)
	NamespaceId *string `pulumi:"namespaceId"`
	// How often buffered logs would be flushed. Default: `3` seconds (int)
	OutputFlushInterval *int `pulumi:"outputFlushInterval"`
	// The output tags for Project Logging (map)
	OutputTags map[string]interface{} `pulumi:"outputTags"`
	// The project id to configure logging (string)
	ProjectId string `pulumi:"projectId"`
	// The splunk config for Project Logging. For `kind = splunk`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `syslogConfig` (list maxitems:1)
	SplunkConfig *ProjectLoggingSplunkConfig `pulumi:"splunkConfig"`
	// The syslog config for Project Logging. For `kind = syslog`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `splunkConfig` (list maxitems:1)
	SyslogConfig *ProjectLoggingSyslogConfig `pulumi:"syslogConfig"`
}

// The set of arguments for constructing a ProjectLogging resource.
type ProjectLoggingArgs struct {
	// Annotations for Project Logging object (map)
	Annotations pulumi.MapInput
	// The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	CustomTargetConfig ProjectLoggingCustomTargetConfigPtrInput
	// The elasticsearch config for Project Logging. For `kind = elasticsearch`. Conflicts with `customTargetConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	ElasticsearchConfig ProjectLoggingElasticsearchConfigPtrInput
	// Enable json log parsing. Default: `false` (bool)
	EnableJsonParsing pulumi.BoolPtrInput
	// The fluentd config for Project Logging. For `kind = fluentd`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	FluentdConfig ProjectLoggingFluentdConfigPtrInput
	// The kafka config for Project Logging. For `kind = kafka`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	KafkaConfig ProjectLoggingKafkaConfigPtrInput
	// The kind of the Project Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
	Kind pulumi.StringInput
	// Labels for Project Logging object (map)
	Labels pulumi.MapInput
	// The name of the Project Logging config (string)
	Name pulumi.StringPtrInput
	// The namespace id from Project logging (string)
	NamespaceId pulumi.StringPtrInput
	// How often buffered logs would be flushed. Default: `3` seconds (int)
	OutputFlushInterval pulumi.IntPtrInput
	// The output tags for Project Logging (map)
	OutputTags pulumi.MapInput
	// The project id to configure logging (string)
	ProjectId pulumi.StringInput
	// The splunk config for Project Logging. For `kind = splunk`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `syslogConfig` (list maxitems:1)
	SplunkConfig ProjectLoggingSplunkConfigPtrInput
	// The syslog config for Project Logging. For `kind = syslog`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `splunkConfig` (list maxitems:1)
	SyslogConfig ProjectLoggingSyslogConfigPtrInput
}

func (ProjectLoggingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectLoggingArgs)(nil)).Elem()
}

type ProjectLoggingInput interface {
	pulumi.Input

	ToProjectLoggingOutput() ProjectLoggingOutput
	ToProjectLoggingOutputWithContext(ctx context.Context) ProjectLoggingOutput
}

func (*ProjectLogging) ElementType() reflect.Type {
	return reflect.TypeOf((*ProjectLogging)(nil))
}

func (i *ProjectLogging) ToProjectLoggingOutput() ProjectLoggingOutput {
	return i.ToProjectLoggingOutputWithContext(context.Background())
}

func (i *ProjectLogging) ToProjectLoggingOutputWithContext(ctx context.Context) ProjectLoggingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectLoggingOutput)
}

func (i *ProjectLogging) ToProjectLoggingPtrOutput() ProjectLoggingPtrOutput {
	return i.ToProjectLoggingPtrOutputWithContext(context.Background())
}

func (i *ProjectLogging) ToProjectLoggingPtrOutputWithContext(ctx context.Context) ProjectLoggingPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectLoggingPtrOutput)
}

type ProjectLoggingPtrInput interface {
	pulumi.Input

	ToProjectLoggingPtrOutput() ProjectLoggingPtrOutput
	ToProjectLoggingPtrOutputWithContext(ctx context.Context) ProjectLoggingPtrOutput
}

type projectLoggingPtrType ProjectLoggingArgs

func (*projectLoggingPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectLogging)(nil))
}

func (i *projectLoggingPtrType) ToProjectLoggingPtrOutput() ProjectLoggingPtrOutput {
	return i.ToProjectLoggingPtrOutputWithContext(context.Background())
}

func (i *projectLoggingPtrType) ToProjectLoggingPtrOutputWithContext(ctx context.Context) ProjectLoggingPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectLoggingPtrOutput)
}

// ProjectLoggingArrayInput is an input type that accepts ProjectLoggingArray and ProjectLoggingArrayOutput values.
// You can construct a concrete instance of `ProjectLoggingArrayInput` via:
//
//          ProjectLoggingArray{ ProjectLoggingArgs{...} }
type ProjectLoggingArrayInput interface {
	pulumi.Input

	ToProjectLoggingArrayOutput() ProjectLoggingArrayOutput
	ToProjectLoggingArrayOutputWithContext(context.Context) ProjectLoggingArrayOutput
}

type ProjectLoggingArray []ProjectLoggingInput

func (ProjectLoggingArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*ProjectLogging)(nil))
}

func (i ProjectLoggingArray) ToProjectLoggingArrayOutput() ProjectLoggingArrayOutput {
	return i.ToProjectLoggingArrayOutputWithContext(context.Background())
}

func (i ProjectLoggingArray) ToProjectLoggingArrayOutputWithContext(ctx context.Context) ProjectLoggingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectLoggingArrayOutput)
}

// ProjectLoggingMapInput is an input type that accepts ProjectLoggingMap and ProjectLoggingMapOutput values.
// You can construct a concrete instance of `ProjectLoggingMapInput` via:
//
//          ProjectLoggingMap{ "key": ProjectLoggingArgs{...} }
type ProjectLoggingMapInput interface {
	pulumi.Input

	ToProjectLoggingMapOutput() ProjectLoggingMapOutput
	ToProjectLoggingMapOutputWithContext(context.Context) ProjectLoggingMapOutput
}

type ProjectLoggingMap map[string]ProjectLoggingInput

func (ProjectLoggingMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*ProjectLogging)(nil))
}

func (i ProjectLoggingMap) ToProjectLoggingMapOutput() ProjectLoggingMapOutput {
	return i.ToProjectLoggingMapOutputWithContext(context.Background())
}

func (i ProjectLoggingMap) ToProjectLoggingMapOutputWithContext(ctx context.Context) ProjectLoggingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectLoggingMapOutput)
}

type ProjectLoggingOutput struct {
	*pulumi.OutputState
}

func (ProjectLoggingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProjectLogging)(nil))
}

func (o ProjectLoggingOutput) ToProjectLoggingOutput() ProjectLoggingOutput {
	return o
}

func (o ProjectLoggingOutput) ToProjectLoggingOutputWithContext(ctx context.Context) ProjectLoggingOutput {
	return o
}

func (o ProjectLoggingOutput) ToProjectLoggingPtrOutput() ProjectLoggingPtrOutput {
	return o.ToProjectLoggingPtrOutputWithContext(context.Background())
}

func (o ProjectLoggingOutput) ToProjectLoggingPtrOutputWithContext(ctx context.Context) ProjectLoggingPtrOutput {
	return o.ApplyT(func(v ProjectLogging) *ProjectLogging {
		return &v
	}).(ProjectLoggingPtrOutput)
}

type ProjectLoggingPtrOutput struct {
	*pulumi.OutputState
}

func (ProjectLoggingPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectLogging)(nil))
}

func (o ProjectLoggingPtrOutput) ToProjectLoggingPtrOutput() ProjectLoggingPtrOutput {
	return o
}

func (o ProjectLoggingPtrOutput) ToProjectLoggingPtrOutputWithContext(ctx context.Context) ProjectLoggingPtrOutput {
	return o
}

type ProjectLoggingArrayOutput struct{ *pulumi.OutputState }

func (ProjectLoggingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ProjectLogging)(nil))
}

func (o ProjectLoggingArrayOutput) ToProjectLoggingArrayOutput() ProjectLoggingArrayOutput {
	return o
}

func (o ProjectLoggingArrayOutput) ToProjectLoggingArrayOutputWithContext(ctx context.Context) ProjectLoggingArrayOutput {
	return o
}

func (o ProjectLoggingArrayOutput) Index(i pulumi.IntInput) ProjectLoggingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ProjectLogging {
		return vs[0].([]ProjectLogging)[vs[1].(int)]
	}).(ProjectLoggingOutput)
}

type ProjectLoggingMapOutput struct{ *pulumi.OutputState }

func (ProjectLoggingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ProjectLogging)(nil))
}

func (o ProjectLoggingMapOutput) ToProjectLoggingMapOutput() ProjectLoggingMapOutput {
	return o
}

func (o ProjectLoggingMapOutput) ToProjectLoggingMapOutputWithContext(ctx context.Context) ProjectLoggingMapOutput {
	return o
}

func (o ProjectLoggingMapOutput) MapIndex(k pulumi.StringInput) ProjectLoggingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ProjectLogging {
		return vs[0].(map[string]ProjectLogging)[vs[1].(string)]
	}).(ProjectLoggingOutput)
}

func init() {
	pulumi.RegisterOutputType(ProjectLoggingOutput{})
	pulumi.RegisterOutputType(ProjectLoggingPtrOutput{})
	pulumi.RegisterOutputType(ProjectLoggingArrayOutput{})
	pulumi.RegisterOutputType(ProjectLoggingMapOutput{})
}
