// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterLoggingSyslogConfigGetArgs : Pulumi.ResourceArgs
    {
        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        [Input("clientCert")]
        public Input<string>? ClientCert { get; set; }

        [Input("clientKey")]
        public Input<string>? ClientKey { get; set; }

        [Input("enableTls")]
        public Input<bool>? EnableTls { get; set; }

        [Input("endpoint", required: true)]
        public Input<string> Endpoint { get; set; } = null!;

        [Input("program")]
        public Input<string>? Program { get; set; }

        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        [Input("severity")]
        public Input<string>? Severity { get; set; }

        [Input("sslVerify")]
        public Input<bool>? SslVerify { get; set; }

        [Input("token")]
        public Input<string>? Token { get; set; }

        public ClusterLoggingSyslogConfigGetArgs()
        {
        }
    }
}
