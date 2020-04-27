// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class PodSecurityPolicyTemplate extends pulumi.CustomResource {
    /**
     * Get an existing PodSecurityPolicyTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PodSecurityPolicyTemplateState, opts?: pulumi.CustomResourceOptions): PodSecurityPolicyTemplate {
        return new PodSecurityPolicyTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'rancher2:index/podSecurityPolicyTemplate:PodSecurityPolicyTemplate';

    /**
     * Returns true if the given object is an instance of PodSecurityPolicyTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PodSecurityPolicyTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PodSecurityPolicyTemplate.__pulumiType;
    }

    /**
     * = (Optional)
     */
    public readonly allowPrivilegeEscalation!: pulumi.Output<boolean>;
    /**
     * (list)
     */
    public readonly allowedCapabilities!: pulumi.Output<string[] | undefined>;
    /**
     * (list)
     */
    public readonly allowedCsiDrivers!: pulumi.Output<outputs.PodSecurityPolicyTemplateAllowedCsiDriver[] | undefined>;
    /**
     * (list)
     */
    public readonly allowedFlexVolumes!: pulumi.Output<outputs.PodSecurityPolicyTemplateAllowedFlexVolume[] | undefined>;
    /**
     * (list)
     */
    public readonly allowedHostPaths!: pulumi.Output<outputs.PodSecurityPolicyTemplateAllowedHostPath[] | undefined>;
    /**
     * (list)
     */
    public readonly allowedProcMountTypes!: pulumi.Output<string[] | undefined>;
    /**
     * (list)
     */
    public readonly allowedUnsafeSysctls!: pulumi.Output<string[] | undefined>;
    /**
     * Annotations for PodSecurityPolicyTemplate object (map)
     */
    public readonly annotations!: pulumi.Output<{[key: string]: any}>;
    /**
     * (list)
     */
    public readonly defaultAddCapabilities!: pulumi.Output<string[] | undefined>;
    /**
     * (list)
     */
    public readonly defaultAllowPrivilegeEscalation!: pulumi.Output<boolean | undefined>;
    /**
     * The PodSecurityPolicyTemplate description (string)
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * (list)
     */
    public readonly forbiddenSysctls!: pulumi.Output<string[] | undefined>;
    /**
     * (list maxitems:1)
     */
    public readonly fsGroup!: pulumi.Output<outputs.PodSecurityPolicyTemplateFsGroup>;
    /**
     * (bool)
     */
    public readonly hostIpc!: pulumi.Output<boolean>;
    /**
     * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
     */
    public readonly hostNetwork!: pulumi.Output<boolean>;
    /**
     * (bool)
     */
    public readonly hostPid!: pulumi.Output<boolean>;
    /**
     * (list)
     */
    public readonly hostPorts!: pulumi.Output<outputs.PodSecurityPolicyTemplateHostPort[]>;
    /**
     * Labels for PodSecurityPolicyTemplate object (map)
     */
    public readonly labels!: pulumi.Output<{[key: string]: any}>;
    /**
     * The name of the PodSecurityPolicyTemplate (string)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * (bool)
     */
    public readonly privileged!: pulumi.Output<boolean>;
    /**
     * (bool)
     */
    public readonly readOnlyRootFilesystem!: pulumi.Output<boolean>;
    /**
     * (list)
     */
    public readonly requiredDropCapabilities!: pulumi.Output<string[] | undefined>;
    /**
     * (list maxitems:1)
     */
    public readonly runAsGroup!: pulumi.Output<outputs.PodSecurityPolicyTemplateRunAsGroup | undefined>;
    /**
     * (list maxitems:1)
     */
    public readonly runAsUser!: pulumi.Output<outputs.PodSecurityPolicyTemplateRunAsUser>;
    /**
     * (list maxitems:1)
     */
    public readonly runtimeClass!: pulumi.Output<outputs.PodSecurityPolicyTemplateRuntimeClass | undefined>;
    /**
     * (list maxitems:1)
     */
    public readonly seLinux!: pulumi.Output<outputs.PodSecurityPolicyTemplateSeLinux>;
    /**
     * (list maxitems:1)
     */
    public readonly supplementalGroup!: pulumi.Output<outputs.PodSecurityPolicyTemplateSupplementalGroup>;
    /**
     * (list)
     */
    public readonly volumes!: pulumi.Output<string[]>;

    /**
     * Create a PodSecurityPolicyTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: PodSecurityPolicyTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PodSecurityPolicyTemplateArgs | PodSecurityPolicyTemplateState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as PodSecurityPolicyTemplateState | undefined;
            inputs["allowPrivilegeEscalation"] = state ? state.allowPrivilegeEscalation : undefined;
            inputs["allowedCapabilities"] = state ? state.allowedCapabilities : undefined;
            inputs["allowedCsiDrivers"] = state ? state.allowedCsiDrivers : undefined;
            inputs["allowedFlexVolumes"] = state ? state.allowedFlexVolumes : undefined;
            inputs["allowedHostPaths"] = state ? state.allowedHostPaths : undefined;
            inputs["allowedProcMountTypes"] = state ? state.allowedProcMountTypes : undefined;
            inputs["allowedUnsafeSysctls"] = state ? state.allowedUnsafeSysctls : undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["defaultAddCapabilities"] = state ? state.defaultAddCapabilities : undefined;
            inputs["defaultAllowPrivilegeEscalation"] = state ? state.defaultAllowPrivilegeEscalation : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["forbiddenSysctls"] = state ? state.forbiddenSysctls : undefined;
            inputs["fsGroup"] = state ? state.fsGroup : undefined;
            inputs["hostIpc"] = state ? state.hostIpc : undefined;
            inputs["hostNetwork"] = state ? state.hostNetwork : undefined;
            inputs["hostPid"] = state ? state.hostPid : undefined;
            inputs["hostPorts"] = state ? state.hostPorts : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["privileged"] = state ? state.privileged : undefined;
            inputs["readOnlyRootFilesystem"] = state ? state.readOnlyRootFilesystem : undefined;
            inputs["requiredDropCapabilities"] = state ? state.requiredDropCapabilities : undefined;
            inputs["runAsGroup"] = state ? state.runAsGroup : undefined;
            inputs["runAsUser"] = state ? state.runAsUser : undefined;
            inputs["runtimeClass"] = state ? state.runtimeClass : undefined;
            inputs["seLinux"] = state ? state.seLinux : undefined;
            inputs["supplementalGroup"] = state ? state.supplementalGroup : undefined;
            inputs["volumes"] = state ? state.volumes : undefined;
        } else {
            const args = argsOrState as PodSecurityPolicyTemplateArgs | undefined;
            inputs["allowPrivilegeEscalation"] = args ? args.allowPrivilegeEscalation : undefined;
            inputs["allowedCapabilities"] = args ? args.allowedCapabilities : undefined;
            inputs["allowedCsiDrivers"] = args ? args.allowedCsiDrivers : undefined;
            inputs["allowedFlexVolumes"] = args ? args.allowedFlexVolumes : undefined;
            inputs["allowedHostPaths"] = args ? args.allowedHostPaths : undefined;
            inputs["allowedProcMountTypes"] = args ? args.allowedProcMountTypes : undefined;
            inputs["allowedUnsafeSysctls"] = args ? args.allowedUnsafeSysctls : undefined;
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["defaultAddCapabilities"] = args ? args.defaultAddCapabilities : undefined;
            inputs["defaultAllowPrivilegeEscalation"] = args ? args.defaultAllowPrivilegeEscalation : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["forbiddenSysctls"] = args ? args.forbiddenSysctls : undefined;
            inputs["fsGroup"] = args ? args.fsGroup : undefined;
            inputs["hostIpc"] = args ? args.hostIpc : undefined;
            inputs["hostNetwork"] = args ? args.hostNetwork : undefined;
            inputs["hostPid"] = args ? args.hostPid : undefined;
            inputs["hostPorts"] = args ? args.hostPorts : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["privileged"] = args ? args.privileged : undefined;
            inputs["readOnlyRootFilesystem"] = args ? args.readOnlyRootFilesystem : undefined;
            inputs["requiredDropCapabilities"] = args ? args.requiredDropCapabilities : undefined;
            inputs["runAsGroup"] = args ? args.runAsGroup : undefined;
            inputs["runAsUser"] = args ? args.runAsUser : undefined;
            inputs["runtimeClass"] = args ? args.runtimeClass : undefined;
            inputs["seLinux"] = args ? args.seLinux : undefined;
            inputs["supplementalGroup"] = args ? args.supplementalGroup : undefined;
            inputs["volumes"] = args ? args.volumes : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(PodSecurityPolicyTemplate.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PodSecurityPolicyTemplate resources.
 */
