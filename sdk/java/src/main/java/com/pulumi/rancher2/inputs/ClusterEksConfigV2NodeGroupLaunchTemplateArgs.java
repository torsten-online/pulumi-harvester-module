// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterEksConfigV2NodeGroupLaunchTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterEksConfigV2NodeGroupLaunchTemplateArgs Empty = new ClusterEksConfigV2NodeGroupLaunchTemplateArgs();

    /**
     * The EKS node group launch template ID (string)
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The EKS node group launch template ID (string)
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * Name of cluster registration token (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of cluster registration token (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * rancher-monitoring chart version (string)
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return rancher-monitoring chart version (string)
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private ClusterEksConfigV2NodeGroupLaunchTemplateArgs() {}

    private ClusterEksConfigV2NodeGroupLaunchTemplateArgs(ClusterEksConfigV2NodeGroupLaunchTemplateArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterEksConfigV2NodeGroupLaunchTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterEksConfigV2NodeGroupLaunchTemplateArgs $;

        public Builder() {
            $ = new ClusterEksConfigV2NodeGroupLaunchTemplateArgs();
        }

        public Builder(ClusterEksConfigV2NodeGroupLaunchTemplateArgs defaults) {
            $ = new ClusterEksConfigV2NodeGroupLaunchTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The EKS node group launch template ID (string)
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The EKS node group launch template ID (string)
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name Name of cluster registration token (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of cluster registration token (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param version rancher-monitoring chart version (string)
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version rancher-monitoring chart version (string)
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public ClusterEksConfigV2NodeGroupLaunchTemplateArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
