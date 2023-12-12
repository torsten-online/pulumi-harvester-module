// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesScheduler {
    private Map<String,Object> extraArgs;
    private @Nullable List<String> extraBinds;
    private @Nullable List<String> extraEnvs;
    private String image;

    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesScheduler() {}
    public Map<String,Object> extraArgs() {
        return this.extraArgs;
    }
    public List<String> extraBinds() {
        return this.extraBinds == null ? List.of() : this.extraBinds;
    }
    public List<String> extraEnvs() {
        return this.extraEnvs == null ? List.of() : this.extraEnvs;
    }
    public String image() {
        return this.image;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesScheduler defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,Object> extraArgs;
        private @Nullable List<String> extraBinds;
        private @Nullable List<String> extraEnvs;
        private String image;
        public Builder() {}
        public Builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesScheduler defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extraArgs = defaults.extraArgs;
    	      this.extraBinds = defaults.extraBinds;
    	      this.extraEnvs = defaults.extraEnvs;
    	      this.image = defaults.image;
        }

        @CustomType.Setter
        public Builder extraArgs(Map<String,Object> extraArgs) {
            this.extraArgs = Objects.requireNonNull(extraArgs);
            return this;
        }
        @CustomType.Setter
        public Builder extraBinds(@Nullable List<String> extraBinds) {
            this.extraBinds = extraBinds;
            return this;
        }
        public Builder extraBinds(String... extraBinds) {
            return extraBinds(List.of(extraBinds));
        }
        @CustomType.Setter
        public Builder extraEnvs(@Nullable List<String> extraEnvs) {
            this.extraEnvs = extraEnvs;
            return this;
        }
        public Builder extraEnvs(String... extraEnvs) {
            return extraEnvs(List.of(extraEnvs));
        }
        @CustomType.Setter
        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesScheduler build() {
            final var _resultValue = new GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesScheduler();
            _resultValue.extraArgs = extraArgs;
            _resultValue.extraBinds = extraBinds;
            _resultValue.extraEnvs = extraEnvs;
            _resultValue.image = image;
            return _resultValue;
        }
    }
}
