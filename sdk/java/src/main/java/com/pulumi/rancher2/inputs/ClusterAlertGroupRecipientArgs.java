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


public final class ClusterAlertGroupRecipientArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterAlertGroupRecipientArgs Empty = new ClusterAlertGroupRecipientArgs();

    /**
     * Use notifier default recipient, overriding `recipient` argument if set.  Default: `false` (bool)
     * 
     */
    @Import(name="defaultRecipient")
    private @Nullable Output<Boolean> defaultRecipient;

    /**
     * @return Use notifier default recipient, overriding `recipient` argument if set.  Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> defaultRecipient() {
        return Optional.ofNullable(this.defaultRecipient);
    }

    /**
     * Recipient notifier ID (string)
     * 
     */
    @Import(name="notifierId", required=true)
    private Output<String> notifierId;

    /**
     * @return Recipient notifier ID (string)
     * 
     */
    public Output<String> notifierId() {
        return this.notifierId;
    }

    /**
     * Recipient notifier ID. Supported values : `&#34;dingtalk&#34; | &#34;msteams&#34; | &#34;pagerduty&#34; | &#34;slack&#34; | &#34;email&#34; | &#34;webhook&#34; | &#34;wechat&#34;` (string)
     * 
     */
    @Import(name="notifierType")
    private @Nullable Output<String> notifierType;

    /**
     * @return Recipient notifier ID. Supported values : `&#34;dingtalk&#34; | &#34;msteams&#34; | &#34;pagerduty&#34; | &#34;slack&#34; | &#34;email&#34; | &#34;webhook&#34; | &#34;wechat&#34;` (string)
     * 
     */
    public Optional<Output<String>> notifierType() {
        return Optional.ofNullable(this.notifierType);
    }

    /**
     * Recipient (string)
     * 
     */
    @Import(name="recipient")
    private @Nullable Output<String> recipient;

    /**
     * @return Recipient (string)
     * 
     */
    public Optional<Output<String>> recipient() {
        return Optional.ofNullable(this.recipient);
    }

    private ClusterAlertGroupRecipientArgs() {}

    private ClusterAlertGroupRecipientArgs(ClusterAlertGroupRecipientArgs $) {
        this.defaultRecipient = $.defaultRecipient;
        this.notifierId = $.notifierId;
        this.notifierType = $.notifierType;
        this.recipient = $.recipient;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterAlertGroupRecipientArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterAlertGroupRecipientArgs $;

        public Builder() {
            $ = new ClusterAlertGroupRecipientArgs();
        }

        public Builder(ClusterAlertGroupRecipientArgs defaults) {
            $ = new ClusterAlertGroupRecipientArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultRecipient Use notifier default recipient, overriding `recipient` argument if set.  Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder defaultRecipient(@Nullable Output<Boolean> defaultRecipient) {
            $.defaultRecipient = defaultRecipient;
            return this;
        }

        /**
         * @param defaultRecipient Use notifier default recipient, overriding `recipient` argument if set.  Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder defaultRecipient(Boolean defaultRecipient) {
            return defaultRecipient(Output.of(defaultRecipient));
        }

        /**
         * @param notifierId Recipient notifier ID (string)
         * 
         * @return builder
         * 
         */
        public Builder notifierId(Output<String> notifierId) {
            $.notifierId = notifierId;
            return this;
        }

        /**
         * @param notifierId Recipient notifier ID (string)
         * 
         * @return builder
         * 
         */
        public Builder notifierId(String notifierId) {
            return notifierId(Output.of(notifierId));
        }

        /**
         * @param notifierType Recipient notifier ID. Supported values : `&#34;dingtalk&#34; | &#34;msteams&#34; | &#34;pagerduty&#34; | &#34;slack&#34; | &#34;email&#34; | &#34;webhook&#34; | &#34;wechat&#34;` (string)
         * 
         * @return builder
         * 
         */
        public Builder notifierType(@Nullable Output<String> notifierType) {
            $.notifierType = notifierType;
            return this;
        }

        /**
         * @param notifierType Recipient notifier ID. Supported values : `&#34;dingtalk&#34; | &#34;msteams&#34; | &#34;pagerduty&#34; | &#34;slack&#34; | &#34;email&#34; | &#34;webhook&#34; | &#34;wechat&#34;` (string)
         * 
         * @return builder
         * 
         */
        public Builder notifierType(String notifierType) {
            return notifierType(Output.of(notifierType));
        }

        /**
         * @param recipient Recipient (string)
         * 
         * @return builder
         * 
         */
        public Builder recipient(@Nullable Output<String> recipient) {
            $.recipient = recipient;
            return this;
        }

        /**
         * @param recipient Recipient (string)
         * 
         * @return builder
         * 
         */
        public Builder recipient(String recipient) {
            return recipient(Output.of(recipient));
        }

        public ClusterAlertGroupRecipientArgs build() {
            $.notifierId = Objects.requireNonNull($.notifierId, "expected parameter 'notifierId' to be non-null");
            return $;
        }
    }

}
