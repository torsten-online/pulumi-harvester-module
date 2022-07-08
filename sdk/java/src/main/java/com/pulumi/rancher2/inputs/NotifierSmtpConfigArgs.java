// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotifierSmtpConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotifierSmtpConfigArgs Empty = new NotifierSmtpConfigArgs();

    /**
     * Wechat default recipient (string)
     * 
     */
    @Import(name="defaultRecipient", required=true)
    private Output<String> defaultRecipient;

    /**
     * @return Wechat default recipient (string)
     * 
     */
    public Output<String> defaultRecipient() {
        return this.defaultRecipient;
    }

    /**
     * SMTP host (string)
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    /**
     * @return SMTP host (string)
     * 
     */
    public Output<String> host() {
        return this.host;
    }

    /**
     * SMTP password (string)
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return SMTP password (string)
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * SMTP port (int)
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return SMTP port (int)
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * SMTP sender (string)
     * 
     */
    @Import(name="sender", required=true)
    private Output<String> sender;

    /**
     * @return SMTP sender (string)
     * 
     */
    public Output<String> sender() {
        return this.sender;
    }

    /**
     * SMTP tls. Default `true` (bool)
     * 
     */
    @Import(name="tls")
    private @Nullable Output<Boolean> tls;

    /**
     * @return SMTP tls. Default `true` (bool)
     * 
     */
    public Optional<Output<Boolean>> tls() {
        return Optional.ofNullable(this.tls);
    }

    /**
     * SMTP username (string)
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return SMTP username (string)
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private NotifierSmtpConfigArgs() {}

    private NotifierSmtpConfigArgs(NotifierSmtpConfigArgs $) {
        this.defaultRecipient = $.defaultRecipient;
        this.host = $.host;
        this.password = $.password;
        this.port = $.port;
        this.sender = $.sender;
        this.tls = $.tls;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotifierSmtpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotifierSmtpConfigArgs $;

        public Builder() {
            $ = new NotifierSmtpConfigArgs();
        }

        public Builder(NotifierSmtpConfigArgs defaults) {
            $ = new NotifierSmtpConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultRecipient Wechat default recipient (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultRecipient(Output<String> defaultRecipient) {
            $.defaultRecipient = defaultRecipient;
            return this;
        }

        /**
         * @param defaultRecipient Wechat default recipient (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultRecipient(String defaultRecipient) {
            return defaultRecipient(Output.of(defaultRecipient));
        }

        /**
         * @param host SMTP host (string)
         * 
         * @return builder
         * 
         */
        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host SMTP host (string)
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param password SMTP password (string)
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password SMTP password (string)
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param port SMTP port (int)
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port SMTP port (int)
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param sender SMTP sender (string)
         * 
         * @return builder
         * 
         */
        public Builder sender(Output<String> sender) {
            $.sender = sender;
            return this;
        }

        /**
         * @param sender SMTP sender (string)
         * 
         * @return builder
         * 
         */
        public Builder sender(String sender) {
            return sender(Output.of(sender));
        }

        /**
         * @param tls SMTP tls. Default `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder tls(@Nullable Output<Boolean> tls) {
            $.tls = tls;
            return this;
        }

        /**
         * @param tls SMTP tls. Default `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder tls(Boolean tls) {
            return tls(Output.of(tls));
        }

        /**
         * @param username SMTP username (string)
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username SMTP username (string)
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public NotifierSmtpConfigArgs build() {
            $.defaultRecipient = Objects.requireNonNull($.defaultRecipient, "expected parameter 'defaultRecipient' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.sender = Objects.requireNonNull($.sender, "expected parameter 'sender' to be non-null");
            return $;
        }
    }

}
