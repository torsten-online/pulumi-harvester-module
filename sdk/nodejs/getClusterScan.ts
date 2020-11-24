// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 Cluster CIS Scan resource.
 */
export function getClusterScan(args: GetClusterScanArgs, opts?: pulumi.InvokeOptions): Promise<GetClusterScanResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getClusterScan:getClusterScan", {
        "clusterId": args.clusterId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getClusterScan.
 */
export interface GetClusterScanArgs {
    /**
     * Cluster ID for CIS Scan (string)
     */
    readonly clusterId: string;
    /**
     * Name of the cluster Scan (string)
     */
    readonly name?: string;
}

/**
 * A collection of values returned by getClusterScan.
 */
export interface GetClusterScanResult {
    /**
     * (Computed) Annotations of the resource (map)
     */
    readonly annotations: {[key: string]: any};
    readonly clusterId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed) Labels of the resource (map)
     */
    readonly labels: {[key: string]: any};
    readonly name: string;
    /**
     * (Computed) Cluster Scan run type (string)
     */
    readonly runType: string;
    /**
     * (Computed) Cluster Scan config (bool)
     */
    readonly scanConfig: outputs.GetClusterScanScanConfig;
    /**
     * (Computed) Cluster Scan type (string)
     */
    readonly scanType: string;
    /**
     * (Computed) Cluster Scan status (string)
     */
    readonly status: string;
}
