// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public partial class NodePool : Pulumi.CustomResource
    {
        /// <summary>
        /// Annotations of the resource
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        [Output("controlPlane")]
        public Output<bool?> ControlPlane { get; private set; } = null!;

        [Output("deleteNotReadyAfterSecs")]
        public Output<int?> DeleteNotReadyAfterSecs { get; private set; } = null!;

        [Output("etcd")]
        public Output<bool?> Etcd { get; private set; } = null!;

        [Output("hostnamePrefix")]
        public Output<string> HostnamePrefix { get; private set; } = null!;

        /// <summary>
        /// Labels of the resource
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("nodeTaints")]
        public Output<ImmutableArray<Outputs.NodePoolNodeTaint>> NodeTaints { get; private set; } = null!;

        [Output("nodeTemplateId")]
        public Output<string> NodeTemplateId { get; private set; } = null!;

        [Output("quantity")]
        public Output<int?> Quantity { get; private set; } = null!;

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
            : base("rancher2:index/nodePool:NodePool", name, args ?? new NodePoolArgs(), MakeResourceOptions(options, ""))
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
        /// Annotations of the resource
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        [Input("controlPlane")]
        public Input<bool>? ControlPlane { get; set; }

        [Input("deleteNotReadyAfterSecs")]
        public Input<int>? DeleteNotReadyAfterSecs { get; set; }

        [Input("etcd")]
        public Input<bool>? Etcd { get; set; }

        [Input("hostnamePrefix", required: true)]
        public Input<string> HostnamePrefix { get; set; } = null!;

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels of the resource
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nodeTaints")]
        private InputList<Inputs.NodePoolNodeTaintArgs>? _nodeTaints;
        public InputList<Inputs.NodePoolNodeTaintArgs> NodeTaints
        {
            get => _nodeTaints ?? (_nodeTaints = new InputList<Inputs.NodePoolNodeTaintArgs>());
            set => _nodeTaints = value;
        }

        [Input("nodeTemplateId", required: true)]
        public Input<string> NodeTemplateId { get; set; } = null!;

        [Input("quantity")]
        public Input<int>? Quantity { get; set; }

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
        /// Annotations of the resource
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("controlPlane")]
        public Input<bool>? ControlPlane { get; set; }

        [Input("deleteNotReadyAfterSecs")]
        public Input<int>? DeleteNotReadyAfterSecs { get; set; }

        [Input("etcd")]
        public Input<bool>? Etcd { get; set; }

        [Input("hostnamePrefix")]
        public Input<string>? HostnamePrefix { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels of the resource
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nodeTaints")]
        private InputList<Inputs.NodePoolNodeTaintGetArgs>? _nodeTaints;
        public InputList<Inputs.NodePoolNodeTaintGetArgs> NodeTaints
        {
            get => _nodeTaints ?? (_nodeTaints = new InputList<Inputs.NodePoolNodeTaintGetArgs>());
            set => _nodeTaints = value;
        }

        [Input("nodeTemplateId")]
        public Input<string>? NodeTemplateId { get; set; }

        [Input("quantity")]
        public Input<int>? Quantity { get; set; }

        [Input("worker")]
        public Input<bool>? Worker { get; set; }

        public NodePoolState()
        {
        }
    }
}
