// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterRkeConfigServicesEtcdBackupConfigS3BackupConfigArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigServicesEtcdBackupConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigServicesEtcdBackupConfigArgs Empty = new ClusterRkeConfigServicesEtcdBackupConfigArgs();

    /**
     * Enable etcd backup (bool)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable etcd backup (bool)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Interval hours for etcd backup. Default `12` (int)
     * 
     */
    @Import(name="intervalHours")
    private @Nullable Output<Integer> intervalHours;

    /**
     * @return Interval hours for etcd backup. Default `12` (int)
     * 
     */
    public Optional<Output<Integer>> intervalHours() {
        return Optional.ofNullable(this.intervalHours);
    }

    /**
     * Retention option for etcd service (string)
     * 
     */
    @Import(name="retention")
    private @Nullable Output<Integer> retention;

    /**
     * @return Retention option for etcd service (string)
     * 
     */
    public Optional<Output<Integer>> retention() {
        return Optional.ofNullable(this.retention);
    }

    /**
     * S3 config options for etcd backup (list maxitems:1)
     * 
     */
    @Import(name="s3BackupConfig")
    private @Nullable Output<ClusterRkeConfigServicesEtcdBackupConfigS3BackupConfigArgs> s3BackupConfig;

    /**
     * @return S3 config options for etcd backup (list maxitems:1)
     * 
     */
    public Optional<Output<ClusterRkeConfigServicesEtcdBackupConfigS3BackupConfigArgs>> s3BackupConfig() {
        return Optional.ofNullable(this.s3BackupConfig);
    }

    /**
     * Safe timestamp for etcd backup. Default: `false` (bool)
     * 
     */
    @Import(name="safeTimestamp")
    private @Nullable Output<Boolean> safeTimestamp;

    /**
     * @return Safe timestamp for etcd backup. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> safeTimestamp() {
        return Optional.ofNullable(this.safeTimestamp);
    }

    /**
     * Timeout in seconds for etcd backup. Default: `300`. Just for Rancher v2.5.6 and above (int)
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return Timeout in seconds for etcd backup. Default: `300`. Just for Rancher v2.5.6 and above (int)
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private ClusterRkeConfigServicesEtcdBackupConfigArgs() {}

    private ClusterRkeConfigServicesEtcdBackupConfigArgs(ClusterRkeConfigServicesEtcdBackupConfigArgs $) {
        this.enabled = $.enabled;
        this.intervalHours = $.intervalHours;
        this.retention = $.retention;
        this.s3BackupConfig = $.s3BackupConfig;
        this.safeTimestamp = $.safeTimestamp;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigServicesEtcdBackupConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigServicesEtcdBackupConfigArgs $;

        public Builder() {
            $ = new ClusterRkeConfigServicesEtcdBackupConfigArgs();
        }

        public Builder(ClusterRkeConfigServicesEtcdBackupConfigArgs defaults) {
            $ = new ClusterRkeConfigServicesEtcdBackupConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enable etcd backup (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable etcd backup (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param intervalHours Interval hours for etcd backup. Default `12` (int)
         * 
         * @return builder
         * 
         */
        public Builder intervalHours(@Nullable Output<Integer> intervalHours) {
            $.intervalHours = intervalHours;
            return this;
        }

        /**
         * @param intervalHours Interval hours for etcd backup. Default `12` (int)
         * 
         * @return builder
         * 
         */
        public Builder intervalHours(Integer intervalHours) {
            return intervalHours(Output.of(intervalHours));
        }

        /**
         * @param retention Retention option for etcd service (string)
         * 
         * @return builder
         * 
         */
        public Builder retention(@Nullable Output<Integer> retention) {
            $.retention = retention;
            return this;
        }

        /**
         * @param retention Retention option for etcd service (string)
         * 
         * @return builder
         * 
         */
        public Builder retention(Integer retention) {
            return retention(Output.of(retention));
        }

        /**
         * @param s3BackupConfig S3 config options for etcd backup (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder s3BackupConfig(@Nullable Output<ClusterRkeConfigServicesEtcdBackupConfigS3BackupConfigArgs> s3BackupConfig) {
            $.s3BackupConfig = s3BackupConfig;
            return this;
        }

        /**
         * @param s3BackupConfig S3 config options for etcd backup (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder s3BackupConfig(ClusterRkeConfigServicesEtcdBackupConfigS3BackupConfigArgs s3BackupConfig) {
            return s3BackupConfig(Output.of(s3BackupConfig));
        }

        /**
         * @param safeTimestamp Safe timestamp for etcd backup. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder safeTimestamp(@Nullable Output<Boolean> safeTimestamp) {
            $.safeTimestamp = safeTimestamp;
            return this;
        }

        /**
         * @param safeTimestamp Safe timestamp for etcd backup. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder safeTimestamp(Boolean safeTimestamp) {
            return safeTimestamp(Output.of(safeTimestamp));
        }

        /**
         * @param timeout Timeout in seconds for etcd backup. Default: `300`. Just for Rancher v2.5.6 and above (int)
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Timeout in seconds for etcd backup. Default: `300`. Just for Rancher v2.5.6 and above (int)
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        public ClusterRkeConfigServicesEtcdBackupConfigArgs build() {
            return $;
        }
    }

}
