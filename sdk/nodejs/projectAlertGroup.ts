// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class ProjectAlertGroup extends pulumi.CustomResource {
    /**
     * Get an existing ProjectAlertGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectAlertGroupState, opts?: pulumi.CustomResourceOptions): ProjectAlertGroup {
        return new ProjectAlertGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/projectAlertGroup:ProjectAlertGroup';

    /**
     * Returns true if the given object is an instance of ProjectAlertGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProjectAlertGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProjectAlertGroup.__pulumiType;
    }

    /**
     * Annotations of the resource
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * Alert group description
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Alert group interval seconds
     */
    public readonly groupIntervalSeconds!: pulumi.Output<number | undefined>;
    /**
     * Alert group wait seconds
     */
    public readonly groupWaitSeconds!: pulumi.Output<number | undefined>;
    /**
     * Labels of the resource
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * Alert group name
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Alert group Project ID
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Alert group recipients
     */
    public readonly recipients!: pulumi.Output<outputs.ProjectAlertGroupRecipient[] | undefined>;
    /**
     * Alert group repeat interval seconds
     */
    public readonly repeatIntervalSeconds!: pulumi.Output<number | undefined>;

    /**
     * Create a ProjectAlertGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectAlertGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectAlertGroupArgs | ProjectAlertGroupState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ProjectAlertGroupState | undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["groupIntervalSeconds"] = state ? state.groupIntervalSeconds : undefined;
            inputs["groupWaitSeconds"] = state ? state.groupWaitSeconds : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["projectId"] = state ? state.projectId : undefined;
            inputs["recipients"] = state ? state.recipients : undefined;
            inputs["repeatIntervalSeconds"] = state ? state.repeatIntervalSeconds : undefined;
        } else {
            const args = argsOrState as ProjectAlertGroupArgs | undefined;
            if (!args || args.projectId === undefined) {
                throw new Error("Missing required property 'projectId'");
            }
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["groupIntervalSeconds"] = args ? args.groupIntervalSeconds : undefined;
            inputs["groupWaitSeconds"] = args ? args.groupWaitSeconds : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["projectId"] = args ? args.projectId : undefined;
            inputs["recipients"] = args ? args.recipients : undefined;
            inputs["repeatIntervalSeconds"] = args ? args.repeatIntervalSeconds : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ProjectAlertGroup.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProjectAlertGroup resources.
 */
export interface ProjectAlertGroupState {
    /**
     * Annotations of the resource
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Alert group description
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Alert group interval seconds
     */
    readonly groupIntervalSeconds?: pulumi.Input<number>;
    /**
     * Alert group wait seconds
     */
    readonly groupWaitSeconds?: pulumi.Input<number>;
    /**
     * Labels of the resource
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Alert group name
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Alert group Project ID
     */
    readonly projectId?: pulumi.Input<string>;
    /**
     * Alert group recipients
     */
    readonly recipients?: pulumi.Input<pulumi.Input<inputs.ProjectAlertGroupRecipient>[]>;
    /**
     * Alert group repeat interval seconds
     */
    readonly repeatIntervalSeconds?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a ProjectAlertGroup resource.
 */
export interface ProjectAlertGroupArgs {
    /**
     * Annotations of the resource
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * Alert group description
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Alert group interval seconds
     */
    readonly groupIntervalSeconds?: pulumi.Input<number>;
    /**
     * Alert group wait seconds
     */
    readonly groupWaitSeconds?: pulumi.Input<number>;
    /**
     * Labels of the resource
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Alert group name
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Alert group Project ID
     */
    readonly projectId: pulumi.Input<string>;
    /**
     * Alert group recipients
     */
    readonly recipients?: pulumi.Input<pulumi.Input<inputs.ProjectAlertGroupRecipient>[]>;
    /**
     * Alert group repeat interval seconds
     */
    readonly repeatIntervalSeconds?: pulumi.Input<number>;
}
