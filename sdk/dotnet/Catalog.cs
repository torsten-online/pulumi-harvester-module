// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    /// <summary>
    /// Provides a Rancher v2 Catalog resource. This can be used to create cluster, global and/or project catalogs for Rancher v2 environments and retrieve their information.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/catalog.html.markdown.
    /// </summary>
    public partial class Catalog : Pulumi.CustomResource
    {
        /// <summary>
        /// Annotations for the catalog (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// The branch of the catalog repo to use. Default `master` (string)
        /// </summary>
        [Output("branch")]
        public Output<string?> Branch { get; private set; } = null!;

        /// <summary>
        /// The cluster id of the catalog. Mandatory if `scope = cluster` (string)
        /// </summary>
        [Output("clusterId")]
        public Output<string?> ClusterId { get; private set; } = null!;

        /// <summary>
        /// A catalog description (string)
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The kind of the catalog. Just helm by the moment (string)
        /// </summary>
        [Output("kind")]
        public Output<string?> Kind { get; private set; } = null!;

        /// <summary>
        /// Labels for the catalog (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// The name of the catalog (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The password to access the catalog if needed (string)
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// The project id of the catalog. Mandatory if `scope = project` (string)
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
        /// </summary>
        [Output("refresh")]
        public Output<bool?> Refresh { get; private set; } = null!;

        /// <summary>
        /// The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
        /// </summary>
        [Output("scope")]
        public Output<string?> Scope { get; private set; } = null!;

        /// <summary>
        /// The url of the catalog repo (string)
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;

        /// <summary>
        /// The username to access the catalog if needed (string)
        /// </summary>
        [Output("username")]
        public Output<string?> Username { get; private set; } = null!;


        /// <summary>
        /// Create a Catalog resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Catalog(string name, CatalogArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/catalog:Catalog", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private Catalog(string name, Input<string> id, CatalogState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/catalog:Catalog", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Catalog resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Catalog Get(string name, Input<string> id, CatalogState? state = null, CustomResourceOptions? options = null)
        {
            return new Catalog(name, id, state, options);
        }
    }

    public sealed class CatalogArgs : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for the catalog (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The branch of the catalog repo to use. Default `master` (string)
        /// </summary>
        [Input("branch")]
        public Input<string>? Branch { get; set; }

        /// <summary>
        /// The cluster id of the catalog. Mandatory if `scope = cluster` (string)
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// A catalog description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The kind of the catalog. Just helm by the moment (string)
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for the catalog (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the catalog (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The password to access the catalog if needed (string)
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// The project id of the catalog. Mandatory if `scope = project` (string)
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
        /// </summary>
        [Input("refresh")]
        public Input<bool>? Refresh { get; set; }

        /// <summary>
        /// The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        /// <summary>
        /// The url of the catalog repo (string)
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        /// <summary>
        /// The username to access the catalog if needed (string)
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public CatalogArgs()
        {
        }
    }

    public sealed class CatalogState : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for the catalog (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// The branch of the catalog repo to use. Default `master` (string)
        /// </summary>
        [Input("branch")]
        public Input<string>? Branch { get; set; }

        /// <summary>
        /// The cluster id of the catalog. Mandatory if `scope = cluster` (string)
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// A catalog description (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The kind of the catalog. Just helm by the moment (string)
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for the catalog (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the catalog (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The password to access the catalog if needed (string)
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// The project id of the catalog. Mandatory if `scope = project` (string)
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
        /// </summary>
        [Input("refresh")]
        public Input<bool>? Refresh { get; set; }

        /// <summary>
        /// The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        /// <summary>
        /// The url of the catalog repo (string)
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// The username to access the catalog if needed (string)
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public CatalogState()
        {
        }
    }
}
