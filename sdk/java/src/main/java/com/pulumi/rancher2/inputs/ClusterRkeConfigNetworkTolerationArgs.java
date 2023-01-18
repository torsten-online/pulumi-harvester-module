// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigNetworkTolerationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigNetworkTolerationArgs Empty = new ClusterRkeConfigNetworkTolerationArgs();

    /**
     * The toleration effect. `NoExecute`, `NoSchedule`, and `PreferNoSchedule` are supported. Default: `NoExecute` (string)
     * 
     */
    @Import(name="effect")
    private @Nullable Output<String> effect;

    /**
     * @return The toleration effect. `NoExecute`, `NoSchedule`, and `PreferNoSchedule` are supported. Default: `NoExecute` (string)
     * 
     */
    public Optional<Output<String>> effect() {
        return Optional.ofNullable(this.effect);
    }

    /**
     * The toleration key (string)
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The toleration key (string)
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The toleration operator. `Equal`, and `Exists` are supported. Default: `Equal` (string)
     * 
     */
    @Import(name="operator")
    private @Nullable Output<String> operator;

    /**
     * @return The toleration operator. `Equal`, and `Exists` are supported. Default: `Equal` (string)
     * 
     */
    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
    }

    /**
     * The toleration seconds (int)
     * 
     */
    @Import(name="seconds")
    private @Nullable Output<Integer> seconds;

    /**
     * @return The toleration seconds (int)
     * 
     */
    public Optional<Output<Integer>> seconds() {
        return Optional.ofNullable(this.seconds);
    }

    /**
     * Rancher agent env var value (string)
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Rancher agent env var value (string)
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ClusterRkeConfigNetworkTolerationArgs() {}

    private ClusterRkeConfigNetworkTolerationArgs(ClusterRkeConfigNetworkTolerationArgs $) {
        this.effect = $.effect;
        this.key = $.key;
        this.operator = $.operator;
        this.seconds = $.seconds;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigNetworkTolerationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigNetworkTolerationArgs $;

        public Builder() {
            $ = new ClusterRkeConfigNetworkTolerationArgs();
        }

        public Builder(ClusterRkeConfigNetworkTolerationArgs defaults) {
            $ = new ClusterRkeConfigNetworkTolerationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param effect The toleration effect. `NoExecute`, `NoSchedule`, and `PreferNoSchedule` are supported. Default: `NoExecute` (string)
         * 
         * @return builder
         * 
         */
        public Builder effect(@Nullable Output<String> effect) {
            $.effect = effect;
            return this;
        }

        /**
         * @param effect The toleration effect. `NoExecute`, `NoSchedule`, and `PreferNoSchedule` are supported. Default: `NoExecute` (string)
         * 
         * @return builder
         * 
         */
        public Builder effect(String effect) {
            return effect(Output.of(effect));
        }

        /**
         * @param key The toleration key (string)
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The toleration key (string)
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param operator The toleration operator. `Equal`, and `Exists` are supported. Default: `Equal` (string)
         * 
         * @return builder
         * 
         */
        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The toleration operator. `Equal`, and `Exists` are supported. Default: `Equal` (string)
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param seconds The toleration seconds (int)
         * 
         * @return builder
         * 
         */
        public Builder seconds(@Nullable Output<Integer> seconds) {
            $.seconds = seconds;
            return this;
        }

        /**
         * @param seconds The toleration seconds (int)
         * 
         * @return builder
         * 
         */
        public Builder seconds(Integer seconds) {
            return seconds(Output.of(seconds));
        }

        /**
         * @param value Rancher agent env var value (string)
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Rancher agent env var value (string)
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ClusterRkeConfigNetworkTolerationArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
