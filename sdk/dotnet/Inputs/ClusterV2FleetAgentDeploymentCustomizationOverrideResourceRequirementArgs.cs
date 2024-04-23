// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2FleetAgentDeploymentCustomizationOverrideResourceRequirementArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The maximum CPU limit for agent
        /// </summary>
        [Input("cpuLimit")]
        public Input<string>? CpuLimit { get; set; }

        /// <summary>
        /// The minimum CPU required for agent
        /// </summary>
        [Input("cpuRequest")]
        public Input<string>? CpuRequest { get; set; }

        /// <summary>
        /// The maximum memory limit for agent
        /// </summary>
        [Input("memoryLimit")]
        public Input<string>? MemoryLimit { get; set; }

        /// <summary>
        /// The minimum memory required for agent
        /// </summary>
        [Input("memoryRequest")]
        public Input<string>? MemoryRequest { get; set; }

        public ClusterV2FleetAgentDeploymentCustomizationOverrideResourceRequirementArgs()
        {
        }
        public static new ClusterV2FleetAgentDeploymentCustomizationOverrideResourceRequirementArgs Empty => new ClusterV2FleetAgentDeploymentCustomizationOverrideResourceRequirementArgs();
    }
}
