// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeTemplateOutscaleConfig {
    /**
     * @return Outscale Access Key (string)
     * 
     */
    private String accessKey;
    /**
     * @return Extra tags for all created resources (e.g. key1=value1,key2=value2) (list)
     * 
     */
    private @Nullable List<String> extraTagsAlls;
    /**
     * @return Extra tags only for instances (e.g. key1=value1,key2=value2) (list)
     * 
     */
    private @Nullable List<String> extraTagsInstances;
    /**
     * @return Outscale VM type. Default `tinav2.c1r2p3` (string)
     * 
     */
    private @Nullable String instanceType;
    /**
     * @return AWS region. Default `eu-west-2` (string)
     * 
     */
    private @Nullable String region;
    /**
     * @return Iops for io1 Root Disk. From 1 to 13000.
     * 
     */
    private @Nullable Integer rootDiskIops;
    /**
     * @return Size of the Root Disk (in GB). From 1 to 14901.
     * 
     */
    private @Nullable Integer rootDiskSize;
    /**
     * @return Type of the Root Disk. Possible values are :&#39;standard&#39;, &#39;gp2&#39; or &#39;io1&#39;.
     * 
     */
    private @Nullable String rootDiskType;
    /**
     * @return Outscale Secret Key (string)
     * 
     */
    private String secretKey;
    /**
     * @return Ids of user defined Security Groups to add to the machine. (list)
     * 
     */
    private @Nullable List<String> securityGroupIds;
    /**
     * @return Outscale Machine Image to use as bootstrap for the VM. Default `ami-2cf1fa3e` (string)
     * 
     */
    private @Nullable String sourceOmi;

    private NodeTemplateOutscaleConfig() {}
    /**
     * @return Outscale Access Key (string)
     * 
     */
    public String accessKey() {
        return this.accessKey;
    }
    /**
     * @return Extra tags for all created resources (e.g. key1=value1,key2=value2) (list)
     * 
     */
    public List<String> extraTagsAlls() {
        return this.extraTagsAlls == null ? List.of() : this.extraTagsAlls;
    }
    /**
     * @return Extra tags only for instances (e.g. key1=value1,key2=value2) (list)
     * 
     */
    public List<String> extraTagsInstances() {
        return this.extraTagsInstances == null ? List.of() : this.extraTagsInstances;
    }
    /**
     * @return Outscale VM type. Default `tinav2.c1r2p3` (string)
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return AWS region. Default `eu-west-2` (string)
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return Iops for io1 Root Disk. From 1 to 13000.
     * 
     */
    public Optional<Integer> rootDiskIops() {
        return Optional.ofNullable(this.rootDiskIops);
    }
    /**
     * @return Size of the Root Disk (in GB). From 1 to 14901.
     * 
     */
    public Optional<Integer> rootDiskSize() {
        return Optional.ofNullable(this.rootDiskSize);
    }
    /**
     * @return Type of the Root Disk. Possible values are :&#39;standard&#39;, &#39;gp2&#39; or &#39;io1&#39;.
     * 
     */
    public Optional<String> rootDiskType() {
        return Optional.ofNullable(this.rootDiskType);
    }
    /**
     * @return Outscale Secret Key (string)
     * 
     */
    public String secretKey() {
        return this.secretKey;
    }
    /**
     * @return Ids of user defined Security Groups to add to the machine. (list)
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }
    /**
     * @return Outscale Machine Image to use as bootstrap for the VM. Default `ami-2cf1fa3e` (string)
     * 
     */
    public Optional<String> sourceOmi() {
        return Optional.ofNullable(this.sourceOmi);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateOutscaleConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessKey;
        private @Nullable List<String> extraTagsAlls;
        private @Nullable List<String> extraTagsInstances;
        private @Nullable String instanceType;
        private @Nullable String region;
        private @Nullable Integer rootDiskIops;
        private @Nullable Integer rootDiskSize;
        private @Nullable String rootDiskType;
        private String secretKey;
        private @Nullable List<String> securityGroupIds;
        private @Nullable String sourceOmi;
        public Builder() {}
        public Builder(NodeTemplateOutscaleConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.extraTagsAlls = defaults.extraTagsAlls;
    	      this.extraTagsInstances = defaults.extraTagsInstances;
    	      this.instanceType = defaults.instanceType;
    	      this.region = defaults.region;
    	      this.rootDiskIops = defaults.rootDiskIops;
    	      this.rootDiskSize = defaults.rootDiskSize;
    	      this.rootDiskType = defaults.rootDiskType;
    	      this.secretKey = defaults.secretKey;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.sourceOmi = defaults.sourceOmi;
        }

        @CustomType.Setter
        public Builder accessKey(String accessKey) {
            this.accessKey = Objects.requireNonNull(accessKey);
            return this;
        }
        @CustomType.Setter
        public Builder extraTagsAlls(@Nullable List<String> extraTagsAlls) {
            this.extraTagsAlls = extraTagsAlls;
            return this;
        }
        public Builder extraTagsAlls(String... extraTagsAlls) {
            return extraTagsAlls(List.of(extraTagsAlls));
        }
        @CustomType.Setter
        public Builder extraTagsInstances(@Nullable List<String> extraTagsInstances) {
            this.extraTagsInstances = extraTagsInstances;
            return this;
        }
        public Builder extraTagsInstances(String... extraTagsInstances) {
            return extraTagsInstances(List.of(extraTagsInstances));
        }
        @CustomType.Setter
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder rootDiskIops(@Nullable Integer rootDiskIops) {
            this.rootDiskIops = rootDiskIops;
            return this;
        }
        @CustomType.Setter
        public Builder rootDiskSize(@Nullable Integer rootDiskSize) {
            this.rootDiskSize = rootDiskSize;
            return this;
        }
        @CustomType.Setter
        public Builder rootDiskType(@Nullable String rootDiskType) {
            this.rootDiskType = rootDiskType;
            return this;
        }
        @CustomType.Setter
        public Builder secretKey(String secretKey) {
            this.secretKey = Objects.requireNonNull(secretKey);
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        @CustomType.Setter
        public Builder sourceOmi(@Nullable String sourceOmi) {
            this.sourceOmi = sourceOmi;
            return this;
        }
        public NodeTemplateOutscaleConfig build() {
            final var _resultValue = new NodeTemplateOutscaleConfig();
            _resultValue.accessKey = accessKey;
            _resultValue.extraTagsAlls = extraTagsAlls;
            _resultValue.extraTagsInstances = extraTagsInstances;
            _resultValue.instanceType = instanceType;
            _resultValue.region = region;
            _resultValue.rootDiskIops = rootDiskIops;
            _resultValue.rootDiskSize = rootDiskSize;
            _resultValue.rootDiskType = rootDiskType;
            _resultValue.secretKey = secretKey;
            _resultValue.securityGroupIds = securityGroupIds;
            _resultValue.sourceOmi = sourceOmi;
            return _resultValue;
        }
    }
}
