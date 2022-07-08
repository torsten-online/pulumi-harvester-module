// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateFsGroupRange;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPodSecurityPolicyTemplateFsGroup extends com.pulumi.resources.InvokeArgs {

    public static final GetPodSecurityPolicyTemplateFsGroup Empty = new GetPodSecurityPolicyTemplateFsGroup();

    @Import(name="ranges", required=true)
    private List<GetPodSecurityPolicyTemplateFsGroupRange> ranges;

    public List<GetPodSecurityPolicyTemplateFsGroupRange> ranges() {
        return this.ranges;
    }

    @Import(name="rule")
    private @Nullable String rule;

    public Optional<String> rule() {
        return Optional.ofNullable(this.rule);
    }

    private GetPodSecurityPolicyTemplateFsGroup() {}

    private GetPodSecurityPolicyTemplateFsGroup(GetPodSecurityPolicyTemplateFsGroup $) {
        this.ranges = $.ranges;
        this.rule = $.rule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPodSecurityPolicyTemplateFsGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPodSecurityPolicyTemplateFsGroup $;

        public Builder() {
            $ = new GetPodSecurityPolicyTemplateFsGroup();
        }

        public Builder(GetPodSecurityPolicyTemplateFsGroup defaults) {
            $ = new GetPodSecurityPolicyTemplateFsGroup(Objects.requireNonNull(defaults));
        }

        public Builder ranges(List<GetPodSecurityPolicyTemplateFsGroupRange> ranges) {
            $.ranges = ranges;
            return this;
        }

        public Builder ranges(GetPodSecurityPolicyTemplateFsGroupRange... ranges) {
            return ranges(List.of(ranges));
        }

        public Builder rule(@Nullable String rule) {
            $.rule = rule;
            return this;
        }

        public GetPodSecurityPolicyTemplateFsGroup build() {
            $.ranges = Objects.requireNonNull($.ranges, "expected parameter 'ranges' to be non-null");
            return $;
        }
    }

}
