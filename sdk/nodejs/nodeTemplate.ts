// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Node Template resource. This can be used to create Node Template for Rancher v2 and retrieve their information. 
 * 
 * amazonec2, azure, digitalocean, openstack and vsphere drivers are supported for node templates.
 * 
 * **Note** If you are upgrading to Rancher v2.3.3, please take a look to final section
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 * 
 * // Create a new rancher2 Node Template up to Rancher 2.1.x
 * const foo = new rancher2.NodeTemplate("foo", {
 *     amazonec2Config: {
 *         accessKey: "AWS_ACCESS_KEY",
 *         ami: "<AMI_ID>",
 *         region: "<REGION>",
 *         secretKey: "<AWS_SECRET_KEY>",
 *         securityGroups: ["<AWS_SECURITY_GROUP>"],
 *         subnetId: "<SUBNET_ID>",
 *         vpcId: "<VPC_ID>",
 *         zone: "<ZONE>",
 *     },
 *     description: "foo test",
 * });
 * ```
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 * 
 * // Create a new rancher2 Node Template from Rancher 2.2.x
 * const fooCloudCredential = new rancher2.CloudCredential("foo", {
 *     amazonec2CredentialConfig: {
 *         accessKey: "<AWS_ACCESS_KEY>",
 *         secretKey: "<AWS_SECRET_KEY>",
 *     },
 *     description: "foo test",
 * });
 * const fooNodeTemplate = new rancher2.NodeTemplate("foo", {
 *     amazonec2Config: {
 *         ami: "<AMI_ID>",
 *         region: "<REGION>",
 *         securityGroups: ["<AWS_SECURITY_GROUP>"],
 *         subnetId: "<SUBNET_ID>",
 *         vpcId: "<VPC_ID>",
 *         zone: "<ZONE>",
 *     },
 *     cloudCredentialId: fooCloudCredential.id,
 *     description: "foo test",
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/node_template.html.markdown.
 */
export class NodeTemplate extends pulumi.CustomResource {
    /**
     * Get an existing NodeTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NodeTemplateState, opts?: pulumi.CustomResourceOptions): NodeTemplate {
        return new NodeTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/nodeTemplate:NodeTemplate';

    /**
     * Returns true if the given object is an instance of NodeTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NodeTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NodeTemplate.__pulumiType;
    }

    /**
     * AWS config for the Node Template (list maxitems:1)
     */
    public readonly amazonec2Config!: pulumi.Output<outputs.NodeTemplateAmazonec2Config | undefined>;
    /**
     * Annotations for Node Template object (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * Auth certificate authority for the Node Template (string)
     */
    public readonly authCertificateAuthority!: pulumi.Output<string | undefined>;
    /**
     * Auth key for the Node Template (string)
     */
    public readonly authKey!: pulumi.Output<string | undefined>;
    /**
     * Azure config for the Node Template (list maxitems:1)
     */
    public readonly azureConfig!: pulumi.Output<outputs.NodeTemplateAzureConfig | undefined>;
    /**
     * Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
     */
    public readonly cloudCredentialId!: pulumi.Output<string | undefined>;
    /**
     * Description for the Node Template (string)
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Digitalocean config for the Node Template (list maxitems:1)
     */
    public readonly digitaloceanConfig!: pulumi.Output<outputs.NodeTemplateDigitaloceanConfig | undefined>;
    /**
     * (Computed) The driver of the node template (string)
     */
    public /*out*/ readonly driver!: pulumi.Output<string>;
    /**
     * The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
     */
    public readonly driverId!: pulumi.Output<string>;
    /**
     * Engine environment for the node template (string)
     */
    public readonly engineEnv!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * Insecure registry for the node template (list)
     */
    public readonly engineInsecureRegistries!: pulumi.Output<string[] | undefined>;
    /**
     * Docker engine install URL for the node template. Default `https://releases.rancher.com/install-docker/18.09.sh`. Available install docker versions at `https://github.com/rancher/install-docker` (string)
     */
    public readonly engineInstallUrl!: pulumi.Output<string | undefined>;
    /**
     * Engine label for the node template (string)
     */
    public readonly engineLabel!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * Engine options for the node template (map)
     */
    public readonly engineOpt!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * Engine registry mirror for the node template (list)
     */
    public readonly engineRegistryMirrors!: pulumi.Output<string[] | undefined>;
    /**
     * Engine storage driver for the node template (string)
     */
    public readonly engineStorageDriver!: pulumi.Output<string | undefined>;
    /**
     * Labels for Node Template object (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The name of the Node Template (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Openstack config for the Node Template (list maxitems:1)
     */
    public readonly openstackConfig!: pulumi.Output<outputs.NodeTemplateOpenstackConfig | undefined>;
    /**
     * Engine storage driver for the node template (bool)
     */
    public readonly useInternalIpAddress!: pulumi.Output<boolean | undefined>;
    /**
     * vSphere config for the Node Template (list maxitems:1)
     */
    public readonly vsphereConfig!: pulumi.Output<outputs.NodeTemplateVsphereConfig | undefined>;

    /**
     * Create a NodeTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: NodeTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NodeTemplateArgs | NodeTemplateState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as NodeTemplateState | undefined;
            inputs["amazonec2Config"] = state ? state.amazonec2Config : undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["authCertificateAuthority"] = state ? state.authCertificateAuthority : undefined;
            inputs["authKey"] = state ? state.authKey : undefined;
            inputs["azureConfig"] = state ? state.azureConfig : undefined;
            inputs["cloudCredentialId"] = state ? state.cloudCredentialId : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["digitaloceanConfig"] = state ? state.digitaloceanConfig : undefined;
            inputs["driver"] = state ? state.driver : undefined;
            inputs["driverId"] = state ? state.driverId : undefined;
            inputs["engineEnv"] = state ? state.engineEnv : undefined;
            inputs["engineInsecureRegistries"] = state ? state.engineInsecureRegistries : undefined;
            inputs["engineInstallUrl"] = state ? state.engineInstallUrl : undefined;
            inputs["engineLabel"] = state ? state.engineLabel : undefined;
            inputs["engineOpt"] = state ? state.engineOpt : undefined;
            inputs["engineRegistryMirrors"] = state ? state.engineRegistryMirrors : undefined;
            inputs["engineStorageDriver"] = state ? state.engineStorageDriver : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["openstackConfig"] = state ? state.openstackConfig : undefined;
            inputs["useInternalIpAddress"] = state ? state.useInternalIpAddress : undefined;
            inputs["vsphereConfig"] = state ? state.vsphereConfig : undefined;
        } else {
            const args = argsOrState as NodeTemplateArgs | undefined;
            inputs["amazonec2Config"] = args ? args.amazonec2Config : undefined;
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["authCertificateAuthority"] = args ? args.authCertificateAuthority : undefined;
            inputs["authKey"] = args ? args.authKey : undefined;
            inputs["azureConfig"] = args ? args.azureConfig : undefined;
            inputs["cloudCredentialId"] = args ? args.cloudCredentialId : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["digitaloceanConfig"] = args ? args.digitaloceanConfig : undefined;
            inputs["driverId"] = args ? args.driverId : undefined;
            inputs["engineEnv"] = args ? args.engineEnv : undefined;
            inputs["engineInsecureRegistries"] = args ? args.engineInsecureRegistries : undefined;
            inputs["engineInstallUrl"] = args ? args.engineInstallUrl : undefined;
            inputs["engineLabel"] = args ? args.engineLabel : undefined;
            inputs["engineOpt"] = args ? args.engineOpt : undefined;
            inputs["engineRegistryMirrors"] = args ? args.engineRegistryMirrors : undefined;
            inputs["engineStorageDriver"] = args ? args.engineStorageDriver : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["openstackConfig"] = args ? args.openstackConfig : undefined;
            inputs["useInternalIpAddress"] = args ? args.useInternalIpAddress : undefined;
            inputs["vsphereConfig"] = args ? args.vsphereConfig : undefined;
            inputs["driver"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(NodeTemplate.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NodeTemplate resources.
 */
