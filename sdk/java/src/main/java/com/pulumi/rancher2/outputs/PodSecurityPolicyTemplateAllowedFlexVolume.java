// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PodSecurityPolicyTemplateAllowedFlexVolume {
    private String driver;

    private PodSecurityPolicyTemplateAllowedFlexVolume() {}
    public String driver() {
        return this.driver;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodSecurityPolicyTemplateAllowedFlexVolume defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String driver;
        public Builder() {}
        public Builder(PodSecurityPolicyTemplateAllowedFlexVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driver = defaults.driver;
        }

        @CustomType.Setter
        public Builder driver(String driver) {
            if (driver == null) {
              throw new MissingRequiredPropertyException("PodSecurityPolicyTemplateAllowedFlexVolume", "driver");
            }
            this.driver = driver;
            return this;
        }
        public PodSecurityPolicyTemplateAllowedFlexVolume build() {
            final var _resultValue = new PodSecurityPolicyTemplateAllowedFlexVolume();
            _resultValue.driver = driver;
            return _resultValue;
        }
    }
}
