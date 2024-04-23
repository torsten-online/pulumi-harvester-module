// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.PodSecurityPolicyTemplateFsGroupRangeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PodSecurityPolicyTemplateFsGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodSecurityPolicyTemplateFsGroupArgs Empty = new PodSecurityPolicyTemplateFsGroupArgs();

    /**
     * ranges are the allowed ranges of fs groups.  If you would like to force a single fs group then supply a single range with the same start and end. Required for MustRunAs.
     * 
     */
    @Import(name="ranges")
    private @Nullable Output<List<PodSecurityPolicyTemplateFsGroupRangeArgs>> ranges;

    /**
     * @return ranges are the allowed ranges of fs groups.  If you would like to force a single fs group then supply a single range with the same start and end. Required for MustRunAs.
     * 
     */
    public Optional<Output<List<PodSecurityPolicyTemplateFsGroupRangeArgs>>> ranges() {
        return Optional.ofNullable(this.ranges);
    }

    /**
     * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
     * 
     */
    @Import(name="rule")
    private @Nullable Output<String> rule;

    /**
     * @return rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
     * 
     */
    public Optional<Output<String>> rule() {
        return Optional.ofNullable(this.rule);
    }

    private PodSecurityPolicyTemplateFsGroupArgs() {}

    private PodSecurityPolicyTemplateFsGroupArgs(PodSecurityPolicyTemplateFsGroupArgs $) {
        this.ranges = $.ranges;
        this.rule = $.rule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PodSecurityPolicyTemplateFsGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PodSecurityPolicyTemplateFsGroupArgs $;

        public Builder() {
            $ = new PodSecurityPolicyTemplateFsGroupArgs();
        }

        public Builder(PodSecurityPolicyTemplateFsGroupArgs defaults) {
            $ = new PodSecurityPolicyTemplateFsGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ranges ranges are the allowed ranges of fs groups.  If you would like to force a single fs group then supply a single range with the same start and end. Required for MustRunAs.
         * 
         * @return builder
         * 
         */
        public Builder ranges(@Nullable Output<List<PodSecurityPolicyTemplateFsGroupRangeArgs>> ranges) {
            $.ranges = ranges;
            return this;
        }

        /**
         * @param ranges ranges are the allowed ranges of fs groups.  If you would like to force a single fs group then supply a single range with the same start and end. Required for MustRunAs.
         * 
         * @return builder
         * 
         */
        public Builder ranges(List<PodSecurityPolicyTemplateFsGroupRangeArgs> ranges) {
            return ranges(Output.of(ranges));
        }

        /**
         * @param ranges ranges are the allowed ranges of fs groups.  If you would like to force a single fs group then supply a single range with the same start and end. Required for MustRunAs.
         * 
         * @return builder
         * 
         */
        public Builder ranges(PodSecurityPolicyTemplateFsGroupRangeArgs... ranges) {
            return ranges(List.of(ranges));
        }

        /**
         * @param rule rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
         * 
         * @return builder
         * 
         */
        public Builder rule(@Nullable Output<String> rule) {
            $.rule = rule;
            return this;
        }

        /**
         * @param rule rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
         * 
         * @return builder
         * 
         */
        public Builder rule(String rule) {
            return rule(Output.of(rule));
        }

        public PodSecurityPolicyTemplateFsGroupArgs build() {
            return $;
        }
    }

}
