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
    public sealed class GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthenticationResult
    {
        public readonly ImmutableArray<string> Sans;
        public readonly string Strategy;

        [OutputConstructor]
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigAuthenticationResult(
            ImmutableArray<string> sans,

            string strategy)
        {
            Sans = sans;
            Strategy = strategy;
        }
    }
}
