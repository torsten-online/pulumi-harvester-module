// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MachineConfigV2DigitaloceanConfig {
    /**
     * @return Digital Ocean access token. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    private @Nullable String accessToken;
    /**
     * @return Enable backups for droplet. Default `false` (bool)
     * 
     */
    private @Nullable Boolean backups;
    /**
     * @return Specifies the Linode Instance image which determines the OS distribution and base files. Default `linode/ubuntu18.04` (string)
     * 
     */
    private @Nullable String image;
    /**
     * @return Enable ipv6 for droplet. Default `false` (bool)
     * 
     */
    private @Nullable Boolean ipv6;
    /**
     * @return Enable monitoring for droplet. Default `false` (bool)
     * 
     */
    private @Nullable Boolean monitoring;
    /**
     * @return Enable private networking for droplet. Default `false` (bool)
     * 
     */
    private @Nullable Boolean privateNetworking;
    /**
     * @return OpenStack region name (string)
     * 
     */
    private @Nullable String region;
    /**
     * @return Digital Ocean size. Default `s-1vcpu-1gb` (string)
     * 
     */
    private @Nullable String size;
    /**
     * @return SSH private key contents (string)
     * 
     */
    private @Nullable String sshKeyContents;
    /**
     * @return SSH key fingerprint (string)
     * 
     */
    private @Nullable String sshKeyFingerprint;
    /**
     * @return If using a non-B2D image you can specify the ssh port. Default `22` (string)
     * 
     */
    private @Nullable String sshPort;
    /**
     * @return If using a non-B2D image you can specify the ssh user. Default `docker`. (string)
     * 
     */
    private @Nullable String sshUser;
    /**
     * @return vSphere tags id e.g. `urn:xxx` (list)
     * 
     */
    private @Nullable String tags;
    /**
     * @return Path to file with cloud-init user-data (string)
     * 
     */
    private @Nullable String userdata;

    private MachineConfigV2DigitaloceanConfig() {}
    /**
     * @return Digital Ocean access token. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    public Optional<String> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * @return Enable backups for droplet. Default `false` (bool)
     * 
     */
    public Optional<Boolean> backups() {
        return Optional.ofNullable(this.backups);
    }
    /**
     * @return Specifies the Linode Instance image which determines the OS distribution and base files. Default `linode/ubuntu18.04` (string)
     * 
     */
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return Enable ipv6 for droplet. Default `false` (bool)
     * 
     */
    public Optional<Boolean> ipv6() {
        return Optional.ofNullable(this.ipv6);
    }
    /**
     * @return Enable monitoring for droplet. Default `false` (bool)
     * 
     */
    public Optional<Boolean> monitoring() {
        return Optional.ofNullable(this.monitoring);
    }
    /**
     * @return Enable private networking for droplet. Default `false` (bool)
     * 
     */
    public Optional<Boolean> privateNetworking() {
        return Optional.ofNullable(this.privateNetworking);
    }
    /**
     * @return OpenStack region name (string)
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return Digital Ocean size. Default `s-1vcpu-1gb` (string)
     * 
     */
    public Optional<String> size() {
        return Optional.ofNullable(this.size);
    }
    /**
     * @return SSH private key contents (string)
     * 
     */
    public Optional<String> sshKeyContents() {
        return Optional.ofNullable(this.sshKeyContents);
    }
    /**
     * @return SSH key fingerprint (string)
     * 
     */
    public Optional<String> sshKeyFingerprint() {
        return Optional.ofNullable(this.sshKeyFingerprint);
    }
    /**
     * @return If using a non-B2D image you can specify the ssh port. Default `22` (string)
     * 
     */
    public Optional<String> sshPort() {
        return Optional.ofNullable(this.sshPort);
    }
    /**
     * @return If using a non-B2D image you can specify the ssh user. Default `docker`. (string)
     * 
     */
    public Optional<String> sshUser() {
        return Optional.ofNullable(this.sshUser);
    }
    /**
     * @return vSphere tags id e.g. `urn:xxx` (list)
     * 
     */
    public Optional<String> tags() {
        return Optional.ofNullable(this.tags);
    }
    /**
     * @return Path to file with cloud-init user-data (string)
     * 
     */
    public Optional<String> userdata() {
        return Optional.ofNullable(this.userdata);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineConfigV2DigitaloceanConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessToken;
        private @Nullable Boolean backups;
        private @Nullable String image;
        private @Nullable Boolean ipv6;
        private @Nullable Boolean monitoring;
        private @Nullable Boolean privateNetworking;
        private @Nullable String region;
        private @Nullable String size;
        private @Nullable String sshKeyContents;
        private @Nullable String sshKeyFingerprint;
        private @Nullable String sshPort;
        private @Nullable String sshUser;
        private @Nullable String tags;
        private @Nullable String userdata;
        public Builder() {}
        public Builder(MachineConfigV2DigitaloceanConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.backups = defaults.backups;
    	      this.image = defaults.image;
    	      this.ipv6 = defaults.ipv6;
    	      this.monitoring = defaults.monitoring;
    	      this.privateNetworking = defaults.privateNetworking;
    	      this.region = defaults.region;
    	      this.size = defaults.size;
    	      this.sshKeyContents = defaults.sshKeyContents;
    	      this.sshKeyFingerprint = defaults.sshKeyFingerprint;
    	      this.sshPort = defaults.sshPort;
    	      this.sshUser = defaults.sshUser;
    	      this.tags = defaults.tags;
    	      this.userdata = defaults.userdata;
        }

        @CustomType.Setter
        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        @CustomType.Setter
        public Builder backups(@Nullable Boolean backups) {
            this.backups = backups;
            return this;
        }
        @CustomType.Setter
        public Builder image(@Nullable String image) {
            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6(@Nullable Boolean ipv6) {
            this.ipv6 = ipv6;
            return this;
        }
        @CustomType.Setter
        public Builder monitoring(@Nullable Boolean monitoring) {
            this.monitoring = monitoring;
            return this;
        }
        @CustomType.Setter
        public Builder privateNetworking(@Nullable Boolean privateNetworking) {
            this.privateNetworking = privateNetworking;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder size(@Nullable String size) {
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder sshKeyContents(@Nullable String sshKeyContents) {
            this.sshKeyContents = sshKeyContents;
            return this;
        }
        @CustomType.Setter
        public Builder sshKeyFingerprint(@Nullable String sshKeyFingerprint) {
            this.sshKeyFingerprint = sshKeyFingerprint;
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
        public Builder tags(@Nullable String tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder userdata(@Nullable String userdata) {
            this.userdata = userdata;
            return this;
        }
        public MachineConfigV2DigitaloceanConfig build() {
            final var _resultValue = new MachineConfigV2DigitaloceanConfig();
            _resultValue.accessToken = accessToken;
            _resultValue.backups = backups;
            _resultValue.image = image;
            _resultValue.ipv6 = ipv6;
            _resultValue.monitoring = monitoring;
            _resultValue.privateNetworking = privateNetworking;
            _resultValue.region = region;
            _resultValue.size = size;
            _resultValue.sshKeyContents = sshKeyContents;
            _resultValue.sshKeyFingerprint = sshKeyFingerprint;
            _resultValue.sshPort = sshPort;
            _resultValue.sshUser = sshUser;
            _resultValue.tags = tags;
            _resultValue.userdata = userdata;
            return _resultValue;
        }
    }
}
