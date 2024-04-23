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
public final class MachineConfigV2LinodeConfig {
    /**
     * @return Linode user accounts (seperated by commas) whose Linode SSH keys will be permitted root access to the created node
     * 
     */
    private @Nullable String authorizedUsers;
    /**
     * @return Create private IP for the instance
     * 
     */
    private @Nullable Boolean createPrivateIp;
    /**
     * @return Docker Port
     * 
     */
    private @Nullable String dockerPort;
    /**
     * @return Specifies the Linode Instance image which determines the OS distribution and base files
     * 
     */
    private @Nullable String image;
    /**
     * @return Specifies the Linode Instance type which determines CPU, memory, disk size, etc.
     * 
     */
    private @Nullable String instanceType;
    /**
     * @return Linode Instance Label
     * 
     */
    private @Nullable String label;
    /**
     * @return Specifies the region (location) of the Linode instance
     * 
     */
    private @Nullable String region;
    /**
     * @return Root Password
     * 
     */
    private @Nullable String rootPass;
    /**
     * @return Linode Instance SSH Port
     * 
     */
    private @Nullable String sshPort;
    /**
     * @return Specifies the user as which docker-machine should log in to the Linode instance to install Docker.
     * 
     */
    private @Nullable String sshUser;
    /**
     * @return Specifies the Linode StackScript to use to create the instance
     * 
     */
    private @Nullable String stackscript;
    /**
     * @return A JSON string specifying data for the selected StackScript
     * 
     */
    private @Nullable String stackscriptData;
    /**
     * @return Linode Instance Swap Size (MB)
     * 
     */
    private @Nullable String swapSize;
    /**
     * @return A comma separated list of tags to apply to the the Linode resource
     * 
     */
    private @Nullable String tags;
    /**
     * @return Linode API Token
     * 
     */
    private @Nullable String token;
    /**
     * @return Prefix the User-Agent in Linode API calls with some &#39;product/version&#39;
     * 
     */
    private @Nullable String uaPrefix;

