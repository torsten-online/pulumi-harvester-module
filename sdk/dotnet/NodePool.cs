// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    /// <summary>
    /// Provides a Rancher v2 Node Pool resource. This can be used to create Node Pool, using Node template for Rancher v2 RKE clusters and retrieve their information.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/node_pool.html.markdown.
    /// </summary>
    public partial class NodePool : Pulumi.CustomResource
    {
        /// <summary>
        /// Annotations for Node Pool object (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// The RKE cluster id to use Node Pool (string)
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// RKE control plane role for created nodes (bool)
        /// </summary>
        [Output("controlPlane")]
        public Output<bool?> ControlPlane { get; private set; } = null!;

        /// <summary>
        /// Delete not ready node after secs. For Rancher v2.3.3 or above. Default `0` (int)
        /// </summary>
        [Output("deleteNotReadyAfterSecs")]
        public Output<int?> DeleteNotReadyAfterSecs { get; private set; } = null!;

        /// <summary>
        /// RKE etcd role for created nodes (bool)
        /// </summary>
        [Output("etcd")]
        public Output<bool?> Etcd { get; private set; } = null!;

        /// <summary>
        /// The prefix for created nodes of the Node Pool (string)
        /// </summary>
        [Output("hostnamePrefix")]
        public Output<string> HostnamePrefix { get; private set; } = null!;

        /// <summary>
        /// Labels for Node Pool object (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// The name of the Node Pool (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Node taints. For Rancher v2.3.3 or above (List)
        /// </summary>
        [Output("nodeTaints")]
        public Output<ImmutableArray<Outputs.NodePoolNodeTaints>> NodeTaints { get; private set; } = null!;

        /// <summary>
        /// The Node Template ID to use for node creation (string)
        /// </summary>
        [Output("nodeTemplateId")]
        public Output<string> NodeTemplateId { get; private set; } = null!;

        /// <summary>
        /// The number of nodes to create on Node Pool. Default `1`. Only values &gt;= 1 allowed (int)
        /// </summary>
        [Output("quantity")]
        public Output<int?> Quantity { get; private set; } = null!;

        /// <summary>
        /// RKE role role for created nodes (bool)
        /// </summary>
        [Output("worker")]
        public Output<bool?> Worker { get; private set; } = null!;


        /// <summary>
        /// Create a NodePool resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NodePool(string name, NodePoolArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/nodePool:NodePool", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private NodePool(string name, Input<string> id, NodePoolState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/nodePool:NodePool", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing NodePool resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NodePool Get(string name, Input<string> id, NodePoolState? state = null, CustomResourceOptions? options = null)
        {
            return new NodePool(name, id, state, options);
        }
    }

    public sealed class NodePoolArgs : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for Node Pool object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The RKE cluster id to use Node Pool (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// RKE control plane role for created nodes (bool)
        /// </summary>
        [Input("controlPlane")]
        public Input<bool>? ControlPlane { get; set; }

        /// <summary>
        /// Delete not ready node after secs. For Rancher v2.3.3 or above. Default `0` (int)
        /// </summary>
        [Input("deleteNotReadyAfterSecs")]
        public Input<int>? DeleteNotReadyAfterSecs { get; set; }

        /// <summary>
        /// RKE etcd role for created nodes (bool)
        /// </summary>
        [Input("etcd")]
        public Input<bool>? Etcd { get; set; }

        /// <summary>
        /// The prefix for created nodes of the Node Pool (string)
        /// </summary>
        [Input("hostnamePrefix", required: true)]
        public Input<string> HostnamePrefix { get; set; } = null!;

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for Node Pool object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the Node Pool (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nodeTaints")]
        private InputList<Inputs.NodePoolNodeTaintsArgs>? _nodeTaints;

        /// <summary>
        /// Node taints. For Rancher v2.3.3 or above (List)
        /// </summary>
        public InputList<Inputs.NodePoolNodeTaintsArgs> NodeTaints
        {
            get => _nodeTaints ?? (_nodeTaints = new InputList<Inputs.NodePoolNodeTaintsArgs>());
            set => _nodeTaints = value;
        }

        /// <summary>
        /// The Node Template ID to use for node creation (string)
        /// </summary>
        [Input("nodeTemplateId", required: true)]
        public Input<string> NodeTemplateId { get; set; } = null!;

        /// <summary>
        /// The number of nodes to create on Node Pool. Default `1`. Only values &gt;= 1 allowed (int)
        /// </summary>
        [Input("quantity")]
        public Input<int>? Quantity { get; set; }

        /// <summary>
        /// RKE role role for created nodes (bool)
        /// </summary>
        [Input("worker")]
        public Input<bool>? Worker { get; set; }

        public NodePoolArgs()
        {
        }
    }

    public sealed class NodePoolState : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for Node Pool object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The RKE cluster id to use Node Pool (string)
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// RKE control plane role for created nodes (bool)
        /// </summary>
        [Input("controlPlane")]
        public Input<bool>? ControlPlane { get; set; }

        /// <summary>
        /// Delete not ready node after secs. For Rancher v2.3.3 or above. Default `0` (int)
        /// </summary>
        [Input("deleteNotReadyAfterSecs")]
        public Input<int>? DeleteNotReadyAfterSecs { get; set; }

        /// <summary>
        /// RKE etcd role for created nodes (bool)
        /// </summary>
        [Input("etcd")]
        public Input<bool>? Etcd { get; set; }

        /// <summary>
        /// The prefix for created nodes of the Node Pool (string)
        /// </summary>
        [Input("hostnamePrefix")]
        public Input<string>? HostnamePrefix { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for Node Pool object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the Node Pool (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nodeTaints")]
        private InputList<Inputs.NodePoolNodeTaintsGetArgs>? _nodeTaints;

        /// <summary>
        /// Node taints. For Rancher v2.3.3 or above (List)
        /// </summary>
        public InputList<Inputs.NodePoolNodeTaintsGetArgs> NodeTaints
        {
            get => _nodeTaints ?? (_nodeTaints = new InputList<Inputs.NodePoolNodeTaintsGetArgs>());
            set => _nodeTaints = value;
        }

        /// <summary>
        /// The Node Template ID to use for node creation (string)
        /// </summary>
        [Input("nodeTemplateId")]
        public Input<string>? NodeTemplateId { get; set; }

        /// <summary>
        /// The number of nodes to create on Node Pool. Default `1`. Only values &gt;= 1 allowed (int)
        /// </summary>
        [Input("quantity")]
        public Input<int>? Quantity { get; set; }

        /// <summary>
        /// RKE role role for created nodes (bool)
        /// </summary>
        [Input("worker")]
        public Input<bool>? Worker { get; set; }

        public NodePoolState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class NodePoolNodeTaintsArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Taint effect. Supported values : `"NoExecute" | "NoSchedule" | "PreferNoSchedule"` (string)
        /// </summary>
        [Input("effect")]
        public Input<string>? Effect { get; set; }

        /// <summary>
        /// Taint key (string)
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// Taint time added (string)
        /// </summary>
        [Input("timeAdded")]
        public Input<string>? TimeAdded { get; set; }

        /// <summary>
        /// Taint value (string)
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public NodePoolNodeTaintsArgs()
        {
        }
    }

    public sealed class NodePoolNodeTaintsGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Taint effect. Supported values : `"NoExecute" | "NoSchedule" | "PreferNoSchedule"` (string)
        /// </summary>
        [Input("effect")]
        public Input<string>? Effect { get; set; }

        /// <summary>
        /// Taint key (string)
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// Taint time added (string)
        /// </summary>
        [Input("timeAdded")]
        public Input<string>? TimeAdded { get; set; }

        /// <summary>
        /// Taint value (string)
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public NodePoolNodeTaintsGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class NodePoolNodeTaints
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
        public readonly string TimeAdded;
        /// <summary>
        /// Taint value (string)
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private NodePoolNodeTaints(
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
