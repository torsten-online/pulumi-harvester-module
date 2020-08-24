# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables
from . import outputs

__all__ = [
    'GetProjectAlertGroupResult',
    'AwaitableGetProjectAlertGroupResult',
    'get_project_alert_group',
]

@pulumi.output_type
class GetProjectAlertGroupResult:
    """
    A collection of values returned by getProjectAlertGroup.
    """
    def __init__(__self__, annotations=None, description=None, group_interval_seconds=None, group_wait_seconds=None, id=None, labels=None, name=None, project_id=None, recipients=None, repeat_interval_seconds=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        pulumi.set(__self__, "annotations", annotations)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if group_interval_seconds and not isinstance(group_interval_seconds, float):
            raise TypeError("Expected argument 'group_interval_seconds' to be a float")
        pulumi.set(__self__, "group_interval_seconds", group_interval_seconds)
        if group_wait_seconds and not isinstance(group_wait_seconds, float):
            raise TypeError("Expected argument 'group_wait_seconds' to be a float")
        pulumi.set(__self__, "group_wait_seconds", group_wait_seconds)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if recipients and not isinstance(recipients, list):
            raise TypeError("Expected argument 'recipients' to be a list")
        pulumi.set(__self__, "recipients", recipients)
        if repeat_interval_seconds and not isinstance(repeat_interval_seconds, float):
            raise TypeError("Expected argument 'repeat_interval_seconds' to be a float")
        pulumi.set(__self__, "repeat_interval_seconds", repeat_interval_seconds)

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, Any]:
        """
        (Computed) The project alert group annotations (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        (Computed) The project alert group description (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="groupIntervalSeconds")
    def group_interval_seconds(self) -> float:
        """
        (Computed) The project alert group interval seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_interval_seconds")

    @property
    @pulumi.getter(name="groupWaitSeconds")
    def group_wait_seconds(self) -> float:
        """
        (Computed) The project alert group wait seconds. Default: `180` (int)
        """
        return pulumi.get(self, "group_wait_seconds")

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
        (Computed) The project alert group labels (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def recipients(self) -> List['outputs.GetProjectAlertGroupRecipientResult']:
        """
        (Computed) The project alert group recipients (list)
        """
        return pulumi.get(self, "recipients")

    @property
    @pulumi.getter(name="repeatIntervalSeconds")
    def repeat_interval_seconds(self) -> float:
        """
        (Computed) The project alert group wait seconds. Default: `3600` (int)
        """
        return pulumi.get(self, "repeat_interval_seconds")


class AwaitableGetProjectAlertGroupResult(GetProjectAlertGroupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProjectAlertGroupResult(
            annotations=self.annotations,
            description=self.description,
            group_interval_seconds=self.group_interval_seconds,
            group_wait_seconds=self.group_wait_seconds,
            id=self.id,
            labels=self.labels,
            name=self.name,
            project_id=self.project_id,
            recipients=self.recipients,
            repeat_interval_seconds=self.repeat_interval_seconds)


def get_project_alert_group(name: Optional[str] = None,
                            project_id: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetProjectAlertGroupResult:
    """
    Use this data source to retrieve information about a Rancher v2 project alert group.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_project_alert_group(name="<project_alert_group_name>",
        project_id="<project_id>")
    ```


    :param str name: The project alert group name (string)
    :param str project_id: The project id where create project alert group (string)
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['projectId'] = project_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('rancher2:index/getProjectAlertGroup:getProjectAlertGroup', __args__, opts=opts, typ=GetProjectAlertGroupResult).value

    return AwaitableGetProjectAlertGroupResult(
        annotations=__ret__.annotations,
        description=__ret__.description,
        group_interval_seconds=__ret__.group_interval_seconds,
        group_wait_seconds=__ret__.group_wait_seconds,
        id=__ret__.id,
        labels=__ret__.labels,
        name=__ret__.name,
        project_id=__ret__.project_id,
        recipients=__ret__.recipients,
        repeat_interval_seconds=__ret__.repeat_interval_seconds)
