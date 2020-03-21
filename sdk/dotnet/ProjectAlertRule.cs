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
    /// Provides a Rancher v2 Project Alert Rule resource. This can be used to create Project Alert Rule for Rancher v2 environments and retrieve their information.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/projectAlertRule.html.markdown.
    /// </summary>
    public partial class ProjectAlertRule : Pulumi.CustomResource
    {
        /// <summary>
        /// The project alert rule annotations (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// The project alert rule alert group ID (string)
        /// </summary>
        [Output("groupId")]
        public Output<string> GroupId { get; private set; } = null!;

        /// <summary>
        /// The project alert rule group interval seconds. Default: `180` (int)
        /// </summary>
        [Output("groupIntervalSeconds")]
        public Output<int?> GroupIntervalSeconds { get; private set; } = null!;

        /// <summary>
        /// The project alert rule group wait seconds. Default: `180` (int)
        /// </summary>
        [Output("groupWaitSeconds")]
        public Output<int?> GroupWaitSeconds { get; private set; } = null!;

        /// <summary>
        /// The project alert rule inherited. Default: `true` (bool)
        /// </summary>
        [Output("inherited")]
        public Output<bool?> Inherited { get; private set; } = null!;

        /// <summary>
        /// The project alert rule labels (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// The project alert rule metric rule. ConflictsWith: `"pod_rule", "workload_rule"`` (list Maxitems:1)
        /// </summary>
        [Output("metricRule")]
        public Output<Outputs.ProjectAlertRuleMetricRule?> MetricRule { get; private set; } = null!;

        /// <summary>
        /// The project alert rule name (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The project alert rule pod rule. ConflictsWith: `"metric_rule", "workload_rule"`` (list Maxitems:1)
        /// </summary>
        [Output("podRule")]
        public Output<Outputs.ProjectAlertRulePodRule?> PodRule { get; private set; } = null!;

        /// <summary>
        /// The project id where create project alert rule (string)
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// The project alert rule wait seconds. Default: `3600` (int)
        /// </summary>
        [Output("repeatIntervalSeconds")]
        public Output<int?> RepeatIntervalSeconds { get; private set; } = null!;

        /// <summary>
        /// The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        /// </summary>
        [Output("severity")]
        public Output<string?> Severity { get; private set; } = null!;

        /// <summary>
        /// The project alert rule workload rule. ConflictsWith: `"metric_rule", "pod_rule"`` (list Maxitems:1)
        /// </summary>
        [Output("workloadRule")]
        public Output<Outputs.ProjectAlertRuleWorkloadRule?> WorkloadRule { get; private set; } = null!;


        /// <summary>
        /// Create a ProjectAlertRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProjectAlertRule(string name, ProjectAlertRuleArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/projectAlertRule:ProjectAlertRule", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private ProjectAlertRule(string name, Input<string> id, ProjectAlertRuleState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/projectAlertRule:ProjectAlertRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ProjectAlertRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProjectAlertRule Get(string name, Input<string> id, ProjectAlertRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new ProjectAlertRule(name, id, state, options);
        }
    }

    public sealed class ProjectAlertRuleArgs : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// The project alert rule annotations (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The project alert rule alert group ID (string)
        /// </summary>
        [Input("groupId", required: true)]
        public Input<string> GroupId { get; set; } = null!;

        /// <summary>
        /// The project alert rule group interval seconds. Default: `180` (int)
        /// </summary>
        [Input("groupIntervalSeconds")]
        public Input<int>? GroupIntervalSeconds { get; set; }

        /// <summary>
        /// The project alert rule group wait seconds. Default: `180` (int)
        /// </summary>
        [Input("groupWaitSeconds")]
        public Input<int>? GroupWaitSeconds { get; set; }

        /// <summary>
        /// The project alert rule inherited. Default: `true` (bool)
        /// </summary>
        [Input("inherited")]
        public Input<bool>? Inherited { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// The project alert rule labels (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The project alert rule metric rule. ConflictsWith: `"pod_rule", "workload_rule"`` (list Maxitems:1)
        /// </summary>
        [Input("metricRule")]
        public Input<Inputs.ProjectAlertRuleMetricRuleArgs>? MetricRule { get; set; }

        /// <summary>
        /// The project alert rule name (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The project alert rule pod rule. ConflictsWith: `"metric_rule", "workload_rule"`` (list Maxitems:1)
        /// </summary>
        [Input("podRule")]
        public Input<Inputs.ProjectAlertRulePodRuleArgs>? PodRule { get; set; }

        /// <summary>
        /// The project id where create project alert rule (string)
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// The project alert rule wait seconds. Default: `3600` (int)
        /// </summary>
        [Input("repeatIntervalSeconds")]
        public Input<int>? RepeatIntervalSeconds { get; set; }

        /// <summary>
        /// The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        /// </summary>
        [Input("severity")]
        public Input<string>? Severity { get; set; }

        /// <summary>
        /// The project alert rule workload rule. ConflictsWith: `"metric_rule", "pod_rule"`` (list Maxitems:1)
        /// </summary>
        [Input("workloadRule")]
        public Input<Inputs.ProjectAlertRuleWorkloadRuleArgs>? WorkloadRule { get; set; }

        public ProjectAlertRuleArgs()
        {
        }
    }

    public sealed class ProjectAlertRuleState : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// The project alert rule annotations (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The project alert rule alert group ID (string)
        /// </summary>
        [Input("groupId")]
        public Input<string>? GroupId { get; set; }

        /// <summary>
        /// The project alert rule group interval seconds. Default: `180` (int)
        /// </summary>
        [Input("groupIntervalSeconds")]
        public Input<int>? GroupIntervalSeconds { get; set; }

        /// <summary>
        /// The project alert rule group wait seconds. Default: `180` (int)
        /// </summary>
        [Input("groupWaitSeconds")]
        public Input<int>? GroupWaitSeconds { get; set; }

        /// <summary>
        /// The project alert rule inherited. Default: `true` (bool)
        /// </summary>
        [Input("inherited")]
        public Input<bool>? Inherited { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// The project alert rule labels (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The project alert rule metric rule. ConflictsWith: `"pod_rule", "workload_rule"`` (list Maxitems:1)
        /// </summary>
        [Input("metricRule")]
        public Input<Inputs.ProjectAlertRuleMetricRuleGetArgs>? MetricRule { get; set; }

        /// <summary>
        /// The project alert rule name (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The project alert rule pod rule. ConflictsWith: `"metric_rule", "workload_rule"`` (list Maxitems:1)
        /// </summary>
        [Input("podRule")]
        public Input<Inputs.ProjectAlertRulePodRuleGetArgs>? PodRule { get; set; }

        /// <summary>
        /// The project id where create project alert rule (string)
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// The project alert rule wait seconds. Default: `3600` (int)
        /// </summary>
        [Input("repeatIntervalSeconds")]
        public Input<int>? RepeatIntervalSeconds { get; set; }

        /// <summary>
        /// The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        /// </summary>
        [Input("severity")]
        public Input<string>? Severity { get; set; }

        /// <summary>
        /// The project alert rule workload rule. ConflictsWith: `"metric_rule", "pod_rule"`` (list Maxitems:1)
        /// </summary>
        [Input("workloadRule")]
        public Input<Inputs.ProjectAlertRuleWorkloadRuleGetArgs>? WorkloadRule { get; set; }

        public ProjectAlertRuleState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class ProjectAlertRuleMetricRuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Metric rule comparison. Supported values : `"equal" | "greater-or-equal" | "greater-than" | "less-or-equal" | "less-than" | "not-equal" | "has-value"`. Default: `equal`  (string)
        /// </summary>
        [Input("comparison")]
        public Input<string>? Comparison { get; set; }

        /// <summary>
        /// Metric rule description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Metric rule duration (string)
        /// </summary>
        [Input("duration", required: true)]
        public Input<string> Duration { get; set; } = null!;

        /// <summary>
        /// Metric rule expression (string)
        /// </summary>
        [Input("expression", required: true)]
        public Input<string> Expression { get; set; } = null!;

        /// <summary>
        /// Metric rule threshold value (float64)
        /// </summary>
        [Input("thresholdValue", required: true)]
        public Input<double> ThresholdValue { get; set; } = null!;

        public ProjectAlertRuleMetricRuleArgs()
        {
        }
    }

    public sealed class ProjectAlertRuleMetricRuleGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Metric rule comparison. Supported values : `"equal" | "greater-or-equal" | "greater-than" | "less-or-equal" | "less-than" | "not-equal" | "has-value"`. Default: `equal`  (string)
        /// </summary>
        [Input("comparison")]
        public Input<string>? Comparison { get; set; }

        /// <summary>
        /// Metric rule description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Metric rule duration (string)
        /// </summary>
        [Input("duration", required: true)]
        public Input<string> Duration { get; set; } = null!;

        /// <summary>
        /// Metric rule expression (string)
        /// </summary>
        [Input("expression", required: true)]
        public Input<string> Expression { get; set; } = null!;

        /// <summary>
        /// Metric rule threshold value (float64)
        /// </summary>
        [Input("thresholdValue", required: true)]
        public Input<double> ThresholdValue { get; set; } = null!;

        public ProjectAlertRuleMetricRuleGetArgs()
        {
        }
    }

    public sealed class ProjectAlertRulePodRuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Pod rule condition. Supported values : `"notrunning" | "notscheduled" | "restarts"`. Default: `notrunning` (string)
        /// </summary>
        [Input("condition")]
        public Input<string>? Condition { get; set; }

        /// <summary>
        /// Pod ID (string)
        /// </summary>
        [Input("podId", required: true)]
        public Input<string> PodId { get; set; } = null!;

        /// <summary>
        /// Pod rule restart interval seconds. Default: `300` (int)
        /// </summary>
        [Input("restartIntervalSeconds")]
        public Input<int>? RestartIntervalSeconds { get; set; }

        /// <summary>
        /// Pod rule restart times. Default: `3`  (int)
        /// </summary>
        [Input("restartTimes")]
        public Input<int>? RestartTimes { get; set; }

        public ProjectAlertRulePodRuleArgs()
        {
        }
    }

    public sealed class ProjectAlertRulePodRuleGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Pod rule condition. Supported values : `"notrunning" | "notscheduled" | "restarts"`. Default: `notrunning` (string)
        /// </summary>
        [Input("condition")]
        public Input<string>? Condition { get; set; }

        /// <summary>
        /// Pod ID (string)
        /// </summary>
        [Input("podId", required: true)]
        public Input<string> PodId { get; set; } = null!;

        /// <summary>
        /// Pod rule restart interval seconds. Default: `300` (int)
        /// </summary>
        [Input("restartIntervalSeconds")]
        public Input<int>? RestartIntervalSeconds { get; set; }

        /// <summary>
        /// Pod rule restart times. Default: `3`  (int)
        /// </summary>
        [Input("restartTimes")]
        public Input<int>? RestartTimes { get; set; }

        public ProjectAlertRulePodRuleGetArgs()
        {
        }
    }

    public sealed class ProjectAlertRuleWorkloadRuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Workload rule available percentage. Default: `70` (int)
        /// </summary>
        [Input("availablePercentage")]
        public Input<int>? AvailablePercentage { get; set; }

        [Input("selector")]
        private InputMap<object>? _selector;

        /// <summary>
        /// Workload rule selector (map)
        /// </summary>
        public InputMap<object> Selector
        {
            get => _selector ?? (_selector = new InputMap<object>());
            set => _selector = value;
        }

        /// <summary>
        /// Workload ID (string)
        /// </summary>
        [Input("workloadId")]
        public Input<string>? WorkloadId { get; set; }

        public ProjectAlertRuleWorkloadRuleArgs()
        {
        }
    }

    public sealed class ProjectAlertRuleWorkloadRuleGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Workload rule available percentage. Default: `70` (int)
        /// </summary>
        [Input("availablePercentage")]
        public Input<int>? AvailablePercentage { get; set; }

        [Input("selector")]
        private InputMap<object>? _selector;

        /// <summary>
        /// Workload rule selector (map)
        /// </summary>
        public InputMap<object> Selector
        {
            get => _selector ?? (_selector = new InputMap<object>());
            set => _selector = value;
        }

        /// <summary>
        /// Workload ID (string)
        /// </summary>
        [Input("workloadId")]
        public Input<string>? WorkloadId { get; set; }

        public ProjectAlertRuleWorkloadRuleGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class ProjectAlertRuleMetricRule
    {
        /// <summary>
        /// Metric rule comparison. Supported values : `"equal" | "greater-or-equal" | "greater-than" | "less-or-equal" | "less-than" | "not-equal" | "has-value"`. Default: `equal`  (string)
        /// </summary>
        public readonly string? Comparison;
        /// <summary>
        /// Metric rule description (string)
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Metric rule duration (string)
        /// </summary>
        public readonly string Duration;
        /// <summary>
        /// Metric rule expression (string)
        /// </summary>
        public readonly string Expression;
        /// <summary>
        /// Metric rule threshold value (float64)
        /// </summary>
        public readonly double ThresholdValue;

        [OutputConstructor]
        private ProjectAlertRuleMetricRule(
            string? comparison,
            string? description,
            string duration,
            string expression,
            double thresholdValue)
        {
            Comparison = comparison;
            Description = description;
            Duration = duration;
            Expression = expression;
            ThresholdValue = thresholdValue;
        }
    }

    [OutputType]
    public sealed class ProjectAlertRulePodRule
    {
        /// <summary>
        /// Pod rule condition. Supported values : `"notrunning" | "notscheduled" | "restarts"`. Default: `notrunning` (string)
        /// </summary>
        public readonly string? Condition;
        /// <summary>
        /// Pod ID (string)
        /// </summary>
        public readonly string PodId;
        /// <summary>
        /// Pod rule restart interval seconds. Default: `300` (int)
        /// </summary>
        public readonly int? RestartIntervalSeconds;
        /// <summary>
        /// Pod rule restart times. Default: `3`  (int)
        /// </summary>
        public readonly int? RestartTimes;

        [OutputConstructor]
        private ProjectAlertRulePodRule(
            string? condition,
            string podId,
            int? restartIntervalSeconds,
            int? restartTimes)
        {
            Condition = condition;
            PodId = podId;
            RestartIntervalSeconds = restartIntervalSeconds;
            RestartTimes = restartTimes;
        }
    }

    [OutputType]
    public sealed class ProjectAlertRuleWorkloadRule
    {
        /// <summary>
        /// Workload rule available percentage. Default: `70` (int)
        /// </summary>
        public readonly int? AvailablePercentage;
        /// <summary>
        /// Workload rule selector (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Selector;
        /// <summary>
        /// Workload ID (string)
        /// </summary>
        public readonly string? WorkloadId;

        [OutputConstructor]
        private ProjectAlertRuleWorkloadRule(
            int? availablePercentage,
            ImmutableDictionary<string, object>? selector,
            string? workloadId)
        {
            AvailablePercentage = availablePercentage;
            Selector = selector;
            WorkloadId = workloadId;
        }
    }
    }
}
