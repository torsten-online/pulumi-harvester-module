// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigUpgradeStrategyControlPlaneDrainOptions;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigUpgradeStrategyWorkerDrainOptions;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterV2RkeConfigUpgradeStrategy {
    /**
     * @return How many controlplane nodes should be upgrade at time, 0 is infinite. Percentages are also accepted (string)
     * 
     */
    private @Nullable String controlPlaneConcurrency;
    /**
     * @return Controlplane nodes drain options (list maxitems:1)
     * 
     */
    private @Nullable ClusterV2RkeConfigUpgradeStrategyControlPlaneDrainOptions controlPlaneDrainOptions;
    /**
     * @return How many worker nodes should be upgrade at time. Percentages are also accepted (string)
     * 
     */
    private @Nullable String workerConcurrency;
    /**
     * @return Worker nodes drain options (list maxitems:1)
     * 
     */
    private @Nullable ClusterV2RkeConfigUpgradeStrategyWorkerDrainOptions workerDrainOptions;

    private ClusterV2RkeConfigUpgradeStrategy() {}
    /**
     * @return How many controlplane nodes should be upgrade at time, 0 is infinite. Percentages are also accepted (string)
     * 
     */
    public Optional<String> controlPlaneConcurrency() {
        return Optional.ofNullable(this.controlPlaneConcurrency);
    }
    /**
     * @return Controlplane nodes drain options (list maxitems:1)
     * 
     */
    public Optional<ClusterV2RkeConfigUpgradeStrategyControlPlaneDrainOptions> controlPlaneDrainOptions() {
        return Optional.ofNullable(this.controlPlaneDrainOptions);
    }
    /**
     * @return How many worker nodes should be upgrade at time. Percentages are also accepted (string)
     * 
     */
    public Optional<String> workerConcurrency() {
        return Optional.ofNullable(this.workerConcurrency);
    }
    /**
     * @return Worker nodes drain options (list maxitems:1)
     * 
     */
    public Optional<ClusterV2RkeConfigUpgradeStrategyWorkerDrainOptions> workerDrainOptions() {
        return Optional.ofNullable(this.workerDrainOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterV2RkeConfigUpgradeStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String controlPlaneConcurrency;
        private @Nullable ClusterV2RkeConfigUpgradeStrategyControlPlaneDrainOptions controlPlaneDrainOptions;
        private @Nullable String workerConcurrency;
        private @Nullable ClusterV2RkeConfigUpgradeStrategyWorkerDrainOptions workerDrainOptions;
        public Builder() {}
        public Builder(ClusterV2RkeConfigUpgradeStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controlPlaneConcurrency = defaults.controlPlaneConcurrency;
    	      this.controlPlaneDrainOptions = defaults.controlPlaneDrainOptions;
    	      this.workerConcurrency = defaults.workerConcurrency;
    	      this.workerDrainOptions = defaults.workerDrainOptions;
        }

        @CustomType.Setter
        public Builder controlPlaneConcurrency(@Nullable String controlPlaneConcurrency) {
            this.controlPlaneConcurrency = controlPlaneConcurrency;
            return this;
        }
        @CustomType.Setter
        public Builder controlPlaneDrainOptions(@Nullable ClusterV2RkeConfigUpgradeStrategyControlPlaneDrainOptions controlPlaneDrainOptions) {
            this.controlPlaneDrainOptions = controlPlaneDrainOptions;
            return this;
        }
        @CustomType.Setter
        public Builder workerConcurrency(@Nullable String workerConcurrency) {
            this.workerConcurrency = workerConcurrency;
            return this;
        }
        @CustomType.Setter
        public Builder workerDrainOptions(@Nullable ClusterV2RkeConfigUpgradeStrategyWorkerDrainOptions workerDrainOptions) {
            this.workerDrainOptions = workerDrainOptions;
            return this;
        }
        public ClusterV2RkeConfigUpgradeStrategy build() {
            final var _resultValue = new ClusterV2RkeConfigUpgradeStrategy();
            _resultValue.controlPlaneConcurrency = controlPlaneConcurrency;
            _resultValue.controlPlaneDrainOptions = controlPlaneDrainOptions;
            _resultValue.workerConcurrency = workerConcurrency;
            _resultValue.workerDrainOptions = workerDrainOptions;
            return _resultValue;
        }
    }
}
