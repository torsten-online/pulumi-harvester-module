// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.NamespaceContainerResourceLimitArgs;
import com.pulumi.rancher2.inputs.NamespaceResourceQuotaArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamespaceState extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceState Empty = new NamespaceState();

    /**
     * Annotations for Node Pool object (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for Node Pool object (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Default containers resource limits on namespace (List maxitem:1)
     * 
     */
    @Import(name="containerResourceLimit")
    private @Nullable Output<NamespaceContainerResourceLimitArgs> containerResourceLimit;

    /**
     * @return Default containers resource limits on namespace (List maxitem:1)
     * 
     */
    public Optional<Output<NamespaceContainerResourceLimitArgs>> containerResourceLimit() {
        return Optional.ofNullable(this.containerResourceLimit);
    }

    /**
     * A namespace description (string)
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A namespace description (string)
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Labels for Node Pool object (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels for Node Pool object (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the namespace (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the namespace (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The project id where assign namespace. It&#39;s on the form `project_id=&lt;cluster_id&gt;:&lt;id&gt;`. Updating `&lt;id&gt;` part on same `&lt;cluster_id&gt;` namespace will be moved between projects (string)
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The project id where assign namespace. It&#39;s on the form `project_id=&lt;cluster_id&gt;:&lt;id&gt;`. Updating `&lt;id&gt;` part on same `&lt;cluster_id&gt;` namespace will be moved between projects (string)
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
     * 
     */
    @Import(name="resourceQuota")
    private @Nullable Output<NamespaceResourceQuotaArgs> resourceQuota;

    /**
     * @return Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
     * 
     */
    public Optional<Output<NamespaceResourceQuotaArgs>> resourceQuota() {
        return Optional.ofNullable(this.resourceQuota);
    }

    /**
     * Wait for cluster becomes active. Default `false` (bool)
     * 
     */
    @Import(name="waitForCluster")
    private @Nullable Output<Boolean> waitForCluster;

    /**
     * @return Wait for cluster becomes active. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> waitForCluster() {
        return Optional.ofNullable(this.waitForCluster);
    }

    private NamespaceState() {}

    private NamespaceState(NamespaceState $) {
        this.annotations = $.annotations;
        this.containerResourceLimit = $.containerResourceLimit;
        this.description = $.description;
        this.labels = $.labels;
        this.name = $.name;
        this.projectId = $.projectId;
        this.resourceQuota = $.resourceQuota;
        this.waitForCluster = $.waitForCluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceState $;

        public Builder() {
            $ = new NamespaceState();
        }

        public Builder(NamespaceState defaults) {
            $ = new NamespaceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations for Node Pool object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for Node Pool object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param containerResourceLimit Default containers resource limits on namespace (List maxitem:1)
         * 
         * @return builder
         * 
         */
        public Builder containerResourceLimit(@Nullable Output<NamespaceContainerResourceLimitArgs> containerResourceLimit) {
            $.containerResourceLimit = containerResourceLimit;
            return this;
        }

        /**
         * @param containerResourceLimit Default containers resource limits on namespace (List maxitem:1)
         * 
         * @return builder
         * 
         */
        public Builder containerResourceLimit(NamespaceContainerResourceLimitArgs containerResourceLimit) {
            return containerResourceLimit(Output.of(containerResourceLimit));
        }

        /**
         * @param description A namespace description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A namespace description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels Labels for Node Pool object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for Node Pool object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The name of the namespace (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the namespace (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId The project id where assign namespace. It&#39;s on the form `project_id=&lt;cluster_id&gt;:&lt;id&gt;`. Updating `&lt;id&gt;` part on same `&lt;cluster_id&gt;` namespace will be moved between projects (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The project id where assign namespace. It&#39;s on the form `project_id=&lt;cluster_id&gt;:&lt;id&gt;`. Updating `&lt;id&gt;` part on same `&lt;cluster_id&gt;` namespace will be moved between projects (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param resourceQuota Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder resourceQuota(@Nullable Output<NamespaceResourceQuotaArgs> resourceQuota) {
            $.resourceQuota = resourceQuota;
            return this;
        }

        /**
         * @param resourceQuota Resource quota for namespace. Rancher v2.1.x or higher (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder resourceQuota(NamespaceResourceQuotaArgs resourceQuota) {
            return resourceQuota(Output.of(resourceQuota));
        }

        /**
         * @param waitForCluster Wait for cluster becomes active. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder waitForCluster(@Nullable Output<Boolean> waitForCluster) {
            $.waitForCluster = waitForCluster;
            return this;
        }

        /**
         * @param waitForCluster Wait for cluster becomes active. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder waitForCluster(Boolean waitForCluster) {
            return waitForCluster(Output.of(waitForCluster));
        }

        public NamespaceState build() {
            return $;
        }
    }

}
