// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeTemplateOpenstackConfig {
    private @Nullable String activeTimeout;
    private @Nullable String applicationCredentialId;
    private @Nullable String applicationCredentialName;
    private @Nullable String applicationCredentialSecret;
    private String authUrl;
    private String availabilityZone;
    private @Nullable Boolean bootFromVolume;
    private @Nullable String cacert;
    private @Nullable Boolean configDrive;
    private @Nullable String domainId;
    private @Nullable String domainName;
    private @Nullable String endpointType;
    private @Nullable String flavorId;
    private @Nullable String flavorName;
    private @Nullable String floatingIpPool;
    private @Nullable String imageId;
    private @Nullable String imageName;
    private @Nullable Boolean insecure;
    private @Nullable String ipVersion;
    private @Nullable String keypairName;
    private @Nullable String netId;
    private @Nullable String netName;
    private @Nullable Boolean novaNetwork;
    private @Nullable String password;
    private @Nullable String privateKeyFile;
    private String region;
    private @Nullable String secGroups;
    private @Nullable String sshPort;
    private @Nullable String sshUser;
    private @Nullable String tenantId;
    private @Nullable String tenantName;
    private @Nullable String userDataFile;
    private @Nullable String username;
    private @Nullable String volumeDevicePath;
    private @Nullable String volumeId;
    private @Nullable String volumeName;
    private @Nullable String volumeSize;
    private @Nullable String volumeType;

    private NodeTemplateOpenstackConfig() {}
    public Optional<String> activeTimeout() {
        return Optional.ofNullable(this.activeTimeout);
    }
    public Optional<String> applicationCredentialId() {
        return Optional.ofNullable(this.applicationCredentialId);
    }
    public Optional<String> applicationCredentialName() {
        return Optional.ofNullable(this.applicationCredentialName);
    }
    public Optional<String> applicationCredentialSecret() {
        return Optional.ofNullable(this.applicationCredentialSecret);
    }
    public String authUrl() {
        return this.authUrl;
    }
    public String availabilityZone() {
        return this.availabilityZone;
    }
    public Optional<Boolean> bootFromVolume() {
        return Optional.ofNullable(this.bootFromVolume);
    }
    public Optional<String> cacert() {
        return Optional.ofNullable(this.cacert);
    }
    public Optional<Boolean> configDrive() {
        return Optional.ofNullable(this.configDrive);
    }
    public Optional<String> domainId() {
        return Optional.ofNullable(this.domainId);
    }
    public Optional<String> domainName() {
        return Optional.ofNullable(this.domainName);
    }
    public Optional<String> endpointType() {
        return Optional.ofNullable(this.endpointType);
    }
    public Optional<String> flavorId() {
        return Optional.ofNullable(this.flavorId);
    }
    public Optional<String> flavorName() {
        return Optional.ofNullable(this.flavorName);
    }
    public Optional<String> floatingIpPool() {
        return Optional.ofNullable(this.floatingIpPool);
    }
    public Optional<String> imageId() {
        return Optional.ofNullable(this.imageId);
    }
    public Optional<String> imageName() {
        return Optional.ofNullable(this.imageName);
    }
    public Optional<Boolean> insecure() {
        return Optional.ofNullable(this.insecure);
    }
    public Optional<String> ipVersion() {
        return Optional.ofNullable(this.ipVersion);
    }
    public Optional<String> keypairName() {
        return Optional.ofNullable(this.keypairName);
    }
    public Optional<String> netId() {
        return Optional.ofNullable(this.netId);
    }
    public Optional<String> netName() {
        return Optional.ofNullable(this.netName);
    }
    public Optional<Boolean> novaNetwork() {
        return Optional.ofNullable(this.novaNetwork);
    }
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    public Optional<String> privateKeyFile() {
        return Optional.ofNullable(this.privateKeyFile);
    }
    public String region() {
        return this.region;
    }
    public Optional<String> secGroups() {
        return Optional.ofNullable(this.secGroups);
    }
    public Optional<String> sshPort() {
        return Optional.ofNullable(this.sshPort);
    }
    public Optional<String> sshUser() {
        return Optional.ofNullable(this.sshUser);
    }
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    public Optional<String> tenantName() {
        return Optional.ofNullable(this.tenantName);
    }
    public Optional<String> userDataFile() {
        return Optional.ofNullable(this.userDataFile);
    }
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }
    public Optional<String> volumeDevicePath() {
        return Optional.ofNullable(this.volumeDevicePath);
    }
    public Optional<String> volumeId() {
        return Optional.ofNullable(this.volumeId);
    }
    public Optional<String> volumeName() {
        return Optional.ofNullable(this.volumeName);
    }
    public Optional<String> volumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }
    public Optional<String> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateOpenstackConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String activeTimeout;
        private @Nullable String applicationCredentialId;
        private @Nullable String applicationCredentialName;
        private @Nullable String applicationCredentialSecret;
        private String authUrl;
        private String availabilityZone;
        private @Nullable Boolean bootFromVolume;
        private @Nullable String cacert;
        private @Nullable Boolean configDrive;
        private @Nullable String domainId;
        private @Nullable String domainName;
        private @Nullable String endpointType;
        private @Nullable String flavorId;
        private @Nullable String flavorName;
        private @Nullable String floatingIpPool;
        private @Nullable String imageId;
        private @Nullable String imageName;
        private @Nullable Boolean insecure;
        private @Nullable String ipVersion;
        private @Nullable String keypairName;
        private @Nullable String netId;
        private @Nullable String netName;
        private @Nullable Boolean novaNetwork;
        private @Nullable String password;
        private @Nullable String privateKeyFile;
        private String region;
        private @Nullable String secGroups;
        private @Nullable String sshPort;
        private @Nullable String sshUser;
        private @Nullable String tenantId;
        private @Nullable String tenantName;
        private @Nullable String userDataFile;
        private @Nullable String username;
        private @Nullable String volumeDevicePath;
        private @Nullable String volumeId;
        private @Nullable String volumeName;
        private @Nullable String volumeSize;
        private @Nullable String volumeType;
        public Builder() {}
        public Builder(NodeTemplateOpenstackConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeTimeout = defaults.activeTimeout;
    	      this.applicationCredentialId = defaults.applicationCredentialId;
    	      this.applicationCredentialName = defaults.applicationCredentialName;
    	      this.applicationCredentialSecret = defaults.applicationCredentialSecret;
    	      this.authUrl = defaults.authUrl;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.bootFromVolume = defaults.bootFromVolume;
    	      this.cacert = defaults.cacert;
    	      this.configDrive = defaults.configDrive;
    	      this.domainId = defaults.domainId;
    	      this.domainName = defaults.domainName;
    	      this.endpointType = defaults.endpointType;
    	      this.flavorId = defaults.flavorId;
    	      this.flavorName = defaults.flavorName;
    	      this.floatingIpPool = defaults.floatingIpPool;
    	      this.imageId = defaults.imageId;
    	      this.imageName = defaults.imageName;
    	      this.insecure = defaults.insecure;
    	      this.ipVersion = defaults.ipVersion;
    	      this.keypairName = defaults.keypairName;
    	      this.netId = defaults.netId;
    	      this.netName = defaults.netName;
    	      this.novaNetwork = defaults.novaNetwork;
    	      this.password = defaults.password;
    	      this.privateKeyFile = defaults.privateKeyFile;
    	      this.region = defaults.region;
    	      this.secGroups = defaults.secGroups;
    	      this.sshPort = defaults.sshPort;
    	      this.sshUser = defaults.sshUser;
    	      this.tenantId = defaults.tenantId;
    	      this.tenantName = defaults.tenantName;
    	      this.userDataFile = defaults.userDataFile;
    	      this.username = defaults.username;
    	      this.volumeDevicePath = defaults.volumeDevicePath;
    	      this.volumeId = defaults.volumeId;
    	      this.volumeName = defaults.volumeName;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        @CustomType.Setter
        public Builder activeTimeout(@Nullable String activeTimeout) {

            this.activeTimeout = activeTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder applicationCredentialId(@Nullable String applicationCredentialId) {

            this.applicationCredentialId = applicationCredentialId;
            return this;
        }
        @CustomType.Setter
        public Builder applicationCredentialName(@Nullable String applicationCredentialName) {

            this.applicationCredentialName = applicationCredentialName;
            return this;
        }
        @CustomType.Setter
        public Builder applicationCredentialSecret(@Nullable String applicationCredentialSecret) {

            this.applicationCredentialSecret = applicationCredentialSecret;
            return this;
        }
        @CustomType.Setter
        public Builder authUrl(String authUrl) {
            if (authUrl == null) {
              throw new MissingRequiredPropertyException("NodeTemplateOpenstackConfig", "authUrl");
            }
            this.authUrl = authUrl;
            return this;
        }
        @CustomType.Setter
        public Builder availabilityZone(String availabilityZone) {
            if (availabilityZone == null) {
              throw new MissingRequiredPropertyException("NodeTemplateOpenstackConfig", "availabilityZone");
            }
            this.availabilityZone = availabilityZone;
            return this;
        }
        @CustomType.Setter
        public Builder bootFromVolume(@Nullable Boolean bootFromVolume) {

            this.bootFromVolume = bootFromVolume;
            return this;
        }
        @CustomType.Setter
        public Builder cacert(@Nullable String cacert) {

            this.cacert = cacert;
            return this;
        }
        @CustomType.Setter
        public Builder configDrive(@Nullable Boolean configDrive) {

            this.configDrive = configDrive;
            return this;
        }
        @CustomType.Setter
        public Builder domainId(@Nullable String domainId) {

            this.domainId = domainId;
            return this;
        }
        @CustomType.Setter
        public Builder domainName(@Nullable String domainName) {

            this.domainName = domainName;
            return this;
        }
        @CustomType.Setter
        public Builder endpointType(@Nullable String endpointType) {

            this.endpointType = endpointType;
            return this;
        }
        @CustomType.Setter
        public Builder flavorId(@Nullable String flavorId) {

            this.flavorId = flavorId;
            return this;
        }
        @CustomType.Setter
        public Builder flavorName(@Nullable String flavorName) {

            this.flavorName = flavorName;
            return this;
        }
        @CustomType.Setter
        public Builder floatingIpPool(@Nullable String floatingIpPool) {

            this.floatingIpPool = floatingIpPool;
            return this;
        }
        @CustomType.Setter
        public Builder imageId(@Nullable String imageId) {

            this.imageId = imageId;
            return this;
        }
        @CustomType.Setter
        public Builder imageName(@Nullable String imageName) {

            this.imageName = imageName;
            return this;
        }
        @CustomType.Setter
        public Builder insecure(@Nullable Boolean insecure) {

            this.insecure = insecure;
            return this;
        }
        @CustomType.Setter
        public Builder ipVersion(@Nullable String ipVersion) {

            this.ipVersion = ipVersion;
            return this;
        }
        @CustomType.Setter
        public Builder keypairName(@Nullable String keypairName) {

            this.keypairName = keypairName;
            return this;
        }
        @CustomType.Setter
        public Builder netId(@Nullable String netId) {

            this.netId = netId;
            return this;
        }
        @CustomType.Setter
        public Builder netName(@Nullable String netName) {

            this.netName = netName;
            return this;
        }
        @CustomType.Setter
        public Builder novaNetwork(@Nullable Boolean novaNetwork) {

            this.novaNetwork = novaNetwork;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {

            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder privateKeyFile(@Nullable String privateKeyFile) {

            this.privateKeyFile = privateKeyFile;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("NodeTemplateOpenstackConfig", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder secGroups(@Nullable String secGroups) {

            this.secGroups = secGroups;
            return this;
        }
        @CustomType.Setter
        public Builder sshPort(@Nullable String sshPort) {

            this.sshPort = sshPort;
            return this;
        }
        @CustomType.Setter
        public Builder sshUser(@Nullable String sshUser) {

            this.sshUser = sshUser;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(@Nullable String tenantId) {

            this.tenantId = tenantId;
            return this;
        }
        @CustomType.Setter
        public Builder tenantName(@Nullable String tenantName) {

            this.tenantName = tenantName;
            return this;
        }
        @CustomType.Setter
        public Builder userDataFile(@Nullable String userDataFile) {

            this.userDataFile = userDataFile;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {

            this.username = username;
            return this;
        }
        @CustomType.Setter
        public Builder volumeDevicePath(@Nullable String volumeDevicePath) {

            this.volumeDevicePath = volumeDevicePath;
            return this;
        }
        @CustomType.Setter
        public Builder volumeId(@Nullable String volumeId) {

            this.volumeId = volumeId;
            return this;
        }
        @CustomType.Setter
        public Builder volumeName(@Nullable String volumeName) {

            this.volumeName = volumeName;
            return this;
        }
        @CustomType.Setter
        public Builder volumeSize(@Nullable String volumeSize) {

            this.volumeSize = volumeSize;
            return this;
        }
        @CustomType.Setter
        public Builder volumeType(@Nullable String volumeType) {

            this.volumeType = volumeType;
            return this;
        }
        public NodeTemplateOpenstackConfig build() {
            final var _resultValue = new NodeTemplateOpenstackConfig();
            _resultValue.activeTimeout = activeTimeout;
            _resultValue.applicationCredentialId = applicationCredentialId;
            _resultValue.applicationCredentialName = applicationCredentialName;
            _resultValue.applicationCredentialSecret = applicationCredentialSecret;
            _resultValue.authUrl = authUrl;
            _resultValue.availabilityZone = availabilityZone;
            _resultValue.bootFromVolume = bootFromVolume;
            _resultValue.cacert = cacert;
            _resultValue.configDrive = configDrive;
            _resultValue.domainId = domainId;
            _resultValue.domainName = domainName;
            _resultValue.endpointType = endpointType;
            _resultValue.flavorId = flavorId;
            _resultValue.flavorName = flavorName;
            _resultValue.floatingIpPool = floatingIpPool;
            _resultValue.imageId = imageId;
            _resultValue.imageName = imageName;
            _resultValue.insecure = insecure;
            _resultValue.ipVersion = ipVersion;
            _resultValue.keypairName = keypairName;
            _resultValue.netId = netId;
            _resultValue.netName = netName;
            _resultValue.novaNetwork = novaNetwork;
            _resultValue.password = password;
            _resultValue.privateKeyFile = privateKeyFile;
            _resultValue.region = region;
            _resultValue.secGroups = secGroups;
            _resultValue.sshPort = sshPort;
            _resultValue.sshUser = sshUser;
            _resultValue.tenantId = tenantId;
            _resultValue.tenantName = tenantName;
            _resultValue.userDataFile = userDataFile;
            _resultValue.username = username;
            _resultValue.volumeDevicePath = volumeDevicePath;
            _resultValue.volumeId = volumeId;
            _resultValue.volumeName = volumeName;
            _resultValue.volumeSize = volumeSize;
            _resultValue.volumeType = volumeType;
            return _resultValue;
        }
    }
}
