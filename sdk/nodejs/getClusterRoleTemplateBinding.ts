// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getClusterRoleTemplateBinding(args: GetClusterRoleTemplateBindingArgs, opts?: pulumi.InvokeOptions): Promise<GetClusterRoleTemplateBindingResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getClusterRoleTemplateBinding:getClusterRoleTemplateBinding", {
        "clusterId": args.clusterId,
        "name": args.name,
        "roleTemplateId": args.roleTemplateId,
    }, opts);
}

/**
 * A collection of arguments for invoking getClusterRoleTemplateBinding.
 */
export interface GetClusterRoleTemplateBindingArgs {
    readonly clusterId: string;
    readonly name: string;
    readonly roleTemplateId?: string;
}

/**
 * A collection of values returned by getClusterRoleTemplateBinding.
 */
export interface GetClusterRoleTemplateBindingResult {
    readonly annotations: {[key: string]: any};
    readonly clusterId: string;
    readonly groupId: string;
    readonly groupPrincipalId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly labels: {[key: string]: any};
    readonly name: string;
    readonly roleTemplateId: string;
    readonly userId: string;
    readonly userPrincipalId: string;
}
