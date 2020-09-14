// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Rancher2.Outputs
{

    [OutputType]
    public sealed class ClusterLoggingKafkaConfig
    {
        public readonly ImmutableArray<string> BrokerEndpoints;
        public readonly string? Certificate;
        public readonly string? ClientCert;
        public readonly string? ClientKey;
        public readonly string Topic;
        public readonly string? ZookeeperEndpoint;

        [OutputConstructor]
        private ClusterLoggingKafkaConfig(
            ImmutableArray<string> brokerEndpoints,

            string? certificate,

            string? clientCert,

            string? clientKey,

            string topic,

            string? zookeeperEndpoint)
        {
            BrokerEndpoints = brokerEndpoints;
            Certificate = certificate;
            ClientCert = clientCert;
            ClientKey = clientKey;
            Topic = topic;
            ZookeeperEndpoint = zookeeperEndpoint;
        }
    }
}
