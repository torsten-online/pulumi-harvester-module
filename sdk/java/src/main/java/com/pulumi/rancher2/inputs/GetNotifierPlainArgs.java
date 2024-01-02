// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.inputs.GetNotifierDingtalkConfig;
import com.pulumi.rancher2.inputs.GetNotifierMsteamsConfig;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNotifierPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNotifierPlainArgs Empty = new GetNotifierPlainArgs();

    /**
     * The cluster id where create notifier (string)
     * 
     */
    @Import(name="clusterId", required=true)
    private String clusterId;

    /**
     * @return The cluster id where create notifier (string)
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * (Computed) Dingtalk config for notifier (list maxitems:1)
     * 
     */
    @Import(name="dingtalkConfig")
    private @Nullable GetNotifierDingtalkConfig dingtalkConfig;

    /**
     * @return (Computed) Dingtalk config for notifier (list maxitems:1)
     * 
     */
    public Optional<GetNotifierDingtalkConfig> dingtalkConfig() {
        return Optional.ofNullable(this.dingtalkConfig);
    }

    /**
     * (Computed) MSTeams config for notifier (list maxitems:1)
     * 
     */
    @Import(name="msteamsConfig")
    private @Nullable GetNotifierMsteamsConfig msteamsConfig;

    /**
     * @return (Computed) MSTeams config for notifier (list maxitems:1)
     * 
     */
    public Optional<GetNotifierMsteamsConfig> msteamsConfig() {
        return Optional.ofNullable(this.msteamsConfig);
    }

    /**
     * The name of the notifier (string)
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the notifier (string)
     * 
     */
    public String name() {
        return this.name;
    }

    private GetNotifierPlainArgs() {}

    private GetNotifierPlainArgs(GetNotifierPlainArgs $) {
        this.clusterId = $.clusterId;
        this.dingtalkConfig = $.dingtalkConfig;
        this.msteamsConfig = $.msteamsConfig;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNotifierPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNotifierPlainArgs $;

        public Builder() {
            $ = new GetNotifierPlainArgs();
        }

        public Builder(GetNotifierPlainArgs defaults) {
            $ = new GetNotifierPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The cluster id where create notifier (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param dingtalkConfig (Computed) Dingtalk config for notifier (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder dingtalkConfig(@Nullable GetNotifierDingtalkConfig dingtalkConfig) {
            $.dingtalkConfig = dingtalkConfig;
            return this;
        }

        /**
         * @param msteamsConfig (Computed) MSTeams config for notifier (list maxitems:1)
         * 
         * @return builder
         * 
         */
        public Builder msteamsConfig(@Nullable GetNotifierMsteamsConfig msteamsConfig) {
            $.msteamsConfig = msteamsConfig;
            return this;
        }

        /**
         * @param name The name of the notifier (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetNotifierPlainArgs build() {
            if ($.clusterId == null) {
                throw new MissingRequiredPropertyException("GetNotifierPlainArgs", "clusterId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetNotifierPlainArgs", "name");
            }
            return $;
        }
    }

}
