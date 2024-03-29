// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.AppV2Args;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.AppV2State;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher App v2 resource. This can be used to manage helm charts for Rancher v2 environments and retrieve their information. App v2 resource is available at Rancher v2.5.x and above.
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
 * import com.pulumi.rancher2.AppV2;
 * import com.pulumi.rancher2.AppV2Args;
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
 *         // Create a new Rancher2 App V2 using
 *         var foo = new AppV2(&#34;foo&#34;, AppV2Args.builder()        
 *             .clusterId(&#34;&lt;CLUSTER_ID&gt;&#34;)
 *             .namespace(&#34;cattle-monitoring-system&#34;)
 *             .repoName(&#34;rancher-charts&#34;)
 *             .chartName(&#34;rancher-monitoring&#34;)
 *             .chartVersion(&#34;9.4.200&#34;)
 *             .values(Files.readString(Paths.get(&#34;values.yaml&#34;)))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Create an App from a Helm Chart using a different registry
 * 
 * The `system_default_registry` argument can override the global value at App installation. If argument is not provided, the global value for System Default Registry will be used instead.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.AppV2;
 * import com.pulumi.rancher2.AppV2Args;
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
 *         var cisBenchmark = new AppV2(&#34;cisBenchmark&#34;, AppV2Args.builder()        
 *             .chartName(&#34;rancher-cis-benchmark&#34;)
 *             .clusterId(&#34;&lt;CLUSTER_ID&gt;&#34;)
 *             .namespace(&#34;cis-operator-system&#34;)
 *             .repoName(&#34;rancher-charts&#34;)
 *             .systemDefaultRegistry(&#34;&lt;some.dns.here&gt;:&lt;PORT&gt;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * V2 apps can be imported using the Rancher cluster ID and App V2 name, which is composed of `&lt;namespace&gt;/&lt;application_name&gt;`.
 * 
 * ```sh
 * $ pulumi import rancher2:index/appV2:AppV2 foo &amp;lt;CLUSTER_ID&amp;gt;.&amp;lt;APP_V2_NAME&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/appV2:AppV2")
public class AppV2 extends com.pulumi.resources.CustomResource {
    /**
     * Annotations for the app v2 (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for the app v2 (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * The app v2 chart name (string)
     * 
     */
    @Export(name="chartName", refs={String.class}, tree="[0]")
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
    @Export(name="chartVersion", refs={String.class}, tree="[0]")
    private Output<String> chartVersion;

    /**
     * @return The app v2 chart version (string)
     * 
     */
    public Output<String> chartVersion() {
        return this.chartVersion;
    }
    /**
     * Cleanup app v2 on failed chart upgrade. Default: `false` (bool)
     * 
     */
    @Export(name="cleanupOnFail", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> cleanupOnFail;

    /**
     * @return Cleanup app v2 on failed chart upgrade. Default: `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> cleanupOnFail() {
        return Codegen.optional(this.cleanupOnFail);
    }
    /**
     * The cluster id of the app (string)
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    /**
     * @return The cluster id of the app (string)
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * (Computed) The cluster name of the app (string)
     * 
     */
    @Export(name="clusterName", refs={String.class}, tree="[0]")
    private Output<String> clusterName;

    /**
     * @return (Computed) The cluster name of the app (string)
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    /**
     * Values YAML file including computed values. This field prevents incorrect discrepancies from showing in the terraform
     * plan output when files change but values stay the same, due to additional computed values included by the provider
     * itself.
     * 
     */
    @Export(name="deploymentValues", refs={String.class}, tree="[0]")
    private Output<String> deploymentValues;

    /**
     * @return Values YAML file including computed values. This field prevents incorrect discrepancies from showing in the terraform
     * plan output when files change but values stay the same, due to additional computed values included by the provider
     * itself.
     * 
     */
    public Output<String> deploymentValues() {
        return this.deploymentValues;
    }
    /**
     * Disable app v2 chart hooks. Default: `false` (bool)
     * 
     */
    @Export(name="disableHooks", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> disableHooks;

    /**
     * @return Disable app v2 chart hooks. Default: `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> disableHooks() {
        return Codegen.optional(this.disableHooks);
    }
    /**
     * Disable app V2 Open API Validation. Default: `false` (bool)
     * 
     */
    @Export(name="disableOpenApiValidation", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> disableOpenApiValidation;

    /**
     * @return Disable app V2 Open API Validation. Default: `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> disableOpenApiValidation() {
        return Codegen.optional(this.disableOpenApiValidation);
    }
    /**
     * Force app V2 chart upgrade. Default: `false` (bool)
     * 
     */
    @Export(name="forceUpgrade", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceUpgrade;

    /**
     * @return Force app V2 chart upgrade. Default: `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> forceUpgrade() {
        return Codegen.optional(this.forceUpgrade);
    }
    /**
     * Labels for the app v2 (map)
     * 
     */
    @Export(name="labels", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> labels;

    /**
     * @return Labels for the app v2 (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * The name of the app v2 (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the app v2 (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The namespace of the app v2 (string)
     * 
     */
    @Export(name="namespace", refs={String.class}, tree="[0]")
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
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> projectId;

    /**
     * @return Deploy the app v2 within project ID (string)
     * 
     */
    public Output<Optional<String>> projectId() {
        return Codegen.optional(this.projectId);
    }
    /**
     * Repo name (string)
     * 
     */
    @Export(name="repoName", refs={String.class}, tree="[0]")
    private Output<String> repoName;

    /**
     * @return Repo name (string)
     * 
     */
    public Output<String> repoName() {
        return this.repoName;
    }
    /**
     * System default registry providing images for app deployment (string)
     * 
     */
    @Export(name="systemDefaultRegistry", refs={String.class}, tree="[0]")
    private Output<String> systemDefaultRegistry;

    /**
     * @return System default registry providing images for app deployment (string)
     * 
     */
    public Output<String> systemDefaultRegistry() {
        return this.systemDefaultRegistry;
    }
    /**
     * The app v2 values yaml. Yaml format is required (string)
     * 
     */
    @Export(name="values", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> values;

    /**
     * @return The app v2 values yaml. Yaml format is required (string)
     * 
     */
    public Output<Optional<String>> values() {
        return Codegen.optional(this.values);
    }
    /**
     * Wait until app is deployed. Default: `true` (bool)
     * 
     */
    @Export(name="wait", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> wait;

    /**
     * @return Wait until app is deployed. Default: `true` (bool)
     * 
     */
    public Output<Optional<Boolean>> wait_() {
        return Codegen.optional(this.wait);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppV2(String name) {
        this(name, AppV2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppV2(String name, AppV2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppV2(String name, AppV2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/appV2:AppV2", name, args == null ? AppV2Args.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AppV2(String name, Output<String> id, @Nullable AppV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/appV2:AppV2", name, state, makeResourceOptions(options, id));
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
    public static AppV2 get(String name, Output<String> id, @Nullable AppV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppV2(name, id, state, options);
    }
}