export interface NodeTemplateState {
    /**
     * AWS config for the Node Template (list maxitems:1)
     */
    readonly amazonec2Config?: pulumi.Input<inputs.NodeTemplateAmazonec2Config>;
    /**
     * Annotations for Node Template object (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Auth certificate authority for the Node Template (string)
     */
    readonly authCertificateAuthority?: pulumi.Input<string>;
    /**
     * Auth key for the Node Template (string)
     */
    readonly authKey?: pulumi.Input<string>;
    /**
     * Azure config for the Node Template (list maxitems:1)
     */
    readonly azureConfig?: pulumi.Input<inputs.NodeTemplateAzureConfig>;
    /**
     * Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
     */
    readonly cloudCredentialId?: pulumi.Input<string>;
    /**
     * Description for the Node Template (string)
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Digitalocean config for the Node Template (list maxitems:1)
     */
    readonly digitaloceanConfig?: pulumi.Input<inputs.NodeTemplateDigitaloceanConfig>;
    /**
     * (Computed) The driver of the node template (string)
     */
    readonly driver?: pulumi.Input<string>;
    /**
     * The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
     */
    readonly driverId?: pulumi.Input<string>;
    /**
     * Engine environment for the node template (string)
     */
    readonly engineEnv?: pulumi.Input<{[key: string]: any}>;
    /**
     * Insecure registry for the node template (list)
     */
    readonly engineInsecureRegistries?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Docker engine install URL for the node template. Default `https://releases.rancher.com/install-docker/18.09.sh`. Available install docker versions at `https://github.com/rancher/install-docker` (string)
     */
    readonly engineInstallUrl?: pulumi.Input<string>;
    /**
     * Engine label for the node template (string)
     */
    readonly engineLabel?: pulumi.Input<{[key: string]: any}>;
    /**
     * Engine options for the node template (map)
     */
    readonly engineOpt?: pulumi.Input<{[key: string]: any}>;
    /**
     * Engine registry mirror for the node template (list)
     */
    readonly engineRegistryMirrors?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Engine storage driver for the node template (string)
     */
    readonly engineStorageDriver?: pulumi.Input<string>;
    /**
     * Labels for Node Template object (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the Node Template (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Openstack config for the Node Template (list maxitems:1)
     */
    readonly openstackConfig?: pulumi.Input<inputs.NodeTemplateOpenstackConfig>;
    /**
     * Engine storage driver for the node template (bool)
     */
    readonly useInternalIpAddress?: pulumi.Input<boolean>;
    /**
     * vSphere config for the Node Template (list maxitems:1)
     */
    readonly vsphereConfig?: pulumi.Input<inputs.NodeTemplateVsphereConfig>;
}

