// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeTemplateAmazonec2Config {
    /**
     * @return AWS access key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    private final @Nullable String accessKey;
    /**
     * @return AWS machine image (string)
     * 
     */
    private final String ami;
    /**
     * @return AWS spot instance duration in minutes (60, 120, 180, 240, 300, or 360). Default `0` (string)
     * 
     */
    private final @Nullable String blockDurationMinutes;
    /**
     * @return AWS root device name. Default `/dev/sda1` (string)
     * 
     */
    private final @Nullable String deviceName;
    /**
     * @return Encrypt EBS volume. Default `false` (bool)
     * 
     */
    private final @Nullable Boolean encryptEbsVolume;
    /**
     * @return Optional endpoint URL (hostname only or fully qualified URI) (string)
     * 
     */
    private final @Nullable String endpoint;
    /**
     * @return AWS IAM Instance Profile (string)
     * 
     */
    private final @Nullable String iamInstanceProfile;
    /**
     * @return Disable SSL when sending requests (bool)
     * 
     */
    private final @Nullable Boolean insecureTransport;
    /**
     * @return Specifies the Linode Instance type which determines CPU, memory, disk size, etc. Default `g6-standard-4` (string)
     * 
     */
    private final @Nullable String instanceType;
    /**
     * @return OpenStack keypair to use to SSH to the instance (string)
     * 
     */
    private final @Nullable String keypairName;
    /**
     * @return Custom KMS key ID using the AWS Managed CMK (string)
     * 
     */
    private final @Nullable String kmsKey;
    /**
     * @return Enable monitoring for droplet. Default `false` (bool)
     * 
     */
    private final @Nullable Boolean monitoring;
    /**
     * @return Make the specified port number accessible from the Internet. (list)
     * 
     */
    private final @Nullable List<String> openPorts;
    /**
     * @return Only use a private IP address. Default `false` (bool)
     * 
     */
    private final @Nullable Boolean privateAddressOnly;
    /**
     * @return OpenStack region name (string)
     * 
     */
    private final String region;
    /**
     * @return Set this flag to request spot instance. Default `false` (bool)
     * 
     */
    private final @Nullable Boolean requestSpotInstance;
    /**
     * @return Set retry count for recoverable failures (use -1 to disable). Default `5` (string)
     * 
     */
    private final @Nullable String retries;
    /**
     * @return AWS root disk size (in GB). Default `16` (string)
     * 
     */
    private final @Nullable String rootSize;
    /**
     * @return AWS secret key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    private final @Nullable String secretKey;
    /**
     * @return Skip adding default rules to security groups (bool)
     * 
     */
    private final @Nullable Boolean securityGroupReadonly;
    /**
     * @return AWS VPC security group. (list)
     * 
     */
    private final List<String> securityGroups;
    /**
     * @return AWS Session Token (string)
     * 
     */
    private final @Nullable String sessionToken;
    /**
     * @return AWS spot instance bid price (in dollar). Default `0.50` (string)
     * 
     */
    private final @Nullable String spotPrice;
    /**
     * @return SSH Key for Instance (string)
     * 
     */
    private final @Nullable String sshKeypath;
    /**
     * @return If using a non-B2D image you can specify the ssh user. Default `docker`. From Rancher v2.3.3 (string)
     * 
     */
    private final @Nullable String sshUser;
    /**
     * @return AWS VPC subnet id (string)
     * 
     */
    private final String subnetId;
    /**
     * @return vSphere tags id e.g. `urn:xxx`. From Rancher v2.3.3 (list)
     * 
     */
    private final @Nullable String tags;
    /**
     * @return Create an EBS optimized instance. Default `false` (bool)
     * 
     */
    private final @Nullable Boolean useEbsOptimizedInstance;
    /**
     * @return Force the usage of private IP address. Default `false` (bool)
     * 
     */
    private final @Nullable Boolean usePrivateAddress;
    /**
     * @return Path to file with cloud-init user-data (string)
     * 
     */
    private final @Nullable String userdata;
    /**
     * @return OpenStack volume type. Required when `boot_from_volume` is `true` and openstack cloud does not have a default volume type (string)
     * 
     */
    private final @Nullable String volumeType;
    /**
     * @return AWS VPC id. (string)
     * 
     */
    private final String vpcId;
    /**
     * @return AWS zone for instance (i.e. a,b,c,d,e) (string)
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private NodeTemplateAmazonec2Config(
        @CustomType.Parameter("accessKey") @Nullable String accessKey,
        @CustomType.Parameter("ami") String ami,
        @CustomType.Parameter("blockDurationMinutes") @Nullable String blockDurationMinutes,
        @CustomType.Parameter("deviceName") @Nullable String deviceName,
        @CustomType.Parameter("encryptEbsVolume") @Nullable Boolean encryptEbsVolume,
        @CustomType.Parameter("endpoint") @Nullable String endpoint,
        @CustomType.Parameter("iamInstanceProfile") @Nullable String iamInstanceProfile,
        @CustomType.Parameter("insecureTransport") @Nullable Boolean insecureTransport,
        @CustomType.Parameter("instanceType") @Nullable String instanceType,
        @CustomType.Parameter("keypairName") @Nullable String keypairName,
        @CustomType.Parameter("kmsKey") @Nullable String kmsKey,
        @CustomType.Parameter("monitoring") @Nullable Boolean monitoring,
        @CustomType.Parameter("openPorts") @Nullable List<String> openPorts,
        @CustomType.Parameter("privateAddressOnly") @Nullable Boolean privateAddressOnly,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("requestSpotInstance") @Nullable Boolean requestSpotInstance,
        @CustomType.Parameter("retries") @Nullable String retries,
        @CustomType.Parameter("rootSize") @Nullable String rootSize,
        @CustomType.Parameter("secretKey") @Nullable String secretKey,
        @CustomType.Parameter("securityGroupReadonly") @Nullable Boolean securityGroupReadonly,
        @CustomType.Parameter("securityGroups") List<String> securityGroups,
        @CustomType.Parameter("sessionToken") @Nullable String sessionToken,
        @CustomType.Parameter("spotPrice") @Nullable String spotPrice,
        @CustomType.Parameter("sshKeypath") @Nullable String sshKeypath,
        @CustomType.Parameter("sshUser") @Nullable String sshUser,
        @CustomType.Parameter("subnetId") String subnetId,
        @CustomType.Parameter("tags") @Nullable String tags,
        @CustomType.Parameter("useEbsOptimizedInstance") @Nullable Boolean useEbsOptimizedInstance,
        @CustomType.Parameter("usePrivateAddress") @Nullable Boolean usePrivateAddress,
        @CustomType.Parameter("userdata") @Nullable String userdata,
        @CustomType.Parameter("volumeType") @Nullable String volumeType,
        @CustomType.Parameter("vpcId") String vpcId,
        @CustomType.Parameter("zone") String zone) {
        this.accessKey = accessKey;
        this.ami = ami;
        this.blockDurationMinutes = blockDurationMinutes;
        this.deviceName = deviceName;
        this.encryptEbsVolume = encryptEbsVolume;
        this.endpoint = endpoint;
        this.iamInstanceProfile = iamInstanceProfile;
        this.insecureTransport = insecureTransport;
        this.instanceType = instanceType;
        this.keypairName = keypairName;
        this.kmsKey = kmsKey;
        this.monitoring = monitoring;
        this.openPorts = openPorts;
        this.privateAddressOnly = privateAddressOnly;
        this.region = region;
        this.requestSpotInstance = requestSpotInstance;
        this.retries = retries;
        this.rootSize = rootSize;
        this.secretKey = secretKey;
        this.securityGroupReadonly = securityGroupReadonly;
        this.securityGroups = securityGroups;
        this.sessionToken = sessionToken;
        this.spotPrice = spotPrice;
        this.sshKeypath = sshKeypath;
        this.sshUser = sshUser;
        this.subnetId = subnetId;
        this.tags = tags;
        this.useEbsOptimizedInstance = useEbsOptimizedInstance;
        this.usePrivateAddress = usePrivateAddress;
        this.userdata = userdata;
        this.volumeType = volumeType;
        this.vpcId = vpcId;
        this.zone = zone;
    }

    /**
     * @return AWS access key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    public Optional<String> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }
    /**
     * @return AWS machine image (string)
     * 
     */
    public String ami() {
        return this.ami;
    }
    /**
     * @return AWS spot instance duration in minutes (60, 120, 180, 240, 300, or 360). Default `0` (string)
     * 
     */
    public Optional<String> blockDurationMinutes() {
        return Optional.ofNullable(this.blockDurationMinutes);
    }
    /**
     * @return AWS root device name. Default `/dev/sda1` (string)
     * 
     */
    public Optional<String> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    /**
     * @return Encrypt EBS volume. Default `false` (bool)
     * 
     */
    public Optional<Boolean> encryptEbsVolume() {
        return Optional.ofNullable(this.encryptEbsVolume);
    }
    /**
     * @return Optional endpoint URL (hostname only or fully qualified URI) (string)
     * 
     */
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    /**
     * @return AWS IAM Instance Profile (string)
     * 
     */
    public Optional<String> iamInstanceProfile() {
        return Optional.ofNullable(this.iamInstanceProfile);
    }
    /**
     * @return Disable SSL when sending requests (bool)
     * 
     */
    public Optional<Boolean> insecureTransport() {
        return Optional.ofNullable(this.insecureTransport);
    }
    /**
     * @return Specifies the Linode Instance type which determines CPU, memory, disk size, etc. Default `g6-standard-4` (string)
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return OpenStack keypair to use to SSH to the instance (string)
     * 
     */
    public Optional<String> keypairName() {
        return Optional.ofNullable(this.keypairName);
    }
    /**
     * @return Custom KMS key ID using the AWS Managed CMK (string)
     * 
     */
    public Optional<String> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }
    /**
     * @return Enable monitoring for droplet. Default `false` (bool)
     * 
     */
    public Optional<Boolean> monitoring() {
        return Optional.ofNullable(this.monitoring);
    }
    /**
     * @return Make the specified port number accessible from the Internet. (list)
     * 
     */
    public List<String> openPorts() {
        return this.openPorts == null ? List.of() : this.openPorts;
    }
    /**
     * @return Only use a private IP address. Default `false` (bool)
     * 
     */
    public Optional<Boolean> privateAddressOnly() {
        return Optional.ofNullable(this.privateAddressOnly);
    }
    /**
     * @return OpenStack region name (string)
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Set this flag to request spot instance. Default `false` (bool)
     * 
     */
    public Optional<Boolean> requestSpotInstance() {
        return Optional.ofNullable(this.requestSpotInstance);
    }
    /**
     * @return Set retry count for recoverable failures (use -1 to disable). Default `5` (string)
     * 
     */
    public Optional<String> retries() {
        return Optional.ofNullable(this.retries);
    }
    /**
     * @return AWS root disk size (in GB). Default `16` (string)
     * 
     */
    public Optional<String> rootSize() {
        return Optional.ofNullable(this.rootSize);
    }
    /**
     * @return AWS secret key. Required on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    public Optional<String> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }
    /**
     * @return Skip adding default rules to security groups (bool)
     * 
     */
    public Optional<Boolean> securityGroupReadonly() {
        return Optional.ofNullable(this.securityGroupReadonly);
    }
    /**
     * @return AWS VPC security group. (list)
     * 
     */
    public List<String> securityGroups() {
        return this.securityGroups;
    }
    /**
     * @return AWS Session Token (string)
     * 
     */
    public Optional<String> sessionToken() {
        return Optional.ofNullable(this.sessionToken);
    }
    /**
     * @return AWS spot instance bid price (in dollar). Default `0.50` (string)
     * 
     */
    public Optional<String> spotPrice() {
        return Optional.ofNullable(this.spotPrice);
    }
    /**
     * @return SSH Key for Instance (string)
     * 
     */
    public Optional<String> sshKeypath() {
        return Optional.ofNullable(this.sshKeypath);
    }
    /**
     * @return If using a non-B2D image you can specify the ssh user. Default `docker`. From Rancher v2.3.3 (string)
     * 
     */
    public Optional<String> sshUser() {
        return Optional.ofNullable(this.sshUser);
    }
    /**
     * @return AWS VPC subnet id (string)
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }
    /**
     * @return vSphere tags id e.g. `urn:xxx`. From Rancher v2.3.3 (list)
     * 
     */
    public Optional<String> tags() {
        return Optional.ofNullable(this.tags);
    }
    /**
     * @return Create an EBS optimized instance. Default `false` (bool)
     * 
     */
    public Optional<Boolean> useEbsOptimizedInstance() {
        return Optional.ofNullable(this.useEbsOptimizedInstance);
    }
    /**
     * @return Force the usage of private IP address. Default `false` (bool)
     * 
     */
    public Optional<Boolean> usePrivateAddress() {
        return Optional.ofNullable(this.usePrivateAddress);
    }
    /**
     * @return Path to file with cloud-init user-data (string)
     * 
     */
    public Optional<String> userdata() {
        return Optional.ofNullable(this.userdata);
    }
    /**
     * @return OpenStack volume type. Required when `boot_from_volume` is `true` and openstack cloud does not have a default volume type (string)
     * 
     */
    public Optional<String> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }
    /**
     * @return AWS VPC id. (string)
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return AWS zone for instance (i.e. a,b,c,d,e) (string)
     * 
     */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateAmazonec2Config defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessKey;
        private String ami;
        private @Nullable String blockDurationMinutes;
        private @Nullable String deviceName;
        private @Nullable Boolean encryptEbsVolume;
        private @Nullable String endpoint;
        private @Nullable String iamInstanceProfile;
        private @Nullable Boolean insecureTransport;
        private @Nullable String instanceType;
        private @Nullable String keypairName;
        private @Nullable String kmsKey;
        private @Nullable Boolean monitoring;
        private @Nullable List<String> openPorts;
        private @Nullable Boolean privateAddressOnly;
        private String region;
        private @Nullable Boolean requestSpotInstance;
        private @Nullable String retries;
        private @Nullable String rootSize;
        private @Nullable String secretKey;
        private @Nullable Boolean securityGroupReadonly;
        private List<String> securityGroups;
        private @Nullable String sessionToken;
        private @Nullable String spotPrice;
        private @Nullable String sshKeypath;
        private @Nullable String sshUser;
        private String subnetId;
        private @Nullable String tags;
        private @Nullable Boolean useEbsOptimizedInstance;
        private @Nullable Boolean usePrivateAddress;
        private @Nullable String userdata;
        private @Nullable String volumeType;
        private String vpcId;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTemplateAmazonec2Config defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.ami = defaults.ami;
    	      this.blockDurationMinutes = defaults.blockDurationMinutes;
    	      this.deviceName = defaults.deviceName;
    	      this.encryptEbsVolume = defaults.encryptEbsVolume;
    	      this.endpoint = defaults.endpoint;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.insecureTransport = defaults.insecureTransport;
    	      this.instanceType = defaults.instanceType;
    	      this.keypairName = defaults.keypairName;
    	      this.kmsKey = defaults.kmsKey;
    	      this.monitoring = defaults.monitoring;
    	      this.openPorts = defaults.openPorts;
    	      this.privateAddressOnly = defaults.privateAddressOnly;
    	      this.region = defaults.region;
    	      this.requestSpotInstance = defaults.requestSpotInstance;
    	      this.retries = defaults.retries;
    	      this.rootSize = defaults.rootSize;
    	      this.secretKey = defaults.secretKey;
    	      this.securityGroupReadonly = defaults.securityGroupReadonly;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sessionToken = defaults.sessionToken;
    	      this.spotPrice = defaults.spotPrice;
    	      this.sshKeypath = defaults.sshKeypath;
    	      this.sshUser = defaults.sshUser;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.useEbsOptimizedInstance = defaults.useEbsOptimizedInstance;
    	      this.usePrivateAddress = defaults.usePrivateAddress;
    	      this.userdata = defaults.userdata;
    	      this.volumeType = defaults.volumeType;
    	      this.vpcId = defaults.vpcId;
    	      this.zone = defaults.zone;
        }

        public Builder accessKey(@Nullable String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public Builder ami(String ami) {
            this.ami = Objects.requireNonNull(ami);
            return this;
        }
        public Builder blockDurationMinutes(@Nullable String blockDurationMinutes) {
            this.blockDurationMinutes = blockDurationMinutes;
            return this;
        }
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder encryptEbsVolume(@Nullable Boolean encryptEbsVolume) {
            this.encryptEbsVolume = encryptEbsVolume;
            return this;
        }
        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder iamInstanceProfile(@Nullable String iamInstanceProfile) {
            this.iamInstanceProfile = iamInstanceProfile;
            return this;
        }
        public Builder insecureTransport(@Nullable Boolean insecureTransport) {
            this.insecureTransport = insecureTransport;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder keypairName(@Nullable String keypairName) {
            this.keypairName = keypairName;
            return this;
        }
        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }
        public Builder monitoring(@Nullable Boolean monitoring) {
            this.monitoring = monitoring;
            return this;
        }
        public Builder openPorts(@Nullable List<String> openPorts) {
            this.openPorts = openPorts;
            return this;
        }
        public Builder openPorts(String... openPorts) {
            return openPorts(List.of(openPorts));
        }
        public Builder privateAddressOnly(@Nullable Boolean privateAddressOnly) {
            this.privateAddressOnly = privateAddressOnly;
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder requestSpotInstance(@Nullable Boolean requestSpotInstance) {
            this.requestSpotInstance = requestSpotInstance;
            return this;
        }
        public Builder retries(@Nullable String retries) {
            this.retries = retries;
            return this;
        }
        public Builder rootSize(@Nullable String rootSize) {
            this.rootSize = rootSize;
            return this;
        }
        public Builder secretKey(@Nullable String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public Builder securityGroupReadonly(@Nullable Boolean securityGroupReadonly) {
            this.securityGroupReadonly = securityGroupReadonly;
            return this;
        }
        public Builder securityGroups(List<String> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder sessionToken(@Nullable String sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }
        public Builder spotPrice(@Nullable String spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }
        public Builder sshKeypath(@Nullable String sshKeypath) {
            this.sshKeypath = sshKeypath;
            return this;
        }
        public Builder sshUser(@Nullable String sshUser) {
            this.sshUser = sshUser;
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder tags(@Nullable String tags) {
            this.tags = tags;
            return this;
        }
        public Builder useEbsOptimizedInstance(@Nullable Boolean useEbsOptimizedInstance) {
            this.useEbsOptimizedInstance = useEbsOptimizedInstance;
            return this;
        }
        public Builder usePrivateAddress(@Nullable Boolean usePrivateAddress) {
            this.usePrivateAddress = usePrivateAddress;
            return this;
        }
        public Builder userdata(@Nullable String userdata) {
            this.userdata = userdata;
            return this;
        }
        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public NodeTemplateAmazonec2Config build() {
            return new NodeTemplateAmazonec2Config(accessKey, ami, blockDurationMinutes, deviceName, encryptEbsVolume, endpoint, iamInstanceProfile, insecureTransport, instanceType, keypairName, kmsKey, monitoring, openPorts, privateAddressOnly, region, requestSpotInstance, retries, rootSize, secretKey, securityGroupReadonly, securityGroups, sessionToken, spotPrice, sshKeypath, sshUser, subnetId, tags, useEbsOptimizedInstance, usePrivateAddress, userdata, volumeType, vpcId, zone);
        }
    }
}
