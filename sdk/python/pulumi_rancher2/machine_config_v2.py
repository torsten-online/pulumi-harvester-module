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

__all__ = ['MachineConfigV2Args', 'MachineConfigV2']

@pulumi.input_type
class MachineConfigV2Args:
    def __init__(__self__, *,
                 generate_name: pulumi.Input[str],
                 amazonec2_config: Optional[pulumi.Input['MachineConfigV2Amazonec2ConfigArgs']] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 azure_config: Optional[pulumi.Input['MachineConfigV2AzureConfigArgs']] = None,
                 digitalocean_config: Optional[pulumi.Input['MachineConfigV2DigitaloceanConfigArgs']] = None,
                 fleet_namespace: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 linode_config: Optional[pulumi.Input['MachineConfigV2LinodeConfigArgs']] = None,
                 openstack_config: Optional[pulumi.Input['MachineConfigV2OpenstackConfigArgs']] = None,
                 vsphere_config: Optional[pulumi.Input['MachineConfigV2VsphereConfigArgs']] = None):
        """
        The set of arguments for constructing a MachineConfigV2 resource.
        :param pulumi.Input[str] generate_name: Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\"prod-pool1\" will generate \"nc-prod-pool1-?????\" name computed at `name` attribute (string)
        :param pulumi.Input['MachineConfigV2Amazonec2ConfigArgs'] amazonec2_config: AWS config for the Machine Config V2. Conflicts with `azure_config`, `digitalocean_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Machine Config V2 object (map)
        :param pulumi.Input['MachineConfigV2AzureConfigArgs'] azure_config: Azure config for the Machine Config V2. Conflicts with `amazonec2_config`, `digitalocean_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        :param pulumi.Input['MachineConfigV2DigitaloceanConfigArgs'] digitalocean_config: Digitalocean config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        :param pulumi.Input[str] fleet_namespace: Cluster V2 fleet namespace
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Machine Config V2 object (map)
        :param pulumi.Input['MachineConfigV2LinodeConfigArgs'] linode_config: Linode config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        :param pulumi.Input['MachineConfigV2OpenstackConfigArgs'] openstack_config: Openstack config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `linode_config` and `vsphere_config` (list maxitems:1)
        :param pulumi.Input['MachineConfigV2VsphereConfigArgs'] vsphere_config: vSphere config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `linode_config` and `openstack_config` (list maxitems:1)
        """
        pulumi.set(__self__, "generate_name", generate_name)
        if amazonec2_config is not None:
            pulumi.set(__self__, "amazonec2_config", amazonec2_config)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if azure_config is not None:
            pulumi.set(__self__, "azure_config", azure_config)
        if digitalocean_config is not None:
            pulumi.set(__self__, "digitalocean_config", digitalocean_config)
        if fleet_namespace is not None:
            pulumi.set(__self__, "fleet_namespace", fleet_namespace)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if linode_config is not None:
            pulumi.set(__self__, "linode_config", linode_config)
        if openstack_config is not None:
            pulumi.set(__self__, "openstack_config", openstack_config)
        if vsphere_config is not None:
            pulumi.set(__self__, "vsphere_config", vsphere_config)

    @property
    @pulumi.getter(name="generateName")
    def generate_name(self) -> pulumi.Input[str]:
        """
        Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\"prod-pool1\" will generate \"nc-prod-pool1-?????\" name computed at `name` attribute (string)
        """
        return pulumi.get(self, "generate_name")

    @generate_name.setter
    def generate_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "generate_name", value)

    @property
    @pulumi.getter(name="amazonec2Config")
    def amazonec2_config(self) -> Optional[pulumi.Input['MachineConfigV2Amazonec2ConfigArgs']]:
        """
        AWS config for the Machine Config V2. Conflicts with `azure_config`, `digitalocean_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        """
        return pulumi.get(self, "amazonec2_config")

    @amazonec2_config.setter
    def amazonec2_config(self, value: Optional[pulumi.Input['MachineConfigV2Amazonec2ConfigArgs']]):
        pulumi.set(self, "amazonec2_config", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for Machine Config V2 object (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter(name="azureConfig")
    def azure_config(self) -> Optional[pulumi.Input['MachineConfigV2AzureConfigArgs']]:
        """
        Azure config for the Machine Config V2. Conflicts with `amazonec2_config`, `digitalocean_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        """
        return pulumi.get(self, "azure_config")

    @azure_config.setter
    def azure_config(self, value: Optional[pulumi.Input['MachineConfigV2AzureConfigArgs']]):
        pulumi.set(self, "azure_config", value)

    @property
    @pulumi.getter(name="digitaloceanConfig")
    def digitalocean_config(self) -> Optional[pulumi.Input['MachineConfigV2DigitaloceanConfigArgs']]:
        """
        Digitalocean config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        """
        return pulumi.get(self, "digitalocean_config")

    @digitalocean_config.setter
    def digitalocean_config(self, value: Optional[pulumi.Input['MachineConfigV2DigitaloceanConfigArgs']]):
        pulumi.set(self, "digitalocean_config", value)

    @property
    @pulumi.getter(name="fleetNamespace")
    def fleet_namespace(self) -> Optional[pulumi.Input[str]]:
        """
        Cluster V2 fleet namespace
        """
        return pulumi.get(self, "fleet_namespace")

    @fleet_namespace.setter
    def fleet_namespace(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "fleet_namespace", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for Machine Config V2 object (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter(name="linodeConfig")
    def linode_config(self) -> Optional[pulumi.Input['MachineConfigV2LinodeConfigArgs']]:
        """
        Linode config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        """
        return pulumi.get(self, "linode_config")

    @linode_config.setter
    def linode_config(self, value: Optional[pulumi.Input['MachineConfigV2LinodeConfigArgs']]):
        pulumi.set(self, "linode_config", value)

    @property
    @pulumi.getter(name="openstackConfig")
    def openstack_config(self) -> Optional[pulumi.Input['MachineConfigV2OpenstackConfigArgs']]:
        """
        Openstack config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `linode_config` and `vsphere_config` (list maxitems:1)
        """
        return pulumi.get(self, "openstack_config")

    @openstack_config.setter
    def openstack_config(self, value: Optional[pulumi.Input['MachineConfigV2OpenstackConfigArgs']]):
        pulumi.set(self, "openstack_config", value)

    @property
    @pulumi.getter(name="vsphereConfig")
    def vsphere_config(self) -> Optional[pulumi.Input['MachineConfigV2VsphereConfigArgs']]:
        """
        vSphere config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `linode_config` and `openstack_config` (list maxitems:1)
        """
        return pulumi.get(self, "vsphere_config")

    @vsphere_config.setter
    def vsphere_config(self, value: Optional[pulumi.Input['MachineConfigV2VsphereConfigArgs']]):
        pulumi.set(self, "vsphere_config", value)


@pulumi.input_type
class _MachineConfigV2State:
    def __init__(__self__, *,
                 amazonec2_config: Optional[pulumi.Input['MachineConfigV2Amazonec2ConfigArgs']] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 azure_config: Optional[pulumi.Input['MachineConfigV2AzureConfigArgs']] = None,
                 digitalocean_config: Optional[pulumi.Input['MachineConfigV2DigitaloceanConfigArgs']] = None,
                 fleet_namespace: Optional[pulumi.Input[str]] = None,
                 generate_name: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 linode_config: Optional[pulumi.Input['MachineConfigV2LinodeConfigArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 openstack_config: Optional[pulumi.Input['MachineConfigV2OpenstackConfigArgs']] = None,
                 resource_version: Optional[pulumi.Input[str]] = None,
                 vsphere_config: Optional[pulumi.Input['MachineConfigV2VsphereConfigArgs']] = None):
        """
        Input properties used for looking up and filtering MachineConfigV2 resources.
        :param pulumi.Input['MachineConfigV2Amazonec2ConfigArgs'] amazonec2_config: AWS config for the Machine Config V2. Conflicts with `azure_config`, `digitalocean_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Machine Config V2 object (map)
        :param pulumi.Input['MachineConfigV2AzureConfigArgs'] azure_config: Azure config for the Machine Config V2. Conflicts with `amazonec2_config`, `digitalocean_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        :param pulumi.Input['MachineConfigV2DigitaloceanConfigArgs'] digitalocean_config: Digitalocean config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        :param pulumi.Input[str] fleet_namespace: Cluster V2 fleet namespace
        :param pulumi.Input[str] generate_name: Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\"prod-pool1\" will generate \"nc-prod-pool1-?????\" name computed at `name` attribute (string)
        :param pulumi.Input[str] kind: (Computed) The machine config kind (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Machine Config V2 object (map)
        :param pulumi.Input['MachineConfigV2LinodeConfigArgs'] linode_config: Linode config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        :param pulumi.Input[str] name: (Computed) The machine config name (string)
        :param pulumi.Input['MachineConfigV2OpenstackConfigArgs'] openstack_config: Openstack config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `linode_config` and `vsphere_config` (list maxitems:1)
        :param pulumi.Input[str] resource_version: (Computed) The machine config k8s resource version (string)
        :param pulumi.Input['MachineConfigV2VsphereConfigArgs'] vsphere_config: vSphere config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `linode_config` and `openstack_config` (list maxitems:1)
        """
        if amazonec2_config is not None:
            pulumi.set(__self__, "amazonec2_config", amazonec2_config)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if azure_config is not None:
            pulumi.set(__self__, "azure_config", azure_config)
        if digitalocean_config is not None:
            pulumi.set(__self__, "digitalocean_config", digitalocean_config)
        if fleet_namespace is not None:
            pulumi.set(__self__, "fleet_namespace", fleet_namespace)
        if generate_name is not None:
            pulumi.set(__self__, "generate_name", generate_name)
        if kind is not None:
            pulumi.set(__self__, "kind", kind)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if linode_config is not None:
            pulumi.set(__self__, "linode_config", linode_config)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if openstack_config is not None:
            pulumi.set(__self__, "openstack_config", openstack_config)
        if resource_version is not None:
            pulumi.set(__self__, "resource_version", resource_version)
        if vsphere_config is not None:
            pulumi.set(__self__, "vsphere_config", vsphere_config)

    @property
    @pulumi.getter(name="amazonec2Config")
    def amazonec2_config(self) -> Optional[pulumi.Input['MachineConfigV2Amazonec2ConfigArgs']]:
        """
        AWS config for the Machine Config V2. Conflicts with `azure_config`, `digitalocean_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        """
        return pulumi.get(self, "amazonec2_config")

    @amazonec2_config.setter
    def amazonec2_config(self, value: Optional[pulumi.Input['MachineConfigV2Amazonec2ConfigArgs']]):
        pulumi.set(self, "amazonec2_config", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for Machine Config V2 object (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter(name="azureConfig")
    def azure_config(self) -> Optional[pulumi.Input['MachineConfigV2AzureConfigArgs']]:
        """
        Azure config for the Machine Config V2. Conflicts with `amazonec2_config`, `digitalocean_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        """
        return pulumi.get(self, "azure_config")

    @azure_config.setter
    def azure_config(self, value: Optional[pulumi.Input['MachineConfigV2AzureConfigArgs']]):
        pulumi.set(self, "azure_config", value)

    @property
    @pulumi.getter(name="digitaloceanConfig")
    def digitalocean_config(self) -> Optional[pulumi.Input['MachineConfigV2DigitaloceanConfigArgs']]:
        """
        Digitalocean config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        """
        return pulumi.get(self, "digitalocean_config")

    @digitalocean_config.setter
    def digitalocean_config(self, value: Optional[pulumi.Input['MachineConfigV2DigitaloceanConfigArgs']]):
        pulumi.set(self, "digitalocean_config", value)

    @property
    @pulumi.getter(name="fleetNamespace")
    def fleet_namespace(self) -> Optional[pulumi.Input[str]]:
        """
        Cluster V2 fleet namespace
        """
        return pulumi.get(self, "fleet_namespace")

    @fleet_namespace.setter
    def fleet_namespace(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "fleet_namespace", value)

    @property
    @pulumi.getter(name="generateName")
    def generate_name(self) -> Optional[pulumi.Input[str]]:
        """
        Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\"prod-pool1\" will generate \"nc-prod-pool1-?????\" name computed at `name` attribute (string)
        """
        return pulumi.get(self, "generate_name")

    @generate_name.setter
    def generate_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "generate_name", value)

    @property
    @pulumi.getter
    def kind(self) -> Optional[pulumi.Input[str]]:
        """
        (Computed) The machine config kind (string)
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kind", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for Machine Config V2 object (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter(name="linodeConfig")
    def linode_config(self) -> Optional[pulumi.Input['MachineConfigV2LinodeConfigArgs']]:
        """
        Linode config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        """
        return pulumi.get(self, "linode_config")

    @linode_config.setter
    def linode_config(self, value: Optional[pulumi.Input['MachineConfigV2LinodeConfigArgs']]):
        pulumi.set(self, "linode_config", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        (Computed) The machine config name (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="openstackConfig")
    def openstack_config(self) -> Optional[pulumi.Input['MachineConfigV2OpenstackConfigArgs']]:
        """
        Openstack config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `linode_config` and `vsphere_config` (list maxitems:1)
        """
        return pulumi.get(self, "openstack_config")

    @openstack_config.setter
    def openstack_config(self, value: Optional[pulumi.Input['MachineConfigV2OpenstackConfigArgs']]):
        pulumi.set(self, "openstack_config", value)

    @property
    @pulumi.getter(name="resourceVersion")
    def resource_version(self) -> Optional[pulumi.Input[str]]:
        """
        (Computed) The machine config k8s resource version (string)
        """
        return pulumi.get(self, "resource_version")

    @resource_version.setter
    def resource_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_version", value)

    @property
    @pulumi.getter(name="vsphereConfig")
    def vsphere_config(self) -> Optional[pulumi.Input['MachineConfigV2VsphereConfigArgs']]:
        """
        vSphere config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `linode_config` and `openstack_config` (list maxitems:1)
        """
        return pulumi.get(self, "vsphere_config")

    @vsphere_config.setter
    def vsphere_config(self, value: Optional[pulumi.Input['MachineConfigV2VsphereConfigArgs']]):
        pulumi.set(self, "vsphere_config", value)


class MachineConfigV2(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 amazonec2_config: Optional[pulumi.Input[pulumi.InputType['MachineConfigV2Amazonec2ConfigArgs']]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 azure_config: Optional[pulumi.Input[pulumi.InputType['MachineConfigV2AzureConfigArgs']]] = None,
                 digitalocean_config: Optional[pulumi.Input[pulumi.InputType['MachineConfigV2DigitaloceanConfigArgs']]] = None,
                 fleet_namespace: Optional[pulumi.Input[str]] = None,
                 generate_name: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 linode_config: Optional[pulumi.Input[pulumi.InputType['MachineConfigV2LinodeConfigArgs']]] = None,
                 openstack_config: Optional[pulumi.Input[pulumi.InputType['MachineConfigV2OpenstackConfigArgs']]] = None,
                 vsphere_config: Optional[pulumi.Input[pulumi.InputType['MachineConfigV2VsphereConfigArgs']]] = None,
                 __props__=None):
        """
        Provides a Rancher v2 Machine config v2 resource. This can be used to create Machine Config v2 for Rancher v2 and retrieve their information. This resource is supported as tech preview from Rancher v2.6.0 and above.

        `amazonec2`, `azure`, `digitalocean`, `linode`, `openstack`, and `vsphere` cloud providers are supported for machine config V2

        **Note** This resource is used by

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['MachineConfigV2Amazonec2ConfigArgs']] amazonec2_config: AWS config for the Machine Config V2. Conflicts with `azure_config`, `digitalocean_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Machine Config V2 object (map)
        :param pulumi.Input[pulumi.InputType['MachineConfigV2AzureConfigArgs']] azure_config: Azure config for the Machine Config V2. Conflicts with `amazonec2_config`, `digitalocean_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['MachineConfigV2DigitaloceanConfigArgs']] digitalocean_config: Digitalocean config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        :param pulumi.Input[str] fleet_namespace: Cluster V2 fleet namespace
        :param pulumi.Input[str] generate_name: Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\"prod-pool1\" will generate \"nc-prod-pool1-?????\" name computed at `name` attribute (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Machine Config V2 object (map)
        :param pulumi.Input[pulumi.InputType['MachineConfigV2LinodeConfigArgs']] linode_config: Linode config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['MachineConfigV2OpenstackConfigArgs']] openstack_config: Openstack config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `linode_config` and `vsphere_config` (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['MachineConfigV2VsphereConfigArgs']] vsphere_config: vSphere config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `linode_config` and `openstack_config` (list maxitems:1)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MachineConfigV2Args,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 Machine config v2 resource. This can be used to create Machine Config v2 for Rancher v2 and retrieve their information. This resource is supported as tech preview from Rancher v2.6.0 and above.

        `amazonec2`, `azure`, `digitalocean`, `linode`, `openstack`, and `vsphere` cloud providers are supported for machine config V2

        **Note** This resource is used by

        :param str resource_name: The name of the resource.
        :param MachineConfigV2Args args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MachineConfigV2Args, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 amazonec2_config: Optional[pulumi.Input[pulumi.InputType['MachineConfigV2Amazonec2ConfigArgs']]] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 azure_config: Optional[pulumi.Input[pulumi.InputType['MachineConfigV2AzureConfigArgs']]] = None,
                 digitalocean_config: Optional[pulumi.Input[pulumi.InputType['MachineConfigV2DigitaloceanConfigArgs']]] = None,
                 fleet_namespace: Optional[pulumi.Input[str]] = None,
                 generate_name: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 linode_config: Optional[pulumi.Input[pulumi.InputType['MachineConfigV2LinodeConfigArgs']]] = None,
                 openstack_config: Optional[pulumi.Input[pulumi.InputType['MachineConfigV2OpenstackConfigArgs']]] = None,
                 vsphere_config: Optional[pulumi.Input[pulumi.InputType['MachineConfigV2VsphereConfigArgs']]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MachineConfigV2Args.__new__(MachineConfigV2Args)

            __props__.__dict__["amazonec2_config"] = amazonec2_config
            __props__.__dict__["annotations"] = annotations
            __props__.__dict__["azure_config"] = azure_config
            __props__.__dict__["digitalocean_config"] = digitalocean_config
            __props__.__dict__["fleet_namespace"] = fleet_namespace
            if generate_name is None and not opts.urn:
                raise TypeError("Missing required property 'generate_name'")
            __props__.__dict__["generate_name"] = generate_name
            __props__.__dict__["labels"] = labels
            __props__.__dict__["linode_config"] = linode_config
            __props__.__dict__["openstack_config"] = openstack_config
            __props__.__dict__["vsphere_config"] = vsphere_config
            __props__.__dict__["kind"] = None
            __props__.__dict__["name"] = None
            __props__.__dict__["resource_version"] = None
        super(MachineConfigV2, __self__).__init__(
            'rancher2:index/machineConfigV2:MachineConfigV2',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            amazonec2_config: Optional[pulumi.Input[pulumi.InputType['MachineConfigV2Amazonec2ConfigArgs']]] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            azure_config: Optional[pulumi.Input[pulumi.InputType['MachineConfigV2AzureConfigArgs']]] = None,
            digitalocean_config: Optional[pulumi.Input[pulumi.InputType['MachineConfigV2DigitaloceanConfigArgs']]] = None,
            fleet_namespace: Optional[pulumi.Input[str]] = None,
            generate_name: Optional[pulumi.Input[str]] = None,
            kind: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            linode_config: Optional[pulumi.Input[pulumi.InputType['MachineConfigV2LinodeConfigArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            openstack_config: Optional[pulumi.Input[pulumi.InputType['MachineConfigV2OpenstackConfigArgs']]] = None,
            resource_version: Optional[pulumi.Input[str]] = None,
            vsphere_config: Optional[pulumi.Input[pulumi.InputType['MachineConfigV2VsphereConfigArgs']]] = None) -> 'MachineConfigV2':
        """
        Get an existing MachineConfigV2 resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['MachineConfigV2Amazonec2ConfigArgs']] amazonec2_config: AWS config for the Machine Config V2. Conflicts with `azure_config`, `digitalocean_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Machine Config V2 object (map)
        :param pulumi.Input[pulumi.InputType['MachineConfigV2AzureConfigArgs']] azure_config: Azure config for the Machine Config V2. Conflicts with `amazonec2_config`, `digitalocean_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['MachineConfigV2DigitaloceanConfigArgs']] digitalocean_config: Digitalocean config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        :param pulumi.Input[str] fleet_namespace: Cluster V2 fleet namespace
        :param pulumi.Input[str] generate_name: Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\"prod-pool1\" will generate \"nc-prod-pool1-?????\" name computed at `name` attribute (string)
        :param pulumi.Input[str] kind: (Computed) The machine config kind (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Machine Config V2 object (map)
        :param pulumi.Input[pulumi.InputType['MachineConfigV2LinodeConfigArgs']] linode_config: Linode config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        :param pulumi.Input[str] name: (Computed) The machine config name (string)
        :param pulumi.Input[pulumi.InputType['MachineConfigV2OpenstackConfigArgs']] openstack_config: Openstack config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `linode_config` and `vsphere_config` (list maxitems:1)
        :param pulumi.Input[str] resource_version: (Computed) The machine config k8s resource version (string)
        :param pulumi.Input[pulumi.InputType['MachineConfigV2VsphereConfigArgs']] vsphere_config: vSphere config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `linode_config` and `openstack_config` (list maxitems:1)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MachineConfigV2State.__new__(_MachineConfigV2State)

        __props__.__dict__["amazonec2_config"] = amazonec2_config
        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["azure_config"] = azure_config
        __props__.__dict__["digitalocean_config"] = digitalocean_config
        __props__.__dict__["fleet_namespace"] = fleet_namespace
        __props__.__dict__["generate_name"] = generate_name
        __props__.__dict__["kind"] = kind
        __props__.__dict__["labels"] = labels
        __props__.__dict__["linode_config"] = linode_config
        __props__.__dict__["name"] = name
        __props__.__dict__["openstack_config"] = openstack_config
        __props__.__dict__["resource_version"] = resource_version
        __props__.__dict__["vsphere_config"] = vsphere_config
        return MachineConfigV2(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="amazonec2Config")
    def amazonec2_config(self) -> pulumi.Output[Optional['outputs.MachineConfigV2Amazonec2Config']]:
        """
        AWS config for the Machine Config V2. Conflicts with `azure_config`, `digitalocean_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        """
        return pulumi.get(self, "amazonec2_config")

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for Machine Config V2 object (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="azureConfig")
    def azure_config(self) -> pulumi.Output[Optional['outputs.MachineConfigV2AzureConfig']]:
        """
        Azure config for the Machine Config V2. Conflicts with `amazonec2_config`, `digitalocean_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        """
        return pulumi.get(self, "azure_config")

    @property
    @pulumi.getter(name="digitaloceanConfig")
    def digitalocean_config(self) -> pulumi.Output[Optional['outputs.MachineConfigV2DigitaloceanConfig']]:
        """
        Digitalocean config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `linode_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        """
        return pulumi.get(self, "digitalocean_config")

    @property
    @pulumi.getter(name="fleetNamespace")
    def fleet_namespace(self) -> pulumi.Output[Optional[str]]:
        """
        Cluster V2 fleet namespace
        """
        return pulumi.get(self, "fleet_namespace")

    @property
    @pulumi.getter(name="generateName")
    def generate_name(self) -> pulumi.Output[str]:
        """
        Cluster V2 generate name. The pattern to generate machine config name. e.g  generate_name=\"prod-pool1\" will generate \"nc-prod-pool1-?????\" name computed at `name` attribute (string)
        """
        return pulumi.get(self, "generate_name")

    @property
    @pulumi.getter
    def kind(self) -> pulumi.Output[str]:
        """
        (Computed) The machine config kind (string)
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for Machine Config V2 object (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="linodeConfig")
    def linode_config(self) -> pulumi.Output[Optional['outputs.MachineConfigV2LinodeConfig']]:
        """
        Linode config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `openstack_config` and `vsphere_config` (list maxitems:1)
        """
        return pulumi.get(self, "linode_config")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        (Computed) The machine config name (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="openstackConfig")
    def openstack_config(self) -> pulumi.Output[Optional['outputs.MachineConfigV2OpenstackConfig']]:
        """
        Openstack config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `linode_config` and `vsphere_config` (list maxitems:1)
        """
        return pulumi.get(self, "openstack_config")

    @property
    @pulumi.getter(name="resourceVersion")
    def resource_version(self) -> pulumi.Output[str]:
        """
        (Computed) The machine config k8s resource version (string)
        """
        return pulumi.get(self, "resource_version")

    @property
    @pulumi.getter(name="vsphereConfig")
    def vsphere_config(self) -> pulumi.Output[Optional['outputs.MachineConfigV2VsphereConfig']]:
        """
        vSphere config for the Machine Config V2. Conflicts with `amazonec2_config`, `azure_config`, `digitalocean_config`, `linode_config` and `openstack_config` (list maxitems:1)
        """
        return pulumi.get(self, "vsphere_config")

