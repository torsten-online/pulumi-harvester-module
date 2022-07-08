// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigCloudProviderOpenstackCloudProviderRoute {
    /**
     * @return (string)
     * 
     */
    private final @Nullable String routerId;

    @CustomType.Constructor
    private ClusterRkeConfigCloudProviderOpenstackCloudProviderRoute(@CustomType.Parameter("routerId") @Nullable String routerId) {
        this.routerId = routerId;
    }

    /**
     * @return (string)
     * 
     */
    public Optional<String> routerId() {
        return Optional.ofNullable(this.routerId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigCloudProviderOpenstackCloudProviderRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String routerId;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterRkeConfigCloudProviderOpenstackCloudProviderRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.routerId = defaults.routerId;
        }

        public Builder routerId(@Nullable String routerId) {
            this.routerId = routerId;
            return this;
        }        public ClusterRkeConfigCloudProviderOpenstackCloudProviderRoute build() {
            return new ClusterRkeConfigCloudProviderOpenstackCloudProviderRoute(routerId);
        }
    }
}
