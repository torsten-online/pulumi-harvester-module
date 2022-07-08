// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeTemplateVsphereConfig {
    /**
     * @return vSphere URL for boot2docker iso image. Default `https://releases.rancher.com/os/latest/rancheros-vmware.iso` (string)
     * 
     */
    private final @Nullable String boot2dockerUrl;
    /**
     * @return vSphere vm configuration parameters (used for guestinfo) (list)
     * 
     */
    private final @Nullable List<String> cfgparams;
    /**
     * @return If you choose creation type vm (clone vm) a name of what vm you want to clone is required. From Rancher v2.3.3 (string)
     * 
     */
    private final @Nullable String cloneFrom;
    /**
     * @return Cloud Config YAML content to inject as user-data. From Rancher v2.3.3 (string)
     * 
     */
    private final @Nullable String cloudConfig;
    /**
     * @return vSphere cloud-init file or url to set in the guestinfo (string)
     * 
     */
    private final @Nullable String cloudinit;
    /**
     * @return If you choose to clone from a content library template specify the name of the library. From Rancher v2.3.3 (string)
     * 
     */
    private final @Nullable String contentLibrary;
    /**
     * @return vSphere CPU number for docker VM. Default `2` (string)
     * 
     */
    private final @Nullable String cpuCount;
    /**
     * @return Creation type when creating a new virtual machine. Supported values: vm, template, library, legacy. Default `legacy`. From Rancher v2.3.3 (string)
     * 
     */
    private final @Nullable String creationType;
    /**
     * @return vSphere custom attributes, format key/value e.g. `200=my custom value`. From Rancher v2.3.3 (List)
     * 
     */
    private final @Nullable List<String> customAttributes;
    /**
     * @return vSphere datacenter for docker VM (string)
     * 
     */
    private final @Nullable String datacenter;
    /**
     * @return vSphere datastore for docker VM (string)
     * 
     */
    private final @Nullable String datastore;
    /**
     * @return vSphere datastore cluster for virtual machine. From Rancher v2.3.3 (string)
     * 
     */
    private final @Nullable String datastoreCluster;
    /**
     * @return vSphere size of disk for docker VM (in MB). Default `20480` (string)
     * 
     */
    private final @Nullable String diskSize;
    /**
     * @return vSphere folder for the docker VM. This folder must already exist in the datacenter (string)
     * 
     */
    private final @Nullable String folder;
    /**
     * @return vSphere compute resource where the docker VM will be instantiated. This can be omitted if using a cluster with DRS (string)
     * 
     */
    private final @Nullable String hostsystem;
    /**
     * @return vSphere size of memory for docker VM (in MB). Default `2048` (string)
     * 
     */
    private final @Nullable String memorySize;
    /**
     * @return vSphere network where the docker VM will be attached (list)
     * 
     */
    private final @Nullable List<String> networks;
    /**
     * @return vSphere password. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    private final @Nullable String password;
    /**
     * @return vSphere resource pool for docker VM (string)
     * 
     */
    private final @Nullable String pool;
    /**
     * @return If using a non-B2D image you can specify the ssh password. Default `tcuser`. From Rancher v2.3.3 (string)
     * 
     */
    private final @Nullable String sshPassword;
    /**
     * @return If using a non-B2D image you can specify the ssh port. Default `22`. From Rancher v2.3.3 (string)
     * 
     */
    private final @Nullable String sshPort;
    /**
     * @return If using a non-B2D image you can specify the ssh user. Default `docker`. From Rancher v2.3.3 (string)
     * 
     */
    private final @Nullable String sshUser;
    /**
     * @return If using a non-B2D image the uploaded keys will need chown&#39;ed. Default `staff`. From Rancher v2.3.3 (string)
     * 
     */
    private final @Nullable String sshUserGroup;
    /**
     * @return vSphere tags id e.g. `urn:xxx`. From Rancher v2.3.3 (list)
     * 
     */
    private final @Nullable List<String> tags;
    /**
     * @return vSphere username. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    private final @Nullable String username;
    /**
     * @return vSphere vApp IP allocation policy. Supported values are: `dhcp`, `fixed`, `transient` and `fixedAllocated` (string)
     * 
     */
    private final @Nullable String vappIpAllocationPolicy;
    /**
     * @return vSphere vApp IP protocol for this deployment. Supported values are: `IPv4` and `IPv6` (string)
     * 
     */
    private final @Nullable String vappIpProtocol;
    /**
     * @return vSphere vApp properties (list)
     * 
     */
    private final @Nullable List<String> vappProperties;
    /**
     * @return vSphere OVF environment transports to use for properties. Supported values are: `iso` and `com.vmware.guestInfo` (string)
     * 
     */
    private final @Nullable String vappTransport;
    /**
     * @return vSphere IP/hostname for vCenter. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    private final @Nullable String vcenter;
    /**
     * @return vSphere Port for vCenter. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x. Default `443` (string)
     * 
     */
    private final @Nullable String vcenterPort;

    @CustomType.Constructor
    private NodeTemplateVsphereConfig(
        @CustomType.Parameter("boot2dockerUrl") @Nullable String boot2dockerUrl,
        @CustomType.Parameter("cfgparams") @Nullable List<String> cfgparams,
        @CustomType.Parameter("cloneFrom") @Nullable String cloneFrom,
        @CustomType.Parameter("cloudConfig") @Nullable String cloudConfig,
        @CustomType.Parameter("cloudinit") @Nullable String cloudinit,
        @CustomType.Parameter("contentLibrary") @Nullable String contentLibrary,
        @CustomType.Parameter("cpuCount") @Nullable String cpuCount,
        @CustomType.Parameter("creationType") @Nullable String creationType,
        @CustomType.Parameter("customAttributes") @Nullable List<String> customAttributes,
        @CustomType.Parameter("datacenter") @Nullable String datacenter,
        @CustomType.Parameter("datastore") @Nullable String datastore,
        @CustomType.Parameter("datastoreCluster") @Nullable String datastoreCluster,
        @CustomType.Parameter("diskSize") @Nullable String diskSize,
        @CustomType.Parameter("folder") @Nullable String folder,
        @CustomType.Parameter("hostsystem") @Nullable String hostsystem,
        @CustomType.Parameter("memorySize") @Nullable String memorySize,
        @CustomType.Parameter("networks") @Nullable List<String> networks,
        @CustomType.Parameter("password") @Nullable String password,
        @CustomType.Parameter("pool") @Nullable String pool,
        @CustomType.Parameter("sshPassword") @Nullable String sshPassword,
        @CustomType.Parameter("sshPort") @Nullable String sshPort,
        @CustomType.Parameter("sshUser") @Nullable String sshUser,
        @CustomType.Parameter("sshUserGroup") @Nullable String sshUserGroup,
        @CustomType.Parameter("tags") @Nullable List<String> tags,
        @CustomType.Parameter("username") @Nullable String username,
        @CustomType.Parameter("vappIpAllocationPolicy") @Nullable String vappIpAllocationPolicy,
        @CustomType.Parameter("vappIpProtocol") @Nullable String vappIpProtocol,
        @CustomType.Parameter("vappProperties") @Nullable List<String> vappProperties,
        @CustomType.Parameter("vappTransport") @Nullable String vappTransport,
        @CustomType.Parameter("vcenter") @Nullable String vcenter,
        @CustomType.Parameter("vcenterPort") @Nullable String vcenterPort) {
        this.boot2dockerUrl = boot2dockerUrl;
        this.cfgparams = cfgparams;
        this.cloneFrom = cloneFrom;
        this.cloudConfig = cloudConfig;
        this.cloudinit = cloudinit;
        this.contentLibrary = contentLibrary;
        this.cpuCount = cpuCount;
        this.creationType = creationType;
        this.customAttributes = customAttributes;
        this.datacenter = datacenter;
        this.datastore = datastore;
        this.datastoreCluster = datastoreCluster;
        this.diskSize = diskSize;
        this.folder = folder;
        this.hostsystem = hostsystem;
        this.memorySize = memorySize;
        this.networks = networks;
        this.password = password;
        this.pool = pool;
        this.sshPassword = sshPassword;
        this.sshPort = sshPort;
        this.sshUser = sshUser;
        this.sshUserGroup = sshUserGroup;
        this.tags = tags;
        this.username = username;
        this.vappIpAllocationPolicy = vappIpAllocationPolicy;
        this.vappIpProtocol = vappIpProtocol;
        this.vappProperties = vappProperties;
        this.vappTransport = vappTransport;
        this.vcenter = vcenter;
        this.vcenterPort = vcenterPort;
    }

    /**
     * @return vSphere URL for boot2docker iso image. Default `https://releases.rancher.com/os/latest/rancheros-vmware.iso` (string)
     * 
     */
    public Optional<String> boot2dockerUrl() {
        return Optional.ofNullable(this.boot2dockerUrl);
    }
    /**
     * @return vSphere vm configuration parameters (used for guestinfo) (list)
     * 
     */
    public List<String> cfgparams() {
        return this.cfgparams == null ? List.of() : this.cfgparams;
    }
    /**
     * @return If you choose creation type vm (clone vm) a name of what vm you want to clone is required. From Rancher v2.3.3 (string)
     * 
     */
    public Optional<String> cloneFrom() {
        return Optional.ofNullable(this.cloneFrom);
    }
    /**
     * @return Cloud Config YAML content to inject as user-data. From Rancher v2.3.3 (string)
     * 
     */
    public Optional<String> cloudConfig() {
        return Optional.ofNullable(this.cloudConfig);
    }
    /**
     * @return vSphere cloud-init file or url to set in the guestinfo (string)
     * 
     */
    public Optional<String> cloudinit() {
        return Optional.ofNullable(this.cloudinit);
    }
    /**
     * @return If you choose to clone from a content library template specify the name of the library. From Rancher v2.3.3 (string)
     * 
     */
    public Optional<String> contentLibrary() {
        return Optional.ofNullable(this.contentLibrary);
    }
    /**
     * @return vSphere CPU number for docker VM. Default `2` (string)
     * 
     */
    public Optional<String> cpuCount() {
        return Optional.ofNullable(this.cpuCount);
    }
    /**
     * @return Creation type when creating a new virtual machine. Supported values: vm, template, library, legacy. Default `legacy`. From Rancher v2.3.3 (string)
     * 
     */
    public Optional<String> creationType() {
        return Optional.ofNullable(this.creationType);
    }
    /**
     * @return vSphere custom attributes, format key/value e.g. `200=my custom value`. From Rancher v2.3.3 (List)
     * 
     */
    public List<String> customAttributes() {
        return this.customAttributes == null ? List.of() : this.customAttributes;
    }
    /**
     * @return vSphere datacenter for docker VM (string)
     * 
     */
    public Optional<String> datacenter() {
        return Optional.ofNullable(this.datacenter);
    }
    /**
     * @return vSphere datastore for docker VM (string)
     * 
     */
    public Optional<String> datastore() {
        return Optional.ofNullable(this.datastore);
    }
    /**
     * @return vSphere datastore cluster for virtual machine. From Rancher v2.3.3 (string)
     * 
     */
    public Optional<String> datastoreCluster() {
        return Optional.ofNullable(this.datastoreCluster);
    }
    /**
     * @return vSphere size of disk for docker VM (in MB). Default `20480` (string)
     * 
     */
    public Optional<String> diskSize() {
        return Optional.ofNullable(this.diskSize);
    }
    /**
     * @return vSphere folder for the docker VM. This folder must already exist in the datacenter (string)
     * 
     */
    public Optional<String> folder() {
        return Optional.ofNullable(this.folder);
    }
    /**
     * @return vSphere compute resource where the docker VM will be instantiated. This can be omitted if using a cluster with DRS (string)
     * 
     */
    public Optional<String> hostsystem() {
        return Optional.ofNullable(this.hostsystem);
    }
    /**
     * @return vSphere size of memory for docker VM (in MB). Default `2048` (string)
     * 
     */
    public Optional<String> memorySize() {
        return Optional.ofNullable(this.memorySize);
    }
    /**
     * @return vSphere network where the docker VM will be attached (list)
     * 
     */
    public List<String> networks() {
        return this.networks == null ? List.of() : this.networks;
    }
    /**
     * @return vSphere password. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return vSphere resource pool for docker VM (string)
     * 
     */
    public Optional<String> pool() {
        return Optional.ofNullable(this.pool);
    }
    /**
     * @return If using a non-B2D image you can specify the ssh password. Default `tcuser`. From Rancher v2.3.3 (string)
     * 
     */
    public Optional<String> sshPassword() {
        return Optional.ofNullable(this.sshPassword);
    }
    /**
     * @return If using a non-B2D image you can specify the ssh port. Default `22`. From Rancher v2.3.3 (string)
     * 
     */
    public Optional<String> sshPort() {
        return Optional.ofNullable(this.sshPort);
    }
    /**
     * @return If using a non-B2D image you can specify the ssh user. Default `docker`. From Rancher v2.3.3 (string)
     * 
     */
    public Optional<String> sshUser() {
        return Optional.ofNullable(this.sshUser);
    }
    /**
     * @return If using a non-B2D image the uploaded keys will need chown&#39;ed. Default `staff`. From Rancher v2.3.3 (string)
     * 
     */
    public Optional<String> sshUserGroup() {
        return Optional.ofNullable(this.sshUserGroup);
    }
    /**
     * @return vSphere tags id e.g. `urn:xxx`. From Rancher v2.3.3 (list)
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return vSphere username. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }
    /**
     * @return vSphere vApp IP allocation policy. Supported values are: `dhcp`, `fixed`, `transient` and `fixedAllocated` (string)
     * 
     */
    public Optional<String> vappIpAllocationPolicy() {
        return Optional.ofNullable(this.vappIpAllocationPolicy);
    }
    /**
     * @return vSphere vApp IP protocol for this deployment. Supported values are: `IPv4` and `IPv6` (string)
     * 
     */
    public Optional<String> vappIpProtocol() {
        return Optional.ofNullable(this.vappIpProtocol);
    }
    /**
     * @return vSphere vApp properties (list)
     * 
     */
    public List<String> vappProperties() {
        return this.vappProperties == null ? List.of() : this.vappProperties;
    }
    /**
     * @return vSphere OVF environment transports to use for properties. Supported values are: `iso` and `com.vmware.guestInfo` (string)
     * 
     */
    public Optional<String> vappTransport() {
        return Optional.ofNullable(this.vappTransport);
    }
    /**
     * @return vSphere IP/hostname for vCenter. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    public Optional<String> vcenter() {
        return Optional.ofNullable(this.vcenter);
    }
    /**
     * @return vSphere Port for vCenter. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x. Default `443` (string)
     * 
     */
    public Optional<String> vcenterPort() {
        return Optional.ofNullable(this.vcenterPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateVsphereConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String boot2dockerUrl;
        private @Nullable List<String> cfgparams;
        private @Nullable String cloneFrom;
        private @Nullable String cloudConfig;
        private @Nullable String cloudinit;
        private @Nullable String contentLibrary;
        private @Nullable String cpuCount;
        private @Nullable String creationType;
        private @Nullable List<String> customAttributes;
        private @Nullable String datacenter;
        private @Nullable String datastore;
        private @Nullable String datastoreCluster;
        private @Nullable String diskSize;
        private @Nullable String folder;
        private @Nullable String hostsystem;
        private @Nullable String memorySize;
        private @Nullable List<String> networks;
        private @Nullable String password;
        private @Nullable String pool;
        private @Nullable String sshPassword;
        private @Nullable String sshPort;
        private @Nullable String sshUser;
        private @Nullable String sshUserGroup;
        private @Nullable List<String> tags;
        private @Nullable String username;
        private @Nullable String vappIpAllocationPolicy;
        private @Nullable String vappIpProtocol;
        private @Nullable List<String> vappProperties;
        private @Nullable String vappTransport;
        private @Nullable String vcenter;
        private @Nullable String vcenterPort;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTemplateVsphereConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boot2dockerUrl = defaults.boot2dockerUrl;
    	      this.cfgparams = defaults.cfgparams;
    	      this.cloneFrom = defaults.cloneFrom;
    	      this.cloudConfig = defaults.cloudConfig;
    	      this.cloudinit = defaults.cloudinit;
    	      this.contentLibrary = defaults.contentLibrary;
    	      this.cpuCount = defaults.cpuCount;
    	      this.creationType = defaults.creationType;
    	      this.customAttributes = defaults.customAttributes;
    	      this.datacenter = defaults.datacenter;
    	      this.datastore = defaults.datastore;
    	      this.datastoreCluster = defaults.datastoreCluster;
    	      this.diskSize = defaults.diskSize;
    	      this.folder = defaults.folder;
    	      this.hostsystem = defaults.hostsystem;
    	      this.memorySize = defaults.memorySize;
    	      this.networks = defaults.networks;
    	      this.password = defaults.password;
    	      this.pool = defaults.pool;
    	      this.sshPassword = defaults.sshPassword;
    	      this.sshPort = defaults.sshPort;
    	      this.sshUser = defaults.sshUser;
    	      this.sshUserGroup = defaults.sshUserGroup;
    	      this.tags = defaults.tags;
    	      this.username = defaults.username;
    	      this.vappIpAllocationPolicy = defaults.vappIpAllocationPolicy;
    	      this.vappIpProtocol = defaults.vappIpProtocol;
    	      this.vappProperties = defaults.vappProperties;
    	      this.vappTransport = defaults.vappTransport;
    	      this.vcenter = defaults.vcenter;
    	      this.vcenterPort = defaults.vcenterPort;
        }

        public Builder boot2dockerUrl(@Nullable String boot2dockerUrl) {
            this.boot2dockerUrl = boot2dockerUrl;
            return this;
        }
        public Builder cfgparams(@Nullable List<String> cfgparams) {
            this.cfgparams = cfgparams;
            return this;
        }
        public Builder cfgparams(String... cfgparams) {
            return cfgparams(List.of(cfgparams));
        }
        public Builder cloneFrom(@Nullable String cloneFrom) {
            this.cloneFrom = cloneFrom;
            return this;
        }
        public Builder cloudConfig(@Nullable String cloudConfig) {
            this.cloudConfig = cloudConfig;
            return this;
        }
        public Builder cloudinit(@Nullable String cloudinit) {
            this.cloudinit = cloudinit;
            return this;
        }
        public Builder contentLibrary(@Nullable String contentLibrary) {
            this.contentLibrary = contentLibrary;
            return this;
        }
        public Builder cpuCount(@Nullable String cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        public Builder creationType(@Nullable String creationType) {
            this.creationType = creationType;
            return this;
        }
        public Builder customAttributes(@Nullable List<String> customAttributes) {
            this.customAttributes = customAttributes;
            return this;
        }
        public Builder customAttributes(String... customAttributes) {
            return customAttributes(List.of(customAttributes));
        }
        public Builder datacenter(@Nullable String datacenter) {
            this.datacenter = datacenter;
            return this;
        }
        public Builder datastore(@Nullable String datastore) {
            this.datastore = datastore;
            return this;
        }
        public Builder datastoreCluster(@Nullable String datastoreCluster) {
            this.datastoreCluster = datastoreCluster;
            return this;
        }
        public Builder diskSize(@Nullable String diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Builder folder(@Nullable String folder) {
            this.folder = folder;
            return this;
        }
        public Builder hostsystem(@Nullable String hostsystem) {
            this.hostsystem = hostsystem;
            return this;
        }
        public Builder memorySize(@Nullable String memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Builder networks(@Nullable List<String> networks) {
            this.networks = networks;
            return this;
        }
        public Builder networks(String... networks) {
            return networks(List.of(networks));
        }
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder pool(@Nullable String pool) {
            this.pool = pool;
            return this;
        }
        public Builder sshPassword(@Nullable String sshPassword) {
            this.sshPassword = sshPassword;
            return this;
        }
        public Builder sshPort(@Nullable String sshPort) {
            this.sshPort = sshPort;
            return this;
        }
        public Builder sshUser(@Nullable String sshUser) {
            this.sshUser = sshUser;
            return this;
        }
        public Builder sshUserGroup(@Nullable String sshUserGroup) {
            this.sshUserGroup = sshUserGroup;
            return this;
        }
        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        public Builder vappIpAllocationPolicy(@Nullable String vappIpAllocationPolicy) {
            this.vappIpAllocationPolicy = vappIpAllocationPolicy;
            return this;
        }
        public Builder vappIpProtocol(@Nullable String vappIpProtocol) {
            this.vappIpProtocol = vappIpProtocol;
            return this;
        }
        public Builder vappProperties(@Nullable List<String> vappProperties) {
            this.vappProperties = vappProperties;
            return this;
        }
        public Builder vappProperties(String... vappProperties) {
            return vappProperties(List.of(vappProperties));
        }
        public Builder vappTransport(@Nullable String vappTransport) {
            this.vappTransport = vappTransport;
            return this;
        }
        public Builder vcenter(@Nullable String vcenter) {
            this.vcenter = vcenter;
            return this;
        }
        public Builder vcenterPort(@Nullable String vcenterPort) {
            this.vcenterPort = vcenterPort;
            return this;
        }        public NodeTemplateVsphereConfig build() {
            return new NodeTemplateVsphereConfig(boot2dockerUrl, cfgparams, cloneFrom, cloudConfig, cloudinit, contentLibrary, cpuCount, creationType, customAttributes, datacenter, datastore, datastoreCluster, diskSize, folder, hostsystem, memorySize, networks, password, pool, sshPassword, sshPort, sshUser, sshUserGroup, tags, username, vappIpAllocationPolicy, vappIpProtocol, vappProperties, vappTransport, vcenter, vcenterPort);
        }
    }
}
