// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * Etcd Backup can be imported using the Rancher etcd backup ID
 *
 * ```sh
 *  $ pulumi import rancher2:index/etcdBackup:EtcdBackup foo &lt;ETCD_BACKUP_ID&gt;
 * ```
 */
export class EtcdBackup extends pulumi.CustomResource {
    /**
     * Get an existing EtcdBackup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EtcdBackupState, opts?: pulumi.CustomResourceOptions): EtcdBackup {
        return new EtcdBackup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/etcdBackup:EtcdBackup';

    /**
     * Returns true if the given object is an instance of EtcdBackup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EtcdBackup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EtcdBackup.__pulumiType;
    }

    /**
     * Annotations for Etcd Backup object (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * Backup config for etcd backup (list maxitems:1)
     */
    public readonly backupConfig!: pulumi.Output<outputs.EtcdBackupBackupConfig>;
    /**
     * Cluster ID to config Etcd Backup (string)
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * Filename of the Etcd Backup (string)
     */
    public readonly filename!: pulumi.Output<string>;
    /**
     * Labels for Etcd Backup object (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * Manual execution of the Etcd Backup. Default `false` (bool)
     */
    public readonly manual!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the Etcd Backup (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Description for the Etcd Backup (string)
     */
    public readonly namespaceId!: pulumi.Output<string>;

    /**
     * Create a EtcdBackup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EtcdBackupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EtcdBackupArgs | EtcdBackupState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EtcdBackupState | undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["backupConfig"] = state ? state.backupConfig : undefined;
            inputs["clusterId"] = state ? state.clusterId : undefined;
            inputs["filename"] = state ? state.filename : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["manual"] = state ? state.manual : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["namespaceId"] = state ? state.namespaceId : undefined;
        } else {
            const args = argsOrState as EtcdBackupArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["backupConfig"] = args ? args.backupConfig : undefined;
            inputs["clusterId"] = args ? args.clusterId : undefined;
            inputs["filename"] = args ? args.filename : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["manual"] = args ? args.manual : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["namespaceId"] = args ? args.namespaceId : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(EtcdBackup.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EtcdBackup resources.
 */
export interface EtcdBackupState {
    /**
     * Annotations for Etcd Backup object (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Backup config for etcd backup (list maxitems:1)
     */
    readonly backupConfig?: pulumi.Input<inputs.EtcdBackupBackupConfig>;
    /**
     * Cluster ID to config Etcd Backup (string)
     */
    readonly clusterId?: pulumi.Input<string>;
    /**
     * Filename of the Etcd Backup (string)
     */
    readonly filename?: pulumi.Input<string>;
    /**
     * Labels for Etcd Backup object (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Manual execution of the Etcd Backup. Default `false` (bool)
     */
    readonly manual?: pulumi.Input<boolean>;
    /**
     * The name of the Etcd Backup (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Description for the Etcd Backup (string)
     */
    readonly namespaceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EtcdBackup resource.
 */
export interface EtcdBackupArgs {
    /**
     * Annotations for Etcd Backup object (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Backup config for etcd backup (list maxitems:1)
     */
    readonly backupConfig?: pulumi.Input<inputs.EtcdBackupBackupConfig>;
    /**
     * Cluster ID to config Etcd Backup (string)
     */
    readonly clusterId: pulumi.Input<string>;
    /**
     * Filename of the Etcd Backup (string)
     */
    readonly filename?: pulumi.Input<string>;
    /**
     * Labels for Etcd Backup object (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Manual execution of the Etcd Backup. Default `false` (bool)
     */
    readonly manual?: pulumi.Input<boolean>;
    /**
     * The name of the Etcd Backup (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Description for the Etcd Backup (string)
     */
    readonly namespaceId?: pulumi.Input<string>;
}
