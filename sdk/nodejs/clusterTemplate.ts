// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
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
 *     name: "foo",
 *     members: [{
 *         accessType: "owner",
 *         userPrincipalId: "local://user-XXXXX",
 *     }],
 *     templateRevisions: [{
 *         name: "V1",
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
 *         "default": true,
 *     }],
 *     description: "Terraform cluster template foo",
 * });
 * ```
 *
 * Creating Rancher v2 RKE cluster template with upgrade strategy. For Rancher v2.4.x and above.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Cluster Template
 * const foo = new rancher2.ClusterTemplate("foo", {
 *     name: "foo",
 *     members: [{
 *         accessType: "owner",
 *         userPrincipalId: "local://user-XXXXX",
 *     }],
 *     templateRevisions: [{
 *         name: "V1",
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
 *         "default": true,
 *     }],
 *     description: "Terraform cluster template foo",
 * });
 * ```
 *
 * ## Import
 *
 * Cluster Template can be imported using the rancher Cluster Template ID
 *
 * ```sh
 * $ pulumi import rancher2:index/clusterTemplate:ClusterTemplate foo &lt;CLUSTER_TEMPLATE_ID&gt;
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
     * Annotations for the cluster template (map)
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
     * Labels for the cluster template (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * Cluster template members (list)
     */
    public readonly members!: pulumi.Output<outputs.ClusterTemplateMember[] | undefined>;
    /**
     * The cluster template name (string)
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
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterTemplateState | undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["defaultRevisionId"] = state ? state.defaultRevisionId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["members"] = state ? state.members : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["templateRevisions"] = state ? state.templateRevisions : undefined;
        } else {
            const args = argsOrState as ClusterTemplateArgs | undefined;
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["members"] = args ? args.members : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["templateRevisions"] = args ? args.templateRevisions : undefined;
            resourceInputs["defaultRevisionId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ClusterTemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterTemplate resources.
 */
export interface ClusterTemplateState {
    /**
     * Annotations for the cluster template (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * (Computed) Default cluster template revision ID (string)
     */
    defaultRevisionId?: pulumi.Input<string>;
    /**
     * Cluster template description
     */
    description?: pulumi.Input<string>;
    /**
     * Labels for the cluster template (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Cluster template members (list)
     */
    members?: pulumi.Input<pulumi.Input<inputs.ClusterTemplateMember>[]>;
    /**
     * The cluster template name (string)
     */
    name?: pulumi.Input<string>;
    /**
     * Cluster template revisions (list)
     */
    templateRevisions?: pulumi.Input<pulumi.Input<inputs.ClusterTemplateTemplateRevision>[]>;
}

/**
 * The set of arguments for constructing a ClusterTemplate resource.
 */
export interface ClusterTemplateArgs {
    /**
     * Annotations for the cluster template (map)
     */
    annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Cluster template description
     */
    description?: pulumi.Input<string>;
    /**
     * Labels for the cluster template (map)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Cluster template members (list)
     */
    members?: pulumi.Input<pulumi.Input<inputs.ClusterTemplateMember>[]>;
    /**
     * The cluster template name (string)
     */
    name?: pulumi.Input<string>;
    /**
     * Cluster template revisions (list)
     */
    templateRevisions?: pulumi.Input<pulumi.Input<inputs.ClusterTemplateTemplateRevision>[]>;
}
