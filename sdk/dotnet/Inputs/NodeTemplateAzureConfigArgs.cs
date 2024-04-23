// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class NodeTemplateAzureConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable Accelerated Networking when creating an Azure Network Interface
        /// </summary>
        [Input("acceleratedNetworking")]
        public Input<bool>? AcceleratedNetworking { get; set; }

        /// <summary>
        /// Azure Availability Set to place the virtual machine into
        /// </summary>
        [Input("availabilitySet")]
        public Input<string>? AvailabilitySet { get; set; }

        /// <summary>
        /// The Azure Availability Zone the VM should be created in
        /// </summary>
        [Input("availabilityZone")]
        public Input<string>? AvailabilityZone { get; set; }

        [Input("clientId")]
        private Input<string>? _clientId;

        /// <summary>
        /// Azure Service Principal Account ID (optional, browser auth is used if not specified)
        /// </summary>
        public Input<string>? ClientId
        {
            get => _clientId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clientId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("clientSecret")]
        private Input<string>? _clientSecret;

        /// <summary>
        /// Azure Service Principal Account password (optional, browser auth is used if not specified)
        /// </summary>
        public Input<string>? ClientSecret
        {
            get => _clientSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clientSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Path to file with custom-data
        /// </summary>
        [Input("customData")]
        public Input<string>? CustomData { get; set; }

        /// <summary>
        /// Disk size if using managed disk
        /// </summary>
        [Input("diskSize")]
        public Input<string>? DiskSize { get; set; }

        /// <summary>
        /// A unique DNS label for the public IP adddress
        /// </summary>
        [Input("dns")]
        public Input<string>? Dns { get; set; }

        /// <summary>
        /// Port number for Docker engine
        /// </summary>
        [Input("dockerPort")]
        public Input<string>? DockerPort { get; set; }

        /// <summary>
        /// Azure environment (e.g. AzurePublicCloud, AzureChinaCloud)
        /// </summary>
        [Input("environment")]
        public Input<string>? Environment { get; set; }

        /// <summary>
        /// Fault domain count to use for availability set
        /// </summary>
        [Input("faultDomainCount")]
        public Input<string>? FaultDomainCount { get; set; }

        /// <summary>
        /// Azure virtual machine OS image
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// Azure region to create the virtual machine
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Configures VM and availability set for managed disks
        /// </summary>
        [Input("managedDisks")]
        public Input<bool>? ManagedDisks { get; set; }

        /// <summary>
        /// Do not create a public IP address for the machine
        /// </summary>
        [Input("noPublicIp")]
        public Input<bool>? NoPublicIp { get; set; }

        /// <summary>
        /// Azure Network Security Group to assign this node to (accepts either a name or resource ID, default is to create a new NSG for each machine)
        /// </summary>
        [Input("nsg")]
        public Input<string>? Nsg { get; set; }

        [Input("openPorts")]
        private InputList<string>? _openPorts;

        /// <summary>
        /// Make the specified port number accessible from the Internet
        /// </summary>
        public InputList<string> OpenPorts
        {
            get => _openPorts ?? (_openPorts = new InputList<string>());
            set => _openPorts = value;
        }

        /// <summary>
        /// Purchase plan for Azure Virtual Machine (in &lt;publisher&gt;:&lt;product&gt;:&lt;plan&gt; format)
        /// </summary>
        [Input("plan")]
        public Input<string>? Plan { get; set; }

        /// <summary>
        /// Specify a static private IP address for the machine
        /// </summary>
        [Input("privateIpAddress")]
        public Input<string>? PrivateIpAddress { get; set; }

        /// <summary>
        /// Azure Resource Group name (will be created if missing)
        /// </summary>
        [Input("resourceGroup")]
        public Input<string>? ResourceGroup { get; set; }

        /// <summary>
        /// Size for Azure Virtual Machine
        /// </summary>
        [Input("size")]
        public Input<string>? Size { get; set; }

        /// <summary>
        /// Username for SSH login
        /// </summary>
        [Input("sshUser")]
        public Input<string>? SshUser { get; set; }

        /// <summary>
        /// Assign a static public IP address to the machine
        /// </summary>
        [Input("staticPublicIp")]
        public Input<bool>? StaticPublicIp { get; set; }

        /// <summary>
        /// Type of Storage Account to host the OS Disk for the machine
        /// </summary>
        [Input("storageType")]
        public Input<string>? StorageType { get; set; }

        /// <summary>
        /// Azure Subnet Name to be used within the Virtual Network
        /// </summary>
        [Input("subnet")]
        public Input<string>? Subnet { get; set; }

        /// <summary>
        /// Private CIDR block to be used for the new subnet, should comply RFC 1918
        /// </summary>
        [Input("subnetPrefix")]
        public Input<string>? SubnetPrefix { get; set; }

        [Input("subscriptionId")]
        private Input<string>? _subscriptionId;

        /// <summary>
        /// Azure Subscription ID
        /// </summary>
        public Input<string>? SubscriptionId
        {
            get => _subscriptionId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _subscriptionId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Tags to be applied to the Azure VM instance (e.g. key1,value1,key2,value2)
        /// </summary>
        [Input("tags")]
        public Input<string>? Tags { get; set; }

        /// <summary>
        /// Update domain count to use for availability set
        /// </summary>
        [Input("updateDomainCount")]
        public Input<string>? UpdateDomainCount { get; set; }

        /// <summary>
        /// Use private IP address of the machine to connect
        /// </summary>
        [Input("usePrivateIp")]
        public Input<bool>? UsePrivateIp { get; set; }

        /// <summary>
        /// Use the Standard SKU when creating a public IP for an Azure VM
        /// </summary>
        [Input("usePublicIpStandardSku")]
        public Input<bool>? UsePublicIpStandardSku { get; set; }

        /// <summary>
        /// Azure Virtual Network name to connect the virtual machine (in [resourcegroup:]name format)
        /// </summary>
        [Input("vnet")]
        public Input<string>? Vnet { get; set; }

        public NodeTemplateAzureConfigArgs()
        {
        }
        public static new NodeTemplateAzureConfigArgs Empty => new NodeTemplateAzureConfigArgs();
    }
}
