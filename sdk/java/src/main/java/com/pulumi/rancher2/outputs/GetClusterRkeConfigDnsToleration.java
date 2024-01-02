// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterRkeConfigDnsToleration {
    private @Nullable String effect;
    private String key;
    private @Nullable String operator;
    private Integer seconds;
    private @Nullable String value;

    private GetClusterRkeConfigDnsToleration() {}
    public Optional<String> effect() {
        return Optional.ofNullable(this.effect);
    }
    public String key() {
        return this.key;
    }
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
    public Integer seconds() {
        return this.seconds;
    }
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigDnsToleration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String effect;
        private String key;
        private @Nullable String operator;
        private Integer seconds;
        private @Nullable String value;
        public Builder() {}
        public Builder(GetClusterRkeConfigDnsToleration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.operator = defaults.operator;
    	      this.seconds = defaults.seconds;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder effect(@Nullable String effect) {

            this.effect = effect;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigDnsToleration", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder operator(@Nullable String operator) {

            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder seconds(Integer seconds) {
            if (seconds == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigDnsToleration", "seconds");
            }
            this.seconds = seconds;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public GetClusterRkeConfigDnsToleration build() {
            final var _resultValue = new GetClusterRkeConfigDnsToleration();
            _resultValue.effect = effect;
            _resultValue.key = key;
            _resultValue.operator = operator;
            _resultValue.seconds = seconds;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
