// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2FleetAgentDeploymentCustomizationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("appendTolerations")]
        private InputList<Inputs.ClusterV2FleetAgentDeploymentCustomizationAppendTolerationGetArgs>? _appendTolerations;
        public InputList<Inputs.ClusterV2FleetAgentDeploymentCustomizationAppendTolerationGetArgs> AppendTolerations
        {
            get => _appendTolerations ?? (_appendTolerations = new InputList<Inputs.ClusterV2FleetAgentDeploymentCustomizationAppendTolerationGetArgs>());
            set => _appendTolerations = value;
        }

        [Input("overrideAffinity")]
        public Input<string>? OverrideAffinity { get; set; }

        [Input("overrideResourceRequirements")]
        private InputList<Inputs.ClusterV2FleetAgentDeploymentCustomizationOverrideResourceRequirementGetArgs>? _overrideResourceRequirements;
        public InputList<Inputs.ClusterV2FleetAgentDeploymentCustomizationOverrideResourceRequirementGetArgs> OverrideResourceRequirements
        {
            get => _overrideResourceRequirements ?? (_overrideResourceRequirements = new InputList<Inputs.ClusterV2FleetAgentDeploymentCustomizationOverrideResourceRequirementGetArgs>());
            set => _overrideResourceRequirements = value;
        }

        public ClusterV2FleetAgentDeploymentCustomizationGetArgs()
        {
        }
        public static new ClusterV2FleetAgentDeploymentCustomizationGetArgs Empty => new ClusterV2FleetAgentDeploymentCustomizationGetArgs();
    }
}
