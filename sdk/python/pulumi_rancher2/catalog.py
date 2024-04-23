# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['CatalogArgs', 'Catalog']

@pulumi.input_type
class CatalogArgs:
    def __init__(__self__, *,
                 url: pulumi.Input[str],
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 branch: Optional[pulumi.Input[str]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 refresh: Optional[pulumi.Input[bool]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Catalog resource.
        :param pulumi.Input[str] url: The url of the catalog repo (string)
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for the catalog (map)
        :param pulumi.Input[str] branch: The branch of the catalog repo to use. Default `master` (string)
        :param pulumi.Input[str] cluster_id: The cluster id of the catalog. Mandatory if `scope = cluster` (string)
        :param pulumi.Input[str] description: A catalog description (string)
        :param pulumi.Input[str] kind: The kind of the catalog. Just helm by the moment (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for the catalog (map)
        :param pulumi.Input[str] name: The name of the catalog (string)
        :param pulumi.Input[str] password: The password to access the catalog if needed (string)
        :param pulumi.Input[str] project_id: The project id of the catalog. Mandatory if `scope = project` (string)
        :param pulumi.Input[bool] refresh: Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
        :param pulumi.Input[str] scope: The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
        :param pulumi.Input[str] username: The username to access the catalog if needed (string)
        :param pulumi.Input[str] version: Helm version for the catalog. Available options: `helm_v2` and `helm_v3` (string)
        """
        pulumi.set(__self__, "url", url)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if branch is not None:
            pulumi.set(__self__, "branch", branch)
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if kind is not None:
            pulumi.set(__self__, "kind", kind)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if refresh is not None:
            pulumi.set(__self__, "refresh", refresh)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if username is not None:
            pulumi.set(__self__, "username", username)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def url(self) -> pulumi.Input[str]:
        """
        The url of the catalog repo (string)
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: pulumi.Input[str]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for the catalog (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter
    def branch(self) -> Optional[pulumi.Input[str]]:
        """
        The branch of the catalog repo to use. Default `master` (string)
        """
        return pulumi.get(self, "branch")

    @branch.setter
    def branch(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "branch", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The cluster id of the catalog. Mandatory if `scope = cluster` (string)
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A catalog description (string)
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def kind(self) -> Optional[pulumi.Input[str]]:
        """
        The kind of the catalog. Just helm by the moment (string)
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kind", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for the catalog (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the catalog (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        The password to access the catalog if needed (string)
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The project id of the catalog. Mandatory if `scope = project` (string)
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def refresh(self) -> Optional[pulumi.Input[bool]]:
        """
        Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
        """
        return pulumi.get(self, "refresh")

    @refresh.setter
    def refresh(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "refresh", value)

    @property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input[str]]:
        """
        The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scope", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        The username to access the catalog if needed (string)
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[str]]:
        """
        Helm version for the catalog. Available options: `helm_v2` and `helm_v3` (string)
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version", value)


@pulumi.input_type
class _CatalogState:
    def __init__(__self__, *,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 branch: Optional[pulumi.Input[str]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 refresh: Optional[pulumi.Input[bool]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Catalog resources.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for the catalog (map)
        :param pulumi.Input[str] branch: The branch of the catalog repo to use. Default `master` (string)
        :param pulumi.Input[str] cluster_id: The cluster id of the catalog. Mandatory if `scope = cluster` (string)
        :param pulumi.Input[str] description: A catalog description (string)
        :param pulumi.Input[str] kind: The kind of the catalog. Just helm by the moment (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for the catalog (map)
        :param pulumi.Input[str] name: The name of the catalog (string)
        :param pulumi.Input[str] password: The password to access the catalog if needed (string)
        :param pulumi.Input[str] project_id: The project id of the catalog. Mandatory if `scope = project` (string)
        :param pulumi.Input[bool] refresh: Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
        :param pulumi.Input[str] scope: The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
        :param pulumi.Input[str] url: The url of the catalog repo (string)
        :param pulumi.Input[str] username: The username to access the catalog if needed (string)
        :param pulumi.Input[str] version: Helm version for the catalog. Available options: `helm_v2` and `helm_v3` (string)
        """
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if branch is not None:
            pulumi.set(__self__, "branch", branch)
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if kind is not None:
            pulumi.set(__self__, "kind", kind)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if refresh is not None:
            pulumi.set(__self__, "refresh", refresh)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if url is not None:
            pulumi.set(__self__, "url", url)
        if username is not None:
            pulumi.set(__self__, "username", username)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Annotations for the catalog (map)
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter
    def branch(self) -> Optional[pulumi.Input[str]]:
        """
        The branch of the catalog repo to use. Default `master` (string)
        """
        return pulumi.get(self, "branch")

    @branch.setter
    def branch(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "branch", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The cluster id of the catalog. Mandatory if `scope = cluster` (string)
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A catalog description (string)
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def kind(self) -> Optional[pulumi.Input[str]]:
        """
        The kind of the catalog. Just helm by the moment (string)
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kind", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Labels for the catalog (map)
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the catalog (string)
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        The password to access the catalog if needed (string)
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The project id of the catalog. Mandatory if `scope = project` (string)
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def refresh(self) -> Optional[pulumi.Input[bool]]:
        """
        Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
        """
        return pulumi.get(self, "refresh")

    @refresh.setter
    def refresh(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "refresh", value)

    @property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input[str]]:
        """
        The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scope", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        The url of the catalog repo (string)
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        The username to access the catalog if needed (string)
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[str]]:
        """
        Helm version for the catalog. Available options: `helm_v2` and `helm_v3` (string)
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version", value)


class Catalog(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 branch: Optional[pulumi.Input[str]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 refresh: Optional[pulumi.Input[bool]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Rancher v2 Catalog resource. This can be used to create cluster, global and/or project catalogs for Rancher v2 environments and retrieve their information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new Rancher2 Global Catalog
        foo_global = rancher2.Catalog("foo-global",
            name="foo-global",
            url="https://<CATALOG_URL>")
        # Create a new Rancher2 Cluster Catalog
        foo_cluster = rancher2.Catalog("foo-cluster",
            name="foo-cluster",
            url="https://<CATALOG_URL>",
            scope="cluster")
        # Create a new Rancher2 Project Catalog
        foo_project = rancher2.Catalog("foo-project",
            name="foo-project",
            url="https://<CATALOG_URL>",
            scope="project")
        ```

        ## Import

        Catalogs can be imported using the Rancher Catalog ID and its scope.

        ```sh
        $ pulumi import rancher2:index/catalog:Catalog foo &lt;SCOPE&gt;.&lt;CATALOG_ID_ID&gt;
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for the catalog (map)
        :param pulumi.Input[str] branch: The branch of the catalog repo to use. Default `master` (string)
        :param pulumi.Input[str] cluster_id: The cluster id of the catalog. Mandatory if `scope = cluster` (string)
        :param pulumi.Input[str] description: A catalog description (string)
        :param pulumi.Input[str] kind: The kind of the catalog. Just helm by the moment (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for the catalog (map)
        :param pulumi.Input[str] name: The name of the catalog (string)
        :param pulumi.Input[str] password: The password to access the catalog if needed (string)
        :param pulumi.Input[str] project_id: The project id of the catalog. Mandatory if `scope = project` (string)
        :param pulumi.Input[bool] refresh: Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
        :param pulumi.Input[str] scope: The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
        :param pulumi.Input[str] url: The url of the catalog repo (string)
        :param pulumi.Input[str] username: The username to access the catalog if needed (string)
        :param pulumi.Input[str] version: Helm version for the catalog. Available options: `helm_v2` and `helm_v3` (string)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CatalogArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Rancher v2 Catalog resource. This can be used to create cluster, global and/or project catalogs for Rancher v2 environments and retrieve their information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new Rancher2 Global Catalog
        foo_global = rancher2.Catalog("foo-global",
            name="foo-global",
            url="https://<CATALOG_URL>")
        # Create a new Rancher2 Cluster Catalog
        foo_cluster = rancher2.Catalog("foo-cluster",
            name="foo-cluster",
            url="https://<CATALOG_URL>",
            scope="cluster")
        # Create a new Rancher2 Project Catalog
        foo_project = rancher2.Catalog("foo-project",
            name="foo-project",
            url="https://<CATALOG_URL>",
            scope="project")
        ```

        ## Import

        Catalogs can be imported using the Rancher Catalog ID and its scope.

        ```sh
        $ pulumi import rancher2:index/catalog:Catalog foo &lt;SCOPE&gt;.&lt;CATALOG_ID_ID&gt;
        ```

        :param str resource_name: The name of the resource.
        :param CatalogArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CatalogArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 branch: Optional[pulumi.Input[str]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 refresh: Optional[pulumi.Input[bool]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CatalogArgs.__new__(CatalogArgs)

            __props__.__dict__["annotations"] = annotations
            __props__.__dict__["branch"] = branch
            __props__.__dict__["cluster_id"] = cluster_id
            __props__.__dict__["description"] = description
            __props__.__dict__["kind"] = kind
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            __props__.__dict__["password"] = None if password is None else pulumi.Output.secret(password)
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["refresh"] = refresh
            __props__.__dict__["scope"] = scope
            if url is None and not opts.urn:
                raise TypeError("Missing required property 'url'")
            __props__.__dict__["url"] = url
            __props__.__dict__["username"] = None if username is None else pulumi.Output.secret(username)
            __props__.__dict__["version"] = version
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["password", "username"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Catalog, __self__).__init__(
            'rancher2:index/catalog:Catalog',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            branch: Optional[pulumi.Input[str]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            kind: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            password: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            refresh: Optional[pulumi.Input[bool]] = None,
            scope: Optional[pulumi.Input[str]] = None,
            url: Optional[pulumi.Input[str]] = None,
            username: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[str]] = None) -> 'Catalog':
        """
        Get an existing Catalog resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for the catalog (map)
        :param pulumi.Input[str] branch: The branch of the catalog repo to use. Default `master` (string)
        :param pulumi.Input[str] cluster_id: The cluster id of the catalog. Mandatory if `scope = cluster` (string)
        :param pulumi.Input[str] description: A catalog description (string)
        :param pulumi.Input[str] kind: The kind of the catalog. Just helm by the moment (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for the catalog (map)
        :param pulumi.Input[str] name: The name of the catalog (string)
        :param pulumi.Input[str] password: The password to access the catalog if needed (string)
        :param pulumi.Input[str] project_id: The project id of the catalog. Mandatory if `scope = project` (string)
        :param pulumi.Input[bool] refresh: Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
        :param pulumi.Input[str] scope: The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
        :param pulumi.Input[str] url: The url of the catalog repo (string)
        :param pulumi.Input[str] username: The username to access the catalog if needed (string)
        :param pulumi.Input[str] version: Helm version for the catalog. Available options: `helm_v2` and `helm_v3` (string)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CatalogState.__new__(_CatalogState)

        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["branch"] = branch
        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["description"] = description
        __props__.__dict__["kind"] = kind
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["password"] = password
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["refresh"] = refresh
        __props__.__dict__["scope"] = scope
        __props__.__dict__["url"] = url
        __props__.__dict__["username"] = username
        __props__.__dict__["version"] = version
        return Catalog(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for the catalog (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter
    def branch(self) -> pulumi.Output[Optional[str]]:
        """
        The branch of the catalog repo to use. Default `master` (string)
        """
        return pulumi.get(self, "branch")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[Optional[str]]:
        """
        The cluster id of the catalog. Mandatory if `scope = cluster` (string)
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A catalog description (string)
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def kind(self) -> pulumi.Output[Optional[str]]:
        """
        The kind of the catalog. Just helm by the moment (string)
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for the catalog (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the catalog (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[Optional[str]]:
        """
        The password to access the catalog if needed (string)
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[Optional[str]]:
        """
        The project id of the catalog. Mandatory if `scope = project` (string)
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def refresh(self) -> pulumi.Output[Optional[bool]]:
        """
        Catalog will wait for refresh after tf creation and on every tf read. Default `false` (bool)
        """
        return pulumi.get(self, "refresh")

    @property
    @pulumi.getter
    def scope(self) -> pulumi.Output[Optional[str]]:
        """
        The scope of the catalog. `cluster`, `global`, and `project` are supported. Default `global` (string)
        """
        return pulumi.get(self, "scope")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[str]:
        """
        The url of the catalog repo (string)
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter
    def username(self) -> pulumi.Output[Optional[str]]:
        """
        The username to access the catalog if needed (string)
        """
        return pulumi.get(self, "username")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[str]:
        """
        Helm version for the catalog. Available options: `helm_v2` and `helm_v3` (string)
        """
        return pulumi.get(self, "version")

