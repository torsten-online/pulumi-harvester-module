// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.ProjectRoleTemplateBindingArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.ProjectRoleTemplateBindingState;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Project Role Template Binding resource. This can be used to create Project Role Template Bindings for Rancher v2 environments and retrieve their information.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.ProjectRoleTemplateBinding;
 * import com.pulumi.rancher2.ProjectRoleTemplateBindingArgs;
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
 *         var foo = new ProjectRoleTemplateBinding(&#34;foo&#34;, ProjectRoleTemplateBindingArgs.builder()        
 *             .projectId(&#34;&lt;project_id&gt;&#34;)
 *             .roleTemplateId(&#34;&lt;role_template_id&gt;&#34;)
 *             .userId(&#34;&lt;user_id&gt;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Project Role Template Bindings can be imported using the Rancher Project Role Template Binding ID
 * 
 * ```sh
 *  $ pulumi import rancher2:index/projectRoleTemplateBinding:ProjectRoleTemplateBinding foo &amp;lt;project_role_template_binding_id&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/projectRoleTemplateBinding:ProjectRoleTemplateBinding")
public class ProjectRoleTemplateBinding extends com.pulumi.resources.CustomResource {
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
     * The group ID to assign project role template binding (string)
     * 
     */
    @Export(name="groupId", refs={String.class}, tree="[0]")
    private Output<String> groupId;

    /**
     * @return The group ID to assign project role template binding (string)
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }
    /**
     * The group_principal ID to assign project role template binding (string)
     * 
     */
    @Export(name="groupPrincipalId", refs={String.class}, tree="[0]")
    private Output<String> groupPrincipalId;

    /**
     * @return The group_principal ID to assign project role template binding (string)
     * 
     */
    public Output<String> groupPrincipalId() {
        return this.groupPrincipalId;
    }
    /**
     * Labels of the resource (map)
     * 
     * **Note** user `user_id | user_principal_id` OR group `group_id | group_principal_id` must be defined
     * 
     */
    @Export(name="labels", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> labels;

    /**
     * @return Labels of the resource (map)
     * 
     * **Note** user `user_id | user_principal_id` OR group `group_id | group_principal_id` must be defined
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * The name of the project role template binding (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the project role template binding (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The project id where bind project role template (string)
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The project id where bind project role template (string)
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * The role template id from create project role template binding (string)
     * 
     */
    @Export(name="roleTemplateId", refs={String.class}, tree="[0]")
    private Output<String> roleTemplateId;

    /**
     * @return The role template id from create project role template binding (string)
     * 
     */
    public Output<String> roleTemplateId() {
        return this.roleTemplateId;
    }
    /**
     * The user ID to assign project role template binding (string)
     * 
     */
    @Export(name="userId", refs={String.class}, tree="[0]")
    private Output<String> userId;

    /**
     * @return The user ID to assign project role template binding (string)
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }
    /**
     * The user_principal ID to assign project role template binding (string)
     * 
     */
    @Export(name="userPrincipalId", refs={String.class}, tree="[0]")
    private Output<String> userPrincipalId;

    /**
     * @return The user_principal ID to assign project role template binding (string)
     * 
     */
    public Output<String> userPrincipalId() {
        return this.userPrincipalId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProjectRoleTemplateBinding(String name) {
        this(name, ProjectRoleTemplateBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProjectRoleTemplateBinding(String name, ProjectRoleTemplateBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProjectRoleTemplateBinding(String name, ProjectRoleTemplateBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/projectRoleTemplateBinding:ProjectRoleTemplateBinding", name, args == null ? ProjectRoleTemplateBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProjectRoleTemplateBinding(String name, Output<String> id, @Nullable ProjectRoleTemplateBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/projectRoleTemplateBinding:ProjectRoleTemplateBinding", name, state, makeResourceOptions(options, id));
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
    public static ProjectRoleTemplateBinding get(String name, Output<String> id, @Nullable ProjectRoleTemplateBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProjectRoleTemplateBinding(name, id, state, options);
    }
}
