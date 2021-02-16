// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Cluster Template resource. This can be used to create Cluster Templates for Rancher v2 RKE clusters and retrieve their information.
 *
 * Cluster Templates are available from Rancher v2.3.x and above.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Cluster Template
 * const foo = new rancher2.ClusterTemplate("foo", {
 *     description: "Terraform cluster template foo",
 *     members: [{
 *         accessType: "owner",
 *         userPrincipalId: "local://user-XXXXX",
 *     }],
 *     templateRevisions: [{
 *         clusterConfig: {
 *             rkeConfig: {
 *                 network: {
 *                     plugin: "canal",
 *                 },
 *                 services: {
 *                     etcd: {
 *                         creation: "6h",
 *                         retention: "24h",
 *                     },
 *                 },
 *             },
 *         },
 *         default: true,
 *         name: "V1",
 *     }],
 * });
 * ```
 *
 * Creating Rancher v2 RKE cluster template with upgrade strategy. For Rancher v2.4.x or above.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Cluster Template
 * const foo = new rancher2.ClusterTemplate("foo", {
 *     description: "Terraform cluster template foo",
 *     members: [{
 *         accessType: "owner",
 *         userPrincipalId: "local://user-XXXXX",
 *     }],
 *     templateRevisions: [{
 *         clusterConfig: {
 *             rkeConfig: {
 *                 network: {
 *                     plugin: "canal",
 *                 },
 *                 services: {
 *                     etcd: {
 *                         creation: "6h",
 *                         retention: "24h",
 *                     },
 *                 },
 *                 upgradeStrategy: {
 *                     drain: true,
 *                     maxUnavailableWorker: "20%",
 *                 },
 *             },
 *         },
 *         default: true,
 *         name: "V1",
 *     }],
 * });
 * ```
 *
 * Creating Rancher v2 RKE cluster template with scheduled cluster scan. For Rancher v2.4.x or above.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Cluster Template
 * const foo = new rancher2.ClusterTemplate("foo", {
 *     description: "Terraform cluster template foo",
 *     members: [{
 *         accessType: "owner",
 *         userPrincipalId: "local://user-XXXXX",
 *     }],
 *     templateRevisions: [{
 *         clusterConfig: {
 *             rkeConfig: {
 *                 network: {
 *                     plugin: "canal",
 *                 },
 *                 services: {
 *                     etcd: {
 *                         creation: "6h",
 *                         retention: "24h",
 *                     },
 *                 },
 *             },
 *             scheduledClusterScan: {
 *                 enabled: true,
 *                 scanConfig: {
 *                     cisScanConfig: {
 *                         debugMaster: true,
 *                         debugWorker: true,
 *                     },
 *                 },
 *                 scheduleConfig: {
 *                     cronSchedule: "30 * * * *",
 *                     retention: 5,
 *                 },
 *             },
 *         },
 *         default: true,
 *         name: "V1",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Cluster Template can be imported using the rancher Cluster Template ID
 *
 * ```sh
 *  $ pulumi import rancher2:index/clusterTemplate:ClusterTemplate foo &lt;CLUSTER_TEMPLATE_ID&gt;
 * ```
 */
export class ClusterTemplate extends pulumi.CustomResource {
    /**
     * Get an existing ClusterTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterTemplateState, opts?: pulumi.CustomResourceOptions): ClusterTemplate {
        return new ClusterTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/clusterTemplate:ClusterTemplate';

    /**
     * Returns true if the given object is an instance of ClusterTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClusterTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClusterTemplate.__pulumiType;
    }

    /**
     * Annotations for the cluster template revision (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * (Computed) Default cluster template revision ID (string)
     */
    public /*out*/ readonly defaultRevisionId!: pulumi.Output<string>;
    /**
     * Cluster template description
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Labels for the cluster template revision (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * Cluster template members (list)
     */
    public readonly members!: pulumi.Output<outputs.ClusterTemplateMember[] | undefined>;
    /**
     * The cluster template revision name (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Cluster template revisions (list)
     */
    public readonly templateRevisions!: pulumi.Output<outputs.ClusterTemplateTemplateRevision[]>;

    /**
     * Create a ClusterTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ClusterTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterTemplateArgs | ClusterTemplateState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterTemplateState | undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["defaultRevisionId"] = state ? state.defaultRevisionId : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["members"] = state ? state.members : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["templateRevisions"] = state ? state.templateRevisions : undefined;
        } else {
            const args = argsOrState as ClusterTemplateArgs | undefined;
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["members"] = args ? args.members : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["templateRevisions"] = args ? args.templateRevisions : undefined;
            inputs["defaultRevisionId"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ClusterTemplate.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterTemplate resources.
 */
export interface ClusterTemplateState {
    /**
     * Annotations for the cluster template revision (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * (Computed) Default cluster template revision ID (string)
     */
    readonly defaultRevisionId?: pulumi.Input<string>;
    /**
     * Cluster template description
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Labels for the cluster template revision (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Cluster template members (list)
     */
    readonly members?: pulumi.Input<pulumi.Input<inputs.ClusterTemplateMember>[]>;
    /**
     * The cluster template revision name (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Cluster template revisions (list)
     */
    readonly templateRevisions?: pulumi.Input<pulumi.Input<inputs.ClusterTemplateTemplateRevision>[]>;
}

/**
 * The set of arguments for constructing a ClusterTemplate resource.
 */
export interface ClusterTemplateArgs {
    /**
     * Annotations for the cluster template revision (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Cluster template description
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Labels for the cluster template revision (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Cluster template members (list)
     */
    readonly members?: pulumi.Input<pulumi.Input<inputs.ClusterTemplateMember>[]>;
    /**
     * The cluster template revision name (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Cluster template revisions (list)
     */
    readonly templateRevisions?: pulumi.Input<pulumi.Input<inputs.ClusterTemplateTemplateRevision>[]>;
}
