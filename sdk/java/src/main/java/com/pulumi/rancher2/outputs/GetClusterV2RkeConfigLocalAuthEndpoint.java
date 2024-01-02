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
public final class GetClusterV2RkeConfigLocalAuthEndpoint {
    private @Nullable String caCerts;
    private @Nullable Boolean enabled;
    private @Nullable String fqdn;

    private GetClusterV2RkeConfigLocalAuthEndpoint() {}
    public Optional<String> caCerts() {
        return Optional.ofNullable(this.caCerts);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> fqdn() {
        return Optional.ofNullable(this.fqdn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterV2RkeConfigLocalAuthEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String caCerts;
        private @Nullable Boolean enabled;
        private @Nullable String fqdn;
        public Builder() {}
        public Builder(GetClusterV2RkeConfigLocalAuthEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCerts = defaults.caCerts;
    	      this.enabled = defaults.enabled;
    	      this.fqdn = defaults.fqdn;
        }

        @CustomType.Setter
        public Builder caCerts(@Nullable String caCerts) {

            this.caCerts = caCerts;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder fqdn(@Nullable String fqdn) {

            this.fqdn = fqdn;
            return this;
        }
        public GetClusterV2RkeConfigLocalAuthEndpoint build() {
            final var _resultValue = new GetClusterV2RkeConfigLocalAuthEndpoint();
            _resultValue.caCerts = caCerts;
            _resultValue.enabled = enabled;
            _resultValue.fqdn = fqdn;
            return _resultValue;
        }
    }
}
