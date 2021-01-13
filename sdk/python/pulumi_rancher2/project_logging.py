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

__all__ = ['ProjectLogging']


class ProjectLogging(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 custom_target_config: Optional[pulumi.Input[pulumi.InputType['ProjectLoggingCustomTargetConfigArgs']]] = None,
                 elasticsearch_config: Optional[pulumi.Input[pulumi.InputType['ProjectLoggingElasticsearchConfigArgs']]] = None,
                 enable_json_parsing: Optional[pulumi.Input[bool]] = None,
                 fluentd_config: Optional[pulumi.Input[pulumi.InputType['ProjectLoggingFluentdConfigArgs']]] = None,
                 kafka_config: Optional[pulumi.Input[pulumi.InputType['ProjectLoggingKafkaConfigArgs']]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace_id: Optional[pulumi.Input[str]] = None,
                 output_flush_interval: Optional[pulumi.Input[int]] = None,
                 output_tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 splunk_config: Optional[pulumi.Input[pulumi.InputType['ProjectLoggingSplunkConfigArgs']]] = None,
                 syslog_config: Optional[pulumi.Input[pulumi.InputType['ProjectLoggingSyslogConfigArgs']]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Rancher v2 Project Logging resource. This can be used to create Project Logging for Rancher v2 environments and retrieve their information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_rancher2 as rancher2

        # Create a new rancher2 Project Logging
        foo = rancher2.ProjectLogging("foo",
            kind="syslog",
            project_id="<project_id>",
            syslog_config=rancher2.ProjectLoggingSyslogConfigArgs(
                endpoint="<syslog_endpoint>",
                protocol="udp",
                severity="notice",
                ssl_verify=False,
            ))
        ```

        ## Import

        Project Logging can be imported using the Rancher Project Logging ID

        ```sh
         $ pulumi import rancher2:index/projectLogging:ProjectLogging foo &lt;project_logging_id&gt;
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Project Logging object (map)
        :param pulumi.Input[pulumi.InputType['ProjectLoggingCustomTargetConfigArgs']] custom_target_config: The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearch_config`, `fluentd_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['ProjectLoggingElasticsearchConfigArgs']] elasticsearch_config: The elasticsearch config for Project Logging. For `kind = elasticsearch`. Conflicts with `custom_target_config`, `fluentd_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        :param pulumi.Input[bool] enable_json_parsing: Enable json log parsing. Default: `false` (bool)
        :param pulumi.Input[pulumi.InputType['ProjectLoggingFluentdConfigArgs']] fluentd_config: The fluentd config for Project Logging. For `kind = fluentd`. Conflicts with `custom_target_config`, `elasticsearch_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['ProjectLoggingKafkaConfigArgs']] kafka_config: The kafka config for Project Logging. For `kind = kafka`. Conflicts with `custom_target_config`, `elasticsearch_config`, `fluentd_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        :param pulumi.Input[str] kind: The kind of the Project Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Project Logging object (map)
        :param pulumi.Input[str] name: The name of the Project Logging config (string)
        :param pulumi.Input[str] namespace_id: The namespace id from Project logging (string)
        :param pulumi.Input[int] output_flush_interval: How often buffered logs would be flushed. Default: `3` seconds (int)
        :param pulumi.Input[Mapping[str, Any]] output_tags: The output tags for Project Logging (map)
        :param pulumi.Input[str] project_id: The project id to configure logging (string)
        :param pulumi.Input[pulumi.InputType['ProjectLoggingSplunkConfigArgs']] splunk_config: The splunk config for Project Logging. For `kind = splunk`. Conflicts with `custom_target_config`, `elasticsearch_config`, `fluentd_config`, `kafka_config`, and `syslog_config` (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['ProjectLoggingSyslogConfigArgs']] syslog_config: The syslog config for Project Logging. For `kind = syslog`. Conflicts with `custom_target_config`, `elasticsearch_config`, `fluentd_config`, `kafka_config`, and `splunk_config` (list maxitems:1)
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
            __props__['custom_target_config'] = custom_target_config
            __props__['elasticsearch_config'] = elasticsearch_config
            __props__['enable_json_parsing'] = enable_json_parsing
            __props__['fluentd_config'] = fluentd_config
            __props__['kafka_config'] = kafka_config
            if kind is None and not opts.urn:
                raise TypeError("Missing required property 'kind'")
            __props__['kind'] = kind
            __props__['labels'] = labels
            __props__['name'] = name
            __props__['namespace_id'] = namespace_id
            __props__['output_flush_interval'] = output_flush_interval
            __props__['output_tags'] = output_tags
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__['project_id'] = project_id
            __props__['splunk_config'] = splunk_config
            __props__['syslog_config'] = syslog_config
        super(ProjectLogging, __self__).__init__(
            'rancher2:index/projectLogging:ProjectLogging',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            custom_target_config: Optional[pulumi.Input[pulumi.InputType['ProjectLoggingCustomTargetConfigArgs']]] = None,
            elasticsearch_config: Optional[pulumi.Input[pulumi.InputType['ProjectLoggingElasticsearchConfigArgs']]] = None,
            enable_json_parsing: Optional[pulumi.Input[bool]] = None,
            fluentd_config: Optional[pulumi.Input[pulumi.InputType['ProjectLoggingFluentdConfigArgs']]] = None,
            kafka_config: Optional[pulumi.Input[pulumi.InputType['ProjectLoggingKafkaConfigArgs']]] = None,
            kind: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            namespace_id: Optional[pulumi.Input[str]] = None,
            output_flush_interval: Optional[pulumi.Input[int]] = None,
            output_tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            splunk_config: Optional[pulumi.Input[pulumi.InputType['ProjectLoggingSplunkConfigArgs']]] = None,
            syslog_config: Optional[pulumi.Input[pulumi.InputType['ProjectLoggingSyslogConfigArgs']]] = None) -> 'ProjectLogging':
        """
        Get an existing ProjectLogging resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] annotations: Annotations for Project Logging object (map)
        :param pulumi.Input[pulumi.InputType['ProjectLoggingCustomTargetConfigArgs']] custom_target_config: The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearch_config`, `fluentd_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['ProjectLoggingElasticsearchConfigArgs']] elasticsearch_config: The elasticsearch config for Project Logging. For `kind = elasticsearch`. Conflicts with `custom_target_config`, `fluentd_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        :param pulumi.Input[bool] enable_json_parsing: Enable json log parsing. Default: `false` (bool)
        :param pulumi.Input[pulumi.InputType['ProjectLoggingFluentdConfigArgs']] fluentd_config: The fluentd config for Project Logging. For `kind = fluentd`. Conflicts with `custom_target_config`, `elasticsearch_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['ProjectLoggingKafkaConfigArgs']] kafka_config: The kafka config for Project Logging. For `kind = kafka`. Conflicts with `custom_target_config`, `elasticsearch_config`, `fluentd_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        :param pulumi.Input[str] kind: The kind of the Project Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
        :param pulumi.Input[Mapping[str, Any]] labels: Labels for Project Logging object (map)
        :param pulumi.Input[str] name: The name of the Project Logging config (string)
        :param pulumi.Input[str] namespace_id: The namespace id from Project logging (string)
        :param pulumi.Input[int] output_flush_interval: How often buffered logs would be flushed. Default: `3` seconds (int)
        :param pulumi.Input[Mapping[str, Any]] output_tags: The output tags for Project Logging (map)
        :param pulumi.Input[str] project_id: The project id to configure logging (string)
        :param pulumi.Input[pulumi.InputType['ProjectLoggingSplunkConfigArgs']] splunk_config: The splunk config for Project Logging. For `kind = splunk`. Conflicts with `custom_target_config`, `elasticsearch_config`, `fluentd_config`, `kafka_config`, and `syslog_config` (list maxitems:1)
        :param pulumi.Input[pulumi.InputType['ProjectLoggingSyslogConfigArgs']] syslog_config: The syslog config for Project Logging. For `kind = syslog`. Conflicts with `custom_target_config`, `elasticsearch_config`, `fluentd_config`, `kafka_config`, and `splunk_config` (list maxitems:1)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["annotations"] = annotations
        __props__["custom_target_config"] = custom_target_config
        __props__["elasticsearch_config"] = elasticsearch_config
        __props__["enable_json_parsing"] = enable_json_parsing
        __props__["fluentd_config"] = fluentd_config
        __props__["kafka_config"] = kafka_config
        __props__["kind"] = kind
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["namespace_id"] = namespace_id
        __props__["output_flush_interval"] = output_flush_interval
        __props__["output_tags"] = output_tags
        __props__["project_id"] = project_id
        __props__["splunk_config"] = splunk_config
        __props__["syslog_config"] = syslog_config
        return ProjectLogging(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Annotations for Project Logging object (map)
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="customTargetConfig")
    def custom_target_config(self) -> pulumi.Output[Optional['outputs.ProjectLoggingCustomTargetConfig']]:
        """
        The custom target config for Cluster Logging. For `kind = custom`. Conflicts with `elasticsearch_config`, `fluentd_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        """
        return pulumi.get(self, "custom_target_config")

    @property
    @pulumi.getter(name="elasticsearchConfig")
    def elasticsearch_config(self) -> pulumi.Output[Optional['outputs.ProjectLoggingElasticsearchConfig']]:
        """
        The elasticsearch config for Project Logging. For `kind = elasticsearch`. Conflicts with `custom_target_config`, `fluentd_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        """
        return pulumi.get(self, "elasticsearch_config")

    @property
    @pulumi.getter(name="enableJsonParsing")
    def enable_json_parsing(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable json log parsing. Default: `false` (bool)
        """
        return pulumi.get(self, "enable_json_parsing")

    @property
    @pulumi.getter(name="fluentdConfig")
    def fluentd_config(self) -> pulumi.Output[Optional['outputs.ProjectLoggingFluentdConfig']]:
        """
        The fluentd config for Project Logging. For `kind = fluentd`. Conflicts with `custom_target_config`, `elasticsearch_config`, `kafka_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        """
        return pulumi.get(self, "fluentd_config")

    @property
    @pulumi.getter(name="kafkaConfig")
    def kafka_config(self) -> pulumi.Output[Optional['outputs.ProjectLoggingKafkaConfig']]:
        """
        The kafka config for Project Logging. For `kind = kafka`. Conflicts with `custom_target_config`, `elasticsearch_config`, `fluentd_config`, `splunk_config` and `syslog_config` (list maxitems:1)
        """
        return pulumi.get(self, "kafka_config")

    @property
    @pulumi.getter
    def kind(self) -> pulumi.Output[str]:
        """
        The kind of the Project Logging. `elasticsearch`, `fluentd`, `kafka`, `splunk` and `syslog` are supported (string)
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Labels for Project Logging object (map)
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Project Logging config (string)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> pulumi.Output[Optional[str]]:
        """
        The namespace id from Project logging (string)
        """
        return pulumi.get(self, "namespace_id")

    @property
    @pulumi.getter(name="outputFlushInterval")
    def output_flush_interval(self) -> pulumi.Output[Optional[int]]:
        """
        How often buffered logs would be flushed. Default: `3` seconds (int)
        """
        return pulumi.get(self, "output_flush_interval")

    @property
    @pulumi.getter(name="outputTags")
    def output_tags(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        The output tags for Project Logging (map)
        """
        return pulumi.get(self, "output_tags")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The project id to configure logging (string)
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="splunkConfig")
    def splunk_config(self) -> pulumi.Output[Optional['outputs.ProjectLoggingSplunkConfig']]:
        """
        The splunk config for Project Logging. For `kind = splunk`. Conflicts with `custom_target_config`, `elasticsearch_config`, `fluentd_config`, `kafka_config`, and `syslog_config` (list maxitems:1)
        """
        return pulumi.get(self, "splunk_config")

    @property
    @pulumi.getter(name="syslogConfig")
    def syslog_config(self) -> pulumi.Output[Optional['outputs.ProjectLoggingSyslogConfig']]:
        """
        The syslog config for Project Logging. For `kind = syslog`. Conflicts with `custom_target_config`, `elasticsearch_config`, `fluentd_config`, `kafka_config`, and `splunk_config` (list maxitems:1)
        """
        return pulumi.get(self, "syslog_config")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

