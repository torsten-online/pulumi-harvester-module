// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGlobalDnsProviderArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGlobalDnsProviderArgs Empty = new GetGlobalDnsProviderArgs();

    /**
     * The name of the global DNS provider (string)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the global DNS provider (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetGlobalDnsProviderArgs() {}

    private GetGlobalDnsProviderArgs(GetGlobalDnsProviderArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGlobalDnsProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGlobalDnsProviderArgs $;

        public Builder() {
            $ = new GetGlobalDnsProviderArgs();
        }

        public Builder(GetGlobalDnsProviderArgs defaults) {
            $ = new GetGlobalDnsProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the global DNS provider (string)
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the global DNS provider (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetGlobalDnsProviderArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
