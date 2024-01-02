// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetProjectAlertGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectAlertGroupArgs Empty = new GetProjectAlertGroupArgs();

    /**
     * The project alert group name (string)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The project alert group name (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The project id where create project alert group (string)
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The project id where create project alert group (string)
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private GetProjectAlertGroupArgs() {}

    private GetProjectAlertGroupArgs(GetProjectAlertGroupArgs $) {
        this.name = $.name;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectAlertGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectAlertGroupArgs $;

        public Builder() {
            $ = new GetProjectAlertGroupArgs();
        }

        public Builder(GetProjectAlertGroupArgs defaults) {
            $ = new GetProjectAlertGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The project alert group name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The project alert group name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId The project id where create project alert group (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The project id where create project alert group (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetProjectAlertGroupArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetProjectAlertGroupArgs", "name");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetProjectAlertGroupArgs", "projectId");
            }
            return $;
        }
    }

}
