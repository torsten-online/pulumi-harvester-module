// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs Empty = new ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs();

    @Import(name="datacenter", required=true)
    private Output<String> datacenter;

    public Output<String> datacenter() {
        return this.datacenter;
    }

    @Import(name="defaultDatastore")
    private @Nullable Output<String> defaultDatastore;

    public Optional<Output<String>> defaultDatastore() {
        return Optional.ofNullable(this.defaultDatastore);
    }

    @Import(name="folder", required=true)
    private Output<String> folder;

    public Output<String> folder() {
        return this.folder;
    }

    @Import(name="resourcepoolPath")
    private @Nullable Output<String> resourcepoolPath;

    public Optional<Output<String>> resourcepoolPath() {
        return Optional.ofNullable(this.resourcepoolPath);
    }

    @Import(name="server", required=true)
    private Output<String> server;

    public Output<String> server() {
        return this.server;
    }

    private ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs() {}

    private ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs(ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs $) {
        this.datacenter = $.datacenter;
        this.defaultDatastore = $.defaultDatastore;
        this.folder = $.folder;
        this.resourcepoolPath = $.resourcepoolPath;
        this.server = $.server;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs $;

        public Builder() {
            $ = new ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs();
        }

        public Builder(ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs defaults) {
            $ = new ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs(Objects.requireNonNull(defaults));
        }

        public Builder datacenter(Output<String> datacenter) {
            $.datacenter = datacenter;
            return this;
        }

        public Builder datacenter(String datacenter) {
            return datacenter(Output.of(datacenter));
        }

        public Builder defaultDatastore(@Nullable Output<String> defaultDatastore) {
            $.defaultDatastore = defaultDatastore;
            return this;
        }

        public Builder defaultDatastore(String defaultDatastore) {
            return defaultDatastore(Output.of(defaultDatastore));
        }

        public Builder folder(Output<String> folder) {
            $.folder = folder;
            return this;
        }

        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        public Builder resourcepoolPath(@Nullable Output<String> resourcepoolPath) {
            $.resourcepoolPath = resourcepoolPath;
            return this;
        }

        public Builder resourcepoolPath(String resourcepoolPath) {
            return resourcepoolPath(Output.of(resourcepoolPath));
        }

        public Builder server(Output<String> server) {
            $.server = server;
            return this;
        }

        public Builder server(String server) {
            return server(Output.of(server));
        }

        public ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs build() {
            if ($.datacenter == null) {
                throw new MissingRequiredPropertyException("ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs", "datacenter");
            }
            if ($.folder == null) {
                throw new MissingRequiredPropertyException("ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs", "folder");
            }
            if ($.server == null) {
                throw new MissingRequiredPropertyException("ClusterRkeConfigCloudProviderVsphereCloudProviderWorkspaceArgs", "server");
            }
            return $;
        }
    }

}
