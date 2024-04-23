// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 Node Pool resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = rancher2.getNodePool({
 *     clusterId: foo_custom.id,
 *     name: "foo",
 * });
 * ```
 */
export function getNodePool(args: GetNodePoolArgs, opts?: pulumi.InvokeOptions): Promise<GetNodePoolResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("rancher2:index/getNodePool:getNodePool", {
        "clusterId": args.clusterId,
        "name": args.name,
        "nodeTemplateId": args.nodeTemplateId,
    }, opts);
}

/**
 * A collection of arguments for invoking getNodePool.
 */
export interface GetNodePoolArgs {
    /**
     * The RKE cluster id to use Node Pool (string)
     */
    clusterId: string;
    /**
     * The name of the Node Pool (string)
     */
    name: string;
    /**
     * The Node Template ID to use for node creation (string)
     */
    nodeTemplateId?: string;
}

/**
 * A collection of values returned by getNodePool.
 */
export interface GetNodePoolResult {
    /**
     * (Computed) Annotations for Node Pool object (map)
     */
    readonly annotations: {[key: string]: any};
    readonly clusterId: string;
    /**
     * (Computed) RKE control plane role for created nodes (bool)
     */
    readonly controlPlane: boolean;
    /**
     * (Computed) Delete not ready node after secs. Default `0` (int)
     */
    readonly deleteNotReadyAfterSecs: number;
    /**
     * (Computed) RKE etcd role for created nodes (bool)
     */
    readonly etcd: boolean;
    /**
     * (Computed) The prefix for created nodes of the Node Pool (string)
     */
    readonly hostnamePrefix: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed) Labels for Node Pool object (map)
     */
    readonly labels: {[key: string]: any};
    readonly name: string;
    /**
     * (Computed) Node taints (List)
     */
    readonly nodeTaints: outputs.GetNodePoolNodeTaint[];
    readonly nodeTemplateId: string;
    /**
     * (Computed) The number of nodes to create on Node Pool (int)
     */
    readonly quantity: number;
    /**
     * (Computed) RKE role role for created nodes (bool)
     */
    readonly worker: boolean;
}
/**
 * Use this data source to retrieve information about a Rancher v2 Node Pool resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = rancher2.getNodePool({
 *     clusterId: foo_custom.id,
 *     name: "foo",
 * });
 * ```
 */
export function getNodePoolOutput(args: GetNodePoolOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNodePoolResult> {
    return pulumi.output(args).apply((a: any) => getNodePool(a, opts))
}

/**
 * A collection of arguments for invoking getNodePool.
 */
export interface GetNodePoolOutputArgs {
    /**
     * The RKE cluster id to use Node Pool (string)
     */
    clusterId: pulumi.Input<string>;
    /**
     * The name of the Node Pool (string)
     */
    name: pulumi.Input<string>;
    /**
     * The Node Template ID to use for node creation (string)
     */
    nodeTemplateId?: pulumi.Input<string>;
}
