// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class Secret extends pulumi.CustomResource {
    /**
     * Get an existing Secret resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecretState, opts?: pulumi.CustomResourceOptions): Secret {
        return new Secret(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/secret:Secret';

    /**
     * Returns true if the given object is an instance of Secret.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Secret {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Secret.__pulumiType;
    }

    /**
     * Annotations of the resource
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * Secret data base64 encoded
     */
    public readonly data!: pulumi.Output<{[key: string]: any}>;
    /**
     * Secret description
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Labels of the resource
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * Secret name
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Namespace ID to add secret
     */
    public readonly namespaceId!: pulumi.Output<string | undefined>;
    /**
     * Project ID to add secret
     */
    public readonly projectId!: pulumi.Output<string>;

    /**
     * Create a Secret resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecretArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecretArgs | SecretState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as SecretState | undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["data"] = state ? state.data : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["namespaceId"] = state ? state.namespaceId : undefined;
            inputs["projectId"] = state ? state.projectId : undefined;
        } else {
            const args = argsOrState as SecretArgs | undefined;
            if (!args || args.data === undefined) {
                throw new Error("Missing required property 'data'");
            }
            if (!args || args.projectId === undefined) {
                throw new Error("Missing required property 'projectId'");
            }
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["data"] = args ? args.data : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["namespaceId"] = args ? args.namespaceId : undefined;
            inputs["projectId"] = args ? args.projectId : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Secret.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Secret resources.
 */
export interface SecretState {
    /**
     * Annotations of the resource
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Secret data base64 encoded
     */
    readonly data?: pulumi.Input<{[key: string]: any}>;
    /**
     * Secret description
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Labels of the resource
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Secret name
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Namespace ID to add secret
     */
    readonly namespaceId?: pulumi.Input<string>;
    /**
     * Project ID to add secret
     */
    readonly projectId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Secret resource.
 */
export interface SecretArgs {
    /**
     * Annotations of the resource
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Secret data base64 encoded
     */
    readonly data: pulumi.Input<{[key: string]: any}>;
    /**
     * Secret description
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Labels of the resource
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Secret name
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Namespace ID to add secret
     */
    readonly namespaceId?: pulumi.Input<string>;
    /**
     * Project ID to add secret
     */
    readonly projectId: pulumi.Input<string>;
}
