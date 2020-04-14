// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProviderGetArgs : Pulumi.ResourceArgs
    {
        [Input("aadClientCertPassword")]
        public Input<string>? AadClientCertPassword { get; set; }

        [Input("aadClientCertPath")]
        public Input<string>? AadClientCertPath { get; set; }

        [Input("aadClientId", required: true)]
        public Input<string> AadClientId { get; set; } = null!;

        [Input("aadClientSecret", required: true)]
        public Input<string> AadClientSecret { get; set; } = null!;

        [Input("cloud")]
        public Input<string>? Cloud { get; set; }

        [Input("cloudProviderBackoff")]
        public Input<bool>? CloudProviderBackoff { get; set; }

        [Input("cloudProviderBackoffDuration")]
        public Input<int>? CloudProviderBackoffDuration { get; set; }

        [Input("cloudProviderBackoffExponent")]
        public Input<int>? CloudProviderBackoffExponent { get; set; }

        [Input("cloudProviderBackoffJitter")]
        public Input<int>? CloudProviderBackoffJitter { get; set; }

        [Input("cloudProviderBackoffRetries")]
        public Input<int>? CloudProviderBackoffRetries { get; set; }

        [Input("cloudProviderRateLimit")]
        public Input<bool>? CloudProviderRateLimit { get; set; }

        [Input("cloudProviderRateLimitBucket")]
        public Input<int>? CloudProviderRateLimitBucket { get; set; }

        [Input("cloudProviderRateLimitQps")]
        public Input<int>? CloudProviderRateLimitQps { get; set; }

        [Input("location")]
        public Input<string>? Location { get; set; }

        [Input("maximumLoadBalancerRuleCount")]
        public Input<int>? MaximumLoadBalancerRuleCount { get; set; }

        [Input("primaryAvailabilitySetName")]
        public Input<string>? PrimaryAvailabilitySetName { get; set; }

        [Input("primaryScaleSetName")]
        public Input<string>? PrimaryScaleSetName { get; set; }

        [Input("resourceGroup")]
        public Input<string>? ResourceGroup { get; set; }

        [Input("routeTableName")]
        public Input<string>? RouteTableName { get; set; }

        [Input("securityGroupName")]
        public Input<string>? SecurityGroupName { get; set; }

        [Input("subnetName")]
        public Input<string>? SubnetName { get; set; }

        [Input("subscriptionId", required: true)]
        public Input<string> SubscriptionId { get; set; } = null!;

        [Input("tenantId", required: true)]
        public Input<string> TenantId { get; set; } = null!;

        [Input("useInstanceMetadata")]
        public Input<bool>? UseInstanceMetadata { get; set; }

        [Input("useManagedIdentityExtension")]
        public Input<bool>? UseManagedIdentityExtension { get; set; }

        [Input("vmType")]
        public Input<string>? VmType { get; set; }

        [Input("vnetName")]
        public Input<string>? VnetName { get; set; }

        [Input("vnetResourceGroup")]
        public Input<string>? VnetResourceGroup { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProviderGetArgs()
        {
        }
    }
}
