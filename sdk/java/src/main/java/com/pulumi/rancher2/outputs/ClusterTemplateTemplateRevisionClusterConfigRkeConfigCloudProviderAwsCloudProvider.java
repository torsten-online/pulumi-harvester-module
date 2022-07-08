// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGlobal;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderServiceOverride;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider {
    private final @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGlobal global;
    private final @Nullable List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderServiceOverride> serviceOverrides;

    @CustomType.Constructor
    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider(
        @CustomType.Parameter("global") @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGlobal global,
        @CustomType.Parameter("serviceOverrides") @Nullable List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderServiceOverride> serviceOverrides) {
        this.global = global;
        this.serviceOverrides = serviceOverrides;
    }

    public Optional<ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGlobal> global() {
        return Optional.ofNullable(this.global);
    }
    public List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderServiceOverride> serviceOverrides() {
        return this.serviceOverrides == null ? List.of() : this.serviceOverrides;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGlobal global;
        private @Nullable List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderServiceOverride> serviceOverrides;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.global = defaults.global;
    	      this.serviceOverrides = defaults.serviceOverrides;
        }

        public Builder global(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderGlobal global) {
            this.global = global;
            return this;
        }
        public Builder serviceOverrides(@Nullable List<ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderServiceOverride> serviceOverrides) {
            this.serviceOverrides = serviceOverrides;
            return this;
        }
        public Builder serviceOverrides(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProviderServiceOverride... serviceOverrides) {
            return serviceOverrides(List.of(serviceOverrides));
        }        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider build() {
            return new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider(global, serviceOverrides);
        }
    }
}
