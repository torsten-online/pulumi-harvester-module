# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class ClusterAlterGroup(pulumi.CustomResource):
    annotations: pulumi.Output[dict]
    """
    The cluster alert group annotations (map)
    """
    cluster_id: pulumi.Output[str]
    """
    The cluster id where create cluster alert group (string)
    """
    description: pulumi.Output[str]
    """
    The cluster alert group description (string)
    """
    group_interval_seconds: pulumi.Output[float]
    """
    The cluster alert group interval seconds. Default: `180` (int)
    """
    group_wait_seconds: pulumi.Output[float]
    """
    The cluster alert group wait seconds. Default: `180` (int)
    """
    labels: pulumi.Output[dict]
    """
    The cluster alert group labels (map)
    """
    name: pulumi.Output[str]
    """
    The cluster alert group name (string)
    """
    recipients: pulumi.Output[list]
    """
    The cluster alert group recipients (list)

      * `defaultRecipient` (`bool`) - Use notifier default recipient, overriding `recipient` argument if set.  Default: `false` (bool)
      * `notifierId` (`str`) - Recipient notifier ID (string)
      * `notifierType` (`str`) - Recipient notifier ID. Supported values : `"pagerduty" | "slack" | "email" | "webhook" | "wechat"` (string)
      * `recipient` (`str`) - Recipient (string)
    """
    repeat_interval_seconds: pulumi.Output[float]
    """
    The cluster alert group wait seconds. Default: `3600` (int)
    """
    def __init__(__self__, resource_name, opts=None, annotations=None, cluster_id=None, description=None, group_interval_seconds=None, group_wait_seconds=None, labels=None, name=None, recipients=None, repeat_interval_seconds=None, __props__=None, __name__=None, __opts__=None):
        """
        Create a ClusterAlterGroup resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] annotations: The cluster alert group annotations (map)
        :param pulumi.Input[str] cluster_id: The cluster id where create cluster alert group (string)
        :param pulumi.Input[str] description: The cluster alert group description (string)
        :param pulumi.Input[float] group_interval_seconds: The cluster alert group interval seconds. Default: `180` (int)
        :param pulumi.Input[float] group_wait_seconds: The cluster alert group wait seconds. Default: `180` (int)
        :param pulumi.Input[dict] labels: The cluster alert group labels (map)
        :param pulumi.Input[str] name: The cluster alert group name (string)
        :param pulumi.Input[list] recipients: The cluster alert group recipients (list)
        :param pulumi.Input[float] repeat_interval_seconds: The cluster alert group wait seconds. Default: `3600` (int)

        The **recipients** object supports the following:

          * `defaultRecipient` (`pulumi.Input[bool]`) - Use notifier default recipient, overriding `recipient` argument if set.  Default: `false` (bool)
          * `notifierId` (`pulumi.Input[str]`) - Recipient notifier ID (string)
          * `notifierType` (`pulumi.Input[str]`) - Recipient notifier ID. Supported values : `"pagerduty" | "slack" | "email" | "webhook" | "wechat"` (string)
          * `recipient` (`pulumi.Input[str]`) - Recipient (string)
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
        super(ClusterAlterGroup, __self__).__init__(
            'rancher2:index/clusterAlterGroup:ClusterAlterGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, annotations=None, cluster_id=None, description=None, group_interval_seconds=None, group_wait_seconds=None, labels=None, name=None, recipients=None, repeat_interval_seconds=None):
        """
        Get an existing ClusterAlterGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] annotations: The cluster alert group annotations (map)
        :param pulumi.Input[str] cluster_id: The cluster id where create cluster alert group (string)
        :param pulumi.Input[str] description: The cluster alert group description (string)
        :param pulumi.Input[float] group_interval_seconds: The cluster alert group interval seconds. Default: `180` (int)
        :param pulumi.Input[float] group_wait_seconds: The cluster alert group wait seconds. Default: `180` (int)
        :param pulumi.Input[dict] labels: The cluster alert group labels (map)
        :param pulumi.Input[str] name: The cluster alert group name (string)
        :param pulumi.Input[list] recipients: The cluster alert group recipients (list)
        :param pulumi.Input[float] repeat_interval_seconds: The cluster alert group wait seconds. Default: `3600` (int)

        The **recipients** object supports the following:

          * `defaultRecipient` (`pulumi.Input[bool]`) - Use notifier default recipient, overriding `recipient` argument if set.  Default: `false` (bool)
          * `notifierId` (`pulumi.Input[str]`) - Recipient notifier ID (string)
          * `notifierType` (`pulumi.Input[str]`) - Recipient notifier ID. Supported values : `"pagerduty" | "slack" | "email" | "webhook" | "wechat"` (string)
          * `recipient` (`pulumi.Input[str]`) - Recipient (string)
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
        return ClusterAlterGroup(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

