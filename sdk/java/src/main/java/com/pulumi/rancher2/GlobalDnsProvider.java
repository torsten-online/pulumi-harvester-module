// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.GlobalDnsProviderArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.GlobalDnsProviderState;
import com.pulumi.rancher2.outputs.GlobalDnsProviderAlidnsConfig;
import com.pulumi.rancher2.outputs.GlobalDnsProviderCloudflareConfig;
import com.pulumi.rancher2.outputs.GlobalDnsProviderRoute53Config;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher V2 Global DNS Provider resource. This can be used to create Global DNS Providers for Rancher V2. Supported Global DNS Providers: `alidns, cloudflare, route53`
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.GlobalDnsProvider;
 * import com.pulumi.rancher2.GlobalDnsProviderArgs;
 * import com.pulumi.rancher2.inputs.GlobalDnsProviderAlidnsConfigArgs;
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
 *         var foo = new GlobalDnsProvider(&#34;foo&#34;, GlobalDnsProviderArgs.builder()        
 *             .alidnsConfig(GlobalDnsProviderAlidnsConfigArgs.builder()
 *                 .accessKey(&#34;YYYYYYYYYYYYYYYYYYYY&#34;)
 *                 .secretKey(&#34;XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX&#34;)
 *                 .build())
 *             .rootDomain(&#34;example.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.GlobalDnsProvider;
 * import com.pulumi.rancher2.GlobalDnsProviderArgs;
 * import com.pulumi.rancher2.inputs.GlobalDnsProviderCloudflareConfigArgs;
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
 *         var foo = new GlobalDnsProvider(&#34;foo&#34;, GlobalDnsProviderArgs.builder()        
 *             .cloudflareConfig(GlobalDnsProviderCloudflareConfigArgs.builder()
 *                 .apiEmail(&#34;test@test.local&#34;)
 *                 .apiKey(&#34;XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX&#34;)
 *                 .proxySetting(true)
 *                 .build())
 *             .rootDomain(&#34;example.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.GlobalDnsProvider;
 * import com.pulumi.rancher2.GlobalDnsProviderArgs;
 * import com.pulumi.rancher2.inputs.GlobalDnsProviderRoute53ConfigArgs;
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
 *         var foo = new GlobalDnsProvider(&#34;foo&#34;, GlobalDnsProviderArgs.builder()        
 *             .rootDomain(&#34;example.com&#34;)
 *             .route53Config(GlobalDnsProviderRoute53ConfigArgs.builder()
 *                 .accessKey(&#34;YYYYYYYYYYYYYYYYYYYY&#34;)
 *                 .region(&#34;us-east-1&#34;)
 *                 .secretKey(&#34;XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX&#34;)
 *                 .zoneType(&#34;private&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Global DNS Providers can be imported using the Rancher Global DNS Provider ID
 * 
 * ```sh
 *  $ pulumi import rancher2:index/globalDnsProvider:GlobalDnsProvider foo &lt;global_dns_provider_id&gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/globalDnsProvider:GlobalDnsProvider")
public class GlobalDnsProvider extends com.pulumi.resources.CustomResource {
    @Export(name="alidnsConfig", refs={GlobalDnsProviderAlidnsConfig.class}, tree="[0]")
    private Output</* @Nullable */ GlobalDnsProviderAlidnsConfig> alidnsConfig;

    public Output<Optional<GlobalDnsProviderAlidnsConfig>> alidnsConfig() {
        return Codegen.optional(this.alidnsConfig);
    }
    /**
     * Annotations for Global DNS Provider (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for Global DNS Provider (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    @Export(name="cloudflareConfig", refs={GlobalDnsProviderCloudflareConfig.class}, tree="[0]")
    private Output</* @Nullable */ GlobalDnsProviderCloudflareConfig> cloudflareConfig;

    public Output<Optional<GlobalDnsProviderCloudflareConfig>> cloudflareConfig() {
        return Codegen.optional(this.cloudflareConfig);
    }
    /**
     * (Computed) The Global DNS Provider `alidns, cloudflare, route53` (string)
     * 
     */
    @Export(name="dnsProvider", refs={String.class}, tree="[0]")
    private Output<String> dnsProvider;

    /**
     * @return (Computed) The Global DNS Provider `alidns, cloudflare, route53` (string)
     * 
     */
    public Output<String> dnsProvider() {
        return this.dnsProvider;
    }
    /**
     * Labels for Global DNS Provider (map)
     * 
     */
    @Export(name="labels", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> labels;

    /**
     * @return Labels for Global DNS Provider (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * The name of the Global DNS Provider (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Global DNS Provider (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The user ID to assign Global DNS Provider (string)
     * 
     */
    @Export(name="rootDomain", refs={String.class}, tree="[0]")
    private Output<String> rootDomain;

    /**
     * @return The user ID to assign Global DNS Provider (string)
     * 
     */
    public Output<String> rootDomain() {
        return this.rootDomain;
    }
    @Export(name="route53Config", refs={GlobalDnsProviderRoute53Config.class}, tree="[0]")
    private Output</* @Nullable */ GlobalDnsProviderRoute53Config> route53Config;

    public Output<Optional<GlobalDnsProviderRoute53Config>> route53Config() {
        return Codegen.optional(this.route53Config);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GlobalDnsProvider(String name) {
        this(name, GlobalDnsProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalDnsProvider(String name, GlobalDnsProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalDnsProvider(String name, GlobalDnsProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/globalDnsProvider:GlobalDnsProvider", name, args == null ? GlobalDnsProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GlobalDnsProvider(String name, Output<String> id, @Nullable GlobalDnsProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/globalDnsProvider:GlobalDnsProvider", name, state, makeResourceOptions(options, id));
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
    public static GlobalDnsProvider get(String name, Output<String> id, @Nullable GlobalDnsProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GlobalDnsProvider(name, id, state, options);
    }
}
