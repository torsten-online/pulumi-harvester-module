// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterEksConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterEksConfigArgs Empty = new ClusterEksConfigArgs();

    /**
     * The AWS Client ID to use (string)
     * 
     */
    @Import(name="accessKey", required=true)
    private Output<String> accessKey;

    /**
     * @return The AWS Client ID to use (string)
     * 
     */
    public Output<String> accessKey() {
        return this.accessKey;
    }

    /**
     * AMI ID to use for the worker nodes instead of the default (string)
     * 
     */
    @Import(name="ami")
    private @Nullable Output<String> ami;

    /**
     * @return AMI ID to use for the worker nodes instead of the default (string)
     * 
     */
    public Optional<Output<String>> ami() {
        return Optional.ofNullable(this.ami);
    }

    /**
     * Associate public ip EKS worker nodes. Default `true` (bool)
     * 
     */
    @Import(name="associateWorkerNodePublicIp")
    private @Nullable Output<Boolean> associateWorkerNodePublicIp;

    /**
     * @return Associate public ip EKS worker nodes. Default `true` (bool)
     * 
     */
    public Optional<Output<Boolean>> associateWorkerNodePublicIp() {
        return Optional.ofNullable(this.associateWorkerNodePublicIp);
    }

    /**
     * The desired number of worker nodes. For Rancher v2.3.x and above. Default `3` (int)
     * 
     */
    @Import(name="desiredNodes")
    private @Nullable Output<Integer> desiredNodes;

    /**
     * @return The desired number of worker nodes. For Rancher v2.3.x and above. Default `3` (int)
     * 
     */
    public Optional<Output<Integer>> desiredNodes() {
        return Optional.ofNullable(this.desiredNodes);
    }

    @Import(name="ebsEncryption")
    private @Nullable Output<Boolean> ebsEncryption;

    public Optional<Output<Boolean>> ebsEncryption() {
        return Optional.ofNullable(this.ebsEncryption);
    }

    /**
     * The EKS node group instance type. Default: `t3.medium` (string)
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return The EKS node group instance type. Default: `t3.medium` (string)
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * Allow user to specify key name to use. For Rancher v2.2.7 and above (string)
     * 
     */
    @Import(name="keyPairName")
    private @Nullable Output<String> keyPairName;

    /**
     * @return Allow user to specify key name to use. For Rancher v2.2.7 and above (string)
     * 
     */
    public Optional<Output<String>> keyPairName() {
        return Optional.ofNullable(this.keyPairName);
    }

    /**
     * The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
     * 
     */
    @Import(name="kubernetesVersion", required=true)
    private Output<String> kubernetesVersion;

    /**
     * @return The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
     * 
     */
    public Output<String> kubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * The maximum number of worker nodes. Default `3` (int)
     * 
     */
    @Import(name="maximumNodes")
    private @Nullable Output<Integer> maximumNodes;

    /**
     * @return The maximum number of worker nodes. Default `3` (int)
     * 
     */
    public Optional<Output<Integer>> maximumNodes() {
        return Optional.ofNullable(this.maximumNodes);
    }

    /**
     * The minimum number of worker nodes. Default `1` (int)
     * 
     */
    @Import(name="minimumNodes")
    private @Nullable Output<Integer> minimumNodes;

    /**
     * @return The minimum number of worker nodes. Default `1` (int)
     * 
     */
    public Optional<Output<Integer>> minimumNodes() {
        return Optional.ofNullable(this.minimumNodes);
    }

    /**
     * The volume size for each node. Default `20` (int)
     * 
     */
    @Import(name="nodeVolumeSize")
    private @Nullable Output<Integer> nodeVolumeSize;

    /**
     * @return The volume size for each node. Default `20` (int)
     * 
     */
    public Optional<Output<Integer>> nodeVolumeSize() {
        return Optional.ofNullable(this.nodeVolumeSize);
    }

    /**
     * The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The AWS Client Secret associated with the Client ID (string)
     * 
     */
    @Import(name="secretKey", required=true)
    private Output<String> secretKey;

    /**
     * @return The AWS Client Secret associated with the Client ID (string)
     * 
     */
    public Output<String> secretKey() {
        return this.secretKey;
    }

    /**
     * List of security groups to use for the cluster (list)
     * 
     */
    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    /**
     * @return List of security groups to use for the cluster (list)
     * 
     */
    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    /**
     * The AWS service role to use (string)
     * 
     */
    @Import(name="serviceRole")
    private @Nullable Output<String> serviceRole;

    /**
     * @return The AWS service role to use (string)
     * 
     */
    public Optional<Output<String>> serviceRole() {
        return Optional.ofNullable(this.serviceRole);
    }

    /**
     * A session token to use with the client key and secret if applicable (string)
     * 
     */
    @Import(name="sessionToken")
    private @Nullable Output<String> sessionToken;

    /**
     * @return A session token to use with the client key and secret if applicable (string)
     * 
     */
    public Optional<Output<String>> sessionToken() {
        return Optional.ofNullable(this.sessionToken);
    }

    /**
     * The EKS node group subnets (list string)
     * 
     */
    @Import(name="subnets")
    private @Nullable Output<List<String>> subnets;

    /**
     * @return The EKS node group subnets (list string)
     * 
     */
    public Optional<Output<List<String>>> subnets() {
        return Optional.ofNullable(this.subnets);
    }

    /**
     * The EKS node group user data (string)
     * 
     */
    @Import(name="userData")
    private @Nullable Output<String> userData;

    /**
     * @return The EKS node group user data (string)
     * 
     */
    public Optional<Output<String>> userData() {
        return Optional.ofNullable(this.userData);
    }

    /**
     * The name of the virtual network to use. If it&#39;s not specified Rancher will create a new VPC (string)
     * 
     */
    @Import(name="virtualNetwork")
    private @Nullable Output<String> virtualNetwork;

    /**
     * @return The name of the virtual network to use. If it&#39;s not specified Rancher will create a new VPC (string)
     * 
     */
    public Optional<Output<String>> virtualNetwork() {
        return Optional.ofNullable(this.virtualNetwork);
    }

    private ClusterEksConfigArgs() {}

    private ClusterEksConfigArgs(ClusterEksConfigArgs $) {
        this.accessKey = $.accessKey;
        this.ami = $.ami;
        this.associateWorkerNodePublicIp = $.associateWorkerNodePublicIp;
        this.desiredNodes = $.desiredNodes;
        this.ebsEncryption = $.ebsEncryption;
        this.instanceType = $.instanceType;
        this.keyPairName = $.keyPairName;
        this.kubernetesVersion = $.kubernetesVersion;
        this.maximumNodes = $.maximumNodes;
        this.minimumNodes = $.minimumNodes;
        this.nodeVolumeSize = $.nodeVolumeSize;
        this.region = $.region;
        this.secretKey = $.secretKey;
        this.securityGroups = $.securityGroups;
        this.serviceRole = $.serviceRole;
        this.sessionToken = $.sessionToken;
        this.subnets = $.subnets;
        this.userData = $.userData;
        this.virtualNetwork = $.virtualNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterEksConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterEksConfigArgs $;

        public Builder() {
            $ = new ClusterEksConfigArgs();
        }

        public Builder(ClusterEksConfigArgs defaults) {
            $ = new ClusterEksConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey The AWS Client ID to use (string)
         * 
         * @return builder
         * 
         */
        public Builder accessKey(Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey The AWS Client ID to use (string)
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param ami AMI ID to use for the worker nodes instead of the default (string)
         * 
         * @return builder
         * 
         */
        public Builder ami(@Nullable Output<String> ami) {
            $.ami = ami;
            return this;
        }

        /**
         * @param ami AMI ID to use for the worker nodes instead of the default (string)
         * 
         * @return builder
         * 
         */
        public Builder ami(String ami) {
            return ami(Output.of(ami));
        }

        /**
         * @param associateWorkerNodePublicIp Associate public ip EKS worker nodes. Default `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder associateWorkerNodePublicIp(@Nullable Output<Boolean> associateWorkerNodePublicIp) {
            $.associateWorkerNodePublicIp = associateWorkerNodePublicIp;
            return this;
        }

        /**
         * @param associateWorkerNodePublicIp Associate public ip EKS worker nodes. Default `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder associateWorkerNodePublicIp(Boolean associateWorkerNodePublicIp) {
            return associateWorkerNodePublicIp(Output.of(associateWorkerNodePublicIp));
        }

        /**
         * @param desiredNodes The desired number of worker nodes. For Rancher v2.3.x and above. Default `3` (int)
         * 
         * @return builder
         * 
         */
        public Builder desiredNodes(@Nullable Output<Integer> desiredNodes) {
            $.desiredNodes = desiredNodes;
            return this;
        }

        /**
         * @param desiredNodes The desired number of worker nodes. For Rancher v2.3.x and above. Default `3` (int)
         * 
         * @return builder
         * 
         */
        public Builder desiredNodes(Integer desiredNodes) {
            return desiredNodes(Output.of(desiredNodes));
        }

        public Builder ebsEncryption(@Nullable Output<Boolean> ebsEncryption) {
            $.ebsEncryption = ebsEncryption;
            return this;
        }

        public Builder ebsEncryption(Boolean ebsEncryption) {
            return ebsEncryption(Output.of(ebsEncryption));
        }

        /**
         * @param instanceType The EKS node group instance type. Default: `t3.medium` (string)
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType The EKS node group instance type. Default: `t3.medium` (string)
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param keyPairName Allow user to specify key name to use. For Rancher v2.2.7 and above (string)
         * 
         * @return builder
         * 
         */
        public Builder keyPairName(@Nullable Output<String> keyPairName) {
            $.keyPairName = keyPairName;
            return this;
        }

        /**
         * @param keyPairName Allow user to specify key name to use. For Rancher v2.2.7 and above (string)
         * 
         * @return builder
         * 
         */
        public Builder keyPairName(String keyPairName) {
            return keyPairName(Output.of(keyPairName));
        }

        /**
         * @param kubernetesVersion The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
         * 
         * @return builder
         * 
         */
        public Builder kubernetesVersion(Output<String> kubernetesVersion) {
            $.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * @param kubernetesVersion The Kubernetes version that will be used for your master *and* OKE worker nodes (string)
         * 
         * @return builder
         * 
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            return kubernetesVersion(Output.of(kubernetesVersion));
        }

        /**
         * @param maximumNodes The maximum number of worker nodes. Default `3` (int)
         * 
         * @return builder
         * 
         */
        public Builder maximumNodes(@Nullable Output<Integer> maximumNodes) {
            $.maximumNodes = maximumNodes;
            return this;
        }

        /**
         * @param maximumNodes The maximum number of worker nodes. Default `3` (int)
         * 
         * @return builder
         * 
         */
        public Builder maximumNodes(Integer maximumNodes) {
            return maximumNodes(Output.of(maximumNodes));
        }

        /**
         * @param minimumNodes The minimum number of worker nodes. Default `1` (int)
         * 
         * @return builder
         * 
         */
        public Builder minimumNodes(@Nullable Output<Integer> minimumNodes) {
            $.minimumNodes = minimumNodes;
            return this;
        }

        /**
         * @param minimumNodes The minimum number of worker nodes. Default `1` (int)
         * 
         * @return builder
         * 
         */
        public Builder minimumNodes(Integer minimumNodes) {
            return minimumNodes(Output.of(minimumNodes));
        }

        /**
         * @param nodeVolumeSize The volume size for each node. Default `20` (int)
         * 
         * @return builder
         * 
         */
        public Builder nodeVolumeSize(@Nullable Output<Integer> nodeVolumeSize) {
            $.nodeVolumeSize = nodeVolumeSize;
            return this;
        }

        /**
         * @param nodeVolumeSize The volume size for each node. Default `20` (int)
         * 
         * @return builder
         * 
         */
        public Builder nodeVolumeSize(Integer nodeVolumeSize) {
            return nodeVolumeSize(Output.of(nodeVolumeSize));
        }

        /**
         * @param region The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The availability domain within the region to host the cluster. See [here](https://docs.cloud.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm) for a list of region names. (string)
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param secretKey The AWS Client Secret associated with the Client ID (string)
         * 
         * @return builder
         * 
         */
        public Builder secretKey(Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey The AWS Client Secret associated with the Client ID (string)
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        /**
         * @param securityGroups List of security groups to use for the cluster (list)
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        /**
         * @param securityGroups List of security groups to use for the cluster (list)
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        /**
         * @param securityGroups List of security groups to use for the cluster (list)
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        /**
         * @param serviceRole The AWS service role to use (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceRole(@Nullable Output<String> serviceRole) {
            $.serviceRole = serviceRole;
            return this;
        }

        /**
         * @param serviceRole The AWS service role to use (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceRole(String serviceRole) {
            return serviceRole(Output.of(serviceRole));
        }

        /**
         * @param sessionToken A session token to use with the client key and secret if applicable (string)
         * 
         * @return builder
         * 
         */
        public Builder sessionToken(@Nullable Output<String> sessionToken) {
            $.sessionToken = sessionToken;
            return this;
        }

        /**
         * @param sessionToken A session token to use with the client key and secret if applicable (string)
         * 
         * @return builder
         * 
         */
        public Builder sessionToken(String sessionToken) {
            return sessionToken(Output.of(sessionToken));
        }

        /**
         * @param subnets The EKS node group subnets (list string)
         * 
         * @return builder
         * 
         */
        public Builder subnets(@Nullable Output<List<String>> subnets) {
            $.subnets = subnets;
            return this;
        }

        /**
         * @param subnets The EKS node group subnets (list string)
         * 
         * @return builder
         * 
         */
        public Builder subnets(List<String> subnets) {
            return subnets(Output.of(subnets));
        }

        /**
         * @param subnets The EKS node group subnets (list string)
         * 
         * @return builder
         * 
         */
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }

        /**
         * @param userData The EKS node group user data (string)
         * 
         * @return builder
         * 
         */
        public Builder userData(@Nullable Output<String> userData) {
            $.userData = userData;
            return this;
        }

        /**
         * @param userData The EKS node group user data (string)
         * 
         * @return builder
         * 
         */
        public Builder userData(String userData) {
            return userData(Output.of(userData));
        }

        /**
         * @param virtualNetwork The name of the virtual network to use. If it&#39;s not specified Rancher will create a new VPC (string)
         * 
         * @return builder
         * 
         */
        public Builder virtualNetwork(@Nullable Output<String> virtualNetwork) {
            $.virtualNetwork = virtualNetwork;
            return this;
        }

        /**
         * @param virtualNetwork The name of the virtual network to use. If it&#39;s not specified Rancher will create a new VPC (string)
         * 
         * @return builder
         * 
         */
        public Builder virtualNetwork(String virtualNetwork) {
            return virtualNetwork(Output.of(virtualNetwork));
        }

        public ClusterEksConfigArgs build() {
            if ($.accessKey == null) {
                throw new MissingRequiredPropertyException("ClusterEksConfigArgs", "accessKey");
            }
            if ($.kubernetesVersion == null) {
                throw new MissingRequiredPropertyException("ClusterEksConfigArgs", "kubernetesVersion");
            }
            if ($.secretKey == null) {
                throw new MissingRequiredPropertyException("ClusterEksConfigArgs", "secretKey");
            }
            return $;
        }
    }

}
