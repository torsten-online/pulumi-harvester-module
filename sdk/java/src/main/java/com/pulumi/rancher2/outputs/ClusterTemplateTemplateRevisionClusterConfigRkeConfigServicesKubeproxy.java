// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxy {
    private final @Nullable Map<String,Object> extraArgs;
    private final @Nullable List<String> extraBinds;
    private final @Nullable List<String> extraEnvs;
    private final @Nullable String image;

    @CustomType.Constructor
    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxy(
        @CustomType.Parameter("extraArgs") @Nullable Map<String,Object> extraArgs,
        @CustomType.Parameter("extraBinds") @Nullable List<String> extraBinds,
        @CustomType.Parameter("extraEnvs") @Nullable List<String> extraEnvs,
        @CustomType.Parameter("image") @Nullable String image) {
        this.extraArgs = extraArgs;
        this.extraBinds = extraBinds;
        this.extraEnvs = extraEnvs;
        this.image = image;
    }

    public Map<String,Object> extraArgs() {
        return this.extraArgs == null ? Map.of() : this.extraArgs;
    }
    public List<String> extraBinds() {
        return this.extraBinds == null ? List.of() : this.extraBinds;
    }
    public List<String> extraEnvs() {
        return this.extraEnvs == null ? List.of() : this.extraEnvs;
    }
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> extraArgs;
        private @Nullable List<String> extraBinds;
        private @Nullable List<String> extraEnvs;
        private @Nullable String image;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extraArgs = defaults.extraArgs;
    	      this.extraBinds = defaults.extraBinds;
    	      this.extraEnvs = defaults.extraEnvs;
    	      this.image = defaults.image;
        }

        public Builder extraArgs(@Nullable Map<String,Object> extraArgs) {
            this.extraArgs = extraArgs;
            return this;
        }
        public Builder extraBinds(@Nullable List<String> extraBinds) {
            this.extraBinds = extraBinds;
            return this;
        }
        public Builder extraBinds(String... extraBinds) {
            return extraBinds(List.of(extraBinds));
        }
        public Builder extraEnvs(@Nullable List<String> extraEnvs) {
            this.extraEnvs = extraEnvs;
            return this;
        }
        public Builder extraEnvs(String... extraEnvs) {
            return extraEnvs(List.of(extraEnvs));
        }
        public Builder image(@Nullable String image) {
            this.image = image;
            return this;
        }        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxy build() {
            return new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxy(extraArgs, extraBinds, extraEnvs, image);
        }
    }
}
