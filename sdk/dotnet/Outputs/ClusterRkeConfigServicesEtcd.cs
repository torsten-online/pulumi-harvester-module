// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Outputs
{

    [OutputType]
    public sealed class ClusterRkeConfigServicesEtcd
    {
        public readonly Outputs.ClusterRkeConfigServicesEtcdBackupConfig? BackupConfig;
        /// <summary>
        /// (Computed/Sensitive) K8s cluster ca cert (string)
        /// </summary>
        public readonly string? CaCert;
        public readonly string? Cert;
        public readonly string? Creation;
        public readonly ImmutableArray<string> ExternalUrls;
        public readonly ImmutableDictionary<string, object>? ExtraArgs;
        public readonly ImmutableArray<string> ExtraBinds;
        public readonly ImmutableArray<string> ExtraEnvs;
        public readonly int? Gid;
        public readonly string? Image;
        public readonly string? Key;
        public readonly string? Path;
        public readonly string? Retention;
        public readonly bool? Snapshot;
        public readonly int? Uid;

        [OutputConstructor]
        private ClusterRkeConfigServicesEtcd(
            Outputs.ClusterRkeConfigServicesEtcdBackupConfig? backupConfig,

            string? caCert,

            string? cert,

            string? creation,

            ImmutableArray<string> externalUrls,

            ImmutableDictionary<string, object>? extraArgs,

            ImmutableArray<string> extraBinds,

            ImmutableArray<string> extraEnvs,

            int? gid,

            string? image,

            string? key,

            string? path,

            string? retention,

            bool? snapshot,

            int? uid)
        {
            BackupConfig = backupConfig;
            CaCert = caCert;
            Cert = cert;
            Creation = creation;
            ExternalUrls = externalUrls;
            ExtraArgs = extraArgs;
            ExtraBinds = extraBinds;
            ExtraEnvs = extraEnvs;
            Gid = gid;
            Image = image;
            Key = key;
            Path = path;
            Retention = retention;
            Snapshot = snapshot;
            Uid = uid;
        }
    }
}
