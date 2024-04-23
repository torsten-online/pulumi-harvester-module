// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ClusterSyncNodeGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<object>? _annotations;

        /// <summary>
        /// Annotations of the resource
        /// </summary>
        public InputMap<object> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<object>());
            set => _annotations = value;
        }

        [Input("capacity")]
        private InputMap<object>? _capacity;
        public InputMap<object> Capacity
        {
            get => _capacity ?? (_capacity = new InputMap<object>());
            set => _capacity = value;
        }

        /// <summary>
        /// The cluster ID that is syncing (string)
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("externalIpAddress")]
        public Input<string>? ExternalIpAddress { get; set; }

        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// (Computed) The ID of the resource. Same as `cluster_id` (string)
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// Labels of the resource
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nodePoolId")]
        public Input<string>? NodePoolId { get; set; }

        [Input("nodeTemplateId")]
        public Input<string>? NodeTemplateId { get; set; }

        [Input("providerId")]
        public Input<string>? ProviderId { get; set; }

        [Input("requestedHostname")]
        public Input<string>? RequestedHostname { get; set; }

        [Input("roles")]
        private InputList<string>? _roles;
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        [Input("sshUser")]
        private Input<string>? _sshUser;
        public Input<string>? SshUser
        {
            get => _sshUser;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sshUser = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("systemInfo")]
        private InputMap<object>? _systemInfo;
        public InputMap<object> SystemInfo
        {
            get => _systemInfo ?? (_systemInfo = new InputMap<object>());
            set => _systemInfo = value;
        }

        public ClusterSyncNodeGetArgs()
        {
        }
        public static new ClusterSyncNodeGetArgs Empty => new ClusterSyncNodeGetArgs();
    }
}
