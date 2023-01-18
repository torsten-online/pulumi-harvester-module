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
public final class ClusterRkeConfigBastionHost {
    /**
     * @return Address ip for the bastion host (string)
     * 
     */
    private String address;
    /**
     * @return Port for bastion host. Default `22` (string)
     * 
     */
    private @Nullable String port;
    /**
     * @return Use ssh agent auth. Default `false`
     * 
     */
    private @Nullable Boolean sshAgentAuth;
    /**
     * @return Bastion host SSH private key (string)
     * 
     */
    private @Nullable String sshKey;
    /**
     * @return Cluster level SSH private key path (string)
     * 
     */
    private @Nullable String sshKeyPath;
    /**
     * @return User to connect bastion host (string)
     * 
     */
    private String user;

    private ClusterRkeConfigBastionHost() {}
    /**
     * @return Address ip for the bastion host (string)
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return Port for bastion host. Default `22` (string)
     * 
     */
    public Optional<String> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Use ssh agent auth. Default `false`
     * 
     */
    public Optional<Boolean> sshAgentAuth() {
        return Optional.ofNullable(this.sshAgentAuth);
    }
    /**
     * @return Bastion host SSH private key (string)
     * 
     */
    public Optional<String> sshKey() {
        return Optional.ofNullable(this.sshKey);
    }
    /**
     * @return Cluster level SSH private key path (string)
     * 
     */
    public Optional<String> sshKeyPath() {
        return Optional.ofNullable(this.sshKeyPath);
    }
    /**
     * @return User to connect bastion host (string)
     * 
     */
    public String user() {
        return this.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigBastionHost defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private @Nullable String port;
        private @Nullable Boolean sshAgentAuth;
        private @Nullable String sshKey;
        private @Nullable String sshKeyPath;
        private String user;
        public Builder() {}
        public Builder(ClusterRkeConfigBastionHost defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.port = defaults.port;
    	      this.sshAgentAuth = defaults.sshAgentAuth;
    	      this.sshKey = defaults.sshKey;
    	      this.sshKeyPath = defaults.sshKeyPath;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable String port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder sshAgentAuth(@Nullable Boolean sshAgentAuth) {
            this.sshAgentAuth = sshAgentAuth;
            return this;
        }
        @CustomType.Setter
        public Builder sshKey(@Nullable String sshKey) {
            this.sshKey = sshKey;
            return this;
        }
        @CustomType.Setter
        public Builder sshKeyPath(@Nullable String sshKeyPath) {
            this.sshKeyPath = sshKeyPath;
            return this;
        }
        @CustomType.Setter
        public Builder user(String user) {
            this.user = Objects.requireNonNull(user);
            return this;
        }
        public ClusterRkeConfigBastionHost build() {
            final var o = new ClusterRkeConfigBastionHost();
            o.address = address;
            o.port = port;
            o.sshAgentAuth = sshAgentAuth;
            o.sshKey = sshKey;
            o.sshKeyPath = sshKeyPath;
            o.user = user;
            return o;
        }
    }
}
