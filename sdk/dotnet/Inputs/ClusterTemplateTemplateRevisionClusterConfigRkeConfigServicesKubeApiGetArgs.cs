// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiGetArgs : Pulumi.ResourceArgs
    {
        [Input("admissionConfiguration")]
        private InputMap<object>? _admissionConfiguration;
        public InputMap<object> AdmissionConfiguration
        {
            get => _admissionConfiguration ?? (_admissionConfiguration = new InputMap<object>());
            set => _admissionConfiguration = value;
        }

        [Input("alwaysPullImages")]
        public Input<bool>? AlwaysPullImages { get; set; }

        [Input("auditLog")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogGetArgs>? AuditLog { get; set; }

        [Input("eventRateLimit")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiEventRateLimitGetArgs>? EventRateLimit { get; set; }

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

        [Input("image")]
        public Input<string>? Image { get; set; }

        [Input("podSecurityPolicy")]
        public Input<bool>? PodSecurityPolicy { get; set; }

        [Input("secretsEncryptionConfig")]
        public Input<Inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfigGetArgs>? SecretsEncryptionConfig { get; set; }

        [Input("serviceClusterIpRange")]
        public Input<string>? ServiceClusterIpRange { get; set; }

        [Input("serviceNodePortRange")]
        public Input<string>? ServiceNodePortRange { get; set; }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiGetArgs()
        {
        }
    }
}
