// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class PodSecurityPolicyTemplateAllowedCsiDriverArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodSecurityPolicyTemplateAllowedCsiDriverArgs Empty = new PodSecurityPolicyTemplateAllowedCsiDriverArgs();

    /**
     * The name of the PodSecurityPolicyTemplate (string)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the PodSecurityPolicyTemplate (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private PodSecurityPolicyTemplateAllowedCsiDriverArgs() {}

    private PodSecurityPolicyTemplateAllowedCsiDriverArgs(PodSecurityPolicyTemplateAllowedCsiDriverArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PodSecurityPolicyTemplateAllowedCsiDriverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PodSecurityPolicyTemplateAllowedCsiDriverArgs $;

        public Builder() {
            $ = new PodSecurityPolicyTemplateAllowedCsiDriverArgs();
        }

        public Builder(PodSecurityPolicyTemplateAllowedCsiDriverArgs defaults) {
            $ = new PodSecurityPolicyTemplateAllowedCsiDriverArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the PodSecurityPolicyTemplate (string)
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the PodSecurityPolicyTemplate (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public PodSecurityPolicyTemplateAllowedCsiDriverArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("PodSecurityPolicyTemplateAllowedCsiDriverArgs", "name");
            }
            return $;
        }
    }

}
