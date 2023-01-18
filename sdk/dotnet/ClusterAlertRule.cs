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
    /// Provides a Rancher v2 Cluster Alert Rule resource. This can be used to create Cluster Alert Rule for Rancher v2 environments and retrieve their information.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a new Rancher2 Cluster Alert Group
    ///     var fooClusterAlertGroup = new Rancher2.ClusterAlertGroup("fooClusterAlertGroup", new()
    ///     {
    ///         ClusterId = "&lt;cluster_id&gt;",
    ///         Description = "Terraform cluster alert group",
    ///         GroupIntervalSeconds = 300,
    ///         RepeatIntervalSeconds = 3600,
    ///     });
    /// 
    ///     // Create a new Rancher2 Cluster Alert Rule
    ///     var fooClusterAlertRule = new Rancher2.ClusterAlertRule("fooClusterAlertRule", new()
    ///     {
    ///         ClusterId = fooClusterAlertGroup.ClusterId,
    ///         GroupId = fooClusterAlertGroup.Id,
    ///         GroupIntervalSeconds = 600,
    ///         RepeatIntervalSeconds = 6000,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Cluster Alert Rule can be imported using the Rancher cluster alert rule ID
    /// 
    /// ```sh
    ///  $ pulumi import rancher2:index/clusterAlertRule:ClusterAlertRule foo &amp;lt;CLUSTER_ALERT_RULE_ID&amp;gt;
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/clusterAlertRule:ClusterAlertRule")]
    public partial class ClusterAlertRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The cluster alert rule annotations (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// The cluster id where create cluster alert rule (string)
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule event rule. ConflictsWith: `"metric_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        [Output("eventRule")]
        public Output<Outputs.ClusterAlertRuleEventRule?> EventRule { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule alert group ID (string)
        /// </summary>
        [Output("groupId")]
        public Output<string> GroupId { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule group interval seconds. Default: `180` (int)
        /// </summary>
        [Output("groupIntervalSeconds")]
        public Output<int?> GroupIntervalSeconds { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule group wait seconds. Default: `180` (int)
        /// </summary>
        [Output("groupWaitSeconds")]
        public Output<int?> GroupWaitSeconds { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule inherited. Default: `true` (bool)
        /// </summary>
        [Output("inherited")]
        public Output<bool?> Inherited { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule labels (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule metric rule. ConflictsWith: `"event_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        [Output("metricRule")]
        public Output<Outputs.ClusterAlertRuleMetricRule?> MetricRule { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule name (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule node rule. ConflictsWith: `"event_rule", "metric_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        [Output("nodeRule")]
        public Output<Outputs.ClusterAlertRuleNodeRule?> NodeRule { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule wait seconds. Default: `3600` (int)
        /// </summary>
        [Output("repeatIntervalSeconds")]
        public Output<int?> RepeatIntervalSeconds { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        /// </summary>
        [Output("severity")]
        public Output<string?> Severity { get; private set; } = null!;

        /// <summary>
        /// The cluster alert rule system service rule. ConflictsWith: `"event_rule", "metric_rule", "node_rule"` (list Maxitems:1)
        /// </summary>
        [Output("systemServiceRule")]
        public Output<Outputs.ClusterAlertRuleSystemServiceRule?> SystemServiceRule { get; private set; } = null!;


        /// <summary>
        /// Create a ClusterAlertRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ClusterAlertRule(string name, ClusterAlertRuleArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/clusterAlertRule:ClusterAlertRule", name, args ?? new ClusterAlertRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ClusterAlertRule(string name, Input<string> id, ClusterAlertRuleState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/clusterAlertRule:ClusterAlertRule", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                Aliases =
                {
                    new global::Pulumi.Alias { Type = "rancher2:index/clusterAlterRule:ClusterAlterRule"},
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ClusterAlertRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ClusterAlertRule Get(string name, Input<string> id, ClusterAlertRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new ClusterAlertRule(name, id, state, options);
        }
    }

    public sealed class ClusterAlertRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// The cluster alert rule annotations (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The cluster id where create cluster alert rule (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The cluster alert rule event rule. ConflictsWith: `"metric_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        [Input("eventRule")]
        public Input<Inputs.ClusterAlertRuleEventRuleArgs>? EventRule { get; set; }

        /// <summary>
        /// The cluster alert rule alert group ID (string)
        /// </summary>
        [Input("groupId", required: true)]
        public Input<string> GroupId { get; set; } = null!;

        /// <summary>
        /// The cluster alert rule group interval seconds. Default: `180` (int)
        /// </summary>
        [Input("groupIntervalSeconds")]
        public Input<int>? GroupIntervalSeconds { get; set; }

        /// <summary>
        /// The cluster alert rule group wait seconds. Default: `180` (int)
        /// </summary>
        [Input("groupWaitSeconds")]
        public Input<int>? GroupWaitSeconds { get; set; }

        /// <summary>
        /// The cluster alert rule inherited. Default: `true` (bool)
        /// </summary>
        [Input("inherited")]
        public Input<bool>? Inherited { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// The cluster alert rule labels (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The cluster alert rule metric rule. ConflictsWith: `"event_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        [Input("metricRule")]
        public Input<Inputs.ClusterAlertRuleMetricRuleArgs>? MetricRule { get; set; }

        /// <summary>
        /// The cluster alert rule name (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The cluster alert rule node rule. ConflictsWith: `"event_rule", "metric_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        [Input("nodeRule")]
        public Input<Inputs.ClusterAlertRuleNodeRuleArgs>? NodeRule { get; set; }

        /// <summary>
        /// The cluster alert rule wait seconds. Default: `3600` (int)
        /// </summary>
        [Input("repeatIntervalSeconds")]
        public Input<int>? RepeatIntervalSeconds { get; set; }

        /// <summary>
        /// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        /// </summary>
        [Input("severity")]
        public Input<string>? Severity { get; set; }

        /// <summary>
        /// The cluster alert rule system service rule. ConflictsWith: `"event_rule", "metric_rule", "node_rule"` (list Maxitems:1)
        /// </summary>
        [Input("systemServiceRule")]
        public Input<Inputs.ClusterAlertRuleSystemServiceRuleArgs>? SystemServiceRule { get; set; }

        public ClusterAlertRuleArgs()
        {
        }
        public static new ClusterAlertRuleArgs Empty => new ClusterAlertRuleArgs();
    }

    public sealed class ClusterAlertRuleState : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// The cluster alert rule annotations (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The cluster id where create cluster alert rule (string)
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The cluster alert rule event rule. ConflictsWith: `"metric_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        [Input("eventRule")]
        public Input<Inputs.ClusterAlertRuleEventRuleGetArgs>? EventRule { get; set; }

        /// <summary>
        /// The cluster alert rule alert group ID (string)
        /// </summary>
        [Input("groupId")]
        public Input<string>? GroupId { get; set; }

        /// <summary>
        /// The cluster alert rule group interval seconds. Default: `180` (int)
        /// </summary>
        [Input("groupIntervalSeconds")]
        public Input<int>? GroupIntervalSeconds { get; set; }

        /// <summary>
        /// The cluster alert rule group wait seconds. Default: `180` (int)
        /// </summary>
        [Input("groupWaitSeconds")]
        public Input<int>? GroupWaitSeconds { get; set; }

        /// <summary>
        /// The cluster alert rule inherited. Default: `true` (bool)
        /// </summary>
        [Input("inherited")]
        public Input<bool>? Inherited { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// The cluster alert rule labels (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The cluster alert rule metric rule. ConflictsWith: `"event_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        [Input("metricRule")]
        public Input<Inputs.ClusterAlertRuleMetricRuleGetArgs>? MetricRule { get; set; }

        /// <summary>
        /// The cluster alert rule name (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The cluster alert rule node rule. ConflictsWith: `"event_rule", "metric_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        [Input("nodeRule")]
        public Input<Inputs.ClusterAlertRuleNodeRuleGetArgs>? NodeRule { get; set; }

        /// <summary>
        /// The cluster alert rule wait seconds. Default: `3600` (int)
        /// </summary>
        [Input("repeatIntervalSeconds")]
        public Input<int>? RepeatIntervalSeconds { get; set; }

        /// <summary>
        /// The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        /// </summary>
        [Input("severity")]
        public Input<string>? Severity { get; set; }

        /// <summary>
        /// The cluster alert rule system service rule. ConflictsWith: `"event_rule", "metric_rule", "node_rule"` (list Maxitems:1)
        /// </summary>
        [Input("systemServiceRule")]
        public Input<Inputs.ClusterAlertRuleSystemServiceRuleGetArgs>? SystemServiceRule { get; set; }

        public ClusterAlertRuleState()
        {
        }
        public static new ClusterAlertRuleState Empty => new ClusterAlertRuleState();
    }
}
