# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class AuthConfigAdfs(pulumi.CustomResource):
    access_mode: pulumi.Output[str]
    """
    Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
    """
    allowed_principal_ids: pulumi.Output[list]
    """
    Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `adfs_user://<USER_ID>`  `adfs_group://<GROUP_ID>` (list)
    """
    annotations: pulumi.Output[dict]
    """
    Annotations of the resource (map)
    """
    display_name_field: pulumi.Output[str]
    """
    ADFS display name field (string)
    """
    enabled: pulumi.Output[bool]
    """
    Enable auth config provider. Default `true` (bool)
    """
    groups_field: pulumi.Output[str]
    """
    ADFS group field (string)
    """
    idp_metadata_content: pulumi.Output[str]
    """
    ADFS IDP metadata content (string)
    """
    labels: pulumi.Output[dict]
    """
    Labels of the resource (map)
    """
    name: pulumi.Output[str]
    """
    (Computed) The name of the resource (string)
    """
    rancher_api_host: pulumi.Output[str]
    """
    Rancher url. Schema needs to be specified, `https://<RANCHER_API_HOST>` (string)
    """
    sp_cert: pulumi.Output[str]
    """
    ADFS SP cert (string)
    """
    sp_key: pulumi.Output[str]
    """
    ADFS SP key (string)
    """
    type: pulumi.Output[str]
    """
    (Computed) The type of the resource (string)
    """
    uid_field: pulumi.Output[str]
    """
    ADFS UID field (string)
    """
    user_name_field: pulumi.Output[str]
    """
    ADFS user name field (string)
    """
    def __init__(__self__, resource_name, opts=None, access_mode=None, allowed_principal_ids=None, annotations=None, display_name_field=None, enabled=None, groups_field=None, idp_metadata_content=None, labels=None, rancher_api_host=None, sp_cert=None, sp_key=None, uid_field=None, user_name_field=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Rancher v2 Auth Config ADFS resource. This can be used to configure and enable Auth Config ADFS for Rancher v2 RKE clusters and retrieve their information.

        In addition to the built-in local auth, only one external auth config provider can be enabled at a time. 



        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_mode: Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        :param pulumi.Input[list] allowed_principal_ids: Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `adfs_user://<USER_ID>`  `adfs_group://<GROUP_ID>` (list)
        :param pulumi.Input[dict] annotations: Annotations of the resource (map)
        :param pulumi.Input[str] display_name_field: ADFS display name field (string)
        :param pulumi.Input[bool] enabled: Enable auth config provider. Default `true` (bool)
        :param pulumi.Input[str] groups_field: ADFS group field (string)
        :param pulumi.Input[str] idp_metadata_content: ADFS IDP metadata content (string)
        :param pulumi.Input[dict] labels: Labels of the resource (map)
        :param pulumi.Input[str] rancher_api_host: Rancher url. Schema needs to be specified, `https://<RANCHER_API_HOST>` (string)
        :param pulumi.Input[str] sp_cert: ADFS SP cert (string)
        :param pulumi.Input[str] sp_key: ADFS SP key (string)
        :param pulumi.Input[str] uid_field: ADFS UID field (string)
        :param pulumi.Input[str] user_name_field: ADFS user name field (string)
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

            __props__['access_mode'] = access_mode
            __props__['allowed_principal_ids'] = allowed_principal_ids
            __props__['annotations'] = annotations
            if display_name_field is None:
                raise TypeError("Missing required property 'display_name_field'")
            __props__['display_name_field'] = display_name_field
            __props__['enabled'] = enabled
            if groups_field is None:
                raise TypeError("Missing required property 'groups_field'")
            __props__['groups_field'] = groups_field
            if idp_metadata_content is None:
                raise TypeError("Missing required property 'idp_metadata_content'")
            __props__['idp_metadata_content'] = idp_metadata_content
            __props__['labels'] = labels
            if rancher_api_host is None:
                raise TypeError("Missing required property 'rancher_api_host'")
            __props__['rancher_api_host'] = rancher_api_host
            if sp_cert is None:
                raise TypeError("Missing required property 'sp_cert'")
            __props__['sp_cert'] = sp_cert
            if sp_key is None:
                raise TypeError("Missing required property 'sp_key'")
            __props__['sp_key'] = sp_key
            if uid_field is None:
                raise TypeError("Missing required property 'uid_field'")
            __props__['uid_field'] = uid_field
            if user_name_field is None:
                raise TypeError("Missing required property 'user_name_field'")
            __props__['user_name_field'] = user_name_field
            __props__['name'] = None
            __props__['type'] = None
        super(AuthConfigAdfs, __self__).__init__(
            'rancher2:index/authConfigAdfs:AuthConfigAdfs',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, access_mode=None, allowed_principal_ids=None, annotations=None, display_name_field=None, enabled=None, groups_field=None, idp_metadata_content=None, labels=None, name=None, rancher_api_host=None, sp_cert=None, sp_key=None, type=None, uid_field=None, user_name_field=None):
        """
        Get an existing AuthConfigAdfs resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_mode: Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        :param pulumi.Input[list] allowed_principal_ids: Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `adfs_user://<USER_ID>`  `adfs_group://<GROUP_ID>` (list)
        :param pulumi.Input[dict] annotations: Annotations of the resource (map)
        :param pulumi.Input[str] display_name_field: ADFS display name field (string)
        :param pulumi.Input[bool] enabled: Enable auth config provider. Default `true` (bool)
        :param pulumi.Input[str] groups_field: ADFS group field (string)
        :param pulumi.Input[str] idp_metadata_content: ADFS IDP metadata content (string)
        :param pulumi.Input[dict] labels: Labels of the resource (map)
        :param pulumi.Input[str] name: (Computed) The name of the resource (string)
        :param pulumi.Input[str] rancher_api_host: Rancher url. Schema needs to be specified, `https://<RANCHER_API_HOST>` (string)
        :param pulumi.Input[str] sp_cert: ADFS SP cert (string)
        :param pulumi.Input[str] sp_key: ADFS SP key (string)
        :param pulumi.Input[str] type: (Computed) The type of the resource (string)
        :param pulumi.Input[str] uid_field: ADFS UID field (string)
        :param pulumi.Input[str] user_name_field: ADFS user name field (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["access_mode"] = access_mode
        __props__["allowed_principal_ids"] = allowed_principal_ids
        __props__["annotations"] = annotations
        __props__["display_name_field"] = display_name_field
        __props__["enabled"] = enabled
        __props__["groups_field"] = groups_field
        __props__["idp_metadata_content"] = idp_metadata_content
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["rancher_api_host"] = rancher_api_host
        __props__["sp_cert"] = sp_cert
        __props__["sp_key"] = sp_key
        __props__["type"] = type
        __props__["uid_field"] = uid_field
        __props__["user_name_field"] = user_name_field
        return AuthConfigAdfs(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

