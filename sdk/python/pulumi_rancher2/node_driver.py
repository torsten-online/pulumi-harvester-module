# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables

__all__ = ['NodeDriver']


class NodeDriver(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 builtin: Optional[pulumi.Input[bool]] = None,
                 checksum: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 external_id: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ui_url: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 whitelist_domains: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a NodeDriver resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource
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

            if active is None:
                raise TypeError("Missing required property 'active'")
            __props__['active'] = active
            __props__['annotations'] = annotations
            if builtin is None:
                raise TypeError("Missing required property 'builtin'")
            __props__['builtin'] = builtin
            __props__['checksum'] = checksum
            __props__['description'] = description
            __props__['external_id'] = external_id
            __props__['labels'] = labels
            __props__['name'] = name
            __props__['ui_url'] = ui_url
            if url is None:
                raise TypeError("Missing required property 'url'")
            __props__['url'] = url
            __props__['whitelist_domains'] = whitelist_domains
        super(NodeDriver, __self__).__init__(
            'rancher2:index/nodeDriver:NodeDriver',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            active: Optional[pulumi.Input[bool]] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            builtin: Optional[pulumi.Input[bool]] = None,
            checksum: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            external_id: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            ui_url: Optional[pulumi.Input[str]] = None,
            url: Optional[pulumi.Input[str]] = None,
            whitelist_domains: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None) -> 'NodeDriver':
        """
        Get an existing NodeDriver resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["active"] = active
        __props__["annotations"] = annotations
        __props__["builtin"] = builtin
        __props__["checksum"] = checksum
        __props__["description"] = description
        __props__["external_id"] = external_id
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["ui_url"] = ui_url
        __props__["url"] = url
        __props__["whitelist_domains"] = whitelist_domains
        return NodeDriver(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def active(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "active")

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations of the resource
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter
    def builtin(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "builtin")

    @property
    @pulumi.getter
    def checksum(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "checksum")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="externalId")
    def external_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "external_id")

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
    @pulumi.getter(name="uiUrl")
    def ui_url(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "ui_url")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[str]:
        return pulumi.get(self, "url")

    @property
    @pulumi.getter(name="whitelistDomains")
    def whitelist_domains(self) -> pulumi.Output[Optional[List[str]]]:
        return pulumi.get(self, "whitelist_domains")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

