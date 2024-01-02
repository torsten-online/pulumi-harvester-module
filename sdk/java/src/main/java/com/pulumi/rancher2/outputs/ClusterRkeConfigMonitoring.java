// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterRkeConfigMonitoringToleration;
import com.pulumi.rancher2.outputs.ClusterRkeConfigMonitoringUpdateStrategy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigMonitoring {
    /**
     * @return RKE monitoring node selector (map)
     * 
     */
    private @Nullable Map<String,Object> nodeSelector;
    /**
     * @return RKE options for network (map)
     * 
     */
    private @Nullable Map<String,Object> options;
    /**
     * @return RKE monitoring provider (string)
     * 
     */
    private @Nullable String provider;
    /**
     * @return RKE monitoring replicas (int)
     * 
     */
    private @Nullable Integer replicas;
    /**
     * @return Network add-on tolerations (list)
     * 
     */
    private @Nullable List<ClusterRkeConfigMonitoringToleration> tolerations;
    /**
     * @return RKE monitoring update strategy (list Maxitems: 1)
     * 
     */
    private @Nullable ClusterRkeConfigMonitoringUpdateStrategy updateStrategy;

    private ClusterRkeConfigMonitoring() {}
    /**
     * @return RKE monitoring node selector (map)
     * 
     */
    public Map<String,Object> nodeSelector() {
        return this.nodeSelector == null ? Map.of() : this.nodeSelector;
    }
    /**
     * @return RKE options for network (map)
     * 
     */
    public Map<String,Object> options() {
        return this.options == null ? Map.of() : this.options;
    }
    /**
     * @return RKE monitoring provider (string)
     * 
     */
    public Optional<String> provider() {
        return Optional.ofNullable(this.provider);
    }
    /**
     * @return RKE monitoring replicas (int)
     * 
     */
    public Optional<Integer> replicas() {
        return Optional.ofNullable(this.replicas);
    }
    /**
     * @return Network add-on tolerations (list)
     * 
     */
    public List<ClusterRkeConfigMonitoringToleration> tolerations() {
        return this.tolerations == null ? List.of() : this.tolerations;
    }
    /**
     * @return RKE monitoring update strategy (list Maxitems: 1)
     * 
     */
    public Optional<ClusterRkeConfigMonitoringUpdateStrategy> updateStrategy() {
        return Optional.ofNullable(this.updateStrategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigMonitoring defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,Object> nodeSelector;
        private @Nullable Map<String,Object> options;
        private @Nullable String provider;
        private @Nullable Integer replicas;
        private @Nullable List<ClusterRkeConfigMonitoringToleration> tolerations;
        private @Nullable ClusterRkeConfigMonitoringUpdateStrategy updateStrategy;
        public Builder() {}
        public Builder(ClusterRkeConfigMonitoring defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeSelector = defaults.nodeSelector;
    	      this.options = defaults.options;
    	      this.provider = defaults.provider;
    	      this.replicas = defaults.replicas;
    	      this.tolerations = defaults.tolerations;
    	      this.updateStrategy = defaults.updateStrategy;
        }

        @CustomType.Setter
        public Builder nodeSelector(@Nullable Map<String,Object> nodeSelector) {

            this.nodeSelector = nodeSelector;
            return this;
        }
        @CustomType.Setter
        public Builder options(@Nullable Map<String,Object> options) {

            this.options = options;
            return this;
        }
        @CustomType.Setter
        public Builder provider(@Nullable String provider) {

            this.provider = provider;
            return this;
        }
        @CustomType.Setter
        public Builder replicas(@Nullable Integer replicas) {

            this.replicas = replicas;
            return this;
        }
        @CustomType.Setter
        public Builder tolerations(@Nullable List<ClusterRkeConfigMonitoringToleration> tolerations) {

            this.tolerations = tolerations;
            return this;
        }
        public Builder tolerations(ClusterRkeConfigMonitoringToleration... tolerations) {
            return tolerations(List.of(tolerations));
        }
        @CustomType.Setter
        public Builder updateStrategy(@Nullable ClusterRkeConfigMonitoringUpdateStrategy updateStrategy) {

            this.updateStrategy = updateStrategy;
            return this;
        }
        public ClusterRkeConfigMonitoring build() {
            final var _resultValue = new ClusterRkeConfigMonitoring();
            _resultValue.nodeSelector = nodeSelector;
            _resultValue.options = options;
            _resultValue.provider = provider;
            _resultValue.replicas = replicas;
            _resultValue.tolerations = tolerations;
            _resultValue.updateStrategy = updateStrategy;
            return _resultValue;
        }
    }
}
