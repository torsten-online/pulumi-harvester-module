// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClusterRkeConfigAuthentication {
    private final List<String> sans;
    private final String strategy;

    @CustomType.Constructor
    private GetClusterRkeConfigAuthentication(
        @CustomType.Parameter("sans") List<String> sans,
        @CustomType.Parameter("strategy") String strategy) {
        this.sans = sans;
        this.strategy = strategy;
    }

    public List<String> sans() {
        return this.sans;
    }
    public String strategy() {
        return this.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigAuthentication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> sans;
        private String strategy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterRkeConfigAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sans = defaults.sans;
    	      this.strategy = defaults.strategy;
        }

        public Builder sans(List<String> sans) {
            this.sans = Objects.requireNonNull(sans);
            return this;
        }
        public Builder sans(String... sans) {
            return sans(List.of(sans));
        }
        public Builder strategy(String strategy) {
            this.strategy = Objects.requireNonNull(strategy);
            return this;
        }        public GetClusterRkeConfigAuthentication build() {
            return new GetClusterRkeConfigAuthentication(sans, strategy);
        }
    }
}
