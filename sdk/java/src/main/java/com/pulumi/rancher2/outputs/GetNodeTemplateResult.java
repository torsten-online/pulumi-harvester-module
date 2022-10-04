// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetNodeTemplateNodeTaint;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNodeTemplateResult {
    /**
     * @return (Computed) Annotations for Node Template object (map)
     * 
     */
    private Map<String,Object> annotations;
    /**
     * @return (Computed) Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
     * 
     */
    private String cloudCredentialId;
    /**
     * @return (Computed) Description for the Node Template (string)
     * 
     */
    private String description;
    /**
     * @return (Computed) The driver of the node template (string)
     * 
     */
    private String driver;
    /**
     * @return (Computed) Engine environment for the node template (string)
     * 
     */
    private Map<String,Object> engineEnv;
    /**
     * @return (Computed) Insecure registry for the node template (list)
     * 
     */
    private List<String> engineInsecureRegistries;
    /**
     * @return (Computed) Docker engine install URL for the node template (string)
     * 
     */
    private String engineInstallUrl;
    /**
     * @return (Computed) Engine label for the node template (string)
     * 
     */
    private Map<String,Object> engineLabel;
    /**
     * @return (Computed) Engine options for the node template (map)
     * 
     */
    private Map<String,Object> engineOpt;
    /**
     * @return (Computed) Engine registry mirror for the node template (list)
     * 
     */
    private List<String> engineRegistryMirrors;
    /**
     * @return (Computed) Engine storage driver for the node template (string)
     * 
     */
    private String engineStorageDriver;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Computed) Labels for Node Template object (map)
     * 
     */
    private Map<String,Object> labels;
    private String name;
    /**
     * @return (Computed) Node taints (List)
     * 
     */
    private List<GetNodeTemplateNodeTaint> nodeTaints;
    /**
     * @return (Computed) Engine storage driver for the node template (bool)
     * 
     */
    private @Nullable Boolean useInternalIpAddress;

    private GetNodeTemplateResult() {}
    /**
     * @return (Computed) Annotations for Node Template object (map)
     * 
     */
    public Map<String,Object> annotations() {
        return this.annotations;
    }
    /**
     * @return (Computed) Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
     * 
     */
    public String cloudCredentialId() {
        return this.cloudCredentialId;
    }
    /**
     * @return (Computed) Description for the Node Template (string)
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return (Computed) The driver of the node template (string)
     * 
     */
    public String driver() {
        return this.driver;
    }
    /**
     * @return (Computed) Engine environment for the node template (string)
     * 
     */
    public Map<String,Object> engineEnv() {
        return this.engineEnv;
    }
    /**
     * @return (Computed) Insecure registry for the node template (list)
     * 
     */
    public List<String> engineInsecureRegistries() {
        return this.engineInsecureRegistries;
    }
    /**
     * @return (Computed) Docker engine install URL for the node template (string)
     * 
     */
    public String engineInstallUrl() {
        return this.engineInstallUrl;
    }
    /**
     * @return (Computed) Engine label for the node template (string)
     * 
     */
    public Map<String,Object> engineLabel() {
        return this.engineLabel;
    }
    /**
     * @return (Computed) Engine options for the node template (map)
     * 
     */
    public Map<String,Object> engineOpt() {
        return this.engineOpt;
    }
    /**
     * @return (Computed) Engine registry mirror for the node template (list)
     * 
     */
    public List<String> engineRegistryMirrors() {
        return this.engineRegistryMirrors;
    }
    /**
     * @return (Computed) Engine storage driver for the node template (string)
     * 
     */
    public String engineStorageDriver() {
        return this.engineStorageDriver;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Computed) Labels for Node Template object (map)
     * 
     */
    public Map<String,Object> labels() {
        return this.labels;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return (Computed) Node taints (List)
     * 
     */
    public List<GetNodeTemplateNodeTaint> nodeTaints() {
        return this.nodeTaints;
    }
    /**
     * @return (Computed) Engine storage driver for the node template (bool)
     * 
     */
    public Optional<Boolean> useInternalIpAddress() {
        return Optional.ofNullable(this.useInternalIpAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeTemplateResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,Object> annotations;
        private String cloudCredentialId;
        private String description;
        private String driver;
        private Map<String,Object> engineEnv;
        private List<String> engineInsecureRegistries;
        private String engineInstallUrl;
        private Map<String,Object> engineLabel;
        private Map<String,Object> engineOpt;
        private List<String> engineRegistryMirrors;
        private String engineStorageDriver;
        private String id;
        private Map<String,Object> labels;
        private String name;
        private List<GetNodeTemplateNodeTaint> nodeTaints;
        private @Nullable Boolean useInternalIpAddress;
        public Builder() {}
        public Builder(GetNodeTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.cloudCredentialId = defaults.cloudCredentialId;
    	      this.description = defaults.description;
    	      this.driver = defaults.driver;
    	      this.engineEnv = defaults.engineEnv;
    	      this.engineInsecureRegistries = defaults.engineInsecureRegistries;
    	      this.engineInstallUrl = defaults.engineInstallUrl;
    	      this.engineLabel = defaults.engineLabel;
    	      this.engineOpt = defaults.engineOpt;
    	      this.engineRegistryMirrors = defaults.engineRegistryMirrors;
    	      this.engineStorageDriver = defaults.engineStorageDriver;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.nodeTaints = defaults.nodeTaints;
    	      this.useInternalIpAddress = defaults.useInternalIpAddress;
        }

        @CustomType.Setter
        public Builder annotations(Map<String,Object> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        @CustomType.Setter
        public Builder cloudCredentialId(String cloudCredentialId) {
            this.cloudCredentialId = Objects.requireNonNull(cloudCredentialId);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder driver(String driver) {
            this.driver = Objects.requireNonNull(driver);
            return this;
        }
        @CustomType.Setter
        public Builder engineEnv(Map<String,Object> engineEnv) {
            this.engineEnv = Objects.requireNonNull(engineEnv);
            return this;
        }
        @CustomType.Setter
        public Builder engineInsecureRegistries(List<String> engineInsecureRegistries) {
            this.engineInsecureRegistries = Objects.requireNonNull(engineInsecureRegistries);
            return this;
        }
        public Builder engineInsecureRegistries(String... engineInsecureRegistries) {
            return engineInsecureRegistries(List.of(engineInsecureRegistries));
        }
        @CustomType.Setter
        public Builder engineInstallUrl(String engineInstallUrl) {
            this.engineInstallUrl = Objects.requireNonNull(engineInstallUrl);
            return this;
        }
        @CustomType.Setter
        public Builder engineLabel(Map<String,Object> engineLabel) {
            this.engineLabel = Objects.requireNonNull(engineLabel);
            return this;
        }
        @CustomType.Setter
        public Builder engineOpt(Map<String,Object> engineOpt) {
            this.engineOpt = Objects.requireNonNull(engineOpt);
            return this;
        }
        @CustomType.Setter
        public Builder engineRegistryMirrors(List<String> engineRegistryMirrors) {
            this.engineRegistryMirrors = Objects.requireNonNull(engineRegistryMirrors);
            return this;
        }
        public Builder engineRegistryMirrors(String... engineRegistryMirrors) {
            return engineRegistryMirrors(List.of(engineRegistryMirrors));
        }
        @CustomType.Setter
        public Builder engineStorageDriver(String engineStorageDriver) {
            this.engineStorageDriver = Objects.requireNonNull(engineStorageDriver);
            return this;
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
        public Builder nodeTaints(List<GetNodeTemplateNodeTaint> nodeTaints) {
            this.nodeTaints = Objects.requireNonNull(nodeTaints);
            return this;
        }
        public Builder nodeTaints(GetNodeTemplateNodeTaint... nodeTaints) {
            return nodeTaints(List.of(nodeTaints));
        }
        @CustomType.Setter
        public Builder useInternalIpAddress(@Nullable Boolean useInternalIpAddress) {
            this.useInternalIpAddress = useInternalIpAddress;
            return this;
        }
        public GetNodeTemplateResult build() {
            final var o = new GetNodeTemplateResult();
            o.annotations = annotations;
            o.cloudCredentialId = cloudCredentialId;
            o.description = description;
            o.driver = driver;
            o.engineEnv = engineEnv;
            o.engineInsecureRegistries = engineInsecureRegistries;
            o.engineInstallUrl = engineInstallUrl;
            o.engineLabel = engineLabel;
            o.engineOpt = engineOpt;
            o.engineRegistryMirrors = engineRegistryMirrors;
            o.engineStorageDriver = engineStorageDriver;
            o.id = id;
            o.labels = labels;
            o.name = name;
            o.nodeTaints = nodeTaints;
            o.useInternalIpAddress = useInternalIpAddress;
            return o;
        }
    }
}
