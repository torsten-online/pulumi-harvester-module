# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class GetClusterAlertGroupResult:
    """
    A collection of values returned by getClusterAlertGroup.
    """
    def __init__(__self__, annotations=None, cluster_id=None, description=None, group_interval_seconds=None, group_wait_seconds=None, id=None, labels=None, name=None, recipients=None, repeat_interval_seconds=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        __self__.annotations = annotations
        """
        (Computed) The cluster alert group annotations (map)
        """
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        __self__.cluster_id = cluster_id
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        __self__.description = description
        """
        (Computed) The cluster alert group description (string)
        """
        if group_interval_seconds and not isinstance(group_interval_seconds, float):
            raise TypeError("Expected argument 'group_interval_seconds' to be a float")
        __self__.group_interval_seconds = group_interval_seconds
        """
        (Computed) The cluster alert group interval seconds. Default: `180` (int)
        """
        if group_wait_seconds and not isinstance(group_wait_seconds, float):
            raise TypeError("Expected argument 'group_wait_seconds' to be a float")
        __self__.group_wait_seconds = group_wait_seconds
        """
        (Computed) The cluster alert group wait seconds. Default: `180` (int)
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
        (Computed) The cluster alert group labels (map)
        """
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        __self__.name = name
        if recipients and not isinstance(recipients, list):
            raise TypeError("Expected argument 'recipients' to be a list")
        __self__.recipients = recipients
        """
        (Computed) The cluster alert group recipients (list)
        """
        if repeat_interval_seconds and not isinstance(repeat_interval_seconds, float):
            raise TypeError("Expected argument 'repeat_interval_seconds' to be a float")
        __self__.repeat_interval_seconds = repeat_interval_seconds
        """
        (Computed) The cluster alert group wait seconds. Default: `3600` (int)
        """
class AwaitableGetClusterAlertGroupResult(GetClusterAlertGroupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClusterAlertGroupResult(
            annotations=self.annotations,
            cluster_id=self.cluster_id,
            description=self.description,
            group_interval_seconds=self.group_interval_seconds,
            group_wait_seconds=self.group_wait_seconds,
            id=self.id,
            labels=self.labels,
            name=self.name,
            recipients=self.recipients,
            repeat_interval_seconds=self.repeat_interval_seconds)

def get_cluster_alert_group(cluster_id=None,name=None,opts=None):
    """
    Use this data source to retrieve information about a Rancher v2 cluster alert group.

    ## Example Usage



    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_cluster_alert_group(cluster_id="<cluster_id>",
        name="<cluster_alert_group_name>")
    ```



    :param str cluster_id: The cluster id where create cluster alert group (string)
    :param str name: The cluster alert group name (string)
    """
    __args__ = dict()


    __args__['clusterId'] = cluster_id
    __args__['name'] = name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('rancher2:index/getClusterAlertGroup:getClusterAlertGroup', __args__, opts=opts).value

    return AwaitableGetClusterAlertGroupResult(
        annotations=__ret__.get('annotations'),
        cluster_id=__ret__.get('clusterId'),
        description=__ret__.get('description'),
        group_interval_seconds=__ret__.get('groupIntervalSeconds'),
        group_wait_seconds=__ret__.get('groupWaitSeconds'),
        id=__ret__.get('id'),
        labels=__ret__.get('labels'),
        name=__ret__.get('name'),
        recipients=__ret__.get('recipients'),
        repeat_interval_seconds=__ret__.get('repeatIntervalSeconds'))
