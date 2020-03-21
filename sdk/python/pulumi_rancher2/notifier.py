# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class Notifier(pulumi.CustomResource):
    annotations: pulumi.Output[dict]
    """
    Annotations for notifier object (map)
    """
    cluster_id: pulumi.Output[str]
    """
    The cluster id where create notifier (string)
    """
    description: pulumi.Output[str]
    """
    The notifier description (string)
    * `send_resolved` = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
    """
    labels: pulumi.Output[dict]
    """
    Labels for notifier object (map)
    """
    name: pulumi.Output[str]
    """
    The name of the notifier (string)
    """
    pagerduty_config: pulumi.Output[dict]
    """
    Pagerduty config for notifier (list maxitems:1)
    
      * `proxyUrl` (`str`) - Wechat proxy url (string)
      * `serviceKey` (`str`) - Pagerduty service key (string)
    """
    send_resolved: pulumi.Output[bool]
    slack_config: pulumi.Output[dict]
    """
    Slack config for notifier (list maxitems:1)
    
      * `defaultRecipient` (`str`) - Wechat default recipient (string)
      * `proxyUrl` (`str`) - Wechat proxy url (string)
      * `url` (`str`) - Webhook url (string)
    """
    smtp_config: pulumi.Output[dict]
    """
    SMTP config for notifier (list maxitems:1)
    
      * `defaultRecipient` (`str`) - Wechat default recipient (string)
      * `host` (`str`) - SMTP host (string)
      * `password` (`str`) - SMTP password (string)
      * `port` (`float`) - SMTP port (int)
      * `sender` (`str`) - SMTP sender (string)
      * `tls` (`bool`) - SMTP tls. Default `true` (bool)
      * `username` (`str`) - SMTP username (string)
    """
    webhook_config: pulumi.Output[dict]
    """
    Webhook config for notifier (list maxitems:1)
    
      * `proxyUrl` (`str`) - Wechat proxy url (string)
      * `url` (`str`) - Webhook url (string)
    """
    wechat_config: pulumi.Output[dict]
    """
    Wechat config for notifier (list maxitems:1)
    
      * `agent` (`str`) - Wechat agent ID (string)
      * `corp` (`str`) - Wechat corporation ID (string)
      * `defaultRecipient` (`str`) - Wechat default recipient (string)
      * `proxyUrl` (`str`) - Wechat proxy url (string)
      * `recipientType` (`str`) - Wechat recipient type. Allowed values: `party` | `tag` | `user` (string)
      * `secret` (`str`) - Wechat agent ID (string)
    """
    def __init__(__self__, resource_name, opts=None, annotations=None, cluster_id=None, description=None, labels=None, name=None, pagerduty_config=None, send_resolved=None, slack_config=None, smtp_config=None, webhook_config=None, wechat_config=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Rancher v2 Notifier resource. This can be used to create notifiers for Rancher v2 environments and retrieve their information.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] annotations: Annotations for notifier object (map)
        :param pulumi.Input[str] cluster_id: The cluster id where create notifier (string)
        :param pulumi.Input[str] description: The notifier description (string)
               * `send_resolved` = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
        :param pulumi.Input[dict] labels: Labels for notifier object (map)
        :param pulumi.Input[str] name: The name of the notifier (string)
        :param pulumi.Input[dict] pagerduty_config: Pagerduty config for notifier (list maxitems:1)
        :param pulumi.Input[dict] slack_config: Slack config for notifier (list maxitems:1)
        :param pulumi.Input[dict] smtp_config: SMTP config for notifier (list maxitems:1)
        :param pulumi.Input[dict] webhook_config: Webhook config for notifier (list maxitems:1)
        :param pulumi.Input[dict] wechat_config: Wechat config for notifier (list maxitems:1)
        
        The **pagerduty_config** object supports the following:
        
          * `proxyUrl` (`pulumi.Input[str]`) - Wechat proxy url (string)
          * `serviceKey` (`pulumi.Input[str]`) - Pagerduty service key (string)
        
        The **slack_config** object supports the following:
        
          * `defaultRecipient` (`pulumi.Input[str]`) - Wechat default recipient (string)
          * `proxyUrl` (`pulumi.Input[str]`) - Wechat proxy url (string)
          * `url` (`pulumi.Input[str]`) - Webhook url (string)
        
        The **smtp_config** object supports the following:
        
          * `defaultRecipient` (`pulumi.Input[str]`) - Wechat default recipient (string)
          * `host` (`pulumi.Input[str]`) - SMTP host (string)
          * `password` (`pulumi.Input[str]`) - SMTP password (string)
          * `port` (`pulumi.Input[float]`) - SMTP port (int)
          * `sender` (`pulumi.Input[str]`) - SMTP sender (string)
          * `tls` (`pulumi.Input[bool]`) - SMTP tls. Default `true` (bool)
          * `username` (`pulumi.Input[str]`) - SMTP username (string)
        
        The **webhook_config** object supports the following:
        
          * `proxyUrl` (`pulumi.Input[str]`) - Wechat proxy url (string)
          * `url` (`pulumi.Input[str]`) - Webhook url (string)
        
        The **wechat_config** object supports the following:
        
          * `agent` (`pulumi.Input[str]`) - Wechat agent ID (string)
          * `corp` (`pulumi.Input[str]`) - Wechat corporation ID (string)
          * `defaultRecipient` (`pulumi.Input[str]`) - Wechat default recipient (string)
          * `proxyUrl` (`pulumi.Input[str]`) - Wechat proxy url (string)
          * `recipientType` (`pulumi.Input[str]`) - Wechat recipient type. Allowed values: `party` | `tag` | `user` (string)
          * `secret` (`pulumi.Input[str]`) - Wechat agent ID (string)

        > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/notifier.html.markdown.
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
            __props__['labels'] = labels
            __props__['name'] = name
            __props__['pagerduty_config'] = pagerduty_config
            __props__['send_resolved'] = send_resolved
            __props__['slack_config'] = slack_config
            __props__['smtp_config'] = smtp_config
            __props__['webhook_config'] = webhook_config
            __props__['wechat_config'] = wechat_config
        super(Notifier, __self__).__init__(
            'rancher2:index/notifier:Notifier',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, annotations=None, cluster_id=None, description=None, labels=None, name=None, pagerduty_config=None, send_resolved=None, slack_config=None, smtp_config=None, webhook_config=None, wechat_config=None):
        """
        Get an existing Notifier resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.
        
        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] annotations: Annotations for notifier object (map)
        :param pulumi.Input[str] cluster_id: The cluster id where create notifier (string)
        :param pulumi.Input[str] description: The notifier description (string)
               * `send_resolved` = (Optional) Enable the notifier to send resolved notifications. Default `false` (bool)
        :param pulumi.Input[dict] labels: Labels for notifier object (map)
        :param pulumi.Input[str] name: The name of the notifier (string)
        :param pulumi.Input[dict] pagerduty_config: Pagerduty config for notifier (list maxitems:1)
        :param pulumi.Input[dict] slack_config: Slack config for notifier (list maxitems:1)
        :param pulumi.Input[dict] smtp_config: SMTP config for notifier (list maxitems:1)
        :param pulumi.Input[dict] webhook_config: Webhook config for notifier (list maxitems:1)
        :param pulumi.Input[dict] wechat_config: Wechat config for notifier (list maxitems:1)
        
        The **pagerduty_config** object supports the following:
        
          * `proxyUrl` (`pulumi.Input[str]`) - Wechat proxy url (string)
          * `serviceKey` (`pulumi.Input[str]`) - Pagerduty service key (string)
        
        The **slack_config** object supports the following:
        
          * `defaultRecipient` (`pulumi.Input[str]`) - Wechat default recipient (string)
          * `proxyUrl` (`pulumi.Input[str]`) - Wechat proxy url (string)
          * `url` (`pulumi.Input[str]`) - Webhook url (string)
        
        The **smtp_config** object supports the following:
        
          * `defaultRecipient` (`pulumi.Input[str]`) - Wechat default recipient (string)
          * `host` (`pulumi.Input[str]`) - SMTP host (string)
          * `password` (`pulumi.Input[str]`) - SMTP password (string)
          * `port` (`pulumi.Input[float]`) - SMTP port (int)
          * `sender` (`pulumi.Input[str]`) - SMTP sender (string)
          * `tls` (`pulumi.Input[bool]`) - SMTP tls. Default `true` (bool)
          * `username` (`pulumi.Input[str]`) - SMTP username (string)
        
        The **webhook_config** object supports the following:
        
          * `proxyUrl` (`pulumi.Input[str]`) - Wechat proxy url (string)
          * `url` (`pulumi.Input[str]`) - Webhook url (string)
        
        The **wechat_config** object supports the following:
        
          * `agent` (`pulumi.Input[str]`) - Wechat agent ID (string)
          * `corp` (`pulumi.Input[str]`) - Wechat corporation ID (string)
          * `defaultRecipient` (`pulumi.Input[str]`) - Wechat default recipient (string)
          * `proxyUrl` (`pulumi.Input[str]`) - Wechat proxy url (string)
          * `recipientType` (`pulumi.Input[str]`) - Wechat recipient type. Allowed values: `party` | `tag` | `user` (string)
          * `secret` (`pulumi.Input[str]`) - Wechat agent ID (string)

        > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/notifier.html.markdown.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()
        __props__["annotations"] = annotations
        __props__["cluster_id"] = cluster_id
        __props__["description"] = description
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["pagerduty_config"] = pagerduty_config
        __props__["send_resolved"] = send_resolved
        __props__["slack_config"] = slack_config
        __props__["smtp_config"] = smtp_config
        __props__["webhook_config"] = webhook_config
        __props__["wechat_config"] = wechat_config
        return Notifier(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

