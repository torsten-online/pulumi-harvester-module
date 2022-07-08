// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterLoggingElasticsearchConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterLoggingElasticsearchConfigArgs Empty = new ClusterLoggingElasticsearchConfigArgs();

    /**
     * User password for the elascticsearch service (string)
     * 
     */
    @Import(name="authPassword")
    private @Nullable Output<String> authPassword;

    /**
     * @return User password for the elascticsearch service (string)
     * 
     */
    public Optional<Output<String>> authPassword() {
        return Optional.ofNullable(this.authPassword);
    }

    /**
     * Username for the elascticsearch service (string)
     * 
     */
    @Import(name="authUsername")
    private @Nullable Output<String> authUsername;

    /**
     * @return Username for the elascticsearch service (string)
     * 
     */
    public Optional<Output<String>> authUsername() {
        return Optional.ofNullable(this.authUsername);
    }

    /**
     * SSL certificate for the syslog service (string)
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return SSL certificate for the syslog service (string)
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * SSL client certificate for the syslog service (string)
     * 
     */
    @Import(name="clientCert")
    private @Nullable Output<String> clientCert;

    /**
     * @return SSL client certificate for the syslog service (string)
     * 
     */
    public Optional<Output<String>> clientCert() {
        return Optional.ofNullable(this.clientCert);
    }

    /**
     * SSL client key for the syslog service (string)
     * 
     */
    @Import(name="clientKey")
    private @Nullable Output<String> clientKey;

    /**
     * @return SSL client key for the syslog service (string)
     * 
     */
    public Optional<Output<String>> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }

    /**
     * SSL client key password for the splunk service (string)
     * 
     */
    @Import(name="clientKeyPass")
    private @Nullable Output<String> clientKeyPass;

    /**
     * @return SSL client key password for the splunk service (string)
     * 
     */
    public Optional<Output<String>> clientKeyPass() {
        return Optional.ofNullable(this.clientKeyPass);
    }

    /**
     * Date format for the elascticsearch logs. Default: `YYYY-MM-DD` (string)
     * 
     */
    @Import(name="dateFormat")
    private @Nullable Output<String> dateFormat;

    /**
     * @return Date format for the elascticsearch logs. Default: `YYYY-MM-DD` (string)
     * 
     */
    public Optional<Output<String>> dateFormat() {
        return Optional.ofNullable(this.dateFormat);
    }

    /**
     * Endpoint of the syslog service (string)
     * 
     */
    @Import(name="endpoint", required=true)
    private Output<String> endpoint;

    /**
     * @return Endpoint of the syslog service (string)
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }

    /**
     * Index prefix for the elascticsearch logs. Default: `local` (string)
     * 
     */
    @Import(name="indexPrefix")
    private @Nullable Output<String> indexPrefix;

    /**
     * @return Index prefix for the elascticsearch logs. Default: `local` (string)
     * 
     */
    public Optional<Output<String>> indexPrefix() {
        return Optional.ofNullable(this.indexPrefix);
    }

    /**
     * SSL verify for the syslog service (bool)
     * 
     */
    @Import(name="sslVerify")
    private @Nullable Output<Boolean> sslVerify;

    /**
     * @return SSL verify for the syslog service (bool)
     * 
     */
    public Optional<Output<Boolean>> sslVerify() {
        return Optional.ofNullable(this.sslVerify);
    }

    /**
     * SSL version for the elascticsearch service (string)
     * 
     */
    @Import(name="sslVersion")
    private @Nullable Output<String> sslVersion;

    /**
     * @return SSL version for the elascticsearch service (string)
     * 
     */
    public Optional<Output<String>> sslVersion() {
        return Optional.ofNullable(this.sslVersion);
    }

    private ClusterLoggingElasticsearchConfigArgs() {}

    private ClusterLoggingElasticsearchConfigArgs(ClusterLoggingElasticsearchConfigArgs $) {
        this.authPassword = $.authPassword;
        this.authUsername = $.authUsername;
        this.certificate = $.certificate;
        this.clientCert = $.clientCert;
        this.clientKey = $.clientKey;
        this.clientKeyPass = $.clientKeyPass;
        this.dateFormat = $.dateFormat;
        this.endpoint = $.endpoint;
        this.indexPrefix = $.indexPrefix;
        this.sslVerify = $.sslVerify;
        this.sslVersion = $.sslVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterLoggingElasticsearchConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterLoggingElasticsearchConfigArgs $;

        public Builder() {
            $ = new ClusterLoggingElasticsearchConfigArgs();
        }

        public Builder(ClusterLoggingElasticsearchConfigArgs defaults) {
            $ = new ClusterLoggingElasticsearchConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authPassword User password for the elascticsearch service (string)
         * 
         * @return builder
         * 
         */
        public Builder authPassword(@Nullable Output<String> authPassword) {
            $.authPassword = authPassword;
            return this;
        }

        /**
         * @param authPassword User password for the elascticsearch service (string)
         * 
         * @return builder
         * 
         */
        public Builder authPassword(String authPassword) {
            return authPassword(Output.of(authPassword));
        }

        /**
         * @param authUsername Username for the elascticsearch service (string)
         * 
         * @return builder
         * 
         */
        public Builder authUsername(@Nullable Output<String> authUsername) {
            $.authUsername = authUsername;
            return this;
        }

        /**
         * @param authUsername Username for the elascticsearch service (string)
         * 
         * @return builder
         * 
         */
        public Builder authUsername(String authUsername) {
            return authUsername(Output.of(authUsername));
        }

        /**
         * @param certificate SSL certificate for the syslog service (string)
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate SSL certificate for the syslog service (string)
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param clientCert SSL client certificate for the syslog service (string)
         * 
         * @return builder
         * 
         */
        public Builder clientCert(@Nullable Output<String> clientCert) {
            $.clientCert = clientCert;
            return this;
        }

        /**
         * @param clientCert SSL client certificate for the syslog service (string)
         * 
         * @return builder
         * 
         */
        public Builder clientCert(String clientCert) {
            return clientCert(Output.of(clientCert));
        }

        /**
         * @param clientKey SSL client key for the syslog service (string)
         * 
         * @return builder
         * 
         */
        public Builder clientKey(@Nullable Output<String> clientKey) {
            $.clientKey = clientKey;
            return this;
        }

        /**
         * @param clientKey SSL client key for the syslog service (string)
         * 
         * @return builder
         * 
         */
        public Builder clientKey(String clientKey) {
            return clientKey(Output.of(clientKey));
        }

        /**
         * @param clientKeyPass SSL client key password for the splunk service (string)
         * 
         * @return builder
         * 
         */
        public Builder clientKeyPass(@Nullable Output<String> clientKeyPass) {
            $.clientKeyPass = clientKeyPass;
            return this;
        }

        /**
         * @param clientKeyPass SSL client key password for the splunk service (string)
         * 
         * @return builder
         * 
         */
        public Builder clientKeyPass(String clientKeyPass) {
            return clientKeyPass(Output.of(clientKeyPass));
        }

        /**
         * @param dateFormat Date format for the elascticsearch logs. Default: `YYYY-MM-DD` (string)
         * 
         * @return builder
         * 
         */
        public Builder dateFormat(@Nullable Output<String> dateFormat) {
            $.dateFormat = dateFormat;
            return this;
        }

        /**
         * @param dateFormat Date format for the elascticsearch logs. Default: `YYYY-MM-DD` (string)
         * 
         * @return builder
         * 
         */
        public Builder dateFormat(String dateFormat) {
            return dateFormat(Output.of(dateFormat));
        }

        /**
         * @param endpoint Endpoint of the syslog service (string)
         * 
         * @return builder
         * 
         */
        public Builder endpoint(Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint Endpoint of the syslog service (string)
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param indexPrefix Index prefix for the elascticsearch logs. Default: `local` (string)
         * 
         * @return builder
         * 
         */
        public Builder indexPrefix(@Nullable Output<String> indexPrefix) {
            $.indexPrefix = indexPrefix;
            return this;
        }

        /**
         * @param indexPrefix Index prefix for the elascticsearch logs. Default: `local` (string)
         * 
         * @return builder
         * 
         */
        public Builder indexPrefix(String indexPrefix) {
            return indexPrefix(Output.of(indexPrefix));
        }

        /**
         * @param sslVerify SSL verify for the syslog service (bool)
         * 
         * @return builder
         * 
         */
        public Builder sslVerify(@Nullable Output<Boolean> sslVerify) {
            $.sslVerify = sslVerify;
            return this;
        }

        /**
         * @param sslVerify SSL verify for the syslog service (bool)
         * 
         * @return builder
         * 
         */
        public Builder sslVerify(Boolean sslVerify) {
            return sslVerify(Output.of(sslVerify));
        }

        /**
         * @param sslVersion SSL version for the elascticsearch service (string)
         * 
         * @return builder
         * 
         */
        public Builder sslVersion(@Nullable Output<String> sslVersion) {
            $.sslVersion = sslVersion;
            return this;
        }

        /**
         * @param sslVersion SSL version for the elascticsearch service (string)
         * 
         * @return builder
         * 
         */
        public Builder sslVersion(String sslVersion) {
            return sslVersion(Output.of(sslVersion));
        }

        public ClusterLoggingElasticsearchConfigArgs build() {
            $.endpoint = Objects.requireNonNull($.endpoint, "expected parameter 'endpoint' to be non-null");
            return $;
        }
    }

}
