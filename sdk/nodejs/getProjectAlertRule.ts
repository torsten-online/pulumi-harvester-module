// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 project alert rule.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = pulumi.output(rancher2.getProjectAlertRule({
 *     name: "<project_alert_rule_name>",
 *     projectId: "<project_id>",
 * }, { async: true }));
 * ```
 */
export function getProjectAlertRule(args: GetProjectAlertRuleArgs, opts?: pulumi.InvokeOptions): Promise<GetProjectAlertRuleResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getProjectAlertRule:getProjectAlertRule", {
        "labels": args.labels,
        "name": args.name,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getProjectAlertRule.
 */
export interface GetProjectAlertRuleArgs {
    /**
     * (Computed) The project alert rule labels (map)
     */
    readonly labels?: {[key: string]: any};
    /**
     * The project alert rule name (string)
     */
    readonly name: string;
    /**
     * The project id where create project alert rule (string)
     */
    readonly projectId: string;
}

/**
 * A collection of values returned by getProjectAlertRule.
 */
export interface GetProjectAlertRuleResult {
    /**
     * (Computed) The project alert rule annotations (map)
     */
    readonly annotations: {[key: string]: any};
    /**
     * (Computed) The project alert rule alert group ID (string)
     */
    readonly groupId: string;
    /**
     * (Computed) The project alert rule group interval seconds. Default: `180` (int)
     */
    readonly groupIntervalSeconds: number;
    /**
     * (Computed) The project alert rule group wait seconds. Default: `180` (int)
     */
    readonly groupWaitSeconds: number;
    /**
     * (Computed) The project alert rule inherited. Default: `true` (bool)
     */
    readonly inherited: boolean;
    /**
     * (Computed) The project alert rule labels (map)
     */
    readonly labels?: {[key: string]: any};
    /**
     * (Computed) The project alert rule metric rule. ConflictsWith: `"podRule", "workloadRule"`` (list Maxitems:1)
     */
    readonly metricRule: outputs.GetProjectAlertRuleMetricRule;
    readonly name: string;
    /**
     * (Computed) The project alert rule pod rule. ConflictsWith: `"metricRule", "workloadRule"`` (list Maxitems:1)
     */
    readonly podRule: outputs.GetProjectAlertRulePodRule;
    readonly projectId: string;
    /**
     * (Computed) The project alert rule wait seconds. Default: `3600` (int)
     */
    readonly repeatIntervalSeconds: number;
    /**
     * (Computed) The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
     */
    readonly severity: string;
    /**
     * (Computed) The project alert rule workload rule. ConflictsWith: `"metricRule", "podRule"`` (list Maxitems:1)
     */
    readonly workloadRule: outputs.GetProjectAlertRuleWorkloadRule;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
