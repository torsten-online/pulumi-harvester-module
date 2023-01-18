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
    public sealed class ClusterV2AgentEnvVar
    {
        /// <summary>
        /// The name of the Cluster v2 (string)
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Rancher agent env var value (string)
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private ClusterV2AgentEnvVar(
            string name,

            string value)
        {
            Name = name;
            Value = value;
        }
    }
}
