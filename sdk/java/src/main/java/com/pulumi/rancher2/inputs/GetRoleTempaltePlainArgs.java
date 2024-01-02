// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRoleTempaltePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRoleTempaltePlainArgs Empty = new GetRoleTempaltePlainArgs();

    /**
     * Role template context. `cluster` and `project` values are supported (string)
     * 
     */
    @Import(name="context")
    private @Nullable String context;

    /**
     * @return Role template context. `cluster` and `project` values are supported (string)
     * 
     */
    public Optional<String> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * The name of the Role Template (string)
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Role Template (string)
     * 
     */
    public String name() {
        return this.name;
    }

    private GetRoleTempaltePlainArgs() {}

    private GetRoleTempaltePlainArgs(GetRoleTempaltePlainArgs $) {
        this.context = $.context;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRoleTempaltePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRoleTempaltePlainArgs $;

        public Builder() {
            $ = new GetRoleTempaltePlainArgs();
        }

        public Builder(GetRoleTempaltePlainArgs defaults) {
            $ = new GetRoleTempaltePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param context Role template context. `cluster` and `project` values are supported (string)
         * 
         * @return builder
         * 
         */
        public Builder context(@Nullable String context) {
            $.context = context;
            return this;
        }

        /**
         * @param name The name of the Role Template (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetRoleTempaltePlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetRoleTempaltePlainArgs", "name");
            }
            return $;
        }
    }

}
