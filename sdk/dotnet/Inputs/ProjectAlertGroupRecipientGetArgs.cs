// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Inputs
{

    public sealed class ProjectAlertGroupRecipientGetArgs : Pulumi.ResourceArgs
    {
        [Input("defaultRecipient")]
        public Input<bool>? DefaultRecipient { get; set; }

        [Input("notifierId", required: true)]
        public Input<string> NotifierId { get; set; } = null!;

        [Input("notifierType")]
        public Input<string>? NotifierType { get; set; }

        [Input("recipient")]
        public Input<string>? Recipient { get; set; }

        public ProjectAlertGroupRecipientGetArgs()
        {
        }
    }
}
