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
public final class ClusterOkeConfig {
    /**
     * @return The OCID of the compartment in which to create resources OKE cluster and related resources (string)
     * 
     */
    private String compartmentId;
    /**
     * @return Optional custom boot volume size (GB) for all nodes. If you specify 0, it will apply the default according to the `node_image` specified. Default `0` (int)
     * 
     */
    private @Nullable Integer customBootVolumeSize;
    /**
     * @return An optional description of this cluster (string)
     * 
     */
    private @Nullable String description;
    /**
     * @return Specifies whether to enable the Kubernetes dashboard. Default `false` (bool)
     * 
     */
    private @Nullable Boolean enableKubernetesDashboard;
    /**
     * @return Specifies whether Kubernetes API endpoint is a private IP only accessible from within the VCN. Default `false` Just for Rancher v2.5.10 or above (bool)
     * 
     */
    private @Nullable Boolean enablePrivateControlPlane;
    /**
     * @return Specifies whether worker nodes will be deployed into a new, private, subnet. Default `false` (bool)
     * 
     */
    private @Nullable Boolean enablePrivateNodes;
    /**
     * @return The fingerprint corresponding to the specified user&#39;s private API Key (string)
     * 
     */
    private String fingerprint;
    /**
     * @return Specifies number of OCPUs for nodes (requires flexible shape specified with `node_shape`) (int)
     * 
     */
    private @Nullable Integer flexOcpus;
    /**
     * @return The OCID of a KMS vault master key used to encrypt secrets at rest. See [here](https://docs.oracle.com/en-us/iaas/Content/ContEng/Tasks/contengencryptingdata.htm) for help creating a vault and master encryption key. Just for Rancher v2.5.9 or above (string)
     * 
     */
    private @Nullable String kmsKeyId;
    /**
     * @return The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
     * 
     */
    private String kubernetesVersion;
    /**
     * @return The maximum number of worker nodes. Can limit `quantity_per_subnet`. Default `0` (no limit) (int)
     * 
     */
    private @Nullable Integer limitNodeCount;
    /**
     * @return The name of the first existing subnet to use for Kubernetes services / LB. `vcn_name` is also required when specifying an existing subnet. (string)
     * 
     */
    private @Nullable String loadBalancerSubnetName1;
    /**
     * @return The name of a second existing subnet to use for Kubernetes services / LB. A second subnet is only required when it is AD-specific (non-regional) (string)
     * 
     */
    private @Nullable String loadBalancerSubnetName2;
    /**
     * @return The Oracle Linux OS image name to use for the OKE node(s). See [here](https://docs.cloud.oracle.com/en-us/iaas/images/) for a list of images. (string)
     * 
     */
    private String nodeImage;
    /**
     * @return Name for DNS domain of node pool subnet. Default `nodedns` (string)
     * 
     */
    private @Nullable String nodePoolDnsDomainName;
    /**
     * @return Name for node pool subnet. Default `nodedns` (string)
     * 
     */
    private @Nullable String nodePoolSubnetName;
    /**
     * @return The contents of the SSH public key file to use for the nodes (string)
     * 
     */
    private @Nullable String nodePublicKeyContents;
    /**
     * @return The shape of the node (determines number of CPUs and  amount of memory on each OKE node) (string)
     * 
     */
    private String nodeShape;
    /**
     * @return A CIDR IP range from which to assign Kubernetes Pod IPs (string)
     * 
     */
    private @Nullable String podCidr;
    /**
     * @return The private API key file contents for the specified user, in PEM format (string)
     * 
     */
    private String privateKeyContents;
    /**
     * @return The passphrase (if any) of the private key for the OKE cluster (string)
     * 
     */
    private @Nullable String privateKeyPassphrase;
    /**
     * @return Number of node subnets. Default `1` (int)
     * 
     */
    private @Nullable Integer quantityOfNodeSubnets;
    /**
     * @return Number of OKE worker nodes in each subnet / availability domain. Default `1` (int)
     * 
     */
    private @Nullable Integer quantityPerSubnet;
    /**
     * @return The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
     * 
     */
    private String region;
    /**
     * @return A CIDR IP range from which to assign Kubernetes Service IPs (string)
     * 
     */
    private @Nullable String serviceCidr;
    /**
     * @return Name for DNS domain of service subnet. Default `svcdns` (string)
     * 
     */
    private @Nullable String serviceDnsDomainName;
    /**
     * @return Specifies whether to skip deleting the virtual cloud network (VCN) on destroy. Default `false` (bool)
     * 
     */
    private @Nullable Boolean skipVcnDelete;
    /**
     * @return The OCID of the tenancy in which to create resources (string)
     * 
     */
    private String tenancyId;
    /**
     * @return The OCID of a user who has access to the tenancy/compartment (string)
     * 
     */
    private String userOcid;
    /**
     * @return The OCID of the compartment (if different from `compartment_id`) in which to find the pre-existing virtual network set with `vcn_name`. (string)
     * 
     */
    private @Nullable String vcnCompartmentId;
    /**
     * @return The name of an existing virtual network to use for the cluster creation. If set, you must also set `load_balancer_subnet_name_1`. A VCN and subnets will be created if none are specified. (string)
     * 
     */
    private @Nullable String vcnName;
    /**
     * @return Additional CIDR from which to allow ingress to worker nodes (string)
     * 
     */
    private @Nullable String workerNodeIngressCidr;

