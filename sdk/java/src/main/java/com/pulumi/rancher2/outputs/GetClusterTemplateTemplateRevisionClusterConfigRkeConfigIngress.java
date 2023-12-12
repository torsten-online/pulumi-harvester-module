// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngressToleration;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngressUpdateStrategy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngress {
    private @Nullable Boolean defaultBackend;
    private String dnsPolicy;
    private Map<String,Object> extraArgs;
    private Integer httpPort;
    private Integer httpsPort;
    private String networkMode;
    private Map<String,Object> nodeSelector;
    private Map<String,Object> options;
    private String provider;
    private @Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngressToleration> tolerations;
    private @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngressUpdateStrategy updateStrategy;

    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngress() {}
    public Optional<Boolean> defaultBackend() {
        return Optional.ofNullable(this.defaultBackend);
    }
    public String dnsPolicy() {
        return this.dnsPolicy;
    }
    public Map<String,Object> extraArgs() {
        return this.extraArgs;
    }
    public Integer httpPort() {
        return this.httpPort;
    }
    public Integer httpsPort() {
        return this.httpsPort;
    }
    public String networkMode() {
        return this.networkMode;
    }
    public Map<String,Object> nodeSelector() {
        return this.nodeSelector;
    }
    public Map<String,Object> options() {
        return this.options;
    }
    public String provider() {
        return this.provider;
    }
    public List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngressToleration> tolerations() {
        return this.tolerations == null ? List.of() : this.tolerations;
    }
    public Optional<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngressUpdateStrategy> updateStrategy() {
        return Optional.ofNullable(this.updateStrategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean defaultBackend;
        private String dnsPolicy;
        private Map<String,Object> extraArgs;
        private Integer httpPort;
        private Integer httpsPort;
        private String networkMode;
        private Map<String,Object> nodeSelector;
        private Map<String,Object> options;
        private String provider;
        private @Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngressToleration> tolerations;
        private @Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngressUpdateStrategy updateStrategy;
        public Builder() {}
        public Builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultBackend = defaults.defaultBackend;
    	      this.dnsPolicy = defaults.dnsPolicy;
    	      this.extraArgs = defaults.extraArgs;
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.networkMode = defaults.networkMode;
    	      this.nodeSelector = defaults.nodeSelector;
    	      this.options = defaults.options;
    	      this.provider = defaults.provider;
    	      this.tolerations = defaults.tolerations;
    	      this.updateStrategy = defaults.updateStrategy;
        }

        @CustomType.Setter
        public Builder defaultBackend(@Nullable Boolean defaultBackend) {
            this.defaultBackend = defaultBackend;
            return this;
        }
        @CustomType.Setter
        public Builder dnsPolicy(String dnsPolicy) {
            this.dnsPolicy = Objects.requireNonNull(dnsPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder extraArgs(Map<String,Object> extraArgs) {
            this.extraArgs = Objects.requireNonNull(extraArgs);
            return this;
        }
        @CustomType.Setter
        public Builder httpPort(Integer httpPort) {
            this.httpPort = Objects.requireNonNull(httpPort);
            return this;
        }
        @CustomType.Setter
        public Builder httpsPort(Integer httpsPort) {
            this.httpsPort = Objects.requireNonNull(httpsPort);
            return this;
        }
        @CustomType.Setter
        public Builder networkMode(String networkMode) {
            this.networkMode = Objects.requireNonNull(networkMode);
            return this;
        }
        @CustomType.Setter
        public Builder nodeSelector(Map<String,Object> nodeSelector) {
            this.nodeSelector = Objects.requireNonNull(nodeSelector);
            return this;
        }
        @CustomType.Setter
        public Builder options(Map<String,Object> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        @CustomType.Setter
        public Builder provider(String provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }
        @CustomType.Setter
        public Builder tolerations(@Nullable List<GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngressToleration> tolerations) {
            this.tolerations = tolerations;
            return this;
        }
        public Builder tolerations(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngressToleration... tolerations) {
            return tolerations(List.of(tolerations));
        }
        @CustomType.Setter
        public Builder updateStrategy(@Nullable GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngressUpdateStrategy updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }
        public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngress build() {
            final var _resultValue = new GetClusterTemplateTemplateRevisionClusterConfigRkeConfigIngress();
            _resultValue.defaultBackend = defaultBackend;
            _resultValue.dnsPolicy = dnsPolicy;
            _resultValue.extraArgs = extraArgs;
            _resultValue.httpPort = httpPort;
            _resultValue.httpsPort = httpsPort;
            _resultValue.networkMode = networkMode;
            _resultValue.nodeSelector = nodeSelector;
            _resultValue.options = options;
            _resultValue.provider = provider;
            _resultValue.tolerations = tolerations;
            _resultValue.updateStrategy = updateStrategy;
            return _resultValue;
        }
    }
}
