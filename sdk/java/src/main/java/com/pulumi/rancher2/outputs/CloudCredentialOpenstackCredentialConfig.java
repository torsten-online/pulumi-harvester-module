// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CloudCredentialOpenstackCredentialConfig {
    /**
     * @return vSphere password (string)
     * 
     */
    private String password;

    private CloudCredentialOpenstackCredentialConfig() {}
    /**
     * @return vSphere password (string)
     * 
     */
    public String password() {
        return this.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudCredentialOpenstackCredentialConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String password;
        public Builder() {}
        public Builder(CloudCredentialOpenstackCredentialConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
        }

        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public CloudCredentialOpenstackCredentialConfig build() {
            final var _resultValue = new CloudCredentialOpenstackCredentialConfig();
            _resultValue.password = password;
            return _resultValue;
        }
    }
}
