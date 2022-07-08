// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigRegistriesConfig;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigRegistriesMirror;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterV2RkeConfigRegistries {
    private final @Nullable List<GetClusterV2RkeConfigRegistriesConfig> configs;
    private final @Nullable List<GetClusterV2RkeConfigRegistriesMirror> mirrors;

    @CustomType.Constructor
    private GetClusterV2RkeConfigRegistries(
        @CustomType.Parameter("configs") @Nullable List<GetClusterV2RkeConfigRegistriesConfig> configs,
        @CustomType.Parameter("mirrors") @Nullable List<GetClusterV2RkeConfigRegistriesMirror> mirrors) {
        this.configs = configs;
        this.mirrors = mirrors;
    }

    public List<GetClusterV2RkeConfigRegistriesConfig> configs() {
        return this.configs == null ? List.of() : this.configs;
    }
    public List<GetClusterV2RkeConfigRegistriesMirror> mirrors() {
        return this.mirrors == null ? List.of() : this.mirrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterV2RkeConfigRegistries defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetClusterV2RkeConfigRegistriesConfig> configs;
        private @Nullable List<GetClusterV2RkeConfigRegistriesMirror> mirrors;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterV2RkeConfigRegistries defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configs = defaults.configs;
    	      this.mirrors = defaults.mirrors;
        }

        public Builder configs(@Nullable List<GetClusterV2RkeConfigRegistriesConfig> configs) {
            this.configs = configs;
            return this;
        }
        public Builder configs(GetClusterV2RkeConfigRegistriesConfig... configs) {
            return configs(List.of(configs));
        }
        public Builder mirrors(@Nullable List<GetClusterV2RkeConfigRegistriesMirror> mirrors) {
            this.mirrors = mirrors;
            return this;
        }
        public Builder mirrors(GetClusterV2RkeConfigRegistriesMirror... mirrors) {
            return mirrors(List.of(mirrors));
        }        public GetClusterV2RkeConfigRegistries build() {
            return new GetClusterV2RkeConfigRegistries(configs, mirrors);
        }
    }
}
