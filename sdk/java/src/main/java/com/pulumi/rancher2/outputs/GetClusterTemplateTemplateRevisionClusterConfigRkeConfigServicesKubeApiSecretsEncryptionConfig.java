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
public final class GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfig {
    private String customConfig;
    private @Nullable Boolean enabled;

    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfig() {}
    public String customConfig() {
        return this.customConfig;
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String customConfig;
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customConfig = defaults.customConfig;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder customConfig(String customConfig) {
            this.customConfig = Objects.requireNonNull(customConfig);
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfig build() {
            final var o = new GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfig();
            o.customConfig = customConfig;
            o.enabled = enabled;
            return o;
        }
    }
}
