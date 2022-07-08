// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderBlockStorage {
    private final @Nullable String bsVersion;
    private final @Nullable Boolean ignoreVolumeAz;
    private final @Nullable Boolean trustDevicePath;

    @CustomType.Constructor
    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderBlockStorage(
        @CustomType.Parameter("bsVersion") @Nullable String bsVersion,
        @CustomType.Parameter("ignoreVolumeAz") @Nullable Boolean ignoreVolumeAz,
        @CustomType.Parameter("trustDevicePath") @Nullable Boolean trustDevicePath) {
        this.bsVersion = bsVersion;
        this.ignoreVolumeAz = ignoreVolumeAz;
        this.trustDevicePath = trustDevicePath;
    }

    public Optional<String> bsVersion() {
        return Optional.ofNullable(this.bsVersion);
    }
    public Optional<Boolean> ignoreVolumeAz() {
        return Optional.ofNullable(this.ignoreVolumeAz);
    }
    public Optional<Boolean> trustDevicePath() {
        return Optional.ofNullable(this.trustDevicePath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderBlockStorage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bsVersion;
        private @Nullable Boolean ignoreVolumeAz;
        private @Nullable Boolean trustDevicePath;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderBlockStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bsVersion = defaults.bsVersion;
    	      this.ignoreVolumeAz = defaults.ignoreVolumeAz;
    	      this.trustDevicePath = defaults.trustDevicePath;
        }

        public Builder bsVersion(@Nullable String bsVersion) {
            this.bsVersion = bsVersion;
            return this;
        }
        public Builder ignoreVolumeAz(@Nullable Boolean ignoreVolumeAz) {
            this.ignoreVolumeAz = ignoreVolumeAz;
            return this;
        }
        public Builder trustDevicePath(@Nullable Boolean trustDevicePath) {
            this.trustDevicePath = trustDevicePath;
            return this;
        }        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderBlockStorage build() {
            return new ClusterTemplateTemplateRevisionClusterConfigRkeConfigCloudProviderOpenstackCloudProviderBlockStorage(bsVersion, ignoreVolumeAz, trustDevicePath);
        }
    }
}
