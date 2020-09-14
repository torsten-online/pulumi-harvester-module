# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables

__all__ = ['ProjectRoleTemplateBinding']


class ProjectRoleTemplateBinding(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 group_principal_id: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 role_template_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 user_principal_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a ProjectRoleTemplateBinding resource with the given unique name, props, and options.
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

            __props__['annotations'] = annotations
            __props__['group_id'] = group_id
            __props__['group_principal_id'] = group_principal_id
            __props__['labels'] = labels
            __props__['name'] = name
            if project_id is None:
                raise TypeError("Missing required property 'project_id'")
            __props__['project_id'] = project_id
            if role_template_id is None:
                raise TypeError("Missing required property 'role_template_id'")
            __props__['role_template_id'] = role_template_id
            __props__['user_id'] = user_id
            __props__['user_principal_id'] = user_principal_id
        super(ProjectRoleTemplateBinding, __self__).__init__(
            'rancher2:index/projectRoleTemplateBinding:ProjectRoleTemplateBinding',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            group_id: Optional[pulumi.Input[str]] = None,
            group_principal_id: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            role_template_id: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None,
            user_principal_id: Optional[pulumi.Input[str]] = None) -> 'ProjectRoleTemplateBinding':
        """
        Get an existing ProjectRoleTemplateBinding resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["annotations"] = annotations
        __props__["group_id"] = group_id
        __props__["group_principal_id"] = group_principal_id
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["project_id"] = project_id
        __props__["role_template_id"] = role_template_id
        __props__["user_id"] = user_id
        __props__["user_principal_id"] = user_principal_id
        return ProjectRoleTemplateBinding(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations of the resource
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupPrincipalId")
    def group_principal_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "group_principal_id")

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
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="roleTemplateId")
    def role_template_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "role_template_id")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "user_id")

    @property
    @pulumi.getter(name="userPrincipalId")
    def user_principal_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "user_principal_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

