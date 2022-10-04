// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNotifierDingtalkConfig {
    private @Nullable String proxyUrl;
    private @Nullable String secret;
    private String url;

    private GetNotifierDingtalkConfig() {}
    public Optional<String> proxyUrl() {
        return Optional.ofNullable(this.proxyUrl);
    }
    public Optional<String> secret() {
        return Optional.ofNullable(this.secret);
    }
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotifierDingtalkConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String proxyUrl;
        private @Nullable String secret;
        private String url;
        public Builder() {}
        public Builder(GetNotifierDingtalkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.proxyUrl = defaults.proxyUrl;
    	      this.secret = defaults.secret;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder proxyUrl(@Nullable String proxyUrl) {
            this.proxyUrl = proxyUrl;
            return this;
        }
        @CustomType.Setter
        public Builder secret(@Nullable String secret) {
            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public GetNotifierDingtalkConfig build() {
            final var o = new GetNotifierDingtalkConfig();
            o.proxyUrl = proxyUrl;
            o.secret = secret;
            o.url = url;
            return o;
        }
    }
}
