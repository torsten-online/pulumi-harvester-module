// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodePoolNodeTaint {
    /**
     * @return Taint effect. Supported values : `&#34;NoExecute&#34; | &#34;NoSchedule&#34; | &#34;PreferNoSchedule&#34;` (string)
     * 
     */
    private @Nullable String effect;
    /**
     * @return Taint key (string)
     * 
     */
    private String key;
    /**
     * @return Taint time added (string)
     * 
     */
    private @Nullable String timeAdded;
    /**
     * @return Taint value (string)
     * 
     */
    private String value;

    private NodePoolNodeTaint() {}
    /**
     * @return Taint effect. Supported values : `&#34;NoExecute&#34; | &#34;NoSchedule&#34; | &#34;PreferNoSchedule&#34;` (string)
     * 
     */
    public Optional<String> effect() {
        return Optional.ofNullable(this.effect);
    }
    /**
     * @return Taint key (string)
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Taint time added (string)
     * 
     */
    public Optional<String> timeAdded() {
        return Optional.ofNullable(this.timeAdded);
    }
    /**
     * @return Taint value (string)
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeTaint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String effect;
        private String key;
        private @Nullable String timeAdded;
        private String value;
        public Builder() {}
        public Builder(NodePoolNodeTaint defaults) {
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
        public Builder timeAdded(@Nullable String timeAdded) {
            this.timeAdded = timeAdded;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public NodePoolNodeTaint build() {
            final var o = new NodePoolNodeTaint();
            o.effect = effect;
            o.key = key;
            o.timeAdded = timeAdded;
            o.value = value;
            return o;
        }
    }
}
