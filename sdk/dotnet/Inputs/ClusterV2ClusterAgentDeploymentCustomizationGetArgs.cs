// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2ClusterAgentDeploymentCustomizationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("appendTolerations")]
        private InputList<Inputs.ClusterV2ClusterAgentDeploymentCustomizationAppendTolerationGetArgs>? _appendTolerations;

        /// <summary>
        /// User defined tolerations to append to agent
        /// </summary>
        public InputList<Inputs.ClusterV2ClusterAgentDeploymentCustomizationAppendTolerationGetArgs> AppendTolerations
        {
            get => _appendTolerations ?? (_appendTolerations = new InputList<Inputs.ClusterV2ClusterAgentDeploymentCustomizationAppendTolerationGetArgs>());
            set => _appendTolerations = value;
        }

        /// <summary>
        /// User defined affinity to override default agent affinity
        /// </summary>
        [Input("overrideAffinity")]
        public Input<string>? OverrideAffinity { get; set; }

        [Input("overrideResourceRequirements")]
        private InputList<Inputs.ClusterV2ClusterAgentDeploymentCustomizationOverrideResourceRequirementGetArgs>? _overrideResourceRequirements;

        /// <summary>
        /// User defined resource requirements to set on the agent
        /// </summary>
        public InputList<Inputs.ClusterV2ClusterAgentDeploymentCustomizationOverrideResourceRequirementGetArgs> OverrideResourceRequirements
        {
            get => _overrideResourceRequirements ?? (_overrideResourceRequirements = new InputList<Inputs.ClusterV2ClusterAgentDeploymentCustomizationOverrideResourceRequirementGetArgs>());
            set => _overrideResourceRequirements = value;
        }

        public ClusterV2ClusterAgentDeploymentCustomizationGetArgs()
        {
        }
        public static new ClusterV2ClusterAgentDeploymentCustomizationGetArgs Empty => new ClusterV2ClusterAgentDeploymentCustomizationGetArgs();
    }
}
