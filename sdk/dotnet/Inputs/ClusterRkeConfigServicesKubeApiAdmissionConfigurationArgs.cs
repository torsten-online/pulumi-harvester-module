// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterRkeConfigServicesKubeApiAdmissionConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Admission configuration ApiVersion
        /// </summary>
        [Input("apiVersion")]
        public Input<string>? ApiVersion { get; set; }

        /// <summary>
        /// Admission configuration Kind
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        [Input("plugins")]
        private InputList<Inputs.ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs>? _plugins;

        /// <summary>
        /// Admission configuration plugins
        /// </summary>
        public InputList<Inputs.ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs> Plugins
        {
            get => _plugins ?? (_plugins = new InputList<Inputs.ClusterRkeConfigServicesKubeApiAdmissionConfigurationPluginArgs>());
            set => _plugins = value;
        }

        public ClusterRkeConfigServicesKubeApiAdmissionConfigurationArgs()
        {
        }
        public static new ClusterRkeConfigServicesKubeApiAdmissionConfigurationArgs Empty => new ClusterRkeConfigServicesKubeApiAdmissionConfigurationArgs();
    }
}
