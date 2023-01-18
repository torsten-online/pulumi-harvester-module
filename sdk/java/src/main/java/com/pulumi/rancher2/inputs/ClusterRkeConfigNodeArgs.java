// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigNodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigNodeArgs Empty = new ClusterRkeConfigNodeArgs();

    /**
     * Address ip for the bastion host (string)
     * 
     */
    @Import(name="address", required=true)
    private Output<String> address;

    /**
     * @return Address ip for the bastion host (string)
     * 
     */
    public Output<String> address() {
        return this.address;
    }

    /**
     * Docker socket for node (string)
     * 
     */
    @Import(name="dockerSocket")
    private @Nullable Output<String> dockerSocket;

    /**
     * @return Docker socket for node (string)
     * 
     */
    public Optional<Output<String>> dockerSocket() {
        return Optional.ofNullable(this.dockerSocket);
    }

    /**
     * Hostname override for node (string)
     * 
     */
    @Import(name="hostnameOverride")
    private @Nullable Output<String> hostnameOverride;

    /**
     * @return Hostname override for node (string)
     * 
     */
    public Optional<Output<String>> hostnameOverride() {
        return Optional.ofNullable(this.hostnameOverride);
    }

    /**
     * Internal ip for node (string)
     * 
     */
    @Import(name="internalAddress")
    private @Nullable Output<String> internalAddress;

    /**
     * @return Internal ip for node (string)
     * 
     */
    public Optional<Output<String>> internalAddress() {
        return Optional.ofNullable(this.internalAddress);
    }

    /**
     * Labels for the Cluster (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels for the Cluster (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Id for the node (string)
     * 
     */
    @Import(name="nodeId")
    private @Nullable Output<String> nodeId;

    /**
     * @return Id for the node (string)
     * 
     */
    public Optional<Output<String>> nodeId() {
        return Optional.ofNullable(this.nodeId);
    }

    /**
     * Port for bastion host. Default `22` (string)
     * 
     */
    @Import(name="port")
    private @Nullable Output<String> port;

    /**
     * @return Port for bastion host. Default `22` (string)
     * 
     */
    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Roles for the node. `controlplane`, `etcd` and `worker` are supported. (list)
     * 
     */
    @Import(name="roles", required=true)
    private Output<List<String>> roles;

    /**
     * @return Roles for the node. `controlplane`, `etcd` and `worker` are supported. (list)
     * 
     */
    public Output<List<String>> roles() {
        return this.roles;
    }

    /**
     * Use ssh agent auth. Default `false`
     * 
     */
    @Import(name="sshAgentAuth")
    private @Nullable Output<Boolean> sshAgentAuth;

    /**
     * @return Use ssh agent auth. Default `false`
     * 
     */
    public Optional<Output<Boolean>> sshAgentAuth() {
        return Optional.ofNullable(this.sshAgentAuth);
    }

    /**
     * Bastion host SSH private key (string)
     * 
     */
    @Import(name="sshKey")
    private @Nullable Output<String> sshKey;

    /**
     * @return Bastion host SSH private key (string)
     * 
     */
    public Optional<Output<String>> sshKey() {
        return Optional.ofNullable(this.sshKey);
    }

    /**
     * Cluster level SSH private key path (string)
     * 
     */
    @Import(name="sshKeyPath")
    private @Nullable Output<String> sshKeyPath;

    /**
     * @return Cluster level SSH private key path (string)
     * 
     */
    public Optional<Output<String>> sshKeyPath() {
        return Optional.ofNullable(this.sshKeyPath);
    }

    /**
     * User to connect bastion host (string)
     * 
     */
    @Import(name="user", required=true)
    private Output<String> user;

    /**
     * @return User to connect bastion host (string)
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    private ClusterRkeConfigNodeArgs() {}

    private ClusterRkeConfigNodeArgs(ClusterRkeConfigNodeArgs $) {
        this.address = $.address;
        this.dockerSocket = $.dockerSocket;
        this.hostnameOverride = $.hostnameOverride;
        this.internalAddress = $.internalAddress;
        this.labels = $.labels;
        this.nodeId = $.nodeId;
        this.port = $.port;
        this.roles = $.roles;
        this.sshAgentAuth = $.sshAgentAuth;
        this.sshKey = $.sshKey;
        this.sshKeyPath = $.sshKeyPath;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigNodeArgs $;

        public Builder() {
            $ = new ClusterRkeConfigNodeArgs();
        }

        public Builder(ClusterRkeConfigNodeArgs defaults) {
            $ = new ClusterRkeConfigNodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address Address ip for the bastion host (string)
         * 
         * @return builder
         * 
         */
        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address Address ip for the bastion host (string)
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param dockerSocket Docker socket for node (string)
         * 
         * @return builder
         * 
         */
        public Builder dockerSocket(@Nullable Output<String> dockerSocket) {
            $.dockerSocket = dockerSocket;
            return this;
        }

        /**
         * @param dockerSocket Docker socket for node (string)
         * 
         * @return builder
         * 
         */
        public Builder dockerSocket(String dockerSocket) {
            return dockerSocket(Output.of(dockerSocket));
        }

        /**
         * @param hostnameOverride Hostname override for node (string)
         * 
         * @return builder
         * 
         */
        public Builder hostnameOverride(@Nullable Output<String> hostnameOverride) {
            $.hostnameOverride = hostnameOverride;
            return this;
        }

        /**
         * @param hostnameOverride Hostname override for node (string)
         * 
         * @return builder
         * 
         */
        public Builder hostnameOverride(String hostnameOverride) {
            return hostnameOverride(Output.of(hostnameOverride));
        }

        /**
         * @param internalAddress Internal ip for node (string)
         * 
         * @return builder
         * 
         */
        public Builder internalAddress(@Nullable Output<String> internalAddress) {
            $.internalAddress = internalAddress;
            return this;
        }

        /**
         * @param internalAddress Internal ip for node (string)
         * 
         * @return builder
         * 
         */
        public Builder internalAddress(String internalAddress) {
            return internalAddress(Output.of(internalAddress));
        }

        /**
         * @param labels Labels for the Cluster (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for the Cluster (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param nodeId Id for the node (string)
         * 
         * @return builder
         * 
         */
        public Builder nodeId(@Nullable Output<String> nodeId) {
            $.nodeId = nodeId;
            return this;
        }

        /**
         * @param nodeId Id for the node (string)
         * 
         * @return builder
         * 
         */
        public Builder nodeId(String nodeId) {
            return nodeId(Output.of(nodeId));
        }

        /**
         * @param port Port for bastion host. Default `22` (string)
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port for bastion host. Default `22` (string)
         * 
         * @return builder
         * 
         */
        public Builder port(String port) {
            return port(Output.of(port));
        }

        /**
         * @param roles Roles for the node. `controlplane`, `etcd` and `worker` are supported. (list)
         * 
         * @return builder
         * 
         */
        public Builder roles(Output<List<String>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles Roles for the node. `controlplane`, `etcd` and `worker` are supported. (list)
         * 
         * @return builder
         * 
         */
        public Builder roles(List<String> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles Roles for the node. `controlplane`, `etcd` and `worker` are supported. (list)
         * 
         * @return builder
         * 
         */
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }

        /**
         * @param sshAgentAuth Use ssh agent auth. Default `false`
         * 
         * @return builder
         * 
         */
        public Builder sshAgentAuth(@Nullable Output<Boolean> sshAgentAuth) {
            $.sshAgentAuth = sshAgentAuth;
            return this;
        }

        /**
         * @param sshAgentAuth Use ssh agent auth. Default `false`
         * 
         * @return builder
         * 
         */
        public Builder sshAgentAuth(Boolean sshAgentAuth) {
            return sshAgentAuth(Output.of(sshAgentAuth));
        }

        /**
         * @param sshKey Bastion host SSH private key (string)
         * 
         * @return builder
         * 
         */
        public Builder sshKey(@Nullable Output<String> sshKey) {
            $.sshKey = sshKey;
            return this;
        }

        /**
         * @param sshKey Bastion host SSH private key (string)
         * 
         * @return builder
         * 
         */
        public Builder sshKey(String sshKey) {
            return sshKey(Output.of(sshKey));
        }

        /**
         * @param sshKeyPath Cluster level SSH private key path (string)
         * 
         * @return builder
         * 
         */
        public Builder sshKeyPath(@Nullable Output<String> sshKeyPath) {
            $.sshKeyPath = sshKeyPath;
            return this;
        }

        /**
         * @param sshKeyPath Cluster level SSH private key path (string)
         * 
         * @return builder
         * 
         */
        public Builder sshKeyPath(String sshKeyPath) {
            return sshKeyPath(Output.of(sshKeyPath));
        }

        /**
         * @param user User to connect bastion host (string)
         * 
         * @return builder
         * 
         */
        public Builder user(Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user User to connect bastion host (string)
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public ClusterRkeConfigNodeArgs build() {
            $.address = Objects.requireNonNull($.address, "expected parameter 'address' to be non-null");
            $.roles = Objects.requireNonNull($.roles, "expected parameter 'roles' to be non-null");
            $.user = Objects.requireNonNull($.user, "expected parameter 'user' to be non-null");
            return $;
        }
    }

}
