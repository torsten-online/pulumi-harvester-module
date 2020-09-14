// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Namespace resource. This can be used to create namespaces for Rancher v2 environments and retrieve their information.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Namespace
 * const foo = new rancher2.Namespace("foo", {
 *     containerResourceLimit: {
 *         limitsCpu: "20m",
 *         limitsMemory: "20Mi",
 *         requestsCpu: "1m",
 *         requestsMemory: "1Mi",
 *     },
 *     description: "foo namespace",
 *     projectId: "<PROJECT_ID>",
 *     resourceQuota: {
 *         limit: {
 *             limitsCpu: "100m",
 *             limitsMemory: "100Mi",
 *             requestsStorage: "1Gi",
 *         },
 *     },
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 Cluster 
 * const foo_custom = new rancher2.Cluster("foo-custom", {
 *     description: "Foo rancher2 custom cluster",
 *     rkeConfig: {
 *         network: {
 *             plugin: "canal",
 *         },
 *     },
 * });
 * // Create a new rancher2 Namespace assigned to default cluster project
 * const foo = new rancher2.Namespace("foo", {
 *     projectId: foo_custom.defaultProjectId,
 *     description: "foo namespace",
 *     resourceQuota: {
 *         limit: {
 *             limitsCpu: "100m",
 *             limitsMemory: "100Mi",
 *             requestsStorage: "1Gi",
 *         },
 *     },
 *     containerResourceLimit: {
 *         limitsCpu: "20m",
 *         limitsMemory: "20Mi",
 *         requestsCpu: "1m",
 *         requestsMemory: "1Mi",
 *     },
 * });
 * ```
 */
export class Namespace extends pulumi.CustomResource {
    /**
     * Get an existing Namespace resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NamespaceState, opts?: pulumi.CustomResourceOptions): Namespace {
        return new Namespace(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/namespace:Namespace';

    /**
     * Returns true if the given object is an instance of Namespace.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Namespace {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Namespace.__pulumiType;
    }

    /**
     * Annotations for Node Pool object (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * Default containers resource limits on namespace (List maxitem:1)
     */
    public readonly containerResourceLimit!: pulumi.Output<outputs.NamespaceContainerResourceLimit | undefined>;
    /**
     * A namespace description (string)
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Labels for Node Pool object (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The name of the namespace (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The project id where assign namespace. It's on the form `project_id=<cluster_id>:<id>`. Updating `<id>` part on same `<cluster_id>` namespace will be moved between projects (string)
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
     */
    public readonly resourceQuota!: pulumi.Output<outputs.NamespaceResourceQuota>;
    /**
     * Wait for cluster becomes active. Default `false` (bool)
     */
    public readonly waitForCluster!: pulumi.Output<boolean | undefined>;

    /**
     * Create a Namespace resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NamespaceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NamespaceArgs | NamespaceState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as NamespaceState | undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["containerResourceLimit"] = state ? state.containerResourceLimit : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["projectId"] = state ? state.projectId : undefined;
            inputs["resourceQuota"] = state ? state.resourceQuota : undefined;
            inputs["waitForCluster"] = state ? state.waitForCluster : undefined;
        } else {
            const args = argsOrState as NamespaceArgs | undefined;
            if (!args || args.projectId === undefined) {
                throw new Error("Missing required property 'projectId'");
            }
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["containerResourceLimit"] = args ? args.containerResourceLimit : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["projectId"] = args ? args.projectId : undefined;
            inputs["resourceQuota"] = args ? args.resourceQuota : undefined;
            inputs["waitForCluster"] = args ? args.waitForCluster : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Namespace.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Namespace resources.
 */
export interface NamespaceState {
    /**
     * Annotations for Node Pool object (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Default containers resource limits on namespace (List maxitem:1)
     */
    readonly containerResourceLimit?: pulumi.Input<inputs.NamespaceContainerResourceLimit>;
    /**
     * A namespace description (string)
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Labels for Node Pool object (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the namespace (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The project id where assign namespace. It's on the form `project_id=<cluster_id>:<id>`. Updating `<id>` part on same `<cluster_id>` namespace will be moved between projects (string)
     */
    readonly projectId?: pulumi.Input<string>;
    /**
     * Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
     */
    readonly resourceQuota?: pulumi.Input<inputs.NamespaceResourceQuota>;
    /**
     * Wait for cluster becomes active. Default `false` (bool)
     */
    readonly waitForCluster?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Namespace resource.
 */
export interface NamespaceArgs {
    /**
     * Annotations for Node Pool object (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Default containers resource limits on namespace (List maxitem:1)
     */
    readonly containerResourceLimit?: pulumi.Input<inputs.NamespaceContainerResourceLimit>;
    /**
     * A namespace description (string)
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Labels for Node Pool object (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the namespace (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The project id where assign namespace. It's on the form `project_id=<cluster_id>:<id>`. Updating `<id>` part on same `<cluster_id>` namespace will be moved between projects (string)
     */
    readonly projectId: pulumi.Input<string>;
    /**
     * Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
     */
    readonly resourceQuota?: pulumi.Input<inputs.NamespaceResourceQuota>;
    /**
     * Wait for cluster becomes active. Default `false` (bool)
     */
    readonly waitForCluster?: pulumi.Input<boolean>;
}
