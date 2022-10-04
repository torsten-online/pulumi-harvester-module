// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfigS3BackupConfig {
    private @Nullable String accessKey;
    private String bucketName;
    private @Nullable String customCa;
    private String endpoint;
    private @Nullable String folder;
    private @Nullable String region;
    private @Nullable String secretKey;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfigS3BackupConfig() {}
    public Optional<String> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }
    public String bucketName() {
        return this.bucketName;
    }
    public Optional<String> customCa() {
        return Optional.ofNullable(this.customCa);
    }
    public String endpoint() {
        return this.endpoint;
    }
    public Optional<String> folder() {
        return Optional.ofNullable(this.folder);
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    public Optional<String> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfigS3BackupConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessKey;
        private String bucketName;
        private @Nullable String customCa;
        private String endpoint;
        private @Nullable String folder;
        private @Nullable String region;
        private @Nullable String secretKey;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfigS3BackupConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.bucketName = defaults.bucketName;
    	      this.customCa = defaults.customCa;
    	      this.endpoint = defaults.endpoint;
    	      this.folder = defaults.folder;
    	      this.region = defaults.region;
    	      this.secretKey = defaults.secretKey;
        }

        @CustomType.Setter
        public Builder accessKey(@Nullable String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        @CustomType.Setter
        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        @CustomType.Setter
        public Builder customCa(@Nullable String customCa) {
            this.customCa = customCa;
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        @CustomType.Setter
        public Builder folder(@Nullable String folder) {
            this.folder = folder;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder secretKey(@Nullable String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfigS3BackupConfig build() {
            final var o = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfigS3BackupConfig();
            o.accessKey = accessKey;
            o.bucketName = bucketName;
            o.customCa = customCa;
            o.endpoint = endpoint;
            o.folder = folder;
            o.region = region;
            o.secretKey = secretKey;
            return o;
        }
    }
}
