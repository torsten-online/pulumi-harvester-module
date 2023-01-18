// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GlobalDnsProviderAlidnsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalDnsProviderAlidnsConfigArgs Empty = new GlobalDnsProviderAlidnsConfigArgs();

    /**
     * The AliDNS Access key (string)
     * 
     */
    @Import(name="accessKey", required=true)
    private Output<String> accessKey;

    /**
     * @return The AliDNS Access key (string)
     * 
     */
    public Output<String> accessKey() {
        return this.accessKey;
    }

    /**
     * The AliDNS Secret key (string)
     * 
     */
    @Import(name="secretKey", required=true)
    private Output<String> secretKey;

    /**
     * @return The AliDNS Secret key (string)
     * 
     */
    public Output<String> secretKey() {
        return this.secretKey;
    }

    private GlobalDnsProviderAlidnsConfigArgs() {}

    private GlobalDnsProviderAlidnsConfigArgs(GlobalDnsProviderAlidnsConfigArgs $) {
        this.accessKey = $.accessKey;
        this.secretKey = $.secretKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalDnsProviderAlidnsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalDnsProviderAlidnsConfigArgs $;

        public Builder() {
            $ = new GlobalDnsProviderAlidnsConfigArgs();
        }

        public Builder(GlobalDnsProviderAlidnsConfigArgs defaults) {
            $ = new GlobalDnsProviderAlidnsConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey The AliDNS Access key (string)
         * 
         * @return builder
         * 
         */
        public Builder accessKey(Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey The AliDNS Access key (string)
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param secretKey The AliDNS Secret key (string)
         * 
         * @return builder
         * 
         */
        public Builder secretKey(Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey The AliDNS Secret key (string)
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        public GlobalDnsProviderAlidnsConfigArgs build() {
            $.accessKey = Objects.requireNonNull($.accessKey, "expected parameter 'accessKey' to be non-null");
            $.secretKey = Objects.requireNonNull($.secretKey, "expected parameter 'secretKey' to be non-null");
            return $;
        }
    }

}
