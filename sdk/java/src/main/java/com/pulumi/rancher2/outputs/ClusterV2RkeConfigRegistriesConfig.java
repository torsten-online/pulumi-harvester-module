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
public final class ClusterV2RkeConfigRegistriesConfig {
    /**
     * @return Registry auth config secret name (string)
     * 
     */
    private @Nullable String authConfigSecretName;
    /**
     * @return Registry CA bundle (string)
     * 
     */
    private @Nullable String caBundle;
    /**
     * @return Registry hostname (string)
     * 
     */
    private String hostname;
    /**
     * @return Registry insecure connectivity (bool)
     * 
     */
    private @Nullable Boolean insecure;
    /**
     * @return Registry TLS secret name. TLS is a pair of Cert/Key (string)
     * 
     */
    private @Nullable String tlsSecretName;

    private ClusterV2RkeConfigRegistriesConfig() {}
    /**
     * @return Registry auth config secret name (string)
     * 
     */
    public Optional<String> authConfigSecretName() {
        return Optional.ofNullable(this.authConfigSecretName);
    }
    /**
     * @return Registry CA bundle (string)
     * 
     */
    public Optional<String> caBundle() {
        return Optional.ofNullable(this.caBundle);
    }
    /**
     * @return Registry hostname (string)
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return Registry insecure connectivity (bool)
     * 
     */
    public Optional<Boolean> insecure() {
        return Optional.ofNullable(this.insecure);
    }
    /**
     * @return Registry TLS secret name. TLS is a pair of Cert/Key (string)
     * 
     */
    public Optional<String> tlsSecretName() {
        return Optional.ofNullable(this.tlsSecretName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterV2RkeConfigRegistriesConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String authConfigSecretName;
        private @Nullable String caBundle;
        private String hostname;
        private @Nullable Boolean insecure;
        private @Nullable String tlsSecretName;
        public Builder() {}
        public Builder(ClusterV2RkeConfigRegistriesConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authConfigSecretName = defaults.authConfigSecretName;
    	      this.caBundle = defaults.caBundle;
    	      this.hostname = defaults.hostname;
    	      this.insecure = defaults.insecure;
    	      this.tlsSecretName = defaults.tlsSecretName;
        }

        @CustomType.Setter
        public Builder authConfigSecretName(@Nullable String authConfigSecretName) {
            this.authConfigSecretName = authConfigSecretName;
            return this;
        }
        @CustomType.Setter
        public Builder caBundle(@Nullable String caBundle) {
            this.caBundle = caBundle;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        @CustomType.Setter
        public Builder insecure(@Nullable Boolean insecure) {
            this.insecure = insecure;
            return this;
        }
        @CustomType.Setter
        public Builder tlsSecretName(@Nullable String tlsSecretName) {
            this.tlsSecretName = tlsSecretName;
            return this;
        }
        public ClusterV2RkeConfigRegistriesConfig build() {
            final var _resultValue = new ClusterV2RkeConfigRegistriesConfig();
            _resultValue.authConfigSecretName = authConfigSecretName;
            _resultValue.caBundle = caBundle;
            _resultValue.hostname = hostname;
            _resultValue.insecure = insecure;
            _resultValue.tlsSecretName = tlsSecretName;
            return _resultValue;
        }
    }
}
