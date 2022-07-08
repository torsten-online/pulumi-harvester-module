// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class CloudCredentialDigitaloceanCredentialConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudCredentialDigitaloceanCredentialConfigArgs Empty = new CloudCredentialDigitaloceanCredentialConfigArgs();

    /**
     * DigitalOcean access token (string)
     * 
     */
    @Import(name="accessToken", required=true)
    private Output<String> accessToken;

    /**
     * @return DigitalOcean access token (string)
     * 
     */
    public Output<String> accessToken() {
        return this.accessToken;
    }

    private CloudCredentialDigitaloceanCredentialConfigArgs() {}

    private CloudCredentialDigitaloceanCredentialConfigArgs(CloudCredentialDigitaloceanCredentialConfigArgs $) {
        this.accessToken = $.accessToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudCredentialDigitaloceanCredentialConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudCredentialDigitaloceanCredentialConfigArgs $;

        public Builder() {
            $ = new CloudCredentialDigitaloceanCredentialConfigArgs();
        }

        public Builder(CloudCredentialDigitaloceanCredentialConfigArgs defaults) {
            $ = new CloudCredentialDigitaloceanCredentialConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessToken DigitalOcean access token (string)
         * 
         * @return builder
         * 
         */
        public Builder accessToken(Output<String> accessToken) {
            $.accessToken = accessToken;
            return this;
        }

        /**
         * @param accessToken DigitalOcean access token (string)
         * 
         * @return builder
         * 
         */
        public Builder accessToken(String accessToken) {
            return accessToken(Output.of(accessToken));
        }

        public CloudCredentialDigitaloceanCredentialConfigArgs build() {
            $.accessToken = Objects.requireNonNull($.accessToken, "expected parameter 'accessToken' to be non-null");
            return $;
        }
    }

}
