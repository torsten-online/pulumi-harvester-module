// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigIngressTolerationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigIngressTolerationArgs Empty = new ClusterRkeConfigIngressTolerationArgs();

    @Import(name="effect")
    private @Nullable Output<String> effect;

    public Optional<Output<String>> effect() {
        return Optional.ofNullable(this.effect);
    }

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="operator")
    private @Nullable Output<String> operator;

    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
    }

    @Import(name="seconds")
    private @Nullable Output<Integer> seconds;

    public Optional<Output<Integer>> seconds() {
        return Optional.ofNullable(this.seconds);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ClusterRkeConfigIngressTolerationArgs() {}

    private ClusterRkeConfigIngressTolerationArgs(ClusterRkeConfigIngressTolerationArgs $) {
        this.effect = $.effect;
        this.key = $.key;
        this.operator = $.operator;
        this.seconds = $.seconds;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigIngressTolerationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigIngressTolerationArgs $;

        public Builder() {
            $ = new ClusterRkeConfigIngressTolerationArgs();
        }

        public Builder(ClusterRkeConfigIngressTolerationArgs defaults) {
            $ = new ClusterRkeConfigIngressTolerationArgs(Objects.requireNonNull(defaults));
        }

        public Builder effect(@Nullable Output<String> effect) {
            $.effect = effect;
            return this;
        }

        public Builder effect(String effect) {
            return effect(Output.of(effect));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        public Builder seconds(@Nullable Output<Integer> seconds) {
            $.seconds = seconds;
            return this;
        }

        public Builder seconds(Integer seconds) {
            return seconds(Output.of(seconds));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ClusterRkeConfigIngressTolerationArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("ClusterRkeConfigIngressTolerationArgs", "key");
            }
            return $;
        }
    }

}
