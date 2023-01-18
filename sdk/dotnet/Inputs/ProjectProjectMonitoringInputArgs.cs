// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ProjectProjectMonitoringInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("answers")]
        private InputMap<object>? _answers;

        /// <summary>
        /// Key/value answers for monitor input (map)
        /// </summary>
        public InputMap<object> Answers
        {
            get => _answers ?? (_answers = new InputMap<object>());
            set => _answers = value;
        }

        /// <summary>
        /// rancher-monitoring chart version (string)
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public ProjectProjectMonitoringInputArgs()
        {
        }
        public static new ProjectProjectMonitoringInputArgs Empty => new ProjectProjectMonitoringInputArgs();
    }
}
