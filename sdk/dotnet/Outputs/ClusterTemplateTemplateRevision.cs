// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Outputs
{

    [OutputType]
    public sealed class ClusterTemplateTemplateRevision
    {
        /// <summary>
        /// Annotations for the cluster template (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Annotations;
        /// <summary>
        /// Cluster configuration
        /// </summary>
        public readonly Outputs.ClusterTemplateTemplateRevisionClusterConfig ClusterConfig;
        /// <summary>
        /// Cluster template ID
        /// </summary>
        public readonly string? ClusterTemplateId;
        /// <summary>
        /// Default cluster template revision
        /// </summary>
        public readonly bool? Default;
        /// <summary>
        /// Enable cluster template revision
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// (Computed) The ID of the resource (string)
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Labels for the cluster template (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Labels;
        /// <summary>
        /// The cluster template name (string)
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Cluster template questions
        /// </summary>
        public readonly ImmutableArray<Outputs.ClusterTemplateTemplateRevisionQuestion> Questions;

        [OutputConstructor]
        private ClusterTemplateTemplateRevision(
            ImmutableDictionary<string, object>? annotations,

            Outputs.ClusterTemplateTemplateRevisionClusterConfig clusterConfig,

            string? clusterTemplateId,

            bool? @default,

            bool? enabled,

            string? id,

            ImmutableDictionary<string, object>? labels,

            string name,

            ImmutableArray<Outputs.ClusterTemplateTemplateRevisionQuestion> questions)
        {
            Annotations = annotations;
            ClusterConfig = clusterConfig;
            ClusterTemplateId = clusterTemplateId;
            Default = @default;
            Enabled = enabled;
            Id = id;
            Labels = labels;
            Name = name;
            Questions = questions;
        }
    }
}
