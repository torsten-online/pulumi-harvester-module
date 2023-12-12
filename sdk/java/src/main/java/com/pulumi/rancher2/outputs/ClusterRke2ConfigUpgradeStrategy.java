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
public final class ClusterRke2ConfigUpgradeStrategy {
    /**
     * @return Drain server nodes. Default: `false` (bool)
     * 
     */
    private @Nullable Boolean drainServerNodes;
    /**
     * @return Drain worker nodes. Default: `false` (bool)
     * 
     */
    private @Nullable Boolean drainWorkerNodes;
    /**
     * @return Server concurrency. Default: `1` (int)
     * 
     */
    private @Nullable Integer serverConcurrency;
    /**
     * @return Worker concurrency. Default: `1` (int)
     * 
     */
    private @Nullable Integer workerConcurrency;

    private ClusterRke2ConfigUpgradeStrategy() {}
    /**
     * @return Drain server nodes. Default: `false` (bool)
     * 
     */
    public Optional<Boolean> drainServerNodes() {
        return Optional.ofNullable(this.drainServerNodes);
    }
    /**
     * @return Drain worker nodes. Default: `false` (bool)
     * 
     */
    public Optional<Boolean> drainWorkerNodes() {
        return Optional.ofNullable(this.drainWorkerNodes);
    }
    /**
     * @return Server concurrency. Default: `1` (int)
     * 
     */
    public Optional<Integer> serverConcurrency() {
        return Optional.ofNullable(this.serverConcurrency);
    }
    /**
     * @return Worker concurrency. Default: `1` (int)
     * 
     */
    public Optional<Integer> workerConcurrency() {
        return Optional.ofNullable(this.workerConcurrency);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRke2ConfigUpgradeStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean drainServerNodes;
        private @Nullable Boolean drainWorkerNodes;
        private @Nullable Integer serverConcurrency;
        private @Nullable Integer workerConcurrency;
        public Builder() {}
        public Builder(ClusterRke2ConfigUpgradeStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drainServerNodes = defaults.drainServerNodes;
    	      this.drainWorkerNodes = defaults.drainWorkerNodes;
    	      this.serverConcurrency = defaults.serverConcurrency;
    	      this.workerConcurrency = defaults.workerConcurrency;
        }

        @CustomType.Setter
        public Builder drainServerNodes(@Nullable Boolean drainServerNodes) {
            this.drainServerNodes = drainServerNodes;
            return this;
        }
        @CustomType.Setter
        public Builder drainWorkerNodes(@Nullable Boolean drainWorkerNodes) {
            this.drainWorkerNodes = drainWorkerNodes;
            return this;
        }
        @CustomType.Setter
        public Builder serverConcurrency(@Nullable Integer serverConcurrency) {
            this.serverConcurrency = serverConcurrency;
            return this;
        }
        @CustomType.Setter
        public Builder workerConcurrency(@Nullable Integer workerConcurrency) {
            this.workerConcurrency = workerConcurrency;
            return this;
        }
        public ClusterRke2ConfigUpgradeStrategy build() {
            final var _resultValue = new ClusterRke2ConfigUpgradeStrategy();
            _resultValue.drainServerNodes = drainServerNodes;
            _resultValue.drainWorkerNodes = drainWorkerNodes;
            _resultValue.serverConcurrency = serverConcurrency;
            _resultValue.workerConcurrency = workerConcurrency;
            return _resultValue;
        }
    }
}
