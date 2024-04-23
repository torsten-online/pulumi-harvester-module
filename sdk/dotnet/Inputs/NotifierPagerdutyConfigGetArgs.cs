// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class NotifierPagerdutyConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Pagerduty proxy URL
        /// </summary>
        [Input("proxyUrl")]
        public Input<string>? ProxyUrl { get; set; }

        /// <summary>
        /// Pagerduty service key
        /// </summary>
        [Input("serviceKey", required: true)]
        public Input<string> ServiceKey { get; set; } = null!;

        public NotifierPagerdutyConfigGetArgs()
        {
        }
        public static new NotifierPagerdutyConfigGetArgs Empty => new NotifierPagerdutyConfigGetArgs();
    }
}
