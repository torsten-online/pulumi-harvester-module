// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ClusterV2RkeConfigRotateCertificates {
    /**
     * @return ETCD snapshot desired generation (int)
     * 
     */
    private Integer generation;
    /**
     * @return Service certificates to rotate with this generation (string)
     * 
     */
    private @Nullable List<String> services;

    private ClusterV2RkeConfigRotateCertificates() {}
    /**
     * @return ETCD snapshot desired generation (int)
     * 
     */
    public Integer generation() {
        return this.generation;
    }
    /**
     * @return Service certificates to rotate with this generation (string)
     * 
     */
    public List<String> services() {
        return this.services == null ? List.of() : this.services;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterV2RkeConfigRotateCertificates defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer generation;
        private @Nullable List<String> services;
        public Builder() {}
        public Builder(ClusterV2RkeConfigRotateCertificates defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.generation = defaults.generation;
    	      this.services = defaults.services;
        }

        @CustomType.Setter
        public Builder generation(Integer generation) {
            if (generation == null) {
              throw new MissingRequiredPropertyException("ClusterV2RkeConfigRotateCertificates", "generation");
            }
            this.generation = generation;
            return this;
        }
        @CustomType.Setter
        public Builder services(@Nullable List<String> services) {

            this.services = services;
            return this;
        }
        public Builder services(String... services) {
            return services(List.of(services));
        }
        public ClusterV2RkeConfigRotateCertificates build() {
            final var _resultValue = new ClusterV2RkeConfigRotateCertificates();
            _resultValue.generation = generation;
            _resultValue.services = services;
            return _resultValue;
        }
    }
}