/**
 * The set of arguments for constructing a NodeTemplate resource.
 */
export interface NodeTemplateArgs {
    /**
     * AWS config for the Node Template (list maxitems:1)
     */
    readonly amazonec2Config?: pulumi.Input<inputs.NodeTemplateAmazonec2Config>;
    /**
     * Annotations for Node Template object (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Auth certificate authority for the Node Template (string)
     */
    readonly authCertificateAuthority?: pulumi.Input<string>;
    /**
     * Auth key for the Node Template (string)
     */
    readonly authKey?: pulumi.Input<string>;
    /**
     * Azure config for the Node Template (list maxitems:1)
     */
    readonly azureConfig?: pulumi.Input<inputs.NodeTemplateAzureConfig>;
    /**
     * Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
     */
    readonly cloudCredentialId?: pulumi.Input<string>;
    /**
     * Description for the Node Template (string)
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Digitalocean config for the Node Template (list maxitems:1)
     */
    readonly digitaloceanConfig?: pulumi.Input<inputs.NodeTemplateDigitaloceanConfig>;
    /**
     * The node driver id used by the node template. It's required if the node driver isn't built in Rancher (string)
     */
    readonly driverId?: pulumi.Input<string>;
    /**
     * Engine environment for the node template (string)
     */
    readonly engineEnv?: pulumi.Input<{[key: string]: any}>;
    /**
     * Insecure registry for the node template (list)
     */
    readonly engineInsecureRegistries?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Docker engine install URL for the node template. Default `https://releases.rancher.com/install-docker/18.09.sh`. Available install docker versions at `https://github.com/rancher/install-docker` (string)
     */
    readonly engineInstallUrl?: pulumi.Input<string>;
    /**
     * Engine label for the node template (string)
     */
    readonly engineLabel?: pulumi.Input<{[key: string]: any}>;
    /**
     * Engine options for the node template (map)
     */
    readonly engineOpt?: pulumi.Input<{[key: string]: any}>;
    /**
     * Engine registry mirror for the node template (list)
     */
    readonly engineRegistryMirrors?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Engine storage driver for the node template (string)
     */
    readonly engineStorageDriver?: pulumi.Input<string>;
    /**
     * Labels for Node Template object (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the Node Template (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Openstack config for the Node Template (list maxitems:1)
     */
    readonly openstackConfig?: pulumi.Input<inputs.NodeTemplateOpenstackConfig>;
    /**
     * Engine storage driver for the node template (bool)
     */
    readonly useInternalIpAddress?: pulumi.Input<boolean>;
    /**
     * vSphere config for the Node Template (list maxitems:1)
     */
    readonly vsphereConfig?: pulumi.Input<inputs.NodeTemplateVsphereConfig>;
}
