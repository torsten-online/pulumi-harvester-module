// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetSetting
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 setting.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var server_image = Output.Create(Rancher2.GetSetting.InvokeAsync(new Rancher2.GetSettingArgs
        ///         {
        ///             Name = "server-image",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// 
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSettingResult> InvokeAsync(GetSettingArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetSettingResult>("rancher2:index/getSetting:getSetting", args ?? new GetSettingArgs(), options.WithVersion());
    }


    public sealed class GetSettingArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The setting name.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetSettingArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetSettingResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        /// <summary>
        /// the settting's value.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetSettingResult(
            string id,

            string name,

            string value)
        {
            Id = id;
            Name = name;
            Value = value;
        }
    }
}
