// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodeTemplateHarvesterConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeTemplateHarvesterConfigArgs Empty = new NodeTemplateHarvesterConfigArgs();

    /**
     * CPU count, Default `2` (string)
     * 
     */
    @Import(name="cpuCount")
    private @Nullable Output<String> cpuCount;

    /**
     * @return CPU count, Default `2` (string)
     * 
     */
    public Optional<Output<String>> cpuCount() {
        return Optional.ofNullable(this.cpuCount);
    }

    /**
     * Use `disk_info` instead
     * 
     * @deprecated
     * Use disk_info instead
     * 
     */
    @Deprecated /* Use disk_info instead */
    @Import(name="diskBus")
    private @Nullable Output<String> diskBus;

    /**
     * @return Use `disk_info` instead
     * 
     * @deprecated
     * Use disk_info instead
     * 
     */
    @Deprecated /* Use disk_info instead */
    public Optional<Output<String>> diskBus() {
        return Optional.ofNullable(this.diskBus);
    }

    /**
     * A JSON string specifying info for the disks e.g. `{\&#34;disks\&#34;:[{\&#34;imageName\&#34;:\&#34;harvester-public/image-57hzg\&#34;,\&#34;bootOrder\&#34;:1,\&#34;size\&#34;:40},{\&#34;storageClassName\&#34;:\&#34;node-driver-test\&#34;,\&#34;bootOrder\&#34;:2,\&#34;size\&#34;:1}]}` (string)
     * 
     */
    @Import(name="diskInfo")
    private @Nullable Output<String> diskInfo;

    /**
     * @return A JSON string specifying info for the disks e.g. `{\&#34;disks\&#34;:[{\&#34;imageName\&#34;:\&#34;harvester-public/image-57hzg\&#34;,\&#34;bootOrder\&#34;:1,\&#34;size\&#34;:40},{\&#34;storageClassName\&#34;:\&#34;node-driver-test\&#34;,\&#34;bootOrder\&#34;:2,\&#34;size\&#34;:1}]}` (string)
     * 
     */
    public Optional<Output<String>> diskInfo() {
        return Optional.ofNullable(this.diskInfo);
    }

    /**
     * Disk size if using managed disk. Just for Rancher v2.3.x and above. Default `30` (string)
     * 
     * @deprecated
     * Use disk_info instead
     * 
     */
    @Deprecated /* Use disk_info instead */
    @Import(name="diskSize")
    private @Nullable Output<String> diskSize;

    /**
     * @return Disk size if using managed disk. Just for Rancher v2.3.x and above. Default `30` (string)
     * 
     * @deprecated
     * Use disk_info instead
     * 
     */
    @Deprecated /* Use disk_info instead */
    public Optional<Output<String>> diskSize() {
        return Optional.ofNullable(this.diskSize);
    }

    /**
     * Use `disk_info` instead
     * 
     * @deprecated
     * Use disk_info instead
     * 
     */
    @Deprecated /* Use disk_info instead */
    @Import(name="imageName")
    private @Nullable Output<String> imageName;

    /**
     * @return Use `disk_info` instead
     * 
     * @deprecated
     * Use disk_info instead
     * 
     */
    @Deprecated /* Use disk_info instead */
    public Optional<Output<String>> imageName() {
        return Optional.ofNullable(this.imageName);
    }

    /**
     * Memory size (in GiB), Default `4` (string)
     * 
     */
    @Import(name="memorySize")
    private @Nullable Output<String> memorySize;

    /**
     * @return Memory size (in GiB), Default `4` (string)
     * 
     */
    public Optional<Output<String>> memorySize() {
        return Optional.ofNullable(this.memorySize);
    }

    /**
     * NetworkData content of cloud-init, base64 is supported (string)
     * 
     */
    @Import(name="networkData")
    private @Nullable Output<String> networkData;

    /**
     * @return NetworkData content of cloud-init, base64 is supported (string)
     * 
     */
    public Optional<Output<String>> networkData() {
        return Optional.ofNullable(this.networkData);
    }

    /**
     * A JSON string specifying info for the networks e.g. `{\&#34;interfaces\&#34;:[{\&#34;networkName\&#34;:\&#34;harvester-public/vlan1\&#34;},{\&#34;networkName\&#34;:\&#34;harvester-public/vlan2\&#34;}]}` (string)
     * 
     */
    @Import(name="networkInfo")
    private @Nullable Output<String> networkInfo;

    /**
     * @return A JSON string specifying info for the networks e.g. `{\&#34;interfaces\&#34;:[{\&#34;networkName\&#34;:\&#34;harvester-public/vlan1\&#34;},{\&#34;networkName\&#34;:\&#34;harvester-public/vlan2\&#34;}]}` (string)
     * 
     */
    public Optional<Output<String>> networkInfo() {
        return Optional.ofNullable(this.networkInfo);
    }

    /**
     * Use `network_info` instead
     * 
     * @deprecated
     * Use network_info instead
     * 
     */
    @Deprecated /* Use network_info instead */
    @Import(name="networkModel")
    private @Nullable Output<String> networkModel;

    /**
     * @return Use `network_info` instead
     * 
     * @deprecated
     * Use network_info instead
     * 
     */
    @Deprecated /* Use network_info instead */
    public Optional<Output<String>> networkModel() {
        return Optional.ofNullable(this.networkModel);
    }

    /**
     * Use `network_info` instead
     * 
     * @deprecated
     * Use network_info instead
     * 
     */
    @Deprecated /* Use network_info instead */
    @Import(name="networkName")
    private @Nullable Output<String> networkName;

    /**
     * @return Use `network_info` instead
     * 
     * @deprecated
     * Use network_info instead
     * 
     */
    @Deprecated /* Use network_info instead */
    public Optional<Output<String>> networkName() {
        return Optional.ofNullable(this.networkName);
    }

    /**
     * SSH password (string)
     * 
     */
    @Import(name="sshPassword")
    private @Nullable Output<String> sshPassword;

    /**
     * @return SSH password (string)
     * 
     */
    public Optional<Output<String>> sshPassword() {
        return Optional.ofNullable(this.sshPassword);
    }

    /**
     * Set the name of the ssh user (string)
     * 
     */
    @Import(name="sshUser", required=true)
    private Output<String> sshUser;

    /**
     * @return Set the name of the ssh user (string)
     * 
     */
    public Output<String> sshUser() {
        return this.sshUser;
    }

    /**
     * UserData content of cloud-init, base64 is supported. If the image does not contain the qemu-guest-agent package, you must install and start qemu-guest-agent using userdata (string)
     * 
     */
    @Import(name="userData")
    private @Nullable Output<String> userData;

    /**
     * @return UserData content of cloud-init, base64 is supported. If the image does not contain the qemu-guest-agent package, you must install and start qemu-guest-agent using userdata (string)
     * 
     */
    public Optional<Output<String>> userData() {
        return Optional.ofNullable(this.userData);
    }

    /**
     * Virtual machine affinity, only base64 format is supported. For Rancher v2.6.7 or above (string)
     * 
     */
    @Import(name="vmAffinity")
    private @Nullable Output<String> vmAffinity;

    /**
     * @return Virtual machine affinity, only base64 format is supported. For Rancher v2.6.7 or above (string)
     * 
     */
    public Optional<Output<String>> vmAffinity() {
        return Optional.ofNullable(this.vmAffinity);
    }

    /**
     * Virtual machine namespace e.g. `default` (string)
     * 
     */
    @Import(name="vmNamespace", required=true)
    private Output<String> vmNamespace;

    /**
     * @return Virtual machine namespace e.g. `default` (string)
     * 
     */
    public Output<String> vmNamespace() {
        return this.vmNamespace;
    }

    private NodeTemplateHarvesterConfigArgs() {}

    private NodeTemplateHarvesterConfigArgs(NodeTemplateHarvesterConfigArgs $) {
        this.cpuCount = $.cpuCount;
        this.diskBus = $.diskBus;
        this.diskInfo = $.diskInfo;
        this.diskSize = $.diskSize;
        this.imageName = $.imageName;
        this.memorySize = $.memorySize;
        this.networkData = $.networkData;
        this.networkInfo = $.networkInfo;
        this.networkModel = $.networkModel;
        this.networkName = $.networkName;
        this.sshPassword = $.sshPassword;
        this.sshUser = $.sshUser;
        this.userData = $.userData;
        this.vmAffinity = $.vmAffinity;
        this.vmNamespace = $.vmNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeTemplateHarvesterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeTemplateHarvesterConfigArgs $;

        public Builder() {
            $ = new NodeTemplateHarvesterConfigArgs();
        }

        public Builder(NodeTemplateHarvesterConfigArgs defaults) {
            $ = new NodeTemplateHarvesterConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpuCount CPU count, Default `2` (string)
         * 
         * @return builder
         * 
         */
        public Builder cpuCount(@Nullable Output<String> cpuCount) {
            $.cpuCount = cpuCount;
            return this;
        }

        /**
         * @param cpuCount CPU count, Default `2` (string)
         * 
         * @return builder
         * 
         */
        public Builder cpuCount(String cpuCount) {
            return cpuCount(Output.of(cpuCount));
        }

        /**
         * @param diskBus Use `disk_info` instead
         * 
         * @return builder
         * 
         * @deprecated
         * Use disk_info instead
         * 
         */
        @Deprecated /* Use disk_info instead */
        public Builder diskBus(@Nullable Output<String> diskBus) {
            $.diskBus = diskBus;
            return this;
        }

        /**
         * @param diskBus Use `disk_info` instead
         * 
         * @return builder
         * 
         * @deprecated
         * Use disk_info instead
         * 
         */
        @Deprecated /* Use disk_info instead */
        public Builder diskBus(String diskBus) {
            return diskBus(Output.of(diskBus));
        }

        /**
         * @param diskInfo A JSON string specifying info for the disks e.g. `{\&#34;disks\&#34;:[{\&#34;imageName\&#34;:\&#34;harvester-public/image-57hzg\&#34;,\&#34;bootOrder\&#34;:1,\&#34;size\&#34;:40},{\&#34;storageClassName\&#34;:\&#34;node-driver-test\&#34;,\&#34;bootOrder\&#34;:2,\&#34;size\&#34;:1}]}` (string)
         * 
         * @return builder
         * 
         */
        public Builder diskInfo(@Nullable Output<String> diskInfo) {
            $.diskInfo = diskInfo;
            return this;
        }

        /**
         * @param diskInfo A JSON string specifying info for the disks e.g. `{\&#34;disks\&#34;:[{\&#34;imageName\&#34;:\&#34;harvester-public/image-57hzg\&#34;,\&#34;bootOrder\&#34;:1,\&#34;size\&#34;:40},{\&#34;storageClassName\&#34;:\&#34;node-driver-test\&#34;,\&#34;bootOrder\&#34;:2,\&#34;size\&#34;:1}]}` (string)
         * 
         * @return builder
         * 
         */
        public Builder diskInfo(String diskInfo) {
            return diskInfo(Output.of(diskInfo));
        }

        /**
         * @param diskSize Disk size if using managed disk. Just for Rancher v2.3.x and above. Default `30` (string)
         * 
         * @return builder
         * 
         * @deprecated
         * Use disk_info instead
         * 
         */
        @Deprecated /* Use disk_info instead */
        public Builder diskSize(@Nullable Output<String> diskSize) {
            $.diskSize = diskSize;
            return this;
        }

        /**
         * @param diskSize Disk size if using managed disk. Just for Rancher v2.3.x and above. Default `30` (string)
         * 
         * @return builder
         * 
         * @deprecated
         * Use disk_info instead
         * 
         */
        @Deprecated /* Use disk_info instead */
        public Builder diskSize(String diskSize) {
            return diskSize(Output.of(diskSize));
        }

        /**
         * @param imageName Use `disk_info` instead
         * 
         * @return builder
         * 
         * @deprecated
         * Use disk_info instead
         * 
         */
        @Deprecated /* Use disk_info instead */
        public Builder imageName(@Nullable Output<String> imageName) {
            $.imageName = imageName;
            return this;
        }

        /**
         * @param imageName Use `disk_info` instead
         * 
         * @return builder
         * 
         * @deprecated
         * Use disk_info instead
         * 
         */
        @Deprecated /* Use disk_info instead */
        public Builder imageName(String imageName) {
            return imageName(Output.of(imageName));
        }

        /**
         * @param memorySize Memory size (in GiB), Default `4` (string)
         * 
         * @return builder
         * 
         */
        public Builder memorySize(@Nullable Output<String> memorySize) {
            $.memorySize = memorySize;
            return this;
        }

        /**
         * @param memorySize Memory size (in GiB), Default `4` (string)
         * 
         * @return builder
         * 
         */
        public Builder memorySize(String memorySize) {
            return memorySize(Output.of(memorySize));
        }

        /**
         * @param networkData NetworkData content of cloud-init, base64 is supported (string)
         * 
         * @return builder
         * 
         */
        public Builder networkData(@Nullable Output<String> networkData) {
            $.networkData = networkData;
            return this;
        }

        /**
         * @param networkData NetworkData content of cloud-init, base64 is supported (string)
         * 
         * @return builder
         * 
         */
        public Builder networkData(String networkData) {
            return networkData(Output.of(networkData));
        }

        /**
         * @param networkInfo A JSON string specifying info for the networks e.g. `{\&#34;interfaces\&#34;:[{\&#34;networkName\&#34;:\&#34;harvester-public/vlan1\&#34;},{\&#34;networkName\&#34;:\&#34;harvester-public/vlan2\&#34;}]}` (string)
         * 
         * @return builder
         * 
         */
        public Builder networkInfo(@Nullable Output<String> networkInfo) {
            $.networkInfo = networkInfo;
            return this;
        }

        /**
         * @param networkInfo A JSON string specifying info for the networks e.g. `{\&#34;interfaces\&#34;:[{\&#34;networkName\&#34;:\&#34;harvester-public/vlan1\&#34;},{\&#34;networkName\&#34;:\&#34;harvester-public/vlan2\&#34;}]}` (string)
         * 
         * @return builder
         * 
         */
        public Builder networkInfo(String networkInfo) {
            return networkInfo(Output.of(networkInfo));
        }

        /**
         * @param networkModel Use `network_info` instead
         * 
         * @return builder
         * 
         * @deprecated
         * Use network_info instead
         * 
         */
        @Deprecated /* Use network_info instead */
        public Builder networkModel(@Nullable Output<String> networkModel) {
            $.networkModel = networkModel;
            return this;
        }

        /**
         * @param networkModel Use `network_info` instead
         * 
         * @return builder
         * 
         * @deprecated
         * Use network_info instead
         * 
         */
        @Deprecated /* Use network_info instead */
        public Builder networkModel(String networkModel) {
            return networkModel(Output.of(networkModel));
        }

        /**
         * @param networkName Use `network_info` instead
         * 
         * @return builder
         * 
         * @deprecated
         * Use network_info instead
         * 
         */
        @Deprecated /* Use network_info instead */
        public Builder networkName(@Nullable Output<String> networkName) {
            $.networkName = networkName;
            return this;
        }

        /**
         * @param networkName Use `network_info` instead
         * 
         * @return builder
         * 
         * @deprecated
         * Use network_info instead
         * 
         */
        @Deprecated /* Use network_info instead */
        public Builder networkName(String networkName) {
            return networkName(Output.of(networkName));
        }

        /**
         * @param sshPassword SSH password (string)
         * 
         * @return builder
         * 
         */
        public Builder sshPassword(@Nullable Output<String> sshPassword) {
            $.sshPassword = sshPassword;
            return this;
        }

        /**
         * @param sshPassword SSH password (string)
         * 
         * @return builder
         * 
         */
        public Builder sshPassword(String sshPassword) {
            return sshPassword(Output.of(sshPassword));
        }

        /**
         * @param sshUser Set the name of the ssh user (string)
         * 
         * @return builder
         * 
         */
        public Builder sshUser(Output<String> sshUser) {
            $.sshUser = sshUser;
            return this;
        }

        /**
         * @param sshUser Set the name of the ssh user (string)
         * 
         * @return builder
         * 
         */
        public Builder sshUser(String sshUser) {
            return sshUser(Output.of(sshUser));
        }

        /**
         * @param userData UserData content of cloud-init, base64 is supported. If the image does not contain the qemu-guest-agent package, you must install and start qemu-guest-agent using userdata (string)
         * 
         * @return builder
         * 
         */
        public Builder userData(@Nullable Output<String> userData) {
            $.userData = userData;
            return this;
        }

        /**
         * @param userData UserData content of cloud-init, base64 is supported. If the image does not contain the qemu-guest-agent package, you must install and start qemu-guest-agent using userdata (string)
         * 
         * @return builder
         * 
         */
        public Builder userData(String userData) {
            return userData(Output.of(userData));
        }

        /**
         * @param vmAffinity Virtual machine affinity, only base64 format is supported. For Rancher v2.6.7 or above (string)
         * 
         * @return builder
         * 
         */
        public Builder vmAffinity(@Nullable Output<String> vmAffinity) {
            $.vmAffinity = vmAffinity;
            return this;
        }

        /**
         * @param vmAffinity Virtual machine affinity, only base64 format is supported. For Rancher v2.6.7 or above (string)
         * 
         * @return builder
         * 
         */
        public Builder vmAffinity(String vmAffinity) {
            return vmAffinity(Output.of(vmAffinity));
        }

        /**
         * @param vmNamespace Virtual machine namespace e.g. `default` (string)
         * 
         * @return builder
         * 
         */
        public Builder vmNamespace(Output<String> vmNamespace) {
            $.vmNamespace = vmNamespace;
            return this;
        }

        /**
         * @param vmNamespace Virtual machine namespace e.g. `default` (string)
         * 
         * @return builder
         * 
         */
        public Builder vmNamespace(String vmNamespace) {
            return vmNamespace(Output.of(vmNamespace));
        }

        public NodeTemplateHarvesterConfigArgs build() {
            $.sshUser = Objects.requireNonNull($.sshUser, "expected parameter 'sshUser' to be non-null");
            $.vmNamespace = Objects.requireNonNull($.vmNamespace, "expected parameter 'vmNamespace' to be non-null");
            return $;
        }
    }

}
