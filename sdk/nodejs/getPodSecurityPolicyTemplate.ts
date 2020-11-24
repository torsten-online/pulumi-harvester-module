// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 PodSecurityPolicyTemplate.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo = pulumi.output(rancher2.getPodSecurityPolicyTemplate({
 *     name: "foo",
 * }, { async: true }));
 * ```
 */
export function getPodSecurityPolicyTemplate(args: GetPodSecurityPolicyTemplateArgs, opts?: pulumi.InvokeOptions): Promise<GetPodSecurityPolicyTemplateResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getPodSecurityPolicyTemplate:getPodSecurityPolicyTemplate", {
        "allowPrivilegeEscalation": args.allowPrivilegeEscalation,
        "allowedCapabilities": args.allowedCapabilities,
        "allowedCsiDrivers": args.allowedCsiDrivers,
        "allowedFlexVolumes": args.allowedFlexVolumes,
        "allowedHostPaths": args.allowedHostPaths,
        "allowedProcMountTypes": args.allowedProcMountTypes,
        "allowedUnsafeSysctls": args.allowedUnsafeSysctls,
        "annotations": args.annotations,
        "defaultAddCapabilities": args.defaultAddCapabilities,
        "defaultAllowPrivilegeEscalation": args.defaultAllowPrivilegeEscalation,
        "description": args.description,
        "forbiddenSysctls": args.forbiddenSysctls,
        "fsGroup": args.fsGroup,
        "hostIpc": args.hostIpc,
        "hostNetwork": args.hostNetwork,
        "hostPid": args.hostPid,
        "hostPorts": args.hostPorts,
        "labels": args.labels,
        "name": args.name,
        "privileged": args.privileged,
        "readOnlyRootFilesystem": args.readOnlyRootFilesystem,
        "requiredDropCapabilities": args.requiredDropCapabilities,
        "runAsGroup": args.runAsGroup,
        "runAsUser": args.runAsUser,
        "runtimeClass": args.runtimeClass,
        "seLinux": args.seLinux,
        "supplementalGroup": args.supplementalGroup,
        "volumes": args.volumes,
    }, opts);
}

/**
 * A collection of arguments for invoking getPodSecurityPolicyTemplate.
 */
export interface GetPodSecurityPolicyTemplateArgs {
    /**
     * = (Optional)
     */
    readonly allowPrivilegeEscalation?: boolean;
    /**
     * (list)
     */
    readonly allowedCapabilities?: string[];
    /**
     * (list)
     */
    readonly allowedCsiDrivers?: inputs.GetPodSecurityPolicyTemplateAllowedCsiDriver[];
    /**
     * (list)
     */
    readonly allowedFlexVolumes?: inputs.GetPodSecurityPolicyTemplateAllowedFlexVolume[];
    /**
     * (list)
     */
    readonly allowedHostPaths?: inputs.GetPodSecurityPolicyTemplateAllowedHostPath[];
    /**
     * (list)
     */
    readonly allowedProcMountTypes?: string[];
    /**
     * (list)
     */
    readonly allowedUnsafeSysctls?: string[];
    /**
     * Annotations for PodSecurityPolicyTemplate object (map)
     */
    readonly annotations?: {[key: string]: any};
    /**
     * (list)
     */
    readonly defaultAddCapabilities?: string[];
    /**
     * (list)
     */
    readonly defaultAllowPrivilegeEscalation?: boolean;
    /**
     * The PodSecurityPolicyTemplate description (string)
     */
    readonly description?: string;
    /**
     * (list)
     */
    readonly forbiddenSysctls?: string[];
    /**
     * (list maxitems:1)
     */
    readonly fsGroup?: inputs.GetPodSecurityPolicyTemplateFsGroup;
    /**
     * (bool)
     */
    readonly hostIpc?: boolean;
    readonly hostNetwork?: boolean;
    /**
     * (bool)
     */
    readonly hostPid?: boolean;
    /**
     * (list)
     */
    readonly hostPorts?: inputs.GetPodSecurityPolicyTemplateHostPort[];
    /**
     * Labels for PodSecurityPolicyTemplate object (map)
     */
    readonly labels?: {[key: string]: any};
    /**
     * The name of the PodSecurityPolicyTemplate (string)
     */
    readonly name: string;
    /**
     * (bool)
     */
    readonly privileged?: boolean;
    /**
     * (bool)
     */
    readonly readOnlyRootFilesystem?: boolean;
    /**
     * (list)
     */
    readonly requiredDropCapabilities?: string[];
    /**
     * (list maxitems:1)
     */
    readonly runAsGroup?: inputs.GetPodSecurityPolicyTemplateRunAsGroup;
    /**
     * (list maxitems:1)
     */
    readonly runAsUser?: inputs.GetPodSecurityPolicyTemplateRunAsUser;
    /**
     * (list maxitems:1)
     */
    readonly runtimeClass?: inputs.GetPodSecurityPolicyTemplateRuntimeClass;
    /**
     * (list maxitems:1)
     */
    readonly seLinux?: inputs.GetPodSecurityPolicyTemplateSeLinux;
    /**
     * (list maxitems:1)
     */
    readonly supplementalGroup?: inputs.GetPodSecurityPolicyTemplateSupplementalGroup;
    /**
     * (list)
     */
    readonly volumes?: string[];
}

/**
 * A collection of values returned by getPodSecurityPolicyTemplate.
 */
export interface GetPodSecurityPolicyTemplateResult {
    readonly allowPrivilegeEscalation: boolean;
    readonly allowedCapabilities?: string[];
    readonly allowedCsiDrivers?: outputs.GetPodSecurityPolicyTemplateAllowedCsiDriver[];
    readonly allowedFlexVolumes?: outputs.GetPodSecurityPolicyTemplateAllowedFlexVolume[];
    readonly allowedHostPaths?: outputs.GetPodSecurityPolicyTemplateAllowedHostPath[];
    readonly allowedProcMountTypes?: string[];
    readonly allowedUnsafeSysctls?: string[];
    readonly annotations: {[key: string]: any};
    readonly defaultAddCapabilities?: string[];
    readonly defaultAllowPrivilegeEscalation?: boolean;
    readonly description: string;
    readonly forbiddenSysctls?: string[];
    readonly fsGroup: outputs.GetPodSecurityPolicyTemplateFsGroup;
    readonly hostIpc: boolean;
    readonly hostNetwork: boolean;
    readonly hostPid: boolean;
    readonly hostPorts: outputs.GetPodSecurityPolicyTemplateHostPort[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly labels: {[key: string]: any};
    readonly name: string;
    readonly privileged: boolean;
    readonly readOnlyRootFilesystem: boolean;
    readonly requiredDropCapabilities?: string[];
    readonly runAsGroup?: outputs.GetPodSecurityPolicyTemplateRunAsGroup;
    readonly runAsUser: outputs.GetPodSecurityPolicyTemplateRunAsUser;
    readonly runtimeClass?: outputs.GetPodSecurityPolicyTemplateRuntimeClass;
    readonly seLinux: outputs.GetPodSecurityPolicyTemplateSeLinux;
    readonly supplementalGroup: outputs.GetPodSecurityPolicyTemplateSupplementalGroup;
    readonly volumes: string[];
}
