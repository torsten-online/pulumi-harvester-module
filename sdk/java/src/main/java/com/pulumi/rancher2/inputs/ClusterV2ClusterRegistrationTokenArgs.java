// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterV2ClusterRegistrationTokenArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterV2ClusterRegistrationTokenArgs Empty = new ClusterV2ClusterRegistrationTokenArgs();

    /**
     * Annotations for cluster registration token object (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for cluster registration token object (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Cluster ID (string)
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return Cluster ID (string)
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * Command to execute in a imported k8s cluster (string)
     * 
     */
    @Import(name="command")
    private @Nullable Output<String> command;

    /**
     * @return Command to execute in a imported k8s cluster (string)
     * 
     */
    public Optional<Output<String>> command() {
        return Optional.ofNullable(this.command);
    }

    /**
     * (Computed) The ID of the resource (string)
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return (Computed) The ID of the resource (string)
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Insecure command to execute in a imported k8s cluster (string)
     * 
     */
    @Import(name="insecureCommand")
    private @Nullable Output<String> insecureCommand;

    /**
     * @return Insecure command to execute in a imported k8s cluster (string)
     * 
     */
    public Optional<Output<String>> insecureCommand() {
        return Optional.ofNullable(this.insecureCommand);
    }

    /**
     * Insecure node command to execute in a imported k8s cluster (string)
     * 
     */
    @Import(name="insecureNodeCommand")
    private @Nullable Output<String> insecureNodeCommand;

    /**
     * @return Insecure node command to execute in a imported k8s cluster (string)
     * 
     */
    public Optional<Output<String>> insecureNodeCommand() {
        return Optional.ofNullable(this.insecureNodeCommand);
    }

    /**
     * Insecure windows command to execute in a imported k8s cluster (string)
     * 
     */
    @Import(name="insecureWindowsNodeCommand")
    private @Nullable Output<String> insecureWindowsNodeCommand;

    /**
     * @return Insecure windows command to execute in a imported k8s cluster (string)
     * 
     */
    public Optional<Output<String>> insecureWindowsNodeCommand() {
        return Optional.ofNullable(this.insecureWindowsNodeCommand);
    }

    /**
     * Labels for cluster registration token object (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels for cluster registration token object (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * K8s manifest url to execute with `kubectl` to import an existing k8s cluster (string)
     * 
     */
    @Import(name="manifestUrl")
    private @Nullable Output<String> manifestUrl;

    /**
     * @return K8s manifest url to execute with `kubectl` to import an existing k8s cluster (string)
     * 
     */
    public Optional<Output<String>> manifestUrl() {
        return Optional.ofNullable(this.manifestUrl);
    }

    /**
     * Name of cluster registration token (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of cluster registration token (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Node command to execute in linux nodes for custom k8s cluster (string)
     * 
     */
    @Import(name="nodeCommand")
    private @Nullable Output<String> nodeCommand;

    /**
     * @return Node command to execute in linux nodes for custom k8s cluster (string)
     * 
     */
    public Optional<Output<String>> nodeCommand() {
        return Optional.ofNullable(this.nodeCommand);
    }

    /**
     * Token for cluster registration token object (string)
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return Token for cluster registration token object (string)
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    /**
     * Node command to execute in windows nodes for custom k8s cluster (string)
     * 
     */
    @Import(name="windowsNodeCommand")
    private @Nullable Output<String> windowsNodeCommand;

    /**
     * @return Node command to execute in windows nodes for custom k8s cluster (string)
     * 
     */
    public Optional<Output<String>> windowsNodeCommand() {
        return Optional.ofNullable(this.windowsNodeCommand);
    }

    private ClusterV2ClusterRegistrationTokenArgs() {}

    private ClusterV2ClusterRegistrationTokenArgs(ClusterV2ClusterRegistrationTokenArgs $) {
        this.annotations = $.annotations;
        this.clusterId = $.clusterId;
        this.command = $.command;
        this.id = $.id;
        this.insecureCommand = $.insecureCommand;
        this.insecureNodeCommand = $.insecureNodeCommand;
        this.insecureWindowsNodeCommand = $.insecureWindowsNodeCommand;
        this.labels = $.labels;
        this.manifestUrl = $.manifestUrl;
        this.name = $.name;
        this.nodeCommand = $.nodeCommand;
        this.token = $.token;
        this.windowsNodeCommand = $.windowsNodeCommand;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterV2ClusterRegistrationTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterV2ClusterRegistrationTokenArgs $;

        public Builder() {
            $ = new ClusterV2ClusterRegistrationTokenArgs();
        }

        public Builder(ClusterV2ClusterRegistrationTokenArgs defaults) {
            $ = new ClusterV2ClusterRegistrationTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations for cluster registration token object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for cluster registration token object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param clusterId Cluster ID (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId Cluster ID (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param command Command to execute in a imported k8s cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder command(@Nullable Output<String> command) {
            $.command = command;
            return this;
        }

        /**
         * @param command Command to execute in a imported k8s cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder command(String command) {
            return command(Output.of(command));
        }

        /**
         * @param id (Computed) The ID of the resource (string)
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id (Computed) The ID of the resource (string)
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param insecureCommand Insecure command to execute in a imported k8s cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder insecureCommand(@Nullable Output<String> insecureCommand) {
            $.insecureCommand = insecureCommand;
            return this;
        }

        /**
         * @param insecureCommand Insecure command to execute in a imported k8s cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder insecureCommand(String insecureCommand) {
            return insecureCommand(Output.of(insecureCommand));
        }

        /**
         * @param insecureNodeCommand Insecure node command to execute in a imported k8s cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder insecureNodeCommand(@Nullable Output<String> insecureNodeCommand) {
            $.insecureNodeCommand = insecureNodeCommand;
            return this;
        }

        /**
         * @param insecureNodeCommand Insecure node command to execute in a imported k8s cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder insecureNodeCommand(String insecureNodeCommand) {
            return insecureNodeCommand(Output.of(insecureNodeCommand));
        }

        /**
         * @param insecureWindowsNodeCommand Insecure windows command to execute in a imported k8s cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder insecureWindowsNodeCommand(@Nullable Output<String> insecureWindowsNodeCommand) {
            $.insecureWindowsNodeCommand = insecureWindowsNodeCommand;
            return this;
        }

        /**
         * @param insecureWindowsNodeCommand Insecure windows command to execute in a imported k8s cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder insecureWindowsNodeCommand(String insecureWindowsNodeCommand) {
            return insecureWindowsNodeCommand(Output.of(insecureWindowsNodeCommand));
        }

        /**
         * @param labels Labels for cluster registration token object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for cluster registration token object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param manifestUrl K8s manifest url to execute with `kubectl` to import an existing k8s cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder manifestUrl(@Nullable Output<String> manifestUrl) {
            $.manifestUrl = manifestUrl;
            return this;
        }

        /**
         * @param manifestUrl K8s manifest url to execute with `kubectl` to import an existing k8s cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder manifestUrl(String manifestUrl) {
            return manifestUrl(Output.of(manifestUrl));
        }

        /**
         * @param name Name of cluster registration token (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of cluster registration token (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeCommand Node command to execute in linux nodes for custom k8s cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder nodeCommand(@Nullable Output<String> nodeCommand) {
            $.nodeCommand = nodeCommand;
            return this;
        }

        /**
         * @param nodeCommand Node command to execute in linux nodes for custom k8s cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder nodeCommand(String nodeCommand) {
            return nodeCommand(Output.of(nodeCommand));
        }

        /**
         * @param token Token for cluster registration token object (string)
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token Token for cluster registration token object (string)
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        /**
         * @param windowsNodeCommand Node command to execute in windows nodes for custom k8s cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder windowsNodeCommand(@Nullable Output<String> windowsNodeCommand) {
            $.windowsNodeCommand = windowsNodeCommand;
            return this;
        }

        /**
         * @param windowsNodeCommand Node command to execute in windows nodes for custom k8s cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder windowsNodeCommand(String windowsNodeCommand) {
            return windowsNodeCommand(Output.of(windowsNodeCommand));
        }

        public ClusterV2ClusterRegistrationTokenArgs build() {
            return $;
        }
    }

}
