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
public final class GetClusterClusterAuthEndpoint {
    private final @Nullable String caCerts;
    private final @Nullable Boolean enabled;
    private final @Nullable String fqdn;

    @CustomType.Constructor
    private GetClusterClusterAuthEndpoint(
        @CustomType.Parameter("caCerts") @Nullable String caCerts,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("fqdn") @Nullable String fqdn) {
        this.caCerts = caCerts;
        this.enabled = enabled;
        this.fqdn = fqdn;
    }

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

    public static Builder builder(GetClusterClusterAuthEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String caCerts;
        private @Nullable Boolean enabled;
        private @Nullable String fqdn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterClusterAuthEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCerts = defaults.caCerts;
    	      this.enabled = defaults.enabled;
    	      this.fqdn = defaults.fqdn;
        }

        public Builder caCerts(@Nullable String caCerts) {
            this.caCerts = caCerts;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder fqdn(@Nullable String fqdn) {
            this.fqdn = fqdn;
            return this;
        }        public GetClusterClusterAuthEndpoint build() {
            return new GetClusterClusterAuthEndpoint(caCerts, enabled, fqdn);
        }
    }
}
