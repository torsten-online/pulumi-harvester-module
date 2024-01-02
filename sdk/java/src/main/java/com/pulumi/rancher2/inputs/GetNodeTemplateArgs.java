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


public final class GetNodeTemplateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNodeTemplateArgs Empty = new GetNodeTemplateArgs();

    /**
     * The name of the Node Template (string)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Node Template (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * (Computed) Engine storage driver for the node template (bool)
     * 
     */
    @Import(name="useInternalIpAddress")
    private @Nullable Output<Boolean> useInternalIpAddress;

    /**
     * @return (Computed) Engine storage driver for the node template (bool)
     * 
     */
    public Optional<Output<Boolean>> useInternalIpAddress() {
        return Optional.ofNullable(this.useInternalIpAddress);
    }

    private GetNodeTemplateArgs() {}

    private GetNodeTemplateArgs(GetNodeTemplateArgs $) {
        this.name = $.name;
        this.useInternalIpAddress = $.useInternalIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNodeTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNodeTemplateArgs $;

        public Builder() {
            $ = new GetNodeTemplateArgs();
        }

        public Builder(GetNodeTemplateArgs defaults) {
            $ = new GetNodeTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Node Template (string)
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Node Template (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param useInternalIpAddress (Computed) Engine storage driver for the node template (bool)
         * 
         * @return builder
         * 
         */
        public Builder useInternalIpAddress(@Nullable Output<Boolean> useInternalIpAddress) {
            $.useInternalIpAddress = useInternalIpAddress;
            return this;
        }

        /**
         * @param useInternalIpAddress (Computed) Engine storage driver for the node template (bool)
         * 
         * @return builder
         * 
         */
        public Builder useInternalIpAddress(Boolean useInternalIpAddress) {
            return useInternalIpAddress(Output.of(useInternalIpAddress));
        }

        public GetNodeTemplateArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetNodeTemplateArgs", "name");
            }
            return $;
        }
    }

}
