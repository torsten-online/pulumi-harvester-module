// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderGlobal {
    private @Nullable String datacenters;
    private @Nullable Boolean insecureFlag;
    private @Nullable String password;
    private @Nullable String port;
    private @Nullable Integer soapRoundtripCount;
    private @Nullable String user;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderGlobal() {}
    public Optional<String> datacenters() {
        return Optional.ofNullable(this.datacenters);
    }
    public Optional<Boolean> insecureFlag() {
        return Optional.ofNullable(this.insecureFlag);
    }
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    public Optional<String> port() {
        return Optional.ofNullable(this.port);
    }
    public Optional<Integer> soapRoundtripCount() {
        return Optional.ofNullable(this.soapRoundtripCount);
    }
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderGlobal defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String datacenters;
        private @Nullable Boolean insecureFlag;
        private @Nullable String password;
        private @Nullable String port;
        private @Nullable Integer soapRoundtripCount;
        private @Nullable String user;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderGlobal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datacenters = defaults.datacenters;
    	      this.insecureFlag = defaults.insecureFlag;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.soapRoundtripCount = defaults.soapRoundtripCount;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder datacenters(@Nullable String datacenters) {
            this.datacenters = datacenters;
            return this;
        }
        @CustomType.Setter
        public Builder insecureFlag(@Nullable Boolean insecureFlag) {
            this.insecureFlag = insecureFlag;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable String port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder soapRoundtripCount(@Nullable Integer soapRoundtripCount) {
            this.soapRoundtripCount = soapRoundtripCount;
            return this;
        }
        @CustomType.Setter
        public Builder user(@Nullable String user) {
            this.user = user;
            return this;
        }
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderGlobal build() {
            final var o = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderGlobal();
            o.datacenters = datacenters;
            o.insecureFlag = insecureFlag;
            o.password = password;
            o.port = port;
            o.soapRoundtripCount = soapRoundtripCount;
            o.user = user;
            return o;
        }
    }
}
