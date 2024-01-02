// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterAlterRuleSystemServiceRule {
    private @Nullable String condition;

    private ClusterAlterRuleSystemServiceRule() {}
    public Optional<String> condition() {
        return Optional.ofNullable(this.condition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAlterRuleSystemServiceRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String condition;
        public Builder() {}
        public Builder(ClusterAlterRuleSystemServiceRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
        }

        @CustomType.Setter
        public Builder condition(@Nullable String condition) {

            this.condition = condition;
            return this;
        }
        public ClusterAlterRuleSystemServiceRule build() {
            final var _resultValue = new ClusterAlterRuleSystemServiceRule();
            _resultValue.condition = condition;
            return _resultValue;
        }
    }
}
