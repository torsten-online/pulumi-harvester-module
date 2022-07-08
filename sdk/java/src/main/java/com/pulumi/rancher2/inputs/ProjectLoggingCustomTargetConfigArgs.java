// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectLoggingCustomTargetConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectLoggingCustomTargetConfigArgs Empty = new ProjectLoggingCustomTargetConfigArgs();

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
     * Custom target config content (string)
     * 
     */
    @Import(name="content", required=true)
    private Output<String> content;

    /**
     * @return Custom target config content (string)
     * 
     */
    public Output<String> content() {
        return this.content;
    }

    private ProjectLoggingCustomTargetConfigArgs() {}

    private ProjectLoggingCustomTargetConfigArgs(ProjectLoggingCustomTargetConfigArgs $) {
        this.certificate = $.certificate;
        this.clientCert = $.clientCert;
        this.clientKey = $.clientKey;
        this.content = $.content;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectLoggingCustomTargetConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectLoggingCustomTargetConfigArgs $;

        public Builder() {
            $ = new ProjectLoggingCustomTargetConfigArgs();
        }

        public Builder(ProjectLoggingCustomTargetConfigArgs defaults) {
            $ = new ProjectLoggingCustomTargetConfigArgs(Objects.requireNonNull(defaults));
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
         * @param content Custom target config content (string)
         * 
         * @return builder
         * 
         */
        public Builder content(Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content Custom target config content (string)
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        public ProjectLoggingCustomTargetConfigArgs build() {
            $.content = Objects.requireNonNull($.content, "expected parameter 'content' to be non-null");
            return $;
        }
    }

}
