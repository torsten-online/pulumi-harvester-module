// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobal {
    private String authUrl;
    private @Nullable String caFile;
    private @Nullable String domainId;
    private @Nullable String domainName;
    private String password;
    private @Nullable String region;
    private @Nullable String tenantId;
    private @Nullable String tenantName;
    private @Nullable String trustId;
    private String username;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobal() {}
    public String authUrl() {
        return this.authUrl;
    }
    public Optional<String> caFile() {
        return Optional.ofNullable(this.caFile);
    }
    public Optional<String> domainId() {
        return Optional.ofNullable(this.domainId);
    }
    public Optional<String> domainName() {
        return Optional.ofNullable(this.domainName);
    }
    public String password() {
        return this.password;
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    public Optional<String> tenantName() {
        return Optional.ofNullable(this.tenantName);
    }
    public Optional<String> trustId() {
        return Optional.ofNullable(this.trustId);
    }
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobal defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authUrl;
        private @Nullable String caFile;
        private @Nullable String domainId;
        private @Nullable String domainName;
        private String password;
        private @Nullable String region;
        private @Nullable String tenantId;
        private @Nullable String tenantName;
        private @Nullable String trustId;
        private String username;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authUrl = defaults.authUrl;
    	      this.caFile = defaults.caFile;
    	      this.domainId = defaults.domainId;
    	      this.domainName = defaults.domainName;
    	      this.password = defaults.password;
    	      this.region = defaults.region;
    	      this.tenantId = defaults.tenantId;
    	      this.tenantName = defaults.tenantName;
    	      this.trustId = defaults.trustId;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder authUrl(String authUrl) {
            if (authUrl == null) {
              throw new MissingRequiredPropertyException("ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobal", "authUrl");
            }
            this.authUrl = authUrl;
            return this;
        }
        @CustomType.Setter
        public Builder caFile(@Nullable String caFile) {

            this.caFile = caFile;
            return this;
        }
        @CustomType.Setter
        public Builder domainId(@Nullable String domainId) {

            this.domainId = domainId;
            return this;
        }
        @CustomType.Setter
        public Builder domainName(@Nullable String domainName) {

            this.domainName = domainName;
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            if (password == null) {
              throw new MissingRequiredPropertyException("ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobal", "password");
            }
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(@Nullable String tenantId) {

            this.tenantId = tenantId;
            return this;
        }
        @CustomType.Setter
        public Builder tenantName(@Nullable String tenantName) {

            this.tenantName = tenantName;
            return this;
        }
        @CustomType.Setter
        public Builder trustId(@Nullable String trustId) {

            this.trustId = trustId;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobal", "username");
            }
            this.username = username;
            return this;
        }
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobal build() {
            final var _resultValue = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobal();
            _resultValue.authUrl = authUrl;
            _resultValue.caFile = caFile;
            _resultValue.domainId = domainId;
            _resultValue.domainName = domainName;
            _resultValue.password = password;
            _resultValue.region = region;
            _resultValue.tenantId = tenantId;
            _resultValue.tenantName = tenantName;
            _resultValue.trustId = trustId;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
