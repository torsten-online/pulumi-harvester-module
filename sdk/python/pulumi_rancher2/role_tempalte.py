# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['RoleTempalteArgs', 'RoleTempalte']

@pulumi.input_type
class RoleTempalteArgs:
    def __init__(__self__, *,
                 administrative: Optional[pulumi.Input[bool]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 context: Optional[pulumi.Input[str]] = None,
                 default_role: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 external: Optional[pulumi.Input[bool]] = None,
                 hidden: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 locked: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 role_template_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['RoleTempalteRuleArgs']]]] = None):
        """
        The set of arguments for constructing a RoleTempalte resource.
        :param pulumi.Input[bool] administrative: Administrative role template. Default `false` (bool)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for role template object (map)
        :param pulumi.Input[str] context: Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
        :param pulumi.Input[bool] default_role: Default role template for new created cluster or project. Default `false` (bool)
        :param pulumi.Input[str] description: Role template description (string)
        :param pulumi.Input[bool] external: External role template. Default `false` (bool)
        :param pulumi.Input[bool] hidden: Hidden role template. Default `false` (bool)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for role template object (map)
        :param pulumi.Input[bool] locked: Locked role template. Default `false` (bool)
        :param pulumi.Input[str] name: Role template name (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] role_template_ids: Inherit role template IDs (list)
        :param pulumi.Input[Sequence[pulumi.Input['RoleTempalteRuleArgs']]] rules: Role template policy rules (list)
        """
        if administrative is not None:
            pulumi.set(__self__, "administrative", administrative)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if context is not None:
            pulumi.set(__self__, "context", context)
        if default_role is not None:
            pulumi.set(__self__, "default_role", default_role)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if external is not None:
            pulumi.set(__self__, "external", external)
        if hidden is not None:
            pulumi.set(__self__, "hidden", hidden)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if locked is not None:
            pulumi.set(__self__, "locked", locked)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if role_template_ids is not None:
            pulumi.set(__self__, "role_template_ids", role_template_ids)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

    @property
    @pulumi.getter
    def administrative(self) -> Optional[pulumi.Input[bool]]:
        """
        Administrative role template. Default `false` (bool)
        """
        return pulumi.get(self, "administrative")

    @administrative.setter
    def administrative(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "administrative", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for role template object (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter
    def context(self) -> Optional[pulumi.Input[str]]:
        """
        Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
        """
        return pulumi.get(self, "context")

    @context.setter
    def context(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "context", value)

    @property
    @pulumi.getter(name="defaultRole")
    def default_role(self) -> Optional[pulumi.Input[bool]]:
        """
        Default role template for new created cluster or project. Default `false` (bool)
        """
        return pulumi.get(self, "default_role")

    @default_role.setter
    def default_role(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "default_role", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Role template description (string)
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def external(self) -> Optional[pulumi.Input[bool]]:
        """
        External role template. Default `false` (bool)
        """
        return pulumi.get(self, "external")

    @external.setter
    def external(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "external", value)

    @property
    @pulumi.getter
    def hidden(self) -> Optional[pulumi.Input[bool]]:
        """
        Hidden role template. Default `false` (bool)
        """
        return pulumi.get(self, "hidden")

    @hidden.setter
    def hidden(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "hidden", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for role template object (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def locked(self) -> Optional[pulumi.Input[bool]]:
        """
        Locked role template. Default `false` (bool)
        """
        return pulumi.get(self, "locked")

    @locked.setter
    def locked(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "locked", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Role template name (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="roleTemplateIds")
    def role_template_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Inherit role template IDs (list)
        """
        return pulumi.get(self, "role_template_ids")

    @role_template_ids.setter
    def role_template_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "role_template_ids", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RoleTempalteRuleArgs']]]]:
        """
        Role template policy rules (list)
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RoleTempalteRuleArgs']]]]):
        pulumi.set(self, "rules", value)


@pulumi.input_type
class _RoleTempalteState:
    def __init__(__self__, *,
                 administrative: Optional[pulumi.Input[bool]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 builtin: Optional[pulumi.Input[bool]] = None,
                 context: Optional[pulumi.Input[str]] = None,
                 default_role: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 external: Optional[pulumi.Input[bool]] = None,
                 hidden: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 locked: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 role_template_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['RoleTempalteRuleArgs']]]] = None):
        """
        Input properties used for looking up and filtering RoleTempalte resources.
        :param pulumi.Input[bool] administrative: Administrative role template. Default `false` (bool)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for role template object (map)
        :param pulumi.Input[bool] builtin: (Computed) Builtin role template (string)
        :param pulumi.Input[str] context: Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
        :param pulumi.Input[bool] default_role: Default role template for new created cluster or project. Default `false` (bool)
        :param pulumi.Input[str] description: Role template description (string)
        :param pulumi.Input[bool] external: External role template. Default `false` (bool)
        :param pulumi.Input[bool] hidden: Hidden role template. Default `false` (bool)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for role template object (map)
        :param pulumi.Input[bool] locked: Locked role template. Default `false` (bool)
        :param pulumi.Input[str] name: Role template name (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] role_template_ids: Inherit role template IDs (list)
        :param pulumi.Input[Sequence[pulumi.Input['RoleTempalteRuleArgs']]] rules: Role template policy rules (list)
        """
        if administrative is not None:
            pulumi.set(__self__, "administrative", administrative)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if builtin is not None:
            pulumi.set(__self__, "builtin", builtin)
        if context is not None:
            pulumi.set(__self__, "context", context)
        if default_role is not None:
            pulumi.set(__self__, "default_role", default_role)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if external is not None:
            pulumi.set(__self__, "external", external)
        if hidden is not None:
            pulumi.set(__self__, "hidden", hidden)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if locked is not None:
            pulumi.set(__self__, "locked", locked)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if role_template_ids is not None:
            pulumi.set(__self__, "role_template_ids", role_template_ids)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

    @property
    @pulumi.getter
    def administrative(self) -> Optional[pulumi.Input[bool]]:
        """
        Administrative role template. Default `false` (bool)
        """
        return pulumi.get(self, "administrative")

    @administrative.setter
    def administrative(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "administrative", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for role template object (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter
    def builtin(self) -> Optional[pulumi.Input[bool]]:
        """
        (Computed) Builtin role template (string)
        """
        return pulumi.get(self, "builtin")

    @builtin.setter
    def builtin(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "builtin", value)

    @property
    @pulumi.getter
    def context(self) -> Optional[pulumi.Input[str]]:
        """
        Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
        """
        return pulumi.get(self, "context")

    @context.setter
    def context(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "context", value)

    @property
    @pulumi.getter(name="defaultRole")
    def default_role(self) -> Optional[pulumi.Input[bool]]:
        """
        Default role template for new created cluster or project. Default `false` (bool)
        """
        return pulumi.get(self, "default_role")

    @default_role.setter
    def default_role(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "default_role", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Role template description (string)
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def external(self) -> Optional[pulumi.Input[bool]]:
        """
        External role template. Default `false` (bool)
        """
        return pulumi.get(self, "external")

    @external.setter
    def external(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "external", value)

    @property
    @pulumi.getter
    def hidden(self) -> Optional[pulumi.Input[bool]]:
        """
        Hidden role template. Default `false` (bool)
        """
        return pulumi.get(self, "hidden")

    @hidden.setter
    def hidden(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "hidden", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for role template object (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def locked(self) -> Optional[pulumi.Input[bool]]:
        """
        Locked role template. Default `false` (bool)
        """
        return pulumi.get(self, "locked")

    @locked.setter
    def locked(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "locked", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Role template name (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="roleTemplateIds")
    def role_template_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Inherit role template IDs (list)
        """
        return pulumi.get(self, "role_template_ids")

    @role_template_ids.setter
    def role_template_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "role_template_ids", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RoleTempalteRuleArgs']]]]:
        """
        Role template policy rules (list)
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RoleTempalteRuleArgs']]]]):
        pulumi.set(self, "rules", value)


class RoleTempalte(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 administrative: Optional[pulumi.Input[bool]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 context: Optional[pulumi.Input[str]] = None,
                 default_role: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 external: Optional[pulumi.Input[bool]] = None,
                 hidden: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 locked: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 role_template_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RoleTempalteRuleArgs']]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Rancher v2 Role Template resource. This can be used to create Role Template for Rancher v2 and retrieve their information.

        `cluster` and `project` scopes are supported for role templates.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 cluster Role Template
        foo = rancher2.RoleTempalte("foo",
            context="cluster",
            default_role=True,
            description="Terraform role template acceptance test",
            rules=[rancher2.RoleTempalteRuleArgs(
                api_groups=["*"],
                resources=["secrets"],
                verbs=["create"],
            )])
        ```

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 project Role Template
        foo = rancher2.RoleTempalte("foo",
            context="project",
            default_role=True,
            description="Terraform role template acceptance test",
            rules=[rancher2.RoleTempalteRuleArgs(
                api_groups=["*"],
                resources=["secrets"],
                verbs=["create"],
            )])
        ```

        ## Import

        Role Template can be imported using the Rancher Role Template ID

        ```sh
         $ pulumi import rancher2:index/roleTempalte:RoleTempalte foo &lt;role_template_id&gt;
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] administrative: Administrative role template. Default `false` (bool)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for role template object (map)
        :param pulumi.Input[str] context: Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
        :param pulumi.Input[bool] default_role: Default role template for new created cluster or project. Default `false` (bool)
        :param pulumi.Input[str] description: Role template description (string)
        :param pulumi.Input[bool] external: External role template. Default `false` (bool)
        :param pulumi.Input[bool] hidden: Hidden role template. Default `false` (bool)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for role template object (map)
        :param pulumi.Input[bool] locked: Locked role template. Default `false` (bool)
        :param pulumi.Input[str] name: Role template name (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] role_template_ids: Inherit role template IDs (list)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RoleTempalteRuleArgs']]]] rules: Role template policy rules (list)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[RoleTempalteArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 Role Template resource. This can be used to create Role Template for Rancher v2 and retrieve their information.

        `cluster` and `project` scopes are supported for role templates.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 cluster Role Template
        foo = rancher2.RoleTempalte("foo",
            context="cluster",
            default_role=True,
            description="Terraform role template acceptance test",
            rules=[rancher2.RoleTempalteRuleArgs(
                api_groups=["*"],
                resources=["secrets"],
                verbs=["create"],
            )])
        ```

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 project Role Template
        foo = rancher2.RoleTempalte("foo",
            context="project",
            default_role=True,
            description="Terraform role template acceptance test",
            rules=[rancher2.RoleTempalteRuleArgs(
                api_groups=["*"],
                resources=["secrets"],
                verbs=["create"],
            )])
        ```

        ## Import

        Role Template can be imported using the Rancher Role Template ID

        ```sh
         $ pulumi import rancher2:index/roleTempalte:RoleTempalte foo &lt;role_template_id&gt;
        ```

        :param str resource_name: The name of the resource.
        :param RoleTempalteArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RoleTempalteArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 administrative: Optional[pulumi.Input[bool]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 context: Optional[pulumi.Input[str]] = None,
                 default_role: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 external: Optional[pulumi.Input[bool]] = None,
                 hidden: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 locked: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 role_template_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RoleTempalteRuleArgs']]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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
            __props__ = RoleTempalteArgs.__new__(RoleTempalteArgs)

            __props__.__dict__["administrative"] = administrative
            __props__.__dict__["annotations"] = annotations
            __props__.__dict__["context"] = context
            __props__.__dict__["default_role"] = default_role
            __props__.__dict__["description"] = description
            __props__.__dict__["external"] = external
            __props__.__dict__["hidden"] = hidden
            __props__.__dict__["labels"] = labels
            __props__.__dict__["locked"] = locked
            __props__.__dict__["name"] = name
            __props__.__dict__["role_template_ids"] = role_template_ids
            __props__.__dict__["rules"] = rules
            __props__.__dict__["builtin"] = None
        super(RoleTempalte, __self__).__init__(
            'rancher2:index/roleTempalte:RoleTempalte',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            administrative: Optional[pulumi.Input[bool]] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            builtin: Optional[pulumi.Input[bool]] = None,
            context: Optional[pulumi.Input[str]] = None,
            default_role: Optional[pulumi.Input[bool]] = None,
            description: Optional[pulumi.Input[str]] = None,
            external: Optional[pulumi.Input[bool]] = None,
            hidden: Optional[pulumi.Input[bool]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            locked: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            role_template_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RoleTempalteRuleArgs']]]]] = None) -> 'RoleTempalte':
        """
        Get an existing RoleTempalte resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] administrative: Administrative role template. Default `false` (bool)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for role template object (map)
        :param pulumi.Input[bool] builtin: (Computed) Builtin role template (string)
        :param pulumi.Input[str] context: Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
        :param pulumi.Input[bool] default_role: Default role template for new created cluster or project. Default `false` (bool)
        :param pulumi.Input[str] description: Role template description (string)
        :param pulumi.Input[bool] external: External role template. Default `false` (bool)
        :param pulumi.Input[bool] hidden: Hidden role template. Default `false` (bool)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for role template object (map)
        :param pulumi.Input[bool] locked: Locked role template. Default `false` (bool)
        :param pulumi.Input[str] name: Role template name (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] role_template_ids: Inherit role template IDs (list)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RoleTempalteRuleArgs']]]] rules: Role template policy rules (list)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RoleTempalteState.__new__(_RoleTempalteState)

        __props__.__dict__["administrative"] = administrative
        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["builtin"] = builtin
        __props__.__dict__["context"] = context
        __props__.__dict__["default_role"] = default_role
        __props__.__dict__["description"] = description
        __props__.__dict__["external"] = external
        __props__.__dict__["hidden"] = hidden
        __props__.__dict__["labels"] = labels
        __props__.__dict__["locked"] = locked
        __props__.__dict__["name"] = name
        __props__.__dict__["role_template_ids"] = role_template_ids
        __props__.__dict__["rules"] = rules
        return RoleTempalte(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def administrative(self) -> pulumi.Output[Optional[bool]]:
        """
        Administrative role template. Default `false` (bool)
        """
        return pulumi.get(self, "administrative")

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for role template object (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter
    def builtin(self) -> pulumi.Output[bool]:
        """
        (Computed) Builtin role template (string)
        """
        return pulumi.get(self, "builtin")

    @property
    @pulumi.getter
    def context(self) -> pulumi.Output[Optional[str]]:
        """
        Role template context. `cluster` and `project` values are supported. Default: `cluster` (string)
        """
        return pulumi.get(self, "context")

    @property
    @pulumi.getter(name="defaultRole")
    def default_role(self) -> pulumi.Output[Optional[bool]]:
        """
        Default role template for new created cluster or project. Default `false` (bool)
        """
        return pulumi.get(self, "default_role")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Role template description (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def external(self) -> pulumi.Output[Optional[bool]]:
        """
        External role template. Default `false` (bool)
        """
        return pulumi.get(self, "external")

    @property
    @pulumi.getter
    def hidden(self) -> pulumi.Output[Optional[bool]]:
        """
        Hidden role template. Default `false` (bool)
        """
        return pulumi.get(self, "hidden")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for role template object (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def locked(self) -> pulumi.Output[Optional[bool]]:
        """
        Locked role template. Default `false` (bool)
        """
        return pulumi.get(self, "locked")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Role template name (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="roleTemplateIds")
    def role_template_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        Inherit role template IDs (list)
        """
        return pulumi.get(self, "role_template_ids")

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Sequence['outputs.RoleTempalteRule']]:
        """
        Role template policy rules (list)
        """
        return pulumi.get(self, "rules")

