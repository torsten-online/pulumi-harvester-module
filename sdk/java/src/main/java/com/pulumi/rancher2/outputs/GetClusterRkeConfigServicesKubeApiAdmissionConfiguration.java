// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigServicesKubeApiAdmissionConfigurationPlugin;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterRkeConfigServicesKubeApiAdmissionConfiguration {
    private @Nullable String apiVersion;
    private @Nullable String kind;
    private List<GetClusterRkeConfigServicesKubeApiAdmissionConfigurationPlugin> plugins;

    private GetClusterRkeConfigServicesKubeApiAdmissionConfiguration() {}
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    public List<GetClusterRkeConfigServicesKubeApiAdmissionConfigurationPlugin> plugins() {
        return this.plugins;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigServicesKubeApiAdmissionConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private List<GetClusterRkeConfigServicesKubeApiAdmissionConfigurationPlugin> plugins;
        public Builder() {}
        public Builder(GetClusterRkeConfigServicesKubeApiAdmissionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.plugins = defaults.plugins;
        }

        @CustomType.Setter
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder plugins(List<GetClusterRkeConfigServicesKubeApiAdmissionConfigurationPlugin> plugins) {
            this.plugins = Objects.requireNonNull(plugins);
            return this;
        }
        public Builder plugins(GetClusterRkeConfigServicesKubeApiAdmissionConfigurationPlugin... plugins) {
            return plugins(List.of(plugins));
        }
        public GetClusterRkeConfigServicesKubeApiAdmissionConfiguration build() {
            final var o = new GetClusterRkeConfigServicesKubeApiAdmissionConfiguration();
            o.apiVersion = apiVersion;
            o.kind = kind;
            o.plugins = plugins;
            return o;
        }
    }
}
