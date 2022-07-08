// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppState extends com.pulumi.resources.ResourceArgs {

    public static final AppState Empty = new AppState();

    /**
     * Annotations for App object (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for App object (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Answers for the app template. If modified, app will be upgraded (map)
     * 
     */
    @Import(name="answers")
    private @Nullable Output<Map<String,Object>> answers;

    /**
     * @return Answers for the app template. If modified, app will be upgraded (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> answers() {
        return Optional.ofNullable(this.answers);
    }

    /**
     * Catalog name of the app. If modified, app will be upgraded. For use scoped catalogs:
     * * add cluster ID before name, `local:&lt;name&gt;` or `c-XXXXX:&lt;name&gt;`
     * * add project ID before name, `p-XXXXX:&lt;name&gt;`
     * 
     */
    @Import(name="catalogName")
    private @Nullable Output<String> catalogName;

    /**
     * @return Catalog name of the app. If modified, app will be upgraded. For use scoped catalogs:
     * * add cluster ID before name, `local:&lt;name&gt;` or `c-XXXXX:&lt;name&gt;`
     * * add project ID before name, `p-XXXXX:&lt;name&gt;`
     * 
     */
    public Optional<Output<String>> catalogName() {
        return Optional.ofNullable(this.catalogName);
    }

    /**
     * Description for the app (string)
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description for the app (string)
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Computed) The url of the app template on a catalog (string)
     * 
     */
    @Import(name="externalId")
    private @Nullable Output<String> externalId;

    /**
     * @return (Computed) The url of the app template on a catalog (string)
     * 
     */
    public Optional<Output<String>> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    /**
     * Force app upgrade (string)
     * 
     */
    @Import(name="forceUpgrade")
    private @Nullable Output<Boolean> forceUpgrade;

    /**
     * @return Force app upgrade (string)
     * 
     */
    public Optional<Output<Boolean>> forceUpgrade() {
        return Optional.ofNullable(this.forceUpgrade);
    }

    /**
     * Labels for App object (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels for App object (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the app (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the app (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The project id where the app will be installed (string)
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The project id where the app will be installed (string)
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Current revision id for the app. If modified, If this argument is provided or modified, app will be rollbacked to `revision_id` (string)
     * 
     */
    @Import(name="revisionId")
    private @Nullable Output<String> revisionId;

    /**
     * @return Current revision id for the app. If modified, If this argument is provided or modified, app will be rollbacked to `revision_id` (string)
     * 
     */
    public Optional<Output<String>> revisionId() {
        return Optional.ofNullable(this.revisionId);
    }

    /**
     * The namespace id where the app will be installed (string)
     * 
     */
    @Import(name="targetNamespace")
    private @Nullable Output<String> targetNamespace;

    /**
     * @return The namespace id where the app will be installed (string)
     * 
     */
    public Optional<Output<String>> targetNamespace() {
        return Optional.ofNullable(this.targetNamespace);
    }

    /**
     * Template name of the app. If modified, app will be upgraded (string)
     * 
     */
    @Import(name="templateName")
    private @Nullable Output<String> templateName;

    /**
     * @return Template name of the app. If modified, app will be upgraded (string)
     * 
     */
    public Optional<Output<String>> templateName() {
        return Optional.ofNullable(this.templateName);
    }

    /**
     * Template version of the app. If modified, app will be upgraded. Default: `latest` (string)
     * 
     */
    @Import(name="templateVersion")
    private @Nullable Output<String> templateVersion;

    /**
     * @return Template version of the app. If modified, app will be upgraded. Default: `latest` (string)
     * 
     */
    public Optional<Output<String>> templateVersion() {
        return Optional.ofNullable(this.templateVersion);
    }

    /**
     * values.yaml base64 encoded file content for the app template. If modified, app will be upgraded (string)
     * 
     */
    @Import(name="valuesYaml")
    private @Nullable Output<String> valuesYaml;

    /**
     * @return values.yaml base64 encoded file content for the app template. If modified, app will be upgraded (string)
     * 
     */
    public Optional<Output<String>> valuesYaml() {
        return Optional.ofNullable(this.valuesYaml);
    }

    /**
     * Wait until app is deployed and active. Default: `true` (bool)
     * 
     */
    @Import(name="wait")
    private @Nullable Output<Boolean> wait;

    /**
     * @return Wait until app is deployed and active. Default: `true` (bool)
     * 
     */
    public Optional<Output<Boolean>> wait_() {
        return Optional.ofNullable(this.wait);
    }

    private AppState() {}

    private AppState(AppState $) {
        this.annotations = $.annotations;
        this.answers = $.answers;
        this.catalogName = $.catalogName;
        this.description = $.description;
        this.externalId = $.externalId;
        this.forceUpgrade = $.forceUpgrade;
        this.labels = $.labels;
        this.name = $.name;
        this.projectId = $.projectId;
        this.revisionId = $.revisionId;
        this.targetNamespace = $.targetNamespace;
        this.templateName = $.templateName;
        this.templateVersion = $.templateVersion;
        this.valuesYaml = $.valuesYaml;
        this.wait = $.wait;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppState $;

        public Builder() {
            $ = new AppState();
        }

        public Builder(AppState defaults) {
            $ = new AppState(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations for App object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for App object (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param answers Answers for the app template. If modified, app will be upgraded (map)
         * 
         * @return builder
         * 
         */
        public Builder answers(@Nullable Output<Map<String,Object>> answers) {
            $.answers = answers;
            return this;
        }

        /**
         * @param answers Answers for the app template. If modified, app will be upgraded (map)
         * 
         * @return builder
         * 
         */
        public Builder answers(Map<String,Object> answers) {
            return answers(Output.of(answers));
        }

        /**
         * @param catalogName Catalog name of the app. If modified, app will be upgraded. For use scoped catalogs:
         * * add cluster ID before name, `local:&lt;name&gt;` or `c-XXXXX:&lt;name&gt;`
         * * add project ID before name, `p-XXXXX:&lt;name&gt;`
         * 
         * @return builder
         * 
         */
        public Builder catalogName(@Nullable Output<String> catalogName) {
            $.catalogName = catalogName;
            return this;
        }

        /**
         * @param catalogName Catalog name of the app. If modified, app will be upgraded. For use scoped catalogs:
         * * add cluster ID before name, `local:&lt;name&gt;` or `c-XXXXX:&lt;name&gt;`
         * * add project ID before name, `p-XXXXX:&lt;name&gt;`
         * 
         * @return builder
         * 
         */
        public Builder catalogName(String catalogName) {
            return catalogName(Output.of(catalogName));
        }

        /**
         * @param description Description for the app (string)
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description for the app (string)
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param externalId (Computed) The url of the app template on a catalog (string)
         * 
         * @return builder
         * 
         */
        public Builder externalId(@Nullable Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        /**
         * @param externalId (Computed) The url of the app template on a catalog (string)
         * 
         * @return builder
         * 
         */
        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        /**
         * @param forceUpgrade Force app upgrade (string)
         * 
         * @return builder
         * 
         */
        public Builder forceUpgrade(@Nullable Output<Boolean> forceUpgrade) {
            $.forceUpgrade = forceUpgrade;
            return this;
        }

        /**
         * @param forceUpgrade Force app upgrade (string)
         * 
         * @return builder
         * 
         */
        public Builder forceUpgrade(Boolean forceUpgrade) {
            return forceUpgrade(Output.of(forceUpgrade));
        }

        /**
         * @param labels Labels for App object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for App object (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The name of the app (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the app (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId The project id where the app will be installed (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The project id where the app will be installed (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param revisionId Current revision id for the app. If modified, If this argument is provided or modified, app will be rollbacked to `revision_id` (string)
         * 
         * @return builder
         * 
         */
        public Builder revisionId(@Nullable Output<String> revisionId) {
            $.revisionId = revisionId;
            return this;
        }

        /**
         * @param revisionId Current revision id for the app. If modified, If this argument is provided or modified, app will be rollbacked to `revision_id` (string)
         * 
         * @return builder
         * 
         */
        public Builder revisionId(String revisionId) {
            return revisionId(Output.of(revisionId));
        }

        /**
         * @param targetNamespace The namespace id where the app will be installed (string)
         * 
         * @return builder
         * 
         */
        public Builder targetNamespace(@Nullable Output<String> targetNamespace) {
            $.targetNamespace = targetNamespace;
            return this;
        }

        /**
         * @param targetNamespace The namespace id where the app will be installed (string)
         * 
         * @return builder
         * 
         */
        public Builder targetNamespace(String targetNamespace) {
            return targetNamespace(Output.of(targetNamespace));
        }

        /**
         * @param templateName Template name of the app. If modified, app will be upgraded (string)
         * 
         * @return builder
         * 
         */
        public Builder templateName(@Nullable Output<String> templateName) {
            $.templateName = templateName;
            return this;
        }

        /**
         * @param templateName Template name of the app. If modified, app will be upgraded (string)
         * 
         * @return builder
         * 
         */
        public Builder templateName(String templateName) {
            return templateName(Output.of(templateName));
        }

        /**
         * @param templateVersion Template version of the app. If modified, app will be upgraded. Default: `latest` (string)
         * 
         * @return builder
         * 
         */
        public Builder templateVersion(@Nullable Output<String> templateVersion) {
            $.templateVersion = templateVersion;
            return this;
        }

        /**
         * @param templateVersion Template version of the app. If modified, app will be upgraded. Default: `latest` (string)
         * 
         * @return builder
         * 
         */
        public Builder templateVersion(String templateVersion) {
            return templateVersion(Output.of(templateVersion));
        }

        /**
         * @param valuesYaml values.yaml base64 encoded file content for the app template. If modified, app will be upgraded (string)
         * 
         * @return builder
         * 
         */
        public Builder valuesYaml(@Nullable Output<String> valuesYaml) {
            $.valuesYaml = valuesYaml;
            return this;
        }

        /**
         * @param valuesYaml values.yaml base64 encoded file content for the app template. If modified, app will be upgraded (string)
         * 
         * @return builder
         * 
         */
        public Builder valuesYaml(String valuesYaml) {
            return valuesYaml(Output.of(valuesYaml));
        }

        /**
         * @param wait Wait until app is deployed and active. Default: `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder wait_(@Nullable Output<Boolean> wait) {
            $.wait = wait;
            return this;
        }

        /**
         * @param wait Wait until app is deployed and active. Default: `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder wait_(Boolean wait) {
            return wait_(Output.of(wait));
        }

        public AppState build() {
            return $;
        }
    }

}
