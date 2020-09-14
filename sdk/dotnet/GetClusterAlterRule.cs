// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetClusterAlterRule
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 cluster alert rule.
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
        ///         var foo = Output.Create(Rancher2.GetClusterAlterRule.InvokeAsync(new Rancher2.GetClusterAlterRuleArgs
        ///         {
        ///             ClusterId = "&lt;cluster_id&gt;",
        ///             Name = "&lt;cluster_alert_rule_name&gt;",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetClusterAlterRuleResult> InvokeAsync(GetClusterAlterRuleArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetClusterAlterRuleResult>("rancher2:index/getClusterAlterRule:getClusterAlterRule", args ?? new GetClusterAlterRuleArgs(), options.WithVersion());
    }


    public sealed class GetClusterAlterRuleArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The cluster id where create cluster alert rule (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        [Input("labels")]
        private Dictionary<string, object>? _labels;

        /// <summary>
        /// (Computed) The cluster alert rule labels (map)
        /// </summary>
        public Dictionary<string, object> Labels
        {
            get => _labels ?? (_labels = new Dictionary<string, object>());
            set => _labels = value;
        }

        /// <summary>
        /// The cluster alert rule name (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetClusterAlterRuleArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetClusterAlterRuleResult
    {
        /// <summary>
        /// (Computed) The cluster alert rule annotations (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        public readonly string ClusterId;
        /// <summary>
        /// (Computed) The cluster alert rule event rule. ConflictsWith: `"metric_rule", "node_rule", "system_service_rule"` (list Maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterAlterRuleEventRuleResult EventRule;
        /// <summary>
        /// (Computed) The cluster alert rule alert group ID (string)
        /// </summary>
        public readonly string GroupId;
        /// <summary>
        /// (Computed) The cluster alert rule group interval seconds. Default: `180` (int)
        /// </summary>
        public readonly int GroupIntervalSeconds;
        /// <summary>
        /// (Computed) The cluster alert rule group wait seconds. Default: `180` (int)
        /// </summary>
        public readonly int GroupWaitSeconds;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) The cluster alert rule inherited. Default: `true` (bool)
        /// </summary>
        public readonly bool Inherited;
        /// <summary>
        /// (Computed) The cluster alert rule labels (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Labels;
        /// <summary>
        /// (Computed) The cluster alert rule metric rule. ConflictsWith: `"event_rule", "node_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterAlterRuleMetricRuleResult MetricRule;
        public readonly string Name;
        /// <summary>
        /// (Computed) The cluster alert rule node rule. ConflictsWith: `"event_rule", "metric_rule", "system_service_rule"`` (list Maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterAlterRuleNodeRuleResult NodeRule;
        /// <summary>
        /// (Optional) The cluster alert rule wait seconds. Default: `3600` (int)
        /// </summary>
        public readonly int RepeatIntervalSeconds;
        /// <summary>
        /// (Computed) The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        /// </summary>
        public readonly string Severity;
        /// <summary>
        /// (Computed) The cluster alert rule system service rule. ConflictsWith: `"event_rule", "metric_rule", "node_rule"`` (list Maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterAlterRuleSystemServiceRuleResult SystemServiceRule;

        [OutputConstructor]
        private GetClusterAlterRuleResult(
            ImmutableDictionary<string, object> annotations,

            string clusterId,

            Outputs.GetClusterAlterRuleEventRuleResult eventRule,

            string groupId,

            int groupIntervalSeconds,

            int groupWaitSeconds,

            string id,

            bool inherited,

            ImmutableDictionary<string, object>? labels,

            Outputs.GetClusterAlterRuleMetricRuleResult metricRule,

            string name,

            Outputs.GetClusterAlterRuleNodeRuleResult nodeRule,

            int repeatIntervalSeconds,

            string severity,

            Outputs.GetClusterAlterRuleSystemServiceRuleResult systemServiceRule)
        {
            Annotations = annotations;
            ClusterId = clusterId;
            EventRule = eventRule;
            GroupId = groupId;
            GroupIntervalSeconds = groupIntervalSeconds;
            GroupWaitSeconds = groupWaitSeconds;
            Id = id;
            Inherited = inherited;
            Labels = labels;
            MetricRule = metricRule;
            Name = name;
            NodeRule = nodeRule;
            RepeatIntervalSeconds = repeatIntervalSeconds;
            Severity = severity;
            SystemServiceRule = systemServiceRule;
        }
    }
}
