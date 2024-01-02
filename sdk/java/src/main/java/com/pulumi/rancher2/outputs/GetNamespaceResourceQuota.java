// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.outputs.GetNamespaceResourceQuotaLimit;
import java.util.Objects;

@CustomType
public final class GetNamespaceResourceQuota {
    private GetNamespaceResourceQuotaLimit limit;

    private GetNamespaceResourceQuota() {}
    public GetNamespaceResourceQuotaLimit limit() {
        return this.limit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceResourceQuota defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetNamespaceResourceQuotaLimit limit;
        public Builder() {}
        public Builder(GetNamespaceResourceQuota defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limit = defaults.limit;
        }

        @CustomType.Setter
        public Builder limit(GetNamespaceResourceQuotaLimit limit) {
            if (limit == null) {
              throw new MissingRequiredPropertyException("GetNamespaceResourceQuota", "limit");
            }
            this.limit = limit;
            return this;
        }
        public GetNamespaceResourceQuota build() {
            final var _resultValue = new GetNamespaceResourceQuota();
            _resultValue.limit = limit;
            return _resultValue;
        }
    }
}
