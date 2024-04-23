// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class CloudCredentialAzureCredentialConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("clientId", required: true)]
        private Input<string>? _clientId;

        /// <summary>
        /// Azure Service Principal Account ID
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

        [Input("clientSecret", required: true)]
        private Input<string>? _clientSecret;

        /// <summary>
        /// Azure Service Principal Account password
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
        /// Azure environment (e.g. AzurePublicCloud, AzureChinaCloud)
        /// </summary>
        [Input("environment")]
        public Input<string>? Environment { get; set; }

        [Input("subscriptionId", required: true)]
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
        /// Azure Tenant ID
        /// </summary>
        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        public CloudCredentialAzureCredentialConfigArgs()
        {
        }
        public static new CloudCredentialAzureCredentialConfigArgs Empty => new CloudCredentialAzureCredentialConfigArgs();
    }
}
