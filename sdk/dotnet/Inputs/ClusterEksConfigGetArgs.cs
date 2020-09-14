// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterEksConfigGetArgs : Pulumi.ResourceArgs
    {
        [Input("accessKey", required: true)]
        public Input<string> AccessKey { get; set; } = null!;

        [Input("ami")]
        public Input<string>? Ami { get; set; }

        [Input("associateWorkerNodePublicIp")]
        public Input<bool>? AssociateWorkerNodePublicIp { get; set; }

        [Input("desiredNodes")]
        public Input<int>? DesiredNodes { get; set; }

        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        [Input("keyPairName")]
        public Input<string>? KeyPairName { get; set; }

        [Input("kubernetesVersion", required: true)]
        public Input<string> KubernetesVersion { get; set; } = null!;

        [Input("maximumNodes")]
        public Input<int>? MaximumNodes { get; set; }

        [Input("minimumNodes")]
        public Input<int>? MinimumNodes { get; set; }

        [Input("nodeVolumeSize")]
        public Input<int>? NodeVolumeSize { get; set; }

        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("secretKey", required: true)]
        public Input<string> SecretKey { get; set; } = null!;

        [Input("securityGroups")]
        private InputList<string>? _securityGroups;
        public InputList<string> SecurityGroups
        {
            get => _securityGroups ?? (_securityGroups = new InputList<string>());
            set => _securityGroups = value;
        }

        [Input("serviceRole")]
        public Input<string>? ServiceRole { get; set; }

        [Input("sessionToken")]
        public Input<string>? SessionToken { get; set; }

        [Input("subnets")]
        private InputList<string>? _subnets;
        public InputList<string> Subnets
        {
            get => _subnets ?? (_subnets = new InputList<string>());
            set => _subnets = value;
        }

        [Input("userData")]
        public Input<string>? UserData { get; set; }

        [Input("virtualNetwork")]
        public Input<string>? VirtualNetwork { get; set; }

        public ClusterEksConfigGetArgs()
        {
        }
    }
}
