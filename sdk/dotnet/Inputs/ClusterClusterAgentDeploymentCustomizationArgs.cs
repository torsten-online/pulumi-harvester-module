// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterClusterAgentDeploymentCustomizationArgs : global::Pulumi.ResourceArgs
    {
        [Input("appendTolerations")]
        private InputList<Inputs.ClusterClusterAgentDeploymentCustomizationAppendTolerationArgs>? _appendTolerations;
        public InputList<Inputs.ClusterClusterAgentDeploymentCustomizationAppendTolerationArgs> AppendTolerations
        {
            get => _appendTolerations ?? (_appendTolerations = new InputList<Inputs.ClusterClusterAgentDeploymentCustomizationAppendTolerationArgs>());
            set => _appendTolerations = value;
        }

        [Input("overrideAffinity")]
        public Input<string>? OverrideAffinity { get; set; }

        [Input("overrideResourceRequirements")]
        private InputList<Inputs.ClusterClusterAgentDeploymentCustomizationOverrideResourceRequirementArgs>? _overrideResourceRequirements;
        public InputList<Inputs.ClusterClusterAgentDeploymentCustomizationOverrideResourceRequirementArgs> OverrideResourceRequirements
        {
            get => _overrideResourceRequirements ?? (_overrideResourceRequirements = new InputList<Inputs.ClusterClusterAgentDeploymentCustomizationOverrideResourceRequirementArgs>());
            set => _overrideResourceRequirements = value;
        }

        public ClusterClusterAgentDeploymentCustomizationArgs()
        {
        }
        public static new ClusterClusterAgentDeploymentCustomizationArgs Empty => new ClusterClusterAgentDeploymentCustomizationArgs();
    }
}
