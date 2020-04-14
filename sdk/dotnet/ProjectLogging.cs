// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    /// <summary>
    /// Provides a Rancher v2 Project Logging resource. This can be used to create Project Logging for Rancher v2 environments and retrieve their information.
    /// </summary>
    public partial class ProjectLogging : Pulumi.CustomResource
    {
        /// <summary>
        /// Annotations for Project Logging object (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearch_config`, `fluentd_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        /// </summary>
        [Output("customTargetConfig")]
        public Output<Outputs.ProjectLoggingCustomTargetConfig?> CustomTargetConfig { get; private set; } = null!;

        /// <summary>
        /// The elasticsearch config for Project Logging. For `kind = elasticsearch`. Conflicts with `custom_target_config`, `fluentd_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        /// </summary>
        [Output("elasticsearchConfig")]
        public Output<Outputs.ProjectLoggingElasticsearchConfig?> ElasticsearchConfig { get; private set; } = null!;

        /// <summary>
        /// Enable json log parsing. Default: `false` (bool)
        /// </summary>
        [Output("enableJsonParsing")]
        public Output<bool?> EnableJsonParsing { get; private set; } = null!;

        /// <summary>
        /// The fluentd config for Project Logging. For `kind = fluentd`. Conflicts with `custom_target_config`, `elasticsearch_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        /// </summary>
        [Output("fluentdConfig")]
        public Output<Outputs.ProjectLoggingFluentdConfig?> FluentdConfig { get; private set; } = null!;

        /// <summary>
        /// The kafka config for Project Logging. For `kind = kafka`. Conflicts with `custom_target_config`, `elasticsearch_config`, `fluentd_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        /// </summary>
        [Output("kafkaConfig")]
        public Output<Outputs.ProjectLoggingKafkaConfig?> KafkaConfig { get; private set; } = null!;

        /// <summary>
        /// The kind of the Project Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
        /// </summary>
        [Output("kind")]
        public Output<string> Kind { get; private set; } = null!;

        /// <summary>
        /// Labels for Project Logging object (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// The name of the Project Logging config (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The namespace id from Project logging (string)
        /// </summary>
        [Output("namespaceId")]
        public Output<string?> NamespaceId { get; private set; } = null!;

        /// <summary>
        /// How often buffered logs would be flushed. Default: `3` seconds (int)
        /// </summary>
        [Output("outputFlushInterval")]
        public Output<int?> OutputFlushInterval { get; private set; } = null!;

        /// <summary>
        /// The output tags for Project Logging (map)
        /// </summary>
        [Output("outputTags")]
        public Output<ImmutableDictionary<string, object>> OutputTags { get; private set; } = null!;

        /// <summary>
        /// The project id to configure logging (string)
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// The splunk config for Project Logging. For `kind = splunk`. Conflicts with `custom_target_config`, `elasticsearch_config`, `fluentd_config`, `kafka_config`, and `syslog_config` (list maxitems:1)
        /// </summary>
        [Output("splunkConfig")]
        public Output<Outputs.ProjectLoggingSplunkConfig?> SplunkConfig { get; private set; } = null!;

        /// <summary>
        /// The syslog config for Project Logging. For `kind = syslog`. Conflicts with `custom_target_config`, `elasticsearch_config`, `fluentd_config`, `kafka_config`, and `splunk_config` (list maxitems:1)
        /// </summary>
        [Output("syslogConfig")]
        public Output<Outputs.ProjectLoggingSyslogConfig?> SyslogConfig { get; private set; } = null!;


        /// <summary>
        /// Create a ProjectLogging resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProjectLogging(string name, ProjectLoggingArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/projectLogging:ProjectLogging", name, args ?? new ProjectLoggingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProjectLogging(string name, Input<string> id, ProjectLoggingState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/projectLogging:ProjectLogging", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ProjectLogging resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProjectLogging Get(string name, Input<string> id, ProjectLoggingState? state = null, CustomResourceOptions? options = null)
        {
            return new ProjectLogging(name, id, state, options);
        }
    }

    public sealed class ProjectLoggingArgs : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for Project Logging object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearch_config`, `fluentd_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        /// </summary>
        [Input("customTargetConfig")]
        public Input<Inputs.ProjectLoggingCustomTargetConfigArgs>? CustomTargetConfig { get; set; }

        /// <summary>
        /// The elasticsearch config for Project Logging. For `kind = elasticsearch`. Conflicts with `custom_target_config`, `fluentd_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        /// </summary>
        [Input("elasticsearchConfig")]
        public Input<Inputs.ProjectLoggingElasticsearchConfigArgs>? ElasticsearchConfig { get; set; }

        /// <summary>
        /// Enable json log parsing. Default: `false` (bool)
        /// </summary>
        [Input("enableJsonParsing")]
        public Input<bool>? EnableJsonParsing { get; set; }

        /// <summary>
        /// The fluentd config for Project Logging. For `kind = fluentd`. Conflicts with `custom_target_config`, `elasticsearch_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        /// </summary>
        [Input("fluentdConfig")]
        public Input<Inputs.ProjectLoggingFluentdConfigArgs>? FluentdConfig { get; set; }

        /// <summary>
        /// The kafka config for Project Logging. For `kind = kafka`. Conflicts with `custom_target_config`, `elasticsearch_config`, `fluentd_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        /// </summary>
        [Input("kafkaConfig")]
        public Input<Inputs.ProjectLoggingKafkaConfigArgs>? KafkaConfig { get; set; }

        /// <summary>
        /// The kind of the Project Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
        /// </summary>
        [Input("kind", required: true)]
        public Input<string> Kind { get; set; } = null!;

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for Project Logging object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the Project Logging config (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespace id from Project logging (string)
        /// </summary>
        [Input("namespaceId")]
        public Input<string>? NamespaceId { get; set; }

        /// <summary>
        /// How often buffered logs would be flushed. Default: `3` seconds (int)
        /// </summary>
        [Input("outputFlushInterval")]
        public Input<int>? OutputFlushInterval { get; set; }

        [Input("outputTags")]
        private InputMap<object>? _outputTags;

        /// <summary>
        /// The output tags for Project Logging (map)
        /// </summary>
        public InputMap<object> OutputTags
        {
            get => _outputTags ?? (_outputTags = new InputMap<object>());
            set => _outputTags = value;
        }

        /// <summary>
        /// The project id to configure logging (string)
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// The splunk config for Project Logging. For `kind = splunk`. Conflicts with `custom_target_config`, `elasticsearch_config`, `fluentd_config`, `kafka_config`, and `syslog_config` (list maxitems:1)
        /// </summary>
        [Input("splunkConfig")]
        public Input<Inputs.ProjectLoggingSplunkConfigArgs>? SplunkConfig { get; set; }

        /// <summary>
        /// The syslog config for Project Logging. For `kind = syslog`. Conflicts with `custom_target_config`, `elasticsearch_config`, `fluentd_config`, `kafka_config`, and `splunk_config` (list maxitems:1)
        /// </summary>
        [Input("syslogConfig")]
        public Input<Inputs.ProjectLoggingSyslogConfigArgs>? SyslogConfig { get; set; }

        public ProjectLoggingArgs()
        {
        }
    }

    public sealed class ProjectLoggingState : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for Project Logging object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearch_config`, `fluentd_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        /// </summary>
        [Input("customTargetConfig")]
        public Input<Inputs.ProjectLoggingCustomTargetConfigGetArgs>? CustomTargetConfig { get; set; }

        /// <summary>
        /// The elasticsearch config for Project Logging. For `kind = elasticsearch`. Conflicts with `custom_target_config`, `fluentd_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        /// </summary>
        [Input("elasticsearchConfig")]
        public Input<Inputs.ProjectLoggingElasticsearchConfigGetArgs>? ElasticsearchConfig { get; set; }

        /// <summary>
        /// Enable json log parsing. Default: `false` (bool)
        /// </summary>
        [Input("enableJsonParsing")]
        public Input<bool>? EnableJsonParsing { get; set; }

        /// <summary>
        /// The fluentd config for Project Logging. For `kind = fluentd`. Conflicts with `custom_target_config`, `elasticsearch_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        /// </summary>
        [Input("fluentdConfig")]
        public Input<Inputs.ProjectLoggingFluentdConfigGetArgs>? FluentdConfig { get; set; }

        /// <summary>
        /// The kafka config for Project Logging. For `kind = kafka`. Conflicts with `custom_target_config`, `elasticsearch_config`, `fluentd_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        /// </summary>
        [Input("kafkaConfig")]
        public Input<Inputs.ProjectLoggingKafkaConfigGetArgs>? KafkaConfig { get; set; }

        /// <summary>
        /// The kind of the Project Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for Project Logging object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the Project Logging config (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespace id from Project logging (string)
        /// </summary>
        [Input("namespaceId")]
        public Input<string>? NamespaceId { get; set; }

        /// <summary>
        /// How often buffered logs would be flushed. Default: `3` seconds (int)
        /// </summary>
        [Input("outputFlushInterval")]
        public Input<int>? OutputFlushInterval { get; set; }

        [Input("outputTags")]
        private InputMap<object>? _outputTags;

        /// <summary>
        /// The output tags for Project Logging (map)
        /// </summary>
        public InputMap<object> OutputTags
        {
            get => _outputTags ?? (_outputTags = new InputMap<object>());
            set => _outputTags = value;
        }

        /// <summary>
        /// The project id to configure logging (string)
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// The splunk config for Project Logging. For `kind = splunk`. Conflicts with `custom_target_config`, `elasticsearch_config`, `fluentd_config`, `kafka_config`, and `syslog_config` (list maxitems:1)
        /// </summary>
        [Input("splunkConfig")]
        public Input<Inputs.ProjectLoggingSplunkConfigGetArgs>? SplunkConfig { get; set; }

        /// <summary>
        /// The syslog config for Project Logging. For `kind = syslog`. Conflicts with `custom_target_config`, `elasticsearch_config`, `fluentd_config`, `kafka_config`, and `splunk_config` (list maxitems:1)
        /// </summary>
        [Input("syslogConfig")]
        public Input<Inputs.ProjectLoggingSyslogConfigGetArgs>? SyslogConfig { get; set; }

        public ProjectLoggingState()
        {
        }
    }
}
