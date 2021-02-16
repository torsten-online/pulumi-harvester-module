// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Auth Config ADFS resource. This can be used to configure and enable Auth Config ADFS for Rancher v2 RKE clusters and retrieve their information.
 *
 * In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Auth Config ADFS
 * const adfs = new rancher2.AuthConfigAdfs("adfs", {
 *     displayNameField: "<DISPLAY_NAME_FIELD>",
 *     groupsField: "<GROUPS_FIELD>",
 *     idpMetadataContent: "<IDP_METADATA_CONTENT>",
 *     rancherApiHost: "https://<RANCHER_API_HOST>",
 *     spCert: "<SP_CERT>",
 *     spKey: "<SP_KEY>",
 *     uidField: "<UID_FIELD>",
 *     userNameField: "<USER_NAME_FIELD>",
 * });
 * ```
 */
export class AuthConfigAdfs extends pulumi.CustomResource {
    /**
     * Get an existing AuthConfigAdfs resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AuthConfigAdfsState, opts?: pulumi.CustomResourceOptions): AuthConfigAdfs {
        return new AuthConfigAdfs(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/authConfigAdfs:AuthConfigAdfs';

    /**
     * Returns true if the given object is an instance of AuthConfigAdfs.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AuthConfigAdfs {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AuthConfigAdfs.__pulumiType;
    }

    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     */
    public readonly accessMode!: pulumi.Output<string | undefined>;
    /**
     * Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `adfs_user://<USER_ID>`  `adfs_group://<GROUP_ID>` (list)
     */
    public readonly allowedPrincipalIds!: pulumi.Output<string[] | undefined>;
    /**
     * Annotations of the resource (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * ADFS display name field (string)
     */
    public readonly displayNameField!: pulumi.Output<string>;
    /**
     * Enable auth config provider. Default `true` (bool)
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * ADFS group field (string)
     */
    public readonly groupsField!: pulumi.Output<string>;
    /**
     * ADFS IDP metadata content (string)
     */
    public readonly idpMetadataContent!: pulumi.Output<string>;
    /**
     * Labels of the resource (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * (Computed) The name of the resource (string)
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
     */
    public readonly rancherApiHost!: pulumi.Output<string>;
    /**
     * ADFS SP cert (string)
     */
    public readonly spCert!: pulumi.Output<string>;
    /**
     * ADFS SP key (string)
     */
    public readonly spKey!: pulumi.Output<string>;
    /**
     * (Computed) The type of the resource (string)
     */
    public /*out*/ readonly type!: pulumi.Output<string>;
    /**
     * ADFS UID field (string)
     */
    public readonly uidField!: pulumi.Output<string>;
    /**
     * ADFS user name field (string)
     */
    public readonly userNameField!: pulumi.Output<string>;

    /**
     * Create a AuthConfigAdfs resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AuthConfigAdfsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AuthConfigAdfsArgs | AuthConfigAdfsState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AuthConfigAdfsState | undefined;
            inputs["accessMode"] = state ? state.accessMode : undefined;
            inputs["allowedPrincipalIds"] = state ? state.allowedPrincipalIds : undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["displayNameField"] = state ? state.displayNameField : undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["groupsField"] = state ? state.groupsField : undefined;
            inputs["idpMetadataContent"] = state ? state.idpMetadataContent : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["rancherApiHost"] = state ? state.rancherApiHost : undefined;
            inputs["spCert"] = state ? state.spCert : undefined;
            inputs["spKey"] = state ? state.spKey : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["uidField"] = state ? state.uidField : undefined;
            inputs["userNameField"] = state ? state.userNameField : undefined;
        } else {
            const args = argsOrState as AuthConfigAdfsArgs | undefined;
            if ((!args || args.displayNameField === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayNameField'");
            }
            if ((!args || args.groupsField === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupsField'");
            }
            if ((!args || args.idpMetadataContent === undefined) && !opts.urn) {
                throw new Error("Missing required property 'idpMetadataContent'");
            }
            if ((!args || args.rancherApiHost === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rancherApiHost'");
            }
            if ((!args || args.spCert === undefined) && !opts.urn) {
                throw new Error("Missing required property 'spCert'");
            }
            if ((!args || args.spKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'spKey'");
            }
            if ((!args || args.uidField === undefined) && !opts.urn) {
                throw new Error("Missing required property 'uidField'");
            }
            if ((!args || args.userNameField === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userNameField'");
            }
            inputs["accessMode"] = args ? args.accessMode : undefined;
            inputs["allowedPrincipalIds"] = args ? args.allowedPrincipalIds : undefined;
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["displayNameField"] = args ? args.displayNameField : undefined;
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["groupsField"] = args ? args.groupsField : undefined;
            inputs["idpMetadataContent"] = args ? args.idpMetadataContent : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["rancherApiHost"] = args ? args.rancherApiHost : undefined;
            inputs["spCert"] = args ? args.spCert : undefined;
            inputs["spKey"] = args ? args.spKey : undefined;
            inputs["uidField"] = args ? args.uidField : undefined;
            inputs["userNameField"] = args ? args.userNameField : undefined;
            inputs["name"] = undefined /*out*/;
            inputs["type"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(AuthConfigAdfs.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AuthConfigAdfs resources.
 */
export interface AuthConfigAdfsState {
    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     */
    readonly accessMode?: pulumi.Input<string>;
    /**
     * Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `adfs_user://<USER_ID>`  `adfs_group://<GROUP_ID>` (list)
     */
    readonly allowedPrincipalIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Annotations of the resource (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * ADFS display name field (string)
     */
    readonly displayNameField?: pulumi.Input<string>;
    /**
     * Enable auth config provider. Default `true` (bool)
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * ADFS group field (string)
     */
    readonly groupsField?: pulumi.Input<string>;
    /**
     * ADFS IDP metadata content (string)
     */
    readonly idpMetadataContent?: pulumi.Input<string>;
    /**
     * Labels of the resource (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * (Computed) The name of the resource (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
     */
    readonly rancherApiHost?: pulumi.Input<string>;
    /**
     * ADFS SP cert (string)
     */
    readonly spCert?: pulumi.Input<string>;
    /**
     * ADFS SP key (string)
     */
    readonly spKey?: pulumi.Input<string>;
    /**
     * (Computed) The type of the resource (string)
     */
    readonly type?: pulumi.Input<string>;
    /**
     * ADFS UID field (string)
     */
    readonly uidField?: pulumi.Input<string>;
    /**
     * ADFS user name field (string)
     */
    readonly userNameField?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AuthConfigAdfs resource.
 */
export interface AuthConfigAdfsArgs {
    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     */
    readonly accessMode?: pulumi.Input<string>;
    /**
     * Allowed principal ids for auth. Required if `accessMode` is `required` or `restricted`. Ex: `adfs_user://<USER_ID>`  `adfs_group://<GROUP_ID>` (list)
     */
    readonly allowedPrincipalIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Annotations of the resource (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * ADFS display name field (string)
     */
    readonly displayNameField: pulumi.Input<string>;
    /**
     * Enable auth config provider. Default `true` (bool)
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * ADFS group field (string)
     */
    readonly groupsField: pulumi.Input<string>;
    /**
     * ADFS IDP metadata content (string)
     */
    readonly idpMetadataContent: pulumi.Input<string>;
    /**
     * Labels of the resource (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Rancher URL. URL scheme needs to be specified, `https://<RANCHER_API_HOST>` (string)
     */
    readonly rancherApiHost: pulumi.Input<string>;
    /**
     * ADFS SP cert (string)
     */
    readonly spCert: pulumi.Input<string>;
    /**
     * ADFS SP key (string)
     */
    readonly spKey: pulumi.Input<string>;
    /**
     * ADFS UID field (string)
     */
    readonly uidField: pulumi.Input<string>;
    /**
     * ADFS user name field (string)
     */
    readonly userNameField: pulumi.Input<string>;
}
