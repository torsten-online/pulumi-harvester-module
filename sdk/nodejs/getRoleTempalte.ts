// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

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
    readonly context?: string;
    readonly name: string;
}

/**
 * A collection of values returned by getRoleTempalte.
 */
export interface GetRoleTempalteResult {
    readonly administrative: boolean;
    readonly annotations: {[key: string]: any};
    readonly builtin: boolean;
    readonly context: string;
    readonly defaultRole: boolean;
    readonly description: string;
    readonly external: boolean;
    readonly hidden: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly labels: {[key: string]: any};
    readonly locked: boolean;
    readonly name: string;
    readonly roleTemplateIds: string[];
    readonly rules: outputs.GetRoleTempalteRule[];
}
