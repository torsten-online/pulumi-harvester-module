// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class ClusterV2RkeConfigEtcdSnapshotCreateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterV2RkeConfigEtcdSnapshotCreateArgs Empty = new ClusterV2RkeConfigEtcdSnapshotCreateArgs();

    /**
     * ETCD snapshot desired generation (int)
     * 
     */
    @Import(name="generation", required=true)
    private Output<Integer> generation;

    /**
     * @return ETCD snapshot desired generation (int)
     * 
     */
    public Output<Integer> generation() {
        return this.generation;
    }

    private ClusterV2RkeConfigEtcdSnapshotCreateArgs() {}

    private ClusterV2RkeConfigEtcdSnapshotCreateArgs(ClusterV2RkeConfigEtcdSnapshotCreateArgs $) {
        this.generation = $.generation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterV2RkeConfigEtcdSnapshotCreateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterV2RkeConfigEtcdSnapshotCreateArgs $;

        public Builder() {
            $ = new ClusterV2RkeConfigEtcdSnapshotCreateArgs();
        }

        public Builder(ClusterV2RkeConfigEtcdSnapshotCreateArgs defaults) {
            $ = new ClusterV2RkeConfigEtcdSnapshotCreateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param generation ETCD snapshot desired generation (int)
         * 
         * @return builder
         * 
         */
        public Builder generation(Output<Integer> generation) {
            $.generation = generation;
            return this;
        }

        /**
         * @param generation ETCD snapshot desired generation (int)
         * 
         * @return builder
         * 
         */
        public Builder generation(Integer generation) {
            return generation(Output.of(generation));
        }

        public ClusterV2RkeConfigEtcdSnapshotCreateArgs build() {
            if ($.generation == null) {
                throw new MissingRequiredPropertyException("ClusterV2RkeConfigEtcdSnapshotCreateArgs", "generation");
            }
            return $;
        }
    }

}
