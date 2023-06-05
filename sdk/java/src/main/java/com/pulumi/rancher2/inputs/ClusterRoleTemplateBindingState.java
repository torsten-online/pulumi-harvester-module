// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRoleTemplateBindingState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRoleTemplateBindingState Empty = new ClusterRoleTemplateBindingState();

    /**
     * Annotations for cluster role template binding (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for cluster role template binding (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The cluster id where bind cluster role template binding (string)
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return The cluster id where bind cluster role template binding (string)
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * The group ID to assign cluster role template binding (string)
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return The group ID to assign cluster role template binding (string)
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * The group_principal ID to assign cluster role template binding (string)
     * 
     */
    @Import(name="groupPrincipalId")
    private @Nullable Output<String> groupPrincipalId;

    /**
     * @return The group_principal ID to assign cluster role template binding (string)
     * 
     */
    public Optional<Output<String>> groupPrincipalId() {
        return Optional.ofNullable(this.groupPrincipalId);
    }

    /**
     * Labels for cluster role template binding (map)
     * 
     * **Note** user `user_id | user_principal_id` OR group `group_id | group_principal_id` must be defined
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels for cluster role template binding (map)
     * 
     * **Note** user `user_id | user_principal_id` OR group `group_id | group_principal_id` must be defined
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the cluster role template binding (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the cluster role template binding (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The role template id from create cluster role template binding (string)
     * 
     */
    @Import(name="roleTemplateId")
    private @Nullable Output<String> roleTemplateId;

    /**
     * @return The role template id from create cluster role template binding (string)
     * 
     */
    public Optional<Output<String>> roleTemplateId() {
        return Optional.ofNullable(this.roleTemplateId);
    }

    /**
     * The user ID to assign cluster role template binding (string)
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return The user ID to assign cluster role template binding (string)
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    /**
     * The user_principal ID to assign cluster role template binding (string)
     * 
     */
    @Import(name="userPrincipalId")
    private @Nullable Output<String> userPrincipalId;

    /**
     * @return The user_principal ID to assign cluster role template binding (string)
     * 
     */
    public Optional<Output<String>> userPrincipalId() {
        return Optional.ofNullable(this.userPrincipalId);
    }

    private ClusterRoleTemplateBindingState() {}

    private ClusterRoleTemplateBindingState(ClusterRoleTemplateBindingState $) {
        this.annotations = $.annotations;
        this.clusterId = $.clusterId;
        this.groupId = $.groupId;
        this.groupPrincipalId = $.groupPrincipalId;
        this.labels = $.labels;
        this.name = $.name;
        this.roleTemplateId = $.roleTemplateId;
        this.userId = $.userId;
        this.userPrincipalId = $.userPrincipalId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRoleTemplateBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRoleTemplateBindingState $;

        public Builder() {
            $ = new ClusterRoleTemplateBindingState();
        }

        public Builder(ClusterRoleTemplateBindingState defaults) {
            $ = new ClusterRoleTemplateBindingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations for cluster role template binding (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for cluster role template binding (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param clusterId The cluster id where bind cluster role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The cluster id where bind cluster role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param groupId The group ID to assign cluster role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The group ID to assign cluster role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param groupPrincipalId The group_principal ID to assign cluster role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder groupPrincipalId(@Nullable Output<String> groupPrincipalId) {
            $.groupPrincipalId = groupPrincipalId;
            return this;
        }

        /**
         * @param groupPrincipalId The group_principal ID to assign cluster role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder groupPrincipalId(String groupPrincipalId) {
            return groupPrincipalId(Output.of(groupPrincipalId));
        }

        /**
         * @param labels Labels for cluster role template binding (map)
         * 
         * **Note** user `user_id | user_principal_id` OR group `group_id | group_principal_id` must be defined
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for cluster role template binding (map)
         * 
         * **Note** user `user_id | user_principal_id` OR group `group_id | group_principal_id` must be defined
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The name of the cluster role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the cluster role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param roleTemplateId The role template id from create cluster role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder roleTemplateId(@Nullable Output<String> roleTemplateId) {
            $.roleTemplateId = roleTemplateId;
            return this;
        }

        /**
         * @param roleTemplateId The role template id from create cluster role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder roleTemplateId(String roleTemplateId) {
            return roleTemplateId(Output.of(roleTemplateId));
        }

        /**
         * @param userId The user ID to assign cluster role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The user ID to assign cluster role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        /**
         * @param userPrincipalId The user_principal ID to assign cluster role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder userPrincipalId(@Nullable Output<String> userPrincipalId) {
            $.userPrincipalId = userPrincipalId;
            return this;
        }

        /**
         * @param userPrincipalId The user_principal ID to assign cluster role template binding (string)
         * 
         * @return builder
         * 
         */
        public Builder userPrincipalId(String userPrincipalId) {
            return userPrincipalId(Output.of(userPrincipalId));
        }

        public ClusterRoleTemplateBindingState build() {
            return $;
        }
    }

}
