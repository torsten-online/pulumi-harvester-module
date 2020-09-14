// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

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
    readonly labels?: {[key: string]: any};
    readonly name: string;
    readonly projectId: string;
}

/**
 * A collection of values returned by getProjectAlertRule.
 */
export interface GetProjectAlertRuleResult {
    readonly annotations: {[key: string]: any};
    readonly groupId: string;
    readonly groupIntervalSeconds: number;
    readonly groupWaitSeconds: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly inherited: boolean;
    readonly labels?: {[key: string]: any};
    readonly metricRule: outputs.GetProjectAlertRuleMetricRule;
    readonly name: string;
    readonly podRule: outputs.GetProjectAlertRulePodRule;
    readonly projectId: string;
    readonly repeatIntervalSeconds: number;
    readonly severity: string;
    readonly workloadRule: outputs.GetProjectAlertRuleWorkloadRule;
}
