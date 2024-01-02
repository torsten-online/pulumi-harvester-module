// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.rancher2.inputs.GlobalDnsProviderAlidnsConfigArgs;
import com.pulumi.rancher2.inputs.GlobalDnsProviderCloudflareConfigArgs;
import com.pulumi.rancher2.inputs.GlobalDnsProviderRoute53ConfigArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalDnsProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalDnsProviderArgs Empty = new GlobalDnsProviderArgs();

    @Import(name="alidnsConfig")
    private @Nullable Output<GlobalDnsProviderAlidnsConfigArgs> alidnsConfig;

    public Optional<Output<GlobalDnsProviderAlidnsConfigArgs>> alidnsConfig() {
        return Optional.ofNullable(this.alidnsConfig);
    }

    /**
     * Annotations for Global DNS Provider (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for Global DNS Provider (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    @Import(name="cloudflareConfig")
    private @Nullable Output<GlobalDnsProviderCloudflareConfigArgs> cloudflareConfig;

    public Optional<Output<GlobalDnsProviderCloudflareConfigArgs>> cloudflareConfig() {
        return Optional.ofNullable(this.cloudflareConfig);
    }

    /**
     * Labels for Global DNS Provider (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels for Global DNS Provider (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the Global DNS Provider (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Global DNS Provider (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The user ID to assign Global DNS Provider (string)
     * 
     */
    @Import(name="rootDomain", required=true)
    private Output<String> rootDomain;

    /**
     * @return The user ID to assign Global DNS Provider (string)
     * 
     */
    public Output<String> rootDomain() {
        return this.rootDomain;
    }

    @Import(name="route53Config")
    private @Nullable Output<GlobalDnsProviderRoute53ConfigArgs> route53Config;

    public Optional<Output<GlobalDnsProviderRoute53ConfigArgs>> route53Config() {
        return Optional.ofNullable(this.route53Config);
    }

    private GlobalDnsProviderArgs() {}

    private GlobalDnsProviderArgs(GlobalDnsProviderArgs $) {
        this.alidnsConfig = $.alidnsConfig;
        this.annotations = $.annotations;
        this.cloudflareConfig = $.cloudflareConfig;
        this.labels = $.labels;
        this.name = $.name;
        this.rootDomain = $.rootDomain;
        this.route53Config = $.route53Config;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalDnsProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalDnsProviderArgs $;

        public Builder() {
            $ = new GlobalDnsProviderArgs();
        }

        public Builder(GlobalDnsProviderArgs defaults) {
            $ = new GlobalDnsProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder alidnsConfig(@Nullable Output<GlobalDnsProviderAlidnsConfigArgs> alidnsConfig) {
            $.alidnsConfig = alidnsConfig;
            return this;
        }

        public Builder alidnsConfig(GlobalDnsProviderAlidnsConfigArgs alidnsConfig) {
            return alidnsConfig(Output.of(alidnsConfig));
        }

        /**
         * @param annotations Annotations for Global DNS Provider (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations for Global DNS Provider (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        public Builder cloudflareConfig(@Nullable Output<GlobalDnsProviderCloudflareConfigArgs> cloudflareConfig) {
            $.cloudflareConfig = cloudflareConfig;
            return this;
        }

        public Builder cloudflareConfig(GlobalDnsProviderCloudflareConfigArgs cloudflareConfig) {
            return cloudflareConfig(Output.of(cloudflareConfig));
        }

        /**
         * @param labels Labels for Global DNS Provider (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for Global DNS Provider (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The name of the Global DNS Provider (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Global DNS Provider (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param rootDomain The user ID to assign Global DNS Provider (string)
         * 
         * @return builder
         * 
         */
        public Builder rootDomain(Output<String> rootDomain) {
            $.rootDomain = rootDomain;
            return this;
        }

        /**
         * @param rootDomain The user ID to assign Global DNS Provider (string)
         * 
         * @return builder
         * 
         */
        public Builder rootDomain(String rootDomain) {
            return rootDomain(Output.of(rootDomain));
        }

        public Builder route53Config(@Nullable Output<GlobalDnsProviderRoute53ConfigArgs> route53Config) {
            $.route53Config = route53Config;
            return this;
        }

        public Builder route53Config(GlobalDnsProviderRoute53ConfigArgs route53Config) {
            return route53Config(Output.of(route53Config));
        }

        public GlobalDnsProviderArgs build() {
            if ($.rootDomain == null) {
                throw new MissingRequiredPropertyException("GlobalDnsProviderArgs", "rootDomain");
            }
            return $;
        }
    }

}
