// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GlobalDnsProviderAlidnsConfig {
    private String accessKey;
    private String secretKey;

    private GlobalDnsProviderAlidnsConfig() {}
    public String accessKey() {
        return this.accessKey;
    }
    public String secretKey() {
        return this.secretKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalDnsProviderAlidnsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessKey;
        private String secretKey;
        public Builder() {}
        public Builder(GlobalDnsProviderAlidnsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.secretKey = defaults.secretKey;
        }

        @CustomType.Setter
        public Builder accessKey(String accessKey) {
            if (accessKey == null) {
              throw new MissingRequiredPropertyException("GlobalDnsProviderAlidnsConfig", "accessKey");
            }
            this.accessKey = accessKey;
            return this;
        }
        @CustomType.Setter
        public Builder secretKey(String secretKey) {
            if (secretKey == null) {
              throw new MissingRequiredPropertyException("GlobalDnsProviderAlidnsConfig", "secretKey");
            }
            this.secretKey = secretKey;
            return this;
        }
        public GlobalDnsProviderAlidnsConfig build() {
            final var _resultValue = new GlobalDnsProviderAlidnsConfig();
            _resultValue.accessKey = accessKey;
            _resultValue.secretKey = secretKey;
            return _resultValue;
        }
    }
}
