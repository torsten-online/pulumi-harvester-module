// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNotifierSlackConfig {
    private String defaultRecipient;
    private @Nullable String proxyUrl;
    private String url;

    private GetNotifierSlackConfig() {}
    public String defaultRecipient() {
        return this.defaultRecipient;
    }
    public Optional<String> proxyUrl() {
        return Optional.ofNullable(this.proxyUrl);
    }
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotifierSlackConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String defaultRecipient;
        private @Nullable String proxyUrl;
        private String url;
        public Builder() {}
        public Builder(GetNotifierSlackConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRecipient = defaults.defaultRecipient;
    	      this.proxyUrl = defaults.proxyUrl;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder defaultRecipient(String defaultRecipient) {
            this.defaultRecipient = Objects.requireNonNull(defaultRecipient);
            return this;
        }
        @CustomType.Setter
        public Builder proxyUrl(@Nullable String proxyUrl) {
            this.proxyUrl = proxyUrl;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public GetNotifierSlackConfig build() {
            final var _resultValue = new GetNotifierSlackConfig();
            _resultValue.defaultRecipient = defaultRecipient;
            _resultValue.proxyUrl = proxyUrl;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