export interface PodSecurityPolicyTemplateState {
    /**
     * = (Optional)
     */
    readonly allowPrivilegeEscalation?: pulumi.Input<boolean>;
    /**
     * (list)
     */
    readonly allowedCapabilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list)
     */
    readonly allowedCsiDrivers?: pulumi.Input<pulumi.Input<inputs.PodSecurityPolicyTemplateAllowedCsiDriver>[]>;
    /**
     * (list)
     */
    readonly allowedFlexVolumes?: pulumi.Input<pulumi.Input<inputs.PodSecurityPolicyTemplateAllowedFlexVolume>[]>;
    /**
     * (list)
     */
    readonly allowedHostPaths?: pulumi.Input<pulumi.Input<inputs.PodSecurityPolicyTemplateAllowedHostPath>[]>;
    /**
     * (list)
     */
    readonly allowedProcMountTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list)
     */
    readonly allowedUnsafeSysctls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Annotations for PodSecurityPolicyTemplate object (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * (list)
     */
    readonly defaultAddCapabilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list)
     */
    readonly defaultAllowPrivilegeEscalation?: pulumi.Input<boolean>;
    /**
     * The PodSecurityPolicyTemplate description (string)
     */
    readonly description?: pulumi.Input<string>;
    /**
     * (list)
     */
    readonly forbiddenSysctls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list maxitems:1)
     */
    readonly fsGroup?: pulumi.Input<inputs.PodSecurityPolicyTemplateFsGroup>;
    /**
     * (bool)
     */
    readonly hostIpc?: pulumi.Input<boolean>;
    /**
     * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
     */
    readonly hostNetwork?: pulumi.Input<boolean>;
    /**
     * (bool)
     */
    readonly hostPid?: pulumi.Input<boolean>;
    /**
     * (list)
     */
    readonly hostPorts?: pulumi.Input<pulumi.Input<inputs.PodSecurityPolicyTemplateHostPort>[]>;
    /**
     * Labels for PodSecurityPolicyTemplate object (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the PodSecurityPolicyTemplate (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * (bool)
     */
    readonly privileged?: pulumi.Input<boolean>;
    /**
     * (bool)
     */
    readonly readOnlyRootFilesystem?: pulumi.Input<boolean>;
    /**
     * (list)
     */
    readonly requiredDropCapabilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list maxitems:1)
     */
    readonly runAsGroup?: pulumi.Input<inputs.PodSecurityPolicyTemplateRunAsGroup>;
    /**
     * (list maxitems:1)
     */
    readonly runAsUser?: pulumi.Input<inputs.PodSecurityPolicyTemplateRunAsUser>;
    /**
     * (list maxitems:1)
     */
    readonly runtimeClass?: pulumi.Input<inputs.PodSecurityPolicyTemplateRuntimeClass>;
    /**
     * (list maxitems:1)
     */
    readonly seLinux?: pulumi.Input<inputs.PodSecurityPolicyTemplateSeLinux>;
    /**
     * (list maxitems:1)
     */
    readonly supplementalGroup?: pulumi.Input<inputs.PodSecurityPolicyTemplateSupplementalGroup>;
    /**
     * (list)
     */
    readonly volumes?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a PodSecurityPolicyTemplate resource.
 */
