// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.inputs.ClusterEksConfigV2NodeGroupLaunchTemplateArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterEksConfigV2NodeGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterEksConfigV2NodeGroupArgs Empty = new ClusterEksConfigV2NodeGroupArgs();

    /**
     * The EKS node group desired size
     * 
     */
    @Import(name="desiredSize")
    private @Nullable Output<Integer> desiredSize;

    /**
     * @return The EKS node group desired size
     * 
     */
    public Optional<Output<Integer>> desiredSize() {
        return Optional.ofNullable(this.desiredSize);
    }

    /**
     * The EKS node group disk size
     * 
     */
    @Import(name="diskSize")
    private @Nullable Output<Integer> diskSize;

    /**
     * @return The EKS node group disk size
     * 
     */
    public Optional<Output<Integer>> diskSize() {
        return Optional.ofNullable(this.diskSize);
    }

    /**
     * The EKS node group ssh key
     * 
     */
    @Import(name="ec2SshKey")
    private @Nullable Output<String> ec2SshKey;

    /**
     * @return The EKS node group ssh key
     * 
     */
    public Optional<Output<String>> ec2SshKey() {
        return Optional.ofNullable(this.ec2SshKey);
    }

    /**
     * Is EKS cluster using gpu?
     * 
     */
    @Import(name="gpu")
    private @Nullable Output<Boolean> gpu;

    /**
     * @return Is EKS cluster using gpu?
     * 
     */
    public Optional<Output<Boolean>> gpu() {
        return Optional.ofNullable(this.gpu);
    }

    /**
     * The EKS node group image ID
     * 
     */
    @Import(name="imageId")
    private @Nullable Output<String> imageId;

    /**
     * @return The EKS node group image ID
     * 
     */
    public Optional<Output<String>> imageId() {
        return Optional.ofNullable(this.imageId);
    }

    /**
     * The EKS node group instance type
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return The EKS node group instance type
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * Labels for the Cluster (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels for the Cluster (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The EKS node groups launch template
     * 
     */
    @Import(name="launchTemplates")
    private @Nullable Output<List<ClusterEksConfigV2NodeGroupLaunchTemplateArgs>> launchTemplates;

    /**
     * @return The EKS node groups launch template
     * 
     */
    public Optional<Output<List<ClusterEksConfigV2NodeGroupLaunchTemplateArgs>>> launchTemplates() {
        return Optional.ofNullable(this.launchTemplates);
    }

    /**
     * The EKS node group maximum size
     * 
     */
    @Import(name="maxSize")
    private @Nullable Output<Integer> maxSize;

    /**
     * @return The EKS node group maximum size
     * 
     */
    public Optional<Output<Integer>> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }

    /**
     * The EKS node group minimum size
     * 
     */
    @Import(name="minSize")
    private @Nullable Output<Integer> minSize;

    /**
     * @return The EKS node group minimum size
     * 
     */
    public Optional<Output<Integer>> minSize() {
        return Optional.ofNullable(this.minSize);
    }

    /**
     * The name of the Cluster (string)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Cluster (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The EKS node group node role ARN
     * 
     */
    @Import(name="nodeRole")
    private @Nullable Output<String> nodeRole;

    /**
     * @return The EKS node group node role ARN
     * 
     */
    public Optional<Output<String>> nodeRole() {
        return Optional.ofNullable(this.nodeRole);
    }

    /**
     * Enable EKS node group request spot instances
     * 
     */
    @Import(name="requestSpotInstances")
    private @Nullable Output<Boolean> requestSpotInstances;

    /**
     * @return Enable EKS node group request spot instances
     * 
     */
    public Optional<Output<Boolean>> requestSpotInstances() {
        return Optional.ofNullable(this.requestSpotInstances);
    }

    /**
     * The EKS node group resource tags
     * 
     */
    @Import(name="resourceTags")
    private @Nullable Output<Map<String,Object>> resourceTags;

    /**
     * @return The EKS node group resource tags
     * 
     */
    public Optional<Output<Map<String,Object>>> resourceTags() {
        return Optional.ofNullable(this.resourceTags);
    }

    /**
     * The EKS node group spot instance types
     * 
     */
    @Import(name="spotInstanceTypes")
    private @Nullable Output<List<String>> spotInstanceTypes;

    /**
     * @return The EKS node group spot instance types
     * 
     */
    public Optional<Output<List<String>>> spotInstanceTypes() {
        return Optional.ofNullable(this.spotInstanceTypes);
    }

    /**
     * The EKS node group subnets
     * 
     */
    @Import(name="subnets")
    private @Nullable Output<List<String>> subnets;

    /**
     * @return The EKS node group subnets
     * 
     */
    public Optional<Output<List<String>>> subnets() {
        return Optional.ofNullable(this.subnets);
    }

    /**
     * The EKS node group tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return The EKS node group tags
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The EKS node group user data
     * 
     */
    @Import(name="userData")
    private @Nullable Output<String> userData;

    /**
     * @return The EKS node group user data
     * 
     */
    public Optional<Output<String>> userData() {
        return Optional.ofNullable(this.userData);
    }

    /**
     * The EKS node group k8s version
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The EKS node group k8s version
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private ClusterEksConfigV2NodeGroupArgs() {}

    private ClusterEksConfigV2NodeGroupArgs(ClusterEksConfigV2NodeGroupArgs $) {
        this.desiredSize = $.desiredSize;
        this.diskSize = $.diskSize;
        this.ec2SshKey = $.ec2SshKey;
        this.gpu = $.gpu;
        this.imageId = $.imageId;
        this.instanceType = $.instanceType;
        this.labels = $.labels;
        this.launchTemplates = $.launchTemplates;
        this.maxSize = $.maxSize;
        this.minSize = $.minSize;
        this.name = $.name;
        this.nodeRole = $.nodeRole;
        this.requestSpotInstances = $.requestSpotInstances;
        this.resourceTags = $.resourceTags;
        this.spotInstanceTypes = $.spotInstanceTypes;
        this.subnets = $.subnets;
        this.tags = $.tags;
        this.userData = $.userData;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterEksConfigV2NodeGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterEksConfigV2NodeGroupArgs $;

        public Builder() {
            $ = new ClusterEksConfigV2NodeGroupArgs();
        }

        public Builder(ClusterEksConfigV2NodeGroupArgs defaults) {
            $ = new ClusterEksConfigV2NodeGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param desiredSize The EKS node group desired size
         * 
         * @return builder
         * 
         */
        public Builder desiredSize(@Nullable Output<Integer> desiredSize) {
            $.desiredSize = desiredSize;
            return this;
        }

        /**
         * @param desiredSize The EKS node group desired size
         * 
         * @return builder
         * 
         */
        public Builder desiredSize(Integer desiredSize) {
            return desiredSize(Output.of(desiredSize));
        }

        /**
         * @param diskSize The EKS node group disk size
         * 
         * @return builder
         * 
         */
        public Builder diskSize(@Nullable Output<Integer> diskSize) {
            $.diskSize = diskSize;
            return this;
        }

        /**
         * @param diskSize The EKS node group disk size
         * 
         * @return builder
         * 
         */
        public Builder diskSize(Integer diskSize) {
            return diskSize(Output.of(diskSize));
        }

        /**
         * @param ec2SshKey The EKS node group ssh key
         * 
         * @return builder
         * 
         */
        public Builder ec2SshKey(@Nullable Output<String> ec2SshKey) {
            $.ec2SshKey = ec2SshKey;
            return this;
        }

        /**
         * @param ec2SshKey The EKS node group ssh key
         * 
         * @return builder
         * 
         */
        public Builder ec2SshKey(String ec2SshKey) {
            return ec2SshKey(Output.of(ec2SshKey));
        }

        /**
         * @param gpu Is EKS cluster using gpu?
         * 
         * @return builder
         * 
         */
        public Builder gpu(@Nullable Output<Boolean> gpu) {
            $.gpu = gpu;
            return this;
        }

        /**
         * @param gpu Is EKS cluster using gpu?
         * 
         * @return builder
         * 
         */
        public Builder gpu(Boolean gpu) {
            return gpu(Output.of(gpu));
        }

        /**
         * @param imageId The EKS node group image ID
         * 
         * @return builder
         * 
         */
        public Builder imageId(@Nullable Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param imageId The EKS node group image ID
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        /**
         * @param instanceType The EKS node group instance type
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType The EKS node group instance type
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param labels Labels for the Cluster (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for the Cluster (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param launchTemplates The EKS node groups launch template
         * 
         * @return builder
         * 
         */
        public Builder launchTemplates(@Nullable Output<List<ClusterEksConfigV2NodeGroupLaunchTemplateArgs>> launchTemplates) {
            $.launchTemplates = launchTemplates;
            return this;
        }

        /**
         * @param launchTemplates The EKS node groups launch template
         * 
         * @return builder
         * 
         */
        public Builder launchTemplates(List<ClusterEksConfigV2NodeGroupLaunchTemplateArgs> launchTemplates) {
            return launchTemplates(Output.of(launchTemplates));
        }

        /**
         * @param launchTemplates The EKS node groups launch template
         * 
         * @return builder
         * 
         */
        public Builder launchTemplates(ClusterEksConfigV2NodeGroupLaunchTemplateArgs... launchTemplates) {
            return launchTemplates(List.of(launchTemplates));
        }

        /**
         * @param maxSize The EKS node group maximum size
         * 
         * @return builder
         * 
         */
        public Builder maxSize(@Nullable Output<Integer> maxSize) {
            $.maxSize = maxSize;
            return this;
        }

        /**
         * @param maxSize The EKS node group maximum size
         * 
         * @return builder
         * 
         */
        public Builder maxSize(Integer maxSize) {
            return maxSize(Output.of(maxSize));
        }

        /**
         * @param minSize The EKS node group minimum size
         * 
         * @return builder
         * 
         */
        public Builder minSize(@Nullable Output<Integer> minSize) {
            $.minSize = minSize;
            return this;
        }

        /**
         * @param minSize The EKS node group minimum size
         * 
         * @return builder
         * 
         */
        public Builder minSize(Integer minSize) {
            return minSize(Output.of(minSize));
        }

        /**
         * @param name The name of the Cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeRole The EKS node group node role ARN
         * 
         * @return builder
         * 
         */
        public Builder nodeRole(@Nullable Output<String> nodeRole) {
            $.nodeRole = nodeRole;
            return this;
        }

        /**
         * @param nodeRole The EKS node group node role ARN
         * 
         * @return builder
         * 
         */
        public Builder nodeRole(String nodeRole) {
            return nodeRole(Output.of(nodeRole));
        }

        /**
         * @param requestSpotInstances Enable EKS node group request spot instances
         * 
         * @return builder
         * 
         */
        public Builder requestSpotInstances(@Nullable Output<Boolean> requestSpotInstances) {
            $.requestSpotInstances = requestSpotInstances;
            return this;
        }

        /**
         * @param requestSpotInstances Enable EKS node group request spot instances
         * 
         * @return builder
         * 
         */
        public Builder requestSpotInstances(Boolean requestSpotInstances) {
            return requestSpotInstances(Output.of(requestSpotInstances));
        }

        /**
         * @param resourceTags The EKS node group resource tags
         * 
         * @return builder
         * 
         */
        public Builder resourceTags(@Nullable Output<Map<String,Object>> resourceTags) {
            $.resourceTags = resourceTags;
            return this;
        }

        /**
         * @param resourceTags The EKS node group resource tags
         * 
         * @return builder
         * 
         */
        public Builder resourceTags(Map<String,Object> resourceTags) {
            return resourceTags(Output.of(resourceTags));
        }

        /**
         * @param spotInstanceTypes The EKS node group spot instance types
         * 
         * @return builder
         * 
         */
        public Builder spotInstanceTypes(@Nullable Output<List<String>> spotInstanceTypes) {
            $.spotInstanceTypes = spotInstanceTypes;
            return this;
        }

        /**
         * @param spotInstanceTypes The EKS node group spot instance types
         * 
         * @return builder
         * 
         */
        public Builder spotInstanceTypes(List<String> spotInstanceTypes) {
            return spotInstanceTypes(Output.of(spotInstanceTypes));
        }

        /**
         * @param spotInstanceTypes The EKS node group spot instance types
         * 
         * @return builder
         * 
         */
        public Builder spotInstanceTypes(String... spotInstanceTypes) {
            return spotInstanceTypes(List.of(spotInstanceTypes));
        }

        /**
         * @param subnets The EKS node group subnets
         * 
         * @return builder
         * 
         */
        public Builder subnets(@Nullable Output<List<String>> subnets) {
            $.subnets = subnets;
            return this;
        }

        /**
         * @param subnets The EKS node group subnets
         * 
         * @return builder
         * 
         */
        public Builder subnets(List<String> subnets) {
            return subnets(Output.of(subnets));
        }

        /**
         * @param subnets The EKS node group subnets
         * 
         * @return builder
         * 
         */
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }

        /**
         * @param tags The EKS node group tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The EKS node group tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param userData The EKS node group user data
         * 
         * @return builder
         * 
         */
        public Builder userData(@Nullable Output<String> userData) {
            $.userData = userData;
            return this;
        }

        /**
         * @param userData The EKS node group user data
         * 
         * @return builder
         * 
         */
        public Builder userData(String userData) {
            return userData(Output.of(userData));
        }

        /**
         * @param version The EKS node group k8s version
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The EKS node group k8s version
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ClusterEksConfigV2NodeGroupArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ClusterEksConfigV2NodeGroupArgs", "name");
            }
            return $;
        }
    }

}
