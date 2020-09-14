// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class Registry extends pulumi.CustomResource {
    /**
     * Get an existing Registry resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RegistryState, opts?: pulumi.CustomResourceOptions): Registry {
        return new Registry(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/registry:Registry';

    /**
     * Returns true if the given object is an instance of Registry.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Registry {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Registry.__pulumiType;
    }

    /**
     * Annotations of the resource
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * Description of the docker registry
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Labels of the resource
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * Name of the docker registry
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Namespace ID to add docker registry
     */
    public readonly namespaceId!: pulumi.Output<string | undefined>;
    /**
     * Project ID to add docker registry
     */
    public readonly projectId!: pulumi.Output<string>;
    public readonly registries!: pulumi.Output<outputs.RegistryRegistry[]>;

    /**
     * Create a Registry resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RegistryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RegistryArgs | RegistryState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as RegistryState | undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["namespaceId"] = state ? state.namespaceId : undefined;
            inputs["projectId"] = state ? state.projectId : undefined;
            inputs["registries"] = state ? state.registries : undefined;
        } else {
            const args = argsOrState as RegistryArgs | undefined;
            if (!args || args.projectId === undefined) {
                throw new Error("Missing required property 'projectId'");
            }
            if (!args || args.registries === undefined) {
                throw new Error("Missing required property 'registries'");
            }
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["namespaceId"] = args ? args.namespaceId : undefined;
            inputs["projectId"] = args ? args.projectId : undefined;
            inputs["registries"] = args ? args.registries : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Registry.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Registry resources.
 */
export interface RegistryState {
    /**
     * Annotations of the resource
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Description of the docker registry
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Labels of the resource
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Name of the docker registry
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Namespace ID to add docker registry
     */
    readonly namespaceId?: pulumi.Input<string>;
    /**
     * Project ID to add docker registry
     */
    readonly projectId?: pulumi.Input<string>;
    readonly registries?: pulumi.Input<pulumi.Input<inputs.RegistryRegistry>[]>;
}

/**
 * The set of arguments for constructing a Registry resource.
 */
export interface RegistryArgs {
    /**
     * Annotations of the resource
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Description of the docker registry
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Labels of the resource
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Name of the docker registry
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Namespace ID to add docker registry
     */
    readonly namespaceId?: pulumi.Input<string>;
    /**
     * Project ID to add docker registry
     */
    readonly projectId: pulumi.Input<string>;
    readonly registries: pulumi.Input<pulumi.Input<inputs.RegistryRegistry>[]>;
}
