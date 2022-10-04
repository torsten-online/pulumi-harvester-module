// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterRkeConfigCloudProviderAzureCloudProvider {
    private String aadClientCertPassword;
    private String aadClientCertPath;
    private String aadClientId;
    private String aadClientSecret;
    private String cloud;
    private Boolean cloudProviderBackoff;
    private Integer cloudProviderBackoffDuration;
    private Integer cloudProviderBackoffExponent;
    private Integer cloudProviderBackoffJitter;
    private Integer cloudProviderBackoffRetries;
    private Boolean cloudProviderRateLimit;
    private Integer cloudProviderRateLimitBucket;
    private Integer cloudProviderRateLimitQps;
    private @Nullable String loadBalancerSku;
    private String location;
    private Integer maximumLoadBalancerRuleCount;
    private String primaryAvailabilitySetName;
    private String primaryScaleSetName;
    private String resourceGroup;
    private String routeTableName;
    private String securityGroupName;
    private String subnetName;
    private String subscriptionId;
    private String tenantId;
    private Boolean useInstanceMetadata;
    private Boolean useManagedIdentityExtension;
    private String vmType;
    private String vnetName;
    private String vnetResourceGroup;

    private GetClusterRkeConfigCloudProviderAzureCloudProvider() {}
    public String aadClientCertPassword() {
        return this.aadClientCertPassword;
    }
    public String aadClientCertPath() {
        return this.aadClientCertPath;
    }
    public String aadClientId() {
        return this.aadClientId;
    }
    public String aadClientSecret() {
        return this.aadClientSecret;
    }
    public String cloud() {
        return this.cloud;
    }
    public Boolean cloudProviderBackoff() {
        return this.cloudProviderBackoff;
    }
    public Integer cloudProviderBackoffDuration() {
        return this.cloudProviderBackoffDuration;
    }
    public Integer cloudProviderBackoffExponent() {
        return this.cloudProviderBackoffExponent;
    }
    public Integer cloudProviderBackoffJitter() {
        return this.cloudProviderBackoffJitter;
    }
    public Integer cloudProviderBackoffRetries() {
        return this.cloudProviderBackoffRetries;
    }
    public Boolean cloudProviderRateLimit() {
        return this.cloudProviderRateLimit;
    }
    public Integer cloudProviderRateLimitBucket() {
        return this.cloudProviderRateLimitBucket;
    }
    public Integer cloudProviderRateLimitQps() {
        return this.cloudProviderRateLimitQps;
    }
    public Optional<String> loadBalancerSku() {
        return Optional.ofNullable(this.loadBalancerSku);
    }
    public String location() {
        return this.location;
    }
    public Integer maximumLoadBalancerRuleCount() {
        return this.maximumLoadBalancerRuleCount;
    }
    public String primaryAvailabilitySetName() {
        return this.primaryAvailabilitySetName;
    }
    public String primaryScaleSetName() {
        return this.primaryScaleSetName;
    }
    public String resourceGroup() {
        return this.resourceGroup;
    }
    public String routeTableName() {
        return this.routeTableName;
    }
    public String securityGroupName() {
        return this.securityGroupName;
    }
    public String subnetName() {
        return this.subnetName;
    }
    public String subscriptionId() {
        return this.subscriptionId;
    }
    public String tenantId() {
        return this.tenantId;
    }
    public Boolean useInstanceMetadata() {
        return this.useInstanceMetadata;
    }
    public Boolean useManagedIdentityExtension() {
        return this.useManagedIdentityExtension;
    }
    public String vmType() {
        return this.vmType;
    }
    public String vnetName() {
        return this.vnetName;
    }
    public String vnetResourceGroup() {
        return this.vnetResourceGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigCloudProviderAzureCloudProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String aadClientCertPassword;
        private String aadClientCertPath;
        private String aadClientId;
        private String aadClientSecret;
        private String cloud;
        private Boolean cloudProviderBackoff;
        private Integer cloudProviderBackoffDuration;
        private Integer cloudProviderBackoffExponent;
        private Integer cloudProviderBackoffJitter;
        private Integer cloudProviderBackoffRetries;
        private Boolean cloudProviderRateLimit;
        private Integer cloudProviderRateLimitBucket;
        private Integer cloudProviderRateLimitQps;
        private @Nullable String loadBalancerSku;
        private String location;
        private Integer maximumLoadBalancerRuleCount;
        private String primaryAvailabilitySetName;
        private String primaryScaleSetName;
        private String resourceGroup;
        private String routeTableName;
        private String securityGroupName;
        private String subnetName;
        private String subscriptionId;
        private String tenantId;
        private Boolean useInstanceMetadata;
        private Boolean useManagedIdentityExtension;
        private String vmType;
        private String vnetName;
        private String vnetResourceGroup;
        public Builder() {}
        public Builder(GetClusterRkeConfigCloudProviderAzureCloudProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadClientCertPassword = defaults.aadClientCertPassword;
    	      this.aadClientCertPath = defaults.aadClientCertPath;
    	      this.aadClientId = defaults.aadClientId;
    	      this.aadClientSecret = defaults.aadClientSecret;
    	      this.cloud = defaults.cloud;
    	      this.cloudProviderBackoff = defaults.cloudProviderBackoff;
    	      this.cloudProviderBackoffDuration = defaults.cloudProviderBackoffDuration;
    	      this.cloudProviderBackoffExponent = defaults.cloudProviderBackoffExponent;
    	      this.cloudProviderBackoffJitter = defaults.cloudProviderBackoffJitter;
    	      this.cloudProviderBackoffRetries = defaults.cloudProviderBackoffRetries;
    	      this.cloudProviderRateLimit = defaults.cloudProviderRateLimit;
    	      this.cloudProviderRateLimitBucket = defaults.cloudProviderRateLimitBucket;
    	      this.cloudProviderRateLimitQps = defaults.cloudProviderRateLimitQps;
    	      this.loadBalancerSku = defaults.loadBalancerSku;
    	      this.location = defaults.location;
    	      this.maximumLoadBalancerRuleCount = defaults.maximumLoadBalancerRuleCount;
    	      this.primaryAvailabilitySetName = defaults.primaryAvailabilitySetName;
    	      this.primaryScaleSetName = defaults.primaryScaleSetName;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.routeTableName = defaults.routeTableName;
    	      this.securityGroupName = defaults.securityGroupName;
    	      this.subnetName = defaults.subnetName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenantId = defaults.tenantId;
    	      this.useInstanceMetadata = defaults.useInstanceMetadata;
    	      this.useManagedIdentityExtension = defaults.useManagedIdentityExtension;
    	      this.vmType = defaults.vmType;
    	      this.vnetName = defaults.vnetName;
    	      this.vnetResourceGroup = defaults.vnetResourceGroup;
        }

        @CustomType.Setter
        public Builder aadClientCertPassword(String aadClientCertPassword) {
            this.aadClientCertPassword = Objects.requireNonNull(aadClientCertPassword);
            return this;
        }
        @CustomType.Setter
        public Builder aadClientCertPath(String aadClientCertPath) {
            this.aadClientCertPath = Objects.requireNonNull(aadClientCertPath);
            return this;
        }
        @CustomType.Setter
        public Builder aadClientId(String aadClientId) {
            this.aadClientId = Objects.requireNonNull(aadClientId);
            return this;
        }
        @CustomType.Setter
        public Builder aadClientSecret(String aadClientSecret) {
            this.aadClientSecret = Objects.requireNonNull(aadClientSecret);
            return this;
        }
        @CustomType.Setter
        public Builder cloud(String cloud) {
            this.cloud = Objects.requireNonNull(cloud);
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderBackoff(Boolean cloudProviderBackoff) {
            this.cloudProviderBackoff = Objects.requireNonNull(cloudProviderBackoff);
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderBackoffDuration(Integer cloudProviderBackoffDuration) {
            this.cloudProviderBackoffDuration = Objects.requireNonNull(cloudProviderBackoffDuration);
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderBackoffExponent(Integer cloudProviderBackoffExponent) {
            this.cloudProviderBackoffExponent = Objects.requireNonNull(cloudProviderBackoffExponent);
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderBackoffJitter(Integer cloudProviderBackoffJitter) {
            this.cloudProviderBackoffJitter = Objects.requireNonNull(cloudProviderBackoffJitter);
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderBackoffRetries(Integer cloudProviderBackoffRetries) {
            this.cloudProviderBackoffRetries = Objects.requireNonNull(cloudProviderBackoffRetries);
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderRateLimit(Boolean cloudProviderRateLimit) {
            this.cloudProviderRateLimit = Objects.requireNonNull(cloudProviderRateLimit);
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderRateLimitBucket(Integer cloudProviderRateLimitBucket) {
            this.cloudProviderRateLimitBucket = Objects.requireNonNull(cloudProviderRateLimitBucket);
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderRateLimitQps(Integer cloudProviderRateLimitQps) {
            this.cloudProviderRateLimitQps = Objects.requireNonNull(cloudProviderRateLimitQps);
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerSku(@Nullable String loadBalancerSku) {
            this.loadBalancerSku = loadBalancerSku;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder maximumLoadBalancerRuleCount(Integer maximumLoadBalancerRuleCount) {
            this.maximumLoadBalancerRuleCount = Objects.requireNonNull(maximumLoadBalancerRuleCount);
            return this;
        }
        @CustomType.Setter
        public Builder primaryAvailabilitySetName(String primaryAvailabilitySetName) {
            this.primaryAvailabilitySetName = Objects.requireNonNull(primaryAvailabilitySetName);
            return this;
        }
        @CustomType.Setter
        public Builder primaryScaleSetName(String primaryScaleSetName) {
            this.primaryScaleSetName = Objects.requireNonNull(primaryScaleSetName);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }
        @CustomType.Setter
        public Builder routeTableName(String routeTableName) {
            this.routeTableName = Objects.requireNonNull(routeTableName);
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupName(String securityGroupName) {
            this.securityGroupName = Objects.requireNonNull(securityGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder subnetName(String subnetName) {
            this.subnetName = Objects.requireNonNull(subnetName);
            return this;
        }
        @CustomType.Setter
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        @CustomType.Setter
        public Builder useInstanceMetadata(Boolean useInstanceMetadata) {
            this.useInstanceMetadata = Objects.requireNonNull(useInstanceMetadata);
            return this;
        }
        @CustomType.Setter
        public Builder useManagedIdentityExtension(Boolean useManagedIdentityExtension) {
            this.useManagedIdentityExtension = Objects.requireNonNull(useManagedIdentityExtension);
            return this;
        }
        @CustomType.Setter
        public Builder vmType(String vmType) {
            this.vmType = Objects.requireNonNull(vmType);
            return this;
        }
        @CustomType.Setter
        public Builder vnetName(String vnetName) {
            this.vnetName = Objects.requireNonNull(vnetName);
            return this;
        }
        @CustomType.Setter
        public Builder vnetResourceGroup(String vnetResourceGroup) {
            this.vnetResourceGroup = Objects.requireNonNull(vnetResourceGroup);
            return this;
        }
        public GetClusterRkeConfigCloudProviderAzureCloudProvider build() {
            final var o = new GetClusterRkeConfigCloudProviderAzureCloudProvider();
            o.aadClientCertPassword = aadClientCertPassword;
            o.aadClientCertPath = aadClientCertPath;
            o.aadClientId = aadClientId;
            o.aadClientSecret = aadClientSecret;
            o.cloud = cloud;
            o.cloudProviderBackoff = cloudProviderBackoff;
            o.cloudProviderBackoffDuration = cloudProviderBackoffDuration;
            o.cloudProviderBackoffExponent = cloudProviderBackoffExponent;
            o.cloudProviderBackoffJitter = cloudProviderBackoffJitter;
            o.cloudProviderBackoffRetries = cloudProviderBackoffRetries;
            o.cloudProviderRateLimit = cloudProviderRateLimit;
            o.cloudProviderRateLimitBucket = cloudProviderRateLimitBucket;
            o.cloudProviderRateLimitQps = cloudProviderRateLimitQps;
            o.loadBalancerSku = loadBalancerSku;
            o.location = location;
            o.maximumLoadBalancerRuleCount = maximumLoadBalancerRuleCount;
            o.primaryAvailabilitySetName = primaryAvailabilitySetName;
            o.primaryScaleSetName = primaryScaleSetName;
            o.resourceGroup = resourceGroup;
            o.routeTableName = routeTableName;
            o.securityGroupName = securityGroupName;
            o.subnetName = subnetName;
            o.subscriptionId = subscriptionId;
            o.tenantId = tenantId;
            o.useInstanceMetadata = useInstanceMetadata;
            o.useManagedIdentityExtension = useManagedIdentityExtension;
            o.vmType = vmType;
            o.vnetName = vnetName;
            o.vnetResourceGroup = vnetResourceGroup;
            return o;
        }
    }
}
