// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterRkeConfigCloudProviderVsphereCloudProviderDisk {
    private String scsiControllerType;

    private GetClusterRkeConfigCloudProviderVsphereCloudProviderDisk() {}
    public String scsiControllerType() {
        return this.scsiControllerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigCloudProviderVsphereCloudProviderDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String scsiControllerType;
        public Builder() {}
        public Builder(GetClusterRkeConfigCloudProviderVsphereCloudProviderDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scsiControllerType = defaults.scsiControllerType;
        }

        @CustomType.Setter
        public Builder scsiControllerType(String scsiControllerType) {
            if (scsiControllerType == null) {
              throw new MissingRequiredPropertyException("GetClusterRkeConfigCloudProviderVsphereCloudProviderDisk", "scsiControllerType");
            }
            this.scsiControllerType = scsiControllerType;
            return this;
        }
        public GetClusterRkeConfigCloudProviderVsphereCloudProviderDisk build() {
            final var _resultValue = new GetClusterRkeConfigCloudProviderVsphereCloudProviderDisk();
            _resultValue.scsiControllerType = scsiControllerType;
            return _resultValue;
        }
    }
}
