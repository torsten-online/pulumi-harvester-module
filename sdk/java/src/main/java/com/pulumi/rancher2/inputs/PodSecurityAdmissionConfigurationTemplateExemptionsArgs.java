// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PodSecurityAdmissionConfigurationTemplateExemptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodSecurityAdmissionConfigurationTemplateExemptionsArgs Empty = new PodSecurityAdmissionConfigurationTemplateExemptionsArgs();

    /**
     * Pod Security Admission Configuration namespace exemptions
     * 
     */
    @Import(name="namespaces")
    private @Nullable Output<List<String>> namespaces;

    /**
     * @return Pod Security Admission Configuration namespace exemptions
     * 
     */
    public Optional<Output<List<String>>> namespaces() {
        return Optional.ofNullable(this.namespaces);
    }

    /**
     * Pod Security Admission Configuration runtime class exemptions
     * 
     */
    @Import(name="runtimeClasses")
    private @Nullable Output<List<String>> runtimeClasses;

    /**
     * @return Pod Security Admission Configuration runtime class exemptions
     * 
     */
    public Optional<Output<List<String>>> runtimeClasses() {
        return Optional.ofNullable(this.runtimeClasses);
    }

    /**
     * Pod Security Admission Configuration username exemptions
     * 
     */
    @Import(name="usernames")
    private @Nullable Output<List<String>> usernames;

    /**
     * @return Pod Security Admission Configuration username exemptions
     * 
     */
    public Optional<Output<List<String>>> usernames() {
        return Optional.ofNullable(this.usernames);
    }

    private PodSecurityAdmissionConfigurationTemplateExemptionsArgs() {}

    private PodSecurityAdmissionConfigurationTemplateExemptionsArgs(PodSecurityAdmissionConfigurationTemplateExemptionsArgs $) {
        this.namespaces = $.namespaces;
        this.runtimeClasses = $.runtimeClasses;
        this.usernames = $.usernames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PodSecurityAdmissionConfigurationTemplateExemptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PodSecurityAdmissionConfigurationTemplateExemptionsArgs $;

        public Builder() {
            $ = new PodSecurityAdmissionConfigurationTemplateExemptionsArgs();
        }

        public Builder(PodSecurityAdmissionConfigurationTemplateExemptionsArgs defaults) {
            $ = new PodSecurityAdmissionConfigurationTemplateExemptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespaces Pod Security Admission Configuration namespace exemptions
         * 
         * @return builder
         * 
         */
        public Builder namespaces(@Nullable Output<List<String>> namespaces) {
            $.namespaces = namespaces;
            return this;
        }

        /**
         * @param namespaces Pod Security Admission Configuration namespace exemptions
         * 
         * @return builder
         * 
         */
        public Builder namespaces(List<String> namespaces) {
            return namespaces(Output.of(namespaces));
        }

        /**
         * @param namespaces Pod Security Admission Configuration namespace exemptions
         * 
         * @return builder
         * 
         */
        public Builder namespaces(String... namespaces) {
            return namespaces(List.of(namespaces));
        }

        /**
         * @param runtimeClasses Pod Security Admission Configuration runtime class exemptions
         * 
         * @return builder
         * 
         */
        public Builder runtimeClasses(@Nullable Output<List<String>> runtimeClasses) {
            $.runtimeClasses = runtimeClasses;
            return this;
        }

        /**
         * @param runtimeClasses Pod Security Admission Configuration runtime class exemptions
         * 
         * @return builder
         * 
         */
        public Builder runtimeClasses(List<String> runtimeClasses) {
            return runtimeClasses(Output.of(runtimeClasses));
        }

        /**
         * @param runtimeClasses Pod Security Admission Configuration runtime class exemptions
         * 
         * @return builder
         * 
         */
        public Builder runtimeClasses(String... runtimeClasses) {
            return runtimeClasses(List.of(runtimeClasses));
        }

        /**
         * @param usernames Pod Security Admission Configuration username exemptions
         * 
         * @return builder
         * 
         */
        public Builder usernames(@Nullable Output<List<String>> usernames) {
            $.usernames = usernames;
            return this;
        }

        /**
         * @param usernames Pod Security Admission Configuration username exemptions
         * 
         * @return builder
         * 
         */
        public Builder usernames(List<String> usernames) {
            return usernames(Output.of(usernames));
        }

        /**
         * @param usernames Pod Security Admission Configuration username exemptions
         * 
         * @return builder
         * 
         */
        public Builder usernames(String... usernames) {
            return usernames(List.of(usernames));
        }

        public PodSecurityAdmissionConfigurationTemplateExemptionsArgs build() {
            return $;
        }
    }

}
