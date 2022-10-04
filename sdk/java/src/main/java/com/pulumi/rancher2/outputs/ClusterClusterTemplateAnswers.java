// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterClusterTemplateAnswers {
    /**
     * @return Cluster ID (string)
     * 
     */
    private @Nullable String clusterId;
    /**
     * @return Project ID to apply answer (string)
     * 
     */
    private @Nullable String projectId;
    /**
     * @return Key/values for answer (map)
     * 
     */
    private @Nullable Map<String,Object> values;

    private ClusterClusterTemplateAnswers() {}
    /**
     * @return Cluster ID (string)
     * 
     */
    public Optional<String> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }
    /**
     * @return Project ID to apply answer (string)
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return Key/values for answer (map)
     * 
     */
    public Map<String,Object> values() {
        return this.values == null ? Map.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterTemplateAnswers defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clusterId;
        private @Nullable String projectId;
        private @Nullable Map<String,Object> values;
        public Builder() {}
        public Builder(ClusterClusterTemplateAnswers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.projectId = defaults.projectId;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder clusterId(@Nullable String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder values(@Nullable Map<String,Object> values) {
            this.values = values;
            return this;
        }
        public ClusterClusterTemplateAnswers build() {
            final var o = new ClusterClusterTemplateAnswers();
            o.clusterId = clusterId;
            o.projectId = projectId;
            o.values = values;
            return o;
        }
    }
}
