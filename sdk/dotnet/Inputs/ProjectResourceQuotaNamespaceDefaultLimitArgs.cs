// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ProjectResourceQuotaNamespaceDefaultLimitArgs : global::Pulumi.ResourceArgs
    {
        [Input("configMaps")]
        public Input<string>? ConfigMaps { get; set; }

        [Input("limitsCpu")]
        public Input<string>? LimitsCpu { get; set; }

        [Input("limitsMemory")]
        public Input<string>? LimitsMemory { get; set; }

        [Input("persistentVolumeClaims")]
        public Input<string>? PersistentVolumeClaims { get; set; }

        [Input("pods")]
        public Input<string>? Pods { get; set; }

        [Input("replicationControllers")]
        public Input<string>? ReplicationControllers { get; set; }

        [Input("requestsCpu")]
        public Input<string>? RequestsCpu { get; set; }

        [Input("requestsMemory")]
        public Input<string>? RequestsMemory { get; set; }

        [Input("requestsStorage")]
        public Input<string>? RequestsStorage { get; set; }

        [Input("secrets")]
        public Input<string>? Secrets { get; set; }

        [Input("services")]
        public Input<string>? Services { get; set; }

        [Input("servicesLoadBalancers")]
        public Input<string>? ServicesLoadBalancers { get; set; }

        [Input("servicesNodePorts")]
        public Input<string>? ServicesNodePorts { get; set; }

        public ProjectResourceQuotaNamespaceDefaultLimitArgs()
        {
        }
        public static new ProjectResourceQuotaNamespaceDefaultLimitArgs Empty => new ProjectResourceQuotaNamespaceDefaultLimitArgs();
    }
}
