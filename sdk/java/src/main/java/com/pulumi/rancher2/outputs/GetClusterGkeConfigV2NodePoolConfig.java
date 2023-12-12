// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterGkeConfigV2NodePoolConfigTaint;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterGkeConfigV2NodePoolConfig {
    private @Nullable Integer diskSizeGb;
    private @Nullable String diskType;
    private @Nullable String imageType;
    /**
     * @return (Computed) Labels for Node Pool object (map)
     * 
     */
    private Map<String,Object> labels;
    private @Nullable Integer localSsdCount;
    private @Nullable String machineType;
    private List<String> oauthScopes;
    private @Nullable Boolean preemptible;
    private List<String> tags;
    private @Nullable List<GetClusterGkeConfigV2NodePoolConfigTaint> taints;

    private GetClusterGkeConfigV2NodePoolConfig() {}
    public Optional<Integer> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }
    public Optional<String> diskType() {
        return Optional.ofNullable(this.diskType);
    }
    public Optional<String> imageType() {
        return Optional.ofNullable(this.imageType);
    }
    /**
     * @return (Computed) Labels for Node Pool object (map)
     * 
     */
    public Map<String,Object> labels() {
        return this.labels;
    }
    public Optional<Integer> localSsdCount() {
        return Optional.ofNullable(this.localSsdCount);
    }
    public Optional<String> machineType() {
        return Optional.ofNullable(this.machineType);
    }
    public List<String> oauthScopes() {
        return this.oauthScopes;
    }
    public Optional<Boolean> preemptible() {
        return Optional.ofNullable(this.preemptible);
    }
    public List<String> tags() {
        return this.tags;
    }
    public List<GetClusterGkeConfigV2NodePoolConfigTaint> taints() {
        return this.taints == null ? List.of() : this.taints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterGkeConfigV2NodePoolConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer diskSizeGb;
        private @Nullable String diskType;
        private @Nullable String imageType;
        private Map<String,Object> labels;
        private @Nullable Integer localSsdCount;
        private @Nullable String machineType;
        private List<String> oauthScopes;
        private @Nullable Boolean preemptible;
        private List<String> tags;
        private @Nullable List<GetClusterGkeConfigV2NodePoolConfigTaint> taints;
        public Builder() {}
        public Builder(GetClusterGkeConfigV2NodePoolConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.imageType = defaults.imageType;
    	      this.labels = defaults.labels;
    	      this.localSsdCount = defaults.localSsdCount;
    	      this.machineType = defaults.machineType;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.preemptible = defaults.preemptible;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
        }

        @CustomType.Setter
        public Builder diskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }
        @CustomType.Setter
        public Builder diskType(@Nullable String diskType) {
            this.diskType = diskType;
            return this;
        }
        @CustomType.Setter
        public Builder imageType(@Nullable String imageType) {
            this.imageType = imageType;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,Object> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder localSsdCount(@Nullable Integer localSsdCount) {
            this.localSsdCount = localSsdCount;
            return this;
        }
        @CustomType.Setter
        public Builder machineType(@Nullable String machineType) {
            this.machineType = machineType;
            return this;
        }
        @CustomType.Setter
        public Builder oauthScopes(List<String> oauthScopes) {
            this.oauthScopes = Objects.requireNonNull(oauthScopes);
            return this;
        }
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }
        @CustomType.Setter
        public Builder preemptible(@Nullable Boolean preemptible) {
            this.preemptible = preemptible;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder taints(@Nullable List<GetClusterGkeConfigV2NodePoolConfigTaint> taints) {
            this.taints = taints;
            return this;
        }
        public Builder taints(GetClusterGkeConfigV2NodePoolConfigTaint... taints) {
            return taints(List.of(taints));
        }
        public GetClusterGkeConfigV2NodePoolConfig build() {
            final var _resultValue = new GetClusterGkeConfigV2NodePoolConfig();
            _resultValue.diskSizeGb = diskSizeGb;
            _resultValue.diskType = diskType;
            _resultValue.imageType = imageType;
            _resultValue.labels = labels;
            _resultValue.localSsdCount = localSsdCount;
            _resultValue.machineType = machineType;
            _resultValue.oauthScopes = oauthScopes;
            _resultValue.preemptible = preemptible;
            _resultValue.tags = tags;
            _resultValue.taints = taints;
            return _resultValue;
        }
    }
}
