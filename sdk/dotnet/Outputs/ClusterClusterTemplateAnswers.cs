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
    public sealed class ClusterClusterTemplateAnswers
    {
        /// <summary>
        /// Cluster ID for answer
        /// </summary>
        public readonly string? ClusterId;
        /// <summary>
        /// Project ID for answer
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// Key/values for answer
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Values;

        [OutputConstructor]
        private ClusterClusterTemplateAnswers(
            string? clusterId,

            string? projectId,

            ImmutableDictionary<string, object>? values)
        {
            ClusterId = clusterId;
            ProjectId = projectId;
            Values = values;
        }
    }
}
