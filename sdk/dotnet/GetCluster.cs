// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2
{
    public static class GetCluster
    {
        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 cluster.
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
        ///     var foo_custom = Rancher2.GetCluster.Invoke(new()
        ///     {
        ///         Name = "foo-custom",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetClusterResult> InvokeAsync(GetClusterArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetClusterResult>("rancher2:index/getCluster:getCluster", args ?? new GetClusterArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about a Rancher v2 cluster.
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
        ///     var foo_custom = Rancher2.GetCluster.Invoke(new()
        ///     {
        ///         Name = "foo-custom",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetClusterResult> Invoke(GetClusterInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetClusterResult>("rancher2:index/getCluster:getCluster", args ?? new GetClusterInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetClusterArgs : global::Pulumi.InvokeArgs
    {
        [Input("defaultPodSecurityAdmissionConfigurationTemplateName")]
        public string? DefaultPodSecurityAdmissionConfigurationTemplateName { get; set; }

        /// <summary>
        /// The name of the Cluster (string)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetClusterArgs()
        {
        }
        public static new GetClusterArgs Empty => new GetClusterArgs();
    }

    public sealed class GetClusterInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("defaultPodSecurityAdmissionConfigurationTemplateName")]
        public Input<string>? DefaultPodSecurityAdmissionConfigurationTemplateName { get; set; }

        /// <summary>
        /// The name of the Cluster (string)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetClusterInvokeArgs()
        {
        }
        public static new GetClusterInvokeArgs Empty => new GetClusterInvokeArgs();
    }


    [OutputType]
    public sealed class GetClusterResult
    {
        /// <summary>
        /// (Computed) Optional Agent Env Vars for Rancher agent. Just for Rancher v2.5.6 and above (list)
        /// </summary>
        public readonly ImmutableArray<string> AgentEnvVars;
        /// <summary>
        /// (Computed) The Azure aks configuration for `aks` Clusters. Conflicts with `aks_config_v2`, `eks_config`, `eks_config_v2`, `gke_config`, `gke_config_v2`, `oke_config`, `k3s_config` and `rke_config` (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterAksConfigResult AksConfig;
        /// <summary>
        /// (Optional) The Azure AKS v2 configuration for creating/import `aks` Clusters. Conflicts with `aks_config`, `eks_config`, `eks_config_v2`, `gke_config`, `gke_config_v2`, `oke_config` `k3s_config` and `rke_config` (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterAksConfigV2Result AksConfigV2;
        /// <summary>
        /// (Computed) Annotations for Node Pool object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Annotations;
        /// <summary>
        /// (Computed) K8s cluster ca cert (string)
        /// </summary>
        public readonly string CaCert;
        /// <summary>
        /// (Computed) Enabling the [local cluster authorized endpoint](https://rancher.com/docs/rancher/v2.x/en/cluster-provisioning/rke-clusters/options/#local-cluster-auth-endpoint) allows direct communication with the cluster, bypassing the Rancher API proxy. (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterClusterAuthEndpointResult ClusterAuthEndpoint;
        /// <summary>
        /// (Computed) Cluster monitoring config (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterClusterMonitoringInputResult ClusterMonitoringInput;
        /// <summary>
        /// (Computed) Cluster Registration Token generated for the cluster (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterClusterRegistrationTokenResult ClusterRegistrationToken;
        /// <summary>
        /// (Computed) Cluster template answers (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterClusterTemplateAnswersResult ClusterTemplateAnswers;
        /// <summary>
        /// (Computed) Cluster template ID (string)
        /// </summary>
        public readonly string ClusterTemplateId;
        /// <summary>
        /// (Computed) Cluster template questions (list)
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterClusterTemplateQuestionResult> ClusterTemplateQuestions;
        /// <summary>
        /// (Computed) Cluster template revision ID (string)
        /// </summary>
        public readonly string ClusterTemplateRevisionId;
        public readonly string DefaultPodSecurityAdmissionConfigurationTemplateName;
        /// <summary>
        /// (Optional/Computed) [Default pod security policy template id](https://rancher.com/docs/rancher/v2.x/en/cluster-provisioning/rke-clusters/options/#pod-security-policy-support) (string)
        /// </summary>
        public readonly string DefaultPodSecurityPolicyTemplateId;
        /// <summary>
        /// (Computed) Default project ID for the cluster (string)
        /// </summary>
        public readonly string DefaultProjectId;
        /// <summary>
        /// (Computed) The description for Cluster (string)
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (Computed) The driver used for the Cluster. `imported`, `azurekubernetesservice`, `amazonelasticcontainerservice`, `googlekubernetesengine` and `rancherKubernetesEngine` are supported (string)
        /// </summary>
        public readonly string Driver;
        /// <summary>
        /// (Computed) The Amazon eks configuration for `eks` Conflicts with `aks_config`, `aks_config_v2`, `eks_config_v2`, `gke_config`, `gke_config_v2`, `oke_config`, `k3s_config` and `rke_config` (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterEksConfigResult EksConfig;
        /// <summary>
        /// (Computed) The Amazon EKS V2 configuration to create or import `eks` Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `gke_config`, `gke_config_v2`, `oke_config`, `k3s_config` and `rke_config`. For Rancher v2.5.x or above (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterEksConfigV2Result EksConfigV2;
        public readonly bool EnableClusterAlerting;
        /// <summary>
        /// (Computed) Enable built-in cluster monitoring. Default `false` (bool)
        /// </summary>
        public readonly bool EnableClusterMonitoring;
        /// <summary>
        /// (Computed) Enable project network isolation. Default `false` (bool)
        /// </summary>
        public readonly bool EnableNetworkPolicy;
        /// <summary>
        /// (Computed) Fleet workspace name (string)
        /// </summary>
        public readonly string FleetWorkspaceName;
        /// <summary>
        /// (Computed) The Google gke configuration for `gke` Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `eks_config_v2`, `gke_config_v2`, `oke_config`, `k3s_config` and `rke_config` (list maxitems:1) (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterGkeConfigResult GkeConfig;
        /// <summary>
        /// (Computed) The Google GKE V2 configuration for `gke` Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `eks_config_v2`, `gke_config`, `oke_config`, `k3s_config` and `rke_config`. For Rancher v2.5.8 or above (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterGkeConfigV2Result GkeConfigV2;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) The K3S configuration for `k3s` imported Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `eks_config_v2`, `gke_config`, `gke_config_v2`, `oke_config` and `rke_config` (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterK3sConfigResult K3sConfig;
        /// <summary>
        /// (Computed) Kube Config generated for the cluster (string)
        /// </summary>
        public readonly string KubeConfig;
        /// <summary>
        /// (Computed) Labels for Node Pool object (map)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        public readonly string Name;
        /// <summary>
        /// (Computed) The Oracle OKE configuration for `oke` Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `eks_config_v2`, `gke_config`, `gke_config_v2`, `k3s_config` and `rke_config` (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterOkeConfigResult OkeConfig;
        /// <summary>
        /// (Computed) The RKE2 configuration for `rke2` Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `gke_config`, `oke_config`, `k3s_config` and `rke_config` (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterRke2ConfigResult Rke2Config;
        /// <summary>
        /// (Computed) The RKE configuration for `rke` Clusters. Conflicts with `aks_config`, `aks_config_v2`, `eks_config`, `eks_config_v2`, `gke_config`, `gke_config_v2`, `oke_config` and `k3s_config` (list maxitems:1)
        /// </summary>
        public readonly Outputs.GetClusterRkeConfigResult RkeConfig;
        /// <summary>
        /// (Computed) System project ID for the cluster (string)
        /// </summary>
        public readonly string SystemProjectId;

        [OutputConstructor]
        private GetClusterResult(
            ImmutableArray<string> agentEnvVars,

            Outputs.GetClusterAksConfigResult aksConfig,

            Outputs.GetClusterAksConfigV2Result aksConfigV2,

            ImmutableDictionary<string, object> annotations,

            string caCert,

            Outputs.GetClusterClusterAuthEndpointResult clusterAuthEndpoint,

            Outputs.GetClusterClusterMonitoringInputResult clusterMonitoringInput,

            Outputs.GetClusterClusterRegistrationTokenResult clusterRegistrationToken,

            Outputs.GetClusterClusterTemplateAnswersResult clusterTemplateAnswers,

            string clusterTemplateId,

            ImmutableArray<Outputs.GetClusterClusterTemplateQuestionResult> clusterTemplateQuestions,

            string clusterTemplateRevisionId,

            string defaultPodSecurityAdmissionConfigurationTemplateName,

            string defaultPodSecurityPolicyTemplateId,

            string defaultProjectId,

            string description,

            string driver,

            Outputs.GetClusterEksConfigResult eksConfig,

            Outputs.GetClusterEksConfigV2Result eksConfigV2,

            bool enableClusterAlerting,

            bool enableClusterMonitoring,

            bool enableNetworkPolicy,

            string fleetWorkspaceName,

            Outputs.GetClusterGkeConfigResult gkeConfig,

            Outputs.GetClusterGkeConfigV2Result gkeConfigV2,

            string id,

            Outputs.GetClusterK3sConfigResult k3sConfig,

            string kubeConfig,

            ImmutableDictionary<string, object> labels,

            string name,

            Outputs.GetClusterOkeConfigResult okeConfig,

            Outputs.GetClusterRke2ConfigResult rke2Config,

            Outputs.GetClusterRkeConfigResult rkeConfig,

            string systemProjectId)
        {
            AgentEnvVars = agentEnvVars;
            AksConfig = aksConfig;
            AksConfigV2 = aksConfigV2;
            Annotations = annotations;
            CaCert = caCert;
            ClusterAuthEndpoint = clusterAuthEndpoint;
            ClusterMonitoringInput = clusterMonitoringInput;
            ClusterRegistrationToken = clusterRegistrationToken;
            ClusterTemplateAnswers = clusterTemplateAnswers;
            ClusterTemplateId = clusterTemplateId;
            ClusterTemplateQuestions = clusterTemplateQuestions;
            ClusterTemplateRevisionId = clusterTemplateRevisionId;
            DefaultPodSecurityAdmissionConfigurationTemplateName = defaultPodSecurityAdmissionConfigurationTemplateName;
            DefaultPodSecurityPolicyTemplateId = defaultPodSecurityPolicyTemplateId;
            DefaultProjectId = defaultProjectId;
            Description = description;
            Driver = driver;
            EksConfig = eksConfig;
            EksConfigV2 = eksConfigV2;
            EnableClusterAlerting = enableClusterAlerting;
            EnableClusterMonitoring = enableClusterMonitoring;
            EnableNetworkPolicy = enableNetworkPolicy;
            FleetWorkspaceName = fleetWorkspaceName;
            GkeConfig = gkeConfig;
            GkeConfigV2 = gkeConfigV2;
            Id = id;
            K3sConfig = k3sConfig;
            KubeConfig = kubeConfig;
            Labels = labels;
            Name = name;
            OkeConfig = okeConfig;
            Rke2Config = rke2Config;
            RkeConfig = rkeConfig;
            SystemProjectId = systemProjectId;
        }
    }
}
