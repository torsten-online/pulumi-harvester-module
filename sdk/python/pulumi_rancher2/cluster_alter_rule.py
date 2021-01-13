# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['ClusterAlterRule']

warnings.warn("""rancher2.ClusterAlterRule has been deprecated in favor of rancher2.ClusterAlertRule""", DeprecationWarning)


class ClusterAlterRule(pulumi.CustomResource):
    warnings.warn("""rancher2.ClusterAlterRule has been deprecated in favor of rancher2.ClusterAlertRule""", DeprecationWarning)

    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 event_rule: Optional[pulumi.Input[pulumi.InputType['ClusterAlterRuleEventRuleArgs']]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 group_interval_seconds: Optional[pulumi.Input[int]] = None,
                 group_wait_seconds: Optional[pulumi.Input[int]] = None,
                 inherited: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 metric_rule: Optional[pulumi.Input[pulumi.InputType['ClusterAlterRuleMetricRuleArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 node_rule: Optional[pulumi.Input[pulumi.InputType['ClusterAlterRuleNodeRuleArgs']]] = None,
                 repeat_interval_seconds: Optional[pulumi.Input[int]] = None,
                 severity: Optional[pulumi.Input[str]] = None,
                 system_service_rule: Optional[pulumi.Input[pulumi.InputType['ClusterAlterRuleSystemServiceRuleArgs']]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a ClusterAlterRule resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource
        :param pulumi.Input[str] cluster_id: Alert rule cluster ID
        :param pulumi.Input[pulumi.InputType['ClusterAlterRuleEventRuleArgs']] event_rule: Alert event rule
        :param pulumi.Input[str] group_id: Alert rule group ID
        :param pulumi.Input[int] group_interval_seconds: Alert rule interval seconds
        :param pulumi.Input[int] group_wait_seconds: Alert rule wait seconds
        :param pulumi.Input[bool] inherited: Alert rule inherited
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource
        :param pulumi.Input[pulumi.InputType['ClusterAlterRuleMetricRuleArgs']] metric_rule: Alert metric rule
        :param pulumi.Input[str] name: Alert rule name
        :param pulumi.Input[pulumi.InputType['ClusterAlterRuleNodeRuleArgs']] node_rule: Alert node rule
        :param pulumi.Input[int] repeat_interval_seconds: Alert rule repeat interval seconds
        :param pulumi.Input[str] severity: Alert rule severity
        :param pulumi.Input[pulumi.InputType['ClusterAlterRuleSystemServiceRuleArgs']] system_service_rule: Alert system service rule
        """
        pulumi.log.warn("ClusterAlterRule is deprecated: rancher2.ClusterAlterRule has been deprecated in favor of rancher2.ClusterAlertRule")
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
            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__['cluster_id'] = cluster_id
            __props__['event_rule'] = event_rule
            if group_id is None and not opts.urn:
                raise TypeError("Missing required property 'group_id'")
            __props__['group_id'] = group_id
            __props__['group_interval_seconds'] = group_interval_seconds
            __props__['group_wait_seconds'] = group_wait_seconds
            __props__['inherited'] = inherited
            __props__['labels'] = labels
            __props__['metric_rule'] = metric_rule
            __props__['name'] = name
            __props__['node_rule'] = node_rule
            __props__['repeat_interval_seconds'] = repeat_interval_seconds
            __props__['severity'] = severity
            __props__['system_service_rule'] = system_service_rule
        super(ClusterAlterRule, __self__).__init__(
            'rancher2:index/clusterAlterRule:ClusterAlterRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            event_rule: Optional[pulumi.Input[pulumi.InputType['ClusterAlterRuleEventRuleArgs']]] = None,
            group_id: Optional[pulumi.Input[str]] = None,
            group_interval_seconds: Optional[pulumi.Input[int]] = None,
            group_wait_seconds: Optional[pulumi.Input[int]] = None,
            inherited: Optional[pulumi.Input[bool]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            metric_rule: Optional[pulumi.Input[pulumi.InputType['ClusterAlterRuleMetricRuleArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            node_rule: Optional[pulumi.Input[pulumi.InputType['ClusterAlterRuleNodeRuleArgs']]] = None,
            repeat_interval_seconds: Optional[pulumi.Input[int]] = None,
            severity: Optional[pulumi.Input[str]] = None,
            system_service_rule: Optional[pulumi.Input[pulumi.InputType['ClusterAlterRuleSystemServiceRuleArgs']]] = None) -> 'ClusterAlterRule':
        """
        Get an existing ClusterAlterRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource
        :param pulumi.Input[str] cluster_id: Alert rule cluster ID
        :param pulumi.Input[pulumi.InputType['ClusterAlterRuleEventRuleArgs']] event_rule: Alert event rule
        :param pulumi.Input[str] group_id: Alert rule group ID
        :param pulumi.Input[int] group_interval_seconds: Alert rule interval seconds
        :param pulumi.Input[int] group_wait_seconds: Alert rule wait seconds
        :param pulumi.Input[bool] inherited: Alert rule inherited
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource
        :param pulumi.Input[pulumi.InputType['ClusterAlterRuleMetricRuleArgs']] metric_rule: Alert metric rule
        :param pulumi.Input[str] name: Alert rule name
        :param pulumi.Input[pulumi.InputType['ClusterAlterRuleNodeRuleArgs']] node_rule: Alert node rule
        :param pulumi.Input[int] repeat_interval_seconds: Alert rule repeat interval seconds
        :param pulumi.Input[str] severity: Alert rule severity
        :param pulumi.Input[pulumi.InputType['ClusterAlterRuleSystemServiceRuleArgs']] system_service_rule: Alert system service rule
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["annotations"] = annotations
        __props__["cluster_id"] = cluster_id
        __props__["event_rule"] = event_rule
        __props__["group_id"] = group_id
        __props__["group_interval_seconds"] = group_interval_seconds
        __props__["group_wait_seconds"] = group_wait_seconds
        __props__["inherited"] = inherited
        __props__["labels"] = labels
        __props__["metric_rule"] = metric_rule
        __props__["name"] = name
        __props__["node_rule"] = node_rule
        __props__["repeat_interval_seconds"] = repeat_interval_seconds
        __props__["severity"] = severity
        __props__["system_service_rule"] = system_service_rule
        return ClusterAlterRule(resource_name, opts=opts, __props__=__props__)

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
        """
        Alert rule cluster ID
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="eventRule")
    def event_rule(self) -> pulumi.Output[Optional['outputs.ClusterAlterRuleEventRule']]:
        """
        Alert event rule
        """
        return pulumi.get(self, "event_rule")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Output[str]:
        """
        Alert rule group ID
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupIntervalSeconds")
    def group_interval_seconds(self) -> pulumi.Output[Optional[int]]:
        """
        Alert rule interval seconds
        """
        return pulumi.get(self, "group_interval_seconds")

    @property
    @pulumi.getter(name="groupWaitSeconds")
    def group_wait_seconds(self) -> pulumi.Output[Optional[int]]:
        """
        Alert rule wait seconds
        """
        return pulumi.get(self, "group_wait_seconds")

    @property
    @pulumi.getter
    def inherited(self) -> pulumi.Output[Optional[bool]]:
        """
        Alert rule inherited
        """
        return pulumi.get(self, "inherited")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels of the resource
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="metricRule")
    def metric_rule(self) -> pulumi.Output[Optional['outputs.ClusterAlterRuleMetricRule']]:
        """
        Alert metric rule
        """
        return pulumi.get(self, "metric_rule")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Alert rule name
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nodeRule")
    def node_rule(self) -> pulumi.Output[Optional['outputs.ClusterAlterRuleNodeRule']]:
        """
        Alert node rule
        """
        return pulumi.get(self, "node_rule")

    @property
    @pulumi.getter(name="repeatIntervalSeconds")
    def repeat_interval_seconds(self) -> pulumi.Output[Optional[int]]:
        """
        Alert rule repeat interval seconds
        """
        return pulumi.get(self, "repeat_interval_seconds")

    @property
    @pulumi.getter
    def severity(self) -> pulumi.Output[Optional[str]]:
        """
        Alert rule severity
        """
        return pulumi.get(self, "severity")

    @property
    @pulumi.getter(name="systemServiceRule")
    def system_service_rule(self) -> pulumi.Output[Optional['outputs.ClusterAlterRuleSystemServiceRule']]:
        """
        Alert system service rule
        """
        return pulumi.get(self, "system_service_rule")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

