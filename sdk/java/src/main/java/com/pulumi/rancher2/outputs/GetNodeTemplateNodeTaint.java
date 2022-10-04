// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNodeTemplateNodeTaint {
    private @Nullable String effect;
    private String key;
    private String timeAdded;
    private String value;

    private GetNodeTemplateNodeTaint() {}
    public Optional<String> effect() {
        return Optional.ofNullable(this.effect);
    }
    public String key() {
        return this.key;
    }
    public String timeAdded() {
        return this.timeAdded;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeTemplateNodeTaint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String effect;
        private String key;
        private String timeAdded;
        private String value;
        public Builder() {}
        public Builder(GetNodeTemplateNodeTaint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.timeAdded = defaults.timeAdded;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder effect(@Nullable String effect) {
            this.effect = effect;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder timeAdded(String timeAdded) {
            this.timeAdded = Objects.requireNonNull(timeAdded);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetNodeTemplateNodeTaint build() {
            final var o = new GetNodeTemplateNodeTaint();
            o.effect = effect;
            o.key = key;
            o.timeAdded = timeAdded;
            o.value = value;
            return o;
        }
    }
}
