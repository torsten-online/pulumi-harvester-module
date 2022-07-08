// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.PodSecurityPolicyTemplateFsGroupRange;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PodSecurityPolicyTemplateFsGroup {
    /**
     * @return (list)
     * 
     */
    private final @Nullable List<PodSecurityPolicyTemplateFsGroupRange> ranges;
    /**
     * @return (string)
     * 
     */
    private final @Nullable String rule;

    @CustomType.Constructor
    private PodSecurityPolicyTemplateFsGroup(
        @CustomType.Parameter("ranges") @Nullable List<PodSecurityPolicyTemplateFsGroupRange> ranges,
        @CustomType.Parameter("rule") @Nullable String rule) {
        this.ranges = ranges;
        this.rule = rule;
    }

    /**
     * @return (list)
     * 
     */
    public List<PodSecurityPolicyTemplateFsGroupRange> ranges() {
        return this.ranges == null ? List.of() : this.ranges;
    }
    /**
     * @return (string)
     * 
     */
    public Optional<String> rule() {
        return Optional.ofNullable(this.rule);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodSecurityPolicyTemplateFsGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<PodSecurityPolicyTemplateFsGroupRange> ranges;
        private @Nullable String rule;

        public Builder() {
    	      // Empty
        }

        public Builder(PodSecurityPolicyTemplateFsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ranges = defaults.ranges;
    	      this.rule = defaults.rule;
        }

        public Builder ranges(@Nullable List<PodSecurityPolicyTemplateFsGroupRange> ranges) {
            this.ranges = ranges;
            return this;
        }
        public Builder ranges(PodSecurityPolicyTemplateFsGroupRange... ranges) {
            return ranges(List.of(ranges));
        }
        public Builder rule(@Nullable String rule) {
            this.rule = rule;
            return this;
        }        public PodSecurityPolicyTemplateFsGroup build() {
            return new PodSecurityPolicyTemplateFsGroup(ranges, rule);
        }
    }
}
