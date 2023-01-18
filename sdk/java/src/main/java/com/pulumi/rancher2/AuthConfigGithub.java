// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.AuthConfigGithubArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.AuthConfigGithubState;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Auth Config Github resource. This can be used to configure and enable Auth Config Github for Rancher v2 RKE clusters and retrieve their information.
 * 
 * In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.AuthConfigGithub;
 * import com.pulumi.rancher2.AuthConfigGithubArgs;
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
 *         var github = new AuthConfigGithub(&#34;github&#34;, AuthConfigGithubArgs.builder()        
 *             .clientId(&#34;&lt;GITHUB_CLIENT_ID&gt;&#34;)
 *             .clientSecret(&#34;&lt;GITHUB_CLIENT_SECRET&gt;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="rancher2:index/authConfigGithub:AuthConfigGithub")
public class AuthConfigGithub extends com.pulumi.resources.CustomResource {
    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     * 
     */
    @Export(name="accessMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> accessMode;

    /**
     * @return Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     * 
     */
    public Output<Optional<String>> accessMode() {
        return Codegen.optional(this.accessMode);
    }
    /**
     * Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `github_user://&lt;USER_ID&gt;`  `github_team://&lt;GROUP_ID&gt;` `github_org://&lt;ORG_ID&gt;` (list)
     * 
     */
    @Export(name="allowedPrincipalIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedPrincipalIds;

    /**
     * @return Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `github_user://&lt;USER_ID&gt;`  `github_team://&lt;GROUP_ID&gt;` `github_org://&lt;ORG_ID&gt;` (list)
     * 
     */
    public Output<Optional<List<String>>> allowedPrincipalIds() {
        return Codegen.optional(this.allowedPrincipalIds);
    }
    /**
     * Annotations of the resource (map)
     * 
     */
    @Export(name="annotations", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> annotations;

    /**
     * @return Annotations of the resource (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * Github auth Client ID (string)
     * 
     */
    @Export(name="clientId", type=String.class, parameters={})
    private Output<String> clientId;

    /**
     * @return Github auth Client ID (string)
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }
    /**
     * Github auth Client secret (string)
     * 
     */
    @Export(name="clientSecret", type=String.class, parameters={})
    private Output<String> clientSecret;

    /**
     * @return Github auth Client secret (string)
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }
    /**
     * Enable auth config provider. Default `true` (bool)
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Enable auth config provider. Default `true` (bool)
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Github hostname to connect. Default `github.com` (string)
     * 
     */
    @Export(name="hostname", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostname;

    /**
     * @return Github hostname to connect. Default `github.com` (string)
     * 
     */
    public Output<Optional<String>> hostname() {
        return Codegen.optional(this.hostname);
    }
    /**
     * Labels of the resource (map)
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> labels;

    /**
     * @return Labels of the resource (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * (Computed) The name of the resource (string)
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return (Computed) The name of the resource (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Enable TLS connection. Default `true` (bool)
     * 
     */
    @Export(name="tls", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> tls;

    /**
     * @return Enable TLS connection. Default `true` (bool)
     * 
     */
    public Output<Optional<Boolean>> tls() {
        return Codegen.optional(this.tls);
    }
    /**
     * (Computed) The type of the resource (string)
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return (Computed) The type of the resource (string)
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AuthConfigGithub(String name) {
        this(name, AuthConfigGithubArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuthConfigGithub(String name, AuthConfigGithubArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuthConfigGithub(String name, AuthConfigGithubArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/authConfigGithub:AuthConfigGithub", name, args == null ? AuthConfigGithubArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AuthConfigGithub(String name, Output<String> id, @Nullable AuthConfigGithubState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/authConfigGithub:AuthConfigGithub", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "clientId",
                "clientSecret"
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
    public static AuthConfigGithub get(String name, Output<String> id, @Nullable AuthConfigGithubState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AuthConfigGithub(name, id, state, options);
    }
}
