// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenter {
    private final String datacenters;
    /**
     * @return The name of the Cluster (string)
     * 
     */
    private final String name;
    private final String password;
    private final String port;
    private final Integer soapRoundtripCount;
    private final String user;

    @CustomType.Constructor
    private GetClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenter(
        @CustomType.Parameter("datacenters") String datacenters,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("port") String port,
        @CustomType.Parameter("soapRoundtripCount") Integer soapRoundtripCount,
        @CustomType.Parameter("user") String user) {
        this.datacenters = datacenters;
        this.name = name;
        this.password = password;
        this.port = port;
        this.soapRoundtripCount = soapRoundtripCount;
        this.user = user;
    }

    public String datacenters() {
        return this.datacenters;
    }
    /**
     * @return The name of the Cluster (string)
     * 
     */
    public String name() {
        return this.name;
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

    public static Builder builder(GetClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datacenters;
        private String name;
        private String password;
        private String port;
        private Integer soapRoundtripCount;
        private String user;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datacenters = defaults.datacenters;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.soapRoundtripCount = defaults.soapRoundtripCount;
    	      this.user = defaults.user;
        }

        public Builder datacenters(String datacenters) {
            this.datacenters = Objects.requireNonNull(datacenters);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder port(String port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder soapRoundtripCount(Integer soapRoundtripCount) {
            this.soapRoundtripCount = Objects.requireNonNull(soapRoundtripCount);
            return this;
        }
        public Builder user(String user) {
            this.user = Objects.requireNonNull(user);
            return this;
        }        public GetClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenter build() {
            return new GetClusterRkeConfigCloudProviderVsphereCloudProviderVirtualCenter(datacenters, name, password, port, soapRoundtripCount, user);
        }
    }
}
