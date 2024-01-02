// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterClusterMonitoringInput {
    private @Nullable Map<String,Object> answers;
    private @Nullable String version;

    private GetClusterClusterMonitoringInput() {}
    public Map<String,Object> answers() {
        return this.answers == null ? Map.of() : this.answers;
    }
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterClusterMonitoringInput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,Object> answers;
        private @Nullable String version;
        public Builder() {}
        public Builder(GetClusterClusterMonitoringInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.answers = defaults.answers;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder answers(@Nullable Map<String,Object> answers) {

            this.answers = answers;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {

            this.version = version;
            return this;
        }
        public GetClusterClusterMonitoringInput build() {
            final var _resultValue = new GetClusterClusterMonitoringInput();
            _resultValue.answers = answers;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
