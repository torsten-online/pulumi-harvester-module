// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetProjectLogging
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 Project Logging.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var foo = Output.Create(Rancher2.GetProjectLogging.InvokeAsync(new Rancher2.GetProjectLoggingArgs
        ///         {
        ///             ProjectId = "&lt;project_id&gt;",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// 
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetProjectLoggingResult> InvokeAsync(GetProjectLoggingArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetProjectLoggingResult>("rancher2:index/getProjectLogging:getProjectLogging", args ?? new GetProjectLoggingArgs(), options.WithVersion());
    }


    public sealed class GetProjectLoggingArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The project id to configure logging (string)
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetProjectLoggingArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetProjectLoggingResult
    {
        /// <summary>
        /// (Computed) Annotations for Cluster Logging object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        public readonly Outputs.GetProjectLoggingCustomTargetConfigResult CustomTargetConfig;
        /// <summary>
        /// (Computed) The elasticsearch config for Cluster Logging. For `kind = elasticsearch`  (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetProjectLoggingElasticsearchConfigResult ElasticsearchConfig;
        public readonly bool EnableJsonParsing;
        /// <summary>
        /// (Computed) The fluentd config for Cluster Logging. For `kind = fluentd` (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetProjectLoggingFluentdConfigResult FluentdConfig;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) The kafka config for Cluster Logging. For `kind = kafka` (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetProjectLoggingKafkaConfigResult KafkaConfig;
        /// <summary>
        /// (Computed) The kind of the Cluster Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// (Computed) Labels for Cluster Logging object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        /// <summary>
        /// (Computed) The name of the cluster logging config (string)
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// (Computed) The namespace id from cluster logging (string)
        /// </summary>
        public readonly string NamespaceId;
        /// <summary>
        /// (Computed) How often buffered logs would be flushed. Default: `3` seconds (int)
        /// </summary>
        public readonly int OutputFlushInterval;
        /// <summary>
        /// (computed) The output tags for Cluster Logging (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> OutputTags;
        public readonly string ProjectId;
        /// <summary>
        /// (Computed) The splunk config for Cluster Logging. For `kind = splunk` (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetProjectLoggingSplunkConfigResult SplunkConfig;
        /// <summary>
        /// (Computed) The syslog config for Cluster Logging. For `kind = syslog` (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetProjectLoggingSyslogConfigResult SyslogConfig;

        [OutputConstructor]
        private GetProjectLoggingResult(
            ImmutableDictionary<string, object> annotations,

            Outputs.GetProjectLoggingCustomTargetConfigResult customTargetConfig,

            Outputs.GetProjectLoggingElasticsearchConfigResult elasticsearchConfig,

            bool enableJsonParsing,

            Outputs.GetProjectLoggingFluentdConfigResult fluentdConfig,

            string id,

            Outputs.GetProjectLoggingKafkaConfigResult kafkaConfig,

            string kind,

            ImmutableDictionary<string, object> labels,

            string name,

            string namespaceId,

            int outputFlushInterval,

            ImmutableDictionary<string, object> outputTags,

            string projectId,

            Outputs.GetProjectLoggingSplunkConfigResult splunkConfig,

            Outputs.GetProjectLoggingSyslogConfigResult syslogConfig)
        {
            Annotations = annotations;
            CustomTargetConfig = customTargetConfig;
            ElasticsearchConfig = elasticsearchConfig;
            EnableJsonParsing = enableJsonParsing;
            FluentdConfig = fluentdConfig;
            Id = id;
            KafkaConfig = kafkaConfig;
            Kind = kind;
            Labels = labels;
            Name = name;
            NamespaceId = namespaceId;
            OutputFlushInterval = outputFlushInterval;
            OutputTags = outputTags;
            ProjectId = projectId;
            SplunkConfig = splunkConfig;
            SyslogConfig = syslogConfig;
        }
    }
}
