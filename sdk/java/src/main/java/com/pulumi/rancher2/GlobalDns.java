// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.GlobalDnsArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.GlobalDnsState;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher V2 Global DNS resource. This can be used to create Global DNS records for Rancher V2.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.GlobalDnsProvider;
 * import com.pulumi.rancher2.GlobalDnsProviderArgs;
 * import com.pulumi.rancher2.inputs.GlobalDnsProviderRoute53ConfigArgs;
 * import com.pulumi.rancher2.GlobalDns;
 * import com.pulumi.rancher2.GlobalDnsArgs;
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
 *         // Create a new rancher2 Global DNS Provider
 *         var foo = new GlobalDnsProvider("foo", GlobalDnsProviderArgs.builder()
 *             .name("foo")
 *             .rootDomain("example.com")
 *             .route53Config(GlobalDnsProviderRoute53ConfigArgs.builder()
 *                 .accessKey("YYYYYYYYYYYYYYYYYYYY")
 *                 .secretKey("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
 *                 .zoneType("private")
 *                 .region("us-east-1")
 *                 .build())
 *             .build());
 * 
 *         // Create a new rancher2 Global DNS using project IDs
 *         var fooGlobalDns = new GlobalDns("fooGlobalDns", GlobalDnsArgs.builder()
 *             .name("foo")
 *             .fqdn("foo.example.com")
 *             .providerId(foo.id())
 *             .projectIds(            
 *                 "project1",
 *                 "project2")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.GlobalDnsProvider;
 * import com.pulumi.rancher2.GlobalDnsProviderArgs;
 * import com.pulumi.rancher2.inputs.GlobalDnsProviderRoute53ConfigArgs;
 * import com.pulumi.rancher2.GlobalDns;
 * import com.pulumi.rancher2.GlobalDnsArgs;
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
 *         // Create a new rancher2 Global DNS Provider
 *         var foo = new GlobalDnsProvider("foo", GlobalDnsProviderArgs.builder()
 *             .name("foo")
 *             .rootDomain("example.com")
 *             .route53Config(GlobalDnsProviderRoute53ConfigArgs.builder()
 *                 .accessKey("YYYYYYYYYYYYYYYYYYYY")
 *                 .secretKey("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
 *                 .zoneType("private")
 *                 .region("us-east-1")
 *                 .build())
 *             .build());
 * 
 *         // Create a new rancher2 Global DNS using MultiClusterApp ID
 *         var fooGlobalDns = new GlobalDns("fooGlobalDns", GlobalDnsArgs.builder()
 *             .name("foo")
 *             .fqdn("foo.example.com")
 *             .providerId(foo.id())
 *             .multiClusterAppId("<MCA_ID>")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Global DNS Entry can be imported using the Rancher Global DNS ID
 * 
 * ```sh
 * $ pulumi import rancher2:index/globalDns:GlobalDns foo &lt;global_dns_id&gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/globalDns:GlobalDns")
public class GlobalDns extends com.pulumi.resources.CustomResource {
    /**
     * Annotations for Global DNS (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for Global DNS (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * The Global DNS record (string)
     * 
     */
    @Export(name="fqdn", refs={String.class}, tree="[0]")
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
    @Export(name="labels", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> labels;

    /**
     * @return Labels for Global DNS (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * The MultiCluster App ID to assign to the Global DNS. Conflicts with `project_ids` (string)
     * 
     */
    @Export(name="multiClusterAppId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> multiClusterAppId;

    /**
     * @return The MultiCluster App ID to assign to the Global DNS. Conflicts with `project_ids` (string)
     * 
     */
    public Output<Optional<String>> multiClusterAppId() {
        return Codegen.optional(this.multiClusterAppId);
    }
    /**
     * The name of the Global DNS (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Global DNS (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of project_ids to assign to the Global DNS. Conflicts with `multi_cluster_app_id` (list(string))
     * 
     */
    @Export(name="projectIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> projectIds;

    /**
     * @return A list of project_ids to assign to the Global DNS. Conflicts with `multi_cluster_app_id` (list(string))
     * 
     */
    public Output<Optional<List<String>>> projectIds() {
        return Codegen.optional(this.projectIds);
    }
    /**
     * The Global DNS provider ID to use (string)
     * 
     */
    @Export(name="providerId", refs={String.class}, tree="[0]")
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
    @Export(name="ttl", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> ttl;

    /**
     * @return TTL in seconds for DNS record. Default: `300` (int)
     * 
     */
    public Output<Optional<Integer>> ttl() {
        return Codegen.optional(this.ttl);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GlobalDns(String name) {
        this(name, GlobalDnsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalDns(String name, GlobalDnsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalDns(String name, GlobalDnsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/globalDns:GlobalDns", name, args == null ? GlobalDnsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GlobalDns(String name, Output<String> id, @Nullable GlobalDnsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/globalDns:GlobalDns", name, state, makeResourceOptions(options, id));
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
    public static GlobalDns get(String name, Output<String> id, @Nullable GlobalDnsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GlobalDns(name, id, state, options);
    }
}
