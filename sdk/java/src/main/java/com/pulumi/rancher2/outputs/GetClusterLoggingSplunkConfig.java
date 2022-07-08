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
    private final @Nullable String certificate;
    private final @Nullable String clientCert;
    private final @Nullable String clientKey;
    private final @Nullable String clientKeyPass;
    private final String endpoint;
    private final @Nullable String index;
    private final @Nullable String source;
    private final Boolean sslVerify;
    private final String token;

    @CustomType.Constructor
    private GetClusterLoggingSplunkConfig(
        @CustomType.Parameter("certificate") @Nullable String certificate,
        @CustomType.Parameter("clientCert") @Nullable String clientCert,
        @CustomType.Parameter("clientKey") @Nullable String clientKey,
        @CustomType.Parameter("clientKeyPass") @Nullable String clientKeyPass,
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("index") @Nullable String index,
        @CustomType.Parameter("source") @Nullable String source,
        @CustomType.Parameter("sslVerify") Boolean sslVerify,
        @CustomType.Parameter("token") String token) {
        this.certificate = certificate;
        this.clientCert = clientCert;
        this.clientKey = clientKey;
        this.clientKeyPass = clientKeyPass;
        this.endpoint = endpoint;
        this.index = index;
        this.source = source;
        this.sslVerify = sslVerify;
        this.token = token;
    }

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

        public Builder() {
    	      // Empty
        }

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

        public Builder certificate(@Nullable String certificate) {
            this.certificate = certificate;
            return this;
        }
        public Builder clientCert(@Nullable String clientCert) {
            this.clientCert = clientCert;
            return this;
        }
        public Builder clientKey(@Nullable String clientKey) {
            this.clientKey = clientKey;
            return this;
        }
        public Builder clientKeyPass(@Nullable String clientKeyPass) {
            this.clientKeyPass = clientKeyPass;
            return this;
        }
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder index(@Nullable String index) {
            this.index = index;
            return this;
        }
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        public Builder sslVerify(Boolean sslVerify) {
            this.sslVerify = Objects.requireNonNull(sslVerify);
            return this;
        }
        public Builder token(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }        public GetClusterLoggingSplunkConfig build() {
            return new GetClusterLoggingSplunkConfig(certificate, clientCert, clientKey, clientKeyPass, endpoint, index, source, sslVerify, token);
        }
    }
}
