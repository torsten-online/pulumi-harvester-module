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
public final class ClusterGkeConfigV2NodePoolAutoscaling {
    /**
     * @return Enable scheduled cluster scan. Default: `false` (bool)
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The GKE node pool config max node count (int)
     * 
     */
    private @Nullable Integer maxNodeCount;
    /**
     * @return The GKE node pool config min node count (int)
     * 
     */
    private @Nullable Integer minNodeCount;

    private ClusterGkeConfigV2NodePoolAutoscaling() {}
    /**
     * @return Enable scheduled cluster scan. Default: `false` (bool)
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The GKE node pool config max node count (int)
     * 
     */
    public Optional<Integer> maxNodeCount() {
        return Optional.ofNullable(this.maxNodeCount);
    }
    /**
     * @return The GKE node pool config min node count (int)
     * 
     */
    public Optional<Integer> minNodeCount() {
        return Optional.ofNullable(this.minNodeCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterGkeConfigV2NodePoolAutoscaling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Integer maxNodeCount;
        private @Nullable Integer minNodeCount;
        public Builder() {}
        public Builder(ClusterGkeConfigV2NodePoolAutoscaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.maxNodeCount = defaults.maxNodeCount;
    	      this.minNodeCount = defaults.minNodeCount;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder maxNodeCount(@Nullable Integer maxNodeCount) {
            this.maxNodeCount = maxNodeCount;
            return this;
        }
        @CustomType.Setter
        public Builder minNodeCount(@Nullable Integer minNodeCount) {
            this.minNodeCount = minNodeCount;
            return this;
        }
        public ClusterGkeConfigV2NodePoolAutoscaling build() {
            final var o = new ClusterGkeConfigV2NodePoolAutoscaling();
            o.enabled = enabled;
            o.maxNodeCount = maxNodeCount;
            o.minNodeCount = minNodeCount;
            return o;
        }
    }
}
