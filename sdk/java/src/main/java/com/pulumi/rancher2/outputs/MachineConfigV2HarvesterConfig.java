// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MachineConfigV2HarvesterConfig {
    /**
     * @return vSphere CPU number for docker VM. Default `2` (string)
     * 
     */
    private final @Nullable String cpuCount;
    /**
     * @return Disk bus, Default `virtio` (string)
     * 
     */
    private final @Nullable String diskBus;
    /**
     * @return vSphere size of disk for docker VM (in MB). Default `20480` (string)
     * 
     */
    private final @Nullable String diskSize;
    /**
     * @return OpenStack image name to use for the instance. Conflicts with `image_id` (string)
     * 
     */
    private final String imageName;
    /**
     * @return vSphere size of memory for docker VM (in MB). Default `2048` (string)
     * 
     */
    private final @Nullable String memorySize;
    /**
     * @return NetworkData content of cloud-init, base64 is supported (string)
     * 
     */
    private final @Nullable String networkData;
    /**
     * @return Network model, Default `virtio` (string)
     * 
     */
    private final @Nullable String networkModel;
    /**
     * @return Network name e.g. `harvester-public/vlan1` (string)
     * 
     */
    private final String networkName;
    /**
     * @return If using a non-B2D image you can specify the ssh password. Default `tcuser` (string)
     * 
     */
    private final @Nullable String sshPassword;
    /**
     * @return If using a non-B2D image you can specify the ssh user. Default `docker`. (string)
     * 
     */
    private final String sshUser;
    /**
     * @return UserData content of cloud-init, base64 is supported (string)
     * 
     */
    private final @Nullable String userData;
    /**
     * @return Virtual machine namespace e.g. `default` (string)
     * 
     */
    private final String vmNamespace;

    @CustomType.Constructor
    private MachineConfigV2HarvesterConfig(
        @CustomType.Parameter("cpuCount") @Nullable String cpuCount,
        @CustomType.Parameter("diskBus") @Nullable String diskBus,
        @CustomType.Parameter("diskSize") @Nullable String diskSize,
        @CustomType.Parameter("imageName") String imageName,
        @CustomType.Parameter("memorySize") @Nullable String memorySize,
        @CustomType.Parameter("networkData") @Nullable String networkData,
        @CustomType.Parameter("networkModel") @Nullable String networkModel,
        @CustomType.Parameter("networkName") String networkName,
        @CustomType.Parameter("sshPassword") @Nullable String sshPassword,
        @CustomType.Parameter("sshUser") String sshUser,
        @CustomType.Parameter("userData") @Nullable String userData,
        @CustomType.Parameter("vmNamespace") String vmNamespace) {
        this.cpuCount = cpuCount;
        this.diskBus = diskBus;
        this.diskSize = diskSize;
        this.imageName = imageName;
        this.memorySize = memorySize;
        this.networkData = networkData;
        this.networkModel = networkModel;
        this.networkName = networkName;
        this.sshPassword = sshPassword;
        this.sshUser = sshUser;
        this.userData = userData;
        this.vmNamespace = vmNamespace;
    }

    /**
     * @return vSphere CPU number for docker VM. Default `2` (string)
     * 
     */
    public Optional<String> cpuCount() {
        return Optional.ofNullable(this.cpuCount);
    }
    /**
     * @return Disk bus, Default `virtio` (string)
     * 
     */
    public Optional<String> diskBus() {
        return Optional.ofNullable(this.diskBus);
    }
    /**
     * @return vSphere size of disk for docker VM (in MB). Default `20480` (string)
     * 
     */
    public Optional<String> diskSize() {
        return Optional.ofNullable(this.diskSize);
    }
    /**
     * @return OpenStack image name to use for the instance. Conflicts with `image_id` (string)
     * 
     */
    public String imageName() {
        return this.imageName;
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
     * @return Network model, Default `virtio` (string)
     * 
     */
    public Optional<String> networkModel() {
        return Optional.ofNullable(this.networkModel);
    }
    /**
     * @return Network name e.g. `harvester-public/vlan1` (string)
     * 
     */
    public String networkName() {
        return this.networkName;
    }
    /**
     * @return If using a non-B2D image you can specify the ssh password. Default `tcuser` (string)
     * 
     */
    public Optional<String> sshPassword() {
        return Optional.ofNullable(this.sshPassword);
    }
    /**
     * @return If using a non-B2D image you can specify the ssh user. Default `docker`. (string)
     * 
     */
    public String sshUser() {
        return this.sshUser;
    }
    /**
     * @return UserData content of cloud-init, base64 is supported (string)
     * 
     */
    public Optional<String> userData() {
        return Optional.ofNullable(this.userData);
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

    public static Builder builder(MachineConfigV2HarvesterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cpuCount;
        private @Nullable String diskBus;
        private @Nullable String diskSize;
        private String imageName;
        private @Nullable String memorySize;
        private @Nullable String networkData;
        private @Nullable String networkModel;
        private String networkName;
        private @Nullable String sshPassword;
        private String sshUser;
        private @Nullable String userData;
        private String vmNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineConfigV2HarvesterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCount = defaults.cpuCount;
    	      this.diskBus = defaults.diskBus;
    	      this.diskSize = defaults.diskSize;
    	      this.imageName = defaults.imageName;
    	      this.memorySize = defaults.memorySize;
    	      this.networkData = defaults.networkData;
    	      this.networkModel = defaults.networkModel;
    	      this.networkName = defaults.networkName;
    	      this.sshPassword = defaults.sshPassword;
    	      this.sshUser = defaults.sshUser;
    	      this.userData = defaults.userData;
    	      this.vmNamespace = defaults.vmNamespace;
        }

        public Builder cpuCount(@Nullable String cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        public Builder diskBus(@Nullable String diskBus) {
            this.diskBus = diskBus;
            return this;
        }
        public Builder diskSize(@Nullable String diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Builder imageName(String imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }
        public Builder memorySize(@Nullable String memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Builder networkData(@Nullable String networkData) {
            this.networkData = networkData;
            return this;
        }
        public Builder networkModel(@Nullable String networkModel) {
            this.networkModel = networkModel;
            return this;
        }
        public Builder networkName(String networkName) {
            this.networkName = Objects.requireNonNull(networkName);
            return this;
        }
        public Builder sshPassword(@Nullable String sshPassword) {
            this.sshPassword = sshPassword;
            return this;
        }
        public Builder sshUser(String sshUser) {
            this.sshUser = Objects.requireNonNull(sshUser);
            return this;
        }
        public Builder userData(@Nullable String userData) {
            this.userData = userData;
            return this;
        }
        public Builder vmNamespace(String vmNamespace) {
            this.vmNamespace = Objects.requireNonNull(vmNamespace);
            return this;
        }        public MachineConfigV2HarvesterConfig build() {
            return new MachineConfigV2HarvesterConfig(cpuCount, diskBus, diskSize, imageName, memorySize, networkData, networkModel, networkName, sshPassword, sshUser, userData, vmNamespace);
        }
    }
}
