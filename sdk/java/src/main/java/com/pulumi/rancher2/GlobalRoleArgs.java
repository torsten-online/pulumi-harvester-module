// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.GlobalRoleRuleArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalRoleArgs Empty = new GlobalRoleArgs();

    /**
     * Annotations for global role object (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for global role object (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Global role description (string)
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Global role description (string)
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Labels for global role object (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels for global role object (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Global role name (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Global role name (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Whether or not this role should be added to new users. Default `false` (bool)
     * 
     */
    @Import(name="newUserDefault")
    private @Nullable Output<Boolean> newUserDefault;

    /**
     * @return Whether or not this role should be added to new users. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> newUserDefault() {
        return Optional.ofNullable(this.newUserDefault);
    }

    /**
     * Global role policy rules (list)
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<GlobalRoleRuleArgs>> rules;

    /**
     * @return Global role policy rules (list)
     * 
     */
    public Optional<Output<List<GlobalRoleRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private GlobalRoleArgs() {}

    private GlobalRoleArgs(GlobalRoleArgs $) {
        this.annotations = $.annotations;
        this.description = $.description;
        this.labels = $.labels;
        this.name = $.name;
        this.newUserDefault = $.newUserDefault;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalRoleArgs $;

        public Builder() {
            $ = new GlobalRoleArgs();
        }

        public Builder(GlobalRoleArgs defaults) {
            $ = new GlobalRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations for global role object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for global role object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param description Global role description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Global role description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels Labels for global role object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for global role object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name Global role name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Global role name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param newUserDefault Whether or not this role should be added to new users. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder newUserDefault(@Nullable Output<Boolean> newUserDefault) {
            $.newUserDefault = newUserDefault;
            return this;
        }

        /**
         * @param newUserDefault Whether or not this role should be added to new users. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder newUserDefault(Boolean newUserDefault) {
            return newUserDefault(Output.of(newUserDefault));
        }

        /**
         * @param rules Global role policy rules (list)
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<GlobalRoleRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Global role policy rules (list)
         * 
         * @return builder
         * 
         */
        public Builder rules(List<GlobalRoleRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules Global role policy rules (list)
         * 
         * @return builder
         * 
         */
        public Builder rules(GlobalRoleRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public GlobalRoleArgs build() {
            return $;
        }
    }

}
