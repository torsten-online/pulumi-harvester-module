// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotifierWebhookConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotifierWebhookConfigArgs Empty = new NotifierWebhookConfigArgs();

    /**
     * Webhook proxy url (string)
     * 
     */
    @Import(name="proxyUrl")
    private @Nullable Output<String> proxyUrl;

    /**
     * @return Webhook proxy url (string)
     * 
     */
    public Optional<Output<String>> proxyUrl() {
        return Optional.ofNullable(this.proxyUrl);
    }

    /**
     * Webhook url (string)
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return Webhook url (string)
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private NotifierWebhookConfigArgs() {}

    private NotifierWebhookConfigArgs(NotifierWebhookConfigArgs $) {
        this.proxyUrl = $.proxyUrl;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotifierWebhookConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotifierWebhookConfigArgs $;

        public Builder() {
            $ = new NotifierWebhookConfigArgs();
        }

        public Builder(NotifierWebhookConfigArgs defaults) {
            $ = new NotifierWebhookConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param proxyUrl Webhook proxy url (string)
         * 
         * @return builder
         * 
         */
        public Builder proxyUrl(@Nullable Output<String> proxyUrl) {
            $.proxyUrl = proxyUrl;
            return this;
        }

        /**
         * @param proxyUrl Webhook proxy url (string)
         * 
         * @return builder
         * 
         */
        public Builder proxyUrl(String proxyUrl) {
            return proxyUrl(Output.of(proxyUrl));
        }

        /**
         * @param url Webhook url (string)
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url Webhook url (string)
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public NotifierWebhookConfigArgs build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
