// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyRollingUpdate {
    private final @Nullable Integer maxSurge;
    private final @Nullable Integer maxUnavailable;

    @CustomType.Constructor
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyRollingUpdate(
        @CustomType.Parameter("maxSurge") @Nullable Integer maxSurge,
        @CustomType.Parameter("maxUnavailable") @Nullable Integer maxUnavailable) {
        this.maxSurge = maxSurge;
        this.maxUnavailable = maxUnavailable;
    }

    public Optional<Integer> maxSurge() {
        return Optional.ofNullable(this.maxSurge);
    }
    public Optional<Integer> maxUnavailable() {
        return Optional.ofNullable(this.maxUnavailable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyRollingUpdate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxSurge;
        private @Nullable Integer maxUnavailable;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyRollingUpdate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        public Builder maxSurge(@Nullable Integer maxSurge) {
            this.maxSurge = maxSurge;
            return this;
        }
        public Builder maxUnavailable(@Nullable Integer maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }        public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyRollingUpdate build() {
            return new GetClusterTemplateTemplateRevisionClusterConfigRkeConfigMonitoringUpdateStrategyRollingUpdate(maxSurge, maxUnavailable);
        }
    }
}
