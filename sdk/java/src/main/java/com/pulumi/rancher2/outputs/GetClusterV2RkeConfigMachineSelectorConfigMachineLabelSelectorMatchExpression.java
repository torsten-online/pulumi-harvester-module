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
    private final @Nullable String key;
    private final @Nullable String operator;
    private final @Nullable List<String> values;

    @CustomType.Constructor
    private GetClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpression(
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("operator") @Nullable String operator,
        @CustomType.Parameter("values") @Nullable List<String> values) {
        this.key = key;
        this.operator = operator;
        this.values = values;
    }

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

    public static final class Builder {
        private @Nullable String key;
        private @Nullable String operator;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpression defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public GetClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpression build() {
            return new GetClusterV2RkeConfigMachineSelectorConfigMachineLabelSelectorMatchExpression(key, operator, values);
        }
    }
}
