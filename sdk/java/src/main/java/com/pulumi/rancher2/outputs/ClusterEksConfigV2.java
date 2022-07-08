// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
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
     * @return The EKS cloud_credential id (string)
     * 
     */
    private final String cloudCredentialId;
    /**
     * @return Is GKE cluster imported? Default: `false` (bool)
     * 
     */
    private final @Nullable Boolean imported;
    /**
     * @return The AWS kms key to use (string)
     * 
     */
    private final @Nullable String kmsKey;
    /**
     * @return The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
     * 
     */
    private final @Nullable String kubernetesVersion;
    /**
     * @return The AWS cloudwatch logging types. `audit`, `api`, `scheduler`, `controllerManager` and `authenticator` values are allowed (list)
     * 
     */
    private final @Nullable List<String> loggingTypes;
    /**
     * @return Name of cluster registration token (string)
     * 
     */
    private final @Nullable String name;
    /**
     * @return The EKS cluster name to import. Required to create a new cluster (list)
     * 
     */
    private final @Nullable List<ClusterEksConfigV2NodeGroup> nodeGroups;
    /**
     * @return The EKS cluster has private access (bool)
     * 
     */
    private final @Nullable Boolean privateAccess;
    /**
     * @return The EKS cluster has public access (bool)
     * 
     */
    private final @Nullable Boolean publicAccess;
    /**
     * @return The EKS cluster public access sources (map)
     * 
     */
    private final @Nullable List<String> publicAccessSources;
    /**
     * @return The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
     * 
     */
    private final @Nullable String region;
    /**
     * @return Enable EKS cluster secret encryption (bool)
     * 
     */
    private final @Nullable Boolean secretsEncryption;
    /**
     * @return List of security groups to use for the cluster (list)
     * 
     */
    private final @Nullable List<String> securityGroups;
    /**
     * @return The AWS service role to use (string)
     * 
     */
    private final @Nullable String serviceRole;
    /**
     * @return The EKS node group subnets (list string)
     * 
     */
    private final @Nullable List<String> subnets;
    /**
     * @return The GKE node config tags (List)
     * 
     */
    private final @Nullable Map<String,Object> tags;

    @CustomType.Constructor
    private ClusterEksConfigV2(
        @CustomType.Parameter("cloudCredentialId") String cloudCredentialId,
        @CustomType.Parameter("imported") @Nullable Boolean imported,
        @CustomType.Parameter("kmsKey") @Nullable String kmsKey,
        @CustomType.Parameter("kubernetesVersion") @Nullable String kubernetesVersion,
        @CustomType.Parameter("loggingTypes") @Nullable List<String> loggingTypes,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("nodeGroups") @Nullable List<ClusterEksConfigV2NodeGroup> nodeGroups,
        @CustomType.Parameter("privateAccess") @Nullable Boolean privateAccess,
        @CustomType.Parameter("publicAccess") @Nullable Boolean publicAccess,
        @CustomType.Parameter("publicAccessSources") @Nullable List<String> publicAccessSources,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("secretsEncryption") @Nullable Boolean secretsEncryption,
        @CustomType.Parameter("securityGroups") @Nullable List<String> securityGroups,
        @CustomType.Parameter("serviceRole") @Nullable String serviceRole,
        @CustomType.Parameter("subnets") @Nullable List<String> subnets,
        @CustomType.Parameter("tags") @Nullable Map<String,Object> tags) {
        this.cloudCredentialId = cloudCredentialId;
        this.imported = imported;
        this.kmsKey = kmsKey;
        this.kubernetesVersion = kubernetesVersion;
        this.loggingTypes = loggingTypes;
        this.name = name;
        this.nodeGroups = nodeGroups;
        this.privateAccess = privateAccess;
        this.publicAccess = publicAccess;
        this.publicAccessSources = publicAccessSources;
        this.region = region;
        this.secretsEncryption = secretsEncryption;
        this.securityGroups = securityGroups;
        this.serviceRole = serviceRole;
        this.subnets = subnets;
        this.tags = tags;
    }

    /**
     * @return The EKS cloud_credential id (string)
     * 
     */
    public String cloudCredentialId() {
        return this.cloudCredentialId;
    }
    /**
     * @return Is GKE cluster imported? Default: `false` (bool)
     * 
     */
    public Optional<Boolean> imported() {
        return Optional.ofNullable(this.imported);
    }
    /**
     * @return The AWS kms key to use (string)
     * 
     */
    public Optional<String> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }
    /**
     * @return The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
     * 
     */
    public Optional<String> kubernetesVersion() {
        return Optional.ofNullable(this.kubernetesVersion);
    }
    /**
     * @return The AWS cloudwatch logging types. `audit`, `api`, `scheduler`, `controllerManager` and `authenticator` values are allowed (list)
     * 
     */
    public List<String> loggingTypes() {
        return this.loggingTypes == null ? List.of() : this.loggingTypes;
    }
    /**
     * @return Name of cluster registration token (string)
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The EKS cluster name to import. Required to create a new cluster (list)
     * 
     */
    public List<ClusterEksConfigV2NodeGroup> nodeGroups() {
        return this.nodeGroups == null ? List.of() : this.nodeGroups;
    }
    /**
     * @return The EKS cluster has private access (bool)
     * 
     */
    public Optional<Boolean> privateAccess() {
        return Optional.ofNullable(this.privateAccess);
    }
    /**
     * @return The EKS cluster has public access (bool)
     * 
     */
    public Optional<Boolean> publicAccess() {
        return Optional.ofNullable(this.publicAccess);
    }
    /**
     * @return The EKS cluster public access sources (map)
     * 
     */
    public List<String> publicAccessSources() {
        return this.publicAccessSources == null ? List.of() : this.publicAccessSources;
    }
    /**
     * @return The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return Enable EKS cluster secret encryption (bool)
     * 
     */
    public Optional<Boolean> secretsEncryption() {
        return Optional.ofNullable(this.secretsEncryption);
    }
    /**
     * @return List of security groups to use for the cluster (list)
     * 
     */
    public List<String> securityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }
    /**
     * @return The AWS service role to use (string)
     * 
     */
    public Optional<String> serviceRole() {
        return Optional.ofNullable(this.serviceRole);
    }
    /**
     * @return The EKS node group subnets (list string)
     * 
     */
    public List<String> subnets() {
        return this.subnets == null ? List.of() : this.subnets;
    }
    /**
     * @return The GKE node config tags (List)
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

        public Builder() {
    	      // Empty
        }

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

        public Builder cloudCredentialId(String cloudCredentialId) {
            this.cloudCredentialId = Objects.requireNonNull(cloudCredentialId);
            return this;
        }
        public Builder imported(@Nullable Boolean imported) {
            this.imported = imported;
            return this;
        }
        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }
        public Builder kubernetesVersion(@Nullable String kubernetesVersion) {
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }
        public Builder loggingTypes(@Nullable List<String> loggingTypes) {
            this.loggingTypes = loggingTypes;
            return this;
        }
        public Builder loggingTypes(String... loggingTypes) {
            return loggingTypes(List.of(loggingTypes));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder nodeGroups(@Nullable List<ClusterEksConfigV2NodeGroup> nodeGroups) {
            this.nodeGroups = nodeGroups;
            return this;
        }
        public Builder nodeGroups(ClusterEksConfigV2NodeGroup... nodeGroups) {
            return nodeGroups(List.of(nodeGroups));
        }
        public Builder privateAccess(@Nullable Boolean privateAccess) {
            this.privateAccess = privateAccess;
            return this;
        }
        public Builder publicAccess(@Nullable Boolean publicAccess) {
            this.publicAccess = publicAccess;
            return this;
        }
        public Builder publicAccessSources(@Nullable List<String> publicAccessSources) {
            this.publicAccessSources = publicAccessSources;
            return this;
        }
        public Builder publicAccessSources(String... publicAccessSources) {
            return publicAccessSources(List.of(publicAccessSources));
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder secretsEncryption(@Nullable Boolean secretsEncryption) {
            this.secretsEncryption = secretsEncryption;
            return this;
        }
        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder serviceRole(@Nullable String serviceRole) {
            this.serviceRole = serviceRole;
            return this;
        }
        public Builder subnets(@Nullable List<String> subnets) {
            this.subnets = subnets;
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }
        public Builder tags(@Nullable Map<String,Object> tags) {
            this.tags = tags;
            return this;
        }        public ClusterEksConfigV2 build() {
            return new ClusterEksConfigV2(cloudCredentialId, imported, kmsKey, kubernetesVersion, loggingTypes, name, nodeGroups, privateAccess, publicAccess, publicAccessSources, region, secretsEncryption, securityGroups, serviceRole, subnets, tags);
        }
    }
}
