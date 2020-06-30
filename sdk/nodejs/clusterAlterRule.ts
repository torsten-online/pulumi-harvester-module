// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * @deprecated rancher2.ClusterAlterRule has been deprecated in favor of rancher2.ClusterAlertRule
 */
export class ClusterAlterRule extends pulumi.CustomResource {
    /**
     * Get an existing ClusterAlterRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterAlterRuleState, opts?: pulumi.CustomResourceOptions): ClusterAlterRule {
        pulumi.log.warn("ClusterAlterRule is deprecated: rancher2.ClusterAlterRule has been deprecated in favor of rancher2.ClusterAlertRule")
        return new ClusterAlterRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/clusterAlterRule:ClusterAlterRule';

    /**
     * Returns true if the given object is an instance of ClusterAlterRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClusterAlterRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClusterAlterRule.__pulumiType;
    }

    /**
     * The cluster alert rule annotations (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * The cluster id where create cluster alert rule (string)
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
     */
    public readonly eventRule!: pulumi.Output<outputs.ClusterAlterRuleEventRule | undefined>;
    /**
     * The cluster alert rule alert group ID (string)
     */
    public readonly groupId!: pulumi.Output<string>;
    /**
     * The cluster alert rule group interval seconds. Default: `180` (int)
     */
    public readonly groupIntervalSeconds!: pulumi.Output<number | undefined>;
    /**
     * The cluster alert rule group wait seconds. Default: `180` (int)
     */
    public readonly groupWaitSeconds!: pulumi.Output<number | undefined>;
    /**
     * The cluster alert rule inherited. Default: `true` (bool)
     */
    public readonly inherited!: pulumi.Output<boolean | undefined>;
    /**
     * The cluster alert rule labels (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
     */
    public readonly metricRule!: pulumi.Output<outputs.ClusterAlterRuleMetricRule | undefined>;
    /**
     * The cluster alert rule name (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
     */
    public readonly nodeRule!: pulumi.Output<outputs.ClusterAlterRuleNodeRule | undefined>;
    /**
     * The cluster alert rule wait seconds. Default: `3600` (int)
     */
    public readonly repeatIntervalSeconds!: pulumi.Output<number | undefined>;
    /**
     * The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
     */
    public readonly severity!: pulumi.Output<string | undefined>;
    /**
     * The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"`` (list Maxitems:1)
     */
    public readonly systemServiceRule!: pulumi.Output<outputs.ClusterAlterRuleSystemServiceRule | undefined>;

