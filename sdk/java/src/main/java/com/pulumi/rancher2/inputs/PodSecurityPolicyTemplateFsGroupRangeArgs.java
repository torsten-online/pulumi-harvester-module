// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class PodSecurityPolicyTemplateFsGroupRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodSecurityPolicyTemplateFsGroupRangeArgs Empty = new PodSecurityPolicyTemplateFsGroupRangeArgs();

    /**
     * (int)
     * 
     */
    @Import(name="max", required=true)
    private Output<Integer> max;

    /**
     * @return (int)
     * 
     */
    public Output<Integer> max() {
        return this.max;
    }

    /**
     * (int)
     * 
     */
    @Import(name="min", required=true)
    private Output<Integer> min;

    /**
     * @return (int)
     * 
     */
    public Output<Integer> min() {
        return this.min;
    }

    private PodSecurityPolicyTemplateFsGroupRangeArgs() {}

    private PodSecurityPolicyTemplateFsGroupRangeArgs(PodSecurityPolicyTemplateFsGroupRangeArgs $) {
        this.max = $.max;
        this.min = $.min;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PodSecurityPolicyTemplateFsGroupRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PodSecurityPolicyTemplateFsGroupRangeArgs $;

        public Builder() {
            $ = new PodSecurityPolicyTemplateFsGroupRangeArgs();
        }

        public Builder(PodSecurityPolicyTemplateFsGroupRangeArgs defaults) {
            $ = new PodSecurityPolicyTemplateFsGroupRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param max (int)
         * 
         * @return builder
         * 
         */
        public Builder max(Output<Integer> max) {
            $.max = max;
            return this;
        }

        /**
         * @param max (int)
         * 
         * @return builder
         * 
         */
        public Builder max(Integer max) {
            return max(Output.of(max));
        }

        /**
         * @param min (int)
         * 
         * @return builder
         * 
         */
        public Builder min(Output<Integer> min) {
            $.min = min;
            return this;
        }

        /**
         * @param min (int)
         * 
         * @return builder
         * 
         */
        public Builder min(Integer min) {
            return min(Output.of(min));
        }

        public PodSecurityPolicyTemplateFsGroupRangeArgs build() {
            $.max = Objects.requireNonNull($.max, "expected parameter 'max' to be non-null");
            $.min = Objects.requireNonNull($.min, "expected parameter 'min' to be non-null");
            return $;
        }
    }

}
