// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a Rancher v2 Project Logging.
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
//			_, err := rancher2.LookupProjectLogging(ctx, &GetProjectLoggingArgs{
//				ProjectId: "<project_id>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupProjectLogging(ctx *pulumi.Context, args *LookupProjectLoggingArgs, opts ...pulumi.InvokeOption) (*LookupProjectLoggingResult, error) {
	var rv LookupProjectLoggingResult
	err := ctx.Invoke("rancher2:index/getProjectLogging:getProjectLogging", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProjectLogging.
type LookupProjectLoggingArgs struct {
	// The project id to configure logging (string)
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getProjectLogging.
type LookupProjectLoggingResult struct {
	// (Computed) Annotations for Cluster Logging object (map)
	Annotations        map[string]interface{}              `pulumi:"annotations"`
	CustomTargetConfig GetProjectLoggingCustomTargetConfig `pulumi:"customTargetConfig"`
	// (Computed) The elasticsearch config for Cluster Logging. For `kind = elasticsearch`  (list maxitems:1)
	ElasticsearchConfig GetProjectLoggingElasticsearchConfig `pulumi:"elasticsearchConfig"`
	EnableJsonParsing   bool                                 `pulumi:"enableJsonParsing"`
	// (Computed) The fluentd config for Cluster Logging. For `kind = fluentd` (list maxitems:1)
	FluentdConfig GetProjectLoggingFluentdConfig `pulumi:"fluentdConfig"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Computed) The kafka config for Cluster Logging. For `kind = kafka` (list maxitems:1)
	KafkaConfig GetProjectLoggingKafkaConfig `pulumi:"kafkaConfig"`
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
	ProjectId  string                 `pulumi:"projectId"`
	// (Computed) The splunk config for Cluster Logging. For `kind = splunk` (list maxitems:1)
	SplunkConfig GetProjectLoggingSplunkConfig `pulumi:"splunkConfig"`
	// (Computed) The syslog config for Cluster Logging. For `kind = syslog` (list maxitems:1)
	SyslogConfig GetProjectLoggingSyslogConfig `pulumi:"syslogConfig"`
}

func LookupProjectLoggingOutput(ctx *pulumi.Context, args LookupProjectLoggingOutputArgs, opts ...pulumi.InvokeOption) LookupProjectLoggingResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupProjectLoggingResult, error) {
			args := v.(LookupProjectLoggingArgs)
			r, err := LookupProjectLogging(ctx, &args, opts...)
			var s LookupProjectLoggingResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupProjectLoggingResultOutput)
}

// A collection of arguments for invoking getProjectLogging.
type LookupProjectLoggingOutputArgs struct {
	// The project id to configure logging (string)
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupProjectLoggingOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProjectLoggingArgs)(nil)).Elem()
}

// A collection of values returned by getProjectLogging.
type LookupProjectLoggingResultOutput struct{ *pulumi.OutputState }

func (LookupProjectLoggingResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProjectLoggingResult)(nil)).Elem()
}

func (o LookupProjectLoggingResultOutput) ToLookupProjectLoggingResultOutput() LookupProjectLoggingResultOutput {
	return o
}

func (o LookupProjectLoggingResultOutput) ToLookupProjectLoggingResultOutputWithContext(ctx context.Context) LookupProjectLoggingResultOutput {
	return o
}

// (Computed) Annotations for Cluster Logging object (map)
func (o LookupProjectLoggingResultOutput) Annotations() pulumi.MapOutput {
	return o.ApplyT(func(v LookupProjectLoggingResult) map[string]interface{} { return v.Annotations }).(pulumi.MapOutput)
}

func (o LookupProjectLoggingResultOutput) CustomTargetConfig() GetProjectLoggingCustomTargetConfigOutput {
	return o.ApplyT(func(v LookupProjectLoggingResult) GetProjectLoggingCustomTargetConfig { return v.CustomTargetConfig }).(GetProjectLoggingCustomTargetConfigOutput)
}

// (Computed) The elasticsearch config for Cluster Logging. For `kind = elasticsearch`  (list maxitems:1)
func (o LookupProjectLoggingResultOutput) ElasticsearchConfig() GetProjectLoggingElasticsearchConfigOutput {
	return o.ApplyT(func(v LookupProjectLoggingResult) GetProjectLoggingElasticsearchConfig { return v.ElasticsearchConfig }).(GetProjectLoggingElasticsearchConfigOutput)
}

func (o LookupProjectLoggingResultOutput) EnableJsonParsing() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupProjectLoggingResult) bool { return v.EnableJsonParsing }).(pulumi.BoolOutput)
}

// (Computed) The fluentd config for Cluster Logging. For `kind = fluentd` (list maxitems:1)
func (o LookupProjectLoggingResultOutput) FluentdConfig() GetProjectLoggingFluentdConfigOutput {
	return o.ApplyT(func(v LookupProjectLoggingResult) GetProjectLoggingFluentdConfig { return v.FluentdConfig }).(GetProjectLoggingFluentdConfigOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupProjectLoggingResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectLoggingResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Computed) The kafka config for Cluster Logging. For `kind = kafka` (list maxitems:1)
func (o LookupProjectLoggingResultOutput) KafkaConfig() GetProjectLoggingKafkaConfigOutput {
	return o.ApplyT(func(v LookupProjectLoggingResult) GetProjectLoggingKafkaConfig { return v.KafkaConfig }).(GetProjectLoggingKafkaConfigOutput)
}

// (Computed) The kind of the Cluster Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
func (o LookupProjectLoggingResultOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectLoggingResult) string { return v.Kind }).(pulumi.StringOutput)
}

// (Computed) Labels for Cluster Logging object (map)
func (o LookupProjectLoggingResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupProjectLoggingResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

// (Computed) The name of the cluster logging config (string)
func (o LookupProjectLoggingResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectLoggingResult) string { return v.Name }).(pulumi.StringOutput)
}

// (Computed) The namespace id from cluster logging (string)
func (o LookupProjectLoggingResultOutput) NamespaceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectLoggingResult) string { return v.NamespaceId }).(pulumi.StringOutput)
}

// (Computed) How often buffered logs would be flushed. Default: `3` seconds (int)
func (o LookupProjectLoggingResultOutput) OutputFlushInterval() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectLoggingResult) int { return v.OutputFlushInterval }).(pulumi.IntOutput)
}

// (computed) The output tags for Cluster Logging (map)
func (o LookupProjectLoggingResultOutput) OutputTags() pulumi.MapOutput {
	return o.ApplyT(func(v LookupProjectLoggingResult) map[string]interface{} { return v.OutputTags }).(pulumi.MapOutput)
}

func (o LookupProjectLoggingResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectLoggingResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// (Computed) The splunk config for Cluster Logging. For `kind = splunk` (list maxitems:1)
func (o LookupProjectLoggingResultOutput) SplunkConfig() GetProjectLoggingSplunkConfigOutput {
	return o.ApplyT(func(v LookupProjectLoggingResult) GetProjectLoggingSplunkConfig { return v.SplunkConfig }).(GetProjectLoggingSplunkConfigOutput)
}

// (Computed) The syslog config for Cluster Logging. For `kind = syslog` (list maxitems:1)
func (o LookupProjectLoggingResultOutput) SyslogConfig() GetProjectLoggingSyslogConfigOutput {
	return o.ApplyT(func(v LookupProjectLoggingResult) GetProjectLoggingSyslogConfig { return v.SyslogConfig }).(GetProjectLoggingSyslogConfigOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupProjectLoggingResultOutput{})
}
