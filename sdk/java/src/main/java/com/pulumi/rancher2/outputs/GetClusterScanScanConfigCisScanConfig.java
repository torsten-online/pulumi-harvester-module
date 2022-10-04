// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterScanScanConfigCisScanConfig {
    /**
     * @return Debug master. Default: `false` (bool)
     * 
     */
    private @Nullable Boolean debugMaster;
    /**
     * @return Debug worker. Default: `false` (bool)
     * 
     */
    private @Nullable Boolean debugWorker;
    /**
     * @return Override benchmark version (string)
     * 
     */
    private @Nullable String overrideBenchmarkVersion;
    /**
     * @return Override skip (string)
     * 
     */
    private @Nullable List<String> overrideSkips;
    /**
     * @return Cis scan profile. Allowed values: `&#34;permissive&#34; (default) || &#34;hardened&#34;` (string)
     * 
     */
    private @Nullable String profile;

    private GetClusterScanScanConfigCisScanConfig() {}
    /**
     * @return Debug master. Default: `false` (bool)
     * 
     */
    public Optional<Boolean> debugMaster() {
        return Optional.ofNullable(this.debugMaster);
    }
    /**
     * @return Debug worker. Default: `false` (bool)
     * 
     */
    public Optional<Boolean> debugWorker() {
        return Optional.ofNullable(this.debugWorker);
    }
    /**
     * @return Override benchmark version (string)
     * 
     */
    public Optional<String> overrideBenchmarkVersion() {
        return Optional.ofNullable(this.overrideBenchmarkVersion);
    }
    /**
     * @return Override skip (string)
     * 
     */
    public List<String> overrideSkips() {
        return this.overrideSkips == null ? List.of() : this.overrideSkips;
    }
    /**
     * @return Cis scan profile. Allowed values: `&#34;permissive&#34; (default) || &#34;hardened&#34;` (string)
     * 
     */
    public Optional<String> profile() {
        return Optional.ofNullable(this.profile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterScanScanConfigCisScanConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean debugMaster;
        private @Nullable Boolean debugWorker;
        private @Nullable String overrideBenchmarkVersion;
        private @Nullable List<String> overrideSkips;
        private @Nullable String profile;
        public Builder() {}
        public Builder(GetClusterScanScanConfigCisScanConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.debugMaster = defaults.debugMaster;
    	      this.debugWorker = defaults.debugWorker;
    	      this.overrideBenchmarkVersion = defaults.overrideBenchmarkVersion;
    	      this.overrideSkips = defaults.overrideSkips;
    	      this.profile = defaults.profile;
        }

        @CustomType.Setter
        public Builder debugMaster(@Nullable Boolean debugMaster) {
            this.debugMaster = debugMaster;
            return this;
        }
        @CustomType.Setter
        public Builder debugWorker(@Nullable Boolean debugWorker) {
            this.debugWorker = debugWorker;
            return this;
        }
        @CustomType.Setter
        public Builder overrideBenchmarkVersion(@Nullable String overrideBenchmarkVersion) {
            this.overrideBenchmarkVersion = overrideBenchmarkVersion;
            return this;
        }
        @CustomType.Setter
        public Builder overrideSkips(@Nullable List<String> overrideSkips) {
            this.overrideSkips = overrideSkips;
            return this;
        }
        public Builder overrideSkips(String... overrideSkips) {
            return overrideSkips(List.of(overrideSkips));
        }
        @CustomType.Setter
        public Builder profile(@Nullable String profile) {
            this.profile = profile;
            return this;
        }
        public GetClusterScanScanConfigCisScanConfig build() {
            final var o = new GetClusterScanScanConfigCisScanConfig();
            o.debugMaster = debugMaster;
            o.debugWorker = debugWorker;
            o.overrideBenchmarkVersion = overrideBenchmarkVersion;
            o.overrideSkips = overrideSkips;
            o.profile = profile;
            return o;
        }
    }
}
