# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class Registry(pulumi.CustomResource):
    annotations: pulumi.Output[dict]
    """
    Annotations for Registry object (map)
    """
    description: pulumi.Output[str]
    """
    A registry description (string)
    """
    labels: pulumi.Output[dict]
    """
    Labels for Registry object (map)
    """
    name: pulumi.Output[str]
    """
    The name of the registry (string)
    """
    namespace_id: pulumi.Output[str]
    """
    The namespace id where to assign the namespaced registry (string)
    """
    project_id: pulumi.Output[str]
    """
    The project id where to assign the registry (string)
    """
    registries: pulumi.Output[list]
    """
    Registries data for registry (list)

      * `address` (`str`) - Address for registry.
      * `password` (`str`) - Password for the registry (string)
      * `username` (`str`) - Username for the registry (string)
    """
    def __init__(__self__, resource_name, opts=None, annotations=None, description=None, labels=None, name=None, namespace_id=None, project_id=None, registries=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Rancher v2 Registry resource. This can be used to create docker registries for Rancher v2 environments and retrieve their information.

        Depending of the availability, there are 2 types of Rancher v2 docker registries:
        - Project registry: Available to all namespaces in the `project_id`
        - Namespaced regitry: Available to just `namespace_id` in the `project_id`

        > This content is derived from https://github.com/terraform-providers/terraform-provider-rancher2/blob/master/website/docs/r/registry.html.markdown.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] annotations: Annotations for Registry object (map)
        :param pulumi.Input[str] description: A registry description (string)
        :param pulumi.Input[dict] labels: Labels for Registry object (map)
        :param pulumi.Input[str] name: The name of the registry (string)
        :param pulumi.Input[str] namespace_id: The namespace id where to assign the namespaced registry (string)
        :param pulumi.Input[str] project_id: The project id where to assign the registry (string)
        :param pulumi.Input[list] registries: Registries data for registry (list)

        The **registries** object supports the following:

          * `address` (`pulumi.Input[str]`) - Address for registry.
          * `password` (`pulumi.Input[str]`) - Password for the registry (string)
          * `username` (`pulumi.Input[str]`) - Username for the registry (string)
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
            opts.version = utilities.get_version()
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
    def get(resource_name, id, opts=None, annotations=None, description=None, labels=None, name=None, namespace_id=None, project_id=None, registries=None):
        """
        Get an existing Registry resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] annotations: Annotations for Registry object (map)
        :param pulumi.Input[str] description: A registry description (string)
        :param pulumi.Input[dict] labels: Labels for Registry object (map)
        :param pulumi.Input[str] name: The name of the registry (string)
        :param pulumi.Input[str] namespace_id: The namespace id where to assign the namespaced registry (string)
        :param pulumi.Input[str] project_id: The project id where to assign the registry (string)
        :param pulumi.Input[list] registries: Registries data for registry (list)

        The **registries** object supports the following:

          * `address` (`pulumi.Input[str]`) - Address for registry.
          * `password` (`pulumi.Input[str]`) - Password for the registry (string)
          * `username` (`pulumi.Input[str]`) - Username for the registry (string)
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
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

