// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateFsGroupRangeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPodSecurityPolicyTemplateFsGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPodSecurityPolicyTemplateFsGroupArgs Empty = new GetPodSecurityPolicyTemplateFsGroupArgs();

    @Import(name="ranges", required=true)
    private Output<List<GetPodSecurityPolicyTemplateFsGroupRangeArgs>> ranges;

    public Output<List<GetPodSecurityPolicyTemplateFsGroupRangeArgs>> ranges() {
        return this.ranges;
    }

    @Import(name="rule")
    private @Nullable Output<String> rule;

    public Optional<Output<String>> rule() {
        return Optional.ofNullable(this.rule);
    }

    private GetPodSecurityPolicyTemplateFsGroupArgs() {}

    private GetPodSecurityPolicyTemplateFsGroupArgs(GetPodSecurityPolicyTemplateFsGroupArgs $) {
        this.ranges = $.ranges;
        this.rule = $.rule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPodSecurityPolicyTemplateFsGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPodSecurityPolicyTemplateFsGroupArgs $;

        public Builder() {
            $ = new GetPodSecurityPolicyTemplateFsGroupArgs();
        }

        public Builder(GetPodSecurityPolicyTemplateFsGroupArgs defaults) {
            $ = new GetPodSecurityPolicyTemplateFsGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder ranges(Output<List<GetPodSecurityPolicyTemplateFsGroupRangeArgs>> ranges) {
            $.ranges = ranges;
            return this;
        }

        public Builder ranges(List<GetPodSecurityPolicyTemplateFsGroupRangeArgs> ranges) {
            return ranges(Output.of(ranges));
        }

        public Builder ranges(GetPodSecurityPolicyTemplateFsGroupRangeArgs... ranges) {
            return ranges(List.of(ranges));
        }

        public Builder rule(@Nullable Output<String> rule) {
            $.rule = rule;
            return this;
        }

        public Builder rule(String rule) {
            return rule(Output.of(rule));
        }

        public GetPodSecurityPolicyTemplateFsGroupArgs build() {
            $.ranges = Objects.requireNonNull($.ranges, "expected parameter 'ranges' to be non-null");
            return $;
        }
    }

}
