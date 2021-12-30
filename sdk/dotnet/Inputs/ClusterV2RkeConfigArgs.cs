// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterV2RkeConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cluster V2 additional manifest (string)
        /// </summary>
        [Input("additionalManifest")]
        public Input<string>? AdditionalManifest { get; set; }

        /// <summary>
        /// Cluster V2 chart values. Must be in YAML format (string)
        /// </summary>
        [Input("chartValues")]
        public Input<string>? ChartValues { get; set; }

        /// <summary>
        /// Cluster V2 etcd (list maxitems:1)
        /// </summary>
        [Input("etcd")]
        public Input<Inputs.ClusterV2RkeConfigEtcdArgs>? Etcd { get; set; }

        /// <summary>
        /// Use rancher2_cluster_v2.local_auth_endpoint instead
        /// </summary>
        [Input("localAuthEndpoint")]
        public Input<Inputs.ClusterV2RkeConfigLocalAuthEndpointArgs>? LocalAuthEndpoint { get; set; }

        /// <summary>
        /// Cluster V2 machine global config. Must be in YAML format (string)
        /// </summary>
        [Input("machineGlobalConfig")]
        public Input<string>? MachineGlobalConfig { get; set; }

        [Input("machinePools")]
        private InputList<Inputs.ClusterV2RkeConfigMachinePoolArgs>? _machinePools;

        /// <summary>
        /// Cluster V2 machine pools (list)
        /// </summary>
        public InputList<Inputs.ClusterV2RkeConfigMachinePoolArgs> MachinePools
        {
            get => _machinePools ?? (_machinePools = new InputList<Inputs.ClusterV2RkeConfigMachinePoolArgs>());
            set => _machinePools = value;
        }

        [Input("machineSelectorConfigs")]
        private InputList<Inputs.ClusterV2RkeConfigMachineSelectorConfigArgs>? _machineSelectorConfigs;

        /// <summary>
        /// Cluster V2 machine selector config (list)
        /// </summary>
        public InputList<Inputs.ClusterV2RkeConfigMachineSelectorConfigArgs> MachineSelectorConfigs
        {
            get => _machineSelectorConfigs ?? (_machineSelectorConfigs = new InputList<Inputs.ClusterV2RkeConfigMachineSelectorConfigArgs>());
            set => _machineSelectorConfigs = value;
        }

        /// <summary>
        /// Cluster V2 docker registries (list maxitems:1)
        /// </summary>
        [Input("registries")]
        public Input<Inputs.ClusterV2RkeConfigRegistriesArgs>? Registries { get; set; }

        /// <summary>
        /// Cluster V2 upgrade strategy (list maxitems:1)
        /// </summary>
        [Input("upgradeStrategy")]
        public Input<Inputs.ClusterV2RkeConfigUpgradeStrategyArgs>? UpgradeStrategy { get; set; }

        public ClusterV2RkeConfigArgs()
        {
        }
    }
}
