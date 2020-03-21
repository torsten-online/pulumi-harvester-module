// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 Project Logging.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 * 
 * const foo = rancher2.getProjectLogging({
 *     projectId: "<project_id>",
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/projectLogging.html.markdown.
 */
export function getProjectLogging(args: GetProjectLoggingArgs, opts?: pulumi.InvokeOptions): Promise<GetProjectLoggingResult> & GetProjectLoggingResult {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    const promise: Promise<GetProjectLoggingResult> = pulumi.runtime.invoke("rancher2:index/getProjectLogging:getProjectLogging", {
        "projectId": args.projectId,
    }, opts);

    return pulumi.utils.liftProperties(promise, opts);
}

/**
 * A collection of arguments for invoking getProjectLogging.
 */
export interface GetProjectLoggingArgs {
    /**
     * The project id to configure logging (string)
     */
    readonly projectId: string;
}

/**
 * A collection of values returned by getProjectLogging.
 */
export interface GetProjectLoggingResult {
    /**
     * (Computed) Annotations for Cluster Logging object (map)
     */
    readonly annotations: {[key: string]: any};
    /**
     * (Computed) The elasticsearch config for Cluster Logging. For `kind = elasticsearch`  (list maxitems:1)
     */
    readonly elasticsearchConfig: outputs.GetProjectLoggingElasticsearchConfig;
    /**
     * (Computed) The fluentd config for Cluster Logging. For `kind = fluentd` (list maxitems:1)
     */
    readonly fluentdConfig: outputs.GetProjectLoggingFluentdConfig;
    /**
     * (Computed) The kafka config for Cluster Logging. For `kind = kafka` (list maxitems:1)
     */
    readonly kafkaConfig: outputs.GetProjectLoggingKafkaConfig;
    /**
     * (Computed) The kind of the Cluster Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
     */
    readonly kind: string;
    /**
     * (Computed) Labels for Cluster Logging object (map)
     */
    readonly labels: {[key: string]: any};
    /**
     * (Computed) The name of the cluster logging config (string)
     */
    readonly name: string;
    /**
     * (Computed) The namespace id from cluster logging (string)
     */
    readonly namespaceId: string;
    /**
     * (Computed) How often buffered logs would be flushed. Default: `3` seconds (int)
     */
    readonly outputFlushInterval: number;
    /**
     * (computed) The output tags for Cluster Logging (map)
     */
    readonly outputTags: {[key: string]: any};
    readonly projectId: string;
    /**
     * (Computed) The splunk config for Cluster Logging. For `kind = splunk` (list maxitems:1)
     */
    readonly splunkConfig: outputs.GetProjectLoggingSplunkConfig;
    /**
     * (Computed) The syslog config for Cluster Logging. For `kind = syslog` (list maxitems:1)
     */
    readonly syslogConfig: outputs.GetProjectLoggingSyslogConfig;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
