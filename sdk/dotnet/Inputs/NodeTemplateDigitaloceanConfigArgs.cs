// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class NodeTemplateDigitaloceanConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Digital Ocean access token. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2..CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        [Input("accessToken")]
        public Input<string>? AccessToken { get; set; }

        /// <summary>
        /// Enable backups for droplet. Default `false` (bool)
        /// </summary>
        [Input("backups")]
        public Input<bool>? Backups { get; set; }

        /// <summary>
        /// Specifies the Linode Instance image which determines the OS distribution and base files. Default `linode/ubuntu18.04` (string)
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// Enable ipv6 for droplet. Default `false` (bool)
        /// </summary>
        [Input("ipv6")]
        public Input<bool>? Ipv6 { get; set; }

        /// <summary>
        /// Enable monitoring for droplet. Default `false` (bool)
        /// </summary>
        [Input("monitoring")]
        public Input<bool>? Monitoring { get; set; }

        /// <summary>
        /// Enable private networking for droplet. Default `false` (bool)
        /// </summary>
        [Input("privateNetworking")]
        public Input<bool>? PrivateNetworking { get; set; }

        /// <summary>
        /// OpenStack region name (string)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Digital Ocean size. Default `s-1vcpu-1gb` (string)
        /// </summary>
        [Input("size")]
        public Input<string>? Size { get; set; }

        /// <summary>
        /// SSH key fingerprint (string)
        /// </summary>
        [Input("sshKeyFingerprint")]
        public Input<string>? SshKeyFingerprint { get; set; }

        /// <summary>
        /// SSH private key path (string)
        /// </summary>
        [Input("sshKeyPath")]
        public Input<string>? SshKeyPath { get; set; }

        /// <summary>
        /// If using a non-B2D image you can specify the ssh port. Default `22`. From Rancher v2.3.3 (string)
        /// </summary>
        [Input("sshPort")]
        public Input<string>? SshPort { get; set; }

        /// <summary>
        /// If using a non-B2D image you can specify the ssh user. Default `docker`. From Rancher v2.3.3 (string)
        /// </summary>
        [Input("sshUser")]
        public Input<string>? SshUser { get; set; }

        /// <summary>
        /// vSphere tags id e.g. `urn:xxx`. From Rancher v2.3.3 (list)
        /// </summary>
        [Input("tags")]
        public Input<string>? Tags { get; set; }

        /// <summary>
        /// Path to file with cloud-init user-data (string)
        /// </summary>
        [Input("userdata")]
        public Input<string>? Userdata { get; set; }

        public NodeTemplateDigitaloceanConfigArgs()
        {
        }
    }
}
