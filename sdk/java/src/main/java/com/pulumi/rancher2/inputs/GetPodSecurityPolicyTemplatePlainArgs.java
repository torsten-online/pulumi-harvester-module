// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateAllowedCsiDriver;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateAllowedFlexVolume;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateAllowedHostPath;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateFsGroup;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateHostPort;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateRunAsGroup;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateRunAsUser;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateRuntimeClass;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateSeLinux;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateSupplementalGroup;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPodSecurityPolicyTemplatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPodSecurityPolicyTemplatePlainArgs Empty = new GetPodSecurityPolicyTemplatePlainArgs();

    /**
     * = (Optional)
     * 
     */
    @Import(name="allowPrivilegeEscalation")
    private @Nullable Boolean allowPrivilegeEscalation;

    /**
     * @return = (Optional)
     * 
     */
    public Optional<Boolean> allowPrivilegeEscalation() {
        return Optional.ofNullable(this.allowPrivilegeEscalation);
    }

    /**
     * (list)
     * 
     */
    @Import(name="allowedCapabilities")
    private @Nullable List<String> allowedCapabilities;

    /**
     * @return (list)
     * 
     */
    public Optional<List<String>> allowedCapabilities() {
        return Optional.ofNullable(this.allowedCapabilities);
    }

    /**
     * (list)
     * 
     */
    @Import(name="allowedCsiDrivers")
    private @Nullable List<GetPodSecurityPolicyTemplateAllowedCsiDriver> allowedCsiDrivers;

    /**
     * @return (list)
     * 
     */
    public Optional<List<GetPodSecurityPolicyTemplateAllowedCsiDriver>> allowedCsiDrivers() {
        return Optional.ofNullable(this.allowedCsiDrivers);
    }

    /**
     * (list)
     * 
     */
    @Import(name="allowedFlexVolumes")
    private @Nullable List<GetPodSecurityPolicyTemplateAllowedFlexVolume> allowedFlexVolumes;

    /**
     * @return (list)
     * 
     */
    public Optional<List<GetPodSecurityPolicyTemplateAllowedFlexVolume>> allowedFlexVolumes() {
        return Optional.ofNullable(this.allowedFlexVolumes);
    }

    /**
     * (list)
     * 
     */
    @Import(name="allowedHostPaths")
    private @Nullable List<GetPodSecurityPolicyTemplateAllowedHostPath> allowedHostPaths;

    /**
     * @return (list)
     * 
     */
    public Optional<List<GetPodSecurityPolicyTemplateAllowedHostPath>> allowedHostPaths() {
        return Optional.ofNullable(this.allowedHostPaths);
    }

    /**
     * (list)
     * 
     */
    @Import(name="allowedProcMountTypes")
    private @Nullable List<String> allowedProcMountTypes;

    /**
     * @return (list)
     * 
     */
    public Optional<List<String>> allowedProcMountTypes() {
        return Optional.ofNullable(this.allowedProcMountTypes);
    }

    /**
     * (list)
     * 
     */
    @Import(name="allowedUnsafeSysctls")
    private @Nullable List<String> allowedUnsafeSysctls;

    /**
     * @return (list)
     * 
     */
    public Optional<List<String>> allowedUnsafeSysctls() {
        return Optional.ofNullable(this.allowedUnsafeSysctls);
    }

    /**
     * Annotations for PodSecurityPolicyTemplate object (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Map<String,Object> annotations;

    /**
     * @return Annotations for PodSecurityPolicyTemplate object (map)
     * 
     */
    public Optional<Map<String,Object>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * (list)
     * 
     */
    @Import(name="defaultAddCapabilities")
    private @Nullable List<String> defaultAddCapabilities;

    /**
     * @return (list)
     * 
     */
    public Optional<List<String>> defaultAddCapabilities() {
        return Optional.ofNullable(this.defaultAddCapabilities);
    }

    /**
     * (list)
     * 
     */
    @Import(name="defaultAllowPrivilegeEscalation")
    private @Nullable Boolean defaultAllowPrivilegeEscalation;

    /**
     * @return (list)
     * 
     */
    public Optional<Boolean> defaultAllowPrivilegeEscalation() {
        return Optional.ofNullable(this.defaultAllowPrivilegeEscalation);
    }

    /**
     * The PodSecurityPolicyTemplate description (string)
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return The PodSecurityPolicyTemplate description (string)
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (list)
     * 
     */
    @Import(name="forbiddenSysctls")
    private @Nullable List<String> forbiddenSysctls;

    /**
     * @return (list)
     * 
     */
    public Optional<List<String>> forbiddenSysctls() {
        return Optional.ofNullable(this.forbiddenSysctls);
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="fsGroup")
    private @Nullable GetPodSecurityPolicyTemplateFsGroup fsGroup;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<GetPodSecurityPolicyTemplateFsGroup> fsGroup() {
        return Optional.ofNullable(this.fsGroup);
    }

    /**
     * (bool)
     * 
     */
    @Import(name="hostIpc")
    private @Nullable Boolean hostIpc;

    /**
     * @return (bool)
     * 
     */
    public Optional<Boolean> hostIpc() {
        return Optional.ofNullable(this.hostIpc);
    }

    @Import(name="hostNetwork")
    private @Nullable Boolean hostNetwork;

    public Optional<Boolean> hostNetwork() {
        return Optional.ofNullable(this.hostNetwork);
    }

    /**
     * (bool)
     * 
     */
    @Import(name="hostPid")
    private @Nullable Boolean hostPid;

    /**
     * @return (bool)
     * 
     */
    public Optional<Boolean> hostPid() {
        return Optional.ofNullable(this.hostPid);
    }

    /**
     * (list)
     * 
     */
    @Import(name="hostPorts")
    private @Nullable List<GetPodSecurityPolicyTemplateHostPort> hostPorts;

    /**
     * @return (list)
     * 
     */
    public Optional<List<GetPodSecurityPolicyTemplateHostPort>> hostPorts() {
        return Optional.ofNullable(this.hostPorts);
    }

    /**
     * Labels for PodSecurityPolicyTemplate object (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Map<String,Object> labels;

    /**
     * @return Labels for PodSecurityPolicyTemplate object (map)
     * 
     */
    public Optional<Map<String,Object>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the PodSecurityPolicyTemplate (string)
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the PodSecurityPolicyTemplate (string)
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * (bool)
     * 
     */
    @Import(name="privileged")
    private @Nullable Boolean privileged;

    /**
     * @return (bool)
     * 
     */
    public Optional<Boolean> privileged() {
        return Optional.ofNullable(this.privileged);
    }

    /**
     * (bool)
     * 
     */
    @Import(name="readOnlyRootFilesystem")
    private @Nullable Boolean readOnlyRootFilesystem;

    /**
     * @return (bool)
     * 
     */
    public Optional<Boolean> readOnlyRootFilesystem() {
        return Optional.ofNullable(this.readOnlyRootFilesystem);
    }

    /**
     * (list)
     * 
     */
    @Import(name="requiredDropCapabilities")
    private @Nullable List<String> requiredDropCapabilities;

    /**
     * @return (list)
     * 
     */
    public Optional<List<String>> requiredDropCapabilities() {
        return Optional.ofNullable(this.requiredDropCapabilities);
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="runAsGroup")
    private @Nullable GetPodSecurityPolicyTemplateRunAsGroup runAsGroup;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<GetPodSecurityPolicyTemplateRunAsGroup> runAsGroup() {
        return Optional.ofNullable(this.runAsGroup);
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="runAsUser")
    private @Nullable GetPodSecurityPolicyTemplateRunAsUser runAsUser;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<GetPodSecurityPolicyTemplateRunAsUser> runAsUser() {
        return Optional.ofNullable(this.runAsUser);
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="runtimeClass")
    private @Nullable GetPodSecurityPolicyTemplateRuntimeClass runtimeClass;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<GetPodSecurityPolicyTemplateRuntimeClass> runtimeClass() {
        return Optional.ofNullable(this.runtimeClass);
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="seLinux")
    private @Nullable GetPodSecurityPolicyTemplateSeLinux seLinux;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<GetPodSecurityPolicyTemplateSeLinux> seLinux() {
        return Optional.ofNullable(this.seLinux);
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="supplementalGroup")
    private @Nullable GetPodSecurityPolicyTemplateSupplementalGroup supplementalGroup;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<GetPodSecurityPolicyTemplateSupplementalGroup> supplementalGroup() {
        return Optional.ofNullable(this.supplementalGroup);
    }

    /**
     * (list)
     * 
     */
    @Import(name="volumes")
    private @Nullable List<String> volumes;

    /**
     * @return (list)
     * 
     */
    public Optional<List<String>> volumes() {
        return Optional.ofNullable(this.volumes);
    }

    private GetPodSecurityPolicyTemplatePlainArgs() {}

    private GetPodSecurityPolicyTemplatePlainArgs(GetPodSecurityPolicyTemplatePlainArgs $) {
        this.allowPrivilegeEscalation = $.allowPrivilegeEscalation;
        this.allowedCapabilities = $.allowedCapabilities;
        this.allowedCsiDrivers = $.allowedCsiDrivers;
        this.allowedFlexVolumes = $.allowedFlexVolumes;
        this.allowedHostPaths = $.allowedHostPaths;
        this.allowedProcMountTypes = $.allowedProcMountTypes;
        this.allowedUnsafeSysctls = $.allowedUnsafeSysctls;
        this.annotations = $.annotations;
        this.defaultAddCapabilities = $.defaultAddCapabilities;
        this.defaultAllowPrivilegeEscalation = $.defaultAllowPrivilegeEscalation;
        this.description = $.description;
        this.forbiddenSysctls = $.forbiddenSysctls;
        this.fsGroup = $.fsGroup;
        this.hostIpc = $.hostIpc;
        this.hostNetwork = $.hostNetwork;
        this.hostPid = $.hostPid;
        this.hostPorts = $.hostPorts;
        this.labels = $.labels;
        this.name = $.name;
        this.privileged = $.privileged;
        this.readOnlyRootFilesystem = $.readOnlyRootFilesystem;
        this.requiredDropCapabilities = $.requiredDropCapabilities;
        this.runAsGroup = $.runAsGroup;
        this.runAsUser = $.runAsUser;
        this.runtimeClass = $.runtimeClass;
        this.seLinux = $.seLinux;
        this.supplementalGroup = $.supplementalGroup;
        this.volumes = $.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPodSecurityPolicyTemplatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPodSecurityPolicyTemplatePlainArgs $;

        public Builder() {
            $ = new GetPodSecurityPolicyTemplatePlainArgs();
        }

        public Builder(GetPodSecurityPolicyTemplatePlainArgs defaults) {
            $ = new GetPodSecurityPolicyTemplatePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowPrivilegeEscalation = (Optional)
         * 
         * @return builder
         * 
         */
        public Builder allowPrivilegeEscalation(@Nullable Boolean allowPrivilegeEscalation) {
            $.allowPrivilegeEscalation = allowPrivilegeEscalation;
            return this;
        }

        /**
         * @param allowedCapabilities (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedCapabilities(@Nullable List<String> allowedCapabilities) {
            $.allowedCapabilities = allowedCapabilities;
            return this;
        }

        /**
         * @param allowedCapabilities (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedCapabilities(String... allowedCapabilities) {
            return allowedCapabilities(List.of(allowedCapabilities));
        }

        /**
         * @param allowedCsiDrivers (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedCsiDrivers(@Nullable List<GetPodSecurityPolicyTemplateAllowedCsiDriver> allowedCsiDrivers) {
            $.allowedCsiDrivers = allowedCsiDrivers;
            return this;
        }

        /**
         * @param allowedCsiDrivers (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedCsiDrivers(GetPodSecurityPolicyTemplateAllowedCsiDriver... allowedCsiDrivers) {
            return allowedCsiDrivers(List.of(allowedCsiDrivers));
        }

        /**
         * @param allowedFlexVolumes (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedFlexVolumes(@Nullable List<GetPodSecurityPolicyTemplateAllowedFlexVolume> allowedFlexVolumes) {
            $.allowedFlexVolumes = allowedFlexVolumes;
            return this;
        }

        /**
         * @param allowedFlexVolumes (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedFlexVolumes(GetPodSecurityPolicyTemplateAllowedFlexVolume... allowedFlexVolumes) {
            return allowedFlexVolumes(List.of(allowedFlexVolumes));
        }

        /**
         * @param allowedHostPaths (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedHostPaths(@Nullable List<GetPodSecurityPolicyTemplateAllowedHostPath> allowedHostPaths) {
            $.allowedHostPaths = allowedHostPaths;
            return this;
        }

        /**
         * @param allowedHostPaths (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedHostPaths(GetPodSecurityPolicyTemplateAllowedHostPath... allowedHostPaths) {
            return allowedHostPaths(List.of(allowedHostPaths));
        }

        /**
         * @param allowedProcMountTypes (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedProcMountTypes(@Nullable List<String> allowedProcMountTypes) {
            $.allowedProcMountTypes = allowedProcMountTypes;
            return this;
        }

        /**
         * @param allowedProcMountTypes (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedProcMountTypes(String... allowedProcMountTypes) {
            return allowedProcMountTypes(List.of(allowedProcMountTypes));
        }

        /**
         * @param allowedUnsafeSysctls (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedUnsafeSysctls(@Nullable List<String> allowedUnsafeSysctls) {
            $.allowedUnsafeSysctls = allowedUnsafeSysctls;
            return this;
        }

        /**
         * @param allowedUnsafeSysctls (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedUnsafeSysctls(String... allowedUnsafeSysctls) {
            return allowedUnsafeSysctls(List.of(allowedUnsafeSysctls));
        }

        /**
         * @param annotations Annotations for PodSecurityPolicyTemplate object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Map<String,Object> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param defaultAddCapabilities (list)
         * 
         * @return builder
         * 
         */
        public Builder defaultAddCapabilities(@Nullable List<String> defaultAddCapabilities) {
            $.defaultAddCapabilities = defaultAddCapabilities;
            return this;
        }

        /**
         * @param defaultAddCapabilities (list)
         * 
         * @return builder
         * 
         */
        public Builder defaultAddCapabilities(String... defaultAddCapabilities) {
            return defaultAddCapabilities(List.of(defaultAddCapabilities));
        }

        /**
         * @param defaultAllowPrivilegeEscalation (list)
         * 
         * @return builder
         * 
         */
        public Builder defaultAllowPrivilegeEscalation(@Nullable Boolean defaultAllowPrivilegeEscalation) {
            $.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
            return this;
        }

        /**
         * @param description The PodSecurityPolicyTemplate description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param forbiddenSysctls (list)
         * 
         * @return builder
         * 
         */
        public Builder forbiddenSysctls(@Nullable List<String> forbiddenSysctls) {
            $.forbiddenSysctls = forbiddenSysctls;
            return this;
        }

        /**
         * @param forbiddenSysctls (list)
         * 
         * @return builder
         * 
         */
        public Builder forbiddenSysctls(String... forbiddenSysctls) {
            return forbiddenSysctls(List.of(forbiddenSysctls));
        }

        /**
         * @param fsGroup (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder fsGroup(@Nullable GetPodSecurityPolicyTemplateFsGroup fsGroup) {
            $.fsGroup = fsGroup;
            return this;
        }

        /**
         * @param hostIpc (bool)
         * 
         * @return builder
         * 
         */
        public Builder hostIpc(@Nullable Boolean hostIpc) {
            $.hostIpc = hostIpc;
            return this;
        }

        public Builder hostNetwork(@Nullable Boolean hostNetwork) {
            $.hostNetwork = hostNetwork;
            return this;
        }

        /**
         * @param hostPid (bool)
         * 
         * @return builder
         * 
         */
        public Builder hostPid(@Nullable Boolean hostPid) {
            $.hostPid = hostPid;
            return this;
        }

        /**
         * @param hostPorts (list)
         * 
         * @return builder
         * 
         */
        public Builder hostPorts(@Nullable List<GetPodSecurityPolicyTemplateHostPort> hostPorts) {
            $.hostPorts = hostPorts;
            return this;
        }

        /**
         * @param hostPorts (list)
         * 
         * @return builder
         * 
         */
        public Builder hostPorts(GetPodSecurityPolicyTemplateHostPort... hostPorts) {
            return hostPorts(List.of(hostPorts));
        }

        /**
         * @param labels Labels for PodSecurityPolicyTemplate object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Map<String,Object> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param name The name of the PodSecurityPolicyTemplate (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param privileged (bool)
         * 
         * @return builder
         * 
         */
        public Builder privileged(@Nullable Boolean privileged) {
            $.privileged = privileged;
            return this;
        }

        /**
         * @param readOnlyRootFilesystem (bool)
         * 
         * @return builder
         * 
         */
        public Builder readOnlyRootFilesystem(@Nullable Boolean readOnlyRootFilesystem) {
            $.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }

        /**
         * @param requiredDropCapabilities (list)
         * 
         * @return builder
         * 
         */
        public Builder requiredDropCapabilities(@Nullable List<String> requiredDropCapabilities) {
            $.requiredDropCapabilities = requiredDropCapabilities;
            return this;
        }

        /**
         * @param requiredDropCapabilities (list)
         * 
         * @return builder
         * 
         */
        public Builder requiredDropCapabilities(String... requiredDropCapabilities) {
            return requiredDropCapabilities(List.of(requiredDropCapabilities));
        }

        /**
         * @param runAsGroup (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder runAsGroup(@Nullable GetPodSecurityPolicyTemplateRunAsGroup runAsGroup) {
            $.runAsGroup = runAsGroup;
            return this;
        }

        /**
         * @param runAsUser (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder runAsUser(@Nullable GetPodSecurityPolicyTemplateRunAsUser runAsUser) {
            $.runAsUser = runAsUser;
            return this;
        }

        /**
         * @param runtimeClass (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder runtimeClass(@Nullable GetPodSecurityPolicyTemplateRuntimeClass runtimeClass) {
            $.runtimeClass = runtimeClass;
            return this;
        }

        /**
         * @param seLinux (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder seLinux(@Nullable GetPodSecurityPolicyTemplateSeLinux seLinux) {
            $.seLinux = seLinux;
            return this;
        }

        /**
         * @param supplementalGroup (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder supplementalGroup(@Nullable GetPodSecurityPolicyTemplateSupplementalGroup supplementalGroup) {
            $.supplementalGroup = supplementalGroup;
            return this;
        }

        /**
         * @param volumes (list)
         * 
         * @return builder
         * 
         */
        public Builder volumes(@Nullable List<String> volumes) {
            $.volumes = volumes;
            return this;
        }

        /**
         * @param volumes (list)
         * 
         * @return builder
         * 
         */
        public Builder volumes(String... volumes) {
            return volumes(List.of(volumes));
        }

        public GetPodSecurityPolicyTemplatePlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetPodSecurityPolicyTemplatePlainArgs", "name");
            }
            return $;
        }
    }

}
