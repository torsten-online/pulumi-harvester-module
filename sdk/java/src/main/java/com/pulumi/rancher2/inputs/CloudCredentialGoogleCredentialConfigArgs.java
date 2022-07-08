// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class CloudCredentialGoogleCredentialConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudCredentialGoogleCredentialConfigArgs Empty = new CloudCredentialGoogleCredentialConfigArgs();

    /**
     * Google auth encoded json (string)
     * 
     */
    @Import(name="authEncodedJson", required=true)
    private Output<String> authEncodedJson;

    /**
     * @return Google auth encoded json (string)
     * 
     */
    public Output<String> authEncodedJson() {
        return this.authEncodedJson;
    }

    private CloudCredentialGoogleCredentialConfigArgs() {}

    private CloudCredentialGoogleCredentialConfigArgs(CloudCredentialGoogleCredentialConfigArgs $) {
        this.authEncodedJson = $.authEncodedJson;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudCredentialGoogleCredentialConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudCredentialGoogleCredentialConfigArgs $;

        public Builder() {
            $ = new CloudCredentialGoogleCredentialConfigArgs();
        }

        public Builder(CloudCredentialGoogleCredentialConfigArgs defaults) {
            $ = new CloudCredentialGoogleCredentialConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authEncodedJson Google auth encoded json (string)
         * 
         * @return builder
         * 
         */
        public Builder authEncodedJson(Output<String> authEncodedJson) {
            $.authEncodedJson = authEncodedJson;
            return this;
        }

        /**
         * @param authEncodedJson Google auth encoded json (string)
         * 
         * @return builder
         * 
         */
        public Builder authEncodedJson(String authEncodedJson) {
            return authEncodedJson(Output.of(authEncodedJson));
        }

        public CloudCredentialGoogleCredentialConfigArgs build() {
            $.authEncodedJson = Objects.requireNonNull($.authEncodedJson, "expected parameter 'authEncodedJson' to be non-null");
            return $;
        }
    }

}
