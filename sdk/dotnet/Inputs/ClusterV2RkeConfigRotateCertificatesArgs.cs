// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2RkeConfigRotateCertificatesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Desired certificate rotation generation.
        /// </summary>
        [Input("generation", required: true)]
        public Input<int> Generation { get; set; } = null!;

        [Input("services")]
        private InputList<string>? _services;

        /// <summary>
        /// Service certificates to rotate with this generation.
        /// </summary>
        public InputList<string> Services
        {
            get => _services ?? (_services = new InputList<string>());
            set => _services = value;
        }

        public ClusterV2RkeConfigRotateCertificatesArgs()
        {
        }
        public static new ClusterV2RkeConfigRotateCertificatesArgs Empty => new ClusterV2RkeConfigRotateCertificatesArgs();
    }
}
