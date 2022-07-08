// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProvider;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider;
import com.pulumi.rancher2.outputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider {
    private final @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider awsCloudProvider;
    private final @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProvider azureCloudProvider;
    private final @Nullable String customCloudProvider;
    /**
     * @return The cluster template revision name (string)
     * 
     */
    private final @Nullable String name;
    private final @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider openstackCloudProvider;
    private final @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider vsphereCloudProvider;

    @CustomType.Constructor
    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider(
        @CustomType.Parameter("awsCloudProvider") @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider awsCloudProvider,
        @CustomType.Parameter("azureCloudProvider") @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProvider azureCloudProvider,
        @CustomType.Parameter("customCloudProvider") @Nullable String customCloudProvider,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("openstackCloudProvider") @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider openstackCloudProvider,
        @CustomType.Parameter("vsphereCloudProvider") @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider vsphereCloudProvider) {
        this.awsCloudProvider = awsCloudProvider;
        this.azureCloudProvider = azureCloudProvider;
        this.customCloudProvider = customCloudProvider;
        this.name = name;
        this.openstackCloudProvider = openstackCloudProvider;
        this.vsphereCloudProvider = vsphereCloudProvider;
    }

    public Optional<ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider> awsCloudProvider() {
        return Optional.ofNullable(this.awsCloudProvider);
    }
    public Optional<ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProvider> azureCloudProvider() {
        return Optional.ofNullable(this.azureCloudProvider);
    }
    public Optional<String> customCloudProvider() {
        return Optional.ofNullable(this.customCloudProvider);
    }
    /**
     * @return The cluster template revision name (string)
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider> openstackCloudProvider() {
        return Optional.ofNullable(this.openstackCloudProvider);
    }
    public Optional<ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider> vsphereCloudProvider() {
        return Optional.ofNullable(this.vsphereCloudProvider);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider awsCloudProvider;
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProvider azureCloudProvider;
        private @Nullable String customCloudProvider;
        private @Nullable String name;
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider openstackCloudProvider;
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider vsphereCloudProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsCloudProvider = defaults.awsCloudProvider;
    	      this.azureCloudProvider = defaults.azureCloudProvider;
    	      this.customCloudProvider = defaults.customCloudProvider;
    	      this.name = defaults.name;
    	      this.openstackCloudProvider = defaults.openstackCloudProvider;
    	      this.vsphereCloudProvider = defaults.vsphereCloudProvider;
        }

        public Builder awsCloudProvider(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider awsCloudProvider) {
            this.awsCloudProvider = awsCloudProvider;
            return this;
        }
        public Builder azureCloudProvider(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProvider azureCloudProvider) {
            this.azureCloudProvider = azureCloudProvider;
            return this;
        }
        public Builder customCloudProvider(@Nullable String customCloudProvider) {
            this.customCloudProvider = customCloudProvider;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder openstackCloudProvider(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider openstackCloudProvider) {
            this.openstackCloudProvider = openstackCloudProvider;
            return this;
        }
        public Builder vsphereCloudProvider(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider vsphereCloudProvider) {
            this.vsphereCloudProvider = vsphereCloudProvider;
            return this;
        }        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider build() {
            return new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider(awsCloudProvider, azureCloudProvider, customCloudProvider, name, openstackCloudProvider, vsphereCloudProvider);
        }
    }
}
