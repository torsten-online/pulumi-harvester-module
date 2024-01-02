// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CloudCredentialLinodeCredentialConfig {
    /**
     * @return Linode API token (string)
     * 
     */
    private String token;

    private CloudCredentialLinodeCredentialConfig() {}
    /**
     * @return Linode API token (string)
     * 
     */
    public String token() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudCredentialLinodeCredentialConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String token;
        public Builder() {}
        public Builder(CloudCredentialLinodeCredentialConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.token = defaults.token;
        }

        @CustomType.Setter
        public Builder token(String token) {
            if (token == null) {
              throw new MissingRequiredPropertyException("CloudCredentialLinodeCredentialConfig", "token");
            }
            this.token = token;
            return this;
        }
        public CloudCredentialLinodeCredentialConfig build() {
            final var _resultValue = new CloudCredentialLinodeCredentialConfig();
            _resultValue.token = token;
            return _resultValue;
        }
    }
}