export interface PodSecurityPolicyTemplateArgs {
    /**
     * = (Optional)
     */
    readonly allowPrivilegeEscalation?: pulumi.Input<boolean>;
    /**
     * (list)
     */
    readonly allowedCapabilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list)
     */
    readonly allowedCsiDrivers?: pulumi.Input<pulumi.Input<inputs.PodSecurityPolicyTemplateAllowedCsiDriver>[]>;
    /**
     * (list)
     */
    readonly allowedFlexVolumes?: pulumi.Input<pulumi.Input<inputs.PodSecurityPolicyTemplateAllowedFlexVolume>[]>;
    /**
     * (list)
     */
    readonly allowedHostPaths?: pulumi.Input<pulumi.Input<inputs.PodSecurityPolicyTemplateAllowedHostPath>[]>;
    /**
     * (list)
     */
    readonly allowedProcMountTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list)
     */
    readonly allowedUnsafeSysctls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Annotations for PodSecurityPolicyTemplate object (map)
     */
    readonly annotations?: pulumi.Input<{[key: string]: any}>;
    /**
     * (list)
     */
    readonly defaultAddCapabilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list)
     */
    readonly defaultAllowPrivilegeEscalation?: pulumi.Input<boolean>;
    /**
     * The PodSecurityPolicyTemplate description (string)
     */
    readonly description?: pulumi.Input<string>;
    /**
     * (list)
     */
    readonly forbiddenSysctls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list maxitems:1)
     */
    readonly fsGroup?: pulumi.Input<inputs.PodSecurityPolicyTemplateFsGroup>;
    /**
     * (bool)
     */
    readonly hostIpc?: pulumi.Input<boolean>;
    /**
     * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
     */
    readonly hostNetwork?: pulumi.Input<boolean>;
    /**
     * (bool)
     */
    readonly hostPid?: pulumi.Input<boolean>;
    /**
     * (list)
     */
    readonly hostPorts?: pulumi.Input<pulumi.Input<inputs.PodSecurityPolicyTemplateHostPort>[]>;
    /**
     * Labels for PodSecurityPolicyTemplate object (map)
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The name of the PodSecurityPolicyTemplate (string)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * (bool)
     */
    readonly privileged?: pulumi.Input<boolean>;
    /**
     * (bool)
     */
    readonly readOnlyRootFilesystem?: pulumi.Input<boolean>;
    /**
     * (list)
     */
    readonly requiredDropCapabilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list maxitems:1)
     */
    readonly runAsGroup?: pulumi.Input<inputs.PodSecurityPolicyTemplateRunAsGroup>;
    /**
     * (list maxitems:1)
     */
    readonly runAsUser?: pulumi.Input<inputs.PodSecurityPolicyTemplateRunAsUser>;
    /**
     * (list maxitems:1)
     */
    readonly runtimeClass?: pulumi.Input<inputs.PodSecurityPolicyTemplateRuntimeClass>;
    /**
     * (list maxitems:1)
     */
    readonly seLinux?: pulumi.Input<inputs.PodSecurityPolicyTemplateSeLinux>;
    /**
     * (list maxitems:1)
     */
    readonly supplementalGroup?: pulumi.Input<inputs.PodSecurityPolicyTemplateSupplementalGroup>;
    /**
     * (list)
     */
    readonly volumes?: pulumi.Input<pulumi.Input<string>[]>;
}
