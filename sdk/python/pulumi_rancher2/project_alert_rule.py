# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class ProjectAlertRule(pulumi.CustomResource):
    annotations: pulumi.Output[dict]
    """
    The project alert rule annotations (map)
    """
    group_id: pulumi.Output[str]
    """
    The project alert rule alert group ID (string)
    """
    group_interval_seconds: pulumi.Output[float]
    """
    The project alert rule group interval seconds. Default: `180` (int)
    """
    group_wait_seconds: pulumi.Output[float]
    """
    The project alert rule group wait seconds. Default: `180` (int)
    """
    inherited: pulumi.Output[bool]
    """
    The project alert rule inherited. Default: `true` (bool)
    """
    labels: pulumi.Output[dict]
    """
    The project alert rule labels (map)
    """
    metric_rule: pulumi.Output[dict]
    """
    The project alert rule metric rule. ConflictsWith: `"pod_rule", "workload_rule"`` (list Maxitems:1)

      * `comparison` (`str`) - Metric rule comparison. Supported values : `"equal" | "greater-or-equal" | "greater-than" | "less-or-equal" | "less-than" | "not-equal" | "has-value"`. Default: `equal`  (string)
      * `description` (`str`) - Metric rule description (string)
      * `duration` (`str`) - Metric rule duration (string)
      * `expression` (`str`) - Metric rule expression (string)
      * `thresholdValue` (`float`) - Metric rule threshold value (float64)
    """
    name: pulumi.Output[str]
    """
    The project alert rule name (string)
    """
    pod_rule: pulumi.Output[dict]
    """
    The project alert rule pod rule. ConflictsWith: `"metric_rule", "workload_rule"`` (list Maxitems:1)

      * `condition` (`str`) - Pod rule condition. Supported values : `"notrunning" | "notscheduled" | "restarts"`. Default: `notrunning` (string)
      * `podId` (`str`) - Pod ID (string)
      * `restartIntervalSeconds` (`float`) - Pod rule restart interval seconds. Default: `300` (int)
      * `restartTimes` (`float`) - Pod rule restart times. Default: `3`  (int)
    """
    project_id: pulumi.Output[str]
    """
    The project id where create project alert rule (string)
    """
    repeat_interval_seconds: pulumi.Output[float]
    """
    The project alert rule wait seconds. Default: `3600` (int)
    """
    severity: pulumi.Output[str]
    """
    The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
    """
    workload_rule: pulumi.Output[dict]
    """
    The project alert rule workload rule. ConflictsWith: `"metric_rule", "pod_rule"`` (list Maxitems:1)

      * `availablePercentage` (`float`) - Workload rule available percentage. Default: `70` (int)
      * `selector` (`dict`) - Workload rule selector (map)
      * `workloadId` (`str`) - Workload ID (string)
    """
    def __init__(__self__, resource_name, opts=None, annotations=None, group_id=None, group_interval_seconds=None, group_wait_seconds=None, inherited=None, labels=None, metric_rule=None, name=None, pod_rule=None, project_id=None, repeat_interval_seconds=None, severity=None, workload_rule=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Rancher v2 Project Alert Rule resource. This can be used to create Project Alert Rule for Rancher v2 environments and retrieve their information.



        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] annotations: The project alert rule annotations (map)
        :param pulumi.Input[str] group_id: The project alert rule alert group ID (string)
        :param pulumi.Input[float] group_interval_seconds: The project alert rule group interval seconds. Default: `180` (int)
        :param pulumi.Input[float] group_wait_seconds: The project alert rule group wait seconds. Default: `180` (int)
        :param pulumi.Input[bool] inherited: The project alert rule inherited. Default: `true` (bool)
        :param pulumi.Input[dict] labels: The project alert rule labels (map)
        :param pulumi.Input[dict] metric_rule: The project alert rule metric rule. ConflictsWith: `"pod_rule", "workload_rule"`` (list Maxitems:1)
        :param pulumi.Input[str] name: The project alert rule name (string)
        :param pulumi.Input[dict] pod_rule: The project alert rule pod rule. ConflictsWith: `"metric_rule", "workload_rule"`` (list Maxitems:1)
        :param pulumi.Input[str] project_id: The project id where create project alert rule (string)
        :param pulumi.Input[float] repeat_interval_seconds: The project alert rule wait seconds. Default: `3600` (int)
        :param pulumi.Input[str] severity: The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        :param pulumi.Input[dict] workload_rule: The project alert rule workload rule. ConflictsWith: `"metric_rule", "pod_rule"`` (list Maxitems:1)

        The **metric_rule** object supports the following:

          * `comparison` (`pulumi.Input[str]`) - Metric rule comparison. Supported values : `"equal" | "greater-or-equal" | "greater-than" | "less-or-equal" | "less-than" | "not-equal" | "has-value"`. Default: `equal`  (string)
          * `description` (`pulumi.Input[str]`) - Metric rule description (string)
          * `duration` (`pulumi.Input[str]`) - Metric rule duration (string)
          * `expression` (`pulumi.Input[str]`) - Metric rule expression (string)
          * `thresholdValue` (`pulumi.Input[float]`) - Metric rule threshold value (float64)

        The **pod_rule** object supports the following:

          * `condition` (`pulumi.Input[str]`) - Pod rule condition. Supported values : `"notrunning" | "notscheduled" | "restarts"`. Default: `notrunning` (string)
          * `podId` (`pulumi.Input[str]`) - Pod ID (string)
          * `restartIntervalSeconds` (`pulumi.Input[float]`) - Pod rule restart interval seconds. Default: `300` (int)
          * `restartTimes` (`pulumi.Input[float]`) - Pod rule restart times. Default: `3`  (int)

        The **workload_rule** object supports the following:

          * `availablePercentage` (`pulumi.Input[float]`) - Workload rule available percentage. Default: `70` (int)
          * `selector` (`pulumi.Input[dict]`) - Workload rule selector (map)
          * `workloadId` (`pulumi.Input[str]`) - Workload ID (string)
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
            opts.version = utilities.get_version()
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
    def get(resource_name, id, opts=None, annotations=None, group_id=None, group_interval_seconds=None, group_wait_seconds=None, inherited=None, labels=None, metric_rule=None, name=None, pod_rule=None, project_id=None, repeat_interval_seconds=None, severity=None, workload_rule=None):
        """
        Get an existing ProjectAlertRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] annotations: The project alert rule annotations (map)
        :param pulumi.Input[str] group_id: The project alert rule alert group ID (string)
        :param pulumi.Input[float] group_interval_seconds: The project alert rule group interval seconds. Default: `180` (int)
        :param pulumi.Input[float] group_wait_seconds: The project alert rule group wait seconds. Default: `180` (int)
        :param pulumi.Input[bool] inherited: The project alert rule inherited. Default: `true` (bool)
        :param pulumi.Input[dict] labels: The project alert rule labels (map)
        :param pulumi.Input[dict] metric_rule: The project alert rule metric rule. ConflictsWith: `"pod_rule", "workload_rule"`` (list Maxitems:1)
        :param pulumi.Input[str] name: The project alert rule name (string)
        :param pulumi.Input[dict] pod_rule: The project alert rule pod rule. ConflictsWith: `"metric_rule", "workload_rule"`` (list Maxitems:1)
        :param pulumi.Input[str] project_id: The project id where create project alert rule (string)
        :param pulumi.Input[float] repeat_interval_seconds: The project alert rule wait seconds. Default: `3600` (int)
        :param pulumi.Input[str] severity: The project alert rule severity. Supported values : `"critical" | "info" | "warning"`. Default: `critical` (string)
        :param pulumi.Input[dict] workload_rule: The project alert rule workload rule. ConflictsWith: `"metric_rule", "pod_rule"`` (list Maxitems:1)

        The **metric_rule** object supports the following:

          * `comparison` (`pulumi.Input[str]`) - Metric rule comparison. Supported values : `"equal" | "greater-or-equal" | "greater-than" | "less-or-equal" | "less-than" | "not-equal" | "has-value"`. Default: `equal`  (string)
          * `description` (`pulumi.Input[str]`) - Metric rule description (string)
          * `duration` (`pulumi.Input[str]`) - Metric rule duration (string)
          * `expression` (`pulumi.Input[str]`) - Metric rule expression (string)
          * `thresholdValue` (`pulumi.Input[float]`) - Metric rule threshold value (float64)

        The **pod_rule** object supports the following:

          * `condition` (`pulumi.Input[str]`) - Pod rule condition. Supported values : `"notrunning" | "notscheduled" | "restarts"`. Default: `notrunning` (string)
          * `podId` (`pulumi.Input[str]`) - Pod ID (string)
          * `restartIntervalSeconds` (`pulumi.Input[float]`) - Pod rule restart interval seconds. Default: `300` (int)
          * `restartTimes` (`pulumi.Input[float]`) - Pod rule restart times. Default: `3`  (int)

        The **workload_rule** object supports the following:

          * `availablePercentage` (`pulumi.Input[float]`) - Workload rule available percentage. Default: `70` (int)
          * `selector` (`pulumi.Input[dict]`) - Workload rule selector (map)
          * `workloadId` (`pulumi.Input[str]`) - Workload ID (string)
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
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

