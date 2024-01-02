// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNotifierMsteamsConfig {
    private @Nullable String proxyUrl;
    private String url;

    private GetNotifierMsteamsConfig() {}
    public Optional<String> proxyUrl() {
        return Optional.ofNullable(this.proxyUrl);
    }
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotifierMsteamsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String proxyUrl;
        private String url;
        public Builder() {}
        public Builder(GetNotifierMsteamsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.proxyUrl = defaults.proxyUrl;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder proxyUrl(@Nullable String proxyUrl) {

            this.proxyUrl = proxyUrl;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetNotifierMsteamsConfig", "url");
            }
            this.url = url;
            return this;
        }
        public GetNotifierMsteamsConfig build() {
            final var _resultValue = new GetNotifierMsteamsConfig();
            _resultValue.proxyUrl = proxyUrl;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
