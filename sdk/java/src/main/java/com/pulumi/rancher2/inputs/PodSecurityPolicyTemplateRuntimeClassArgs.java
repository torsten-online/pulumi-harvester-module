// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PodSecurityPolicyTemplateRuntimeClassArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodSecurityPolicyTemplateRuntimeClassArgs Empty = new PodSecurityPolicyTemplateRuntimeClassArgs();

    /**
     * (list)
     * 
     */
    @Import(name="allowedRuntimeClassNames", required=true)
    private Output<List<String>> allowedRuntimeClassNames;

    /**
     * @return (list)
     * 
     */
    public Output<List<String>> allowedRuntimeClassNames() {
        return this.allowedRuntimeClassNames;
    }

    /**
     * (string)
     * 
     */
    @Import(name="defaultRuntimeClassName")
    private @Nullable Output<String> defaultRuntimeClassName;

    /**
     * @return (string)
     * 
     */
    public Optional<Output<String>> defaultRuntimeClassName() {
        return Optional.ofNullable(this.defaultRuntimeClassName);
    }

    private PodSecurityPolicyTemplateRuntimeClassArgs() {}

    private PodSecurityPolicyTemplateRuntimeClassArgs(PodSecurityPolicyTemplateRuntimeClassArgs $) {
        this.allowedRuntimeClassNames = $.allowedRuntimeClassNames;
        this.defaultRuntimeClassName = $.defaultRuntimeClassName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PodSecurityPolicyTemplateRuntimeClassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PodSecurityPolicyTemplateRuntimeClassArgs $;

        public Builder() {
            $ = new PodSecurityPolicyTemplateRuntimeClassArgs();
        }

        public Builder(PodSecurityPolicyTemplateRuntimeClassArgs defaults) {
            $ = new PodSecurityPolicyTemplateRuntimeClassArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedRuntimeClassNames (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedRuntimeClassNames(Output<List<String>> allowedRuntimeClassNames) {
            $.allowedRuntimeClassNames = allowedRuntimeClassNames;
            return this;
        }

        /**
         * @param allowedRuntimeClassNames (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedRuntimeClassNames(List<String> allowedRuntimeClassNames) {
            return allowedRuntimeClassNames(Output.of(allowedRuntimeClassNames));
        }

        /**
         * @param allowedRuntimeClassNames (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedRuntimeClassNames(String... allowedRuntimeClassNames) {
            return allowedRuntimeClassNames(List.of(allowedRuntimeClassNames));
        }

        /**
         * @param defaultRuntimeClassName (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultRuntimeClassName(@Nullable Output<String> defaultRuntimeClassName) {
            $.defaultRuntimeClassName = defaultRuntimeClassName;
            return this;
        }

        /**
         * @param defaultRuntimeClassName (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultRuntimeClassName(String defaultRuntimeClassName) {
            return defaultRuntimeClassName(Output.of(defaultRuntimeClassName));
        }

        public PodSecurityPolicyTemplateRuntimeClassArgs build() {
            if ($.allowedRuntimeClassNames == null) {
                throw new MissingRequiredPropertyException("PodSecurityPolicyTemplateRuntimeClassArgs", "allowedRuntimeClassNames");
            }
            return $;
        }
    }

}
