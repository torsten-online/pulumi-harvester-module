// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigDnsToleration {
    /**
     * @return The GKE taint effect (string)
     * 
     */
    private final @Nullable String effect;
    /**
     * @return The GKE taint key (string)
     * 
     */
    private final String key;
    /**
     * @return The toleration operator. `Equal`, and `Exists` are supported. Default: `Equal` (string)
     * 
     */
    private final @Nullable String operator;
    /**
     * @return The toleration seconds (int)
     * 
     */
    private final @Nullable Integer seconds;
    /**
     * @return The GKE taint value (string)
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private ClusterRkeConfigDnsToleration(
        @CustomType.Parameter("effect") @Nullable String effect,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("operator") @Nullable String operator,
        @CustomType.Parameter("seconds") @Nullable Integer seconds,
        @CustomType.Parameter("value") @Nullable String value) {
        this.effect = effect;
        this.key = key;
        this.operator = operator;
        this.seconds = seconds;
        this.value = value;
    }

    /**
     * @return The GKE taint effect (string)
     * 
     */
    public Optional<String> effect() {
        return Optional.ofNullable(this.effect);
    }
    /**
     * @return The GKE taint key (string)
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The toleration operator. `Equal`, and `Exists` are supported. Default: `Equal` (string)
     * 
     */
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * @return The toleration seconds (int)
     * 
     */
    public Optional<Integer> seconds() {
        return Optional.ofNullable(this.seconds);
    }
    /**
     * @return The GKE taint value (string)
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigDnsToleration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String effect;
        private String key;
        private @Nullable String operator;
        private @Nullable Integer seconds;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterRkeConfigDnsToleration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.operator = defaults.operator;
    	      this.seconds = defaults.seconds;
    	      this.value = defaults.value;
        }

        public Builder effect(@Nullable String effect) {
            this.effect = effect;
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        public Builder seconds(@Nullable Integer seconds) {
            this.seconds = seconds;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public ClusterRkeConfigDnsToleration build() {
            return new ClusterRkeConfigDnsToleration(effect, key, operator, seconds, value);
        }
    }
}
