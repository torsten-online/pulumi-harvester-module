// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogArgs : global::Pulumi.ResourceArgs
    {
        [Input("configuration")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfigurationArgs>? Configuration { get; set; }

        /// <summary>
        /// Enable cluster template revision. Default `true` (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogArgs Empty => new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogArgs();
    }
}
