// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CloudCredentialGoogleCredentialConfig {
    /**
     * @return Google auth encoded json (string)
     * 
     */
    private String authEncodedJson;

    private CloudCredentialGoogleCredentialConfig() {}
    /**
     * @return Google auth encoded json (string)
     * 
     */
    public String authEncodedJson() {
        return this.authEncodedJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudCredentialGoogleCredentialConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authEncodedJson;
        public Builder() {}
        public Builder(CloudCredentialGoogleCredentialConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authEncodedJson = defaults.authEncodedJson;
        }

        @CustomType.Setter
        public Builder authEncodedJson(String authEncodedJson) {
            if (authEncodedJson == null) {
              throw new MissingRequiredPropertyException("CloudCredentialGoogleCredentialConfig", "authEncodedJson");
            }
            this.authEncodedJson = authEncodedJson;
            return this;
        }
        public CloudCredentialGoogleCredentialConfig build() {
            final var _resultValue = new CloudCredentialGoogleCredentialConfig();
            _resultValue.authEncodedJson = authEncodedJson;
            return _resultValue;
        }
    }
}
