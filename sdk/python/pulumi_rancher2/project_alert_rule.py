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

__all__ = ['ProjectAlertRule']


class ProjectAlertRule(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 group_interval_seconds: Optional[pulumi.Input[float]] = None,
                 group_wait_seconds: Optional[pulumi.Input[float]] = None,
                 inherited: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 metric_rule: Optional[pulumi.Input[pulumi.InputType['ProjectAlertRuleMetricRuleArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 pod_rule: Optional[pulumi.Input[pulumi.InputType['ProjectAlertRulePodRuleArgs']]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 repeat_interval_seconds: Optional[pulumi.Input[float]] = None,
                 severity: Optional[pulumi.Input[str]] = None,
                 workload_rule: Optional[pulumi.Input[pulumi.InputType['ProjectAlertRuleWorkloadRuleArgs']]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Rancher v2 Project Alert Rule resource. This can be used to create Project Alert Rule for Rancher v2 environments and retrieve their information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new Rancher2 Project
        foo_project = rancher2.Project("fooProject",
            cluster_id="<cluster_id>",
            container_resource_limit=rancher2.ProjectContainerResourceLimitArgs(
                limits_cpu="20m",
                limits_memory="20Mi",
                requests_cpu="1m",
                requests_memory="1Mi",
            ),
            description="Terraform project ",
            resource_quota=rancher2.ProjectResourceQuotaArgs(
                namespace_default_limit=rancher2.ProjectResourceQuotaNamespaceDefaultLimitArgs(
                    limits_cpu="500m",
                    limits_memory="500Mi",
                    requests_storage="1Gi",
                ),
                project_limit=rancher2.ProjectResourceQuotaProjectLimitArgs(
                    limits_cpu="2000m",
                    limits_memory="2000Mi",
                    requests_storage="2Gi",
                ),
            ))
        # Create a new Rancher2 Project Alert Group
        foo_project_alert_group = rancher2.ProjectAlertGroup("fooProjectAlertGroup",
            description="Terraform project alert group",
            group_interval_seconds=300,
            project_id=foo_project.id,
            repeat_interval_seconds=3600)
        # Create a new Rancher2 Project Alert Rule
        foo_project_alert_rule = rancher2.ProjectAlertRule("fooProjectAlertRule",
            group_id=foo_project_alert_group.id,
            group_interval_seconds=600,
            project_id=foo_project_alert_group.project_id,
            repeat_interval_seconds=6000)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: The project alert rule annotations (map)
        :param pulumi.Input[str] group_id: The project alert rule alert group ID (string)
        :param pulumi.Input[float] group_interval_seconds: The project alert rule group interval seconds. Default: `180` (int)
        :param pulumi.Input[float] group_wait_seconds: The project alert rule group wait seconds. Default: `180` (int)
        :param pulumi.Input[bool] inherited: The project alert rule inherited. Default: `true` (bool)
        :param pulumi.Input[Mapping[str, Any]] labels: The project alert rule labels (map)
        :param pulumi.Input[pulumi.InputType['ProjectAlertRuleMetricRuleArgs']] metric_rule: The project alert rule metric rule. ConflictsWith: `"pod_rule", "workload_rule"`` (list Maxitems:1)
        :param pulumi.Input[str] name: The project alert rule name (string)
        :param pulumi.Input[pulumi.InputType['ProjectAlertRulePodRuleArgs']] pod_rule: The project alert rule pod rule. ConflictsWith: `"metric_rule", "workload_rule"`` (list Maxitems:1)
        :param pulumi.Input[str] project_id: The project id where create project alert rule (string)
        :param pulumi.Input[float] repeat_interval_seconds: The project alert rule wait seconds. Default: `3600` (int)
        :param pulumi.Input[str] severity: The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        :param pulumi.Input[pulumi.InputType['ProjectAlertRuleWorkloadRuleArgs']] workload_rule: The project alert rule workload rule. ConflictsWith: `"metric_rule", "pod_rule"`` (list Maxitems:1)
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
            if group_id is None:
                raise TypeError("Missing required property 'group_id'")
            __props__['group_id'] = group_id
            __props__['group_interval_seconds'] = group_interval_seconds
            __props__['group_wait_seconds'] = group_wait_seconds
            __props__['inherited'] = inherited
            __props__['labels'] = labels
            __props__['metric_rule'] = metric_rule
            __props__['name'] = name
            __props__['pod_rule'] = pod_rule
            if project_id is None:
                raise TypeError("Missing required property 'project_id'")
            __props__['project_id'] = project_id
            __props__['repeat_interval_seconds'] = repeat_interval_seconds
            __props__['severity'] = severity
            __props__['workload_rule'] = workload_rule
        super(ProjectAlertRule, __self__).__init__(
            'rancher2:index/projectAlertRule:ProjectAlertRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            group_id: Optional[pulumi.Input[str]] = None,
            group_interval_seconds: Optional[pulumi.Input[float]] = None,
            group_wait_seconds: Optional[pulumi.Input[float]] = None,
            inherited: Optional[pulumi.Input[bool]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            metric_rule: Optional[pulumi.Input[pulumi.InputType['ProjectAlertRuleMetricRuleArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            pod_rule: Optional[pulumi.Input[pulumi.InputType['ProjectAlertRulePodRuleArgs']]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            repeat_interval_seconds: Optional[pulumi.Input[float]] = None,
            severity: Optional[pulumi.Input[str]] = None,
            workload_rule: Optional[pulumi.Input[pulumi.InputType['ProjectAlertRuleWorkloadRuleArgs']]] = None) -> 'ProjectAlertRule':
        """
        Get an existing ProjectAlertRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: The project alert rule annotations (map)
        :param pulumi.Input[str] group_id: The project alert rule alert group ID (string)
        :param pulumi.Input[float] group_interval_seconds: The project alert rule group interval seconds. Default: `180` (int)
        :param pulumi.Input[float] group_wait_seconds: The project alert rule group wait seconds. Default: `180` (int)
        :param pulumi.Input[bool] inherited: The project alert rule inherited. Default: `true` (bool)
        :param pulumi.Input[Mapping[str, Any]] labels: The project alert rule labels (map)
        :param pulumi.Input[pulumi.InputType['ProjectAlertRuleMetricRuleArgs']] metric_rule: The project alert rule metric rule. ConflictsWith: `"pod_rule", "workload_rule"`` (list Maxitems:1)
        :param pulumi.Input[str] name: The project alert rule name (string)
        :param pulumi.Input[pulumi.InputType['ProjectAlertRulePodRuleArgs']] pod_rule: The project alert rule pod rule. ConflictsWith: `"metric_rule", "workload_rule"`` (list Maxitems:1)
        :param pulumi.Input[str] project_id: The project id where create project alert rule (string)
        :param pulumi.Input[float] repeat_interval_seconds: The project alert rule wait seconds. Default: `3600` (int)
        :param pulumi.Input[str] severity: The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        :param pulumi.Input[pulumi.InputType['ProjectAlertRuleWorkloadRuleArgs']] workload_rule: The project alert rule workload rule. ConflictsWith: `"metric_rule", "pod_rule"`` (list Maxitems:1)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["annotations"] = annotations
        __props__["group_id"] = group_id
        __props__["group_interval_seconds"] = group_interval_seconds
        __props__["group_wait_seconds"] = group_wait_seconds
        __props__["inherited"] = inherited
        __props__["labels"] = labels
        __props__["metric_rule"] = metric_rule
        __props__["name"] = name
        __props__["pod_rule"] = pod_rule
        __props__["project_id"] = project_id
        __props__["repeat_interval_seconds"] = repeat_interval_seconds
        __props__["severity"] = severity
        __props__["workload_rule"] = workload_rule
        return ProjectAlertRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, Any]:
        """
        The project alert rule annotations (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> str:
        """
        The project alert rule alert group ID (string)
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupIntervalSeconds")
    def group_interval_seconds(self) -> Optional[float]:
        """
        The project alert rule group interval seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_interval_seconds")

    @property
    @pulumi.getter(name="groupWaitSeconds")
    def group_wait_seconds(self) -> Optional[float]:
        """
        The project alert rule group wait seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_wait_seconds")

    @property
    @pulumi.getter
    def inherited(self) -> Optional[bool]:
        """
        The project alert rule inherited. Default: `true` (bool)
        """
        return pulumi.get(self, "inherited")

    @property
    @pulumi.getter
    def labels(self) -> Mapping[str, Any]:
        """
        The project alert rule labels (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="metricRule")
    def metric_rule(self) -> Optional['outputs.ProjectAlertRuleMetricRule']:
        """
        The project alert rule metric rule. ConflictsWith: `"pod_rule", "workload_rule"`` (list Maxitems:1)
        """
        return pulumi.get(self, "metric_rule")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The project alert rule name (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="podRule")
    def pod_rule(self) -> Optional['outputs.ProjectAlertRulePodRule']:
        """
        The project alert rule pod rule. ConflictsWith: `"metric_rule", "workload_rule"`` (list Maxitems:1)
        """
        return pulumi.get(self, "pod_rule")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        The project id where create project alert rule (string)
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="repeatIntervalSeconds")
    def repeat_interval_seconds(self) -> Optional[float]:
        """
        The project alert rule wait seconds. Default: `3600` (int)
        """
        return pulumi.get(self, "repeat_interval_seconds")

    @property
    @pulumi.getter
    def severity(self) -> Optional[str]:
        """
        The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        """
        return pulumi.get(self, "severity")

    @property
    @pulumi.getter(name="workloadRule")
    def workload_rule(self) -> Optional['outputs.ProjectAlertRuleWorkloadRule']:
        """
        The project alert rule workload rule. ConflictsWith: `"metric_rule", "pod_rule"`` (list Maxitems:1)
        """
        return pulumi.get(self, "workload_rule")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

