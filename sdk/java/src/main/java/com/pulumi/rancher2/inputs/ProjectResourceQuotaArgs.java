// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.inputs.ProjectResourceQuotaNamespaceDefaultLimitArgs;
import com.pulumi.rancher2.inputs.ProjectResourceQuotaProjectLimitArgs;
import java.util.Objects;


public final class ProjectResourceQuotaArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectResourceQuotaArgs Empty = new ProjectResourceQuotaArgs();

    @Import(name="namespaceDefaultLimit", required=true)
    private Output<ProjectResourceQuotaNamespaceDefaultLimitArgs> namespaceDefaultLimit;

    public Output<ProjectResourceQuotaNamespaceDefaultLimitArgs> namespaceDefaultLimit() {
        return this.namespaceDefaultLimit;
    }

    @Import(name="projectLimit", required=true)
    private Output<ProjectResourceQuotaProjectLimitArgs> projectLimit;

    public Output<ProjectResourceQuotaProjectLimitArgs> projectLimit() {
        return this.projectLimit;
    }

    private ProjectResourceQuotaArgs() {}

    private ProjectResourceQuotaArgs(ProjectResourceQuotaArgs $) {
        this.namespaceDefaultLimit = $.namespaceDefaultLimit;
        this.projectLimit = $.projectLimit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectResourceQuotaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectResourceQuotaArgs $;

        public Builder() {
            $ = new ProjectResourceQuotaArgs();
        }

        public Builder(ProjectResourceQuotaArgs defaults) {
            $ = new ProjectResourceQuotaArgs(Objects.requireNonNull(defaults));
        }

        public Builder namespaceDefaultLimit(Output<ProjectResourceQuotaNamespaceDefaultLimitArgs> namespaceDefaultLimit) {
            $.namespaceDefaultLimit = namespaceDefaultLimit;
            return this;
        }

        public Builder namespaceDefaultLimit(ProjectResourceQuotaNamespaceDefaultLimitArgs namespaceDefaultLimit) {
            return namespaceDefaultLimit(Output.of(namespaceDefaultLimit));
        }

        public Builder projectLimit(Output<ProjectResourceQuotaProjectLimitArgs> projectLimit) {
            $.projectLimit = projectLimit;
            return this;
        }

        public Builder projectLimit(ProjectResourceQuotaProjectLimitArgs projectLimit) {
            return projectLimit(Output.of(projectLimit));
        }

        public ProjectResourceQuotaArgs build() {
            if ($.namespaceDefaultLimit == null) {
                throw new MissingRequiredPropertyException("ProjectResourceQuotaArgs", "namespaceDefaultLimit");
            }
            if ($.projectLimit == null) {
                throw new MissingRequiredPropertyException("ProjectResourceQuotaArgs", "projectLimit");
            }
            return $;
        }
    }

}
