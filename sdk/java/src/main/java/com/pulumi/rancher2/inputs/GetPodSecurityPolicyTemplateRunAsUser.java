// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateRunAsUserRange;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPodSecurityPolicyTemplateRunAsUser extends com.pulumi.resources.InvokeArgs {

    public static final GetPodSecurityPolicyTemplateRunAsUser Empty = new GetPodSecurityPolicyTemplateRunAsUser();

    @Import(name="ranges")
    private @Nullable List<GetPodSecurityPolicyTemplateRunAsUserRange> ranges;

    public Optional<List<GetPodSecurityPolicyTemplateRunAsUserRange>> ranges() {
        return Optional.ofNullable(this.ranges);
    }

    @Import(name="rule", required=true)
    private String rule;

    public String rule() {
        return this.rule;
    }

    private GetPodSecurityPolicyTemplateRunAsUser() {}

    private GetPodSecurityPolicyTemplateRunAsUser(GetPodSecurityPolicyTemplateRunAsUser $) {
        this.ranges = $.ranges;
        this.rule = $.rule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPodSecurityPolicyTemplateRunAsUser defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPodSecurityPolicyTemplateRunAsUser $;

        public Builder() {
            $ = new GetPodSecurityPolicyTemplateRunAsUser();
        }

        public Builder(GetPodSecurityPolicyTemplateRunAsUser defaults) {
            $ = new GetPodSecurityPolicyTemplateRunAsUser(Objects.requireNonNull(defaults));
        }

        public Builder ranges(@Nullable List<GetPodSecurityPolicyTemplateRunAsUserRange> ranges) {
            $.ranges = ranges;
            return this;
        }

        public Builder ranges(GetPodSecurityPolicyTemplateRunAsUserRange... ranges) {
            return ranges(List.of(ranges));
        }

        public Builder rule(String rule) {
            $.rule = rule;
            return this;
        }

        public GetPodSecurityPolicyTemplateRunAsUser build() {
            if ($.rule == null) {
                throw new MissingRequiredPropertyException("GetPodSecurityPolicyTemplateRunAsUser", "rule");
            }
            return $;
        }
    }

}
