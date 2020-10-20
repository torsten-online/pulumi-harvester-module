# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['Bootstrap']


class Bootstrap(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 current_password: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 telemetry: Optional[pulumi.Input[bool]] = None,
                 token_ttl: Optional[pulumi.Input[int]] = None,
                 token_update: Optional[pulumi.Input[bool]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a Bootstrap resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] current_password: Current password for Admin user. Just needed for recover if admin password has been changed from other resources and token is expired (string)
        :param pulumi.Input[str] password: Password for Admin user or random generated if empty (string)
        :param pulumi.Input[bool] telemetry: Send telemetry anonymous data. Default: `false` (bool)
        :param pulumi.Input[int] token_ttl: TTL in seconds for generated admin token. Default: `0`  (int)
        :param pulumi.Input[bool] token_update: Regenerate admin token. Default: `false` (bool)
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

            __props__['current_password'] = current_password
            __props__['password'] = password
            __props__['telemetry'] = telemetry
            __props__['token_ttl'] = token_ttl
            __props__['token_update'] = token_update
            __props__['temp_token'] = None
            __props__['temp_token_id'] = None
            __props__['token'] = None
            __props__['token_id'] = None
            __props__['url'] = None
            __props__['user'] = None
        super(Bootstrap, __self__).__init__(
            'rancher2:index/bootstrap:Bootstrap',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            current_password: Optional[pulumi.Input[str]] = None,
            password: Optional[pulumi.Input[str]] = None,
            telemetry: Optional[pulumi.Input[bool]] = None,
            temp_token: Optional[pulumi.Input[str]] = None,
            temp_token_id: Optional[pulumi.Input[str]] = None,
            token: Optional[pulumi.Input[str]] = None,
            token_id: Optional[pulumi.Input[str]] = None,
            token_ttl: Optional[pulumi.Input[int]] = None,
            token_update: Optional[pulumi.Input[bool]] = None,
            url: Optional[pulumi.Input[str]] = None,
            user: Optional[pulumi.Input[str]] = None) -> 'Bootstrap':
        """
        Get an existing Bootstrap resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] current_password: Current password for Admin user. Just needed for recover if admin password has been changed from other resources and token is expired (string)
        :param pulumi.Input[str] password: Password for Admin user or random generated if empty (string)
        :param pulumi.Input[bool] telemetry: Send telemetry anonymous data. Default: `false` (bool)
        :param pulumi.Input[str] temp_token: (Computed) Generated API temporary token as helper. Should be empty (string)
        :param pulumi.Input[str] temp_token_id: (Computed) Generated API temporary token id as helper. Should be empty (string)
        :param pulumi.Input[str] token: (Computed) Generated API token for Admin User (string)
        :param pulumi.Input[str] token_id: (Computed) Generated API token id for Admin User (string)
        :param pulumi.Input[int] token_ttl: TTL in seconds for generated admin token. Default: `0`  (int)
        :param pulumi.Input[bool] token_update: Regenerate admin token. Default: `false` (bool)
        :param pulumi.Input[str] url: (Computed) URL set as server-url (string)
        :param pulumi.Input[str] user: (Computed) Admin username (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["current_password"] = current_password
        __props__["password"] = password
        __props__["telemetry"] = telemetry
        __props__["temp_token"] = temp_token
        __props__["temp_token_id"] = temp_token_id
        __props__["token"] = token
        __props__["token_id"] = token_id
        __props__["token_ttl"] = token_ttl
        __props__["token_update"] = token_update
        __props__["url"] = url
        __props__["user"] = user
        return Bootstrap(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="currentPassword")
    def current_password(self) -> pulumi.Output[str]:
        """
        Current password for Admin user. Just needed for recover if admin password has been changed from other resources and token is expired (string)
        """
        return pulumi.get(self, "current_password")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[str]:
        """
        Password for Admin user or random generated if empty (string)
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def telemetry(self) -> pulumi.Output[Optional[bool]]:
        """
        Send telemetry anonymous data. Default: `false` (bool)
        """
        return pulumi.get(self, "telemetry")

    @property
    @pulumi.getter(name="tempToken")
    def temp_token(self) -> pulumi.Output[str]:
        """
        (Computed) Generated API temporary token as helper. Should be empty (string)
        """
        return pulumi.get(self, "temp_token")

    @property
    @pulumi.getter(name="tempTokenId")
    def temp_token_id(self) -> pulumi.Output[str]:
        """
        (Computed) Generated API temporary token id as helper. Should be empty (string)
        """
        return pulumi.get(self, "temp_token_id")

    @property
    @pulumi.getter
    def token(self) -> pulumi.Output[str]:
        """
        (Computed) Generated API token for Admin User (string)
        """
        return pulumi.get(self, "token")

    @property
    @pulumi.getter(name="tokenId")
    def token_id(self) -> pulumi.Output[str]:
        """
        (Computed) Generated API token id for Admin User (string)
        """
        return pulumi.get(self, "token_id")

    @property
    @pulumi.getter(name="tokenTtl")
    def token_ttl(self) -> pulumi.Output[Optional[int]]:
        """
        TTL in seconds for generated admin token. Default: `0`  (int)
        """
        return pulumi.get(self, "token_ttl")

    @property
    @pulumi.getter(name="tokenUpdate")
    def token_update(self) -> pulumi.Output[Optional[bool]]:
        """
        Regenerate admin token. Default: `false` (bool)
        """
        return pulumi.get(self, "token_update")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[str]:
        """
        (Computed) URL set as server-url (string)
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter
    def user(self) -> pulumi.Output[str]:
        """
        (Computed) Admin username (string)
        """
        return pulumi.get(self, "user")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

