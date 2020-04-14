// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdGetArgs : Pulumi.ResourceArgs
    {
        [Input("backupConfig")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdBackupConfigGetArgs>? BackupConfig { get; set; }

        [Input("caCert")]
        public Input<string>? CaCert { get; set; }

        [Input("cert")]
        public Input<string>? Cert { get; set; }

        [Input("creation")]
        public Input<string>? Creation { get; set; }

        [Input("externalUrls")]
        private InputList<string>? _externalUrls;
        public InputList<string> ExternalUrls
        {
            get => _externalUrls ?? (_externalUrls = new InputList<string>());
            set => _externalUrls = value;
        }

        [Input("extraArgs")]
        private InputMap<object>? _extraArgs;
        public InputMap<object> ExtraArgs
        {
            get => _extraArgs ?? (_extraArgs = new InputMap<object>());
            set => _extraArgs = value;
        }

        [Input("extraBinds")]
        private InputList<string>? _extraBinds;
        public InputList<string> ExtraBinds
        {
            get => _extraBinds ?? (_extraBinds = new InputList<string>());
            set => _extraBinds = value;
        }

        [Input("extraEnvs")]
        private InputList<string>? _extraEnvs;
        public InputList<string> ExtraEnvs
        {
            get => _extraEnvs ?? (_extraEnvs = new InputList<string>());
            set => _extraEnvs = value;
        }

        [Input("gid")]
        public Input<int>? Gid { get; set; }

        [Input("image")]
        public Input<string>? Image { get; set; }

        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("path")]
        public Input<string>? Path { get; set; }

        [Input("retention")]
        public Input<string>? Retention { get; set; }

        [Input("snapshot")]
        public Input<bool>? Snapshot { get; set; }

        [Input("uid")]
        public Input<int>? Uid { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdGetArgs()
        {
        }
    }
}
