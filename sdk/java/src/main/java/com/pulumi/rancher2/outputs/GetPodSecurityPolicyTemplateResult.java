// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetPodSecurityPolicyTemplateAllowedCsiDriver;
import com.pulumi.rancher2.outputs.GetPodSecurityPolicyTemplateAllowedFlexVolume;
import com.pulumi.rancher2.outputs.GetPodSecurityPolicyTemplateAllowedHostPath;
import com.pulumi.rancher2.outputs.GetPodSecurityPolicyTemplateFsGroup;
import com.pulumi.rancher2.outputs.GetPodSecurityPolicyTemplateHostPort;
import com.pulumi.rancher2.outputs.GetPodSecurityPolicyTemplateRunAsGroup;
import com.pulumi.rancher2.outputs.GetPodSecurityPolicyTemplateRunAsUser;
import com.pulumi.rancher2.outputs.GetPodSecurityPolicyTemplateRuntimeClass;
import com.pulumi.rancher2.outputs.GetPodSecurityPolicyTemplateSeLinux;
import com.pulumi.rancher2.outputs.GetPodSecurityPolicyTemplateSupplementalGroup;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPodSecurityPolicyTemplateResult {
    private Boolean allowPrivilegeEscalation;
    private @Nullable List<String> allowedCapabilities;
    private @Nullable List<GetPodSecurityPolicyTemplateAllowedCsiDriver> allowedCsiDrivers;
    private @Nullable List<GetPodSecurityPolicyTemplateAllowedFlexVolume> allowedFlexVolumes;
    private @Nullable List<GetPodSecurityPolicyTemplateAllowedHostPath> allowedHostPaths;
    private @Nullable List<String> allowedProcMountTypes;
    private @Nullable List<String> allowedUnsafeSysctls;
    private Map<String,Object> annotations;
    private @Nullable List<String> defaultAddCapabilities;
    private @Nullable Boolean defaultAllowPrivilegeEscalation;
    private String description;
    private @Nullable List<String> forbiddenSysctls;
    private GetPodSecurityPolicyTemplateFsGroup fsGroup;
    private Boolean hostIpc;
    private Boolean hostNetwork;
    private Boolean hostPid;
    private List<GetPodSecurityPolicyTemplateHostPort> hostPorts;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private Map<String,Object> labels;
    private String name;
    private Boolean privileged;
    private Boolean readOnlyRootFilesystem;
    private @Nullable List<String> requiredDropCapabilities;
    private @Nullable GetPodSecurityPolicyTemplateRunAsGroup runAsGroup;
    private GetPodSecurityPolicyTemplateRunAsUser runAsUser;
    private @Nullable GetPodSecurityPolicyTemplateRuntimeClass runtimeClass;
    private GetPodSecurityPolicyTemplateSeLinux seLinux;
    private GetPodSecurityPolicyTemplateSupplementalGroup supplementalGroup;
    private List<String> volumes;

    private GetPodSecurityPolicyTemplateResult() {}
    public Boolean allowPrivilegeEscalation() {
        return this.allowPrivilegeEscalation;
    }
    public List<String> allowedCapabilities() {
        return this.allowedCapabilities == null ? List.of() : this.allowedCapabilities;
    }
    public List<GetPodSecurityPolicyTemplateAllowedCsiDriver> allowedCsiDrivers() {
        return this.allowedCsiDrivers == null ? List.of() : this.allowedCsiDrivers;
    }
    public List<GetPodSecurityPolicyTemplateAllowedFlexVolume> allowedFlexVolumes() {
        return this.allowedFlexVolumes == null ? List.of() : this.allowedFlexVolumes;
    }
    public List<GetPodSecurityPolicyTemplateAllowedHostPath> allowedHostPaths() {
        return this.allowedHostPaths == null ? List.of() : this.allowedHostPaths;
    }
    public List<String> allowedProcMountTypes() {
        return this.allowedProcMountTypes == null ? List.of() : this.allowedProcMountTypes;
    }
    public List<String> allowedUnsafeSysctls() {
        return this.allowedUnsafeSysctls == null ? List.of() : this.allowedUnsafeSysctls;
    }
    public Map<String,Object> annotations() {
        return this.annotations;
    }
    public List<String> defaultAddCapabilities() {
        return this.defaultAddCapabilities == null ? List.of() : this.defaultAddCapabilities;
    }
    public Optional<Boolean> defaultAllowPrivilegeEscalation() {
        return Optional.ofNullable(this.defaultAllowPrivilegeEscalation);
    }
    public String description() {
        return this.description;
    }
    public List<String> forbiddenSysctls() {
        return this.forbiddenSysctls == null ? List.of() : this.forbiddenSysctls;
    }
    public GetPodSecurityPolicyTemplateFsGroup fsGroup() {
        return this.fsGroup;
    }
    public Boolean hostIpc() {
        return this.hostIpc;
    }
    public Boolean hostNetwork() {
        return this.hostNetwork;
    }
    public Boolean hostPid() {
        return this.hostPid;
    }
    public List<GetPodSecurityPolicyTemplateHostPort> hostPorts() {
        return this.hostPorts;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Map<String,Object> labels() {
        return this.labels;
    }
    public String name() {
        return this.name;
    }
    public Boolean privileged() {
        return this.privileged;
    }
    public Boolean readOnlyRootFilesystem() {
        return this.readOnlyRootFilesystem;
    }
    public List<String> requiredDropCapabilities() {
        return this.requiredDropCapabilities == null ? List.of() : this.requiredDropCapabilities;
    }
    public Optional<GetPodSecurityPolicyTemplateRunAsGroup> runAsGroup() {
        return Optional.ofNullable(this.runAsGroup);
    }
    public GetPodSecurityPolicyTemplateRunAsUser runAsUser() {
        return this.runAsUser;
    }
    public Optional<GetPodSecurityPolicyTemplateRuntimeClass> runtimeClass() {
        return Optional.ofNullable(this.runtimeClass);
    }
    public GetPodSecurityPolicyTemplateSeLinux seLinux() {
        return this.seLinux;
    }
    public GetPodSecurityPolicyTemplateSupplementalGroup supplementalGroup() {
        return this.supplementalGroup;
    }
    public List<String> volumes() {
        return this.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPodSecurityPolicyTemplateResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowPrivilegeEscalation;
        private @Nullable List<String> allowedCapabilities;
        private @Nullable List<GetPodSecurityPolicyTemplateAllowedCsiDriver> allowedCsiDrivers;
        private @Nullable List<GetPodSecurityPolicyTemplateAllowedFlexVolume> allowedFlexVolumes;
        private @Nullable List<GetPodSecurityPolicyTemplateAllowedHostPath> allowedHostPaths;
        private @Nullable List<String> allowedProcMountTypes;
        private @Nullable List<String> allowedUnsafeSysctls;
        private Map<String,Object> annotations;
        private @Nullable List<String> defaultAddCapabilities;
        private @Nullable Boolean defaultAllowPrivilegeEscalation;
        private String description;
        private @Nullable List<String> forbiddenSysctls;
        private GetPodSecurityPolicyTemplateFsGroup fsGroup;
        private Boolean hostIpc;
        private Boolean hostNetwork;
        private Boolean hostPid;
        private List<GetPodSecurityPolicyTemplateHostPort> hostPorts;
        private String id;
        private Map<String,Object> labels;
        private String name;
        private Boolean privileged;
        private Boolean readOnlyRootFilesystem;
        private @Nullable List<String> requiredDropCapabilities;
        private @Nullable GetPodSecurityPolicyTemplateRunAsGroup runAsGroup;
        private GetPodSecurityPolicyTemplateRunAsUser runAsUser;
        private @Nullable GetPodSecurityPolicyTemplateRuntimeClass runtimeClass;
        private GetPodSecurityPolicyTemplateSeLinux seLinux;
        private GetPodSecurityPolicyTemplateSupplementalGroup supplementalGroup;
        private List<String> volumes;
        public Builder() {}
        public Builder(GetPodSecurityPolicyTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPrivilegeEscalation = defaults.allowPrivilegeEscalation;
    	      this.allowedCapabilities = defaults.allowedCapabilities;
    	      this.allowedCsiDrivers = defaults.allowedCsiDrivers;
    	      this.allowedFlexVolumes = defaults.allowedFlexVolumes;
    	      this.allowedHostPaths = defaults.allowedHostPaths;
    	      this.allowedProcMountTypes = defaults.allowedProcMountTypes;
    	      this.allowedUnsafeSysctls = defaults.allowedUnsafeSysctls;
    	      this.annotations = defaults.annotations;
    	      this.defaultAddCapabilities = defaults.defaultAddCapabilities;
    	      this.defaultAllowPrivilegeEscalation = defaults.defaultAllowPrivilegeEscalation;
    	      this.description = defaults.description;
    	      this.forbiddenSysctls = defaults.forbiddenSysctls;
    	      this.fsGroup = defaults.fsGroup;
    	      this.hostIpc = defaults.hostIpc;
    	      this.hostNetwork = defaults.hostNetwork;
    	      this.hostPid = defaults.hostPid;
    	      this.hostPorts = defaults.hostPorts;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.privileged = defaults.privileged;
    	      this.readOnlyRootFilesystem = defaults.readOnlyRootFilesystem;
    	      this.requiredDropCapabilities = defaults.requiredDropCapabilities;
    	      this.runAsGroup = defaults.runAsGroup;
    	      this.runAsUser = defaults.runAsUser;
    	      this.runtimeClass = defaults.runtimeClass;
    	      this.seLinux = defaults.seLinux;
    	      this.supplementalGroup = defaults.supplementalGroup;
    	      this.volumes = defaults.volumes;
        }

        @CustomType.Setter
        public Builder allowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
            this.allowPrivilegeEscalation = Objects.requireNonNull(allowPrivilegeEscalation);
            return this;
        }
        @CustomType.Setter
        public Builder allowedCapabilities(@Nullable List<String> allowedCapabilities) {
            this.allowedCapabilities = allowedCapabilities;
            return this;
        }
        public Builder allowedCapabilities(String... allowedCapabilities) {
            return allowedCapabilities(List.of(allowedCapabilities));
        }
        @CustomType.Setter
        public Builder allowedCsiDrivers(@Nullable List<GetPodSecurityPolicyTemplateAllowedCsiDriver> allowedCsiDrivers) {
            this.allowedCsiDrivers = allowedCsiDrivers;
            return this;
        }
        public Builder allowedCsiDrivers(GetPodSecurityPolicyTemplateAllowedCsiDriver... allowedCsiDrivers) {
            return allowedCsiDrivers(List.of(allowedCsiDrivers));
        }
        @CustomType.Setter
        public Builder allowedFlexVolumes(@Nullable List<GetPodSecurityPolicyTemplateAllowedFlexVolume> allowedFlexVolumes) {
            this.allowedFlexVolumes = allowedFlexVolumes;
            return this;
        }
        public Builder allowedFlexVolumes(GetPodSecurityPolicyTemplateAllowedFlexVolume... allowedFlexVolumes) {
            return allowedFlexVolumes(List.of(allowedFlexVolumes));
        }
        @CustomType.Setter
        public Builder allowedHostPaths(@Nullable List<GetPodSecurityPolicyTemplateAllowedHostPath> allowedHostPaths) {
            this.allowedHostPaths = allowedHostPaths;
            return this;
        }
        public Builder allowedHostPaths(GetPodSecurityPolicyTemplateAllowedHostPath... allowedHostPaths) {
            return allowedHostPaths(List.of(allowedHostPaths));
        }
        @CustomType.Setter
        public Builder allowedProcMountTypes(@Nullable List<String> allowedProcMountTypes) {
            this.allowedProcMountTypes = allowedProcMountTypes;
            return this;
        }
        public Builder allowedProcMountTypes(String... allowedProcMountTypes) {
            return allowedProcMountTypes(List.of(allowedProcMountTypes));
        }
        @CustomType.Setter
        public Builder allowedUnsafeSysctls(@Nullable List<String> allowedUnsafeSysctls) {
            this.allowedUnsafeSysctls = allowedUnsafeSysctls;
            return this;
        }
        public Builder allowedUnsafeSysctls(String... allowedUnsafeSysctls) {
            return allowedUnsafeSysctls(List.of(allowedUnsafeSysctls));
        }
        @CustomType.Setter
        public Builder annotations(Map<String,Object> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        @CustomType.Setter
        public Builder defaultAddCapabilities(@Nullable List<String> defaultAddCapabilities) {
            this.defaultAddCapabilities = defaultAddCapabilities;
            return this;
        }
        public Builder defaultAddCapabilities(String... defaultAddCapabilities) {
            return defaultAddCapabilities(List.of(defaultAddCapabilities));
        }
        @CustomType.Setter
        public Builder defaultAllowPrivilegeEscalation(@Nullable Boolean defaultAllowPrivilegeEscalation) {
            this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder forbiddenSysctls(@Nullable List<String> forbiddenSysctls) {
            this.forbiddenSysctls = forbiddenSysctls;
            return this;
        }
        public Builder forbiddenSysctls(String... forbiddenSysctls) {
            return forbiddenSysctls(List.of(forbiddenSysctls));
        }
        @CustomType.Setter
        public Builder fsGroup(GetPodSecurityPolicyTemplateFsGroup fsGroup) {
            this.fsGroup = Objects.requireNonNull(fsGroup);
            return this;
        }
        @CustomType.Setter
        public Builder hostIpc(Boolean hostIpc) {
            this.hostIpc = Objects.requireNonNull(hostIpc);
            return this;
        }
        @CustomType.Setter
        public Builder hostNetwork(Boolean hostNetwork) {
            this.hostNetwork = Objects.requireNonNull(hostNetwork);
            return this;
        }
        @CustomType.Setter
        public Builder hostPid(Boolean hostPid) {
            this.hostPid = Objects.requireNonNull(hostPid);
            return this;
        }
        @CustomType.Setter
        public Builder hostPorts(List<GetPodSecurityPolicyTemplateHostPort> hostPorts) {
            this.hostPorts = Objects.requireNonNull(hostPorts);
            return this;
        }
        public Builder hostPorts(GetPodSecurityPolicyTemplateHostPort... hostPorts) {
            return hostPorts(List.of(hostPorts));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,Object> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder privileged(Boolean privileged) {
            this.privileged = Objects.requireNonNull(privileged);
            return this;
        }
        @CustomType.Setter
        public Builder readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = Objects.requireNonNull(readOnlyRootFilesystem);
            return this;
        }
        @CustomType.Setter
        public Builder requiredDropCapabilities(@Nullable List<String> requiredDropCapabilities) {
            this.requiredDropCapabilities = requiredDropCapabilities;
            return this;
        }
        public Builder requiredDropCapabilities(String... requiredDropCapabilities) {
            return requiredDropCapabilities(List.of(requiredDropCapabilities));
        }
        @CustomType.Setter
        public Builder runAsGroup(@Nullable GetPodSecurityPolicyTemplateRunAsGroup runAsGroup) {
            this.runAsGroup = runAsGroup;
            return this;
        }
        @CustomType.Setter
        public Builder runAsUser(GetPodSecurityPolicyTemplateRunAsUser runAsUser) {
            this.runAsUser = Objects.requireNonNull(runAsUser);
            return this;
        }
        @CustomType.Setter
        public Builder runtimeClass(@Nullable GetPodSecurityPolicyTemplateRuntimeClass runtimeClass) {
            this.runtimeClass = runtimeClass;
            return this;
        }
        @CustomType.Setter
        public Builder seLinux(GetPodSecurityPolicyTemplateSeLinux seLinux) {
            this.seLinux = Objects.requireNonNull(seLinux);
            return this;
        }
        @CustomType.Setter
        public Builder supplementalGroup(GetPodSecurityPolicyTemplateSupplementalGroup supplementalGroup) {
            this.supplementalGroup = Objects.requireNonNull(supplementalGroup);
            return this;
        }
        @CustomType.Setter
        public Builder volumes(List<String> volumes) {
            this.volumes = Objects.requireNonNull(volumes);
            return this;
        }
        public Builder volumes(String... volumes) {
            return volumes(List.of(volumes));
        }
        public GetPodSecurityPolicyTemplateResult build() {
            final var _resultValue = new GetPodSecurityPolicyTemplateResult();
            _resultValue.allowPrivilegeEscalation = allowPrivilegeEscalation;
            _resultValue.allowedCapabilities = allowedCapabilities;
            _resultValue.allowedCsiDrivers = allowedCsiDrivers;
            _resultValue.allowedFlexVolumes = allowedFlexVolumes;
            _resultValue.allowedHostPaths = allowedHostPaths;
            _resultValue.allowedProcMountTypes = allowedProcMountTypes;
            _resultValue.allowedUnsafeSysctls = allowedUnsafeSysctls;
            _resultValue.annotations = annotations;
            _resultValue.defaultAddCapabilities = defaultAddCapabilities;
            _resultValue.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
            _resultValue.description = description;
            _resultValue.forbiddenSysctls = forbiddenSysctls;
            _resultValue.fsGroup = fsGroup;
            _resultValue.hostIpc = hostIpc;
            _resultValue.hostNetwork = hostNetwork;
            _resultValue.hostPid = hostPid;
            _resultValue.hostPorts = hostPorts;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.name = name;
            _resultValue.privileged = privileged;
            _resultValue.readOnlyRootFilesystem = readOnlyRootFilesystem;
            _resultValue.requiredDropCapabilities = requiredDropCapabilities;
            _resultValue.runAsGroup = runAsGroup;
            _resultValue.runAsUser = runAsUser;
            _resultValue.runtimeClass = runtimeClass;
            _resultValue.seLinux = seLinux;
            _resultValue.supplementalGroup = supplementalGroup;
            _resultValue.volumes = volumes;
            return _resultValue;
        }
    }
}
