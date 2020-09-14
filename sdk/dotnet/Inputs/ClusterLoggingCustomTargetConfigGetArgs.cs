// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterLoggingCustomTargetConfigGetArgs : Pulumi.ResourceArgs
    {
        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        [Input("clientCert")]
        public Input<string>? ClientCert { get; set; }

        [Input("clientKey")]
        public Input<string>? ClientKey { get; set; }

        [Input("content", required: true)]
        public Input<string> Content { get; set; } = null!;

        public ClusterLoggingCustomTargetConfigGetArgs()
        {
        }
    }
}
