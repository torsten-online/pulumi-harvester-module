// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs Empty = new GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs();

    @Import(name="max", required=true)
    private Output<Integer> max;

    public Output<Integer> max() {
        return this.max;
    }

    @Import(name="min", required=true)
    private Output<Integer> min;

    public Output<Integer> min() {
        return this.min;
    }

    private GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs() {}

    private GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs(GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs $) {
        this.max = $.max;
        this.min = $.min;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs $;

        public Builder() {
            $ = new GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs();
        }

        public Builder(GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs defaults) {
            $ = new GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder max(Output<Integer> max) {
            $.max = max;
            return this;
        }

        public Builder max(Integer max) {
            return max(Output.of(max));
        }

        public Builder min(Output<Integer> min) {
            $.min = min;
            return this;
        }

        public Builder min(Integer min) {
            return min(Output.of(min));
        }

        public GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs build() {
            if ($.max == null) {
                throw new MissingRequiredPropertyException("GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs", "max");
            }
            if ($.min == null) {
                throw new MissingRequiredPropertyException("GetPodSecurityPolicyTemplateSupplementalGroupRangeArgs", "min");
            }
            return $;
        }
    }

}
