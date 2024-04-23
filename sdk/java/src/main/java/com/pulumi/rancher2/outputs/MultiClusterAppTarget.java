// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MultiClusterAppTarget {
    /**
     * @return App ID for target
     * 
     */
    private @Nullable String appId;
    /**
     * @return App health state for target
     * 
     */
    private @Nullable String healthState;
    /**
     * @return Project ID for target
     * 
     */
    private String projectId;
    /**
     * @return App state for target
     * 
     */
    private @Nullable String state;

    private MultiClusterAppTarget() {}
    /**
     * @return App ID for target
     * 
     */
    public Optional<String> appId() {
        return Optional.ofNullable(this.appId);
    }
    /**
     * @return App health state for target
     * 
     */
    public Optional<String> healthState() {
        return Optional.ofNullable(this.healthState);
    }
    /**
     * @return Project ID for target
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return App state for target
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiClusterAppTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String appId;
        private @Nullable String healthState;
        private String projectId;
        private @Nullable String state;
        public Builder() {}
        public Builder(MultiClusterAppTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.healthState = defaults.healthState;
    	      this.projectId = defaults.projectId;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder appId(@Nullable String appId) {

            this.appId = appId;
            return this;
        }
        @CustomType.Setter
        public Builder healthState(@Nullable String healthState) {

            this.healthState = healthState;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("MultiClusterAppTarget", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {

            this.state = state;
            return this;
        }
        public MultiClusterAppTarget build() {
            final var _resultValue = new MultiClusterAppTarget();
            _resultValue.appId = appId;
            _resultValue.healthState = healthState;
            _resultValue.projectId = projectId;
            _resultValue.state = state;
            return _resultValue;
        }
    }
}
