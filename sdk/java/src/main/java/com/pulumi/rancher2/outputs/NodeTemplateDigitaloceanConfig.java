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
public final class NodeTemplateDigitaloceanConfig {
    /**
     * @return Digital Ocean access token
     * 
     */
    private @Nullable String accessToken;
    /**
     * @return Enable backups for droplet
     * 
     */
    private @Nullable Boolean backups;
    /**
     * @return Digital Ocean Image
     * 
     */
    private @Nullable String image;
    /**
     * @return Enable ipv6 for droplet
     * 
     */
    private @Nullable Boolean ipv6;
    /**
     * @return Enable monitoring for droplet
     * 
     */
    private @Nullable Boolean monitoring;
    /**
     * @return Enable private networking for droplet
     * 
     */
    private @Nullable Boolean privateNetworking;
    /**
     * @return Digital Ocean region
     * 
     */
    private @Nullable String region;
    /**
     * @return Digital Ocean size
     * 
     */
    private @Nullable String size;
    /**
     * @return SSH key fingerprint
     * 
     */
    private @Nullable String sshKeyFingerprint;
    /**
     * @return SSH private key path
     * 
     */
    private @Nullable String sshKeyPath;
    /**
     * @return SSH port
     * 
     */
    private @Nullable String sshPort;
    /**
     * @return SSH username
     * 
     */
    private @Nullable String sshUser;
    /**
     * @return Comma-separated list of tags to apply to the Droplet
     * 
     */
    private @Nullable String tags;
    /**
     * @return Path to file with cloud-init user-data
     * 
     */
    private @Nullable String userdata;

    private NodeTemplateDigitaloceanConfig() {}
    /**
     * @return Digital Ocean access token
     * 
     */
    public Optional<String> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * @return Enable backups for droplet
     * 
     */
    public Optional<Boolean> backups() {
        return Optional.ofNullable(this.backups);
    }
    /**
     * @return Digital Ocean Image
     * 
     */
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return Enable ipv6 for droplet
     * 
     */
    public Optional<Boolean> ipv6() {
        return Optional.ofNullable(this.ipv6);
    }
    /**
     * @return Enable monitoring for droplet
     * 
     */
    public Optional<Boolean> monitoring() {
        return Optional.ofNullable(this.monitoring);
    }
    /**
     * @return Enable private networking for droplet
     * 
     */
    public Optional<Boolean> privateNetworking() {
        return Optional.ofNullable(this.privateNetworking);
    }
    /**
     * @return Digital Ocean region
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return Digital Ocean size
     * 
     */
    public Optional<String> size() {
        return Optional.ofNullable(this.size);
    }
    /**
     * @return SSH key fingerprint
     * 
     */
    public Optional<String> sshKeyFingerprint() {
        return Optional.ofNullable(this.sshKeyFingerprint);
    }
    /**
     * @return SSH private key path
     * 
     */
    public Optional<String> sshKeyPath() {
        return Optional.ofNullable(this.sshKeyPath);
    }
    /**
     * @return SSH port
     * 
     */
    public Optional<String> sshPort() {
        return Optional.ofNullable(this.sshPort);
    }
    /**
     * @return SSH username
     * 
     */
    public Optional<String> sshUser() {
        return Optional.ofNullable(this.sshUser);
    }
    /**
     * @return Comma-separated list of tags to apply to the Droplet
     * 
     */
    public Optional<String> tags() {
        return Optional.ofNullable(this.tags);
    }
    /**
     * @return Path to file with cloud-init user-data
     * 
     */
    public Optional<String> userdata() {
        return Optional.ofNullable(this.userdata);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateDigitaloceanConfig defaults) {
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
        private @Nullable String sshKeyFingerprint;
        private @Nullable String sshKeyPath;
        private @Nullable String sshPort;
        private @Nullable String sshUser;
        private @Nullable String tags;
        private @Nullable String userdata;
        public Builder() {}
        public Builder(NodeTemplateDigitaloceanConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.backups = defaults.backups;
    	      this.image = defaults.image;
    	      this.ipv6 = defaults.ipv6;
    	      this.monitoring = defaults.monitoring;
    	      this.privateNetworking = defaults.privateNetworking;
    	      this.region = defaults.region;
    	      this.size = defaults.size;
    	      this.sshKeyFingerprint = defaults.sshKeyFingerprint;
    	      this.sshKeyPath = defaults.sshKeyPath;
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
        public Builder sshKeyFingerprint(@Nullable String sshKeyFingerprint) {

            this.sshKeyFingerprint = sshKeyFingerprint;
            return this;
        }
        @CustomType.Setter
        public Builder sshKeyPath(@Nullable String sshKeyPath) {

            this.sshKeyPath = sshKeyPath;
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
        public NodeTemplateDigitaloceanConfig build() {
            final var _resultValue = new NodeTemplateDigitaloceanConfig();
            _resultValue.accessToken = accessToken;
            _resultValue.backups = backups;
            _resultValue.image = image;
            _resultValue.ipv6 = ipv6;
            _resultValue.monitoring = monitoring;
            _resultValue.privateNetworking = privateNetworking;
            _resultValue.region = region;
            _resultValue.size = size;
            _resultValue.sshKeyFingerprint = sshKeyFingerprint;
            _resultValue.sshKeyPath = sshKeyPath;
            _resultValue.sshPort = sshPort;
            _resultValue.sshUser = sshUser;
            _resultValue.tags = tags;
            _resultValue.userdata = userdata;
            return _resultValue;
        }
    }
}
