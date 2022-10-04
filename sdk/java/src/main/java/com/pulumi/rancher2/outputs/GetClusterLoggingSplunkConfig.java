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
public final class GetClusterLoggingSplunkConfig {
    private @Nullable String certificate;
    private @Nullable String clientCert;
    private @Nullable String clientKey;
    private @Nullable String clientKeyPass;
    private String endpoint;
    private @Nullable String index;
    private @Nullable String source;
    private Boolean sslVerify;
    private String token;

    private GetClusterLoggingSplunkConfig() {}
    public Optional<String> certificate() {
        return Optional.ofNullable(this.certificate);
    }
    public Optional<String> clientCert() {
        return Optional.ofNullable(this.clientCert);
    }
    public Optional<String> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }
    public Optional<String> clientKeyPass() {
        return Optional.ofNullable(this.clientKeyPass);
    }
    public String endpoint() {
        return this.endpoint;
    }
    public Optional<String> index() {
        return Optional.ofNullable(this.index);
    }
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    public Boolean sslVerify() {
        return this.sslVerify;
    }
    public String token() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterLoggingSplunkConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String certificate;
        private @Nullable String clientCert;
        private @Nullable String clientKey;
        private @Nullable String clientKeyPass;
        private String endpoint;
        private @Nullable String index;
        private @Nullable String source;
        private Boolean sslVerify;
        private String token;
        public Builder() {}
        public Builder(GetClusterLoggingSplunkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.clientCert = defaults.clientCert;
    	      this.clientKey = defaults.clientKey;
    	      this.clientKeyPass = defaults.clientKeyPass;
    	      this.endpoint = defaults.endpoint;
    	      this.index = defaults.index;
    	      this.source = defaults.source;
    	      this.sslVerify = defaults.sslVerify;
    	      this.token = defaults.token;
        }

        @CustomType.Setter
        public Builder certificate(@Nullable String certificate) {
            this.certificate = certificate;
            return this;
        }
        @CustomType.Setter
        public Builder clientCert(@Nullable String clientCert) {
            this.clientCert = clientCert;
            return this;
        }
        @CustomType.Setter
        public Builder clientKey(@Nullable String clientKey) {
            this.clientKey = clientKey;
            return this;
        }
        @CustomType.Setter
        public Builder clientKeyPass(@Nullable String clientKeyPass) {
            this.clientKeyPass = clientKeyPass;
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        @CustomType.Setter
        public Builder index(@Nullable String index) {
            this.index = index;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder sslVerify(Boolean sslVerify) {
            this.sslVerify = Objects.requireNonNull(sslVerify);
            return this;
        }
        @CustomType.Setter
        public Builder token(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }
        public GetClusterLoggingSplunkConfig build() {
            final var o = new GetClusterLoggingSplunkConfig();
            o.certificate = certificate;
            o.clientCert = clientCert;
            o.clientKey = clientKey;
            o.clientKeyPass = clientKeyPass;
            o.endpoint = endpoint;
            o.index = index;
            o.source = source;
            o.sslVerify = sslVerify;
            o.token = token;
            return o;
        }
    }
}
