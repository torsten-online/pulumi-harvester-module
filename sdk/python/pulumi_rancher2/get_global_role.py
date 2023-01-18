# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetGlobalRoleResult',
    'AwaitableGetGlobalRoleResult',
    'get_global_role',
    'get_global_role_output',
]

@pulumi.output_type
class GetGlobalRoleResult:
    """
    A collection of values returned by getGlobalRole.
    """
    def __init__(__self__, annotations=None, builtin=None, description=None, id=None, labels=None, name=None, new_user_default=None, rules=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        pulumi.set(__self__, "annotations", annotations)
        if builtin and not isinstance(builtin, bool):
            raise TypeError("Expected argument 'builtin' to be a bool")
        pulumi.set(__self__, "builtin", builtin)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if new_user_default and not isinstance(new_user_default, bool):
            raise TypeError("Expected argument 'new_user_default' to be a bool")
        pulumi.set(__self__, "new_user_default", new_user_default)
        if rules and not isinstance(rules, list):
            raise TypeError("Expected argument 'rules' to be a list")
        pulumi.set(__self__, "rules", rules)

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, Any]:
        """
        (Computed) Annotations for global role object (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter
    def builtin(self) -> bool:
        """
        (Computed) Builtin global role (bool)
        """
        return pulumi.get(self, "builtin")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        (Computed) Global role description (string)
        """
        return pulumi.get(self, "description")

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
        (Computed) Labels for global role object (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="newUserDefault")
    def new_user_default(self) -> bool:
        """
        (Computed) Whether or not this role should be added to new users (bool)
        """
        return pulumi.get(self, "new_user_default")

    @property
    @pulumi.getter
    def rules(self) -> Sequence['outputs.GetGlobalRoleRuleResult']:
        """
        (Computed) Global role policy rules (list)
        """
        return pulumi.get(self, "rules")


class AwaitableGetGlobalRoleResult(GetGlobalRoleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGlobalRoleResult(
            annotations=self.annotations,
            builtin=self.builtin,
            description=self.description,
            id=self.id,
            labels=self.labels,
            name=self.name,
            new_user_default=self.new_user_default,
            rules=self.rules)


def get_global_role(name: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGlobalRoleResult:
    """
    Use this data source to retrieve information about a Rancher v2 global role resource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_global_role(name="foo")
    ```


    :param str name: The name of the Global Role (string)
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('rancher2:index/getGlobalRole:getGlobalRole', __args__, opts=opts, typ=GetGlobalRoleResult).value

    return AwaitableGetGlobalRoleResult(
        annotations=__ret__.annotations,
        builtin=__ret__.builtin,
        description=__ret__.description,
        id=__ret__.id,
        labels=__ret__.labels,
        name=__ret__.name,
        new_user_default=__ret__.new_user_default,
        rules=__ret__.rules)


@_utilities.lift_output_func(get_global_role)
def get_global_role_output(name: Optional[pulumi.Input[str]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGlobalRoleResult]:
    """
    Use this data source to retrieve information about a Rancher v2 global role resource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_global_role(name="foo")
    ```


    :param str name: The name of the Global Role (string)
    """
    ...
