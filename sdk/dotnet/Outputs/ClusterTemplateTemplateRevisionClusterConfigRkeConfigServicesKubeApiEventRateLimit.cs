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
    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiEventRateLimit
    {
        public readonly string? Configuration;
        /// <summary>
        /// Enable cluster template revision. Default `true` (bool)
        /// </summary>
        public readonly bool? Enabled;

        [OutputConstructor]
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiEventRateLimit(
            string? configuration,

            bool? enabled)
        {
            Configuration = configuration;
            Enabled = enabled;
        }
    }
}
