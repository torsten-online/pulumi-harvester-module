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
    public sealed class ProjectResourceQuota
    {
        public readonly Outputs.ProjectResourceQuotaNamespaceDefaultLimit NamespaceDefaultLimit;
        public readonly Outputs.ProjectResourceQuotaProjectLimit ProjectLimit;

        [OutputConstructor]
        private ProjectResourceQuota(
            Outputs.ProjectResourceQuotaNamespaceDefaultLimit namespaceDefaultLimit,

            Outputs.ProjectResourceQuotaProjectLimit projectLimit)
        {
            NamespaceDefaultLimit = namespaceDefaultLimit;
            ProjectLimit = projectLimit;
        }
    }
}
