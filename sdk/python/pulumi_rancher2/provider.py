# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['Provider']


class Provider(pulumi.ProviderResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_key: Optional[pulumi.Input[str]] = None,
                 api_url: Optional[pulumi.Input[str]] = None,
                 bootstrap: Optional[pulumi.Input[bool]] = None,
                 ca_certs: Optional[pulumi.Input[str]] = None,
                 insecure: Optional[pulumi.Input[bool]] = None,
                 retries: Optional[pulumi.Input[int]] = None,
                 secret_key: Optional[pulumi.Input[str]] = None,
                 token_key: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        The provider type for the rancher2 package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_key: API Key used to authenticate with the rancher server
        :param pulumi.Input[str] api_url: The URL to the rancher API
        :param pulumi.Input[bool] bootstrap: Bootstrap rancher server
        :param pulumi.Input[str] ca_certs: CA certificates used to sign rancher server tls certificates. Mandatory if self signed tls and insecure option false
        :param pulumi.Input[bool] insecure: Allow insecure connections to Rancher. Mandatory if self signed tls and not ca_certs provided
        :param pulumi.Input[int] retries: Rancher connection retries
        :param pulumi.Input[str] secret_key: API secret used to authenticate with the rancher server
        :param pulumi.Input[str] token_key: API token used to authenticate with the rancher server
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

            __props__['access_key'] = access_key
            if api_url is None and not opts.urn:
                raise TypeError("Missing required property 'api_url'")
            __props__['api_url'] = api_url
            if bootstrap is None:
                bootstrap = (_utilities.get_env_bool('RANCHER_BOOTSTRAP') or False)
            __props__['bootstrap'] = pulumi.Output.from_input(bootstrap).apply(pulumi.runtime.to_json) if bootstrap is not None else None
            __props__['ca_certs'] = ca_certs
            if insecure is None:
                insecure = (_utilities.get_env_bool('RANCHER_INSECURE') or False)
            __props__['insecure'] = pulumi.Output.from_input(insecure).apply(pulumi.runtime.to_json) if insecure is not None else None
            __props__['retries'] = pulumi.Output.from_input(retries).apply(pulumi.runtime.to_json) if retries is not None else None
            __props__['secret_key'] = secret_key
            __props__['token_key'] = token_key
        super(Provider, __self__).__init__(
            'rancher2',
            resource_name,
            __props__,
            opts)

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

