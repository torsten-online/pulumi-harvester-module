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
public final class ClusterLoggingSplunkConfig {
    /**
     * @return SSL certificate for the syslog service (string)
     * 
     */
    private final @Nullable String certificate;
    /**
     * @return SSL client certificate for the syslog service (string)
     * 
     */
    private final @Nullable String clientCert;
    /**
     * @return SSL client key for the syslog service (string)
     * 
     */
    private final @Nullable String clientKey;
    /**
     * @return SSL client key password for the splunk service (string)
     * 
     */
    private final @Nullable String clientKeyPass;
    /**
     * @return Endpoint of the syslog service (string)
     * 
     */
    private final String endpoint;
    /**
     * @return Index prefix for the splunk logs (string)
     * 
     */
    private final @Nullable String index;
    /**
     * @return Date format for the splunk logs (string)
     * 
     */
    private final @Nullable String source;
    /**
     * @return SSL verify for the syslog service (bool)
     * 
     */
    private final @Nullable Boolean sslVerify;
    /**
     * @return Token for the syslog service (string)
     * 
     */
    private final String token;

    @CustomType.Constructor
    private ClusterLoggingSplunkConfig(
        @CustomType.Parameter("certificate") @Nullable String certificate,
        @CustomType.Parameter("clientCert") @Nullable String clientCert,
        @CustomType.Parameter("clientKey") @Nullable String clientKey,
        @CustomType.Parameter("clientKeyPass") @Nullable String clientKeyPass,
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("index") @Nullable String index,
        @CustomType.Parameter("source") @Nullable String source,
        @CustomType.Parameter("sslVerify") @Nullable Boolean sslVerify,
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

    /**
     * @return SSL certificate for the syslog service (string)
     * 
     */
    public Optional<String> certificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * @return SSL client certificate for the syslog service (string)
     * 
     */
    public Optional<String> clientCert() {
        return Optional.ofNullable(this.clientCert);
    }
    /**
     * @return SSL client key for the syslog service (string)
     * 
     */
    public Optional<String> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }
    /**
     * @return SSL client key password for the splunk service (string)
     * 
     */
    public Optional<String> clientKeyPass() {
        return Optional.ofNullable(this.clientKeyPass);
    }
    /**
     * @return Endpoint of the syslog service (string)
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return Index prefix for the splunk logs (string)
     * 
     */
    public Optional<String> index() {
        return Optional.ofNullable(this.index);
    }
    /**
     * @return Date format for the splunk logs (string)
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    /**
     * @return SSL verify for the syslog service (bool)
     * 
     */
    public Optional<Boolean> sslVerify() {
        return Optional.ofNullable(this.sslVerify);
    }
    /**
     * @return Token for the syslog service (string)
     * 
     */
    public String token() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingSplunkConfig defaults) {
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
        private @Nullable Boolean sslVerify;
        private String token;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLoggingSplunkConfig defaults) {
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
        public Builder sslVerify(@Nullable Boolean sslVerify) {
            this.sslVerify = sslVerify;
            return this;
        }
        public Builder token(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }        public ClusterLoggingSplunkConfig build() {
            return new ClusterLoggingSplunkConfig(certificate, clientCert, clientKey, clientKeyPass, endpoint, index, source, sslVerify, token);
        }
    }
}
