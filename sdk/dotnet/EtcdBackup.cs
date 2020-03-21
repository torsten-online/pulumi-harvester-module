// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    /// <summary>
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/etcd_backup.html.markdown.
    /// </summary>
    public partial class EtcdBackup : Pulumi.CustomResource
    {
        /// <summary>
        /// Annotations for Etcd Backup object (map)
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, object>> Annotations { get; private set; } = null!;

        /// <summary>
        /// Backup config for etcd backup (list maxitems:1)
        /// </summary>
        [Output("backupConfig")]
        public Output<Outputs.EtcdBackupBackupConfig> BackupConfig { get; private set; } = null!;

        /// <summary>
        /// Cluster ID to config Etcd Backup (string)
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// Filename of the Etcd Backup (string)
        /// </summary>
        [Output("filename")]
        public Output<string> Filename { get; private set; } = null!;

        /// <summary>
        /// Labels for Etcd Backup object (map)
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// Manual execution of the Etcd Backup. Default `false` (bool)
        /// </summary>
        [Output("manual")]
        public Output<bool?> Manual { get; private set; } = null!;

        /// <summary>
        /// The name of the Etcd Backup (string)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Description for the Etcd Backup (string)
        /// </summary>
        [Output("namespaceId")]
        public Output<string> NamespaceId { get; private set; } = null!;


        /// <summary>
        /// Create a EtcdBackup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EtcdBackup(string name, EtcdBackupArgs args, CustomResourceOptions? options = null)
            : base("rancher2:index/etcdBackup:EtcdBackup", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private EtcdBackup(string name, Input<string> id, EtcdBackupState? state = null, CustomResourceOptions? options = null)
            : base("rancher2:index/etcdBackup:EtcdBackup", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing EtcdBackup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EtcdBackup Get(string name, Input<string> id, EtcdBackupState? state = null, CustomResourceOptions? options = null)
        {
            return new EtcdBackup(name, id, state, options);
        }
    }

    public sealed class EtcdBackupArgs : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for Etcd Backup object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Backup config for etcd backup (list maxitems:1)
        /// </summary>
        [Input("backupConfig")]
        public Input<Inputs.EtcdBackupBackupConfigArgs>? BackupConfig { get; set; }

        /// <summary>
        /// Cluster ID to config Etcd Backup (string)
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// Filename of the Etcd Backup (string)
        /// </summary>
        [Input("filename")]
        public Input<string>? Filename { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for Etcd Backup object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Manual execution of the Etcd Backup. Default `false` (bool)
        /// </summary>
        [Input("manual")]
        public Input<bool>? Manual { get; set; }

        /// <summary>
        /// The name of the Etcd Backup (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Description for the Etcd Backup (string)
        /// </summary>
        [Input("namespaceId")]
        public Input<string>? NamespaceId { get; set; }

        public EtcdBackupArgs()
        {
        }
    }

    public sealed class EtcdBackupState : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations for Etcd Backup object (map)
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        /// <summary>
        /// Backup config for etcd backup (list maxitems:1)
        /// </summary>
        [Input("backupConfig")]
        public Input<Inputs.EtcdBackupBackupConfigGetArgs>? BackupConfig { get; set; }

        /// <summary>
        /// Cluster ID to config Etcd Backup (string)
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// Filename of the Etcd Backup (string)
        /// </summary>
        [Input("filename")]
        public Input<string>? Filename { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels for Etcd Backup object (map)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Manual execution of the Etcd Backup. Default `false` (bool)
        /// </summary>
        [Input("manual")]
        public Input<bool>? Manual { get; set; }

        /// <summary>
        /// The name of the Etcd Backup (string)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Description for the Etcd Backup (string)
        /// </summary>
        [Input("namespaceId")]
        public Input<string>? NamespaceId { get; set; }

        public EtcdBackupState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class EtcdBackupBackupConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable etcd backup (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Interval hours for etcd backup. Default `12` (int)
        /// </summary>
        [Input("intervalHours")]
        public Input<int>? IntervalHours { get; set; }

        /// <summary>
        /// Retention for etcd backup. Default `6` (int)
        /// </summary>
        [Input("retention")]
        public Input<int>? Retention { get; set; }

        /// <summary>
        /// S3 config options for etcd backup. Valid for `imported` and `rke` clusters. (list maxitems:1)
        /// </summary>
        [Input("s3BackupConfig")]
        public Input<EtcdBackupBackupConfigS3BackupConfigArgs>? S3BackupConfig { get; set; }

        [Input("safeTimestamp")]
        public Input<bool>? SafeTimestamp { get; set; }

        public EtcdBackupBackupConfigArgs()
        {
        }
    }

    public sealed class EtcdBackupBackupConfigGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable etcd backup (bool)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Interval hours for etcd backup. Default `12` (int)
        /// </summary>
        [Input("intervalHours")]
        public Input<int>? IntervalHours { get; set; }

        /// <summary>
        /// Retention for etcd backup. Default `6` (int)
        /// </summary>
        [Input("retention")]
        public Input<int>? Retention { get; set; }

        /// <summary>
        /// S3 config options for etcd backup. Valid for `imported` and `rke` clusters. (list maxitems:1)
        /// </summary>
        [Input("s3BackupConfig")]
        public Input<EtcdBackupBackupConfigS3BackupConfigGetArgs>? S3BackupConfig { get; set; }

        [Input("safeTimestamp")]
        public Input<bool>? SafeTimestamp { get; set; }

        public EtcdBackupBackupConfigGetArgs()
        {
        }
    }

    public sealed class EtcdBackupBackupConfigS3BackupConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Access key for S3 service (string)
        /// </summary>
        [Input("accessKey")]
        public Input<string>? AccessKey { get; set; }

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
        /// Folder for S3 service. Available from Rancher v2.2.7 (string)
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// Region for S3 service (string)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Secret key for S3 service (string)
        /// </summary>
        [Input("secretKey")]
        public Input<string>? SecretKey { get; set; }

        public EtcdBackupBackupConfigS3BackupConfigArgs()
        {
        }
    }

    public sealed class EtcdBackupBackupConfigS3BackupConfigGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Access key for S3 service (string)
        /// </summary>
        [Input("accessKey")]
        public Input<string>? AccessKey { get; set; }

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
        /// Folder for S3 service. Available from Rancher v2.2.7 (string)
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// Region for S3 service (string)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Secret key for S3 service (string)
        /// </summary>
        [Input("secretKey")]
        public Input<string>? SecretKey { get; set; }

        public EtcdBackupBackupConfigS3BackupConfigGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class EtcdBackupBackupConfig
    {
        /// <summary>
        /// Enable etcd backup (bool)
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Interval hours for etcd backup. Default `12` (int)
        /// </summary>
        public readonly int? IntervalHours;
        /// <summary>
        /// Retention for etcd backup. Default `6` (int)
        /// </summary>
        public readonly int? Retention;
        /// <summary>
        /// S3 config options for etcd backup. Valid for `imported` and `rke` clusters. (list maxitems:1)
        /// </summary>
        public readonly EtcdBackupBackupConfigS3BackupConfig? S3BackupConfig;
        public readonly bool? SafeTimestamp;

        [OutputConstructor]
        private EtcdBackupBackupConfig(
            bool? enabled,
            int? intervalHours,
            int? retention,
            EtcdBackupBackupConfigS3BackupConfig? s3BackupConfig,
            bool? safeTimestamp)
        {
            Enabled = enabled;
            IntervalHours = intervalHours;
            Retention = retention;
            S3BackupConfig = s3BackupConfig;
            SafeTimestamp = safeTimestamp;
        }
    }

    [OutputType]
    public sealed class EtcdBackupBackupConfigS3BackupConfig
    {
        /// <summary>
        /// Access key for S3 service (string)
        /// </summary>
        public readonly string? AccessKey;
        /// <summary>
        /// Bucket name for S3 service (string)
        /// </summary>
        public readonly string BucketName;
        /// <summary>
        /// Base64 encoded custom CA for S3 service. Use filebase64(&lt;FILE&gt;) for encoding file. Available from Rancher v2.2.5 (string)
        /// </summary>
        public readonly string? CustomCa;
        /// <summary>
        /// Endpoint for S3 service (string)
        /// </summary>
        public readonly string Endpoint;
        /// <summary>
        /// Folder for S3 service. Available from Rancher v2.2.7 (string)
        /// </summary>
        public readonly string? Folder;
        /// <summary>
        /// Region for S3 service (string)
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// Secret key for S3 service (string)
        /// </summary>
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
}
