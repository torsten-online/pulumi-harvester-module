// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2RkeConfigMachinePoolMachineConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Machine config kind (string)
        /// </summary>
        [Input("kind", required: true)]
        public Input<string> Kind { get; set; } = null!;

        /// <summary>
        /// The name of the Cluster v2 (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public ClusterV2RkeConfigMachinePoolMachineConfigGetArgs()
        {
        }
        public static new ClusterV2RkeConfigMachinePoolMachineConfigGetArgs Empty => new ClusterV2RkeConfigMachinePoolMachineConfigGetArgs();
    }
}
