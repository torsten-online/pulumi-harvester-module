// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterRke2ConfigUpgradeStrategy;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRke2Config {
    /**
     * @return The RKE2 upgrade strategy
     * 
     */
    private @Nullable ClusterRke2ConfigUpgradeStrategy upgradeStrategy;
    /**
     * @return The RKE2 kubernetes version
     * 
     */
    private @Nullable String version;

    private ClusterRke2Config() {}
    /**
     * @return The RKE2 upgrade strategy
     * 
     */
    public Optional<ClusterRke2ConfigUpgradeStrategy> upgradeStrategy() {
        return Optional.ofNullable(this.upgradeStrategy);
    }
    /**
     * @return The RKE2 kubernetes version
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRke2Config defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterRke2ConfigUpgradeStrategy upgradeStrategy;
        private @Nullable String version;
        public Builder() {}
        public Builder(ClusterRke2Config defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.upgradeStrategy = defaults.upgradeStrategy;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder upgradeStrategy(@Nullable ClusterRke2ConfigUpgradeStrategy upgradeStrategy) {

            this.upgradeStrategy = upgradeStrategy;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {

            this.version = version;
            return this;
        }
        public ClusterRke2Config build() {
            final var _resultValue = new ClusterRke2Config();
            _resultValue.upgradeStrategy = upgradeStrategy;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
