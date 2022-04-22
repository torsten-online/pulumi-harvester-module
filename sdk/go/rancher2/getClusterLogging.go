// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 Cluster Logging.
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
// 		_, err := rancher2.LookupClusterLogging(ctx, &GetClusterLoggingArgs{
// 			ClusterId: "<cluster_id>",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupClusterLogging(ctx *pulumi.Context, args *LookupClusterLoggingArgs, opts ...pulumi.InvokeOption) (*LookupClusterLoggingResult, error) {
	var rv LookupClusterLoggingResult
	err := ctx.Invoke("rancher2:index/getClusterLogging:getClusterLogging", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClusterLogging.
type LookupClusterLoggingArgs struct {
	// The cluster id to configure logging (string)
	ClusterId string `pulumi:"clusterId"`
}

// A collection of values returned by getClusterLogging.
type LookupClusterLoggingResult struct {
	// (Computed) Annotations for Cluster Logging object (map)
	Annotations        map[string]interface{}              `pulumi:"annotations"`
	ClusterId          string                              `pulumi:"clusterId"`
	CustomTargetConfig GetClusterLoggingCustomTargetConfig `pulumi:"customTargetConfig"`
	// (Computed) The elasticsearch config for Cluster Logging. For `kind = elasticsearch`  (list maxitems:1)
	ElasticsearchConfig GetClusterLoggingElasticsearchConfig `pulumi:"elasticsearchConfig"`
	EnableJsonParsing   bool                                 `pulumi:"enableJsonParsing"`
	// (Computed) The fluentd config for Cluster Logging. For `kind = fluentd` (list maxitems:1)
	FluentdConfig GetClusterLoggingFluentdConfig `pulumi:"fluentdConfig"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) The kafka config for Cluster Logging. For `kind = kafka` (list maxitems:1)
	KafkaConfig GetClusterLoggingKafkaConfig `pulumi:"kafkaConfig"`
	// (Computed) The kind of the Cluster Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
	Kind string `pulumi:"kind"`
	// (Computed) Labels for Cluster Logging object (map)
	Labels map[string]interface{} `pulumi:"labels"`
	// (Computed) The name of the cluster logging config (string)
	Name string `pulumi:"name"`
	// (Computed) The namespace id from cluster logging (string)
	NamespaceId string `pulumi:"namespaceId"`
	// (Computed) How often buffered logs would be flushed. Default: `3` seconds (int)
	OutputFlushInterval int `pulumi:"outputFlushInterval"`
	// (computed) The output tags for Cluster Logging (map)
	OutputTags map[string]interface{} `pulumi:"outputTags"`
	// (Computed) The splunk config for Cluster Logging. For `kind = splunk` (list maxitems:1)
	SplunkConfig GetClusterLoggingSplunkConfig `pulumi:"splunkConfig"`
	// (Computed) The syslog config for Cluster Logging. For `kind = syslog` (list maxitems:1)
	SyslogConfig GetClusterLoggingSyslogConfig `pulumi:"syslogConfig"`
}

func LookupClusterLoggingOutput(ctx *pulumi.Context, args LookupClusterLoggingOutputArgs, opts ...pulumi.InvokeOption) LookupClusterLoggingResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupClusterLoggingResult, error) {
			args := v.(LookupClusterLoggingArgs)
			r, err := LookupClusterLogging(ctx, &args, opts...)
			var s LookupClusterLoggingResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupClusterLoggingResultOutput)
}

// A collection of arguments for invoking getClusterLogging.
type LookupClusterLoggingOutputArgs struct {
	// The cluster id to configure logging (string)
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
}

func (LookupClusterLoggingOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterLoggingArgs)(nil)).Elem()
}

// A collection of values returned by getClusterLogging.
type LookupClusterLoggingResultOutput struct{ *pulumi.OutputState }

func (LookupClusterLoggingResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterLoggingResult)(nil)).Elem()
}

func (o LookupClusterLoggingResultOutput) ToLookupClusterLoggingResultOutput() LookupClusterLoggingResultOutput {
	return o
}

func (o LookupClusterLoggingResultOutput) ToLookupClusterLoggingResultOutputWithContext(ctx context.Context) LookupClusterLoggingResultOutput {
	return o
}

// (Computed) Annotations for Cluster Logging object (map)
func (o LookupClusterLoggingResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupClusterLoggingResult) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

func (o LookupClusterLoggingResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterLoggingResult) string { return v.ClusterId }).(pulumi.StringOutput)
}

func (o LookupClusterLoggingResultOutput) CustomTargetConfig() GetClusterLoggingCustomTargetConfigOutput {
	return o.ApplyT(func(v LookupClusterLoggingResult) GetClusterLoggingCustomTargetConfig { return v.CustomTargetConfig }).(GetClusterLoggingCustomTargetConfigOutput)
}

// (Computed) The elasticsearch config for Cluster Logging. For `kind = elasticsearch`  (list maxitems:1)
func (o LookupClusterLoggingResultOutput) ElasticsearchConfig() GetClusterLoggingElasticsearchConfigOutput {
	return o.ApplyT(func(v LookupClusterLoggingResult) GetClusterLoggingElasticsearchConfig { return v.ElasticsearchConfig }).(GetClusterLoggingElasticsearchConfigOutput)
}

func (o LookupClusterLoggingResultOutput) EnableJsonParsing() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterLoggingResult) bool { return v.EnableJsonParsing }).(pulumi.BoolOutput)
}

// (Computed) The fluentd config for Cluster Logging. For `kind = fluentd` (list maxitems:1)
func (o LookupClusterLoggingResultOutput) FluentdConfig() GetClusterLoggingFluentdConfigOutput {
	return o.ApplyT(func(v LookupClusterLoggingResult) GetClusterLoggingFluentdConfig { return v.FluentdConfig }).(GetClusterLoggingFluentdConfigOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupClusterLoggingResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterLoggingResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) The kafka config for Cluster Logging. For `kind = kafka` (list maxitems:1)
func (o LookupClusterLoggingResultOutput) KafkaConfig() GetClusterLoggingKafkaConfigOutput {
	return o.ApplyT(func(v LookupClusterLoggingResult) GetClusterLoggingKafkaConfig { return v.KafkaConfig }).(GetClusterLoggingKafkaConfigOutput)
}

// (Computed) The kind of the Cluster Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
func (o LookupClusterLoggingResultOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterLoggingResult) string { return v.Kind }).(pulumi.StringOutput)
}

// (Computed) Labels for Cluster Logging object (map)
func (o LookupClusterLoggingResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupClusterLoggingResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

// (Computed) The name of the cluster logging config (string)
func (o LookupClusterLoggingResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterLoggingResult) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) The namespace id from cluster logging (string)
func (o LookupClusterLoggingResultOutput) NamespaceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterLoggingResult) string { return v.NamespaceId }).(pulumi.StringOutput)
}

// (Computed) How often buffered logs would be flushed. Default: `3` seconds (int)
func (o LookupClusterLoggingResultOutput) OutputFlushInterval() pulumi.IntOutput {
	return o.ApplyT(func(v LookupClusterLoggingResult) int { return v.OutputFlushInterval }).(pulumi.IntOutput)
}

// (computed) The output tags for Cluster Logging (map)
func (o LookupClusterLoggingResultOutput) OutputTags() pulumi.MapOutput {
	return o.ApplyT(func(v LookupClusterLoggingResult) map[string]interface{} { return v.OutputTags }).(pulumi.MapOutput)
}

// (Computed) The splunk config for Cluster Logging. For `kind = splunk` (list maxitems:1)
func (o LookupClusterLoggingResultOutput) SplunkConfig() GetClusterLoggingSplunkConfigOutput {
	return o.ApplyT(func(v LookupClusterLoggingResult) GetClusterLoggingSplunkConfig { return v.SplunkConfig }).(GetClusterLoggingSplunkConfigOutput)
}

// (Computed) The syslog config for Cluster Logging. For `kind = syslog` (list maxitems:1)
func (o LookupClusterLoggingResultOutput) SyslogConfig() GetClusterLoggingSyslogConfigOutput {
	return o.ApplyT(func(v LookupClusterLoggingResult) GetClusterLoggingSyslogConfig { return v.SyslogConfig }).(GetClusterLoggingSyslogConfigOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupClusterLoggingResultOutput{})
}
