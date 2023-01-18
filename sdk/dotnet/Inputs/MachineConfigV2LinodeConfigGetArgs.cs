// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class MachineConfigV2LinodeConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Linode user accounts (seperated by commas) whose Linode SSH keys will be permitted root access to the created node. (string)
        /// </summary>
        [Input("authorizedUsers")]
        public Input<string>? AuthorizedUsers { get; set; }

        /// <summary>
        /// Create private IP for the instance. Default `false` (bool)
        /// </summary>
        [Input("createPrivateIp")]
        public Input<bool>? CreatePrivateIp { get; set; }

        /// <summary>
        /// Port number for Docker engine. Default `2376` (string)
        /// </summary>
        [Input("dockerPort")]
        public Input<string>? DockerPort { get; set; }

        /// <summary>
        /// Azure virtual machine OS image. Default `canonical:UbuntuServer:18.04-LTS:latest` (string)
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// AWS instance type. Default `t3a.medium` (string)
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// Linode Instance Label. (string)
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// AWS region. (string)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("rootPass")]
        private Input<string>? _rootPass;

        /// <summary>
        /// Root Password (string)
        /// </summary>
        public Input<string>? RootPass
        {
            get => _rootPass;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _rootPass = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// SSH port. Default `22` (string)
        /// </summary>
        [Input("sshPort")]
        public Input<string>? SshPort { get; set; }

        /// <summary>
        /// Set the name of the ssh user (string)
        /// </summary>
        [Input("sshUser")]
        public Input<string>? SshUser { get; set; }

        /// <summary>
        /// Specifies the Linode StackScript to use to create the instance. (string)
        /// </summary>
        [Input("stackscript")]
        public Input<string>? Stackscript { get; set; }

        /// <summary>
        /// A JSON string specifying data for the selected StackScript. (string)
        /// </summary>
        [Input("stackscriptData")]
        public Input<string>? StackscriptData { get; set; }

        /// <summary>
        /// Linode Instance Swap Size (MB). Default `512` (string)
        /// </summary>
        [Input("swapSize")]
        public Input<string>? SwapSize { get; set; }

        /// <summary>
        /// AWS Tags (e.g. key1,value1,key2,value2) (string)
        /// </summary>
        [Input("tags")]
        public Input<string>? Tags { get; set; }

        [Input("token")]
        private Input<string>? _token;

        /// <summary>
        /// Linode API token. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
        /// </summary>
        public Input<string>? Token
        {
            get => _token;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _token = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Prefix the User-Agent in Linode API calls with some 'product/version' (string)
        /// </summary>
        [Input("uaPrefix")]
        public Input<string>? UaPrefix { get; set; }

        public MachineConfigV2LinodeConfigGetArgs()
        {
        }
        public static new MachineConfigV2LinodeConfigGetArgs Empty => new MachineConfigV2LinodeConfigGetArgs();
    }
}
