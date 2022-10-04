// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Rancher v2 Cluster Logging resource. This can be used to configure Cluster Logging for Rancher v2 environments and retrieve their information.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-rancher2/sdk/v3/go/rancher2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rancher2.NewClusterLogging(ctx, "foo", &rancher2.ClusterLoggingArgs{
//				ClusterId: pulumi.String("<cluster_id>"),
//				Kind:      pulumi.String("syslog"),
//				SyslogConfig: &ClusterLoggingSyslogConfigArgs{
//					Endpoint:  pulumi.String("<syslog_endpoint>"),
//					Protocol:  pulumi.String("udp"),
//					Severity:  pulumi.String("notice"),
//					SslVerify: pulumi.Bool(false),
//				},
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
// # Cluster Logging can be imported using the Rancher Cluster Logging ID
//
// ```sh
//
//	$ pulumi import rancher2:index/clusterLogging:ClusterLogging foo &lt;CLUSTER_LOGGING_ID&gt;
//
// ```
type ClusterLogging struct {
	pulumi.CustomResourceState

	// Annotations for Cluster Logging object (map)
	Annotations pulumi.MapOutput `pulumi:"annotations"`
	// The cluster id to configure logging (string)
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	CustomTargetConfig ClusterLoggingCustomTargetConfigPtrOutput `pulumi:"customTargetConfig"`
	// The elasticsearch config for Cluster Logging. For `kind = elasticsearch`. Conflicts with `customTargetConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	ElasticsearchConfig ClusterLoggingElasticsearchConfigPtrOutput `pulumi:"elasticsearchConfig"`
	// Enable json log parsing. Default: `false` (bool)
	EnableJsonParsing pulumi.BoolPtrOutput `pulumi:"enableJsonParsing"`
	// The fluentd config for Cluster Logging. For `kind = fluentd`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	FluentdConfig ClusterLoggingFluentdConfigPtrOutput `pulumi:"fluentdConfig"`
	// The kafka config for Cluster Logging. For `kind = kafka`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	KafkaConfig ClusterLoggingKafkaConfigPtrOutput `pulumi:"kafkaConfig"`
	// The kind of the Cluster Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
	Kind pulumi.StringOutput `pulumi:"kind"`
	// Labels for Cluster Logging object (map)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The name of the cluster logging config (string)
	Name pulumi.StringOutput `pulumi:"name"`
	// The namespace id from cluster logging (string)
	NamespaceId pulumi.StringPtrOutput `pulumi:"namespaceId"`
	// How often buffered logs would be flushed. Default: `3` seconds (int)
	OutputFlushInterval pulumi.IntPtrOutput `pulumi:"outputFlushInterval"`
	// The output tags for Cluster Logging (map)
	OutputTags pulumi.MapOutput `pulumi:"outputTags"`
	// The splunk config for Cluster Logging. For `kind = splunk`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `syslogConfig` (list maxitems:1)
	SplunkConfig ClusterLoggingSplunkConfigPtrOutput `pulumi:"splunkConfig"`
	// The syslog config for Cluster Logging. For `kind = syslog`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `splunkConfig` (list maxitems:1)
	SyslogConfig ClusterLoggingSyslogConfigPtrOutput `pulumi:"syslogConfig"`
}

