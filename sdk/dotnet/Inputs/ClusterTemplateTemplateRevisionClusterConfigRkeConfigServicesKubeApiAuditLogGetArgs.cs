// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("configuration")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfigurationGetArgs>? Configuration { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogGetArgs()
        {
        }
        public static new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogGetArgs Empty => new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogGetArgs();
    }
}
