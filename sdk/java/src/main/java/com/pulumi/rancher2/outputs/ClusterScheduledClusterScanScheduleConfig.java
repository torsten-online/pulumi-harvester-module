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
public final class ClusterScheduledClusterScanScheduleConfig {
    /**
     * @return Crontab schedule. It should contains 5 fields `&#34;&lt;min&gt; &lt;hour&gt; &lt;month_day&gt; &lt;month&gt; &lt;week_day&gt;&#34;` (string)
     * 
     */
    private final String cronSchedule;
    /**
     * @return Retention for etcd backup. Default `6` (int)
     * 
     */
    private final @Nullable Integer retention;

    @CustomType.Constructor
    private ClusterScheduledClusterScanScheduleConfig(
        @CustomType.Parameter("cronSchedule") String cronSchedule,
        @CustomType.Parameter("retention") @Nullable Integer retention) {
        this.cronSchedule = cronSchedule;
        this.retention = retention;
    }

    /**
     * @return Crontab schedule. It should contains 5 fields `&#34;&lt;min&gt; &lt;hour&gt; &lt;month_day&gt; &lt;month&gt; &lt;week_day&gt;&#34;` (string)
     * 
     */
    public String cronSchedule() {
        return this.cronSchedule;
    }
    /**
     * @return Retention for etcd backup. Default `6` (int)
     * 
     */
    public Optional<Integer> retention() {
        return Optional.ofNullable(this.retention);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterScheduledClusterScanScheduleConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cronSchedule;
        private @Nullable Integer retention;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterScheduledClusterScanScheduleConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cronSchedule = defaults.cronSchedule;
    	      this.retention = defaults.retention;
        }

        public Builder cronSchedule(String cronSchedule) {
            this.cronSchedule = Objects.requireNonNull(cronSchedule);
            return this;
        }
        public Builder retention(@Nullable Integer retention) {
            this.retention = retention;
            return this;
        }        public ClusterScheduledClusterScanScheduleConfig build() {
            return new ClusterScheduledClusterScanScheduleConfig(cronSchedule, retention);
        }
    }
}
