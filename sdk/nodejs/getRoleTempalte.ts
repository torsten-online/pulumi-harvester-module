// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 role template resource.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = pulumi.output(rancher2.getRoleTemplate({
 *     name: "foo",
 * }, { async: true }));
 * ```
 */
/** @deprecated rancher2.getRoleTempalte has been deprecated in favor of rancher2.getRoleTemplate */
export function getRoleTempalte(args: GetRoleTempalteArgs, opts?: pulumi.InvokeOptions): Promise<GetRoleTempalteResult> {
    pulumi.log.warn("getRoleTempalte is deprecated: rancher2.getRoleTempalte has been deprecated in favor of rancher2.getRoleTemplate")
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getRoleTempalte:getRoleTempalte", {
        "context": args.context,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getRoleTempalte.
 */
export interface GetRoleTempalteArgs {
    /**
     * Role template context. `cluster` and `project` values are supported (string)
     */
    readonly context?: string;
    /**
     * The name of the Node Template (string)
     */
    readonly name: string;
}

/**
 * A collection of values returned by getRoleTempalte.
 */
export interface GetRoleTempalteResult {
    /**
     * (Computed) Administrative role template (bool)
     */
    readonly administrative: boolean;
    /**
     * (Computed) Annotations for role template object (map)
     */
    readonly annotations: {[key: string]: any};
    /**
     * (Computed) Builtin role template (string)
     */
    readonly builtin: boolean;
    readonly context: string;
    /**
     * (Computed) Default role template for new created cluster or project (bool)
     */
    readonly defaultRole: boolean;
    /**
     * (Computed) Role template description (string)
     */
    readonly description: string;
    /**
     * (Computed) External role template (bool)
     */
    readonly external: boolean;
    /**
     * (Computed) Hidden role template (bool)
     */
    readonly hidden: boolean;
    /**
     * (Computed) Labels for role template object (map)
     */
    readonly labels: {[key: string]: any};
    /**
     * (Computed) Locked role template (bool)
     */
    readonly locked: boolean;
    readonly name: string;
    /**
     * (Computed) Inherit role template IDs (list)
     */
    readonly roleTemplateIds: string[];
    /**
     * (Computed) Role template policy rules (list)
     */
    readonly rules: outputs.GetRoleTempalteRule[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
