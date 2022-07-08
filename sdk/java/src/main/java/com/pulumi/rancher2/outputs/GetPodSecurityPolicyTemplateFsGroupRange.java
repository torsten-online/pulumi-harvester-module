// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetPodSecurityPolicyTemplateFsGroupRange {
    private final Integer max;
    private final Integer min;

    @CustomType.Constructor
    private GetPodSecurityPolicyTemplateFsGroupRange(
        @CustomType.Parameter("max") Integer max,
        @CustomType.Parameter("min") Integer min) {
        this.max = max;
        this.min = min;
    }

    public Integer max() {
        return this.max;
    }
    public Integer min() {
        return this.min;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPodSecurityPolicyTemplateFsGroupRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer max;
        private Integer min;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPodSecurityPolicyTemplateFsGroupRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder max(Integer max) {
            this.max = Objects.requireNonNull(max);
            return this;
        }
        public Builder min(Integer min) {
            this.min = Objects.requireNonNull(min);
            return this;
        }        public GetPodSecurityPolicyTemplateFsGroupRange build() {
            return new GetPodSecurityPolicyTemplateFsGroupRange(max, min);
        }
    }
}
