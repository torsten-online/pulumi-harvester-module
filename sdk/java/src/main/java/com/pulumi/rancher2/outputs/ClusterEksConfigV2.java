// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.outputs.ClusterEksConfigV2NodeGroup;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterEksConfigV2 {
    /**
     * @return The AWS Cloud Credential ID to use
     * 
     */
    private String cloudCredentialId;
    /**
     * @return Is EKS cluster imported?
     * 
     */
    private @Nullable Boolean imported;
    /**
     * @return The AWS kms key to use
     * 
     */
    private @Nullable String kmsKey;
    /**
     * @return The kubernetes master version
     * 
     */
    private @Nullable String kubernetesVersion;
    /**
     * @return The AWS logging types
     * 
     */
    private @Nullable List<String> loggingTypes;
    /**
     * @return The name of the Cluster (string)
     * 
     */
    private @Nullable String name;
    /**
     * @return The AWS node groups to use
     * 
     */
    private @Nullable List<ClusterEksConfigV2NodeGroup> nodeGroups;
    /**
     * @return The EKS cluster has private access
     * 
     */
    private @Nullable Boolean privateAccess;
    /**
     * @return The EKS cluster has public access
     * 
     */
    private @Nullable Boolean publicAccess;
    /**
     * @return The EKS cluster public access sources
     * 
     */
    private @Nullable List<String> publicAccessSources;
    /**
     * @return The AWS Region to create the EKS cluster in
     * 
     */
    private @Nullable String region;
    /**
     * @return Enable EKS cluster secret encryption
     * 
     */
    private @Nullable Boolean secretsEncryption;
    /**
     * @return List of security groups to use for the cluster
     * 
     */
    private @Nullable List<String> securityGroups;
    /**
     * @return The AWS service role to use
     * 
     */
    private @Nullable String serviceRole;
    /**
     * @return List of subnets in the virtual network to use
     * 
     */
    private @Nullable List<String> subnets;
    /**
     * @return The EKS cluster tags
     * 
     */
    private @Nullable Map<String,Object> tags;

    private ClusterEksConfigV2() {}
    /**
     * @return The AWS Cloud Credential ID to use
     * 
     */
    public String cloudCredentialId() {
        return this.cloudCredentialId;
    }
    /**
     * @return Is EKS cluster imported?
     * 
     */
    public Optional<Boolean> imported() {
        return Optional.ofNullable(this.imported);
    }
    /**
     * @return The AWS kms key to use
     * 
     */
    public Optional<String> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }
    /**
     * @return The kubernetes master version
     * 
     */
    public Optional<String> kubernetesVersion() {
        return Optional.ofNullable(this.kubernetesVersion);
    }
    /**
     * @return The AWS logging types
     * 
     */
    public List<String> loggingTypes() {
        return this.loggingTypes == null ? List.of() : this.loggingTypes;
    }
    /**
     * @return The name of the Cluster (string)
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The AWS node groups to use
     * 
     */
    public List<ClusterEksConfigV2NodeGroup> nodeGroups() {
        return this.nodeGroups == null ? List.of() : this.nodeGroups;
    }
    /**
     * @return The EKS cluster has private access
     * 
     */
    public Optional<Boolean> privateAccess() {
        return Optional.ofNullable(this.privateAccess);
    }
    /**
     * @return The EKS cluster has public access
     * 
     */
    public Optional<Boolean> publicAccess() {
        return Optional.ofNullable(this.publicAccess);
    }
    /**
     * @return The EKS cluster public access sources
     * 
     */
    public List<String> publicAccessSources() {
        return this.publicAccessSources == null ? List.of() : this.publicAccessSources;
    }
    /**
     * @return The AWS Region to create the EKS cluster in
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return Enable EKS cluster secret encryption
     * 
     */
    public Optional<Boolean> secretsEncryption() {
        return Optional.ofNullable(this.secretsEncryption);
    }
    /**
     * @return List of security groups to use for the cluster
     * 
     */
    public List<String> securityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }
    /**
     * @return The AWS service role to use
     * 
     */
    public Optional<String> serviceRole() {
        return Optional.ofNullable(this.serviceRole);
    }
    /**
     * @return List of subnets in the virtual network to use
     * 
     */
    public List<String> subnets() {
        return this.subnets == null ? List.of() : this.subnets;
    }
    /**
     * @return The EKS cluster tags
     * 
     */
    public Map<String,Object> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEksConfigV2 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cloudCredentialId;
        private @Nullable Boolean imported;
        private @Nullable String kmsKey;
        private @Nullable String kubernetesVersion;
        private @Nullable List<String> loggingTypes;
        private @Nullable String name;
        private @Nullable List<ClusterEksConfigV2NodeGroup> nodeGroups;
        private @Nullable Boolean privateAccess;
        private @Nullable Boolean publicAccess;
        private @Nullable List<String> publicAccessSources;
        private @Nullable String region;
        private @Nullable Boolean secretsEncryption;
        private @Nullable List<String> securityGroups;
        private @Nullable String serviceRole;
        private @Nullable List<String> subnets;
        private @Nullable Map<String,Object> tags;
        public Builder() {}
        public Builder(ClusterEksConfigV2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudCredentialId = defaults.cloudCredentialId;
    	      this.imported = defaults.imported;
    	      this.kmsKey = defaults.kmsKey;
    	      this.kubernetesVersion = defaults.kubernetesVersion;
    	      this.loggingTypes = defaults.loggingTypes;
    	      this.name = defaults.name;
    	      this.nodeGroups = defaults.nodeGroups;
    	      this.privateAccess = defaults.privateAccess;
    	      this.publicAccess = defaults.publicAccess;
    	      this.publicAccessSources = defaults.publicAccessSources;
    	      this.region = defaults.region;
    	      this.secretsEncryption = defaults.secretsEncryption;
    	      this.securityGroups = defaults.securityGroups;
    	      this.serviceRole = defaults.serviceRole;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder cloudCredentialId(String cloudCredentialId) {
            if (cloudCredentialId == null) {
              throw new MissingRequiredPropertyException("ClusterEksConfigV2", "cloudCredentialId");
            }
            this.cloudCredentialId = cloudCredentialId;
            return this;
        }
        @CustomType.Setter
        public Builder imported(@Nullable Boolean imported) {

            this.imported = imported;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKey(@Nullable String kmsKey) {

            this.kmsKey = kmsKey;
            return this;
        }
        @CustomType.Setter
        public Builder kubernetesVersion(@Nullable String kubernetesVersion) {

            this.kubernetesVersion = kubernetesVersion;
            return this;
        }
        @CustomType.Setter
        public Builder loggingTypes(@Nullable List<String> loggingTypes) {

            this.loggingTypes = loggingTypes;
            return this;
        }
        public Builder loggingTypes(String... loggingTypes) {
            return loggingTypes(List.of(loggingTypes));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nodeGroups(@Nullable List<ClusterEksConfigV2NodeGroup> nodeGroups) {

            this.nodeGroups = nodeGroups;
            return this;
        }
        public Builder nodeGroups(ClusterEksConfigV2NodeGroup... nodeGroups) {
            return nodeGroups(List.of(nodeGroups));
        }
        @CustomType.Setter
        public Builder privateAccess(@Nullable Boolean privateAccess) {

            this.privateAccess = privateAccess;
            return this;
        }
        @CustomType.Setter
        public Builder publicAccess(@Nullable Boolean publicAccess) {

            this.publicAccess = publicAccess;
            return this;
        }
        @CustomType.Setter
        public Builder publicAccessSources(@Nullable List<String> publicAccessSources) {

            this.publicAccessSources = publicAccessSources;
            return this;
        }
        public Builder publicAccessSources(String... publicAccessSources) {
            return publicAccessSources(List.of(publicAccessSources));
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder secretsEncryption(@Nullable Boolean secretsEncryption) {

            this.secretsEncryption = secretsEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroups(@Nullable List<String> securityGroups) {

            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        @CustomType.Setter
        public Builder serviceRole(@Nullable String serviceRole) {

            this.serviceRole = serviceRole;
            return this;
        }
        @CustomType.Setter
        public Builder subnets(@Nullable List<String> subnets) {

            this.subnets = subnets;
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,Object> tags) {

            this.tags = tags;
            return this;
        }
        public ClusterEksConfigV2 build() {
            final var _resultValue = new ClusterEksConfigV2();
            _resultValue.cloudCredentialId = cloudCredentialId;
            _resultValue.imported = imported;
            _resultValue.kmsKey = kmsKey;
            _resultValue.kubernetesVersion = kubernetesVersion;
            _resultValue.loggingTypes = loggingTypes;
            _resultValue.name = name;
            _resultValue.nodeGroups = nodeGroups;
            _resultValue.privateAccess = privateAccess;
            _resultValue.publicAccess = publicAccess;
            _resultValue.publicAccessSources = publicAccessSources;
            _resultValue.region = region;
            _resultValue.secretsEncryption = secretsEncryption;
            _resultValue.securityGroups = securityGroups;
            _resultValue.serviceRole = serviceRole;
            _resultValue.subnets = subnets;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
