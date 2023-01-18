// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterK3sConfigUpgradeStrategy;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterK3sConfig {
    /**
     * @return RKE upgrade strategy (list maxitems:1)
     * 
     */
    private @Nullable ClusterK3sConfigUpgradeStrategy upgradeStrategy;
    /**
     * @return RKE2 kubernetes version (string)
     * 
     */
    private @Nullable String version;

    private ClusterK3sConfig() {}
    /**
     * @return RKE upgrade strategy (list maxitems:1)
     * 
     */
    public Optional<ClusterK3sConfigUpgradeStrategy> upgradeStrategy() {
        return Optional.ofNullable(this.upgradeStrategy);
    }
    /**
     * @return RKE2 kubernetes version (string)
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterK3sConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterK3sConfigUpgradeStrategy upgradeStrategy;
        private @Nullable String version;
        public Builder() {}
        public Builder(ClusterK3sConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.upgradeStrategy = defaults.upgradeStrategy;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder upgradeStrategy(@Nullable ClusterK3sConfigUpgradeStrategy upgradeStrategy) {
            this.upgradeStrategy = upgradeStrategy;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public ClusterK3sConfig build() {
            final var o = new ClusterK3sConfig();
            o.upgradeStrategy = upgradeStrategy;
            o.version = version;
            return o;
        }
    }
}
