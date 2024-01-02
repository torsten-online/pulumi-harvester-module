// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.inputs.RegistryRegistryArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryArgs Empty = new RegistryArgs();

    /**
     * Annotations for Registry object (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for Registry object (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * A registry description (string)
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A registry description (string)
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Labels for Registry object (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels for Registry object (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the registry (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the registry (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The namespace id where to assign the namespaced registry (string)
     * 
     */
    @Import(name="namespaceId")
    private @Nullable Output<String> namespaceId;

    /**
     * @return The namespace id where to assign the namespaced registry (string)
     * 
     */
    public Optional<Output<String>> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }

    /**
     * The project id where to assign the registry (string)
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The project id where to assign the registry (string)
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * Registries data for registry (list)
     * 
     */
    @Import(name="registries", required=true)
    private Output<List<RegistryRegistryArgs>> registries;

    /**
     * @return Registries data for registry (list)
     * 
     */
    public Output<List<RegistryRegistryArgs>> registries() {
        return this.registries;
    }

    private RegistryArgs() {}

    private RegistryArgs(RegistryArgs $) {
        this.annotations = $.annotations;
        this.description = $.description;
        this.labels = $.labels;
        this.name = $.name;
        this.namespaceId = $.namespaceId;
        this.projectId = $.projectId;
        this.registries = $.registries;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryArgs $;

        public Builder() {
            $ = new RegistryArgs();
        }

        public Builder(RegistryArgs defaults) {
            $ = new RegistryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations for Registry object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for Registry object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param description A registry description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A registry description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels Labels for Registry object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for Registry object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The name of the registry (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the registry (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceId The namespace id where to assign the namespaced registry (string)
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(@Nullable Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param namespaceId The namespace id where to assign the namespaced registry (string)
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        /**
         * @param projectId The project id where to assign the registry (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The project id where to assign the registry (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param registries Registries data for registry (list)
         * 
         * @return builder
         * 
         */
        public Builder registries(Output<List<RegistryRegistryArgs>> registries) {
            $.registries = registries;
            return this;
        }

        /**
         * @param registries Registries data for registry (list)
         * 
         * @return builder
         * 
         */
        public Builder registries(List<RegistryRegistryArgs> registries) {
            return registries(Output.of(registries));
        }

        /**
         * @param registries Registries data for registry (list)
         * 
         * @return builder
         * 
         */
        public Builder registries(RegistryRegistryArgs... registries) {
            return registries(List.of(registries));
        }

        public RegistryArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("RegistryArgs", "projectId");
            }
            if ($.registries == null) {
                throw new MissingRequiredPropertyException("RegistryArgs", "registries");
            }
            return $;
        }
    }

}
