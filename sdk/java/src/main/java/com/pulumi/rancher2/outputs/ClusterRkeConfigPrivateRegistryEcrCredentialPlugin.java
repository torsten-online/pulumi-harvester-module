// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigPrivateRegistryEcrCredentialPlugin {
    /**
     * @return AWS access key ID (string)
     * 
     */
    private @Nullable String awsAccessKeyId;
    /**
     * @return AWS secret access key (string)
     * 
     */
    private @Nullable String awsSecretAccessKey;
    /**
     * @return AWS session token (string)
     * 
     */
    private @Nullable String awsSessionToken;

    private ClusterRkeConfigPrivateRegistryEcrCredentialPlugin() {}
    /**
     * @return AWS access key ID (string)
     * 
     */
    public Optional<String> awsAccessKeyId() {
        return Optional.ofNullable(this.awsAccessKeyId);
    }
    /**
     * @return AWS secret access key (string)
     * 
     */
    public Optional<String> awsSecretAccessKey() {
        return Optional.ofNullable(this.awsSecretAccessKey);
    }
    /**
     * @return AWS session token (string)
     * 
     */
    public Optional<String> awsSessionToken() {
        return Optional.ofNullable(this.awsSessionToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigPrivateRegistryEcrCredentialPlugin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String awsAccessKeyId;
        private @Nullable String awsSecretAccessKey;
        private @Nullable String awsSessionToken;
        public Builder() {}
        public Builder(ClusterRkeConfigPrivateRegistryEcrCredentialPlugin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccessKeyId = defaults.awsAccessKeyId;
    	      this.awsSecretAccessKey = defaults.awsSecretAccessKey;
    	      this.awsSessionToken = defaults.awsSessionToken;
        }

        @CustomType.Setter
        public Builder awsAccessKeyId(@Nullable String awsAccessKeyId) {

            this.awsAccessKeyId = awsAccessKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder awsSecretAccessKey(@Nullable String awsSecretAccessKey) {

            this.awsSecretAccessKey = awsSecretAccessKey;
            return this;
        }
        @CustomType.Setter
        public Builder awsSessionToken(@Nullable String awsSessionToken) {

            this.awsSessionToken = awsSessionToken;
            return this;
        }
        public ClusterRkeConfigPrivateRegistryEcrCredentialPlugin build() {
            final var _resultValue = new ClusterRkeConfigPrivateRegistryEcrCredentialPlugin();
            _resultValue.awsAccessKeyId = awsAccessKeyId;
            _resultValue.awsSecretAccessKey = awsSecretAccessKey;
            _resultValue.awsSessionToken = awsSessionToken;
            return _resultValue;
        }
    }
}
