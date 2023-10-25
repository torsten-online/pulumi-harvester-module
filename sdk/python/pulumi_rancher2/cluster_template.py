# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ClusterTemplateArgs', 'ClusterTemplate']

@pulumi.input_type
class ClusterTemplateArgs:
    def __init__(__self__, *,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterTemplateMemberArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 template_revisions: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterTemplateTemplateRevisionArgs']]]] = None):
        """
        The set of arguments for constructing a ClusterTemplate resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for the cluster template (map)
        :param pulumi.Input[str] description: Cluster template description
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for the cluster template (map)
        :param pulumi.Input[Sequence[pulumi.Input['ClusterTemplateMemberArgs']]] members: Cluster template members (list)
        :param pulumi.Input[str] name: The cluster template name (string)
        :param pulumi.Input[Sequence[pulumi.Input['ClusterTemplateTemplateRevisionArgs']]] template_revisions: Cluster template revisions (list)
        """
        ClusterTemplateArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            annotations=annotations,
            description=description,
            labels=labels,
            members=members,
            name=name,
            template_revisions=template_revisions,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             description: Optional[pulumi.Input[str]] = None,
             labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             members: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterTemplateMemberArgs']]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             template_revisions: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterTemplateTemplateRevisionArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if template_revisions is None and 'templateRevisions' in kwargs:
            template_revisions = kwargs['templateRevisions']

        if annotations is not None:
            _setter("annotations", annotations)
        if description is not None:
            _setter("description", description)
        if labels is not None:
            _setter("labels", labels)
        if members is not None:
            _setter("members", members)
        if name is not None:
            _setter("name", name)
        if template_revisions is not None:
            _setter("template_revisions", template_revisions)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for the cluster template (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Cluster template description
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for the cluster template (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def members(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ClusterTemplateMemberArgs']]]]:
        """
        Cluster template members (list)
        """
        return pulumi.get(self, "members")

    @members.setter
    def members(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterTemplateMemberArgs']]]]):
        pulumi.set(self, "members", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The cluster template name (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="templateRevisions")
    def template_revisions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ClusterTemplateTemplateRevisionArgs']]]]:
        """
        Cluster template revisions (list)
        """
        return pulumi.get(self, "template_revisions")

    @template_revisions.setter
    def template_revisions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterTemplateTemplateRevisionArgs']]]]):
        pulumi.set(self, "template_revisions", value)


@pulumi.input_type
class _ClusterTemplateState:
    def __init__(__self__, *,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 default_revision_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterTemplateMemberArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 template_revisions: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterTemplateTemplateRevisionArgs']]]] = None):
        """
        Input properties used for looking up and filtering ClusterTemplate resources.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for the cluster template (map)
        :param pulumi.Input[str] default_revision_id: (Computed) Default cluster template revision ID (string)
        :param pulumi.Input[str] description: Cluster template description
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for the cluster template (map)
        :param pulumi.Input[Sequence[pulumi.Input['ClusterTemplateMemberArgs']]] members: Cluster template members (list)
        :param pulumi.Input[str] name: The cluster template name (string)
        :param pulumi.Input[Sequence[pulumi.Input['ClusterTemplateTemplateRevisionArgs']]] template_revisions: Cluster template revisions (list)
        """
        _ClusterTemplateState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            annotations=annotations,
            default_revision_id=default_revision_id,
            description=description,
            labels=labels,
            members=members,
            name=name,
            template_revisions=template_revisions,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             default_revision_id: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             members: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterTemplateMemberArgs']]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             template_revisions: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterTemplateTemplateRevisionArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if default_revision_id is None and 'defaultRevisionId' in kwargs:
            default_revision_id = kwargs['defaultRevisionId']
        if template_revisions is None and 'templateRevisions' in kwargs:
            template_revisions = kwargs['templateRevisions']

        if annotations is not None:
            _setter("annotations", annotations)
        if default_revision_id is not None:
            _setter("default_revision_id", default_revision_id)
        if description is not None:
            _setter("description", description)
        if labels is not None:
            _setter("labels", labels)
        if members is not None:
            _setter("members", members)
        if name is not None:
            _setter("name", name)
        if template_revisions is not None:
            _setter("template_revisions", template_revisions)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for the cluster template (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter(name="defaultRevisionId")
    def default_revision_id(self) -> Optional[pulumi.Input[str]]:
        """
        (Computed) Default cluster template revision ID (string)
        """
        return pulumi.get(self, "default_revision_id")

    @default_revision_id.setter
    def default_revision_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_revision_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Cluster template description
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for the cluster template (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def members(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ClusterTemplateMemberArgs']]]]:
        """
        Cluster template members (list)
        """
        return pulumi.get(self, "members")

    @members.setter
    def members(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterTemplateMemberArgs']]]]):
        pulumi.set(self, "members", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The cluster template name (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="templateRevisions")
    def template_revisions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ClusterTemplateTemplateRevisionArgs']]]]:
        """
        Cluster template revisions (list)
        """
        return pulumi.get(self, "template_revisions")

    @template_revisions.setter
    def template_revisions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterTemplateTemplateRevisionArgs']]]]):
        pulumi.set(self, "template_revisions", value)


class ClusterTemplate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterTemplateMemberArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 template_revisions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterTemplateTemplateRevisionArgs']]]]] = None,
                 __props__=None):
        """
        Provides a Rancher v2 Cluster Template resource. This can be used to create Cluster Templates for Rancher v2 RKE clusters and retrieve their information.

        Cluster Templates are available from Rancher v2.3.x and above.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Cluster Template
        foo = rancher2.ClusterTemplate("foo",
            description="Terraform cluster template foo",
            members=[rancher2.ClusterTemplateMemberArgs(
                access_type="owner",
                user_principal_id="local://user-XXXXX",
            )],
            template_revisions=[rancher2.ClusterTemplateTemplateRevisionArgs(
                cluster_config=rancher2.ClusterTemplateTemplateRevisionClusterConfigArgs(
                    rke_config=rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigArgs(
                        network=rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkArgs(
                            plugin="canal",
                        ),
                        services=rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs(
                            etcd=rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdArgs(
                                creation="6h",
                                retention="24h",
                            ),
                        ),
                    ),
                ),
                default=True,
                name="V1",
            )])
        ```

        Creating Rancher v2 RKE cluster template with upgrade strategy. For Rancher v2.4.x and above.

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Cluster Template
        foo = rancher2.ClusterTemplate("foo",
            description="Terraform cluster template foo",
            members=[rancher2.ClusterTemplateMemberArgs(
                access_type="owner",
                user_principal_id="local://user-XXXXX",
            )],
            template_revisions=[rancher2.ClusterTemplateTemplateRevisionArgs(
                cluster_config=rancher2.ClusterTemplateTemplateRevisionClusterConfigArgs(
                    rke_config=rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigArgs(
                        network=rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkArgs(
                            plugin="canal",
                        ),
                        services=rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs(
                            etcd=rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdArgs(
                                creation="6h",
                                retention="24h",
                            ),
                        ),
                        upgrade_strategy=rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategyArgs(
                            drain=True,
                            max_unavailable_worker="20%",
                        ),
                    ),
                ),
                default=True,
                name="V1",
            )])
        ```

        ## Import

        Cluster Template can be imported using the rancher Cluster Template ID

        ```sh
         $ pulumi import rancher2:index/clusterTemplate:ClusterTemplate foo &lt;CLUSTER_TEMPLATE_ID&gt;
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for the cluster template (map)
        :param pulumi.Input[str] description: Cluster template description
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for the cluster template (map)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterTemplateMemberArgs']]]] members: Cluster template members (list)
        :param pulumi.Input[str] name: The cluster template name (string)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterTemplateTemplateRevisionArgs']]]] template_revisions: Cluster template revisions (list)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ClusterTemplateArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 Cluster Template resource. This can be used to create Cluster Templates for Rancher v2 RKE clusters and retrieve their information.

        Cluster Templates are available from Rancher v2.3.x and above.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Cluster Template
        foo = rancher2.ClusterTemplate("foo",
            description="Terraform cluster template foo",
            members=[rancher2.ClusterTemplateMemberArgs(
                access_type="owner",
                user_principal_id="local://user-XXXXX",
            )],
            template_revisions=[rancher2.ClusterTemplateTemplateRevisionArgs(
                cluster_config=rancher2.ClusterTemplateTemplateRevisionClusterConfigArgs(
                    rke_config=rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigArgs(
                        network=rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkArgs(
                            plugin="canal",
                        ),
                        services=rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs(
                            etcd=rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdArgs(
                                creation="6h",
                                retention="24h",
                            ),
                        ),
                    ),
                ),
                default=True,
                name="V1",
            )])
        ```

        Creating Rancher v2 RKE cluster template with upgrade strategy. For Rancher v2.4.x and above.

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Cluster Template
        foo = rancher2.ClusterTemplate("foo",
            description="Terraform cluster template foo",
            members=[rancher2.ClusterTemplateMemberArgs(
                access_type="owner",
                user_principal_id="local://user-XXXXX",
            )],
            template_revisions=[rancher2.ClusterTemplateTemplateRevisionArgs(
                cluster_config=rancher2.ClusterTemplateTemplateRevisionClusterConfigArgs(
                    rke_config=rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigArgs(
                        network=rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigNetworkArgs(
                            plugin="canal",
                        ),
                        services=rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesArgs(
                            etcd=rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcdArgs(
                                creation="6h",
                                retention="24h",
                            ),
                        ),
                        upgrade_strategy=rancher2.ClusterTemplateTemplateRevisionClusterConfigRkeConfigUpgradeStrategyArgs(
                            drain=True,
                            max_unavailable_worker="20%",
                        ),
                    ),
                ),
                default=True,
                name="V1",
            )])
        ```

        ## Import

        Cluster Template can be imported using the rancher Cluster Template ID

        ```sh
         $ pulumi import rancher2:index/clusterTemplate:ClusterTemplate foo &lt;CLUSTER_TEMPLATE_ID&gt;
        ```

        :param str resource_name: The name of the resource.
        :param ClusterTemplateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ClusterTemplateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ClusterTemplateArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterTemplateMemberArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 template_revisions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterTemplateTemplateRevisionArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ClusterTemplateArgs.__new__(ClusterTemplateArgs)

            __props__.__dict__["annotations"] = annotations
            __props__.__dict__["description"] = description
            __props__.__dict__["labels"] = labels
            __props__.__dict__["members"] = members
            __props__.__dict__["name"] = name
            __props__.__dict__["template_revisions"] = template_revisions
            __props__.__dict__["default_revision_id"] = None
        super(ClusterTemplate, __self__).__init__(
            'rancher2:index/clusterTemplate:ClusterTemplate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            default_revision_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            members: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterTemplateMemberArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            template_revisions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterTemplateTemplateRevisionArgs']]]]] = None) -> 'ClusterTemplate':
        """
        Get an existing ClusterTemplate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for the cluster template (map)
        :param pulumi.Input[str] default_revision_id: (Computed) Default cluster template revision ID (string)
        :param pulumi.Input[str] description: Cluster template description
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for the cluster template (map)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterTemplateMemberArgs']]]] members: Cluster template members (list)
        :param pulumi.Input[str] name: The cluster template name (string)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterTemplateTemplateRevisionArgs']]]] template_revisions: Cluster template revisions (list)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ClusterTemplateState.__new__(_ClusterTemplateState)

        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["default_revision_id"] = default_revision_id
        __props__.__dict__["description"] = description
        __props__.__dict__["labels"] = labels
        __props__.__dict__["members"] = members
        __props__.__dict__["name"] = name
        __props__.__dict__["template_revisions"] = template_revisions
        return ClusterTemplate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for the cluster template (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="defaultRevisionId")
    def default_revision_id(self) -> pulumi.Output[str]:
        """
        (Computed) Default cluster template revision ID (string)
        """
        return pulumi.get(self, "default_revision_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Cluster template description
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for the cluster template (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def members(self) -> pulumi.Output[Optional[Sequence['outputs.ClusterTemplateMember']]]:
        """
        Cluster template members (list)
        """
        return pulumi.get(self, "members")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The cluster template name (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="templateRevisions")
    def template_revisions(self) -> pulumi.Output[Sequence['outputs.ClusterTemplateTemplateRevision']]:
        """
        Cluster template revisions (list)
        """
        return pulumi.get(self, "template_revisions")

