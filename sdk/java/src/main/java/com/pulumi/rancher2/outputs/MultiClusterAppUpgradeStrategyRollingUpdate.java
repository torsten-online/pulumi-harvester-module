// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MultiClusterAppUpgradeStrategyRollingUpdate {
    /**
     * @return Rolling update batch size. Default `1` (int)
     * 
     */
    private @Nullable Integer batchSize;
    /**
     * @return Rolling update interval. Default `1` (int)
     * 
     */
    private @Nullable Integer interval;

    private MultiClusterAppUpgradeStrategyRollingUpdate() {}
    /**
     * @return Rolling update batch size. Default `1` (int)
     * 
     */
    public Optional<Integer> batchSize() {
        return Optional.ofNullable(this.batchSize);
    }
    /**
     * @return Rolling update interval. Default `1` (int)
     * 
     */
    public Optional<Integer> interval() {
        return Optional.ofNullable(this.interval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiClusterAppUpgradeStrategyRollingUpdate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer batchSize;
        private @Nullable Integer interval;
        public Builder() {}
        public Builder(MultiClusterAppUpgradeStrategyRollingUpdate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchSize = defaults.batchSize;
    	      this.interval = defaults.interval;
        }

        @CustomType.Setter
        public Builder batchSize(@Nullable Integer batchSize) {

            this.batchSize = batchSize;
            return this;
        }
        @CustomType.Setter
        public Builder interval(@Nullable Integer interval) {

            this.interval = interval;
            return this;
        }
        public MultiClusterAppUpgradeStrategyRollingUpdate build() {
            final var _resultValue = new MultiClusterAppUpgradeStrategyRollingUpdate();
            _resultValue.batchSize = batchSize;
            _resultValue.interval = interval;
            return _resultValue;
        }
    }
}
