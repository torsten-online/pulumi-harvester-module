// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Role Template resource. This can be used to create Role Template for Rancher v2 and retrieve their information.
 *
 * `cluster` and `project` scopes are supported for role templates.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 cluster Role Template
 * const foo = new rancher2.RoleTempalte("foo", {
 *     context: "cluster",
 *     defaultRole: true,
 *     description: "Terraform role template acceptance test",
 *     rules: [{
 *         apiGroups: ["*"],
 *         resources: ["secrets"],
 *         verbs: ["create"],
 *     }],
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 project Role Template
 * const foo = new rancher2.RoleTempalte("foo", {
 *     context: "project",
 *     defaultRole: true,
 *     description: "Terraform role template acceptance test",
 *     rules: [{
 *         apiGroups: ["*"],
 *         resources: ["secrets"],
 *         verbs: ["create"],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Role Template can be imported using the Rancher Role Template ID
 *
 * ```sh
 *  $ pulumi import rancher2:index/roleTempalte:RoleTempalte foo &lt;role_template_id&gt;
 * ```
 */
export class RoleTempalte extends pulumi.CustomResource {
    /**
     * Get an existing RoleTempalte resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RoleTempalteState, opts?: pulumi.CustomResourceOptions): RoleTempalte {
        return new RoleTempalte(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/roleTempalte:RoleTempalte';

    /**
     * Returns true if the given object is an instance of RoleTempalte.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RoleTempalte {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RoleTempalte.__pulumiType;
    }

    /**
     * Administrative role template. Default `false` (bool)
     */
    public readonly administrative!: pulumi.Output<boolean | undefined>;
    /**
     * Annotations for role template object (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * (Computed) Builtin role template (string)
     */
    public /*out*/ readonly builtin!: pulumi.Output<boolean>;
    /**
     * Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
     */
    public readonly context!: pulumi.Output<string | undefined>;
    /**
     * Default role template for new created cluster or project. Default `false` (bool)
     */
    public readonly defaultRole!: pulumi.Output<boolean | undefined>;
    /**
     * Role template description (string)
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * External role template. Default `false` (bool)
     */
    public readonly external!: pulumi.Output<boolean | undefined>;
    /**
     * Hidden role template. Default `false` (bool)
     */
    public readonly hidden!: pulumi.Output<boolean | undefined>;
    /**
     * Labels for role template object (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * Locked role template. Default `false` (bool)
     */
    public readonly locked!: pulumi.Output<boolean | undefined>;
    /**
     * Role template name (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Inherit role template IDs (list)
     */
    public readonly roleTemplateIds!: pulumi.Output<string[]>;
    /**
     * Role template policy rules (list)
     */
    public readonly rules!: pulumi.Output<outputs.RoleTempalteRule[]>;

    /**
     * Create a RoleTempalte resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: RoleTempalteArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RoleTempalteArgs | RoleTempalteState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as RoleTempalteState | undefined;
            inputs["administrative"] = state ? state.administrative : undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["builtin"] = state ? state.builtin : undefined;
            inputs["context"] = state ? state.context : undefined;
            inputs["defaultRole"] = state ? state.defaultRole : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["external"] = state ? state.external : undefined;
            inputs["hidden"] = state ? state.hidden : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["locked"] = state ? state.locked : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["roleTemplateIds"] = state ? state.roleTemplateIds : undefined;
            inputs["rules"] = state ? state.rules : undefined;
        } else {
            const args = argsOrState as RoleTempalteArgs | undefined;
            inputs["administrative"] = args ? args.administrative : undefined;
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["context"] = args ? args.context : undefined;
            inputs["defaultRole"] = args ? args.defaultRole : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["external"] = args ? args.external : undefined;
            inputs["hidden"] = args ? args.hidden : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["locked"] = args ? args.locked : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["roleTemplateIds"] = args ? args.roleTemplateIds : undefined;
            inputs["rules"] = args ? args.rules : undefined;
            inputs["builtin"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(RoleTempalte.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RoleTempalte resources.
 */
export interface RoleTempalteState {
    /**
     * Administrative role template. Default `false` (bool)
     */
    readonly administrative?: pulumi.Input<boolean>;
    /**
     * Annotations for role template object (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * (Computed) Builtin role template (string)
     */
    readonly builtin?: pulumi.Input<boolean>;
    /**
     * Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
     */
    readonly context?: pulumi.Input<string>;
    /**
     * Default role template for new created cluster or project. Default `false` (bool)
     */
    readonly defaultRole?: pulumi.Input<boolean>;
    /**
     * Role template description (string)
     */
    readonly description?: pulumi.Input<string>;
    /**
     * External role template. Default `false` (bool)
     */
    readonly external?: pulumi.Input<boolean>;
    /**
     * Hidden role template. Default `false` (bool)
     */
    readonly hidden?: pulumi.Input<boolean>;
    /**
     * Labels for role template object (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Locked role template. Default `false` (bool)
     */
    readonly locked?: pulumi.Input<boolean>;
    /**
     * Role template name (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Inherit role template IDs (list)
     */
    readonly roleTemplateIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Role template policy rules (list)
     */
    readonly rules?: pulumi.Input<pulumi.Input<inputs.RoleTempalteRule>[]>;
}

/**
 * The set of arguments for constructing a RoleTempalte resource.
 */
export interface RoleTempalteArgs {
    /**
     * Administrative role template. Default `false` (bool)
     */
    readonly administrative?: pulumi.Input<boolean>;
    /**
     * Annotations for role template object (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
     */
    readonly context?: pulumi.Input<string>;
    /**
     * Default role template for new created cluster or project. Default `false` (bool)
     */
    readonly defaultRole?: pulumi.Input<boolean>;
    /**
     * Role template description (string)
     */
    readonly description?: pulumi.Input<string>;
    /**
     * External role template. Default `false` (bool)
     */
    readonly external?: pulumi.Input<boolean>;
    /**
     * Hidden role template. Default `false` (bool)
     */
    readonly hidden?: pulumi.Input<boolean>;
    /**
     * Labels for role template object (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Locked role template. Default `false` (bool)
     */
    readonly locked?: pulumi.Input<boolean>;
    /**
     * Role template name (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Inherit role template IDs (list)
     */
    readonly roleTemplateIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Role template policy rules (list)
     */
    readonly rules?: pulumi.Input<pulumi.Input<inputs.RoleTempalteRule>[]>;
}
