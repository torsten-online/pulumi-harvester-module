// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterLoggingFluentdConfigArgs : Pulumi.ResourceArgs
    {
        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        [Input("compress")]
        public Input<bool>? Compress { get; set; }

        [Input("enableTls")]
        public Input<bool>? EnableTls { get; set; }

        [Input("fluentServers", required: true)]
        private InputList<Inputs.ClusterLoggingFluentdConfigFluentServerArgs>? _fluentServers;
        public InputList<Inputs.ClusterLoggingFluentdConfigFluentServerArgs> FluentServers
        {
            get => _fluentServers ?? (_fluentServers = new InputList<Inputs.ClusterLoggingFluentdConfigFluentServerArgs>());
            set => _fluentServers = value;
        }

        public ClusterLoggingFluentdConfigArgs()
        {
        }
    }
}
