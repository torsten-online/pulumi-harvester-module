// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterV2RkeConfigMachinePoolRollingUpdateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterV2RkeConfigMachinePoolRollingUpdateArgs Empty = new ClusterV2RkeConfigMachinePoolRollingUpdateArgs();

    /**
     * Rolling update max surge
     * 
     */
    @Import(name="maxSurge")
    private @Nullable Output<String> maxSurge;

    /**
     * @return Rolling update max surge
     * 
     */
    public Optional<Output<String>> maxSurge() {
        return Optional.ofNullable(this.maxSurge);
    }

    /**
     * Rolling update max unavailable
     * 
     */
    @Import(name="maxUnavailable")
    private @Nullable Output<String> maxUnavailable;

    /**
     * @return Rolling update max unavailable
     * 
     */
    public Optional<Output<String>> maxUnavailable() {
        return Optional.ofNullable(this.maxUnavailable);
    }

    private ClusterV2RkeConfigMachinePoolRollingUpdateArgs() {}

    private ClusterV2RkeConfigMachinePoolRollingUpdateArgs(ClusterV2RkeConfigMachinePoolRollingUpdateArgs $) {
        this.maxSurge = $.maxSurge;
        this.maxUnavailable = $.maxUnavailable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterV2RkeConfigMachinePoolRollingUpdateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterV2RkeConfigMachinePoolRollingUpdateArgs $;

        public Builder() {
            $ = new ClusterV2RkeConfigMachinePoolRollingUpdateArgs();
        }

        public Builder(ClusterV2RkeConfigMachinePoolRollingUpdateArgs defaults) {
            $ = new ClusterV2RkeConfigMachinePoolRollingUpdateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxSurge Rolling update max surge
         * 
         * @return builder
         * 
         */
        public Builder maxSurge(@Nullable Output<String> maxSurge) {
            $.maxSurge = maxSurge;
            return this;
        }

        /**
         * @param maxSurge Rolling update max surge
         * 
         * @return builder
         * 
         */
        public Builder maxSurge(String maxSurge) {
            return maxSurge(Output.of(maxSurge));
        }

        /**
         * @param maxUnavailable Rolling update max unavailable
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(@Nullable Output<String> maxUnavailable) {
            $.maxUnavailable = maxUnavailable;
            return this;
        }

        /**
         * @param maxUnavailable Rolling update max unavailable
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(String maxUnavailable) {
            return maxUnavailable(Output.of(maxUnavailable));
        }

        public ClusterV2RkeConfigMachinePoolRollingUpdateArgs build() {
            return $;
        }
    }

}
