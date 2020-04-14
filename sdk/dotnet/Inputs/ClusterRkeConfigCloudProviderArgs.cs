// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigCloudProviderArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// RKE AWS Cloud Provider config for Cloud Provider [rke-aws-cloud-provider](https://rancher.com/docs/rke/latest/en/config-options/cloud-providers/aws/) (list maxitems:1)
        /// </summary>
        [Input("awsCloudProvider")]
        public Input<Inputs.ClusterRkeConfigCloudProviderAwsCloudProviderArgs>? AwsCloudProvider { get; set; }

        /// <summary>
        /// RKE Azure Cloud Provider config for Cloud Provider [rke-azure-cloud-provider](https://rancher.com/docs/rke/latest/en/config-options/cloud-providers/azure/) (list maxitems:1)
        /// </summary>
        [Input("azureCloudProvider")]
        public Input<Inputs.ClusterRkeConfigCloudProviderAzureCloudProviderArgs>? AzureCloudProvider { get; set; }

        /// <summary>
        /// RKE Custom Cloud Provider config for Cloud Provider (string) (string)
        /// </summary>
        [Input("customCloudProvider")]
        public Input<string>? CustomCloudProvider { get; set; }

        /// <summary>
        /// Name of cluster registration token (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// RKE Openstack Cloud Provider config for Cloud Provider [rke-openstack-cloud-provider](https://rancher.com/docs/rke/latest/en/config-options/cloud-providers/openstack/) (list maxitems:1)
        /// </summary>
        [Input("openstackCloudProvider")]
        public Input<Inputs.ClusterRkeConfigCloudProviderOpenstackCloudProviderArgs>? OpenstackCloudProvider { get; set; }

        /// <summary>
        /// RKE Vsphere Cloud Provider config for Cloud Provider [rke-vsphere-cloud-provider](https://rancher.com/docs/rke/latest/en/config-options/cloud-providers/vsphere/) Extra argument `name` is required on `virtual_center` configuration. (list maxitems:1)
        /// </summary>
        [Input("vsphereCloudProvider")]
        public Input<Inputs.ClusterRkeConfigCloudProviderVsphereCloudProviderArgs>? VsphereCloudProvider { get; set; }

        public ClusterRkeConfigCloudProviderArgs()
        {
        }
    }
}
