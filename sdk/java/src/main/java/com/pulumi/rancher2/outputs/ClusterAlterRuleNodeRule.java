// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterAlterRuleNodeRule {
    private @Nullable String condition;
    private @Nullable Integer cpuThreshold;
    private @Nullable Integer memThreshold;
    private @Nullable String nodeId;
    private @Nullable Map<String,Object> selector;

    private ClusterAlterRuleNodeRule() {}
    public Optional<String> condition() {
        return Optional.ofNullable(this.condition);
    }
    public Optional<Integer> cpuThreshold() {
        return Optional.ofNullable(this.cpuThreshold);
    }
    public Optional<Integer> memThreshold() {
        return Optional.ofNullable(this.memThreshold);
    }
    public Optional<String> nodeId() {
        return Optional.ofNullable(this.nodeId);
    }
    public Map<String,Object> selector() {
        return this.selector == null ? Map.of() : this.selector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAlterRuleNodeRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String condition;
        private @Nullable Integer cpuThreshold;
        private @Nullable Integer memThreshold;
        private @Nullable String nodeId;
        private @Nullable Map<String,Object> selector;
        public Builder() {}
        public Builder(ClusterAlterRuleNodeRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.cpuThreshold = defaults.cpuThreshold;
    	      this.memThreshold = defaults.memThreshold;
    	      this.nodeId = defaults.nodeId;
    	      this.selector = defaults.selector;
        }

        @CustomType.Setter
        public Builder condition(@Nullable String condition) {
            this.condition = condition;
            return this;
        }
        @CustomType.Setter
        public Builder cpuThreshold(@Nullable Integer cpuThreshold) {
            this.cpuThreshold = cpuThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder memThreshold(@Nullable Integer memThreshold) {
            this.memThreshold = memThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder nodeId(@Nullable String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        @CustomType.Setter
        public Builder selector(@Nullable Map<String,Object> selector) {
            this.selector = selector;
            return this;
        }
        public ClusterAlterRuleNodeRule build() {
            final var _resultValue = new ClusterAlterRuleNodeRule();
            _resultValue.condition = condition;
            _resultValue.cpuThreshold = cpuThreshold;
            _resultValue.memThreshold = memThreshold;
            _resultValue.nodeId = nodeId;
            _resultValue.selector = selector;
            return _resultValue;
        }
    }
}
