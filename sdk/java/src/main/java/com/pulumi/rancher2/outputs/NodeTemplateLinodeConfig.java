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
public final class NodeTemplateLinodeConfig {
    /**
     * @return Linode user accounts (seperated by commas) whose Linode SSH keys will be permitted root access to the created node. (string)
     * 
     */
    private final @Nullable String authorizedUsers;
    /**
     * @return Create private IP for the instance. Default `false` (bool)
     * 
     */
    private final @Nullable Boolean createPrivateIp;
    /**
     * @return Docker Port. Default `2376` (string)
     * 
     */
    private final @Nullable String dockerPort;
    /**
     * @return Specifies the Linode Instance image which determines the OS distribution and base files. Default `linode/ubuntu18.04` (string)
     * 
     */
    private final @Nullable String image;
    /**
     * @return Specifies the Linode Instance type which determines CPU, memory, disk size, etc. Default `g6-standard-4` (string)
     * 
     */
    private final @Nullable String instanceType;
    /**
     * @return Linode Instance Label. (string)
     * 
     */
    private final @Nullable String label;
    /**
     * @return OpenStack region name (string)
     * 
     */
    private final @Nullable String region;
    /**
     * @return Root Password (string)
     * 
     */
    private final @Nullable String rootPass;
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
     * @return Specifies the Linode StackScript to use to create the instance. (string)
     * 
     */
    private final @Nullable String stackscript;
    /**
     * @return A JSON string specifying data for the selected StackScript. (string)
     * 
     */
    private final @Nullable String stackscriptData;
    /**
     * @return Linode Instance Swap Size (MB). Default `512` (string)
     * 
     */
    private final @Nullable String swapSize;
    /**
     * @return vSphere tags id e.g. `urn:xxx`. From Rancher v2.3.3 (list)
     * 
     */
    private final @Nullable String tags;
    /**
     * @return Linode API token. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    private final @Nullable String token;
    /**
     * @return Prefix the User-Agent in Linode API calls with some &#39;product/version&#39; (string)
     * 
     */
    private final @Nullable String uaPrefix;

    @CustomType.Constructor
    private NodeTemplateLinodeConfig(
        @CustomType.Parameter("authorizedUsers") @Nullable String authorizedUsers,
        @CustomType.Parameter("createPrivateIp") @Nullable Boolean createPrivateIp,
        @CustomType.Parameter("dockerPort") @Nullable String dockerPort,
        @CustomType.Parameter("image") @Nullable String image,
        @CustomType.Parameter("instanceType") @Nullable String instanceType,
        @CustomType.Parameter("label") @Nullable String label,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("rootPass") @Nullable String rootPass,
        @CustomType.Parameter("sshPort") @Nullable String sshPort,
        @CustomType.Parameter("sshUser") @Nullable String sshUser,
        @CustomType.Parameter("stackscript") @Nullable String stackscript,
        @CustomType.Parameter("stackscriptData") @Nullable String stackscriptData,
        @CustomType.Parameter("swapSize") @Nullable String swapSize,
        @CustomType.Parameter("tags") @Nullable String tags,
        @CustomType.Parameter("token") @Nullable String token,
        @CustomType.Parameter("uaPrefix") @Nullable String uaPrefix) {
        this.authorizedUsers = authorizedUsers;
        this.createPrivateIp = createPrivateIp;
        this.dockerPort = dockerPort;
        this.image = image;
        this.instanceType = instanceType;
        this.label = label;
        this.region = region;
        this.rootPass = rootPass;
        this.sshPort = sshPort;
        this.sshUser = sshUser;
        this.stackscript = stackscript;
        this.stackscriptData = stackscriptData;
        this.swapSize = swapSize;
        this.tags = tags;
        this.token = token;
        this.uaPrefix = uaPrefix;
    }

