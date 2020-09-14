// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterClusterRegistrationTokenArgs : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("command")]
        public Input<string>? Command { get; set; }

        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("insecureCommand")]
        public Input<string>? InsecureCommand { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        [Input("manifestUrl")]
        public Input<string>? ManifestUrl { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nodeCommand")]
        public Input<string>? NodeCommand { get; set; }

        [Input("token")]
        public Input<string>? Token { get; set; }

        [Input("windowsNodeCommand")]
        public Input<string>? WindowsNodeCommand { get; set; }

        public ClusterClusterRegistrationTokenArgs()
        {
        }
    }
}
