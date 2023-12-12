// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetProjectRoleTemplateBindingResult {
    /**
     * @return (Computed) Annotations of the resource (map)
     * 
     */
    private Map<String,Object> annotations;
    /**
     * @return (Computed) The group ID to assign project role template binding (string)
     * 
     */
    private String groupId;
    /**
     * @return (Computed) The group_principal ID to assign project role template binding (string)
     * 
     */
    private String groupPrincipalId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Computed) Labels of the resource (map)
     * 
     */
    private Map<String,Object> labels;
    private String name;
    private String projectId;
    private String roleTemplateId;
    /**
     * @return (Computed) The user ID to assign project role template binding (string)
     * 
     */
    private String userId;
    /**
     * @return (Computed) The user_principal ID to assign project role template binding (string)
     * 
     */
    private String userPrincipalId;

    private GetProjectRoleTemplateBindingResult() {}
    /**
     * @return (Computed) Annotations of the resource (map)
     * 
     */
    public Map<String,Object> annotations() {
        return this.annotations;
    }
    /**
     * @return (Computed) The group ID to assign project role template binding (string)
     * 
     */
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return (Computed) The group_principal ID to assign project role template binding (string)
     * 
     */
    public String groupPrincipalId() {
        return this.groupPrincipalId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Computed) Labels of the resource (map)
     * 
     */
    public Map<String,Object> labels() {
        return this.labels;
    }
    public String name() {
        return this.name;
    }
    public String projectId() {
        return this.projectId;
    }
    public String roleTemplateId() {
        return this.roleTemplateId;
    }
    /**
     * @return (Computed) The user ID to assign project role template binding (string)
     * 
     */
    public String userId() {
        return this.userId;
    }
    /**
     * @return (Computed) The user_principal ID to assign project role template binding (string)
     * 
     */
    public String userPrincipalId() {
        return this.userPrincipalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectRoleTemplateBindingResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,Object> annotations;
        private String groupId;
        private String groupPrincipalId;
        private String id;
        private Map<String,Object> labels;
        private String name;
        private String projectId;
        private String roleTemplateId;
        private String userId;
        private String userPrincipalId;
        public Builder() {}
        public Builder(GetProjectRoleTemplateBindingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.groupId = defaults.groupId;
    	      this.groupPrincipalId = defaults.groupPrincipalId;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.projectId = defaults.projectId;
    	      this.roleTemplateId = defaults.roleTemplateId;
    	      this.userId = defaults.userId;
    	      this.userPrincipalId = defaults.userPrincipalId;
        }

        @CustomType.Setter
        public Builder annotations(Map<String,Object> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        @CustomType.Setter
        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        @CustomType.Setter
        public Builder groupPrincipalId(String groupPrincipalId) {
            this.groupPrincipalId = Objects.requireNonNull(groupPrincipalId);
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
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder roleTemplateId(String roleTemplateId) {
            this.roleTemplateId = Objects.requireNonNull(roleTemplateId);
            return this;
        }
        @CustomType.Setter
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        @CustomType.Setter
        public Builder userPrincipalId(String userPrincipalId) {
            this.userPrincipalId = Objects.requireNonNull(userPrincipalId);
            return this;
        }
        public GetProjectRoleTemplateBindingResult build() {
            final var _resultValue = new GetProjectRoleTemplateBindingResult();
            _resultValue.annotations = annotations;
            _resultValue.groupId = groupId;
            _resultValue.groupPrincipalId = groupPrincipalId;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.name = name;
            _resultValue.projectId = projectId;
            _resultValue.roleTemplateId = roleTemplateId;
            _resultValue.userId = userId;
            _resultValue.userPrincipalId = userPrincipalId;
            return _resultValue;
        }
    }
}
