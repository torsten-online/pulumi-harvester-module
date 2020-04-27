# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class GetClusterRoleTemplateBindingResult:
    """
    A collection of values returned by getClusterRoleTemplateBinding.
    """
    def __init__(__self__, annotations=None, cluster_id=None, group_id=None, group_principal_id=None, id=None, labels=None, name=None, role_template_id=None, user_id=None, user_principal_id=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        __self__.annotations = annotations
        """
        (Computed) Annotations of the resource (map)
        """
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        __self__.cluster_id = cluster_id
        if group_id and not isinstance(group_id, str):
            raise TypeError("Expected argument 'group_id' to be a str")
        __self__.group_id = group_id
        """
        (Computed) The group ID to assign cluster role template binding (string)
        """
        if group_principal_id and not isinstance(group_principal_id, str):
            raise TypeError("Expected argument 'group_principal_id' to be a str")
        __self__.group_principal_id = group_principal_id
        """
        (Computed) The group_principal ID to assign cluster role template binding (string)
        """
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        The provider-assigned unique ID for this managed resource.
        """
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        __self__.labels = labels
        """
        (Computed) Labels of the resource (map)
        """
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        __self__.name = name
        if role_template_id and not isinstance(role_template_id, str):
            raise TypeError("Expected argument 'role_template_id' to be a str")
        __self__.role_template_id = role_template_id
        if user_id and not isinstance(user_id, str):
            raise TypeError("Expected argument 'user_id' to be a str")
        __self__.user_id = user_id
        """
        (Computed) The user ID to assign cluster role template binding (string)
        """
        if user_principal_id and not isinstance(user_principal_id, str):
            raise TypeError("Expected argument 'user_principal_id' to be a str")
        __self__.user_principal_id = user_principal_id
        """
        (Computed) The user_principal ID to assign cluster role template binding (string)
        """
class AwaitableGetClusterRoleTemplateBindingResult(GetClusterRoleTemplateBindingResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClusterRoleTemplateBindingResult(
            annotations=self.annotations,
            cluster_id=self.cluster_id,
            group_id=self.group_id,
            group_principal_id=self.group_principal_id,
            id=self.id,
            labels=self.labels,
            name=self.name,
            role_template_id=self.role_template_id,
            user_id=self.user_id,
            user_principal_id=self.user_principal_id)

def get_cluster_role_template_binding(cluster_id=None,name=None,role_template_id=None,opts=None):
    """
    Use this data source to retrieve information about a Rancher v2 cluster role template binding.




    :param str cluster_id: The cluster id where bind cluster role template (string)
    :param str name: The name of the cluster role template binding (string)
    :param str role_template_id: The role template id from create cluster role template binding (string)
    """
    __args__ = dict()


    __args__['clusterId'] = cluster_id
    __args__['name'] = name
    __args__['roleTemplateId'] = role_template_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('rancher2:index/getClusterRoleTemplateBinding:getClusterRoleTemplateBinding', __args__, opts=opts).value

    return AwaitableGetClusterRoleTemplateBindingResult(
        annotations=__ret__.get('annotations'),
        cluster_id=__ret__.get('clusterId'),
        group_id=__ret__.get('groupId'),
        group_principal_id=__ret__.get('groupPrincipalId'),
        id=__ret__.get('id'),
        labels=__ret__.get('labels'),
        name=__ret__.get('name'),
        role_template_id=__ret__.get('roleTemplateId'),
        user_id=__ret__.get('userId'),
        user_principal_id=__ret__.get('userPrincipalId'))
