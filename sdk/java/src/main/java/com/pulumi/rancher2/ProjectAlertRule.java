// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.ProjectAlertRuleArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.ProjectAlertRuleState;
import com.pulumi.rancher2.outputs.ProjectAlertRuleMetricRule;
import com.pulumi.rancher2.outputs.ProjectAlertRulePodRule;
import com.pulumi.rancher2.outputs.ProjectAlertRuleWorkloadRule;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Project Alert Rule resource. This can be used to create Project Alert Rule for Rancher v2 environments and retrieve their information.
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
 * import com.pulumi.rancher2.Project;
 * import com.pulumi.rancher2.ProjectArgs;
 * import com.pulumi.rancher2.inputs.ProjectResourceQuotaArgs;
 * import com.pulumi.rancher2.inputs.ProjectResourceQuotaProjectLimitArgs;
 * import com.pulumi.rancher2.inputs.ProjectResourceQuotaNamespaceDefaultLimitArgs;
 * import com.pulumi.rancher2.inputs.ProjectContainerResourceLimitArgs;
 * import com.pulumi.rancher2.ProjectAlertGroup;
 * import com.pulumi.rancher2.ProjectAlertGroupArgs;
 * import com.pulumi.rancher2.ProjectAlertRule;
 * import com.pulumi.rancher2.ProjectAlertRuleArgs;
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
 *         // Create a new Rancher2 Project
 *         var foo = new Project("foo", ProjectArgs.builder()
 *             .name("foo")
 *             .clusterId("<cluster_id>")
 *             .description("Terraform project ")
 *             .resourceQuota(ProjectResourceQuotaArgs.builder()
 *                 .projectLimit(ProjectResourceQuotaProjectLimitArgs.builder()
 *                     .limitsCpu("2000m")
 *                     .limitsMemory("2000Mi")
 *                     .requestsStorage("2Gi")
 *                     .build())
 *                 .namespaceDefaultLimit(ProjectResourceQuotaNamespaceDefaultLimitArgs.builder()
 *                     .limitsCpu("500m")
 *                     .limitsMemory("500Mi")
 *                     .requestsStorage("1Gi")
 *                     .build())
 *                 .build())
 *             .containerResourceLimit(ProjectContainerResourceLimitArgs.builder()
 *                 .limitsCpu("20m")
 *                 .limitsMemory("20Mi")
 *                 .requestsCpu("1m")
 *                 .requestsMemory("1Mi")
 *                 .build())
 *             .build());
 * 
 *         // Create a new Rancher2 Project Alert Group
 *         var fooProjectAlertGroup = new ProjectAlertGroup("fooProjectAlertGroup", ProjectAlertGroupArgs.builder()
 *             .name("foo")
 *             .description("Terraform project alert group")
 *             .projectId(foo.id())
 *             .groupIntervalSeconds(300)
 *             .repeatIntervalSeconds(3600)
 *             .build());
 * 
 *         // Create a new Rancher2 Project Alert Rule
 *         var fooProjectAlertRule = new ProjectAlertRule("fooProjectAlertRule", ProjectAlertRuleArgs.builder()
 *             .projectId(fooProjectAlertGroup.projectId())
 *             .groupId(fooProjectAlertGroup.id())
 *             .name("foo")
 *             .groupIntervalSeconds(600)
 *             .repeatIntervalSeconds(6000)
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
 * Project Alert Rule can be imported using the Rancher project alert rule ID
 * 
 * ```sh
 * $ pulumi import rancher2:index/projectAlertRule:ProjectAlertRule foo &amp;lt;project_alert_rule_id&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/projectAlertRule:ProjectAlertRule")
public class ProjectAlertRule extends com.pulumi.resources.CustomResource {
    /**
     * The project alert rule annotations (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> annotations;

    /**
     * @return The project alert rule annotations (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * The project alert rule alert group ID (string)
     * 
     */
    @Export(name="groupId", refs={String.class}, tree="[0]")
    private Output<String> groupId;

    /**
     * @return The project alert rule alert group ID (string)
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }
    /**
     * The project alert rule group interval seconds. Default: `180` (int)
     * 
     */
    @Export(name="groupIntervalSeconds", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> groupIntervalSeconds;

    /**
     * @return The project alert rule group interval seconds. Default: `180` (int)
     * 
     */
    public Output<Optional<Integer>> groupIntervalSeconds() {
        return Codegen.optional(this.groupIntervalSeconds);
    }
    /**
     * The project alert rule group wait seconds. Default: `180` (int)
     * 
     */
    @Export(name="groupWaitSeconds", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> groupWaitSeconds;

    /**
     * @return The project alert rule group wait seconds. Default: `180` (int)
     * 
     */
    public Output<Optional<Integer>> groupWaitSeconds() {
        return Codegen.optional(this.groupWaitSeconds);
    }
    /**
     * The project alert rule inherited. Default: `true` (bool)
     * 
     */
    @Export(name="inherited", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> inherited;

    /**
     * @return The project alert rule inherited. Default: `true` (bool)
     * 
     */
    public Output<Optional<Boolean>> inherited() {
        return Codegen.optional(this.inherited);
    }
    /**
     * The project alert rule labels (map)
     * 
     */
    @Export(name="labels", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> labels;

    /**
     * @return The project alert rule labels (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * The project alert rule metric rule. ConflictsWith: `&#34;pod_rule&#34;, &#34;workload_rule&#34;`` (list Maxitems:1)
     * 
     */
    @Export(name="metricRule", refs={ProjectAlertRuleMetricRule.class}, tree="[0]")
    private Output</* @Nullable */ ProjectAlertRuleMetricRule> metricRule;

    /**
     * @return The project alert rule metric rule. ConflictsWith: `&#34;pod_rule&#34;, &#34;workload_rule&#34;`` (list Maxitems:1)
     * 
     */
    public Output<Optional<ProjectAlertRuleMetricRule>> metricRule() {
        return Codegen.optional(this.metricRule);
    }
    /**
     * The project alert rule name (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The project alert rule name (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The project alert rule pod rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;workload_rule&#34;`` (list Maxitems:1)
     * 
     */
    @Export(name="podRule", refs={ProjectAlertRulePodRule.class}, tree="[0]")
    private Output</* @Nullable */ ProjectAlertRulePodRule> podRule;

    /**
     * @return The project alert rule pod rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;workload_rule&#34;`` (list Maxitems:1)
     * 
     */
    public Output<Optional<ProjectAlertRulePodRule>> podRule() {
        return Codegen.optional(this.podRule);
    }
    /**
     * The project id where create project alert rule (string)
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The project id where create project alert rule (string)
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * The project alert rule wait seconds. Default: `3600` (int)
     * 
     */
    @Export(name="repeatIntervalSeconds", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> repeatIntervalSeconds;

    /**
     * @return The project alert rule wait seconds. Default: `3600` (int)
     * 
     */
    public Output<Optional<Integer>> repeatIntervalSeconds() {
        return Codegen.optional(this.repeatIntervalSeconds);
    }
    /**
     * The project alert rule severity. Supported values : `&#34;critical&#34; | &#34;info&#34; | &#34;warning&#34;`. Default: `critical` (string)
     * 
     */
    @Export(name="severity", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> severity;

    /**
     * @return The project alert rule severity. Supported values : `&#34;critical&#34; | &#34;info&#34; | &#34;warning&#34;`. Default: `critical` (string)
     * 
     */
    public Output<Optional<String>> severity() {
        return Codegen.optional(this.severity);
    }
    /**
     * The project alert rule workload rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;pod_rule&#34;`` (list Maxitems:1)
     * 
     */
    @Export(name="workloadRule", refs={ProjectAlertRuleWorkloadRule.class}, tree="[0]")
    private Output</* @Nullable */ ProjectAlertRuleWorkloadRule> workloadRule;

    /**
     * @return The project alert rule workload rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;pod_rule&#34;`` (list Maxitems:1)
     * 
     */
    public Output<Optional<ProjectAlertRuleWorkloadRule>> workloadRule() {
        return Codegen.optional(this.workloadRule);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProjectAlertRule(String name) {
        this(name, ProjectAlertRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProjectAlertRule(String name, ProjectAlertRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProjectAlertRule(String name, ProjectAlertRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/projectAlertRule:ProjectAlertRule", name, args == null ? ProjectAlertRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProjectAlertRule(String name, Output<String> id, @Nullable ProjectAlertRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/projectAlertRule:ProjectAlertRule", name, state, makeResourceOptions(options, id));
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
    public static ProjectAlertRule get(String name, Output<String> id, @Nullable ProjectAlertRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProjectAlertRule(name, id, state, options);
    }
}
