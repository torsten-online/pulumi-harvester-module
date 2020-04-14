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
    public sealed class ClusterClusterAuthEndpoint
    {
        /// <summary>
        /// CA certs for the authorized cluster endpoint (string)
        /// </summary>
        public readonly string? CaCerts;
        /// <summary>
        /// Enable scheduled cluster scan. Default: `false` (bool)
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// FQDN for the authorized cluster endpoint (string)
        /// </summary>
        public readonly string? Fqdn;

        [OutputConstructor]
        private ClusterClusterAuthEndpoint(
            string? caCerts,

            bool? enabled,

            string? fqdn)
        {
            CaCerts = caCerts;
            Enabled = enabled;
            Fqdn = fqdn;
        }
    }
}
