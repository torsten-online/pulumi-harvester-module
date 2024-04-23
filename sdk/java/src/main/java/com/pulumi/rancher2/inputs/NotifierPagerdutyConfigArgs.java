// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotifierPagerdutyConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotifierPagerdutyConfigArgs Empty = new NotifierPagerdutyConfigArgs();

    /**
     * Pagerduty proxy URL
     * 
     */
    @Import(name="proxyUrl")
    private @Nullable Output<String> proxyUrl;

    /**
     * @return Pagerduty proxy URL
     * 
     */
    public Optional<Output<String>> proxyUrl() {
        return Optional.ofNullable(this.proxyUrl);
    }

    /**
     * Pagerduty service key
     * 
     */
    @Import(name="serviceKey", required=true)
    private Output<String> serviceKey;

    /**
     * @return Pagerduty service key
     * 
     */
    public Output<String> serviceKey() {
        return this.serviceKey;
    }

    private NotifierPagerdutyConfigArgs() {}

    private NotifierPagerdutyConfigArgs(NotifierPagerdutyConfigArgs $) {
        this.proxyUrl = $.proxyUrl;
        this.serviceKey = $.serviceKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotifierPagerdutyConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotifierPagerdutyConfigArgs $;

        public Builder() {
            $ = new NotifierPagerdutyConfigArgs();
        }

        public Builder(NotifierPagerdutyConfigArgs defaults) {
            $ = new NotifierPagerdutyConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param proxyUrl Pagerduty proxy URL
         * 
         * @return builder
         * 
         */
        public Builder proxyUrl(@Nullable Output<String> proxyUrl) {
            $.proxyUrl = proxyUrl;
            return this;
        }

        /**
         * @param proxyUrl Pagerduty proxy URL
         * 
         * @return builder
         * 
         */
        public Builder proxyUrl(String proxyUrl) {
            return proxyUrl(Output.of(proxyUrl));
        }

        /**
         * @param serviceKey Pagerduty service key
         * 
         * @return builder
         * 
         */
        public Builder serviceKey(Output<String> serviceKey) {
            $.serviceKey = serviceKey;
            return this;
        }

        /**
         * @param serviceKey Pagerduty service key
         * 
         * @return builder
         * 
         */
        public Builder serviceKey(String serviceKey) {
            return serviceKey(Output.of(serviceKey));
        }

        public NotifierPagerdutyConfigArgs build() {
            if ($.serviceKey == null) {
                throw new MissingRequiredPropertyException("NotifierPagerdutyConfigArgs", "serviceKey");
            }
            return $;
        }
    }

}
