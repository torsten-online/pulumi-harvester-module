// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class CloudCredentialDigitaloceanCredentialConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessToken", required: true)]
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

        public CloudCredentialDigitaloceanCredentialConfigGetArgs()
        {
        }
        public static new CloudCredentialDigitaloceanCredentialConfigGetArgs Empty => new CloudCredentialDigitaloceanCredentialConfigGetArgs();
    }
}
