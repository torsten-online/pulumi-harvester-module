// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalDnsProviderCloudflareConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalDnsProviderCloudflareConfigArgs Empty = new GlobalDnsProviderCloudflareConfigArgs();

    @Import(name="apiEmail", required=true)
    private Output<String> apiEmail;

    public Output<String> apiEmail() {
        return this.apiEmail;
    }

    @Import(name="apiKey", required=true)
    private Output<String> apiKey;

    public Output<String> apiKey() {
        return this.apiKey;
    }

    @Import(name="proxySetting")
    private @Nullable Output<Boolean> proxySetting;

    public Optional<Output<Boolean>> proxySetting() {
        return Optional.ofNullable(this.proxySetting);
    }

    private GlobalDnsProviderCloudflareConfigArgs() {}

    private GlobalDnsProviderCloudflareConfigArgs(GlobalDnsProviderCloudflareConfigArgs $) {
        this.apiEmail = $.apiEmail;
        this.apiKey = $.apiKey;
        this.proxySetting = $.proxySetting;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalDnsProviderCloudflareConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalDnsProviderCloudflareConfigArgs $;

        public Builder() {
            $ = new GlobalDnsProviderCloudflareConfigArgs();
        }

        public Builder(GlobalDnsProviderCloudflareConfigArgs defaults) {
            $ = new GlobalDnsProviderCloudflareConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiEmail(Output<String> apiEmail) {
            $.apiEmail = apiEmail;
            return this;
        }

        public Builder apiEmail(String apiEmail) {
            return apiEmail(Output.of(apiEmail));
        }

        public Builder apiKey(Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        public Builder proxySetting(@Nullable Output<Boolean> proxySetting) {
            $.proxySetting = proxySetting;
            return this;
        }

        public Builder proxySetting(Boolean proxySetting) {
            return proxySetting(Output.of(proxySetting));
        }

        public GlobalDnsProviderCloudflareConfigArgs build() {
            if ($.apiEmail == null) {
                throw new MissingRequiredPropertyException("GlobalDnsProviderCloudflareConfigArgs", "apiEmail");
            }
            if ($.apiKey == null) {
                throw new MissingRequiredPropertyException("GlobalDnsProviderCloudflareConfigArgs", "apiKey");
            }
            return $;
        }
    }

}
