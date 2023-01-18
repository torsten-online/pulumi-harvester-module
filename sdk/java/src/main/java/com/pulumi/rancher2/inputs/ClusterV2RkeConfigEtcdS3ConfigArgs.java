// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterV2RkeConfigEtcdS3ConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterV2RkeConfigEtcdS3ConfigArgs Empty = new ClusterV2RkeConfigEtcdS3ConfigArgs();

    /**
     * Bucket name for S3 service (string)
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return Bucket name for S3 service (string)
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * Machine pool cloud credential secret name (string)
     * 
     */
    @Import(name="cloudCredentialName")
    private @Nullable Output<String> cloudCredentialName;

    /**
     * @return Machine pool cloud credential secret name (string)
     * 
     */
    public Optional<Output<String>> cloudCredentialName() {
        return Optional.ofNullable(this.cloudCredentialName);
    }

    /**
     * ETCD snapshot S3 endpoint (string)
     * 
     */
    @Import(name="endpoint", required=true)
    private Output<String> endpoint;

    /**
     * @return ETCD snapshot S3 endpoint (string)
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }

    /**
     * ETCD snapshot S3 endpoint CA (string)
     * 
     */
    @Import(name="endpointCa")
    private @Nullable Output<String> endpointCa;

    /**
     * @return ETCD snapshot S3 endpoint CA (string)
     * 
     */
    public Optional<Output<String>> endpointCa() {
        return Optional.ofNullable(this.endpointCa);
    }

    /**
     * ETCD snapshot S3 folder (string)
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    /**
     * @return ETCD snapshot S3 folder (string)
     * 
     */
    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * ETCD snapshot S3 region (string)
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return ETCD snapshot S3 region (string)
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Disable ETCD skip ssl verify. Default: `false` (bool)
     * 
     */
    @Import(name="skipSslVerify")
    private @Nullable Output<Boolean> skipSslVerify;

    /**
     * @return Disable ETCD skip ssl verify. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> skipSslVerify() {
        return Optional.ofNullable(this.skipSslVerify);
    }

    private ClusterV2RkeConfigEtcdS3ConfigArgs() {}

    private ClusterV2RkeConfigEtcdS3ConfigArgs(ClusterV2RkeConfigEtcdS3ConfigArgs $) {
        this.bucket = $.bucket;
        this.cloudCredentialName = $.cloudCredentialName;
        this.endpoint = $.endpoint;
        this.endpointCa = $.endpointCa;
        this.folder = $.folder;
        this.region = $.region;
        this.skipSslVerify = $.skipSslVerify;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterV2RkeConfigEtcdS3ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterV2RkeConfigEtcdS3ConfigArgs $;

        public Builder() {
            $ = new ClusterV2RkeConfigEtcdS3ConfigArgs();
        }

        public Builder(ClusterV2RkeConfigEtcdS3ConfigArgs defaults) {
            $ = new ClusterV2RkeConfigEtcdS3ConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket Bucket name for S3 service (string)
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket Bucket name for S3 service (string)
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param cloudCredentialName Machine pool cloud credential secret name (string)
         * 
         * @return builder
         * 
         */
        public Builder cloudCredentialName(@Nullable Output<String> cloudCredentialName) {
            $.cloudCredentialName = cloudCredentialName;
            return this;
        }

        /**
         * @param cloudCredentialName Machine pool cloud credential secret name (string)
         * 
         * @return builder
         * 
         */
        public Builder cloudCredentialName(String cloudCredentialName) {
            return cloudCredentialName(Output.of(cloudCredentialName));
        }

        /**
         * @param endpoint ETCD snapshot S3 endpoint (string)
         * 
         * @return builder
         * 
         */
        public Builder endpoint(Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint ETCD snapshot S3 endpoint (string)
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param endpointCa ETCD snapshot S3 endpoint CA (string)
         * 
         * @return builder
         * 
         */
        public Builder endpointCa(@Nullable Output<String> endpointCa) {
            $.endpointCa = endpointCa;
            return this;
        }

        /**
         * @param endpointCa ETCD snapshot S3 endpoint CA (string)
         * 
         * @return builder
         * 
         */
        public Builder endpointCa(String endpointCa) {
            return endpointCa(Output.of(endpointCa));
        }

        /**
         * @param folder ETCD snapshot S3 folder (string)
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder ETCD snapshot S3 folder (string)
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param region ETCD snapshot S3 region (string)
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region ETCD snapshot S3 region (string)
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param skipSslVerify Disable ETCD skip ssl verify. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder skipSslVerify(@Nullable Output<Boolean> skipSslVerify) {
            $.skipSslVerify = skipSslVerify;
            return this;
        }

        /**
         * @param skipSslVerify Disable ETCD skip ssl verify. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder skipSslVerify(Boolean skipSslVerify) {
            return skipSslVerify(Output.of(skipSslVerify));
        }

        public ClusterV2RkeConfigEtcdS3ConfigArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.endpoint = Objects.requireNonNull($.endpoint, "expected parameter 'endpoint' to be non-null");
            return $;
        }
    }

}
