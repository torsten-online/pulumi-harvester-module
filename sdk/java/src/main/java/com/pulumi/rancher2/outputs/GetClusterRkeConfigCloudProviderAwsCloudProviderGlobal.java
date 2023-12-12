// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterRkeConfigCloudProviderAwsCloudProviderGlobal {
    private @Nullable Boolean disableSecurityGroupIngress;
    private @Nullable Boolean disableStrictZoneCheck;
    private String elbSecurityGroup;
    private String kubernetesClusterId;
    private String kubernetesClusterTag;
    private String roleArn;
    private String routeTableId;
    private String subnetId;
    private String vpc;
    private String zone;

    private GetClusterRkeConfigCloudProviderAwsCloudProviderGlobal() {}
    public Optional<Boolean> disableSecurityGroupIngress() {
        return Optional.ofNullable(this.disableSecurityGroupIngress);
    }
    public Optional<Boolean> disableStrictZoneCheck() {
        return Optional.ofNullable(this.disableStrictZoneCheck);
    }
    public String elbSecurityGroup() {
        return this.elbSecurityGroup;
    }
    public String kubernetesClusterId() {
        return this.kubernetesClusterId;
    }
    public String kubernetesClusterTag() {
        return this.kubernetesClusterTag;
    }
    public String roleArn() {
        return this.roleArn;
    }
    public String routeTableId() {
        return this.routeTableId;
    }
    public String subnetId() {
        return this.subnetId;
    }
    public String vpc() {
        return this.vpc;
    }
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigCloudProviderAwsCloudProviderGlobal defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disableSecurityGroupIngress;
        private @Nullable Boolean disableStrictZoneCheck;
        private String elbSecurityGroup;
        private String kubernetesClusterId;
        private String kubernetesClusterTag;
        private String roleArn;
        private String routeTableId;
        private String subnetId;
        private String vpc;
        private String zone;
        public Builder() {}
        public Builder(GetClusterRkeConfigCloudProviderAwsCloudProviderGlobal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableSecurityGroupIngress = defaults.disableSecurityGroupIngress;
    	      this.disableStrictZoneCheck = defaults.disableStrictZoneCheck;
    	      this.elbSecurityGroup = defaults.elbSecurityGroup;
    	      this.kubernetesClusterId = defaults.kubernetesClusterId;
    	      this.kubernetesClusterTag = defaults.kubernetesClusterTag;
    	      this.roleArn = defaults.roleArn;
    	      this.routeTableId = defaults.routeTableId;
    	      this.subnetId = defaults.subnetId;
    	      this.vpc = defaults.vpc;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder disableSecurityGroupIngress(@Nullable Boolean disableSecurityGroupIngress) {
            this.disableSecurityGroupIngress = disableSecurityGroupIngress;
            return this;
        }
        @CustomType.Setter
        public Builder disableStrictZoneCheck(@Nullable Boolean disableStrictZoneCheck) {
            this.disableStrictZoneCheck = disableStrictZoneCheck;
            return this;
        }
        @CustomType.Setter
        public Builder elbSecurityGroup(String elbSecurityGroup) {
            this.elbSecurityGroup = Objects.requireNonNull(elbSecurityGroup);
            return this;
        }
        @CustomType.Setter
        public Builder kubernetesClusterId(String kubernetesClusterId) {
            this.kubernetesClusterId = Objects.requireNonNull(kubernetesClusterId);
            return this;
        }
        @CustomType.Setter
        public Builder kubernetesClusterTag(String kubernetesClusterTag) {
            this.kubernetesClusterTag = Objects.requireNonNull(kubernetesClusterTag);
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        @CustomType.Setter
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = Objects.requireNonNull(routeTableId);
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        @CustomType.Setter
        public Builder vpc(String vpc) {
            this.vpc = Objects.requireNonNull(vpc);
            return this;
        }
        @CustomType.Setter
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public GetClusterRkeConfigCloudProviderAwsCloudProviderGlobal build() {
            final var _resultValue = new GetClusterRkeConfigCloudProviderAwsCloudProviderGlobal();
            _resultValue.disableSecurityGroupIngress = disableSecurityGroupIngress;
            _resultValue.disableStrictZoneCheck = disableStrictZoneCheck;
            _resultValue.elbSecurityGroup = elbSecurityGroup;
            _resultValue.kubernetesClusterId = kubernetesClusterId;
            _resultValue.kubernetesClusterTag = kubernetesClusterTag;
            _resultValue.roleArn = roleArn;
            _resultValue.routeTableId = routeTableId;
            _resultValue.subnetId = subnetId;
            _resultValue.vpc = vpc;
            _resultValue.zone = zone;
            return _resultValue;
        }
    }
}
