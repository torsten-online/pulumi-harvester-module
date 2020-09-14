// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderGetArgs : Pulumi.ResourceArgs
    {
        [Input("awsCloudProvider")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGetArgs>? AwsCloudProvider { get; set; }

        [Input("azureCloudProvider")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProviderGetArgs>? AzureCloudProvider { get; set; }

        [Input("customCloudProvider")]
        public Input<string>? CustomCloudProvider { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("openstackCloudProvider")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGetArgs>? OpenstackCloudProvider { get; set; }

        [Input("vsphereCloudProvider")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderGetArgs>? VsphereCloudProvider { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderGetArgs()
        {
        }
    }
}
