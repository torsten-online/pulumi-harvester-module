// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterV2RkeConfigEtcdS3Config;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterV2RkeConfigEtcd {
    private @Nullable Boolean disableSnapshots;
    private @Nullable GetClusterV2RkeConfigEtcdS3Config s3Config;
    private @Nullable Integer snapshotRetention;
    private @Nullable String snapshotScheduleCron;

    private GetClusterV2RkeConfigEtcd() {}
    public Optional<Boolean> disableSnapshots() {
        return Optional.ofNullable(this.disableSnapshots);
    }
    public Optional<GetClusterV2RkeConfigEtcdS3Config> s3Config() {
        return Optional.ofNullable(this.s3Config);
    }
    public Optional<Integer> snapshotRetention() {
        return Optional.ofNullable(this.snapshotRetention);
    }
    public Optional<String> snapshotScheduleCron() {
        return Optional.ofNullable(this.snapshotScheduleCron);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterV2RkeConfigEtcd defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disableSnapshots;
        private @Nullable GetClusterV2RkeConfigEtcdS3Config s3Config;
        private @Nullable Integer snapshotRetention;
        private @Nullable String snapshotScheduleCron;
        public Builder() {}
        public Builder(GetClusterV2RkeConfigEtcd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableSnapshots = defaults.disableSnapshots;
    	      this.s3Config = defaults.s3Config;
    	      this.snapshotRetention = defaults.snapshotRetention;
    	      this.snapshotScheduleCron = defaults.snapshotScheduleCron;
        }

        @CustomType.Setter
        public Builder disableSnapshots(@Nullable Boolean disableSnapshots) {
            this.disableSnapshots = disableSnapshots;
            return this;
        }
        @CustomType.Setter
        public Builder s3Config(@Nullable GetClusterV2RkeConfigEtcdS3Config s3Config) {
            this.s3Config = s3Config;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotRetention(@Nullable Integer snapshotRetention) {
            this.snapshotRetention = snapshotRetention;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotScheduleCron(@Nullable String snapshotScheduleCron) {
            this.snapshotScheduleCron = snapshotScheduleCron;
            return this;
        }
        public GetClusterV2RkeConfigEtcd build() {
            final var _resultValue = new GetClusterV2RkeConfigEtcd();
            _resultValue.disableSnapshots = disableSnapshots;
            _resultValue.s3Config = s3Config;
            _resultValue.snapshotRetention = snapshotRetention;
            _resultValue.snapshotScheduleCron = snapshotScheduleCron;
            return _resultValue;
        }
    }
}
