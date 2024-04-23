// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterV2RkeConfigUpgradeStrategyWorkerDrainOptions {
    /**
     * @return Drain options delete empty dir data
     * 
     */
    private @Nullable Boolean deleteEmptyDirData;
    /**
     * @return Drain options disable eviction
     * 
     */
    private @Nullable Boolean disableEviction;
    /**
     * @return Drain options enabled?
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Drain options force
     * 
     */
    private @Nullable Boolean force;
    /**
     * @return Drain options grace period
     * 
     */
    private @Nullable Integer gracePeriod;
    /**
     * @return Drain options ignore daemon sets
     * 
     */
    private @Nullable Boolean ignoreDaemonSets;
    /**
     * @return Drain options ignore errors
     * 
     */
    private @Nullable Boolean ignoreErrors;
    /**
     * @return Drain options skip wait for delete timeout seconds
     * 
     */
    private @Nullable Integer skipWaitForDeleteTimeoutSeconds;
    /**
     * @return Drain options timeout
     * 
     */
    private @Nullable Integer timeout;

    private ClusterV2RkeConfigUpgradeStrategyWorkerDrainOptions() {}
    /**
     * @return Drain options delete empty dir data
     * 
     */
    public Optional<Boolean> deleteEmptyDirData() {
        return Optional.ofNullable(this.deleteEmptyDirData);
    }
    /**
     * @return Drain options disable eviction
     * 
     */
    public Optional<Boolean> disableEviction() {
        return Optional.ofNullable(this.disableEviction);
    }
    /**
     * @return Drain options enabled?
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Drain options force
     * 
     */
    public Optional<Boolean> force() {
        return Optional.ofNullable(this.force);
    }
    /**
     * @return Drain options grace period
     * 
     */
    public Optional<Integer> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }
    /**
     * @return Drain options ignore daemon sets
     * 
     */
    public Optional<Boolean> ignoreDaemonSets() {
        return Optional.ofNullable(this.ignoreDaemonSets);
    }
    /**
     * @return Drain options ignore errors
     * 
     */
    public Optional<Boolean> ignoreErrors() {
        return Optional.ofNullable(this.ignoreErrors);
    }
    /**
     * @return Drain options skip wait for delete timeout seconds
     * 
     */
    public Optional<Integer> skipWaitForDeleteTimeoutSeconds() {
        return Optional.ofNullable(this.skipWaitForDeleteTimeoutSeconds);
    }
    /**
     * @return Drain options timeout
     * 
     */
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterV2RkeConfigUpgradeStrategyWorkerDrainOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean deleteEmptyDirData;
        private @Nullable Boolean disableEviction;
        private @Nullable Boolean enabled;
        private @Nullable Boolean force;
        private @Nullable Integer gracePeriod;
        private @Nullable Boolean ignoreDaemonSets;
        private @Nullable Boolean ignoreErrors;
        private @Nullable Integer skipWaitForDeleteTimeoutSeconds;
        private @Nullable Integer timeout;
        public Builder() {}
        public Builder(ClusterV2RkeConfigUpgradeStrategyWorkerDrainOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteEmptyDirData = defaults.deleteEmptyDirData;
    	      this.disableEviction = defaults.disableEviction;
    	      this.enabled = defaults.enabled;
    	      this.force = defaults.force;
    	      this.gracePeriod = defaults.gracePeriod;
    	      this.ignoreDaemonSets = defaults.ignoreDaemonSets;
    	      this.ignoreErrors = defaults.ignoreErrors;
    	      this.skipWaitForDeleteTimeoutSeconds = defaults.skipWaitForDeleteTimeoutSeconds;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder deleteEmptyDirData(@Nullable Boolean deleteEmptyDirData) {

            this.deleteEmptyDirData = deleteEmptyDirData;
            return this;
        }
        @CustomType.Setter
        public Builder disableEviction(@Nullable Boolean disableEviction) {

            this.disableEviction = disableEviction;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder force(@Nullable Boolean force) {

            this.force = force;
            return this;
        }
        @CustomType.Setter
        public Builder gracePeriod(@Nullable Integer gracePeriod) {

            this.gracePeriod = gracePeriod;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreDaemonSets(@Nullable Boolean ignoreDaemonSets) {

            this.ignoreDaemonSets = ignoreDaemonSets;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreErrors(@Nullable Boolean ignoreErrors) {

            this.ignoreErrors = ignoreErrors;
            return this;
        }
        @CustomType.Setter
        public Builder skipWaitForDeleteTimeoutSeconds(@Nullable Integer skipWaitForDeleteTimeoutSeconds) {

            this.skipWaitForDeleteTimeoutSeconds = skipWaitForDeleteTimeoutSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable Integer timeout) {

            this.timeout = timeout;
            return this;
        }
        public ClusterV2RkeConfigUpgradeStrategyWorkerDrainOptions build() {
            final var _resultValue = new ClusterV2RkeConfigUpgradeStrategyWorkerDrainOptions();
            _resultValue.deleteEmptyDirData = deleteEmptyDirData;
            _resultValue.disableEviction = disableEviction;
            _resultValue.enabled = enabled;
            _resultValue.force = force;
            _resultValue.gracePeriod = gracePeriod;
            _resultValue.ignoreDaemonSets = ignoreDaemonSets;
            _resultValue.ignoreErrors = ignoreErrors;
            _resultValue.skipWaitForDeleteTimeoutSeconds = skipWaitForDeleteTimeoutSeconds;
            _resultValue.timeout = timeout;
            return _resultValue;
        }
    }
}
