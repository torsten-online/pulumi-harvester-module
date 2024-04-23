// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MachineConfigV2Amazonec2Config {
    /**
     * @return AWS Access Key
     * 
     */
    private @Nullable String accessKey;
    /**
     * @return AWS machine image
     * 
     */
    private String ami;
    /**
     * @return AWS spot instance duration in minutes (60, 120, 180, 240, 300, or 360)
     * 
     */
    private @Nullable String blockDurationMinutes;
    /**
     * @return AWS root device name
     * 
     */
    private @Nullable String deviceName;
    /**
     * @return Encrypt EBS volume
     * 
     */
    private @Nullable Boolean encryptEbsVolume;
    /**
     * @return Optional endpoint URL (hostname only or fully qualified URI)
     * 
     */
    private @Nullable String endpoint;
    /**
     * @return Enables or disables the HTTP metadata endpoint on your instances
     * 
     */
    private @Nullable String httpEndpoint;
    /**
     * @return The state of token usage for your instance metadata requests
     * 
     */
    private @Nullable String httpTokens;
    /**
     * @return AWS IAM Instance Profile
     * 
     */
    private @Nullable String iamInstanceProfile;
    /**
     * @return Disable SSL when sending requests
     * 
     */
    private @Nullable Boolean insecureTransport;
    /**
     * @return AWS instance type
     * 
     */
    private @Nullable String instanceType;
    /**
     * @return Custom KMS key ID using the AWS Managed CMK
     * 
     */
    private @Nullable String kmsKey;
    /**
     * @return Set this flag to enable CloudWatch monitoring
     * 
     */
    private @Nullable Boolean monitoring;
    /**
     * @return Make the specified port number accessible from the Internet
     * 
     */
    private @Nullable List<String> openPorts;
    /**
     * @return Only use a private IP address
     * 
     */
    private @Nullable Boolean privateAddressOnly;
    /**
     * @return AWS Region
     * 
     */
    private String region;
    /**
     * @return Set this flag to request spot instance
     * 
     */
    private @Nullable Boolean requestSpotInstance;
    /**
     * @return Set retry count for recoverable failures (use -1 to disable)
     * 
     */
    private @Nullable String retries;
    /**
     * @return AWS root disk size (in GB)
     * 
     */
    private @Nullable String rootSize;
    /**
     * @return AWS Secret Key
     * 
     */
    private @Nullable String secretKey;
    /**
     * @return Skip adding default rules to security groups
     * 
     */
    private @Nullable Boolean securityGroupReadonly;
    /**
     * @return AWS VPC security group
     * 
     */
    private List<String> securityGroups;
    /**
     * @return AWS Session Token
     * 
     */
    private @Nullable String sessionToken;
    /**
     * @return AWS spot instance bid price (in dollar)
     * 
     */
    private @Nullable String spotPrice;
    /**
     * @return SSH Key file contents for sshKeyContents
     * 
     */
    private @Nullable String sshKeyContents;
    /**
     * @return Set the name of the ssh user
     * 
     */
    private @Nullable String sshUser;
    /**
     * @return AWS VPC subnet id
     * 
     */
    private String subnetId;
    /**
     * @return AWS Tags (e.g. key1,value1,key2,value2)
     * 
     */
    private @Nullable String tags;
    /**
     * @return Create an EBS optimized instance
     * 
     */
    private @Nullable Boolean useEbsOptimizedInstance;
    /**
     * @return Force the usage of private IP address
     * 
     */
    private @Nullable Boolean usePrivateAddress;
    /**
     * @return Path to file with cloud-init user data
     * 
     */
    private @Nullable String userdata;
    /**
     * @return Amazon EBS volume type
     * 
     */
    private @Nullable String volumeType;
    /**
     * @return AWS VPC id
     * 
     */
    private String vpcId;
    /**
     * @return AWS zone for instance (i.e. a,b,c,d,e)
     * 
     */
    private String zone;

    private MachineConfigV2Amazonec2Config() {}
    /**
     * @return AWS Access Key
     * 
     */
    public Optional<String> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }
    /**
     * @return AWS machine image
     * 
     */
    public String ami() {
        return this.ami;
    }
    /**
     * @return AWS spot instance duration in minutes (60, 120, 180, 240, 300, or 360)
     * 
     */
    public Optional<String> blockDurationMinutes() {
        return Optional.ofNullable(this.blockDurationMinutes);
    }
    /**
     * @return AWS root device name
     * 
     */
    public Optional<String> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    /**
     * @return Encrypt EBS volume
     * 
     */
    public Optional<Boolean> encryptEbsVolume() {
        return Optional.ofNullable(this.encryptEbsVolume);
    }
    /**
     * @return Optional endpoint URL (hostname only or fully qualified URI)
     * 
     */
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    /**
     * @return Enables or disables the HTTP metadata endpoint on your instances
     * 
     */
    public Optional<String> httpEndpoint() {
        return Optional.ofNullable(this.httpEndpoint);
    }
    /**
     * @return The state of token usage for your instance metadata requests
     * 
     */
    public Optional<String> httpTokens() {
        return Optional.ofNullable(this.httpTokens);
    }
    /**
     * @return AWS IAM Instance Profile
     * 
     */
    public Optional<String> iamInstanceProfile() {
        return Optional.ofNullable(this.iamInstanceProfile);
    }
    /**
     * @return Disable SSL when sending requests
     * 
     */
    public Optional<Boolean> insecureTransport() {
        return Optional.ofNullable(this.insecureTransport);
    }
    /**
     * @return AWS instance type
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return Custom KMS key ID using the AWS Managed CMK
     * 
     */
    public Optional<String> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }
    /**
     * @return Set this flag to enable CloudWatch monitoring
     * 
     */
    public Optional<Boolean> monitoring() {
        return Optional.ofNullable(this.monitoring);
    }
    /**
     * @return Make the specified port number accessible from the Internet
     * 
     */
    public List<String> openPorts() {
        return this.openPorts == null ? List.of() : this.openPorts;
    }
    /**
     * @return Only use a private IP address
     * 
     */
    public Optional<Boolean> privateAddressOnly() {
        return Optional.ofNullable(this.privateAddressOnly);
    }
    /**
     * @return AWS Region
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Set this flag to request spot instance
     * 
     */
    public Optional<Boolean> requestSpotInstance() {
        return Optional.ofNullable(this.requestSpotInstance);
    }
    /**
     * @return Set retry count for recoverable failures (use -1 to disable)
     * 
     */
    public Optional<String> retries() {
        return Optional.ofNullable(this.retries);
    }
    /**
     * @return AWS root disk size (in GB)
     * 
     */
    public Optional<String> rootSize() {
        return Optional.ofNullable(this.rootSize);
    }
    /**
     * @return AWS Secret Key
     * 
     */
    public Optional<String> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }
    /**
     * @return Skip adding default rules to security groups
     * 
     */
    public Optional<Boolean> securityGroupReadonly() {
        return Optional.ofNullable(this.securityGroupReadonly);
    }
    /**
     * @return AWS VPC security group
     * 
     */
    public List<String> securityGroups() {
        return this.securityGroups;
    }
    /**
     * @return AWS Session Token
     * 
     */
    public Optional<String> sessionToken() {
        return Optional.ofNullable(this.sessionToken);
    }
    /**
     * @return AWS spot instance bid price (in dollar)
     * 
     */
    public Optional<String> spotPrice() {
        return Optional.ofNullable(this.spotPrice);
    }
    /**
     * @return SSH Key file contents for sshKeyContents
     * 
     */
    public Optional<String> sshKeyContents() {
        return Optional.ofNullable(this.sshKeyContents);
    }
    /**
     * @return Set the name of the ssh user
     * 
     */
    public Optional<String> sshUser() {
        return Optional.ofNullable(this.sshUser);
    }
    /**
     * @return AWS VPC subnet id
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }
    /**
     * @return AWS Tags (e.g. key1,value1,key2,value2)
     * 
     */
    public Optional<String> tags() {
        return Optional.ofNullable(this.tags);
    }
    /**
     * @return Create an EBS optimized instance
     * 
     */
    public Optional<Boolean> useEbsOptimizedInstance() {
        return Optional.ofNullable(this.useEbsOptimizedInstance);
    }
    /**
     * @return Force the usage of private IP address
     * 
     */
    public Optional<Boolean> usePrivateAddress() {
        return Optional.ofNullable(this.usePrivateAddress);
    }
    /**
     * @return Path to file with cloud-init user data
     * 
     */
    public Optional<String> userdata() {
        return Optional.ofNullable(this.userdata);
    }
    /**
     * @return Amazon EBS volume type
     * 
     */
    public Optional<String> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }
    /**
     * @return AWS VPC id
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return AWS zone for instance (i.e. a,b,c,d,e)
     * 
     */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineConfigV2Amazonec2Config defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessKey;
        private String ami;
        private @Nullable String blockDurationMinutes;
        private @Nullable String deviceName;
        private @Nullable Boolean encryptEbsVolume;
        private @Nullable String endpoint;
        private @Nullable String httpEndpoint;
        private @Nullable String httpTokens;
        private @Nullable String iamInstanceProfile;
        private @Nullable Boolean insecureTransport;
        private @Nullable String instanceType;
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
        private @Nullable String sshKeyContents;
        private @Nullable String sshUser;
        private String subnetId;
        private @Nullable String tags;
        private @Nullable Boolean useEbsOptimizedInstance;
        private @Nullable Boolean usePrivateAddress;
        private @Nullable String userdata;
        private @Nullable String volumeType;
        private String vpcId;
        private String zone;
        public Builder() {}
        public Builder(MachineConfigV2Amazonec2Config defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.ami = defaults.ami;
    	      this.blockDurationMinutes = defaults.blockDurationMinutes;
    	      this.deviceName = defaults.deviceName;
    	      this.encryptEbsVolume = defaults.encryptEbsVolume;
    	      this.endpoint = defaults.endpoint;
    	      this.httpEndpoint = defaults.httpEndpoint;
    	      this.httpTokens = defaults.httpTokens;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.insecureTransport = defaults.insecureTransport;
    	      this.instanceType = defaults.instanceType;
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
    	      this.sshKeyContents = defaults.sshKeyContents;
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

        @CustomType.Setter
        public Builder accessKey(@Nullable String accessKey) {

            this.accessKey = accessKey;
            return this;
        }
        @CustomType.Setter
        public Builder ami(String ami) {
            if (ami == null) {
              throw new MissingRequiredPropertyException("MachineConfigV2Amazonec2Config", "ami");
            }
            this.ami = ami;
            return this;
        }
        @CustomType.Setter
        public Builder blockDurationMinutes(@Nullable String blockDurationMinutes) {

            this.blockDurationMinutes = blockDurationMinutes;
            return this;
        }
        @CustomType.Setter
        public Builder deviceName(@Nullable String deviceName) {

            this.deviceName = deviceName;
            return this;
        }
        @CustomType.Setter
        public Builder encryptEbsVolume(@Nullable Boolean encryptEbsVolume) {

            this.encryptEbsVolume = encryptEbsVolume;
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(@Nullable String endpoint) {

            this.endpoint = endpoint;
            return this;
        }
        @CustomType.Setter
        public Builder httpEndpoint(@Nullable String httpEndpoint) {

            this.httpEndpoint = httpEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder httpTokens(@Nullable String httpTokens) {

            this.httpTokens = httpTokens;
            return this;
        }
        @CustomType.Setter
        public Builder iamInstanceProfile(@Nullable String iamInstanceProfile) {

            this.iamInstanceProfile = iamInstanceProfile;
            return this;
        }
        @CustomType.Setter
        public Builder insecureTransport(@Nullable Boolean insecureTransport) {

            this.insecureTransport = insecureTransport;
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(@Nullable String instanceType) {

            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKey(@Nullable String kmsKey) {

            this.kmsKey = kmsKey;
            return this;
        }
        @CustomType.Setter
        public Builder monitoring(@Nullable Boolean monitoring) {

            this.monitoring = monitoring;
            return this;
        }
        @CustomType.Setter
        public Builder openPorts(@Nullable List<String> openPorts) {

            this.openPorts = openPorts;
            return this;
        }
        public Builder openPorts(String... openPorts) {
            return openPorts(List.of(openPorts));
        }
        @CustomType.Setter
        public Builder privateAddressOnly(@Nullable Boolean privateAddressOnly) {

            this.privateAddressOnly = privateAddressOnly;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("MachineConfigV2Amazonec2Config", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder requestSpotInstance(@Nullable Boolean requestSpotInstance) {

            this.requestSpotInstance = requestSpotInstance;
            return this;
        }
        @CustomType.Setter
        public Builder retries(@Nullable String retries) {

            this.retries = retries;
            return this;
        }
        @CustomType.Setter
        public Builder rootSize(@Nullable String rootSize) {

            this.rootSize = rootSize;
            return this;
        }
        @CustomType.Setter
        public Builder secretKey(@Nullable String secretKey) {

            this.secretKey = secretKey;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupReadonly(@Nullable Boolean securityGroupReadonly) {

            this.securityGroupReadonly = securityGroupReadonly;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroups(List<String> securityGroups) {
            if (securityGroups == null) {
              throw new MissingRequiredPropertyException("MachineConfigV2Amazonec2Config", "securityGroups");
            }
            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        @CustomType.Setter
        public Builder sessionToken(@Nullable String sessionToken) {

            this.sessionToken = sessionToken;
            return this;
        }
        @CustomType.Setter
        public Builder spotPrice(@Nullable String spotPrice) {

            this.spotPrice = spotPrice;
            return this;
        }
        @CustomType.Setter
        public Builder sshKeyContents(@Nullable String sshKeyContents) {

            this.sshKeyContents = sshKeyContents;
            return this;
        }
        @CustomType.Setter
        public Builder sshUser(@Nullable String sshUser) {

            this.sshUser = sshUser;
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            if (subnetId == null) {
              throw new MissingRequiredPropertyException("MachineConfigV2Amazonec2Config", "subnetId");
            }
            this.subnetId = subnetId;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable String tags) {

            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder useEbsOptimizedInstance(@Nullable Boolean useEbsOptimizedInstance) {

            this.useEbsOptimizedInstance = useEbsOptimizedInstance;
            return this;
        }
        @CustomType.Setter
        public Builder usePrivateAddress(@Nullable Boolean usePrivateAddress) {

            this.usePrivateAddress = usePrivateAddress;
            return this;
        }
        @CustomType.Setter
        public Builder userdata(@Nullable String userdata) {

            this.userdata = userdata;
            return this;
        }
        @CustomType.Setter
        public Builder volumeType(@Nullable String volumeType) {

            this.volumeType = volumeType;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("MachineConfigV2Amazonec2Config", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        @CustomType.Setter
        public Builder zone(String zone) {
            if (zone == null) {
              throw new MissingRequiredPropertyException("MachineConfigV2Amazonec2Config", "zone");
            }
            this.zone = zone;
            return this;
        }
        public MachineConfigV2Amazonec2Config build() {
            final var _resultValue = new MachineConfigV2Amazonec2Config();
            _resultValue.accessKey = accessKey;
            _resultValue.ami = ami;
            _resultValue.blockDurationMinutes = blockDurationMinutes;
            _resultValue.deviceName = deviceName;
            _resultValue.encryptEbsVolume = encryptEbsVolume;
            _resultValue.endpoint = endpoint;
            _resultValue.httpEndpoint = httpEndpoint;
            _resultValue.httpTokens = httpTokens;
            _resultValue.iamInstanceProfile = iamInstanceProfile;
            _resultValue.insecureTransport = insecureTransport;
            _resultValue.instanceType = instanceType;
            _resultValue.kmsKey = kmsKey;
            _resultValue.monitoring = monitoring;
            _resultValue.openPorts = openPorts;
            _resultValue.privateAddressOnly = privateAddressOnly;
            _resultValue.region = region;
            _resultValue.requestSpotInstance = requestSpotInstance;
            _resultValue.retries = retries;
            _resultValue.rootSize = rootSize;
            _resultValue.secretKey = secretKey;
            _resultValue.securityGroupReadonly = securityGroupReadonly;
            _resultValue.securityGroups = securityGroups;
            _resultValue.sessionToken = sessionToken;
            _resultValue.spotPrice = spotPrice;
            _resultValue.sshKeyContents = sshKeyContents;
            _resultValue.sshUser = sshUser;
            _resultValue.subnetId = subnetId;
            _resultValue.tags = tags;
            _resultValue.useEbsOptimizedInstance = useEbsOptimizedInstance;
            _resultValue.usePrivateAddress = usePrivateAddress;
            _resultValue.userdata = userdata;
            _resultValue.volumeType = volumeType;
            _resultValue.vpcId = vpcId;
            _resultValue.zone = zone;
            return _resultValue;
        }
    }
}
