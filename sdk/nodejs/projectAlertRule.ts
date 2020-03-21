// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class ProjectAlertRule extends pulumi.CustomResource {
    /**
     * Get an existing ProjectAlertRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectAlertRuleState, opts?: pulumi.CustomResourceOptions): ProjectAlertRule {
        return new ProjectAlertRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/projectAlertRule:ProjectAlertRule';

    /**
     * Returns true if the given object is an instance of ProjectAlertRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProjectAlertRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProjectAlertRule.__pulumiType;
    }

    /**
     * The project alert rule annotations (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * The project alert rule alert group ID (string)
     */
    public readonly groupId!: pulumi.Output<string>;
    /**
     * The project alert rule group interval seconds. Default: `180` (int)
     */
    public readonly groupIntervalSeconds!: pulumi.Output<number | undefined>;
    /**
     * The project alert rule group wait seconds. Default: `180` (int)
     */
    public readonly groupWaitSeconds!: pulumi.Output<number | undefined>;
    /**
     * The project alert rule inherited. Default: `true` (bool)
     */
    public readonly inherited!: pulumi.Output<boolean | undefined>;
    /**
     * The project alert rule labels (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The project alert rule metric rule. ConflictsWith: `"podRule", "workloadRule"`` (list Maxitems:1)
     */
    public readonly metricRule!: pulumi.Output<outputs.ProjectAlertRuleMetricRule | undefined>;
    /**
     * The project alert rule name (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The project alert rule pod rule. ConflictsWith: `"metricRule", "workloadRule"`` (list Maxitems:1)
     */
    public readonly podRule!: pulumi.Output<outputs.ProjectAlertRulePodRule | undefined>;
    /**
     * The project id where create project alert rule (string)
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * The project alert rule wait seconds. Default: `3600` (int)
     */
    public readonly repeatIntervalSeconds!: pulumi.Output<number | undefined>;
    /**
     * The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
     */
    public readonly severity!: pulumi.Output<string | undefined>;
    /**
     * The project alert rule workload rule. ConflictsWith: `"metricRule", "podRule"`` (list Maxitems:1)
     */
    public readonly workloadRule!: pulumi.Output<outputs.ProjectAlertRuleWorkloadRule | undefined>;

    /**
     * Create a ProjectAlertRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectAlertRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectAlertRuleArgs | ProjectAlertRuleState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ProjectAlertRuleState | undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["groupId"] = state ? state.groupId : undefined;
            inputs["groupIntervalSeconds"] = state ? state.groupIntervalSeconds : undefined;
            inputs["groupWaitSeconds"] = state ? state.groupWaitSeconds : undefined;
            inputs["inherited"] = state ? state.inherited : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["metricRule"] = state ? state.metricRule : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["podRule"] = state ? state.podRule : undefined;
            inputs["projectId"] = state ? state.projectId : undefined;
            inputs["repeatIntervalSeconds"] = state ? state.repeatIntervalSeconds : undefined;
            inputs["severity"] = state ? state.severity : undefined;
            inputs["workloadRule"] = state ? state.workloadRule : undefined;
        } else {
            const args = argsOrState as ProjectAlertRuleArgs | undefined;
            if (!args || args.groupId === undefined) {
                throw new Error("Missing required property 'groupId'");
            }
            if (!args || args.projectId === undefined) {
                throw new Error("Missing required property 'projectId'");
            }
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["groupId"] = args ? args.groupId : undefined;
            inputs["groupIntervalSeconds"] = args ? args.groupIntervalSeconds : undefined;
            inputs["groupWaitSeconds"] = args ? args.groupWaitSeconds : undefined;
            inputs["inherited"] = args ? args.inherited : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["metricRule"] = args ? args.metricRule : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["podRule"] = args ? args.podRule : undefined;
            inputs["projectId"] = args ? args.projectId : undefined;
            inputs["repeatIntervalSeconds"] = args ? args.repeatIntervalSeconds : undefined;
            inputs["severity"] = args ? args.severity : undefined;
            inputs["workloadRule"] = args ? args.workloadRule : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ProjectAlertRule.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProjectAlertRule resources.
 */
export interface ProjectAlertRuleState {
    /**
     * The project alert rule annotations (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The project alert rule alert group ID (string)
     */
    readonly groupId?: pulumi.Input<string>;
    /**
     * The project alert rule group interval seconds. Default: `180` (int)
     */
    readonly groupIntervalSeconds?: pulumi.Input<number>;
    /**
     * The project alert rule group wait seconds. Default: `180` (int)
     */
    readonly groupWaitSeconds?: pulumi.Input<number>;
    /**
     * The project alert rule inherited. Default: `true` (bool)
     */
    readonly inherited?: pulumi.Input<boolean>;
    /**
     * The project alert rule labels (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The project alert rule metric rule. ConflictsWith: `"podRule", "workloadRule"`` (list Maxitems:1)
     */
    readonly metricRule?: pulumi.Input<inputs.ProjectAlertRuleMetricRule>;
    /**
     * The project alert rule name (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The project alert rule pod rule. ConflictsWith: `"metricRule", "workloadRule"`` (list Maxitems:1)
     */
    readonly podRule?: pulumi.Input<inputs.ProjectAlertRulePodRule>;
    /**
     * The project id where create project alert rule (string)
     */
    readonly projectId?: pulumi.Input<string>;
    /**
     * The project alert rule wait seconds. Default: `3600` (int)
     */
    readonly repeatIntervalSeconds?: pulumi.Input<number>;
    /**
     * The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
     */
    readonly severity?: pulumi.Input<string>;
    /**
     * The project alert rule workload rule. ConflictsWith: `"metricRule", "podRule"`` (list Maxitems:1)
     */
    readonly workloadRule?: pulumi.Input<inputs.ProjectAlertRuleWorkloadRule>;
}

/**
 * The set of arguments for constructing a ProjectAlertRule resource.
 */
export interface ProjectAlertRuleArgs {
    /**
     * The project alert rule annotations (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The project alert rule alert group ID (string)
     */
    readonly groupId: pulumi.Input<string>;
    /**
     * The project alert rule group interval seconds. Default: `180` (int)
     */
    readonly groupIntervalSeconds?: pulumi.Input<number>;
    /**
     * The project alert rule group wait seconds. Default: `180` (int)
     */
    readonly groupWaitSeconds?: pulumi.Input<number>;
    /**
     * The project alert rule inherited. Default: `true` (bool)
     */
    readonly inherited?: pulumi.Input<boolean>;
    /**
     * The project alert rule labels (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The project alert rule metric rule. ConflictsWith: `"podRule", "workloadRule"`` (list Maxitems:1)
     */
    readonly metricRule?: pulumi.Input<inputs.ProjectAlertRuleMetricRule>;
    /**
     * The project alert rule name (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The project alert rule pod rule. ConflictsWith: `"metricRule", "workloadRule"`` (list Maxitems:1)
     */
    readonly podRule?: pulumi.Input<inputs.ProjectAlertRulePodRule>;
    /**
     * The project id where create project alert rule (string)
     */
    readonly projectId: pulumi.Input<string>;
    /**
     * The project alert rule wait seconds. Default: `3600` (int)
     */
    readonly repeatIntervalSeconds?: pulumi.Input<number>;
    /**
     * The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
     */
    readonly severity?: pulumi.Input<string>;
    /**
     * The project alert rule workload rule. ConflictsWith: `"metricRule", "podRule"`` (list Maxitems:1)
     */
    readonly workloadRule?: pulumi.Input<inputs.ProjectAlertRuleWorkloadRule>;
}
