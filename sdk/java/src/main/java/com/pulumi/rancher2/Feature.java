// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.FeatureArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.FeatureState;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Feature resource. This can be used to enable/disable [experimental features](https://rancher.com/docs/rancher/v2.x/en/installation/resources/feature-flags/) for Rancher v2 environments.
 * 
 * Experimental features already exist at Rancher v2.5.x systems, so they can just be updated:
 * * On create, provider will read Feature from Rancher and update its value. It will return an error if feature doesn&#39;t exist
 * * On destroy, provider will not delete feature from Rancher, just from tfstate
 * 
 * **Note:** Some Rancher features as `fleet`, may force a Rancher reboot once updated. The provider will wait until Rancher is rebooted. If you are modifying more than one feature in a row, and any of them requires a Rancher reboot, `pulumi up` may fail on first run. Run `pulumi up` again should work fine.
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
 * import com.pulumi.rancher2.Feature;
 * import com.pulumi.rancher2.FeatureArgs;
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
 *         // Create a new rancher2 Feature
 *         var fleet = new Feature(&#34;fleet&#34;, FeatureArgs.builder()        
 *             .value(&#34;&lt;VALUE&gt;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="rancher2:index/feature:Feature")
public class Feature extends com.pulumi.resources.CustomResource {
    /**
     * Annotations for feature object (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for feature object (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * Labels for feature object (map)
     * 
     */
    @Export(name="labels", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> labels;

    /**
     * @return Labels for feature object (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * The name of the feature (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the feature (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The value of the feature. Default: `false` (bool)
     * 
     */
    @Export(name="value", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> value;

    /**
     * @return The value of the feature. Default: `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> value() {
        return Codegen.optional(this.value);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Feature(String name) {
        this(name, FeatureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Feature(String name, @Nullable FeatureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Feature(String name, @Nullable FeatureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/feature:Feature", name, args == null ? FeatureArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Feature(String name, Output<String> id, @Nullable FeatureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/feature:Feature", name, state, makeResourceOptions(options, id));
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
    public static Feature get(String name, Output<String> id, @Nullable FeatureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Feature(name, id, state, options);
    }
}
