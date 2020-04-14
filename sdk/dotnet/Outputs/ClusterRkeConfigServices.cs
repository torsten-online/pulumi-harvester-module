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
    public sealed class ClusterRkeConfigServices
    {
        /// <summary>
        /// Etcd options for RKE services (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigServicesEtcd? Etcd;
        /// <summary>
        /// Kube API options for RKE services (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigServicesKubeApi? KubeApi;
        /// <summary>
        /// Kube Controller options for RKE services (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigServicesKubeController? KubeController;
        /// <summary>
        /// Kubelet options for RKE services (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigServicesKubelet? Kubelet;
        /// <summary>
        /// Kubeproxy options for RKE services (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigServicesKubeproxy? Kubeproxy;
        /// <summary>
        /// Scheduler options for RKE services (list maxitems:1)
        /// </summary>
        public readonly Outputs.ClusterRkeConfigServicesScheduler? Scheduler;

        [OutputConstructor]
        private ClusterRkeConfigServices(
            Outputs.ClusterRkeConfigServicesEtcd? etcd,

            Outputs.ClusterRkeConfigServicesKubeApi? kubeApi,

            Outputs.ClusterRkeConfigServicesKubeController? kubeController,

            Outputs.ClusterRkeConfigServicesKubelet? kubelet,

            Outputs.ClusterRkeConfigServicesKubeproxy? kubeproxy,

            Outputs.ClusterRkeConfigServicesScheduler? scheduler)
        {
            Etcd = etcd;
            KubeApi = kubeApi;
            KubeController = kubeController;
            Kubelet = kubelet;
            Kubeproxy = kubeproxy;
            Scheduler = scheduler;
        }
    }
}
