// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPodSecurityPolicyTemplateSeLinuxArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPodSecurityPolicyTemplateSeLinuxArgs Empty = new GetPodSecurityPolicyTemplateSeLinuxArgs();

    @Import(name="rule", required=true)
    private Output<String> rule;

    public Output<String> rule() {
        return this.rule;
    }

    @Import(name="seLinuxOption")
    private @Nullable Output<GetPodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs> seLinuxOption;

    public Optional<Output<GetPodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs>> seLinuxOption() {
        return Optional.ofNullable(this.seLinuxOption);
    }

    private GetPodSecurityPolicyTemplateSeLinuxArgs() {}

    private GetPodSecurityPolicyTemplateSeLinuxArgs(GetPodSecurityPolicyTemplateSeLinuxArgs $) {
        this.rule = $.rule;
        this.seLinuxOption = $.seLinuxOption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPodSecurityPolicyTemplateSeLinuxArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPodSecurityPolicyTemplateSeLinuxArgs $;

        public Builder() {
            $ = new GetPodSecurityPolicyTemplateSeLinuxArgs();
        }

        public Builder(GetPodSecurityPolicyTemplateSeLinuxArgs defaults) {
            $ = new GetPodSecurityPolicyTemplateSeLinuxArgs(Objects.requireNonNull(defaults));
        }

        public Builder rule(Output<String> rule) {
            $.rule = rule;
            return this;
        }

        public Builder rule(String rule) {
            return rule(Output.of(rule));
        }

        public Builder seLinuxOption(@Nullable Output<GetPodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs> seLinuxOption) {
            $.seLinuxOption = seLinuxOption;
            return this;
        }

        public Builder seLinuxOption(GetPodSecurityPolicyTemplateSeLinuxSeLinuxOptionArgs seLinuxOption) {
            return seLinuxOption(Output.of(seLinuxOption));
        }

        public GetPodSecurityPolicyTemplateSeLinuxArgs build() {
            if ($.rule == null) {
                throw new MissingRequiredPropertyException("GetPodSecurityPolicyTemplateSeLinuxArgs", "rule");
            }
            return $;
        }
    }

}
