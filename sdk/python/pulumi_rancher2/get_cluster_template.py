# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class GetClusterTemplateResult:
    """
    A collection of values returned by getClusterTemplate.
    """
    def __init__(__self__, annotations=None, default_revision_id=None, description=None, id=None, labels=None, members=None, name=None, template_revisions=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        __self__.annotations = annotations
        """
        (Computed) Annotations for the cluster template (map)
        """
        if default_revision_id and not isinstance(default_revision_id, str):
            raise TypeError("Expected argument 'default_revision_id' to be a str")
        __self__.default_revision_id = default_revision_id
        """
        (Computed) Default cluster template revision ID (string)
        """
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        __self__.description = description
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
        (Computed) Labels for the cluster template (map)
        """
        if members and not isinstance(members, list):
            raise TypeError("Expected argument 'members' to be a list")
        __self__.members = members
        """
        (Computed) Cluster template members (list)
        """
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        __self__.name = name
        if template_revisions and not isinstance(template_revisions, list):
            raise TypeError("Expected argument 'template_revisions' to be a list")
        __self__.template_revisions = template_revisions
        """
        (Computed) Cluster template revisions (list)
        """
class AwaitableGetClusterTemplateResult(GetClusterTemplateResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClusterTemplateResult(
            annotations=self.annotations,
            default_revision_id=self.default_revision_id,
            description=self.description,
            id=self.id,
            labels=self.labels,
            members=self.members,
            name=self.name,
            template_revisions=self.template_revisions)

def get_cluster_template(annotations=None,description=None,labels=None,name=None,opts=None):
    """
    Use this data source to retrieve information about a Rancher v2 cluster template.

    Cluster Templates are available from Rancher v2.3.x and above.

    > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/d/clusterTemplate.html.markdown.


    :param dict annotations: (Computed) Annotations for the cluster template (map)
    :param dict labels: (Computed) Labels for the cluster template (map)
    :param str name: The cluster template name (string)
    """
    __args__ = dict()


    __args__['annotations'] = annotations
    __args__['description'] = description
    __args__['labels'] = labels
    __args__['name'] = name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('rancher2:index/getClusterTemplate:getClusterTemplate', __args__, opts=opts).value

    return AwaitableGetClusterTemplateResult(
        annotations=__ret__.get('annotations'),
        default_revision_id=__ret__.get('defaultRevisionId'),
        description=__ret__.get('description'),
        id=__ret__.get('id'),
        labels=__ret__.get('labels'),
        members=__ret__.get('members'),
        name=__ret__.get('name'),
        template_revisions=__ret__.get('templateRevisions'))
