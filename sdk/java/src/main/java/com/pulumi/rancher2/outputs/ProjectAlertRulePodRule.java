// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectAlertRulePodRule {
    /**
     * @return Pod rule condition. Supported values : `&#34;notrunning&#34; | &#34;notscheduled&#34; | &#34;restarts&#34;`. Default: `notrunning` (string)
     * 
     */
    private final @Nullable String condition;
    /**
     * @return Pod ID (string)
     * 
     */
    private final String podId;
    /**
     * @return Pod rule restart interval seconds. Default: `300` (int)
     * 
     */
    private final @Nullable Integer restartIntervalSeconds;
    /**
     * @return Pod rule restart times. Default: `3`  (int)
     * 
     */
    private final @Nullable Integer restartTimes;

    @CustomType.Constructor
    private ProjectAlertRulePodRule(
        @CustomType.Parameter("condition") @Nullable String condition,
        @CustomType.Parameter("podId") String podId,
        @CustomType.Parameter("restartIntervalSeconds") @Nullable Integer restartIntervalSeconds,
        @CustomType.Parameter("restartTimes") @Nullable Integer restartTimes) {
        this.condition = condition;
        this.podId = podId;
        this.restartIntervalSeconds = restartIntervalSeconds;
        this.restartTimes = restartTimes;
    }

    /**
     * @return Pod rule condition. Supported values : `&#34;notrunning&#34; | &#34;notscheduled&#34; | &#34;restarts&#34;`. Default: `notrunning` (string)
     * 
     */
    public Optional<String> condition() {
        return Optional.ofNullable(this.condition);
    }
    /**
     * @return Pod ID (string)
     * 
     */
    public String podId() {
        return this.podId;
    }
    /**
     * @return Pod rule restart interval seconds. Default: `300` (int)
     * 
     */
    public Optional<Integer> restartIntervalSeconds() {
        return Optional.ofNullable(this.restartIntervalSeconds);
    }
    /**
     * @return Pod rule restart times. Default: `3`  (int)
     * 
     */
    public Optional<Integer> restartTimes() {
        return Optional.ofNullable(this.restartTimes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectAlertRulePodRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String condition;
        private String podId;
        private @Nullable Integer restartIntervalSeconds;
        private @Nullable Integer restartTimes;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectAlertRulePodRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.podId = defaults.podId;
    	      this.restartIntervalSeconds = defaults.restartIntervalSeconds;
    	      this.restartTimes = defaults.restartTimes;
        }

        public Builder condition(@Nullable String condition) {
            this.condition = condition;
            return this;
        }
        public Builder podId(String podId) {
            this.podId = Objects.requireNonNull(podId);
            return this;
        }
        public Builder restartIntervalSeconds(@Nullable Integer restartIntervalSeconds) {
            this.restartIntervalSeconds = restartIntervalSeconds;
            return this;
        }
        public Builder restartTimes(@Nullable Integer restartTimes) {
            this.restartTimes = restartTimes;
            return this;
        }        public ProjectAlertRulePodRule build() {
            return new ProjectAlertRulePodRule(condition, podId, restartIntervalSeconds, restartTimes);
        }
    }
}
