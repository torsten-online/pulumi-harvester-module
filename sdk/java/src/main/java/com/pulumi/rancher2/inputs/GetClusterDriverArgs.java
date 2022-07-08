// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterDriverArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterDriverArgs Empty = new GetClusterDriverArgs();

    /**
     * Name of the cluster driver (string)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the cluster driver (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The URL to download the machine driver binary for 64-bit Linux (string)
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The URL to download the machine driver binary for 64-bit Linux (string)
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private GetClusterDriverArgs() {}

    private GetClusterDriverArgs(GetClusterDriverArgs $) {
        this.name = $.name;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterDriverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterDriverArgs $;

        public Builder() {
            $ = new GetClusterDriverArgs();
        }

        public Builder(GetClusterDriverArgs defaults) {
            $ = new GetClusterDriverArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the cluster driver (string)
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the cluster driver (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param url The URL to download the machine driver binary for 64-bit Linux (string)
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL to download the machine driver binary for 64-bit Linux (string)
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public GetClusterDriverArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
