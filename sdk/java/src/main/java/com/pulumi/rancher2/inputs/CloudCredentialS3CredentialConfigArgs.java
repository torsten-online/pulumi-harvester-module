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


public final class CloudCredentialS3CredentialConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudCredentialS3CredentialConfigArgs Empty = new CloudCredentialS3CredentialConfigArgs();

    /**
     * AWS access key (string)
     * 
     */
    @Import(name="accessKey", required=true)
    private Output<String> accessKey;

    /**
     * @return AWS access key (string)
     * 
     */
    public Output<String> accessKey() {
        return this.accessKey;
    }

    /**
     * AWS default bucket (string)
     * 
     */
    @Import(name="defaultBucket")
    private @Nullable Output<String> defaultBucket;

    /**
     * @return AWS default bucket (string)
     * 
     */
    public Optional<Output<String>> defaultBucket() {
        return Optional.ofNullable(this.defaultBucket);
    }

    /**
     * AWS default endpoint (string)
     * 
     */
    @Import(name="defaultEndpoint")
    private @Nullable Output<String> defaultEndpoint;

    /**
     * @return AWS default endpoint (string)
     * 
     */
    public Optional<Output<String>> defaultEndpoint() {
        return Optional.ofNullable(this.defaultEndpoint);
    }

    /**
     * AWS default endpoint CA (string)
     * 
     */
    @Import(name="defaultEndpointCa")
    private @Nullable Output<String> defaultEndpointCa;

    /**
     * @return AWS default endpoint CA (string)
     * 
     */
    public Optional<Output<String>> defaultEndpointCa() {
        return Optional.ofNullable(this.defaultEndpointCa);
    }

    /**
     * AWS default folder (string)
     * 
     */
    @Import(name="defaultFolder")
    private @Nullable Output<String> defaultFolder;

    /**
     * @return AWS default folder (string)
     * 
     */
    public Optional<Output<String>> defaultFolder() {
        return Optional.ofNullable(this.defaultFolder);
    }

    /**
     * AWS default region (string)
     * 
     */
    @Import(name="defaultRegion")
    private @Nullable Output<String> defaultRegion;

    /**
     * @return AWS default region (string)
     * 
     */
    public Optional<Output<String>> defaultRegion() {
        return Optional.ofNullable(this.defaultRegion);
    }

    /**
     * AWS default skip ssl verify. Default: `false` (bool)
     * 
     */
    @Import(name="defaultSkipSslVerify")
    private @Nullable Output<Boolean> defaultSkipSslVerify;

    /**
     * @return AWS default skip ssl verify. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> defaultSkipSslVerify() {
        return Optional.ofNullable(this.defaultSkipSslVerify);
    }

    /**
     * AWS secret key (string)
     * 
     */
    @Import(name="secretKey", required=true)
    private Output<String> secretKey;

    /**
     * @return AWS secret key (string)
     * 
     */
    public Output<String> secretKey() {
        return this.secretKey;
    }

    private CloudCredentialS3CredentialConfigArgs() {}

    private CloudCredentialS3CredentialConfigArgs(CloudCredentialS3CredentialConfigArgs $) {
        this.accessKey = $.accessKey;
        this.defaultBucket = $.defaultBucket;
        this.defaultEndpoint = $.defaultEndpoint;
        this.defaultEndpointCa = $.defaultEndpointCa;
        this.defaultFolder = $.defaultFolder;
        this.defaultRegion = $.defaultRegion;
        this.defaultSkipSslVerify = $.defaultSkipSslVerify;
        this.secretKey = $.secretKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudCredentialS3CredentialConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudCredentialS3CredentialConfigArgs $;

        public Builder() {
            $ = new CloudCredentialS3CredentialConfigArgs();
        }

        public Builder(CloudCredentialS3CredentialConfigArgs defaults) {
            $ = new CloudCredentialS3CredentialConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey AWS access key (string)
         * 
         * @return builder
         * 
         */
        public Builder accessKey(Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey AWS access key (string)
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param defaultBucket AWS default bucket (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultBucket(@Nullable Output<String> defaultBucket) {
            $.defaultBucket = defaultBucket;
            return this;
        }

        /**
         * @param defaultBucket AWS default bucket (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultBucket(String defaultBucket) {
            return defaultBucket(Output.of(defaultBucket));
        }

        /**
         * @param defaultEndpoint AWS default endpoint (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultEndpoint(@Nullable Output<String> defaultEndpoint) {
            $.defaultEndpoint = defaultEndpoint;
            return this;
        }

        /**
         * @param defaultEndpoint AWS default endpoint (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultEndpoint(String defaultEndpoint) {
            return defaultEndpoint(Output.of(defaultEndpoint));
        }

        /**
         * @param defaultEndpointCa AWS default endpoint CA (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultEndpointCa(@Nullable Output<String> defaultEndpointCa) {
            $.defaultEndpointCa = defaultEndpointCa;
            return this;
        }

        /**
         * @param defaultEndpointCa AWS default endpoint CA (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultEndpointCa(String defaultEndpointCa) {
            return defaultEndpointCa(Output.of(defaultEndpointCa));
        }

        /**
         * @param defaultFolder AWS default folder (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultFolder(@Nullable Output<String> defaultFolder) {
            $.defaultFolder = defaultFolder;
            return this;
        }

        /**
         * @param defaultFolder AWS default folder (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultFolder(String defaultFolder) {
            return defaultFolder(Output.of(defaultFolder));
        }

        /**
         * @param defaultRegion AWS default region (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultRegion(@Nullable Output<String> defaultRegion) {
            $.defaultRegion = defaultRegion;
            return this;
        }

        /**
         * @param defaultRegion AWS default region (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultRegion(String defaultRegion) {
            return defaultRegion(Output.of(defaultRegion));
        }

        /**
         * @param defaultSkipSslVerify AWS default skip ssl verify. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder defaultSkipSslVerify(@Nullable Output<Boolean> defaultSkipSslVerify) {
            $.defaultSkipSslVerify = defaultSkipSslVerify;
            return this;
        }

        /**
         * @param defaultSkipSslVerify AWS default skip ssl verify. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder defaultSkipSslVerify(Boolean defaultSkipSslVerify) {
            return defaultSkipSslVerify(Output.of(defaultSkipSslVerify));
        }

        /**
         * @param secretKey AWS secret key (string)
         * 
         * @return builder
         * 
         */
        public Builder secretKey(Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey AWS secret key (string)
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        public CloudCredentialS3CredentialConfigArgs build() {
            $.accessKey = Objects.requireNonNull($.accessKey, "expected parameter 'accessKey' to be non-null");
            $.secretKey = Objects.requireNonNull($.secretKey, "expected parameter 'secretKey' to be non-null");
            return $;
        }
    }

}
