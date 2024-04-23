// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Machine config v2 resource. This can be used to create Machine Config v2 for Rancher v2 and retrieve their information. This resource is available from Rancher v2.6.0 and above.
 *
 * The supported cloud providers includes `amazonec2`, `azure`, `digitalocean`, `harvester`, `linode`, `openstack`, and `vsphere`.
 *
 * ### Using the Harvester Node Driver
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Get imported harvester cluster info
 * const foo-harvester = rancher2.getClusterV2({
 *     name: "foo-harvester",
 * });
 * // Create a new Cloud Credential for an imported Harvester cluster
 * const foo_harvesterCloudCredential = new rancher2.CloudCredential("foo-harvester", {
 *     name: "foo-harvester",
 *     harvesterCredentialConfig: {
 *         clusterId: foo_harvester.then(foo_harvester => foo_harvester.clusterV1Id),
 *         clusterType: "imported",
 *         kubeconfigContent: foo_harvester.then(foo_harvester => foo_harvester.kubeConfig),
 *     },
 * });
 * // Create a new rancher2 machine config v2 using harvester node_driver
 * const foo_harvester_v2 = new rancher2.MachineConfigV2("foo-harvester-v2", {
 *     generateName: "foo-harvester-v2",
 *     harvesterConfig: {
 *         vmNamespace: "default",
 *         cpuCount: "2",
 *         memorySize: "4",
 *         diskInfo: `    {
 *         "disks": [{
 *             "imageName": "harvester-public/image-57hzg",
 *             "size": 40,
 *             "bootOrder": 1
 *         }]
 *     }
 * `,
 *         networkInfo: `    {
 *         "interfaces": [{
 *             "networkName": "harvester-public/vlan1"
 *         }]
 *     }
 * `,
 *         sshUser: "ubuntu",
 *         userData: `    package_update: true
 *     packages:
 *       - qemu-guest-agent
 *       - iptables
 *     runcmd:
 *       - - systemctl
 *         - enable
 *         - '--now'
 *         - qemu-guest-agent.service
 * `,
 *     },
 * });
 * ```
 */
export class MachineConfigV2 extends pulumi.CustomResource {
    /**
     * Get an existing MachineConfigV2 resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MachineConfigV2State, opts?: pulumi.CustomResourceOptions): MachineConfigV2 {
        return new MachineConfigV2(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/machineConfigV2:MachineConfigV2';

    /**
     * Returns true if the given object is an instance of MachineConfigV2.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MachineConfigV2 {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MachineConfigV2.__pulumiType;
    }

    /**
     * AWS config for the Machine Config V2. Conflicts with `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
     */
    public readonly amazonec2Config!: pulumi.Output<outputs.MachineConfigV2Amazonec2Config | undefined>;
    /**
     * Annotations for Machine Config V2 object (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * Azure config for the Machine Config V2. Conflicts with `amazonec2Config`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
     */
    public readonly azureConfig!: pulumi.Output<outputs.MachineConfigV2AzureConfig | undefined>;
    /**
     * Digitalocean config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
     */
    public readonly digitaloceanConfig!: pulumi.Output<outputs.MachineConfigV2DigitaloceanConfig | undefined>;
    /**
     * Cluster V2 fleet namespace
     */
    public readonly fleetNamespace!: pulumi.Output<string | undefined>;
    /**
     * Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\"prod-pool1\" will generate \"nc-prod-pool1-?????\" name computed at `name` attribute (string)
     */
    public readonly generateName!: pulumi.Output<string>;
    /**
     * Harvester config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
     */
    public readonly harvesterConfig!: pulumi.Output<outputs.MachineConfigV2HarvesterConfig | undefined>;
    /**
     * (Computed) The machine config kind (string)
     */
    public /*out*/ readonly kind!: pulumi.Output<string>;
    /**
     * Labels for Machine Config V2 object (map)
     *
     * **Note:** `labels` and `nodeTaints` will be applied to nodes deployed using the Machine Config V2
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * Linode config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
     */
    public readonly linodeConfig!: pulumi.Output<outputs.MachineConfigV2LinodeConfig | undefined>;
    /**
     * (Computed) The machine config name (string)
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * Openstack config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig` and `vsphereConfig` (list maxitems:1)
     */
    public readonly openstackConfig!: pulumi.Output<outputs.MachineConfigV2OpenstackConfig | undefined>;
    /**
     * (Computed) The machine config k8s resource version (string)
     */
    public /*out*/ readonly resourceVersion!: pulumi.Output<string>;
    /**
     * vSphere config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig` and `openstackConfig` (list maxitems:1)
     */
    public readonly vsphereConfig!: pulumi.Output<outputs.MachineConfigV2VsphereConfig | undefined>;

    /**
     * Create a MachineConfigV2 resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MachineConfigV2Args, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MachineConfigV2Args | MachineConfigV2State, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MachineConfigV2State | undefined;
            resourceInputs["amazonec2Config"] = state ? state.amazonec2Config : undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["azureConfig"] = state ? state.azureConfig : undefined;
            resourceInputs["digitaloceanConfig"] = state ? state.digitaloceanConfig : undefined;
            resourceInputs["fleetNamespace"] = state ? state.fleetNamespace : undefined;
            resourceInputs["generateName"] = state ? state.generateName : undefined;
            resourceInputs["harvesterConfig"] = state ? state.harvesterConfig : undefined;
            resourceInputs["kind"] = state ? state.kind : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["linodeConfig"] = state ? state.linodeConfig : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["openstackConfig"] = state ? state.openstackConfig : undefined;
            resourceInputs["resourceVersion"] = state ? state.resourceVersion : undefined;
            resourceInputs["vsphereConfig"] = state ? state.vsphereConfig : undefined;
        } else {
            const args = argsOrState as MachineConfigV2Args | undefined;
            if ((!args || args.generateName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'generateName'");
            }
            resourceInputs["amazonec2Config"] = args ? args.amazonec2Config : undefined;
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["azureConfig"] = args ? args.azureConfig : undefined;
            resourceInputs["digitaloceanConfig"] = args ? args.digitaloceanConfig : undefined;
            resourceInputs["fleetNamespace"] = args ? args.fleetNamespace : undefined;
            resourceInputs["generateName"] = args ? args.generateName : undefined;
            resourceInputs["harvesterConfig"] = args ? args.harvesterConfig : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["linodeConfig"] = args ? args.linodeConfig : undefined;
            resourceInputs["openstackConfig"] = args ? args.openstackConfig : undefined;
            resourceInputs["vsphereConfig"] = args ? args.vsphereConfig : undefined;
            resourceInputs["kind"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["resourceVersion"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MachineConfigV2.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MachineConfigV2 resources.
 */
