// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClusterRkeConfigAuthentication {
    private List<String> sans;
    private String strategy;

    private GetClusterRkeConfigAuthentication() {}
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
    @CustomType.Builder
    public static final class Builder {
        private List<String> sans;
        private String strategy;
        public Builder() {}
        public Builder(GetClusterRkeConfigAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sans = defaults.sans;
    	      this.strategy = defaults.strategy;
        }

        @CustomType.Setter
        public Builder sans(List<String> sans) {
            if (sans == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigAuthentication", "sans");
            }
            this.sans = sans;
            return this;
        }
        public Builder sans(String... sans) {
            return sans(List.of(sans));
        }
        @CustomType.Setter
        public Builder strategy(String strategy) {
            if (strategy == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigAuthentication", "strategy");
            }
            this.strategy = strategy;
            return this;
        }
        public GetClusterRkeConfigAuthentication build() {
            final var _resultValue = new GetClusterRkeConfigAuthentication();
            _resultValue.sans = sans;
            _resultValue.strategy = strategy;
            return _resultValue;
        }
    }
}
