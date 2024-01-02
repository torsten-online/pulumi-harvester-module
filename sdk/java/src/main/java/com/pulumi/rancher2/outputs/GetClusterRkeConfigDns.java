// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigDnsLinearAutoscalerParams;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigDnsNodelocal;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigDnsToleration;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigDnsUpdateStrategy;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterRkeConfigDns {
    private @Nullable GetClusterRkeConfigDnsLinearAutoscalerParams linearAutoscalerParams;
    private Map<String,Object> nodeSelector;
    private @Nullable GetClusterRkeConfigDnsNodelocal nodelocal;
    private Map<String,Object> options;
    private @Nullable String provider;
    private List<String> reverseCidrs;
    private @Nullable List<GetClusterRkeConfigDnsToleration> tolerations;
    private @Nullable GetClusterRkeConfigDnsUpdateStrategy updateStrategy;
    private List<String> upstreamNameservers;

    private GetClusterRkeConfigDns() {}
    public Optional<GetClusterRkeConfigDnsLinearAutoscalerParams> linearAutoscalerParams() {
        return Optional.ofNullable(this.linearAutoscalerParams);
    }
    public Map<String,Object> nodeSelector() {
        return this.nodeSelector;
    }
    public Optional<GetClusterRkeConfigDnsNodelocal> nodelocal() {
        return Optional.ofNullable(this.nodelocal);
    }
    public Map<String,Object> options() {
        return this.options;
    }
    public Optional<String> provider() {
        return Optional.ofNullable(this.provider);
    }
    public List<String> reverseCidrs() {
        return this.reverseCidrs;
    }
    public List<GetClusterRkeConfigDnsToleration> tolerations() {
        return this.tolerations == null ? List.of() : this.tolerations;
    }
    public Optional<GetClusterRkeConfigDnsUpdateStrategy> updateStrategy() {
        return Optional.ofNullable(this.updateStrategy);
    }
    public List<String> upstreamNameservers() {
        return this.upstreamNameservers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigDns defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetClusterRkeConfigDnsLinearAutoscalerParams linearAutoscalerParams;
        private Map<String,Object> nodeSelector;
        private @Nullable GetClusterRkeConfigDnsNodelocal nodelocal;
        private Map<String,Object> options;
        private @Nullable String provider;
        private List<String> reverseCidrs;
        private @Nullable List<GetClusterRkeConfigDnsToleration> tolerations;
        private @Nullable GetClusterRkeConfigDnsUpdateStrategy updateStrategy;
        private List<String> upstreamNameservers;
        public Builder() {}
        public Builder(GetClusterRkeConfigDns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linearAutoscalerParams = defaults.linearAutoscalerParams;
    	      this.nodeSelector = defaults.nodeSelector;
    	      this.nodelocal = defaults.nodelocal;
    	      this.options = defaults.options;
    	      this.provider = defaults.provider;
    	      this.reverseCidrs = defaults.reverseCidrs;
    	      this.tolerations = defaults.tolerations;
    	      this.updateStrategy = defaults.updateStrategy;
    	      this.upstreamNameservers = defaults.upstreamNameservers;
        }

        @CustomType.Setter
        public Builder linearAutoscalerParams(@Nullable GetClusterRkeConfigDnsLinearAutoscalerParams linearAutoscalerParams) {

            this.linearAutoscalerParams = linearAutoscalerParams;
            return this;
        }
        @CustomType.Setter
        public Builder nodeSelector(Map<String,Object> nodeSelector) {
            if (nodeSelector == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigDns", "nodeSelector");
            }
            this.nodeSelector = nodeSelector;
            return this;
        }
        @CustomType.Setter
        public Builder nodelocal(@Nullable GetClusterRkeConfigDnsNodelocal nodelocal) {

            this.nodelocal = nodelocal;
            return this;
        }
        @CustomType.Setter
        public Builder options(Map<String,Object> options) {
            if (options == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigDns", "options");
            }
            this.options = options;
            return this;
        }
        @CustomType.Setter
        public Builder provider(@Nullable String provider) {

            this.provider = provider;
            return this;
        }
        @CustomType.Setter
        public Builder reverseCidrs(List<String> reverseCidrs) {
            if (reverseCidrs == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigDns", "reverseCidrs");
            }
            this.reverseCidrs = reverseCidrs;
            return this;
        }
        public Builder reverseCidrs(String... reverseCidrs) {
            return reverseCidrs(List.of(reverseCidrs));
        }
        @CustomType.Setter
        public Builder tolerations(@Nullable List<GetClusterRkeConfigDnsToleration> tolerations) {

            this.tolerations = tolerations;
            return this;
        }
        public Builder tolerations(GetClusterRkeConfigDnsToleration... tolerations) {
            return tolerations(List.of(tolerations));
        }
        @CustomType.Setter
        public Builder updateStrategy(@Nullable GetClusterRkeConfigDnsUpdateStrategy updateStrategy) {

            this.updateStrategy = updateStrategy;
            return this;
        }
        @CustomType.Setter
        public Builder upstreamNameservers(List<String> upstreamNameservers) {
            if (upstreamNameservers == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigDns", "upstreamNameservers");
            }
            this.upstreamNameservers = upstreamNameservers;
            return this;
        }
        public Builder upstreamNameservers(String... upstreamNameservers) {
            return upstreamNameservers(List.of(upstreamNameservers));
        }
        public GetClusterRkeConfigDns build() {
            final var _resultValue = new GetClusterRkeConfigDns();
            _resultValue.linearAutoscalerParams = linearAutoscalerParams;
            _resultValue.nodeSelector = nodeSelector;
            _resultValue.nodelocal = nodelocal;
            _resultValue.options = options;
            _resultValue.provider = provider;
            _resultValue.reverseCidrs = reverseCidrs;
            _resultValue.tolerations = tolerations;
            _resultValue.updateStrategy = updateStrategy;
            _resultValue.upstreamNameservers = upstreamNameservers;
            return _resultValue;
        }
    }
}
