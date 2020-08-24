# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables

__all__ = [
    'GetClusterRoleTemplateBindingResult',
    'AwaitableGetClusterRoleTemplateBindingResult',
    'get_cluster_role_template_binding',
]

@pulumi.output_type
class GetClusterRoleTemplateBindingResult:
    """
    A collection of values returned by getClusterRoleTemplateBinding.
    """
    def __init__(__self__, annotations=None, cluster_id=None, group_id=None, group_principal_id=None, id=None, labels=None, name=None, role_template_id=None, user_id=None, user_principal_id=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        pulumi.set(__self__, "annotations", annotations)
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
        if group_id and not isinstance(group_id, str):
            raise TypeError("Expected argument 'group_id' to be a str")
        pulumi.set(__self__, "group_id", group_id)
        if group_principal_id and not isinstance(group_principal_id, str):
            raise TypeError("Expected argument 'group_principal_id' to be a str")
        pulumi.set(__self__, "group_principal_id", group_principal_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if role_template_id and not isinstance(role_template_id, str):
            raise TypeError("Expected argument 'role_template_id' to be a str")
        pulumi.set(__self__, "role_template_id", role_template_id)
        if user_id and not isinstance(user_id, str):
            raise TypeError("Expected argument 'user_id' to be a str")
        pulumi.set(__self__, "user_id", user_id)
        if user_principal_id and not isinstance(user_principal_id, str):
            raise TypeError("Expected argument 'user_principal_id' to be a str")
        pulumi.set(__self__, "user_principal_id", user_principal_id)

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, Any]:
        """
        (Computed) Annotations of the resource (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> str:
        """
        (Computed) The group ID to assign cluster role template binding (string)
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupPrincipalId")
    def group_principal_id(self) -> str:
        """
        (Computed) The group_principal ID to assign cluster role template binding (string)
        """
        return pulumi.get(self, "group_principal_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def labels(self) -> Mapping[str, Any]:
        """
        (Computed) Labels of the resource (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="roleTemplateId")
    def role_template_id(self) -> str:
        return pulumi.get(self, "role_template_id")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> str:
        """
        (Computed) The user ID to assign cluster role template binding (string)
        """
        return pulumi.get(self, "user_id")

    @property
    @pulumi.getter(name="userPrincipalId")
    def user_principal_id(self) -> str:
        """
        (Computed) The user_principal ID to assign cluster role template binding (string)
        """
        return pulumi.get(self, "user_principal_id")


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


def get_cluster_role_template_binding(cluster_id: Optional[str] = None,
                                      name: Optional[str] = None,
                                      role_template_id: Optional[str] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClusterRoleTemplateBindingResult:
    """
    Use this data source to retrieve information about a Rancher v2 cluster role template binding.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_cluster_role_template_binding(cluster_id="foo_id",
        name="foo")
    ```


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
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('rancher2:index/getClusterRoleTemplateBinding:getClusterRoleTemplateBinding', __args__, opts=opts, typ=GetClusterRoleTemplateBindingResult).value

    return AwaitableGetClusterRoleTemplateBindingResult(
        annotations=__ret__.annotations,
        cluster_id=__ret__.cluster_id,
        group_id=__ret__.group_id,
        group_principal_id=__ret__.group_principal_id,
        id=__ret__.id,
        labels=__ret__.labels,
        name=__ret__.name,
        role_template_id=__ret__.role_template_id,
        user_id=__ret__.user_id,
        user_principal_id=__ret__.user_principal_id)
