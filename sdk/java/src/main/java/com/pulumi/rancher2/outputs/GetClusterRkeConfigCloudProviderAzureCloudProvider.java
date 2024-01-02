// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
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
            if (aadClientCertPassword == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "aadClientCertPassword");
            }
            this.aadClientCertPassword = aadClientCertPassword;
            return this;
        }
        @CustomType.Setter
        public Builder aadClientCertPath(String aadClientCertPath) {
            if (aadClientCertPath == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "aadClientCertPath");
            }
            this.aadClientCertPath = aadClientCertPath;
            return this;
        }
        @CustomType.Setter
        public Builder aadClientId(String aadClientId) {
            if (aadClientId == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "aadClientId");
            }
            this.aadClientId = aadClientId;
            return this;
        }
        @CustomType.Setter
        public Builder aadClientSecret(String aadClientSecret) {
            if (aadClientSecret == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "aadClientSecret");
            }
            this.aadClientSecret = aadClientSecret;
            return this;
        }
        @CustomType.Setter
        public Builder cloud(String cloud) {
            if (cloud == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "cloud");
            }
            this.cloud = cloud;
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderBackoff(Boolean cloudProviderBackoff) {
            if (cloudProviderBackoff == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "cloudProviderBackoff");
            }
            this.cloudProviderBackoff = cloudProviderBackoff;
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderBackoffDuration(Integer cloudProviderBackoffDuration) {
            if (cloudProviderBackoffDuration == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "cloudProviderBackoffDuration");
            }
            this.cloudProviderBackoffDuration = cloudProviderBackoffDuration;
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderBackoffExponent(Integer cloudProviderBackoffExponent) {
            if (cloudProviderBackoffExponent == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "cloudProviderBackoffExponent");
            }
            this.cloudProviderBackoffExponent = cloudProviderBackoffExponent;
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderBackoffJitter(Integer cloudProviderBackoffJitter) {
            if (cloudProviderBackoffJitter == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "cloudProviderBackoffJitter");
            }
            this.cloudProviderBackoffJitter = cloudProviderBackoffJitter;
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderBackoffRetries(Integer cloudProviderBackoffRetries) {
            if (cloudProviderBackoffRetries == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "cloudProviderBackoffRetries");
            }
            this.cloudProviderBackoffRetries = cloudProviderBackoffRetries;
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderRateLimit(Boolean cloudProviderRateLimit) {
            if (cloudProviderRateLimit == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "cloudProviderRateLimit");
            }
            this.cloudProviderRateLimit = cloudProviderRateLimit;
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderRateLimitBucket(Integer cloudProviderRateLimitBucket) {
            if (cloudProviderRateLimitBucket == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "cloudProviderRateLimitBucket");
            }
            this.cloudProviderRateLimitBucket = cloudProviderRateLimitBucket;
            return this;
        }
        @CustomType.Setter
        public Builder cloudProviderRateLimitQps(Integer cloudProviderRateLimitQps) {
            if (cloudProviderRateLimitQps == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "cloudProviderRateLimitQps");
            }
            this.cloudProviderRateLimitQps = cloudProviderRateLimitQps;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerSku(@Nullable String loadBalancerSku) {

            this.loadBalancerSku = loadBalancerSku;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder maximumLoadBalancerRuleCount(Integer maximumLoadBalancerRuleCount) {
            if (maximumLoadBalancerRuleCount == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "maximumLoadBalancerRuleCount");
            }
            this.maximumLoadBalancerRuleCount = maximumLoadBalancerRuleCount;
            return this;
        }
        @CustomType.Setter
        public Builder primaryAvailabilitySetName(String primaryAvailabilitySetName) {
            if (primaryAvailabilitySetName == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "primaryAvailabilitySetName");
            }
            this.primaryAvailabilitySetName = primaryAvailabilitySetName;
            return this;
        }
        @CustomType.Setter
        public Builder primaryScaleSetName(String primaryScaleSetName) {
            if (primaryScaleSetName == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "primaryScaleSetName");
            }
            this.primaryScaleSetName = primaryScaleSetName;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroup(String resourceGroup) {
            if (resourceGroup == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "resourceGroup");
            }
            this.resourceGroup = resourceGroup;
            return this;
        }
        @CustomType.Setter
        public Builder routeTableName(String routeTableName) {
            if (routeTableName == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "routeTableName");
            }
            this.routeTableName = routeTableName;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupName(String securityGroupName) {
            if (securityGroupName == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "securityGroupName");
            }
            this.securityGroupName = securityGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder subnetName(String subnetName) {
            if (subnetName == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "subnetName");
            }
            this.subnetName = subnetName;
            return this;
        }
        @CustomType.Setter
        public Builder subscriptionId(String subscriptionId) {
            if (subscriptionId == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "subscriptionId");
            }
            this.subscriptionId = subscriptionId;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(String tenantId) {
            if (tenantId == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "tenantId");
            }
            this.tenantId = tenantId;
            return this;
        }
        @CustomType.Setter
        public Builder useInstanceMetadata(Boolean useInstanceMetadata) {
            if (useInstanceMetadata == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "useInstanceMetadata");
            }
            this.useInstanceMetadata = useInstanceMetadata;
            return this;
        }
        @CustomType.Setter
        public Builder useManagedIdentityExtension(Boolean useManagedIdentityExtension) {
            if (useManagedIdentityExtension == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "useManagedIdentityExtension");
            }
            this.useManagedIdentityExtension = useManagedIdentityExtension;
            return this;
        }
        @CustomType.Setter
        public Builder vmType(String vmType) {
            if (vmType == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "vmType");
            }
            this.vmType = vmType;
            return this;
        }
        @CustomType.Setter
        public Builder vnetName(String vnetName) {
            if (vnetName == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "vnetName");
            }
            this.vnetName = vnetName;
            return this;
        }
        @CustomType.Setter
        public Builder vnetResourceGroup(String vnetResourceGroup) {
            if (vnetResourceGroup == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderAzureCloudProvider", "vnetResourceGroup");
            }
            this.vnetResourceGroup = vnetResourceGroup;
            return this;
        }
        public GetClusterRkeConfigCloudProviderAzureCloudProvider build() {
            final var _resultValue = new GetClusterRkeConfigCloudProviderAzureCloudProvider();
            _resultValue.aadClientCertPassword = aadClientCertPassword;
            _resultValue.aadClientCertPath = aadClientCertPath;
            _resultValue.aadClientId = aadClientId;
            _resultValue.aadClientSecret = aadClientSecret;
            _resultValue.cloud = cloud;
            _resultValue.cloudProviderBackoff = cloudProviderBackoff;
            _resultValue.cloudProviderBackoffDuration = cloudProviderBackoffDuration;
            _resultValue.cloudProviderBackoffExponent = cloudProviderBackoffExponent;
            _resultValue.cloudProviderBackoffJitter = cloudProviderBackoffJitter;
            _resultValue.cloudProviderBackoffRetries = cloudProviderBackoffRetries;
            _resultValue.cloudProviderRateLimit = cloudProviderRateLimit;
            _resultValue.cloudProviderRateLimitBucket = cloudProviderRateLimitBucket;
            _resultValue.cloudProviderRateLimitQps = cloudProviderRateLimitQps;
            _resultValue.loadBalancerSku = loadBalancerSku;
            _resultValue.location = location;
            _resultValue.maximumLoadBalancerRuleCount = maximumLoadBalancerRuleCount;
            _resultValue.primaryAvailabilitySetName = primaryAvailabilitySetName;
            _resultValue.primaryScaleSetName = primaryScaleSetName;
            _resultValue.resourceGroup = resourceGroup;
            _resultValue.routeTableName = routeTableName;
            _resultValue.securityGroupName = securityGroupName;
            _resultValue.subnetName = subnetName;
            _resultValue.subscriptionId = subscriptionId;
            _resultValue.tenantId = tenantId;
            _resultValue.useInstanceMetadata = useInstanceMetadata;
            _resultValue.useManagedIdentityExtension = useManagedIdentityExtension;
            _resultValue.vmType = vmType;
            _resultValue.vnetName = vnetName;
            _resultValue.vnetResourceGroup = vnetResourceGroup;
            return _resultValue;
        }
    }
}
