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
public final class GetClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpression {
    private @Nullable String key;
    private @Nullable String operator;
    private @Nullable List<String> values;

    private GetClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpression() {}
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpression defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String key;
        private @Nullable String operator;
        private @Nullable List<String> values;
        public Builder() {}
        public Builder(GetClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpression defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public GetClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpression build() {
            final var o = new GetClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpression();
            o.key = key;
            o.operator = operator;
            o.values = values;
            return o;
        }
    }
}
