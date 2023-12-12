// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NotifierPagerdutyConfig {
    /**
     * @return Wechat proxy url (string)
     * 
     */
    private @Nullable String proxyUrl;
    /**
     * @return Pagerduty service key (string)
     * 
     */
    private String serviceKey;

    private NotifierPagerdutyConfig() {}
    /**
     * @return Wechat proxy url (string)
     * 
     */
    public Optional<String> proxyUrl() {
        return Optional.ofNullable(this.proxyUrl);
    }
    /**
     * @return Pagerduty service key (string)
     * 
     */
    public String serviceKey() {
        return this.serviceKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotifierPagerdutyConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String proxyUrl;
        private String serviceKey;
        public Builder() {}
        public Builder(NotifierPagerdutyConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.proxyUrl = defaults.proxyUrl;
    	      this.serviceKey = defaults.serviceKey;
        }

        @CustomType.Setter
        public Builder proxyUrl(@Nullable String proxyUrl) {
            this.proxyUrl = proxyUrl;
            return this;
        }
        @CustomType.Setter
        public Builder serviceKey(String serviceKey) {
            this.serviceKey = Objects.requireNonNull(serviceKey);
            return this;
        }
        public NotifierPagerdutyConfig build() {
            final var _resultValue = new NotifierPagerdutyConfig();
            _resultValue.proxyUrl = proxyUrl;
            _resultValue.serviceKey = serviceKey;
            return _resultValue;
        }
    }
}
