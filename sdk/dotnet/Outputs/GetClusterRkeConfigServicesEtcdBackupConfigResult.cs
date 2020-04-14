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
    public sealed class GetClusterRkeConfigServicesEtcdBackupConfigResult
    {
        public readonly bool? Enabled;
        public readonly int? IntervalHours;
        public readonly int? Retention;
        public readonly Outputs.GetClusterRkeConfigServicesEtcdBackupConfigS3BackupConfigResult? S3BackupConfig;
        public readonly bool? SafeTimestamp;

        [OutputConstructor]
        private GetClusterRkeConfigServicesEtcdBackupConfigResult(
            bool? enabled,

            int? intervalHours,

            int? retention,

            Outputs.GetClusterRkeConfigServicesEtcdBackupConfigS3BackupConfigResult? s3BackupConfig,

            bool? safeTimestamp)
        {
            Enabled = enabled;
            IntervalHours = intervalHours;
            Retention = retention;
            S3BackupConfig = s3BackupConfig;
            SafeTimestamp = safeTimestamp;
        }
    }
}
