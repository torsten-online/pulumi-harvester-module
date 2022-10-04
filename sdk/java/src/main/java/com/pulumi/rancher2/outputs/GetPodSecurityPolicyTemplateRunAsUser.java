// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetPodSecurityPolicyTemplateRunAsUserRange;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetPodSecurityPolicyTemplateRunAsUser {
    private @Nullable List<GetPodSecurityPolicyTemplateRunAsUserRange> ranges;
    private String rule;

    private GetPodSecurityPolicyTemplateRunAsUser() {}
    public List<GetPodSecurityPolicyTemplateRunAsUserRange> ranges() {
        return this.ranges == null ? List.of() : this.ranges;
    }
    public String rule() {
        return this.rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPodSecurityPolicyTemplateRunAsUser defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetPodSecurityPolicyTemplateRunAsUserRange> ranges;
        private String rule;
        public Builder() {}
        public Builder(GetPodSecurityPolicyTemplateRunAsUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ranges = defaults.ranges;
    	      this.rule = defaults.rule;
        }

        @CustomType.Setter
        public Builder ranges(@Nullable List<GetPodSecurityPolicyTemplateRunAsUserRange> ranges) {
            this.ranges = ranges;
            return this;
        }
        public Builder ranges(GetPodSecurityPolicyTemplateRunAsUserRange... ranges) {
            return ranges(List.of(ranges));
        }
        @CustomType.Setter
        public Builder rule(String rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }
        public GetPodSecurityPolicyTemplateRunAsUser build() {
            final var o = new GetPodSecurityPolicyTemplateRunAsUser();
            o.ranges = ranges;
            o.rule = rule;
            return o;
        }
    }
}
