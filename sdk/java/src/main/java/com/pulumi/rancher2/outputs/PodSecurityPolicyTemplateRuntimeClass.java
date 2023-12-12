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
public final class PodSecurityPolicyTemplateRuntimeClass {
    /**
     * @return (list)
     * 
     */
    private List<String> allowedRuntimeClassNames;
    /**
     * @return (string)
     * 
     */
    private @Nullable String defaultRuntimeClassName;

    private PodSecurityPolicyTemplateRuntimeClass() {}
    /**
     * @return (list)
     * 
     */
    public List<String> allowedRuntimeClassNames() {
        return this.allowedRuntimeClassNames;
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> defaultRuntimeClassName() {
        return Optional.ofNullable(this.defaultRuntimeClassName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodSecurityPolicyTemplateRuntimeClass defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowedRuntimeClassNames;
        private @Nullable String defaultRuntimeClassName;
        public Builder() {}
        public Builder(PodSecurityPolicyTemplateRuntimeClass defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedRuntimeClassNames = defaults.allowedRuntimeClassNames;
    	      this.defaultRuntimeClassName = defaults.defaultRuntimeClassName;
        }

        @CustomType.Setter
        public Builder allowedRuntimeClassNames(List<String> allowedRuntimeClassNames) {
            this.allowedRuntimeClassNames = Objects.requireNonNull(allowedRuntimeClassNames);
            return this;
        }
        public Builder allowedRuntimeClassNames(String... allowedRuntimeClassNames) {
            return allowedRuntimeClassNames(List.of(allowedRuntimeClassNames));
        }
        @CustomType.Setter
        public Builder defaultRuntimeClassName(@Nullable String defaultRuntimeClassName) {
            this.defaultRuntimeClassName = defaultRuntimeClassName;
            return this;
        }
        public PodSecurityPolicyTemplateRuntimeClass build() {
            final var _resultValue = new PodSecurityPolicyTemplateRuntimeClass();
            _resultValue.allowedRuntimeClassNames = allowedRuntimeClassNames;
            _resultValue.defaultRuntimeClassName = defaultRuntimeClassName;
            return _resultValue;
        }
    }
}