    private MachineConfigV2LinodeConfig() {}
    /**
     * @return Linode user accounts (seperated by commas) whose Linode SSH keys will be permitted root access to the created node
     * 
     */
    public Optional<String> authorizedUsers() {
        return Optional.ofNullable(this.authorizedUsers);
    }
    /**
     * @return Create private IP for the instance
     * 
     */
    public Optional<Boolean> createPrivateIp() {
        return Optional.ofNullable(this.createPrivateIp);
    }
    /**
     * @return Docker Port
     * 
     */
    public Optional<String> dockerPort() {
        return Optional.ofNullable(this.dockerPort);
    }
    /**
     * @return Specifies the Linode Instance image which determines the OS distribution and base files
     * 
     */
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return Specifies the Linode Instance type which determines CPU, memory, disk size, etc.
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return Linode Instance Label
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * @return Specifies the region (location) of the Linode instance
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return Root Password
     * 
     */
    public Optional<String> rootPass() {
        return Optional.ofNullable(this.rootPass);
    }
    /**
     * @return Linode Instance SSH Port
     * 
     */
    public Optional<String> sshPort() {
        return Optional.ofNullable(this.sshPort);
    }
    /**
     * @return Specifies the user as which docker-machine should log in to the Linode instance to install Docker.
     * 
     */
    public Optional<String> sshUser() {
        return Optional.ofNullable(this.sshUser);
    }
    /**
     * @return Specifies the Linode StackScript to use to create the instance
     * 
     */
    public Optional<String> stackscript() {
        return Optional.ofNullable(this.stackscript);
    }
    /**
     * @return A JSON string specifying data for the selected StackScript
     * 
     */
    public Optional<String> stackscriptData() {
        return Optional.ofNullable(this.stackscriptData);
    }
    /**
     * @return Linode Instance Swap Size (MB)
     * 
     */
    public Optional<String> swapSize() {
        return Optional.ofNullable(this.swapSize);
    }
    /**
     * @return A comma separated list of tags to apply to the the Linode resource
     * 
     */
    public Optional<String> tags() {
        return Optional.ofNullable(this.tags);
    }
    /**
     * @return Linode API Token
     * 
     */
    public Optional<String> token() {
        return Optional.ofNullable(this.token);
    }
    /**
     * @return Prefix the User-Agent in Linode API calls with some &#39;product/version&#39;
     * 
     */
    public Optional<String> uaPrefix() {
        return Optional.ofNullable(this.uaPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineConfigV2LinodeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String authorizedUsers;
        private @Nullable Boolean createPrivateIp;
        private @Nullable String dockerPort;
        private @Nullable String image;
        private @Nullable String instanceType;
        private @Nullable String label;
        private @Nullable String region;
        private @Nullable String rootPass;
        private @Nullable String sshPort;
        private @Nullable String sshUser;
        private @Nullable String stackscript;
        private @Nullable String stackscriptData;
        private @Nullable String swapSize;
        private @Nullable String tags;
        private @Nullable String token;
        private @Nullable String uaPrefix;
        public Builder() {}
        public Builder(MachineConfigV2LinodeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedUsers = defaults.authorizedUsers;
    	      this.createPrivateIp = defaults.createPrivateIp;
    	      this.dockerPort = defaults.dockerPort;
    	      this.image = defaults.image;
    	      this.instanceType = defaults.instanceType;
    	      this.label = defaults.label;
    	      this.region = defaults.region;
    	      this.rootPass = defaults.rootPass;
    	      this.sshPort = defaults.sshPort;
    	      this.sshUser = defaults.sshUser;
    	      this.stackscript = defaults.stackscript;
    	      this.stackscriptData = defaults.stackscriptData;
    	      this.swapSize = defaults.swapSize;
    	      this.tags = defaults.tags;
    	      this.token = defaults.token;
    	      this.uaPrefix = defaults.uaPrefix;
        }

        @CustomType.Setter
        public Builder authorizedUsers(@Nullable String authorizedUsers) {

            this.authorizedUsers = authorizedUsers;
            return this;
        }
        @CustomType.Setter
        public Builder createPrivateIp(@Nullable Boolean createPrivateIp) {

            this.createPrivateIp = createPrivateIp;
            return this;
        }
        @CustomType.Setter
        public Builder dockerPort(@Nullable String dockerPort) {

            this.dockerPort = dockerPort;
            return this;
        }
        @CustomType.Setter
        public Builder image(@Nullable String image) {

            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(@Nullable String instanceType) {

            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder label(@Nullable String label) {

            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder rootPass(@Nullable String rootPass) {

            this.rootPass = rootPass;
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
        public Builder stackscript(@Nullable String stackscript) {

            this.stackscript = stackscript;
            return this;
        }
        @CustomType.Setter
        public Builder stackscriptData(@Nullable String stackscriptData) {

            this.stackscriptData = stackscriptData;
            return this;
        }
        @CustomType.Setter
        public Builder swapSize(@Nullable String swapSize) {

            this.swapSize = swapSize;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable String tags) {

            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder token(@Nullable String token) {

            this.token = token;
            return this;
        }
        @CustomType.Setter
        public Builder uaPrefix(@Nullable String uaPrefix) {

            this.uaPrefix = uaPrefix;
            return this;
        }
        public MachineConfigV2LinodeConfig build() {
            final var _resultValue = new MachineConfigV2LinodeConfig();
            _resultValue.authorizedUsers = authorizedUsers;
            _resultValue.createPrivateIp = createPrivateIp;
            _resultValue.dockerPort = dockerPort;
            _resultValue.image = image;
            _resultValue.instanceType = instanceType;
            _resultValue.label = label;
            _resultValue.region = region;
            _resultValue.rootPass = rootPass;
            _resultValue.sshPort = sshPort;
            _resultValue.sshUser = sshUser;
            _resultValue.stackscript = stackscript;
            _resultValue.stackscriptData = stackscriptData;
            _resultValue.swapSize = swapSize;
            _resultValue.tags = tags;
            _resultValue.token = token;
            _resultValue.uaPrefix = uaPrefix;
            return _resultValue;
        }
    }
}
