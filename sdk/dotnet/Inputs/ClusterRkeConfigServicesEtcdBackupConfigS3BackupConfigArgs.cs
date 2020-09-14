// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigServicesEtcdBackupConfigS3BackupConfigArgs : Pulumi.ResourceArgs
    {
        [Input("accessKey")]
        public Input<string>? AccessKey { get; set; }

        [Input("bucketName", required: true)]
        public Input<string> BucketName { get; set; } = null!;

        [Input("customCa")]
        public Input<string>? CustomCa { get; set; }

        [Input("endpoint", required: true)]
        public Input<string> Endpoint { get; set; } = null!;

        [Input("folder")]
        public Input<string>? Folder { get; set; }

        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("secretKey")]
        public Input<string>? SecretKey { get; set; }

        public ClusterRkeConfigServicesEtcdBackupConfigS3BackupConfigArgs()
        {
        }
    }
}
