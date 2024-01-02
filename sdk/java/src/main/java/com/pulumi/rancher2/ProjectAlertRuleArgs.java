// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.inputs.ProjectAlertRuleMetricRuleArgs;
import com.pulumi.rancher2.inputs.ProjectAlertRulePodRuleArgs;
import com.pulumi.rancher2.inputs.ProjectAlertRuleWorkloadRuleArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectAlertRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectAlertRuleArgs Empty = new ProjectAlertRuleArgs();

    /**
     * The project alert rule annotations (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return The project alert rule annotations (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The project alert rule alert group ID (string)
     * 
     */
    @Import(name="groupId", required=true)
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
    @Import(name="groupIntervalSeconds")
    private @Nullable Output<Integer> groupIntervalSeconds;

    /**
     * @return The project alert rule group interval seconds. Default: `180` (int)
     * 
     */
    public Optional<Output<Integer>> groupIntervalSeconds() {
        return Optional.ofNullable(this.groupIntervalSeconds);
    }

    /**
     * The project alert rule group wait seconds. Default: `180` (int)
     * 
     */
    @Import(name="groupWaitSeconds")
    private @Nullable Output<Integer> groupWaitSeconds;

    /**
     * @return The project alert rule group wait seconds. Default: `180` (int)
     * 
     */
    public Optional<Output<Integer>> groupWaitSeconds() {
        return Optional.ofNullable(this.groupWaitSeconds);
    }

    /**
     * The project alert rule inherited. Default: `true` (bool)
     * 
     */
    @Import(name="inherited")
    private @Nullable Output<Boolean> inherited;

    /**
     * @return The project alert rule inherited. Default: `true` (bool)
     * 
     */
    public Optional<Output<Boolean>> inherited() {
        return Optional.ofNullable(this.inherited);
    }

    /**
     * The project alert rule labels (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return The project alert rule labels (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The project alert rule metric rule. ConflictsWith: `&#34;pod_rule&#34;, &#34;workload_rule&#34;`` (list Maxitems:1)
     * 
     */
    @Import(name="metricRule")
    private @Nullable Output<ProjectAlertRuleMetricRuleArgs> metricRule;

    /**
     * @return The project alert rule metric rule. ConflictsWith: `&#34;pod_rule&#34;, &#34;workload_rule&#34;`` (list Maxitems:1)
     * 
     */
    public Optional<Output<ProjectAlertRuleMetricRuleArgs>> metricRule() {
        return Optional.ofNullable(this.metricRule);
    }

    /**
     * The project alert rule name (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The project alert rule name (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The project alert rule pod rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;workload_rule&#34;`` (list Maxitems:1)
     * 
     */
    @Import(name="podRule")
    private @Nullable Output<ProjectAlertRulePodRuleArgs> podRule;

    /**
     * @return The project alert rule pod rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;workload_rule&#34;`` (list Maxitems:1)
     * 
     */
    public Optional<Output<ProjectAlertRulePodRuleArgs>> podRule() {
        return Optional.ofNullable(this.podRule);
    }

    /**
     * The project id where create project alert rule (string)
     * 
     */
    @Import(name="projectId", required=true)
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
    @Import(name="repeatIntervalSeconds")
    private @Nullable Output<Integer> repeatIntervalSeconds;

    /**
     * @return The project alert rule wait seconds. Default: `3600` (int)
     * 
     */
    public Optional<Output<Integer>> repeatIntervalSeconds() {
        return Optional.ofNullable(this.repeatIntervalSeconds);
    }

    /**
     * The project alert rule severity. Supported values : `&#34;critical&#34; | &#34;info&#34; | &#34;warning&#34;`. Default: `critical` (string)
     * 
     */
    @Import(name="severity")
    private @Nullable Output<String> severity;

    /**
     * @return The project alert rule severity. Supported values : `&#34;critical&#34; | &#34;info&#34; | &#34;warning&#34;`. Default: `critical` (string)
     * 
     */
    public Optional<Output<String>> severity() {
        return Optional.ofNullable(this.severity);
    }

    /**
     * The project alert rule workload rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;pod_rule&#34;`` (list Maxitems:1)
     * 
     */
    @Import(name="workloadRule")
    private @Nullable Output<ProjectAlertRuleWorkloadRuleArgs> workloadRule;

    /**
     * @return The project alert rule workload rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;pod_rule&#34;`` (list Maxitems:1)
     * 
     */
    public Optional<Output<ProjectAlertRuleWorkloadRuleArgs>> workloadRule() {
        return Optional.ofNullable(this.workloadRule);
    }

    private ProjectAlertRuleArgs() {}

    private ProjectAlertRuleArgs(ProjectAlertRuleArgs $) {
        this.annotations = $.annotations;
        this.groupId = $.groupId;
        this.groupIntervalSeconds = $.groupIntervalSeconds;
        this.groupWaitSeconds = $.groupWaitSeconds;
        this.inherited = $.inherited;
        this.labels = $.labels;
        this.metricRule = $.metricRule;
        this.name = $.name;
        this.podRule = $.podRule;
        this.projectId = $.projectId;
        this.repeatIntervalSeconds = $.repeatIntervalSeconds;
        this.severity = $.severity;
        this.workloadRule = $.workloadRule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectAlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectAlertRuleArgs $;

        public Builder() {
            $ = new ProjectAlertRuleArgs();
        }

        public Builder(ProjectAlertRuleArgs defaults) {
            $ = new ProjectAlertRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations The project alert rule annotations (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations The project alert rule annotations (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param groupId The project alert rule alert group ID (string)
         * 
         * @return builder
         * 
         */
        public Builder groupId(Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The project alert rule alert group ID (string)
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param groupIntervalSeconds The project alert rule group interval seconds. Default: `180` (int)
         * 
         * @return builder
         * 
         */
        public Builder groupIntervalSeconds(@Nullable Output<Integer> groupIntervalSeconds) {
            $.groupIntervalSeconds = groupIntervalSeconds;
            return this;
        }

        /**
         * @param groupIntervalSeconds The project alert rule group interval seconds. Default: `180` (int)
         * 
         * @return builder
         * 
         */
        public Builder groupIntervalSeconds(Integer groupIntervalSeconds) {
            return groupIntervalSeconds(Output.of(groupIntervalSeconds));
        }

        /**
         * @param groupWaitSeconds The project alert rule group wait seconds. Default: `180` (int)
         * 
         * @return builder
         * 
         */
        public Builder groupWaitSeconds(@Nullable Output<Integer> groupWaitSeconds) {
            $.groupWaitSeconds = groupWaitSeconds;
            return this;
        }

        /**
         * @param groupWaitSeconds The project alert rule group wait seconds. Default: `180` (int)
         * 
         * @return builder
         * 
         */
        public Builder groupWaitSeconds(Integer groupWaitSeconds) {
            return groupWaitSeconds(Output.of(groupWaitSeconds));
        }

        /**
         * @param inherited The project alert rule inherited. Default: `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder inherited(@Nullable Output<Boolean> inherited) {
            $.inherited = inherited;
            return this;
        }

        /**
         * @param inherited The project alert rule inherited. Default: `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder inherited(Boolean inherited) {
            return inherited(Output.of(inherited));
        }

        /**
         * @param labels The project alert rule labels (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The project alert rule labels (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param metricRule The project alert rule metric rule. ConflictsWith: `&#34;pod_rule&#34;, &#34;workload_rule&#34;`` (list Maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder metricRule(@Nullable Output<ProjectAlertRuleMetricRuleArgs> metricRule) {
            $.metricRule = metricRule;
            return this;
        }

        /**
         * @param metricRule The project alert rule metric rule. ConflictsWith: `&#34;pod_rule&#34;, &#34;workload_rule&#34;`` (list Maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder metricRule(ProjectAlertRuleMetricRuleArgs metricRule) {
            return metricRule(Output.of(metricRule));
        }

        /**
         * @param name The project alert rule name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The project alert rule name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param podRule The project alert rule pod rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;workload_rule&#34;`` (list Maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder podRule(@Nullable Output<ProjectAlertRulePodRuleArgs> podRule) {
            $.podRule = podRule;
            return this;
        }

        /**
         * @param podRule The project alert rule pod rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;workload_rule&#34;`` (list Maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder podRule(ProjectAlertRulePodRuleArgs podRule) {
            return podRule(Output.of(podRule));
        }

        /**
         * @param projectId The project id where create project alert rule (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The project id where create project alert rule (string)
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param repeatIntervalSeconds The project alert rule wait seconds. Default: `3600` (int)
         * 
         * @return builder
         * 
         */
        public Builder repeatIntervalSeconds(@Nullable Output<Integer> repeatIntervalSeconds) {
            $.repeatIntervalSeconds = repeatIntervalSeconds;
            return this;
        }

        /**
         * @param repeatIntervalSeconds The project alert rule wait seconds. Default: `3600` (int)
         * 
         * @return builder
         * 
         */
        public Builder repeatIntervalSeconds(Integer repeatIntervalSeconds) {
            return repeatIntervalSeconds(Output.of(repeatIntervalSeconds));
        }

        /**
         * @param severity The project alert rule severity. Supported values : `&#34;critical&#34; | &#34;info&#34; | &#34;warning&#34;`. Default: `critical` (string)
         * 
         * @return builder
         * 
         */
        public Builder severity(@Nullable Output<String> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity The project alert rule severity. Supported values : `&#34;critical&#34; | &#34;info&#34; | &#34;warning&#34;`. Default: `critical` (string)
         * 
         * @return builder
         * 
         */
        public Builder severity(String severity) {
            return severity(Output.of(severity));
        }

        /**
         * @param workloadRule The project alert rule workload rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;pod_rule&#34;`` (list Maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder workloadRule(@Nullable Output<ProjectAlertRuleWorkloadRuleArgs> workloadRule) {
            $.workloadRule = workloadRule;
            return this;
        }

        /**
         * @param workloadRule The project alert rule workload rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;pod_rule&#34;`` (list Maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder workloadRule(ProjectAlertRuleWorkloadRuleArgs workloadRule) {
            return workloadRule(Output.of(workloadRule));
        }

        public ProjectAlertRuleArgs build() {
            if ($.groupId == null) {
                throw new MissingRequiredPropertyException("ProjectAlertRuleArgs", "groupId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("ProjectAlertRuleArgs", "projectId");
            }
            return $;
        }
    }

}
