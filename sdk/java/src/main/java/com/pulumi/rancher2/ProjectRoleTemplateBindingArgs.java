// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectRoleTemplateBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectRoleTemplateBindingArgs Empty = new ProjectRoleTemplateBindingArgs();

    /**
     * Annotations of the resource (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return Annotations of the resource (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The group ID to assign project role template binding (string)
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return The group ID to assign project role template binding (string)
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * The group_principal ID to assign project role template binding (string)
     * 
     */
    @Import(name="groupPrincipalId")
    private @Nullable Output<String> groupPrincipalId;

    /**
     * @return The group_principal ID to assign project role template binding (string)
     * 
     */
    public Optional<Output<String>> groupPrincipalId() {
        return Optional.ofNullable(this.groupPrincipalId);
    }

    /**
     * Labels of the resource (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels of the resource (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the project role template binding (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the project role template binding (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The project id where bind project role template (string)
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The project id where bind project role template (string)
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * The role template id from create project role template binding (string)
     * 
     */
    @Import(name="roleTemplateId", required=true)
    private Output<String> roleTemplateId;

    /**
     * @return The role template id from create project role template binding (string)
     * 
     */
    public Output<String> roleTemplateId() {
        return this.roleTemplateId;
    }

    /**
     * The user ID to assign project role template binding (string)
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return The user ID to assign project role template binding (string)
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    /**
     * The user_principal ID to assign project role template binding (string)
     * 
     */
    @Import(name="userPrincipalId")
    private @Nullable Output<String> userPrincipalId;

    /**
     * @return The user_principal ID to assign project role template binding (string)
     * 
     */
    public Optional<Output<String>> userPrincipalId() {
        return Optional.ofNullable(this.userPrincipalId);
    }

    private ProjectRoleTemplateBindingArgs() {}

    private ProjectRoleTemplateBindingArgs(ProjectRoleTemplateBindingArgs $) {
        this.annotations = $.annotations;
        this.groupId = $.groupId;
        this.groupPrincipalId = $.groupPrincipalId;
        this.labels = $.labels;
        this.name = $.name;
        this.projectId = $.projectId;
        this.roleTemplateId = $.roleTemplateId;
        this.userId = $.userId;
        this.userPrincipalId = $.userPrincipalId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectRoleTemplateBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectRoleTemplateBindingArgs $;

        public Builder() {
            $ = new ProjectRoleTemplateBindingArgs();
        }

        public Builder(ProjectRoleTemplateBindingArgs defaults) {
            $ = new ProjectRoleTemplateBindingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param groupId The group ID to assign project role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The group ID to assign project role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param groupPrincipalId The group_principal ID to assign project role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder groupPrincipalId(@Nullable Output<String> groupPrincipalId) {
            $.groupPrincipalId = groupPrincipalId;
            return this;
        }

        /**
         * @param groupPrincipalId The group_principal ID to assign project role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder groupPrincipalId(String groupPrincipalId) {
            return groupPrincipalId(Output.of(groupPrincipalId));
        }

        /**
         * @param labels Labels of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The name of the project role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the project role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId The project id where bind project role template (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The project id where bind project role template (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param roleTemplateId The role template id from create project role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder roleTemplateId(Output<String> roleTemplateId) {
            $.roleTemplateId = roleTemplateId;
            return this;
        }

        /**
         * @param roleTemplateId The role template id from create project role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder roleTemplateId(String roleTemplateId) {
            return roleTemplateId(Output.of(roleTemplateId));
        }

        /**
         * @param userId The user ID to assign project role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The user ID to assign project role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        /**
         * @param userPrincipalId The user_principal ID to assign project role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder userPrincipalId(@Nullable Output<String> userPrincipalId) {
            $.userPrincipalId = userPrincipalId;
            return this;
        }

        /**
         * @param userPrincipalId The user_principal ID to assign project role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder userPrincipalId(String userPrincipalId) {
            return userPrincipalId(Output.of(userPrincipalId));
        }

        public ProjectRoleTemplateBindingArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.roleTemplateId = Objects.requireNonNull($.roleTemplateId, "expected parameter 'roleTemplateId' to be non-null");
            return $;
        }
    }

}
