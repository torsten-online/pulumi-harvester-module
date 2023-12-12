// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterK3sConfigUpgradeStrategy;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterK3sConfig {
    private GetClusterK3sConfigUpgradeStrategy upgradeStrategy;
    private String version;

    private GetClusterK3sConfig() {}
    public GetClusterK3sConfigUpgradeStrategy upgradeStrategy() {
        return this.upgradeStrategy;
    }
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterK3sConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetClusterK3sConfigUpgradeStrategy upgradeStrategy;
        private String version;
        public Builder() {}
        public Builder(GetClusterK3sConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.upgradeStrategy = defaults.upgradeStrategy;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder upgradeStrategy(GetClusterK3sConfigUpgradeStrategy upgradeStrategy) {
            this.upgradeStrategy = Objects.requireNonNull(upgradeStrategy);
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetClusterK3sConfig build() {
            final var _resultValue = new GetClusterK3sConfig();
            _resultValue.upgradeStrategy = upgradeStrategy;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
