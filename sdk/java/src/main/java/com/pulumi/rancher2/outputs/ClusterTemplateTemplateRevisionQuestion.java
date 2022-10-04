// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionQuestion {
    /**
     * @return Default variable value (string)
     * 
     */
    private String default_;
    /**
     * @return Required variable. Default `false` (bool)
     * 
     */
    private @Nullable Boolean required;
    /**
     * @return Variable type. `boolean`, `int` and `string` are allowed. Default `string` (string)
     * 
     */
    private @Nullable String type;
    /**
     * @return Variable name (string)
     * 
     */
    private String variable;

    private ClusterTemplateTemplateRevisionQuestion() {}
    /**
     * @return Default variable value (string)
     * 
     */
    public String default_() {
        return this.default_;
    }
    /**
     * @return Required variable. Default `false` (bool)
     * 
     */
    public Optional<Boolean> required() {
        return Optional.ofNullable(this.required);
    }
    /**
     * @return Variable type. `boolean`, `int` and `string` are allowed. Default `string` (string)
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Variable name (string)
     * 
     */
    public String variable() {
        return this.variable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionQuestion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String default_;
        private @Nullable Boolean required;
        private @Nullable String type;
        private String variable;
        public Builder() {}
        public Builder(ClusterTemplateTemplateRevisionQuestion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.required = defaults.required;
    	      this.type = defaults.type;
    	      this.variable = defaults.variable;
        }

        @CustomType.Setter("default")
        public Builder default_(String default_) {
            this.default_ = Objects.requireNonNull(default_);
            return this;
        }
        @CustomType.Setter
        public Builder required(@Nullable Boolean required) {
            this.required = required;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder variable(String variable) {
            this.variable = Objects.requireNonNull(variable);
            return this;
        }
        public ClusterTemplateTemplateRevisionQuestion build() {
            final var o = new ClusterTemplateTemplateRevisionQuestion();
            o.default_ = default_;
            o.required = required;
            o.type = type;
            o.variable = variable;
            return o;
        }
    }
}
