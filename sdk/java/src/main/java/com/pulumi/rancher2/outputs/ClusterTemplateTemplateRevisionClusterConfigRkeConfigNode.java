// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigNode {
    private String address;
    private @Nullable String dockerSocket;
    private @Nullable String hostnameOverride;
    private @Nullable String internalAddress;
    /**
     * @return Labels for the cluster template (map)
     * 
     */
    private @Nullable Map<String,Object> labels;
    private @Nullable String nodeId;
    private @Nullable String port;
    private List<String> roles;
    private @Nullable Boolean sshAgentAuth;
    private @Nullable String sshKey;
    private @Nullable String sshKeyPath;
    private String user;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigNode() {}
    public String address() {
        return this.address;
    }
    public Optional<String> dockerSocket() {
        return Optional.ofNullable(this.dockerSocket);
    }
    public Optional<String> hostnameOverride() {
        return Optional.ofNullable(this.hostnameOverride);
    }
    public Optional<String> internalAddress() {
        return Optional.ofNullable(this.internalAddress);
    }
    /**
     * @return Labels for the cluster template (map)
     * 
     */
    public Map<String,Object> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    public Optional<String> nodeId() {
        return Optional.ofNullable(this.nodeId);
    }
    public Optional<String> port() {
        return Optional.ofNullable(this.port);
    }
    public List<String> roles() {
        return this.roles;
    }
    public Optional<Boolean> sshAgentAuth() {
        return Optional.ofNullable(this.sshAgentAuth);
    }
    public Optional<String> sshKey() {
        return Optional.ofNullable(this.sshKey);
    }
    public Optional<String> sshKeyPath() {
        return Optional.ofNullable(this.sshKeyPath);
    }
    public String user() {
        return this.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigNode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private @Nullable String dockerSocket;
        private @Nullable String hostnameOverride;
        private @Nullable String internalAddress;
        private @Nullable Map<String,Object> labels;
        private @Nullable String nodeId;
        private @Nullable String port;
        private List<String> roles;
        private @Nullable Boolean sshAgentAuth;
        private @Nullable String sshKey;
        private @Nullable String sshKeyPath;
        private String user;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.dockerSocket = defaults.dockerSocket;
    	      this.hostnameOverride = defaults.hostnameOverride;
    	      this.internalAddress = defaults.internalAddress;
    	      this.labels = defaults.labels;
    	      this.nodeId = defaults.nodeId;
    	      this.port = defaults.port;
    	      this.roles = defaults.roles;
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
        public Builder dockerSocket(@Nullable String dockerSocket) {
            this.dockerSocket = dockerSocket;
            return this;
        }
        @CustomType.Setter
        public Builder hostnameOverride(@Nullable String hostnameOverride) {
            this.hostnameOverride = hostnameOverride;
            return this;
        }
        @CustomType.Setter
        public Builder internalAddress(@Nullable String internalAddress) {
            this.internalAddress = internalAddress;
            return this;
        }
        @CustomType.Setter
        public Builder labels(@Nullable Map<String,Object> labels) {
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder nodeId(@Nullable String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable String port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder roles(List<String> roles) {
            this.roles = Objects.requireNonNull(roles);
            return this;
        }
        public Builder roles(String... roles) {
            return roles(List.of(roles));
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
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigNode build() {
            final var _resultValue = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigNode();
            _resultValue.address = address;
            _resultValue.dockerSocket = dockerSocket;
            _resultValue.hostnameOverride = hostnameOverride;
            _resultValue.internalAddress = internalAddress;
            _resultValue.labels = labels;
            _resultValue.nodeId = nodeId;
            _resultValue.port = port;
            _resultValue.roles = roles;
            _resultValue.sshAgentAuth = sshAgentAuth;
            _resultValue.sshKey = sshKey;
            _resultValue.sshKeyPath = sshKeyPath;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
