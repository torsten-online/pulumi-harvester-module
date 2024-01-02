// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppV2Args extends com.pulumi.resources.ResourceArgs {

    public static final AppV2Args Empty = new AppV2Args();

    /**
     * Annotations for the app v2 (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for the app v2 (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The app v2 chart name (string)
     * 
     */
    @Import(name="chartName", required=true)
    private Output<String> chartName;

    /**
     * @return The app v2 chart name (string)
     * 
     */
    public Output<String> chartName() {
        return this.chartName;
    }

    /**
     * The app v2 chart version (string)
     * 
     */
    @Import(name="chartVersion")
    private @Nullable Output<String> chartVersion;

    /**
     * @return The app v2 chart version (string)
     * 
     */
    public Optional<Output<String>> chartVersion() {
        return Optional.ofNullable(this.chartVersion);
    }

    /**
     * Cleanup app v2 on failed chart upgrade. Default: `false` (bool)
     * 
     */
    @Import(name="cleanupOnFail")
    private @Nullable Output<Boolean> cleanupOnFail;

    /**
     * @return Cleanup app v2 on failed chart upgrade. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> cleanupOnFail() {
        return Optional.ofNullable(this.cleanupOnFail);
    }

    /**
     * The cluster id of the app (string)
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The cluster id of the app (string)
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * Disable app v2 chart hooks. Default: `false` (bool)
     * 
     */
    @Import(name="disableHooks")
    private @Nullable Output<Boolean> disableHooks;

    /**
     * @return Disable app v2 chart hooks. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> disableHooks() {
        return Optional.ofNullable(this.disableHooks);
    }

    /**
     * Disable app V2 Open API Validation. Default: `false` (bool)
     * 
     */
    @Import(name="disableOpenApiValidation")
    private @Nullable Output<Boolean> disableOpenApiValidation;

    /**
     * @return Disable app V2 Open API Validation. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> disableOpenApiValidation() {
        return Optional.ofNullable(this.disableOpenApiValidation);
    }

    /**
     * Force app V2 chart upgrade. Default: `false` (bool)
     * 
     */
    @Import(name="forceUpgrade")
    private @Nullable Output<Boolean> forceUpgrade;

    /**
     * @return Force app V2 chart upgrade. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> forceUpgrade() {
        return Optional.ofNullable(this.forceUpgrade);
    }

    /**
     * Labels for the app v2 (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels for the app v2 (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the app v2 (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the app v2 (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The namespace of the app v2 (string)
     * 
     */
    @Import(name="namespace", required=true)
    private Output<String> namespace;

    /**
     * @return The namespace of the app v2 (string)
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }

    /**
     * Deploy the app v2 within project ID (string)
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Deploy the app v2 within project ID (string)
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Repo name (string)
     * 
     */
    @Import(name="repoName", required=true)
    private Output<String> repoName;

    /**
     * @return Repo name (string)
     * 
     */
    public Output<String> repoName() {
        return this.repoName;
    }

    /**
     * The app v2 values yaml. Yaml format is required (string)
     * 
     */
    @Import(name="values")
    private @Nullable Output<String> values;

    /**
     * @return The app v2 values yaml. Yaml format is required (string)
     * 
     */
    public Optional<Output<String>> values() {
        return Optional.ofNullable(this.values);
    }

    /**
     * Wait until app is deployed. Default: `true` (bool)
     * 
     */
    @Import(name="wait")
    private @Nullable Output<Boolean> wait;

    /**
     * @return Wait until app is deployed. Default: `true` (bool)
     * 
     */
    public Optional<Output<Boolean>> wait_() {
        return Optional.ofNullable(this.wait);
    }

    private AppV2Args() {}

    private AppV2Args(AppV2Args $) {
        this.annotations = $.annotations;
        this.chartName = $.chartName;
        this.chartVersion = $.chartVersion;
        this.cleanupOnFail = $.cleanupOnFail;
        this.clusterId = $.clusterId;
        this.disableHooks = $.disableHooks;
        this.disableOpenApiValidation = $.disableOpenApiValidation;
        this.forceUpgrade = $.forceUpgrade;
        this.labels = $.labels;
        this.name = $.name;
        this.namespace = $.namespace;
        this.projectId = $.projectId;
        this.repoName = $.repoName;
        this.values = $.values;
        this.wait = $.wait;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppV2Args $;

        public Builder() {
            $ = new AppV2Args();
        }

        public Builder(AppV2Args defaults) {
            $ = new AppV2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations for the app v2 (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for the app v2 (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param chartName The app v2 chart name (string)
         * 
         * @return builder
         * 
         */
        public Builder chartName(Output<String> chartName) {
            $.chartName = chartName;
            return this;
        }

        /**
         * @param chartName The app v2 chart name (string)
         * 
         * @return builder
         * 
         */
        public Builder chartName(String chartName) {
            return chartName(Output.of(chartName));
        }

        /**
         * @param chartVersion The app v2 chart version (string)
         * 
         * @return builder
         * 
         */
        public Builder chartVersion(@Nullable Output<String> chartVersion) {
            $.chartVersion = chartVersion;
            return this;
        }

        /**
         * @param chartVersion The app v2 chart version (string)
         * 
         * @return builder
         * 
         */
        public Builder chartVersion(String chartVersion) {
            return chartVersion(Output.of(chartVersion));
        }

        /**
         * @param cleanupOnFail Cleanup app v2 on failed chart upgrade. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder cleanupOnFail(@Nullable Output<Boolean> cleanupOnFail) {
            $.cleanupOnFail = cleanupOnFail;
            return this;
        }

        /**
         * @param cleanupOnFail Cleanup app v2 on failed chart upgrade. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder cleanupOnFail(Boolean cleanupOnFail) {
            return cleanupOnFail(Output.of(cleanupOnFail));
        }

        /**
         * @param clusterId The cluster id of the app (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The cluster id of the app (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param disableHooks Disable app v2 chart hooks. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder disableHooks(@Nullable Output<Boolean> disableHooks) {
            $.disableHooks = disableHooks;
            return this;
        }

        /**
         * @param disableHooks Disable app v2 chart hooks. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder disableHooks(Boolean disableHooks) {
            return disableHooks(Output.of(disableHooks));
        }

        /**
         * @param disableOpenApiValidation Disable app V2 Open API Validation. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder disableOpenApiValidation(@Nullable Output<Boolean> disableOpenApiValidation) {
            $.disableOpenApiValidation = disableOpenApiValidation;
            return this;
        }

        /**
         * @param disableOpenApiValidation Disable app V2 Open API Validation. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder disableOpenApiValidation(Boolean disableOpenApiValidation) {
            return disableOpenApiValidation(Output.of(disableOpenApiValidation));
        }

        /**
         * @param forceUpgrade Force app V2 chart upgrade. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder forceUpgrade(@Nullable Output<Boolean> forceUpgrade) {
            $.forceUpgrade = forceUpgrade;
            return this;
        }

        /**
         * @param forceUpgrade Force app V2 chart upgrade. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder forceUpgrade(Boolean forceUpgrade) {
            return forceUpgrade(Output.of(forceUpgrade));
        }

        /**
         * @param labels Labels for the app v2 (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for the app v2 (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The name of the app v2 (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the app v2 (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace The namespace of the app v2 (string)
         * 
         * @return builder
         * 
         */
        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The namespace of the app v2 (string)
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param projectId Deploy the app v2 within project ID (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Deploy the app v2 within project ID (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param repoName Repo name (string)
         * 
         * @return builder
         * 
         */
        public Builder repoName(Output<String> repoName) {
            $.repoName = repoName;
            return this;
        }

        /**
         * @param repoName Repo name (string)
         * 
         * @return builder
         * 
         */
        public Builder repoName(String repoName) {
            return repoName(Output.of(repoName));
        }

        /**
         * @param values The app v2 values yaml. Yaml format is required (string)
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The app v2 values yaml. Yaml format is required (string)
         * 
         * @return builder
         * 
         */
        public Builder values(String values) {
            return values(Output.of(values));
        }

        /**
         * @param wait Wait until app is deployed. Default: `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder wait_(@Nullable Output<Boolean> wait) {
            $.wait = wait;
            return this;
        }

        /**
         * @param wait Wait until app is deployed. Default: `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder wait_(Boolean wait) {
            return wait_(Output.of(wait));
        }

        public AppV2Args build() {
            if ($.chartName == null) {
                throw new MissingRequiredPropertyException("AppV2Args", "chartName");
            }
            if ($.clusterId == null) {
                throw new MissingRequiredPropertyException("AppV2Args", "clusterId");
            }
            if ($.namespace == null) {
                throw new MissingRequiredPropertyException("AppV2Args", "namespace");
            }
            if ($.repoName == null) {
                throw new MissingRequiredPropertyException("AppV2Args", "repoName");
            }
            return $;
        }
    }

}