    private ClusterOkeConfig() {}
    /**
     * @return The OCID of the compartment in which to create resources OKE cluster and related resources (string)
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Optional custom boot volume size (GB) for all nodes. If you specify 0, it will apply the default according to the `node_image` specified. Default `0` (int)
     * 
     */
    public Optional<Integer> customBootVolumeSize() {
        return Optional.ofNullable(this.customBootVolumeSize);
    }
    /**
     * @return An optional description of this cluster (string)
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Specifies whether to enable the Kubernetes dashboard. Default `false` (bool)
     * 
     */
    public Optional<Boolean> enableKubernetesDashboard() {
        return Optional.ofNullable(this.enableKubernetesDashboard);
    }
    /**
     * @return Specifies whether Kubernetes API endpoint is a private IP only accessible from within the VCN. Default `false` Just for Rancher v2.5.10 or above (bool)
     * 
     */
    public Optional<Boolean> enablePrivateControlPlane() {
        return Optional.ofNullable(this.enablePrivateControlPlane);
    }
    /**
     * @return Specifies whether worker nodes will be deployed into a new, private, subnet. Default `false` (bool)
     * 
     */
    public Optional<Boolean> enablePrivateNodes() {
        return Optional.ofNullable(this.enablePrivateNodes);
    }
    /**
     * @return The fingerprint corresponding to the specified user&#39;s private API Key (string)
     * 
     */
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * @return Specifies number of OCPUs for nodes (requires flexible shape specified with `node_shape`) (int)
     * 
     */
    public Optional<Integer> flexOcpus() {
        return Optional.ofNullable(this.flexOcpus);
    }
    /**
     * @return The OCID of a KMS vault master key used to encrypt secrets at rest. See [here](https://docs.oracle.com/en-us/iaas/Content/ContEng/Tasks/contengencryptingdata.htm) for help creating a vault and master encryption key. Just for Rancher v2.5.9 or above (string)
     * 
     */
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * @return The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
     * 
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }
    /**
     * @return The maximum number of worker nodes. Can limit `quantity_per_subnet`. Default `0` (no limit) (int)
     * 
     */
    public Optional<Integer> limitNodeCount() {
        return Optional.ofNullable(this.limitNodeCount);
    }
    /**
     * @return The name of the first existing subnet to use for Kubernetes services / LB. `vcn_name` is also required when specifying an existing subnet. (string)
     * 
     */
    public Optional<String> loadBalancerSubnetName1() {
        return Optional.ofNullable(this.loadBalancerSubnetName1);
    }
    /**
     * @return The name of a second existing subnet to use for Kubernetes services / LB. A second subnet is only required when it is AD-specific (non-regional) (string)
     * 
     */
    public Optional<String> loadBalancerSubnetName2() {
        return Optional.ofNullable(this.loadBalancerSubnetName2);
    }
    /**
     * @return The Oracle Linux OS image name to use for the OKE node(s). See [here](https://docs.cloud.oracle.com/en-us/iaas/images/) for a list of images. (string)
     * 
     */
    public String nodeImage() {
        return this.nodeImage;
    }
    /**
     * @return Name for DNS domain of node pool subnet. Default `nodedns` (string)
     * 
     */
    public Optional<String> nodePoolDnsDomainName() {
        return Optional.ofNullable(this.nodePoolDnsDomainName);
    }
    /**
     * @return Name for node pool subnet. Default `nodedns` (string)
     * 
     */
    public Optional<String> nodePoolSubnetName() {
        return Optional.ofNullable(this.nodePoolSubnetName);
    }
    /**
     * @return The contents of the SSH public key file to use for the nodes (string)
     * 
     */
    public Optional<String> nodePublicKeyContents() {
        return Optional.ofNullable(this.nodePublicKeyContents);
    }
    /**
     * @return The shape of the node (determines number of CPUs and  amount of memory on each OKE node) (string)
     * 
     */
    public String nodeShape() {
        return this.nodeShape;
    }
    /**
     * @return A CIDR IP range from which to assign Kubernetes Pod IPs (string)
     * 
     */
    public Optional<String> podCidr() {
        return Optional.ofNullable(this.podCidr);
    }
    /**
     * @return The private API key file contents for the specified user, in PEM format (string)
     * 
     */
    public String privateKeyContents() {
        return this.privateKeyContents;
    }
    /**
     * @return The passphrase (if any) of the private key for the OKE cluster (string)
     * 
     */
    public Optional<String> privateKeyPassphrase() {
        return Optional.ofNullable(this.privateKeyPassphrase);
    }
    /**
     * @return Number of node subnets. Default `1` (int)
     * 
     */
    public Optional<Integer> quantityOfNodeSubnets() {
        return Optional.ofNullable(this.quantityOfNodeSubnets);
    }
    /**
     * @return Number of OKE worker nodes in each subnet / availability domain. Default `1` (int)
     * 
     */
    public Optional<Integer> quantityPerSubnet() {
        return Optional.ofNullable(this.quantityPerSubnet);
    }
    /**
     * @return The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return A CIDR IP range from which to assign Kubernetes Service IPs (string)
     * 
     */
    public Optional<String> serviceCidr() {
        return Optional.ofNullable(this.serviceCidr);
    }
    /**
     * @return Name for DNS domain of service subnet. Default `svcdns` (string)
     * 
     */
    public Optional<String> serviceDnsDomainName() {
        return Optional.ofNullable(this.serviceDnsDomainName);
    }
    /**
     * @return Specifies whether to skip deleting the virtual cloud network (VCN) on destroy. Default `false` (bool)
     * 
     */
    public Optional<Boolean> skipVcnDelete() {
        return Optional.ofNullable(this.skipVcnDelete);
    }
    /**
     * @return The OCID of the tenancy in which to create resources (string)
     * 
     */
    public String tenancyId() {
        return this.tenancyId;
    }
    /**
     * @return The OCID of a user who has access to the tenancy/compartment (string)
     * 
     */
    public String userOcid() {
        return this.userOcid;
    }
    /**
     * @return The OCID of the compartment (if different from `compartment_id`) in which to find the pre-existing virtual network set with `vcn_name`. (string)
     * 
     */
    public Optional<String> vcnCompartmentId() {
        return Optional.ofNullable(this.vcnCompartmentId);
    }
    /**
     * @return The name of an existing virtual network to use for the cluster creation. If set, you must also set `load_balancer_subnet_name_1`. A VCN and subnets will be created if none are specified. (string)
     * 
     */
    public Optional<String> vcnName() {
        return Optional.ofNullable(this.vcnName);
    }
    /**
     * @return Additional CIDR from which to allow ingress to worker nodes (string)
     * 
     */
    public Optional<String> workerNodeIngressCidr() {
        return Optional.ofNullable(this.workerNodeIngressCidr);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterOkeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String compartmentId;
        private @Nullable Integer customBootVolumeSize;
        private @Nullable String description;
        private @Nullable Boolean enableKubernetesDashboard;
        private @Nullable Boolean enablePrivateControlPlane;
        private @Nullable Boolean enablePrivateNodes;
        private String fingerprint;
        private @Nullable Integer flexOcpus;
        private @Nullable String kmsKeyId;
        private String kubernetesVersion;
        private @Nullable Integer limitNodeCount;
        private @Nullable String loadBalancerSubnetName1;
        private @Nullable String loadBalancerSubnetName2;
        private String nodeImage;
        private @Nullable String nodePoolDnsDomainName;
        private @Nullable String nodePoolSubnetName;
        private @Nullable String nodePublicKeyContents;
        private String nodeShape;
        private @Nullable String podCidr;
        private String privateKeyContents;
        private @Nullable String privateKeyPassphrase;
        private @Nullable Integer quantityOfNodeSubnets;
        private @Nullable Integer quantityPerSubnet;
        private String region;
        private @Nullable String serviceCidr;
        private @Nullable String serviceDnsDomainName;
        private @Nullable Boolean skipVcnDelete;
        private String tenancyId;
        private String userOcid;
        private @Nullable String vcnCompartmentId;
        private @Nullable String vcnName;
        private @Nullable String workerNodeIngressCidr;
        public Builder() {}
        public Builder(ClusterOkeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.customBootVolumeSize = defaults.customBootVolumeSize;
    	      this.description = defaults.description;
    	      this.enableKubernetesDashboard = defaults.enableKubernetesDashboard;
    	      this.enablePrivateControlPlane = defaults.enablePrivateControlPlane;
    	      this.enablePrivateNodes = defaults.enablePrivateNodes;
    	      this.fingerprint = defaults.fingerprint;
    	      this.flexOcpus = defaults.flexOcpus;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.kubernetesVersion = defaults.kubernetesVersion;
    	      this.limitNodeCount = defaults.limitNodeCount;
    	      this.loadBalancerSubnetName1 = defaults.loadBalancerSubnetName1;
    	      this.loadBalancerSubnetName2 = defaults.loadBalancerSubnetName2;
    	      this.nodeImage = defaults.nodeImage;
    	      this.nodePoolDnsDomainName = defaults.nodePoolDnsDomainName;
    	      this.nodePoolSubnetName = defaults.nodePoolSubnetName;
    	      this.nodePublicKeyContents = defaults.nodePublicKeyContents;
    	      this.nodeShape = defaults.nodeShape;
    	      this.podCidr = defaults.podCidr;
    	      this.privateKeyContents = defaults.privateKeyContents;
    	      this.privateKeyPassphrase = defaults.privateKeyPassphrase;
    	      this.quantityOfNodeSubnets = defaults.quantityOfNodeSubnets;
    	      this.quantityPerSubnet = defaults.quantityPerSubnet;
    	      this.region = defaults.region;
    	      this.serviceCidr = defaults.serviceCidr;
    	      this.serviceDnsDomainName = defaults.serviceDnsDomainName;
    	      this.skipVcnDelete = defaults.skipVcnDelete;
    	      this.tenancyId = defaults.tenancyId;
    	      this.userOcid = defaults.userOcid;
    	      this.vcnCompartmentId = defaults.vcnCompartmentId;
    	      this.vcnName = defaults.vcnName;
    	      this.workerNodeIngressCidr = defaults.workerNodeIngressCidr;
        }

        @CustomType.Setter
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        @CustomType.Setter
        public Builder customBootVolumeSize(@Nullable Integer customBootVolumeSize) {
            this.customBootVolumeSize = customBootVolumeSize;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder enableKubernetesDashboard(@Nullable Boolean enableKubernetesDashboard) {
            this.enableKubernetesDashboard = enableKubernetesDashboard;
            return this;
        }
        @CustomType.Setter
        public Builder enablePrivateControlPlane(@Nullable Boolean enablePrivateControlPlane) {
            this.enablePrivateControlPlane = enablePrivateControlPlane;
            return this;
        }
        @CustomType.Setter
        public Builder enablePrivateNodes(@Nullable Boolean enablePrivateNodes) {
            this.enablePrivateNodes = enablePrivateNodes;
            return this;
        }
        @CustomType.Setter
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        @CustomType.Setter
        public Builder flexOcpus(@Nullable Integer flexOcpus) {
            this.flexOcpus = flexOcpus;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = Objects.requireNonNull(kubernetesVersion);
            return this;
        }
        @CustomType.Setter
        public Builder limitNodeCount(@Nullable Integer limitNodeCount) {
            this.limitNodeCount = limitNodeCount;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerSubnetName1(@Nullable String loadBalancerSubnetName1) {
            this.loadBalancerSubnetName1 = loadBalancerSubnetName1;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerSubnetName2(@Nullable String loadBalancerSubnetName2) {
            this.loadBalancerSubnetName2 = loadBalancerSubnetName2;
            return this;
        }
        @CustomType.Setter
        public Builder nodeImage(String nodeImage) {
            this.nodeImage = Objects.requireNonNull(nodeImage);
            return this;
        }
        @CustomType.Setter
        public Builder nodePoolDnsDomainName(@Nullable String nodePoolDnsDomainName) {
            this.nodePoolDnsDomainName = nodePoolDnsDomainName;
            return this;
        }
        @CustomType.Setter
        public Builder nodePoolSubnetName(@Nullable String nodePoolSubnetName) {
            this.nodePoolSubnetName = nodePoolSubnetName;
            return this;
        }
        @CustomType.Setter
        public Builder nodePublicKeyContents(@Nullable String nodePublicKeyContents) {
            this.nodePublicKeyContents = nodePublicKeyContents;
            return this;
        }
        @CustomType.Setter
        public Builder nodeShape(String nodeShape) {
            this.nodeShape = Objects.requireNonNull(nodeShape);
            return this;
        }
        @CustomType.Setter
        public Builder podCidr(@Nullable String podCidr) {
            this.podCidr = podCidr;
            return this;
        }
        @CustomType.Setter
        public Builder privateKeyContents(String privateKeyContents) {
            this.privateKeyContents = Objects.requireNonNull(privateKeyContents);
            return this;
        }
        @CustomType.Setter
        public Builder privateKeyPassphrase(@Nullable String privateKeyPassphrase) {
            this.privateKeyPassphrase = privateKeyPassphrase;
            return this;
        }
        @CustomType.Setter
        public Builder quantityOfNodeSubnets(@Nullable Integer quantityOfNodeSubnets) {
            this.quantityOfNodeSubnets = quantityOfNodeSubnets;
            return this;
        }
        @CustomType.Setter
        public Builder quantityPerSubnet(@Nullable Integer quantityPerSubnet) {
            this.quantityPerSubnet = quantityPerSubnet;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder serviceCidr(@Nullable String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }
        @CustomType.Setter
        public Builder serviceDnsDomainName(@Nullable String serviceDnsDomainName) {
            this.serviceDnsDomainName = serviceDnsDomainName;
            return this;
        }
        @CustomType.Setter
        public Builder skipVcnDelete(@Nullable Boolean skipVcnDelete) {
            this.skipVcnDelete = skipVcnDelete;
            return this;
        }
        @CustomType.Setter
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = Objects.requireNonNull(tenancyId);
            return this;
        }
        @CustomType.Setter
        public Builder userOcid(String userOcid) {
            this.userOcid = Objects.requireNonNull(userOcid);
            return this;
        }
        @CustomType.Setter
        public Builder vcnCompartmentId(@Nullable String vcnCompartmentId) {
            this.vcnCompartmentId = vcnCompartmentId;
            return this;
        }
        @CustomType.Setter
        public Builder vcnName(@Nullable String vcnName) {
            this.vcnName = vcnName;
            return this;
        }
        @CustomType.Setter
        public Builder workerNodeIngressCidr(@Nullable String workerNodeIngressCidr) {
            this.workerNodeIngressCidr = workerNodeIngressCidr;
            return this;
        }
        public ClusterOkeConfig build() {
            final var o = new ClusterOkeConfig();
            o.compartmentId = compartmentId;
            o.customBootVolumeSize = customBootVolumeSize;
            o.description = description;
            o.enableKubernetesDashboard = enableKubernetesDashboard;
            o.enablePrivateControlPlane = enablePrivateControlPlane;
            o.enablePrivateNodes = enablePrivateNodes;
            o.fingerprint = fingerprint;
            o.flexOcpus = flexOcpus;
            o.kmsKeyId = kmsKeyId;
            o.kubernetesVersion = kubernetesVersion;
            o.limitNodeCount = limitNodeCount;
            o.loadBalancerSubnetName1 = loadBalancerSubnetName1;
            o.loadBalancerSubnetName2 = loadBalancerSubnetName2;
            o.nodeImage = nodeImage;
            o.nodePoolDnsDomainName = nodePoolDnsDomainName;
            o.nodePoolSubnetName = nodePoolSubnetName;
            o.nodePublicKeyContents = nodePublicKeyContents;
            o.nodeShape = nodeShape;
            o.podCidr = podCidr;
            o.privateKeyContents = privateKeyContents;
            o.privateKeyPassphrase = privateKeyPassphrase;
            o.quantityOfNodeSubnets = quantityOfNodeSubnets;
            o.quantityPerSubnet = quantityPerSubnet;
            o.region = region;
            o.serviceCidr = serviceCidr;
            o.serviceDnsDomainName = serviceDnsDomainName;
            o.skipVcnDelete = skipVcnDelete;
            o.tenancyId = tenancyId;
            o.userOcid = userOcid;
            o.vcnCompartmentId = vcnCompartmentId;
            o.vcnName = vcnName;
            o.workerNodeIngressCidr = workerNodeIngressCidr;
            return o;
        }
    }
}
