// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class CloudCredentialLinodeCredentialConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudCredentialLinodeCredentialConfigArgs Empty = new CloudCredentialLinodeCredentialConfigArgs();

    /**
     * Linode API token (string)
     * 
     */
    @Import(name="token", required=true)
    private Output<String> token;

    /**
     * @return Linode API token (string)
     * 
     */
    public Output<String> token() {
        return this.token;
    }

    private CloudCredentialLinodeCredentialConfigArgs() {}

    private CloudCredentialLinodeCredentialConfigArgs(CloudCredentialLinodeCredentialConfigArgs $) {
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudCredentialLinodeCredentialConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudCredentialLinodeCredentialConfigArgs $;

        public Builder() {
            $ = new CloudCredentialLinodeCredentialConfigArgs();
        }

        public Builder(CloudCredentialLinodeCredentialConfigArgs defaults) {
            $ = new CloudCredentialLinodeCredentialConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param token Linode API token (string)
         * 
         * @return builder
         * 
         */
        public Builder token(Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token Linode API token (string)
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public CloudCredentialLinodeCredentialConfigArgs build() {
            if ($.token == null) {
                throw new MissingRequiredPropertyException("CloudCredentialLinodeCredentialConfigArgs", "token");
            }
            return $;
        }
    }

}
