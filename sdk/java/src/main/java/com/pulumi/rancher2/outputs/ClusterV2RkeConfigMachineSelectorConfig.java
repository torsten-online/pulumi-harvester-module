// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelector;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterV2RkeConfigMachineSelectorConfig {
    /**
     * @return Machine selector config (map)
     * 
     */
    private final @Nullable Map<String,Object> config;
    /**
     * @return Machine selector label (list maxitems:1)
     * 
     */
    private final @Nullable ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelector machineLabelSelector;

    @CustomType.Constructor
    private ClusterV2RkeConfigMachineSelectorConfig(
        @CustomType.Parameter("config") @Nullable Map<String,Object> config,
        @CustomType.Parameter("machineLabelSelector") @Nullable ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelector machineLabelSelector) {
        this.config = config;
        this.machineLabelSelector = machineLabelSelector;
    }

    /**
     * @return Machine selector config (map)
     * 
     */
    public Map<String,Object> config() {
        return this.config == null ? Map.of() : this.config;
    }
    /**
     * @return Machine selector label (list maxitems:1)
     * 
     */
    public Optional<ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelector> machineLabelSelector() {
        return Optional.ofNullable(this.machineLabelSelector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterV2RkeConfigMachineSelectorConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> config;
        private @Nullable ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelector machineLabelSelector;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterV2RkeConfigMachineSelectorConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.machineLabelSelector = defaults.machineLabelSelector;
        }

        public Builder config(@Nullable Map<String,Object> config) {
            this.config = config;
            return this;
        }
        public Builder machineLabelSelector(@Nullable ClusterV2RkeConfigMachineSelectorConfigMachineLabelSelector machineLabelSelector) {
            this.machineLabelSelector = machineLabelSelector;
            return this;
        }        public ClusterV2RkeConfigMachineSelectorConfig build() {
            return new ClusterV2RkeConfigMachineSelectorConfig(config, machineLabelSelector);
        }
    }
}
