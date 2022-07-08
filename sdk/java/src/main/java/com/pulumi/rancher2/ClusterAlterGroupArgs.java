// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterAlterGroupRecipientArgs;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterAlterGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterAlterGroupArgs Empty = new ClusterAlterGroupArgs();

    /**
     * The cluster alert group annotations (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return The cluster alert group annotations (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The cluster id where create cluster alert group (string)
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The cluster id where create cluster alert group (string)
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * The cluster alert group description (string)
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The cluster alert group description (string)
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The cluster alert group interval seconds. Default: `180` (int)
     * 
     */
    @Import(name="groupIntervalSeconds")
    private @Nullable Output<Integer> groupIntervalSeconds;

    /**
     * @return The cluster alert group interval seconds. Default: `180` (int)
     * 
     */
    public Optional<Output<Integer>> groupIntervalSeconds() {
        return Optional.ofNullable(this.groupIntervalSeconds);
    }

    /**
     * The cluster alert group wait seconds. Default: `180` (int)
     * 
     */
    @Import(name="groupWaitSeconds")
    private @Nullable Output<Integer> groupWaitSeconds;

    /**
     * @return The cluster alert group wait seconds. Default: `180` (int)
     * 
     */
    public Optional<Output<Integer>> groupWaitSeconds() {
        return Optional.ofNullable(this.groupWaitSeconds);
    }

    /**
     * The cluster alert group labels (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return The cluster alert group labels (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The cluster alert group name (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The cluster alert group name (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The cluster alert group recipients (list)
     * 
     */
    @Import(name="recipients")
    private @Nullable Output<List<ClusterAlterGroupRecipientArgs>> recipients;

    /**
     * @return The cluster alert group recipients (list)
     * 
     */
    public Optional<Output<List<ClusterAlterGroupRecipientArgs>>> recipients() {
        return Optional.ofNullable(this.recipients);
    }

    /**
     * The cluster alert group wait seconds. Default: `3600` (int)
     * 
     */
    @Import(name="repeatIntervalSeconds")
    private @Nullable Output<Integer> repeatIntervalSeconds;

    /**
     * @return The cluster alert group wait seconds. Default: `3600` (int)
     * 
     */
    public Optional<Output<Integer>> repeatIntervalSeconds() {
        return Optional.ofNullable(this.repeatIntervalSeconds);
    }

    private ClusterAlterGroupArgs() {}

    private ClusterAlterGroupArgs(ClusterAlterGroupArgs $) {
        this.annotations = $.annotations;
        this.clusterId = $.clusterId;
        this.description = $.description;
        this.groupIntervalSeconds = $.groupIntervalSeconds;
        this.groupWaitSeconds = $.groupWaitSeconds;
        this.labels = $.labels;
        this.name = $.name;
        this.recipients = $.recipients;
        this.repeatIntervalSeconds = $.repeatIntervalSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterAlterGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterAlterGroupArgs $;

        public Builder() {
            $ = new ClusterAlterGroupArgs();
        }

        public Builder(ClusterAlterGroupArgs defaults) {
            $ = new ClusterAlterGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations The cluster alert group annotations (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations The cluster alert group annotations (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param clusterId The cluster id where create cluster alert group (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The cluster id where create cluster alert group (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param description The cluster alert group description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The cluster alert group description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param groupIntervalSeconds The cluster alert group interval seconds. Default: `180` (int)
         * 
         * @return builder
         * 
         */
        public Builder groupIntervalSeconds(@Nullable Output<Integer> groupIntervalSeconds) {
            $.groupIntervalSeconds = groupIntervalSeconds;
            return this;
        }

        /**
         * @param groupIntervalSeconds The cluster alert group interval seconds. Default: `180` (int)
         * 
         * @return builder
         * 
         */
        public Builder groupIntervalSeconds(Integer groupIntervalSeconds) {
            return groupIntervalSeconds(Output.of(groupIntervalSeconds));
        }

        /**
         * @param groupWaitSeconds The cluster alert group wait seconds. Default: `180` (int)
         * 
         * @return builder
         * 
         */
        public Builder groupWaitSeconds(@Nullable Output<Integer> groupWaitSeconds) {
            $.groupWaitSeconds = groupWaitSeconds;
            return this;
        }

        /**
         * @param groupWaitSeconds The cluster alert group wait seconds. Default: `180` (int)
         * 
         * @return builder
         * 
         */
        public Builder groupWaitSeconds(Integer groupWaitSeconds) {
            return groupWaitSeconds(Output.of(groupWaitSeconds));
        }

        /**
         * @param labels The cluster alert group labels (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The cluster alert group labels (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The cluster alert group name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The cluster alert group name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param recipients The cluster alert group recipients (list)
         * 
         * @return builder
         * 
         */
        public Builder recipients(@Nullable Output<List<ClusterAlterGroupRecipientArgs>> recipients) {
            $.recipients = recipients;
            return this;
        }

        /**
         * @param recipients The cluster alert group recipients (list)
         * 
         * @return builder
         * 
         */
        public Builder recipients(List<ClusterAlterGroupRecipientArgs> recipients) {
            return recipients(Output.of(recipients));
        }

        /**
         * @param recipients The cluster alert group recipients (list)
         * 
         * @return builder
         * 
         */
        public Builder recipients(ClusterAlterGroupRecipientArgs... recipients) {
            return recipients(List.of(recipients));
        }

        /**
         * @param repeatIntervalSeconds The cluster alert group wait seconds. Default: `3600` (int)
         * 
         * @return builder
         * 
         */
        public Builder repeatIntervalSeconds(@Nullable Output<Integer> repeatIntervalSeconds) {
            $.repeatIntervalSeconds = repeatIntervalSeconds;
            return this;
        }

        /**
         * @param repeatIntervalSeconds The cluster alert group wait seconds. Default: `3600` (int)
         * 
         * @return builder
         * 
         */
        public Builder repeatIntervalSeconds(Integer repeatIntervalSeconds) {
            return repeatIntervalSeconds(Output.of(repeatIntervalSeconds));
        }

        public ClusterAlterGroupArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            return $;
        }
    }

}
