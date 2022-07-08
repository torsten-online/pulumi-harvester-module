// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.MultiClusterAppArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.MultiClusterAppState;
import com.pulumi.rancher2.outputs.MultiClusterAppAnswer;
import com.pulumi.rancher2.outputs.MultiClusterAppMember;
import com.pulumi.rancher2.outputs.MultiClusterAppTarget;
import com.pulumi.rancher2.outputs.MultiClusterAppUpgradeStrategy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ## Import
 * 
 * Multi cluster app can be imported using the multi cluster app ID in the format `&lt;multi_cluster_app_name&gt;`
 * 
 * ```sh
 *  $ pulumi import rancher2:index/multiClusterApp:MultiClusterApp foo &amp;lt;MULTI_CLUSTER_APP_ID&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/multiClusterApp:MultiClusterApp")
public class MultiClusterApp extends com.pulumi.resources.CustomResource {
    /**
     * Annotations for multi cluster app object (map)
     * 
     */
    @Export(name="annotations", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for multi cluster app object (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * The multi cluster app answers (list)
     * 
     */
    @Export(name="answers", type=List.class, parameters={MultiClusterAppAnswer.class})
    private Output<List<MultiClusterAppAnswer>> answers;

    /**
     * @return The multi cluster app answers (list)
     * 
     */
    public Output<List<MultiClusterAppAnswer>> answers() {
        return this.answers;
    }
    /**
     * The multi cluster app catalog name (string)
     * 
     */
    @Export(name="catalogName", type=String.class, parameters={})
    private Output<String> catalogName;

    /**
     * @return The multi cluster app catalog name (string)
     * 
     */
    public Output<String> catalogName() {
        return this.catalogName;
    }
    /**
     * Labels for multi cluster app object (map)
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> labels;

    /**
     * @return Labels for multi cluster app object (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * The multi cluster app answers (list)
     * 
     */
    @Export(name="members", type=List.class, parameters={MultiClusterAppMember.class})
    private Output</* @Nullable */ List<MultiClusterAppMember>> members;

    /**
     * @return The multi cluster app answers (list)
     * 
     */
    public Output<Optional<List<MultiClusterAppMember>>> members() {
        return Codegen.optional(this.members);
    }
    /**
     * The multi cluster app name (string)
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The multi cluster app name (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The multi cluster app revision history limit. Default `10` (int)
     * 
     */
    @Export(name="revisionHistoryLimit", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> revisionHistoryLimit;

    /**
     * @return The multi cluster app revision history limit. Default `10` (int)
     * 
     */
    public Output<Optional<Integer>> revisionHistoryLimit() {
        return Codegen.optional(this.revisionHistoryLimit);
    }
    /**
     * Current revision id for the multi cluster app (string)
     * 
     */
    @Export(name="revisionId", type=String.class, parameters={})
    private Output<String> revisionId;

    /**
     * @return Current revision id for the multi cluster app (string)
     * 
     */
    public Output<String> revisionId() {
        return this.revisionId;
    }
    /**
     * The multi cluster app roles (list)
     * 
     */
    @Export(name="roles", type=List.class, parameters={String.class})
    private Output<List<String>> roles;

    /**
     * @return The multi cluster app roles (list)
     * 
     */
    public Output<List<String>> roles() {
        return this.roles;
    }
    /**
     * The multi cluster app target projects (list)
     * 
     */
    @Export(name="targets", type=List.class, parameters={MultiClusterAppTarget.class})
    private Output<List<MultiClusterAppTarget>> targets;

    /**
     * @return The multi cluster app target projects (list)
     * 
     */
    public Output<List<MultiClusterAppTarget>> targets() {
        return this.targets;
    }
    /**
     * The multi cluster app template name (string)
     * 
     */
    @Export(name="templateName", type=String.class, parameters={})
    private Output<String> templateName;

    /**
     * @return The multi cluster app template name (string)
     * 
     */
    public Output<String> templateName() {
        return this.templateName;
    }
    /**
     * The multi cluster app template version. Default: `latest` (string)
     * 
     */
    @Export(name="templateVersion", type=String.class, parameters={})
    private Output<String> templateVersion;

    /**
     * @return The multi cluster app template version. Default: `latest` (string)
     * 
     */
    public Output<String> templateVersion() {
        return this.templateVersion;
    }
    /**
     * (Computed) The multi cluster app template version ID (string)
     * 
     */
    @Export(name="templateVersionId", type=String.class, parameters={})
    private Output<String> templateVersionId;

    /**
     * @return (Computed) The multi cluster app template version ID (string)
     * 
     */
    public Output<String> templateVersionId() {
        return this.templateVersionId;
    }
    /**
     * The multi cluster app upgrade strategy (list MaxItems:1)
     * 
     */
    @Export(name="upgradeStrategy", type=MultiClusterAppUpgradeStrategy.class, parameters={})
    private Output<MultiClusterAppUpgradeStrategy> upgradeStrategy;

    /**
     * @return The multi cluster app upgrade strategy (list MaxItems:1)
     * 
     */
    public Output<MultiClusterAppUpgradeStrategy> upgradeStrategy() {
        return this.upgradeStrategy;
    }
    /**
     * Wait until the multi cluster app is active. Default `true` (bool)
     * 
     */
    @Export(name="wait", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> wait;

    /**
     * @return Wait until the multi cluster app is active. Default `true` (bool)
     * 
     */
    public Output<Optional<Boolean>> wait_() {
        return Codegen.optional(this.wait);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MultiClusterApp(String name) {
        this(name, MultiClusterAppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MultiClusterApp(String name, MultiClusterAppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MultiClusterApp(String name, MultiClusterAppArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/multiClusterApp:MultiClusterApp", name, args == null ? MultiClusterAppArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MultiClusterApp(String name, Output<String> id, @Nullable MultiClusterAppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/multiClusterApp:MultiClusterApp", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static MultiClusterApp get(String name, Output<String> id, @Nullable MultiClusterAppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MultiClusterApp(name, id, state, options);
    }
}
