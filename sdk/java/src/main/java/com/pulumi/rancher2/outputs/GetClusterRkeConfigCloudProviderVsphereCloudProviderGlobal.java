// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterRkeConfigCloudProviderVsphereCloudProviderGlobal {
    private String datacenters;
    private Boolean insecureFlag;
    private String password;
    private String port;
    private Integer soapRoundtripCount;
    private String user;

    private GetClusterRkeConfigCloudProviderVsphereCloudProviderGlobal() {}
    public String datacenters() {
        return this.datacenters;
    }
    public Boolean insecureFlag() {
        return this.insecureFlag;
    }
    public String password() {
        return this.password;
    }
    public String port() {
        return this.port;
    }
    public Integer soapRoundtripCount() {
        return this.soapRoundtripCount;
    }
    public String user() {
        return this.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigCloudProviderVsphereCloudProviderGlobal defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String datacenters;
        private Boolean insecureFlag;
        private String password;
        private String port;
        private Integer soapRoundtripCount;
        private String user;
        public Builder() {}
        public Builder(GetClusterRkeConfigCloudProviderVsphereCloudProviderGlobal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datacenters = defaults.datacenters;
    	      this.insecureFlag = defaults.insecureFlag;
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
        public Builder insecureFlag(Boolean insecureFlag) {
            this.insecureFlag = Objects.requireNonNull(insecureFlag);
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder port(String port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder soapRoundtripCount(Integer soapRoundtripCount) {
            this.soapRoundtripCount = Objects.requireNonNull(soapRoundtripCount);
            return this;
        }
        @CustomType.Setter
        public Builder user(String user) {
            this.user = Objects.requireNonNull(user);
            return this;
        }
        public GetClusterRkeConfigCloudProviderVsphereCloudProviderGlobal build() {
            final var _resultValue = new GetClusterRkeConfigCloudProviderVsphereCloudProviderGlobal();
            _resultValue.datacenters = datacenters;
            _resultValue.insecureFlag = insecureFlag;
            _resultValue.password = password;
            _resultValue.port = port;
            _resultValue.soapRoundtripCount = soapRoundtripCount;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
