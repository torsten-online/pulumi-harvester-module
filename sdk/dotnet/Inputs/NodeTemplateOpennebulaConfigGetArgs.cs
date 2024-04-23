// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class NodeTemplateOpennebulaConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("b2dSize")]
        public Input<string>? B2dSize { get; set; }

        [Input("cpu")]
        public Input<string>? Cpu { get; set; }

        [Input("devPrefix")]
        public Input<string>? DevPrefix { get; set; }

        [Input("disableVnc")]
        public Input<bool>? DisableVnc { get; set; }

        [Input("diskResize")]
        public Input<string>? DiskResize { get; set; }

        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        [Input("imageName")]
        public Input<string>? ImageName { get; set; }

        [Input("imageOwner")]
        public Input<string>? ImageOwner { get; set; }

        [Input("memory")]
        public Input<string>? Memory { get; set; }

        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        [Input("networkName")]
        public Input<string>? NetworkName { get; set; }

        [Input("networkOwner")]
        public Input<string>? NetworkOwner { get; set; }

        [Input("password", required: true)]
        private Input<string>? _password;
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("sshUser")]
        public Input<string>? SshUser { get; set; }

        [Input("templateId")]
        public Input<string>? TemplateId { get; set; }

        [Input("templateName")]
        public Input<string>? TemplateName { get; set; }

        [Input("user", required: true)]
        public Input<string> User { get; set; } = null!;

        [Input("vcpu")]
        public Input<string>? Vcpu { get; set; }

        [Input("xmlRpcUrl", required: true)]
        public Input<string> XmlRpcUrl { get; set; } = null!;

        public NodeTemplateOpennebulaConfigGetArgs()
        {
        }
        public static new NodeTemplateOpennebulaConfigGetArgs Empty => new NodeTemplateOpennebulaConfigGetArgs();
    }
}