// NewClusterLogging registers a new resource with the given unique name, arguments, and options.
func NewClusterLogging(ctx *pulumi.Context,
	name string, args *ClusterLoggingArgs, opts ...pulumi.ResourceOption) (*ClusterLogging, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	if args.Kind == nil {
		return nil, errors.New("invalid value for required argument 'Kind'")
	}
	var resource ClusterLogging
	err := ctx.RegisterResource("rancher2:index/clusterLogging:ClusterLogging", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterLogging gets an existing ClusterLogging resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterLogging(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterLoggingState, opts ...pulumi.ResourceOption) (*ClusterLogging, error) {
	var resource ClusterLogging
	err := ctx.ReadResource("rancher2:index/clusterLogging:ClusterLogging", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterLogging resources.
type clusterLoggingState struct {
	// Annotations for Cluster Logging object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id to configure logging (string)
	ClusterId *string `pulumi:"clusterId"`
	// The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	CustomTargetConfig *ClusterLoggingCustomTargetConfig `pulumi:"customTargetConfig"`
	// The elasticsearch config for Cluster Logging. For `kind = elasticsearch`. Conflicts with `customTargetConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	ElasticsearchConfig *ClusterLoggingElasticsearchConfig `pulumi:"elasticsearchConfig"`
	// Enable json log parsing. Default: `false` (bool)
	EnableJsonParsing *bool `pulumi:"enableJsonParsing"`
	// The fluentd config for Cluster Logging. For `kind = fluentd`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	FluentdConfig *ClusterLoggingFluentdConfig `pulumi:"fluentdConfig"`
	// The kafka config for Cluster Logging. For `kind = kafka`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	KafkaConfig *ClusterLoggingKafkaConfig `pulumi:"kafkaConfig"`
	// The kind of the Cluster Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
	Kind *string `pulumi:"kind"`
	// Labels for Cluster Logging object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the cluster logging config (string)
	Name *string `pulumi:"name"`
	// The namespace id from cluster logging (string)
	NamespaceId *string `pulumi:"namespaceId"`
	// How often buffered logs would be flushed. Default: `3` seconds (int)
	OutputFlushInterval *int `pulumi:"outputFlushInterval"`
	// The output tags for Cluster Logging (map)
	OutputTags map[string]interface{} `pulumi:"outputTags"`
	// The splunk config for Cluster Logging. For `kind = splunk`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `syslogConfig` (list maxitems:1)
	SplunkConfig *ClusterLoggingSplunkConfig `pulumi:"splunkConfig"`
	// The syslog config for Cluster Logging. For `kind = syslog`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `splunkConfig` (list maxitems:1)
	SyslogConfig *ClusterLoggingSyslogConfig `pulumi:"syslogConfig"`
}

type ClusterLoggingState struct {
	// Annotations for Cluster Logging object (map)
	Annotations pulumi.MapInput
	// The cluster id to configure logging (string)
	ClusterId pulumi.StringPtrInput
	// The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	CustomTargetConfig ClusterLoggingCustomTargetConfigPtrInput
	// The elasticsearch config for Cluster Logging. For `kind = elasticsearch`. Conflicts with `customTargetConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	ElasticsearchConfig ClusterLoggingElasticsearchConfigPtrInput
	// Enable json log parsing. Default: `false` (bool)
	EnableJsonParsing pulumi.BoolPtrInput
	// The fluentd config for Cluster Logging. For `kind = fluentd`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	FluentdConfig ClusterLoggingFluentdConfigPtrInput
	// The kafka config for Cluster Logging. For `kind = kafka`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	KafkaConfig ClusterLoggingKafkaConfigPtrInput
	// The kind of the Cluster Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
	Kind pulumi.StringPtrInput
	// Labels for Cluster Logging object (map)
	Labels pulumi.MapInput
	// The name of the cluster logging config (string)
	Name pulumi.StringPtrInput
	// The namespace id from cluster logging (string)
	NamespaceId pulumi.StringPtrInput
	// How often buffered logs would be flushed. Default: `3` seconds (int)
	OutputFlushInterval pulumi.IntPtrInput
	// The output tags for Cluster Logging (map)
	OutputTags pulumi.MapInput
	// The splunk config for Cluster Logging. For `kind = splunk`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `syslogConfig` (list maxitems:1)
	SplunkConfig ClusterLoggingSplunkConfigPtrInput
	// The syslog config for Cluster Logging. For `kind = syslog`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `splunkConfig` (list maxitems:1)
	SyslogConfig ClusterLoggingSyslogConfigPtrInput
}

func (ClusterLoggingState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterLoggingState)(nil)).Elem()
}

type clusterLoggingArgs struct {
	// Annotations for Cluster Logging object (map)
	Annotations map[string]interface{} `pulumi:"annotations"`
	// The cluster id to configure logging (string)
	ClusterId string `pulumi:"clusterId"`
	// The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	CustomTargetConfig *ClusterLoggingCustomTargetConfig `pulumi:"customTargetConfig"`
	// The elasticsearch config for Cluster Logging. For `kind = elasticsearch`. Conflicts with `customTargetConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	ElasticsearchConfig *ClusterLoggingElasticsearchConfig `pulumi:"elasticsearchConfig"`
	// Enable json log parsing. Default: `false` (bool)
	EnableJsonParsing *bool `pulumi:"enableJsonParsing"`
	// The fluentd config for Cluster Logging. For `kind = fluentd`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	FluentdConfig *ClusterLoggingFluentdConfig `pulumi:"fluentdConfig"`
	// The kafka config for Cluster Logging. For `kind = kafka`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	KafkaConfig *ClusterLoggingKafkaConfig `pulumi:"kafkaConfig"`
	// The kind of the Cluster Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
	Kind string `pulumi:"kind"`
	// Labels for Cluster Logging object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// The name of the cluster logging config (string)
	Name *string `pulumi:"name"`
	// The namespace id from cluster logging (string)
	NamespaceId *string `pulumi:"namespaceId"`
	// How often buffered logs would be flushed. Default: `3` seconds (int)
	OutputFlushInterval *int `pulumi:"outputFlushInterval"`
	// The output tags for Cluster Logging (map)
	OutputTags map[string]interface{} `pulumi:"outputTags"`
	// The splunk config for Cluster Logging. For `kind = splunk`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `syslogConfig` (list maxitems:1)
	SplunkConfig *ClusterLoggingSplunkConfig `pulumi:"splunkConfig"`
	// The syslog config for Cluster Logging. For `kind = syslog`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `splunkConfig` (list maxitems:1)
	SyslogConfig *ClusterLoggingSyslogConfig `pulumi:"syslogConfig"`
}

// The set of arguments for constructing a ClusterLogging resource.
type ClusterLoggingArgs struct {
	// Annotations for Cluster Logging object (map)
	Annotations pulumi.MapInput
	// The cluster id to configure logging (string)
	ClusterId pulumi.StringInput
	// The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	CustomTargetConfig ClusterLoggingCustomTargetConfigPtrInput
	// The elasticsearch config for Cluster Logging. For `kind = elasticsearch`. Conflicts with `customTargetConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	ElasticsearchConfig ClusterLoggingElasticsearchConfigPtrInput
	// Enable json log parsing. Default: `false` (bool)
	EnableJsonParsing pulumi.BoolPtrInput
	// The fluentd config for Cluster Logging. For `kind = fluentd`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	FluentdConfig ClusterLoggingFluentdConfigPtrInput
	// The kafka config for Cluster Logging. For `kind = kafka`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
	KafkaConfig ClusterLoggingKafkaConfigPtrInput
	// The kind of the Cluster Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
	Kind pulumi.StringInput
	// Labels for Cluster Logging object (map)
	Labels pulumi.MapInput
	// The name of the cluster logging config (string)
	Name pulumi.StringPtrInput
	// The namespace id from cluster logging (string)
	NamespaceId pulumi.StringPtrInput
	// How often buffered logs would be flushed. Default: `3` seconds (int)
	OutputFlushInterval pulumi.IntPtrInput
	// The output tags for Cluster Logging (map)
	OutputTags pulumi.MapInput
	// The splunk config for Cluster Logging. For `kind = splunk`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `syslogConfig` (list maxitems:1)
	SplunkConfig ClusterLoggingSplunkConfigPtrInput
	// The syslog config for Cluster Logging. For `kind = syslog`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `splunkConfig` (list maxitems:1)
	SyslogConfig ClusterLoggingSyslogConfigPtrInput
}

func (ClusterLoggingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterLoggingArgs)(nil)).Elem()
}

