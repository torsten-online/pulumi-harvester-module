// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BootstrapArgs extends com.pulumi.resources.ResourceArgs {

    public static final BootstrapArgs Empty = new BootstrapArgs();

    /**
     * Initial password for Admin user. Default: `admin` (string)
     * 
     */
    @Import(name="initialPassword")
    private @Nullable Output<String> initialPassword;

    /**
     * @return Initial password for Admin user. Default: `admin` (string)
     * 
     */
    public Optional<Output<String>> initialPassword() {
        return Optional.ofNullable(this.initialPassword);
    }

    /**
     * Password for Admin user or random generated if empty (string)
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password for Admin user or random generated if empty (string)
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Send telemetry anonymous data. Default: `false` (bool)
     * 
     */
    @Import(name="telemetry")
    private @Nullable Output<Boolean> telemetry;

    /**
     * @return Send telemetry anonymous data. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> telemetry() {
        return Optional.ofNullable(this.telemetry);
    }

    /**
     * TTL in seconds for generated admin token. Default: `0`  (int)
     * 
     */
    @Import(name="tokenTtl")
    private @Nullable Output<Integer> tokenTtl;

    /**
     * @return TTL in seconds for generated admin token. Default: `0`  (int)
     * 
     */
    public Optional<Output<Integer>> tokenTtl() {
        return Optional.ofNullable(this.tokenTtl);
    }

    /**
     * Regenerate admin token. Default: `false` (bool)
     * 
     */
    @Import(name="tokenUpdate")
    private @Nullable Output<Boolean> tokenUpdate;

    /**
     * @return Regenerate admin token. Default: `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> tokenUpdate() {
        return Optional.ofNullable(this.tokenUpdate);
    }

    /**
     * Default UI landing for k8s clusters. Available options: `ember` (cluster manager ui)  and `vue` (cluster explorer ui). Default: `ember` (string)
     * 
     */
    @Import(name="uiDefaultLanding")
    private @Nullable Output<String> uiDefaultLanding;

    /**
     * @return Default UI landing for k8s clusters. Available options: `ember` (cluster manager ui)  and `vue` (cluster explorer ui). Default: `ember` (string)
     * 
     */
    public Optional<Output<String>> uiDefaultLanding() {
        return Optional.ofNullable(this.uiDefaultLanding);
    }

    private BootstrapArgs() {}

    private BootstrapArgs(BootstrapArgs $) {
        this.initialPassword = $.initialPassword;
        this.password = $.password;
        this.telemetry = $.telemetry;
        this.tokenTtl = $.tokenTtl;
        this.tokenUpdate = $.tokenUpdate;
        this.uiDefaultLanding = $.uiDefaultLanding;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BootstrapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BootstrapArgs $;

        public Builder() {
            $ = new BootstrapArgs();
        }

        public Builder(BootstrapArgs defaults) {
            $ = new BootstrapArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param initialPassword Initial password for Admin user. Default: `admin` (string)
         * 
         * @return builder
         * 
         */
        public Builder initialPassword(@Nullable Output<String> initialPassword) {
            $.initialPassword = initialPassword;
            return this;
        }

        /**
         * @param initialPassword Initial password for Admin user. Default: `admin` (string)
         * 
         * @return builder
         * 
         */
        public Builder initialPassword(String initialPassword) {
            return initialPassword(Output.of(initialPassword));
        }

        /**
         * @param password Password for Admin user or random generated if empty (string)
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for Admin user or random generated if empty (string)
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param telemetry Send telemetry anonymous data. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder telemetry(@Nullable Output<Boolean> telemetry) {
            $.telemetry = telemetry;
            return this;
        }

        /**
         * @param telemetry Send telemetry anonymous data. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder telemetry(Boolean telemetry) {
            return telemetry(Output.of(telemetry));
        }

        /**
         * @param tokenTtl TTL in seconds for generated admin token. Default: `0`  (int)
         * 
         * @return builder
         * 
         */
        public Builder tokenTtl(@Nullable Output<Integer> tokenTtl) {
            $.tokenTtl = tokenTtl;
            return this;
        }

        /**
         * @param tokenTtl TTL in seconds for generated admin token. Default: `0`  (int)
         * 
         * @return builder
         * 
         */
        public Builder tokenTtl(Integer tokenTtl) {
            return tokenTtl(Output.of(tokenTtl));
        }

        /**
         * @param tokenUpdate Regenerate admin token. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder tokenUpdate(@Nullable Output<Boolean> tokenUpdate) {
            $.tokenUpdate = tokenUpdate;
            return this;
        }

        /**
         * @param tokenUpdate Regenerate admin token. Default: `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder tokenUpdate(Boolean tokenUpdate) {
            return tokenUpdate(Output.of(tokenUpdate));
        }

        /**
         * @param uiDefaultLanding Default UI landing for k8s clusters. Available options: `ember` (cluster manager ui)  and `vue` (cluster explorer ui). Default: `ember` (string)
         * 
         * @return builder
         * 
         */
        public Builder uiDefaultLanding(@Nullable Output<String> uiDefaultLanding) {
            $.uiDefaultLanding = uiDefaultLanding;
            return this;
        }

        /**
         * @param uiDefaultLanding Default UI landing for k8s clusters. Available options: `ember` (cluster manager ui)  and `vue` (cluster explorer ui). Default: `ember` (string)
         * 
         * @return builder
         * 
         */
        public Builder uiDefaultLanding(String uiDefaultLanding) {
            return uiDefaultLanding(Output.of(uiDefaultLanding));
        }

        public BootstrapArgs build() {
            return $;
        }
    }

}
