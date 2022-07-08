// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistryEcrCredentialPlugin {
    private final @Nullable String awsAccessKeyId;
    private final @Nullable String awsSecretAccessKey;
    private final @Nullable String awsSessionToken;

    @CustomType.Constructor
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistryEcrCredentialPlugin(
        @CustomType.Parameter("awsAccessKeyId") @Nullable String awsAccessKeyId,
        @CustomType.Parameter("awsSecretAccessKey") @Nullable String awsSecretAccessKey,
        @CustomType.Parameter("awsSessionToken") @Nullable String awsSessionToken) {
        this.awsAccessKeyId = awsAccessKeyId;
        this.awsSecretAccessKey = awsSecretAccessKey;
        this.awsSessionToken = awsSessionToken;
    }

    public Optional<String> awsAccessKeyId() {
        return Optional.ofNullable(this.awsAccessKeyId);
    }
    public Optional<String> awsSecretAccessKey() {
        return Optional.ofNullable(this.awsSecretAccessKey);
    }
    public Optional<String> awsSessionToken() {
        return Optional.ofNullable(this.awsSessionToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistryEcrCredentialPlugin defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String awsAccessKeyId;
        private @Nullable String awsSecretAccessKey;
        private @Nullable String awsSessionToken;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistryEcrCredentialPlugin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccessKeyId = defaults.awsAccessKeyId;
    	      this.awsSecretAccessKey = defaults.awsSecretAccessKey;
    	      this.awsSessionToken = defaults.awsSessionToken;
        }

        public Builder awsAccessKeyId(@Nullable String awsAccessKeyId) {
            this.awsAccessKeyId = awsAccessKeyId;
            return this;
        }
        public Builder awsSecretAccessKey(@Nullable String awsSecretAccessKey) {
            this.awsSecretAccessKey = awsSecretAccessKey;
            return this;
        }
        public Builder awsSessionToken(@Nullable String awsSessionToken) {
            this.awsSessionToken = awsSessionToken;
            return this;
        }        public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistryEcrCredentialPlugin build() {
            return new GetClusterTemplateTemplateRevisionClusterConfigRkeConfigPrivateRegistryEcrCredentialPlugin(awsAccessKeyId, awsSecretAccessKey, awsSessionToken);
        }
    }
}
