// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RoleTemplateRule {
    /**
     * @return Policy rule api groups (list)
     * 
     */
    private @Nullable List<String> apiGroups;
    /**
     * @return Policy rule non resource urls (list)
     * 
     */
    private @Nullable List<String> nonResourceUrls;
    /**
     * @return Policy rule resource names (list)
     * 
     */
    private @Nullable List<String> resourceNames;
    /**
     * @return Policy rule resources (list)
     * 
     */
    private @Nullable List<String> resources;
    /**
     * @return Policy rule verbs. `bind`, `create`, `delete`, `deletecollection`, `escalate`, `get`, `impersonate`, `list`, `patch`, `update`, `use`, `view`, `watch`, `own` and `*` values are supported (list)
     * 
     */
    private @Nullable List<String> verbs;

    private RoleTemplateRule() {}
    /**
     * @return Policy rule api groups (list)
     * 
     */
    public List<String> apiGroups() {
        return this.apiGroups == null ? List.of() : this.apiGroups;
    }
    /**
     * @return Policy rule non resource urls (list)
     * 
     */
    public List<String> nonResourceUrls() {
        return this.nonResourceUrls == null ? List.of() : this.nonResourceUrls;
    }
    /**
     * @return Policy rule resource names (list)
     * 
     */
    public List<String> resourceNames() {
        return this.resourceNames == null ? List.of() : this.resourceNames;
    }
    /**
     * @return Policy rule resources (list)
     * 
     */
    public List<String> resources() {
        return this.resources == null ? List.of() : this.resources;
    }
    /**
     * @return Policy rule verbs. `bind`, `create`, `delete`, `deletecollection`, `escalate`, `get`, `impersonate`, `list`, `patch`, `update`, `use`, `view`, `watch`, `own` and `*` values are supported (list)
     * 
     */
    public List<String> verbs() {
        return this.verbs == null ? List.of() : this.verbs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleTemplateRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> apiGroups;
        private @Nullable List<String> nonResourceUrls;
        private @Nullable List<String> resourceNames;
        private @Nullable List<String> resources;
        private @Nullable List<String> verbs;
        public Builder() {}
        public Builder(RoleTemplateRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroups = defaults.apiGroups;
    	      this.nonResourceUrls = defaults.nonResourceUrls;
    	      this.resourceNames = defaults.resourceNames;
    	      this.resources = defaults.resources;
    	      this.verbs = defaults.verbs;
        }

        @CustomType.Setter
        public Builder apiGroups(@Nullable List<String> apiGroups) {
            this.apiGroups = apiGroups;
            return this;
        }
        public Builder apiGroups(String... apiGroups) {
            return apiGroups(List.of(apiGroups));
        }
        @CustomType.Setter
        public Builder nonResourceUrls(@Nullable List<String> nonResourceUrls) {
            this.nonResourceUrls = nonResourceUrls;
            return this;
        }
        public Builder nonResourceUrls(String... nonResourceUrls) {
            return nonResourceUrls(List.of(nonResourceUrls));
        }
        @CustomType.Setter
        public Builder resourceNames(@Nullable List<String> resourceNames) {
            this.resourceNames = resourceNames;
            return this;
        }
        public Builder resourceNames(String... resourceNames) {
            return resourceNames(List.of(resourceNames));
        }
        @CustomType.Setter
        public Builder resources(@Nullable List<String> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }
        @CustomType.Setter
        public Builder verbs(@Nullable List<String> verbs) {
            this.verbs = verbs;
            return this;
        }
        public Builder verbs(String... verbs) {
            return verbs(List.of(verbs));
        }
        public RoleTemplateRule build() {
            final var o = new RoleTemplateRule();
            o.apiGroups = apiGroups;
            o.nonResourceUrls = nonResourceUrls;
            o.resourceNames = resourceNames;
            o.resources = resources;
            o.verbs = verbs;
            return o;
        }
    }
}
