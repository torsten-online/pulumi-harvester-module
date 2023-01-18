// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigServicesEtcdBackupConfigS3BackupConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessKey")]
        private Input<string>? _accessKey;

        /// <summary>
        /// Access key for S3 service (string)
        /// </summary>
        public Input<string>? AccessKey
        {
            get => _accessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Bucket name for S3 service (string)
        /// </summary>
        [Input("bucketName", required: true)]
        public Input<string> BucketName { get; set; } = null!;

        /// <summary>
        /// Base64 encoded custom CA for S3 service. Use filebase64(&lt;FILE&gt;) for encoding file. Available from Rancher v2.2.5 (string)
        /// </summary>
        [Input("customCa")]
        public Input<string>? CustomCa { get; set; }

        /// <summary>
        /// Endpoint for S3 service (string)
        /// </summary>
        [Input("endpoint", required: true)]
        public Input<string> Endpoint { get; set; } = null!;

        /// <summary>
        /// (string)
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// (string)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("secretKey")]
        private Input<string>? _secretKey;

        /// <summary>
        /// Secret key for S3 service (string)
        /// </summary>
        public Input<string>? SecretKey
        {
            get => _secretKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ClusterRkeConfigServicesEtcdBackupConfigS3BackupConfigGetArgs()
        {
        }
        public static new ClusterRkeConfigServicesEtcdBackupConfigS3BackupConfigGetArgs Empty => new ClusterRkeConfigServicesEtcdBackupConfigS3BackupConfigGetArgs();
    }
}
