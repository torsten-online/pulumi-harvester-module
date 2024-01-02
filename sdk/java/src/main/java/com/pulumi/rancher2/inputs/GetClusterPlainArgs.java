// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterPlainArgs Empty = new GetClusterPlainArgs();

    @Import(name="defaultPodSecurityAdmissionConfigurationTemplateName")
    private @Nullable String defaultPodSecurityAdmissionConfigurationTemplateName;

    public Optional<String> defaultPodSecurityAdmissionConfigurationTemplateName() {
        return Optional.ofNullable(this.defaultPodSecurityAdmissionConfigurationTemplateName);
    }

    /**
     * The name of the Cluster (string)
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Cluster (string)
     * 
     */
    public String name() {
        return this.name;
    }

    private GetClusterPlainArgs() {}

    private GetClusterPlainArgs(GetClusterPlainArgs $) {
        this.defaultPodSecurityAdmissionConfigurationTemplateName = $.defaultPodSecurityAdmissionConfigurationTemplateName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterPlainArgs $;

        public Builder() {
            $ = new GetClusterPlainArgs();
        }

        public Builder(GetClusterPlainArgs defaults) {
            $ = new GetClusterPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultPodSecurityAdmissionConfigurationTemplateName(@Nullable String defaultPodSecurityAdmissionConfigurationTemplateName) {
            $.defaultPodSecurityAdmissionConfigurationTemplateName = defaultPodSecurityAdmissionConfigurationTemplateName;
            return this;
        }

        /**
         * @param name The name of the Cluster (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetClusterPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetClusterPlainArgs", "name");
            }
            return $;
        }
    }

}
