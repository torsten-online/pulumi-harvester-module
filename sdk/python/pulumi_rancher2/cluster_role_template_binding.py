# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class ClusterRoleTemplateBinding(pulumi.CustomResource):
    annotations: pulumi.Output[dict]
    """
    Annotations for cluster role template binding (map)
    """
    cluster_id: pulumi.Output[str]
    """
    The cluster id where bind cluster role template binding (string)
    """
    group_id: pulumi.Output[str]
    """
    The group ID to assign cluster role template binding (string)
    """
    group_principal_id: pulumi.Output[str]
    """
    The group_principal ID to assign cluster role template binding (string)
    """
    labels: pulumi.Output[dict]
    """
    Labels for cluster role template binding (map)
    """
    name: pulumi.Output[str]
    """
    The name of the cluster role template binding (string)
    """
    role_template_id: pulumi.Output[str]
    """
    The role template id from create cluster role template binding (string)
    """
    user_id: pulumi.Output[str]
    """
    The user ID to assign cluster role template binding (string)
    """
    user_principal_id: pulumi.Output[str]
    """
    The user_principal ID to assign cluster role template binding (string)
    """
    def __init__(__self__, resource_name, opts=None, annotations=None, cluster_id=None, group_id=None, group_principal_id=None, labels=None, name=None, role_template_id=None, user_id=None, user_principal_id=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Rancher v2 Cluster Role Template Binding resource. This can be used to create Cluster Role Template Bindings for Rancher v2 environments and retrieve their information.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/clusterRole.html.markdown.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] annotations: Annotations for cluster role template binding (map)
        :param pulumi.Input[str] cluster_id: The cluster id where bind cluster role template binding (string)
        :param pulumi.Input[str] group_id: The group ID to assign cluster role template binding (string)
        :param pulumi.Input[str] group_principal_id: The group_principal ID to assign cluster role template binding (string)
        :param pulumi.Input[dict] labels: Labels for cluster role template binding (map)
        :param pulumi.Input[str] name: The name of the cluster role template binding (string)
        :param pulumi.Input[str] role_template_id: The role template id from create cluster role template binding (string)
        :param pulumi.Input[str] user_id: The user ID to assign cluster role template binding (string)
        :param pulumi.Input[str] user_principal_id: The user_principal ID to assign cluster role template binding (string)
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
            __props__['group_id'] = group_id
            __props__['group_principal_id'] = group_principal_id
            __props__['labels'] = labels
            __props__['name'] = name
            if role_template_id is None:
                raise TypeError("Missing required property 'role_template_id'")
            __props__['role_template_id'] = role_template_id
            __props__['user_id'] = user_id
            __props__['user_principal_id'] = user_principal_id
        super(ClusterRoleTemplateBinding, __self__).__init__(
            'rancher2:index/clusterRoleTemplateBinding:ClusterRoleTemplateBinding',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, annotations=None, cluster_id=None, group_id=None, group_principal_id=None, labels=None, name=None, role_template_id=None, user_id=None, user_principal_id=None):
        """
        Get an existing ClusterRoleTemplateBinding resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] annotations: Annotations for cluster role template binding (map)
        :param pulumi.Input[str] cluster_id: The cluster id where bind cluster role template binding (string)
        :param pulumi.Input[str] group_id: The group ID to assign cluster role template binding (string)
        :param pulumi.Input[str] group_principal_id: The group_principal ID to assign cluster role template binding (string)
        :param pulumi.Input[dict] labels: Labels for cluster role template binding (map)
        :param pulumi.Input[str] name: The name of the cluster role template binding (string)
        :param pulumi.Input[str] role_template_id: The role template id from create cluster role template binding (string)
        :param pulumi.Input[str] user_id: The user ID to assign cluster role template binding (string)
        :param pulumi.Input[str] user_principal_id: The user_principal ID to assign cluster role template binding (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["annotations"] = annotations
        __props__["cluster_id"] = cluster_id
        __props__["group_id"] = group_id
        __props__["group_principal_id"] = group_principal_id
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["role_template_id"] = role_template_id
        __props__["user_id"] = user_id
        __props__["user_principal_id"] = user_principal_id
        return ClusterRoleTemplateBinding(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

