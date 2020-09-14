# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['Cluster']


class Cluster(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aks_config: Optional[pulumi.Input[pulumi.InputType['ClusterAksConfigArgs']]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_auth_endpoint: Optional[pulumi.Input[pulumi.InputType['ClusterClusterAuthEndpointArgs']]] = None,
                 cluster_monitoring_input: Optional[pulumi.Input[pulumi.InputType['ClusterClusterMonitoringInputArgs']]] = None,
                 cluster_template_answers: Optional[pulumi.Input[pulumi.InputType['ClusterClusterTemplateAnswersArgs']]] = None,
                 cluster_template_id: Optional[pulumi.Input[str]] = None,
                 cluster_template_questions: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['ClusterClusterTemplateQuestionArgs']]]]] = None,
                 cluster_template_revision_id: Optional[pulumi.Input[str]] = None,
                 default_pod_security_policy_template_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 desired_agent_image: Optional[pulumi.Input[str]] = None,
                 desired_auth_image: Optional[pulumi.Input[str]] = None,
                 docker_root_dir: Optional[pulumi.Input[str]] = None,
                 driver: Optional[pulumi.Input[str]] = None,
                 eks_config: Optional[pulumi.Input[pulumi.InputType['ClusterEksConfigArgs']]] = None,
                 enable_cluster_alerting: Optional[pulumi.Input[bool]] = None,
                 enable_cluster_monitoring: Optional[pulumi.Input[bool]] = None,
                 enable_network_policy: Optional[pulumi.Input[bool]] = None,
                 gke_config: Optional[pulumi.Input[pulumi.InputType['ClusterGkeConfigArgs']]] = None,
                 k3s_config: Optional[pulumi.Input[pulumi.InputType['ClusterK3sConfigArgs']]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rke_config: Optional[pulumi.Input[pulumi.InputType['ClusterRkeConfigArgs']]] = None,
                 scheduled_cluster_scan: Optional[pulumi.Input[pulumi.InputType['ClusterScheduledClusterScanArgs']]] = None,
                 windows_prefered_cluster: Optional[pulumi.Input[bool]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Rancher v2 Cluster resource. This can be used to create Clusters for Rancher v2 environments and retrieve their information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ClusterAksConfigArgs']] aks_config: The Azure AKS configuration for `aks` Clusters. Conflicts with `eks_config`, `gke_config`, `k3s_config` and `rke_config` (list maxitems:1)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for cluster registration token object (map)
        :param pulumi.Input[pulumi.InputType['ClusterClusterAuthEndpointArgs']] cluster_auth_endpoint: Enabling the [local cluster authorized endpoint](https://rancher.com/docs/rancher/v2.x/en/cluster-provisioning/rke-clusters/options/#local-cluster-auth-endpoint) allows direct communication with the cluster, bypassing the Rancher API proxy. (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['ClusterClusterMonitoringInputArgs']] cluster_monitoring_input: Cluster monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured  (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['ClusterClusterTemplateAnswersArgs']] cluster_template_answers: Cluster template answers. Just for Rancher v2.3.x and above (list maxitems:1)
        :param pulumi.Input[str] cluster_template_id: Cluster template ID. Just for Rancher v2.3.x and above (string)
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['ClusterClusterTemplateQuestionArgs']]]] cluster_template_questions: Cluster template questions. Just for Rancher v2.3.x and above (list)
        :param pulumi.Input[str] cluster_template_revision_id: Cluster template revision ID. Just for Rancher v2.3.x and above (string)
        :param pulumi.Input[str] default_pod_security_policy_template_id: [Default pod security policy template id](https://rancher.com/docs/rancher/v2.x/en/cluster-provisioning/rke-clusters/options/#pod-security-policy-support) (string)
        :param pulumi.Input[str] description: An optional description of this cluster (string)
        :param pulumi.Input[str] desired_agent_image: Desired agent image. Just for Rancher v2.3.x and above (string)
        :param pulumi.Input[str] desired_auth_image: Desired auth image. Just for Rancher v2.3.x and above (string)
        :param pulumi.Input[str] docker_root_dir: Desired auth image. Just for Rancher v2.3.x and above (string)
        :param pulumi.Input[str] driver: (Computed) The driver used for the Cluster. `imported`, `azurekubernetesservice`, `amazonelasticcontainerservice`, `googlekubernetesengine` and `rancherKubernetesEngine` are supported (string)
        :param pulumi.Input[pulumi.InputType['ClusterEksConfigArgs']] eks_config: The Amazon EKS configuration for `eks` Clusters. Conflicts with `aks_config`, `gke_config`, `k3s_config` and `rke_config` (list maxitems:1)
        :param pulumi.Input[bool] enable_cluster_alerting: Enable built-in cluster alerting (bool)
        :param pulumi.Input[bool] enable_cluster_monitoring: Enable built-in cluster monitoring (bool)
        :param pulumi.Input[bool] enable_network_policy: Enable project network isolation (bool)
        :param pulumi.Input[pulumi.InputType['ClusterGkeConfigArgs']] gke_config: The Google GKE configuration for `gke` Clusters. Conflicts with `aks_config`, `eks_config`, `k3s_config` and `rke_config` (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['ClusterK3sConfigArgs']] k3s_config: The K3S configuration for `k3s` imported Clusters. Conflicts with `aks_config`, `eks_config`, `gke_config` and `rke_config` (list maxitems:1)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for cluster registration token object (map)
        :param pulumi.Input[str] name: Name of cluster registration token (string)
        :param pulumi.Input[pulumi.InputType['ClusterRkeConfigArgs']] rke_config: The RKE configuration for `rke` Clusters. Conflicts with `aks_config`, `eks_config`, `gke_config` and `k3s_config` (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['ClusterScheduledClusterScanArgs']] scheduled_cluster_scan: Cluster scheduled cis scan. For Rancher v2.4.0 or above (List maxitems:1)
        :param pulumi.Input[bool] windows_prefered_cluster: Windows preferred cluster. Default: `false` (bool)
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['aks_config'] = aks_config
            __props__['annotations'] = annotations
            __props__['cluster_auth_endpoint'] = cluster_auth_endpoint
            __props__['cluster_monitoring_input'] = cluster_monitoring_input
            __props__['cluster_template_answers'] = cluster_template_answers
            __props__['cluster_template_id'] = cluster_template_id
            __props__['cluster_template_questions'] = cluster_template_questions
            __props__['cluster_template_revision_id'] = cluster_template_revision_id
            __props__['default_pod_security_policy_template_id'] = default_pod_security_policy_template_id
            __props__['description'] = description
            __props__['desired_agent_image'] = desired_agent_image
            __props__['desired_auth_image'] = desired_auth_image
            __props__['docker_root_dir'] = docker_root_dir
            __props__['driver'] = driver
            __props__['eks_config'] = eks_config
            __props__['enable_cluster_alerting'] = enable_cluster_alerting
            __props__['enable_cluster_monitoring'] = enable_cluster_monitoring
            __props__['enable_network_policy'] = enable_network_policy
            __props__['gke_config'] = gke_config
            __props__['k3s_config'] = k3s_config
            __props__['labels'] = labels
            __props__['name'] = name
            __props__['rke_config'] = rke_config
            __props__['scheduled_cluster_scan'] = scheduled_cluster_scan
            __props__['windows_prefered_cluster'] = windows_prefered_cluster
            __props__['cluster_registration_token'] = None
            __props__['default_project_id'] = None
            __props__['enable_cluster_istio'] = None
            __props__['istio_enabled'] = None
            __props__['kube_config'] = None
            __props__['system_project_id'] = None
        super(Cluster, __self__).__init__(
            'rancher2:index/cluster:Cluster',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aks_config: Optional[pulumi.Input[pulumi.InputType['ClusterAksConfigArgs']]] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            cluster_auth_endpoint: Optional[pulumi.Input[pulumi.InputType['ClusterClusterAuthEndpointArgs']]] = None,
            cluster_monitoring_input: Optional[pulumi.Input[pulumi.InputType['ClusterClusterMonitoringInputArgs']]] = None,
            cluster_registration_token: Optional[pulumi.Input[pulumi.InputType['ClusterClusterRegistrationTokenArgs']]] = None,
            cluster_template_answers: Optional[pulumi.Input[pulumi.InputType['ClusterClusterTemplateAnswersArgs']]] = None,
            cluster_template_id: Optional[pulumi.Input[str]] = None,
            cluster_template_questions: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['ClusterClusterTemplateQuestionArgs']]]]] = None,
            cluster_template_revision_id: Optional[pulumi.Input[str]] = None,
            default_pod_security_policy_template_id: Optional[pulumi.Input[str]] = None,
            default_project_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            desired_agent_image: Optional[pulumi.Input[str]] = None,
            desired_auth_image: Optional[pulumi.Input[str]] = None,
            docker_root_dir: Optional[pulumi.Input[str]] = None,
            driver: Optional[pulumi.Input[str]] = None,
            eks_config: Optional[pulumi.Input[pulumi.InputType['ClusterEksConfigArgs']]] = None,
            enable_cluster_alerting: Optional[pulumi.Input[bool]] = None,
            enable_cluster_istio: Optional[pulumi.Input[bool]] = None,
            enable_cluster_monitoring: Optional[pulumi.Input[bool]] = None,
            enable_network_policy: Optional[pulumi.Input[bool]] = None,
            gke_config: Optional[pulumi.Input[pulumi.InputType['ClusterGkeConfigArgs']]] = None,
            istio_enabled: Optional[pulumi.Input[bool]] = None,
            k3s_config: Optional[pulumi.Input[pulumi.InputType['ClusterK3sConfigArgs']]] = None,
            kube_config: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            rke_config: Optional[pulumi.Input[pulumi.InputType['ClusterRkeConfigArgs']]] = None,
            scheduled_cluster_scan: Optional[pulumi.Input[pulumi.InputType['ClusterScheduledClusterScanArgs']]] = None,
            system_project_id: Optional[pulumi.Input[str]] = None,
            windows_prefered_cluster: Optional[pulumi.Input[bool]] = None) -> 'Cluster':
        """
        Get an existing Cluster resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ClusterAksConfigArgs']] aks_config: The Azure AKS configuration for `aks` Clusters. Conflicts with `eks_config`, `gke_config`, `k3s_config` and `rke_config` (list maxitems:1)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for cluster registration token object (map)
        :param pulumi.Input[pulumi.InputType['ClusterClusterAuthEndpointArgs']] cluster_auth_endpoint: Enabling the [local cluster authorized endpoint](https://rancher.com/docs/rancher/v2.x/en/cluster-provisioning/rke-clusters/options/#local-cluster-auth-endpoint) allows direct communication with the cluster, bypassing the Rancher API proxy. (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['ClusterClusterMonitoringInputArgs']] cluster_monitoring_input: Cluster monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured  (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['ClusterClusterRegistrationTokenArgs']] cluster_registration_token: (Computed) Cluster Registration Token generated for the cluster (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['ClusterClusterTemplateAnswersArgs']] cluster_template_answers: Cluster template answers. Just for Rancher v2.3.x and above (list maxitems:1)
        :param pulumi.Input[str] cluster_template_id: Cluster template ID. Just for Rancher v2.3.x and above (string)
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['ClusterClusterTemplateQuestionArgs']]]] cluster_template_questions: Cluster template questions. Just for Rancher v2.3.x and above (list)
        :param pulumi.Input[str] cluster_template_revision_id: Cluster template revision ID. Just for Rancher v2.3.x and above (string)
        :param pulumi.Input[str] default_pod_security_policy_template_id: [Default pod security policy template id](https://rancher.com/docs/rancher/v2.x/en/cluster-provisioning/rke-clusters/options/#pod-security-policy-support) (string)
        :param pulumi.Input[str] default_project_id: (Computed) Default project ID for the cluster (string)
        :param pulumi.Input[str] description: An optional description of this cluster (string)
        :param pulumi.Input[str] desired_agent_image: Desired agent image. Just for Rancher v2.3.x and above (string)
        :param pulumi.Input[str] desired_auth_image: Desired auth image. Just for Rancher v2.3.x and above (string)
        :param pulumi.Input[str] docker_root_dir: Desired auth image. Just for Rancher v2.3.x and above (string)
        :param pulumi.Input[str] driver: (Computed) The driver used for the Cluster. `imported`, `azurekubernetesservice`, `amazonelasticcontainerservice`, `googlekubernetesengine` and `rancherKubernetesEngine` are supported (string)
        :param pulumi.Input[pulumi.InputType['ClusterEksConfigArgs']] eks_config: The Amazon EKS configuration for `eks` Clusters. Conflicts with `aks_config`, `gke_config`, `k3s_config` and `rke_config` (list maxitems:1)
        :param pulumi.Input[bool] enable_cluster_alerting: Enable built-in cluster alerting (bool)
        :param pulumi.Input[bool] enable_cluster_istio: Deploy istio on `system` project and `istio-system` namespace, using App resource instead. See above example.
        :param pulumi.Input[bool] enable_cluster_monitoring: Enable built-in cluster monitoring (bool)
        :param pulumi.Input[bool] enable_network_policy: Enable project network isolation (bool)
        :param pulumi.Input[pulumi.InputType['ClusterGkeConfigArgs']] gke_config: The Google GKE configuration for `gke` Clusters. Conflicts with `aks_config`, `eks_config`, `k3s_config` and `rke_config` (list maxitems:1)
        :param pulumi.Input[bool] istio_enabled: (Computed) Is istio enabled at cluster? Just for Rancher v2.3.x and above (bool)
        :param pulumi.Input[pulumi.InputType['ClusterK3sConfigArgs']] k3s_config: The K3S configuration for `k3s` imported Clusters. Conflicts with `aks_config`, `eks_config`, `gke_config` and `rke_config` (list maxitems:1)
        :param pulumi.Input[str] kube_config: (Computed/Sensitive) Kube Config generated for the cluster (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for cluster registration token object (map)
        :param pulumi.Input[str] name: Name of cluster registration token (string)
        :param pulumi.Input[pulumi.InputType['ClusterRkeConfigArgs']] rke_config: The RKE configuration for `rke` Clusters. Conflicts with `aks_config`, `eks_config`, `gke_config` and `k3s_config` (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['ClusterScheduledClusterScanArgs']] scheduled_cluster_scan: Cluster scheduled cis scan. For Rancher v2.4.0 or above (List maxitems:1)
        :param pulumi.Input[str] system_project_id: (Computed) System project ID for the cluster (string)
        :param pulumi.Input[bool] windows_prefered_cluster: Windows preferred cluster. Default: `false` (bool)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["aks_config"] = aks_config
        __props__["annotations"] = annotations
        __props__["cluster_auth_endpoint"] = cluster_auth_endpoint
        __props__["cluster_monitoring_input"] = cluster_monitoring_input
        __props__["cluster_registration_token"] = cluster_registration_token
        __props__["cluster_template_answers"] = cluster_template_answers
        __props__["cluster_template_id"] = cluster_template_id
        __props__["cluster_template_questions"] = cluster_template_questions
        __props__["cluster_template_revision_id"] = cluster_template_revision_id
        __props__["default_pod_security_policy_template_id"] = default_pod_security_policy_template_id
        __props__["default_project_id"] = default_project_id
        __props__["description"] = description
        __props__["desired_agent_image"] = desired_agent_image
        __props__["desired_auth_image"] = desired_auth_image
        __props__["docker_root_dir"] = docker_root_dir
        __props__["driver"] = driver
        __props__["eks_config"] = eks_config
        __props__["enable_cluster_alerting"] = enable_cluster_alerting
        __props__["enable_cluster_istio"] = enable_cluster_istio
        __props__["enable_cluster_monitoring"] = enable_cluster_monitoring
        __props__["enable_network_policy"] = enable_network_policy
        __props__["gke_config"] = gke_config
        __props__["istio_enabled"] = istio_enabled
        __props__["k3s_config"] = k3s_config
        __props__["kube_config"] = kube_config
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["rke_config"] = rke_config
        __props__["scheduled_cluster_scan"] = scheduled_cluster_scan
        __props__["system_project_id"] = system_project_id
        __props__["windows_prefered_cluster"] = windows_prefered_cluster
        return Cluster(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="aksConfig")
    def aks_config(self) -> pulumi.Output[Optional['outputs.ClusterAksConfig']]:
        """
        The Azure AKS configuration for `aks` Clusters. Conflicts with `eks_config`, `gke_config`, `k3s_config` and `rke_config` (list maxitems:1)
        """
        return pulumi.get(self, "aks_config")

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for cluster registration token object (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="clusterAuthEndpoint")
    def cluster_auth_endpoint(self) -> pulumi.Output['outputs.ClusterClusterAuthEndpoint']:
        """
        Enabling the [local cluster authorized endpoint](https://rancher.com/docs/rancher/v2.x/en/cluster-provisioning/rke-clusters/options/#local-cluster-auth-endpoint) allows direct communication with the cluster, bypassing the Rancher API proxy. (list maxitems:1)
        """
        return pulumi.get(self, "cluster_auth_endpoint")

    @property
    @pulumi.getter(name="clusterMonitoringInput")
    def cluster_monitoring_input(self) -> pulumi.Output[Optional['outputs.ClusterClusterMonitoringInput']]:
        """
        Cluster monitoring config. Any parameter defined in [rancher-monitoring charts](https://github.com/rancher/system-charts/tree/dev/charts/rancher-monitoring) could be configured  (list maxitems:1)
        """
        return pulumi.get(self, "cluster_monitoring_input")

    @property
    @pulumi.getter(name="clusterRegistrationToken")
    def cluster_registration_token(self) -> pulumi.Output['outputs.ClusterClusterRegistrationToken']:
        """
        (Computed) Cluster Registration Token generated for the cluster (list maxitems:1)
        """
        return pulumi.get(self, "cluster_registration_token")

    @property
    @pulumi.getter(name="clusterTemplateAnswers")
    def cluster_template_answers(self) -> pulumi.Output['outputs.ClusterClusterTemplateAnswers']:
        """
        Cluster template answers. Just for Rancher v2.3.x and above (list maxitems:1)
        """
        return pulumi.get(self, "cluster_template_answers")

    @property
    @pulumi.getter(name="clusterTemplateId")
    def cluster_template_id(self) -> pulumi.Output[Optional[str]]:
        """
        Cluster template ID. Just for Rancher v2.3.x and above (string)
        """
        return pulumi.get(self, "cluster_template_id")

    @property
    @pulumi.getter(name="clusterTemplateQuestions")
    def cluster_template_questions(self) -> pulumi.Output[Optional[List['outputs.ClusterClusterTemplateQuestion']]]:
        """
        Cluster template questions. Just for Rancher v2.3.x and above (list)
        """
        return pulumi.get(self, "cluster_template_questions")

    @property
    @pulumi.getter(name="clusterTemplateRevisionId")
    def cluster_template_revision_id(self) -> pulumi.Output[Optional[str]]:
        """
        Cluster template revision ID. Just for Rancher v2.3.x and above (string)
        """
        return pulumi.get(self, "cluster_template_revision_id")

    @property
    @pulumi.getter(name="defaultPodSecurityPolicyTemplateId")
    def default_pod_security_policy_template_id(self) -> pulumi.Output[str]:
        """
        [Default pod security policy template id](https://rancher.com/docs/rancher/v2.x/en/cluster-provisioning/rke-clusters/options/#pod-security-policy-support) (string)
        """
        return pulumi.get(self, "default_pod_security_policy_template_id")

    @property
    @pulumi.getter(name="defaultProjectId")
    def default_project_id(self) -> pulumi.Output[str]:
        """
        (Computed) Default project ID for the cluster (string)
        """
        return pulumi.get(self, "default_project_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        An optional description of this cluster (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="desiredAgentImage")
    def desired_agent_image(self) -> pulumi.Output[str]:
        """
        Desired agent image. Just for Rancher v2.3.x and above (string)
        """
        return pulumi.get(self, "desired_agent_image")

    @property
    @pulumi.getter(name="desiredAuthImage")
    def desired_auth_image(self) -> pulumi.Output[str]:
        """
        Desired auth image. Just for Rancher v2.3.x and above (string)
        """
        return pulumi.get(self, "desired_auth_image")

    @property
    @pulumi.getter(name="dockerRootDir")
    def docker_root_dir(self) -> pulumi.Output[str]:
        """
        Desired auth image. Just for Rancher v2.3.x and above (string)
        """
        return pulumi.get(self, "docker_root_dir")

    @property
    @pulumi.getter
    def driver(self) -> pulumi.Output[str]:
        """
        (Computed) The driver used for the Cluster. `imported`, `azurekubernetesservice`, `amazonelasticcontainerservice`, `googlekubernetesengine` and `rancherKubernetesEngine` are supported (string)
        """
        return pulumi.get(self, "driver")

    @property
    @pulumi.getter(name="eksConfig")
    def eks_config(self) -> pulumi.Output[Optional['outputs.ClusterEksConfig']]:
        """
        The Amazon EKS configuration for `eks` Clusters. Conflicts with `aks_config`, `gke_config`, `k3s_config` and `rke_config` (list maxitems:1)
        """
        return pulumi.get(self, "eks_config")

    @property
    @pulumi.getter(name="enableClusterAlerting")
    def enable_cluster_alerting(self) -> pulumi.Output[bool]:
        """
        Enable built-in cluster alerting (bool)
        """
        return pulumi.get(self, "enable_cluster_alerting")

    @property
    @pulumi.getter(name="enableClusterIstio")
    def enable_cluster_istio(self) -> pulumi.Output[bool]:
        """
        Deploy istio on `system` project and `istio-system` namespace, using App resource instead. See above example.
        """
        return pulumi.get(self, "enable_cluster_istio")

    @property
    @pulumi.getter(name="enableClusterMonitoring")
    def enable_cluster_monitoring(self) -> pulumi.Output[bool]:
        """
        Enable built-in cluster monitoring (bool)
        """
        return pulumi.get(self, "enable_cluster_monitoring")

    @property
    @pulumi.getter(name="enableNetworkPolicy")
    def enable_network_policy(self) -> pulumi.Output[bool]:
        """
        Enable project network isolation (bool)
        """
        return pulumi.get(self, "enable_network_policy")

    @property
    @pulumi.getter(name="gkeConfig")
    def gke_config(self) -> pulumi.Output[Optional['outputs.ClusterGkeConfig']]:
        """
        The Google GKE configuration for `gke` Clusters. Conflicts with `aks_config`, `eks_config`, `k3s_config` and `rke_config` (list maxitems:1)
        """
        return pulumi.get(self, "gke_config")

    @property
    @pulumi.getter(name="istioEnabled")
    def istio_enabled(self) -> pulumi.Output[bool]:
        """
        (Computed) Is istio enabled at cluster? Just for Rancher v2.3.x and above (bool)
        """
        return pulumi.get(self, "istio_enabled")

    @property
    @pulumi.getter(name="k3sConfig")
    def k3s_config(self) -> pulumi.Output['outputs.ClusterK3sConfig']:
        """
        The K3S configuration for `k3s` imported Clusters. Conflicts with `aks_config`, `eks_config`, `gke_config` and `rke_config` (list maxitems:1)
        """
        return pulumi.get(self, "k3s_config")

    @property
    @pulumi.getter(name="kubeConfig")
    def kube_config(self) -> pulumi.Output[str]:
        """
        (Computed/Sensitive) Kube Config generated for the cluster (string)
        """
        return pulumi.get(self, "kube_config")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for cluster registration token object (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of cluster registration token (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="rkeConfig")
    def rke_config(self) -> pulumi.Output['outputs.ClusterRkeConfig']:
        """
        The RKE configuration for `rke` Clusters. Conflicts with `aks_config`, `eks_config`, `gke_config` and `k3s_config` (list maxitems:1)
        """
        return pulumi.get(self, "rke_config")

    @property
    @pulumi.getter(name="scheduledClusterScan")
    def scheduled_cluster_scan(self) -> pulumi.Output['outputs.ClusterScheduledClusterScan']:
        """
        Cluster scheduled cis scan. For Rancher v2.4.0 or above (List maxitems:1)
        """
        return pulumi.get(self, "scheduled_cluster_scan")

    @property
    @pulumi.getter(name="systemProjectId")
    def system_project_id(self) -> pulumi.Output[str]:
        """
        (Computed) System project ID for the cluster (string)
        """
        return pulumi.get(self, "system_project_id")

    @property
    @pulumi.getter(name="windowsPreferedCluster")
    def windows_prefered_cluster(self) -> pulumi.Output[Optional[bool]]:
        """
        Windows preferred cluster. Default: `false` (bool)
        """
        return pulumi.get(self, "windows_prefered_cluster")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

