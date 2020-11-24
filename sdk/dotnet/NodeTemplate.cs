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
    /// Provides a Rancher v2 Node Template resource. This can be used to create Node Template for Rancher v2 and retrieve their information.
    /// 
    /// amazonec2, azure, digitalocean, linode, opennebula, openstack, and vsphere drivers are supported for node templates.
    /// 
    /// **Note** If you are upgrading to Rancher v2.3.3, please take a look to final section
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Create a new rancher2 Node Template up to Rancher 2.1.x
    ///         var foo = new Rancher2.NodeTemplate("foo", new Rancher2.NodeTemplateArgs
    ///         {
    ///             Amazonec2Config = new Rancher2.Inputs.NodeTemplateAmazonec2ConfigArgs
    ///             {
    ///                 AccessKey = "AWS_ACCESS_KEY",
    ///                 Ami = "&lt;AMI_ID&gt;",
    ///                 Region = "&lt;REGION&gt;",
    ///                 SecretKey = "&lt;AWS_SECRET_KEY&gt;",
    ///                 SecurityGroups = 
    ///                 {
    ///                     "&lt;AWS_SECURITY_GROUP&gt;",
    ///                 },
    ///                 SubnetId = "&lt;SUBNET_ID&gt;",
    ///                 VpcId = "&lt;VPC_ID&gt;",
    ///                 Zone = "&lt;ZONE&gt;",
    ///             },
    ///             Description = "foo test",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Create a new rancher2 Node Template from Rancher 2.2.x
    ///         var fooCloudCredential = new Rancher2.CloudCredential("fooCloudCredential", new Rancher2.CloudCredentialArgs
    ///         {
    ///             Description = "foo test",
    ///             Amazonec2CredentialConfig = new Rancher2.Inputs.CloudCredentialAmazonec2CredentialConfigArgs
    ///             {
    ///                 AccessKey = "&lt;AWS_ACCESS_KEY&gt;",
    ///                 SecretKey = "&lt;AWS_SECRET_KEY&gt;",
    ///             },
    ///         });
    ///         var fooNodeTemplate = new Rancher2.NodeTemplate("fooNodeTemplate", new Rancher2.NodeTemplateArgs
    ///         {
    ///             Description = "foo test",
    ///             CloudCredentialId = fooCloudCredential.Id,
    ///             Amazonec2Config = new Rancher2.Inputs.NodeTemplateAmazonec2ConfigArgs
    ///             {
    ///                 Ami = "&lt;AMI_ID&gt;",
    ///                 Region = "&lt;REGION&gt;",
    ///                 SecurityGroups = 
    ///                 {
    ///                     "&lt;AWS_SECURITY_GROUP&gt;",
    ///                 },
    ///                 SubnetId = "&lt;SUBNET_ID&gt;",
    ///                 VpcId = "&lt;VPC_ID&gt;",
    ///                 Zone = "&lt;ZONE&gt;",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Node Template can be imported using the Rancher Node Template ID
    /// 
    /// ```sh
    ///  $ pulumi import rancher2:index/nodeTemplate:NodeTemplate foo &amp;lt;node_template_id&amp;gt;
    /// ```
    /// </summary>
    public partial class NodeTemplate : Pulumi.CustomResource
    {
        /// <summary>
        /// AWS config for the Node Template (list maxitems:1)
        /// </summary>
        [Output("amazonec2Config")]
        public Output<Outputs.NodeTemplateAmazonec2Config?> Amazonec2Config { get; private set; } = null!;

        /// <summary>
        /// Annotations for Node Template object (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// Auth certificate authority for the Node Template (string)
        /// </summary>
        [Output("authCertificateAuthority")]
        public Output<string?> AuthCertificateAuthority { get; private set; } = null!;

        /// <summary>
        /// Auth key for the Node Template (string)
        /// </summary>
        [Output("authKey")]
        public Output<string?> AuthKey { get; private set; } = null!;

        /// <summary>
        /// Azure config for the Node Template (list maxitems:1)
        /// </summary>
        [Output("azureConfig")]
        public Output<Outputs.NodeTemplateAzureConfig?> AzureConfig { get; private set; } = null!;

        /// <summary>
        /// Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
        /// </summary>
        [Output("cloudCredentialId")]
        public Output<string?> CloudCredentialId { get; private set; } = null!;

        /// <summary>
        /// Description for the Node Template (string)
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Digitalocean config for the Node Template (list maxitems:1)
        /// </summary>
        [Output("digitaloceanConfig")]
        public Output<Outputs.NodeTemplateDigitaloceanConfig?> DigitaloceanConfig { get; private set; } = null!;

        /// <summary>
        /// (Computed) The driver of the node template (string)
        /// </summary>
        [Output("driver")]
        public Output<string> Driver { get; private set; } = null!;

        /// <summary>
        /// The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
        /// </summary>
        [Output("driverId")]
        public Output<string> DriverId { get; private set; } = null!;

        /// <summary>
        /// Engine environment for the node template (string)
        /// </summary>
        [Output("engineEnv")]
        public Output<ImmutableDictionary<string, object>?> EngineEnv { get; private set; } = null!;

        /// <summary>
        /// Insecure registry for the node template (list)
        /// </summary>
        [Output("engineInsecureRegistries")]
        public Output<ImmutableArray<string>> EngineInsecureRegistries { get; private set; } = null!;

        /// <summary>
        /// Docker engine install URL for the node template. Default `https://releases.rancher.com/install-docker/18.09.sh`. Available install docker versions at `https://github.com/rancher/install-docker` (string)
        /// </summary>
        [Output("engineInstallUrl")]
        public Output<string?> EngineInstallUrl { get; private set; } = null!;

        /// <summary>
        /// Engine label for the node template (string)
        /// </summary>
        [Output("engineLabel")]
        public Output<ImmutableDictionary<string, object>?> EngineLabel { get; private set; } = null!;

        /// <summary>
        /// Engine options for the node template (map)
        /// </summary>
        [Output("engineOpt")]
        public Output<ImmutableDictionary<string, object>?> EngineOpt { get; private set; } = null!;

        /// <summary>
        /// Engine registry mirror for the node template (list)
        /// </summary>
        [Output("engineRegistryMirrors")]
        public Output<ImmutableArray<string>> EngineRegistryMirrors { get; private set; } = null!;

        /// <summary>
        /// Engine storage driver for the node template (string)
        /// </summary>
        [Output("engineStorageDriver")]
        public Output<string?> EngineStorageDriver { get; private set; } = null!;

        /// <summary>
        /// Labels for Node Template object (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// Linode config for the Node Template (list maxitems:1)
        /// </summary>
        [Output("linodeConfig")]
        public Output<Outputs.NodeTemplateLinodeConfig?> LinodeConfig { get; private set; } = null!;

        /// <summary>
        /// The name of the Node Template (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Opennebula config for the Node Template (list maxitems:1)
        /// </summary>
        [Output("opennebulaConfig")]
        public Output<Outputs.NodeTemplateOpennebulaConfig?> OpennebulaConfig { get; private set; } = null!;

        /// <summary>
        /// Openstack config for the Node Template (list maxitems:1)
        /// </summary>
        [Output("openstackConfig")]
        public Output<Outputs.NodeTemplateOpenstackConfig?> OpenstackConfig { get; private set; } = null!;

        /// <summary>
        /// Engine storage driver for the node template (bool)
        /// </summary>
        [Output("useInternalIpAddress")]
        public Output<bool?> UseInternalIpAddress { get; private set; } = null!;

        /// <summary>
        /// vSphere config for the Node Template (list maxitems:1)
        /// </summary>
        [Output("vsphereConfig")]
        public Output<Outputs.NodeTemplateVsphereConfig?> VsphereConfig { get; private set; } = null!;


        /// <summary>
        /// Create a NodeTemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NodeTemplate(string name, NodeTemplateArgs? args = null, CustomResourceOptions? options = null)
            : base("rancher2:index/nodeTemplate:NodeTemplate", name, args ?? new NodeTemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NodeTemplate(string name, Input<string> id, NodeTemplateState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/nodeTemplate:NodeTemplate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NodeTemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NodeTemplate Get(string name, Input<string> id, NodeTemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new NodeTemplate(name, id, state, options);
        }
    }

    public sealed class NodeTemplateArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("amazonec2Config")]
        public Input<Inputs.NodeTemplateAmazonec2ConfigArgs>? Amazonec2Config { get; set; }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for Node Template object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Auth certificate authority for the Node Template (string)
        /// </summary>
        [Input("authCertificateAuthority")]
        public Input<string>? AuthCertificateAuthority { get; set; }

        /// <summary>
        /// Auth key for the Node Template (string)
        /// </summary>
        [Input("authKey")]
        public Input<string>? AuthKey { get; set; }

        /// <summary>
        /// Azure config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("azureConfig")]
        public Input<Inputs.NodeTemplateAzureConfigArgs>? AzureConfig { get; set; }

        /// <summary>
        /// Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
        /// </summary>
        [Input("cloudCredentialId")]
        public Input<string>? CloudCredentialId { get; set; }

        /// <summary>
        /// Description for the Node Template (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Digitalocean config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("digitaloceanConfig")]
        public Input<Inputs.NodeTemplateDigitaloceanConfigArgs>? DigitaloceanConfig { get; set; }

        /// <summary>
        /// The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
        /// </summary>
        [Input("driverId")]
        public Input<string>? DriverId { get; set; }

        [Input("engineEnv")]
        private InputMap<object>? _engineEnv;

        /// <summary>
        /// Engine environment for the node template (string)
        /// </summary>
        public InputMap<object> EngineEnv
        {
            get => _engineEnv ?? (_engineEnv = new InputMap<object>());
            set => _engineEnv = value;
        }

        [Input("engineInsecureRegistries")]
        private InputList<string>? _engineInsecureRegistries;

        /// <summary>
        /// Insecure registry for the node template (list)
        /// </summary>
        public InputList<string> EngineInsecureRegistries
        {
            get => _engineInsecureRegistries ?? (_engineInsecureRegistries = new InputList<string>());
            set => _engineInsecureRegistries = value;
        }

        /// <summary>
        /// Docker engine install URL for the node template. Default `https://releases.rancher.com/install-docker/18.09.sh`. Available install docker versions at `https://github.com/rancher/install-docker` (string)
        /// </summary>
        [Input("engineInstallUrl")]
        public Input<string>? EngineInstallUrl { get; set; }

        [Input("engineLabel")]
        private InputMap<object>? _engineLabel;

        /// <summary>
        /// Engine label for the node template (string)
        /// </summary>
        public InputMap<object> EngineLabel
        {
            get => _engineLabel ?? (_engineLabel = new InputMap<object>());
            set => _engineLabel = value;
        }

        [Input("engineOpt")]
        private InputMap<object>? _engineOpt;

        /// <summary>
        /// Engine options for the node template (map)
        /// </summary>
        public InputMap<object> EngineOpt
        {
            get => _engineOpt ?? (_engineOpt = new InputMap<object>());
            set => _engineOpt = value;
        }

        [Input("engineRegistryMirrors")]
        private InputList<string>? _engineRegistryMirrors;

        /// <summary>
        /// Engine registry mirror for the node template (list)
        /// </summary>
        public InputList<string> EngineRegistryMirrors
        {
            get => _engineRegistryMirrors ?? (_engineRegistryMirrors = new InputList<string>());
            set => _engineRegistryMirrors = value;
        }

        /// <summary>
        /// Engine storage driver for the node template (string)
        /// </summary>
        [Input("engineStorageDriver")]
        public Input<string>? EngineStorageDriver { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for Node Template object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Linode config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("linodeConfig")]
        public Input<Inputs.NodeTemplateLinodeConfigArgs>? LinodeConfig { get; set; }

        /// <summary>
        /// The name of the Node Template (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Opennebula config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("opennebulaConfig")]
        public Input<Inputs.NodeTemplateOpennebulaConfigArgs>? OpennebulaConfig { get; set; }

        /// <summary>
        /// Openstack config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("openstackConfig")]
        public Input<Inputs.NodeTemplateOpenstackConfigArgs>? OpenstackConfig { get; set; }

        /// <summary>
        /// Engine storage driver for the node template (bool)
        /// </summary>
        [Input("useInternalIpAddress")]
        public Input<bool>? UseInternalIpAddress { get; set; }

        /// <summary>
        /// vSphere config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("vsphereConfig")]
        public Input<Inputs.NodeTemplateVsphereConfigArgs>? VsphereConfig { get; set; }

        public NodeTemplateArgs()
        {
        }
    }

    public sealed class NodeTemplateState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("amazonec2Config")]
        public Input<Inputs.NodeTemplateAmazonec2ConfigGetArgs>? Amazonec2Config { get; set; }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for Node Template object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Auth certificate authority for the Node Template (string)
        /// </summary>
        [Input("authCertificateAuthority")]
        public Input<string>? AuthCertificateAuthority { get; set; }

        /// <summary>
        /// Auth key for the Node Template (string)
        /// </summary>
        [Input("authKey")]
        public Input<string>? AuthKey { get; set; }

        /// <summary>
        /// Azure config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("azureConfig")]
        public Input<Inputs.NodeTemplateAzureConfigGetArgs>? AzureConfig { get; set; }

        /// <summary>
        /// Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
        /// </summary>
        [Input("cloudCredentialId")]
        public Input<string>? CloudCredentialId { get; set; }

        /// <summary>
        /// Description for the Node Template (string)
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Digitalocean config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("digitaloceanConfig")]
        public Input<Inputs.NodeTemplateDigitaloceanConfigGetArgs>? DigitaloceanConfig { get; set; }

        /// <summary>
        /// (Computed) The driver of the node template (string)
        /// </summary>
        [Input("driver")]
        public Input<string>? Driver { get; set; }

        /// <summary>
        /// The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
        /// </summary>
        [Input("driverId")]
        public Input<string>? DriverId { get; set; }

        [Input("engineEnv")]
        private InputMap<object>? _engineEnv;

        /// <summary>
        /// Engine environment for the node template (string)
        /// </summary>
        public InputMap<object> EngineEnv
        {
            get => _engineEnv ?? (_engineEnv = new InputMap<object>());
            set => _engineEnv = value;
        }

        [Input("engineInsecureRegistries")]
        private InputList<string>? _engineInsecureRegistries;

        /// <summary>
        /// Insecure registry for the node template (list)
        /// </summary>
        public InputList<string> EngineInsecureRegistries
        {
            get => _engineInsecureRegistries ?? (_engineInsecureRegistries = new InputList<string>());
            set => _engineInsecureRegistries = value;
        }

        /// <summary>
        /// Docker engine install URL for the node template. Default `https://releases.rancher.com/install-docker/18.09.sh`. Available install docker versions at `https://github.com/rancher/install-docker` (string)
        /// </summary>
        [Input("engineInstallUrl")]
        public Input<string>? EngineInstallUrl { get; set; }

        [Input("engineLabel")]
        private InputMap<object>? _engineLabel;

        /// <summary>
        /// Engine label for the node template (string)
        /// </summary>
        public InputMap<object> EngineLabel
        {
            get => _engineLabel ?? (_engineLabel = new InputMap<object>());
            set => _engineLabel = value;
        }

        [Input("engineOpt")]
        private InputMap<object>? _engineOpt;

        /// <summary>
        /// Engine options for the node template (map)
        /// </summary>
        public InputMap<object> EngineOpt
        {
            get => _engineOpt ?? (_engineOpt = new InputMap<object>());
            set => _engineOpt = value;
        }

        [Input("engineRegistryMirrors")]
        private InputList<string>? _engineRegistryMirrors;

        /// <summary>
        /// Engine registry mirror for the node template (list)
        /// </summary>
        public InputList<string> EngineRegistryMirrors
        {
            get => _engineRegistryMirrors ?? (_engineRegistryMirrors = new InputList<string>());
            set => _engineRegistryMirrors = value;
        }

        /// <summary>
        /// Engine storage driver for the node template (string)
        /// </summary>
        [Input("engineStorageDriver")]
        public Input<string>? EngineStorageDriver { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for Node Template object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Linode config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("linodeConfig")]
        public Input<Inputs.NodeTemplateLinodeConfigGetArgs>? LinodeConfig { get; set; }

        /// <summary>
        /// The name of the Node Template (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Opennebula config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("opennebulaConfig")]
        public Input<Inputs.NodeTemplateOpennebulaConfigGetArgs>? OpennebulaConfig { get; set; }

        /// <summary>
        /// Openstack config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("openstackConfig")]
        public Input<Inputs.NodeTemplateOpenstackConfigGetArgs>? OpenstackConfig { get; set; }

        /// <summary>
        /// Engine storage driver for the node template (bool)
        /// </summary>
        [Input("useInternalIpAddress")]
        public Input<bool>? UseInternalIpAddress { get; set; }

        /// <summary>
        /// vSphere config for the Node Template (list maxitems:1)
        /// </summary>
        [Input("vsphereConfig")]
        public Input<Inputs.NodeTemplateVsphereConfigGetArgs>? VsphereConfig { get; set; }

        public NodeTemplateState()
        {
        }
    }
}
