// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterRkeConfigServicesKubeApiSecretsEncryptionConfig {
    /**
     * @return Secrets encryption yaml encoded custom configuration. `&#34;apiVersion&#34;` and `&#34;kind&#34;:&#34;EncryptionConfiguration&#34;` fields are required in the yaml. [More info](https://rancher.com/docs/rke/latest/en/config-options/secrets-encryption/) (string) Ex:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     */
    private @Nullable String customConfig;
    /**
     * @return Enable the authorized cluster endpoint. Default `true` (bool)
     * 
     */
    private @Nullable Boolean enabled;

    private ClusterRkeConfigServicesKubeApiSecretsEncryptionConfig() {}
    /**
     * @return Secrets encryption yaml encoded custom configuration. `&#34;apiVersion&#34;` and `&#34;kind&#34;:&#34;EncryptionConfiguration&#34;` fields are required in the yaml. [More info](https://rancher.com/docs/rke/latest/en/config-options/secrets-encryption/) (string) Ex:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     */
    public Optional<String> customConfig() {
        return Optional.ofNullable(this.customConfig);
    }
    /**
     * @return Enable the authorized cluster endpoint. Default `true` (bool)
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRkeConfigServicesKubeApiSecretsEncryptionConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String customConfig;
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(ClusterRkeConfigServicesKubeApiSecretsEncryptionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customConfig = defaults.customConfig;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder customConfig(@Nullable String customConfig) {

            this.customConfig = customConfig;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        public ClusterRkeConfigServicesKubeApiSecretsEncryptionConfig build() {
            final var _resultValue = new ClusterRkeConfigServicesKubeApiSecretsEncryptionConfig();
            _resultValue.customConfig = customConfig;
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
