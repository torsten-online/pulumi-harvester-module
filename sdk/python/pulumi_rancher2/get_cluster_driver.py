# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class GetClusterDriverResult:
    """
    A collection of values returned by getClusterDriver.
    """
    def __init__(__self__, active=None, actual_url=None, annotations=None, builtin=None, checksum=None, id=None, labels=None, name=None, ui_url=None, url=None, whitelist_domains=None):
        if active and not isinstance(active, bool):
            raise TypeError("Expected argument 'active' to be a bool")
        __self__.active = active
        """
        (Computed) Specify if the cluster driver state (bool)
        """
        if actual_url and not isinstance(actual_url, str):
            raise TypeError("Expected argument 'actual_url' to be a str")
        __self__.actual_url = actual_url
        """
        (Computed) Actual url of the cluster driver (string)
        """
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        __self__.annotations = annotations
        """
        (Computed) Annotations of the resource (map)
        """
        if builtin and not isinstance(builtin, bool):
            raise TypeError("Expected argument 'builtin' to be a bool")
        __self__.builtin = builtin
        """
        (Computed) Specify whether the cluster driver is an internal cluster driver or not (bool)
        """
        if checksum and not isinstance(checksum, str):
            raise TypeError("Expected argument 'checksum' to be a str")
        __self__.checksum = checksum
        """
        (Computed) Verify that the downloaded driver matches the expected checksum (string)
        """
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
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
        if ui_url and not isinstance(ui_url, str):
            raise TypeError("Expected argument 'ui_url' to be a str")
        __self__.ui_url = ui_url
        """
        (Computed) The URL to load for customized Add Clusters screen for this driver (string)
        """
        if url and not isinstance(url, str):
            raise TypeError("Expected argument 'url' to be a str")
        __self__.url = url
        if whitelist_domains and not isinstance(whitelist_domains, list):
            raise TypeError("Expected argument 'whitelist_domains' to be a list")
        __self__.whitelist_domains = whitelist_domains
        """
        (Computed) Domains to whitelist for the ui (list)
        """
class AwaitableGetClusterDriverResult(GetClusterDriverResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClusterDriverResult(
            active=self.active,
            actual_url=self.actual_url,
            annotations=self.annotations,
            builtin=self.builtin,
            checksum=self.checksum,
            id=self.id,
            labels=self.labels,
            name=self.name,
            ui_url=self.ui_url,
            url=self.url,
            whitelist_domains=self.whitelist_domains)

def get_cluster_driver(name=None,url=None,opts=None):
    """
    Use this data source to retrieve information about a Rancher v2 Cluster Driver resource.

    > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/clusterDriver.html.markdown.


    :param str name: Name of the cluster driver (string)
    :param str url: The URL to download the machine driver binary for 64-bit Linux (string)
    """
    __args__ = dict()


    __args__['name'] = name
    __args__['url'] = url
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('rancher2:index/getClusterDriver:getClusterDriver', __args__, opts=opts).value

    return AwaitableGetClusterDriverResult(
        active=__ret__.get('active'),
        actual_url=__ret__.get('actualUrl'),
        annotations=__ret__.get('annotations'),
        builtin=__ret__.get('builtin'),
        checksum=__ret__.get('checksum'),
        id=__ret__.get('id'),
        labels=__ret__.get('labels'),
        name=__ret__.get('name'),
        ui_url=__ret__.get('uiUrl'),
        url=__ret__.get('url'),
        whitelist_domains=__ret__.get('whitelistDomains'))
