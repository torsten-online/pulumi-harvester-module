// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GlobalDnsProviderRoute53Config {
    /**
     * @return The AWS Access key (string)
     * 
     */
    private final String accessKey;
    /**
     * @return The AWS credentials path. Default: `&#34;/.aws&#34;` (string)
     * 
     */
    private final @Nullable String credentialsPath;
    /**
     * @return The AWS Region. Default: `&#34;us-west-2&#34;` (string)
     * 
     */
    private final @Nullable String region;
    /**
     * @return The AWS Role ARN (string)
     * 
     */
    private final @Nullable String roleArn;
    /**
     * @return The AWS Secret key (string)
     * 
     */
    private final String secretKey;
    /**
     * @return The Route53 zone type `public, private`. Default: `&#34;public&#34;` (string)
     * 
     */
    private final @Nullable String zoneType;

    @CustomType.Constructor
    private GlobalDnsProviderRoute53Config(
        @CustomType.Parameter("accessKey") String accessKey,
        @CustomType.Parameter("credentialsPath") @Nullable String credentialsPath,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("roleArn") @Nullable String roleArn,
        @CustomType.Parameter("secretKey") String secretKey,
        @CustomType.Parameter("zoneType") @Nullable String zoneType) {
        this.accessKey = accessKey;
        this.credentialsPath = credentialsPath;
        this.region = region;
        this.roleArn = roleArn;
        this.secretKey = secretKey;
        this.zoneType = zoneType;
    }

    /**
     * @return The AWS Access key (string)
     * 
     */
    public String accessKey() {
        return this.accessKey;
    }
    /**
     * @return The AWS credentials path. Default: `&#34;/.aws&#34;` (string)
     * 
     */
    public Optional<String> credentialsPath() {
        return Optional.ofNullable(this.credentialsPath);
    }
    /**
     * @return The AWS Region. Default: `&#34;us-west-2&#34;` (string)
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return The AWS Role ARN (string)
     * 
     */
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * @return The AWS Secret key (string)
     * 
     */
    public String secretKey() {
        return this.secretKey;
    }
    /**
     * @return The Route53 zone type `public, private`. Default: `&#34;public&#34;` (string)
     * 
     */
    public Optional<String> zoneType() {
        return Optional.ofNullable(this.zoneType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalDnsProviderRoute53Config defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessKey;
        private @Nullable String credentialsPath;
        private @Nullable String region;
        private @Nullable String roleArn;
        private String secretKey;
        private @Nullable String zoneType;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalDnsProviderRoute53Config defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.credentialsPath = defaults.credentialsPath;
    	      this.region = defaults.region;
    	      this.roleArn = defaults.roleArn;
    	      this.secretKey = defaults.secretKey;
    	      this.zoneType = defaults.zoneType;
        }

        public Builder accessKey(String accessKey) {
            this.accessKey = Objects.requireNonNull(accessKey);
            return this;
        }
        public Builder credentialsPath(@Nullable String credentialsPath) {
            this.credentialsPath = credentialsPath;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder secretKey(String secretKey) {
            this.secretKey = Objects.requireNonNull(secretKey);
            return this;
        }
        public Builder zoneType(@Nullable String zoneType) {
            this.zoneType = zoneType;
            return this;
        }        public GlobalDnsProviderRoute53Config build() {
            return new GlobalDnsProviderRoute53Config(accessKey, credentialsPath, region, roleArn, secretKey, zoneType);
        }
    }
}
