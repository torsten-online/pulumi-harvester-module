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
    public sealed class EtcdBackupBackupConfigS3BackupConfig
    {
        public readonly string? AccessKey;
        public readonly string BucketName;
        public readonly string? CustomCa;
        public readonly string Endpoint;
        public readonly string? Folder;
        public readonly string? Region;
        public readonly string? SecretKey;

        [OutputConstructor]
        private EtcdBackupBackupConfigS3BackupConfig(
            string? accessKey,

            string bucketName,

            string? customCa,

            string endpoint,

            string? folder,

            string? region,

            string? secretKey)
        {
            AccessKey = accessKey;
            BucketName = bucketName;
            CustomCa = customCa;
            Endpoint = endpoint;
            Folder = folder;
            Region = region;
            SecretKey = secretKey;
        }
    }
}
