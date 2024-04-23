// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRkeConfigDnsLinearAutoscalerParamsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRkeConfigDnsLinearAutoscalerParamsArgs Empty = new ClusterRkeConfigDnsLinearAutoscalerParamsArgs();

    @Import(name="coresPerReplica")
    private @Nullable Output<Double> coresPerReplica;

    public Optional<Output<Double>> coresPerReplica() {
        return Optional.ofNullable(this.coresPerReplica);
    }

    @Import(name="max")
    private @Nullable Output<Integer> max;

    public Optional<Output<Integer>> max() {
        return Optional.ofNullable(this.max);
    }

    @Import(name="min")
    private @Nullable Output<Integer> min;

    public Optional<Output<Integer>> min() {
        return Optional.ofNullable(this.min);
    }

    @Import(name="nodesPerReplica")
    private @Nullable Output<Double> nodesPerReplica;

    public Optional<Output<Double>> nodesPerReplica() {
        return Optional.ofNullable(this.nodesPerReplica);
    }

    @Import(name="preventSinglePointFailure")
    private @Nullable Output<Boolean> preventSinglePointFailure;

    public Optional<Output<Boolean>> preventSinglePointFailure() {
        return Optional.ofNullable(this.preventSinglePointFailure);
    }

    private ClusterRkeConfigDnsLinearAutoscalerParamsArgs() {}

    private ClusterRkeConfigDnsLinearAutoscalerParamsArgs(ClusterRkeConfigDnsLinearAutoscalerParamsArgs $) {
        this.coresPerReplica = $.coresPerReplica;
        this.max = $.max;
        this.min = $.min;
        this.nodesPerReplica = $.nodesPerReplica;
        this.preventSinglePointFailure = $.preventSinglePointFailure;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRkeConfigDnsLinearAutoscalerParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRkeConfigDnsLinearAutoscalerParamsArgs $;

        public Builder() {
            $ = new ClusterRkeConfigDnsLinearAutoscalerParamsArgs();
        }

        public Builder(ClusterRkeConfigDnsLinearAutoscalerParamsArgs defaults) {
            $ = new ClusterRkeConfigDnsLinearAutoscalerParamsArgs(Objects.requireNonNull(defaults));
        }

        public Builder coresPerReplica(@Nullable Output<Double> coresPerReplica) {
            $.coresPerReplica = coresPerReplica;
            return this;
        }

        public Builder coresPerReplica(Double coresPerReplica) {
            return coresPerReplica(Output.of(coresPerReplica));
        }

        public Builder max(@Nullable Output<Integer> max) {
            $.max = max;
            return this;
        }

        public Builder max(Integer max) {
            return max(Output.of(max));
        }

        public Builder min(@Nullable Output<Integer> min) {
            $.min = min;
            return this;
        }

        public Builder min(Integer min) {
            return min(Output.of(min));
        }

        public Builder nodesPerReplica(@Nullable Output<Double> nodesPerReplica) {
            $.nodesPerReplica = nodesPerReplica;
            return this;
        }

        public Builder nodesPerReplica(Double nodesPerReplica) {
            return nodesPerReplica(Output.of(nodesPerReplica));
        }

        public Builder preventSinglePointFailure(@Nullable Output<Boolean> preventSinglePointFailure) {
            $.preventSinglePointFailure = preventSinglePointFailure;
            return this;
        }

        public Builder preventSinglePointFailure(Boolean preventSinglePointFailure) {
            return preventSinglePointFailure(Output.of(preventSinglePointFailure));
        }

        public ClusterRkeConfigDnsLinearAutoscalerParamsArgs build() {
            return $;
        }
    }

}
