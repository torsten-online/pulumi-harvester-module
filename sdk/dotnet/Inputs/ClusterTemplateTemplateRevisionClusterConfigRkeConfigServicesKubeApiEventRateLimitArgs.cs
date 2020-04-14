// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiEventRateLimitArgs : Pulumi.ResourceArgs
    {
        [Input("configuration")]
        private InputMap<object>? _configuration;
        public InputMap<object> Configuration
        {
            get => _configuration ?? (_configuration = new InputMap<object>());
            set => _configuration = value;
        }

        /// <summary>
        /// Enable cluster template revision. Default `true` (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiEventRateLimitArgs()
        {
        }
    }
}
