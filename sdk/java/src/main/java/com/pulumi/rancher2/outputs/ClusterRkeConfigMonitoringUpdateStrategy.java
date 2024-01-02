// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterRkeConfigMonitoringUpdateStrategyRollingUpdate;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigMonitoringUpdateStrategy {
    /**
     * @return Monitoring deployment rolling update (list Maxitems: 1)
     * 
     */
    private @Nullable ClusterRkeConfigMonitoringUpdateStrategyRollingUpdate rollingUpdate;
    /**
     * @return Monitoring deployment update strategy (string)
     * 
     */
    private @Nullable String strategy;

    private ClusterRkeConfigMonitoringUpdateStrategy() {}
    /**
     * @return Monitoring deployment rolling update (list Maxitems: 1)
     * 
     */
    public Optional<ClusterRkeConfigMonitoringUpdateStrategyRollingUpdate> rollingUpdate() {
        return Optional.ofNullable(this.rollingUpdate);
    }
    /**
     * @return Monitoring deployment update strategy (string)
     * 
     */
    public Optional<String> strategy() {
        return Optional.ofNullable(this.strategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigMonitoringUpdateStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterRkeConfigMonitoringUpdateStrategyRollingUpdate rollingUpdate;
        private @Nullable String strategy;
        public Builder() {}
        public Builder(ClusterRkeConfigMonitoringUpdateStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rollingUpdate = defaults.rollingUpdate;
    	      this.strategy = defaults.strategy;
        }

        @CustomType.Setter
        public Builder rollingUpdate(@Nullable ClusterRkeConfigMonitoringUpdateStrategyRollingUpdate rollingUpdate) {

            this.rollingUpdate = rollingUpdate;
            return this;
        }
        @CustomType.Setter
        public Builder strategy(@Nullable String strategy) {

            this.strategy = strategy;
            return this;
        }
        public ClusterRkeConfigMonitoringUpdateStrategy build() {
            final var _resultValue = new ClusterRkeConfigMonitoringUpdateStrategy();
            _resultValue.rollingUpdate = rollingUpdate;
            _resultValue.strategy = strategy;
            return _resultValue;
        }
    }
}
