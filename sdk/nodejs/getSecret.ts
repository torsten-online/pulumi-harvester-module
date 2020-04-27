// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 secret.
 * 
 * Depending of the availability, there are 2 types of Rancher v2 secrets:
 * - Project secret: Available to all namespaces in the `projectId`
 * - Namespaced secret: Available to just `namespaceId` in the `projectId`
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 * 
 * // Retrieve a rancher2 Project Secret
 * const foo = pulumi.output(rancher2.getSecret({
 *     name: "<name>",
 *     projectId: "<project_id>",
 * }, { async: true }));
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/secret.html.markdown.
 */
export function getSecret(args: GetSecretArgs, opts?: pulumi.InvokeOptions): Promise<GetSecretResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getSecret:getSecret", {
        "name": args.name,
        "namespaceId": args.namespaceId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecret.
 */
export interface GetSecretArgs {
    /**
     * The name of the secret (string)
     */
    readonly name: string;
    /**
     * The namespace id where to assign the namespaced secret (string)
     */
    readonly namespaceId?: string;
    /**
     * The project id where to assign the secret (string)
     */
    readonly projectId: string;
}

/**
 * A collection of values returned by getSecret.
 */
export interface GetSecretResult {
    /**
     * (Computed) Annotations for secret object (map)
     */
    readonly annotations: {[key: string]: any};
    /**
     * (Computed) Secret key/value data. Base64 encoding required for values (map)
     */
    readonly data: {[key: string]: any};
    /**
     * (Computed) A secret description (string)
     */
    readonly description: string;
    /**
     * (Computed) Labels for secret object (map)
     */
    readonly labels: {[key: string]: any};
    readonly name: string;
    readonly namespaceId?: string;
    readonly projectId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
