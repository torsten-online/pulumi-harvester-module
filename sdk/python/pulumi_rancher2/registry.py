# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['Registry']


class Registry(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 registries: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RegistryRegistryArgs']]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Rancher v2 Registry resource. This can be used to create docker registries for Rancher v2 environments and retrieve their information.

        Depending of the availability, there are 2 types of Rancher v2 docker registries:
        - Project registry: Available to all namespaces in the `project_id`
        - Namespaced registry: Available to just `namespace_id` in the `project_id`

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Project Registry
        foo = rancher2.Registry("foo",
            description="Terraform registry foo",
            project_id="<project_id>",
            registries=[rancher2.RegistryRegistryArgs(
                address="test.io",
                password="pass",
                username="user",
            )])
        ```

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Namespaced Registry
        foo = rancher2.Registry("foo",
            description="Terraform registry foo",
            namespace_id="<namespace_id>",
            project_id="<project_id>",
            registries=[rancher2.RegistryRegistryArgs(
                address="test.io",
                password="pass",
                username="user2",
            )])
        ```

        ## Import

        Registries can be imported using the registry ID in the format `<namespace_id>.<project_id>.<registry_id>`

        ```sh
         $ pulumi import rancher2:index/registry:Registry foo &lt;namespace_id&gt;.&lt;project_id&gt;.&lt;registry_id&gt;
        ```

         `<namespace_id>` is optional, just needed for namespaced registry.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Registry object (map)
        :param pulumi.Input[str] description: A registry description (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Registry object (map)
        :param pulumi.Input[str] name: The name of the registry (string)
        :param pulumi.Input[str] namespace_id: The namespace id where to assign the namespaced registry (string)
        :param pulumi.Input[str] project_id: The project id where to assign the registry (string)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RegistryRegistryArgs']]]] registries: Registries data for registry (list)
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['annotations'] = annotations
            __props__['description'] = description
            __props__['labels'] = labels
            __props__['name'] = name
            __props__['namespace_id'] = namespace_id
            if project_id is None:
                raise TypeError("Missing required property 'project_id'")
            __props__['project_id'] = project_id
            if registries is None:
                raise TypeError("Missing required property 'registries'")
            __props__['registries'] = registries
        super(Registry, __self__).__init__(
            'rancher2:index/registry:Registry',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            namespace_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            registries: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RegistryRegistryArgs']]]]] = None) -> 'Registry':
        """
        Get an existing Registry resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Registry object (map)
        :param pulumi.Input[str] description: A registry description (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Registry object (map)
        :param pulumi.Input[str] name: The name of the registry (string)
        :param pulumi.Input[str] namespace_id: The namespace id where to assign the namespaced registry (string)
        :param pulumi.Input[str] project_id: The project id where to assign the registry (string)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RegistryRegistryArgs']]]] registries: Registries data for registry (list)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["annotations"] = annotations
        __props__["description"] = description
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["namespace_id"] = namespace_id
        __props__["project_id"] = project_id
        __props__["registries"] = registries
        return Registry(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for Registry object (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A registry description (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for Registry object (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the registry (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> pulumi.Output[Optional[str]]:
        """
        The namespace id where to assign the namespaced registry (string)
        """
        return pulumi.get(self, "namespace_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The project id where to assign the registry (string)
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def registries(self) -> pulumi.Output[Sequence['outputs.RegistryRegistry']]:
        """
        Registries data for registry (list)
        """
        return pulumi.get(self, "registries")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

