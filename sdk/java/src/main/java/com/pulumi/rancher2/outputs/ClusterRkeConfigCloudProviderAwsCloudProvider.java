// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterRkeConfigCloudProviderAwsCloudProviderGlobal;
import com.pulumi.rancher2.outputs.ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigCloudProviderAwsCloudProvider {
    /**
     * @return (list maxitems:1)
     * 
     */
    private @Nullable ClusterRkeConfigCloudProviderAwsCloudProviderGlobal global;
    /**
     * @return (list)
     * 
     */
    private @Nullable List<ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride> serviceOverrides;

    private ClusterRkeConfigCloudProviderAwsCloudProvider() {}
    /**
     * @return (list maxitems:1)
     * 
     */
    public Optional<ClusterRkeConfigCloudProviderAwsCloudProviderGlobal> global() {
        return Optional.ofNullable(this.global);
    }
    /**
     * @return (list)
     * 
     */
    public List<ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride> serviceOverrides() {
        return this.serviceOverrides == null ? List.of() : this.serviceOverrides;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigCloudProviderAwsCloudProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterRkeConfigCloudProviderAwsCloudProviderGlobal global;
        private @Nullable List<ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride> serviceOverrides;
        public Builder() {}
        public Builder(ClusterRkeConfigCloudProviderAwsCloudProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.global = defaults.global;
    	      this.serviceOverrides = defaults.serviceOverrides;
        }

        @CustomType.Setter
        public Builder global(@Nullable ClusterRkeConfigCloudProviderAwsCloudProviderGlobal global) {
            this.global = global;
            return this;
        }
        @CustomType.Setter
        public Builder serviceOverrides(@Nullable List<ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride> serviceOverrides) {
            this.serviceOverrides = serviceOverrides;
            return this;
        }
        public Builder serviceOverrides(ClusterRkeConfigCloudProviderAwsCloudProviderServiceOverride... serviceOverrides) {
            return serviceOverrides(List.of(serviceOverrides));
        }
        public ClusterRkeConfigCloudProviderAwsCloudProvider build() {
            final var _resultValue = new ClusterRkeConfigCloudProviderAwsCloudProvider();
            _resultValue.global = global;
            _resultValue.serviceOverrides = serviceOverrides;
            return _resultValue;
        }
    }
}
