// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class AuthConfigOkta extends pulumi.CustomResource {
    /**
     * Get an existing AuthConfigOkta resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AuthConfigOktaState, opts?: pulumi.CustomResourceOptions): AuthConfigOkta {
        return new AuthConfigOkta(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/authConfigOkta:AuthConfigOkta';

    /**
     * Returns true if the given object is an instance of AuthConfigOkta.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AuthConfigOkta {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AuthConfigOkta.__pulumiType;
    }

    public readonly accessMode!: pulumi.Output<string | undefined>;
    public readonly allowedPrincipalIds!: pulumi.Output<string[] | undefined>;
    /**
     * Annotations of the resource
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    public readonly displayNameField!: pulumi.Output<string>;
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    public readonly groupsField!: pulumi.Output<string>;
    public readonly idpMetadataContent!: pulumi.Output<string>;
    /**
     * Labels of the resource
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    public /*out*/ readonly name!: pulumi.Output<string>;
    public readonly rancherApiHost!: pulumi.Output<string>;
    public readonly spCert!: pulumi.Output<string>;
    public readonly spKey!: pulumi.Output<string>;
    public /*out*/ readonly type!: pulumi.Output<string>;
    public readonly uidField!: pulumi.Output<string>;
    public readonly userNameField!: pulumi.Output<string>;

    /**
     * Create a AuthConfigOkta resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AuthConfigOktaArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AuthConfigOktaArgs | AuthConfigOktaState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as AuthConfigOktaState | undefined;
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
            const args = argsOrState as AuthConfigOktaArgs | undefined;
            if (!args || args.displayNameField === undefined) {
                throw new Error("Missing required property 'displayNameField'");
            }
            if (!args || args.groupsField === undefined) {
                throw new Error("Missing required property 'groupsField'");
            }
            if (!args || args.idpMetadataContent === undefined) {
                throw new Error("Missing required property 'idpMetadataContent'");
            }
            if (!args || args.rancherApiHost === undefined) {
                throw new Error("Missing required property 'rancherApiHost'");
            }
            if (!args || args.spCert === undefined) {
                throw new Error("Missing required property 'spCert'");
            }
            if (!args || args.spKey === undefined) {
                throw new Error("Missing required property 'spKey'");
            }
            if (!args || args.uidField === undefined) {
                throw new Error("Missing required property 'uidField'");
            }
            if (!args || args.userNameField === undefined) {
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
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(AuthConfigOkta.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AuthConfigOkta resources.
 */
export interface AuthConfigOktaState {
    readonly accessMode?: pulumi.Input<string>;
    readonly allowedPrincipalIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Annotations of the resource
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    readonly displayNameField?: pulumi.Input<string>;
    readonly enabled?: pulumi.Input<boolean>;
    readonly groupsField?: pulumi.Input<string>;
    readonly idpMetadataContent?: pulumi.Input<string>;
    /**
     * Labels of the resource
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    readonly name?: pulumi.Input<string>;
    readonly rancherApiHost?: pulumi.Input<string>;
    readonly spCert?: pulumi.Input<string>;
    readonly spKey?: pulumi.Input<string>;
    readonly type?: pulumi.Input<string>;
    readonly uidField?: pulumi.Input<string>;
    readonly userNameField?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AuthConfigOkta resource.
 */
export interface AuthConfigOktaArgs {
    readonly accessMode?: pulumi.Input<string>;
    readonly allowedPrincipalIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Annotations of the resource
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    readonly displayNameField: pulumi.Input<string>;
    readonly enabled?: pulumi.Input<boolean>;
    readonly groupsField: pulumi.Input<string>;
    readonly idpMetadataContent: pulumi.Input<string>;
    /**
     * Labels of the resource
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    readonly rancherApiHost: pulumi.Input<string>;
    readonly spCert: pulumi.Input<string>;
    readonly spKey: pulumi.Input<string>;
    readonly uidField: pulumi.Input<string>;
    readonly userNameField: pulumi.Input<string>;
}
