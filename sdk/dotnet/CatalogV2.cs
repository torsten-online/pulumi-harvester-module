// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    /// <summary>
    /// Provides a Rancher Catalog v2 resource. This can be used to create cluster helm catalogs for Rancher v2 environments and retrieve their information. Catalog v2 resource is available at Rancher v2.5.x and above.
    /// 
    /// ## Import
    /// 
    /// V2 catalogs can be imported using the Rancher cluster ID and Catalog V2 name.
    /// 
    /// ```sh
    ///  $ pulumi import rancher2:index/catalogV2:CatalogV2 foo &amp;lt;CLUSTER_ID&amp;gt;.&amp;lt;CATALOG_V2_NAME&amp;gt;
    /// ```
    /// </summary>
    public partial class CatalogV2 : Pulumi.CustomResource
    {
        /// <summary>
        /// Annotations for the catalog v2 (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// PEM encoded CA bundle which will be used to validate the repo's certificate (string)
        /// </summary>
        [Output("caBundle")]
        public Output<string?> CaBundle { get; private set; } = null!;

        /// <summary>
        /// The cluster id of the catalog V2 (string)
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Git Repository branch containing Helm chart definitions. Default `master` (string)
        /// </summary>
        [Output("gitBranch")]
        public Output<string?> GitBranch { get; private set; } = null!;

        /// <summary>
        /// The url of the catalog v2 repo (string)
        /// </summary>
        [Output("gitRepo")]
        public Output<string?> GitRepo { get; private set; } = null!;

        /// <summary>
        /// Use insecure HTTPS to download the repo's index. Default: `false` (bool)
        /// </summary>
        [Output("insecure")]
        public Output<bool?> Insecure { get; private set; } = null!;

        /// <summary>
        /// Labels for the catalog v2 (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// The name of the catalog v2 (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// (Computed) The k8s resource version (string)
        /// </summary>
        [Output("resourceVersion")]
        public Output<string> ResourceVersion { get; private set; } = null!;

        /// <summary>
        /// K8s secret name to be used to connect to the repo (string)
        /// </summary>
        [Output("secretName")]
        public Output<string?> SecretName { get; private set; } = null!;

        /// <summary>
        /// K8s secret namespace (string)
        /// </summary>
        [Output("secretNamespace")]
        public Output<string?> SecretNamespace { get; private set; } = null!;

        /// <summary>
        /// K8s service account used to deploy charts instead of the end users credentials (string)
        /// </summary>
        [Output("serviceAccount")]
        public Output<string?> ServiceAccount { get; private set; } = null!;

        /// <summary>
        /// The username to access the catalog if needed (string)
        /// </summary>
        [Output("serviceAccountNamespace")]
        public Output<string?> ServiceAccountNamespace { get; private set; } = null!;

        /// <summary>
        /// URL to an index generated by Helm (string)
        /// </summary>
        [Output("url")]
        public Output<string?> Url { get; private set; } = null!;


        /// <summary>
        /// Create a CatalogV2 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CatalogV2(string name, CatalogV2Args args, CustomResourceOptions? options = null)
            : base("rancher2:index/catalogV2:CatalogV2", name, args ?? new CatalogV2Args(), MakeResourceOptions(options, ""))
        {
        }

        private CatalogV2(string name, Input<string> id, CatalogV2State? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/catalogV2:CatalogV2", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CatalogV2 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CatalogV2 Get(string name, Input<string> id, CatalogV2State? state = null, CustomResourceOptions? options = null)
        {
            return new CatalogV2(name, id, state, options);
        }
    }

    public sealed class CatalogV2Args : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for the catalog v2 (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// PEM encoded CA bundle which will be used to validate the repo's certificate (string)
        /// </summary>
        [Input("caBundle")]
        public Input<string>? CaBundle { get; set; }

        /// <summary>
        /// The cluster id of the catalog V2 (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Git Repository branch containing Helm chart definitions. Default `master` (string)
        /// </summary>
        [Input("gitBranch")]
        public Input<string>? GitBranch { get; set; }

        /// <summary>
        /// The url of the catalog v2 repo (string)
        /// </summary>
        [Input("gitRepo")]
        public Input<string>? GitRepo { get; set; }

        /// <summary>
        /// Use insecure HTTPS to download the repo's index. Default: `false` (bool)
        /// </summary>
        [Input("insecure")]
        public Input<bool>? Insecure { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for the catalog v2 (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the catalog v2 (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// K8s secret name to be used to connect to the repo (string)
        /// </summary>
        [Input("secretName")]
        public Input<string>? SecretName { get; set; }

        /// <summary>
        /// K8s secret namespace (string)
        /// </summary>
        [Input("secretNamespace")]
        public Input<string>? SecretNamespace { get; set; }

        /// <summary>
        /// K8s service account used to deploy charts instead of the end users credentials (string)
        /// </summary>
        [Input("serviceAccount")]
        public Input<string>? ServiceAccount { get; set; }

        /// <summary>
        /// The username to access the catalog if needed (string)
        /// </summary>
        [Input("serviceAccountNamespace")]
        public Input<string>? ServiceAccountNamespace { get; set; }

        /// <summary>
        /// URL to an index generated by Helm (string)
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public CatalogV2Args()
        {
        }
    }

    public sealed class CatalogV2State : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for the catalog v2 (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// PEM encoded CA bundle which will be used to validate the repo's certificate (string)
        /// </summary>
        [Input("caBundle")]
        public Input<string>? CaBundle { get; set; }

        /// <summary>
        /// The cluster id of the catalog V2 (string)
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// If disabled the repo clone will not be updated or allowed to be installed from. Default: `true` (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Git Repository branch containing Helm chart definitions. Default `master` (string)
        /// </summary>
        [Input("gitBranch")]
        public Input<string>? GitBranch { get; set; }

        /// <summary>
        /// The url of the catalog v2 repo (string)
        /// </summary>
        [Input("gitRepo")]
        public Input<string>? GitRepo { get; set; }

        /// <summary>
        /// Use insecure HTTPS to download the repo's index. Default: `false` (bool)
        /// </summary>
        [Input("insecure")]
        public Input<bool>? Insecure { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for the catalog v2 (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the catalog v2 (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// (Computed) The k8s resource version (string)
        /// </summary>
        [Input("resourceVersion")]
        public Input<string>? ResourceVersion { get; set; }

        /// <summary>
        /// K8s secret name to be used to connect to the repo (string)
        /// </summary>
        [Input("secretName")]
        public Input<string>? SecretName { get; set; }

        /// <summary>
        /// K8s secret namespace (string)
        /// </summary>
        [Input("secretNamespace")]
        public Input<string>? SecretNamespace { get; set; }

        /// <summary>
        /// K8s service account used to deploy charts instead of the end users credentials (string)
        /// </summary>
        [Input("serviceAccount")]
        public Input<string>? ServiceAccount { get; set; }

        /// <summary>
        /// The username to access the catalog if needed (string)
        /// </summary>
        [Input("serviceAccountNamespace")]
        public Input<string>? ServiceAccountNamespace { get; set; }

        /// <summary>
        /// URL to an index generated by Helm (string)
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public CatalogV2State()
        {
        }
    }
}
