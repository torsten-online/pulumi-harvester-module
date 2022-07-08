// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.rancher2.inputs.ClusterV2RkeConfigRegistriesConfigArgs;
import com.pulumi.rancher2.inputs.ClusterV2RkeConfigRegistriesMirrorArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterV2RkeConfigRegistriesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterV2RkeConfigRegistriesArgs Empty = new ClusterV2RkeConfigRegistriesArgs();

    /**
     * Cluster V2 docker registries config (list)
     * 
     */
    @Import(name="configs")
    private @Nullable Output<List<ClusterV2RkeConfigRegistriesConfigArgs>> configs;

    /**
     * @return Cluster V2 docker registries config (list)
     * 
     */
    public Optional<Output<List<ClusterV2RkeConfigRegistriesConfigArgs>>> configs() {
        return Optional.ofNullable(this.configs);
    }

    /**
     * Cluster V2 docker registries mirror (list)
     * 
     */
    @Import(name="mirrors")
    private @Nullable Output<List<ClusterV2RkeConfigRegistriesMirrorArgs>> mirrors;

    /**
     * @return Cluster V2 docker registries mirror (list)
     * 
     */
    public Optional<Output<List<ClusterV2RkeConfigRegistriesMirrorArgs>>> mirrors() {
        return Optional.ofNullable(this.mirrors);
    }

    private ClusterV2RkeConfigRegistriesArgs() {}

    private ClusterV2RkeConfigRegistriesArgs(ClusterV2RkeConfigRegistriesArgs $) {
        this.configs = $.configs;
        this.mirrors = $.mirrors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterV2RkeConfigRegistriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterV2RkeConfigRegistriesArgs $;

        public Builder() {
            $ = new ClusterV2RkeConfigRegistriesArgs();
        }

        public Builder(ClusterV2RkeConfigRegistriesArgs defaults) {
            $ = new ClusterV2RkeConfigRegistriesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configs Cluster V2 docker registries config (list)
         * 
         * @return builder
         * 
         */
        public Builder configs(@Nullable Output<List<ClusterV2RkeConfigRegistriesConfigArgs>> configs) {
            $.configs = configs;
            return this;
        }

        /**
         * @param configs Cluster V2 docker registries config (list)
         * 
         * @return builder
         * 
         */
        public Builder configs(List<ClusterV2RkeConfigRegistriesConfigArgs> configs) {
            return configs(Output.of(configs));
        }

        /**
         * @param configs Cluster V2 docker registries config (list)
         * 
         * @return builder
         * 
         */
        public Builder configs(ClusterV2RkeConfigRegistriesConfigArgs... configs) {
            return configs(List.of(configs));
        }

        /**
         * @param mirrors Cluster V2 docker registries mirror (list)
         * 
         * @return builder
         * 
         */
        public Builder mirrors(@Nullable Output<List<ClusterV2RkeConfigRegistriesMirrorArgs>> mirrors) {
            $.mirrors = mirrors;
            return this;
        }

        /**
         * @param mirrors Cluster V2 docker registries mirror (list)
         * 
         * @return builder
         * 
         */
        public Builder mirrors(List<ClusterV2RkeConfigRegistriesMirrorArgs> mirrors) {
            return mirrors(Output.of(mirrors));
        }

        /**
         * @param mirrors Cluster V2 docker registries mirror (list)
         * 
         * @return builder
         * 
         */
        public Builder mirrors(ClusterV2RkeConfigRegistriesMirrorArgs... mirrors) {
            return mirrors(List.of(mirrors));
        }

        public ClusterV2RkeConfigRegistriesArgs build() {
            return $;
        }
    }

}
