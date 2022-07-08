// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCatalogArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCatalogArgs Empty = new GetCatalogArgs();

    /**
     * The catalog name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The catalog name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private GetCatalogArgs() {}

    private GetCatalogArgs(GetCatalogArgs $) {
        this.name = $.name;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCatalogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCatalogArgs $;

        public Builder() {
            $ = new GetCatalogArgs();
        }

        public Builder(GetCatalogArgs defaults) {
            $ = new GetCatalogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The catalog name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The catalog name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param scope The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public GetCatalogArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
