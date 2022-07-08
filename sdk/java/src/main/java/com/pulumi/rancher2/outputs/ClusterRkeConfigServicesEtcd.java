// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.ClusterRkeConfigServicesEtcdBackupConfig;
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
public final class ClusterRkeConfigServicesEtcd {
    /**
     * @return Backup options for etcd service. Just for Rancher v2.2.x (list maxitems:1)
     * 
     */
    private final @Nullable ClusterRkeConfigServicesEtcdBackupConfig backupConfig;
    /**
     * @return TLS CA certificate for etcd service (string)
     * 
     */
    private final @Nullable String caCert;
    /**
     * @return TLS certificate for etcd service (string)
     * 
     */
    private final @Nullable String cert;
    /**
     * @return Creation option for etcd service (string)
     * 
     */
    private final @Nullable String creation;
    /**
     * @return External urls for etcd service (list)
     * 
     */
    private final @Nullable List<String> externalUrls;
    /**
     * @return Extra arguments for scheduler service (map)
     * 
     */
    private final @Nullable Map<String,Object> extraArgs;
    /**
     * @return Extra binds for scheduler service (list)
     * 
     */
    private final @Nullable List<String> extraBinds;
    /**
     * @return Extra environment for scheduler service (list)
     * 
     */
    private final @Nullable List<String> extraEnvs;
    /**
     * @return Etcd service GID. Default: `0`. For Rancher v2.3.x or above (int)
     * 
     */
    private final @Nullable Integer gid;
    /**
     * @return Docker image for scheduler service (string)
     * 
     */
    private final @Nullable String image;
    /**
     * @return The GKE taint key (string)
     * 
     */
    private final @Nullable String key;
    /**
     * @return (Optional) Audit log path. Default: `/var/log/kube-audit/audit-log.json` (string)
     * 
     */
    private final @Nullable String path;
    /**
     * @return Retention for etcd backup. Default `6` (int)
     * 
     */
    private final @Nullable String retention;
    /**
     * @return Snapshot option for etcd service (bool)
     * 
     */
    private final @Nullable Boolean snapshot;
    /**
     * @return Etcd service UID. Default: `0`. For Rancher v2.3.x or above (int)
     * 
     */
    private final @Nullable Integer uid;

    @CustomType.Constructor
    private ClusterRkeConfigServicesEtcd(
        @CustomType.Parameter("backupConfig") @Nullable ClusterRkeConfigServicesEtcdBackupConfig backupConfig,
        @CustomType.Parameter("caCert") @Nullable String caCert,
        @CustomType.Parameter("cert") @Nullable String cert,
        @CustomType.Parameter("creation") @Nullable String creation,
        @CustomType.Parameter("externalUrls") @Nullable List<String> externalUrls,
        @CustomType.Parameter("extraArgs") @Nullable Map<String,Object> extraArgs,
        @CustomType.Parameter("extraBinds") @Nullable List<String> extraBinds,
        @CustomType.Parameter("extraEnvs") @Nullable List<String> extraEnvs,
        @CustomType.Parameter("gid") @Nullable Integer gid,
        @CustomType.Parameter("image") @Nullable String image,
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("retention") @Nullable String retention,
        @CustomType.Parameter("snapshot") @Nullable Boolean snapshot,
        @CustomType.Parameter("uid") @Nullable Integer uid) {
        this.backupConfig = backupConfig;
        this.caCert = caCert;
        this.cert = cert;
        this.creation = creation;
        this.externalUrls = externalUrls;
        this.extraArgs = extraArgs;
        this.extraBinds = extraBinds;
        this.extraEnvs = extraEnvs;
        this.gid = gid;
        this.image = image;
        this.key = key;
        this.path = path;
        this.retention = retention;
        this.snapshot = snapshot;
        this.uid = uid;
    }

