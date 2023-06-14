// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.ClusterAlertGroupArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.ClusterAlertGroupState;
import com.pulumi.rancher2.outputs.ClusterAlertGroupRecipient;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Cluster Alert Group resource. This can be used to create Cluster Alert Group for Rancher v2 environments and retrieve their information.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.ClusterAlertGroup;
 * import com.pulumi.rancher2.ClusterAlertGroupArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foo = new ClusterAlertGroup(&#34;foo&#34;, ClusterAlertGroupArgs.builder()        
 *             .clusterId(&#34;&lt;cluster_id&gt;&#34;)
 *             .description(&#34;Terraform cluster alert group&#34;)
 *             .groupIntervalSeconds(300)
 *             .repeatIntervalSeconds(3600)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cluster Alert Group can be imported using the Rancher cluster alert group ID
 * 
 * ```sh
 *  $ pulumi import rancher2:index/clusterAlertGroup:ClusterAlertGroup foo &amp;lt;CLUSTER_ALERT_GROUP_ID&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/clusterAlertGroup:ClusterAlertGroup")
public class ClusterAlertGroup extends com.pulumi.resources.CustomResource {
    /**
     * The cluster alert group annotations (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> annotations;

    /**
     * @return The cluster alert group annotations (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * The cluster id where create cluster alert group (string)
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
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
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The cluster alert group description (string)
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The cluster alert group interval seconds. Default: `180` (int)
     * 
     */
    @Export(name="groupIntervalSeconds", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> groupIntervalSeconds;

    /**
     * @return The cluster alert group interval seconds. Default: `180` (int)
     * 
     */
    public Output<Optional<Integer>> groupIntervalSeconds() {
        return Codegen.optional(this.groupIntervalSeconds);
    }
    /**
     * The cluster alert group wait seconds. Default: `180` (int)
     * 
     */
    @Export(name="groupWaitSeconds", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> groupWaitSeconds;

    /**
     * @return The cluster alert group wait seconds. Default: `180` (int)
     * 
     */
    public Output<Optional<Integer>> groupWaitSeconds() {
        return Codegen.optional(this.groupWaitSeconds);
    }
    /**
     * The cluster alert group labels (map)
     * 
     */
    @Export(name="labels", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> labels;

    /**
     * @return The cluster alert group labels (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * The cluster alert group name (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The cluster alert group name (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The cluster alert group recipients (list)
     * 
     */
    @Export(name="recipients", refs={List.class,ClusterAlertGroupRecipient.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ClusterAlertGroupRecipient>> recipients;

    /**
     * @return The cluster alert group recipients (list)
     * 
     */
    public Output<Optional<List<ClusterAlertGroupRecipient>>> recipients() {
        return Codegen.optional(this.recipients);
    }
    /**
     * The cluster alert group wait seconds. Default: `3600` (int)
     * 
     */
    @Export(name="repeatIntervalSeconds", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> repeatIntervalSeconds;

    /**
     * @return The cluster alert group wait seconds. Default: `3600` (int)
     * 
     */
    public Output<Optional<Integer>> repeatIntervalSeconds() {
        return Codegen.optional(this.repeatIntervalSeconds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterAlertGroup(String name) {
        this(name, ClusterAlertGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterAlertGroup(String name, ClusterAlertGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterAlertGroup(String name, ClusterAlertGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/clusterAlertGroup:ClusterAlertGroup", name, args == null ? ClusterAlertGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterAlertGroup(String name, Output<String> id, @Nullable ClusterAlertGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/clusterAlertGroup:ClusterAlertGroup", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("rancher2:index/clusterAlterGroup:ClusterAlterGroup").build())
            ))
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
    public static ClusterAlertGroup get(String name, Output<String> id, @Nullable ClusterAlertGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterAlertGroup(name, id, state, options);
    }
}
