// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateAllowedCsiDriverArgs;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateAllowedFlexVolumeArgs;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateAllowedHostPathArgs;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateFsGroupArgs;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateHostPortArgs;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateRunAsGroupArgs;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateRunAsUserArgs;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateRuntimeClassArgs;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateSeLinuxArgs;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateSupplementalGroupArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPodSecurityPolicyTemplateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPodSecurityPolicyTemplateArgs Empty = new GetPodSecurityPolicyTemplateArgs();

    /**
     * = (Optional)
     * 
     */
    @Import(name="allowPrivilegeEscalation")
    private @Nullable Output<Boolean> allowPrivilegeEscalation;

    /**
     * @return = (Optional)
     * 
     */
    public Optional<Output<Boolean>> allowPrivilegeEscalation() {
        return Optional.ofNullable(this.allowPrivilegeEscalation);
    }

    /**
     * (list)
     * 
     */
    @Import(name="allowedCapabilities")
    private @Nullable Output<List<String>> allowedCapabilities;

    /**
     * @return (list)
     * 
     */
    public Optional<Output<List<String>>> allowedCapabilities() {
        return Optional.ofNullable(this.allowedCapabilities);
    }

    /**
     * (list)
     * 
     */
    @Import(name="allowedCsiDrivers")
    private @Nullable Output<List<GetPodSecurityPolicyTemplateAllowedCsiDriverArgs>> allowedCsiDrivers;

    /**
     * @return (list)
     * 
     */
    public Optional<Output<List<GetPodSecurityPolicyTemplateAllowedCsiDriverArgs>>> allowedCsiDrivers() {
        return Optional.ofNullable(this.allowedCsiDrivers);
    }

    /**
     * (list)
     * 
     */
    @Import(name="allowedFlexVolumes")
    private @Nullable Output<List<GetPodSecurityPolicyTemplateAllowedFlexVolumeArgs>> allowedFlexVolumes;

    /**
     * @return (list)
     * 
     */
    public Optional<Output<List<GetPodSecurityPolicyTemplateAllowedFlexVolumeArgs>>> allowedFlexVolumes() {
        return Optional.ofNullable(this.allowedFlexVolumes);
    }

    /**
     * (list)
     * 
     */
    @Import(name="allowedHostPaths")
    private @Nullable Output<List<GetPodSecurityPolicyTemplateAllowedHostPathArgs>> allowedHostPaths;

    /**
     * @return (list)
     * 
     */
    public Optional<Output<List<GetPodSecurityPolicyTemplateAllowedHostPathArgs>>> allowedHostPaths() {
        return Optional.ofNullable(this.allowedHostPaths);
    }

    /**
     * (list)
     * 
     */
    @Import(name="allowedProcMountTypes")
    private @Nullable Output<List<String>> allowedProcMountTypes;

    /**
     * @return (list)
     * 
     */
    public Optional<Output<List<String>>> allowedProcMountTypes() {
        return Optional.ofNullable(this.allowedProcMountTypes);
    }

    /**
     * (list)
     * 
     */
    @Import(name="allowedUnsafeSysctls")
    private @Nullable Output<List<String>> allowedUnsafeSysctls;

    /**
     * @return (list)
     * 
     */
    public Optional<Output<List<String>>> allowedUnsafeSysctls() {
        return Optional.ofNullable(this.allowedUnsafeSysctls);
    }

    /**
     * Annotations for PodSecurityPolicyTemplate object (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for PodSecurityPolicyTemplate object (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * (list)
     * 
     */
    @Import(name="defaultAddCapabilities")
    private @Nullable Output<List<String>> defaultAddCapabilities;

    /**
     * @return (list)
     * 
     */
    public Optional<Output<List<String>>> defaultAddCapabilities() {
        return Optional.ofNullable(this.defaultAddCapabilities);
    }

    /**
     * (list)
     * 
     */
    @Import(name="defaultAllowPrivilegeEscalation")
    private @Nullable Output<Boolean> defaultAllowPrivilegeEscalation;

    /**
     * @return (list)
     * 
     */
    public Optional<Output<Boolean>> defaultAllowPrivilegeEscalation() {
        return Optional.ofNullable(this.defaultAllowPrivilegeEscalation);
    }

    /**
     * The PodSecurityPolicyTemplate description (string)
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The PodSecurityPolicyTemplate description (string)
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (list)
     * 
     */
    @Import(name="forbiddenSysctls")
    private @Nullable Output<List<String>> forbiddenSysctls;

    /**
     * @return (list)
     * 
     */
    public Optional<Output<List<String>>> forbiddenSysctls() {
        return Optional.ofNullable(this.forbiddenSysctls);
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="fsGroup")
    private @Nullable Output<GetPodSecurityPolicyTemplateFsGroupArgs> fsGroup;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<Output<GetPodSecurityPolicyTemplateFsGroupArgs>> fsGroup() {
        return Optional.ofNullable(this.fsGroup);
    }

    /**
     * (bool)
     * 
     */
    @Import(name="hostIpc")
    private @Nullable Output<Boolean> hostIpc;

    /**
     * @return (bool)
     * 
     */
    public Optional<Output<Boolean>> hostIpc() {
        return Optional.ofNullable(this.hostIpc);
    }

    @Import(name="hostNetwork")
    private @Nullable Output<Boolean> hostNetwork;

    public Optional<Output<Boolean>> hostNetwork() {
        return Optional.ofNullable(this.hostNetwork);
    }

    /**
     * (bool)
     * 
     */
    @Import(name="hostPid")
    private @Nullable Output<Boolean> hostPid;

    /**
     * @return (bool)
     * 
     */
    public Optional<Output<Boolean>> hostPid() {
        return Optional.ofNullable(this.hostPid);
    }

    /**
     * (list)
     * 
     */
    @Import(name="hostPorts")
    private @Nullable Output<List<GetPodSecurityPolicyTemplateHostPortArgs>> hostPorts;

    /**
     * @return (list)
     * 
     */
    public Optional<Output<List<GetPodSecurityPolicyTemplateHostPortArgs>>> hostPorts() {
        return Optional.ofNullable(this.hostPorts);
    }

    /**
     * Labels for PodSecurityPolicyTemplate object (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels for PodSecurityPolicyTemplate object (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the PodSecurityPolicyTemplate (string)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the PodSecurityPolicyTemplate (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * (bool)
     * 
     */
    @Import(name="privileged")
    private @Nullable Output<Boolean> privileged;

    /**
     * @return (bool)
     * 
     */
    public Optional<Output<Boolean>> privileged() {
        return Optional.ofNullable(this.privileged);
    }

    /**
     * (bool)
     * 
     */
    @Import(name="readOnlyRootFilesystem")
    private @Nullable Output<Boolean> readOnlyRootFilesystem;

    /**
     * @return (bool)
     * 
     */
    public Optional<Output<Boolean>> readOnlyRootFilesystem() {
        return Optional.ofNullable(this.readOnlyRootFilesystem);
    }

    /**
     * (list)
     * 
     */
    @Import(name="requiredDropCapabilities")
    private @Nullable Output<List<String>> requiredDropCapabilities;

    /**
     * @return (list)
     * 
     */
    public Optional<Output<List<String>>> requiredDropCapabilities() {
        return Optional.ofNullable(this.requiredDropCapabilities);
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="runAsGroup")
    private @Nullable Output<GetPodSecurityPolicyTemplateRunAsGroupArgs> runAsGroup;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<Output<GetPodSecurityPolicyTemplateRunAsGroupArgs>> runAsGroup() {
        return Optional.ofNullable(this.runAsGroup);
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="runAsUser")
    private @Nullable Output<GetPodSecurityPolicyTemplateRunAsUserArgs> runAsUser;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<Output<GetPodSecurityPolicyTemplateRunAsUserArgs>> runAsUser() {
        return Optional.ofNullable(this.runAsUser);
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="runtimeClass")
    private @Nullable Output<GetPodSecurityPolicyTemplateRuntimeClassArgs> runtimeClass;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<Output<GetPodSecurityPolicyTemplateRuntimeClassArgs>> runtimeClass() {
        return Optional.ofNullable(this.runtimeClass);
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="seLinux")
    private @Nullable Output<GetPodSecurityPolicyTemplateSeLinuxArgs> seLinux;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<Output<GetPodSecurityPolicyTemplateSeLinuxArgs>> seLinux() {
        return Optional.ofNullable(this.seLinux);
    }

    /**
     * (list maxitems:1)
     * 
     */
    @Import(name="supplementalGroup")
    private @Nullable Output<GetPodSecurityPolicyTemplateSupplementalGroupArgs> supplementalGroup;

    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<Output<GetPodSecurityPolicyTemplateSupplementalGroupArgs>> supplementalGroup() {
        return Optional.ofNullable(this.supplementalGroup);
    }

    /**
     * (list)
     * 
     */
    @Import(name="volumes")
    private @Nullable Output<List<String>> volumes;

    /**
     * @return (list)
     * 
     */
    public Optional<Output<List<String>>> volumes() {
        return Optional.ofNullable(this.volumes);
    }

    private GetPodSecurityPolicyTemplateArgs() {}

    private GetPodSecurityPolicyTemplateArgs(GetPodSecurityPolicyTemplateArgs $) {
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
    public static Builder builder(GetPodSecurityPolicyTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPodSecurityPolicyTemplateArgs $;

        public Builder() {
            $ = new GetPodSecurityPolicyTemplateArgs();
        }

        public Builder(GetPodSecurityPolicyTemplateArgs defaults) {
            $ = new GetPodSecurityPolicyTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowPrivilegeEscalation = (Optional)
         * 
         * @return builder
         * 
         */
        public Builder allowPrivilegeEscalation(@Nullable Output<Boolean> allowPrivilegeEscalation) {
            $.allowPrivilegeEscalation = allowPrivilegeEscalation;
            return this;
        }

        /**
         * @param allowPrivilegeEscalation = (Optional)
         * 
         * @return builder
         * 
         */
        public Builder allowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
            return allowPrivilegeEscalation(Output.of(allowPrivilegeEscalation));
        }

        /**
         * @param allowedCapabilities (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedCapabilities(@Nullable Output<List<String>> allowedCapabilities) {
            $.allowedCapabilities = allowedCapabilities;
            return this;
        }

        /**
         * @param allowedCapabilities (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedCapabilities(List<String> allowedCapabilities) {
            return allowedCapabilities(Output.of(allowedCapabilities));
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
        public Builder allowedCsiDrivers(@Nullable Output<List<GetPodSecurityPolicyTemplateAllowedCsiDriverArgs>> allowedCsiDrivers) {
            $.allowedCsiDrivers = allowedCsiDrivers;
            return this;
        }

        /**
         * @param allowedCsiDrivers (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedCsiDrivers(List<GetPodSecurityPolicyTemplateAllowedCsiDriverArgs> allowedCsiDrivers) {
            return allowedCsiDrivers(Output.of(allowedCsiDrivers));
        }

        /**
         * @param allowedCsiDrivers (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedCsiDrivers(GetPodSecurityPolicyTemplateAllowedCsiDriverArgs... allowedCsiDrivers) {
            return allowedCsiDrivers(List.of(allowedCsiDrivers));
        }

        /**
         * @param allowedFlexVolumes (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedFlexVolumes(@Nullable Output<List<GetPodSecurityPolicyTemplateAllowedFlexVolumeArgs>> allowedFlexVolumes) {
            $.allowedFlexVolumes = allowedFlexVolumes;
            return this;
        }

        /**
         * @param allowedFlexVolumes (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedFlexVolumes(List<GetPodSecurityPolicyTemplateAllowedFlexVolumeArgs> allowedFlexVolumes) {
            return allowedFlexVolumes(Output.of(allowedFlexVolumes));
        }

        /**
         * @param allowedFlexVolumes (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedFlexVolumes(GetPodSecurityPolicyTemplateAllowedFlexVolumeArgs... allowedFlexVolumes) {
            return allowedFlexVolumes(List.of(allowedFlexVolumes));
        }

        /**
         * @param allowedHostPaths (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedHostPaths(@Nullable Output<List<GetPodSecurityPolicyTemplateAllowedHostPathArgs>> allowedHostPaths) {
            $.allowedHostPaths = allowedHostPaths;
            return this;
        }

        /**
         * @param allowedHostPaths (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedHostPaths(List<GetPodSecurityPolicyTemplateAllowedHostPathArgs> allowedHostPaths) {
            return allowedHostPaths(Output.of(allowedHostPaths));
        }

        /**
         * @param allowedHostPaths (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedHostPaths(GetPodSecurityPolicyTemplateAllowedHostPathArgs... allowedHostPaths) {
            return allowedHostPaths(List.of(allowedHostPaths));
        }

        /**
         * @param allowedProcMountTypes (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedProcMountTypes(@Nullable Output<List<String>> allowedProcMountTypes) {
            $.allowedProcMountTypes = allowedProcMountTypes;
            return this;
        }

        /**
         * @param allowedProcMountTypes (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedProcMountTypes(List<String> allowedProcMountTypes) {
            return allowedProcMountTypes(Output.of(allowedProcMountTypes));
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
        public Builder allowedUnsafeSysctls(@Nullable Output<List<String>> allowedUnsafeSysctls) {
            $.allowedUnsafeSysctls = allowedUnsafeSysctls;
            return this;
        }

        /**
         * @param allowedUnsafeSysctls (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedUnsafeSysctls(List<String> allowedUnsafeSysctls) {
            return allowedUnsafeSysctls(Output.of(allowedUnsafeSysctls));
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
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for PodSecurityPolicyTemplate object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param defaultAddCapabilities (list)
         * 
         * @return builder
         * 
         */
        public Builder defaultAddCapabilities(@Nullable Output<List<String>> defaultAddCapabilities) {
            $.defaultAddCapabilities = defaultAddCapabilities;
            return this;
        }

        /**
         * @param defaultAddCapabilities (list)
         * 
         * @return builder
         * 
         */
        public Builder defaultAddCapabilities(List<String> defaultAddCapabilities) {
            return defaultAddCapabilities(Output.of(defaultAddCapabilities));
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
        public Builder defaultAllowPrivilegeEscalation(@Nullable Output<Boolean> defaultAllowPrivilegeEscalation) {
            $.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
            return this;
        }

        /**
         * @param defaultAllowPrivilegeEscalation (list)
         * 
         * @return builder
         * 
         */
        public Builder defaultAllowPrivilegeEscalation(Boolean defaultAllowPrivilegeEscalation) {
            return defaultAllowPrivilegeEscalation(Output.of(defaultAllowPrivilegeEscalation));
        }

        /**
         * @param description The PodSecurityPolicyTemplate description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The PodSecurityPolicyTemplate description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param forbiddenSysctls (list)
         * 
         * @return builder
         * 
         */
        public Builder forbiddenSysctls(@Nullable Output<List<String>> forbiddenSysctls) {
            $.forbiddenSysctls = forbiddenSysctls;
            return this;
        }

        /**
         * @param forbiddenSysctls (list)
         * 
         * @return builder
         * 
         */
        public Builder forbiddenSysctls(List<String> forbiddenSysctls) {
            return forbiddenSysctls(Output.of(forbiddenSysctls));
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
        public Builder fsGroup(@Nullable Output<GetPodSecurityPolicyTemplateFsGroupArgs> fsGroup) {
            $.fsGroup = fsGroup;
            return this;
        }

        /**
         * @param fsGroup (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder fsGroup(GetPodSecurityPolicyTemplateFsGroupArgs fsGroup) {
            return fsGroup(Output.of(fsGroup));
        }

        /**
         * @param hostIpc (bool)
         * 
         * @return builder
         * 
         */
        public Builder hostIpc(@Nullable Output<Boolean> hostIpc) {
            $.hostIpc = hostIpc;
            return this;
        }

        /**
         * @param hostIpc (bool)
         * 
         * @return builder
         * 
         */
        public Builder hostIpc(Boolean hostIpc) {
            return hostIpc(Output.of(hostIpc));
        }

        public Builder hostNetwork(@Nullable Output<Boolean> hostNetwork) {
            $.hostNetwork = hostNetwork;
            return this;
        }

        public Builder hostNetwork(Boolean hostNetwork) {
            return hostNetwork(Output.of(hostNetwork));
        }

        /**
         * @param hostPid (bool)
         * 
         * @return builder
         * 
         */
        public Builder hostPid(@Nullable Output<Boolean> hostPid) {
            $.hostPid = hostPid;
            return this;
        }

        /**
         * @param hostPid (bool)
         * 
         * @return builder
         * 
         */
        public Builder hostPid(Boolean hostPid) {
            return hostPid(Output.of(hostPid));
        }

        /**
         * @param hostPorts (list)
         * 
         * @return builder
         * 
         */
        public Builder hostPorts(@Nullable Output<List<GetPodSecurityPolicyTemplateHostPortArgs>> hostPorts) {
            $.hostPorts = hostPorts;
            return this;
        }

        /**
         * @param hostPorts (list)
         * 
         * @return builder
         * 
         */
        public Builder hostPorts(List<GetPodSecurityPolicyTemplateHostPortArgs> hostPorts) {
            return hostPorts(Output.of(hostPorts));
        }

        /**
         * @param hostPorts (list)
         * 
         * @return builder
         * 
         */
        public Builder hostPorts(GetPodSecurityPolicyTemplateHostPortArgs... hostPorts) {
            return hostPorts(List.of(hostPorts));
        }

        /**
         * @param labels Labels for PodSecurityPolicyTemplate object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for PodSecurityPolicyTemplate object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The name of the PodSecurityPolicyTemplate (string)
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the PodSecurityPolicyTemplate (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privileged (bool)
         * 
         * @return builder
         * 
         */
        public Builder privileged(@Nullable Output<Boolean> privileged) {
            $.privileged = privileged;
            return this;
        }

        /**
         * @param privileged (bool)
         * 
         * @return builder
         * 
         */
        public Builder privileged(Boolean privileged) {
            return privileged(Output.of(privileged));
        }

        /**
         * @param readOnlyRootFilesystem (bool)
         * 
         * @return builder
         * 
         */
        public Builder readOnlyRootFilesystem(@Nullable Output<Boolean> readOnlyRootFilesystem) {
            $.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }

        /**
         * @param readOnlyRootFilesystem (bool)
         * 
         * @return builder
         * 
         */
        public Builder readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
            return readOnlyRootFilesystem(Output.of(readOnlyRootFilesystem));
        }

        /**
         * @param requiredDropCapabilities (list)
         * 
         * @return builder
         * 
         */
        public Builder requiredDropCapabilities(@Nullable Output<List<String>> requiredDropCapabilities) {
            $.requiredDropCapabilities = requiredDropCapabilities;
            return this;
        }

        /**
         * @param requiredDropCapabilities (list)
         * 
         * @return builder
         * 
         */
        public Builder requiredDropCapabilities(List<String> requiredDropCapabilities) {
            return requiredDropCapabilities(Output.of(requiredDropCapabilities));
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
        public Builder runAsGroup(@Nullable Output<GetPodSecurityPolicyTemplateRunAsGroupArgs> runAsGroup) {
            $.runAsGroup = runAsGroup;
            return this;
        }

        /**
         * @param runAsGroup (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder runAsGroup(GetPodSecurityPolicyTemplateRunAsGroupArgs runAsGroup) {
            return runAsGroup(Output.of(runAsGroup));
        }

        /**
         * @param runAsUser (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder runAsUser(@Nullable Output<GetPodSecurityPolicyTemplateRunAsUserArgs> runAsUser) {
            $.runAsUser = runAsUser;
            return this;
        }

        /**
         * @param runAsUser (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder runAsUser(GetPodSecurityPolicyTemplateRunAsUserArgs runAsUser) {
            return runAsUser(Output.of(runAsUser));
        }

        /**
         * @param runtimeClass (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder runtimeClass(@Nullable Output<GetPodSecurityPolicyTemplateRuntimeClassArgs> runtimeClass) {
            $.runtimeClass = runtimeClass;
            return this;
        }

        /**
         * @param runtimeClass (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder runtimeClass(GetPodSecurityPolicyTemplateRuntimeClassArgs runtimeClass) {
            return runtimeClass(Output.of(runtimeClass));
        }

        /**
         * @param seLinux (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder seLinux(@Nullable Output<GetPodSecurityPolicyTemplateSeLinuxArgs> seLinux) {
            $.seLinux = seLinux;
            return this;
        }

        /**
         * @param seLinux (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder seLinux(GetPodSecurityPolicyTemplateSeLinuxArgs seLinux) {
            return seLinux(Output.of(seLinux));
        }

        /**
         * @param supplementalGroup (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder supplementalGroup(@Nullable Output<GetPodSecurityPolicyTemplateSupplementalGroupArgs> supplementalGroup) {
            $.supplementalGroup = supplementalGroup;
            return this;
        }

        /**
         * @param supplementalGroup (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder supplementalGroup(GetPodSecurityPolicyTemplateSupplementalGroupArgs supplementalGroup) {
            return supplementalGroup(Output.of(supplementalGroup));
        }

        /**
         * @param volumes (list)
         * 
         * @return builder
         * 
         */
        public Builder volumes(@Nullable Output<List<String>> volumes) {
            $.volumes = volumes;
            return this;
        }

        /**
         * @param volumes (list)
         * 
         * @return builder
         * 
         */
        public Builder volumes(List<String> volumes) {
            return volumes(Output.of(volumes));
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

        public GetPodSecurityPolicyTemplateArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetPodSecurityPolicyTemplateArgs", "name");
            }
            return $;
        }
    }

}
