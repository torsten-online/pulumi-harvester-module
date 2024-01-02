// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterClusterTemplateQuestion {
    private String default_;
    private @Nullable Boolean required;
    private @Nullable String type;
    private String variable;

    private GetClusterClusterTemplateQuestion() {}
    public String default_() {
        return this.default_;
    }
    public Optional<Boolean> required() {
        return Optional.ofNullable(this.required);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    public String variable() {
        return this.variable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterClusterTemplateQuestion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String default_;
        private @Nullable Boolean required;
        private @Nullable String type;
        private String variable;
        public Builder() {}
        public Builder(GetClusterClusterTemplateQuestion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.required = defaults.required;
    	      this.type = defaults.type;
    	      this.variable = defaults.variable;
        }

        @CustomType.Setter("default")
        public Builder default_(String default_) {
            if (default_ == null) {
              throw new MissingRequiredPropertyException("GetClusterClusterTemplateQuestion", "default_");
            }
            this.default_ = default_;
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
            if (variable == null) {
              throw new MissingRequiredPropertyException("GetClusterClusterTemplateQuestion", "variable");
            }
            this.variable = variable;
            return this;
        }
        public GetClusterClusterTemplateQuestion build() {
            final var _resultValue = new GetClusterClusterTemplateQuestion();
            _resultValue.default_ = default_;
            _resultValue.required = required;
            _resultValue.type = type;
            _resultValue.variable = variable;
            return _resultValue;
        }
    }
}
