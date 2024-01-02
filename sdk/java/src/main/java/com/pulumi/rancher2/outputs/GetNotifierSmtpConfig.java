// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNotifierSmtpConfig {
    private String defaultRecipient;
    private String host;
    private @Nullable String password;
    private Integer port;
    private String sender;
    private @Nullable Boolean tls;
    private @Nullable String username;

    private GetNotifierSmtpConfig() {}
    public String defaultRecipient() {
        return this.defaultRecipient;
    }
    public String host() {
        return this.host;
    }
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    public Integer port() {
        return this.port;
    }
    public String sender() {
        return this.sender;
    }
    public Optional<Boolean> tls() {
        return Optional.ofNullable(this.tls);
    }
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotifierSmtpConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String defaultRecipient;
        private String host;
        private @Nullable String password;
        private Integer port;
        private String sender;
        private @Nullable Boolean tls;
        private @Nullable String username;
        public Builder() {}
        public Builder(GetNotifierSmtpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRecipient = defaults.defaultRecipient;
    	      this.host = defaults.host;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.sender = defaults.sender;
    	      this.tls = defaults.tls;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder defaultRecipient(String defaultRecipient) {
            if (defaultRecipient == null) {
              throw new MissingRequiredPropertyException("GetNotifierSmtpConfig", "defaultRecipient");
            }
            this.defaultRecipient = defaultRecipient;
            return this;
        }
        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("GetNotifierSmtpConfig", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {

            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetNotifierSmtpConfig", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder sender(String sender) {
            if (sender == null) {
              throw new MissingRequiredPropertyException("GetNotifierSmtpConfig", "sender");
            }
            this.sender = sender;
            return this;
        }
        @CustomType.Setter
        public Builder tls(@Nullable Boolean tls) {

            this.tls = tls;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {

            this.username = username;
            return this;
        }
        public GetNotifierSmtpConfig build() {
            final var _resultValue = new GetNotifierSmtpConfig();
            _resultValue.defaultRecipient = defaultRecipient;
            _resultValue.host = host;
            _resultValue.password = password;
            _resultValue.port = port;
            _resultValue.sender = sender;
            _resultValue.tls = tls;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
