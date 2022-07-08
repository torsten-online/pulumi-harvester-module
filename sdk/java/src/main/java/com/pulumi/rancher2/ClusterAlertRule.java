// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.ClusterAlertRuleArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.ClusterAlertRuleState;
import com.pulumi.rancher2.outputs.ClusterAlertRuleEventRule;
import com.pulumi.rancher2.outputs.ClusterAlertRuleMetricRule;
import com.pulumi.rancher2.outputs.ClusterAlertRuleNodeRule;
import com.pulumi.rancher2.outputs.ClusterAlertRuleSystemServiceRule;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Cluster Alert Rule resource. This can be used to create Cluster Alert Rule for Rancher v2 environments and retrieve their information.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Cluster Alert Rule can be imported using the Rancher cluster alert rule ID
 * 
 * ```sh
 *  $ pulumi import rancher2:index/clusterAlertRule:ClusterAlertRule foo &amp;lt;CLUSTER_ALERT_RULE_ID&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/clusterAlertRule:ClusterAlertRule")
public class ClusterAlertRule extends com.pulumi.resources.CustomResource {
    /**
     * The cluster alert rule annotations (map)
     * 
     */
    @Export(name="annotations", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> annotations;

    /**
     * @return The cluster alert rule annotations (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * The cluster id where create cluster alert rule (string)
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return The cluster id where create cluster alert rule (string)
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * The cluster alert rule event rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;node_rule&#34;, &#34;system_service_rule&#34;`` (list Maxitems:1)
     * 
     */
    @Export(name="eventRule", type=ClusterAlertRuleEventRule.class, parameters={})
    private Output</* @Nullable */ ClusterAlertRuleEventRule> eventRule;

    /**
     * @return The cluster alert rule event rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;node_rule&#34;, &#34;system_service_rule&#34;`` (list Maxitems:1)
     * 
     */
    public Output<Optional<ClusterAlertRuleEventRule>> eventRule() {
        return Codegen.optional(this.eventRule);
    }
    /**
     * The cluster alert rule alert group ID (string)
     * 
     */
    @Export(name="groupId", type=String.class, parameters={})
    private Output<String> groupId;

    /**
     * @return The cluster alert rule alert group ID (string)
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }
    /**
     * The cluster alert rule group interval seconds. Default: `180` (int)
     * 
     */
    @Export(name="groupIntervalSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> groupIntervalSeconds;

    /**
     * @return The cluster alert rule group interval seconds. Default: `180` (int)
     * 
     */
    public Output<Optional<Integer>> groupIntervalSeconds() {
        return Codegen.optional(this.groupIntervalSeconds);
    }
    /**
     * The cluster alert rule group wait seconds. Default: `180` (int)
     * 
     */
    @Export(name="groupWaitSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> groupWaitSeconds;

    /**
     * @return The cluster alert rule group wait seconds. Default: `180` (int)
     * 
     */
    public Output<Optional<Integer>> groupWaitSeconds() {
        return Codegen.optional(this.groupWaitSeconds);
    }
    /**
     * The cluster alert rule inherited. Default: `true` (bool)
     * 
     */
    @Export(name="inherited", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> inherited;

    /**
     * @return The cluster alert rule inherited. Default: `true` (bool)
     * 
     */
    public Output<Optional<Boolean>> inherited() {
        return Codegen.optional(this.inherited);
    }
    /**
     * The cluster alert rule labels (map)
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> labels;

    /**
     * @return The cluster alert rule labels (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * The cluster alert rule metric rule. ConflictsWith: `&#34;event_rule&#34;, &#34;node_rule&#34;, &#34;system_service_rule&#34;`` (list Maxitems:1)
     * 
     */
    @Export(name="metricRule", type=ClusterAlertRuleMetricRule.class, parameters={})
    private Output</* @Nullable */ ClusterAlertRuleMetricRule> metricRule;

    /**
     * @return The cluster alert rule metric rule. ConflictsWith: `&#34;event_rule&#34;, &#34;node_rule&#34;, &#34;system_service_rule&#34;`` (list Maxitems:1)
     * 
     */
    public Output<Optional<ClusterAlertRuleMetricRule>> metricRule() {
        return Codegen.optional(this.metricRule);
    }
    /**
     * The cluster alert rule name (string)
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The cluster alert rule name (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The cluster alert rule node rule. ConflictsWith: `&#34;event_rule&#34;, &#34;metric_rule&#34;, &#34;system_service_rule&#34;`` (list Maxitems:1)
     * 
     */
    @Export(name="nodeRule", type=ClusterAlertRuleNodeRule.class, parameters={})
    private Output</* @Nullable */ ClusterAlertRuleNodeRule> nodeRule;

    /**
     * @return The cluster alert rule node rule. ConflictsWith: `&#34;event_rule&#34;, &#34;metric_rule&#34;, &#34;system_service_rule&#34;`` (list Maxitems:1)
     * 
     */
    public Output<Optional<ClusterAlertRuleNodeRule>> nodeRule() {
        return Codegen.optional(this.nodeRule);
    }
    /**
     * The cluster alert rule wait seconds. Default: `3600` (int)
     * 
     */
    @Export(name="repeatIntervalSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> repeatIntervalSeconds;

    /**
     * @return The cluster alert rule wait seconds. Default: `3600` (int)
     * 
     */
    public Output<Optional<Integer>> repeatIntervalSeconds() {
        return Codegen.optional(this.repeatIntervalSeconds);
    }
    /**
     * The cluster alert rule severity. Supported values : `&#34;critical&#34; | &#34;info&#34; | &#34;warning&#34;`. Default: `critical` (string)
     * 
     */
    @Export(name="severity", type=String.class, parameters={})
    private Output</* @Nullable */ String> severity;

    /**
     * @return The cluster alert rule severity. Supported values : `&#34;critical&#34; | &#34;info&#34; | &#34;warning&#34;`. Default: `critical` (string)
     * 
     */
    public Output<Optional<String>> severity() {
        return Codegen.optional(this.severity);
    }
    /**
     * The cluster alert rule system service rule. ConflictsWith: `&#34;event_rule&#34;, &#34;metric_rule&#34;, &#34;node_rule&#34;` (list Maxitems:1)
     * 
     */
    @Export(name="systemServiceRule", type=ClusterAlertRuleSystemServiceRule.class, parameters={})
    private Output</* @Nullable */ ClusterAlertRuleSystemServiceRule> systemServiceRule;

    /**
     * @return The cluster alert rule system service rule. ConflictsWith: `&#34;event_rule&#34;, &#34;metric_rule&#34;, &#34;node_rule&#34;` (list Maxitems:1)
     * 
     */
    public Output<Optional<ClusterAlertRuleSystemServiceRule>> systemServiceRule() {
        return Codegen.optional(this.systemServiceRule);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterAlertRule(String name) {
        this(name, ClusterAlertRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterAlertRule(String name, ClusterAlertRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterAlertRule(String name, ClusterAlertRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/clusterAlertRule:ClusterAlertRule", name, args == null ? ClusterAlertRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterAlertRule(String name, Output<String> id, @Nullable ClusterAlertRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/clusterAlertRule:ClusterAlertRule", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("rancher2:index/clusterAlterRule:ClusterAlterRule").build())
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
    public static ClusterAlertRule get(String name, Output<String> id, @Nullable ClusterAlertRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterAlertRule(name, id, state, options);
    }
}
