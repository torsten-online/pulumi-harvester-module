// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterScheduledClusterScanScanConfigGetArgs : Pulumi.ResourceArgs
    {
        [Input("cisScanConfig")]
        public Input<Inputs.ClusterScheduledClusterScanScanConfigCisScanConfigGetArgs>? CisScanConfig { get; set; }

        public ClusterScheduledClusterScanScanConfigGetArgs()
        {
        }
    }
}
