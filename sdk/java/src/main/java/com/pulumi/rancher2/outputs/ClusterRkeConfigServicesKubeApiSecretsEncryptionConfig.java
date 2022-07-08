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
public final class ClusterRkeConfigServicesKubeApiSecretsEncryptionConfig {
    /**
     * @return Secrets encryption yaml encoded custom configuration. `&#34;apiVersion&#34;` and `&#34;kind&#34;:&#34;EncryptionConfiguration&#34;` fields are required in the yaml. [More info](https://rancher.com/docs/rke/latest/en/config-options/secrets-encryption/) (string) Ex:
     * 
     */
    private final @Nullable String customConfig;
    /**
     * @return Enable scheduled cluster scan. Default: `false` (bool)
     * 
     */
    private final @Nullable Boolean enabled;

    @CustomType.Constructor
    private ClusterRkeConfigServicesKubeApiSecretsEncryptionConfig(
        @CustomType.Parameter("customConfig") @Nullable String customConfig,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled) {
        this.customConfig = customConfig;
        this.enabled = enabled;
    }

    /**
     * @return Secrets encryption yaml encoded custom configuration. `&#34;apiVersion&#34;` and `&#34;kind&#34;:&#34;EncryptionConfiguration&#34;` fields are required in the yaml. [More info](https://rancher.com/docs/rke/latest/en/config-options/secrets-encryption/) (string) Ex:
     * 
     */
    public Optional<String> customConfig() {
        return Optional.ofNullable(this.customConfig);
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

    public static Builder builder(ClusterRkeConfigServicesKubeApiSecretsEncryptionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customConfig;
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterRkeConfigServicesKubeApiSecretsEncryptionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customConfig = defaults.customConfig;
    	      this.enabled = defaults.enabled;
        }

        public Builder customConfig(@Nullable String customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }        public ClusterRkeConfigServicesKubeApiSecretsEncryptionConfig build() {
            return new ClusterRkeConfigServicesKubeApiSecretsEncryptionConfig(customConfig, enabled);
        }
    }
}
