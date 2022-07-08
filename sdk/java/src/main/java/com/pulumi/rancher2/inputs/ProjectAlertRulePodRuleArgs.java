// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectAlertRulePodRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectAlertRulePodRuleArgs Empty = new ProjectAlertRulePodRuleArgs();

    /**
     * Pod rule condition. Supported values : `&#34;notrunning&#34; | &#34;notscheduled&#34; | &#34;restarts&#34;`. Default: `notrunning` (string)
     * 
     */
    @Import(name="condition")
    private @Nullable Output<String> condition;

    /**
     * @return Pod rule condition. Supported values : `&#34;notrunning&#34; | &#34;notscheduled&#34; | &#34;restarts&#34;`. Default: `notrunning` (string)
     * 
     */
    public Optional<Output<String>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * Pod ID (string)
     * 
     */
    @Import(name="podId", required=true)
    private Output<String> podId;

    /**
     * @return Pod ID (string)
     * 
     */
    public Output<String> podId() {
        return this.podId;
    }

    /**
     * Pod rule restart interval seconds. Default: `300` (int)
     * 
     */
    @Import(name="restartIntervalSeconds")
    private @Nullable Output<Integer> restartIntervalSeconds;

    /**
     * @return Pod rule restart interval seconds. Default: `300` (int)
     * 
     */
    public Optional<Output<Integer>> restartIntervalSeconds() {
        return Optional.ofNullable(this.restartIntervalSeconds);
    }

    /**
     * Pod rule restart times. Default: `3`  (int)
     * 
     */
    @Import(name="restartTimes")
    private @Nullable Output<Integer> restartTimes;

    /**
     * @return Pod rule restart times. Default: `3`  (int)
     * 
     */
    public Optional<Output<Integer>> restartTimes() {
        return Optional.ofNullable(this.restartTimes);
    }

    private ProjectAlertRulePodRuleArgs() {}

    private ProjectAlertRulePodRuleArgs(ProjectAlertRulePodRuleArgs $) {
        this.condition = $.condition;
        this.podId = $.podId;
        this.restartIntervalSeconds = $.restartIntervalSeconds;
        this.restartTimes = $.restartTimes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectAlertRulePodRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectAlertRulePodRuleArgs $;

        public Builder() {
            $ = new ProjectAlertRulePodRuleArgs();
        }

        public Builder(ProjectAlertRulePodRuleArgs defaults) {
            $ = new ProjectAlertRulePodRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition Pod rule condition. Supported values : `&#34;notrunning&#34; | &#34;notscheduled&#34; | &#34;restarts&#34;`. Default: `notrunning` (string)
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<String> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition Pod rule condition. Supported values : `&#34;notrunning&#34; | &#34;notscheduled&#34; | &#34;restarts&#34;`. Default: `notrunning` (string)
         * 
         * @return builder
         * 
         */
        public Builder condition(String condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param podId Pod ID (string)
         * 
         * @return builder
         * 
         */
        public Builder podId(Output<String> podId) {
            $.podId = podId;
            return this;
        }

        /**
         * @param podId Pod ID (string)
         * 
         * @return builder
         * 
         */
        public Builder podId(String podId) {
            return podId(Output.of(podId));
        }

        /**
         * @param restartIntervalSeconds Pod rule restart interval seconds. Default: `300` (int)
         * 
         * @return builder
         * 
         */
        public Builder restartIntervalSeconds(@Nullable Output<Integer> restartIntervalSeconds) {
            $.restartIntervalSeconds = restartIntervalSeconds;
            return this;
        }

        /**
         * @param restartIntervalSeconds Pod rule restart interval seconds. Default: `300` (int)
         * 
         * @return builder
         * 
         */
        public Builder restartIntervalSeconds(Integer restartIntervalSeconds) {
            return restartIntervalSeconds(Output.of(restartIntervalSeconds));
        }

        /**
         * @param restartTimes Pod rule restart times. Default: `3`  (int)
         * 
         * @return builder
         * 
         */
        public Builder restartTimes(@Nullable Output<Integer> restartTimes) {
            $.restartTimes = restartTimes;
            return this;
        }

        /**
         * @param restartTimes Pod rule restart times. Default: `3`  (int)
         * 
         * @return builder
         * 
         */
        public Builder restartTimes(Integer restartTimes) {
            return restartTimes(Output.of(restartTimes));
        }

        public ProjectAlertRulePodRuleArgs build() {
            $.podId = Objects.requireNonNull($.podId, "expected parameter 'podId' to be non-null");
            return $;
        }
    }

}
