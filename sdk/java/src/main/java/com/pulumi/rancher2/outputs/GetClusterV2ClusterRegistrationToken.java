// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetClusterV2ClusterRegistrationToken {
    private Map<String,Object> annotations;
    private String clusterId;
    private String command;
    /**
     * @return (Computed) The ID of the resource (string)
     * 
     */
    private String id;
    private String insecureCommand;
    private String insecureNodeCommand;
    private String insecureWindowsNodeCommand;
    private Map<String,Object> labels;
    private String manifestUrl;
    /**
     * @return The name of the Cluster v2 (string)
     * 
     */
    private String name;
    private String nodeCommand;
    private String token;
    private String windowsNodeCommand;

    private GetClusterV2ClusterRegistrationToken() {}
    public Map<String,Object> annotations() {
        return this.annotations;
    }
    public String clusterId() {
        return this.clusterId;
    }
    public String command() {
        return this.command;
    }
    /**
     * @return (Computed) The ID of the resource (string)
     * 
     */
    public String id() {
        return this.id;
    }
    public String insecureCommand() {
        return this.insecureCommand;
    }
    public String insecureNodeCommand() {
        return this.insecureNodeCommand;
    }
    public String insecureWindowsNodeCommand() {
        return this.insecureWindowsNodeCommand;
    }
    public Map<String,Object> labels() {
        return this.labels;
    }
    public String manifestUrl() {
        return this.manifestUrl;
    }
    /**
     * @return The name of the Cluster v2 (string)
     * 
     */
    public String name() {
        return this.name;
    }
    public String nodeCommand() {
        return this.nodeCommand;
    }
    public String token() {
        return this.token;
    }
    public String windowsNodeCommand() {
        return this.windowsNodeCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterV2ClusterRegistrationToken defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,Object> annotations;
        private String clusterId;
        private String command;
        private String id;
        private String insecureCommand;
        private String insecureNodeCommand;
        private String insecureWindowsNodeCommand;
        private Map<String,Object> labels;
        private String manifestUrl;
        private String name;
        private String nodeCommand;
        private String token;
        private String windowsNodeCommand;
        public Builder() {}
        public Builder(GetClusterV2ClusterRegistrationToken defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clusterId = defaults.clusterId;
    	      this.command = defaults.command;
    	      this.id = defaults.id;
    	      this.insecureCommand = defaults.insecureCommand;
    	      this.insecureNodeCommand = defaults.insecureNodeCommand;
    	      this.insecureWindowsNodeCommand = defaults.insecureWindowsNodeCommand;
    	      this.labels = defaults.labels;
    	      this.manifestUrl = defaults.manifestUrl;
    	      this.name = defaults.name;
    	      this.nodeCommand = defaults.nodeCommand;
    	      this.token = defaults.token;
    	      this.windowsNodeCommand = defaults.windowsNodeCommand;
        }

        @CustomType.Setter
        public Builder annotations(Map<String,Object> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        @CustomType.Setter
        public Builder command(String command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder insecureCommand(String insecureCommand) {
            this.insecureCommand = Objects.requireNonNull(insecureCommand);
            return this;
        }
        @CustomType.Setter
        public Builder insecureNodeCommand(String insecureNodeCommand) {
            this.insecureNodeCommand = Objects.requireNonNull(insecureNodeCommand);
            return this;
        }
        @CustomType.Setter
        public Builder insecureWindowsNodeCommand(String insecureWindowsNodeCommand) {
            this.insecureWindowsNodeCommand = Objects.requireNonNull(insecureWindowsNodeCommand);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,Object> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder manifestUrl(String manifestUrl) {
            this.manifestUrl = Objects.requireNonNull(manifestUrl);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder nodeCommand(String nodeCommand) {
            this.nodeCommand = Objects.requireNonNull(nodeCommand);
            return this;
        }
        @CustomType.Setter
        public Builder token(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }
        @CustomType.Setter
        public Builder windowsNodeCommand(String windowsNodeCommand) {
            this.windowsNodeCommand = Objects.requireNonNull(windowsNodeCommand);
            return this;
        }
        public GetClusterV2ClusterRegistrationToken build() {
            final var _resultValue = new GetClusterV2ClusterRegistrationToken();
            _resultValue.annotations = annotations;
            _resultValue.clusterId = clusterId;
            _resultValue.command = command;
            _resultValue.id = id;
            _resultValue.insecureCommand = insecureCommand;
            _resultValue.insecureNodeCommand = insecureNodeCommand;
            _resultValue.insecureWindowsNodeCommand = insecureWindowsNodeCommand;
            _resultValue.labels = labels;
            _resultValue.manifestUrl = manifestUrl;
            _resultValue.name = name;
            _resultValue.nodeCommand = nodeCommand;
            _resultValue.token = token;
            _resultValue.windowsNodeCommand = windowsNodeCommand;
            return _resultValue;
        }
    }
}
