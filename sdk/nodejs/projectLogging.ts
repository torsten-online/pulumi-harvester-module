// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class ProjectLogging extends pulumi.CustomResource {
    /**
     * Get an existing ProjectLogging resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectLoggingState, opts?: pulumi.CustomResourceOptions): ProjectLogging {
        return new ProjectLogging(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/projectLogging:ProjectLogging';

    /**
     * Returns true if the given object is an instance of ProjectLogging.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProjectLogging {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProjectLogging.__pulumiType;
    }

    /**
     * Annotations of the resource
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    public readonly customTargetConfig!: pulumi.Output<outputs.ProjectLoggingCustomTargetConfig | undefined>;
    public readonly elasticsearchConfig!: pulumi.Output<outputs.ProjectLoggingElasticsearchConfig | undefined>;
    /**
     * Optional enable json log parsing
     */
    public readonly enableJsonParsing!: pulumi.Output<boolean | undefined>;
    public readonly fluentdConfig!: pulumi.Output<outputs.ProjectLoggingFluentdConfig | undefined>;
    public readonly kafkaConfig!: pulumi.Output<outputs.ProjectLoggingKafkaConfig | undefined>;
    public readonly kind!: pulumi.Output<string>;
    /**
     * Labels of the resource
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    public readonly name!: pulumi.Output<string>;
    public readonly namespaceId!: pulumi.Output<string | undefined>;
    public readonly outputFlushInterval!: pulumi.Output<number | undefined>;
    public readonly outputTags!: pulumi.Output<{[key: string]: any}>;
    public readonly projectId!: pulumi.Output<string>;
    public readonly splunkConfig!: pulumi.Output<outputs.ProjectLoggingSplunkConfig | undefined>;
    public readonly syslogConfig!: pulumi.Output<outputs.ProjectLoggingSyslogConfig | undefined>;

    /**
     * Create a ProjectLogging resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectLoggingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectLoggingArgs | ProjectLoggingState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ProjectLoggingState | undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["customTargetConfig"] = state ? state.customTargetConfig : undefined;
            inputs["elasticsearchConfig"] = state ? state.elasticsearchConfig : undefined;
            inputs["enableJsonParsing"] = state ? state.enableJsonParsing : undefined;
            inputs["fluentdConfig"] = state ? state.fluentdConfig : undefined;
            inputs["kafkaConfig"] = state ? state.kafkaConfig : undefined;
            inputs["kind"] = state ? state.kind : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["namespaceId"] = state ? state.namespaceId : undefined;
            inputs["outputFlushInterval"] = state ? state.outputFlushInterval : undefined;
            inputs["outputTags"] = state ? state.outputTags : undefined;
            inputs["projectId"] = state ? state.projectId : undefined;
            inputs["splunkConfig"] = state ? state.splunkConfig : undefined;
            inputs["syslogConfig"] = state ? state.syslogConfig : undefined;
        } else {
            const args = argsOrState as ProjectLoggingArgs | undefined;
            if (!args || args.kind === undefined) {
                throw new Error("Missing required property 'kind'");
            }
            if (!args || args.projectId === undefined) {
                throw new Error("Missing required property 'projectId'");
            }
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["customTargetConfig"] = args ? args.customTargetConfig : undefined;
            inputs["elasticsearchConfig"] = args ? args.elasticsearchConfig : undefined;
            inputs["enableJsonParsing"] = args ? args.enableJsonParsing : undefined;
            inputs["fluentdConfig"] = args ? args.fluentdConfig : undefined;
            inputs["kafkaConfig"] = args ? args.kafkaConfig : undefined;
            inputs["kind"] = args ? args.kind : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["namespaceId"] = args ? args.namespaceId : undefined;
            inputs["outputFlushInterval"] = args ? args.outputFlushInterval : undefined;
            inputs["outputTags"] = args ? args.outputTags : undefined;
            inputs["projectId"] = args ? args.projectId : undefined;
            inputs["splunkConfig"] = args ? args.splunkConfig : undefined;
            inputs["syslogConfig"] = args ? args.syslogConfig : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ProjectLogging.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProjectLogging resources.
 */
export interface ProjectLoggingState {
    /**
     * Annotations of the resource
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    readonly customTargetConfig?: pulumi.Input<inputs.ProjectLoggingCustomTargetConfig>;
    readonly elasticsearchConfig?: pulumi.Input<inputs.ProjectLoggingElasticsearchConfig>;
    /**
     * Optional enable json log parsing
     */
    readonly enableJsonParsing?: pulumi.Input<boolean>;
    readonly fluentdConfig?: pulumi.Input<inputs.ProjectLoggingFluentdConfig>;
    readonly kafkaConfig?: pulumi.Input<inputs.ProjectLoggingKafkaConfig>;
    readonly kind?: pulumi.Input<string>;
    /**
     * Labels of the resource
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    readonly name?: pulumi.Input<string>;
    readonly namespaceId?: pulumi.Input<string>;
    readonly outputFlushInterval?: pulumi.Input<number>;
    readonly outputTags?: pulumi.Input<{[key: string]: any}>;
    readonly projectId?: pulumi.Input<string>;
    readonly splunkConfig?: pulumi.Input<inputs.ProjectLoggingSplunkConfig>;
    readonly syslogConfig?: pulumi.Input<inputs.ProjectLoggingSyslogConfig>;
}

/**
 * The set of arguments for constructing a ProjectLogging resource.
 */
export interface ProjectLoggingArgs {
    /**
     * Annotations of the resource
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    readonly customTargetConfig?: pulumi.Input<inputs.ProjectLoggingCustomTargetConfig>;
    readonly elasticsearchConfig?: pulumi.Input<inputs.ProjectLoggingElasticsearchConfig>;
    /**
     * Optional enable json log parsing
     */
    readonly enableJsonParsing?: pulumi.Input<boolean>;
    readonly fluentdConfig?: pulumi.Input<inputs.ProjectLoggingFluentdConfig>;
    readonly kafkaConfig?: pulumi.Input<inputs.ProjectLoggingKafkaConfig>;
    readonly kind: pulumi.Input<string>;
    /**
     * Labels of the resource
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    readonly name?: pulumi.Input<string>;
    readonly namespaceId?: pulumi.Input<string>;
    readonly outputFlushInterval?: pulumi.Input<number>;
    readonly outputTags?: pulumi.Input<{[key: string]: any}>;
    readonly projectId: pulumi.Input<string>;
    readonly splunkConfig?: pulumi.Input<inputs.ProjectLoggingSplunkConfig>;
    readonly syslogConfig?: pulumi.Input<inputs.ProjectLoggingSyslogConfig>;
}
