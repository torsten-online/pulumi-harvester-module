// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodeTemplateOutscaleConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeTemplateOutscaleConfigArgs Empty = new NodeTemplateOutscaleConfigArgs();

    /**
     * AWS access key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    @Import(name="accessKey", required=true)
    private Output<String> accessKey;

    /**
     * @return AWS access key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    public Output<String> accessKey() {
        return this.accessKey;
    }

    /**
     * Extra tags for all created resources (e.g. key1=value1,key2=value2) (list)
     * 
     */
    @Import(name="extraTagsAlls")
    private @Nullable Output<List<String>> extraTagsAlls;

    /**
     * @return Extra tags for all created resources (e.g. key1=value1,key2=value2) (list)
     * 
     */
    public Optional<Output<List<String>>> extraTagsAlls() {
        return Optional.ofNullable(this.extraTagsAlls);
    }

    /**
     * Extra tags only for instances (e.g. key1=value1,key2=value2) (list)
     * 
     */
    @Import(name="extraTagsInstances")
    private @Nullable Output<List<String>> extraTagsInstances;

    /**
     * @return Extra tags only for instances (e.g. key1=value1,key2=value2) (list)
     * 
     */
    public Optional<Output<List<String>>> extraTagsInstances() {
        return Optional.ofNullable(this.extraTagsInstances);
    }

    /**
     * AWS instance type. Default `t2.micro` (string)
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return AWS instance type. Default `t2.micro` (string)
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * AWS region. (string)
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return AWS region. (string)
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Iops for io1 Root Disk. From 1 to 13000.
     * 
     */
    @Import(name="rootDiskIops")
    private @Nullable Output<Integer> rootDiskIops;

    /**
     * @return Iops for io1 Root Disk. From 1 to 13000.
     * 
     */
    public Optional<Output<Integer>> rootDiskIops() {
        return Optional.ofNullable(this.rootDiskIops);
    }

    /**
     * Size of the Root Disk (in GB). From 1 to 14901.
     * 
     */
    @Import(name="rootDiskSize")
    private @Nullable Output<Integer> rootDiskSize;

    /**
     * @return Size of the Root Disk (in GB). From 1 to 14901.
     * 
     */
    public Optional<Output<Integer>> rootDiskSize() {
        return Optional.ofNullable(this.rootDiskSize);
    }

    /**
     * Type of the Root Disk. Possible values are :&#39;standard&#39;, &#39;gp2&#39; or &#39;io1&#39;.
     * 
     */
    @Import(name="rootDiskType")
    private @Nullable Output<String> rootDiskType;

    /**
     * @return Type of the Root Disk. Possible values are :&#39;standard&#39;, &#39;gp2&#39; or &#39;io1&#39;.
     * 
     */
    public Optional<Output<String>> rootDiskType() {
        return Optional.ofNullable(this.rootDiskType);
    }

    /**
     * AWS secret key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    @Import(name="secretKey", required=true)
    private Output<String> secretKey;

    /**
     * @return AWS secret key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    public Output<String> secretKey() {
        return this.secretKey;
    }

    /**
     * Ids of user defined Security Groups to add to the machine. (list)
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    /**
     * @return Ids of user defined Security Groups to add to the machine. (list)
     * 
     */
    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * Outscale Machine Image to use as bootstrap for the VM. Default `ami-2cf1fa3e` (string)
     * 
     */
    @Import(name="sourceOmi")
    private @Nullable Output<String> sourceOmi;

    /**
     * @return Outscale Machine Image to use as bootstrap for the VM. Default `ami-2cf1fa3e` (string)
     * 
     */
    public Optional<Output<String>> sourceOmi() {
        return Optional.ofNullable(this.sourceOmi);
    }

    private NodeTemplateOutscaleConfigArgs() {}

    private NodeTemplateOutscaleConfigArgs(NodeTemplateOutscaleConfigArgs $) {
        this.accessKey = $.accessKey;
        this.extraTagsAlls = $.extraTagsAlls;
        this.extraTagsInstances = $.extraTagsInstances;
        this.instanceType = $.instanceType;
        this.region = $.region;
        this.rootDiskIops = $.rootDiskIops;
        this.rootDiskSize = $.rootDiskSize;
        this.rootDiskType = $.rootDiskType;
        this.secretKey = $.secretKey;
        this.securityGroupIds = $.securityGroupIds;
        this.sourceOmi = $.sourceOmi;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeTemplateOutscaleConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeTemplateOutscaleConfigArgs $;

        public Builder() {
            $ = new NodeTemplateOutscaleConfigArgs();
        }

        public Builder(NodeTemplateOutscaleConfigArgs defaults) {
            $ = new NodeTemplateOutscaleConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey AWS access key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
         * 
         * @return builder
         * 
         */
        public Builder accessKey(Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey AWS access key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param extraTagsAlls Extra tags for all created resources (e.g. key1=value1,key2=value2) (list)
         * 
         * @return builder
         * 
         */
        public Builder extraTagsAlls(@Nullable Output<List<String>> extraTagsAlls) {
            $.extraTagsAlls = extraTagsAlls;
            return this;
        }

        /**
         * @param extraTagsAlls Extra tags for all created resources (e.g. key1=value1,key2=value2) (list)
         * 
         * @return builder
         * 
         */
        public Builder extraTagsAlls(List<String> extraTagsAlls) {
            return extraTagsAlls(Output.of(extraTagsAlls));
        }

        /**
         * @param extraTagsAlls Extra tags for all created resources (e.g. key1=value1,key2=value2) (list)
         * 
         * @return builder
         * 
         */
        public Builder extraTagsAlls(String... extraTagsAlls) {
            return extraTagsAlls(List.of(extraTagsAlls));
        }

        /**
         * @param extraTagsInstances Extra tags only for instances (e.g. key1=value1,key2=value2) (list)
         * 
         * @return builder
         * 
         */
        public Builder extraTagsInstances(@Nullable Output<List<String>> extraTagsInstances) {
            $.extraTagsInstances = extraTagsInstances;
            return this;
        }

        /**
         * @param extraTagsInstances Extra tags only for instances (e.g. key1=value1,key2=value2) (list)
         * 
         * @return builder
         * 
         */
        public Builder extraTagsInstances(List<String> extraTagsInstances) {
            return extraTagsInstances(Output.of(extraTagsInstances));
        }

        /**
         * @param extraTagsInstances Extra tags only for instances (e.g. key1=value1,key2=value2) (list)
         * 
         * @return builder
         * 
         */
        public Builder extraTagsInstances(String... extraTagsInstances) {
            return extraTagsInstances(List.of(extraTagsInstances));
        }

        /**
         * @param instanceType AWS instance type. Default `t2.micro` (string)
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType AWS instance type. Default `t2.micro` (string)
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param region AWS region. (string)
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region AWS region. (string)
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param rootDiskIops Iops for io1 Root Disk. From 1 to 13000.
         * 
         * @return builder
         * 
         */
        public Builder rootDiskIops(@Nullable Output<Integer> rootDiskIops) {
            $.rootDiskIops = rootDiskIops;
            return this;
        }

        /**
         * @param rootDiskIops Iops for io1 Root Disk. From 1 to 13000.
         * 
         * @return builder
         * 
         */
        public Builder rootDiskIops(Integer rootDiskIops) {
            return rootDiskIops(Output.of(rootDiskIops));
        }

        /**
         * @param rootDiskSize Size of the Root Disk (in GB). From 1 to 14901.
         * 
         * @return builder
         * 
         */
        public Builder rootDiskSize(@Nullable Output<Integer> rootDiskSize) {
            $.rootDiskSize = rootDiskSize;
            return this;
        }

        /**
         * @param rootDiskSize Size of the Root Disk (in GB). From 1 to 14901.
         * 
         * @return builder
         * 
         */
        public Builder rootDiskSize(Integer rootDiskSize) {
            return rootDiskSize(Output.of(rootDiskSize));
        }

        /**
         * @param rootDiskType Type of the Root Disk. Possible values are :&#39;standard&#39;, &#39;gp2&#39; or &#39;io1&#39;.
         * 
         * @return builder
         * 
         */
        public Builder rootDiskType(@Nullable Output<String> rootDiskType) {
            $.rootDiskType = rootDiskType;
            return this;
        }

        /**
         * @param rootDiskType Type of the Root Disk. Possible values are :&#39;standard&#39;, &#39;gp2&#39; or &#39;io1&#39;.
         * 
         * @return builder
         * 
         */
        public Builder rootDiskType(String rootDiskType) {
            return rootDiskType(Output.of(rootDiskType));
        }

        /**
         * @param secretKey AWS secret key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
         * 
         * @return builder
         * 
         */
        public Builder secretKey(Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey AWS secret key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        /**
         * @param securityGroupIds Ids of user defined Security Groups to add to the machine. (list)
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds Ids of user defined Security Groups to add to the machine. (list)
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds Ids of user defined Security Groups to add to the machine. (list)
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param sourceOmi Outscale Machine Image to use as bootstrap for the VM. Default `ami-2cf1fa3e` (string)
         * 
         * @return builder
         * 
         */
        public Builder sourceOmi(@Nullable Output<String> sourceOmi) {
            $.sourceOmi = sourceOmi;
            return this;
        }

        /**
         * @param sourceOmi Outscale Machine Image to use as bootstrap for the VM. Default `ami-2cf1fa3e` (string)
         * 
         * @return builder
         * 
         */
        public Builder sourceOmi(String sourceOmi) {
            return sourceOmi(Output.of(sourceOmi));
        }

        public NodeTemplateOutscaleConfigArgs build() {
            $.accessKey = Objects.requireNonNull($.accessKey, "expected parameter 'accessKey' to be non-null");
            $.secretKey = Objects.requireNonNull($.secretKey, "expected parameter 'secretKey' to be non-null");
            return $;
        }
    }

}
