// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Rancher v2 Cluster Logging resource. This can be used to configure Cluster Logging for Rancher v2 environments and retrieve their information.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 * 
 * // Create a new Rancher2 Cluster Logging
 * const foo = new rancher2.ClusterLogging("foo", {
 *     clusterId: "<cluster_id>",
 *     kind: "syslog",
 *     syslogConfig: {
 *         endpoint: "<syslog_endpoint>",
 *         protocol: "udp",
 *         severity: "notice",
 *         sslVerify: false,
 *     },
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/clusterLogging.html.markdown.
 */
export class ClusterLogging extends pulumi.CustomResource {
    /**
     * Get an existing ClusterLogging resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterLoggingState, opts?: pulumi.CustomResourceOptions): ClusterLogging {
        return new ClusterLogging(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/clusterLogging:ClusterLogging';

    /**
     * Returns true if the given object is an instance of ClusterLogging.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClusterLogging {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClusterLogging.__pulumiType;
    }

    /**
     * Annotations for Cluster Logging object (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * The cluster id to configure logging (string)
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    public readonly customTargetConfig!: pulumi.Output<outputs.ClusterLoggingCustomTargetConfig | undefined>;
    /**
     * The elasticsearch config for Cluster Logging. For `kind = elasticsearch`. Conflicts with `customTargetConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    public readonly elasticsearchConfig!: pulumi.Output<outputs.ClusterLoggingElasticsearchConfig | undefined>;
    /**
     * The fluentd config for Cluster Logging. For `kind = fluentd`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    public readonly fluentdConfig!: pulumi.Output<outputs.ClusterLoggingFluentdConfig | undefined>;
    /**
     * The kafka config for Cluster Logging. For `kind = kafka`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    public readonly kafkaConfig!: pulumi.Output<outputs.ClusterLoggingKafkaConfig | undefined>;
    /**
     * The kind of the Cluster Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
     */
    public readonly kind!: pulumi.Output<string>;
    /**
     * Labels for Cluster Logging object (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The name of the cluster logging config (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The namespace id from cluster logging (string)
     */
    public readonly namespaceId!: pulumi.Output<string | undefined>;
    /**
     * How often buffered logs would be flushed. Default: `3` seconds (int)
     */
    public readonly outputFlushInterval!: pulumi.Output<number | undefined>;
    /**
     * The output tags for Cluster Logging (map)
     */
    public readonly outputTags!: pulumi.Output<{[key: string]: any}>;
    /**
     * The splunk config for Cluster Logging. For `kind = splunk`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `syslogConfig` (list maxitems:1)
     */
    public readonly splunkConfig!: pulumi.Output<outputs.ClusterLoggingSplunkConfig | undefined>;
    /**
     * The syslog config for Cluster Logging. For `kind = syslog`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `splunkConfig` (list maxitems:1)
     */
    public readonly syslogConfig!: pulumi.Output<outputs.ClusterLoggingSyslogConfig | undefined>;

    /**
     * Create a ClusterLogging resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterLoggingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterLoggingArgs | ClusterLoggingState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ClusterLoggingState | undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["clusterId"] = state ? state.clusterId : undefined;
            inputs["customTargetConfig"] = state ? state.customTargetConfig : undefined;
            inputs["elasticsearchConfig"] = state ? state.elasticsearchConfig : undefined;
            inputs["fluentdConfig"] = state ? state.fluentdConfig : undefined;
            inputs["kafkaConfig"] = state ? state.kafkaConfig : undefined;
            inputs["kind"] = state ? state.kind : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["namespaceId"] = state ? state.namespaceId : undefined;
            inputs["outputFlushInterval"] = state ? state.outputFlushInterval : undefined;
            inputs["outputTags"] = state ? state.outputTags : undefined;
            inputs["splunkConfig"] = state ? state.splunkConfig : undefined;
            inputs["syslogConfig"] = state ? state.syslogConfig : undefined;
        } else {
            const args = argsOrState as ClusterLoggingArgs | undefined;
            if (!args || args.clusterId === undefined) {
                throw new Error("Missing required property 'clusterId'");
            }
            if (!args || args.kind === undefined) {
                throw new Error("Missing required property 'kind'");
            }
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["clusterId"] = args ? args.clusterId : undefined;
            inputs["customTargetConfig"] = args ? args.customTargetConfig : undefined;
            inputs["elasticsearchConfig"] = args ? args.elasticsearchConfig : undefined;
            inputs["fluentdConfig"] = args ? args.fluentdConfig : undefined;
            inputs["kafkaConfig"] = args ? args.kafkaConfig : undefined;
            inputs["kind"] = args ? args.kind : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["namespaceId"] = args ? args.namespaceId : undefined;
            inputs["outputFlushInterval"] = args ? args.outputFlushInterval : undefined;
            inputs["outputTags"] = args ? args.outputTags : undefined;
            inputs["splunkConfig"] = args ? args.splunkConfig : undefined;
            inputs["syslogConfig"] = args ? args.syslogConfig : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ClusterLogging.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterLogging resources.
 */
export interface ClusterLoggingState {
    /**
     * Annotations for Cluster Logging object (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster id to configure logging (string)
     */
    readonly clusterId?: pulumi.Input<string>;
    /**
     * The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    readonly customTargetConfig?: pulumi.Input<inputs.ClusterLoggingCustomTargetConfig>;
    /**
     * The elasticsearch config for Cluster Logging. For `kind = elasticsearch`. Conflicts with `customTargetConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    readonly elasticsearchConfig?: pulumi.Input<inputs.ClusterLoggingElasticsearchConfig>;
    /**
     * The fluentd config for Cluster Logging. For `kind = fluentd`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    readonly fluentdConfig?: pulumi.Input<inputs.ClusterLoggingFluentdConfig>;
    /**
     * The kafka config for Cluster Logging. For `kind = kafka`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    readonly kafkaConfig?: pulumi.Input<inputs.ClusterLoggingKafkaConfig>;
    /**
     * The kind of the Cluster Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
     */
    readonly kind?: pulumi.Input<string>;
    /**
     * Labels for Cluster Logging object (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the cluster logging config (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The namespace id from cluster logging (string)
     */
    readonly namespaceId?: pulumi.Input<string>;
    /**
     * How often buffered logs would be flushed. Default: `3` seconds (int)
     */
    readonly outputFlushInterval?: pulumi.Input<number>;
    /**
     * The output tags for Cluster Logging (map)
     */
    readonly outputTags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The splunk config for Cluster Logging. For `kind = splunk`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `syslogConfig` (list maxitems:1)
     */
    readonly splunkConfig?: pulumi.Input<inputs.ClusterLoggingSplunkConfig>;
    /**
     * The syslog config for Cluster Logging. For `kind = syslog`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `splunkConfig` (list maxitems:1)
     */
    readonly syslogConfig?: pulumi.Input<inputs.ClusterLoggingSyslogConfig>;
}

/**
 * The set of arguments for constructing a ClusterLogging resource.
 */
export interface ClusterLoggingArgs {
    /**
     * Annotations for Cluster Logging object (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * The cluster id to configure logging (string)
     */
    readonly clusterId: pulumi.Input<string>;
    /**
     * The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    readonly customTargetConfig?: pulumi.Input<inputs.ClusterLoggingCustomTargetConfig>;
    /**
     * The elasticsearch config for Cluster Logging. For `kind = elasticsearch`. Conflicts with `customTargetConfig`, `fluentdConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    readonly elasticsearchConfig?: pulumi.Input<inputs.ClusterLoggingElasticsearchConfig>;
    /**
     * The fluentd config for Cluster Logging. For `kind = fluentd`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `kafkaConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    readonly fluentdConfig?: pulumi.Input<inputs.ClusterLoggingFluentdConfig>;
    /**
     * The kafka config for Cluster Logging. For `kind = kafka`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `splunkConfig` and `syslogConfig` (list maxitems:1)
     */
    readonly kafkaConfig?: pulumi.Input<inputs.ClusterLoggingKafkaConfig>;
    /**
     * The kind of the Cluster Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
     */
    readonly kind: pulumi.Input<string>;
    /**
     * Labels for Cluster Logging object (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the cluster logging config (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The namespace id from cluster logging (string)
     */
    readonly namespaceId?: pulumi.Input<string>;
    /**
     * How often buffered logs would be flushed. Default: `3` seconds (int)
     */
    readonly outputFlushInterval?: pulumi.Input<number>;
    /**
     * The output tags for Cluster Logging (map)
     */
    readonly outputTags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The splunk config for Cluster Logging. For `kind = splunk`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `syslogConfig` (list maxitems:1)
     */
    readonly splunkConfig?: pulumi.Input<inputs.ClusterLoggingSplunkConfig>;
    /**
     * The syslog config for Cluster Logging. For `kind = syslog`. Conflicts with `customTargetConfig`, `elasticsearchConfig`, `fluentdConfig`, `kafkaConfig`, and `splunkConfig` (list maxitems:1)
     */
    readonly syslogConfig?: pulumi.Input<inputs.ClusterLoggingSyslogConfig>;
}
