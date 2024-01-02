// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterV2AgentEnvVar {
    /**
     * @return The name of the Cluster v2 (string)
     * 
     */
    private String name;
    private String value;

    private GetClusterV2AgentEnvVar() {}
    /**
     * @return The name of the Cluster v2 (string)
     * 
     */
    public String name() {
        return this.name;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterV2AgentEnvVar defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        public Builder() {}
        public Builder(GetClusterV2AgentEnvVar defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetClusterV2AgentEnvVar", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetClusterV2AgentEnvVar", "value");
            }
            this.value = value;
            return this;
        }
        public GetClusterV2AgentEnvVar build() {
            final var _resultValue = new GetClusterV2AgentEnvVar();
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
