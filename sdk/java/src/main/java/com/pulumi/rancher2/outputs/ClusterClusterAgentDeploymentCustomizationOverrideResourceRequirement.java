// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterClusterAgentDeploymentCustomizationOverrideResourceRequirement {
    /**
     * @return The maximum CPU limit for agent
     * 
     */
    private @Nullable String cpuLimit;
    /**
     * @return The minimum CPU required for agent
     * 
     */
    private @Nullable String cpuRequest;
    /**
     * @return The maximum memory limit for agent
     * 
     */
    private @Nullable String memoryLimit;
    /**
     * @return The minimum memory required for agent
     * 
     */
    private @Nullable String memoryRequest;

    private ClusterClusterAgentDeploymentCustomizationOverrideResourceRequirement() {}
    /**
     * @return The maximum CPU limit for agent
     * 
     */
    public Optional<String> cpuLimit() {
        return Optional.ofNullable(this.cpuLimit);
    }
    /**
     * @return The minimum CPU required for agent
     * 
     */
    public Optional<String> cpuRequest() {
        return Optional.ofNullable(this.cpuRequest);
    }
    /**
     * @return The maximum memory limit for agent
     * 
     */
    public Optional<String> memoryLimit() {
        return Optional.ofNullable(this.memoryLimit);
    }
    /**
     * @return The minimum memory required for agent
     * 
     */
    public Optional<String> memoryRequest() {
        return Optional.ofNullable(this.memoryRequest);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterAgentDeploymentCustomizationOverrideResourceRequirement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cpuLimit;
        private @Nullable String cpuRequest;
        private @Nullable String memoryLimit;
        private @Nullable String memoryRequest;
        public Builder() {}
        public Builder(ClusterClusterAgentDeploymentCustomizationOverrideResourceRequirement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuLimit = defaults.cpuLimit;
    	      this.cpuRequest = defaults.cpuRequest;
    	      this.memoryLimit = defaults.memoryLimit;
    	      this.memoryRequest = defaults.memoryRequest;
        }

        @CustomType.Setter
        public Builder cpuLimit(@Nullable String cpuLimit) {

            this.cpuLimit = cpuLimit;
            return this;
        }
        @CustomType.Setter
        public Builder cpuRequest(@Nullable String cpuRequest) {

            this.cpuRequest = cpuRequest;
            return this;
        }
        @CustomType.Setter
        public Builder memoryLimit(@Nullable String memoryLimit) {

            this.memoryLimit = memoryLimit;
            return this;
        }
        @CustomType.Setter
        public Builder memoryRequest(@Nullable String memoryRequest) {

            this.memoryRequest = memoryRequest;
            return this;
        }
        public ClusterClusterAgentDeploymentCustomizationOverrideResourceRequirement build() {
            final var _resultValue = new ClusterClusterAgentDeploymentCustomizationOverrideResourceRequirement();
            _resultValue.cpuLimit = cpuLimit;
            _resultValue.cpuRequest = cpuRequest;
            _resultValue.memoryLimit = memoryLimit;
            _resultValue.memoryRequest = memoryRequest;
            return _resultValue;
        }
    }
}
