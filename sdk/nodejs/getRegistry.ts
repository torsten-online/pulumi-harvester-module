// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 docker registry.
 * 
 * Depending of the availability, there are 2 types of Rancher v2 docker registries:
 * - Project registry: Available to all namespaces in the `projectId`
 * - Namespaced registry: Available to just `namespaceId` in the `projectId`
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 * 
 * // Retrieve a rancher2 Project Registry
 * const foo = pulumi.output(rancher2.getRegistry({
 *     name: "<name>",
 *     projectId: "<project_id>",
 * }, { async: true }));
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/registry.html.markdown.
 */
export function getRegistry(args: GetRegistryArgs, opts?: pulumi.InvokeOptions): Promise<GetRegistryResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getRegistry:getRegistry", {
        "name": args.name,
        "namespaceId": args.namespaceId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegistry.
 */
export interface GetRegistryArgs {
    /**
     * The name of the registry (string)
     */
    readonly name: string;
    /**
     * The namespace id where to assign the namespaced registry (string)
     */
    readonly namespaceId?: string;
    /**
     * The project id where to assign the registry (string)
     */
    readonly projectId: string;
}

/**
 * A collection of values returned by getRegistry.
 */
export interface GetRegistryResult {
    /**
     * (Computed) Annotations for Registry object (map)
     */
    readonly annotations: {[key: string]: any};
    /**
     * (Computed) A registry description (string)
     */
    readonly description: string;
    /**
     * (Computed) Labels for Registry object (map)
     */
    readonly labels: {[key: string]: any};
    readonly name: string;
    readonly namespaceId?: string;
    readonly projectId: string;
    /**
     * (Computed) Registries data for registry (list)
     */
    readonly registries: outputs.GetRegistryRegistry[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
