# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables

__all__ = ['AuthConfigAzureAd']


class AuthConfigAzureAd(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_mode: Optional[pulumi.Input[str]] = None,
                 allowed_principal_ids: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 application_id: Optional[pulumi.Input[str]] = None,
                 application_secret: Optional[pulumi.Input[str]] = None,
                 auth_endpoint: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 graph_endpoint: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 rancher_url: Optional[pulumi.Input[str]] = None,
                 tenant_id: Optional[pulumi.Input[str]] = None,
                 token_endpoint: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Rancher v2 Auth Config AzureAD resource. This can be used to configure and enable Auth Config AzureAD for Rancher v2 RKE clusters and retrieve their information.

        In addition to the built-in local auth, only one external auth config provider can be enabled at a time.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Auth Config AzureAD
        azuread = rancher2.AuthConfigAzureAd("azuread",
            application_id="<AZUREAD_APP_ID>",
            application_secret="<AZUREAD_APP_SECRET>",
            auth_endpoint="<AZUREAD_AUTH_ENDPOINT>",
            graph_endpoint="<AZUREAD_GRAPH_ENDPOINT>",
            rancher_url="<RANCHER_URL>",
            tenant_id="<AZUREAD_TENANT_ID>",
            token_endpoint="<AZUREAD_TOKEN_ENDPOINT>")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_mode: Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        :param pulumi.Input[List[pulumi.Input[str]]] allowed_principal_ids: Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource (map)
        :param pulumi.Input[str] application_id: AzureAD auth application ID (string)
        :param pulumi.Input[str] application_secret: AzureAD auth application secret (string)
        :param pulumi.Input[str] auth_endpoint: AzureAD auth endpoint (string)
        :param pulumi.Input[bool] enabled: Enable auth config provider. Default `true` (bool)
        :param pulumi.Input[str] endpoint: AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
        :param pulumi.Input[str] graph_endpoint: AzureAD graph endpoint (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource (map)
        :param pulumi.Input[str] rancher_url: Rancher URL (string). "<rancher_url>/verify-auth-azure"
        :param pulumi.Input[str] tenant_id: AzureAD tenant ID (string)
        :param pulumi.Input[str] token_endpoint: AzureAD token endpoint (string)
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

            __props__['access_mode'] = access_mode
            __props__['allowed_principal_ids'] = allowed_principal_ids
            __props__['annotations'] = annotations
            if application_id is None:
                raise TypeError("Missing required property 'application_id'")
            __props__['application_id'] = application_id
            if application_secret is None:
                raise TypeError("Missing required property 'application_secret'")
            __props__['application_secret'] = application_secret
            if auth_endpoint is None:
                raise TypeError("Missing required property 'auth_endpoint'")
            __props__['auth_endpoint'] = auth_endpoint
            __props__['enabled'] = enabled
            __props__['endpoint'] = endpoint
            if graph_endpoint is None:
                raise TypeError("Missing required property 'graph_endpoint'")
            __props__['graph_endpoint'] = graph_endpoint
            __props__['labels'] = labels
            if rancher_url is None:
                raise TypeError("Missing required property 'rancher_url'")
            __props__['rancher_url'] = rancher_url
            if tenant_id is None:
                raise TypeError("Missing required property 'tenant_id'")
            __props__['tenant_id'] = tenant_id
            if token_endpoint is None:
                raise TypeError("Missing required property 'token_endpoint'")
            __props__['token_endpoint'] = token_endpoint
            __props__['name'] = None
            __props__['type'] = None
        super(AuthConfigAzureAd, __self__).__init__(
            'rancher2:index/authConfigAzureAd:AuthConfigAzureAd',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_mode: Optional[pulumi.Input[str]] = None,
            allowed_principal_ids: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            application_id: Optional[pulumi.Input[str]] = None,
            application_secret: Optional[pulumi.Input[str]] = None,
            auth_endpoint: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            endpoint: Optional[pulumi.Input[str]] = None,
            graph_endpoint: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            rancher_url: Optional[pulumi.Input[str]] = None,
            tenant_id: Optional[pulumi.Input[str]] = None,
            token_endpoint: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'AuthConfigAzureAd':
        """
        Get an existing AuthConfigAzureAd resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_mode: Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        :param pulumi.Input[List[pulumi.Input[str]]] allowed_principal_ids: Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations of the resource (map)
        :param pulumi.Input[str] application_id: AzureAD auth application ID (string)
        :param pulumi.Input[str] application_secret: AzureAD auth application secret (string)
        :param pulumi.Input[str] auth_endpoint: AzureAD auth endpoint (string)
        :param pulumi.Input[bool] enabled: Enable auth config provider. Default `true` (bool)
        :param pulumi.Input[str] endpoint: AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
        :param pulumi.Input[str] graph_endpoint: AzureAD graph endpoint (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels of the resource (map)
        :param pulumi.Input[str] name: (Computed) The name of the resource (string)
        :param pulumi.Input[str] rancher_url: Rancher URL (string). "<rancher_url>/verify-auth-azure"
        :param pulumi.Input[str] tenant_id: AzureAD tenant ID (string)
        :param pulumi.Input[str] token_endpoint: AzureAD token endpoint (string)
        :param pulumi.Input[str] type: (Computed) The type of the resource (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["access_mode"] = access_mode
        __props__["allowed_principal_ids"] = allowed_principal_ids
        __props__["annotations"] = annotations
        __props__["application_id"] = application_id
        __props__["application_secret"] = application_secret
        __props__["auth_endpoint"] = auth_endpoint
        __props__["enabled"] = enabled
        __props__["endpoint"] = endpoint
        __props__["graph_endpoint"] = graph_endpoint
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["rancher_url"] = rancher_url
        __props__["tenant_id"] = tenant_id
        __props__["token_endpoint"] = token_endpoint
        __props__["type"] = type
        return AuthConfigAzureAd(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessMode")
    def access_mode(self) -> Optional[str]:
        """
        Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
        """
        return pulumi.get(self, "access_mode")

    @property
    @pulumi.getter(name="allowedPrincipalIds")
    def allowed_principal_ids(self) -> Optional[List[str]]:
        """
        Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://<USER_ID>`  `azuread_group://<GROUP_ID>` (list)
        """
        return pulumi.get(self, "allowed_principal_ids")

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, Any]:
        """
        Annotations of the resource (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> str:
        """
        AzureAD auth application ID (string)
        """
        return pulumi.get(self, "application_id")

    @property
    @pulumi.getter(name="applicationSecret")
    def application_secret(self) -> str:
        """
        AzureAD auth application secret (string)
        """
        return pulumi.get(self, "application_secret")

    @property
    @pulumi.getter(name="authEndpoint")
    def auth_endpoint(self) -> str:
        """
        AzureAD auth endpoint (string)
        """
        return pulumi.get(self, "auth_endpoint")

    @property
    @pulumi.getter
    def enabled(self) -> Optional[bool]:
        """
        Enable auth config provider. Default `true` (bool)
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def endpoint(self) -> Optional[str]:
        """
        AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter(name="graphEndpoint")
    def graph_endpoint(self) -> str:
        """
        AzureAD graph endpoint (string)
        """
        return pulumi.get(self, "graph_endpoint")

    @property
    @pulumi.getter
    def labels(self) -> Mapping[str, Any]:
        """
        Labels of the resource (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        (Computed) The name of the resource (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="rancherUrl")
    def rancher_url(self) -> str:
        """
        Rancher URL (string). "<rancher_url>/verify-auth-azure"
        """
        return pulumi.get(self, "rancher_url")

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> str:
        """
        AzureAD tenant ID (string)
        """
        return pulumi.get(self, "tenant_id")

    @property
    @pulumi.getter(name="tokenEndpoint")
    def token_endpoint(self) -> str:
        """
        AzureAD token endpoint (string)
        """
        return pulumi.get(self, "token_endpoint")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        (Computed) The type of the resource (string)
        """
        return pulumi.get(self, "type")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

