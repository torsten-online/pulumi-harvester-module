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
    public sealed class NodePoolNodeTaint
    {
        /// <summary>
        /// Taint effect. Supported values : `"NoExecute" | "NoSchedule" | "PreferNoSchedule"` (string)
        /// </summary>
        public readonly string? Effect;
        /// <summary>
        /// Taint key (string)
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// Taint time added (string)
        /// </summary>
        public readonly string? TimeAdded;
        /// <summary>
        /// Taint value (string)
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private NodePoolNodeTaint(
            string? effect,

            string key,

            string? timeAdded,

            string value)
        {
            Effect = effect;
            Key = key;
            TimeAdded = timeAdded;
            Value = value;
        }
    }
}
