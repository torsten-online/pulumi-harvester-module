// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    [Obsolete(@"rancher2.index.getRoleTempalte has been deprecated in favour of rancher2.index.getRoleTemplate")]
    public static class GetRoleTempalte
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 role template resource.
        /// 
        /// {{% examples %}}
        /// {{% /examples %}}
        /// 
        /// Deprecated: rancher2.index.getRoleTempalte has been deprecated in favour of rancher2.index.getRoleTemplate
        /// </summary>
        public static Task<GetRoleTempalteResult> InvokeAsync(GetRoleTempalteArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetRoleTempalteResult>("rancher2:index/getRoleTempalte:getRoleTempalte", args ?? new GetRoleTempalteArgs(), options.WithVersion());
    }


    public sealed class GetRoleTempalteArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Role template context. `cluster` and `project` values are supported (string)
        /// </summary>
        [Input("context")]
        public string? Context { get; set; }

        /// <summary>
        /// The name of the Node Template (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetRoleTempalteArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetRoleTempalteResult
    {
        /// <summary>
        /// (Computed) Administrative role template (bool)
        /// </summary>
        public readonly bool Administrative;
        /// <summary>
        /// (Computed) Annotations for role template object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        /// <summary>
        /// (Computed) Builtin role template (string)
        /// </summary>
        public readonly bool Builtin;
        public readonly string Context;
        /// <summary>
        /// (Computed) Default role template for new created cluster or project (bool)
        /// </summary>
        public readonly bool DefaultRole;
        /// <summary>
        /// (Computed) Role template description (string)
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (Computed) External role template (bool)
        /// </summary>
        public readonly bool External;
        /// <summary>
        /// (Computed) Hidden role template (bool)
        /// </summary>
        public readonly bool Hidden;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) Labels for role template object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        /// <summary>
        /// (Computed) Locked role template (bool)
        /// </summary>
        public readonly bool Locked;
        public readonly string Name;
        /// <summary>
        /// (Computed) Inherit role template IDs (list)
        /// </summary>
        public readonly ImmutableArray<string> RoleTemplateIds;
        /// <summary>
        /// (Computed) Role template policy rules (list)
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRoleTempalteRuleResult> Rules;

        [OutputConstructor]
        private GetRoleTempalteResult(
            bool administrative,

            ImmutableDictionary<string, object> annotations,

            bool builtin,

            string context,

            bool defaultRole,

            string description,

            bool external,

            bool hidden,

            string id,

            ImmutableDictionary<string, object> labels,

            bool locked,

            string name,

            ImmutableArray<string> roleTemplateIds,

            ImmutableArray<Outputs.GetRoleTempalteRuleResult> rules)
        {
            Administrative = administrative;
            Annotations = annotations;
            Builtin = builtin;
            Context = context;
            DefaultRole = defaultRole;
            Description = description;
            External = external;
            Hidden = hidden;
            Id = id;
            Labels = labels;
            Locked = locked;
            Name = name;
            RoleTemplateIds = roleTemplateIds;
            Rules = rules;
        }
    }
}
