// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterV2RkeConfigEtcdSnapshotRestore {
    private Integer generation;
    /**
     * @return The name of the Cluster v2 (string)
     * 
     */
    private String name;
    private @Nullable String restoreRkeConfig;

    private GetClusterV2RkeConfigEtcdSnapshotRestore() {}
    public Integer generation() {
        return this.generation;
    }
    /**
     * @return The name of the Cluster v2 (string)
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<String> restoreRkeConfig() {
        return Optional.ofNullable(this.restoreRkeConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterV2RkeConfigEtcdSnapshotRestore defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer generation;
        private String name;
        private @Nullable String restoreRkeConfig;
        public Builder() {}
        public Builder(GetClusterV2RkeConfigEtcdSnapshotRestore defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.generation = defaults.generation;
    	      this.name = defaults.name;
    	      this.restoreRkeConfig = defaults.restoreRkeConfig;
        }

        @CustomType.Setter
        public Builder generation(Integer generation) {
            if (generation == null) {
              throw new MissingRequiredPropertyException("GetClusterV2RkeConfigEtcdSnapshotRestore", "generation");
            }
            this.generation = generation;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetClusterV2RkeConfigEtcdSnapshotRestore", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder restoreRkeConfig(@Nullable String restoreRkeConfig) {

            this.restoreRkeConfig = restoreRkeConfig;
            return this;
        }
        public GetClusterV2RkeConfigEtcdSnapshotRestore build() {
            final var _resultValue = new GetClusterV2RkeConfigEtcdSnapshotRestore();
            _resultValue.generation = generation;
            _resultValue.name = name;
            _resultValue.restoreRkeConfig = restoreRkeConfig;
            return _resultValue;
        }
    }
}
