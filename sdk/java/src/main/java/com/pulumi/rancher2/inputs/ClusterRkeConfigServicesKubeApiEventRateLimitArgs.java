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


public final class ClusterRkeConfigServicesKubeApiEventRateLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigServicesKubeApiEventRateLimitArgs Empty = new ClusterRkeConfigServicesKubeApiEventRateLimitArgs();

    /**
     * Event rate limit configuration yaml encoded definition. `apiVersion` and `kind: Configuration&#34;` fields are required in the yaml. [More info](https://rancher.com/docs/rke/latest/en/config-options/rate-limiting/) (string) Ex:
     * 
     */
    @Import(name="configuration")
    private @Nullable Output<String> configuration;

    /**
     * @return Event rate limit configuration yaml encoded definition. `apiVersion` and `kind: Configuration&#34;` fields are required in the yaml. [More info](https://rancher.com/docs/rke/latest/en/config-options/rate-limiting/) (string) Ex:
     * 
     */
    public Optional<Output<String>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    /**
     * Enable scheduled cluster scan. Default: `false` (bool)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable scheduled cluster scan. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ClusterRkeConfigServicesKubeApiEventRateLimitArgs() {}

    private ClusterRkeConfigServicesKubeApiEventRateLimitArgs(ClusterRkeConfigServicesKubeApiEventRateLimitArgs $) {
        this.configuration = $.configuration;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigServicesKubeApiEventRateLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigServicesKubeApiEventRateLimitArgs $;

        public Builder() {
            $ = new ClusterRkeConfigServicesKubeApiEventRateLimitArgs();
        }

        public Builder(ClusterRkeConfigServicesKubeApiEventRateLimitArgs defaults) {
            $ = new ClusterRkeConfigServicesKubeApiEventRateLimitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configuration Event rate limit configuration yaml encoded definition. `apiVersion` and `kind: Configuration&#34;` fields are required in the yaml. [More info](https://rancher.com/docs/rke/latest/en/config-options/rate-limiting/) (string) Ex:
         * 
         * @return builder
         * 
         */
        public Builder configuration(@Nullable Output<String> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration Event rate limit configuration yaml encoded definition. `apiVersion` and `kind: Configuration&#34;` fields are required in the yaml. [More info](https://rancher.com/docs/rke/latest/en/config-options/rate-limiting/) (string) Ex:
         * 
         * @return builder
         * 
         */
        public Builder configuration(String configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param enabled Enable scheduled cluster scan. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable scheduled cluster scan. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ClusterRkeConfigServicesKubeApiEventRateLimitArgs build() {
            return $;
        }
    }

}
