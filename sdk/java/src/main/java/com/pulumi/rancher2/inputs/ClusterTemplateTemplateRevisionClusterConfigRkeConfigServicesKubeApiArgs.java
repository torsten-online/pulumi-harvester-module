// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogArgs;
import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiEventRateLimitArgs;
import com.pulumi.rancher2.inputs.ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfigArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiArgs Empty = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiArgs();

    @Import(name="admissionConfiguration")
    private @Nullable Output<Map<String,Object>> admissionConfiguration;

    public Optional<Output<Map<String,Object>>> admissionConfiguration() {
        return Optional.ofNullable(this.admissionConfiguration);
    }

    @Import(name="alwaysPullImages")
    private @Nullable Output<Boolean> alwaysPullImages;

    public Optional<Output<Boolean>> alwaysPullImages() {
        return Optional.ofNullable(this.alwaysPullImages);
    }

    @Import(name="auditLog")
    private @Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogArgs> auditLog;

    public Optional<Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogArgs>> auditLog() {
        return Optional.ofNullable(this.auditLog);
    }

    @Import(name="eventRateLimit")
    private @Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiEventRateLimitArgs> eventRateLimit;

    public Optional<Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiEventRateLimitArgs>> eventRateLimit() {
        return Optional.ofNullable(this.eventRateLimit);
    }

    @Import(name="extraArgs")
    private @Nullable Output<Map<String,Object>> extraArgs;

    public Optional<Output<Map<String,Object>>> extraArgs() {
        return Optional.ofNullable(this.extraArgs);
    }

    @Import(name="extraBinds")
    private @Nullable Output<List<String>> extraBinds;

    public Optional<Output<List<String>>> extraBinds() {
        return Optional.ofNullable(this.extraBinds);
    }

    @Import(name="extraEnvs")
    private @Nullable Output<List<String>> extraEnvs;

    public Optional<Output<List<String>>> extraEnvs() {
        return Optional.ofNullable(this.extraEnvs);
    }

    @Import(name="image")
    private @Nullable Output<String> image;

    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    @Import(name="podSecurityPolicy")
    private @Nullable Output<Boolean> podSecurityPolicy;

    public Optional<Output<Boolean>> podSecurityPolicy() {
        return Optional.ofNullable(this.podSecurityPolicy);
    }

    @Import(name="secretsEncryptionConfig")
    private @Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfigArgs> secretsEncryptionConfig;

    public Optional<Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfigArgs>> secretsEncryptionConfig() {
        return Optional.ofNullable(this.secretsEncryptionConfig);
    }

    @Import(name="serviceClusterIpRange")
    private @Nullable Output<String> serviceClusterIpRange;

    public Optional<Output<String>> serviceClusterIpRange() {
        return Optional.ofNullable(this.serviceClusterIpRange);
    }

    @Import(name="serviceNodePortRange")
    private @Nullable Output<String> serviceNodePortRange;

    public Optional<Output<String>> serviceNodePortRange() {
        return Optional.ofNullable(this.serviceNodePortRange);
    }

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiArgs() {}

    private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiArgs(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiArgs $) {
        this.admissionConfiguration = $.admissionConfiguration;
        this.alwaysPullImages = $.alwaysPullImages;
        this.auditLog = $.auditLog;
        this.eventRateLimit = $.eventRateLimit;
        this.extraArgs = $.extraArgs;
        this.extraBinds = $.extraBinds;
        this.extraEnvs = $.extraEnvs;
        this.image = $.image;
        this.podSecurityPolicy = $.podSecurityPolicy;
        this.secretsEncryptionConfig = $.secretsEncryptionConfig;
        this.serviceClusterIpRange = $.serviceClusterIpRange;
        this.serviceNodePortRange = $.serviceNodePortRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiArgs $;

        public Builder() {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiArgs();
        }

        public Builder(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiArgs defaults) {
            $ = new ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiArgs(Objects.requireNonNull(defaults));
        }

        public Builder admissionConfiguration(@Nullable Output<Map<String,Object>> admissionConfiguration) {
            $.admissionConfiguration = admissionConfiguration;
            return this;
        }

        public Builder admissionConfiguration(Map<String,Object> admissionConfiguration) {
            return admissionConfiguration(Output.of(admissionConfiguration));
        }

        public Builder alwaysPullImages(@Nullable Output<Boolean> alwaysPullImages) {
            $.alwaysPullImages = alwaysPullImages;
            return this;
        }

        public Builder alwaysPullImages(Boolean alwaysPullImages) {
            return alwaysPullImages(Output.of(alwaysPullImages));
        }

        public Builder auditLog(@Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogArgs> auditLog) {
            $.auditLog = auditLog;
            return this;
        }

        public Builder auditLog(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiAuditLogArgs auditLog) {
            return auditLog(Output.of(auditLog));
        }

        public Builder eventRateLimit(@Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiEventRateLimitArgs> eventRateLimit) {
            $.eventRateLimit = eventRateLimit;
            return this;
        }

        public Builder eventRateLimit(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiEventRateLimitArgs eventRateLimit) {
            return eventRateLimit(Output.of(eventRateLimit));
        }

        public Builder extraArgs(@Nullable Output<Map<String,Object>> extraArgs) {
            $.extraArgs = extraArgs;
            return this;
        }

        public Builder extraArgs(Map<String,Object> extraArgs) {
            return extraArgs(Output.of(extraArgs));
        }

        public Builder extraBinds(@Nullable Output<List<String>> extraBinds) {
            $.extraBinds = extraBinds;
            return this;
        }

        public Builder extraBinds(List<String> extraBinds) {
            return extraBinds(Output.of(extraBinds));
        }

        public Builder extraBinds(String... extraBinds) {
            return extraBinds(List.of(extraBinds));
        }

        public Builder extraEnvs(@Nullable Output<List<String>> extraEnvs) {
            $.extraEnvs = extraEnvs;
            return this;
        }

        public Builder extraEnvs(List<String> extraEnvs) {
            return extraEnvs(Output.of(extraEnvs));
        }

        public Builder extraEnvs(String... extraEnvs) {
            return extraEnvs(List.of(extraEnvs));
        }

        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        public Builder image(String image) {
            return image(Output.of(image));
        }

        public Builder podSecurityPolicy(@Nullable Output<Boolean> podSecurityPolicy) {
            $.podSecurityPolicy = podSecurityPolicy;
            return this;
        }

        public Builder podSecurityPolicy(Boolean podSecurityPolicy) {
            return podSecurityPolicy(Output.of(podSecurityPolicy));
        }

        public Builder secretsEncryptionConfig(@Nullable Output<ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfigArgs> secretsEncryptionConfig) {
            $.secretsEncryptionConfig = secretsEncryptionConfig;
            return this;
        }

        public Builder secretsEncryptionConfig(ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiSecretsEncryptionConfigArgs secretsEncryptionConfig) {
            return secretsEncryptionConfig(Output.of(secretsEncryptionConfig));
        }

        public Builder serviceClusterIpRange(@Nullable Output<String> serviceClusterIpRange) {
            $.serviceClusterIpRange = serviceClusterIpRange;
            return this;
        }

        public Builder serviceClusterIpRange(String serviceClusterIpRange) {
            return serviceClusterIpRange(Output.of(serviceClusterIpRange));
        }

        public Builder serviceNodePortRange(@Nullable Output<String> serviceNodePortRange) {
            $.serviceNodePortRange = serviceNodePortRange;
            return this;
        }

        public Builder serviceNodePortRange(String serviceNodePortRange) {
            return serviceNodePortRange(Output.of(serviceNodePortRange));
        }

        public ClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApiArgs build() {
            return $;
        }
    }

}
