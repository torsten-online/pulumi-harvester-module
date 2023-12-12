// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetProjectContainerResourceLimit;
import com.pulumi.rancher2.outputs.GetProjectResourceQuota;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetProjectResult {
    /**
     * @return (Computed) Annotations of the rancher2 project (map)
     * 
     */
    private Map<String,Object> annotations;
    private String clusterId;
    /**
     * @return (Computed) Default containers resource limits on project (List maxitem:1)
     * 
     */
    private GetProjectContainerResourceLimit containerResourceLimit;
    /**
     * @return (Computed) The project&#39;s description (string)
     * 
     */
    private String description;
    /**
     * @return (Computed) Enable built-in project monitoring. Default `false` (bool)
     * 
     */
    private Boolean enableProjectMonitoring;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Computed) Labels of the rancher2 project (map)
     * 
     */
    private Map<String,Object> labels;
    private String name;
    /**
     * @return (Computed) Default Pod Security Policy ID for the project (string)
     * 
     */
    private String podSecurityPolicyTemplateId;
    /**
     * @return (Computed) Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
     * 
     */
    private GetProjectResourceQuota resourceQuota;
    /**
     * @return (Computed) UUID of the project as stored by Rancher 2 (string)
     * 
     */
    private String uuid;

    private GetProjectResult() {}
    /**
     * @return (Computed) Annotations of the rancher2 project (map)
     * 
     */
    public Map<String,Object> annotations() {
        return this.annotations;
    }
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return (Computed) Default containers resource limits on project (List maxitem:1)
     * 
     */
    public GetProjectContainerResourceLimit containerResourceLimit() {
        return this.containerResourceLimit;
    }
    /**
     * @return (Computed) The project&#39;s description (string)
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return (Computed) Enable built-in project monitoring. Default `false` (bool)
     * 
     */
    public Boolean enableProjectMonitoring() {
        return this.enableProjectMonitoring;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Computed) Labels of the rancher2 project (map)
     * 
     */
    public Map<String,Object> labels() {
        return this.labels;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return (Computed) Default Pod Security Policy ID for the project (string)
     * 
     */
    public String podSecurityPolicyTemplateId() {
        return this.podSecurityPolicyTemplateId;
    }
    /**
     * @return (Computed) Resource quota for project. Rancher v2.1.x or higher (list maxitems:1)
     * 
     */
    public GetProjectResourceQuota resourceQuota() {
        return this.resourceQuota;
    }
    /**
     * @return (Computed) UUID of the project as stored by Rancher 2 (string)
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,Object> annotations;
        private String clusterId;
        private GetProjectContainerResourceLimit containerResourceLimit;
        private String description;
        private Boolean enableProjectMonitoring;
        private String id;
        private Map<String,Object> labels;
        private String name;
        private String podSecurityPolicyTemplateId;
        private GetProjectResourceQuota resourceQuota;
        private String uuid;
        public Builder() {}
        public Builder(GetProjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clusterId = defaults.clusterId;
    	      this.containerResourceLimit = defaults.containerResourceLimit;
    	      this.description = defaults.description;
    	      this.enableProjectMonitoring = defaults.enableProjectMonitoring;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.podSecurityPolicyTemplateId = defaults.podSecurityPolicyTemplateId;
    	      this.resourceQuota = defaults.resourceQuota;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder annotations(Map<String,Object> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        @CustomType.Setter
        public Builder containerResourceLimit(GetProjectContainerResourceLimit containerResourceLimit) {
            this.containerResourceLimit = Objects.requireNonNull(containerResourceLimit);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder enableProjectMonitoring(Boolean enableProjectMonitoring) {
            this.enableProjectMonitoring = Objects.requireNonNull(enableProjectMonitoring);
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
        public Builder podSecurityPolicyTemplateId(String podSecurityPolicyTemplateId) {
            this.podSecurityPolicyTemplateId = Objects.requireNonNull(podSecurityPolicyTemplateId);
            return this;
        }
        @CustomType.Setter
        public Builder resourceQuota(GetProjectResourceQuota resourceQuota) {
            this.resourceQuota = Objects.requireNonNull(resourceQuota);
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }
        public GetProjectResult build() {
            final var _resultValue = new GetProjectResult();
            _resultValue.annotations = annotations;
            _resultValue.clusterId = clusterId;
            _resultValue.containerResourceLimit = containerResourceLimit;
            _resultValue.description = description;
            _resultValue.enableProjectMonitoring = enableProjectMonitoring;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.name = name;
            _resultValue.podSecurityPolicyTemplateId = podSecurityPolicyTemplateId;
            _resultValue.resourceQuota = resourceQuota;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
