// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetProjectAlertRuleMetricRule;
import com.pulumi.rancher2.outputs.GetProjectAlertRulePodRule;
import com.pulumi.rancher2.outputs.GetProjectAlertRuleWorkloadRule;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetProjectAlertRuleResult {
    /**
     * @return (Computed) The project alert rule annotations (map)
     * 
     */
    private final Map<String,Object> annotations;
    /**
     * @return (Computed) The project alert rule alert group ID (string)
     * 
     */
    private final String groupId;
    /**
     * @return (Computed) The project alert rule group interval seconds. Default: `180` (int)
     * 
     */
    private final Integer groupIntervalSeconds;
    /**
     * @return (Computed) The project alert rule group wait seconds. Default: `180` (int)
     * 
     */
    private final Integer groupWaitSeconds;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return (Computed) The project alert rule inherited. Default: `true` (bool)
     * 
     */
    private final Boolean inherited;
    /**
     * @return (Computed) The project alert rule labels (map)
     * 
     */
    private final @Nullable Map<String,Object> labels;
    /**
     * @return (Computed) The project alert rule metric rule. ConflictsWith: `&#34;pod_rule&#34;, &#34;workload_rule&#34;`` (list Maxitems:1)
     * 
     */
    private final GetProjectAlertRuleMetricRule metricRule;
    private final String name;
    /**
     * @return (Computed) The project alert rule pod rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;workload_rule&#34;`` (list Maxitems:1)
     * 
     */
    private final GetProjectAlertRulePodRule podRule;
    private final String projectId;
    /**
     * @return (Computed) The project alert rule wait seconds. Default: `3600` (int)
     * 
     */
    private final Integer repeatIntervalSeconds;
    /**
     * @return (Computed) The project alert rule severity. Supported values : `&#34;critical&#34; | &#34;info&#34; | &#34;warning&#34;`. Default: `critical` (string)
     * 
     */
    private final String severity;
    /**
     * @return (Computed) The project alert rule workload rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;pod_rule&#34;`` (list Maxitems:1)
     * 
     */
    private final GetProjectAlertRuleWorkloadRule workloadRule;

    @CustomType.Constructor
    private GetProjectAlertRuleResult(
        @CustomType.Parameter("annotations") Map<String,Object> annotations,
        @CustomType.Parameter("groupId") String groupId,
        @CustomType.Parameter("groupIntervalSeconds") Integer groupIntervalSeconds,
        @CustomType.Parameter("groupWaitSeconds") Integer groupWaitSeconds,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("inherited") Boolean inherited,
        @CustomType.Parameter("labels") @Nullable Map<String,Object> labels,
        @CustomType.Parameter("metricRule") GetProjectAlertRuleMetricRule metricRule,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("podRule") GetProjectAlertRulePodRule podRule,
        @CustomType.Parameter("projectId") String projectId,
        @CustomType.Parameter("repeatIntervalSeconds") Integer repeatIntervalSeconds,
        @CustomType.Parameter("severity") String severity,
        @CustomType.Parameter("workloadRule") GetProjectAlertRuleWorkloadRule workloadRule) {
        this.annotations = annotations;
        this.groupId = groupId;
        this.groupIntervalSeconds = groupIntervalSeconds;
        this.groupWaitSeconds = groupWaitSeconds;
        this.id = id;
        this.inherited = inherited;
        this.labels = labels;
        this.metricRule = metricRule;
        this.name = name;
        this.podRule = podRule;
        this.projectId = projectId;
        this.repeatIntervalSeconds = repeatIntervalSeconds;
        this.severity = severity;
        this.workloadRule = workloadRule;
    }

    /**
     * @return (Computed) The project alert rule annotations (map)
     * 
     */
    public Map<String,Object> annotations() {
        return this.annotations;
    }
    /**
     * @return (Computed) The project alert rule alert group ID (string)
     * 
     */
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return (Computed) The project alert rule group interval seconds. Default: `180` (int)
     * 
     */
    public Integer groupIntervalSeconds() {
        return this.groupIntervalSeconds;
    }
    /**
     * @return (Computed) The project alert rule group wait seconds. Default: `180` (int)
     * 
     */
    public Integer groupWaitSeconds() {
        return this.groupWaitSeconds;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Computed) The project alert rule inherited. Default: `true` (bool)
     * 
     */
    public Boolean inherited() {
        return this.inherited;
    }
    /**
     * @return (Computed) The project alert rule labels (map)
     * 
     */
    public Map<String,Object> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * @return (Computed) The project alert rule metric rule. ConflictsWith: `&#34;pod_rule&#34;, &#34;workload_rule&#34;`` (list Maxitems:1)
     * 
     */
    public GetProjectAlertRuleMetricRule metricRule() {
        return this.metricRule;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return (Computed) The project alert rule pod rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;workload_rule&#34;`` (list Maxitems:1)
     * 
     */
    public GetProjectAlertRulePodRule podRule() {
        return this.podRule;
    }
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return (Computed) The project alert rule wait seconds. Default: `3600` (int)
     * 
     */
    public Integer repeatIntervalSeconds() {
        return this.repeatIntervalSeconds;
    }
    /**
     * @return (Computed) The project alert rule severity. Supported values : `&#34;critical&#34; | &#34;info&#34; | &#34;warning&#34;`. Default: `critical` (string)
     * 
     */
    public String severity() {
        return this.severity;
    }
    /**
     * @return (Computed) The project alert rule workload rule. ConflictsWith: `&#34;metric_rule&#34;, &#34;pod_rule&#34;`` (list Maxitems:1)
     * 
     */
    public GetProjectAlertRuleWorkloadRule workloadRule() {
        return this.workloadRule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectAlertRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,Object> annotations;
        private String groupId;
        private Integer groupIntervalSeconds;
        private Integer groupWaitSeconds;
        private String id;
        private Boolean inherited;
        private @Nullable Map<String,Object> labels;
        private GetProjectAlertRuleMetricRule metricRule;
        private String name;
        private GetProjectAlertRulePodRule podRule;
        private String projectId;
        private Integer repeatIntervalSeconds;
        private String severity;
        private GetProjectAlertRuleWorkloadRule workloadRule;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectAlertRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.groupId = defaults.groupId;
    	      this.groupIntervalSeconds = defaults.groupIntervalSeconds;
    	      this.groupWaitSeconds = defaults.groupWaitSeconds;
    	      this.id = defaults.id;
    	      this.inherited = defaults.inherited;
    	      this.labels = defaults.labels;
    	      this.metricRule = defaults.metricRule;
    	      this.name = defaults.name;
    	      this.podRule = defaults.podRule;
    	      this.projectId = defaults.projectId;
    	      this.repeatIntervalSeconds = defaults.repeatIntervalSeconds;
    	      this.severity = defaults.severity;
    	      this.workloadRule = defaults.workloadRule;
        }

        public Builder annotations(Map<String,Object> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        public Builder groupIntervalSeconds(Integer groupIntervalSeconds) {
            this.groupIntervalSeconds = Objects.requireNonNull(groupIntervalSeconds);
            return this;
        }
        public Builder groupWaitSeconds(Integer groupWaitSeconds) {
            this.groupWaitSeconds = Objects.requireNonNull(groupWaitSeconds);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder inherited(Boolean inherited) {
            this.inherited = Objects.requireNonNull(inherited);
            return this;
        }
        public Builder labels(@Nullable Map<String,Object> labels) {
            this.labels = labels;
            return this;
        }
        public Builder metricRule(GetProjectAlertRuleMetricRule metricRule) {
            this.metricRule = Objects.requireNonNull(metricRule);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder podRule(GetProjectAlertRulePodRule podRule) {
            this.podRule = Objects.requireNonNull(podRule);
            return this;
        }
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        public Builder repeatIntervalSeconds(Integer repeatIntervalSeconds) {
            this.repeatIntervalSeconds = Objects.requireNonNull(repeatIntervalSeconds);
            return this;
        }
        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public Builder workloadRule(GetProjectAlertRuleWorkloadRule workloadRule) {
            this.workloadRule = Objects.requireNonNull(workloadRule);
            return this;
        }        public GetProjectAlertRuleResult build() {
            return new GetProjectAlertRuleResult(annotations, groupId, groupIntervalSeconds, groupWaitSeconds, id, inherited, labels, metricRule, name, podRule, projectId, repeatIntervalSeconds, severity, workloadRule);
        }
    }
}
