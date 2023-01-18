// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NotifierWebhookConfig {
    /**
     * @return Webhook proxy url (string)
     * 
     */
    private @Nullable String proxyUrl;
    /**
     * @return Webhook url (string)
     * 
     */
    private String url;

    private NotifierWebhookConfig() {}
    /**
     * @return Webhook proxy url (string)
     * 
     */
    public Optional<String> proxyUrl() {
        return Optional.ofNullable(this.proxyUrl);
    }
    /**
     * @return Webhook url (string)
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotifierWebhookConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String proxyUrl;
        private String url;
        public Builder() {}
        public Builder(NotifierWebhookConfig defaults) {
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
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public NotifierWebhookConfig build() {
            final var o = new NotifierWebhookConfig();
            o.proxyUrl = proxyUrl;
            o.url = url;
            return o;
        }
    }
}
