// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigAuthenticationArgs : global::Pulumi.ResourceArgs
    {
        [Input("sans")]
        private InputList<string>? _sans;
        public InputList<string> Sans
        {
            get => _sans ?? (_sans = new InputList<string>());
            set => _sans = value;
        }

        [Input("strategy")]
        public Input<string>? Strategy { get; set; }

        public ClusterRkeConfigAuthenticationArgs()
        {
        }
        public static new ClusterRkeConfigAuthenticationArgs Empty => new ClusterRkeConfigAuthenticationArgs();
    }
}
