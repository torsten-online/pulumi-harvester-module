// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getProjectLogging(args: GetProjectLoggingArgs, opts?: pulumi.InvokeOptions): Promise<GetProjectLoggingResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getProjectLogging:getProjectLogging", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getProjectLogging.
 */
export interface GetProjectLoggingArgs {
    readonly projectId: string;
}

/**
 * A collection of values returned by getProjectLogging.
 */
export interface GetProjectLoggingResult {
    readonly annotations: {[key: string]: any};
    readonly customTargetConfig: outputs.GetProjectLoggingCustomTargetConfig;
    readonly elasticsearchConfig: outputs.GetProjectLoggingElasticsearchConfig;
    readonly enableJsonParsing: boolean;
    readonly fluentdConfig: outputs.GetProjectLoggingFluentdConfig;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly kafkaConfig: outputs.GetProjectLoggingKafkaConfig;
    readonly kind: string;
    readonly labels: {[key: string]: any};
    readonly name: string;
    readonly namespaceId: string;
    readonly outputFlushInterval: number;
    readonly outputTags: {[key: string]: any};
    readonly projectId: string;
    readonly splunkConfig: outputs.GetProjectLoggingSplunkConfig;
    readonly syslogConfig: outputs.GetProjectLoggingSyslogConfig;
}
