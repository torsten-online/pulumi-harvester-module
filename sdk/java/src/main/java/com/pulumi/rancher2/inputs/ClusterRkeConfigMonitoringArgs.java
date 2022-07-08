// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterRkeConfigMonitoringTolerationArgs;
import com.pulumi.rancher2.inputs.ClusterRkeConfigMonitoringUpdateStrategyArgs;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigMonitoringArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigMonitoringArgs Empty = new ClusterRkeConfigMonitoringArgs();

    /**
     * RKE monitoring node selector (map)
     * 
     */
    @Import(name="nodeSelector")
    private @Nullable Output<Map<String,Object>> nodeSelector;

    /**
     * @return RKE monitoring node selector (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> nodeSelector() {
        return Optional.ofNullable(this.nodeSelector);
    }

    /**
     * RKE options for network (map)
     * 
     */
    @Import(name="options")
    private @Nullable Output<Map<String,Object>> options;

    /**
     * @return RKE options for network (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * RKE monitoring provider (string)
     * 
     */
    @Import(name="provider")
    private @Nullable Output<String> provider;

    /**
     * @return RKE monitoring provider (string)
     * 
     */
    public Optional<Output<String>> provider() {
        return Optional.ofNullable(this.provider);
    }

    /**
     * RKE monitoring replicas (int)
     * 
     */
    @Import(name="replicas")
    private @Nullable Output<Integer> replicas;

    /**
     * @return RKE monitoring replicas (int)
     * 
     */
    public Optional<Output<Integer>> replicas() {
        return Optional.ofNullable(this.replicas);
    }

    /**
     * Network add-on tolerations (list)
     * 
     */
    @Import(name="tolerations")
    private @Nullable Output<List<ClusterRkeConfigMonitoringTolerationArgs>> tolerations;

    /**
     * @return Network add-on tolerations (list)
     * 
     */
    public Optional<Output<List<ClusterRkeConfigMonitoringTolerationArgs>>> tolerations() {
        return Optional.ofNullable(this.tolerations);
    }

    /**
     * RKE monitoring update strategy (list Maxitems: 1)
     * 
     */
    @Import(name="updateStrategy")
    private @Nullable Output<ClusterRkeConfigMonitoringUpdateStrategyArgs> updateStrategy;

    /**
     * @return RKE monitoring update strategy (list Maxitems: 1)
     * 
     */
    public Optional<Output<ClusterRkeConfigMonitoringUpdateStrategyArgs>> updateStrategy() {
        return Optional.ofNullable(this.updateStrategy);
    }

    private ClusterRkeConfigMonitoringArgs() {}

    private ClusterRkeConfigMonitoringArgs(ClusterRkeConfigMonitoringArgs $) {
        this.nodeSelector = $.nodeSelector;
        this.options = $.options;
        this.provider = $.provider;
        this.replicas = $.replicas;
        this.tolerations = $.tolerations;
        this.updateStrategy = $.updateStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigMonitoringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigMonitoringArgs $;

        public Builder() {
            $ = new ClusterRkeConfigMonitoringArgs();
        }

        public Builder(ClusterRkeConfigMonitoringArgs defaults) {
            $ = new ClusterRkeConfigMonitoringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodeSelector RKE monitoring node selector (map)
         * 
         * @return builder
         * 
         */
        public Builder nodeSelector(@Nullable Output<Map<String,Object>> nodeSelector) {
            $.nodeSelector = nodeSelector;
            return this;
        }

        /**
         * @param nodeSelector RKE monitoring node selector (map)
         * 
         * @return builder
         * 
         */
        public Builder nodeSelector(Map<String,Object> nodeSelector) {
            return nodeSelector(Output.of(nodeSelector));
        }

        /**
         * @param options RKE options for network (map)
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<Map<String,Object>> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options RKE options for network (map)
         * 
         * @return builder
         * 
         */
        public Builder options(Map<String,Object> options) {
            return options(Output.of(options));
        }

        /**
         * @param provider RKE monitoring provider (string)
         * 
         * @return builder
         * 
         */
        public Builder provider(@Nullable Output<String> provider) {
            $.provider = provider;
            return this;
        }

        /**
         * @param provider RKE monitoring provider (string)
         * 
         * @return builder
         * 
         */
        public Builder provider(String provider) {
            return provider(Output.of(provider));
        }

        /**
         * @param replicas RKE monitoring replicas (int)
         * 
         * @return builder
         * 
         */
        public Builder replicas(@Nullable Output<Integer> replicas) {
            $.replicas = replicas;
            return this;
        }

        /**
         * @param replicas RKE monitoring replicas (int)
         * 
         * @return builder
         * 
         */
        public Builder replicas(Integer replicas) {
            return replicas(Output.of(replicas));
        }

        /**
         * @param tolerations Network add-on tolerations (list)
         * 
         * @return builder
         * 
         */
        public Builder tolerations(@Nullable Output<List<ClusterRkeConfigMonitoringTolerationArgs>> tolerations) {
            $.tolerations = tolerations;
            return this;
        }

        /**
         * @param tolerations Network add-on tolerations (list)
         * 
         * @return builder
         * 
         */
        public Builder tolerations(List<ClusterRkeConfigMonitoringTolerationArgs> tolerations) {
            return tolerations(Output.of(tolerations));
        }

        /**
         * @param tolerations Network add-on tolerations (list)
         * 
         * @return builder
         * 
         */
        public Builder tolerations(ClusterRkeConfigMonitoringTolerationArgs... tolerations) {
            return tolerations(List.of(tolerations));
        }

        /**
         * @param updateStrategy RKE monitoring update strategy (list Maxitems: 1)
         * 
         * @return builder
         * 
         */
        public Builder updateStrategy(@Nullable Output<ClusterRkeConfigMonitoringUpdateStrategyArgs> updateStrategy) {
            $.updateStrategy = updateStrategy;
            return this;
        }

        /**
         * @param updateStrategy RKE monitoring update strategy (list Maxitems: 1)
         * 
         * @return builder
         * 
         */
        public Builder updateStrategy(ClusterRkeConfigMonitoringUpdateStrategyArgs updateStrategy) {
            return updateStrategy(Output.of(updateStrategy));
        }

        public ClusterRkeConfigMonitoringArgs build() {
            return $;
        }
    }

}
