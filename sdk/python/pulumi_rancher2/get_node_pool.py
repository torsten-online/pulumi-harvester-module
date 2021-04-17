# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetNodePoolResult',
    'AwaitableGetNodePoolResult',
    'get_node_pool',
]

@pulumi.output_type
class GetNodePoolResult:
    """
    A collection of values returned by getNodePool.
    """
    def __init__(__self__, annotations=None, cluster_id=None, control_plane=None, delete_not_ready_after_secs=None, etcd=None, hostname_prefix=None, id=None, labels=None, name=None, node_taints=None, node_template_id=None, quantity=None, worker=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        pulumi.set(__self__, "annotations", annotations)
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
        if control_plane and not isinstance(control_plane, bool):
            raise TypeError("Expected argument 'control_plane' to be a bool")
        pulumi.set(__self__, "control_plane", control_plane)
        if delete_not_ready_after_secs and not isinstance(delete_not_ready_after_secs, int):
            raise TypeError("Expected argument 'delete_not_ready_after_secs' to be a int")
        pulumi.set(__self__, "delete_not_ready_after_secs", delete_not_ready_after_secs)
        if etcd and not isinstance(etcd, bool):
            raise TypeError("Expected argument 'etcd' to be a bool")
        pulumi.set(__self__, "etcd", etcd)
        if hostname_prefix and not isinstance(hostname_prefix, str):
            raise TypeError("Expected argument 'hostname_prefix' to be a str")
        pulumi.set(__self__, "hostname_prefix", hostname_prefix)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if node_taints and not isinstance(node_taints, list):
            raise TypeError("Expected argument 'node_taints' to be a list")
        pulumi.set(__self__, "node_taints", node_taints)
        if node_template_id and not isinstance(node_template_id, str):
            raise TypeError("Expected argument 'node_template_id' to be a str")
        pulumi.set(__self__, "node_template_id", node_template_id)
        if quantity and not isinstance(quantity, int):
            raise TypeError("Expected argument 'quantity' to be a int")
        pulumi.set(__self__, "quantity", quantity)
        if worker and not isinstance(worker, bool):
            raise TypeError("Expected argument 'worker' to be a bool")
        pulumi.set(__self__, "worker", worker)

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, Any]:
        """
        (Computed) Annotations for Node Pool object (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="controlPlane")
    def control_plane(self) -> bool:
        """
        (Computed) RKE control plane role for created nodes (bool)
        """
        return pulumi.get(self, "control_plane")

    @property
    @pulumi.getter(name="deleteNotReadyAfterSecs")
    def delete_not_ready_after_secs(self) -> int:
        """
        (Computed) Delete not ready node after secs. Default `0` (int)
        """
        return pulumi.get(self, "delete_not_ready_after_secs")

    @property
    @pulumi.getter
    def etcd(self) -> bool:
        """
        (Computed) RKE etcd role for created nodes (bool)
        """
        return pulumi.get(self, "etcd")

    @property
    @pulumi.getter(name="hostnamePrefix")
    def hostname_prefix(self) -> str:
        """
        (Computed) The prefix for created nodes of the Node Pool (string)
        """
        return pulumi.get(self, "hostname_prefix")

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
        (Computed) Labels for Node Pool object (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nodeTaints")
    def node_taints(self) -> Sequence['outputs.GetNodePoolNodeTaintResult']:
        """
        (Computed) Node taints (List)
        """
        return pulumi.get(self, "node_taints")

    @property
    @pulumi.getter(name="nodeTemplateId")
    def node_template_id(self) -> str:
        return pulumi.get(self, "node_template_id")

    @property
    @pulumi.getter
    def quantity(self) -> int:
        """
        (Computed) The number of nodes to create on Node Pool (int)
        """
        return pulumi.get(self, "quantity")

    @property
    @pulumi.getter
    def worker(self) -> bool:
        """
        (Computed) RKE role role for created nodes (bool)
        """
        return pulumi.get(self, "worker")


class AwaitableGetNodePoolResult(GetNodePoolResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNodePoolResult(
            annotations=self.annotations,
            cluster_id=self.cluster_id,
            control_plane=self.control_plane,
            delete_not_ready_after_secs=self.delete_not_ready_after_secs,
            etcd=self.etcd,
            hostname_prefix=self.hostname_prefix,
            id=self.id,
            labels=self.labels,
            name=self.name,
            node_taints=self.node_taints,
            node_template_id=self.node_template_id,
            quantity=self.quantity,
            worker=self.worker)


def get_node_pool(cluster_id: Optional[str] = None,
                  name: Optional[str] = None,
                  node_template_id: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNodePoolResult:
    """
    Use this data source to retrieve information about a Rancher v2 Node Pool resource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_rancher2 as rancher2

    foo = rancher2.get_node_pool(cluster_id=rancher2_cluster["foo-custom"]["id"],
        name="foo")
    ```


    :param str cluster_id: The RKE cluster id to use Node Pool (string)
    :param str name: The name of the Node Pool (string)
    :param str node_template_id: The Node Template ID to use for node creation (string)
    """
    __args__ = dict()
    __args__['clusterId'] = cluster_id
    __args__['name'] = name
    __args__['nodeTemplateId'] = node_template_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('rancher2:index/getNodePool:getNodePool', __args__, opts=opts, typ=GetNodePoolResult).value

    return AwaitableGetNodePoolResult(
        annotations=__ret__.annotations,
        cluster_id=__ret__.cluster_id,
        control_plane=__ret__.control_plane,
        delete_not_ready_after_secs=__ret__.delete_not_ready_after_secs,
        etcd=__ret__.etcd,
        hostname_prefix=__ret__.hostname_prefix,
        id=__ret__.id,
        labels=__ret__.labels,
        name=__ret__.name,
        node_taints=__ret__.node_taints,
        node_template_id=__ret__.node_template_id,
        quantity=__ret__.quantity,
        worker=__ret__.worker)
