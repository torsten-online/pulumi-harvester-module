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
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Create a new Rancher2 Project
    ///         var fooProject = new Rancher2.Project("fooProject", new Rancher2.ProjectArgs
    ///         {
    ///             ClusterId = "&lt;cluster_id&gt;",
    ///             Description = "Terraform project ",
    ///             ResourceQuota = new Rancher2.Inputs.ProjectResourceQuotaArgs
    ///             {
    ///                 ProjectLimit = new Rancher2.Inputs.ProjectResourceQuotaProjectLimitArgs
    ///                 {
    ///                     LimitsCpu = "2000m",
    ///                     LimitsMemory = "2000Mi",
    ///                     RequestsStorage = "2Gi",
    ///                 },
    ///                 NamespaceDefaultLimit = new Rancher2.Inputs.ProjectResourceQuotaNamespaceDefaultLimitArgs
    ///                 {
    ///                     LimitsCpu = "500m",
    ///                     LimitsMemory = "500Mi",
    ///                     RequestsStorage = "1Gi",
    ///                 },
    ///             },
    ///             ContainerResourceLimit = new Rancher2.Inputs.ProjectContainerResourceLimitArgs
    ///             {
    ///                 LimitsCpu = "20m",
    ///                 LimitsMemory = "20Mi",
    ///                 RequestsCpu = "1m",
    ///                 RequestsMemory = "1Mi",
    ///             },
    ///         });
    ///         // Create a new Rancher2 Project Alert Group
    ///         var fooProjectAlertGroup = new Rancher2.ProjectAlertGroup("fooProjectAlertGroup", new Rancher2.ProjectAlertGroupArgs
    ///         {
    ///             Description = "Terraform project alert group",
    ///             ProjectId = fooProject.Id,
    ///             GroupIntervalSeconds = 300,
    ///             RepeatIntervalSeconds = 3600,
    ///         });
    ///         // Create a new Rancher2 Project Alert Rule
    ///         var fooProjectAlertRule = new Rancher2.ProjectAlertRule("fooProjectAlertRule", new Rancher2.ProjectAlertRuleArgs
    ///         {
    ///             ProjectId = fooProjectAlertGroup.ProjectId,
    ///             GroupId = fooProjectAlertGroup.Id,
    ///             GroupIntervalSeconds = 600,
    ///             RepeatIntervalSeconds = 6000,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Project Alert Rule can be imported using the Rancher project alert rule ID
    /// 
    /// ```sh
    ///  $ pulumi import rancher2:index/projectAlertRule:ProjectAlertRule foo &amp;lt;project_alert_rule_id&amp;gt;
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/projectAlertRule:ProjectAlertRule")]
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
            : base("rancher2:index/projectAlertRule:ProjectAlertRule", name, args ?? new ProjectAlertRuleArgs(), MakeResourceOptions(options, ""))
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
}
