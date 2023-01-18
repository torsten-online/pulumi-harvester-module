// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterGkeConfigV2NodePoolManagementArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable GKE node pool config management auto repair. Default: `false` (bool)
        /// </summary>
        [Input("autoRepair")]
        public Input<bool>? AutoRepair { get; set; }

        /// <summary>
        /// Enable GKE node pool config management auto upgrade. Default: `false` (bool)
        /// </summary>
        [Input("autoUpgrade")]
        public Input<bool>? AutoUpgrade { get; set; }

        public ClusterGkeConfigV2NodePoolManagementArgs()
        {
        }
        public static new ClusterGkeConfigV2NodePoolManagementArgs Empty => new ClusterGkeConfigV2NodePoolManagementArgs();
    }
}
