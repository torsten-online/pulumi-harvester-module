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
    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider
    {
        public readonly Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider? AwsCloudProvider;
        public readonly Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProvider? AzureCloudProvider;
        public readonly string? CustomCloudProvider;
        public readonly string? Name;
        public readonly Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider? OpenstackCloudProvider;
        public readonly Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider? VsphereCloudProvider;

        [OutputConstructor]
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider(
            Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider? awsCloudProvider,

            Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProvider? azureCloudProvider,

            string? customCloudProvider,

            string? name,

            Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider? openstackCloudProvider,

            Outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider? vsphereCloudProvider)
        {
            AwsCloudProvider = awsCloudProvider;
            AzureCloudProvider = azureCloudProvider;
            CustomCloudProvider = customCloudProvider;
            Name = name;
            OpenstackCloudProvider = openstackCloudProvider;
            VsphereCloudProvider = vsphereCloudProvider;
        }
    }
}
