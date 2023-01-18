// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Outputs
{

    [OutputType]
    public sealed class ClusterRkeConfigBastionHost
    {
        /// <summary>
        /// Address ip for the bastion host (string)
        /// </summary>
        public readonly string Address;
        /// <summary>
        /// Port for bastion host. Default `22` (string)
        /// </summary>
        public readonly string? Port;
        /// <summary>
        /// Use ssh agent auth. Default `false`
        /// </summary>
        public readonly bool? SshAgentAuth;
        /// <summary>
        /// Bastion host SSH private key (string)
        /// </summary>
        public readonly string? SshKey;
        /// <summary>
        /// Cluster level SSH private key path (string)
        /// </summary>
        public readonly string? SshKeyPath;
        /// <summary>
        /// User to connect bastion host (string)
        /// </summary>
        public readonly string User;

        [OutputConstructor]
        private ClusterRkeConfigBastionHost(
            string address,

            string? port,

            bool? sshAgentAuth,

            string? sshKey,

            string? sshKeyPath,

            string user)
        {
            Address = address;
            Port = port;
            SshAgentAuth = sshAgentAuth;
            SshKey = sshKey;
            SshKeyPath = sshKeyPath;
            User = user;
        }
    }
}
