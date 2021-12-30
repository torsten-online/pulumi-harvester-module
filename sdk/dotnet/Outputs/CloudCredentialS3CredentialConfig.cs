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
    public sealed class CloudCredentialS3CredentialConfig
    {
        /// <summary>
        /// AWS access key (string)
        /// </summary>
        public readonly string AccessKey;
        /// <summary>
        /// AWS default bucket (string)
        /// </summary>
        public readonly string? DefaultBucket;
        /// <summary>
        /// AWS default endpoint (string)
        /// </summary>
        public readonly string? DefaultEndpoint;
        /// <summary>
        /// AWS default endpoint CA (string)
        /// </summary>
        public readonly string? DefaultEndpointCa;
        /// <summary>
        /// AWS default folder (string)
        /// </summary>
        public readonly string? DefaultFolder;
        /// <summary>
        /// AWS default region (string)
        /// </summary>
        public readonly string? DefaultRegion;
        /// <summary>
        /// AWS default skip ssl verify. Default: `false` (bool)
        /// </summary>
        public readonly bool? DefaultSkipSslVerify;
        /// <summary>
        /// AWS secret key (string)
        /// </summary>
        public readonly string SecretKey;

        [OutputConstructor]
        private CloudCredentialS3CredentialConfig(
            string accessKey,

            string? defaultBucket,

            string? defaultEndpoint,

            string? defaultEndpointCa,

            string? defaultFolder,

            string? defaultRegion,

            bool? defaultSkipSslVerify,

            string secretKey)
        {
            AccessKey = accessKey;
            DefaultBucket = defaultBucket;
            DefaultEndpoint = defaultEndpoint;
            DefaultEndpointCa = defaultEndpointCa;
            DefaultFolder = defaultFolder;
            DefaultRegion = defaultRegion;
            DefaultSkipSslVerify = defaultSkipSslVerify;
            SecretKey = secretKey;
        }
    }
}
