# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class RoleTempalte(pulumi.CustomResource):
    administrative: pulumi.Output[bool]
    """
    Administrative role template. Default `false` (bool)
    """
    annotations: pulumi.Output[dict]
    """
    Annotations for role template object (map)
    """
    builtin: pulumi.Output[bool]
    """
    (Computed) Builtin role template (string)
    """
    context: pulumi.Output[str]
    """
    Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
    """
    default_role: pulumi.Output[bool]
    """
    Default role template for new created cluster or project. Default `false` (bool)
    """
    description: pulumi.Output[str]
    """
    Role template description (string)
    """
    external: pulumi.Output[bool]
    """
    External role template. Default `false` (bool)
    """
    hidden: pulumi.Output[bool]
    """
    Hidden role template. Default `false` (bool)
    """
    labels: pulumi.Output[dict]
    """
    Labels for role template object (map)
    """
    locked: pulumi.Output[bool]
    """
    Locked role template. Default `false` (bool)
    """
    name: pulumi.Output[str]
    """
    Role template name (string)
    """
    role_template_ids: pulumi.Output[list]
    """
    Inherit role template IDs (list)
    """
    rules: pulumi.Output[list]
    """
    Role template policy rules (list)

      * `apiGroups` (`list`) - Policy rule api groups (list)
      * `nonResourceUrls` (`list`) - Policy rule non resource urls (list)
      * `resourceNames` (`list`) - Policy rule resource names (list)
      * `resources` (`list`) - Policy rule resources (list)
      * `verbs` (`list`) - Policy rule verbs. `create`, `delete`, `get`, `list`, `patch`, `update`, `watch` and `*` values are supported (list)
    """
    def __init__(__self__, resource_name, opts=None, administrative=None, annotations=None, context=None, default_role=None, description=None, external=None, hidden=None, labels=None, locked=None, name=None, role_template_ids=None, rules=None, __props__=None, __name__=None, __opts__=None):
        """
        Create a RoleTempalte resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] administrative: Administrative role template. Default `false` (bool)
        :param pulumi.Input[dict] annotations: Annotations for role template object (map)
        :param pulumi.Input[str] context: Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
        :param pulumi.Input[bool] default_role: Default role template for new created cluster or project. Default `false` (bool)
        :param pulumi.Input[str] description: Role template description (string)
        :param pulumi.Input[bool] external: External role template. Default `false` (bool)
        :param pulumi.Input[bool] hidden: Hidden role template. Default `false` (bool)
        :param pulumi.Input[dict] labels: Labels for role template object (map)
        :param pulumi.Input[bool] locked: Locked role template. Default `false` (bool)
        :param pulumi.Input[str] name: Role template name (string)
        :param pulumi.Input[list] role_template_ids: Inherit role template IDs (list)
        :param pulumi.Input[list] rules: Role template policy rules (list)

        The **rules** object supports the following:

          * `apiGroups` (`pulumi.Input[list]`) - Policy rule api groups (list)
          * `nonResourceUrls` (`pulumi.Input[list]`) - Policy rule non resource urls (list)
          * `resourceNames` (`pulumi.Input[list]`) - Policy rule resource names (list)
          * `resources` (`pulumi.Input[list]`) - Policy rule resources (list)
          * `verbs` (`pulumi.Input[list]`) - Policy rule verbs. `create`, `delete`, `get`, `list`, `patch`, `update`, `watch` and `*` values are supported (list)
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

            __props__['administrative'] = administrative
            __props__['annotations'] = annotations
            __props__['context'] = context
            __props__['default_role'] = default_role
            __props__['description'] = description
            __props__['external'] = external
            __props__['hidden'] = hidden
            __props__['labels'] = labels
            __props__['locked'] = locked
            __props__['name'] = name
            __props__['role_template_ids'] = role_template_ids
            __props__['rules'] = rules
            __props__['builtin'] = None
        super(RoleTempalte, __self__).__init__(
            'rancher2:index/roleTempalte:RoleTempalte',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, administrative=None, annotations=None, builtin=None, context=None, default_role=None, description=None, external=None, hidden=None, labels=None, locked=None, name=None, role_template_ids=None, rules=None):
        """
        Get an existing RoleTempalte resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] administrative: Administrative role template. Default `false` (bool)
        :param pulumi.Input[dict] annotations: Annotations for role template object (map)
        :param pulumi.Input[bool] builtin: (Computed) Builtin role template (string)
        :param pulumi.Input[str] context: Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
        :param pulumi.Input[bool] default_role: Default role template for new created cluster or project. Default `false` (bool)
        :param pulumi.Input[str] description: Role template description (string)
        :param pulumi.Input[bool] external: External role template. Default `false` (bool)
        :param pulumi.Input[bool] hidden: Hidden role template. Default `false` (bool)
        :param pulumi.Input[dict] labels: Labels for role template object (map)
        :param pulumi.Input[bool] locked: Locked role template. Default `false` (bool)
        :param pulumi.Input[str] name: Role template name (string)
        :param pulumi.Input[list] role_template_ids: Inherit role template IDs (list)
        :param pulumi.Input[list] rules: Role template policy rules (list)

        The **rules** object supports the following:

          * `apiGroups` (`pulumi.Input[list]`) - Policy rule api groups (list)
          * `nonResourceUrls` (`pulumi.Input[list]`) - Policy rule non resource urls (list)
          * `resourceNames` (`pulumi.Input[list]`) - Policy rule resource names (list)
          * `resources` (`pulumi.Input[list]`) - Policy rule resources (list)
          * `verbs` (`pulumi.Input[list]`) - Policy rule verbs. `create`, `delete`, `get`, `list`, `patch`, `update`, `watch` and `*` values are supported (list)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["administrative"] = administrative
        __props__["annotations"] = annotations
        __props__["builtin"] = builtin
        __props__["context"] = context
        __props__["default_role"] = default_role
        __props__["description"] = description
        __props__["external"] = external
        __props__["hidden"] = hidden
        __props__["labels"] = labels
        __props__["locked"] = locked
        __props__["name"] = name
        __props__["role_template_ids"] = role_template_ids
        __props__["rules"] = rules
        return RoleTempalte(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

