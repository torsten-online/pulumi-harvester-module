// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterGkeConfigV2MasterAuthorizedNetworksConfig {
    /**
     * @return The GKE master authorized network config cidr blocks (List)
     * 
     */
    private List<ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock> cidrBlocks;
    /**
     * @return Enable scheduled cluster scan. Default: `false` (bool)
     * 
     */
    private @Nullable Boolean enabled;

    private ClusterGkeConfigV2MasterAuthorizedNetworksConfig() {}
    /**
     * @return The GKE master authorized network config cidr blocks (List)
     * 
     */
    public List<ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock> cidrBlocks() {
        return this.cidrBlocks;
    }
    /**
     * @return Enable scheduled cluster scan. Default: `false` (bool)
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterGkeConfigV2MasterAuthorizedNetworksConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock> cidrBlocks;
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(ClusterGkeConfigV2MasterAuthorizedNetworksConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder cidrBlocks(List<ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock> cidrBlocks) {
            this.cidrBlocks = Objects.requireNonNull(cidrBlocks);
            return this;
        }
        public Builder cidrBlocks(ClusterGkeConfigV2MasterAuthorizedNetworksConfigCidrBlock... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public ClusterGkeConfigV2MasterAuthorizedNetworksConfig build() {
            final var o = new ClusterGkeConfigV2MasterAuthorizedNetworksConfig();
            o.cidrBlocks = cidrBlocks;
            o.enabled = enabled;
            return o;
        }
    }
}
