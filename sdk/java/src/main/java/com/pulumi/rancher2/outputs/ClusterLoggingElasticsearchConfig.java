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
public final class ClusterLoggingElasticsearchConfig {
    /**
     * @return User password for the elascticsearch service (string)
     * 
     */
    private final @Nullable String authPassword;
    /**
     * @return Username for the elascticsearch service (string)
     * 
     */
    private final @Nullable String authUsername;
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
     * @return Date format for the elascticsearch logs. Default: `YYYY-MM-DD` (string)
     * 
     */
    private final @Nullable String dateFormat;
    /**
     * @return Endpoint of the syslog service (string)
     * 
     */
    private final String endpoint;
    /**
     * @return Index prefix for the elascticsearch logs. Default: `local` (string)
     * 
     */
    private final @Nullable String indexPrefix;
    /**
     * @return SSL verify for the syslog service (bool)
     * 
     */
    private final @Nullable Boolean sslVerify;
    /**
     * @return SSL version for the elascticsearch service (string)
     * 
     */
    private final @Nullable String sslVersion;

    @CustomType.Constructor
    private ClusterLoggingElasticsearchConfig(
        @CustomType.Parameter("authPassword") @Nullable String authPassword,
        @CustomType.Parameter("authUsername") @Nullable String authUsername,
        @CustomType.Parameter("certificate") @Nullable String certificate,
        @CustomType.Parameter("clientCert") @Nullable String clientCert,
        @CustomType.Parameter("clientKey") @Nullable String clientKey,
        @CustomType.Parameter("clientKeyPass") @Nullable String clientKeyPass,
        @CustomType.Parameter("dateFormat") @Nullable String dateFormat,
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("indexPrefix") @Nullable String indexPrefix,
        @CustomType.Parameter("sslVerify") @Nullable Boolean sslVerify,
        @CustomType.Parameter("sslVersion") @Nullable String sslVersion) {
        this.authPassword = authPassword;
        this.authUsername = authUsername;
        this.certificate = certificate;
        this.clientCert = clientCert;
        this.clientKey = clientKey;
        this.clientKeyPass = clientKeyPass;
        this.dateFormat = dateFormat;
        this.endpoint = endpoint;
        this.indexPrefix = indexPrefix;
        this.sslVerify = sslVerify;
        this.sslVersion = sslVersion;
    }

    /**
     * @return User password for the elascticsearch service (string)
     * 
     */
    public Optional<String> authPassword() {
        return Optional.ofNullable(this.authPassword);
    }
    /**
     * @return Username for the elascticsearch service (string)
     * 
     */
    public Optional<String> authUsername() {
        return Optional.ofNullable(this.authUsername);
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
     * @return Date format for the elascticsearch logs. Default: `YYYY-MM-DD` (string)
     * 
     */
    public Optional<String> dateFormat() {
        return Optional.ofNullable(this.dateFormat);
    }
    /**
     * @return Endpoint of the syslog service (string)
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return Index prefix for the elascticsearch logs. Default: `local` (string)
     * 
     */
    public Optional<String> indexPrefix() {
        return Optional.ofNullable(this.indexPrefix);
    }
    /**
     * @return SSL verify for the syslog service (bool)
     * 
     */
    public Optional<Boolean> sslVerify() {
        return Optional.ofNullable(this.sslVerify);
    }
    /**
     * @return SSL version for the elascticsearch service (string)
     * 
     */
    public Optional<String> sslVersion() {
        return Optional.ofNullable(this.sslVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingElasticsearchConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authPassword;
        private @Nullable String authUsername;
        private @Nullable String certificate;
        private @Nullable String clientCert;
        private @Nullable String clientKey;
        private @Nullable String clientKeyPass;
        private @Nullable String dateFormat;
        private String endpoint;
        private @Nullable String indexPrefix;
        private @Nullable Boolean sslVerify;
        private @Nullable String sslVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLoggingElasticsearchConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authPassword = defaults.authPassword;
    	      this.authUsername = defaults.authUsername;
    	      this.certificate = defaults.certificate;
    	      this.clientCert = defaults.clientCert;
    	      this.clientKey = defaults.clientKey;
    	      this.clientKeyPass = defaults.clientKeyPass;
    	      this.dateFormat = defaults.dateFormat;
    	      this.endpoint = defaults.endpoint;
    	      this.indexPrefix = defaults.indexPrefix;
    	      this.sslVerify = defaults.sslVerify;
    	      this.sslVersion = defaults.sslVersion;
        }

        public Builder authPassword(@Nullable String authPassword) {
            this.authPassword = authPassword;
            return this;
        }
        public Builder authUsername(@Nullable String authUsername) {
            this.authUsername = authUsername;
            return this;
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
        public Builder dateFormat(@Nullable String dateFormat) {
            this.dateFormat = dateFormat;
            return this;
        }
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder indexPrefix(@Nullable String indexPrefix) {
            this.indexPrefix = indexPrefix;
            return this;
        }
        public Builder sslVerify(@Nullable Boolean sslVerify) {
            this.sslVerify = sslVerify;
            return this;
        }
        public Builder sslVersion(@Nullable String sslVersion) {
            this.sslVersion = sslVersion;
            return this;
        }        public ClusterLoggingElasticsearchConfig build() {
            return new ClusterLoggingElasticsearchConfig(authPassword, authUsername, certificate, clientCert, clientKey, clientKeyPass, dateFormat, endpoint, indexPrefix, sslVerify, sslVersion);
        }
    }
}
