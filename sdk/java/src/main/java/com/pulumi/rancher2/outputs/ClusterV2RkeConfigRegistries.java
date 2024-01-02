// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigRegistriesConfig;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigRegistriesMirror;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ClusterV2RkeConfigRegistries {
    /**
     * @return Cluster V2 docker registries config (list)
     * 
     */
    private @Nullable List<ClusterV2RkeConfigRegistriesConfig> configs;
    /**
     * @return Cluster V2 docker registries mirror (list)
     * 
     */
    private @Nullable List<ClusterV2RkeConfigRegistriesMirror> mirrors;

    private ClusterV2RkeConfigRegistries() {}
    /**
     * @return Cluster V2 docker registries config (list)
     * 
     */
    public List<ClusterV2RkeConfigRegistriesConfig> configs() {
        return this.configs == null ? List.of() : this.configs;
    }
    /**
     * @return Cluster V2 docker registries mirror (list)
     * 
     */
    public List<ClusterV2RkeConfigRegistriesMirror> mirrors() {
        return this.mirrors == null ? List.of() : this.mirrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterV2RkeConfigRegistries defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ClusterV2RkeConfigRegistriesConfig> configs;
        private @Nullable List<ClusterV2RkeConfigRegistriesMirror> mirrors;
        public Builder() {}
        public Builder(ClusterV2RkeConfigRegistries defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configs = defaults.configs;
    	      this.mirrors = defaults.mirrors;
        }

        @CustomType.Setter
        public Builder configs(@Nullable List<ClusterV2RkeConfigRegistriesConfig> configs) {

            this.configs = configs;
            return this;
        }
        public Builder configs(ClusterV2RkeConfigRegistriesConfig... configs) {
            return configs(List.of(configs));
        }
        @CustomType.Setter
        public Builder mirrors(@Nullable List<ClusterV2RkeConfigRegistriesMirror> mirrors) {

            this.mirrors = mirrors;
            return this;
        }
        public Builder mirrors(ClusterV2RkeConfigRegistriesMirror... mirrors) {
            return mirrors(List.of(mirrors));
        }
        public ClusterV2RkeConfigRegistries build() {
            final var _resultValue = new ClusterV2RkeConfigRegistries();
            _resultValue.configs = configs;
            _resultValue.mirrors = mirrors;
            return _resultValue;
        }
    }
}
