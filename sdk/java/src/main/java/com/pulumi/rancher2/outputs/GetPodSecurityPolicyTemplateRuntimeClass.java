// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPodSecurityPolicyTemplateRuntimeClass {
    private final List<String> allowedRuntimeClassNames;
    private final @Nullable String defaultRuntimeClassName;

    @CustomType.Constructor
    private GetPodSecurityPolicyTemplateRuntimeClass(
        @CustomType.Parameter("allowedRuntimeClassNames") List<String> allowedRuntimeClassNames,
        @CustomType.Parameter("defaultRuntimeClassName") @Nullable String defaultRuntimeClassName) {
        this.allowedRuntimeClassNames = allowedRuntimeClassNames;
        this.defaultRuntimeClassName = defaultRuntimeClassName;
    }

    public List<String> allowedRuntimeClassNames() {
        return this.allowedRuntimeClassNames;
    }
    public Optional<String> defaultRuntimeClassName() {
        return Optional.ofNullable(this.defaultRuntimeClassName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPodSecurityPolicyTemplateRuntimeClass defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedRuntimeClassNames;
        private @Nullable String defaultRuntimeClassName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPodSecurityPolicyTemplateRuntimeClass defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedRuntimeClassNames = defaults.allowedRuntimeClassNames;
    	      this.defaultRuntimeClassName = defaults.defaultRuntimeClassName;
        }

        public Builder allowedRuntimeClassNames(List<String> allowedRuntimeClassNames) {
            this.allowedRuntimeClassNames = Objects.requireNonNull(allowedRuntimeClassNames);
            return this;
        }
        public Builder allowedRuntimeClassNames(String... allowedRuntimeClassNames) {
            return allowedRuntimeClassNames(List.of(allowedRuntimeClassNames));
        }
        public Builder defaultRuntimeClassName(@Nullable String defaultRuntimeClassName) {
            this.defaultRuntimeClassName = defaultRuntimeClassName;
            return this;
        }        public GetPodSecurityPolicyTemplateRuntimeClass build() {
            return new GetPodSecurityPolicyTemplateRuntimeClass(allowedRuntimeClassNames, defaultRuntimeClassName);
        }
    }
}
