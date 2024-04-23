// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigServicesKubeApiAuditLogArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigServicesKubeApiAuditLogArgs Empty = new ClusterRkeConfigServicesKubeApiAuditLogArgs();

    @Import(name="configuration")
    private @Nullable Output<ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs> configuration;

    public Optional<Output<ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ClusterRkeConfigServicesKubeApiAuditLogArgs() {}

    private ClusterRkeConfigServicesKubeApiAuditLogArgs(ClusterRkeConfigServicesKubeApiAuditLogArgs $) {
        this.configuration = $.configuration;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigServicesKubeApiAuditLogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigServicesKubeApiAuditLogArgs $;

        public Builder() {
            $ = new ClusterRkeConfigServicesKubeApiAuditLogArgs();
        }

        public Builder(ClusterRkeConfigServicesKubeApiAuditLogArgs defaults) {
            $ = new ClusterRkeConfigServicesKubeApiAuditLogArgs(Objects.requireNonNull(defaults));
        }

        public Builder configuration(@Nullable Output<ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        public Builder configuration(ClusterRkeConfigServicesKubeApiAuditLogConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ClusterRkeConfigServicesKubeApiAuditLogArgs build() {
            return $;
        }
    }

}
