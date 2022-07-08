// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNotifierMsteamsConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetNotifierMsteamsConfig Empty = new GetNotifierMsteamsConfig();

    @Import(name="proxyUrl")
    private @Nullable String proxyUrl;

    public Optional<String> proxyUrl() {
        return Optional.ofNullable(this.proxyUrl);
    }

    @Import(name="url", required=true)
    private String url;

    public String url() {
        return this.url;
    }

    private GetNotifierMsteamsConfig() {}

    private GetNotifierMsteamsConfig(GetNotifierMsteamsConfig $) {
        this.proxyUrl = $.proxyUrl;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNotifierMsteamsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNotifierMsteamsConfig $;

        public Builder() {
            $ = new GetNotifierMsteamsConfig();
        }

        public Builder(GetNotifierMsteamsConfig defaults) {
            $ = new GetNotifierMsteamsConfig(Objects.requireNonNull(defaults));
        }

        public Builder proxyUrl(@Nullable String proxyUrl) {
            $.proxyUrl = proxyUrl;
            return this;
        }

        public Builder url(String url) {
            $.url = url;
            return this;
        }

        public GetNotifierMsteamsConfig build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
