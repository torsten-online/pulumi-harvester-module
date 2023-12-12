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
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderVirtualCenter {
    private String datacenters;
    /**
     * @return The cluster template name (string)
     * 
     */
    private String name;
    private String password;
    private @Nullable String port;
    private @Nullable Integer soapRoundtripCount;
    private String user;

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderVirtualCenter() {}
    public String datacenters() {
        return this.datacenters;
    }
    /**
     * @return The cluster template name (string)
     * 
     */
    public String name() {
        return this.name;
    }
    public String password() {
        return this.password;
    }
    public Optional<String> port() {
        return Optional.ofNullable(this.port);
    }
    public Optional<Integer> soapRoundtripCount() {
        return Optional.ofNullable(this.soapRoundtripCount);
    }
    public String user() {
        return this.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderVirtualCenter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String datacenters;
        private String name;
        private String password;
        private @Nullable String port;
        private @Nullable Integer soapRoundtripCount;
        private String user;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderVirtualCenter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datacenters = defaults.datacenters;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.soapRoundtripCount = defaults.soapRoundtripCount;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder datacenters(String datacenters) {
            this.datacenters = Objects.requireNonNull(datacenters);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
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
        public Builder user(String user) {
            this.user = Objects.requireNonNull(user);
            return this;
        }
        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderVirtualCenter build() {
            final var _resultValue = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderVsphereCloudProviderVirtualCenter();
            _resultValue.datacenters = datacenters;
            _resultValue.name = name;
            _resultValue.password = password;
            _resultValue.port = port;
            _resultValue.soapRoundtripCount = soapRoundtripCount;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
