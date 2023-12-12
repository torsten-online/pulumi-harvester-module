// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterTemplateMember;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevision;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetClusterTemplateResult {
    /**
     * @return (Computed) Annotations for the cluster template (map)
     * 
     */
    private Map<String,Object> annotations;
    /**
     * @return (Computed) Default cluster template revision ID (string)
     * 
     */
    private String defaultRevisionId;
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Computed) Labels for the cluster template (map)
     * 
     */
    private Map<String,Object> labels;
    /**
     * @return (Computed) Cluster template members (list)
     * 
     */
    private List<GetClusterTemplateMember> members;
    private String name;
    /**
     * @return (Computed) Cluster template revisions (list)
     * 
     */
    private List<GetClusterTemplateTemplateRevision> templateRevisions;

    private GetClusterTemplateResult() {}
    /**
     * @return (Computed) Annotations for the cluster template (map)
     * 
     */
    public Map<String,Object> annotations() {
        return this.annotations;
    }
    /**
     * @return (Computed) Default cluster template revision ID (string)
     * 
     */
    public String defaultRevisionId() {
        return this.defaultRevisionId;
    }
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Computed) Labels for the cluster template (map)
     * 
     */
    public Map<String,Object> labels() {
        return this.labels;
    }
    /**
     * @return (Computed) Cluster template members (list)
     * 
     */
    public List<GetClusterTemplateMember> members() {
        return this.members;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return (Computed) Cluster template revisions (list)
     * 
     */
    public List<GetClusterTemplateTemplateRevision> templateRevisions() {
        return this.templateRevisions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterTemplateResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,Object> annotations;
        private String defaultRevisionId;
        private String description;
        private String id;
        private Map<String,Object> labels;
        private List<GetClusterTemplateMember> members;
        private String name;
        private List<GetClusterTemplateTemplateRevision> templateRevisions;
        public Builder() {}
        public Builder(GetClusterTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.defaultRevisionId = defaults.defaultRevisionId;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.members = defaults.members;
    	      this.name = defaults.name;
    	      this.templateRevisions = defaults.templateRevisions;
        }

        @CustomType.Setter
        public Builder annotations(Map<String,Object> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        @CustomType.Setter
        public Builder defaultRevisionId(String defaultRevisionId) {
            this.defaultRevisionId = Objects.requireNonNull(defaultRevisionId);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
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
        public Builder members(List<GetClusterTemplateMember> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(GetClusterTemplateMember... members) {
            return members(List.of(members));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder templateRevisions(List<GetClusterTemplateTemplateRevision> templateRevisions) {
            this.templateRevisions = Objects.requireNonNull(templateRevisions);
            return this;
        }
        public Builder templateRevisions(GetClusterTemplateTemplateRevision... templateRevisions) {
            return templateRevisions(List.of(templateRevisions));
        }
        public GetClusterTemplateResult build() {
            final var _resultValue = new GetClusterTemplateResult();
            _resultValue.annotations = annotations;
            _resultValue.defaultRevisionId = defaultRevisionId;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.members = members;
            _resultValue.name = name;
            _resultValue.templateRevisions = templateRevisions;
            return _resultValue;
        }
    }
}
