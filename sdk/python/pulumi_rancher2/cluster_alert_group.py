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

__all__ = ['ClusterAlertGroup']


class ClusterAlertGroup(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 group_interval_seconds: Optional[pulumi.Input[float]] = None,
                 group_wait_seconds: Optional[pulumi.Input[float]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 recipients: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['ClusterAlertGroupRecipientArgs']]]]] = None,
                 repeat_interval_seconds: Optional[pulumi.Input[float]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Rancher v2 Cluster Alert Group resource. This can be used to create Cluster Alert Group for Rancher v2 environments and retrieve their information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new Rancher2 Cluster Alert Group
        foo = rancher2.ClusterAlertGroup("foo",
            cluster_id="<cluster_id>",
            description="Terraform cluster alert group",
            group_interval_seconds=300,
            repeat_interval_seconds=3600)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: The cluster alert group annotations (map)
        :param pulumi.Input[str] cluster_id: The cluster id where create cluster alert group (string)
        :param pulumi.Input[str] description: The cluster alert group description (string)
        :param pulumi.Input[float] group_interval_seconds: The cluster alert group interval seconds. Default: `180` (int)
        :param pulumi.Input[float] group_wait_seconds: The cluster alert group wait seconds. Default: `180` (int)
        :param pulumi.Input[Mapping[str, Any]] labels: The cluster alert group labels (map)
        :param pulumi.Input[str] name: The cluster alert group name (string)
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['ClusterAlertGroupRecipientArgs']]]] recipients: The cluster alert group recipients (list)
        :param pulumi.Input[float] repeat_interval_seconds: The cluster alert group wait seconds. Default: `3600` (int)
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
            __props__['description'] = description
            __props__['group_interval_seconds'] = group_interval_seconds
            __props__['group_wait_seconds'] = group_wait_seconds
            __props__['labels'] = labels
            __props__['name'] = name
            __props__['recipients'] = recipients
            __props__['repeat_interval_seconds'] = repeat_interval_seconds
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="rancher2:index/clusterAlterGroup:ClusterAlterGroup")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(ClusterAlertGroup, __self__).__init__(
            'rancher2:index/clusterAlertGroup:ClusterAlertGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            group_interval_seconds: Optional[pulumi.Input[float]] = None,
            group_wait_seconds: Optional[pulumi.Input[float]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            recipients: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['ClusterAlertGroupRecipientArgs']]]]] = None,
            repeat_interval_seconds: Optional[pulumi.Input[float]] = None) -> 'ClusterAlertGroup':
        """
        Get an existing ClusterAlertGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: The cluster alert group annotations (map)
        :param pulumi.Input[str] cluster_id: The cluster id where create cluster alert group (string)
        :param pulumi.Input[str] description: The cluster alert group description (string)
        :param pulumi.Input[float] group_interval_seconds: The cluster alert group interval seconds. Default: `180` (int)
        :param pulumi.Input[float] group_wait_seconds: The cluster alert group wait seconds. Default: `180` (int)
        :param pulumi.Input[Mapping[str, Any]] labels: The cluster alert group labels (map)
        :param pulumi.Input[str] name: The cluster alert group name (string)
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['ClusterAlertGroupRecipientArgs']]]] recipients: The cluster alert group recipients (list)
        :param pulumi.Input[float] repeat_interval_seconds: The cluster alert group wait seconds. Default: `3600` (int)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["annotations"] = annotations
        __props__["cluster_id"] = cluster_id
        __props__["description"] = description
        __props__["group_interval_seconds"] = group_interval_seconds
        __props__["group_wait_seconds"] = group_wait_seconds
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["recipients"] = recipients
        __props__["repeat_interval_seconds"] = repeat_interval_seconds
        return ClusterAlertGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, Any]:
        """
        The cluster alert group annotations (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        """
        The cluster id where create cluster alert group (string)
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        The cluster alert group description (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="groupIntervalSeconds")
    def group_interval_seconds(self) -> Optional[float]:
        """
        The cluster alert group interval seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_interval_seconds")

    @property
    @pulumi.getter(name="groupWaitSeconds")
    def group_wait_seconds(self) -> Optional[float]:
        """
        The cluster alert group wait seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_wait_seconds")

    @property
    @pulumi.getter
    def labels(self) -> Mapping[str, Any]:
        """
        The cluster alert group labels (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The cluster alert group name (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def recipients(self) -> Optional[List['outputs.ClusterAlertGroupRecipient']]:
        """
        The cluster alert group recipients (list)
        """
        return pulumi.get(self, "recipients")

    @property
    @pulumi.getter(name="repeatIntervalSeconds")
    def repeat_interval_seconds(self) -> Optional[float]:
        """
        The cluster alert group wait seconds. Default: `3600` (int)
        """
        return pulumi.get(self, "repeat_interval_seconds")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

