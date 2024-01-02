// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterTemplateTemplateRevisionQuestionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterTemplateTemplateRevisionQuestionArgs Empty = new ClusterTemplateTemplateRevisionQuestionArgs();

    /**
     * Default variable value (string)
     * 
     */
    @Import(name="default", required=true)
    private Output<String> default_;

    /**
     * @return Default variable value (string)
     * 
     */
    public Output<String> default_() {
        return this.default_;
    }

    /**
     * Required variable. Default `false` (bool)
     * 
     */
    @Import(name="required")
    private @Nullable Output<Boolean> required;

    /**
     * @return Required variable. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> required() {
        return Optional.ofNullable(this.required);
    }

    /**
     * Variable type. `boolean`, `int` and `string` are allowed. Default `string` (string)
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Variable type. `boolean`, `int` and `string` are allowed. Default `string` (string)
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Variable name (string)
     * 
     */
    @Import(name="variable", required=true)
    private Output<String> variable;

    /**
     * @return Variable name (string)
     * 
     */
    public Output<String> variable() {
        return this.variable;
    }

    private ClusterTemplateTemplateRevisionQuestionArgs() {}

    private ClusterTemplateTemplateRevisionQuestionArgs(ClusterTemplateTemplateRevisionQuestionArgs $) {
        this.default_ = $.default_;
        this.required = $.required;
        this.type = $.type;
        this.variable = $.variable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTemplateTemplateRevisionQuestionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTemplateTemplateRevisionQuestionArgs $;

        public Builder() {
            $ = new ClusterTemplateTemplateRevisionQuestionArgs();
        }

        public Builder(ClusterTemplateTemplateRevisionQuestionArgs defaults) {
            $ = new ClusterTemplateTemplateRevisionQuestionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param default_ Default variable value (string)
         * 
         * @return builder
         * 
         */
        public Builder default_(Output<String> default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param default_ Default variable value (string)
         * 
         * @return builder
         * 
         */
        public Builder default_(String default_) {
            return default_(Output.of(default_));
        }

        /**
         * @param required Required variable. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder required(@Nullable Output<Boolean> required) {
            $.required = required;
            return this;
        }

        /**
         * @param required Required variable. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder required(Boolean required) {
            return required(Output.of(required));
        }

        /**
         * @param type Variable type. `boolean`, `int` and `string` are allowed. Default `string` (string)
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Variable type. `boolean`, `int` and `string` are allowed. Default `string` (string)
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param variable Variable name (string)
         * 
         * @return builder
         * 
         */
        public Builder variable(Output<String> variable) {
            $.variable = variable;
            return this;
        }

        /**
         * @param variable Variable name (string)
         * 
         * @return builder
         * 
         */
        public Builder variable(String variable) {
            return variable(Output.of(variable));
        }

        public ClusterTemplateTemplateRevisionQuestionArgs build() {
            if ($.default_ == null) {
                throw new MissingRequiredPropertyException("ClusterTemplateTemplateRevisionQuestionArgs", "default_");
            }
            if ($.variable == null) {
                throw new MissingRequiredPropertyException("ClusterTemplateTemplateRevisionQuestionArgs", "variable");
            }
            return $;
        }
    }

}
