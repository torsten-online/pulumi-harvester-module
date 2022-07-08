// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs Empty = new PodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs();

    /**
     * (string)
     * 
     */
    @Import(name="level")
    private @Nullable Output<String> level;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> level() {
        return Optional.ofNullable(this.level);
    }

    /**
     * (string)
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * (string)
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * (string)
     * 
     */
    @Import(name="user")
    private @Nullable Output<String> user;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    private PodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs() {}

    private PodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs(PodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs $) {
        this.level = $.level;
        this.role = $.role;
        this.type = $.type;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs $;

        public Builder() {
            $ = new PodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs();
        }

        public Builder(PodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs defaults) {
            $ = new PodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param level (string)
         * 
         * @return builder
         * 
         */
        public Builder level(@Nullable Output<String> level) {
            $.level = level;
            return this;
        }

        /**
         * @param level (string)
         * 
         * @return builder
         * 
         */
        public Builder level(String level) {
            return level(Output.of(level));
        }

        /**
         * @param role (string)
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role (string)
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param type (string)
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type (string)
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param user (string)
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user (string)
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public PodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs build() {
            return $;
        }
    }

}
