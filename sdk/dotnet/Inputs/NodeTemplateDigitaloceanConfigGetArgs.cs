// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class NodeTemplateDigitaloceanConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessToken")]
        private Input<string>? _accessToken;

        /// <summary>
        /// Digital Ocean access token
        /// </summary>
        public Input<string>? AccessToken
        {
            get => _accessToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Enable backups for droplet
        /// </summary>
        [Input("backups")]
        public Input<bool>? Backups { get; set; }

        /// <summary>
        /// Digital Ocean Image
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// Enable ipv6 for droplet
        /// </summary>
        [Input("ipv6")]
        public Input<bool>? Ipv6 { get; set; }

        /// <summary>
        /// Enable monitoring for droplet
        /// </summary>
        [Input("monitoring")]
        public Input<bool>? Monitoring { get; set; }

        /// <summary>
        /// Enable private networking for droplet
        /// </summary>
        [Input("privateNetworking")]
        public Input<bool>? PrivateNetworking { get; set; }

        /// <summary>
        /// Digital Ocean region
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Digital Ocean size
        /// </summary>
        [Input("size")]
        public Input<string>? Size { get; set; }

        [Input("sshKeyFingerprint")]
        private Input<string>? _sshKeyFingerprint;

        /// <summary>
        /// SSH key fingerprint
        /// </summary>
        public Input<string>? SshKeyFingerprint
        {
            get => _sshKeyFingerprint;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sshKeyFingerprint = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// SSH private key path
        /// </summary>
        [Input("sshKeyPath")]
        public Input<string>? SshKeyPath { get; set; }

        /// <summary>
        /// SSH port
        /// </summary>
        [Input("sshPort")]
        public Input<string>? SshPort { get; set; }

        /// <summary>
        /// SSH username
        /// </summary>
        [Input("sshUser")]
        public Input<string>? SshUser { get; set; }

        /// <summary>
        /// Comma-separated list of tags to apply to the Droplet
        /// </summary>
        [Input("tags")]
        public Input<string>? Tags { get; set; }

        /// <summary>
        /// Path to file with cloud-init user-data
        /// </summary>
        [Input("userdata")]
        public Input<string>? Userdata { get; set; }

        public NodeTemplateDigitaloceanConfigGetArgs()
        {
        }
        public static new NodeTemplateDigitaloceanConfigGetArgs Empty => new NodeTemplateDigitaloceanConfigGetArgs();
    }
}
