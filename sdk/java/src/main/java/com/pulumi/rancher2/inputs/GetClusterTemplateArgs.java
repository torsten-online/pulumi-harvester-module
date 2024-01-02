// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterTemplateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterTemplateArgs Empty = new GetClusterTemplateArgs();

    /**
     * (Computed) Annotations for the cluster template (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return (Computed) Annotations for the cluster template (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Computed) Labels for the cluster template (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return (Computed) Labels for the cluster template (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The cluster template name (string)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The cluster template name (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetClusterTemplateArgs() {}

    private GetClusterTemplateArgs(GetClusterTemplateArgs $) {
        this.annotations = $.annotations;
        this.description = $.description;
        this.labels = $.labels;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterTemplateArgs $;

        public Builder() {
            $ = new GetClusterTemplateArgs();
        }

        public Builder(GetClusterTemplateArgs defaults) {
            $ = new GetClusterTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations (Computed) Annotations for the cluster template (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations (Computed) Annotations for the cluster template (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels (Computed) Labels for the cluster template (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels (Computed) Labels for the cluster template (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The cluster template name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The cluster template name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetClusterTemplateArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetClusterTemplateArgs", "name");
            }
            return $;
        }
    }

}
