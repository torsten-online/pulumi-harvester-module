// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.inputs.GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPodSecurityPolicyTemplateSeLinux extends com.pulumi.resources.InvokeArgs {

    public static final GetPodSecurityPolicyTemplateSeLinux Empty = new GetPodSecurityPolicyTemplateSeLinux();

    @Import(name="rule", required=true)
    private String rule;

    public String rule() {
        return this.rule;
    }

    @Import(name="seLinuxOption")
    private @Nullable GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption seLinuxOption;

    public Optional<GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption> seLinuxOption() {
        return Optional.ofNullable(this.seLinuxOption);
    }

    private GetPodSecurityPolicyTemplateSeLinux() {}

    private GetPodSecurityPolicyTemplateSeLinux(GetPodSecurityPolicyTemplateSeLinux $) {
        this.rule = $.rule;
        this.seLinuxOption = $.seLinuxOption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPodSecurityPolicyTemplateSeLinux defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPodSecurityPolicyTemplateSeLinux $;

        public Builder() {
            $ = new GetPodSecurityPolicyTemplateSeLinux();
        }

        public Builder(GetPodSecurityPolicyTemplateSeLinux defaults) {
            $ = new GetPodSecurityPolicyTemplateSeLinux(Objects.requireNonNull(defaults));
        }

        public Builder rule(String rule) {
            $.rule = rule;
            return this;
        }

        public Builder seLinuxOption(@Nullable GetPodSecurityPolicyTemplateSeLinuxSeLinuxOption seLinuxOption) {
            $.seLinuxOption = seLinuxOption;
            return this;
        }

        public GetPodSecurityPolicyTemplateSeLinux build() {
            if ($.rule == null) {
                throw new MissingRequiredPropertyException("GetPodSecurityPolicyTemplateSeLinux", "rule");
            }
            return $;
        }
    }

}
