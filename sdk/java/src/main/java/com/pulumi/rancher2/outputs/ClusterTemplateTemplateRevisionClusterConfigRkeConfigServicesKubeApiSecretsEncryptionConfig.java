// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfig {
    private @Nullable String customConfig;
    /**
     * @return Enable cluster template revision. Default `true` (bool)
     * 
     */
    private @Nullable Boolean enabled;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfig() {}
    public Optional<String> customConfig() {
        return Optional.ofNullable(this.customConfig);
    }
    /**
     * @return Enable cluster template revision. Default `true` (bool)
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String customConfig;
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customConfig = defaults.customConfig;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder customConfig(@Nullable String customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfig build() {
            final var _resultValue = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfig();
            _resultValue.customConfig = customConfig;
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
