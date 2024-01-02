// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalDnsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalDnsArgs Empty = new GlobalDnsArgs();

    /**
     * Annotations for Global DNS (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for Global DNS (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The Global DNS record (string)
     * 
     */
    @Import(name="fqdn", required=true)
    private Output<String> fqdn;

    /**
     * @return The Global DNS record (string)
     * 
     */
    public Output<String> fqdn() {
        return this.fqdn;
    }

    /**
     * Labels for Global DNS (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels for Global DNS (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The MultiCluster App ID to assign to the Global DNS. Conflicts with `project_ids` (string)
     * 
     */
    @Import(name="multiClusterAppId")
    private @Nullable Output<String> multiClusterAppId;

    /**
     * @return The MultiCluster App ID to assign to the Global DNS. Conflicts with `project_ids` (string)
     * 
     */
    public Optional<Output<String>> multiClusterAppId() {
        return Optional.ofNullable(this.multiClusterAppId);
    }

    /**
     * The name of the Global DNS (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Global DNS (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of project_ids to assign to the Global DNS. Conflicts with `multi_cluster_app_id` (list(string))
     * 
     */
    @Import(name="projectIds")
    private @Nullable Output<List<String>> projectIds;

    /**
     * @return A list of project_ids to assign to the Global DNS. Conflicts with `multi_cluster_app_id` (list(string))
     * 
     */
    public Optional<Output<List<String>>> projectIds() {
        return Optional.ofNullable(this.projectIds);
    }

    /**
     * The Global DNS provider ID to use (string)
     * 
     */
    @Import(name="providerId", required=true)
    private Output<String> providerId;

    /**
     * @return The Global DNS provider ID to use (string)
     * 
     */
    public Output<String> providerId() {
        return this.providerId;
    }

    /**
     * TTL in seconds for DNS record. Default: `300` (int)
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<Integer> ttl;

    /**
     * @return TTL in seconds for DNS record. Default: `300` (int)
     * 
     */
    public Optional<Output<Integer>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    private GlobalDnsArgs() {}

    private GlobalDnsArgs(GlobalDnsArgs $) {
        this.annotations = $.annotations;
        this.fqdn = $.fqdn;
        this.labels = $.labels;
        this.multiClusterAppId = $.multiClusterAppId;
        this.name = $.name;
        this.projectIds = $.projectIds;
        this.providerId = $.providerId;
        this.ttl = $.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalDnsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalDnsArgs $;

        public Builder() {
            $ = new GlobalDnsArgs();
        }

        public Builder(GlobalDnsArgs defaults) {
            $ = new GlobalDnsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations for Global DNS (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for Global DNS (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param fqdn The Global DNS record (string)
         * 
         * @return builder
         * 
         */
        public Builder fqdn(Output<String> fqdn) {
            $.fqdn = fqdn;
            return this;
        }

        /**
         * @param fqdn The Global DNS record (string)
         * 
         * @return builder
         * 
         */
        public Builder fqdn(String fqdn) {
            return fqdn(Output.of(fqdn));
        }

        /**
         * @param labels Labels for Global DNS (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for Global DNS (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param multiClusterAppId The MultiCluster App ID to assign to the Global DNS. Conflicts with `project_ids` (string)
         * 
         * @return builder
         * 
         */
        public Builder multiClusterAppId(@Nullable Output<String> multiClusterAppId) {
            $.multiClusterAppId = multiClusterAppId;
            return this;
        }

        /**
         * @param multiClusterAppId The MultiCluster App ID to assign to the Global DNS. Conflicts with `project_ids` (string)
         * 
         * @return builder
         * 
         */
        public Builder multiClusterAppId(String multiClusterAppId) {
            return multiClusterAppId(Output.of(multiClusterAppId));
        }

        /**
         * @param name The name of the Global DNS (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Global DNS (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectIds A list of project_ids to assign to the Global DNS. Conflicts with `multi_cluster_app_id` (list(string))
         * 
         * @return builder
         * 
         */
        public Builder projectIds(@Nullable Output<List<String>> projectIds) {
            $.projectIds = projectIds;
            return this;
        }

        /**
         * @param projectIds A list of project_ids to assign to the Global DNS. Conflicts with `multi_cluster_app_id` (list(string))
         * 
         * @return builder
         * 
         */
        public Builder projectIds(List<String> projectIds) {
            return projectIds(Output.of(projectIds));
        }

        /**
         * @param projectIds A list of project_ids to assign to the Global DNS. Conflicts with `multi_cluster_app_id` (list(string))
         * 
         * @return builder
         * 
         */
        public Builder projectIds(String... projectIds) {
            return projectIds(List.of(projectIds));
        }

        /**
         * @param providerId The Global DNS provider ID to use (string)
         * 
         * @return builder
         * 
         */
        public Builder providerId(Output<String> providerId) {
            $.providerId = providerId;
            return this;
        }

        /**
         * @param providerId The Global DNS provider ID to use (string)
         * 
         * @return builder
         * 
         */
        public Builder providerId(String providerId) {
            return providerId(Output.of(providerId));
        }

        /**
         * @param ttl TTL in seconds for DNS record. Default: `300` (int)
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<Integer> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl TTL in seconds for DNS record. Default: `300` (int)
         * 
         * @return builder
         * 
         */
        public Builder ttl(Integer ttl) {
            return ttl(Output.of(ttl));
        }

        public GlobalDnsArgs build() {
            if ($.fqdn == null) {
                throw new MissingRequiredPropertyException("GlobalDnsArgs", "fqdn");
            }
            if ($.providerId == null) {
                throw new MissingRequiredPropertyException("GlobalDnsArgs", "providerId");
            }
            return $;
        }
    }

}
