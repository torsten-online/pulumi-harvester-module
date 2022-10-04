// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloudCredentialAmazonec2CredentialConfig {
    /**
     * @return AWS access key (string)
     * 
     */
    private String accessKey;
    /**
     * @return AWS default region (string)
     * 
     */
    private @Nullable String defaultRegion;
    /**
     * @return AWS secret key (string)
     * 
     */
    private String secretKey;

    private CloudCredentialAmazonec2CredentialConfig() {}
    /**
     * @return AWS access key (string)
     * 
     */
    public String accessKey() {
        return this.accessKey;
    }
    /**
     * @return AWS default region (string)
     * 
     */
    public Optional<String> defaultRegion() {
        return Optional.ofNullable(this.defaultRegion);
    }
    /**
     * @return AWS secret key (string)
     * 
     */
    public String secretKey() {
        return this.secretKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudCredentialAmazonec2CredentialConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessKey;
        private @Nullable String defaultRegion;
        private String secretKey;
        public Builder() {}
        public Builder(CloudCredentialAmazonec2CredentialConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.defaultRegion = defaults.defaultRegion;
    	      this.secretKey = defaults.secretKey;
        }

        @CustomType.Setter
        public Builder accessKey(String accessKey) {
            this.accessKey = Objects.requireNonNull(accessKey);
            return this;
        }
        @CustomType.Setter
        public Builder defaultRegion(@Nullable String defaultRegion) {
            this.defaultRegion = defaultRegion;
            return this;
        }
        @CustomType.Setter
        public Builder secretKey(String secretKey) {
            this.secretKey = Objects.requireNonNull(secretKey);
            return this;
        }
        public CloudCredentialAmazonec2CredentialConfig build() {
            final var o = new CloudCredentialAmazonec2CredentialConfig();
            o.accessKey = accessKey;
            o.defaultRegion = defaultRegion;
            o.secretKey = secretKey;
            return o;
        }
    }
}
