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
    public sealed class GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfigurationResult
    {
        public readonly string? ApiVersion;
        public readonly string? Kind;
        public readonly ImmutableArray<Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfigurationPluginResult> Plugins;

        [OutputConstructor]
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfigurationResult(
            string? apiVersion,

            string? kind,

            ImmutableArray<Outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAdmissionConfigurationPluginResult> plugins)
        {
            ApiVersion = apiVersion;
            Kind = kind;
            Plugins = plugins;
        }
    }
}
