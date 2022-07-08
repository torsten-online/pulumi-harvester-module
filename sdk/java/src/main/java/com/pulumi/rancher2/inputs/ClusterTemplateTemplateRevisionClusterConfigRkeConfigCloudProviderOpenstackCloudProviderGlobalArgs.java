// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs Empty = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs();

    @Import(name="authUrl", required=true)
    private Output<String> authUrl;

    public Output<String> authUrl() {
        return this.authUrl;
    }

    @Import(name="caFile")
    private @Nullable Output<String> caFile;

    public Optional<Output<String>> caFile() {
        return Optional.ofNullable(this.caFile);
    }

    @Import(name="domainId")
    private @Nullable Output<String> domainId;

    public Optional<Output<String>> domainId() {
        return Optional.ofNullable(this.domainId);
    }

    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    @Import(name="password", required=true)
    private Output<String> password;

    public Output<String> password() {
        return this.password;
    }

    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    @Import(name="tenantName")
    private @Nullable Output<String> tenantName;

    public Optional<Output<String>> tenantName() {
        return Optional.ofNullable(this.tenantName);
    }

    @Import(name="trustId")
    private @Nullable Output<String> trustId;

    public Optional<Output<String>> trustId() {
        return Optional.ofNullable(this.trustId);
    }

    @Import(name="username", required=true)
    private Output<String> username;

    public Output<String> username() {
        return this.username;
    }

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs() {}

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs $) {
        this.authUrl = $.authUrl;
        this.caFile = $.caFile;
        this.domainId = $.domainId;
        this.domainName = $.domainName;
        this.password = $.password;
        this.region = $.region;
        this.tenantId = $.tenantId;
        this.tenantName = $.tenantName;
        this.trustId = $.trustId;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs $;

        public Builder() {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs();
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs defaults) {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs(Objects.requireNonNull(defaults));
        }

        public Builder authUrl(Output<String> authUrl) {
            $.authUrl = authUrl;
            return this;
        }

        public Builder authUrl(String authUrl) {
            return authUrl(Output.of(authUrl));
        }

        public Builder caFile(@Nullable Output<String> caFile) {
            $.caFile = caFile;
            return this;
        }

        public Builder caFile(String caFile) {
            return caFile(Output.of(caFile));
        }

        public Builder domainId(@Nullable Output<String> domainId) {
            $.domainId = domainId;
            return this;
        }

        public Builder domainId(String domainId) {
            return domainId(Output.of(domainId));
        }

        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public Builder tenantName(@Nullable Output<String> tenantName) {
            $.tenantName = tenantName;
            return this;
        }

        public Builder tenantName(String tenantName) {
            return tenantName(Output.of(tenantName));
        }

        public Builder trustId(@Nullable Output<String> trustId) {
            $.trustId = trustId;
            return this;
        }

        public Builder trustId(String trustId) {
            return trustId(Output.of(trustId));
        }

        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderGlobalArgs build() {
            $.authUrl = Objects.requireNonNull($.authUrl, "expected parameter 'authUrl' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
