// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeTemplateHarvesterConfig {
    /**
     * @return vSphere CPU number for docker VM. Default `2` (string)
     * 
     */
    private @Nullable String cpuCount;
    /**
     * @return Use `disk_info` instead
     * 
     * @deprecated
     * Use disk_info instead
     * 
     */
    @Deprecated /* Use disk_info instead */
    private @Nullable String diskBus;
    /**
     * @return A JSON string specifying info for the disks e.g. `{\&#34;disks\&#34;:[{\&#34;imageName\&#34;:\&#34;harvester-public/image-57hzg\&#34;,\&#34;bootOrder\&#34;:1,\&#34;size\&#34;:40},{\&#34;storageClassName\&#34;:\&#34;node-driver-test\&#34;,\&#34;bootOrder\&#34;:2,\&#34;size\&#34;:1}]}` (string)
     * 
     */
    private @Nullable String diskInfo;
    /**
     * @return vSphere size of disk for docker VM (in MB). Default `20480` (string)
     * 
     * @deprecated
     * Use disk_info instead
     * 
     */
    @Deprecated /* Use disk_info instead */
    private @Nullable String diskSize;
    /**
     * @return OpenStack image name to use for the instance. Conflicts with `image_id` (string)
     * 
     * @deprecated
     * Use disk_info instead
     * 
     */
    @Deprecated /* Use disk_info instead */
    private @Nullable String imageName;
    /**
     * @return vSphere size of memory for docker VM (in MB). Default `2048` (string)
     * 
     */
    private @Nullable String memorySize;
    /**
     * @return NetworkData content of cloud-init, base64 is supported (string)
     * 
     */
    private @Nullable String networkData;
    /**
     * @return A JSON string specifying info for the networks e.g. `{\&#34;interfaces\&#34;:[{\&#34;networkName\&#34;:\&#34;harvester-public/vlan1\&#34;},{\&#34;networkName\&#34;:\&#34;harvester-public/vlan2\&#34;}]}` (string)
     * 
     */
    private @Nullable String networkInfo;
    /**
     * @return Use `network_info` instead
     * 
     * @deprecated
     * Use network_info instead
     * 
     */
    @Deprecated /* Use network_info instead */
    private @Nullable String networkModel;
    /**
     * @return Opennebula network to connect the machine to. Conflicts with `network_id` (string)
     * 
     * @deprecated
     * Use network_info instead
     * 
     */
    @Deprecated /* Use network_info instead */
    private @Nullable String networkName;
    /**
     * @return If using a non-B2D image you can specify the ssh password. Default `tcuser`. From Rancher v2.3.3 (string)
     * 
     */
    private @Nullable String sshPassword;
    /**
     * @return If using a non-B2D image you can specify the ssh user. Default `docker`. From Rancher v2.3.3 (string)
     * 
     */
    private String sshUser;
    /**
     * @return UserData content of cloud-init, base64 is supported. If the image does not contain the qemu-guest-agent package, you must install and start qemu-guest-agent using userdata (string)
     * 
     */
    private @Nullable String userData;
    /**
     * @return Virtual machine affinity, only base64 format is supported. For Rancher v2.6.7 and above (string)
     * 
     */
    private @Nullable String vmAffinity;
    /**
     * @return Virtual machine namespace e.g. `default` (string)
     * 
     */
    private String vmNamespace;

    private NodeTemplateHarvesterConfig() {}
    /**
     * @return vSphere CPU number for docker VM. Default `2` (string)
     * 
     */
    public Optional<String> cpuCount() {
        return Optional.ofNullable(this.cpuCount);
    }
    /**
     * @return Use `disk_info` instead
     * 
     * @deprecated
     * Use disk_info instead
     * 
     */
    @Deprecated /* Use disk_info instead */
    public Optional<String> diskBus() {
        return Optional.ofNullable(this.diskBus);
    }
    /**
     * @return A JSON string specifying info for the disks e.g. `{\&#34;disks\&#34;:[{\&#34;imageName\&#34;:\&#34;harvester-public/image-57hzg\&#34;,\&#34;bootOrder\&#34;:1,\&#34;size\&#34;:40},{\&#34;storageClassName\&#34;:\&#34;node-driver-test\&#34;,\&#34;bootOrder\&#34;:2,\&#34;size\&#34;:1}]}` (string)
     * 
     */
    public Optional<String> diskInfo() {
        return Optional.ofNullable(this.diskInfo);
    }
    /**
     * @return vSphere size of disk for docker VM (in MB). Default `20480` (string)
     * 
     * @deprecated
     * Use disk_info instead
     * 
     */
    @Deprecated /* Use disk_info instead */
    public Optional<String> diskSize() {
        return Optional.ofNullable(this.diskSize);
    }
    /**
     * @return OpenStack image name to use for the instance. Conflicts with `image_id` (string)
     * 
     * @deprecated
     * Use disk_info instead
     * 
     */
    @Deprecated /* Use disk_info instead */
    public Optional<String> imageName() {
        return Optional.ofNullable(this.imageName);
    }
    /**
     * @return vSphere size of memory for docker VM (in MB). Default `2048` (string)
     * 
     */
    public Optional<String> memorySize() {
        return Optional.ofNullable(this.memorySize);
    }
    /**
     * @return NetworkData content of cloud-init, base64 is supported (string)
     * 
     */
    public Optional<String> networkData() {
        return Optional.ofNullable(this.networkData);
    }
    /**
     * @return A JSON string specifying info for the networks e.g. `{\&#34;interfaces\&#34;:[{\&#34;networkName\&#34;:\&#34;harvester-public/vlan1\&#34;},{\&#34;networkName\&#34;:\&#34;harvester-public/vlan2\&#34;}]}` (string)
     * 
     */
    public Optional<String> networkInfo() {
        return Optional.ofNullable(this.networkInfo);
    }
    /**
     * @return Use `network_info` instead
     * 
     * @deprecated
     * Use network_info instead
     * 
     */
    @Deprecated /* Use network_info instead */
    public Optional<String> networkModel() {
        return Optional.ofNullable(this.networkModel);
    }
    /**
     * @return Opennebula network to connect the machine to. Conflicts with `network_id` (string)
     * 
     * @deprecated
     * Use network_info instead
     * 
     */
    @Deprecated /* Use network_info instead */
    public Optional<String> networkName() {
        return Optional.ofNullable(this.networkName);
    }
    /**
     * @return If using a non-B2D image you can specify the ssh password. Default `tcuser`. From Rancher v2.3.3 (string)
     * 
     */
    public Optional<String> sshPassword() {
        return Optional.ofNullable(this.sshPassword);
    }
    /**
     * @return If using a non-B2D image you can specify the ssh user. Default `docker`. From Rancher v2.3.3 (string)
     * 
     */
    public String sshUser() {
        return this.sshUser;
    }
    /**
     * @return UserData content of cloud-init, base64 is supported. If the image does not contain the qemu-guest-agent package, you must install and start qemu-guest-agent using userdata (string)
     * 
     */
    public Optional<String> userData() {
        return Optional.ofNullable(this.userData);
    }
    /**
     * @return Virtual machine affinity, only base64 format is supported. For Rancher v2.6.7 and above (string)
     * 
     */
    public Optional<String> vmAffinity() {
        return Optional.ofNullable(this.vmAffinity);
    }
    /**
     * @return Virtual machine namespace e.g. `default` (string)
     * 
     */
    public String vmNamespace() {
        return this.vmNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateHarvesterConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cpuCount;
        private @Nullable String diskBus;
        private @Nullable String diskInfo;
        private @Nullable String diskSize;
        private @Nullable String imageName;
        private @Nullable String memorySize;
        private @Nullable String networkData;
        private @Nullable String networkInfo;
        private @Nullable String networkModel;
        private @Nullable String networkName;
        private @Nullable String sshPassword;
        private String sshUser;
        private @Nullable String userData;
        private @Nullable String vmAffinity;
        private String vmNamespace;
        public Builder() {}
        public Builder(NodeTemplateHarvesterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCount = defaults.cpuCount;
    	      this.diskBus = defaults.diskBus;
    	      this.diskInfo = defaults.diskInfo;
    	      this.diskSize = defaults.diskSize;
    	      this.imageName = defaults.imageName;
    	      this.memorySize = defaults.memorySize;
    	      this.networkData = defaults.networkData;
    	      this.networkInfo = defaults.networkInfo;
    	      this.networkModel = defaults.networkModel;
    	      this.networkName = defaults.networkName;
    	      this.sshPassword = defaults.sshPassword;
    	      this.sshUser = defaults.sshUser;
    	      this.userData = defaults.userData;
    	      this.vmAffinity = defaults.vmAffinity;
    	      this.vmNamespace = defaults.vmNamespace;
        }

        @CustomType.Setter
        public Builder cpuCount(@Nullable String cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        @CustomType.Setter
        public Builder diskBus(@Nullable String diskBus) {
            this.diskBus = diskBus;
            return this;
        }
        @CustomType.Setter
        public Builder diskInfo(@Nullable String diskInfo) {
            this.diskInfo = diskInfo;
            return this;
        }
        @CustomType.Setter
        public Builder diskSize(@Nullable String diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        @CustomType.Setter
        public Builder imageName(@Nullable String imageName) {
            this.imageName = imageName;
            return this;
        }
        @CustomType.Setter
        public Builder memorySize(@Nullable String memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        @CustomType.Setter
        public Builder networkData(@Nullable String networkData) {
            this.networkData = networkData;
            return this;
        }
        @CustomType.Setter
        public Builder networkInfo(@Nullable String networkInfo) {
            this.networkInfo = networkInfo;
            return this;
        }
        @CustomType.Setter
        public Builder networkModel(@Nullable String networkModel) {
            this.networkModel = networkModel;
            return this;
        }
        @CustomType.Setter
        public Builder networkName(@Nullable String networkName) {
            this.networkName = networkName;
            return this;
        }
        @CustomType.Setter
        public Builder sshPassword(@Nullable String sshPassword) {
            this.sshPassword = sshPassword;
            return this;
        }
        @CustomType.Setter
        public Builder sshUser(String sshUser) {
            this.sshUser = Objects.requireNonNull(sshUser);
            return this;
        }
        @CustomType.Setter
        public Builder userData(@Nullable String userData) {
            this.userData = userData;
            return this;
        }
        @CustomType.Setter
        public Builder vmAffinity(@Nullable String vmAffinity) {
            this.vmAffinity = vmAffinity;
            return this;
        }
        @CustomType.Setter
        public Builder vmNamespace(String vmNamespace) {
            this.vmNamespace = Objects.requireNonNull(vmNamespace);
            return this;
        }
        public NodeTemplateHarvesterConfig build() {
            final var _resultValue = new NodeTemplateHarvesterConfig();
            _resultValue.cpuCount = cpuCount;
            _resultValue.diskBus = diskBus;
            _resultValue.diskInfo = diskInfo;
            _resultValue.diskSize = diskSize;
            _resultValue.imageName = imageName;
            _resultValue.memorySize = memorySize;
            _resultValue.networkData = networkData;
            _resultValue.networkInfo = networkInfo;
            _resultValue.networkModel = networkModel;
            _resultValue.networkName = networkName;
            _resultValue.sshPassword = sshPassword;
            _resultValue.sshUser = sshUser;
            _resultValue.userData = userData;
            _resultValue.vmAffinity = vmAffinity;
            _resultValue.vmNamespace = vmNamespace;
            return _resultValue;
        }
    }
}
