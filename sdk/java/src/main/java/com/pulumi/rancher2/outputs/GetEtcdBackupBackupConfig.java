// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetEtcdBackupBackupConfigS3BackupConfig;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEtcdBackupBackupConfig {
    private @Nullable Boolean enabled;
    private @Nullable Integer intervalHours;
    private @Nullable Integer retention;
    private @Nullable GetEtcdBackupBackupConfigS3BackupConfig s3BackupConfig;
    private @Nullable Boolean safeTimestamp;
    private Integer timeout;

    private GetEtcdBackupBackupConfig() {}
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Integer> intervalHours() {
        return Optional.ofNullable(this.intervalHours);
    }
    public Optional<Integer> retention() {
        return Optional.ofNullable(this.retention);
    }
    public Optional<GetEtcdBackupBackupConfigS3BackupConfig> s3BackupConfig() {
        return Optional.ofNullable(this.s3BackupConfig);
    }
    public Optional<Boolean> safeTimestamp() {
        return Optional.ofNullable(this.safeTimestamp);
    }
    public Integer timeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEtcdBackupBackupConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Integer intervalHours;
        private @Nullable Integer retention;
        private @Nullable GetEtcdBackupBackupConfigS3BackupConfig s3BackupConfig;
        private @Nullable Boolean safeTimestamp;
        private Integer timeout;
        public Builder() {}
        public Builder(GetEtcdBackupBackupConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.intervalHours = defaults.intervalHours;
    	      this.retention = defaults.retention;
    	      this.s3BackupConfig = defaults.s3BackupConfig;
    	      this.safeTimestamp = defaults.safeTimestamp;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder intervalHours(@Nullable Integer intervalHours) {
            this.intervalHours = intervalHours;
            return this;
        }
        @CustomType.Setter
        public Builder retention(@Nullable Integer retention) {
            this.retention = retention;
            return this;
        }
        @CustomType.Setter
        public Builder s3BackupConfig(@Nullable GetEtcdBackupBackupConfigS3BackupConfig s3BackupConfig) {
            this.s3BackupConfig = s3BackupConfig;
            return this;
        }
        @CustomType.Setter
        public Builder safeTimestamp(@Nullable Boolean safeTimestamp) {
            this.safeTimestamp = safeTimestamp;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(Integer timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        public GetEtcdBackupBackupConfig build() {
            final var o = new GetEtcdBackupBackupConfig();
            o.enabled = enabled;
            o.intervalHours = intervalHours;
            o.retention = retention;
            o.s3BackupConfig = s3BackupConfig;
            o.safeTimestamp = safeTimestamp;
            o.timeout = timeout;
            return o;
        }
    }
}