type ClusterLoggingInput interface {
	pulumi.Input

	ToClusterLoggingOutput() ClusterLoggingOutput
	ToClusterLoggingOutputWithContext(ctx context.Context) ClusterLoggingOutput
}

func (*ClusterLogging) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterLogging)(nil)).Elem()
}

func (i *ClusterLogging) ToClusterLoggingOutput() ClusterLoggingOutput {
	return i.ToClusterLoggingOutputWithContext(context.Background())
}

func (i *ClusterLogging) ToClusterLoggingOutputWithContext(ctx context.Context) ClusterLoggingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterLoggingOutput)
}

// ClusterLoggingArrayInput is an input type that accepts ClusterLoggingArray and ClusterLoggingArrayOutput values.
// You can construct a concrete instance of `ClusterLoggingArrayInput` via:
//
//	ClusterLoggingArray{ ClusterLoggingArgs{...} }
type ClusterLoggingArrayInput interface {
	pulumi.Input

	ToClusterLoggingArrayOutput() ClusterLoggingArrayOutput
	ToClusterLoggingArrayOutputWithContext(context.Context) ClusterLoggingArrayOutput
}

type ClusterLoggingArray []ClusterLoggingInput

func (ClusterLoggingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterLogging)(nil)).Elem()
}

func (i ClusterLoggingArray) ToClusterLoggingArrayOutput() ClusterLoggingArrayOutput {
	return i.ToClusterLoggingArrayOutputWithContext(context.Background())
}

