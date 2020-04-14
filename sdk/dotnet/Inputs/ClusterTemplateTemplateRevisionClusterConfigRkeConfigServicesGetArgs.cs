// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesGetArgs : Pulumi.ResourceArgs
    {
        [Input("etcd")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdGetArgs>? Etcd { get; set; }

        [Input("kubeApi")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiGetArgs>? KubeApi { get; set; }

        [Input("kubeController")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeControllerGetArgs>? KubeController { get; set; }

        [Input("kubelet")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeletGetArgs>? Kubelet { get; set; }

        [Input("kubeproxy")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxyGetArgs>? Kubeproxy { get; set; }

        [Input("scheduler")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesSchedulerGetArgs>? Scheduler { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesGetArgs()
        {
        }
    }
}
