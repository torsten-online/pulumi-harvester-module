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
public final class GetClusterRkeConfigDnsNodelocal {
    private final @Nullable String ipAddress;
    private final @Nullable Map<String,Object> nodeSelector;

    @CustomType.Constructor
    private GetClusterRkeConfigDnsNodelocal(
        @CustomType.Parameter("ipAddress") @Nullable String ipAddress,
        @CustomType.Parameter("nodeSelector") @Nullable Map<String,Object> nodeSelector) {
        this.ipAddress = ipAddress;
        this.nodeSelector = nodeSelector;
    }

    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    public Map<String,Object> nodeSelector() {
        return this.nodeSelector == null ? Map.of() : this.nodeSelector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigDnsNodelocal defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipAddress;
        private @Nullable Map<String,Object> nodeSelector;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterRkeConfigDnsNodelocal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.nodeSelector = defaults.nodeSelector;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder nodeSelector(@Nullable Map<String,Object> nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }        public GetClusterRkeConfigDnsNodelocal build() {
            return new GetClusterRkeConfigDnsNodelocal(ipAddress, nodeSelector);
        }
    }
}