export interface MachineConfigV2State {
    /**
     * AWS config for the Machine Config V2. Conflicts with `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
     */
    amazonec2Config?: pulumi.Input<inputs.MachineConfigV2Amazonec2Config>;
    /**
     * Annotations for Machine Config V2 object (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Azure config for the Machine Config V2. Conflicts with `amazonec2Config`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
     */
    azureConfig?: pulumi.Input<inputs.MachineConfigV2AzureConfig>;
    /**
     * Digitalocean config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
     */
    digitaloceanConfig?: pulumi.Input<inputs.MachineConfigV2DigitaloceanConfig>;
    /**
     * Cluster V2 fleet namespace
     */
    fleetNamespace?: pulumi.Input<string>;
    /**
     * Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\"prod-pool1\" will generate \"nc-prod-pool1-?????\" name computed at `name` attribute (string)
     */
    generateName?: pulumi.Input<string>;
    /**
     * Harvester config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
     */
    harvesterConfig?: pulumi.Input<inputs.MachineConfigV2HarvesterConfig>;
    /**
     * (Computed) The machine config kind (string)
     */
    kind?: pulumi.Input<string>;
    /**
     * Labels for Machine Config V2 object (map)
     *
     * **Note:** `labels` and `nodeTaints` will be applied to nodes deployed using the Machine Config V2
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Linode config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
     */
    linodeConfig?: pulumi.Input<inputs.MachineConfigV2LinodeConfig>;
    /**
     * (Computed) The machine config name (string)
     */
    name?: pulumi.Input<string>;
    /**
     * Openstack config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig` and `vsphereConfig` (list maxitems:1)
     */
    openstackConfig?: pulumi.Input<inputs.MachineConfigV2OpenstackConfig>;
    /**
     * (Computed) The machine config k8s resource version (string)
     */
    resourceVersion?: pulumi.Input<string>;
    /**
     * vSphere config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig` and `openstackConfig` (list maxitems:1)
     */
    vsphereConfig?: pulumi.Input<inputs.MachineConfigV2VsphereConfig>;
}

/**
 * The set of arguments for constructing a MachineConfigV2 resource.
 */
export interface MachineConfigV2Args {
    /**
     * AWS config for the Machine Config V2. Conflicts with `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
     */
    amazonec2Config?: pulumi.Input<inputs.MachineConfigV2Amazonec2Config>;
    /**
     * Annotations for Machine Config V2 object (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Azure config for the Machine Config V2. Conflicts with `amazonec2Config`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
     */
    azureConfig?: pulumi.Input<inputs.MachineConfigV2AzureConfig>;
    /**
     * Digitalocean config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `harvesterConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
     */
    digitaloceanConfig?: pulumi.Input<inputs.MachineConfigV2DigitaloceanConfig>;
    /**
     * Cluster V2 fleet namespace
     */
    fleetNamespace?: pulumi.Input<string>;
    /**
     * Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\"prod-pool1\" will generate \"nc-prod-pool1-?????\" name computed at `name` attribute (string)
     */
    generateName: pulumi.Input<string>;
    /**
     * Harvester config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `linodeConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
     */
    harvesterConfig?: pulumi.Input<inputs.MachineConfigV2HarvesterConfig>;
    /**
     * Labels for Machine Config V2 object (map)
     *
     * **Note:** `labels` and `nodeTaints` will be applied to nodes deployed using the Machine Config V2
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Linode config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `openstackConfig` and `vsphereConfig` (list maxitems:1)
     */
    linodeConfig?: pulumi.Input<inputs.MachineConfigV2LinodeConfig>;
    /**
     * Openstack config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig` and `vsphereConfig` (list maxitems:1)
     */
    openstackConfig?: pulumi.Input<inputs.MachineConfigV2OpenstackConfig>;
    /**
     * vSphere config for the Machine Config V2. Conflicts with `amazonec2Config`, `azureConfig`, `digitaloceanConfig`, `harvesterConfig`, `linodeConfig` and `openstackConfig` (list maxitems:1)
     */
    vsphereConfig?: pulumi.Input<inputs.MachineConfigV2VsphereConfig>;
}
