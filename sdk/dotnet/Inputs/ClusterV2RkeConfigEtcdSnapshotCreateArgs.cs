// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2RkeConfigEtcdSnapshotCreateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ETCD generation to initiate a snapshot
        /// </summary>
        [Input("generation", required: true)]
        public Input<int> Generation { get; set; } = null!;

        public ClusterV2RkeConfigEtcdSnapshotCreateArgs()
        {
        }
        public static new ClusterV2RkeConfigEtcdSnapshotCreateArgs Empty => new ClusterV2RkeConfigEtcdSnapshotCreateArgs();
    }
}
