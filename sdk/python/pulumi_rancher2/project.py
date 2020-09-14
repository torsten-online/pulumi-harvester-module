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

__all__ = ['Project']


class Project(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 container_resource_limit: Optional[pulumi.Input[pulumi.InputType['ProjectContainerResourceLimitArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enable_project_monitoring: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 pod_security_policy_template_id: Optional[pulumi.Input[str]] = None,
                 project_monitoring_input: Optional[pulumi.Input[pulumi.InputType['ProjectProjectMonitoringInputArgs']]] = None,
                 resource_quota: Optional[pulumi.Input[pulumi.InputType['ProjectResourceQuotaArgs']]] = None,
                 wait_for_cluster: Optional[pulumi.Input[bool]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a Project resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource
        :param pulumi.Input[bool] enable_project_monitoring: Enable built-in project monitoring
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource
        :param pulumi.Input[pulumi.InputType['ProjectProjectMonitoringInputArgs']] project_monitoring_input: Cluster monitoring configuration
        :param pulumi.Input[bool] wait_for_cluster: Wait for cluster becomes active
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

            __props__['annotations'] = annotations
            if cluster_id is None:
                raise TypeError("Missing required property 'cluster_id'")
            __props__['cluster_id'] = cluster_id
            __props__['container_resource_limit'] = container_resource_limit
            __props__['description'] = description
            __props__['enable_project_monitoring'] = enable_project_monitoring
            __props__['labels'] = labels
            __props__['name'] = name
            __props__['pod_security_policy_template_id'] = pod_security_policy_template_id
            __props__['project_monitoring_input'] = project_monitoring_input
            __props__['resource_quota'] = resource_quota
            __props__['wait_for_cluster'] = wait_for_cluster
        super(Project, __self__).__init__(
            'rancher2:index/project:Project',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            container_resource_limit: Optional[pulumi.Input[pulumi.InputType['ProjectContainerResourceLimitArgs']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            enable_project_monitoring: Optional[pulumi.Input[bool]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            pod_security_policy_template_id: Optional[pulumi.Input[str]] = None,
            project_monitoring_input: Optional[pulumi.Input[pulumi.InputType['ProjectProjectMonitoringInputArgs']]] = None,
            resource_quota: Optional[pulumi.Input[pulumi.InputType['ProjectResourceQuotaArgs']]] = None,
            wait_for_cluster: Optional[pulumi.Input[bool]] = None) -> 'Project':
        """
        Get an existing Project resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource
        :param pulumi.Input[bool] enable_project_monitoring: Enable built-in project monitoring
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource
        :param pulumi.Input[pulumi.InputType['ProjectProjectMonitoringInputArgs']] project_monitoring_input: Cluster monitoring configuration
        :param pulumi.Input[bool] wait_for_cluster: Wait for cluster becomes active
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["annotations"] = annotations
        __props__["cluster_id"] = cluster_id
        __props__["container_resource_limit"] = container_resource_limit
        __props__["description"] = description
        __props__["enable_project_monitoring"] = enable_project_monitoring
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["pod_security_policy_template_id"] = pod_security_policy_template_id
        __props__["project_monitoring_input"] = project_monitoring_input
        __props__["resource_quota"] = resource_quota
        __props__["wait_for_cluster"] = wait_for_cluster
        return Project(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations of the resource
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="containerResourceLimit")
    def container_resource_limit(self) -> pulumi.Output[Optional['outputs.ProjectContainerResourceLimit']]:
        return pulumi.get(self, "container_resource_limit")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="enableProjectMonitoring")
    def enable_project_monitoring(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable built-in project monitoring
        """
        return pulumi.get(self, "enable_project_monitoring")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels of the resource
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="podSecurityPolicyTemplateId")
    def pod_security_policy_template_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "pod_security_policy_template_id")

    @property
    @pulumi.getter(name="projectMonitoringInput")
    def project_monitoring_input(self) -> pulumi.Output[Optional['outputs.ProjectProjectMonitoringInput']]:
        """
        Cluster monitoring configuration
        """
        return pulumi.get(self, "project_monitoring_input")

    @property
    @pulumi.getter(name="resourceQuota")
    def resource_quota(self) -> pulumi.Output[Optional['outputs.ProjectResourceQuota']]:
        return pulumi.get(self, "resource_quota")

    @property
    @pulumi.getter(name="waitForCluster")
    def wait_for_cluster(self) -> pulumi.Output[Optional[bool]]:
        """
        Wait for cluster becomes active
        """
        return pulumi.get(self, "wait_for_cluster")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

