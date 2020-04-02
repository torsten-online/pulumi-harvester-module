// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 cluster template.
 * 
 * Cluster Templates are available from Rancher v2.3.x and above.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 * 
 * const foo = rancher2.getClusterTemplate({
 *     name: "foo",
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/clusterTemplate.html.markdown.
 */
export function getClusterTemplate(args: GetClusterTemplateArgs, opts?: pulumi.InvokeOptions): Promise<GetClusterTemplateResult> & GetClusterTemplateResult {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    const promise: Promise<GetClusterTemplateResult> = pulumi.runtime.invoke("rancher2:index/getClusterTemplate:getClusterTemplate", {
        "annotations": args.annotations,
        "description": args.description,
        "labels": args.labels,
        "name": args.name,
    }, opts);

    return pulumi.utils.liftProperties(promise, opts);
}

/**
 * A collection of arguments for invoking getClusterTemplate.
 */
export interface GetClusterTemplateArgs {
    /**
     * (Computed) Annotations for the cluster template (map)
     */
    readonly annotations?: {[key: string]: any};
    readonly description?: string;
    /**
     * (Computed) Labels for the cluster template (map)
     */
    readonly labels?: {[key: string]: any};
    /**
     * The cluster template name (string)
     */
    readonly name: string;
}

/**
 * A collection of values returned by getClusterTemplate.
 */
export interface GetClusterTemplateResult {
    /**
     * (Computed) Annotations for the cluster template (map)
     */
    readonly annotations: {[key: string]: any};
    /**
     * (Computed) Default cluster template revision ID (string)
     */
    readonly defaultRevisionId: string;
    readonly description: string;
    /**
     * (Computed) Labels for the cluster template (map)
     */
    readonly labels: {[key: string]: any};
    /**
     * (Computed) Cluster template members (list)
     */
    readonly members: outputs.GetClusterTemplateMember[];
    readonly name: string;
    /**
     * (Computed) Cluster template revisions (list)
     */
    readonly templateRevisions: outputs.GetClusterTemplateTemplateRevision[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
