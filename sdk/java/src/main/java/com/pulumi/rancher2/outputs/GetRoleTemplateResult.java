// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetRoleTemplateRule;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRoleTemplateResult {
    /**
     * @return (Computed) Administrative role template (bool)
     * 
     */
    private final Boolean administrative;
    /**
     * @return (Computed) Annotations for role template object (map)
     * 
     */
    private final Map<String,Object> annotations;
    /**
     * @return (Computed) Builtin role template (string)
     * 
     */
    private final Boolean builtin;
    private final String context;
    /**
     * @return (Computed) Default role template for new created cluster or project (bool)
     * 
     */
    private final Boolean defaultRole;
    /**
     * @return (Computed) Role template description (string)
     * 
     */
    private final String description;
    /**
     * @return (Computed) External role template (bool)
     * 
     */
    private final Boolean external;
    /**
     * @return (Computed) Hidden role template (bool)
     * 
     */
    private final Boolean hidden;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return (Computed) Labels for role template object (map)
     * 
     */
    private final Map<String,Object> labels;
    /**
     * @return (Computed) Locked role template (bool)
     * 
     */
    private final Boolean locked;
    private final String name;
    /**
     * @return (Computed) Inherit role template IDs (list)
     * 
     */
    private final List<String> roleTemplateIds;
    /**
     * @return (Computed) Role template policy rules (list)
     * 
     */
    private final List<GetRoleTemplateRule> rules;

    @CustomType.Constructor
    private GetRoleTemplateResult(
        @CustomType.Parameter("administrative") Boolean administrative,
        @CustomType.Parameter("annotations") Map<String,Object> annotations,
        @CustomType.Parameter("builtin") Boolean builtin,
        @CustomType.Parameter("context") String context,
        @CustomType.Parameter("defaultRole") Boolean defaultRole,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("external") Boolean external,
        @CustomType.Parameter("hidden") Boolean hidden,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("labels") Map<String,Object> labels,
        @CustomType.Parameter("locked") Boolean locked,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("roleTemplateIds") List<String> roleTemplateIds,
        @CustomType.Parameter("rules") List<GetRoleTemplateRule> rules) {
        this.administrative = administrative;
        this.annotations = annotations;
        this.builtin = builtin;
        this.context = context;
        this.defaultRole = defaultRole;
        this.description = description;
        this.external = external;
        this.hidden = hidden;
        this.id = id;
        this.labels = labels;
        this.locked = locked;
        this.name = name;
        this.roleTemplateIds = roleTemplateIds;
        this.rules = rules;
    }

    /**
     * @return (Computed) Administrative role template (bool)
     * 
     */
    public Boolean administrative() {
        return this.administrative;
    }
    /**
     * @return (Computed) Annotations for role template object (map)
     * 
     */
    public Map<String,Object> annotations() {
        return this.annotations;
    }
    /**
     * @return (Computed) Builtin role template (string)
     * 
     */
    public Boolean builtin() {
        return this.builtin;
    }
    public String context() {
        return this.context;
    }
    /**
     * @return (Computed) Default role template for new created cluster or project (bool)
     * 
     */
    public Boolean defaultRole() {
        return this.defaultRole;
    }
    /**
     * @return (Computed) Role template description (string)
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return (Computed) External role template (bool)
     * 
     */
    public Boolean external() {
        return this.external;
    }
    /**
     * @return (Computed) Hidden role template (bool)
     * 
     */
    public Boolean hidden() {
        return this.hidden;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Computed) Labels for role template object (map)
     * 
     */
    public Map<String,Object> labels() {
        return this.labels;
    }
    /**
     * @return (Computed) Locked role template (bool)
     * 
     */
    public Boolean locked() {
        return this.locked;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return (Computed) Inherit role template IDs (list)
     * 
     */
    public List<String> roleTemplateIds() {
        return this.roleTemplateIds;
    }
    /**
     * @return (Computed) Role template policy rules (list)
     * 
     */
    public List<GetRoleTemplateRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean administrative;
        private Map<String,Object> annotations;
        private Boolean builtin;
        private String context;
        private Boolean defaultRole;
        private String description;
        private Boolean external;
        private Boolean hidden;
        private String id;
        private Map<String,Object> labels;
        private Boolean locked;
        private String name;
        private List<String> roleTemplateIds;
        private List<GetRoleTemplateRule> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoleTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administrative = defaults.administrative;
    	      this.annotations = defaults.annotations;
    	      this.builtin = defaults.builtin;
    	      this.context = defaults.context;
    	      this.defaultRole = defaults.defaultRole;
    	      this.description = defaults.description;
    	      this.external = defaults.external;
    	      this.hidden = defaults.hidden;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.locked = defaults.locked;
    	      this.name = defaults.name;
    	      this.roleTemplateIds = defaults.roleTemplateIds;
    	      this.rules = defaults.rules;
        }

        public Builder administrative(Boolean administrative) {
            this.administrative = Objects.requireNonNull(administrative);
            return this;
        }
        public Builder annotations(Map<String,Object> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        public Builder builtin(Boolean builtin) {
            this.builtin = Objects.requireNonNull(builtin);
            return this;
        }
        public Builder context(String context) {
            this.context = Objects.requireNonNull(context);
            return this;
        }
        public Builder defaultRole(Boolean defaultRole) {
            this.defaultRole = Objects.requireNonNull(defaultRole);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder external(Boolean external) {
            this.external = Objects.requireNonNull(external);
            return this;
        }
        public Builder hidden(Boolean hidden) {
            this.hidden = Objects.requireNonNull(hidden);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder labels(Map<String,Object> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder locked(Boolean locked) {
            this.locked = Objects.requireNonNull(locked);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder roleTemplateIds(List<String> roleTemplateIds) {
            this.roleTemplateIds = Objects.requireNonNull(roleTemplateIds);
            return this;
        }
        public Builder roleTemplateIds(String... roleTemplateIds) {
            return roleTemplateIds(List.of(roleTemplateIds));
        }
        public Builder rules(List<GetRoleTemplateRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetRoleTemplateRule... rules) {
            return rules(List.of(rules));
        }        public GetRoleTemplateResult build() {
            return new GetRoleTemplateResult(administrative, annotations, builtin, context, defaultRole, description, external, hidden, id, labels, locked, name, roleTemplateIds, rules);
        }
    }
}