    /**
     * @return Backup options for etcd service. Just for Rancher v2.2.x (list maxitems:1)
     * 
     */
    public Optional<ClusterRkeConfigServicesEtcdBackupConfig> backupConfig() {
        return Optional.ofNullable(this.backupConfig);
    }
    /**
     * @return TLS CA certificate for etcd service (string)
     * 
     */
    public Optional<String> caCert() {
        return Optional.ofNullable(this.caCert);
    }
    /**
     * @return TLS certificate for etcd service (string)
     * 
     */
    public Optional<String> cert() {
        return Optional.ofNullable(this.cert);
    }
    /**
     * @return Creation option for etcd service (string)
     * 
     */
    public Optional<String> creation() {
        return Optional.ofNullable(this.creation);
    }
    /**
     * @return External urls for etcd service (list)
     * 
     */
    public List<String> externalUrls() {
        return this.externalUrls == null ? List.of() : this.externalUrls;
    }
    /**
     * @return Extra arguments for scheduler service (map)
     * 
     */
    public Map<String,Object> extraArgs() {
        return this.extraArgs == null ? Map.of() : this.extraArgs;
    }
    /**
     * @return Extra binds for scheduler service (list)
     * 
     */
    public List<String> extraBinds() {
        return this.extraBinds == null ? List.of() : this.extraBinds;
    }
    /**
     * @return Extra environment for scheduler service (list)
     * 
     */
    public List<String> extraEnvs() {
        return this.extraEnvs == null ? List.of() : this.extraEnvs;
    }
    /**
     * @return Etcd service GID. Default: `0`. For Rancher v2.3.x or above (int)
     * 
     */
    public Optional<Integer> gid() {
        return Optional.ofNullable(this.gid);
    }
    /**
     * @return Docker image for scheduler service (string)
     * 
     */
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return The GKE taint key (string)
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return (Optional) Audit log path. Default: `/var/log/kube-audit/audit-log.json` (string)
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return Retention for etcd backup. Default `6` (int)
     * 
     */
    public Optional<String> retention() {
        return Optional.ofNullable(this.retention);
    }
    /**
     * @return Snapshot option for etcd service (bool)
     * 
     */
    public Optional<Boolean> snapshot() {
        return Optional.ofNullable(this.snapshot);
    }
    /**
     * @return Etcd service UID. Default: `0`. For Rancher v2.3.x or above (int)
     * 
     */
    public Optional<Integer> uid() {
        return Optional.ofNullable(this.uid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigServicesEtcd defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterRkeConfigServicesEtcdBackupConfig backupConfig;
        private @Nullable String caCert;
        private @Nullable String cert;
        private @Nullable String creation;
        private @Nullable List<String> externalUrls;
        private @Nullable Map<String,Object> extraArgs;
        private @Nullable List<String> extraBinds;
        private @Nullable List<String> extraEnvs;
        private @Nullable Integer gid;
        private @Nullable String image;
        private @Nullable String key;
        private @Nullable String path;
        private @Nullable String retention;
        private @Nullable Boolean snapshot;
        private @Nullable Integer uid;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterRkeConfigServicesEtcd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupConfig = defaults.backupConfig;
    	      this.caCert = defaults.caCert;
    	      this.cert = defaults.cert;
    	      this.creation = defaults.creation;
    	      this.externalUrls = defaults.externalUrls;
    	      this.extraArgs = defaults.extraArgs;
    	      this.extraBinds = defaults.extraBinds;
    	      this.extraEnvs = defaults.extraEnvs;
    	      this.gid = defaults.gid;
    	      this.image = defaults.image;
    	      this.key = defaults.key;
    	      this.path = defaults.path;
    	      this.retention = defaults.retention;
    	      this.snapshot = defaults.snapshot;
    	      this.uid = defaults.uid;
        }

        public Builder backupConfig(@Nullable ClusterRkeConfigServicesEtcdBackupConfig backupConfig) {
            this.backupConfig = backupConfig;
            return this;
        }
        public Builder caCert(@Nullable String caCert) {
            this.caCert = caCert;
            return this;
        }
        public Builder cert(@Nullable String cert) {
            this.cert = cert;
            return this;
        }
        public Builder creation(@Nullable String creation) {
            this.creation = creation;
            return this;
        }
        public Builder externalUrls(@Nullable List<String> externalUrls) {
            this.externalUrls = externalUrls;
            return this;
        }
        public Builder externalUrls(String... externalUrls) {
            return externalUrls(List.of(externalUrls));
        }
        public Builder extraArgs(@Nullable Map<String,Object> extraArgs) {
            this.extraArgs = extraArgs;
            return this;
        }
        public Builder extraBinds(@Nullable List<String> extraBinds) {
            this.extraBinds = extraBinds;
            return this;
        }
        public Builder extraBinds(String... extraBinds) {
            return extraBinds(List.of(extraBinds));
        }
        public Builder extraEnvs(@Nullable List<String> extraEnvs) {
            this.extraEnvs = extraEnvs;
            return this;
        }
        public Builder extraEnvs(String... extraEnvs) {
            return extraEnvs(List.of(extraEnvs));
        }
        public Builder gid(@Nullable Integer gid) {
            this.gid = gid;
            return this;
        }
        public Builder image(@Nullable String image) {
            this.image = image;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder retention(@Nullable String retention) {
            this.retention = retention;
            return this;
        }
        public Builder snapshot(@Nullable Boolean snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public Builder uid(@Nullable Integer uid) {
            this.uid = uid;
            return this;
        }        public ClusterRkeConfigServicesEtcd build() {
            return new ClusterRkeConfigServicesEtcd(backupConfig, caCert, cert, creation, externalUrls, extraArgs, extraBinds, extraEnvs, gid, image, key, path, retention, snapshot, uid);
        }
    }
}
