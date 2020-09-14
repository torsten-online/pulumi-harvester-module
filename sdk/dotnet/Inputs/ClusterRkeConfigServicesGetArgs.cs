// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigServicesGetArgs : Pulumi.ResourceArgs
    {
        [Input("etcd")]
        public Input<Inputs.ClusterRkeConfigServicesEtcdGetArgs>? Etcd { get; set; }

        [Input("kubeApi")]
        public Input<Inputs.ClusterRkeConfigServicesKubeApiGetArgs>? KubeApi { get; set; }

        [Input("kubeController")]
        public Input<Inputs.ClusterRkeConfigServicesKubeControllerGetArgs>? KubeController { get; set; }

        [Input("kubelet")]
        public Input<Inputs.ClusterRkeConfigServicesKubeletGetArgs>? Kubelet { get; set; }

        [Input("kubeproxy")]
        public Input<Inputs.ClusterRkeConfigServicesKubeproxyGetArgs>? Kubeproxy { get; set; }

        [Input("scheduler")]
        public Input<Inputs.ClusterRkeConfigServicesSchedulerGetArgs>? Scheduler { get; set; }

        public ClusterRkeConfigServicesGetArgs()
        {
        }
    }
}
