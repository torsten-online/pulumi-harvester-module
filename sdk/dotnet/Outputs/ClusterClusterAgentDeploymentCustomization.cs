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
    public sealed class ClusterClusterAgentDeploymentCustomization
    {
        public readonly ImmutableArray<Outputs.ClusterClusterAgentDeploymentCustomizationAppendToleration> AppendTolerations;
        public readonly string? OverrideAffinity;
        public readonly ImmutableArray<Outputs.ClusterClusterAgentDeploymentCustomizationOverrideResourceRequirement> OverrideResourceRequirements;

        [OutputConstructor]
        private ClusterClusterAgentDeploymentCustomization(
            ImmutableArray<Outputs.ClusterClusterAgentDeploymentCustomizationAppendToleration> appendTolerations,

            string? overrideAffinity,

            ImmutableArray<Outputs.ClusterClusterAgentDeploymentCustomizationOverrideResourceRequirement> overrideResourceRequirements)
        {
            AppendTolerations = appendTolerations;
            OverrideAffinity = overrideAffinity;
            OverrideResourceRequirements = overrideResourceRequirements;
        }
    }
}