func (i ClusterLoggingArray) ToClusterLoggingArrayOutputWithContext(ctx context.Context) ClusterLoggingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterLoggingArrayOutput)
}

// ClusterLoggingMapInput is an input type that accepts ClusterLoggingMap and ClusterLoggingMapOutput values.
// You can construct a concrete instance of `ClusterLoggingMapInput` via:
//
//	ClusterLoggingMap{ "key": ClusterLoggingArgs{...} }
type ClusterLoggingMapInput interface {
	pulumi.Input

	ToClusterLoggingMapOutput() ClusterLoggingMapOutput
	ToClusterLoggingMapOutputWithContext(context.Context) ClusterLoggingMapOutput
}

type ClusterLoggingMap map[string]ClusterLoggingInput

func (ClusterLoggingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterLogging)(nil)).Elem()
}

func (i ClusterLoggingMap) ToClusterLoggingMapOutput() ClusterLoggingMapOutput {
	return i.ToClusterLoggingMapOutputWithContext(context.Background())
}

func (i ClusterLoggingMap) ToClusterLoggingMapOutputWithContext(ctx context.Context) ClusterLoggingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterLoggingMapOutput)
}

type ClusterLoggingOutput struct{ *pulumi.OutputState }

func (ClusterLoggingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterLogging)(nil)).Elem()
}

func (o ClusterLoggingOutput) ToClusterLoggingOutput() ClusterLoggingOutput {
	return o
}

func (o ClusterLoggingOutput) ToClusterLoggingOutputWithContext(ctx context.Context) ClusterLoggingOutput {
	return o
}

type ClusterLoggingArrayOutput struct{ *pulumi.OutputState }

func (ClusterLoggingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterLogging)(nil)).Elem()
}

func (o ClusterLoggingArrayOutput) ToClusterLoggingArrayOutput() ClusterLoggingArrayOutput {
	return o
}

func (o ClusterLoggingArrayOutput) ToClusterLoggingArrayOutputWithContext(ctx context.Context) ClusterLoggingArrayOutput {
	return o
}

func (o ClusterLoggingArrayOutput) Index(i pulumi.IntInput) ClusterLoggingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClusterLogging {
		return vs[0].([]*ClusterLogging)[vs[1].(int)]
	}).(ClusterLoggingOutput)
}

type ClusterLoggingMapOutput struct{ *pulumi.OutputState }

func (ClusterLoggingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterLogging)(nil)).Elem()
}

func (o ClusterLoggingMapOutput) ToClusterLoggingMapOutput() ClusterLoggingMapOutput {
	return o
}

func (o ClusterLoggingMapOutput) ToClusterLoggingMapOutputWithContext(ctx context.Context) ClusterLoggingMapOutput {
	return o
}

func (o ClusterLoggingMapOutput) MapIndex(k pulumi.StringInput) ClusterLoggingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClusterLogging {
		return vs[0].(map[string]*ClusterLogging)[vs[1].(string)]
	}).(ClusterLoggingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterLoggingInput)(nil)).Elem(), &ClusterLogging{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterLoggingArrayInput)(nil)).Elem(), ClusterLoggingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterLoggingMapInput)(nil)).Elem(), ClusterLoggingMap{})
	pulumi.RegisterOutputType(ClusterLoggingOutput{})
	pulumi.RegisterOutputType(ClusterLoggingArrayOutput{})
	pulumi.RegisterOutputType(ClusterLoggingMapOutput{})
}
