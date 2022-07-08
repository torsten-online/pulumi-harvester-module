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
public final class ClusterRkeConfigDnsLinearAutoscalerParams {
    /**
     * @return number of replicas per cluster cores (float64)
     * 
     */
    private final @Nullable Double coresPerReplica;
    /**
     * @return maximum number of replicas (int64)
     * 
     */
    private final @Nullable Integer max;
    /**
     * @return minimum number of replicas (int64)
     * 
     */
    private final @Nullable Integer min;
    /**
     * @return number of replica per cluster nodes (float64)
     * 
     */
    private final @Nullable Double nodesPerReplica;
    /**
     * @return prevent single point of failure
     * 
     */
    private final @Nullable Boolean preventSinglePointFailure;

    @CustomType.Constructor
    private ClusterRkeConfigDnsLinearAutoscalerParams(
        @CustomType.Parameter("coresPerReplica") @Nullable Double coresPerReplica,
        @CustomType.Parameter("max") @Nullable Integer max,
        @CustomType.Parameter("min") @Nullable Integer min,
        @CustomType.Parameter("nodesPerReplica") @Nullable Double nodesPerReplica,
        @CustomType.Parameter("preventSinglePointFailure") @Nullable Boolean preventSinglePointFailure) {
        this.coresPerReplica = coresPerReplica;
        this.max = max;
        this.min = min;
        this.nodesPerReplica = nodesPerReplica;
        this.preventSinglePointFailure = preventSinglePointFailure;
    }

    /**
     * @return number of replicas per cluster cores (float64)
     * 
     */
    public Optional<Double> coresPerReplica() {
        return Optional.ofNullable(this.coresPerReplica);
    }
    /**
     * @return maximum number of replicas (int64)
     * 
     */
    public Optional<Integer> max() {
        return Optional.ofNullable(this.max);
    }
    /**
     * @return minimum number of replicas (int64)
     * 
     */
    public Optional<Integer> min() {
        return Optional.ofNullable(this.min);
    }
    /**
     * @return number of replica per cluster nodes (float64)
     * 
     */
    public Optional<Double> nodesPerReplica() {
        return Optional.ofNullable(this.nodesPerReplica);
    }
    /**
     * @return prevent single point of failure
     * 
     */
    public Optional<Boolean> preventSinglePointFailure() {
        return Optional.ofNullable(this.preventSinglePointFailure);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigDnsLinearAutoscalerParams defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double coresPerReplica;
        private @Nullable Integer max;
        private @Nullable Integer min;
        private @Nullable Double nodesPerReplica;
        private @Nullable Boolean preventSinglePointFailure;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterRkeConfigDnsLinearAutoscalerParams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coresPerReplica = defaults.coresPerReplica;
    	      this.max = defaults.max;
    	      this.min = defaults.min;
    	      this.nodesPerReplica = defaults.nodesPerReplica;
    	      this.preventSinglePointFailure = defaults.preventSinglePointFailure;
        }

        public Builder coresPerReplica(@Nullable Double coresPerReplica) {
            this.coresPerReplica = coresPerReplica;
            return this;
        }
        public Builder max(@Nullable Integer max) {
            this.max = max;
            return this;
        }
        public Builder min(@Nullable Integer min) {
            this.min = min;
            return this;
        }
        public Builder nodesPerReplica(@Nullable Double nodesPerReplica) {
            this.nodesPerReplica = nodesPerReplica;
            return this;
        }
        public Builder preventSinglePointFailure(@Nullable Boolean preventSinglePointFailure) {
            this.preventSinglePointFailure = preventSinglePointFailure;
            return this;
        }        public ClusterRkeConfigDnsLinearAutoscalerParams build() {
            return new ClusterRkeConfigDnsLinearAutoscalerParams(coresPerReplica, max, min, nodesPerReplica, preventSinglePointFailure);
        }
    }
}