    /**
     * Create a ClusterAlterRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    /** @deprecated rancher2.ClusterAlterRule has been deprecated in favor of rancher2.ClusterAlertRule */
    constructor(name: string, args: ClusterAlterRuleArgs, opts?: pulumi.CustomResourceOptions)
    /** @deprecated rancher2.ClusterAlterRule has been deprecated in favor of rancher2.ClusterAlertRule */
    constructor(name: string, argsOrState?: ClusterAlterRuleArgs | ClusterAlterRuleState, opts?: pulumi.CustomResourceOptions) {
        pulumi.log.warn("ClusterAlterRule is deprecated: rancher2.ClusterAlterRule has been deprecated in favor of rancher2.ClusterAlertRule")
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ClusterAlterRuleState | undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["clusterId"] = state ? state.clusterId : undefined;
            inputs["eventRule"] = state ? state.eventRule : undefined;
            inputs["groupId"] = state ? state.groupId : undefined;
            inputs["groupIntervalSeconds"] = state ? state.groupIntervalSeconds : undefined;
            inputs["groupWaitSeconds"] = state ? state.groupWaitSeconds : undefined;
            inputs["inherited"] = state ? state.inherited : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["metricRule"] = state ? state.metricRule : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["nodeRule"] = state ? state.nodeRule : undefined;
            inputs["repeatIntervalSeconds"] = state ? state.repeatIntervalSeconds : undefined;
            inputs["severity"] = state ? state.severity : undefined;
            inputs["systemServiceRule"] = state ? state.systemServiceRule : undefined;
        } else {
            const args = argsOrState as ClusterAlterRuleArgs | undefined;
            if (!args || args.clusterId === undefined) {
                throw new Error("Missing required property 'clusterId'");
            }
            if (!args || args.groupId === undefined) {
                throw new Error("Missing required property 'groupId'");
            }
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["clusterId"] = args ? args.clusterId : undefined;
            inputs["eventRule"] = args ? args.eventRule : undefined;
            inputs["groupId"] = args ? args.groupId : undefined;
            inputs["groupIntervalSeconds"] = args ? args.groupIntervalSeconds : undefined;
            inputs["groupWaitSeconds"] = args ? args.groupWaitSeconds : undefined;
            inputs["inherited"] = args ? args.inherited : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["metricRule"] = args ? args.metricRule : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["nodeRule"] = args ? args.nodeRule : undefined;
            inputs["repeatIntervalSeconds"] = args ? args.repeatIntervalSeconds : undefined;
            inputs["severity"] = args ? args.severity : undefined;
            inputs["systemServiceRule"] = args ? args.systemServiceRule : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ClusterAlterRule.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterAlterRule resources.
 */
export interface ClusterAlterRuleState {
    /**
     * The cluster alert rule annotations (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster id where create cluster alert rule (string)
     */
    readonly clusterId?: pulumi.Input<string>;
    /**
     * The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
     */
    readonly eventRule?: pulumi.Input<inputs.ClusterAlterRuleEventRule>;
    /**
     * The cluster alert rule alert group ID (string)
     */
    readonly groupId?: pulumi.Input<string>;
    /**
     * The cluster alert rule group interval seconds. Default: `180` (int)
     */
    readonly groupIntervalSeconds?: pulumi.Input<number>;
    /**
     * The cluster alert rule group wait seconds. Default: `180` (int)
     */
    readonly groupWaitSeconds?: pulumi.Input<number>;
    /**
     * The cluster alert rule inherited. Default: `true` (bool)
     */
    readonly inherited?: pulumi.Input<boolean>;
    /**
     * The cluster alert rule labels (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
     */
    readonly metricRule?: pulumi.Input<inputs.ClusterAlterRuleMetricRule>;
    /**
     * The cluster alert rule name (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
     */
    readonly nodeRule?: pulumi.Input<inputs.ClusterAlterRuleNodeRule>;
    /**
     * The cluster alert rule wait seconds. Default: `3600` (int)
     */
    readonly repeatIntervalSeconds?: pulumi.Input<number>;
    /**
     * The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
     */
    readonly severity?: pulumi.Input<string>;
    /**
     * The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"`` (list Maxitems:1)
     */
    readonly systemServiceRule?: pulumi.Input<inputs.ClusterAlterRuleSystemServiceRule>;
}

/**
 * The set of arguments for constructing a ClusterAlterRule resource.
 */
export interface ClusterAlterRuleArgs {
    /**
     * The cluster alert rule annotations (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster id where create cluster alert rule (string)
     */
    readonly clusterId: pulumi.Input<string>;
    /**
     * The cluster alert rule event rule. ConflictsWith: `"metricRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
     */
    readonly eventRule?: pulumi.Input<inputs.ClusterAlterRuleEventRule>;
    /**
     * The cluster alert rule alert group ID (string)
     */
    readonly groupId: pulumi.Input<string>;
    /**
     * The cluster alert rule group interval seconds. Default: `180` (int)
     */
    readonly groupIntervalSeconds?: pulumi.Input<number>;
    /**
     * The cluster alert rule group wait seconds. Default: `180` (int)
     */
    readonly groupWaitSeconds?: pulumi.Input<number>;
    /**
     * The cluster alert rule inherited. Default: `true` (bool)
     */
    readonly inherited?: pulumi.Input<boolean>;
    /**
     * The cluster alert rule labels (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster alert rule metric rule. ConflictsWith: `"eventRule", "nodeRule", "systemServiceRule"`` (list Maxitems:1)
     */
    readonly metricRule?: pulumi.Input<inputs.ClusterAlterRuleMetricRule>;
    /**
     * The cluster alert rule name (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The cluster alert rule node rule. ConflictsWith: `"eventRule", "metricRule", "systemServiceRule"`` (list Maxitems:1)
     */
    readonly nodeRule?: pulumi.Input<inputs.ClusterAlterRuleNodeRule>;
    /**
     * The cluster alert rule wait seconds. Default: `3600` (int)
     */
    readonly repeatIntervalSeconds?: pulumi.Input<number>;
    /**
     * The cluster alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
     */
    readonly severity?: pulumi.Input<string>;
    /**
     * The cluster alert rule system service rule. ConflictsWith: `"eventRule", "metricRule", "nodeRule"`` (list Maxitems:1)
     */
    readonly systemServiceRule?: pulumi.Input<inputs.ClusterAlterRuleSystemServiceRule>;
}
