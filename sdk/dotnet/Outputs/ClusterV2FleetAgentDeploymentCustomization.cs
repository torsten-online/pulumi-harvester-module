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
    public sealed class ClusterV2FleetAgentDeploymentCustomization
    {
        /// <summary>
        /// User defined tolerations to append to agent
        /// </summary>
        public readonly ImmutableArray<Outputs.ClusterV2FleetAgentDeploymentCustomizationAppendToleration> AppendTolerations;
        /// <summary>
        /// User defined affinity to override default agent affinity
        /// </summary>
        public readonly string? OverrideAffinity;
        /// <summary>
        /// User defined resource requirements to set on the agent
        /// </summary>
        public readonly ImmutableArray<Outputs.ClusterV2FleetAgentDeploymentCustomizationOverrideResourceRequirement> OverrideResourceRequirements;

        [OutputConstructor]
        private ClusterV2FleetAgentDeploymentCustomization(
            ImmutableArray<Outputs.ClusterV2FleetAgentDeploymentCustomizationAppendToleration> appendTolerations,

            string? overrideAffinity,

            ImmutableArray<Outputs.ClusterV2FleetAgentDeploymentCustomizationOverrideResourceRequirement> overrideResourceRequirements)
        {
            AppendTolerations = appendTolerations;
            OverrideAffinity = overrideAffinity;
            OverrideResourceRequirements = overrideResourceRequirements;
        }
    }
}
