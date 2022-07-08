// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.PodSecurityPolicyTemplateRunAsUserRange;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class PodSecurityPolicyTemplateRunAsUser {
    /**
     * @return (list)
     * 
     */
    private final @Nullable List<PodSecurityPolicyTemplateRunAsUserRange> ranges;
    /**
     * @return (string)
     * 
     */
    private final String rule;

    @CustomType.Constructor
    private PodSecurityPolicyTemplateRunAsUser(
        @CustomType.Parameter("ranges") @Nullable List<PodSecurityPolicyTemplateRunAsUserRange> ranges,
        @CustomType.Parameter("rule") String rule) {
        this.ranges = ranges;
        this.rule = rule;
    }

    /**
     * @return (list)
     * 
     */
    public List<PodSecurityPolicyTemplateRunAsUserRange> ranges() {
        return this.ranges == null ? List.of() : this.ranges;
    }
    /**
     * @return (string)
     * 
     */
    public String rule() {
        return this.rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodSecurityPolicyTemplateRunAsUser defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<PodSecurityPolicyTemplateRunAsUserRange> ranges;
        private String rule;

        public Builder() {
    	      // Empty
        }

        public Builder(PodSecurityPolicyTemplateRunAsUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ranges = defaults.ranges;
    	      this.rule = defaults.rule;
        }

        public Builder ranges(@Nullable List<PodSecurityPolicyTemplateRunAsUserRange> ranges) {
            this.ranges = ranges;
            return this;
        }
        public Builder ranges(PodSecurityPolicyTemplateRunAsUserRange... ranges) {
            return ranges(List.of(ranges));
        }
        public Builder rule(String rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }        public PodSecurityPolicyTemplateRunAsUser build() {
            return new PodSecurityPolicyTemplateRunAsUser(ranges, rule);
        }
    }
}
