// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfigS3BackupConfig {
    private final @Nullable String accessKey;
    private final String bucketName;
    private final @Nullable String customCa;
    private final String endpoint;
    private final @Nullable String folder;
    private final @Nullable String region;
    private final @Nullable String secretKey;

    @CustomType.Constructor
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfigS3BackupConfig(
        @CustomType.Parameter("accessKey") @Nullable String accessKey,
        @CustomType.Parameter("bucketName") String bucketName,
        @CustomType.Parameter("customCa") @Nullable String customCa,
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("folder") @Nullable String folder,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("secretKey") @Nullable String secretKey) {
        this.accessKey = accessKey;
        this.bucketName = bucketName;
        this.customCa = customCa;
        this.endpoint = endpoint;
        this.folder = folder;
        this.region = region;
        this.secretKey = secretKey;
    }

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

    public static Builder builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfigS3BackupConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessKey;
        private String bucketName;
        private @Nullable String customCa;
        private String endpoint;
        private @Nullable String folder;
        private @Nullable String region;
        private @Nullable String secretKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfigS3BackupConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.bucketName = defaults.bucketName;
    	      this.customCa = defaults.customCa;
    	      this.endpoint = defaults.endpoint;
    	      this.folder = defaults.folder;
    	      this.region = defaults.region;
    	      this.secretKey = defaults.secretKey;
        }

        public Builder accessKey(@Nullable String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder customCa(@Nullable String customCa) {
            this.customCa = customCa;
            return this;
        }
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder folder(@Nullable String folder) {
            this.folder = folder;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder secretKey(@Nullable String secretKey) {
            this.secretKey = secretKey;
            return this;
        }        public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfigS3BackupConfig build() {
            return new GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfigS3BackupConfig(accessKey, bucketName, customCa, endpoint, folder, region, secretKey);
        }
    }
}
