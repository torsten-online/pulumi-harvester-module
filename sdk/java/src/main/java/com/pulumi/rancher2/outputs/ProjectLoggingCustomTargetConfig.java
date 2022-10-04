// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectLoggingCustomTargetConfig {
    /**
     * @return SSL certificate for the syslog service (string)
     * 
     */
    private @Nullable String certificate;
    /**
     * @return SSL client certificate for the syslog service (string)
     * 
     */
    private @Nullable String clientCert;
    /**
     * @return SSL client key for the syslog service (string)
     * 
     */
    private @Nullable String clientKey;
    /**
     * @return Custom target config content (string)
     * 
     */
    private String content;

    private ProjectLoggingCustomTargetConfig() {}
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
     * @return Custom target config content (string)
     * 
     */
    public String content() {
        return this.content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectLoggingCustomTargetConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String certificate;
        private @Nullable String clientCert;
        private @Nullable String clientKey;
        private String content;
        public Builder() {}
        public Builder(ProjectLoggingCustomTargetConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.clientCert = defaults.clientCert;
    	      this.clientKey = defaults.clientKey;
    	      this.content = defaults.content;
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
        public Builder content(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        public ProjectLoggingCustomTargetConfig build() {
            final var o = new ProjectLoggingCustomTargetConfig();
            o.certificate = certificate;
            o.clientCert = clientCert;
            o.clientKey = clientKey;
            o.content = content;
            return o;
        }
    }
}
