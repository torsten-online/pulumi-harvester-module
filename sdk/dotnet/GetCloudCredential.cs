// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetCloudCredential
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 Cloud Credential.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Rancher2.GetCloudCredential.Invoke(new()
        ///     {
        ///         Name = "test",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCloudCredentialResult> InvokeAsync(GetCloudCredentialArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCloudCredentialResult>("rancher2:index/getCloudCredential:getCloudCredential", args ?? new GetCloudCredentialArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 Cloud Credential.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Rancher2 = Pulumi.Rancher2;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Rancher2.GetCloudCredential.Invoke(new()
        ///     {
        ///         Name = "test",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetCloudCredentialResult> Invoke(GetCloudCredentialInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudCredentialResult>("rancher2:index/getCloudCredential:getCloudCredential", args ?? new GetCloudCredentialInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCloudCredentialArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Cloud Credential name.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetCloudCredentialArgs()
        {
        }
        public static new GetCloudCredentialArgs Empty => new GetCloudCredentialArgs();
    }

    public sealed class GetCloudCredentialInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Cloud Credential name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetCloudCredentialInvokeArgs()
        {
        }
        public static new GetCloudCredentialInvokeArgs Empty => new GetCloudCredentialInvokeArgs();
    }


    [OutputType]
    public sealed class GetCloudCredentialResult
    {
        /// <summary>
        /// (Computed) Annotations for the Cloud Credential (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) Labels for the Cloud Credential (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        public readonly string Name;

        [OutputConstructor]
        private GetCloudCredentialResult(
            ImmutableDictionary<string, object> annotations,

            string id,

            ImmutableDictionary<string, object> labels,

            string name)
        {
            Annotations = annotations;
            Id = id;
            Labels = labels;
            Name = name;
        }
    }
}
