// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterV2RkeConfigRotateCertificatesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterV2RkeConfigRotateCertificatesArgs Empty = new ClusterV2RkeConfigRotateCertificatesArgs();

    /**
     * Desired certificate rotation generation.
     * 
     */
    @Import(name="generation", required=true)
    private Output<Integer> generation;

    /**
     * @return Desired certificate rotation generation.
     * 
     */
    public Output<Integer> generation() {
        return this.generation;
    }

    /**
     * Service certificates to rotate with this generation.
     * 
     */
    @Import(name="services")
    private @Nullable Output<List<String>> services;

    /**
     * @return Service certificates to rotate with this generation.
     * 
     */
    public Optional<Output<List<String>>> services() {
        return Optional.ofNullable(this.services);
    }

    private ClusterV2RkeConfigRotateCertificatesArgs() {}

    private ClusterV2RkeConfigRotateCertificatesArgs(ClusterV2RkeConfigRotateCertificatesArgs $) {
        this.generation = $.generation;
        this.services = $.services;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterV2RkeConfigRotateCertificatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterV2RkeConfigRotateCertificatesArgs $;

        public Builder() {
            $ = new ClusterV2RkeConfigRotateCertificatesArgs();
        }

        public Builder(ClusterV2RkeConfigRotateCertificatesArgs defaults) {
            $ = new ClusterV2RkeConfigRotateCertificatesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param generation Desired certificate rotation generation.
         * 
         * @return builder
         * 
         */
        public Builder generation(Output<Integer> generation) {
            $.generation = generation;
            return this;
        }

        /**
         * @param generation Desired certificate rotation generation.
         * 
         * @return builder
         * 
         */
        public Builder generation(Integer generation) {
            return generation(Output.of(generation));
        }

        /**
         * @param services Service certificates to rotate with this generation.
         * 
         * @return builder
         * 
         */
        public Builder services(@Nullable Output<List<String>> services) {
            $.services = services;
            return this;
        }

        /**
         * @param services Service certificates to rotate with this generation.
         * 
         * @return builder
         * 
         */
        public Builder services(List<String> services) {
            return services(Output.of(services));
        }

        /**
         * @param services Service certificates to rotate with this generation.
         * 
         * @return builder
         * 
         */
        public Builder services(String... services) {
            return services(List.of(services));
        }

        public ClusterV2RkeConfigRotateCertificatesArgs build() {
            if ($.generation == null) {
                throw new MissingRequiredPropertyException("ClusterV2RkeConfigRotateCertificatesArgs", "generation");
            }
            return $;
        }
    }

}
