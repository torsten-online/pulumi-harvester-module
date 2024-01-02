// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetPodSecurityPolicyTemplateHostPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPodSecurityPolicyTemplateHostPortArgs Empty = new GetPodSecurityPolicyTemplateHostPortArgs();

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

    private GetPodSecurityPolicyTemplateHostPortArgs() {}

    private GetPodSecurityPolicyTemplateHostPortArgs(GetPodSecurityPolicyTemplateHostPortArgs $) {
        this.max = $.max;
        this.min = $.min;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPodSecurityPolicyTemplateHostPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPodSecurityPolicyTemplateHostPortArgs $;

        public Builder() {
            $ = new GetPodSecurityPolicyTemplateHostPortArgs();
        }

        public Builder(GetPodSecurityPolicyTemplateHostPortArgs defaults) {
            $ = new GetPodSecurityPolicyTemplateHostPortArgs(Objects.requireNonNull(defaults));
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

        public GetPodSecurityPolicyTemplateHostPortArgs build() {
            if ($.max == null) {
                throw new MissingRequiredPropertyException("GetPodSecurityPolicyTemplateHostPortArgs", "max");
            }
            if ($.min == null) {
                throw new MissingRequiredPropertyException("GetPodSecurityPolicyTemplateHostPortArgs", "min");
            }
            return $;
        }
    }

}
