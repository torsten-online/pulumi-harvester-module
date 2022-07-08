// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PodSecurityPolicyTemplateAllowedFlexVolumeArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodSecurityPolicyTemplateAllowedFlexVolumeArgs Empty = new PodSecurityPolicyTemplateAllowedFlexVolumeArgs();

    @Import(name="driver", required=true)
    private Output<String> driver;

    public Output<String> driver() {
        return this.driver;
    }

    private PodSecurityPolicyTemplateAllowedFlexVolumeArgs() {}

    private PodSecurityPolicyTemplateAllowedFlexVolumeArgs(PodSecurityPolicyTemplateAllowedFlexVolumeArgs $) {
        this.driver = $.driver;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PodSecurityPolicyTemplateAllowedFlexVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PodSecurityPolicyTemplateAllowedFlexVolumeArgs $;

        public Builder() {
            $ = new PodSecurityPolicyTemplateAllowedFlexVolumeArgs();
        }

        public Builder(PodSecurityPolicyTemplateAllowedFlexVolumeArgs defaults) {
            $ = new PodSecurityPolicyTemplateAllowedFlexVolumeArgs(Objects.requireNonNull(defaults));
        }

        public Builder driver(Output<String> driver) {
            $.driver = driver;
            return this;
        }

        public Builder driver(String driver) {
            return driver(Output.of(driver));
        }

        public PodSecurityPolicyTemplateAllowedFlexVolumeArgs build() {
            $.driver = Objects.requireNonNull($.driver, "expected parameter 'driver' to be non-null");
            return $;
        }
    }

}
