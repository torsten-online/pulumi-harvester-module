// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigMonitoringUpdateStrategyRollingUpdate;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterRkeConfigMonitoringUpdateStrategy {
    private @Nullable GetClusterRkeConfigMonitoringUpdateStrategyRollingUpdate rollingUpdate;
    private @Nullable String strategy;

    private GetClusterRkeConfigMonitoringUpdateStrategy() {}
    public Optional<GetClusterRkeConfigMonitoringUpdateStrategyRollingUpdate> rollingUpdate() {
        return Optional.ofNullable(this.rollingUpdate);
    }
    public Optional<String> strategy() {
        return Optional.ofNullable(this.strategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigMonitoringUpdateStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetClusterRkeConfigMonitoringUpdateStrategyRollingUpdate rollingUpdate;
        private @Nullable String strategy;
        public Builder() {}
        public Builder(GetClusterRkeConfigMonitoringUpdateStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rollingUpdate = defaults.rollingUpdate;
    	      this.strategy = defaults.strategy;
        }

        @CustomType.Setter
        public Builder rollingUpdate(@Nullable GetClusterRkeConfigMonitoringUpdateStrategyRollingUpdate rollingUpdate) {
            this.rollingUpdate = rollingUpdate;
            return this;
        }
        @CustomType.Setter
        public Builder strategy(@Nullable String strategy) {
            this.strategy = strategy;
            return this;
        }
        public GetClusterRkeConfigMonitoringUpdateStrategy build() {
            final var _resultValue = new GetClusterRkeConfigMonitoringUpdateStrategy();
            _resultValue.rollingUpdate = rollingUpdate;
            _resultValue.strategy = strategy;
            return _resultValue;
        }
    }
}
