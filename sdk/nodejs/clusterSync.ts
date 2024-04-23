// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * // Create a new rancher2 rke Cluster 
 * const foo_custom = new rancher2.Cluster("foo-custom", {
 *     name: "foo-custom",
 *     description: "Foo rancher2 custom cluster",
 *     rkeConfig: {
 *         network: {
 *             plugin: "canal",
 *         },
 *     },
 * });
 * // Create a new rancher2 Node Template
 * const foo = new rancher2.NodeTemplate("foo", {
 *     name: "foo",
 *     description: "foo test",
 *     amazonec2Config: {
 *         accessKey: "<AWS_ACCESS_KEY>",
 *         secretKey: "<AWS_SECRET_KEY>",
 *         ami: "<AMI_ID>",
 *         region: "<REGION>",
 *         securityGroups: ["<AWS_SECURITY_GROUP>"],
 *         subnetId: "<SUBNET_ID>",
 *         vpcId: "<VPC_ID>",
 *         zone: "<ZONE>",
 *     },
 * });
 * // Create a new rancher2 Node Pool
 * const fooNodePool = new rancher2.NodePool("foo", {
 *     clusterId: foo_custom.id,
 *     name: "foo",
 *     hostnamePrefix: "foo-cluster-0",
 *     nodeTemplateId: foo.id,
 *     quantity: 3,
 *     controlPlane: true,
 *     etcd: true,
 *     worker: true,
 * });
 * // Create a new rancher2 Cluster Sync
 * const foo_customClusterSync = new rancher2.ClusterSync("foo-custom", {
 *     clusterId: foo_custom.id,
 *     nodePoolIds: [fooNodePool.id],
 * });
 * // Create a new rancher2 Project
 * const fooProject = new rancher2.Project("foo", {
 *     name: "foo",
 *     clusterId: foo_customClusterSync.id,
 *     description: "Terraform namespace acceptance test",
 *     resourceQuota: {
 *         projectLimit: {
 *             limitsCpu: "2000m",
 *             limitsMemory: "2000Mi",
 *             requestsStorage: "2Gi",
 *         },
 *         namespaceDefaultLimit: {
 *             limitsCpu: "500m",
 *             limitsMemory: "500Mi",
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
export class ClusterSync extends pulumi.CustomResource {
    /**
     * Get an existing ClusterSync resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterSyncState, opts?: pulumi.CustomResourceOptions): ClusterSync {
        return new ClusterSync(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/clusterSync:ClusterSync';

    /**
     * Returns true if the given object is an instance of ClusterSync.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClusterSync {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClusterSync.__pulumiType;
    }

    /**
     * The cluster ID that is syncing (string)
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * (Computed) Default project ID for the cluster sync (string)
     */
    public /*out*/ readonly defaultProjectId!: pulumi.Output<string>;
    /**
     * (Computed/Sensitive) Kube Config generated for the cluster sync (string)
     */
    public /*out*/ readonly kubeConfig!: pulumi.Output<string>;
    /**
     * The node pool IDs used by the cluster id (list)
     */
    public readonly nodePoolIds!: pulumi.Output<string[] | undefined>;
    /**
     * (Computed) The cluster nodes (list).
     */
    public /*out*/ readonly nodes!: pulumi.Output<outputs.ClusterSyncNode[]>;
    /**
     * Wait until active status is confirmed a number of times (wait interval of 5s). Default: `1` means no confirmation (int)
     *
     * **Note:** `stateConfirm` would be useful, if you have troubles for creating/updating custom clusters that eventually are reaching `active` state before they are fully installed. For example: setting `stateConfirm = 2` will assure that the cluster has been in `active` state for at least 5 seconds, `stateConfirm = 3` assure at least 10 seconds, etc
     */
    public readonly stateConfirm!: pulumi.Output<number | undefined>;
    public readonly synced!: pulumi.Output<boolean | undefined>;
    /**
     * (Computed) System project ID for the cluster sync (string)
     */
    public /*out*/ readonly systemProjectId!: pulumi.Output<string>;
    /**
     * Wait until alerting is up and running. Default: `false` (bool)
     */
    public readonly waitAlerting!: pulumi.Output<boolean | undefined>;
    /**
     * Wait until all catalogs are downloaded and active. Default: `false` (bool)
     */
    public readonly waitCatalogs!: pulumi.Output<boolean | undefined>;
    /**
     * Wait until monitoring is up and running. Default: `false` (bool)
     */
    public readonly waitMonitoring!: pulumi.Output<boolean | undefined>;

    /**
     * Create a ClusterSync resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterSyncArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterSyncArgs | ClusterSyncState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterSyncState | undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["defaultProjectId"] = state ? state.defaultProjectId : undefined;
            resourceInputs["kubeConfig"] = state ? state.kubeConfig : undefined;
            resourceInputs["nodePoolIds"] = state ? state.nodePoolIds : undefined;
            resourceInputs["nodes"] = state ? state.nodes : undefined;
            resourceInputs["stateConfirm"] = state ? state.stateConfirm : undefined;
            resourceInputs["synced"] = state ? state.synced : undefined;
            resourceInputs["systemProjectId"] = state ? state.systemProjectId : undefined;
            resourceInputs["waitAlerting"] = state ? state.waitAlerting : undefined;
            resourceInputs["waitCatalogs"] = state ? state.waitCatalogs : undefined;
            resourceInputs["waitMonitoring"] = state ? state.waitMonitoring : undefined;
        } else {
            const args = argsOrState as ClusterSyncArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["nodePoolIds"] = args ? args.nodePoolIds : undefined;
            resourceInputs["stateConfirm"] = args ? args.stateConfirm : undefined;
            resourceInputs["synced"] = args ? args.synced : undefined;
            resourceInputs["waitAlerting"] = args ? args.waitAlerting : undefined;
            resourceInputs["waitCatalogs"] = args ? args.waitCatalogs : undefined;
            resourceInputs["waitMonitoring"] = args ? args.waitMonitoring : undefined;
            resourceInputs["defaultProjectId"] = undefined /*out*/;
            resourceInputs["kubeConfig"] = undefined /*out*/;
            resourceInputs["nodes"] = undefined /*out*/;
            resourceInputs["systemProjectId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["kubeConfig"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ClusterSync.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterSync resources.
 */
export interface ClusterSyncState {
    /**
     * The cluster ID that is syncing (string)
     */
    clusterId?: pulumi.Input<string>;
    /**
     * (Computed) Default project ID for the cluster sync (string)
     */
    defaultProjectId?: pulumi.Input<string>;
    /**
     * (Computed/Sensitive) Kube Config generated for the cluster sync (string)
     */
    kubeConfig?: pulumi.Input<string>;
    /**
     * The node pool IDs used by the cluster id (list)
     */
    nodePoolIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (Computed) The cluster nodes (list).
     */
    nodes?: pulumi.Input<pulumi.Input<inputs.ClusterSyncNode>[]>;
    /**
     * Wait until active status is confirmed a number of times (wait interval of 5s). Default: `1` means no confirmation (int)
     *
     * **Note:** `stateConfirm` would be useful, if you have troubles for creating/updating custom clusters that eventually are reaching `active` state before they are fully installed. For example: setting `stateConfirm = 2` will assure that the cluster has been in `active` state for at least 5 seconds, `stateConfirm = 3` assure at least 10 seconds, etc
     */
    stateConfirm?: pulumi.Input<number>;
    synced?: pulumi.Input<boolean>;
    /**
     * (Computed) System project ID for the cluster sync (string)
     */
    systemProjectId?: pulumi.Input<string>;
    /**
     * Wait until alerting is up and running. Default: `false` (bool)
     */
    waitAlerting?: pulumi.Input<boolean>;
    /**
     * Wait until all catalogs are downloaded and active. Default: `false` (bool)
     */
    waitCatalogs?: pulumi.Input<boolean>;
    /**
     * Wait until monitoring is up and running. Default: `false` (bool)
     */
    waitMonitoring?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a ClusterSync resource.
 */
export interface ClusterSyncArgs {
    /**
     * The cluster ID that is syncing (string)
     */
    clusterId: pulumi.Input<string>;
    /**
     * The node pool IDs used by the cluster id (list)
     */
    nodePoolIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Wait until active status is confirmed a number of times (wait interval of 5s). Default: `1` means no confirmation (int)
     *
     * **Note:** `stateConfirm` would be useful, if you have troubles for creating/updating custom clusters that eventually are reaching `active` state before they are fully installed. For example: setting `stateConfirm = 2` will assure that the cluster has been in `active` state for at least 5 seconds, `stateConfirm = 3` assure at least 10 seconds, etc
     */
    stateConfirm?: pulumi.Input<number>;
    synced?: pulumi.Input<boolean>;
    /**
     * Wait until alerting is up and running. Default: `false` (bool)
     */
    waitAlerting?: pulumi.Input<boolean>;
    /**
     * Wait until all catalogs are downloaded and active. Default: `false` (bool)
     */
    waitCatalogs?: pulumi.Input<boolean>;
    /**
     * Wait until monitoring is up and running. Default: `false` (bool)
     */
    waitMonitoring?: pulumi.Input<boolean>;
}
