// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.NodeDriverArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.NodeDriverState;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Node Driver resource. This can be used to create Node Driver for Rancher v2 RKE clusters and retrieve their information.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.NodeDriver;
 * import com.pulumi.rancher2.NodeDriverArgs;
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
 *         // Create a new rancher2 Node Driver
 *         var foo = new NodeDriver(&#34;foo&#34;, NodeDriverArgs.builder()        
 *             .active(true)
 *             .builtin(false)
 *             .checksum(&#34;0x0&#34;)
 *             .description(&#34;Foo description&#34;)
 *             .externalId(&#34;foo_external&#34;)
 *             .uiUrl(&#34;local://ui&#34;)
 *             .url(&#34;local://&#34;)
 *             .whitelistDomains(&#34;*.foo.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Node Driver can be imported using the Rancher Node Driver ID
 * 
 * ```sh
 * $ pulumi import rancher2:index/nodeDriver:NodeDriver foo &amp;lt;node_driver_id&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/nodeDriver:NodeDriver")
public class NodeDriver extends com.pulumi.resources.CustomResource {
    /**
     * Specify if the node driver state (bool)
     * 
     */
    @Export(name="active", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> active;

    /**
     * @return Specify if the node driver state (bool)
     * 
     */
    public Output<Boolean> active() {
        return this.active;
    }
    /**
     * Annotations of the resource (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> annotations;

    /**
     * @return Annotations of the resource (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * Specify wheter the node driver is an internal node driver or not (bool)
     * 
     */
    @Export(name="builtin", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> builtin;

    /**
     * @return Specify wheter the node driver is an internal node driver or not (bool)
     * 
     */
    public Output<Boolean> builtin() {
        return this.builtin;
    }
    /**
     * Verify that the downloaded driver matches the expected checksum (string)
     * 
     */
    @Export(name="checksum", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> checksum;

    /**
     * @return Verify that the downloaded driver matches the expected checksum (string)
     * 
     */
    public Output<Optional<String>> checksum() {
        return Codegen.optional(this.checksum);
    }
    /**
     * Description of the node driver (string)
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the node driver (string)
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * External ID (string)
     * 
     */
    @Export(name="externalId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> externalId;

    /**
     * @return External ID (string)
     * 
     */
    public Output<Optional<String>> externalId() {
        return Codegen.optional(this.externalId);
    }
    /**
     * Labels of the resource (map)
     * 
     */
    @Export(name="labels", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> labels;

    /**
     * @return Labels of the resource (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * Name of the node driver (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the node driver (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The URL to load for customized Add Nodes screen for this driver (string)
     * 
     */
    @Export(name="uiUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> uiUrl;

    /**
     * @return The URL to load for customized Add Nodes screen for this driver (string)
     * 
     */
    public Output<Optional<String>> uiUrl() {
        return Codegen.optional(this.uiUrl);
    }
    /**
     * The URL to download the machine driver binary for 64-bit Linux (string)
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return The URL to download the machine driver binary for 64-bit Linux (string)
     * 
     */
    public Output<String> url() {
        return this.url;
    }
    /**
     * Domains to whitelist for the ui (list)
     * 
     */
    @Export(name="whitelistDomains", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> whitelistDomains;

    /**
     * @return Domains to whitelist for the ui (list)
     * 
     */
    public Output<Optional<List<String>>> whitelistDomains() {
        return Codegen.optional(this.whitelistDomains);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NodeDriver(String name) {
        this(name, NodeDriverArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NodeDriver(String name, NodeDriverArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NodeDriver(String name, NodeDriverArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/nodeDriver:NodeDriver", name, args == null ? NodeDriverArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NodeDriver(String name, Output<String> id, @Nullable NodeDriverState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/nodeDriver:NodeDriver", name, state, makeResourceOptions(options, id));
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
    public static NodeDriver get(String name, Output<String> id, @Nullable NodeDriverState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NodeDriver(name, id, state, options);
    }
}
