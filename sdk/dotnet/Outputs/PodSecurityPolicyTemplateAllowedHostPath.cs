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
    public sealed class PodSecurityPolicyTemplateAllowedHostPath
    {
        public readonly string PathPrefix;
        public readonly bool? ReadOnly;

        [OutputConstructor]
        private PodSecurityPolicyTemplateAllowedHostPath(
            string pathPrefix,

            bool? readOnly)
        {
            PathPrefix = pathPrefix;
            ReadOnly = readOnly;
        }
    }
}
