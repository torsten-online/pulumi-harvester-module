// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class PodSecurityPolicyTemplateRunAsGroupRange {
    /**
     * @return (int)
     * 
     */
    private Integer max;
    /**
     * @return (int)
     * 
     */
    private Integer min;

    private PodSecurityPolicyTemplateRunAsGroupRange() {}
    /**
     * @return (int)
     * 
     */
    public Integer max() {
        return this.max;
    }
    /**
     * @return (int)
     * 
     */
    public Integer min() {
        return this.min;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodSecurityPolicyTemplateRunAsGroupRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer max;
        private Integer min;
        public Builder() {}
        public Builder(PodSecurityPolicyTemplateRunAsGroupRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        @CustomType.Setter
        public Builder max(Integer max) {
            if (max == null) {
              throw new MissingRequiredPropertyException("PodSecurityPolicyTemplateRunAsGroupRange", "max");
            }
            this.max = max;
            return this;
        }
        @CustomType.Setter
        public Builder min(Integer min) {
            if (min == null) {
              throw new MissingRequiredPropertyException("PodSecurityPolicyTemplateRunAsGroupRange", "min");
            }
            this.min = min;
            return this;
        }
        public PodSecurityPolicyTemplateRunAsGroupRange build() {
            final var _resultValue = new PodSecurityPolicyTemplateRunAsGroupRange();
            _resultValue.max = max;
            _resultValue.min = min;
            return _resultValue;
        }
    }
}