    /**
     * @return Linode user accounts (seperated by commas) whose Linode SSH keys will be permitted root access to the created node. (string)
     * 
     */
    public Optional<String> authorizedUsers() {
        return Optional.ofNullable(this.authorizedUsers);
    }
    /**
     * @return Create private IP for the instance. Default `false` (bool)
     * 
     */
    public Optional<Boolean> createPrivateIp() {
        return Optional.ofNullable(this.createPrivateIp);
    }
    /**
     * @return Docker Port. Default `2376` (string)
     * 
     */
    public Optional<String> dockerPort() {
        return Optional.ofNullable(this.dockerPort);
    }
    /**
     * @return Specifies the Linode Instance image which determines the OS distribution and base files. Default `linode/ubuntu18.04` (string)
     * 
     */
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return Specifies the Linode Instance type which determines CPU, memory, disk size, etc. Default `g6-standard-4` (string)
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return Linode Instance Label. (string)
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * @return OpenStack region name (string)
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return Root Password (string)
     * 
     */
    public Optional<String> rootPass() {
        return Optional.ofNullable(this.rootPass);
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
     * @return Specifies the Linode StackScript to use to create the instance. (string)
     * 
     */
    public Optional<String> stackscript() {
        return Optional.ofNullable(this.stackscript);
    }
    /**
     * @return A JSON string specifying data for the selected StackScript. (string)
     * 
     */
    public Optional<String> stackscriptData() {
        return Optional.ofNullable(this.stackscriptData);
    }
    /**
     * @return Linode Instance Swap Size (MB). Default `512` (string)
     * 
     */
    public Optional<String> swapSize() {
        return Optional.ofNullable(this.swapSize);
    }
    /**
     * @return vSphere tags id e.g. `urn:xxx`. From Rancher v2.3.3 (list)
     * 
     */
    public Optional<String> tags() {
        return Optional.ofNullable(this.tags);
    }
    /**
     * @return Linode API token. Mandatory on Rancher v2.0.x and v2.1.x. Use `rancher2.CloudCredential` from Rancher v2.2.x (string)
     * 
     */
    public Optional<String> token() {
        return Optional.ofNullable(this.token);
    }
    /**
     * @return Prefix the User-Agent in Linode API calls with some &#39;product/version&#39; (string)
     * 
     */
    public Optional<String> uaPrefix() {
        return Optional.ofNullable(this.uaPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateLinodeConfig defaults) {
        return new Builder(defaults);
    }

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

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTemplateLinodeConfig defaults) {
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

        public Builder authorizedUsers(@Nullable String authorizedUsers) {
            this.authorizedUsers = authorizedUsers;
            return this;
        }
        public Builder createPrivateIp(@Nullable Boolean createPrivateIp) {
            this.createPrivateIp = createPrivateIp;
            return this;
        }
        public Builder dockerPort(@Nullable String dockerPort) {
            this.dockerPort = dockerPort;
            return this;
        }
        public Builder image(@Nullable String image) {
            this.image = image;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder rootPass(@Nullable String rootPass) {
            this.rootPass = rootPass;
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
        public Builder stackscript(@Nullable String stackscript) {
            this.stackscript = stackscript;
            return this;
        }
        public Builder stackscriptData(@Nullable String stackscriptData) {
            this.stackscriptData = stackscriptData;
            return this;
        }
        public Builder swapSize(@Nullable String swapSize) {
            this.swapSize = swapSize;
            return this;
        }
        public Builder tags(@Nullable String tags) {
            this.tags = tags;
            return this;
        }
        public Builder token(@Nullable String token) {
            this.token = token;
            return this;
        }
        public Builder uaPrefix(@Nullable String uaPrefix) {
            this.uaPrefix = uaPrefix;
            return this;
        }        public NodeTemplateLinodeConfig build() {
            return new NodeTemplateLinodeConfig(authorizedUsers, createPrivateIp, dockerPort, image, instanceType, label, region, rootPass, sshPort, sshUser, stackscript, stackscriptData, swapSize, tags, token, uaPrefix);
        }
    }
}
