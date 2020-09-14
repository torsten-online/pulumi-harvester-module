// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getNotifier(args: GetNotifierArgs, opts?: pulumi.InvokeOptions): Promise<GetNotifierResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getNotifier:getNotifier", {
        "clusterId": args.clusterId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getNotifier.
 */
export interface GetNotifierArgs {
    readonly clusterId: string;
    readonly name: string;
}

/**
 * A collection of values returned by getNotifier.
 */
export interface GetNotifierResult {
    readonly annotations: {[key: string]: any};
    readonly clusterId: string;
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly labels: {[key: string]: any};
    readonly name: string;
    readonly pagerdutyConfig: outputs.GetNotifierPagerdutyConfig;
    readonly slackConfig: outputs.GetNotifierSlackConfig;
    readonly smtpConfig: outputs.GetNotifierSmtpConfig;
    readonly webhookConfig: outputs.GetNotifierWebhookConfig;
    readonly wechatConfig: outputs.GetNotifierWechatConfig;
}
