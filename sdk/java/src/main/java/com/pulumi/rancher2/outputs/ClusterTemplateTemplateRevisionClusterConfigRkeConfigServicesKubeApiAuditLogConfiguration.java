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
    private @Nullable String format;
    private @Nullable Integer maxAge;
    private @Nullable Integer maxBackup;
    private @Nullable Integer maxSize;
    private @Nullable String path;
    private @Nullable String policy;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfiguration() {}
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
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String format;
        private @Nullable Integer maxAge;
        private @Nullable Integer maxBackup;
        private @Nullable Integer maxSize;
        private @Nullable String path;
        private @Nullable String policy;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.maxAge = defaults.maxAge;
    	      this.maxBackup = defaults.maxBackup;
    	      this.maxSize = defaults.maxSize;
    	      this.path = defaults.path;
    	      this.policy = defaults.policy;
        }

        @CustomType.Setter
        public Builder format(@Nullable String format) {
            this.format = format;
            return this;
        }
        @CustomType.Setter
        public Builder maxAge(@Nullable Integer maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        @CustomType.Setter
        public Builder maxBackup(@Nullable Integer maxBackup) {
            this.maxBackup = maxBackup;
            return this;
        }
        @CustomType.Setter
        public Builder maxSize(@Nullable Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder policy(@Nullable String policy) {
            this.policy = policy;
            return this;
        }
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfiguration build() {
            final var o = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogConfiguration();
            o.format = format;
            o.maxAge = maxAge;
            o.maxBackup = maxBackup;
            o.maxSize = maxSize;
            o.path = path;
            o.policy = policy;
            return o;
        }
    }
}
