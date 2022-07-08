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
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfiguration {
    private final @Nullable String format;
    private final @Nullable Integer maxAge;
    private final @Nullable Integer maxBackup;
    private final @Nullable Integer maxSize;
    private final @Nullable String path;
    private final @Nullable String policy;

    @CustomType.Constructor
    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfiguration(
        @CustomType.Parameter("format") @Nullable String format,
        @CustomType.Parameter("maxAge") @Nullable Integer maxAge,
        @CustomType.Parameter("maxBackup") @Nullable Integer maxBackup,
        @CustomType.Parameter("maxSize") @Nullable Integer maxSize,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("policy") @Nullable String policy) {
        this.format = format;
        this.maxAge = maxAge;
        this.maxBackup = maxBackup;
        this.maxSize = maxSize;
        this.path = path;
        this.policy = policy;
    }

    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }
    public Optional<Integer> maxAge() {
        return Optional.ofNullable(this.maxAge);
    }
    public Optional<Integer> maxBackup() {
        return Optional.ofNullable(this.maxBackup);
    }
    public Optional<Integer> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    public Optional<String> policy() {
        return Optional.ofNullable(this.policy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String format;
        private @Nullable Integer maxAge;
        private @Nullable Integer maxBackup;
        private @Nullable Integer maxSize;
        private @Nullable String path;
        private @Nullable String policy;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.maxAge = defaults.maxAge;
    	      this.maxBackup = defaults.maxBackup;
    	      this.maxSize = defaults.maxSize;
    	      this.path = defaults.path;
    	      this.policy = defaults.policy;
        }

        public Builder format(@Nullable String format) {
            this.format = format;
            return this;
        }
        public Builder maxAge(@Nullable Integer maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public Builder maxBackup(@Nullable Integer maxBackup) {
            this.maxBackup = maxBackup;
            return this;
        }
        public Builder maxSize(@Nullable Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = policy;
            return this;
        }        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfiguration build() {
            return new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfiguration(format, maxAge, maxBackup, maxSize, path, policy);
        }
    }
}
