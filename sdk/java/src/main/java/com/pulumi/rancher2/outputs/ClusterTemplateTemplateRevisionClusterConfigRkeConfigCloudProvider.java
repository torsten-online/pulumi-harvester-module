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
    private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider awsCloudProvider;
    private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProvider azureCloudProvider;
    private @Nullable String customCloudProvider;
    /**
     * @return The cluster template name (string)
     * 
     */
    private @Nullable String name;
    private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider openstackCloudProvider;
    private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider vsphereCloudProvider;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider() {}
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
     * @return The cluster template name (string)
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
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider awsCloudProvider;
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProvider azureCloudProvider;
        private @Nullable String customCloudProvider;
        private @Nullable String name;
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider openstackCloudProvider;
        private @Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider vsphereCloudProvider;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsCloudProvider = defaults.awsCloudProvider;
    	      this.azureCloudProvider = defaults.azureCloudProvider;
    	      this.customCloudProvider = defaults.customCloudProvider;
    	      this.name = defaults.name;
    	      this.openstackCloudProvider = defaults.openstackCloudProvider;
    	      this.vsphereCloudProvider = defaults.vsphereCloudProvider;
        }

        @CustomType.Setter
        public Builder awsCloudProvider(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAwsCloudProvider awsCloudProvider) {
            this.awsCloudProvider = awsCloudProvider;
            return this;
        }
        @CustomType.Setter
        public Builder azureCloudProvider(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderAzureCloudProvider azureCloudProvider) {
            this.azureCloudProvider = azureCloudProvider;
            return this;
        }
        @CustomType.Setter
        public Builder customCloudProvider(@Nullable String customCloudProvider) {
            this.customCloudProvider = customCloudProvider;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder openstackCloudProvider(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProvider openstackCloudProvider) {
            this.openstackCloudProvider = openstackCloudProvider;
            return this;
        }
        @CustomType.Setter
        public Builder vsphereCloudProvider(@Nullable ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProvider vsphereCloudProvider) {
            this.vsphereCloudProvider = vsphereCloudProvider;
            return this;
        }
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider build() {
            final var _resultValue = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProvider();
            _resultValue.awsCloudProvider = awsCloudProvider;
            _resultValue.azureCloudProvider = azureCloudProvider;
            _resultValue.customCloudProvider = customCloudProvider;
            _resultValue.name = name;
            _resultValue.openstackCloudProvider = openstackCloudProvider;
            _resultValue.vsphereCloudProvider = vsphereCloudProvider;
            return _resultValue;
        }
    }
}
