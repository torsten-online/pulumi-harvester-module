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


public final class MultiClusterAppTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final MultiClusterAppTargetArgs Empty = new MultiClusterAppTargetArgs();

    /**
     * App ID for target
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    /**
     * @return App ID for target
     * 
     */
    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * App health state for target
     * 
     */
    @Import(name="healthState")
    private @Nullable Output<String> healthState;

    /**
     * @return App health state for target
     * 
     */
    public Optional<Output<String>> healthState() {
        return Optional.ofNullable(this.healthState);
    }

    /**
     * Project ID for target
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Project ID for target
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * App state for target
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return App state for target
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private MultiClusterAppTargetArgs() {}

    private MultiClusterAppTargetArgs(MultiClusterAppTargetArgs $) {
        this.appId = $.appId;
        this.healthState = $.healthState;
        this.projectId = $.projectId;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MultiClusterAppTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MultiClusterAppTargetArgs $;

        public Builder() {
            $ = new MultiClusterAppTargetArgs();
        }

        public Builder(MultiClusterAppTargetArgs defaults) {
            $ = new MultiClusterAppTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId App ID for target
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId App ID for target
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param healthState App health state for target
         * 
         * @return builder
         * 
         */
        public Builder healthState(@Nullable Output<String> healthState) {
            $.healthState = healthState;
            return this;
        }

        /**
         * @param healthState App health state for target
         * 
         * @return builder
         * 
         */
        public Builder healthState(String healthState) {
            return healthState(Output.of(healthState));
        }

        /**
         * @param projectId Project ID for target
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project ID for target
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param state App state for target
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state App state for target
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public MultiClusterAppTargetArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("MultiClusterAppTargetArgs", "projectId");
            }
            return $;
        }
    }

}
