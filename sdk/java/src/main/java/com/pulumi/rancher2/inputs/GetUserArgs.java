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


public final class GetUserArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserArgs Empty = new GetUserArgs();

    /**
     * Set is the user if the user is external. Default: `false` (bool)
     * 
     */
    @Import(name="isExternal")
    private @Nullable Output<Boolean> isExternal;

    /**
     * @return Set is the user if the user is external. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> isExternal() {
        return Optional.ofNullable(this.isExternal);
    }

    /**
     * The name of the user (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the user (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The username of the user (string)
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The username of the user (string)
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private GetUserArgs() {}

    private GetUserArgs(GetUserArgs $) {
        this.isExternal = $.isExternal;
        this.name = $.name;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserArgs $;

        public Builder() {
            $ = new GetUserArgs();
        }

        public Builder(GetUserArgs defaults) {
            $ = new GetUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isExternal Set is the user if the user is external. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder isExternal(@Nullable Output<Boolean> isExternal) {
            $.isExternal = isExternal;
            return this;
        }

        /**
         * @param isExternal Set is the user if the user is external. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder isExternal(Boolean isExternal) {
            return isExternal(Output.of(isExternal));
        }

        /**
         * @param name The name of the user (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the user (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param username The username of the user (string)
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username of the user (string)
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public GetUserArgs build() {
            return $;
        }
    }

}
