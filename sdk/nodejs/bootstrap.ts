// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2_bootstrap
 * const admin = new rancher2.Bootstrap("admin", {
 *     password: "blahblah",
 *     telemetry: true,
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2_bootstrap for Rancher v2.6.0 and above
 * const admin = new rancher2.Bootstrap("admin", {
 *     initialPassword: "<INSTALL_PASSWORD>",
 *     password: "blahblah",
 *     telemetry: true,
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2_bootstrap using bootstrap provider config
 * const admin = new rancher2.Bootstrap("admin", {
 *     password: "blahblah",
 *     telemetry: true,
 * });
 * ```
 */
export class Bootstrap extends pulumi.CustomResource {
    /**
     * Get an existing Bootstrap resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BootstrapState, opts?: pulumi.CustomResourceOptions): Bootstrap {
        return new Bootstrap(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/bootstrap:Bootstrap';

    /**
     * Returns true if the given object is an instance of Bootstrap.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Bootstrap {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Bootstrap.__pulumiType;
    }

    /**
     * (Computed/Sensitive) Current password for Admin user (string)
     */
    public /*out*/ readonly currentPassword!: pulumi.Output<string>;
    /**
     * Initial password for Admin user. Default: `admin` (string)
     */
    public readonly initialPassword!: pulumi.Output<string | undefined>;
    /**
     * Password for Admin user or random generated if empty (string)
     */
    public readonly password!: pulumi.Output<string>;
    /**
     * Send telemetry anonymous data. Default: `false` (bool)
     */
    public readonly telemetry!: pulumi.Output<boolean | undefined>;
    /**
     * (Computed) Generated API temporary token as helper. Should be empty (string)
     */
    public /*out*/ readonly tempToken!: pulumi.Output<string>;
    /**
     * (Computed) Generated API temporary token id as helper. Should be empty (string)
     */
    public /*out*/ readonly tempTokenId!: pulumi.Output<string>;
    /**
     * (Computed) Generated API token for Admin User (string)
     */
    public /*out*/ readonly token!: pulumi.Output<string>;
    /**
     * (Computed) Generated API token id for Admin User (string)
     */
    public /*out*/ readonly tokenId!: pulumi.Output<string>;
    /**
     * TTL in seconds for generated admin token. Default: `0`  (int)
     */
    public readonly tokenTtl!: pulumi.Output<number | undefined>;
    /**
     * Regenerate admin token. Default: `false` (bool)
     */
    public readonly tokenUpdate!: pulumi.Output<boolean | undefined>;
    /**
     * Default UI landing for k8s clusters. Available options: `ember` (cluster manager ui)  and `vue` (cluster explorer ui). Default: `ember` (string)
     */
    public readonly uiDefaultLanding!: pulumi.Output<string | undefined>;
    /**
     * (Computed) URL set as server-url (string)
     */
    public /*out*/ readonly url!: pulumi.Output<string>;
    /**
     * (Computed) Admin username (string)
     */
    public /*out*/ readonly user!: pulumi.Output<string>;

    /**
     * Create a Bootstrap resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: BootstrapArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BootstrapArgs | BootstrapState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BootstrapState | undefined;
            resourceInputs["currentPassword"] = state ? state.currentPassword : undefined;
            resourceInputs["initialPassword"] = state ? state.initialPassword : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["telemetry"] = state ? state.telemetry : undefined;
            resourceInputs["tempToken"] = state ? state.tempToken : undefined;
            resourceInputs["tempTokenId"] = state ? state.tempTokenId : undefined;
            resourceInputs["token"] = state ? state.token : undefined;
            resourceInputs["tokenId"] = state ? state.tokenId : undefined;
            resourceInputs["tokenTtl"] = state ? state.tokenTtl : undefined;
            resourceInputs["tokenUpdate"] = state ? state.tokenUpdate : undefined;
            resourceInputs["uiDefaultLanding"] = state ? state.uiDefaultLanding : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
            resourceInputs["user"] = state ? state.user : undefined;
        } else {
            const args = argsOrState as BootstrapArgs | undefined;
            resourceInputs["initialPassword"] = args?.initialPassword ? pulumi.secret(args.initialPassword) : undefined;
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["telemetry"] = args ? args.telemetry : undefined;
            resourceInputs["tokenTtl"] = args ? args.tokenTtl : undefined;
            resourceInputs["tokenUpdate"] = args ? args.tokenUpdate : undefined;
            resourceInputs["uiDefaultLanding"] = args ? args.uiDefaultLanding : undefined;
            resourceInputs["currentPassword"] = undefined /*out*/;
            resourceInputs["tempToken"] = undefined /*out*/;
            resourceInputs["tempTokenId"] = undefined /*out*/;
            resourceInputs["token"] = undefined /*out*/;
            resourceInputs["tokenId"] = undefined /*out*/;
            resourceInputs["url"] = undefined /*out*/;
            resourceInputs["user"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["currentPassword", "initialPassword", "password", "tempToken", "token"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Bootstrap.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Bootstrap resources.
 */
export interface BootstrapState {
    /**
     * (Computed/Sensitive) Current password for Admin user (string)
     */
    currentPassword?: pulumi.Input<string>;
    /**
     * Initial password for Admin user. Default: `admin` (string)
     */
    initialPassword?: pulumi.Input<string>;
    /**
     * Password for Admin user or random generated if empty (string)
     */
    password?: pulumi.Input<string>;
    /**
     * Send telemetry anonymous data. Default: `false` (bool)
     */
    telemetry?: pulumi.Input<boolean>;
    /**
     * (Computed) Generated API temporary token as helper. Should be empty (string)
     */
    tempToken?: pulumi.Input<string>;
    /**
     * (Computed) Generated API temporary token id as helper. Should be empty (string)
     */
    tempTokenId?: pulumi.Input<string>;
    /**
     * (Computed) Generated API token for Admin User (string)
     */
    token?: pulumi.Input<string>;
    /**
     * (Computed) Generated API token id for Admin User (string)
     */
    tokenId?: pulumi.Input<string>;
    /**
     * TTL in seconds for generated admin token. Default: `0`  (int)
     */
    tokenTtl?: pulumi.Input<number>;
    /**
     * Regenerate admin token. Default: `false` (bool)
     */
    tokenUpdate?: pulumi.Input<boolean>;
    /**
     * Default UI landing for k8s clusters. Available options: `ember` (cluster manager ui)  and `vue` (cluster explorer ui). Default: `ember` (string)
     */
    uiDefaultLanding?: pulumi.Input<string>;
    /**
     * (Computed) URL set as server-url (string)
     */
    url?: pulumi.Input<string>;
    /**
     * (Computed) Admin username (string)
     */
    user?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Bootstrap resource.
 */
export interface BootstrapArgs {
    /**
     * Initial password for Admin user. Default: `admin` (string)
     */
    initialPassword?: pulumi.Input<string>;
    /**
     * Password for Admin user or random generated if empty (string)
     */
    password?: pulumi.Input<string>;
    /**
     * Send telemetry anonymous data. Default: `false` (bool)
     */
    telemetry?: pulumi.Input<boolean>;
    /**
     * TTL in seconds for generated admin token. Default: `0`  (int)
     */
    tokenTtl?: pulumi.Input<number>;
    /**
     * Regenerate admin token. Default: `false` (bool)
     */
    tokenUpdate?: pulumi.Input<boolean>;
    /**
     * Default UI landing for k8s clusters. Available options: `ember` (cluster manager ui)  and `vue` (cluster explorer ui). Default: `ember` (string)
     */
    uiDefaultLanding?: pulumi.Input<string>;
}
