# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['GlobalDns']


class GlobalDns(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 fqdn: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 multi_cluster_app_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 provider_id: Optional[pulumi.Input[str]] = None,
                 ttl: Optional[pulumi.Input[int]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Rancher V2 Global DNS resource. This can be used to create Global DNS records for Rancher V2.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Global DNS Provider
        foo_global_dns_provider = rancher2.GlobalDnsProvider("fooGlobalDnsProvider",
            root_domain="example.com",
            route53_config=rancher2.GlobalDnsProviderRoute53ConfigArgs(
                access_key="YYYYYYYYYYYYYYYYYYYY",
                secret_key="XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
                zone_type="private",
                region="us-east-1",
            ))
        # Create a new rancher2 Global DNS using project IDs
        foo_global_dns = rancher2.GlobalDns("fooGlobalDns",
            fqdn="foo.example.com",
            provider_id=foo_global_dns_provider.id,
            project_ids=[
                "project1",
                "project2",
            ])
        ```

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Global DNS Provider
        foo_global_dns_provider = rancher2.GlobalDnsProvider("fooGlobalDnsProvider",
            root_domain="example.com",
            route53_config=rancher2.GlobalDnsProviderRoute53ConfigArgs(
                access_key="YYYYYYYYYYYYYYYYYYYY",
                secret_key="XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
                zone_type="private",
                region="us-east-1",
            ))
        # Create a new rancher2 Global DNS using MultiClusterApp ID
        foo_global_dns = rancher2.GlobalDns("fooGlobalDns",
            fqdn="foo.example.com",
            provider_id=foo_global_dns_provider.id,
            multi_cluster_app_id="<MCA_ID>")
        ```

        ## Import

        Global DNS Entry can be imported using the Rancher Global DNS ID

        ```sh
         $ pulumi import rancher2:index/globalDns:GlobalDns foo <global_dns_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Global DNS (map)
        :param pulumi.Input[str] fqdn: The Global DNS record (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Global DNS (map)
        :param pulumi.Input[str] multi_cluster_app_id: The MultiCluster App ID to assign to the Global DNS. Conflicts with `project_ids` (string)
        :param pulumi.Input[str] name: The name of the Global DNS (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] project_ids: A list of project_ids to assign to the Global DNS. Conflicts with `multi_cluster_app_id` (list(string))
        :param pulumi.Input[str] provider_id: The Global DNS provider ID to use (string)
        :param pulumi.Input[int] ttl: TTL in seconds for DNS record. Default: `300` (int)
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
            if fqdn is None and not opts.urn:
                raise TypeError("Missing required property 'fqdn'")
            __props__['fqdn'] = fqdn
            __props__['labels'] = labels
            __props__['multi_cluster_app_id'] = multi_cluster_app_id
            __props__['name'] = name
            __props__['project_ids'] = project_ids
            if provider_id is None and not opts.urn:
                raise TypeError("Missing required property 'provider_id'")
            __props__['provider_id'] = provider_id
            __props__['ttl'] = ttl
        super(GlobalDns, __self__).__init__(
            'rancher2:index/globalDns:GlobalDns',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            fqdn: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            multi_cluster_app_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            project_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            provider_id: Optional[pulumi.Input[str]] = None,
            ttl: Optional[pulumi.Input[int]] = None) -> 'GlobalDns':
        """
        Get an existing GlobalDns resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Global DNS (map)
        :param pulumi.Input[str] fqdn: The Global DNS record (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Global DNS (map)
        :param pulumi.Input[str] multi_cluster_app_id: The MultiCluster App ID to assign to the Global DNS. Conflicts with `project_ids` (string)
        :param pulumi.Input[str] name: The name of the Global DNS (string)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] project_ids: A list of project_ids to assign to the Global DNS. Conflicts with `multi_cluster_app_id` (list(string))
        :param pulumi.Input[str] provider_id: The Global DNS provider ID to use (string)
        :param pulumi.Input[int] ttl: TTL in seconds for DNS record. Default: `300` (int)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["annotations"] = annotations
        __props__["fqdn"] = fqdn
        __props__["labels"] = labels
        __props__["multi_cluster_app_id"] = multi_cluster_app_id
        __props__["name"] = name
        __props__["project_ids"] = project_ids
        __props__["provider_id"] = provider_id
        __props__["ttl"] = ttl
        return GlobalDns(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for Global DNS (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter
    def fqdn(self) -> pulumi.Output[str]:
        """
        The Global DNS record (string)
        """
        return pulumi.get(self, "fqdn")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for Global DNS (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="multiClusterAppId")
    def multi_cluster_app_id(self) -> pulumi.Output[Optional[str]]:
        """
        The MultiCluster App ID to assign to the Global DNS. Conflicts with `project_ids` (string)
        """
        return pulumi.get(self, "multi_cluster_app_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Global DNS (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="projectIds")
    def project_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of project_ids to assign to the Global DNS. Conflicts with `multi_cluster_app_id` (list(string))
        """
        return pulumi.get(self, "project_ids")

    @property
    @pulumi.getter(name="providerId")
    def provider_id(self) -> pulumi.Output[str]:
        """
        The Global DNS provider ID to use (string)
        """
        return pulumi.get(self, "provider_id")

    @property
    @pulumi.getter
    def ttl(self) -> pulumi.Output[Optional[int]]:
        """
        TTL in seconds for DNS record. Default: `300` (int)
        """
        return pulumi.get(self, "ttl")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

