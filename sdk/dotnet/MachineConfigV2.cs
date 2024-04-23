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
    /// Provides a Rancher v2 Machine config v2 resource. This can be used to create Machine Config v2 for Rancher v2 and retrieve their information. This resource is available from Rancher v2.6.0 and above.
    /// 
    /// The supported cloud providers includes `amazonec2`, `azure`, `digitalocean`, `harvester`, `linode`, `openstack`, and `vsphere`.
    /// 
    /// ### Using the Harvester Node Driver
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Rancher2 = Pulumi.Rancher2;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Get imported harvester cluster info
    ///     var foo_harvester = Rancher2.GetClusterV2.Invoke(new()
    ///     {
    ///         Name = "foo-harvester",
    ///     });
    /// 
    ///     // Create a new Cloud Credential for an imported Harvester cluster
    ///     var foo_harvesterCloudCredential = new Rancher2.CloudCredential("foo-harvester", new()
    ///     {
    ///         Name = "foo-harvester",
    ///         HarvesterCredentialConfig = new Rancher2.Inputs.CloudCredentialHarvesterCredentialConfigArgs
    ///         {
    ///             ClusterId = foo_harvester.Apply(foo_harvester =&gt; foo_harvester.Apply(getClusterV2Result =&gt; getClusterV2Result.ClusterV1Id)),
    ///             ClusterType = "imported",
    ///             KubeconfigContent = foo_harvester.Apply(foo_harvester =&gt; foo_harvester.Apply(getClusterV2Result =&gt; getClusterV2Result.KubeConfig)),
    ///         },
    ///     });
    /// 
    ///     // Create a new rancher2 machine config v2 using harvester node_driver
    ///     var foo_harvester_v2 = new Rancher2.MachineConfigV2("foo-harvester-v2", new()
    ///     {
    ///         GenerateName = "foo-harvester-v2",
    ///         HarvesterConfig = new Rancher2.Inputs.MachineConfigV2HarvesterConfigArgs
    ///         {
    ///             VmNamespace = "default",
    ///             CpuCount = "2",
    ///             MemorySize = "4",
    ///             DiskInfo = @"    {
    ///         ""disks"": [{
    ///             ""imageName"": ""harvester-public/image-57hzg"",
    ///             ""size"": 40,
    ///             ""bootOrder"": 1
    ///         }]
    ///     }
    /// ",
    ///             NetworkInfo = @"    {
    ///         ""interfaces"": [{
    ///             ""networkName"": ""harvester-public/vlan1""
    ///         }]
    ///     }
    /// ",
    ///             SshUser = "ubuntu",
    ///             UserData = @"    package_update: true
    ///     packages:
    ///       - qemu-guest-agent
    ///       - iptables
    ///     runcmd:
    ///       - - systemctl
    ///         - enable
    ///         - '--now'
    ///         - qemu-guest-agent.service
    /// ",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [Rancher2ResourceType("rancher2:index/machineConfigV2:MachineConfigV2")]
    public partial class MachineConfigV2 : global::Pulumi.CustomResource
    {
        /// <summary>
        /// AWS config for the Machine Config V2. Conflicts with `azure_config`, `digitalocean_config`, `harvester_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        /// </summary>
        [Output("amazonec2Config")]
        public Output<Outputs.MachineConfigV2Amazonec2Config?> Amazonec2Config { get; private set; } = null!;

        /// <summary>
        /// Annotations for Machine Config V2 object (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// Azure config for the Machine Config V2. Conflicts with `amazonec2_config`, `digitalocean_config`, `harvester_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        /// </summary>
        [Output("azureConfig")]
        public Output<Outputs.MachineConfigV2AzureConfig?> AzureConfig { get; private set; } = null!;

        /// <summary>
        /// Digitalocean config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `harvester_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        /// </summary>
        [Output("digitaloceanConfig")]
        public Output<Outputs.MachineConfigV2DigitaloceanConfig?> DigitaloceanConfig { get; private set; } = null!;

        /// <summary>
        /// Cluster V2 fleet namespace
        /// </summary>
        [Output("fleetNamespace")]
        public Output<string?> FleetNamespace { get; private set; } = null!;

        /// <summary>
        /// Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\"prod-pool1\" will generate \"nc-prod-pool1-?????\" name computed at `name` attribute (string)
        /// </summary>
        [Output("generateName")]
        public Output<string> GenerateName { get; private set; } = null!;

        /// <summary>
        /// Harvester config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        /// </summary>
        [Output("harvesterConfig")]
        public Output<Outputs.MachineConfigV2HarvesterConfig?> HarvesterConfig { get; private set; } = null!;

        /// <summary>
        /// (Computed) The machine config kind (string)
        /// </summary>
        [Output("kind")]
        public Output<string> Kind { get; private set; } = null!;

        /// <summary>
        /// Labels for Machine Config V2 object (map)
        /// 
        /// **Note:** `labels` and `node_taints` will be applied to nodes deployed using the Machine Config V2
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// Linode config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `harvester_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        /// </summary>
        [Output("linodeConfig")]
        public Output<Outputs.MachineConfigV2LinodeConfig?> LinodeConfig { get; private set; } = null!;

        /// <summary>
        /// (Computed) The machine config name (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Openstack config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `harvester_config`, `linode_config` and `vsphere_config` (list maxitems:1)
        /// </summary>
        [Output("openstackConfig")]
        public Output<Outputs.MachineConfigV2OpenstackConfig?> OpenstackConfig { get; private set; } = null!;

        /// <summary>
        /// (Computed) The machine config k8s resource version (string)
        /// </summary>
        [Output("resourceVersion")]
        public Output<string> ResourceVersion { get; private set; } = null!;

        /// <summary>
        /// vSphere config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `harvester_config`, `linode_config` and `openstack_config` (list maxitems:1)
        /// </summary>
        [Output("vsphereConfig")]
        public Output<Outputs.MachineConfigV2VsphereConfig?> VsphereConfig { get; private set; } = null!;


        /// <summary>
        /// Create a MachineConfigV2 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MachineConfigV2(string name, MachineConfigV2Args args, CustomResourceOptions? options = null)
            : base("rancher2:index/machineConfigV2:MachineConfigV2", name, args ?? new MachineConfigV2Args(), MakeResourceOptions(options, ""))
        {
        }

        private MachineConfigV2(string name, Input<string> id, MachineConfigV2State? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/machineConfigV2:MachineConfigV2", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MachineConfigV2 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MachineConfigV2 Get(string name, Input<string> id, MachineConfigV2State? state = null, CustomResourceOptions? options = null)
        {
            return new MachineConfigV2(name, id, state, options);
        }
    }

    public sealed class MachineConfigV2Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS config for the Machine Config V2. Conflicts with `azure_config`, `digitalocean_config`, `harvester_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        /// </summary>
        [Input("amazonec2Config")]
        public Input<Inputs.MachineConfigV2Amazonec2ConfigArgs>? Amazonec2Config { get; set; }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for Machine Config V2 object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Azure config for the Machine Config V2. Conflicts with `amazonec2_config`, `digitalocean_config`, `harvester_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        /// </summary>
        [Input("azureConfig")]
        public Input<Inputs.MachineConfigV2AzureConfigArgs>? AzureConfig { get; set; }

        /// <summary>
        /// Digitalocean config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `harvester_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        /// </summary>
        [Input("digitaloceanConfig")]
        public Input<Inputs.MachineConfigV2DigitaloceanConfigArgs>? DigitaloceanConfig { get; set; }

        /// <summary>
        /// Cluster V2 fleet namespace
        /// </summary>
        [Input("fleetNamespace")]
        public Input<string>? FleetNamespace { get; set; }

        /// <summary>
        /// Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\"prod-pool1\" will generate \"nc-prod-pool1-?????\" name computed at `name` attribute (string)
        /// </summary>
        [Input("generateName", required: true)]
        public Input<string> GenerateName { get; set; } = null!;

        /// <summary>
        /// Harvester config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        /// </summary>
        [Input("harvesterConfig")]
        public Input<Inputs.MachineConfigV2HarvesterConfigArgs>? HarvesterConfig { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for Machine Config V2 object (map)
        /// 
        /// **Note:** `labels` and `node_taints` will be applied to nodes deployed using the Machine Config V2
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Linode config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `harvester_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        /// </summary>
        [Input("linodeConfig")]
        public Input<Inputs.MachineConfigV2LinodeConfigArgs>? LinodeConfig { get; set; }

        /// <summary>
        /// Openstack config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `harvester_config`, `linode_config` and `vsphere_config` (list maxitems:1)
        /// </summary>
        [Input("openstackConfig")]
        public Input<Inputs.MachineConfigV2OpenstackConfigArgs>? OpenstackConfig { get; set; }

        /// <summary>
        /// vSphere config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `harvester_config`, `linode_config` and `openstack_config` (list maxitems:1)
        /// </summary>
        [Input("vsphereConfig")]
        public Input<Inputs.MachineConfigV2VsphereConfigArgs>? VsphereConfig { get; set; }

        public MachineConfigV2Args()
        {
        }
        public static new MachineConfigV2Args Empty => new MachineConfigV2Args();
    }

    public sealed class MachineConfigV2State : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS config for the Machine Config V2. Conflicts with `azure_config`, `digitalocean_config`, `harvester_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        /// </summary>
        [Input("amazonec2Config")]
        public Input<Inputs.MachineConfigV2Amazonec2ConfigGetArgs>? Amazonec2Config { get; set; }

        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for Machine Config V2 object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Azure config for the Machine Config V2. Conflicts with `amazonec2_config`, `digitalocean_config`, `harvester_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        /// </summary>
        [Input("azureConfig")]
        public Input<Inputs.MachineConfigV2AzureConfigGetArgs>? AzureConfig { get; set; }

        /// <summary>
        /// Digitalocean config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `harvester_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        /// </summary>
        [Input("digitaloceanConfig")]
        public Input<Inputs.MachineConfigV2DigitaloceanConfigGetArgs>? DigitaloceanConfig { get; set; }

        /// <summary>
        /// Cluster V2 fleet namespace
        /// </summary>
        [Input("fleetNamespace")]
        public Input<string>? FleetNamespace { get; set; }

        /// <summary>
        /// Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\"prod-pool1\" will generate \"nc-prod-pool1-?????\" name computed at `name` attribute (string)
        /// </summary>
        [Input("generateName")]
        public Input<string>? GenerateName { get; set; }

        /// <summary>
        /// Harvester config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        /// </summary>
        [Input("harvesterConfig")]
        public Input<Inputs.MachineConfigV2HarvesterConfigGetArgs>? HarvesterConfig { get; set; }

        /// <summary>
        /// (Computed) The machine config kind (string)
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for Machine Config V2 object (map)
        /// 
        /// **Note:** `labels` and `node_taints` will be applied to nodes deployed using the Machine Config V2
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Linode config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `harvester_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        /// </summary>
        [Input("linodeConfig")]
        public Input<Inputs.MachineConfigV2LinodeConfigGetArgs>? LinodeConfig { get; set; }

        /// <summary>
        /// (Computed) The machine config name (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Openstack config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `harvester_config`, `linode_config` and `vsphere_config` (list maxitems:1)
        /// </summary>
        [Input("openstackConfig")]
        public Input<Inputs.MachineConfigV2OpenstackConfigGetArgs>? OpenstackConfig { get; set; }

        /// <summary>
        /// (Computed) The machine config k8s resource version (string)
        /// </summary>
        [Input("resourceVersion")]
        public Input<string>? ResourceVersion { get; set; }

        /// <summary>
        /// vSphere config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `harvester_config`, `linode_config` and `openstack_config` (list maxitems:1)
        /// </summary>
        [Input("vsphereConfig")]
        public Input<Inputs.MachineConfigV2VsphereConfigGetArgs>? VsphereConfig { get; set; }

        public MachineConfigV2State()
        {
        }
        public static new MachineConfigV2State Empty => new MachineConfigV2State();
    }
}
