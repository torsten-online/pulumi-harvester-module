// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ProjectResourceQuotaNamespaceDefaultLimit;
import com.pulumi.rancher2.outputs.ProjectResourceQuotaProjectLimit;
import java.util.Objects;

@CustomType
public final class ProjectResourceQuota {
    /**
     * @return Default resource quota limit for  namespaces in project (list maxitems:1)
     * 
     */
    private ProjectResourceQuotaNamespaceDefaultLimit namespaceDefaultLimit;
    /**
     * @return Resource quota limit for project (list maxitems:1)
     * 
     */
    private ProjectResourceQuotaProjectLimit projectLimit;

    private ProjectResourceQuota() {}
    /**
     * @return Default resource quota limit for  namespaces in project (list maxitems:1)
     * 
     */
    public ProjectResourceQuotaNamespaceDefaultLimit namespaceDefaultLimit() {
        return this.namespaceDefaultLimit;
    }
    /**
     * @return Resource quota limit for project (list maxitems:1)
     * 
     */
    public ProjectResourceQuotaProjectLimit projectLimit() {
        return this.projectLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectResourceQuota defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ProjectResourceQuotaNamespaceDefaultLimit namespaceDefaultLimit;
        private ProjectResourceQuotaProjectLimit projectLimit;
        public Builder() {}
        public Builder(ProjectResourceQuota defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaceDefaultLimit = defaults.namespaceDefaultLimit;
    	      this.projectLimit = defaults.projectLimit;
        }

        @CustomType.Setter
        public Builder namespaceDefaultLimit(ProjectResourceQuotaNamespaceDefaultLimit namespaceDefaultLimit) {
            this.namespaceDefaultLimit = Objects.requireNonNull(namespaceDefaultLimit);
            return this;
        }
        @CustomType.Setter
        public Builder projectLimit(ProjectResourceQuotaProjectLimit projectLimit) {
            this.projectLimit = Objects.requireNonNull(projectLimit);
            return this;
        }
        public ProjectResourceQuota build() {
            final var _resultValue = new ProjectResourceQuota();
            _resultValue.namespaceDefaultLimit = namespaceDefaultLimit;
            _resultValue.projectLimit = projectLimit;
            return _resultValue;
        }
    }
}
