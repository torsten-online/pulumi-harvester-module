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
public final class ClusterRkeConfigServicesKubeproxy {
    /**
     * @return Extra arguments for RKE Ingress (map)
     * 
     */
    private @Nullable Map<String,Object> extraArgs;
    /**
     * @return Extra binds for etcd service (list)
     * 
     */
    private @Nullable List<String> extraBinds;
    /**
     * @return Extra environment for etcd service (list)
     * 
     */
    private @Nullable List<String> extraEnvs;
    /**
     * @return Docker image for etcd service (string)
     * 
     */
    private @Nullable String image;

    private ClusterRkeConfigServicesKubeproxy() {}
    /**
     * @return Extra arguments for RKE Ingress (map)
     * 
     */
    public Map<String,Object> extraArgs() {
        return this.extraArgs == null ? Map.of() : this.extraArgs;
    }
    /**
     * @return Extra binds for etcd service (list)
     * 
     */
    public List<String> extraBinds() {
        return this.extraBinds == null ? List.of() : this.extraBinds;
    }
    /**
     * @return Extra environment for etcd service (list)
     * 
     */
    public List<String> extraEnvs() {
        return this.extraEnvs == null ? List.of() : this.extraEnvs;
    }
    /**
     * @return Docker image for etcd service (string)
     * 
     */
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigServicesKubeproxy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,Object> extraArgs;
        private @Nullable List<String> extraBinds;
        private @Nullable List<String> extraEnvs;
        private @Nullable String image;
        public Builder() {}
        public Builder(ClusterRkeConfigServicesKubeproxy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extraArgs = defaults.extraArgs;
    	      this.extraBinds = defaults.extraBinds;
    	      this.extraEnvs = defaults.extraEnvs;
    	      this.image = defaults.image;
        }

        @CustomType.Setter
        public Builder extraArgs(@Nullable Map<String,Object> extraArgs) {
            this.extraArgs = extraArgs;
            return this;
        }
        @CustomType.Setter
        public Builder extraBinds(@Nullable List<String> extraBinds) {
            this.extraBinds = extraBinds;
            return this;
        }
        public Builder extraBinds(String... extraBinds) {
            return extraBinds(List.of(extraBinds));
        }
        @CustomType.Setter
        public Builder extraEnvs(@Nullable List<String> extraEnvs) {
            this.extraEnvs = extraEnvs;
            return this;
        }
        public Builder extraEnvs(String... extraEnvs) {
            return extraEnvs(List.of(extraEnvs));
        }
        @CustomType.Setter
        public Builder image(@Nullable String image) {
            this.image = image;
            return this;
        }
        public ClusterRkeConfigServicesKubeproxy build() {
            final var o = new ClusterRkeConfigServicesKubeproxy();
            o.extraArgs = extraArgs;
            o.extraBinds = extraBinds;
            o.extraEnvs = extraEnvs;
            o.image = image;
            return o;
        }
    }
}
