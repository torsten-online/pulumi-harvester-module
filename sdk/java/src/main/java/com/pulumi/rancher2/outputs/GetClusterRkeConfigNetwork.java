// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigNetworkCalicoNetworkProvider;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigNetworkCanalNetworkProvider;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigNetworkFlannelNetworkProvider;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigNetworkToleration;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigNetworkWeaveNetworkProvider;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterRkeConfigNetwork {
    private final @Nullable GetClusterRkeConfigNetworkCalicoNetworkProvider calicoNetworkProvider;
    private final @Nullable GetClusterRkeConfigNetworkCanalNetworkProvider canalNetworkProvider;
    private final @Nullable GetClusterRkeConfigNetworkFlannelNetworkProvider flannelNetworkProvider;
    private final @Nullable Integer mtu;
    private final Map<String,Object> options;
    private final String plugin;
    private final @Nullable List<GetClusterRkeConfigNetworkToleration> tolerations;
    private final @Nullable GetClusterRkeConfigNetworkWeaveNetworkProvider weaveNetworkProvider;

    @CustomType.Constructor
    private GetClusterRkeConfigNetwork(
        @CustomType.Parameter("calicoNetworkProvider") @Nullable GetClusterRkeConfigNetworkCalicoNetworkProvider calicoNetworkProvider,
        @CustomType.Parameter("canalNetworkProvider") @Nullable GetClusterRkeConfigNetworkCanalNetworkProvider canalNetworkProvider,
        @CustomType.Parameter("flannelNetworkProvider") @Nullable GetClusterRkeConfigNetworkFlannelNetworkProvider flannelNetworkProvider,
        @CustomType.Parameter("mtu") @Nullable Integer mtu,
        @CustomType.Parameter("options") Map<String,Object> options,
        @CustomType.Parameter("plugin") String plugin,
        @CustomType.Parameter("tolerations") @Nullable List<GetClusterRkeConfigNetworkToleration> tolerations,
        @CustomType.Parameter("weaveNetworkProvider") @Nullable GetClusterRkeConfigNetworkWeaveNetworkProvider weaveNetworkProvider) {
        this.calicoNetworkProvider = calicoNetworkProvider;
        this.canalNetworkProvider = canalNetworkProvider;
        this.flannelNetworkProvider = flannelNetworkProvider;
        this.mtu = mtu;
        this.options = options;
        this.plugin = plugin;
        this.tolerations = tolerations;
        this.weaveNetworkProvider = weaveNetworkProvider;
    }

    public Optional<GetClusterRkeConfigNetworkCalicoNetworkProvider> calicoNetworkProvider() {
        return Optional.ofNullable(this.calicoNetworkProvider);
    }
    public Optional<GetClusterRkeConfigNetworkCanalNetworkProvider> canalNetworkProvider() {
        return Optional.ofNullable(this.canalNetworkProvider);
    }
    public Optional<GetClusterRkeConfigNetworkFlannelNetworkProvider> flannelNetworkProvider() {
        return Optional.ofNullable(this.flannelNetworkProvider);
    }
    public Optional<Integer> mtu() {
        return Optional.ofNullable(this.mtu);
    }
    public Map<String,Object> options() {
        return this.options;
    }
    public String plugin() {
        return this.plugin;
    }
    public List<GetClusterRkeConfigNetworkToleration> tolerations() {
        return this.tolerations == null ? List.of() : this.tolerations;
    }
    public Optional<GetClusterRkeConfigNetworkWeaveNetworkProvider> weaveNetworkProvider() {
        return Optional.ofNullable(this.weaveNetworkProvider);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigNetwork defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GetClusterRkeConfigNetworkCalicoNetworkProvider calicoNetworkProvider;
        private @Nullable GetClusterRkeConfigNetworkCanalNetworkProvider canalNetworkProvider;
        private @Nullable GetClusterRkeConfigNetworkFlannelNetworkProvider flannelNetworkProvider;
        private @Nullable Integer mtu;
        private Map<String,Object> options;
        private String plugin;
        private @Nullable List<GetClusterRkeConfigNetworkToleration> tolerations;
        private @Nullable GetClusterRkeConfigNetworkWeaveNetworkProvider weaveNetworkProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterRkeConfigNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.calicoNetworkProvider = defaults.calicoNetworkProvider;
    	      this.canalNetworkProvider = defaults.canalNetworkProvider;
    	      this.flannelNetworkProvider = defaults.flannelNetworkProvider;
    	      this.mtu = defaults.mtu;
    	      this.options = defaults.options;
    	      this.plugin = defaults.plugin;
    	      this.tolerations = defaults.tolerations;
    	      this.weaveNetworkProvider = defaults.weaveNetworkProvider;
        }

        public Builder calicoNetworkProvider(@Nullable GetClusterRkeConfigNetworkCalicoNetworkProvider calicoNetworkProvider) {
            this.calicoNetworkProvider = calicoNetworkProvider;
            return this;
        }
        public Builder canalNetworkProvider(@Nullable GetClusterRkeConfigNetworkCanalNetworkProvider canalNetworkProvider) {
            this.canalNetworkProvider = canalNetworkProvider;
            return this;
        }
        public Builder flannelNetworkProvider(@Nullable GetClusterRkeConfigNetworkFlannelNetworkProvider flannelNetworkProvider) {
            this.flannelNetworkProvider = flannelNetworkProvider;
            return this;
        }
        public Builder mtu(@Nullable Integer mtu) {
            this.mtu = mtu;
            return this;
        }
        public Builder options(Map<String,Object> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public Builder plugin(String plugin) {
            this.plugin = Objects.requireNonNull(plugin);
            return this;
        }
        public Builder tolerations(@Nullable List<GetClusterRkeConfigNetworkToleration> tolerations) {
            this.tolerations = tolerations;
            return this;
        }
        public Builder tolerations(GetClusterRkeConfigNetworkToleration... tolerations) {
            return tolerations(List.of(tolerations));
        }
        public Builder weaveNetworkProvider(@Nullable GetClusterRkeConfigNetworkWeaveNetworkProvider weaveNetworkProvider) {
            this.weaveNetworkProvider = weaveNetworkProvider;
            return this;
        }        public GetClusterRkeConfigNetwork build() {
            return new GetClusterRkeConfigNetwork(calicoNetworkProvider, canalNetworkProvider, flannelNetworkProvider, mtu, options, plugin, tolerations, weaveNetworkProvider);
        }
    }
}
