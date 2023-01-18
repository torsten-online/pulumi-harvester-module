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
public final class ClusterAlertRuleNodeRule {
    /**
     * @return Node rule condition. Supported values : `&#34;cpu&#34; | &#34;mem&#34; | &#34;notready&#34;`. Default: `notready` (string)
     * 
     */
    private @Nullable String condition;
    /**
     * @return Node rule cpu threshold. Default: `70` (int)
     * 
     */
    private @Nullable Integer cpuThreshold;
    /**
     * @return Node rule mem threshold. Default: `70` (int)
     * 
     */
    private @Nullable Integer memThreshold;
    /**
     * @return Node ID (string)
     * 
     */
    private @Nullable String nodeId;
    /**
     * @return Node rule selector (map)
     * 
     */
    private @Nullable Map<String,Object> selector;

    private ClusterAlertRuleNodeRule() {}
    /**
     * @return Node rule condition. Supported values : `&#34;cpu&#34; | &#34;mem&#34; | &#34;notready&#34;`. Default: `notready` (string)
     * 
     */
    public Optional<String> condition() {
        return Optional.ofNullable(this.condition);
    }
    /**
     * @return Node rule cpu threshold. Default: `70` (int)
     * 
     */
    public Optional<Integer> cpuThreshold() {
        return Optional.ofNullable(this.cpuThreshold);
    }
    /**
     * @return Node rule mem threshold. Default: `70` (int)
     * 
     */
    public Optional<Integer> memThreshold() {
        return Optional.ofNullable(this.memThreshold);
    }
    /**
     * @return Node ID (string)
     * 
     */
    public Optional<String> nodeId() {
        return Optional.ofNullable(this.nodeId);
    }
    /**
     * @return Node rule selector (map)
     * 
     */
    public Map<String,Object> selector() {
        return this.selector == null ? Map.of() : this.selector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAlertRuleNodeRule defaults) {
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
        public Builder(ClusterAlertRuleNodeRule defaults) {
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
        public ClusterAlertRuleNodeRule build() {
            final var o = new ClusterAlertRuleNodeRule();
            o.condition = condition;
            o.cpuThreshold = cpuThreshold;
            o.memThreshold = memThreshold;
            o.nodeId = nodeId;
            o.selector = selector;
            return o;
        }
    }
}
