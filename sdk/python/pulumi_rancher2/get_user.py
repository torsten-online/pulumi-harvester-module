# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetUserResult',
    'AwaitableGetUserResult',
    'get_user',
]

@pulumi.output_type
class GetUserResult:
    """
    A collection of values returned by getUser.
    """
    def __init__(__self__, annotations=None, enabled=None, id=None, is_external=None, labels=None, name=None, principal_ids=None, username=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        pulumi.set(__self__, "annotations", annotations)
        if enabled and not isinstance(enabled, bool):
            raise TypeError("Expected argument 'enabled' to be a bool")
        pulumi.set(__self__, "enabled", enabled)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if is_external and not isinstance(is_external, bool):
            raise TypeError("Expected argument 'is_external' to be a bool")
        pulumi.set(__self__, "is_external", is_external)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if principal_ids and not isinstance(principal_ids, list):
            raise TypeError("Expected argument 'principal_ids' to be a list")
        pulumi.set(__self__, "principal_ids", principal_ids)
        if username and not isinstance(username, str):
            raise TypeError("Expected argument 'username' to be a str")
        pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, Any]:
        """
        (Computed) Annotations of the resource (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        """
        (Computed) The user is enabled (bool)
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="isExternal")
    def is_external(self) -> Optional[bool]:
        return pulumi.get(self, "is_external")

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
        """
        (Computed) The user common name (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="principalIds")
    def principal_ids(self) -> Sequence[str]:
        """
        (Computed) The user principal IDs (list)
        """
        return pulumi.get(self, "principal_ids")

    @property
    @pulumi.getter
    def username(self) -> str:
        return pulumi.get(self, "username")


class AwaitableGetUserResult(GetUserResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUserResult(
            annotations=self.annotations,
            enabled=self.enabled,
            id=self.id,
            is_external=self.is_external,
            labels=self.labels,
            name=self.name,
            principal_ids=self.principal_ids,
            username=self.username)


def get_user(is_external: Optional[bool] = None,
             name: Optional[str] = None,
             username: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUserResult:
    """
    Use this data source to retrieve information about a Rancher v2 user

    ## Example Usage

    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_user(username="foo")
    ```


    :param bool is_external: Set is the user if the user is external. Default: `false` (bool)
    :param str name: The name of the user (string)
    :param str username: The username of the user (string)
    """
    __args__ = dict()
    __args__['isExternal'] = is_external
    __args__['name'] = name
    __args__['username'] = username
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('rancher2:index/getUser:getUser', __args__, opts=opts, typ=GetUserResult).value

    return AwaitableGetUserResult(
        annotations=__ret__.annotations,
        enabled=__ret__.enabled,
        id=__ret__.id,
        is_external=__ret__.is_external,
        labels=__ret__.labels,
        name=__ret__.name,
        principal_ids=__ret__.principal_ids,
        username=__ret__.username)
