// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterScanScanConfigCisScanConfig;
import java.util.Objects;

@CustomType
public final class GetClusterScanScanConfig {
    /**
     * @return Cluster Cis Scan config (List maxitems:1)
     * 
     */
    private GetClusterScanScanConfigCisScanConfig cisScanConfig;

    private GetClusterScanScanConfig() {}
    /**
     * @return Cluster Cis Scan config (List maxitems:1)
     * 
     */
    public GetClusterScanScanConfigCisScanConfig cisScanConfig() {
        return this.cisScanConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterScanScanConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetClusterScanScanConfigCisScanConfig cisScanConfig;
        public Builder() {}
        public Builder(GetClusterScanScanConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cisScanConfig = defaults.cisScanConfig;
        }

        @CustomType.Setter
        public Builder cisScanConfig(GetClusterScanScanConfigCisScanConfig cisScanConfig) {
            this.cisScanConfig = Objects.requireNonNull(cisScanConfig);
            return this;
        }
        public GetClusterScanScanConfig build() {
            final var o = new GetClusterScanScanConfig();
            o.cisScanConfig = cisScanConfig;
            return o;
        }
    }
}
