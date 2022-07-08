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
public final class GetGlobalDnsProviderCloudflareConfig {
    private final String apiEmail;
    private final String apiKey;
    private final @Nullable Boolean proxySetting;

    @CustomType.Constructor
    private GetGlobalDnsProviderCloudflareConfig(
        @CustomType.Parameter("apiEmail") String apiEmail,
        @CustomType.Parameter("apiKey") String apiKey,
        @CustomType.Parameter("proxySetting") @Nullable Boolean proxySetting) {
        this.apiEmail = apiEmail;
        this.apiKey = apiKey;
        this.proxySetting = proxySetting;
    }

    public String apiEmail() {
        return this.apiEmail;
    }
    public String apiKey() {
        return this.apiKey;
    }
    public Optional<Boolean> proxySetting() {
        return Optional.ofNullable(this.proxySetting);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalDnsProviderCloudflareConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiEmail;
        private String apiKey;
        private @Nullable Boolean proxySetting;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalDnsProviderCloudflareConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiEmail = defaults.apiEmail;
    	      this.apiKey = defaults.apiKey;
    	      this.proxySetting = defaults.proxySetting;
        }

        public Builder apiEmail(String apiEmail) {
            this.apiEmail = Objects.requireNonNull(apiEmail);
            return this;
        }
        public Builder apiKey(String apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey);
            return this;
        }
        public Builder proxySetting(@Nullable Boolean proxySetting) {
            this.proxySetting = proxySetting;
            return this;
        }        public GetGlobalDnsProviderCloudflareConfig build() {
            return new GetGlobalDnsProviderCloudflareConfig(apiEmail, apiKey, proxySetting);
        }
    }
}
