// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsLinearAutoscalerParams {
    private @Nullable Double coresPerReplica;
    private @Nullable Integer max;
    private @Nullable Integer min;
    private @Nullable Double nodesPerReplica;
    private @Nullable Boolean preventSinglePointFailure;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsLinearAutoscalerParams() {}
    public Optional<Double> coresPerReplica() {
        return Optional.ofNullable(this.coresPerReplica);
    }
    public Optional<Integer> max() {
        return Optional.ofNullable(this.max);
    }
    public Optional<Integer> min() {
        return Optional.ofNullable(this.min);
    }
    public Optional<Double> nodesPerReplica() {
        return Optional.ofNullable(this.nodesPerReplica);
    }
    public Optional<Boolean> preventSinglePointFailure() {
        return Optional.ofNullable(this.preventSinglePointFailure);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsLinearAutoscalerParams defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Double coresPerReplica;
        private @Nullable Integer max;
        private @Nullable Integer min;
        private @Nullable Double nodesPerReplica;
        private @Nullable Boolean preventSinglePointFailure;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsLinearAutoscalerParams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coresPerReplica = defaults.coresPerReplica;
    	      this.max = defaults.max;
    	      this.min = defaults.min;
    	      this.nodesPerReplica = defaults.nodesPerReplica;
    	      this.preventSinglePointFailure = defaults.preventSinglePointFailure;
        }

        @CustomType.Setter
        public Builder coresPerReplica(@Nullable Double coresPerReplica) {
            this.coresPerReplica = coresPerReplica;
            return this;
        }
        @CustomType.Setter
        public Builder max(@Nullable Integer max) {
            this.max = max;
            return this;
        }
        @CustomType.Setter
        public Builder min(@Nullable Integer min) {
            this.min = min;
            return this;
        }
        @CustomType.Setter
        public Builder nodesPerReplica(@Nullable Double nodesPerReplica) {
            this.nodesPerReplica = nodesPerReplica;
            return this;
        }
        @CustomType.Setter
        public Builder preventSinglePointFailure(@Nullable Boolean preventSinglePointFailure) {
            this.preventSinglePointFailure = preventSinglePointFailure;
            return this;
        }
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsLinearAutoscalerParams build() {
            final var _resultValue = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigDnsLinearAutoscalerParams();
            _resultValue.coresPerReplica = coresPerReplica;
            _resultValue.max = max;
            _resultValue.min = min;
            _resultValue.nodesPerReplica = nodesPerReplica;
            _resultValue.preventSinglePointFailure = preventSinglePointFailure;
            return _resultValue;
        }
    }
}
