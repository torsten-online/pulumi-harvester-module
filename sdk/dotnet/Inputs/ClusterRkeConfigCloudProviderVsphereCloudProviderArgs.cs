// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigCloudProviderVsphereCloudProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("disk")]
        public Input<Inputs.ClusterRkeConfigCloudProviderVsphereCloudProviderDiskArgs>? Disk { get; set; }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("global")]
        public Input<Inputs.ClusterRkeConfigCloudProviderVsphereCloudProviderGlobalArgs>? Global { get; set; }

        /// <summary>
        /// Kubernetes cluster networking (list maxitems:1)
        /// </summary>
        [Input("network")]
        public Input<Inputs.ClusterRkeConfigCloudProviderVsphereCloudProviderNetworkArgs>? Network { get; set; }

        [Input("virtualCenters", required: true)]
        private InputList<Inputs.ClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenterArgs>? _virtualCenters;

        /// <summary>
        /// (List)
        /// </summary>
        public InputList<Inputs.ClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenterArgs> VirtualCenters
        {
            get => _virtualCenters ?? (_virtualCenters = new InputList<Inputs.ClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenterArgs>());
            set => _virtualCenters = value;
        }

        /// <summary>
        /// (list maxitems:1)
        /// </summary>
        [Input("workspace", required: true)]
        public Input<Inputs.ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs> Workspace { get; set; } = null!;

        public ClusterRkeConfigCloudProviderVsphereCloudProviderArgs()
        {
        }
        public static new ClusterRkeConfigCloudProviderVsphereCloudProviderArgs Empty => new ClusterRkeConfigCloudProviderVsphereCloudProviderArgs();
    }
}
