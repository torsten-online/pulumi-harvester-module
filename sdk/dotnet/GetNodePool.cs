// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static partial class Invokes
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 Node Pool resource.
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/nodePool.html.markdown.
        /// </summary>
        [Obsolete("Use GetNodePool.InvokeAsync() instead")]
        public static Task<GetNodePoolResult> GetNodePool(GetNodePoolArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetNodePoolResult>("rancher2:index/getNodePool:getNodePool", args ?? InvokeArgs.Empty, options.WithVersion());
    }
    public static class GetNodePool
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 Node Pool resource.
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/nodePool.html.markdown.
        /// </summary>
        public static Task<GetNodePoolResult> InvokeAsync(GetNodePoolArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetNodePoolResult>("rancher2:index/getNodePool:getNodePool", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetNodePoolArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The RKE cluster id to use Node Pool (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        /// <summary>
        /// The name of the Node Pool (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The Node Template ID to use for node creation (string)
        /// </summary>
        [Input("nodeTemplateId")]
        public string? NodeTemplateId { get; set; }

        public GetNodePoolArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetNodePoolResult
    {
        /// <summary>
        /// (Computed) Annotations for Node Pool object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        public readonly string ClusterId;
        /// <summary>
        /// (Computed) RKE control plane role for created nodes (bool)
        /// </summary>
        public readonly bool ControlPlane;
        /// <summary>
        /// (Computed) Delete not ready node after secs. Default `0` (int)
        /// </summary>
        public readonly int DeleteNotReadyAfterSecs;
        /// <summary>
        /// (Computed) RKE etcd role for created nodes (bool)
        /// </summary>
        public readonly bool Etcd;
        /// <summary>
        /// (Computed) The prefix for created nodes of the Node Pool (string)
        /// </summary>
        public readonly string HostnamePrefix;
        /// <summary>
        /// (Computed) Labels for Node Pool object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        public readonly string Name;
        /// <summary>
        /// (Computed) Node taints (List)
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNodePoolNodeTaintsResult> NodeTaints;
        public readonly string NodeTemplateId;
        /// <summary>
        /// (Computed) The number of nodes to create on Node Pool (int)
        /// </summary>
        public readonly int Quantity;
        /// <summary>
        /// (Computed) RKE role role for created nodes (bool)
        /// </summary>
        public readonly bool Worker;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetNodePoolResult(
            ImmutableDictionary<string, object> annotations,
            string clusterId,
            bool controlPlane,
            int deleteNotReadyAfterSecs,
            bool etcd,
            string hostnamePrefix,
            ImmutableDictionary<string, object> labels,
            string name,
            ImmutableArray<Outputs.GetNodePoolNodeTaintsResult> nodeTaints,
            string nodeTemplateId,
            int quantity,
            bool worker,
            string id)
        {
            Annotations = annotations;
            ClusterId = clusterId;
            ControlPlane = controlPlane;
            DeleteNotReadyAfterSecs = deleteNotReadyAfterSecs;
            Etcd = etcd;
            HostnamePrefix = hostnamePrefix;
            Labels = labels;
            Name = name;
            NodeTaints = nodeTaints;
            NodeTemplateId = nodeTemplateId;
            Quantity = quantity;
            Worker = worker;
            Id = id;
        }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class GetNodePoolNodeTaintsResult
    {
        public readonly string? Effect;
        public readonly string Key;
        public readonly string TimeAdded;
        public readonly string Value;

        [OutputConstructor]
        private GetNodePoolNodeTaintsResult(
            string? effect,
            string key,
            string timeAdded,
            string value)
        {
            Effect = effect;
            Key = key;
            TimeAdded = timeAdded;
            Value = value;
        }
    }
    }
}
